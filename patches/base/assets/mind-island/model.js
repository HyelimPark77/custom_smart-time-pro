(function (root) {
  'use strict';
  const catalog = [
    {id:'flowers', name:'들꽃 화단', cost:5, icon:'flower', description:'작은 꽃들이 반겨줘요'},
    {id:'tree', name:'둥근 나무', cost:6, icon:'tree', description:'그늘 아래 잠깐 쉬어가요'},
    {id:'bench', name:'쉬어가는 벤치', cost:8, icon:'bench', description:'아무것도 안 해도 좋은 자리'},
    {id:'lamp', name:'별빛 조명', cost:8, icon:'star', description:'나만의 섬을 은은하게'},
    {id:'tent', name:'작은 텐트', cost:10, icon:'tent', description:'포근한 나만의 아지트'},
    {id:'pond', name:'잔잔한 연못', cost:10, icon:'water', description:'가만히 물결을 바라봐요'}
  ];
  const moods = ['sun','clear','cloud','rain','wind'];
  const themes = ['garden','sunset','night'];
  const questIds = ['walk','courage','rest'];
  const clone = x => JSON.parse(JSON.stringify(x));
  const dayPattern = /^\d{4}-\d{2}-\d{2}$/;
  const safeDay = s => dayPattern.test(s) && !Number.isNaN(new Date(s+'T12:00:00').getTime());
  function dayKey(date) {
    return [date.getFullYear(),String(date.getMonth()+1).padStart(2,'0'),String(date.getDate()).padStart(2,'0')].join('-');
  }
  function fresh() { return {version:1,seeds:12,owned:[],slots:[null,null,null],theme:'garden',moods:{},claims:{},sleep:{},choices:{}}; }
  function normalize(raw) {
    if (!raw || raw.version !== 1) return fresh();
    const s = fresh();
    s.seeds = Number.isFinite(raw.seeds) ? Math.max(0,Math.min(9999,Math.floor(raw.seeds))) : 12;
    s.owned = [...new Set((Array.isArray(raw.owned)?raw.owned:[]).filter(id=>catalog.some(x=>x.id===id)))];
    const seen = new Set();
    s.slots = [0,1,2].map(i=> { const id=raw.slots && raw.slots[i]; if (!s.owned.includes(id)||seen.has(id)) return null; seen.add(id);return id; });
    s.theme = themes.includes(raw.theme)?raw.theme:'garden';
    for (const key of ['moods','claims','sleep','choices']) {
      const source = raw[key] && typeof raw[key]==='object' ? raw[key]:{};
      for (const day of Object.keys(source).filter(safeDay).sort().slice(-180)) {
        const v=source[day];
        if (key==='moods' && v && moods.includes(v.weather)) s.moods[day]={weather:v.weather,note:String(v.note||'').slice(0,200)};
        if (key==='claims' && Array.isArray(v)) s.claims[day]=[...new Set(v.filter(x=>['mood','breath',...questIds].includes(x)))];
        if (key==='sleep' && ['rested','okay','tired'].includes(v)) s.sleep[day]=v;
        if (key==='choices' && v && typeof v==='object') s.choices[day]={walk:['walk','stretch'].includes(v.walk)?v.walk:'walk',courage:['water','hello','window'].includes(v.courage)?v.courage:'water'};
      }
    }
    return s;
  }
  function claimed(s,day,key) { return (s.claims[day]||[]).includes(key); }
  function reward(s,day,key,amount) {
    if (claimed(s,day,key)) return 0;
    (s.claims[day]||(s.claims[day]=[])).push(key);
    s.seeds=Math.min(9999,s.seeds+amount); return amount;
  }
  function reduce(current, action) {
    const s=normalize(clone(current)); let earned=0;
    const day=action.day;
    if (['mood','quest','breath','sleep','choice'].includes(action.type) && !safeDay(day)) return {state:current,error:'날짜를 확인해 주세요.'};
    switch (action.type) {
      case 'mood':
        if (!moods.includes(action.weather)) return {state:current,error:'마음 날씨를 골라주세요.'};
        s.moods[day]={weather:action.weather,note:String(action.note||'').slice(0,200)};
        earned=reward(s,day,'mood',5); break;
      case 'quest':
        if (!questIds.includes(action.id)) return {state:current,error:'다시 선택해 주세요.'};
        earned=reward(s,day,action.id,4); break;
      case 'breath':
        if (!Number.isFinite(action.seconds)||action.seconds<60) return {state:current,error:'편안한 속도로 계속해 보세요.'};
        earned=reward(s,day,'breath',3);break;
      case 'sleep':
        if (!['rested','okay','tired'].includes(action.value)) return {state:current,error:'쉼의 느낌을 골라주세요.'};
        s.sleep[day]=action.value;break;
      case 'choice':
        if (!['walk','courage'].includes(action.id)) return {state:current,error:'다시 선택해 주세요.'};
        if (!(action.id==='walk'?['walk','stretch']:['water','hello','window']).includes(action.value)) return {state:current,error:'다시 선택해 주세요.'};
        s.choices[day]=Object.assign({walk:'walk',courage:'water'},s.choices[day]||{}, {[action.id]:action.value});break;
      case 'theme':
        if (!themes.includes(action.value)) return {state:current,error:'배경을 골라주세요.'};
        s.theme=action.value;break;
      case 'decorate': {
        const item=catalog.find(x=>x.id===action.id);
        if (!item||![0,1,2].includes(action.slot)) return {state:current,error:'꾸밀 자리를 골라주세요.'};
        if (!s.owned.includes(item.id)) {
          if (s.seeds<item.cost) return {state:current,error:'씨앗이 조금 더 필요해요. 천천히 모아도 괜찮아요.'};
          s.seeds-=item.cost;s.owned.push(item.id);
        }
        s.slots=s.slots.map(x=>x===item.id?null:x);s.slots[action.slot]=item.id;break;
      }
      case 'unequip':
        if ([0,1,2].includes(action.slot)) s.slots[action.slot]=null;break;
      case 'erase': s.moods={};s.sleep={};break;
      default:return {state:current,error:'다시 시도해 주세요.'};
    }
    return {state:normalize(s),earned};
  }
  const api={catalog,moods,themes,questIds,fresh,normalize,dayKey,claimed,reduce};
  if (typeof module!=='undefined' && module.exports) module.exports=api;
  else root.MindIslandModel=api;
})(typeof globalThis==='object'?globalThis:this);
