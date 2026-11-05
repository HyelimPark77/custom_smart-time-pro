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
    await page.evaluate(()=>delete window.IslandStore.sendRestReminder);
    await send.click();assert.ok((await page.locator('#rest-reminder-status').textContent()).includes('사용할 수 없어요'));
    assert.deepEqual(errors,[]);
    console.log('Reminder UI: explicit single send, duplicate suppression, no state writes, safe result text and missing bridge passed.');
  }finally{await browser.close();}
})().catch(e=>{console.error(e);process.exitCode=1;});
