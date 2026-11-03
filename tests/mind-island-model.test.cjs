'use strict';
const assert=require('node:assert/strict');
const M=require('../patches/base/assets/mind-island/model.js');
let passed=0;
function test(name,run){run();passed++;}
const day='2026-11-03';
test('starter currency persists after normalization',()=>assert.equal(M.normalize(M.fresh()).seeds,12));
test('every mood has equal first-day reward',()=>{
  for(const weather of M.moods){const r=M.reduce(M.fresh(),{type:'mood',day,weather,note:''});assert.equal(r.earned,5);assert.equal(r.state.seeds,17);}
});
test('editing the same day does not farm seeds',()=>{
  let r=M.reduce(M.fresh(),{type:'mood',day,weather:'rain',note:'첫 기록'});
  r=M.reduce(r.state,{type:'mood',day,weather:'sun',note:'바뀐 마음'});
  assert.equal(r.earned,0);assert.equal(r.state.seeds,17);assert.equal(r.state.moods[day].note,'바뀐 마음');
});
test('next day can earn once again',()=>{
  let s=M.reduce(M.fresh(),{type:'mood',day,weather:'cloud'}).state;
  const r=M.reduce(s,{type:'mood',day:'2026-11-04',weather:'rain'});assert.equal(r.earned,5);assert.equal(r.state.seeds,22);
});
test('quest rewards are daily and unique',()=>{
  let s=M.fresh();for(const id of M.questIds){s=M.reduce(s,{type:'quest',day,id}).state;s=M.reduce(s,{type:'quest',day,id}).state;}assert.equal(s.seeds,24);
});
test('breathing cannot reward partial sessions or repeat sessions',()=>{
  const start=M.fresh();assert.ok(M.reduce(start,{type:'breath',day,seconds:59}).error);
  let r=M.reduce(start,{type:'breath',day,seconds:60});assert.equal(r.earned,3);
  r=M.reduce(r.state,{type:'breath',day,seconds:60});assert.equal(r.earned,0);assert.equal(r.state.seeds,15);
});
test('owned decorations move without another charge',()=>{
  let r=M.reduce(M.fresh(),{type:'decorate',id:'flowers',slot:0});assert.equal(r.state.seeds,7);
  r=M.reduce(r.state,{type:'decorate',id:'flowers',slot:2});assert.equal(r.state.seeds,7);assert.deepEqual(r.state.slots,[null,null,'flowers']);
});
test('insufficient balance and invalid slots are non-destructive',()=>{
  const s=M.fresh();s.seeds=0;const old=JSON.stringify(s);assert.ok(M.reduce(s,{type:'decorate',id:'tent',slot:0}).error);assert.ok(M.reduce(s,{type:'decorate',id:'tree',slot:4}).error);assert.equal(JSON.stringify(s),old);
});
test('clearing a placement retains inventory',()=>{
  let s=M.reduce(M.fresh(),{type:'decorate',id:'flowers',slot:1}).state;s=M.reduce(s,{type:'unequip',slot:1}).state;assert.deepEqual(s.owned,['flowers']);assert.deepEqual(s.slots,[null,null,null]);
});
test('erase private records preserves rewards and decorations',()=>{
  let s=M.reduce(M.fresh(),{type:'mood',day,weather:'rain',note:'개인 메모'}).state;
  s=M.reduce(s,{type:'sleep',day,value:'tired'}).state;s=M.reduce(s,{type:'erase'}).state;assert.deepEqual(s.moods,{});assert.deepEqual(s.sleep,{});assert.equal(s.seeds,17);
  assert.equal(M.reduce(s,{type:'mood',day,weather:'sun'}).earned,0);
});
test('sleep responses are not scored',()=>{
  for(const value of ['rested','okay','tired'])assert.equal(M.reduce(M.fresh(),{type:'sleep',day,value}).state.seeds,12);
});
test('long and markup-like notes are stored as bounded plain strings',()=>{
  const r=M.reduce(M.fresh(),{type:'mood',day,weather:'cloud',note:'<script>'.repeat(100)});assert.equal(r.state.moods[day].note.length,200);
});
test('invalid persisted state is sanitized',()=>{
  const s=M.normalize({version:1,seeds:-5,owned:['bogus','tree','tree'],slots:['tree','tree','bogus'],theme:'external',claims:{[day]:['walk','walk','invalid']}});assert.equal(s.seeds,0);assert.deepEqual(s.owned,['tree']);assert.deepEqual(s.slots,['tree',null,null]);assert.equal(s.theme,'garden');assert.deepEqual(s.claims[day],['walk']);
});
test('history remains bounded',()=>{
  const raw=M.fresh();for(let i=0;i<220;i++){const d=new Date(2025,0,1+i);raw.moods[M.dayKey(d)]={weather:'sun',note:''};}assert.equal(Object.keys(M.normalize(raw).moods).length,180);
});
test('local day key is stable',()=>assert.equal(M.dayKey(new Date(2026,10,3,23,59)),'2026-11-03'));
if(require.main===module)console.log(passed+' mind-island model checks passed.');
module.exports={passed};
