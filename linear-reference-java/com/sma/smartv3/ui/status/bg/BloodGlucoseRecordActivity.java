package com.sma.smartv3.ui.status.bg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0OiXi;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OX0XO0X10;
import com.android.mltcode.paycertificationapi.OXXO0;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iIO1O0I;
import com.android.mltcode.paycertificationapi.iO0i10Oi;
import com.android.mltcode.paycertificationapi.iiX10iX;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslAdapter;
import com.angcyo.dsladapter.DslAdapterExKt;
import com.angcyo.dsladapter.DslAdapterItem;
import com.angcyo.dsladapter.DslAdapterStatusItem;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.BloodGlucose2Dao;
import com.sma.smartv3.db.entity.BloodGlucose2;
import com.sma.smartv3.dsl.AdapterStatusItem;
import com.sma.smartv3.model.BGEMRecordSet;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBloodGlucoseRecordActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucoseRecordActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseRecordActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,113:1\n18#2,2:114\n15#2:116\n69#3,3:117\n72#3,5:121\n1#4:120\n1491#5:126\n1516#5,3:127\n1519#5,3:137\n382#6,7:130\n*S KotlinDebug\n*F\n+ 1 BloodGlucoseRecordActivity.kt\ncom/sma/smartv3/ui/status/bg/BloodGlucoseRecordActivity\n*L\n60#1:114,2\n60#1:116\n111#1:117,3\n111#1:121,5\n111#1:120\n79#1:126\n79#1:127,3\n79#1:137,3\n79#1:130,7\n*E\n"})
public final class BloodGlucoseRecordActivity extends BaseDSLRecyclerActivity {

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private final BloodGlucose2Dao mBloodGlucose2Dao;

    public BloodGlucoseRecordActivity() {
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new iiX10iX(this));
        this.mBloodGlucose2Dao = MyDb.INSTANCE.getMDatabase().bloodGlucose2Dao();
    }

    public static /* synthetic */ Unit I0iXXO(BloodGlucoseRecordActivity r0, DslAdapter r1) {
        return showData$lambda$0(r0, r1);
    }

    public static /* synthetic */ Unit I1XOi1(BloodGlucose2 r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return showData$lambda$0$2$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit O10IXXX0X(Map.Entry r0, DslAdapterItem r1) {
        return showData$lambda$0$1(r0, r1);
    }

    public static /* synthetic */ ImageView X0O(BloodGlucoseRecordActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit X1ii(Map.Entry r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        return showData$lambda$0$1$0(r0, r1, r2, r3, r4);
    }

    public static /* synthetic */ Unit XXI(Map.Entry r0, BloodGlucose2 r1, DslAdapterItem r2) {
        return showData$lambda$0$2(r0, r1, r2);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(BloodGlucoseRecordActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final List<BloodGlucose2> loadData() {
        SPUtils r0 = a01.OXO1.IiI10X();
        Object r1 = new Gson().fromJson(r0.getString(BGEMRecordSet.class.getName()), BGEMRecordSet.class);
        if (r1 != null) goto L5;
        r1 = BGEMRecordSet.class.newInstance();
    L5:
        BGEMRecordSet r2 = (BGEMRecordSet) r1;
        long r3 = r2.getStartDate();
        if (r2.getEndDate() != 0) goto L9;
        Calendar r4 = Calendar.getInstance();
        Intrinsics.O10IXXX0X(r4, "getInstance(...)");
        long r6 = O0X11OiO.XiOIii1(r4);
        long r5 = TimeUnit.DAYS.toMillis(1);
    L8:
        long r7 = r6 + r5;
        if (r2.getCalendar() != 1) goto L15;
        return this.mBloodGlucose2Dao.getList(r3, r7);
    L15:
        return this.mBloodGlucose2Dao.getListDESC(r3, r7);
    L9:
        r6 = r2.getEndDate();
        r5 = TimeUnit.DAYS.toMillis(1);
        goto L8
    }

    private static final Unit showData$lambda$0(BloodGlucoseRecordActivity r6, DslAdapter r7) {
        Intrinsics.X0O(r7, "$this$renderAdapter");
        List<BloodGlucose2> r8 = r6.loadData();
        LinkedHashMap r0 = new LinkedHashMap();
        Iterator<T> r9 = r8.iterator();
    L4:
        if (r9.hasNext() == false) goto L9;
        Object r1 = r9.next();
        String r2 = O0X11OiO.iiIOiX().format(Long.valueOf(((BloodGlucose2) r1).getMTime()));
        Object r3 = r0.get(r2);
        if (r3 != null) goto L8;
        r3 = new ArrayList();
        r0.put(r2, r3);
    L8:
        ((List) r3).add(r1);
        goto L4
    L9:
        Iterator r10 = r0.entrySet().iterator();
    L11:
        if (r10.hasNext() == false) goto L17;
        final Map.Entry r4 = (Map.Entry) r10.next();
        DslAdapterExKt.O10IXXX0X(r6.getDslAdapter(), R.layout.blood_glucose_measure_history_group_item, new OX0XO0X10(r4));
        Iterator r5 = ((List) r4.getValue()).iterator();
    L14:
        if (r5.hasNext() == false) goto L11;
        final BloodGlucose2 r11 = (BloodGlucose2) r5.next();
        DslAdapterExKt.O10IXXX0X(r6.getDslAdapter(), R.layout.blood_glucose_measure_history_item, new iO0i10Oi(r4, r11));
        goto L14
    L17:
        return Unit.OXO1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit showData$lambda$0$1(final Map.Entry r3, DslAdapterItem r4) {
        Intrinsics.X0O(r4, "$this$dslItem");
        r4.setItemSwipeMenuEnable(false);
        r4.setItemIsGroupHead(false);
        r4.setItemIsHover(false);
        r4.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r3.getKey()}));
        r4.setItemBindOverride(new O0OiXi(r3));
        r4.setItemTag((String) r3.getKey());
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$1$0(Map.Entry r0, DslViewHolder r1, int r2, DslAdapterItem r3, List r4) {
        Intrinsics.X0O(r1, "itemHolder");
        Intrinsics.X0O(r3, "<unused var>");
        Intrinsics.X0O(r4, "<unused var>");
        TextView r5 = r1.tv(R.id.tv_date);
        if (r5 == null) goto L6;
        r5.setText((CharSequence) r0.getKey());
    L6:
        return Unit.OXO1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit showData$lambda$0$2(Map.Entry r2, final BloodGlucose2 r3, DslAdapterItem r4) {
        Intrinsics.X0O(r4, "$this$dslItem");
        r4.setItemGroups(CollectionsKt__CollectionsKt.Ii1iii0(new String[]{r2.getKey()}));
        r4.setItemSwipeMenuFlag(4);
        r4.setItemBindOverride(new iIO1O0I(r3));
        return Unit.OXO1;
    }

    private static final Unit showData$lambda$0$2$0(BloodGlucose2 r2, DslViewHolder r3, int r4, DslAdapterItem r5, List r6) {
        Intrinsics.X0O(r3, "itemHolder");
        Intrinsics.X0O(r5, "<unused var>");
        Intrinsics.X0O(r6, "<unused var>");
        TextView r7 = r3.tv(R.id.tv_time);
        if (r7 == null) goto L5;
        r7.setText(O0X11OiO.IXI(false, 1, null).format(Long.valueOf(r2.getMTime())));
    L5:
        TextView r8 = r3.tv(R.id.tv_value);
        if (r8 == null) goto L9;
        StringCompanionObject r9 = StringCompanionObject.OXO1;
        String r10 = String.format("%.1f - %.1f", Arrays.copyOf(new Object[]{Double.valueOf(r2.getMLowerBound()), Double.valueOf(r2.getMUpperBound())}, 2));
        Intrinsics.O10IXXX0X(r10, "format(...)");
        r8.setText(r10);
    L9:
        return Unit.OXO1;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    @aa1
    public DslAdapterStatusItem adapterStatusItem() {
        setAdapterStatus(new AdapterStatusItem());
        return getAdapterStatus();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.measurement_logs);
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ic_blood_glucose_record_set);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        showData(new Object());
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_blood_glucose_record;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, BloodGlucoseRecordSetActivity.class));
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int recyclerViewId() {
        return R.id.rv;
    }

    @Override // com.bestmafen.androidbase.recycler.BaseDSLRecyclerActivity
    public int refreshLayoutId() {
        return 0;
    }

    @sf5(tag = I01XX0.IX0iIX)
    public final void showData(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        getDslAdapter().resetItem(new ArrayList());
        renderAdapter(new OXXO0(this));
    }
}
