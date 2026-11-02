package com.sma.smartv3.p610ui.status.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.C2305co;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O11X1i1;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.by6;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.he6;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.j07;
import com.android.mltcode.paycertificationapi.l76;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.uf1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.internal.security.CertificateUtil;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.biz.fitness_site.hyky.HykyManager;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.WeightMeasureDataKt;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.AppUserUpdate;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.NetWorkUtils$upload$$inlined$upload$1;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.WeightDao;
import com.sma.smartv3.p608db.entity.Weight;
import com.sma.smartv3.p610ui.status.BodyFatScaleActivity;
import com.sma.smartv3.p610ui.status.base.BaseDetailsFragment;
import com.sma.smartv3.p610ui.status.fragment.WeightRecordsFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.HeathReportsUtils;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWeightRecordsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightRecordsFragment.kt\ncom/sma/smartv3/ui/status/fragment/WeightRecordsFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 7 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 8 View.kt\nandroidx/core/view/ViewKt\n+ 9 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,498:1\n19#2:499\n15#2:500\n11#2,2:559\n108#3,7:501\n123#3:531\n116#4,23:508\n1491#5:532\n1516#5,3:533\n1519#5,3:543\n382#6,7:536\n216#7,2:546\n255#8:548\n255#8:558\n78#9,3:549\n81#9,5:553\n1#10:552\n*S KotlinDebug\n*F\n+ 1 WeightRecordsFragment.kt\ncom/sma/smartv3/ui/status/fragment/WeightRecordsFragment\n*L\n77#1:499\n77#1:500\n203#1:559,2\n234#1:501,7\n234#1:531\n234#1:508,23\n333#1:532\n333#1:533,3\n333#1:543,3\n333#1:536,7\n334#1:546,2\n105#1:548\n114#1:558\n111#1:549,3\n111#1:553,5\n111#1:552\n*E\n"})
public final class WeightRecordsFragment extends BaseDetailsFragment<Weight> {

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
    private boolean isImperial;

    @aa1
    private final AppUser mAppUser;

    @aa1
    private final Lazy mDeleteWeightPopup$delegate;

    @aa1
    private final Lazy mSetWeightPopup$delegate;

    @aa1
    private final TimePeriod mTimePeriod;

    @aa1
    private final WeightDao mWeightDao;
    private int nowSelectX;
    public LineDataSet setValue;
    private SimpleDateFormat timeFormat;

    @aa1
    private List<by6> weekDay;

    @aa1
    private final Lazy lineChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.l07
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightRecordsFragment.lineChart_delegate$lambda$0(this.f9326IO);
        }
    });

    @aa1
    private final Lazy changeBt$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.f17
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightRecordsFragment.changeBt_delegate$lambda$0(this.f6557IO);
        }
    });

    @aa1
    private final Lazy bodyFatScaleBt$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.g17
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightRecordsFragment.bodyFatScaleBt_delegate$lambda$0(this.f6793IO);
        }
    });

    @aa1
    private final Lazy deleteBt$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.h17
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightRecordsFragment.deleteBt_delegate$lambda$0(this.f7030IO);
        }
    });

    @aa1
    private final Lazy bmiValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.m07
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightRecordsFragment.bmiValue_delegate$lambda$0(this.f9593IO);
        }
    });

    @aa1
    private final Lazy bmiEvaluation$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.n07
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightRecordsFragment.bmiEvaluation_delegate$lambda$0(this.f9829IO);
        }
    });

    @aa1
    private final Lazy mSbvBmi$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.o07
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightRecordsFragment.mSbvBmi_delegate$lambda$0(this.f10053IO);
        }
    });

    @aa1
    private final Lazy weightUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.p07
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightRecordsFragment.weightUnit_delegate$lambda$0(this.f10267IO);
        }
    });

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.q07
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeightRecordsFragment.rootView_delegate$lambda$0(this.f10484IO);
        }
    });

    @aa1
    private final List<Entry> values = new ArrayList();

    @aa1
    private final List<Weight> tmpData = new ArrayList();

    public static final class OXO1 extends he6 {
        public OXO1() {
        }

        @Override // com.android.mltcode.paycertificationapi.he6
        public String I0IIOi(float f) {
            if (f == 0.0f) {
                return String.valueOf((int) f);
            }
            if (WeightRecordsFragment.this.isImperial) {
                return ((int) f) + WeightRecordsFragment.this.getMActivity().getString(R.string.lbs);
            }
            return ((int) f) + WeightRecordsFragment.this.getMActivity().getString(R.string.f54355kg);
        }
    }

    public static final class XIi00iiXO implements uf1 {
        public XIi00iiXO() {
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry e, X110O h) {
            Intrinsics.X0O(e, "e");
            Intrinsics.X0O(h, "h");
            if (WeightRecordsFragment.this.getMActivity().isFinishing()) {
                return;
            }
            WeightRecordsFragment.this.updateItemData(e);
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    public WeightRecordsFragment() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
        this.mWeightDao = MyDb.INSTANCE.getMDatabase().weightDao();
        this.weekDay = O0X11OiO.IXXOO(getMCalendar().getTimeInMillis());
        this.healthLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.r07
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return WeightRecordsFragment.healthLayout_delegate$lambda$0(this.f10721IO);
            }
        });
        this.healthBtn$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.w07
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return WeightRecordsFragment.healthBtn_delegate$lambda$0(this.f11855IO);
            }
        });
        this.healthTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.a17
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return WeightRecordsFragment.healthTv_delegate$lambda$0(this.f5395IO);
            }
        });
        this.healthTipLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.b17
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return WeightRecordsFragment.healthTipLayout_delegate$lambda$0(this.f5646IO);
            }
        });
        this.healthQuestions$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.c17
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return WeightRecordsFragment.healthQuestions_delegate$lambda$0(this.f5879IO);
            }
        });
        this.mSetWeightPopup$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.d17
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return WeightRecordsFragment.mSetWeightPopup_delegate$lambda$0(this.f6109IO);
            }
        });
        this.mDeleteWeightPopup$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.e17
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return WeightRecordsFragment.mDeleteWeightPopup_delegate$lambda$0(this.f6319IO);
            }
        });
        this.mTimePeriod = TimePeriod.DAY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium bmiEvaluation_delegate$lambda$0(WeightRecordsFragment weightRecordsFragment) {
        return (PFMedium) weightRecordsFragment.getMView().findViewById(R.id.bmiEvaluation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium bmiValue_delegate$lambda$0(WeightRecordsFragment weightRecordsFragment) {
        return (PFMedium) weightRecordsFragment.getMView().findViewById(R.id.bmiValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageButton bodyFatScaleBt_delegate$lambda$0(WeightRecordsFragment weightRecordsFragment) {
        return (ImageButton) weightRecordsFragment.getMView().findViewById(R.id.bodyFatScaleBt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageButton changeBt_delegate$lambda$0(WeightRecordsFragment weightRecordsFragment) {
        return (ImageButton) weightRecordsFragment.getMView().findViewById(R.id.changeBt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageButton deleteBt_delegate$lambda$0(WeightRecordsFragment weightRecordsFragment) {
        return (ImageButton) weightRecordsFragment.getMView().findViewById(R.id.deleteBt);
    }

    private final void filterData(List<Weight> list) {
        this.values.clear();
        this.tmpData.clear();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str = O0X11OiO.iiIOiX().format(Long.valueOf(((Weight) obj).getMTime()));
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            this.tmpData.addAll(CollectionsKt___CollectionsKt.IiII0((List) ((Map.Entry) it.next()).getValue(), 1));
        }
        int i = 0;
        int i2 = 0;
        for (Weight weight : this.tmpData) {
            int i3 = i2 + 1;
            float fM2527iO = this.isImperial ? l76.m2527iO(weight.getMWeight()) : weight.getMWeight();
            if (i < weight.getMWeight()) {
                i = (int) fM2527iO;
            }
            this.values.add(new Entry(i2, Float.parseFloat(cp5.iX1O1(fM2527iO, true))));
            i2 = i3;
        }
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        YAxis axisLeft = getLineChart().getAxisLeft();
        Intrinsics.O10IXXX0X(axisLeft, "getAxisLeft(...)");
        YAxis axisRight = getLineChart().getAxisRight();
        Intrinsics.O10IXXX0X(axisRight, "getAxisRight(...)");
        io1xi1x1i.IiI10X(axisLeft, axisRight, i);
        setXAxis();
        updateChartData(this.values);
        if (list.isEmpty()) {
            return;
        }
        Weight weight2 = (Weight) CollectionsKt___CollectionsKt.Xi1XO00(list);
        if (weight2.getMWeight() == 0.0f) {
            Button healthBtn = getHealthBtn();
            if (healthBtn != null) {
                healthBtn.setEnabled(false);
                return;
            }
            return;
        }
        String str2 = weight2.getMWeight() + getString(R.string.f54355kg) + I000IiI1O.C2156iO.XO0O10 + getString(R.string.bmi) + CertificateUtil.DELIMITER + cp5.I0IIOi(weight2.getMWeight(), this.mAppUser.getHeight());
        HeathReportsUtils heathReportsUtils = HeathReportsUtils.OXO1;
        long mTime = weight2.getMTime();
        Button healthBtn2 = getHealthBtn();
        Intrinsics.O10IXXX0X(healthBtn2, "<get-healthBtn>(...)");
        PFMedium healthTv = getHealthTv();
        Intrinsics.O10IXXX0X(healthTv, "<get-healthTv>(...)");
        LinearLayout healthTipLayout = getHealthTipLayout();
        Intrinsics.O10IXXX0X(healthTipLayout, "<get-healthTipLayout>(...)");
        PFMedium healthQuestions = getHealthQuestions();
        Intrinsics.O10IXXX0X(healthQuestions, "<get-healthQuestions>(...)");
        heathReportsUtils.m38814X1("weight", mTime, healthBtn2, healthTv, healthTipLayout, healthQuestions, getMActivity());
        i72 i72Var = i72.OXO1;
        boolean zI0i0 = i72Var.OIIOI() ? false : i72Var.I0i0();
        LinearLayout healthLayout = getHealthLayout();
        Intrinsics.O10IXXX0X(healthLayout, "<get-healthLayout>(...)");
        Button healthBtn3 = getHealthBtn();
        Intrinsics.O10IXXX0X(healthBtn3, "<get-healthBtn>(...)");
        PFMedium healthTv2 = getHealthTv();
        Intrinsics.O10IXXX0X(healthTv2, "<get-healthTv>(...)");
        heathReportsUtils.iOiXi11II(healthLayout, healthBtn3, healthTv2, getMActivity(), "weight", str2, weight2.getMTime(), "", zI0i0);
    }

    private final PFMedium getBmiEvaluation() {
        return (PFMedium) this.bmiEvaluation$delegate.getValue();
    }

    private final PFMedium getBmiValue() {
        return (PFMedium) this.bmiValue$delegate.getValue();
    }

    private final ImageButton getBodyFatScaleBt() {
        return (ImageButton) this.bodyFatScaleBt$delegate.getValue();
    }

    private final ImageButton getChangeBt() {
        return (ImageButton) this.changeBt$delegate.getValue();
    }

    private final ImageButton getDeleteBt() {
        return (ImageButton) this.deleteBt$delegate.getValue();
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

    private final LineChart getLineChart() {
        return (LineChart) this.lineChart$delegate.getValue();
    }

    private final go0 getMDeleteWeightPopup() {
        return (go0) this.mDeleteWeightPopup$delegate.getValue();
    }

    private final CircleThumbSegmentedBarView getMSbvBmi() {
        return (CircleThumbSegmentedBarView) this.mSbvBmi$delegate.getValue();
    }

    private final j07 getMSetWeightPopup() {
        return (j07) this.mSetWeightPopup$delegate.getValue();
    }

    private final View getRootView() {
        return (View) this.rootView$delegate.getValue();
    }

    private final PFMedium getWeightUnit() {
        return (PFMedium) this.weightUnit$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button healthBtn_delegate$lambda$0(WeightRecordsFragment weightRecordsFragment) {
        return (Button) weightRecordsFragment.getMView().findViewById(R.id.btn_common_heathy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout healthLayout_delegate$lambda$0(WeightRecordsFragment weightRecordsFragment) {
        return (LinearLayout) weightRecordsFragment.getMView().findViewById(R.id.item_health_btn_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium healthQuestions_delegate$lambda$0(WeightRecordsFragment weightRecordsFragment) {
        return (PFMedium) weightRecordsFragment.getMView().findViewById(R.id.tv_common_healthy_questions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout healthTipLayout_delegate$lambda$0(WeightRecordsFragment weightRecordsFragment) {
        return (LinearLayout) weightRecordsFragment.getMView().findViewById(R.id.questions_healthy_tip_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium healthTv_delegate$lambda$0(WeightRecordsFragment weightRecordsFragment) {
        return (PFMedium) weightRecordsFragment.getMView().findViewById(R.id.tv_common_heathy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(WeightRecordsFragment weightRecordsFragment, View view) {
        RelativeLayout loading = weightRecordsFragment.getLoading();
        Intrinsics.O10IXXX0X(loading, "<get-loading>(...)");
        if (loading.getVisibility() == 0) {
            return;
        }
        j07 mSetWeightPopup = weightRecordsFragment.getMSetWeightPopup();
        ImageButton changeBt = weightRecordsFragment.getChangeBt();
        Intrinsics.O10IXXX0X(changeBt, "<get-changeBt>(...)");
        mSetWeightPopup.I1XOi1(changeBt);
        weightRecordsFragment.getMSetWeightPopup().IXXOO(weightRecordsFragment.mAppUser.getWeight() == 0.0f ? 65.0f : weightRecordsFragment.mAppUser.getWeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(WeightRecordsFragment weightRecordsFragment, View view) {
        weightRecordsFragment.startActivity(new Intent(weightRecordsFragment.getActivity(), (Class<?>) BodyFatScaleActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(WeightRecordsFragment weightRecordsFragment, View view) {
        RelativeLayout loading = weightRecordsFragment.getLoading();
        Intrinsics.O10IXXX0X(loading, "<get-loading>(...)");
        if (loading.getVisibility() != 0 && weightRecordsFragment.tmpData.size() > 0) {
            go0 mDeleteWeightPopup = weightRecordsFragment.getMDeleteWeightPopup();
            ImageButton deleteBt = weightRecordsFragment.getDeleteBt();
            Intrinsics.O10IXXX0X(deleteBt, "<get-deleteBt>(...)");
            mDeleteWeightPopup.I1XOi1(deleteBt);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineChart lineChart_delegate$lambda$0(WeightRecordsFragment weightRecordsFragment) {
        return (LineChart) weightRecordsFragment.getMView().findViewById(R.id.lineChart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final go0 mDeleteWeightPopup_delegate$lambda$0(final WeightRecordsFragment weightRecordsFragment) {
        go0 go0Var = new go0(weightRecordsFragment.getMActivity(), 0, 2, null);
        go0Var.O1O(R.string.delete_record_remind);
        go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.y07
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(WeightRecordsFragment.mDeleteWeightPopup_delegate$lambda$0$0$0());
            }
        });
        go0Var.X1IX(R.string.delete, new Function0() { // from class: com.android.mltcode.paycertificationapi.z07
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(WeightRecordsFragment.mDeleteWeightPopup_delegate$lambda$0$0$1(this.f12494IO));
            }
        });
        return go0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mDeleteWeightPopup_delegate$lambda$0$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mDeleteWeightPopup_delegate$lambda$0$0$1(WeightRecordsFragment weightRecordsFragment) {
        weightRecordsFragment.getNowValue().setText(R.string.data_none);
        weightRecordsFragment.getBmiValue().setText(R.string.data_none);
        weightRecordsFragment.getBmiEvaluation().setText(R.string.data_none);
        Weight weight = weightRecordsFragment.tmpData.get(weightRecordsFragment.nowSelectX);
        weight.setMIsSync(0);
        weight.setMIsDelete(1);
        weightRecordsFragment.mWeightDao.update(CollectionsKt__CollectionsKt.Ii1iii0(weight));
        weightRecordsFragment.tmpData.remove(weightRecordsFragment.nowSelectX);
        I01XX0.XIi00iiXO(I01XX0.IiI10X, null, 2, null);
        weightRecordsFragment.setBmi(0.0d);
        weightRecordsFragment.update(weightRecordsFragment.getMCalendar(), 0, weightRecordsFragment.getMTimePeriod());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CircleThumbSegmentedBarView mSbvBmi_delegate$lambda$0(WeightRecordsFragment weightRecordsFragment) {
        return (CircleThumbSegmentedBarView) weightRecordsFragment.getMView().findViewById(R.id.sbv_bmi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j07 mSetWeightPopup_delegate$lambda$0(final WeightRecordsFragment weightRecordsFragment) {
        j07 j07Var = new j07(weightRecordsFragment.getMActivity());
        j07Var.i010I(R.string.remember_weight);
        j07Var.m2360iX(weightRecordsFragment.mAppUser.getUnit());
        if (weightRecordsFragment.tmpData.size() > 0) {
            List<Weight> list = weightRecordsFragment.tmpData;
            j07Var.IXXOO(list.get(list.size() - 1).getMWeight());
        } else {
            j07Var.IXXOO(20.0f);
        }
        j07Var.II1Xi0(new Function1() { // from class: com.android.mltcode.paycertificationapi.s07
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(WeightRecordsFragment.mSetWeightPopup_delegate$lambda$0$0$0(this.f10946IO, ((Float) obj).floatValue()));
            }
        });
        return j07Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mSetWeightPopup_delegate$lambda$0$0$0(WeightRecordsFragment weightRecordsFragment, float f) {
        ArrayList arrayList = new ArrayList();
        i1O0OXO1O.OXO1.OXO1("WeightRecordsFragment " + f);
        if (f < 20.0f) {
            ToastUtils.showLong(R.string.weight_set_error);
            return true;
        }
        weightRecordsFragment.mAppUser.setWeight(f);
        a01.OXO1.IiI10X().put(AppUser.class.getName(), new Gson().toJson(weightRecordsFragment.mAppUser));
        Weight weight = new Weight(0, 0L, null, 0.0f, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 0.0d, null, 0.0d, null, null, 0.0d, null, 0.0d, null, null, 0.0d, 0.0d, null, null, null, 0.0d, null, 0.0d, null, 0.0d, null, null, 0.0d, null, 0, 0, 0, -1, 2097151, null);
        weight.setMTime(O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null)[0]);
        String strMillis2String = TimeUtils.millis2String(System.currentTimeMillis(), O0X11OiO.XO0O10());
        Intrinsics.O10IXXX0X(strMillis2String, "millis2String(...)");
        weight.setMLocalTime(strMillis2String);
        weight.setMWeight(f);
        arrayList.add(weight);
        weightRecordsFragment.mWeightDao.insert(arrayList);
        if (q62.OXO1.iIIX0XI()) {
            HykyManager.Companion.getInstance().uploadDataWeight(weight);
        }
        I01XX0.XIi00iiXO(I01XX0.IiI10X, null, 2, null);
        weightRecordsFragment.update(weightRecordsFragment.getMCalendar(), 0, weightRecordsFragment.getMTimePeriod());
        weightRecordsFragment.uploadAppUserUpdate();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View rootView_delegate$lambda$0(WeightRecordsFragment weightRecordsFragment) {
        return weightRecordsFragment.getMView().findViewById(R.id.root_view);
    }

    private final void setBmi(double d) {
        try {
            CircleThumbSegmentedBarView mSbvBmi = getMSbvBmi();
            Intrinsics.O10IXXX0X(mSbvBmi, "<get-mSbvBmi>(...)");
            List listIXiX011 = CollectionsKt__CollectionsKt.iXiX011(Double.valueOf(0.0d), Double.valueOf(18.4d), Double.valueOf(24.9d), Double.valueOf(29.9d), Double.valueOf(34.9d));
            String[] stringArray = getResources().getStringArray(R.array.level_range_4_2_bmi);
            Intrinsics.O10IXXX0X(stringArray, "getStringArray(...)");
            int[] intArray = getResources().getIntArray(R.array.level_color_4_2);
            Intrinsics.O10IXXX0X(intArray, "getIntArray(...)");
            WeightMeasureDataKt.setBarView$default(mSbvBmi, d, listIXiX011, stringArray, intArray, false, 32, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void setXAxis() {
        XAxis xAxis = getLineChart().getXAxis();
        Intrinsics.X1ii(xAxis, "null cannot be cast to non-null type com.github.mikephil.charting.components.XAxis");
        ArrayList arrayList = new ArrayList();
        Iterator<Weight> it = this.tmpData.iterator();
        while (it.hasNext()) {
            long mTime = it.next().getMTime();
            SimpleDateFormat simpleDateFormat = this.timeFormat;
            if (simpleDateFormat == null) {
                Intrinsics.XXO("timeFormat");
                simpleDateFormat = null;
            }
            String strMillis2String = TimeUtils.millis2String(mTime, simpleDateFormat);
            Intrinsics.O10IXXX0X(strMillis2String, "millis2String(...)");
            arrayList.add(strMillis2String);
        }
        xAxis.m603Oi(new C2829q4(arrayList));
        xAxis.IXOIIIO(1.0f);
        xAxis.i0X000X0O(-0.05f);
        xAxis.iOiXi11II(this.tmpData.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateChartData(List<Entry> list) {
        long j;
        if (getLineChart().getData() == 0 || ((C2305co) getLineChart().getData()).XXI() <= 0) {
            setSetValue(new LineDataSet(list, "Weight Data"));
            getSetValue().II1(ContextCompat.getColor(getMActivity(), R.color.weight_show_1));
            getSetValue().I00(ContextCompat.getColor(getMActivity(), R.color.weight_show_1));
            getSetValue().I1XII0X(1.5f);
            getSetValue().iXOII(3.5f);
            getSetValue().XX00XX(2.0f);
            getSetValue().IIX(ContextCompat.getColor(getMActivity(), R.color.weight_show_0));
            getSetValue().IOI0i0I(true);
            getSetValue().XXI(false);
            C2305co c2305co = new C2305co(getSetValue());
            c2305co.m1316iI(false);
            getLineChart().setData(c2305co);
            getLineChart().iiII(list.size() / 3.0f, 1.0f, 0.0f, 0.0f);
            j = 1000;
        } else {
            T tOIX0iXi = ((C2305co) getLineChart().getData()).OIX0iXi(0);
            Intrinsics.X1ii(tOIX0iXi, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
            setSetValue((LineDataSet) tOIX0iXi);
            getSetValue().IOX1(list);
            getSetValue().i0X1iIO();
            ((C2305co) getLineChart().getData()).mo1167iX();
            getLineChart().X0i1O();
            j = 200;
        }
        getLineChart().invalidate();
        getLineChart().I0IIOi((int) j);
        getLineChart().Xi1i0XOX0(((C2305co) getLineChart().getData()).IIX1OXO());
        new Handler().postDelayed(new Runnable() { // from class: com.android.mltcode.paycertificationapi.t07
            @Override // java.lang.Runnable
            public final void run() {
                WeightRecordsFragment.updateChartData$lambda$0(this.f11169IO);
            }
        }, j + 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void updateChartData$lambda$0(WeightRecordsFragment weightRecordsFragment) {
        weightRecordsFragment.getLineChart().II1Xi0(((C2305co) weightRecordsFragment.getLineChart().getData()).IIX1OXO(), 0);
    }

    private final void uploadAppUserUpdate() {
        if (!a01.OXO1.IiI10X().getBoolean(b01.O001I, true) || this.mAppUser.getIdentity().length() <= 0) {
            return;
        }
        if (this.mAppUser.getHeight() == 0.0f && this.mAppUser.getWeight() == 0.0f) {
            ToastUtils.showLong(R.string.user_does_not_exist);
            return;
        }
        this.mAppUser.setThirdPlatform(null);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        File fileI0IIOi = uz0.I0IIOi(sz0.OXO1);
        AppUser appUser = this.mAppUser;
        final O1XIiIO<AppUser> o1XIiIO = new O1XIiIO<AppUser>() { // from class: com.sma.smartv3.ui.status.fragment.WeightRecordsFragment.uploadAppUserUpdate.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(AppUser appUser2) {
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
            }
        };
        final Activity mActivity = getMActivity();
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(mActivity, getRootView());
        NetWork netWork = NetWork.OXO1;
        String str = Api.INSTANCE.getBASE_URL() + AppUserUpdate.URL;
        final O1XIiIO<Response<AppUser>> o1XIiIO2 = new O1XIiIO<Response<AppUser>>() { // from class: com.sma.smartv3.ui.status.fragment.WeightRecordsFragment$uploadAppUserUpdate$$inlined$upload$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<AppUser> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity = mActivity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        ANRequest.MultiPartBuilder multiPartBuilderUpload = AndroidNetworking.upload(str);
        if (fileI0IIOi.exists()) {
            multiPartBuilderUpload.addMultipartFile("avatar", fileI0IIOi);
        }
        multiPartBuilderUpload.addMultipartParameter(appUser).setTag((Object) str).setPriority(Priority.HIGH).build().setUploadProgressListener(NetWorkUtils$upload$$inlined$upload$1.INSTANCE).getAsParsed(TypeToken.getParameterized(Response.class, AppUser.class), new ParsedRequestListener<Response<AppUser>>() { // from class: com.sma.smartv3.ui.status.fragment.WeightRecordsFragment$uploadAppUserUpdate$$inlined$upload$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<AppUser> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                o1XIiIO2.handleError(String.valueOf(aNError));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium weightUnit_delegate$lambda$0(WeightRecordsFragment weightRecordsFragment) {
        return (PFMedium) weightRecordsFragment.getMView().findViewById(R.id.weightUnit);
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseStatusFragment
    @aa1
    public TimePeriod getMTimePeriod() {
        return this.mTimePeriod;
    }

    @aa1
    public final LineDataSet getSetValue() {
        LineDataSet lineDataSet = this.setValue;
        if (lineDataSet != null) {
            return lineDataSet;
        }
        Intrinsics.XXO("setValue");
        return null;
    }

    @aa1
    public final List<Entry> getValues() {
        return this.values;
    }

    @aa1
    public final List<by6> getWeekDay() {
        return this.weekDay;
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getMView().findViewById(R.id.ll_bottom_tool).setVisibility(i72.OXO1.i0O() ? 8 : 0);
        getMSbvBmi().setVisibility(0);
        setBmi(0.0d);
        this.isImperial = this.mAppUser.getUnit() == 1;
        getWeightUnit().setText(cp5.m1626iX(this.mAppUser.getUnit()));
        getChangeBt().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.u07
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeightRecordsFragment.initView$lambda$0(this.f11401IO, view);
            }
        });
        getBodyFatScaleBt().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.v07
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeightRecordsFragment.initView$lambda$1(this.f11625IO, view);
            }
        });
        getDeleteBt().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.x07
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeightRecordsFragment.initView$lambda$2(this.f12083IO, view);
            }
        });
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        LineChart lineChart = getLineChart();
        Intrinsics.O10IXXX0X(lineChart, "<get-lineChart>(...)");
        io1xi1x1i.XIi00iiXO(lineChart);
        YAxis axisLeft = getLineChart().getAxisLeft();
        Intrinsics.O10IXXX0X(axisLeft, "getAxisLeft(...)");
        YAxis axisRight = getLineChart().getAxisRight();
        Intrinsics.O10IXXX0X(axisRight, "getAxisRight(...)");
        io1xi1x1i.OIX0iXi(axisLeft, axisRight, 0.0f, 30.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
        LineChart lineChart2 = getLineChart();
        lineChart2.setDragEnabled(true);
        lineChart2.getDescription().XOO0ii0(false);
        lineChart2.getLegend().XOO0ii0(false);
        lineChart2.setScaleEnabled(false);
        getLineChart().setExtraLeftOffset(20.0f);
        XAxis xAxis = getLineChart().getXAxis();
        Intrinsics.X1ii(xAxis, "null cannot be cast to non-null type com.github.mikephil.charting.components.XAxis");
        io1xi1x1i.OIi0(xAxis, false, getMActivity());
        getLineChart().getAxisRight().m603Oi(new OXO1());
        O11X1i1 o11X1i1 = new O11X1i1(getLineChart(), getLineChart().getAnimator(), getLineChart().getViewPortHandler());
        o11X1i1.i010I(gk4.m1859iO(getMActivity(), R.color.line_color));
        getLineChart().setRenderer(o11X1i1);
        getLineChart().setOnChartValueSelectedListener(new XIi00iiXO());
        this.timeFormat = O0X11OiO.XXX11i();
        super.initView();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_weight_record;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<? extends Weight> data) {
        Intrinsics.X0O(data, "data");
        filterData(data);
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseDetailsFragment
    @aa1
    public List<Weight> onTimePeriodChange(@aa1 Calendar calendar, int i, @aa1 TimePeriod timePeriod) {
        Intrinsics.X0O(calendar, "calendar");
        Intrinsics.X0O(timePeriod, "timePeriod");
        return this.mWeightDao.getWeights();
    }

    @sf5(tag = I01XX0.IiI10X)
    public final void onWeightChanged(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        LogUtils.m11131v("onWeightChanged");
        getNowValue().setText(R.string.data_none);
        getBmiValue().setText(R.string.data_none);
        getBmiEvaluation().setText(R.string.data_none);
        update(getMCalendar(), 0, getMTimePeriod());
    }

    @aa1
    public final String setDataLabel() {
        return "weight day Data";
    }

    public final void setSetValue(@aa1 LineDataSet lineDataSet) {
        Intrinsics.X0O(lineDataSet, "<set-?>");
        this.setValue = lineDataSet;
    }

    public final void setWeekDay(@aa1 List<by6> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.weekDay = list;
    }

    @Override // com.sma.smartv3.p610ui.status.base.BaseStatusFragment
    public void share() {
        if (this.tmpData.size() > 0) {
            super.share();
        } else {
            ToastUtils.showLong(R.string.weight_shape_tip);
        }
    }

    public final void updateItemData(@aa1 Entry e) {
        int i;
        Intrinsics.X0O(e, "e");
        this.nowSelectX = (int) e.OIX0iXi();
        getNowValue().setText(String.valueOf(e.O00()));
        getLineChart().iOiXi11II(e.OIX0iXi(), e.O00(), YAxis.AxisDependency.RIGHT, 500L);
        Weight weight = this.tmpData.get(this.nowSelectX);
        DINCondBold nowTimeDetails = getNowTimeDetails();
        long mTime = weight.getMTime();
        SimpleDateFormat simpleDateFormat = this.timeFormat;
        if (simpleDateFormat == null) {
            Intrinsics.XXO("timeFormat");
            simpleDateFormat = null;
        }
        nowTimeDetails.setText(TimeUtils.millis2String(mTime, simpleDateFormat));
        double d = weight.getMBmi() == 0.0d ? Double.parseDouble(cp5.I0IIOi(weight.getMWeight(), this.mAppUser.getHeight())) : weight.getMBmi();
        getBmiValue().setText(cp5.X11iII1O1((float) d, false, 2, null));
        PFMedium bmiEvaluation = getBmiEvaluation();
        if (d <= 16.4d) {
            i = R.string.very_thin;
        } else if (d <= 18.4d) {
            i = R.string.thin;
        } else if (d <= 24.9d) {
            i = R.string.normal;
        } else if (d <= 29.9d) {
            i = R.string.too_heavy;
        } else if (d <= 34.9d) {
            i = R.string.class_1_obesity;
        } else {
            i = d <= 39.0d ? R.string.class_2_obesity : R.string.class_3_obesity;
        }
        bmiEvaluation.setText(i);
        if (weight.getMWeight() == 0.0f) {
            setBmi(0.0d);
        } else {
            getMSbvBmi().setVisibility(0);
            setBmi(d);
        }
    }
}
