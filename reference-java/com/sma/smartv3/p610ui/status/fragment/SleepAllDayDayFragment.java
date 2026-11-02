package com.sma.smartv3.p610ui.status.fragment;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.IXIX1X1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.Oi01X10i;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.facebook.internal.security.CertificateUtil;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.model.SleepAllDayData;
import com.sma.smartv3.model.SleepAllDayDataParse;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.SleepDao;
import com.sma.smartv3.p608db.entity.Sleep;
import com.sma.smartv3.p610ui.status.base.BaseDetailDaysFragment;
import com.sma.smartv3.p610ui.status.fragment.SleepAllDayDayFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.HeathReportsUtils;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.entity.BleSleep;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSleepAllDayDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAllDayDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/SleepAllDayDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,372:1\n1869#2,2:373\n*S KotlinDebug\n*F\n+ 1 SleepAllDayDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/SleepAllDayDayFragment\n*L\n325#1:373,2\n*E\n"})
public final class SleepAllDayDayFragment extends BaseDetailDaysFragment<Sleep> {

    @tb1
    private SleepAllDayData curSleepAllDayData;
    private Oi01X10i infoBarChartRender;
    public XXX1X11 setValue;

    @aa1
    private final Lazy barChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ll4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepAllDayDayFragment.barChart_delegate$lambda$0(this.f9462IO);
        }
    });

    @aa1
    private final Lazy deepValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.nl4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepAllDayDayFragment.deepValue_delegate$lambda$0(this.f9961IO);
        }
    });

    @aa1
    private final Lazy lightValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.rl4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepAllDayDayFragment.lightValue_delegate$lambda$0(this.f10843IO);
        }
    });

    @aa1
    private final Lazy awakeValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.sl4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepAllDayDayFragment.awakeValue_delegate$lambda$0(this.f11080IO);
        }
    });

    @aa1
    private final Lazy remValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.tl4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepAllDayDayFragment.remValue_delegate$lambda$0(this.f11279IO);
        }
    });

    @aa1
    private final Lazy piecemealValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ul4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepAllDayDayFragment.piecemealValue_delegate$lambda$0(this.f11516IO);
        }
    });

    @aa1
    private final Lazy sleepStartTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vl4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepAllDayDayFragment.sleepStartTime_delegate$lambda$0(this.f11749IO);
        }
    });

    @aa1
    private final Lazy sleepStartTime1$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.xl4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepAllDayDayFragment.sleepStartTime1_delegate$lambda$0(this.f12191IO);
        }
    });

    @aa1
    private final Lazy sleepStartTime2$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.yl4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepAllDayDayFragment.sleepStartTime2_delegate$lambda$0(this.f12391IO);
        }
    });

    @aa1
    private final Lazy sleepStartTime3$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zl4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepAllDayDayFragment.sleepStartTime3_delegate$lambda$0(this.f12637IO);
        }
    });

    @aa1
    private final Lazy sleepEndTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wl4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepAllDayDayFragment.sleepEndTime_delegate$lambda$0(this.f11984IO);
        }
    });

    @aa1
    private final Lazy llInfoRem$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.am4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepAllDayDayFragment.llInfoRem_delegate$lambda$0(this.f5519IO);
        }
    });

    @aa1
    private final Lazy llInfoPiecemeal$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.bm4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepAllDayDayFragment.llInfoPiecemeal_delegate$lambda$0(this.f5762IO);
        }
    });

    @aa1
    private final Lazy llPiecemeal$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.cm4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepAllDayDayFragment.llPiecemeal_delegate$lambda$0(this.f6003IO);
        }
    });

    @aa1
    private final Lazy totalPiecemealTime$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.dm4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepAllDayDayFragment.totalPiecemealTime_delegate$lambda$0(this.f6222IO);
        }
    });

    @aa1
    private final Lazy piemealCount$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.em4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepAllDayDayFragment.piemealCount_delegate$lambda$0(this.f6447IO);
        }
    });

    @aa1
    private final Lazy piemealAvg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.fm4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepAllDayDayFragment.piemealAvg_delegate$lambda$0(this.f6670IO);
        }
    });

    @aa1
    private final Lazy rvPiecemeal$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gm4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepAllDayDayFragment.rvPiecemeal_delegate$lambda$0(this.f6917IO);
        }
    });

    @aa1
    private final Lazy healthLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.hm4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepAllDayDayFragment.healthLayout_delegate$lambda$0(this.f7153IO);
        }
    });

    @aa1
    private final Lazy healthBtn$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ml4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepAllDayDayFragment.healthBtn_delegate$lambda$0(this.f9730IO);
        }
    });

    @aa1
    private final Lazy healthTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ol4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepAllDayDayFragment.healthTv_delegate$lambda$0(this.f10165IO);
        }
    });

    @aa1
    private final Lazy healthTipLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.pl4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepAllDayDayFragment.healthTipLayout_delegate$lambda$0(this.f10390IO);
        }
    });

    @aa1
    private final Lazy healthQuestions$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ql4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SleepAllDayDayFragment.healthQuestions_delegate$lambda$0(this.f10631IO);
        }
    });

    @aa1
    private final List<BarEntry> values = new ArrayList();
    private final int block = 1;
    private final float blockHeight = 400.0f / 1;

    @aa1
    private final SleepDao mSleepDao = MyDb.INSTANCE.getMDatabase().sleepDao();

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold awakeValue_delegate$lambda$0(SleepAllDayDayFragment sleepAllDayDayFragment) {
        return (DINCondBold) sleepAllDayDayFragment.getMView().findViewById(R.id.awakeValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BarChart barChart_delegate$lambda$0(SleepAllDayDayFragment sleepAllDayDayFragment) {
        return (BarChart) sleepAllDayDayFragment.getMView().findViewById(R.id.barChart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold deepValue_delegate$lambda$0(SleepAllDayDayFragment sleepAllDayDayFragment) {
        return (DINCondBold) sleepAllDayDayFragment.getMView().findViewById(R.id.deepValue);
    }

    private final void filterData(List<Sleep> list) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int total;
        Oi01X10i oi01X10i;
        String str;
        Oi01X10i oi01X10i2;
        this.values.clear();
        this.curSleepAllDayData = null;
        List<Sleep> list2 = list;
        if (list2.isEmpty()) {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            total = 0;
        } else {
            SleepAllDayData sleepAllDayDataFilterData = SleepAllDayDataParse.INSTANCE.filterData(list, this.blockHeight, this.values, getRange()[0]);
            this.curSleepAllDayData = sleepAllDayDataFilterData;
            LogUtils.m11128d(sleepAllDayDataFilterData.toString());
            i = sleepAllDayDataFilterData.getStatus().get(1);
            i2 = sleepAllDayDataFilterData.getStatus().get(2);
            i3 = sleepAllDayDataFilterData.getStatus().get(3);
            i4 = sleepAllDayDataFilterData.getStatus().get(9);
            i5 = sleepAllDayDataFilterData.getStatus().get(8);
            total = sleepAllDayDataFilterData.getTotal();
            if (total > 0) {
                setXAxis(sleepAllDayDataFilterData, total);
            }
        }
        String string = "";
        if (total == 0) {
            getSleepStartTime().setText("");
            getSleepStartTime1().setText("");
            getSleepStartTime2().setText("");
            getSleepStartTime3().setText("");
            getSleepEndTime().setText("");
            getBarChart().getXAxis().m603Oi(new C2829q4(CollectionsKt__CollectionsKt.m39402iI()));
        }
        DINCondBold deepValue = getDeepValue();
        Intrinsics.O10IXXX0X(deepValue, "<get-deepValue>(...)");
        cp5.iOO1ii1(i, deepValue, getMActivity(), 30, R.color.light);
        DINCondBold lightValue = getLightValue();
        Intrinsics.O10IXXX0X(lightValue, "<get-lightValue>(...)");
        cp5.iOO1ii1(i2, lightValue, getMActivity(), 30, R.color.light);
        DINCondBold awakeValue = getAwakeValue();
        Intrinsics.O10IXXX0X(awakeValue, "<get-awakeValue>(...)");
        cp5.iOO1ii1(i3, awakeValue, getMActivity(), 30, R.color.light);
        DINCondBold remValue = getRemValue();
        Intrinsics.O10IXXX0X(remValue, "<get-remValue>(...)");
        cp5.iOO1ii1(i4, remValue, getMActivity(), 30, R.color.light);
        DINCondBold piecemealValue = getPiecemealValue();
        Intrinsics.O10IXXX0X(piecemealValue, "<get-piecemealValue>(...)");
        cp5.iOO1ii1(i5, piecemealValue, getMActivity(), 30, R.color.light);
        DINCondBold nowValue = getNowValue();
        Intrinsics.O10IXXX0X(nowValue, "<get-nowValue>(...)");
        cp5.O1O(total, nowValue, getMActivity(), 0, 0, 24, null);
        if (1 > total || total >= 121) {
            Oi01X10i oi01X10i3 = this.infoBarChartRender;
            if (oi01X10i3 == null) {
                Intrinsics.XXO("infoBarChartRender");
                oi01X10i = null;
            } else {
                oi01X10i = oi01X10i3;
            }
            oi01X10i.i010I(2.0f);
        } else {
            Oi01X10i oi01X10i4 = this.infoBarChartRender;
            if (oi01X10i4 == null) {
                Intrinsics.XXO("infoBarChartRender");
                oi01X10i2 = null;
            } else {
                oi01X10i2 = oi01X10i4;
            }
            oi01X10i2.i010I(6.0f);
        }
        updateChartData(this.values);
        showSleepPiecemeal();
        if (i4 > 0) {
            getLlInfoRem().setVisibility(0);
        } else {
            getLlInfoRem().setVisibility(8);
        }
        if (list2.isEmpty()) {
            return;
        }
        Sleep sleep = (Sleep) CollectionsKt___CollectionsKt.Xi1XO00(list);
        if (sleep.getMAlgorithmType() == 0) {
            Button healthBtn = getHealthBtn();
            if (healthBtn != null) {
                healthBtn.setEnabled(false);
                return;
            }
            return;
        }
        int i6 = total / 60;
        int i7 = total % 60;
        if (i5 != 0) {
            str = getString(R.string.night_sleep) + CertificateUtil.DELIMITER + i6 + getString(R.string.f54354h) + i7 + getString(R.string.h_m) + "\n" + getString(R.string.piecemeal) + CertificateUtil.DELIMITER + (i5 / 60) + getString(R.string.f54354h) + (i5 % 60) + getString(R.string.h_m);
        } else {
            str = getString(R.string.night_sleep) + CertificateUtil.DELIMITER + i6 + getString(R.string.f54354h) + i7 + getString(R.string.h_m);
        }
        String str2 = str;
        HeathReportsUtils heathReportsUtils = HeathReportsUtils.OXO1;
        long mTime = sleep.getMTime();
        Button healthBtn2 = getHealthBtn();
        Intrinsics.O10IXXX0X(healthBtn2, "<get-healthBtn>(...)");
        PFMedium healthTv = getHealthTv();
        Intrinsics.O10IXXX0X(healthTv, "<get-healthTv>(...)");
        LinearLayout healthTipLayout = getHealthTipLayout();
        Intrinsics.O10IXXX0X(healthTipLayout, "<get-healthTipLayout>(...)");
        PFMedium healthQuestions = getHealthQuestions();
        Intrinsics.O10IXXX0X(healthQuestions, "<get-healthQuestions>(...)");
        heathReportsUtils.m38814X1("sleep", mTime, healthBtn2, healthTv, healthTipLayout, healthQuestions, getMActivity());
        i72 i72Var = i72.OXO1;
        boolean zI0i0 = i72Var.I0i0();
        if (i72Var.OIIOI()) {
            string = getString(R.string.sleep_ai_health_analysis_v2);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            zI0i0 = i72Var.I0i0();
        }
        String str3 = string;
        boolean z = zI0i0;
        LinearLayout healthLayout = getHealthLayout();
        Intrinsics.O10IXXX0X(healthLayout, "<get-healthLayout>(...)");
        Button healthBtn3 = getHealthBtn();
        Intrinsics.O10IXXX0X(healthBtn3, "<get-healthBtn>(...)");
        PFMedium healthTv2 = getHealthTv();
        Intrinsics.O10IXXX0X(healthTv2, "<get-healthTv>(...)");
        heathReportsUtils.iOiXi11II(healthLayout, healthBtn3, healthTv2, getMActivity(), "sleep", str2, sleep.getMTime(), str3, z);
    }

    private final DINCondBold getAwakeValue() {
        return (DINCondBold) this.awakeValue$delegate.getValue();
    }

    private final BarChart getBarChart() {
        return (BarChart) this.barChart$delegate.getValue();
    }

    private final DINCondBold getDeepValue() {
        return (DINCondBold) this.deepValue$delegate.getValue();
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

    private final DINCondBold getLightValue() {
        return (DINCondBold) this.lightValue$delegate.getValue();
    }

    private final ViewGroup getLlInfoPiecemeal() {
        return (ViewGroup) this.llInfoPiecemeal$delegate.getValue();
    }

    private final ViewGroup getLlInfoRem() {
        return (ViewGroup) this.llInfoRem$delegate.getValue();
    }

    private final ViewGroup getLlPiecemeal() {
        return (ViewGroup) this.llPiecemeal$delegate.getValue();
    }

    private final DINCondBold getPiecemealValue() {
        return (DINCondBold) this.piecemealValue$delegate.getValue();
    }

    private final TextView getPiemealAvg() {
        return (TextView) this.piemealAvg$delegate.getValue();
    }

    private final TextView getPiemealCount() {
        return (TextView) this.piemealCount$delegate.getValue();
    }

    private final DINCondBold getRemValue() {
        return (DINCondBold) this.remValue$delegate.getValue();
    }

    private final RecyclerView getRvPiecemeal() {
        return (RecyclerView) this.rvPiecemeal$delegate.getValue();
    }

    private final TextView getSleepEndTime() {
        return (TextView) this.sleepEndTime$delegate.getValue();
    }

    private final TextView getSleepStartTime() {
        return (TextView) this.sleepStartTime$delegate.getValue();
    }

    private final TextView getSleepStartTime1() {
        return (TextView) this.sleepStartTime1$delegate.getValue();
    }

    private final TextView getSleepStartTime2() {
        return (TextView) this.sleepStartTime2$delegate.getValue();
    }

    private final TextView getSleepStartTime3() {
        return (TextView) this.sleepStartTime3$delegate.getValue();
    }

    private final TextView getTotalPiecemealTime() {
        return (TextView) this.totalPiecemealTime$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button healthBtn_delegate$lambda$0(SleepAllDayDayFragment sleepAllDayDayFragment) {
        return (Button) sleepAllDayDayFragment.getMView().findViewById(R.id.btn_common_heathy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout healthLayout_delegate$lambda$0(SleepAllDayDayFragment sleepAllDayDayFragment) {
        return (LinearLayout) sleepAllDayDayFragment.getMView().findViewById(R.id.item_health_btn_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium healthQuestions_delegate$lambda$0(SleepAllDayDayFragment sleepAllDayDayFragment) {
        return (PFMedium) sleepAllDayDayFragment.getMView().findViewById(R.id.tv_common_healthy_questions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout healthTipLayout_delegate$lambda$0(SleepAllDayDayFragment sleepAllDayDayFragment) {
        return (LinearLayout) sleepAllDayDayFragment.getMView().findViewById(R.id.questions_healthy_tip_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium healthTv_delegate$lambda$0(SleepAllDayDayFragment sleepAllDayDayFragment) {
        return (PFMedium) sleepAllDayDayFragment.getMView().findViewById(R.id.tv_common_heathy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold lightValue_delegate$lambda$0(SleepAllDayDayFragment sleepAllDayDayFragment) {
        return (DINCondBold) sleepAllDayDayFragment.getMView().findViewById(R.id.lightValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup llInfoPiecemeal_delegate$lambda$0(SleepAllDayDayFragment sleepAllDayDayFragment) {
        return (ViewGroup) sleepAllDayDayFragment.getMView().findViewById(R.id.ll_info_piecemeal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup llInfoRem_delegate$lambda$0(SleepAllDayDayFragment sleepAllDayDayFragment) {
        return (ViewGroup) sleepAllDayDayFragment.getMView().findViewById(R.id.ll_info_rem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup llPiecemeal_delegate$lambda$0(SleepAllDayDayFragment sleepAllDayDayFragment) {
        return (ViewGroup) sleepAllDayDayFragment.getMView().findViewById(R.id.ll_piecemeal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold piecemealValue_delegate$lambda$0(SleepAllDayDayFragment sleepAllDayDayFragment) {
        return (DINCondBold) sleepAllDayDayFragment.getMView().findViewById(R.id.piecemealValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView piemealAvg_delegate$lambda$0(SleepAllDayDayFragment sleepAllDayDayFragment) {
        return (TextView) sleepAllDayDayFragment.getMView().findViewById(R.id.tv_piecemeal_avg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView piemealCount_delegate$lambda$0(SleepAllDayDayFragment sleepAllDayDayFragment) {
        return (TextView) sleepAllDayDayFragment.getMView().findViewById(R.id.tv_piecemeal_count);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold remValue_delegate$lambda$0(SleepAllDayDayFragment sleepAllDayDayFragment) {
        return (DINCondBold) sleepAllDayDayFragment.getMView().findViewById(R.id.remValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView rvPiecemeal_delegate$lambda$0(SleepAllDayDayFragment sleepAllDayDayFragment) {
        return (RecyclerView) sleepAllDayDayFragment.getMView().findViewById(R.id.rv_piecemeal);
    }

    private final void setXAxis(SleepAllDayData sleepAllDayData, int i) {
        XAxis xAxis = getBarChart().getXAxis();
        Intrinsics.X1ii(xAxis, "null cannot be cast to non-null type com.github.mikephil.charting.components.XAxis");
        int i2 = 0;
        SimpleDateFormat simpleDateFormatXO0X10iO = O0X11OiO.XO0X10iO(false, 1, null);
        ArrayList arrayList = new ArrayList();
        if (i >= 0) {
            while (true) {
                arrayList.add("");
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        int endTime = (sleepAllDayData.getEndTime() - sleepAllDayData.getStartTime()) / 4;
        getSleepStartTime().setText(TimeUtils.millis2String(((long) sleepAllDayData.getStartTime()) * 1000, simpleDateFormatXO0X10iO));
        getSleepStartTime1().setText(TimeUtils.millis2String(((long) (sleepAllDayData.getStartTime() + endTime)) * 1000, simpleDateFormatXO0X10iO));
        getSleepStartTime2().setText(TimeUtils.millis2String(((long) (sleepAllDayData.getStartTime() + (endTime * 2))) * 1000, simpleDateFormatXO0X10iO));
        getSleepStartTime3().setText(TimeUtils.millis2String(((long) (sleepAllDayData.getStartTime() + (endTime * 3))) * 1000, simpleDateFormatXO0X10iO));
        getSleepEndTime().setText(TimeUtils.millis2String(((long) sleepAllDayData.getEndTime()) * 1000, simpleDateFormatXO0X10iO));
        xAxis.m603Oi(new C2829q4(arrayList));
        xAxis.O1O = 0.0f;
        xAxis.IXOIIIO(arrayList.size() / 4);
        xAxis.iOO1ii1 = arrayList.size();
    }

    private final void showSleepPiecemeal() {
        getLlPiecemeal().setVisibility(8);
        SleepAllDayData sleepAllDayData = this.curSleepAllDayData;
        if (sleepAllDayData == null || sleepAllDayData.getAnalyseSleep().isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (List<BleSleep> list : BleSleep.Companion.getSleepAllDaySegments(sleepAllDayData.getAnalyseSleep())) {
            Integer num = BleSleep.Companion.getSleepAllDaySegmentStatus(list).get(8);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue > 0) {
                i++;
                i2 += iIntValue;
                arrayList.add(new Triple(getString(R.string.sleep_nap) + i, cp5.XXIIO1i11(iIntValue), O0X11OiO.XO0X10iO(false, 1, null).format(Long.valueOf(((BleSleep) CollectionsKt___CollectionsKt.IIII0iI(list)).getMLocalTime())) + HelpFormatter.DEFAULT_OPT_PREFIX + O0X11OiO.XO0X10iO(false, 1, null).format(Long.valueOf(((BleSleep) CollectionsKt___CollectionsKt.Xi1XO00(list)).getMLocalTime()))));
            }
        }
        if (i == 0) {
            return;
        }
        getLlPiecemeal().setVisibility(0);
        getTotalPiecemealTime().setText(cp5.XXIIO1i11(i2));
        getPiemealCount().setText(getString(R.string.d_times, Integer.valueOf(i)));
        getPiemealAvg().setText(cp5.XXIIO1i11(i2 / i));
        getRvPiecemeal().setLayoutManager(new LinearLayoutManager(getMActivity(), 1, false));
        RecyclerView rvPiecemeal = getRvPiecemeal();
        final Activity mActivity = getMActivity();
        final List listIOOIXiI1 = CollectionsKt___CollectionsKt.IOOIXiI1(arrayList);
        rvPiecemeal.setAdapter(new CommonAdapter<Triple<? extends String, ? extends String, ? extends String>>(mActivity, listIOOIXiI1) { // from class: com.sma.smartv3.ui.status.fragment.SleepAllDayDayFragment$showSleepPiecemeal$1$2
            @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
            public /* bridge */ /* synthetic */ void convert(ViewHolder viewHolder, Triple<? extends String, ? extends String, ? extends String> triple, int i3) {
                convert2(viewHolder, (Triple<String, String, String>) triple, i3);
            }

            /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
            public void convert2(ViewHolder holder, Triple<String, String, String> item, int i3) {
                Intrinsics.X0O(holder, "holder");
                Intrinsics.X0O(item, "item");
                ((TextView) holder.getView(R.id.tv_name)).setText(item.getFirst());
                ((TextView) holder.getView(R.id.tv_time)).setText(item.getSecond());
                ((TextView) holder.getView(R.id.tv_date)).setText(item.getThird());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView sleepEndTime_delegate$lambda$0(SleepAllDayDayFragment sleepAllDayDayFragment) {
        return (TextView) sleepAllDayDayFragment.getMView().findViewById(R.id.sleepEndTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView sleepStartTime1_delegate$lambda$0(SleepAllDayDayFragment sleepAllDayDayFragment) {
        return (TextView) sleepAllDayDayFragment.getMView().findViewById(R.id.sleepStartTime1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView sleepStartTime2_delegate$lambda$0(SleepAllDayDayFragment sleepAllDayDayFragment) {
        return (TextView) sleepAllDayDayFragment.getMView().findViewById(R.id.sleepStartTime2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView sleepStartTime3_delegate$lambda$0(SleepAllDayDayFragment sleepAllDayDayFragment) {
        return (TextView) sleepAllDayDayFragment.getMView().findViewById(R.id.sleepStartTime3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView sleepStartTime_delegate$lambda$0(SleepAllDayDayFragment sleepAllDayDayFragment) {
        return (TextView) sleepAllDayDayFragment.getMView().findViewById(R.id.sleepStartTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView totalPiecemealTime_delegate$lambda$0(SleepAllDayDayFragment sleepAllDayDayFragment) {
        return (TextView) sleepAllDayDayFragment.getMView().findViewById(R.id.tv_total_piecemeal_time);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateChartData(List<BarEntry> list) {
        if (getBarChart().getData() != 0 && ((IXIX1X1) getBarChart().getData()).XXI() > 0) {
            ((IXIX1X1) getBarChart().getData()).IXXOO(0);
        }
        XXX1X11 xxx1x11 = new XXX1X11(list, "SleepAllDayData");
        xxx1x11.iIXX0i(0.0f);
        xxx1x11.iO11i(0.0f);
        IXIX1X1 ixix1x1 = new IXIX1X1(xxx1x11);
        ixix1x1.m1316iI(false);
        setColor(xxx1x11);
        getBarChart().setData(ixix1x1);
        getBarChart().invalidate();
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

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getBarChart().i100IXOX(0.0f, 0.0f, 0.0f, 0.0f);
        BarChart barChart = getBarChart();
        barChart.setTouchEnabled(false);
        barChart.getDescription().XOO0ii0(false);
        barChart.getLegend().XOO0ii0(false);
        YAxis axisLeft = barChart.getAxisLeft();
        axisLeft.Ii0X0X(false);
        axisLeft.iOiXi11II(this.blockHeight);
        axisLeft.X00Xi1X(false);
        axisLeft.XO0X10iO(false);
        axisLeft.Ii0X0X(false);
        axisLeft.i0X000X0O(0.0f);
        axisLeft.iIi0(0.0f);
        YAxis axisRight = barChart.getAxisRight();
        axisRight.XOO0ii0(false);
        axisRight.i0X000X0O(0.0f);
        axisRight.iIi0(0.0f);
        axisRight.X00Xi1X(false);
        axisRight.Ii0X0X(false);
        XAxis xAxis = barChart.getXAxis();
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        Intrinsics.XXI(xAxis);
        io1xi1x1i.OIi0(xAxis, true, getMActivity());
        xAxis.X00Xi1X(false);
        xAxis.Ii0X0X(false);
        Oi01X10i oi01X10i = new Oi01X10i(getBarChart(), getBarChart().getAnimator(), getBarChart().getViewPortHandler());
        this.infoBarChartRender = oi01X10i;
        oi01X10i.iOOX010X(gk4.m1859iO(getMActivity(), R.color.line_color));
        Oi01X10i oi01X10i2 = this.infoBarChartRender;
        Oi01X10i oi01X10i3 = null;
        if (oi01X10i2 == null) {
            Intrinsics.XXO("infoBarChartRender");
            oi01X10i2 = null;
        }
        oi01X10i2.X01IiOiIi(this.blockHeight);
        Oi01X10i oi01X10i4 = this.infoBarChartRender;
        if (oi01X10i4 == null) {
            Intrinsics.XXO("infoBarChartRender");
            oi01X10i4 = null;
        }
        oi01X10i4.m1017OX(this.block);
        Oi01X10i oi01X10i5 = this.infoBarChartRender;
        if (oi01X10i5 == null) {
            Intrinsics.XXO("infoBarChartRender");
            oi01X10i5 = null;
        }
        oi01X10i5.iIiiO(6);
        BarChart barChart2 = getBarChart();
        Oi01X10i oi01X10i6 = this.infoBarChartRender;
        if (oi01X10i6 == null) {
            Intrinsics.XXO("infoBarChartRender");
        } else {
            oi01X10i3 = oi01X10i6;
        }
        barChart2.setRenderer(oi01X10i3);
        super.initView();
        DINCondBold nowTimeDetails = getNowTimeDetails();
        nowTimeDetails.setVisibility(0);
        nowTimeDetails.setText(getString(R.string.all_sleep_time));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_status_sleep_all_day;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<Sleep> data) {
        Intrinsics.X0O(data, "data");
        filterData(data);
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<Sleep> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        setRange(O0X11OiO.m787I1(calendar, timePeriod, i));
        LogUtils.m11128d("day => " + getRange()[0] + HelpFormatter.DEFAULT_OPT_PREFIX + getRange()[1]);
        SimpleDateFormat simpleDateFormatIO0iXO0O = O0X11OiO.IO0iXO0O();
        long j = getRange()[0];
        long j2 = (long) O0X11OiO.iXiX011;
        LogUtils.m11128d("day => " + simpleDateFormatIO0iXO0O.format(Long.valueOf(j - j2)) + HelpFormatter.DEFAULT_OPT_PREFIX + O0X11OiO.IO0iXO0O().format(Long.valueOf(getRange()[1])));
        return this.mSleepDao.getSleeps(getRange()[0] - j2, getRange()[1]);
    }

    public final void setColor(@aa1 XXX1X11 value) {
        Intrinsics.X0O(value, "value");
        value.I011X(CollectionsKt__CollectionsKt.iXiX011(0, Integer.valueOf(ContextCompat.getColor(getMActivity(), R.color.colorAccent))));
    }

    @aa1
    public final String setDataLabel() {
        return "sleep day Data";
    }

    public final void setSetValue(@aa1 XXX1X11 xxx1x11) {
        Intrinsics.X0O(xxx1x11, "<set-?>");
        this.setValue = xxx1x11;
    }
}
