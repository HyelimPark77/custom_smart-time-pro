package com.sma.smartv3.ui.status.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IiXO1XOi;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O11X1i1;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.X110O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.a17;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.b17;
import com.android.mltcode.paycertificationapi.by6;
import com.android.mltcode.paycertificationapi.c17;
import com.android.mltcode.paycertificationapi.co;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.d17;
import com.android.mltcode.paycertificationapi.e17;
import com.android.mltcode.paycertificationapi.f17;
import com.android.mltcode.paycertificationapi.g17;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.h17;
import com.android.mltcode.paycertificationapi.he6;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.j07;
import com.android.mltcode.paycertificationapi.l07;
import com.android.mltcode.paycertificationapi.l76;
import com.android.mltcode.paycertificationapi.m07;
import com.android.mltcode.paycertificationapi.n07;
import com.android.mltcode.paycertificationapi.o07;
import com.android.mltcode.paycertificationapi.p07;
import com.android.mltcode.paycertificationapi.q07;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.r07;
import com.android.mltcode.paycertificationapi.s07;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.t07;
import com.android.mltcode.paycertificationapi.u07;
import com.android.mltcode.paycertificationapi.uf1;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.v07;
import com.android.mltcode.paycertificationapi.w07;
import com.android.mltcode.paycertificationapi.x07;
import com.android.mltcode.paycertificationapi.y07;
import com.android.mltcode.paycertificationapi.z07;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
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
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.WeightDao;
import com.sma.smartv3.db.entity.Weight;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.WeightMeasureDataKt;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.AppUserUpdate;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.NetWorkUtils$upload$$inlined$upload$1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.BodyFatScaleActivity;
import com.sma.smartv3.ui.status.base.BaseDetailsFragment;
import com.sma.smartv3.util.HeathReportsUtils;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import java.io.File;
import java.lang.reflect.Type;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWeightRecordsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightRecordsFragment.kt\ncom/sma/smartv3/ui/status/fragment/WeightRecordsFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 7 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 8 View.kt\nandroidx/core/view/ViewKt\n+ 9 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,498:1\n19#2:499\n15#2:500\n11#2,2:559\n108#3,7:501\n123#3:531\n116#4,23:508\n1491#5:532\n1516#5,3:533\n1519#5,3:543\n382#6,7:536\n216#7,2:546\n255#8:548\n255#8:558\n78#9,3:549\n81#9,5:553\n1#10:552\n*S KotlinDebug\n*F\n+ 1 WeightRecordsFragment.kt\ncom/sma/smartv3/ui/status/fragment/WeightRecordsFragment\n*L\n77#1:499\n77#1:500\n203#1:559,2\n234#1:501,7\n234#1:531\n234#1:508,23\n333#1:532\n333#1:533,3\n333#1:543,3\n333#1:536,7\n334#1:546,2\n105#1:548\n114#1:558\n111#1:549,3\n111#1:553,5\n111#1:552\n*E\n"})
public final class WeightRecordsFragment extends BaseDetailsFragment<Weight> {

    @aa1
    private final Lazy bmiEvaluation$delegate;

    @aa1
    private final Lazy bmiValue$delegate;

    @aa1
    private final Lazy bodyFatScaleBt$delegate;

    @aa1
    private final Lazy changeBt$delegate;

    @aa1
    private final Lazy deleteBt$delegate;

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
    private final Lazy lineChart$delegate;

    @aa1
    private final AppUser mAppUser;

    @aa1
    private final Lazy mDeleteWeightPopup$delegate;

    @aa1
    private final Lazy mSbvBmi$delegate;

    @aa1
    private final Lazy mSetWeightPopup$delegate;

    @aa1
    private final TimePeriod mTimePeriod;

    @aa1
    private final WeightDao mWeightDao;
    private int nowSelectX;

    @aa1
    private final Lazy rootView$delegate;
    public LineDataSet setValue;
    private SimpleDateFormat timeFormat;

    @aa1
    private final List<Weight> tmpData;

    @aa1
    private final List<Entry> values;

    @aa1
    private List<by6> weekDay;

    @aa1
    private final Lazy weightUnit$delegate;

    public static final class OXO1 extends he6 {
        public final /* synthetic */ WeightRecordsFragment OXO1;

        public OXO1(WeightRecordsFragment r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.he6
        public String I0IIOi(float r3) {
            if (r3 != 0.0f) goto L7;
            return String.valueOf((int) r3);
        L7:
            if (WeightRecordsFragment.access$isImperial$p(this.OXO1) == false) goto L11;
            return ((int) r3) + WeightRecordsFragment.access$getMActivity(this.OXO1).getString(R.string.lbs);
        L11:
            return ((int) r3) + WeightRecordsFragment.access$getMActivity(this.OXO1).getString(R.string.kg);
        }
    }

    public static final class XIi00iiXO implements uf1 {
        public final /* synthetic */ WeightRecordsFragment OXO1;

        public XIi00iiXO(WeightRecordsFragment r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void OXO1(Entry r2, X110O r3) {
            Intrinsics.X0O(r2, "e");
            Intrinsics.X0O(r3, "h");
            if (WeightRecordsFragment.access$getMActivity(this.OXO1).isFinishing() == true) goto L6;
            this.OXO1.updateItemData(r2);
            return;
        }

        @Override // com.android.mltcode.paycertificationapi.uf1
        public void XIi00iiXO() {
        }
    }

    public WeightRecordsFragment() {
        this.lineChart$delegate = LazyKt__LazyJVMKt.iO(new l07(this));
        this.changeBt$delegate = LazyKt__LazyJVMKt.iO(new f17(this));
        this.bodyFatScaleBt$delegate = LazyKt__LazyJVMKt.iO(new g17(this));
        this.deleteBt$delegate = LazyKt__LazyJVMKt.iO(new h17(this));
        this.bmiValue$delegate = LazyKt__LazyJVMKt.iO(new m07(this));
        this.bmiEvaluation$delegate = LazyKt__LazyJVMKt.iO(new n07(this));
        this.mSbvBmi$delegate = LazyKt__LazyJVMKt.iO(new o07(this));
        this.weightUnit$delegate = LazyKt__LazyJVMKt.iO(new p07(this));
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new q07(this));
        this.values = new ArrayList();
        this.tmpData = new ArrayList();
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mAppUser = (AppUser) r2;
        this.mWeightDao = MyDb.INSTANCE.getMDatabase().weightDao();
        this.weekDay = O0X11OiO.IXXOO(getMCalendar().getTimeInMillis());
        this.healthLayout$delegate = LazyKt__LazyJVMKt.iO(new r07(this));
        this.healthBtn$delegate = LazyKt__LazyJVMKt.iO(new w07(this));
        this.healthTv$delegate = LazyKt__LazyJVMKt.iO(new a17(this));
        this.healthTipLayout$delegate = LazyKt__LazyJVMKt.iO(new b17(this));
        this.healthQuestions$delegate = LazyKt__LazyJVMKt.iO(new c17(this));
        this.mSetWeightPopup$delegate = LazyKt__LazyJVMKt.iO(new d17(this));
        this.mDeleteWeightPopup$delegate = LazyKt__LazyJVMKt.iO(new e17(this));
        this.mTimePeriod = TimePeriod.DAY;
    }

    public static /* synthetic */ PFMedium I1(WeightRecordsFragment r0) {
        return bmiValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageButton I1XOi1(WeightRecordsFragment r0) {
        return bodyFatScaleBt_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium II1Xi0(WeightRecordsFragment r0) {
        return healthTv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium IIX1OXO(WeightRecordsFragment r0) {
        return bmiEvaluation_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium IXXOO(WeightRecordsFragment r0) {
        return healthQuestions_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout O10IXXX0X(WeightRecordsFragment r0) {
        return healthLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void O1O(WeightRecordsFragment r0, View r1) {
        initView$lambda$2(r0, r1);
    }

    public static /* synthetic */ boolean OII(WeightRecordsFragment r0, float r1) {
        return mSetWeightPopup_delegate$lambda$0$0$0(r0, r1);
    }

    public static /* synthetic */ go0 OX(WeightRecordsFragment r0) {
        return mDeleteWeightPopup_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OiIIX101O(WeightRecordsFragment r0) {
        updateChartData$lambda$0(r0);
    }

    public static /* synthetic */ CircleThumbSegmentedBarView X01IiOiIi(WeightRecordsFragment r0) {
        return mSbvBmi_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout X0O(WeightRecordsFragment r0) {
        return healthTipLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean X1ii(WeightRecordsFragment r0) {
        return mDeleteWeightPopup_delegate$lambda$0$0$1(r0);
    }

    public static /* synthetic */ PFMedium XX0(WeightRecordsFragment r0) {
        return weightUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ j07 XXI(WeightRecordsFragment r0) {
        return mSetWeightPopup_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button XXIIO1i11(WeightRecordsFragment r0) {
        return healthBtn_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LineChart XiOIO(WeightRecordsFragment r0) {
        return lineChart_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageButton XiOIii1(WeightRecordsFragment r0) {
        return changeBt_delegate$lambda$0(r0);
    }

    public static final /* synthetic */ Activity access$getMActivity(WeightRecordsFragment r0) {
        return r0.getMActivity();
    }

    public static final /* synthetic */ boolean access$isImperial$p(WeightRecordsFragment r0) {
        return r0.isImperial;
    }

    private static final PFMedium bmiEvaluation_delegate$lambda$0(WeightRecordsFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.bmiEvaluation);
    }

    private static final PFMedium bmiValue_delegate$lambda$0(WeightRecordsFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.bmiValue);
    }

    private static final ImageButton bodyFatScaleBt_delegate$lambda$0(WeightRecordsFragment r1) {
        return (ImageButton) r1.getMView().findViewById(R.id.bodyFatScaleBt);
    }

    private static final ImageButton changeBt_delegate$lambda$0(WeightRecordsFragment r1) {
        return (ImageButton) r1.getMView().findViewById(R.id.changeBt);
    }

    private static final ImageButton deleteBt_delegate$lambda$0(WeightRecordsFragment r1) {
        return (ImageButton) r1.getMView().findViewById(R.id.deleteBt);
    }

    private final void filterData(List<Weight> r20) {
        this.values.clear();
        this.tmpData.clear();
        LinkedHashMap r2 = new LinkedHashMap();
        Iterator<T> r1 = r20.iterator();
    L4:
        if (r1.hasNext() == false) goto L9;
        Object r3 = r1.next();
        String r4 = O0X11OiO.iiIOiX().format(Long.valueOf(((Weight) r3).getMTime()));
        Object r5 = r2.get(r4);
        if (r5 != null) goto L8;
        r5 = new ArrayList();
        r2.put(r4, r5);
    L8:
        ((List) r5).add(r3);
        goto L4
    L9:
        Iterator r6 = r2.entrySet().iterator();
    L11:
        if (r6.hasNext() == false) goto L13;
        this.tmpData.addAll(CollectionsKt___CollectionsKt.IiII0((List) ((Map.Entry) r6.next()).getValue(), 1));
        goto L11
    L13:
        Iterator<T> r7 = this.tmpData.iterator();
        int r8 = 0;
        int r9 = 0;
    L15:
        if (r7.hasNext() == false) goto L24;
        int r10 = r9 + 1;
        Weight r11 = (Weight) r7.next();
        if (this.isImperial == false) goto L19;
        float r12 = l76.iO(r11.getMWeight());
    L21:
        if (r8 >= r11.getMWeight()) goto L23;
        r8 = (int) r12;
    L23:
        this.values.add(new Entry(r9, Float.parseFloat(cp5.iX1O1(r12, true))));
        r9 = r10;
        goto L15
    L19:
        r12 = r11.getMWeight();
        goto L21
    L24:
        iO1Xi1X1i r13 = iO1Xi1X1i.OXO1;
        YAxis r14 = getLineChart().getAxisLeft();
        Intrinsics.O10IXXX0X(r14, "getAxisLeft(...)");
        YAxis r15 = getLineChart().getAxisRight();
        Intrinsics.O10IXXX0X(r15, "getAxisRight(...)");
        r13.IiI10X(r14, r15, r8);
        setXAxis();
        updateChartData(this.values);
        if (r20.isEmpty() == true) goto L45;
        Weight r16 = (Weight) CollectionsKt___CollectionsKt.Xi1XO00(r20);
        if (r16.getMWeight() != 0.0f) goto L32;
        Button r17 = getHealthBtn();
        if (r17 == null) goto L46;
        r17.setEnabled(false);
        return;
    L46:
        return;
    L32:
        String r18 = r16.getMWeight() + getString(R.string.kg) + I000IiI1O.iO.XO0O10 + getString(R.string.bmi) + CertificateUtil.DELIMITER + cp5.I0IIOi(r16.getMWeight(), this.mAppUser.getHeight());
        HeathReportsUtils r19 = HeathReportsUtils.OXO1;
        long r21 = r16.getMTime();
        Button r22 = getHealthBtn();
        Intrinsics.O10IXXX0X(r22, "<get-healthBtn>(...)");
        PFMedium r23 = getHealthTv();
        Intrinsics.O10IXXX0X(r23, "<get-healthTv>(...)");
        LinearLayout r24 = getHealthTipLayout();
        Intrinsics.O10IXXX0X(r24, "<get-healthTipLayout>(...)");
        PFMedium r110 = getHealthQuestions();
        Intrinsics.O10IXXX0X(r110, "<get-healthQuestions>(...)");
        r19.X1("weight", r21, r22, r23, r24, r110, getMActivity());
        i72 r25 = i72.OXO1;
        boolean r26 = r25.I0i0();
        if (r25.OIIOI() == false) goto L35;
        boolean r111 = false;
    L36:
        LinearLayout r27 = getHealthLayout();
        Intrinsics.O10IXXX0X(r27, "<get-healthLayout>(...)");
        Button r112 = getHealthBtn();
        Intrinsics.O10IXXX0X(r112, "<get-healthBtn>(...)");
        PFMedium r113 = getHealthTv();
        Intrinsics.O10IXXX0X(r113, "<get-healthTv>(...)");
        r19.iOiXi11II(r27, r112, r113, getMActivity(), "weight", r18, r16.getMTime(), "", r111);
        return;
    L35:
        r111 = r26;
        goto L36
    }

    private final PFMedium getBmiEvaluation() {
        return (PFMedium) getValue();
    }

    private final PFMedium getBmiValue() {
        return (PFMedium) getValue();
    }

    private final ImageButton getBodyFatScaleBt() {
        return (ImageButton) getValue();
    }

    private final ImageButton getChangeBt() {
        return (ImageButton) getValue();
    }

    private final ImageButton getDeleteBt() {
        return (ImageButton) getValue();
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

    private final LineChart getLineChart() {
        return (LineChart) getValue();
    }

    private final go0 getMDeleteWeightPopup() {
        return (go0) getValue();
    }

    private final CircleThumbSegmentedBarView getMSbvBmi() {
        return (CircleThumbSegmentedBarView) getValue();
    }

    private final j07 getMSetWeightPopup() {
        return (j07) getValue();
    }

    private final View getRootView() {
        return (View) getValue();
    }

    private final PFMedium getWeightUnit() {
        return (PFMedium) getValue();
    }

    private static final Button healthBtn_delegate$lambda$0(WeightRecordsFragment r1) {
        return (Button) r1.getMView().findViewById(R.id.btn_common_heathy);
    }

    private static final LinearLayout healthLayout_delegate$lambda$0(WeightRecordsFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.item_health_btn_layout);
    }

    private static final PFMedium healthQuestions_delegate$lambda$0(WeightRecordsFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.tv_common_healthy_questions);
    }

    private static final LinearLayout healthTipLayout_delegate$lambda$0(WeightRecordsFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.questions_healthy_tip_layout);
    }

    private static final PFMedium healthTv_delegate$lambda$0(WeightRecordsFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.tv_common_heathy);
    }

    public static /* synthetic */ void i010I(WeightRecordsFragment r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ ImageButton iIiiO(WeightRecordsFragment r0) {
        return deleteBt_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View iOO1ii1(WeightRecordsFragment r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void iOOX010X(WeightRecordsFragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ boolean iX() {
        return mDeleteWeightPopup_delegate$lambda$0$0$0();
    }

    private static final void initView$lambda$0(WeightRecordsFragment r2, View r3) {
        RelativeLayout r4 = r2.getLoading();
        Intrinsics.O10IXXX0X(r4, "<get-loading>(...)");
        if (r4.getVisibility() != 0) goto L5;
        return;
    L5:
        j07 r5 = r2.getMSetWeightPopup();
        ImageButton r0 = r2.getChangeBt();
        Intrinsics.O10IXXX0X(r0, "<get-changeBt>(...)");
        r5.I1XOi1(r0);
        j07 r6 = r2.getMSetWeightPopup();
        if (r2.mAppUser.getWeight() != 0.0f) goto L8;
        float r7 = 65.0f;
    L9:
        r6.IXXOO(r7);
        return;
    L8:
        r7 = r2.mAppUser.getWeight();
        goto L9
    }

    private static final void initView$lambda$1(WeightRecordsFragment r2, View r3) {
        r2.startActivity(new Intent(r2.getActivity(), BodyFatScaleActivity.class));
    }

    private static final void initView$lambda$2(WeightRecordsFragment r1, View r2) {
        RelativeLayout r3 = r1.getLoading();
        Intrinsics.O10IXXX0X(r3, "<get-loading>(...)");
        if (r3.getVisibility() != 0) goto L6;
        return;
    L6:
        if (r1.tmpData.size() <= 0) goto L9;
        go0 r4 = r1.getMDeleteWeightPopup();
        ImageButton r5 = r1.getDeleteBt();
        Intrinsics.O10IXXX0X(r5, "<get-deleteBt>(...)");
        r4.I1XOi1(r5);
        return;
    }

    private static final LineChart lineChart_delegate$lambda$0(WeightRecordsFragment r1) {
        return (LineChart) r1.getMView().findViewById(R.id.lineChart);
    }

    private static final go0 mDeleteWeightPopup_delegate$lambda$0(final WeightRecordsFragment r5) {
        int r4 = 0;
        go0 r0 = new go0(r5.getMActivity(), r4, 2, null);
        r0.O1O(R.string.delete_record_remind);
        r0.iX1O1(Integer.valueOf(R.string.cancel), new y07());
        r0.X1IX(R.string.delete, new z07(r5));
        return r0;
    }

    private static final boolean mDeleteWeightPopup_delegate$lambda$0$0$0() {
        return true;
    }

    private static final boolean mDeleteWeightPopup_delegate$lambda$0$0$1(WeightRecordsFragment r5) {
        r5.getNowValue().setText(R.string.data_none);
        r5.getBmiValue().setText(R.string.data_none);
        r5.getBmiEvaluation().setText(R.string.data_none);
        Weight r0 = r5.tmpData.get(r5.nowSelectX);
        r0.setMIsSync(0);
        r0.setMIsDelete(1);
        r5.mWeightDao.update(CollectionsKt__CollectionsKt.Ii1iii0(new Weight[]{r0}));
        r5.tmpData.remove(r5.nowSelectX);
        I01XX0.XIi00iiXO(I01XX0.IiI10X, null, 2, null);
        r5.setBmi(0.0d);
        r5.update(r5.getMCalendar(), 0, r5.getMTimePeriod());
        return true;
    }

    private static final CircleThumbSegmentedBarView mSbvBmi_delegate$lambda$0(WeightRecordsFragment r1) {
        return (CircleThumbSegmentedBarView) r1.getMView().findViewById(R.id.sbv_bmi);
    }

    private static final j07 mSetWeightPopup_delegate$lambda$0(final WeightRecordsFragment r3) {
        j07 r0 = new j07(r3.getMActivity());
        r0.i010I(R.string.remember_weight);
        r0.iX(r3.mAppUser.getUnit());
        if (r3.tmpData.size() <= 0) goto L5;
        List<Weight> r1 = r3.tmpData;
        r0.IXXOO(r1.get(r1.size() - 1).getMWeight());
    L6:
        r0.II1Xi0(new s07(r3));
        return r0;
    L5:
        r0.IXXOO(20.0f);
        goto L6
    }

    private static final boolean mSetWeightPopup_delegate$lambda$0$0$0(WeightRecordsFragment r89, float r90) {
        ArrayList r2 = new ArrayList();
        i1O0OXO1O.OXO1.OXO1("WeightRecordsFragment " + r90);
        if (r90 >= 20.0f) goto L5;
        ToastUtils.showLong(R.string.weight_set_error);
        return true;
    L5:
        r89.mAppUser.setWeight(r90);
        a01.OXO1.IiI10X().put(AppUser.class.getName(), new Gson().toJson(r89.mAppUser));
        Weight r6 = new Weight(0, 0, null, 0.0f, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 0.0d, null, 0.0d, null, null, 0.0d, null, 0.0d, null, null, 0.0d, 0.0d, null, null, null, 0.0d, null, 0.0d, null, 0.0d, null, null, 0.0d, null, 0, 0, 0, -1, 2097151, null);
        r6.setMTime(O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null)[0]);
        String r3 = TimeUtils.millis2String(System.currentTimeMillis(), O0X11OiO.XO0O10());
        Intrinsics.O10IXXX0X(r3, "millis2String(...)");
        r6.setMLocalTime(r3);
        r6.setMWeight(r90);
        r2.add(r6);
        r89.mWeightDao.insert(r2);
        if (q62.OXO1.iIIX0XI() == false) goto L8;
        HykyManager.Companion.getInstance().uploadDataWeight(r6);
    L8:
        I01XX0.XIi00iiXO(I01XX0.IiI10X, null, 2, null);
        r89.update(r89.getMCalendar(), 0, r89.getMTimePeriod());
        r89.uploadAppUserUpdate();
        return true;
    }

    private static final View rootView_delegate$lambda$0(WeightRecordsFragment r1) {
        return r1.getMView().findViewById(R.id.root_view);
    }

    private final void setBmi(double r10) {
        CircleThumbSegmentedBarView r0 = getMSbvBmi();     // Catch: Exception -> L4
        Intrinsics.O10IXXX0X(r0, "<get-mSbvBmi>(...)");     // Catch: Exception -> L4
        List r3 = CollectionsKt__CollectionsKt.iXiX011(new Double[]{Double.valueOf(0.0d), Double.valueOf(18.4d), Double.valueOf(24.9d), Double.valueOf(29.9d), Double.valueOf(34.9d)});     // Catch: Exception -> L4
        String[] r4 = getResources().getStringArray(R.array.level_range_4_2_bmi);     // Catch: Exception -> L4
        Intrinsics.O10IXXX0X(r4, "getStringArray(...)");     // Catch: Exception -> L4
        int[] r5 = getResources().getIntArray(R.array.level_color_4_2);     // Catch: Exception -> L4
        Intrinsics.O10IXXX0X(r5, "getIntArray(...)");     // Catch: Exception -> L4
        WeightMeasureDataKt.setBarView$default(r0, r10, r3, r4, r5, false, 32, null);     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        e.printStackTrace();
    }

    private final void setXAxis() {
        XAxis r0 = getLineChart().getXAxis();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type com.github.mikephil.charting.components.XAxis");
        ArrayList r1 = new ArrayList();
        Iterator<Weight> r2 = this.tmpData.iterator();
    L4:
        if (r2.hasNext() == false) goto L9;
        long r3 = r2.next().getMTime();
        SimpleDateFormat r5 = this.timeFormat;
        if (r5 != null) goto L8;
        Intrinsics.XXO("timeFormat");
        r5 = null;
    L8:
        String r4 = TimeUtils.millis2String(r3, r5);
        Intrinsics.O10IXXX0X(r4, "millis2String(...)");
        r1.add(r4);
        goto L4
    L9:
        r0.Oi(new q4(r1));
        r0.IXOIIIO(1.0f);
        r0.i0X000X0O(-0.05f);
        r0.iOiXi11II(this.tmpData.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateChartData(List<Entry> r6) {
        if (getLineChart().getData() != 0) goto L5;
    L7:
        setSetValue(new LineDataSet(r6, "Weight Data"));
        getSetValue().II1(ContextCompat.getColor(getMActivity(), R.color.weight_show_1));
        getSetValue().I00(ContextCompat.getColor(getMActivity(), R.color.weight_show_1));
        getSetValue().I1XII0X(1.5f);
        getSetValue().iXOII(3.5f);
        getSetValue().XX00XX(2.0f);
        getSetValue().IIX(ContextCompat.getColor(getMActivity(), R.color.weight_show_0));
        getSetValue().IOI0i0I(true);
        getSetValue().XXI(false);
        co r1 = new co(new IiXO1XOi[]{getSetValue()});
        r1.iI(false);
        getLineChart().setData(r1);
        getLineChart().iiII(r6.size() / 3.0f, 1.0f, 0.0f, 0.0f);
        long r0 = 1000;
    L8:
        getLineChart().invalidate();
        getLineChart().I0IIOi((int) r0);
        getLineChart().Xi1i0XOX0(((co) getLineChart().getData()).IIX1OXO());
        new Handler().postDelayed(new t07(this), r0 + 100);
        return;
    L5:
        if (((co) getLineChart().getData()).XXI() <= 0) goto L7;
        T r2 = ((co) getLineChart().getData()).OIX0iXi(0);
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
        setSetValue((LineDataSet) r2);
        getSetValue().IOX1(r6);
        getSetValue().i0X1iIO();
        ((co) getLineChart().getData()).iX();
        getLineChart().X0i1O();
        r0 = 200;
        goto L8
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void updateChartData$lambda$0(WeightRecordsFragment r2) {
        r2.getLineChart().II1Xi0(((co) r2.getLineChart().getData()).IIX1OXO(), 0);
    }

    private final void uploadAppUserUpdate() {
        if (a01.OXO1.IiI10X().getBoolean(b01.O001I, true) == true) goto L5;
        return;
    L5:
        if (this.mAppUser.getIdentity().length() > 0) goto L7;
        return;
    L7:
        if (this.mAppUser.getHeight() == 0.0f) goto L9;
    L12:
        this.mAppUser.setThirdPlatform(null);
        NetWorkUtils r0 = NetWorkUtils.INSTANCE;
        File r1 = uz0.I0IIOi(sz0.OXO1);
        AppUser r3 = this.mAppUser;
        final O1XIiIO<AppUser> r4 = new AnonymousClass1();
        final Activity r5 = getMActivity();
        final uq r2 = r0.loadPopup(r5, getRootView());
        NetWork r6 = NetWork.OXO1;
        String r7 = Api.INSTANCE.getBASE_URL() + AppUserUpdate.URL;
        final O1XIiIO<Response<AppUser>> r8 = new WeightRecordsFragment$uploadAppUserUpdate$$inlined$upload$1(r5, r4, r2);
        ANRequest.MultiPartBuilder r9 = AndroidNetworking.upload(r7);
        if (r1.exists() == false) goto L15;
        r9.addMultipartFile("avatar", r1);
    L15:
        r9.addMultipartParameter(r3).setTag(r7).setPriority(Priority.HIGH).build().setUploadProgressListener(NetWorkUtils$upload$$inlined$upload$1.INSTANCE).getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{AppUser.class}), new WeightRecordsFragment$uploadAppUserUpdate$$inlined$upload$2(r8));
        return;
    L9:
        if (this.mAppUser.getWeight() != 0.0f) goto L12;
        ToastUtils.showLong(R.string.user_does_not_exist);
    }

    private static final PFMedium weightUnit_delegate$lambda$0(WeightRecordsFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.weightUnit);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseStatusFragment
    @aa1
    public TimePeriod getMTimePeriod() {
        return this.mTimePeriod;
    }

    @aa1
    public final LineDataSet getSetValue() {
        LineDataSet r0 = this.setValue;
        if (r0 == null) goto L5;
        return r0;
    L5:
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

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        View r0 = getMView().findViewById(R.id.ll_bottom_tool);
        if (i72.OXO1.i0O() == false) goto L5;
        int r1 = 8;
    L6:
        r0.setVisibility(r1);
        getMSbvBmi().setVisibility(0);
        setBmi(0.0d);
        if (this.mAppUser.getUnit() != 1) goto L9;
        boolean r2 = true;
    L10:
        this.isImperial = r2;
        getWeightUnit().setText(cp5.iX(this.mAppUser.getUnit()));
        getChangeBt().setOnClickListener(new u07(this));
        getBodyFatScaleBt().setOnClickListener(new v07(this));
        getDeleteBt().setOnClickListener(new x07(this));
        iO1Xi1X1i r4 = iO1Xi1X1i.OXO1;
        LineChart r3 = getLineChart();
        Intrinsics.O10IXXX0X(r3, "<get-lineChart>(...)");
        r4.XIi00iiXO(r3);
        YAxis r5 = getLineChart().getAxisLeft();
        Intrinsics.O10IXXX0X(r5, "getAxisLeft(...)");
        YAxis r6 = getLineChart().getAxisRight();
        Intrinsics.O10IXXX0X(r6, "getAxisRight(...)");
        r4.OIX0iXi(r5, r6, 0.0f, 30.0f, ContextCompat.getColor(getMActivity(), R.color.line_color));
        LineChart r7 = getLineChart();
        r7.setDragEnabled(true);
        r7.getDescription().XOO0ii0(false);
        r7.getLegend().XOO0ii0(false);
        r7.setScaleEnabled(false);
        getLineChart().setExtraLeftOffset(20.0f);
        XAxis r8 = getLineChart().getXAxis();
        Intrinsics.X1ii(r8, "null cannot be cast to non-null type com.github.mikephil.charting.components.XAxis");
        r4.OIi0(r8, false, getMActivity());
        getLineChart().getAxisRight().Oi(new OXO1(this));
        O11X1i1 r9 = new O11X1i1(getLineChart(), getLineChart().getAnimator(), getLineChart().getViewPortHandler());
        r9.i010I(gk4.iO(getMActivity(), R.color.line_color));
        getLineChart().setRenderer(r9);
        getLineChart().setOnChartValueSelectedListener(new XIi00iiXO(this));
        this.timeFormat = O0X11OiO.XXX11i();
        super.initView();
        return;
    L9:
        r2 = false;
        goto L10
    L5:
        r1 = 0;
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_weight_record;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    public void onDataChange(@aa1 List<? extends Weight> r2) {
        Intrinsics.X0O(r2, "data");
        filterData(r2);
    }

    @Override // com.sma.smartv3.ui.status.base.BaseDetailsFragment
    @aa1
    public List<Weight> onTimePeriodChange(@aa1 Calendar r1, int r2, @aa1 TimePeriod r3) {
        Intrinsics.X0O(r1, "calendar");
        Intrinsics.X0O(r3, "timePeriod");
        return this.mWeightDao.getWeights();
    }

    @sf5(tag = I01XX0.IiI10X)
    public final void onWeightChanged(@aa1 Object r3) {
        Intrinsics.X0O(r3, "data");
        LogUtils.v(new Object[]{"onWeightChanged"});
        getNowValue().setText(R.string.data_none);
        getBmiValue().setText(R.string.data_none);
        getBmiEvaluation().setText(R.string.data_none);
        update(getMCalendar(), 0, getMTimePeriod());
    }

    @aa1
    public final String setDataLabel() {
        return "weight day Data";
    }

    public final void setSetValue(@aa1 LineDataSet r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.setValue = r2;
    }

    public final void setWeekDay(@aa1 List<by6> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.weekDay = r2;
    }

    @Override // com.sma.smartv3.ui.status.base.BaseStatusFragment
    public void share() {
        if (this.tmpData.size() <= 0) goto L6;
        super.share();
        return;
    L6:
        ToastUtils.showLong(R.string.weight_shape_tip);
    }

    public final void updateItemData(@aa1 Entry r10) {
        Intrinsics.X0O(r10, "e");
        this.nowSelectX = (int) r10.OIX0iXi();
        getNowValue().setText(String.valueOf(r10.O00()));
        getLineChart().iOiXi11II(r10.OIX0iXi(), r10.O00(), YAxis.AxisDependency.RIGHT, 500);
        Weight r11 = this.tmpData.get(this.nowSelectX);
        DINCondBold r0 = getNowTimeDetails();
        long r1 = r11.getMTime();
        SimpleDateFormat r3 = this.timeFormat;
        if (r3 != null) goto L5;
        Intrinsics.XXO("timeFormat");
        r3 = null;
    L5:
        r0.setText(TimeUtils.millis2String(r1, r3));
        if (r11.getMBmi() != 0.0d) goto L8;
        double r2 = Double.parseDouble(cp5.I0IIOi(r11.getMWeight(), this.mAppUser.getHeight()));
    L9:
        getBmiValue().setText(cp5.X11iII1O1((float) r2, false, 2, null));
        PFMedium r4 = getBmiEvaluation();
        if (r2 > 16.4d) goto L13;
        int r5 = R.string.very_thin;
    L28:
        r4.setText(r5);
        if (r11.getMWeight() != 0.0f) goto L32;
        setBmi(0.0d);
        return;
    L32:
        getMSbvBmi().setVisibility(0);
        setBmi(r2);
        return;
    L13:
        if (r2 > 18.4d) goto L16;
        r5 = R.string.thin;
        goto L28
    L16:
        if (r2 > 24.9d) goto L19;
        r5 = R.string.normal;
        goto L28
    L19:
        if (r2 > 29.9d) goto L22;
        r5 = R.string.too_heavy;
        goto L28
    L22:
        if (r2 > 34.9d) goto L25;
        r5 = R.string.class_1_obesity;
        goto L28
    L25:
        if (r2 > 39.0d) goto L27;
        r5 = R.string.class_2_obesity;
        goto L28
    L27:
        r5 = R.string.class_3_obesity;
        goto L28
    L8:
        r2 = r11.getMBmi();
        goto L9
    }
}
