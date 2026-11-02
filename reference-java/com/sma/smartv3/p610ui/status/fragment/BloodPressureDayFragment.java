package com.sma.smartv3.p610ui.status.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IXIX1X1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.X10i1i;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1XOiXX;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
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
import com.sma.smartv3.model.BPDataParse;
import com.sma.smartv3.model.BPHourData;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.BloodPressureDao;
import com.sma.smartv3.p608db.entity.BloodPressure;
import com.sma.smartv3.p610ui.status.RealTimeMeasurementActivity;
import com.sma.smartv3.p610ui.status.base.BaseDetailDaysFragment;
import com.sma.smartv3.p610ui.status.fragment.BloodPressureDayFragment;
import com.sma.smartv3.pro.R;
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
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBloodPressureDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodPressureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,350:1\n1869#2,2:351\n99#3,7:353\n106#3,3:361\n79#3,7:364\n109#3:371\n1#4:360\n*S KotlinDebug\n*F\n+ 1 BloodPressureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment\n*L\n305#1:351,2\n115#1:353,7\n115#1:361,3\n115#1:364,7\n115#1:371\n115#1:360\n*E\n"})
public final class BloodPressureDayFragment extends BaseDetailDaysFragment<BloodPressure> {
    private float highlight;

    @tb1
    private i1XOiXX mCalibrationPopup;
    public XXX1X11 setValue;

    @aa1
    private final Lazy barChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IiiXO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodPressureDayFragment.barChart_delegate$lambda$0(this.f2336IO);
        }
    });

    @aa1
    private final Lazy sbpValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0iX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodPressureDayFragment.sbpValue_delegate$lambda$0(this.f2603IO);
        }
    });

    @aa1
    private final Lazy dbpValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0IiIO0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodPressureDayFragment.dbpValue_delegate$lambda$0(this.f2472IO);
        }
    });

    @aa1
    private final Lazy sbpAvgValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iOIX0O1OX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodPressureDayFragment.sbpAvgValue_delegate$lambda$0(this.f8080IO);
        }
    });

    @aa1
    private final Lazy dbpAvgValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXiO10
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodPressureDayFragment.dbpAvgValue_delegate$lambda$0(this.f2141IO);
        }
    });

    @aa1
    private final Lazy measurePanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IXiI0OX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodPressureDayFragment.measurePanel_delegate$lambda$0(this.f2136IO);
        }
    });

    @aa1
    private final Lazy btnMeasure$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X110X011X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodPressureDayFragment.btnMeasure_delegate$lambda$0(this.f4204IO);
        }
    });

    @aa1
    private final Lazy calibrationPanel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0i1O0XO1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodPressureDayFragment.calibrationPanel_delegate$lambda$0(this.f1266IO);
        }
    });

    @aa1
    private final Lazy btnCalibration$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0OO111XI
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodPressureDayFragment.btnCalibration_delegate$lambda$0(this.f1165IO);
        }
    });

    @aa1
    private final List<BarEntry> values = new ArrayList();

    @aa1
    private LinkedHashMap<Long, BPHourData> filterDataMap = new LinkedHashMap<>();

    @aa1
    private final List<BPHourData> hourData = new ArrayList();

    @aa1
    private final BloodPressureDao mBloodPressureDao = MyDb.INSTANCE.getMDatabase().bloodPressureDao();

    @aa1
    private final Lazy healthLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0iX1XOX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodPressureDayFragment.healthLayout_delegate$lambda$0(this.f4105IO);
        }
    });

    @aa1
    private final Lazy healthBtn$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iI10i1OXi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodPressureDayFragment.healthBtn_delegate$lambda$0(this.f7814IO);
        }
    });

    @aa1
    private final Lazy healthTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOO0O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodPressureDayFragment.healthTv_delegate$lambda$0(this.f1820IO);
        }
    });

    @aa1
    private final Lazy healthTipLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XiOOO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodPressureDayFragment.healthTipLayout_delegate$lambda$0(this.f5304IO);
        }
    });

    @aa1
    private final Lazy healthQuestions$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iXXIOI1i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodPressureDayFragment.healthQuestions_delegate$lambda$0(this.f8400IO);
        }
    });
    private int mSystolic = 115;
    private int mDiastolic = 75;

    public static final class OXO1 implements uf1 {
        public final /* synthetic */ SimpleDateFormat XIi00iiXO;

        public OXO1(SimpleDateFormat simpleDateFormat) {
            this.XIi00iiXO = simpleDateFormat;
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry e, X110O h) {
            Intrinsics.X0O(e, "e");
            Intrinsics.X0O(h, "h");
            BloodPressureDayFragment.this.updateItemData(e);
            BloodPressureDayFragment.this.getMCalendar().set(11, (int) e.OIX0iXi());
            DINCondBold nowTimeDetails = BloodPressureDayFragment.this.getNowTimeDetails();
            BloodPressureDayFragment bloodPressureDayFragment = BloodPressureDayFragment.this;
            nowTimeDetails.setText(bloodPressureDayFragment.getString(R.string.time_range, TimeUtils.millis2String(bloodPressureDayFragment.getMCalendar().getTimeInMillis() - ((long) TimeConstants.HOUR), this.XIi00iiXO), TimeUtils.millis2String(BloodPressureDayFragment.this.getMCalendar().getTimeInMillis(), this.XIi00iiXO)));
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BarChart barChart_delegate$lambda$0(BloodPressureDayFragment bloodPressureDayFragment) {
        return (BarChart) bloodPressureDayFragment.getMView().findViewById(R.id.barChart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnCalibration_delegate$lambda$0(BloodPressureDayFragment bloodPressureDayFragment) {
        return bloodPressureDayFragment.getMView().findViewById(R.id.btn_calibration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View btnMeasure_delegate$lambda$0(BloodPressureDayFragment bloodPressureDayFragment) {
        return bloodPressureDayFragment.getMView().findViewById(R.id.btn_measure);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View calibrationPanel_delegate$lambda$0(BloodPressureDayFragment bloodPressureDayFragment) {
        return bloodPressureDayFragment.getMView().findViewById(R.id.calibration_panel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean calibrationPopup$lambda$0$0(BloodPressureDayFragment bloodPressureDayFragment, int i, int i2) {
        bloodPressureDayFragment.mSystolic = i;
        bloodPressureDayFragment.mDiastolic = i2;
        a01 a01Var = a01.OXO1;
        a01Var.IiI10X().put(b01.XOXOIX0Oi, bloodPressureDayFragment.mSystolic);
        a01Var.IiI10X().put(b01.IiXIIX1O1, bloodPressureDayFragment.mDiastolic);
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.BLOOD_PRESSURE_CALIBRATION, BleKeyFlag.UPDATE, new BleBloodPressureCalibration(bloodPressureDayFragment.mSystolic, bloodPressureDayFragment.mDiastolic), false, false, 24, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold dbpAvgValue_delegate$lambda$0(BloodPressureDayFragment bloodPressureDayFragment) {
        return (DINCondBold) bloodPressureDayFragment.getMView().findViewById(R.id.dbpAvgValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold dbpValue_delegate$lambda$0(BloodPressureDayFragment bloodPressureDayFragment) {
        return (DINCondBold) bloodPressureDayFragment.getMView().findViewById(R.id.dbpValue);
    }

    private final void filterData(List<BloodPressure> list) {
        this.values.clear();
        BPDataParse.INSTANCE.filterHourData(getRange(), list, this.hourData, this.values);
        updateChartData(this.values);
        if (list.isEmpty()) {
            return;
        }
        BloodPressure bloodPressure = (BloodPressure) CollectionsKt___CollectionsKt.Xi1XO00(list);
        if (bloodPressure.getMSystolic() == 0) {
            Button healthBtn = getHealthBtn();
            if (healthBtn != null) {
                healthBtn.setEnabled(false);
                return;
            }
            return;
        }
        String str = getString(R.string.systolic_pressure) + CertificateUtil.DELIMITER + bloodPressure.getMSystolic() + I000IiI1O.C2156iO.XO0O10 + getString(R.string.diastolic_pressure) + CertificateUtil.DELIMITER + bloodPressure.getMDiastolic();
        HeathReportsUtils heathReportsUtils = HeathReportsUtils.OXO1;
        long mTime = bloodPressure.getMTime();
        Button healthBtn2 = getHealthBtn();
        Intrinsics.O10IXXX0X(healthBtn2, "<get-healthBtn>(...)");
        PFMedium healthTv = getHealthTv();
        Intrinsics.O10IXXX0X(healthTv, "<get-healthTv>(...)");
        LinearLayout healthTipLayout = getHealthTipLayout();
        Intrinsics.O10IXXX0X(healthTipLayout, "<get-healthTipLayout>(...)");
        PFMedium healthQuestions = getHealthQuestions();
        Intrinsics.O10IXXX0X(healthQuestions, "<get-healthQuestions>(...)");
        heathReportsUtils.m38814X1(q62.OXOXXiI, mTime, healthBtn2, healthTv, healthTipLayout, healthQuestions, getMActivity());
        i72 i72Var = i72.OXO1;
        boolean zI0i0 = i72Var.OIIOI() ? false : i72Var.I0i0();
        LinearLayout healthLayout = getHealthLayout();
        Intrinsics.O10IXXX0X(healthLayout, "<get-healthLayout>(...)");
        Button healthBtn3 = getHealthBtn();
        Intrinsics.O10IXXX0X(healthBtn3, "<get-healthBtn>(...)");
        PFMedium healthTv2 = getHealthTv();
        Intrinsics.O10IXXX0X(healthTv2, "<get-healthTv>(...)");
        heathReportsUtils.iOiXi11II(healthLayout, healthBtn3, healthTv2, getMActivity(), q62.OXOXXiI, str, bloodPressure.getMTime(), "", zI0i0);
    }

    private final BarChart getBarChart() {
        return (BarChart) this.barChart$delegate.getValue();
    }

    private final View getBtnCalibration() {
        return (View) this.btnCalibration$delegate.getValue();
    }

    private final View getBtnMeasure() {
        return (View) this.btnMeasure$delegate.getValue();
    }

    private final View getCalibrationPanel() {
        return (View) this.calibrationPanel$delegate.getValue();
    }

    private final DINCondBold getDbpAvgValue() {
        return (DINCondBold) this.dbpAvgValue$delegate.getValue();
    }

    private final DINCondBold getDbpValue() {
        return (DINCondBold) this.dbpValue$delegate.getValue();
    }

    private final Button getHealthBtn() {
        return (Button) this.healthBtn$delegate.getValue();
    }

    private final LinearLayout getHealthLayout() {
        return (LinearLayout) this.healthLayout$delegate.getValue();
    }

    private final PFMedium getHealthQuestions() {
        return (PFMedium) this.healthQuestions$delegate.getValue();
    }

    private final LinearLayout getHealthTipLayout() {
        return (LinearLayout) this.healthTipLayout$delegate.getValue();
    }

    private final PFMedium getHealthTv() {
        return (PFMedium) this.healthTv$delegate.getValue();
    }

    private final View getMeasurePanel() {
        return (View) this.measurePanel$delegate.getValue();
    }

    private final DINCondBold getSbpAvgValue() {
        return (DINCondBold) this.sbpAvgValue$delegate.getValue();
    }

    private final DINCondBold getSbpValue() {
        return (DINCondBold) this.sbpValue$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button healthBtn_delegate$lambda$0(BloodPressureDayFragment bloodPressureDayFragment) {
        return (Button) bloodPressureDayFragment.getMView().findViewById(R.id.btn_common_heathy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout healthLayout_delegate$lambda$0(BloodPressureDayFragment bloodPressureDayFragment) {
        return (LinearLayout) bloodPressureDayFragment.getMView().findViewById(R.id.item_health_btn_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium healthQuestions_delegate$lambda$0(BloodPressureDayFragment bloodPressureDayFragment) {
        return (PFMedium) bloodPressureDayFragment.getMView().findViewById(R.id.tv_common_healthy_questions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout healthTipLayout_delegate$lambda$0(BloodPressureDayFragment bloodPressureDayFragment) {
        return (LinearLayout) bloodPressureDayFragment.getMView().findViewById(R.id.questions_healthy_tip_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium healthTv_delegate$lambda$0(BloodPressureDayFragment bloodPressureDayFragment) {
        return (PFMedium) bloodPressureDayFragment.getMView().findViewById(R.id.tv_common_heathy);
    }

    private final void manualCalibration() {
        View viewFindViewById;
        q62 q62Var = q62.OXO1;
        if (!q62Var.OiXX0()) {
            View calibrationPanel = getCalibrationPanel();
            if (calibrationPanel != null) {
                calibrationPanel.setVisibility(8);
                return;
            }
            return;
        }
        if (q62Var.iOi1010() && (viewFindViewById = getMView().findViewById(R.id.measure_view)) != null) {
            viewFindViewById.setVisibility(8);
        }
        View calibrationPanel2 = getCalibrationPanel();
        if (calibrationPanel2 != null) {
            calibrationPanel2.setVisibility(0);
        }
        getMView().setFocusableInTouchMode(true);
        getMView().requestFocus();
        getMView().setOnKeyListener(new View.OnKeyListener() { // from class: com.android.mltcode.paycertificationapi.i0OX00O1
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return BloodPressureDayFragment.manualCalibration$lambda$0(this.f7397IO, view, i, keyEvent);
            }
        });
        View btnCalibration = getBtnCalibration();
        if (btnCalibration != null) {
            btnCalibration.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.iXiIiIO0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8435IO.calibrationPopup();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean manualCalibration$lambda$0(BloodPressureDayFragment bloodPressureDayFragment, View view, int i, KeyEvent keyEvent) {
        i1XOiXX i1xoixx;
        return keyEvent.getAction() == 1 && i == 4 && (i1xoixx = bloodPressureDayFragment.mCalibrationPopup) != null && i1xoixx.isShowing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View measurePanel_delegate$lambda$0(BloodPressureDayFragment bloodPressureDayFragment) {
        return bloodPressureDayFragment.getMView().findViewById(R.id.measure_panel);
    }

    private final void realTimeMeasurement() {
        if (!q62.OXO1.iOi1010()) {
            View measurePanel = getMeasurePanel();
            if (measurePanel != null) {
                measurePanel.setVisibility(8);
                return;
            }
            return;
        }
        View measurePanel2 = getMeasurePanel();
        if (measurePanel2 != null) {
            measurePanel2.setVisibility(0);
        }
        View btnMeasure = getBtnMeasure();
        if (btnMeasure != null) {
            btnMeasure.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.I1iX0I
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BloodPressureDayFragment.realTimeMeasurement$lambda$0(this.f1501IO, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void realTimeMeasurement$lambda$0(final BloodPressureDayFragment bloodPressureDayFragment, View view) {
        i1O0OXO1O.OXO1.IiI10X("start measure");
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.Oi11iOXii
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BloodPressureDayFragment.realTimeMeasurement$lambda$0$0(this.f3660IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit realTimeMeasurement$lambda$0$0(BloodPressureDayFragment bloodPressureDayFragment, BleConnector it) {
        Intrinsics.X0O(it, "it");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 1);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(bloodPressureDayFragment.getActivity(), (Class<?>) RealTimeMeasurementActivity.class);
        intent.putExtras(bundle);
        bloodPressureDayFragment.startActivity(intent);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sbpAvgValue_delegate$lambda$0(BloodPressureDayFragment bloodPressureDayFragment) {
        return (DINCondBold) bloodPressureDayFragment.getMView().findViewById(R.id.sbpAvgValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold sbpValue_delegate$lambda$0(BloodPressureDayFragment bloodPressureDayFragment) {
        return (DINCondBold) bloodPressureDayFragment.getMView().findViewById(R.id.sbpValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateChartData(List<BarEntry> list) {
        if (getBarChart().getData() == 0 || ((IXIX1X1) getBarChart().getData()).XXI() <= 0) {
            setSetValue(new XXX1X11(list, setDataLabel()));
            IXIX1X1 ixix1x1 = new IXIX1X1(getSetValue());
            ixix1x1.m1316iI(false);
            getBarChart().setData(ixix1x1);
        } else {
            T tOIX0iXi = ((IXIX1X1) getBarChart().getData()).OIX0iXi(0);
            Intrinsics.X1ii(tOIX0iXi, "null cannot be cast to non-null type com.github.mikephil.charting.data.BarDataSet");
            setSetValue((XXX1X11) tOIX0iXi);
            getSetValue().IOX1(list);
            getSetValue().i0X1iIO();
            ((IXIX1X1) getBarChart().getData()).mo1167iX();
            getBarChart().X0i1O();
        }
        getBarChart().I0IIOi(1000);
        getBarChart().invalidate();
        for (BarEntry barEntry : list) {
            if (barEntry.O00() > 0.0f) {
                this.highlight = barEntry.OIX0iXi();
            }
        }
        getBarChart().II1Xi0(this.highlight, 0);
    }

    public final void calibrationPopup() {
        if (this.mCalibrationPopup == null) {
            i1XOiXX i1xoixx = new i1XOiXX(getMActivity());
            i1xoixx.m2027iX(R.string.manual_alibration);
            i1xoixx.i010I(new Function2() { // from class: com.android.mltcode.paycertificationapi.O10X00II
                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj, Object obj2) {
                    return Boolean.valueOf(BloodPressureDayFragment.calibrationPopup$lambda$0$0(this.f2635IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue()));
                }
            });
            this.mCalibrationPopup = i1xoixx;
        }
        i1XOiXX i1xoixx2 = this.mCalibrationPopup;
        if (i1xoixx2 != null) {
            i1xoixx2.II1Xi0(this.mSystolic, this.mDiastolic);
            i1xoixx2.IIX1OXO();
        }
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
        XXX1X11 xxx1x11 = this.setValue;
        if (xxx1x11 != null) {
            return xxx1x11;
        }
        Intrinsics.XXO("setValue");
        return null;
    }

    @aa1
    public final List<BarEntry> getValues() {
        return this.values;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseStatusFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        super.init(bundle);
        a01 a01Var = a01.OXO1;
        this.mSystolic = a01Var.IiI10X().getInt(b01.XOXOIX0Oi, 115);
        this.mDiastolic = a01Var.IiI10X().getInt(b01.IiXIIX1O1, 75);
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        realTimeMeasurement();
        manualCalibration();
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        BarChart barChart = getBarChart();
        Intrinsics.O10IXXX0X(barChart, "<get-barChart>(...)");
        io1xi1x1i.OXO1(barChart);
        YAxis axisLeft = getBarChart().getAxisLeft();
        Intrinsics.O10IXXX0X(axisLeft, "getAxisLeft(...)");
        YAxis axisRight = getBarChart().getAxisRight();
        Intrinsics.O10IXXX0X(axisRight, "getAxisRight(...)");
        io1xi1x1i.OIX0iXi(axisLeft, axisRight, 0.0f, 50.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
        BarChart barChart2 = getBarChart();
        barChart2.getDescription().XOO0ii0(false);
        barChart2.getLegend().XOO0ii0(false);
        barChart2.setDrawValueAboveBar(false);
        barChart2.setScaleEnabled(false);
        XAxis xAxis = getBarChart().getXAxis();
        Intrinsics.XXI(xAxis);
        Context context = getBarChart().getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        io1xi1x1i.OIi0(xAxis, false, context);
        setRange(O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null));
        xAxis.IXOIIIO(1.0f);
        xAxis.XOIX(7);
        xAxis.iOiXi11II(25.0f);
        SimpleDateFormat simpleDateFormatXXiIiX10 = O0X11OiO.XXiIiX10(false, 1, null);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 25; i++) {
            String strMillis2String = TimeUtils.millis2String(getRange()[0] + (((long) (i * 3600)) * 1000), simpleDateFormatXXiIiX10);
            if (arrayList.size() > 12 && Intrinsics.XOO0ii0(strMillis2String, "0")) {
                strMillis2String = X10i1i.XOOXII;
            }
            Intrinsics.XXI(strMillis2String);
            arrayList.add(strMillis2String);
        }
        xAxis.m603Oi(new C2829q4(arrayList));
        Oi01X10i oi01X10i = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        oi01X10i.iOOX010X(gk4.m1859iO(getMActivity(), R.color.line_color));
        oi01X10i.OII(gk4.m1859iO(getMActivity(), R.color.bp_line_color));
        oi01X10i.m1016I1(new int[]{ContextCompat.getColor(getMActivity(), R.color.bp_color), ContextCompat.getColor(getMActivity(), R.color.bp_secondary_color)});
        oi01X10i.iIiiO(2);
        getBarChart().setRenderer(oi01X10i);
        getBarChart().setOnChartValueSelectedListener(new OXO1(O0X11OiO.XO0X10iO(false, 1, null)));
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_status_bp_day;
    }

    @sf5(tag = I01XX0.f1094iO)
    public final void onBloodPressureChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        i1O0OXO1O.OXO1.IiI10X("onBloodPressureChanged! refresh");
        setMOffset(0);
        update(getMCalendar(), getMOffset(), getMTimePeriod());
        String strOII = O0X11OiO.OII(getMCalendar(), getMOffset(), getMTimePeriod());
        if (TimePeriod.DAY == getMTimePeriod()) {
            if (Intrinsics.XOO0ii0(O0X11OiO.X0i1O(null, 1, null).format(new Date()), strOII)) {
                getTvCurrent().setText(R.string.today);
            } else {
                getTvCurrent().setText(strOII);
            }
        }
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<BloodPressure> data) {
        Intrinsics.X0O(data, "data");
        filterData(data);
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<BloodPressure> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        setRange(O0X11OiO.m787I1(calendar, timePeriod, i));
        return this.mBloodPressureDao.getBloodPressures(getRange()[0], getRange()[1]);
    }

    @aa1
    public final String setDataLabel() {
        return "BP day Data";
    }

    public final void setHighlight(float f) {
        this.highlight = f;
    }

    public final void setMDiastolic(int i) {
        this.mDiastolic = i;
    }

    public final void setMSystolic(int i) {
        this.mSystolic = i;
    }

    public final void setSetValue(@aa1 XXX1X11 xxx1x11) {
        Intrinsics.X0O(xxx1x11, "<set-?>");
        this.setValue = xxx1x11;
    }

    public final void updateItemData(@aa1 Entry e) {
        String str;
        String str2;
        Intrinsics.X0O(e, "e");
        BPHourData bPHourData = this.hourData.get((int) e.OIX0iXi());
        DINCondBold sbpValue = getSbpValue();
        int sbpMin = bPHourData.getSbpMin();
        String strValueOf = HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
        if (sbpMin == 0 && bPHourData.getSbpMax() == 0) {
            str = HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
            str = String.format("%d-%d", Arrays.copyOf(new Object[]{Integer.valueOf(bPHourData.getSbpMin()), Integer.valueOf(bPHourData.getSbpMax())}, 2));
            Intrinsics.O10IXXX0X(str, "format(...)");
        }
        sbpValue.setText(str);
        DINCondBold dbpValue = getDbpValue();
        if (bPHourData.getDbpMin() == 0 && bPHourData.getDbpMax() == 0) {
            str2 = HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
        } else {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.OXO1;
            str2 = String.format("%d-%d", Arrays.copyOf(new Object[]{Integer.valueOf(bPHourData.getDbpMin()), Integer.valueOf(bPHourData.getDbpMax())}, 2));
            Intrinsics.O10IXXX0X(str2, "format(...)");
        }
        dbpValue.setText(str2);
        getSbpAvgValue().setText((bPHourData.getSbpTotal() == 0 || bPHourData.getSbpNum() == 0) ? HelpFormatter.DEFAULT_LONG_OPT_PREFIX : String.valueOf(bPHourData.getSbpTotal() / bPHourData.getSbpNum()));
        DINCondBold dbpAvgValue = getDbpAvgValue();
        if (bPHourData.getDbpTotal() != 0 && bPHourData.getDbpNum() != 0) {
            strValueOf = String.valueOf(bPHourData.getDbpTotal() / bPHourData.getDbpNum());
        }
        dbpAvgValue.setText(strValueOf);
    }
}
