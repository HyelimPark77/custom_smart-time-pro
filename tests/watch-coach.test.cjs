const assert=require('node:assert/strict');
const C=require('../patches/base/assets/mind-island/coach.js');
const M=require('../patches/base/assets/mind-island/model.js');
const now=new Date(2026,10,3,15,0,0).getTime(),day=M.dayKey(new Date(now));
const w={ok:true,day,steps:1234,stepsAt:now,readAt:now,previousSteps:[2000,4000,3000]};
assert.equal(C.suggest(w,day,now,'tired').kind,'rest');
assert.equal(C.suggest({...w,sleepMinutes:420},day,now).kind,'rest');
assert.equal(C.suggest(w,day,now).kind,'walk');
assert.equal(C.suggest({...w,steps:4000},day,now).kind,'rest');
assert.equal(C.suggest(w,day,now,undefined,'rain').kind,'gentle');
for(const bad of [null,{...w,steps:null},{...w,stepsAt:now-1800001},{...w,day:'2026-11-02'},{...w,stepsAt:now+600000}]) {
  assert.equal(C.fresh(bad,day,now),false);
  assert.ok(M.reduce(M.fresh(),{type:'watchStart',day,snapshot:bad,now}).error);
}
let s=M.reduce(M.fresh(),{type:'watchStart',day,snapshot:w,now}).state;
assert.equal(M.normalize(s).watchWalk[day].steps,1234);
assert.ok(M.reduce(s,{type:'watchClaim',day,snapshot:w,now}).error);
assert.ok(M.reduce(s,{type:'watchClaim',day,snapshot:{...w,steps:1100},now}).error);
assert.ok(M.reduce(s,{type:'watchClaim',day,snapshot:{...w,steps:2000,stepsAt:now-1000},now}).error);
const done={...w,steps:1534,stepsAt:now+10000,readAt:now+10000};
let r=M.reduce(s,{type:'watchClaim',day,snapshot:done,now:now+10000});
assert.equal(r.earned,4);
assert.equal(M.reduce(r.state,{type:'watchClaim',day,snapshot:done,now:now+10000}).earned,0);
assert.equal(M.reduce(r.state,{type:'quest',day,id:'walk'}).earned,0);
const manual=M.reduce(s,{type:'quest',day,id:'walk'}).state;
assert.equal(M.reduce(manual,{type:'watchClaim',day,snapshot:done,now:now+10000}).earned,0);
assert.equal(C.suggest({...w,heartRate:210},day,now).kind,C.suggest(w,day,now).kind);
assert.deepEqual(M.reduce(s,{type:'mood',day,weather:'rain'}).state.watchWalk,s.watchWalk);
console.log('Watch coach: missing/stale data, recommendations, 300-step progress, shared daily rewards passed.');
