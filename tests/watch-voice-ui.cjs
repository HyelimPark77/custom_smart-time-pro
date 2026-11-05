'use strict';
// Run with PLAYWRIGHT_MODULE pointing to an installed Playwright module.
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
      window.__writes=0;window.__opened=0;
      window.IslandStore={read:()=>JSON.stringify({ok:true,state:JSON.parse(localStorage.getItem('voice-ui-test')||'null')}),
        write:text=>{window.__writes++;localStorage.setItem('voice-ui-test',text);return true;},
        refreshWatch:()=>{},close:()=>{},openWatchVoice:()=>window.__opened++};
    });
    await page.goto(pathToFileURL(path.resolve(__dirname,'../patches/base/assets/mind-island/index.html')).href);
    await page.locator('[data-tab="mood"]').click();
    await page.locator('#mood-note').fill('직접 적은 메모');
    const before=await page.evaluate(()=>({writes:window.__writes,state:localStorage.getItem('voice-ui-test')}));
    await page.locator('#watch-voice').click();assert.equal(await page.evaluate(()=>window.__opened),1);
    await page.evaluate(()=>window.MindIslandApp.voice({weather:'cloud',transcript:'오늘 마음 흐림 <img src=x onerror=alert(1)>'}));
    assert.equal(await page.locator('#mood-note').inputValue(),'직접 적은 메모');
    assert.equal(await page.locator('.weather-choice.selected').getAttribute('aria-label'),'흐림');
    assert.equal(await page.locator('#voice-result img').count(),0);
    assert.deepEqual(await page.evaluate(()=>({writes:window.__writes,state:localStorage.getItem('voice-ui-test')})),before);
    await page.evaluate(()=>window.MindIslandApp.voice({weather:'unknown',transcript:'invalid'}));
    assert.equal(await page.locator('.weather-choice.selected').getAttribute('aria-label'),'흐림');
    await page.locator('#save-mood').click();
    const saved=await page.evaluate(()=>JSON.parse(localStorage.getItem('voice-ui-test')));
    const entry=Object.values(saved.moods)[0];assert.equal(entry.weather,'cloud');assert.equal(entry.note,'직접 적은 메모');
    assert.ok(!JSON.stringify(saved).includes('onerror')); // transcript never implicitly persisted
    await page.reload();await page.locator('[data-tab="mood"]').click();
    assert.equal(await page.locator('.weather-choice.selected').getAttribute('aria-label'),'흐림');
    assert.equal(await page.locator('#mood-note').inputValue(),'직접 적은 메모');
    assert.deepEqual(errors,[]);
    console.log('Voice UI: explicit save, note preservation, invalid payload, text escaping and reload passed.');
  }finally{await browser.close();}
})().catch(e=>{console.error(e);process.exitCode=1;});
