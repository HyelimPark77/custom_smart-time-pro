package com.sma.smartv3.ui.status;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I1X0I;
import com.android.mltcode.paycertificationapi.IIOi1I1O;
import com.android.mltcode.paycertificationapi.IO0i0I1I0;
import com.android.mltcode.paycertificationapi.IiXO1XOi;
import com.android.mltcode.paycertificationapi.O0010;
import com.android.mltcode.paycertificationapi.O00IXi;
import com.android.mltcode.paycertificationapi.O01iOXi1;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O11X1i1;
import com.android.mltcode.paycertificationapi.O1IOIIO11;
import com.android.mltcode.paycertificationapi.OOXOi0OX;
import com.android.mltcode.paycertificationapi.OX000XOi;
import com.android.mltcode.paycertificationapi.XIOXO0;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.by6;
import com.android.mltcode.paycertificationapi.co;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iIii1X0;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
import com.android.mltcode.paycertificationapi.q4;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.UriUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.db.MyDb;
import com.sma.smartv3.db.dao.EnergyRatingDao;
import com.sma.smartv3.db.entity.EnergyRating;
import com.sma.smartv3.model.EnergyRatingDataKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.TimePeriod;
import com.sma.smartv3.view.AloneProgressBar;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nEnergyRatingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnergyRatingActivity.kt\ncom/sma/smartv3/ui/status/EnergyRatingActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n1969#2,14:322\n*S KotlinDebug\n*F\n+ 1 EnergyRatingActivity.kt\ncom/sma/smartv3/ui/status/EnergyRatingActivity\n*L\n122#1:322,14\n*E\n"})
public final class EnergyRatingActivity extends BaseActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleOtherRight$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;
    private ActivityResultLauncher<Intent> energyRatingLauncher;
    public List<EnergyRating> energyRatingList;

    @aa1
    private final Lazy lineChart$delegate;

    @aa1
    private final Lazy mAloneProgressBar$delegate;

    @aa1
    private final EnergyRatingDao mEnergyRatingDao;

    @aa1
    private final Lazy mScoreEvaluation$delegate;

    @aa1
    private final Lazy mScoreEvaluationTip$delegate;

    @aa1
    private final Lazy mScoreSuggestions$delegate;

    @aa1
    private final Lazy mScoreValue$delegate;
    public long[] range;

    @aa1
    private final Lazy rootView$delegate;

    @aa1
    private final List<Entry> values;

    @aa1
    private final LinkedHashMap<Long, ArrayList<EnergyRating>> weekData;

    public EnergyRatingActivity() {
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new iIii1X0(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new OOXOi0OX(this));
        this.abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.iO(new XIOXO0(this));
        this.mEnergyRatingDao = MyDb.INSTANCE.getMDatabase().energyRating();
        this.mAloneProgressBar$delegate = LazyKt__LazyJVMKt.iO(new O0010(this));
        this.rootView$delegate = LazyKt__LazyJVMKt.iO(new IIOi1I1O(this));
        this.mScoreValue$delegate = LazyKt__LazyJVMKt.iO(new O00IXi(this));
        this.mScoreEvaluation$delegate = LazyKt__LazyJVMKt.iO(new I1X0I(this));
        this.mScoreEvaluationTip$delegate = LazyKt__LazyJVMKt.iO(new O1IOIIO11(this));
        this.mScoreSuggestions$delegate = LazyKt__LazyJVMKt.iO(new O01iOXi1(this));
        this.weekData = new LinkedHashMap();
        this.values = new ArrayList();
        this.lineChart$delegate = LazyKt__LazyJVMKt.iO(new OX000XOi(this));
    }

    public static /* synthetic */ TextView I0iXXO(EnergyRatingActivity r0) {
        return mScoreSuggestions_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView I1XOi1(EnergyRatingActivity r0) {
        return mScoreEvaluation_delegate$lambda$0(r0);
    }

    public static /* synthetic */ AloneProgressBar IIX1OXO(EnergyRatingActivity r0) {
        return mAloneProgressBar_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void O10IXXX0X(EnergyRatingActivity r0, ActivityResult r1) {
        onCreate$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView OIX0iXi(EnergyRatingActivity r0) {
        return mScoreValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X0O(EnergyRatingActivity r0) {
        return mScoreEvaluationTip_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView X1ii(EnergyRatingActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XX0(EnergyRatingActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ScrollView XXI(EnergyRatingActivity r0) {
        return rootView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LineChart XiOIO(EnergyRatingActivity r0) {
        return lineChart_delegate$lambda$0(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(EnergyRatingActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleOtherRight_delegate$lambda$0(EnergyRatingActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_other_right);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(EnergyRatingActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    private final LineChart getLineChart() {
        return (LineChart) getValue();
    }

    private final String getScoreEvaluationText(int r3) {
        if (r3 != 0) goto L5;
        String r4 = getString(R.string.energy_score_ll_evaluation_0);
        Intrinsics.O10IXXX0X(r4, "getString(...)");
        return r4;
    L5:
        if (r3 != 1) goto L7;
        String r5 = getString(R.string.energy_score_ll_evaluation_1);
        Intrinsics.O10IXXX0X(r5, "getString(...)");
        return r5;
    L7:
        if (r3 != 2) goto L9;
        String r6 = getString(R.string.energy_score_ll_evaluation_2);
        Intrinsics.O10IXXX0X(r6, "getString(...)");
        return r6;
    L9:
        if (r3 != 3) goto L11;
        String r7 = getString(R.string.energy_score_ll_evaluation_3);
        Intrinsics.O10IXXX0X(r7, "getString(...)");
        return r7;
    L11:
        if (r3 == 4) goto L14;
        return HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
    L14:
        String r8 = getString(R.string.energy_score_ll_evaluation_4);
        Intrinsics.O10IXXX0X(r8, "getString(...)");
        return r8;
    }

    private final String getScoreEvaluationTip(int r3) {
        if (r3 != 0) goto L5;
        String r4 = getString(R.string.energy_score_ll_evaluation_0);
        Intrinsics.O10IXXX0X(r4, "getString(...)");
        return r4;
    L5:
        if (r3 != 1) goto L7;
        String r5 = getString(R.string.energy_score_ll_evaluation_1);
        Intrinsics.O10IXXX0X(r5, "getString(...)");
        return r5;
    L7:
        if (r3 != 2) goto L9;
        String r6 = getString(R.string.energy_score_ll_evaluation_2);
        Intrinsics.O10IXXX0X(r6, "getString(...)");
        return r6;
    L9:
        if (r3 != 3) goto L11;
        String r7 = getString(R.string.energy_score_ll_evaluation_3);
        Intrinsics.O10IXXX0X(r7, "getString(...)");
        return r7;
    L11:
        if (r3 == 4) goto L14;
        return HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
    L14:
        String r8 = getString(R.string.energy_score_ll_evaluation_4);
        Intrinsics.O10IXXX0X(r8, "getString(...)");
        return r8;
    }

    private final String getScoreSuggestions(int r3) {
        if (r3 != 0) goto L5;
        String r4 = getString(R.string.energy_score_ll_suggestions_0);
        Intrinsics.O10IXXX0X(r4, "getString(...)");
        return r4;
    L5:
        if (r3 != 1) goto L7;
        String r5 = getString(R.string.energy_score_ll_suggestions_1);
        Intrinsics.O10IXXX0X(r5, "getString(...)");
        return r5;
    L7:
        if (r3 != 2) goto L9;
        String r6 = getString(R.string.energy_score_ll_suggestions_2);
        Intrinsics.O10IXXX0X(r6, "getString(...)");
        return r6;
    L9:
        if (r3 != 3) goto L11;
        String r7 = getString(R.string.energy_score_ll_suggestions_3);
        Intrinsics.O10IXXX0X(r7, "getString(...)");
        return r7;
    L11:
        if (r3 == 4) goto L14;
        String r8 = getString(R.string.energy_score_ll_suggestions_none);
        Intrinsics.O10IXXX0X(r8, "getString(...)");
        return r8;
    L14:
        String r9 = getString(R.string.energy_score_ll_suggestions_4);
        Intrinsics.O10IXXX0X(r9, "getString(...)");
        return r9;
    }

    public static /* synthetic */ ImageView iIiiO(EnergyRatingActivity r0) {
        return abhTitleOtherRight_delegate$lambda$0(r0);
    }

    private final void initLineChart() {
        iO1Xi1X1i r0 = iO1Xi1X1i.OXO1;
        LineChart r1 = getLineChart();
        Intrinsics.O10IXXX0X(r1, "<get-lineChart>(...)");
        r0.XIi00iiXO(r1);
        YAxis r2 = getLineChart().getAxisLeft();
        Intrinsics.O10IXXX0X(r2, "getAxisLeft(...)");
        YAxis r3 = getLineChart().getAxisRight();
        Intrinsics.O10IXXX0X(r3, "getAxisRight(...)");
        r0.OIX0iXi(r2, r3, 200.0f, 0.0f, ContextCompat.getColor(this, R.color.line_color));
        getLineChart().getAxisLeft().X00Xi1X(false);
        getLineChart().getAxisRight().X00Xi1X(false);
        getLineChart().getAxisLeft().XOO0ii0(false);
        getLineChart().getAxisRight().XOO0ii0(false);
        Calendar r4 = Calendar.getInstance();
        Intrinsics.O10IXXX0X(r4, "getInstance(...)");
        List<by6> r5 = O0X11OiO.IXXOO(r4.getTimeInMillis());
        XAxis r6 = getLineChart().getXAxis();
        Intrinsics.XXI(r6);
        Context r7 = getLineChart().getContext();
        Intrinsics.O10IXXX0X(r7, "getContext(...)");
        r0.OIi0(r6, false, r7);
        r6.IO0II0i(true);
        r6.IXOIIIO(1.0f);
        r6.i0X000X0O(-1.0f);
        r6.iOiXi11II(7.0f);
        ArrayList r8 = new ArrayList();
        Iterator<by6> r9 = r5.iterator();
    L4:
        if (r9.hasNext() == false) goto L6;
        r8.add(r9.next().IiI10X());
        goto L4
    L6:
        r6.Oi(new q4(r8));
        LineChart r10 = getLineChart();
        r10.getDescription().XOO0ii0(false);
        r10.getLegend().XOO0ii0(false);
        r10.setScaleEnabled(false);
        O11X1i1 r11 = new O11X1i1(getLineChart(), getLineChart().getAnimator(), getLineChart().getViewPortHandler());
        r11.i010I(gk4.iO(this, R.color.line_color));
        getLineChart().setRenderer(r11);
    }

    private static final LineChart lineChart_delegate$lambda$0(EnergyRatingActivity r1) {
        return (LineChart) r1.findViewById(R.id.lineChart);
    }

    private static final AloneProgressBar mAloneProgressBar_delegate$lambda$0(EnergyRatingActivity r1) {
        return (AloneProgressBar) r1.findViewById(R.id.energy_rating_alone_bar);
    }

    private static final TextView mScoreEvaluationTip_delegate$lambda$0(EnergyRatingActivity r1) {
        return (TextView) r1.findViewById(R.id.energy_score_evaluation_tip);
    }

    private static final TextView mScoreEvaluation_delegate$lambda$0(EnergyRatingActivity r1) {
        return (TextView) r1.findViewById(R.id.energy_score_evaluation);
    }

    private static final TextView mScoreSuggestions_delegate$lambda$0(EnergyRatingActivity r1) {
        return (TextView) r1.findViewById(R.id.energy_score_today_suggestions);
    }

    private static final TextView mScoreValue_delegate$lambda$0(EnergyRatingActivity r1) {
        return (TextView) r1.findViewById(R.id.energy_score_value);
    }

    private static final void onCreate$lambda$0(EnergyRatingActivity r6, ActivityResult r7) {
        Intrinsics.X0O(r7, "result");
        if (r7.getResultCode() != (-1)) goto L20;
        Intent r8 = r7.getData();
        Long r0 = null;
        if (r8 == null) goto L7;
        Long r3 = Long.valueOf(r8.getLongExtra("startTime", 0));
    L8:
        if (r8 == null) goto L10;
        r0 = Long.valueOf(r8.getLongExtra(SDKConstants.PARAM_END_TIME, 0));
    L10:
        if (r3 != null) goto L13;
    L14:
        if (r0 != null) goto L17;
    L18:
        long[] r9 = r6.getRange();
        Intrinsics.XXI(r3);
        r9[0] = r3.longValue();
        long[] r10 = r6.getRange();
        Intrinsics.XXI(r0);
        r10[1] = r0.longValue();
        r6.setEnergyRatingList(r6.mEnergyRatingDao.getEnergyRating(r6.getRange()[0], r6.getRange()[1]));
        r6.setChartData();
        return;
    L17:
        if (r0.longValue() != 0) goto L18;
        return;
    L13:
        if (r3.longValue() != 0) goto L14;
        return;
    L7:
        r3 = null;
        goto L8
    }

    private final void openEnergyRatingRecord() {
        Intent r0 = new Intent(this, EnergyRatingRecordActivity.class);
        r0.putExtra("curTime", getRange()[0]);
        ActivityResultLauncher<Intent> r1 = this.energyRatingLauncher;
        if (r1 != null) goto L5;
        Intrinsics.XXO("energyRatingLauncher");
        r1 = null;
    L5:
        r1.launch(r0);
    }

    private static final ScrollView rootView_delegate$lambda$0(EnergyRatingActivity r1) {
        return (ScrollView) r1.findViewById(R.id.rootView);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    public final ImageView getAbhTitleOtherRight() {
        return (ImageView) getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    @aa1
    public final List<EnergyRating> getEnergyRatingList() {
        List<EnergyRating> r0 = this.energyRatingList;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("energyRatingList");
        return null;
    }

    public final AloneProgressBar getMAloneProgressBar() {
        return (AloneProgressBar) getValue();
    }

    public final TextView getMScoreEvaluation() {
        return (TextView) getValue();
    }

    public final TextView getMScoreEvaluationTip() {
        return (TextView) getValue();
    }

    public final TextView getMScoreSuggestions() {
        return (TextView) getValue();
    }

    public final TextView getMScoreValue() {
        return (TextView) getValue();
    }

    @aa1
    public final long[] getRange() {
        long[] r0 = this.range;
        if (r0 == null) goto L5;
        return r0;
    L5:
        Intrinsics.XXO("range");
        return null;
    }

    public final ScrollView getRootView() {
        return (ScrollView) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r6) {
        setRange(O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null));
        setEnergyRatingList(this.mEnergyRatingDao.getEnergyRating(getRange()[0], getRange()[1]));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        getAbhTitleCenter().setText(getString(R.string.status_body_energy));
        getAbhTitleRight().setImageResource(R.drawable.energy_rating_share_icon);
        getAbhTitleRight().setVisibility(0);
        getAbhTitleOtherRight().setVisibility(0);
        getAbhTitleOtherRight().setImageResource(R.drawable.energy_rating_calendar_icon);
        initLineChart();
        setChartData();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_energy_rating;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle r2) {
        super.onCreate(r2);
        this.energyRatingLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new IO0i0I1I0(this));
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r5) {
        Intrinsics.X0O(r5, "view");
        Bitmap r6 = Bitmap.createBitmap(getRootView().getWidth(), getRootView().getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(r6, "createBitmap(...)");
        Canvas r0 = new Canvas(r6);
        r0.drawColor(gk4.iO(this, R.color.view_page_main_bg));
        XIi1i01O r1 = XIi1i01O.OXO1;
        ScrollView r2 = getRootView();
        Intrinsics.O10IXXX0X(r2, "<get-rootView>(...)");
        r0.drawBitmap(r1.XIi00iiXO(r2), 0.0f, 0.0f, null);
        sz0 r3 = sz0.OXO1;
        ImageUtils.save(r6, uz0.XOX0O0(r3), Bitmap.CompressFormat.JPEG);
        Intent r7 = new Intent("android.intent.action.SEND");
        r7.putExtra("android.intent.extra.TEXT", "");
        r7.putExtra("android.intent.extra.STREAM", UriUtils.file2Uri(uz0.XOX0O0(r3)));
        r7.setType("image/*");
        Intent r8 = Intent.createChooser(r7, "");
        Intrinsics.O10IXXX0X(r8, "createChooser(...)");
        r8.addFlags(268435456);
        startActivity(r8);
    }

    public final void onTitleRightOtherClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        openEnergyRatingRecord();
    }

    public final void setChartData() {
        if (getEnergyRatingList().isEmpty() == true) goto L18;
        Iterator<T> r0 = getEnergyRatingList().iterator();
        if (r0.hasNext() == false) goto L17;
        Object r4 = r0.next();
        if (r0.hasNext() == false) goto L15;
        int r5 = ((EnergyRating) r4).getMScore();
    L10:
        Object r6 = r0.next();
        int r7 = ((EnergyRating) r6).getMScore();
        if (r5 >= r7) goto L14;
        r4 = r6;
        r5 = r7;
    L14:
        if (r0.hasNext() == true) goto L10;
    L15:
        EnergyRating r8 = (EnergyRating) r4;
        getMAloneProgressBar().setProgressSelectedBgColor(EnergyRatingDataKt.getEnergyRatingColorLevel(this).get(EnergyRatingDataKt.getEnergyRatingLevel(r8.getMScore())).intValue());
        getMAloneProgressBar().iO(r8.getMScore(), 15);
        getMScoreValue().setText(getString(R.string.energy_score_ll_value, new Object[]{Integer.valueOf(r8.getMScore())}));
        int r1 = EnergyRatingDataKt.getEnergyRatingLevel(r8.getMScore());
        getMScoreEvaluation().setText(getScoreEvaluationText(r1));
        getMScoreEvaluationTip().setText(getScoreEvaluationTip(r1));
        getMScoreSuggestions().setText(getScoreSuggestions(r1));
    L19:
        Calendar r2 = Calendar.getInstance();
        Intrinsics.O10IXXX0X(r2, "getInstance(...)");
        long[] r3 = O0X11OiO.iOOX010X(r2, TimePeriod.WEEK, 0, 4, null);
        int r9 = 1;
        List<EnergyRating> r10 = this.mEnergyRatingDao.getEnergyRating(r3[0], r3[1]);
        this.weekData.clear();
    L20:
        if (r9 >= 8) goto L22;
        this.weekData.put(Long.valueOf(r3[0] + (((long) (86400 * r9)) * 1000)), new ArrayList());
        r9 = r9 + 1;
        goto L20
    L22:
        EnergyRatingDataKt.filterEnergyRatingDayData(r10, this.weekData, this.values);
        updateChartData(this.values);
        return;
    L17:
        throw new NoSuchElementException();
    L18:
        getMAloneProgressBar().iO(0, 15);
        getMScoreValue().setVisibility(8);
        getMScoreEvaluation().setVisibility(8);
        getMScoreEvaluationTip().setVisibility(8);
        getMScoreSuggestions().setText(getString(R.string.energy_score_ll_suggestions_null));
        goto L19
    }

    public final void setEnergyRatingList(@aa1 List<EnergyRating> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.energyRatingList = r2;
    }

    public final void setRange(@aa1 long[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.range = r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateChartData(@aa1 List<Entry> r5) {
        Intrinsics.X0O(r5, "values");
        if (getLineChart().getData() != 0) goto L5;
    L7:
        LineDataSet r1 = new LineDataSet(r5, "EnergyRatingActivity");
        r1.II1(ContextCompat.getColor(this, R.color.blue));
        r1.I00(ContextCompat.getColor(this, R.color.blue));
        r1.I00(ContextCompat.getColor(getMContext(), R.color.blue));
        r1.OXOO0X0i(true);
        r1.I1XII0X(2.0f);
        r1.iXOII(1.0f);
        r1.IOI0i0I(false);
        r1.XXI(false);
        r1.O1iXiI(true);
        co r6 = new co(new IiXO1XOi[]{r1});
        r6.iI(false);
        getLineChart().setData(r6);
    L8:
        getLineChart().I0IIOi(1000);
        getLineChart().invalidate();
        return;
    L5:
        if (((co) getLineChart().getData()).XXI() <= 0) goto L7;
        T r0 = ((co) getLineChart().getData()).OIX0iXi(0);
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
        LineDataSet r2 = (LineDataSet) r0;
        r2.IOX1(r5);
        r2.i0X1iIO();
        ((co) getLineChart().getData()).iX();
        getLineChart().X0i1O();
        goto L8
    }
}
