'use strict';
const assert=require('node:assert/strict');
const path=require('node:path');
const {pathToFileURL}=require('node:url');
const {chromium}=require(process.env.PLAYWRIGHT_MODULE||'playwright');
(async()=>{
  const browser=await chromium.launch({headless:true,executablePath:process.env.BROWSER_EXECUTABLE||undefined});
  try{
    const page=await browser.newPage({viewport:{width:412,height:915}});
    const errors=[];page.on('pageerror',e=>errors.push(e.message));
    await page.addInitScript(()=>{
      window.__sent=0;window.__writes=0;
      window.IslandStore={read:()=>JSON.stringify({ok:true,state:null}),write:()=>{window.__writes++;return true;},refreshWatch:()=>{},close:()=>{},sendRestReminder:()=>window.__sent++};
    });
    await page.goto(pathToFileURL(path.resolve(__dirname,'../patches/base/assets/mind-island/index.html')).href);
    await page.locator('[data-tab="rest"]').click();
    assert.equal(await page.evaluate(()=>window.__sent),0); // entering rest must never transmit
    const writes=await page.evaluate(()=>window.__writes);
    const send=page.locator('#send-rest-reminder');await send.click();
    assert.equal(await page.evaluate(()=>window.__sent),1);
    assert.equal(await send.isDisabled(),true);
    await page.evaluate(()=>document.getElementById('send-rest-reminder').click());
    assert.equal(await page.evaluate(()=>window.__sent),1);
    await page.evaluate(()=>window.MindIslandApp.reminder({code:'queued',message:'전송 요청됨 <img src=x onerror=alert(1)>'}));
    assert.equal(await send.isEnabled(),true);
    assert.equal(await page.locator('#rest-reminder-status img').count(),0);
    assert.ok((await page.locator('#rest-reminder-status').textContent()).includes('<img'));
    assert.equal(await page.evaluate(()=>window.__writes),writes); // no reward or mood mutation
    await page.evaluate(()=>{
      window.__scheduled=[];
      window.IslandStore.configureReminder=(time,enabled,mode,interval)=>window.__scheduled.push({time,enabled,mode,interval});
    });
    await page.locator('#rest-reminder-time').fill('16:35');
    await page.locator('#save-rest-schedule').click();
    await page.locator('#disable-rest-schedule').click();
    assert.deepEqual(await page.evaluate(()=>window.__scheduled),[{time:'16:35',enabled:true,mode:'daily',interval:30},{time:'16:35',enabled:false,mode:'daily',interval:30}]);
    await page.locator('#rest-reminder-mode').selectOption('interval');
    assert.equal(await page.locator('#rest-time-options').isVisible(),false);
    for(const minutes of [10,15,20,30,60,120]){
      await page.locator('#rest-reminder-interval').selectOption(String(minutes));await page.locator('#save-rest-schedule').click();
      assert.deepEqual(await page.evaluate(()=>window.__scheduled.at(-1)),{time:'16:35',enabled:true,mode:'interval',interval:minutes});
    }
    await page.evaluate(()=>window.MindIslandApp.watch({ok:true,heartRateHistory:[{at:Date.now()-600000,value:70},{at:Date.now(),value:80}],stressHistory:[]}));
    await page.locator('details.watch-reminder > summary').click();
    assert.ok((await page.locator('#heart-history').textContent()).includes('10분 간격'));
    assert.ok((await page.locator('#stress-history').textContent()).includes('기록이 없어요'));
    assert.equal(await page.locator('#heart-history svg circle').count(),2);
    assert.equal(await page.locator('#stress-history svg').count(),0);
    await page.evaluate(()=>window.MindIslandApp.watch({ok:true,heartRateHistory:[{at:Date.now(),value:75}],stressHistory:[{at:Date.now(),value:35}]}));
    assert.equal(await page.locator('#heart-history svg circle').count(),1);
    assert.equal(await page.locator('#heart-history svg polyline').count(),0);
    assert.equal(await page.locator('#stress-history svg rect').count(),1);
    await page.evaluate(()=>window.MindIslandApp.schedule({enabled:true,mode:'daily',time:'15:25',next:Date.now()+60000,message:'예약됨'}));
    assert.equal(await page.locator('#rest-schedule-state').textContent(),'✓ 예약 켜짐');
    assert.equal(await page.locator('#rest-schedule-setting').textContent(),'매일 오후 3:25');
    await page.locator('#rest-reminder-time').fill('16:40');
    assert.equal(await page.locator('#rest-schedule-setting').textContent(),'매일 오후 3:25'); // draft does not claim to be saved
    await page.evaluate(()=>window.MindIslandApp.schedule({enabled:false,message:'꺼짐'}));
    assert.equal(await page.locator('#rest-schedule-state').textContent(),'예약 꺼짐');
    await page.evaluate(()=>delete window.IslandStore.sendRestReminder);
    await send.click();assert.ok((await page.locator('#rest-reminder-status').textContent()).includes('사용할 수 없어요'));
    assert.deepEqual(errors,[]);
    console.log('Reminder UI: explicit single send, duplicate suppression, no state writes, safe result text and missing bridge passed.');
  }finally{await browser.close();}
})().catch(e=>{console.error(e);process.exitCode=1;});
