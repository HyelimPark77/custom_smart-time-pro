(function(root){
  'use strict';
  function fresh(w,day,now){return !!(w&&w.ok&&w.day===day&&Number.isInteger(w.steps)&&w.steps>=0&&w.steps<1000000&&Number.isFinite(w.stepsAt)&&w.stepsAt<=now+300000&&now-w.stepsAt<=1800000&&Number.isFinite(w.readAt)&&now-w.readAt<=60000&&w.readAt<=now+300000);}
  function suggest(w,day,now,feeling,mood){
    const valid=fresh(w,day,now), sleep=w&&w.day===day&&Number.isFinite(w.sleepMinutes)&&w.sleepMinutes>=60&&w.sleepMinutes<=1440?w.sleepMinutes:null;
    const history=w&&Array.isArray(w.previousSteps)?w.previousSteps.filter(n=>Number.isInteger(n)&&n>0&&n<1000000).sort((a,b)=>a-b):[];
    const median=history.length>=3?history[Math.floor(history.length/2)]:null;
    if(feeling==='tired')return {kind:'rest',title:'오늘은 회복하는 작은 모험',reason:'직접 남긴 쉼 기록이 “더 쉬고 싶어요”예요. 숫자보다 지금 몸의 느낌을 먼저 들어요.',action:'앉아서 1분 몸 풀기',tab:'quests',stretch:true};
    if(sleep!==null&&sleep<480)return {kind:'rest',title:'부담 적은 움직임부터 골라볼까요?',reason:'최근 밤의 워치 수면 기록이 '+Math.floor(sleep/60)+'시간 '+sleep%60+'분이에요. 수면 추정치만으로 컨디션을 확정하지 않으니 지금 느낌도 남겨주세요.',action:'가볍게 몸 풀기',tab:'quests',stretch:true};
    if(!valid)return {kind:'sync',title:'워치 기록을 만나면 추천이 자라나요',reason:w&&w.steps!=null?'오늘 걸음 기록이 오래됐어요. 건강 화면에서 동기화한 뒤 다시 읽어주세요.':'오늘 걸음이 아직 없어요. 워치 동기화 후 나만의 산책 미션을 시작할 수 있어요.',action:'내 느낌으로 활동 고르기',tab:'quests'};
    if(['rain','cloud','wind'].includes(mood))return {kind:'gentle',title:'마음 환기, 짧게 움직여볼까요?',reason:'직접 남긴 마음 날씨와 오늘 '+w.steps.toLocaleString('ko-KR')+'걸음을 함께 봤어요. 원하면 가까운 곳을 잠깐 걸어봐요.',action:'산책 또는 몸 풀기 고르기',tab:'quests'};
    if(median!==null&&w.steps>=median)return {kind:'rest',title:'평소의 한 걸음만큼 움직였네요',reason:'오늘 '+w.steps.toLocaleString('ko-KR')+'걸음 · 지난 7일 중 기록이 있는 '+history.length+'일의 하루 걸음 중앙값 '+median.toLocaleString('ko-KR')+'걸음이에요. 더 채울 의무 없이 쉬어도 좋아요.',action:'1분 쉬어가기',tab:'rest'};
    return {kind:'walk',title:'토끼와 300걸음, 작은 산책 어때요?',reason:'오늘 '+w.steps.toLocaleString('ko-KR')+'걸음이 동기화됐어요. 지금부터 추가 300걸음을 작은 게임 목표로 골라볼 수 있어요. 건강 기준이나 필수 운동량은 아니에요.',action:'작은 산책 미션 보기',tab:'quests'};
  }
  const api={fresh,suggest};if(typeof module!=='undefined'&&module.exports)module.exports=api;else root.WatchCoach=api;
})(typeof globalThis==='object'?globalThis:this);
