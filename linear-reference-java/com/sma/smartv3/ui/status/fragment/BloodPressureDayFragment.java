package com.sma.smartv3.ui.status.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0OO111XI;
import com.android.mltcode.paycertificationapi.I0i1O0XO1;
import com.android.mltcode.paycertificationapi.I1iX0I;
import com.android.mltcode.paycertificationapi.IOO0O;
import com.android.mltcode.paycertificationapi.IXIX1X1;
import com.android.mltcode.paycertificationapi.IXiI0OX;
import com.android.mltcode.paycertificationapi.IXiO10;
import com.android.mltcode.paycertificationapi.IiiXO;
import com.android.mltcode.paycertificationapi.O0IiIO0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O0iX;
import com.android.mltcode.paycertificationapi.O10X00II;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.Oi11iOXii;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X0iX1XOX;
import com.android.mltcode.paycertificationapi.X10i1i;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.X110X011X;
import com.android.mltcode.paycertificationapi.XIXi1iX00;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.XiOOO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i0OX00O1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1XOiXX;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iI10i1OXi;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.iOIX0O1OX;
import com.android.mltcode.paycertificationapi.iXXIOI1i;
import com.android.mltcode.paycertificationapi.iXiIiIO0;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uf1;
import com.blankj.utilcode.constant.TimeConstants;
import com.blankj.utilcode.util.TimeUtils;
import com.facebook.internal.security.CertificateUtil;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.BloodPressureDao;
import com.sma.smartv3.db.entity.BloodPressure;
import com.sma.smartv3.model.BPDataParse;
import com.sma.smartv3.model.BPHourData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.RealTimeMeasurementActivity;
import com.sma.smartv3.ui.status.base.BaseDetailDaysFragment;
import com.sma.smartv3.util.HeathReportsUtils;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleBloodPressureCalibration;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBloodPressureDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodPressureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,350:1\n1869#2,2:351\n99#3,7:353\n106#3,3:361\n79#3,7:364\n109#3:371\n1#4:360\n*S KotlinDebug\n*F\n+ 1 BloodPressureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment\n*L\n305#1:351,2\n115#1:353,7\n115#1:361,3\n115#1:364,7\n115#1:371\n115#1:360\n*E\n"})
public final class BloodPressureDayFragment extends BaseDetailDaysFragment<BloodPressure> {

    @aa1
    private final Lazy barChart$delegate;

    @aa1
    private final Lazy btnCalibration$delegate;

    @aa1
    private final Lazy btnMeasure$delegate;

    @aa1
    private final Lazy calibrationPanel$delegate;

    @aa1
    private final Lazy dbpAvgValue$delegate;

    @aa1
    private final Lazy dbpValue$delegate;

    @aa1
    private LinkedHashMap<Long, BPHourData> filterDataMap;

    @aa1
    private final Lazy healthBtn$delegate;

    @aa1
    private final Lazy healthLayout$delegate;

    @aa1
    private final Lazy healthQuestions$delegate;

    @aa1
    private final Lazy healthTipLayout$delegate;

    @aa1
    private final Lazy healthTv$delegate;
    private float highlight;

    @aa1
    private final List<BPHourData> hourData;

    @aa1
    private final BloodPressureDao mBloodPressureDao;

    @tb1
    private i1XOiXX mCalibrationPopup;
    private int mDiastolic;
    private int mSystolic;

    @aa1
    private final Lazy measurePanel$delegate;

    @aa1
    private final Lazy sbpAvgValue$delegate;

    @aa1
    private final Lazy sbpValue$delegate;
    public XXX1X11 setValue;

    @aa1
    private final List<BarEntry> values;

    public static final class OXO1 implements uf1 {
        public final /* synthetic */ BloodPressureDayFragment OXO1;
        public final /* synthetic */ SimpleDateFormat XIi00iiXO;

        public OXO1(BloodPressureDayFragment r1, SimpleDateFormat r2) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry r5, X110O r6) {
            Intrinsics.X0O(r5, "e");
            Intrinsics.X0O(r6, "h");
            this.OXO1.updateItemData(r5);
            this.OXO1.getMCalendar().set(11, (int) r5.OIX0iXi());
            DINCondBold r7 = this.OXO1.getNowTimeDetails();
            BloodPressureDayFragment r8 = this.OXO1;
            r7.setText(r8.getString(R.string.time_range, new Object[]{TimeUtils.millis2String(r8.getMCalendar().getTimeInMillis() - ((long) TimeConstants.HOUR), this.XIi00iiXO), TimeUtils.millis2String(this.OXO1.getMCalendar().getTimeInMillis(), this.XIi00iiXO)}));
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    public BloodPressureDayFragment() {
        this.barChart$delegate = LazyKt__LazyJVMKt.iO(new IiiXO(this));
        this.sbpValue$delegate = LazyKt__LazyJVMKt.iO(new O0iX(this));
        this.dbpValue$delegate = LazyKt__LazyJVMKt.iO(new O0IiIO0(this));
        this.sbpAvgValue$delegate = LazyKt__LazyJVMKt.iO(new iOIX0O1OX(this));
        this.dbpAvgValue$delegate = LazyKt__LazyJVMKt.iO(new IXiO10(this));
        this.measurePanel$delegate = LazyKt__LazyJVMKt.iO(new IXiI0OX(this));
        this.btnMeasure$delegate = LazyKt__LazyJVMKt.iO(new X110X011X(this));
        this.calibrationPanel$delegate = LazyKt__LazyJVMKt.iO(new I0i1O0XO1(this));
        this.btnCalibration$delegate = LazyKt__LazyJVMKt.iO(new I0OO111XI(this));
        this.values = new ArrayList();
        this.filterDataMap = new LinkedHashMap();
        this.hourData = new ArrayList();
        this.mBloodPressureDao = MyDb.INSTANCE.getMDatabase().bloodPressureDao();
        this.healthLayout$delegate = LazyKt__LazyJVMKt.iO(new X0iX1XOX(this));
        this.healthBtn$delegate = LazyKt__LazyJVMKt.iO(new iI10i1OXi(this));
        this.healthTv$delegate = LazyKt__LazyJVMKt.iO(new IOO0O(this));
        this.healthTipLayout$delegate = LazyKt__LazyJVMKt.iO(new XiOOO(this));
        this.healthQuestions$delegate = LazyKt__LazyJVMKt.iO(new iXXIOI1i(this));
        this.mSystolic = 115;
        this.mDiastolic = 75;
    }

    public static /* synthetic */ DINCondBold I1(BloodPressureDayFragment r0) {
        return dbpAvgValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium I1XOi1(BloodPressureDayFragment r0) {
        return healthTv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void II1Xi0(BloodPressureDayFragment r0, View r1) {
        realTimeMeasurement$lambda$0(r0, r1);
    }

    public static /* synthetic */ LinearLayout IIX1OXO(BloodPressureDayFragment r0) {
        return healthLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View O10IXXX0X(BloodPressureDayFragment r0) {
        return btnMeasure_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View OII(BloodPressureDayFragment r0) {
        return calibrationPanel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button OX(BloodPressureDayFragment r0) {
        return healthBtn_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold OiIIX101O(BloodPressureDayFragment r0) {
        return sbpValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View X01IiOiIi(BloodPressureDayFragment r0) {
        return btnCalibration_delegate$lambda$0(r0);
    }

    public static /* synthetic */ BarChart X0O(BloodPressureDayFragment r0) {
        return barChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold X1ii(BloodPressureDayFragment r0) {
        return sbpAvgValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XX0(BloodPressureDayFragment r0, View r1) {
        manualCalibration$lambda$1(r0, r1);
    }

    public static /* synthetic */ boolean XXI(BloodPressureDayFragment r0, View r1, int r2, KeyEvent r3) {
        return manualCalibration$lambda$0(r0, r1, r2, r3);
    }

    public static /* synthetic */ LinearLayout XiOIO(BloodPressureDayFragment r0) {
        return healthTipLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XiOIii1(BloodPressureDayFragment r0, BleConnector r1) {
        return realTimeMeasurement$lambda$0$0(r0, r1);
    }

    private static final BarChart barChart_delegate$lambda$0(BloodPressureDayFragment r1) {
        return (BarChart) r1.getMView().findViewById(R.id.barChart);
    }

    private static final View btnCalibration_delegate$lambda$0(BloodPressureDayFragment r1) {
        return r1.getMView().findViewById(R.id.btn_calibration);
    }

    private static final View btnMeasure_delegate$lambda$0(BloodPressureDayFragment r1) {
        return r1.getMView().findViewById(R.id.btn_measure);
    }

    private static final View calibrationPanel_delegate$lambda$0(BloodPressureDayFragment r1) {
        return r1.getMView().findViewById(R.id.calibration_panel);
    }

    private static final boolean calibrationPopup$lambda$0$0(BloodPressureDayFragment r9, int r10, int r11) {
        r9.mSystolic = r10;
        r9.mDiastolic = r11;
        a01 r12 = a01.OXO1;
        r12.IiI10X().put(b01.XOXOIX0Oi, r9.mSystolic);
        r12.IiI10X().put(b01.IiXIIX1O1, r9.mDiastolic);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.BLOOD_PRESSURE_CALIBRATION, BleKeyFlag.UPDATE, new BleBloodPressureCalibration(r9.mSystolic, r9.mDiastolic), false, false, 24, null);
        return true;
    }

    private static final DINCondBold dbpAvgValue_delegate$lambda$0(BloodPressureDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.dbpAvgValue);
    }

    private static final DINCondBold dbpValue_delegate$lambda$0(BloodPressureDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.dbpValue);
    }

    private final void filterData(List<BloodPressure> r20) {
        this.values.clear();
        BPDataParse.INSTANCE.filterHourData(getRange(), r20, this.hourData, this.values);
        updateChartData(this.values);
        if (r20.isEmpty() == true) goto L16;
        BloodPressure r1 = (BloodPressure) CollectionsKt___CollectionsKt.Xi1XO00(r20);
        if (r1.getMSystolic() != 0) goto L10;
        Button r2 = getHealthBtn();
        if (r2 == null) goto L17;
        r2.setEnabled(false);
        return;
    L17:
        return;
    L10:
        String r14 = getString(R.string.systolic_pressure) + CertificateUtil.DELIMITER + r1.getMSystolic() + I000IiI1O.iO.XO0O10 + getString(R.string.diastolic_pressure) + CertificateUtil.DELIMITER + r1.getMDiastolic();
        HeathReportsUtils r4 = HeathReportsUtils.OXO1;
        long r6 = r1.getMTime();
        Button r8 = getHealthBtn();
        Intrinsics.O10IXXX0X(r8, "<get-healthBtn>(...)");
        PFMedium r9 = getHealthTv();
        Intrinsics.O10IXXX0X(r9, "<get-healthTv>(...)");
        LinearLayout r10 = getHealthTipLayout();
        Intrinsics.O10IXXX0X(r10, "<get-healthTipLayout>(...)");
        PFMedium r11 = getHealthQuestions();
        Intrinsics.O10IXXX0X(r11, "<get-healthQuestions>(...)");
        r4.X1(q62.OXOXXiI, r6, r8, r9, r10, r11, getMActivity());
        i72 r5 = i72.OXO1;
        boolean r7 = r5.I0i0();
        if (r5.OIIOI() == false) goto L13;
        boolean r18 = false;
    L14:
        LinearLayout r12 = getHealthLayout();
        Intrinsics.O10IXXX0X(r12, "<get-healthLayout>(...)");
        Button r13 = getHealthBtn();
        Intrinsics.O10IXXX0X(r13, "<get-healthBtn>(...)");
        PFMedium r15 = getHealthTv();
        Intrinsics.O10IXXX0X(r15, "<get-healthTv>(...)");
        r4.iOiXi11II(r12, r13, r15, getMActivity(), q62.OXOXXiI, r14, r1.getMTime(), "", r18);
        return;
    L13:
        r18 = r7;
        goto L14
    }

    private final BarChart getBarChart() {
        return (BarChart) getValue();
    }

    private final View getBtnCalibration() {
        return (View) getValue();
    }

    private final View getBtnMeasure() {
        return (View) getValue();
    }

    private final View getCalibrationPanel() {
        return (View) getValue();
    }

    private final DINCondBold getDbpAvgValue() {
        return (DINCondBold) getValue();
    }

    private final DINCondBold getDbpValue() {
        return (DINCondBold) getValue();
    }

    private final Button getHealthBtn() {
        return (Button) getValue();
    }

    private final LinearLayout getHealthLayout() {
        return (LinearLayout) getValue();
    }

    private final PFMedium getHealthQuestions() {
        return (PFMedium) getValue();
    }

    private final LinearLayout getHealthTipLayout() {
        return (LinearLayout) getValue();
    }

    private final PFMedium getHealthTv() {
        return (PFMedium) getValue();
    }

    private final View getMeasurePanel() {
        return (View) getValue();
    }

    private final DINCondBold getSbpAvgValue() {
        return (DINCondBold) getValue();
    }

    private final DINCondBold getSbpValue() {
        return (DINCondBold) getValue();
    }

    private static final Button healthBtn_delegate$lambda$0(BloodPressureDayFragment r1) {
        return (Button) r1.getMView().findViewById(R.id.btn_common_heathy);
    }

    private static final LinearLayout healthLayout_delegate$lambda$0(BloodPressureDayFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.item_health_btn_layout);
    }

    private static final PFMedium healthQuestions_delegate$lambda$0(BloodPressureDayFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.tv_common_healthy_questions);
    }

    private static final LinearLayout healthTipLayout_delegate$lambda$0(BloodPressureDayFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.questions_healthy_tip_layout);
    }

    private static final PFMedium healthTv_delegate$lambda$0(BloodPressureDayFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.tv_common_heathy);
    }

    public static /* synthetic */ DINCondBold i010I(BloodPressureDayFragment r0) {
        return dbpValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean iIiiO(BloodPressureDayFragment r0, int r1, int r2) {
        return calibrationPopup$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ PFMedium iOOX010X(BloodPressureDayFragment r0) {
        return healthQuestions_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View iX(BloodPressureDayFragment r0) {
        return measurePanel_delegate$lambda$0(r0);
    }

    private final void manualCalibration() {
        q62 r0 = q62.OXO1;
        if (r0.OiXX0() == true) goto L5;
        View r1 = getCalibrationPanel();
        if (r1 == null) goto L21;
        r1.setVisibility(8);
        return;
    L21:
        return;
    L5:
        if (r0.iOi1010() == false) goto L9;
        View r2 = getMView().findViewById(R.id.measure_view);
        if (r2 == null) goto L9;
        r2.setVisibility(8);
    L9:
        View r3 = getCalibrationPanel();
        if (r3 == null) goto L12;
        r3.setVisibility(0);
    L12:
        getMView().setFocusableInTouchMode(true);
        getMView().requestFocus();
        getMView().setOnKeyListener(new i0OX00O1(this));
        View r4 = getBtnCalibration();
        if (r4 == null) goto L20;
        r4.setOnClickListener(new iXiIiIO0(this));
        return;
    }

    private static final boolean manualCalibration$lambda$0(BloodPressureDayFragment r1, View r2, int r3, KeyEvent r4) {
        if (r4.getAction() == 1) goto L5;
    L11:
        return false;
    L5:
        if (r3 != 4) goto L11;
        i1XOiXX r5 = r1.mCalibrationPopup;
        if (r5 == null) goto L11;
        if (r5.isShowing() != true) goto L11;
        return true;
    }

    private static final void manualCalibration$lambda$1(BloodPressureDayFragment r0, View r1) {
        r0.calibrationPopup();
    }

    private static final View measurePanel_delegate$lambda$0(BloodPressureDayFragment r1) {
        return r1.getMView().findViewById(R.id.measure_panel);
    }

    private final void realTimeMeasurement() {
        if (q62.OXO1.iOi1010() == false) goto L11;
        View r0 = getMeasurePanel();
        if (r0 == null) goto L7;
        r0.setVisibility(0);
    L7:
        View r1 = getBtnMeasure();
        if (r1 == null) goto L15;
        r1.setOnClickListener(new I1iX0I(this));
        return;
    L15:
        return;
    L11:
        View r2 = getMeasurePanel();
        if (r2 == null) goto L16;
        r2.setVisibility(8);
        return;
    }

    private static final void realTimeMeasurement$lambda$0(final BloodPressureDayFragment r2, View r3) {
        i1O0OXO1O.OXO1.IiI10X("start measure");
        X0IOiX1O.XIi00iiXO(false, new Oi11iOXii(r2), 1, null);
    }

    private static final Unit realTimeMeasurement$lambda$0$0(BloodPressureDayFragment r3, BleConnector r4) {
        Intrinsics.X0O(r4, "it");
        Bundle r5 = new Bundle();
        r5.putString("mArg0", null);
        r5.putInt("mArg1", 1);
        r5.putParcelable("mArg2", null);
        r5.putSerializable("mArg3", null);
        Intent r0 = new Intent(r3.getActivity(), RealTimeMeasurementActivity.class);
        r0.putExtras(r5);
        r3.startActivity(r0);
        return Unit.OXO1;
    }

    private static final DINCondBold sbpAvgValue_delegate$lambda$0(BloodPressureDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.sbpAvgValue);
    }

    private static final DINCondBold sbpValue_delegate$lambda$0(BloodPressureDayFragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.sbpValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateChartData(List<BarEntry> r5) {
        if (getBarChart().getData() != 0) goto L5;
    L7:
        setSetValue(new XXX1X11(r5, setDataLabel()));
        IXIX1X1 r0 = new IXIX1X1(new XIXi1iX00[]{getSetValue()});
        r0.iI(false);
        getBarChart().setData(r0);
    L8:
        getBarChart().I0IIOi(1000);
        getBarChart().invalidate();
        Iterator<T> r6 = r5.iterator();
    L10:
        if (r6.hasNext() == false) goto L14;
        BarEntry r1 = (BarEntry) r6.next();
        if (r1.O00() <= 0.0f) goto L10;
        this.highlight = r1.OIX0iXi();
        goto L10
    L14:
        getBarChart().II1Xi0(this.highlight, 0);
        return;
    L5:
        if (((IXIX1X1) getBarChart().getData()).XXI() <= 0) goto L7;
        T r2 = ((IXIX1X1) getBarChart().getData()).OIX0iXi(0);
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type com.github.mikephil.charting.data.BarDataSet");
        setSetValue((XXX1X11) r2);
        getSetValue().IOX1(r5);
        getSetValue().i0X1iIO();
        ((IXIX1X1) getBarChart().getData()).iX();
        getBarChart().X0i1O();
        goto L8
    }

    public final void calibrationPopup() {
        if (this.mCalibrationPopup != null) goto L5;
        i1XOiXX r0 = new i1XOiXX(getMActivity());
        r0.iX(R.string.manual_alibration);
        r0.i010I(new O10X00II(this));
        this.mCalibrationPopup = r0;
    L5:
        i1XOiXX r1 = this.mCalibrationPopup;
        if (r1 == null) goto L9;
        r1.II1Xi0(this.mSystolic, this.mDiastolic);
        r1.IIX1OXO();
        return;
    }

    public final float getHighlight() {
        return this.highlight;
    }

    public final int getMDiastolic() {
        return this.mDiastolic;
    }

    public final int getMSystolic() {
        return this.mSystolic;
    }

    @aa1
    public final XXX1X11 getSetValue() {
        XXX1X11 r0 = this.setValue;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("setValue");
        return null;
    }

    @aa1
    public final List<BarEntry> getValues() {
        return this.values;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseStatusFragment, com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r4) {
        super.init(r4);
        a01 r5 = a01.OXO1;
        this.mSystolic = r5.IiI10X().getInt(b01.XOXOIX0Oi, 115);
        this.mDiastolic = r5.IiI10X().getInt(b01.IiXIIX1O1, 75);
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        realTimeMeasurement();
        manualCalibration();
        iO1Xi1X1i r0 = iO1Xi1X1i.OXO1;
        BarChart r1 = getBarChart();
        Intrinsics.O10IXXX0X(r1, "<get-barChart>(...)");
        r0.OXO1(r1);
        YAxis r2 = getBarChart().getAxisLeft();
        Intrinsics.O10IXXX0X(r2, "getAxisLeft(...)");
        YAxis r3 = getBarChart().getAxisRight();
        Intrinsics.O10IXXX0X(r3, "getAxisRight(...)");
        r0.OIX0iXi(r2, r3, 0.0f, 50.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
        BarChart r4 = getBarChart();
        r4.getDescription().XOO0ii0(false);
        r4.getLegend().XOO0ii0(false);
        r4.setDrawValueAboveBar(false);
        r4.setScaleEnabled(false);
        XAxis r5 = getBarChart().getXAxis();
        Intrinsics.XXI(r5);
        Context r6 = getBarChart().getContext();
        Intrinsics.O10IXXX0X(r6, "getContext(...)");
        r0.OIi0(r5, false, r6);
        setRange(O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null));
        r5.IXOIIIO(1.0f);
        r5.XOIX(7);
        r5.iOiXi11II(25.0f);
        SimpleDateFormat r7 = O0X11OiO.XXiIiX10(false, 1, null);
        ArrayList r8 = new ArrayList();
        int r9 = 0;
    L4:
        if (r9 >= 25) goto L11;
        String r10 = TimeUtils.millis2String(getRange()[0] + (((long) (r9 * 3600)) * 1000), r7);
        if (r8.size() <= 12) goto L10;
        if (Intrinsics.XOO0ii0(r10, "0") == false) goto L10;
        r10 = X10i1i.XOOXII;
    L10:
        Intrinsics.XXI(r10);
        r8.add(r10);
        r9 = r9 + 1;
        goto L4
    L11:
        r5.Oi(new q4(r8));
        Oi01X10i r11 = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        r11.iOOX010X(gk4.iO(getMActivity(), R.color.line_color));
        r11.OII(gk4.iO(getMActivity(), R.color.bp_line_color));
        r11.I1(new int[]{ContextCompat.getColor(getMActivity(), R.color.bp_color), ContextCompat.getColor(getMActivity(), R.color.bp_secondary_color)});
        r11.iIiiO(2);
        getBarChart().setRenderer(r11);
        getBarChart().setOnChartValueSelectedListener(new OXO1(this, O0X11OiO.XO0X10iO(false, 1, null)));
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_status_bp_day;
    }

    @sf5(tag = I01XX0.iO)
    public final void onBloodPressureChanged(@aa1 Object r3) {
        Intrinsics.X0O(r3, "data");
        i1O0OXO1O.OXO1.IiI10X("onBloodPressureChanged! refresh");
        setMOffset(0);
        update(getMCalendar(), getMOffset(), getMTimePeriod());
        String r4 = O0X11OiO.OII(getMCalendar(), getMOffset(), getMTimePeriod());
        if (TimePeriod.DAY == getMTimePeriod()) goto L5;
        return;
    L5:
        if (Intrinsics.XOO0ii0(O0X11OiO.X0i1O(null, 1, null).format(new Date()), r4) == false) goto L8;
        getTvCurrent().setText(R.string.today);
        return;
    L8:
        getTvCurrent().setText(r4);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<BloodPressure> r2) {
        Intrinsics.X0O(r2, "data");
        filterData(r2);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<BloodPressure> onTimePeriodChange(@aa1 Calendar r5, int r6, @aa1 TimePeriod r7) {
        Intrinsics.X0O(r5, "calendar");
        Intrinsics.X0O(r7, "timePeriod");
        setRange(O0X11OiO.I1(r5, r7, r6));
        return this.mBloodPressureDao.getBloodPressures(getRange()[0], getRange()[1]);
    }

    @aa1
    public final String setDataLabel() {
        return "BP day Data";
    }

    public final void setHighlight(float r1) {
        this.highlight = r1;
    }

    public final void setMDiastolic(int r1) {
        this.mDiastolic = r1;
    }

    public final void setMSystolic(int r1) {
        this.mSystolic = r1;
    }

    public final void setSetValue(@aa1 XXX1X11 r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.setValue = r2;
    }

    public final void updateItemData(@aa1 Entry r8) {
        Intrinsics.X0O(r8, "e");
        BPHourData r9 = this.hourData.get((int) r8.OIX0iXi());
        DINCondBold r0 = getSbpValue();
        int r1 = r9.getSbpMin();
        String r5 = HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
        if (r1 == 0) goto L5;
    L7:
        StringCompanionObject r2 = StringCompanionObject.OXO1;
        String r3 = String.format("%d-%d", Arrays.copyOf(new Object[]{Integer.valueOf(r9.getSbpMin()), Integer.valueOf(r9.getSbpMax())}, 2));
        Intrinsics.O10IXXX0X(r3, "format(...)");
    L8:
        r0.setText(r3);
        DINCondBold r4 = getDbpValue();
        if (r9.getDbpMin() == 0) goto L11;
    L13:
        StringCompanionObject r6 = StringCompanionObject.OXO1;
        String r7 = String.format("%d-%d", Arrays.copyOf(new Object[]{Integer.valueOf(r9.getDbpMin()), Integer.valueOf(r9.getDbpMax())}, 2));
        Intrinsics.O10IXXX0X(r7, "format(...)");
    L14:
        r4.setText(r7);
        DINCondBold r10 = getSbpAvgValue();
        if (r9.getSbpTotal() != 0) goto L17;
    L20:
        String r11 = HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
    L21:
        r10.setText(r11);
        DINCondBold r12 = getDbpAvgValue();
        if (r9.getDbpTotal() != 0) goto L24;
    L27:
        r12.setText(r5);
        return;
    L24:
        if (r9.getDbpNum() == 0) goto L27;
        r5 = String.valueOf(r9.getDbpTotal() / r9.getDbpNum());
        goto L27
    L17:
        if (r9.getSbpNum() == 0) goto L20;
        r11 = String.valueOf(r9.getSbpTotal() / r9.getSbpNum());
        goto L21
    L11:
        if (r9.getDbpMax() != 0) goto L13;
        r7 = HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
        goto L14
    L5:
        if (r9.getSbpMax() != 0) goto L7;
        r3 = HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
        goto L8
    }
}
