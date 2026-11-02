package com.sma.smartv3.p610ui.status.p254bg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslAdapterStatusItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.google.gson.Gson;
import com.sma.smartv3.dsl.AdapterStatusItem;
import com.sma.smartv3.model.BGEMRecordSet;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.BloodGlucose2Dao;
import com.sma.smartv3.p608db.entity.BloodGlucose2;
import com.sma.smartv3.p610ui.status.p254bg.BloodGlucoseRecordActivity;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBloodGlucoseRecordActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucoseRecordActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseRecordActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,113:1\n18#2,2:114\n15#2:116\n69#3,3:117\n72#3,5:121\n1#4:120\n1491#5:126\n1516#5,3:127\n1519#5,3:137\n382#6,7:130\n*S KotlinDebug\n*F\n+ 1 BloodGlucoseRecordActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseRecordActivity\n*L\n60#1:114,2\n60#1:116\n111#1:117,3\n111#1:121,5\n111#1:120\n79#1:126\n79#1:127,3\n79#1:137,3\n79#1:130,7\n*E\n"})
public final class BloodGlucoseRecordActivity extends BaseDSLRecyclerActivity {

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iiX10iX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucoseRecordActivity.abhTitleRight_delegate$lambda$0(this.f8627IO);
        }
    });

    @aa1
    private final BloodGlucose2Dao mBloodGlucose2Dao = MyDb.INSTANCE.getMDatabase().bloodGlucose2Dao();

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(BloodGlucoseRecordActivity bloodGlucoseRecordActivity) {
        return (ImageView) bloodGlucoseRecordActivity.findViewById(R.id.abh_title_right);
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    private final List<BloodGlucose2> loadData() throws IllegalAccessException, InstantiationException {
        long endDate;
        long millis;
        Object objFromJson = new Gson().fromJson(a01.OXO1.IiI10X().getString(BGEMRecordSet.class.getName()), (Class<Object>) BGEMRecordSet.class);
        if (objFromJson == null) {
            objFromJson = BGEMRecordSet.class.newInstance();
        }
        BGEMRecordSet bGEMRecordSet = (BGEMRecordSet) objFromJson;
        long startDate = bGEMRecordSet.getStartDate();
        if (bGEMRecordSet.getEndDate() == 0) {
            Calendar calendar = Calendar.getInstance();
            Intrinsics.O10IXXX0X(calendar, "getInstance(...)");
            endDate = O0X11OiO.XiOIii1(calendar);
            millis = TimeUnit.DAYS.toMillis(1L);
        } else {
            endDate = bGEMRecordSet.getEndDate();
            millis = TimeUnit.DAYS.toMillis(1L);
        }
        long j = endDate + millis;
        return bGEMRecordSet.getCalendar() == 1 ? this.mBloodGlucose2Dao.getList(startDate, j) : this.mBloodGlucose2Dao.getListDESC(startDate, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0(BloodGlucoseRecordActivity bloodGlucoseRecordActivity, DslAdapter renderAdapter) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(renderAdapter, "$this$renderAdapter");
        List<BloodGlucose2> listLoadData = bloodGlucoseRecordActivity.loadData();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listLoadData) {
            String str = O0X11OiO.iiIOiX().format(Long.valueOf(((BloodGlucose2) obj).getMTime()));
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (final Map.Entry entry : linkedHashMap.entrySet()) {
            DslAdapterExKt.O10IXXX0X(bloodGlucoseRecordActivity.getDslAdapter(), R.layout.blood_glucose_measure_history_group_item, new Function1() { // from class: com.android.mltcode.paycertificationapi.OX0XO0X10
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return BloodGlucoseRecordActivity.showData$lambda$0$1(entry, (DslAdapterItem) obj2);
                }
            });
            for (final BloodGlucose2 bloodGlucose2 : (List) entry.getValue()) {
                DslAdapterExKt.O10IXXX0X(bloodGlucoseRecordActivity.getDslAdapter(), R.layout.blood_glucose_measure_history_item, new Function1() { // from class: com.android.mltcode.paycertificationapi.iO0i10Oi
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return BloodGlucoseRecordActivity.showData$lambda$0$2(entry, bloodGlucose2, (DslAdapterItem) obj2);
                    }
                });
            }
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showData$lambda$0$1(final Map.Entry entry, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemSwipeMenuEnable(false);
        dslItem.setItemIsGroupHead(false);
        dslItem.setItemIsHover(false);
        dslItem.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(entry.getKey()));
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.O0OiXi
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return BloodGlucoseRecordActivity.showData$lambda$0$1$0(entry, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        dslItem.setItemTag((String) entry.getKey());
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$1$0(Map.Entry entry, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tv_date);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText((CharSequence) entry.getKey());
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showData$lambda$0$2(Map.Entry entry, final BloodGlucose2 bloodGlucose2, DslAdapterItem dslItem) {
        Intrinsics.X0O(dslItem, "$this$dslItem");
        dslItem.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(entry.getKey()));
        dslItem.setItemSwipeMenuFlag(4);
        dslItem.setItemBindOverride(new Function4() { // from class: com.android.mltcode.paycertificationapi.iIO1O0I
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return BloodGlucoseRecordActivity.showData$lambda$0$2$0(bloodGlucose2, (DslViewHolder) obj, ((Integer) obj2).intValue(), (DslAdapterItem) obj3, (List) obj4);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showData$lambda$0$2$0(BloodGlucose2 bloodGlucose2, DslViewHolder itemHolder, int i, DslAdapterItem dslAdapterItem, List list) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Intrinsics.X0O(dslAdapterItem, "<unused var>");
        Intrinsics.X0O(list, "<unused var>");
        TextView textViewM3482tv = itemHolder.m3482tv(R.id.tv_time);
        if (textViewM3482tv != null) {
            textViewM3482tv.setText(O0X11OiO.IXI(false, 1, null).format(Long.valueOf(bloodGlucose2.getMTime())));
        }
        TextView textViewM3482tv2 = itemHolder.m3482tv(R.id.tv_value);
        if (textViewM3482tv2 != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
            String str = String.format("%.1f - %.1f", Arrays.copyOf(new Object[]{Double.valueOf(bloodGlucose2.getMLowerBound()), Double.valueOf(bloodGlucose2.getMUpperBound())}, 2));
            Intrinsics.O10IXXX0X(str, "format(...)");
            textViewM3482tv2.setText(str);
        }
        return Unit.OXO1;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    @aa1
    public DslAdapterStatusItem adapterStatusItem() {
        setAdapterStatus(new AdapterStatusItem());
        return getAdapterStatus();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.measurement_logs);
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ic_blood_glucose_record_set);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        showData(new Object());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_blood_glucose_record;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) BloodGlucoseRecordSetActivity.class));
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.f51422rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }

    @sf5(tag = I01XX0.IX0iIX)
    public final void showData(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        getDslAdapter().resetItem(new ArrayList());
        renderAdapter(new Function1() { // from class: com.android.mltcode.paycertificationapi.OXXO0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BloodGlucoseRecordActivity.showData$lambda$0(this.f3544IO, (DslAdapter) obj);
            }
        });
    }
}
