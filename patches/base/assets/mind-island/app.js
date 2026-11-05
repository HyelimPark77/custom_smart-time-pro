(function () {
  'use strict';
  const M=window.MindIslandModel, $=id=>document.getElementById(id);
  const weather={sun:{icon:'☀',name:'맑음'},clear:{icon:'◒',name:'잔잔함',image:'icons/mood-calm.svg'},cloud:{icon:'☁',name:'흐림'},rain:{icon:'☂',name:'비'},wind:{icon:'〰',name:'바람',image:'icons/mood-wind.svg'}};
  const themeNames={garden:'낮의 정원',sunset:'포근한 노을',night:'별빛의 밤'};
  const itemIcons={flower:'✿',tree:'♧',bench:'⌑',star:'✧',tent:'△',water:'≈'};
  let state=M.fresh(), storageOkay=true, currentPage='island', selectedWeather=null, slot=0, toastTimer, focusBeforeModal;
  let watchData=null;
  let today=M.dayKey(new Date()), breathElapsed=0, breathRunning=false, breathLast=0, breathFrame=0;
  function toast(message) { $('toast').textContent=message; $('toast').hidden=false;clearTimeout(toastTimer);toastTimer=setTimeout(()=>$('toast').hidden=true,3500); }
  function load() {
    try {
      if (!window.IslandStore) throw Error('Native store unavailable');
      const envelope=JSON.parse(window.IslandStore.read());
      if (!envelope.ok) throw Error('Unreadable store');
      state=M.normalize(envelope.state);
      if (!envelope.state && !window.IslandStore.write(JSON.stringify(state))) throw Error('Write unavailable');
    } catch (_) { storageOkay=false;$('storage-warning').hidden=false; }
  }
  function dispatch(action, message) {
    if (!storageOkay) {toast('저장 공간을 확인할 수 없어요. 앱을 다시 열어 주세요.');return false;}
    const result=M.reduce(state,Object.assign({day:M.dayKey(new Date())},action));
    if (result.error) {toast(result.error);return false;}
    try { if (!window.IslandStore.write(JSON.stringify(result.state))) throw Error('Save failed'); }
    catch (_) {toast('저장하지 못했어요. 기록은 바뀌지 않았어요. 다시 시도해 주세요.');return false;}
    state=result.state;today=M.dayKey(new Date());
    if(message)toast(message+(result.earned?' · 씨앗 '+result.earned+'개를 모았어요':''));
    render();return true;
  }
  function el(tag, className, text) {const n=document.createElement(tag);if(className)n.className=className;if(text!==undefined)n.textContent=text;return n;}
  function weatherIcon(node,key){const info=weather[key];node.replaceChildren();if(info.image){const image=el('img');image.src=info.image;image.alt='';node.append(image);}else node.textContent=info.icon;return node;}
  function refreshDay() { const next=M.dayKey(new Date()); if(next!==today){today=next;selectedWeather=null;render();if(currentPage==='mood')populateNote();} }
  function switchPage(page) {
    if (!['island','mood','quests','rest'].includes(page))return;
    if(page!=='rest')pauseBreath();
    refreshDay();currentPage=page;
    document.querySelectorAll('.page').forEach(n=>n.classList.toggle('active',n.id==='page-'+page));
    document.querySelectorAll('.bottom-nav button').forEach(n=>{const active=n.dataset.tab===page;n.classList.toggle('active',active);n.setAttribute('aria-current',active?'page':'false');});
    if(page==='mood')populateNote();
    render();window.scrollTo(0,0);
  }
  function renderWeather() {
    const entry=state.moods[today];
    const current=selectedWeather||(entry&&entry.weather);
    $('weather-options').replaceChildren();
    for(const key of M.moods){const info=weather[key],button=el('button','weather-choice'+(current===key?' selected':''));button.type='button';button.setAttribute('aria-pressed',String(current===key));button.setAttribute('aria-label',info.name);button.append(weatherIcon(el('span','weather-icon'),key),el('small','',info.name));button.onclick=()=>{selectedWeather=key;renderWeather();};$('weather-options').append(button);}
    weatherIcon($('mood-symbol'),entry?entry.weather:'cloud');
    $('mood-title').textContent=entry?'오늘의 마음은 '+weather[entry.weather].name:'지금, 마음은 어떤 날씨인가요?';
    $('mood-subtitle').textContent=entry?'마음은 바뀌어도 괜찮아요. 다시 남길 수 있어요.':'정답 없이 골라보세요 · 10초면 충분해요';
    $('save-mood').textContent=entry?'오늘의 마음 수정하기':'오늘의 마음 남기기';
  }
  function populateNote(){const entry=state.moods[today];selectedWeather=entry?entry.weather:null;$('mood-note').value=entry?entry.note:'';$('voice-result').textContent='음성으로 고른 마음 날씨도 확인 후 저장해 주세요.';noteCount();}
  function noteCount(){$('note-count').textContent=$('mood-note').value.length+' / 200';}
  function renderHistory(){
    const box=$('mood-history');box.replaceChildren();
    const dates=Object.keys(state.moods).sort().reverse().filter(d=>{const delta=(new Date(today+'T12:00:00')-new Date(d+'T12:00:00'))/86400000;return delta>=0&&delta<7;});
    if(!dates.length){box.append(el('div','empty-history','아직 남긴 마음이 없어요.\n첫 기록은 짧아도, 메모가 없어도 괜찮아요.'));return;}
    for(const day of dates){const entry=state.moods[day],row=el('article','history-row'),details=el('div');row.append(weatherIcon(el('span','history-symbol'),entry.weather));const heading=el('div');heading.append(el('b','',day===today?'오늘':day.slice(5).replace('-','월 ')+'일'),el('small','',weather[entry.weather].name));details.append(heading);details.append(el('p','',entry.note||'마음 날씨만 가볍게 남겼어요.'));row.append(details);box.append(row);}
  }
  function quests(){const choice=state.choices[today]||{walk:'walk',courage:'water'};return [
    {id:'walk',icon:'↟',name:choice.walk==='stretch'?'앉아서 1분 몸 풀기':'5분, 잠깐 산책하기',hint:'가벼운 움직임',description:choice.walk==='stretch'?'편한 자리에서 어깨와 손목을 부드럽게 움직여요. 내 몸에 편한 만큼이면 충분해요.':'기록이나 속도를 신경 쓰지 않고 가까운 곳을 걸어봐요. 걷기 어렵다면 위에서 몸 풀기를 골라도 좋아요.'},
    {id:'courage',icon:'✧',name:{water:'나를 위해 물 한 잔',hello:'편한 사람에게 안부 한마디',window:'창밖을 보며 잠깐 쉬기'}[choice.courage],hint:'작은 용기',description:{water:'잠깐 하던 일을 멈추고 물을 챙겨요. 나를 돌보는 작은 행동도 충분히 의미 있어요.',hello:'지금 연락하고 싶은 편한 사람에게 짧게 안부를 전해봐요. 부담스럽다면 다른 퀘스트를 골라도 괜찮아요.',window:'눈에 보이는 색이나 풍경 한 가지를 찾아봐요. 특별한 생각 없이 바라보기만 해도 좋아요.'}[choice.courage]},
    {id:'rest',icon:'☾',name:'나에게 1분의 여유',hint:'잠시 쉬기',description:'휴대폰을 잠깐 내려놓거나 편안한 자세로 쉬어요. 쉬어가기 탭의 호흡 게임을 함께 해도 좋아요.'}
  ];}
  function renderQuests(){
    const list=quests(),choice=state.choices[today]||{walk:'walk',courage:'water'};
    $('walk-choice').value=choice.walk;$('courage-choice').value=choice.courage;
    $('quest-list').replaceChildren();$('daily-summary').replaceChildren();
    for(const q of list){const done=M.claimed(state,today,q.id),card=el('article','quest-card'+(done?' complete':'')),top=el('div','quest-top'),head=el('div');head.append(el('small','',q.hint),el('h2','',q.name));top.append(el('span','quest-icon',q.icon),head,el('span','quest-reward',done?'완료':'✦ 4'));card.append(top,el('p','',q.description));const button=el('button','primary-button',done?'오늘은 해냈어요 ✓':'해냈어요 · 씨앗 4개');button.disabled=done;button.onclick=()=>dispatch({type:'quest',id:q.id},'작은 한 걸음을 남겼어요');card.append(button);$('quest-list').append(card);}
    for(const q of list.slice(0,2)){const button=el('button','mini-quest'),body=el('div');body.append(el('b','',q.name),el('small','',q.hint+' · 씨앗 4개'));button.append(el('span','mini-symbol',q.icon),body,el('span',M.claimed(state,today,q.id)?'done':'',M.claimed(state,today,q.id)?'해냈어요 ✓':'↗'));button.onclick=()=>switchPage('quests');$('daily-summary').append(button);}
  }
  function renderWatch(){
    const now=Date.now(),w=watchData,valid=window.WatchCoach.fresh(w,today,now),advice=window.WatchCoach.suggest(w,today,now,state.sleep[today],(state.moods[today]||{}).weather);
    $('watch-metrics').replaceChildren();
    const sameDay=w&&w.day===today;
    const sleep=sameDay&&Number.isFinite(w.sleepMinutes)?Math.floor(w.sleepMinutes/60)+'h '+w.sleepMinutes%60+'m':'—';
    const hr=w&&Number.isFinite(w.heartRate)&&Number.isFinite(w.heartRateAt)&&w.heartRateAt<=now+300000&&now-w.heartRateAt<86400000?w.heartRate+' bpm':'—';
    for(const [label,value] of [['오늘 걸음',sameDay&&Number.isInteger(w.steps)?w.steps.toLocaleString('ko-KR'):'—'],['최근 밤 수면',sleep],['최근 기록 심박',hr]]){const metric=el('div','watch-metric');metric.append(el('small','',label),el('b','',value));$('watch-metrics').append(metric);}
    $('watch-source').textContent=w&&w.ok?(w.stepsAt&&sameDay?'걸음 측정 '+new Date(w.stepsAt).toLocaleTimeString('ko-KR',{hour:'2-digit',minute:'2-digit'})+(valid?' · 최근 기록':' · 오래된 기록'):'오늘 걸음 기록 없음')+' · 심박은 운동 강도·감정 판단에 사용하지 않아요.':'기록을 아직 읽지 못했어요. 건강 화면에서 동기화한 뒤 다시 열어주세요.';
    $('coach-title').textContent=advice.title;$('coach-reason').textContent=advice.reason;$('coach-action').textContent=advice.action;
    $('coach-action').onclick=()=>{if(advice.stretch)dispatch({type:'choice',id:'walk',value:'stretch'});switchPage(advice.tab);};
    const start=state.watchWalk[today],done=M.claimed(state,today,'walk'),reset=!!(start&&sameDay&&Number.isInteger(w.steps)&&w.steps<start.steps),delta=start&&sameDay&&Number.isInteger(w.steps)?Math.max(0,Math.min(300,w.steps-start.steps)):0;
    $('watch-progress').value=delta;
    $('watch-mission-status').textContent=done?'오늘 움직임 보상을 받았어요. 더 채우지 않아도 괜찮아요.':reset?'걸음 누적값이 바뀌었어요. 다시 시작하거나 몸 풀기로 바꿀 수 있어요.':start?'시작 후 '+delta+' / 300걸음'+(!valid?' · 최근 동기화가 필요해요.':''):'시작 버튼을 누른 시점부터 추가 걸음을 모아요. 기록이 없으면 0걸음으로 간주하지 않아요.';
    $('watch-start').hidden=done||!!(start&&!reset);$('watch-start').disabled=!valid;$('watch-start').textContent=reset?'현재 걸음에서 다시 시작':'지금 걸음에서 시작하기';
    $('watch-claim').hidden=done||!start||reset;$('watch-claim').disabled=!valid||delta<300||w.stepsAt<start.at;
  }
  function refreshWatch(){if(window.IslandStore&&window.IslandStore.refreshWatch)window.IslandStore.refreshWatch();}
  function healthChart(rows,stress){
    const ns='http://www.w3.org/2000/svg',svg=document.createElementNS(ns,'svg');
    svg.setAttribute('viewBox','0 0 330 155');svg.setAttribute('role','img');svg.setAttribute('aria-label',(stress?'스트레스 막대그래프':'심박수 추세선')+' · '+rows.length+'개 측정 기록');svg.classList.add('health-chart');
    function shape(tag,attrs,text){const node=document.createElementNS(ns,tag);for(const [key,value] of Object.entries(attrs))node.setAttribute(key,String(value));if(text!==undefined)node.textContent=text;svg.append(node);return node;}
    const max=stress?100:Math.max(100,Math.ceil(Math.max(...rows.map(row=>row.value))/20)*20),top=14,bottom=116,left=35,right=312;
    const y=value=>bottom-(bottom-top)*value/max;
    for(const value of [0,max/2,max]){shape('line',{x1:left,y1:y(value),x2:right,y2:y(value),stroke:'#e4ddec'});shape('text',{x:left-6,y:y(value)+4,'text-anchor':'end',fill:'#756584','font-size':10},value);}
    const x=i=>rows.length===1?(left+right)/2:stress?left+(right-left)*(i+.5)/rows.length:left+(right-left)*(rows[i].at-rows[0].at)/Math.max(1,rows.at(-1).at-rows[0].at);
    if(!stress&&rows.length>1)shape('polyline',{points:rows.map((row,i)=>x(i)+','+y(row.value)).join(' '),fill:'none',stroke:'#9573cf','stroke-width':3,'stroke-linejoin':'round'});
    rows.forEach((row,i)=>{if(stress)shape('rect',{x:x(i)-Math.min(14,100/rows.length),y:y(row.value),width:Math.min(28,200/rows.length),height:bottom-y(row.value),rx:5,fill:'#72b7a0'});else shape('circle',{cx:x(i),cy:y(row.value),r:4,fill:'#9573cf',stroke:'#fff','stroke-width':2});});
    const indices=rows.length===1?[0]:[0,rows.length-1];for(const i of indices)shape('text',{x:x(i),y:139,'text-anchor':rows.length===1?'middle':stress?'middle':i===0?'start':'end',fill:'#756584','font-size':10},new Date(rows[i].at).toLocaleTimeString('ko-KR',{hour12:false,hour:'2-digit',minute:'2-digit'}));
    return svg;
  }
  function renderHealthHistory(){
    for(const [field,id,unit] of [['heartRateHistory','heart-history','회/분'],['stressHistory','stress-history','']]){
      const target=$(id),expanded=!!target.querySelector('details[open]');target.replaceChildren();
      const rows=watchData&&Array.isArray(watchData[field])?watchData[field].filter(row=>Number.isFinite(row.at)&&Number.isFinite(row.value)&&row.at>0&&row.value>0).slice(-8):[];
      if(!rows.length){target.textContent=watchData&&watchData[field+'Error']?'기록을 읽지 못했어요. 워치 동기화 후 다시 확인해 주세요.':'최근 24시간 측정 기록이 없어요. 워치 동기화 후 다시 확인해 주세요.';continue;}
      const latest=rows.at(-1),card=el('div','health-record-card'),headline=el('div','health-record-value');headline.append(el('strong','',String(latest.value)),el('span','',unit||'스트레스 지수'));card.append(headline);
      card.append(el('p','health-record-time','최근 측정 · '+new Date(latest.at).toLocaleString('ko-KR',{month:'long',day:'numeric',hour:'numeric',minute:'2-digit'})));
      card.append(healthChart(rows,field==='stressHistory'));
      card.append(el('p','health-record-caption',field==='stressHistory'?'측정 순서별 기록 · 세로축 0–100':'가로축은 측정 시각 · 점은 실제 기록, 선은 점 사이 연결'));
      const details=el('details','health-record-details');details.open=expanded;details.append(el('summary','',rows.length+'개 값과 측정 간격 보기'));
      let previous=0;for(const row of rows){const line=el('p','');line.textContent=new Date(row.at).toLocaleTimeString('ko-KR',{hour:'2-digit',minute:'2-digit'})+' · '+row.value+unit+(previous?' · 이전 기록과 '+Math.round((row.at-previous)/60000)+'분 간격':'');details.append(line);previous=row.at;}
      card.append(details);target.append(card);
    }
  }
  $('refresh-health-history').onclick=refreshWatch;
  function decoration(id,x,y){
    const map={
      flowers:'<path d="M-15 8 L-15-9 M5 15 L5-5 M20 5 L20-13" stroke="#4d8056" stroke-width="3"/><g fill="#e1b7c4"><circle cx="-15" cy="-12" r="8"/><circle cx="5" cy="-8" r="7"/></g><circle cx="20" cy="-16" r="7" fill="#f1d38a"/><circle cx="-15" cy="-12" r="3" fill="#f6e4b3"/>',
      tree:'<path d="M0 9 L0-37" stroke="#947657" stroke-width="7"/><ellipse cx="0" cy="-42" rx="25" ry="30" fill="#5f936d"/><ellipse cx="-8" cy="-47" rx="16" ry="23" fill="#83ac7c"/><circle cx="15" cy="-45" r="4" fill="#d1d994"/>',
      bench:'<path d="M-24-18 L24-18 L24-3 L-24-3Z" fill="#b5956d"/><path d="M-28 0 L24 0 L29 8 L-24 8Z" fill="#d1b48b"/><path d="M-19 8 L-19 18 M20 8 L20 18" stroke="#77654d" stroke-width="4"/>',
      lamp:'<path d="M0 15 L0-45 M0-43 Q15-51 20-40" fill="none" stroke="#796d61" stroke-width="4"/><path d="M12-40 L26-40 L28-23 L10-23Z" fill="#f2d18a"/><circle cx="19" cy="-32" r="18" fill="#f4dc9a" opacity=".16"/>',
      tent:'<path d="M-30 13 L0-34 L31 13Z" fill="#d0ac7c"/><path d="M0-34 L31 13 L8 13Z" fill="#e6c99b"/><path d="M-10 13 L0-10 L11 13Z" fill="#64786a"/>',
      pond:'<ellipse cx="0" cy="2" rx="31" ry="17" fill="#719f9c"/><ellipse cx="0" cy="0" rx="25" ry="12" fill="#a7cfbf"/><path d="M-14-2 Q-7-6 0-2 M5 4 Q12 0 19 4" stroke="#e0eedb" stroke-width="2" fill="none"/>'
    };
    return '<g transform="translate('+x+' '+y+')">'+(map[id]||'')+'</g>';
  }
  function renderScene(){
    $('island-stage').className='island-stage '+state.theme;$('scene-name').textContent=themeNames[state.theme];
    const positions=[[94,178],[252,174],[181,222]];
    $('decorations').innerHTML=state.slots.map((id,i)=>id?decoration(id,...positions[i]):'').join('');
    const sky=state.theme==='night'?'<circle cx="282" cy="54" r="19" fill="#eee8b4"/><circle cx="290" cy="47" r="18" fill="#343e5b"/><path d="M74 47 L74 56 M69 51 L79 51 M236 28 L236 34 M233 31 L239 31 M310 97 L310 103 M307 100 L313 100" stroke="#e1d8b7" stroke-width="2"/>':'<circle cx="283" cy="59" r="20" fill="'+(state.theme==='sunset'?'#dfaa80':'#e4cb87')+'"/><path d="M54 76 Q54 65 65 65 Q70 50 82 58 Q99 56 100 76Z" fill="#ffffff" opacity=".7"/>';
    $('sky-detail').innerHTML=sky;
    const w=state.moods[today]&&state.moods[today].weather;
    const cloud='<path d="M59 110 Q58 99 70 98 Q77 79 91 92 Q105 86 113 99 Q125 96 125 110Z" fill="#dce2e0"/>';
    $('weather-detail').innerHTML=['cloud','rain'].includes(w)?cloud+(w==='rain'?'<path d="M71 117 L68 125 M89 117 L86 125 M107 117 L104 125" stroke="#81aaa5" stroke-width="2" stroke-linecap="round"/>':''):w==='wind'?'<path d="M56 105 Q84 95 113 104 M65 118 Q94 109 123 116" fill="none" stroke="#a9c4b5" stroke-width="3" stroke-linecap="round"/>':'';
  }
  function renderShop(){
    $('theme-options').replaceChildren();for(const value of M.themes){const b=el('button','theme-button'+(state.theme===value?' selected':''),themeNames[value]);b.dataset.theme=value;b.setAttribute('aria-pressed',String(state.theme===value));b.onclick=()=>dispatch({type:'theme',value},'섬의 분위기를 바꿨어요');$('theme-options').append(b);}
    $('slot-options').replaceChildren();for(let i=0;i<3;i++){const b=el('button','slot-button'+(slot===i?' selected':''),['왼쪽','오른쪽','앞쪽'][i]);b.setAttribute('aria-pressed',String(slot===i));b.onclick=()=>{slot=i;renderShop();};$('slot-options').append(b);}
    $('shop-grid').replaceChildren();for(const item of M.catalog){const owned=state.owned.includes(item.id),equipped=state.slots[slot]===item.id,b=el('button','shop-item'+(owned?' owned':'')+(equipped?' equipped':''));b.setAttribute('aria-label',item.name+', '+(equipped?'이 자리에 배치됨':owned?'보유 중, 선택한 자리에 놓기':'씨앗 '+item.cost+'개로 모으고 놓기'));b.append(el('span','shop-symbol',itemIcons[item.icon]),el('b','',item.name),el('small','',item.description),el('span','price',equipped?'놓았어요 ✓':owned?'이 자리에 놓기':'✦ '+item.cost+' · 모으고 놓기'));b.onclick=()=>dispatch({type:'decorate',id:item.id,slot},owned?'꾸미기를 옮겼어요':'섬에 작은 취향을 더했어요');$('shop-grid').append(b);}
  }
  function openModal(name){pauseBreath();focusBeforeModal=document.activeElement;$(name+'-modal').hidden=false;document.body.style.overflow='hidden';if(name==='shop')renderShop();const first=$(name+'-modal').querySelector('button');if(first)first.focus();}
  function closeModal(name){$(name+'-modal').hidden=true;$('erase-confirm').hidden=true;document.body.style.overflow='';if(focusBeforeModal)focusBeforeModal.focus();}
  function render(){
    $('seed-count').textContent=String(state.seeds);$('open-shop').setAttribute('aria-label','씨앗 '+state.seeds+'개, 섬 꾸미기');
    $('today-label').textContent=new Date().toLocaleDateString('ko-KR',{month:'long',day:'numeric',weekday:'long'});
    renderScene();renderWeather();renderHistory();renderQuests();renderShop();renderWatch();
    document.querySelectorAll('[data-sleep]').forEach(b=>{const active=state.sleep[today]===b.dataset.sleep;b.classList.toggle('selected',active);b.setAttribute('aria-pressed',String(active));});
    $('breath-reward-note').textContent=M.claimed(state,today,'breath')?'오늘의 쉼을 남겼어요. 다시 쉬어도 좋아요.':'하루 한 번, 씨앗 3개 · 잠시 멈춰도 괜찮아요';
  }
  function updateBreath(){
    const remaining=Math.max(0,Math.ceil(60-breathElapsed));$('breath-time').textContent=String(Math.floor(remaining/60)).padStart(2,'0')+':'+String(remaining%60).padStart(2,'0');
    if(breathRunning){const phase=(breathElapsed%8)/4,inhale=phase<1;$('breath-instruction').textContent=inhale?'들이쉬어요':'내쉬어요';const scale=1+(inhale?phase:2-phase)*.19;$('breath-orb').style.transform='scale('+scale+')';}
  }
  function tick(now){if(!breathRunning)return;const delta=(now-breathLast)/1000;breathLast=now;if(delta>2){pauseBreath();toast('다시 편안하게 이어갈 수 있어요.');return;}breathElapsed=Math.min(60,breathElapsed+Math.max(0,delta));updateBreath();if(breathElapsed>=60){breathRunning=false;$('breath-instruction').textContent='잘 쉬었어요';$('breath-orb').style.transform='scale(1)';$('breath-start').textContent='다시 쉬어가기';$('breath-stop').hidden=true;$('breath-caption').textContent='충분해요. 지금 느끼는 편안함을 잠깐 살펴봐요.';dispatch({type:'breath',seconds:60},'나에게 1분의 여유를 주었어요');return;}breathFrame=requestAnimationFrame(tick);}
  function startBreath(){
    if(breathRunning){pauseBreath();return;}
    if(breathElapsed>=60)breathElapsed=0;
    breathRunning=true;breathLast=performance.now();$('breath-start').textContent='잠깐 멈추기';$('breath-stop').hidden=false;$('breath-caption').textContent='4초 들이쉬고, 4초 내쉬어요. 내게 편한 만큼만.';updateBreath();breathFrame=requestAnimationFrame(tick);
  }
  function pauseBreath(){if(!breathRunning)return;breathRunning=false;cancelAnimationFrame(breathFrame);$('breath-instruction').textContent='잠깐 쉬는 중';$('breath-start').textContent='이어서 쉬어가기';$('breath-orb').style.transform='scale(1)';}
  $('refresh-watch').onclick=()=>{refreshWatch();toast('폰에 동기화된 기록을 다시 읽어요. 워치 동기화는 건강 화면에서 해주세요.');};
  $('watch-start').onclick=()=>dispatch({type:'watchStart',snapshot:watchData,now:Date.now()},'작은 산책을 시작했어요. 편한 만큼만 걸어봐요.');
  $('watch-claim').onclick=()=>dispatch({type:'watchClaim',snapshot:watchData,now:Date.now()},'실제 한 걸음이 섬의 씨앗이 됐어요!');
  $('close-app').onclick=()=>{pauseBreath();if(window.IslandStore)window.IslandStore.close();};
  document.querySelectorAll('[data-tab]').forEach(b=>b.onclick=()=>switchPage(b.dataset.tab));
  $('go-mood').onclick=()=>switchPage('mood');$('open-shop').onclick=() =>openModal('shop');$('decorate-button').onclick=()=>openModal('shop');$('privacy-button').onclick=()=>openModal('privacy');
  document.querySelectorAll('[data-close]').forEach(b=>b.onclick=()=>closeModal(b.dataset.close));
  document.querySelectorAll('.modal-backdrop').forEach(b=>b.addEventListener('click',e=>{if(e.target===b)closeModal(b.id.split('-')[0]);}));
  $('save-mood').onclick=()=>{if(dispatch({type:'mood',weather:selectedWeather||(state.moods[today]&&state.moods[today].weather),note:$('mood-note').value},'지금의 마음을 남겼어요'))populateNote();};
  $('watch-voice').onclick=()=>{if(window.IslandStore&&window.IslandStore.openWatchVoice)window.IslandStore.openWatchVoice();else toast('이 버전에서는 워치 음성을 사용할 수 없어요. 직접 선택해 주세요.');};
  $('mood-note').oninput=noteCount;
  $('walk-choice').onchange=e=>dispatch({type:'choice',id:'walk',value:e.target.value});$('courage-choice').onchange=e=>dispatch({type:'choice',id:'courage',value:e.target.value});
  $('clear-slot').onclick=()=>dispatch({type:'unequip',slot},'이 자리를 비웠어요. 꾸미기는 계속 가지고 있어요.');
  $('breath-start').onclick=startBreath;$('breath-stop').onclick=()=>{pauseBreath();breathElapsed=0;updateBreath();$('breath-instruction').textContent='편안하게';$('breath-start').textContent='1분 쉬어가기';$('breath-stop').hidden=true;$('breath-caption').textContent='여기까지도 괜찮아요. 원할 때 다시 쉬어가요.';};
  document.querySelectorAll('[data-sleep]').forEach(b=>b.onclick=()=>dispatch({type:'sleep',value:b.dataset.sleep},'내가 느낀 쉼을 남겼어요'));
  $('erase-records').onclick=()=>{$('erase-confirm').hidden=false;$('erase-cancel').focus();$('erase-confirm').scrollIntoView({block:'nearest'});};$('erase-cancel').onclick=()=>$('erase-confirm').hidden=true;$('erase-yes').onclick=()=>{if(dispatch({type:'erase'},'마음과 쉼 기록을 지웠어요')){selectedWeather=null;populateNote();renderWeather();$('erase-confirm').hidden=true;}};
  document.addEventListener('visibilitychange',()=>{if(document.hidden)pauseBreath();else {refreshDay();refreshWatch();}});
  window.addEventListener('blur',pauseBreath);
  document.addEventListener('keydown',e=>{const modal=[...document.querySelectorAll('.modal-backdrop')].find(m=>!m.hidden);if(!modal)return;if(e.key==='Escape'){closeModal(modal.id.split('-')[0]);e.preventDefault();}if(e.key==='Tab'){const focusable=[...modal.querySelectorAll('button,select,textarea')].filter(n=>!n.disabled&&!n.closest('[hidden]'));if(!focusable.length)return;const first=focusable[0],last=focusable[focusable.length-1];if(e.shiftKey&&document.activeElement===first){last.focus();e.preventDefault();}else if(!e.shiftKey&&document.activeElement===last){first.focus();e.preventDefault();}}});
  function receiveVoice(data){
    if(!data||!M.moods.includes(data.weather))return;
    if(currentPage!=='mood')switchPage('mood');
    refreshDay();selectedWeather=data.weather;renderWeather();
    $('voice-result').textContent='인식 문구: '+String(data.transcript||'').slice(0,500)+' · 마음 날씨를 확인한 뒤 저장해 주세요.';
    toast('마음 날씨를 적용했어요. 저장 버튼을 눌러 기록해 주세요.');
  }
  let reminderPending=false,reminderTimeout=0;
  function scheduleOptions(){const interval=$('rest-reminder-mode').value==='interval';$('rest-time-options').hidden=interval;$('rest-interval-options').hidden=!interval;}
  $('rest-reminder-mode').onchange=scheduleOptions;
  function receiveSchedule(data){
    if(!data)return;
    $('rest-schedule-status').textContent=String(data.message||'');
    if(typeof data.enabled==='boolean'){
      const on=data.enabled,summary=$('rest-schedule-summary');summary.classList.toggle('is-on',on);summary.classList.toggle('is-off',!on);
      $('rest-schedule-state').textContent=on?'✓ 예약 켜짐':'예약 꺼짐';
      let setting='원하는 시각이나 간격을 고른 뒤 예약을 켜 주세요.';
      if(on&&data.mode==='interval'){const minutes=Number(data.interval);setting=minutes>=60&&minutes%60===0?minutes/60+'시간마다 알림':minutes+'분마다 알림';}
      else if(on&&typeof data.time==='string'&&/^\d{2}:\d{2}$/.test(data.time)){const [hour,minute]=data.time.split(':').map(Number);setting='매일 '+(hour<12?'오전 ':'오후 ')+(hour%12||12)+':'+String(minute).padStart(2,'0');}
      $('rest-schedule-setting').textContent=setting;
      $('rest-schedule-next').textContent=on&&Number.isFinite(data.next)&&data.next>0?'다음 알림 · '+new Date(data.next).toLocaleString('ko-KR',{month:'long',day:'numeric',hour:'numeric',minute:'2-digit'}):'';
    }
    if(typeof data.time==='string')$('rest-reminder-time').value=data.time;
    if(data.mode)$('rest-reminder-mode').value=data.mode;
    if(data.interval)$('rest-reminder-interval').value=String(data.interval);
    scheduleOptions();
    if(typeof data.enabled==='boolean')$('save-rest-schedule').textContent=data.enabled?'예약 변경하고 저장':'예약 저장하고 켜기';
    $('rest-schedule-last').textContent=String(data.last||'');
  }
  function refreshSchedule(){try{if(window.IslandStore&&window.IslandStore.reminderSchedule)receiveSchedule(JSON.parse(window.IslandStore.reminderSchedule()));}catch(e){}}
  function configureSchedule(enabled){
    if(!window.IslandStore||!window.IslandStore.configureReminder){receiveSchedule({message:'이 버전에서는 예약 알림을 사용할 수 없어요.'});return;}
    window.IslandStore.configureReminder($('rest-reminder-time').value,enabled,$('rest-reminder-mode').value,Number($('rest-reminder-interval').value));
  }
  $('save-rest-schedule').onclick=()=>configureSchedule(true);
  $('disable-rest-schedule').onclick=()=>configureSchedule(false);
  $('rest-schedule-permission').onclick=()=>{if(window.IslandStore&&window.IslandStore.openReminderPermission)window.IslandStore.openReminderPermission();};
  document.addEventListener('visibilitychange',()=>{if(!document.hidden)refreshSchedule();});
  refreshSchedule();
  function receiveReminder(data){
    if(!reminderPending||!data||typeof data.message!=='string')return;
    clearTimeout(reminderTimeout);reminderPending=false;$('send-rest-reminder').disabled=false;
    $('rest-reminder-status').textContent=data.message;
  }
  $('send-rest-reminder').onclick=()=>{
    if(reminderPending)return;
    if(!window.IslandStore||typeof window.IslandStore.sendRestReminder!=='function'){$('rest-reminder-status').textContent='이 버전에서는 워치 알림을 사용할 수 없어요.';return;}
    reminderPending=true;$('send-rest-reminder').disabled=true;$('rest-reminder-status').textContent='워치 연결을 확인하고 있어요…';
    reminderTimeout=setTimeout(()=>receiveReminder({message:'전송 결과를 확인하지 못했어요. 워치 화면을 먼저 확인해 주세요.'}),5000);
    try{window.IslandStore.sendRestReminder();}catch(e){receiveReminder({message:'알림 전송을 시작하지 못했어요. 다시 시도해 주세요.'});}
  };
  window.MindIslandApp={schedule:receiveSchedule,reminder:receiveReminder,voice:receiveVoice,watch:data=>{watchData=data;refreshDay();renderWatch();renderHealthHistory();},pause:pauseBreath,back:()=>{const modal=[...document.querySelectorAll('.modal-backdrop')].find(m=>!m.hidden);if(modal){closeModal(modal.id.split('-')[0]);return true;}if(currentPage!=='island'){switchPage('island');return true;}return false;}};
  load();render();refreshWatch();
  setInterval(()=>{if(!document.hidden){refreshDay();refreshWatch();renderWatch();}},20000);
})();
