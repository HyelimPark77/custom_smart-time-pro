package com.sma.smartv3.ui.status;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I011iiIXO;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0XXiIX0X;
import com.android.mltcode.paycertificationapi.I1XXiOiX;
import com.android.mltcode.paycertificationapi.II1XXIX;
import com.android.mltcode.paycertificationapi.IiO0X101I;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O0iIX;
import com.android.mltcode.paycertificationapi.OO0OX1;
import com.android.mltcode.paycertificationapi.OO0iX1IX;
import com.android.mltcode.paycertificationapi.OOXO01;
import com.android.mltcode.paycertificationapi.OX10O1;
import com.android.mltcode.paycertificationapi.OiiI1I0;
import com.android.mltcode.paycertificationapi.X01X01i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X0XO;
import com.android.mltcode.paycertificationapi.X1X101OXX;
import com.android.mltcode.paycertificationapi.XOXX;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1I1O;
import com.android.mltcode.paycertificationapi.i1IIOX;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.ii0OX0i;
import com.android.mltcode.paycertificationapi.iz3;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.biz.BGEMManager;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.entity.BloodGlucose2;
import com.sma.smartv3.model.BGEMKt;
import com.sma.smartv3.model.BGEMUser;
import com.sma.smartv3.model.BloodGlucose2DataKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.bg.BloodGlucoseMeasurementActivity;
import com.sma.smartv3.ui.status.bg.BloodGlucoseTrendActivity;
import com.sma.smartv3.view.segmentedbar.SegmentedBarView2;
import com.szabh.smable3.component.BleConnector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.LongRange;
import kotlin.ranges.iO;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBloodGlucose2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucose2Activity.kt\ncom/sma/smartv3/ui/status/BloodGlucose2Activity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,287:1\n15#2:288\n69#3,3:289\n72#3,5:293\n69#3,3:298\n72#3,5:302\n69#3,3:307\n72#3,5:311\n1#4:292\n1#4:301\n1#4:310\n*S KotlinDebug\n*F\n+ 1 BloodGlucose2Activity.kt\ncom/sma/smartv3/ui/status/BloodGlucose2Activity\n*L\n75#1:288\n279#1:289,3\n279#1:293,5\n135#1:298,3\n135#1:302,5\n129#1:307,3\n129#1:311,5\n279#1:292\n135#1:301\n129#1:310\n*E\n"})
public final class BloodGlucose2Activity extends BaseActivity {

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private final Lazy barView$delegate;

    @aa1
    private final Lazy btnMeasure$delegate;

    @aa1
    private final Lazy btnRiskLevel$delegate;

    @aa1
    private final Lazy ivRiskLevel$delegate;

    @aa1
    private final Lazy llDiabeticRiskInsight$delegate;

    @aa1
    private final Lazy llNoMeasurement$delegate;

    @aa1
    private List<BloodGlucose2> mBloodGlucoseList;

    @aa1
    private final Lazy rvRiskLevel$delegate;

    @aa1
    private final Lazy tvDiabeticRiskInsight$delegate;

    @aa1
    private final Lazy tvDiabeticRiskTips$delegate;

    @aa1
    private final Lazy tvMeasureDate$delegate;

    @aa1
    private final Lazy tvNoRecord$delegate;

    @aa1
    private final Lazy tvRiskDate$delegate;

    @aa1
    private final Lazy tvRiskRangeDate$delegate;

    public BloodGlucose2Activity() {
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new X01X01i(this));
        this.llNoMeasurement$delegate = LazyKt__LazyJVMKt.iO(new OX10O1(this));
        this.barView$delegate = LazyKt__LazyJVMKt.iO(new ii0OX0i(this));
        this.btnMeasure$delegate = LazyKt__LazyJVMKt.iO(new i1IIOX(this));
        this.tvMeasureDate$delegate = LazyKt__LazyJVMKt.iO(new X1X101OXX(this));
        this.tvNoRecord$delegate = LazyKt__LazyJVMKt.iO(new OiiI1I0(this));
        this.ivRiskLevel$delegate = LazyKt__LazyJVMKt.iO(new I011iiIXO(this));
        this.btnRiskLevel$delegate = LazyKt__LazyJVMKt.iO(new XOXX(this));
        this.tvRiskRangeDate$delegate = LazyKt__LazyJVMKt.iO(new IiO0X101I(this));
        this.rvRiskLevel$delegate = LazyKt__LazyJVMKt.iO(new OOXO01(this));
        this.llDiabeticRiskInsight$delegate = LazyKt__LazyJVMKt.iO(new OO0OX1(this));
        this.tvDiabeticRiskInsight$delegate = LazyKt__LazyJVMKt.iO(new II1XXIX(this));
        this.tvRiskDate$delegate = LazyKt__LazyJVMKt.iO(new X0XO(this));
        this.tvDiabeticRiskTips$delegate = LazyKt__LazyJVMKt.iO(new I0XXiIX0X(this));
        this.mBloodGlucoseList = new ArrayList();
    }

    public static /* synthetic */ LinearLayout I0iXXO(BloodGlucose2Activity r0) {
        return llDiabeticRiskInsight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView I1(BloodGlucose2Activity r0) {
        return btnRiskLevel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean I1XOi1(BloodGlucose2Activity r0) {
        return initRange$lambda$0$0$0$1(r0);
    }

    public static /* synthetic */ TextView IIX1OXO(BloodGlucose2Activity r0) {
        return btnMeasure_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView O10IXXX0X(BloodGlucose2Activity r0) {
        return tvMeasureDate_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OII(BloodGlucose2Activity r0) {
        return tvDiabeticRiskInsight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean OIX0iXi() {
        return initRange$lambda$0$0$0$0();
    }

    public static /* synthetic */ TextView OX(BloodGlucose2Activity r0) {
        return tvRiskDate_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OiIIX101O(BloodGlucose2Activity r0, View r1) {
        initRange$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView X01IiOiIi(BloodGlucose2Activity r0) {
        return tvNoRecord_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView X0O(BloodGlucose2Activity r0) {
        return ivRiskLevel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ SegmentedBarView2 X1ii(BloodGlucose2Activity r0) {
        return barView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XX0(BloodGlucose2Activity r0) {
        return tvRiskRangeDate_delegate$lambda$0(r0);
    }

    public static /* synthetic */ RecyclerView XXI(BloodGlucose2Activity r0) {
        return rvRiskLevel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout XiOIO(BloodGlucose2Activity r0) {
        return llNoMeasurement_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XiOIii1(BloodGlucose2Activity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(BloodGlucose2Activity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ List access$getMBloodGlucoseList$p(BloodGlucose2Activity r0) {
        return r0.mBloodGlucoseList;
    }

    private static final SegmentedBarView2 barView_delegate$lambda$0(BloodGlucose2Activity r1) {
        return (SegmentedBarView2) r1.findViewById(R.id.bar_view);
    }

    private static final TextView btnMeasure_delegate$lambda$0(BloodGlucose2Activity r1) {
        return (TextView) r1.findViewById(R.id.btn_measure);
    }

    private static final TextView btnRiskLevel_delegate$lambda$0(BloodGlucose2Activity r1) {
        return (TextView) r1.findViewById(R.id.btn_risk_level);
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final SegmentedBarView2 getBarView() {
        return (SegmentedBarView2) getValue();
    }

    private final TextView getBtnMeasure() {
        return (TextView) getValue();
    }

    private final TextView getBtnRiskLevel() {
        return (TextView) getValue();
    }

    private final ImageView getIvRiskLevel() {
        return (ImageView) getValue();
    }

    private final LinearLayout getLlDiabeticRiskInsight() {
        return (LinearLayout) getValue();
    }

    private final LinearLayout getLlNoMeasurement() {
        return (LinearLayout) getValue();
    }

    private final RecyclerView getRvRiskLevel() {
        return (RecyclerView) getValue();
    }

    private final TextView getTvDiabeticRiskInsight() {
        return (TextView) getValue();
    }

    private final TextView getTvDiabeticRiskTips() {
        return (TextView) getValue();
    }

    private final TextView getTvMeasureDate() {
        return (TextView) getValue();
    }

    private final TextView getTvNoRecord() {
        return (TextView) getValue();
    }

    private final TextView getTvRiskDate() {
        return (TextView) getValue();
    }

    private final TextView getTvRiskRangeDate() {
        return (TextView) getValue();
    }

    private final String getValueText(float r2) {
        return r2 + "<br><small>mmol/L</small>";
    }

    public static /* synthetic */ Unit iIiiO(BloodGlucose2Activity r0, BleConnector r1) {
        return initRange$lambda$0$0(r0, r1);
    }

    public static /* synthetic */ TextView iOOX010X(BloodGlucose2Activity r0) {
        return tvDiabeticRiskTips_delegate$lambda$0(r0);
    }

    private final void initBarView() {
        ArrayList r0 = new ArrayList();
        r0.add(new iz3(BloodGlucose2DataKt.getBloodGlucoseBarValue$default(3.4f, 0.0f, 2, null), BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.1f, 0.0f, 2, null), getResources().getColor(R.color.bg_level_color_normal_bg), getResources().getColor(R.color.bg_level_color_normal)));
        r0.add(new iz3(BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.1f, 0.0f, 2, null), BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.9f, 0.0f, 2, null), getResources().getColor(R.color.bg_level_color_prediabetes_bg), getResources().getColor(R.color.bg_level_color_prediabetes)));
        r0.add(new iz3(BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.9f, 0.0f, 2, null), BloodGlucose2DataKt.getBloodGlucoseBarValue$default(8.1f, 0.0f, 2, null), getResources().getColor(R.color.bg_level_color_diabetes_bg), getResources().getColor(R.color.bg_level_color_diabetes)));
        getBarView().setSegments(r0);
    }

    private final void initRange() {
        getBtnMeasure().setOnClickListener(new O0iIX(this));
    }

    private static final void initRange$lambda$0(final BloodGlucose2Activity r2, View r3) {
        X0IOiX1O.XIi00iiXO(false, new i1I1O(r2), 1, null);
    }

    private static final Unit initRange$lambda$0$0(final BloodGlucose2Activity r3, BleConnector r4) {
        Intrinsics.X0O(r4, "it");
        if (MyDb.INSTANCE.getMDatabase().bloodGlucose2Dao().getTodayList().isEmpty() == true) goto L5;
        int r2 = 0;
        go0 r5 = new go0(r3, r2, 2, null);
        r5.iX(Integer.valueOf(R.string.bg_measurement_record_used_tip));
        r5.iX1O1(Integer.valueOf(R.string.cancel), new I1XXiOiX());
        r5.X1IX(R.string.confirm, new OO0iX1IX(r3));
        r5.IIX1OXO();
    L7:
        return Unit.OXO1;
    L5:
        r3.startActivity(new Intent(r3, BloodGlucoseMeasurementActivity.class));
        goto L7
    }

    private static final boolean initRange$lambda$0$0$0$0() {
        return true;
    }

    private static final boolean initRange$lambda$0$0$0$1(BloodGlucose2Activity r2) {
        r2.startActivity(new Intent(r2, BloodGlucoseMeasurementActivity.class));
        return true;
    }

    private static final ImageView ivRiskLevel_delegate$lambda$0(BloodGlucose2Activity r1) {
        return (ImageView) r1.findViewById(R.id.iv_risk_level);
    }

    private static final LinearLayout llDiabeticRiskInsight_delegate$lambda$0(BloodGlucose2Activity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_diabetic_risk_insight);
    }

    private static final LinearLayout llNoMeasurement_delegate$lambda$0(BloodGlucose2Activity r1) {
        return (LinearLayout) r1.findViewById(R.id.ll_no_measurement);
    }

    private static final RecyclerView rvRiskLevel_delegate$lambda$0(BloodGlucose2Activity r1) {
        return (RecyclerView) r1.findViewById(R.id.rv_risk_level);
    }

    private final void setBarValue(float r6, float r7) {
        getBarView().X1ii(BloodGlucose2DataKt.getBloodGlucoseBarValue$default(r6, 0.0f, 2, null), getValueText(r6));
        getBarView().O10IXXX0X(BloodGlucose2DataKt.getBloodGlucoseBarValue$default(r7, 0.0f, 2, null), getValueText(r7));
    }

    private final void syncData() {
        long[] r0 = O0X11OiO.XX0(50);
        BGEMManager r1 = BGEMManager.OXO1;
        String r2 = O0X11OiO.IO0iXO0O().format(Long.valueOf(r0[0]));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        String r3 = O0X11OiO.IO0iXO0O().format(Long.valueOf(r0[1]));
        Intrinsics.O10IXXX0X(r3, "format(...)");
        r1.iO(r2, r3, new C34861(this));
    }

    private static final TextView tvDiabeticRiskInsight_delegate$lambda$0(BloodGlucose2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_diabetic_risk_insight);
    }

    private static final TextView tvDiabeticRiskTips_delegate$lambda$0(BloodGlucose2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_diabetic_risk_tips);
    }

    private static final TextView tvMeasureDate_delegate$lambda$0(BloodGlucose2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_measure_date);
    }

    private static final TextView tvNoRecord_delegate$lambda$0(BloodGlucose2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_no_record);
    }

    private static final TextView tvRiskDate_delegate$lambda$0(BloodGlucose2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_risk_date);
    }

    private static final TextView tvRiskRangeDate_delegate$lambda$0(BloodGlucose2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_risk_range_date);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r4) {
        SPUtils r5 = a01.OXO1.IiI10X();
        if (((BGEMUser) new Gson().fromJson(r5.getString(BGEMUser.class.getName()), BGEMUser.class)) != null) goto L6;
        BGEMManager.I0IIOi(BGEMManager.OXO1, null, 1, null);
        return;
    L6:
        BGEMManager.IO(BGEMManager.OXO1, null, 1, null);
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.blood_glucose);
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ic_blood_glucose_trend);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        initRange();
        initBarView();
        showData(new Object());
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_blood_glucose2;
    }

    public final void onHelp(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        i72.OXO1.XO1(this);
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        startActivity(new Intent(this, BloodGlucoseTrendActivity.class));
    }

    @sf5(tag = I01XX0.X1ii)
    public final void showData(@aa1 Object r11) {
        Intrinsics.X0O(r11, "data");
        this.mBloodGlucoseList.clear();
        this.mBloodGlucoseList.addAll(MyDb.INSTANCE.getMDatabase().bloodGlucose2Dao().getListForDay());
        long[] r12 = O0X11OiO.XX0(6);
        getTvRiskRangeDate().setText(O0X11OiO.X0i1O(null, 1, null).format(Long.valueOf(r12[0])) + " - " + O0X11OiO.X0i1O(null, 1, null).format(Long.valueOf(r12[1])));
        i1O0OXO1O.OXO1.OXO1("showData -> " + getTvRiskRangeDate().getText() + ", " + this.mBloodGlucoseList.size());
        if (this.mBloodGlucoseList.isEmpty() == true) goto L25;
        BloodGlucose2 r0 = (BloodGlucose2) CollectionsKt___CollectionsKt.Xi1XO00(this.mBloodGlucoseList);
        setBarValue((float) r0.getMLowerBound(), (float) r0.getMUpperBound());
        getLlNoMeasurement().setVisibility(8);
        getTvMeasureDate().setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(Long.valueOf(r0.getMTime())));
        int r3 = r0.getMCurrentLevel();
        if (r3 <= 0) goto L7;
        getIvRiskLevel().setVisibility(0);
        getTvNoRecord().setVisibility(8);
    L8:
        if (r3 == 0) goto L20;
        if (r3 != 1) goto L11;
        getIvRiskLevel().setImageResource(R.drawable.ic_bg_risk_low);
        getBtnRiskLevel().setText(R.string.diabetic_risk_level_1);
        getBtnRiskLevel().setBackgroundTintList(getResources().getColorStateList(R.color.bg_risk_1));
    L22:
        if (TextUtils.isEmpty(r0.getMInsights()) == true) goto L24;
        getLlDiabeticRiskInsight().setVisibility(0);
        getTvRiskDate().setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(Long.valueOf(r0.getMTime())));
        getTvDiabeticRiskInsight().setText(Html.fromHtml(BGEMKt.getInsights(r0)));
        getTvDiabeticRiskTips().setText(Html.fromHtml(BGEMKt.getInsightsTip(r0)));
        goto L25
    L24:
        getLlDiabeticRiskInsight().setVisibility(8);
        goto L25
    L11:
        if (r3 == 2) goto L18;
        if (r3 != 3) goto L14;
        getIvRiskLevel().setImageResource(R.drawable.ic_bg_risk_moderate);
        getBtnRiskLevel().setText(R.string.diabetic_risk_level_3);
        getBtnRiskLevel().setBackgroundTintList(getResources().getColorStateList(R.color.bg_risk_3));
        goto L22
    L14:
        if (r3 != 4) goto L22;
        getIvRiskLevel().setImageResource(R.drawable.ic_bg_risk_high);
        getBtnRiskLevel().setText(R.string.diabetic_risk_level_4);
        getBtnRiskLevel().setBackgroundTintList(getResources().getColorStateList(R.color.bg_risk_4));
        goto L22
    L18:
        getIvRiskLevel().setImageResource(R.drawable.ic_bg_risk_marginal);
        getBtnRiskLevel().setText(R.string.diabetic_risk_level_2);
        getBtnRiskLevel().setBackgroundTintList(getResources().getColorStateList(R.color.bg_risk_2));
        goto L22
    L20:
        getBtnRiskLevel().setText(R.string.diabetic_risk_level_0);
        getBtnRiskLevel().setBackgroundTintList(getResources().getColorStateList(R.color.bg_risk_0));
        goto L22
    L7:
        getIvRiskLevel().setVisibility(8);
        getTvNoRecord().setVisibility(0);
    L25:
        getRvRiskLevel().setLayoutManager(new GridLayoutManager(this, 7));
        final List r13 = CollectionsKt___CollectionsKt.Ii00iIX01(iO.IiiiOIIi0(new LongRange(r12[0], r12[1]), TimeUnit.DAYS.toMillis(1)));
        getRvRiskLevel().setAdapter(new AnonymousClass1(this, r13));
    }
}
