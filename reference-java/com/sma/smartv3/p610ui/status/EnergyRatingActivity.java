package com.sma.smartv3.p610ui.status;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.C2305co;
import com.android.mltcode.paycertificationapi.C2829q4;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O11X1i1;
import com.android.mltcode.paycertificationapi.XIi1i01O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.by6;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iO1Xi1X1i;
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
import com.sma.smartv3.model.EnergyRatingDataKt;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.dao.EnergyRatingDao;
import com.sma.smartv3.p608db.entity.EnergyRating;
import com.sma.smartv3.p610ui.status.EnergyRatingActivity;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nEnergyRatingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnergyRatingActivity.kt\ncom/sma/smartv3/ui/status/EnergyRatingActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n1969#2,14:322\n*S KotlinDebug\n*F\n+ 1 EnergyRatingActivity.kt\ncom/sma/smartv3/ui/status/EnergyRatingActivity\n*L\n122#1:322,14\n*E\n"})
public final class EnergyRatingActivity extends BaseActivity {
    private ActivityResultLauncher<Intent> energyRatingLauncher;
    public List<EnergyRating> energyRatingList;
    public long[] range;

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iIii1X0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EnergyRatingActivity.abhTitleCenter_delegate$lambda$0(this.f7961IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOXOi0OX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EnergyRatingActivity.abhTitleRight_delegate$lambda$0(this.f3339IO);
        }
    });

    @aa1
    private final Lazy abhTitleOtherRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XIOXO0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EnergyRatingActivity.abhTitleOtherRight_delegate$lambda$0(this.f4564IO);
        }
    });

    @aa1
    private final EnergyRatingDao mEnergyRatingDao = MyDb.INSTANCE.getMDatabase().energyRating();

    @aa1
    private final Lazy mAloneProgressBar$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O0010
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EnergyRatingActivity.mAloneProgressBar_delegate$lambda$0(this.f2355IO);
        }
    });

    @aa1
    private final Lazy rootView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IIOi1I1O
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EnergyRatingActivity.rootView_delegate$lambda$0(this.f1633IO);
        }
    });

    @aa1
    private final Lazy mScoreValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O00IXi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EnergyRatingActivity.mScoreValue_delegate$lambda$0(this.f2365IO);
        }
    });

    @aa1
    private final Lazy mScoreEvaluation$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1X0I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EnergyRatingActivity.mScoreEvaluation_delegate$lambda$0(this.f1438IO);
        }
    });

    @aa1
    private final Lazy mScoreEvaluationTip$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O1IOIIO11
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EnergyRatingActivity.mScoreEvaluationTip_delegate$lambda$0(this.f2706IO);
        }
    });

    @aa1
    private final Lazy mScoreSuggestions$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O01iOXi1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EnergyRatingActivity.mScoreSuggestions_delegate$lambda$0(this.f2425IO);
        }
    });

    @aa1
    private final LinkedHashMap<Long, ArrayList<EnergyRating>> weekData = new LinkedHashMap<>();

    @aa1
    private final List<Entry> values = new ArrayList();

    @aa1
    private final Lazy lineChart$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OX000XOi
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return EnergyRatingActivity.lineChart_delegate$lambda$0(this.f3388IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(EnergyRatingActivity energyRatingActivity) {
        return (PFMedium) energyRatingActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleOtherRight_delegate$lambda$0(EnergyRatingActivity energyRatingActivity) {
        return (ImageView) energyRatingActivity.findViewById(R.id.abh_title_other_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(EnergyRatingActivity energyRatingActivity) {
        return (ImageView) energyRatingActivity.findViewById(R.id.abh_title_right);
    }

    private final LineChart getLineChart() {
        return (LineChart) this.lineChart$delegate.getValue();
    }

    private final String getScoreEvaluationText(int i) {
        if (i == 0) {
            String string = getString(R.string.energy_score_ll_evaluation_0);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            return string;
        }
        if (i == 1) {
            String string2 = getString(R.string.energy_score_ll_evaluation_1);
            Intrinsics.O10IXXX0X(string2, "getString(...)");
            return string2;
        }
        if (i == 2) {
            String string3 = getString(R.string.energy_score_ll_evaluation_2);
            Intrinsics.O10IXXX0X(string3, "getString(...)");
            return string3;
        }
        if (i == 3) {
            String string4 = getString(R.string.energy_score_ll_evaluation_3);
            Intrinsics.O10IXXX0X(string4, "getString(...)");
            return string4;
        }
        if (i != 4) {
            return HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
        }
        String string5 = getString(R.string.energy_score_ll_evaluation_4);
        Intrinsics.O10IXXX0X(string5, "getString(...)");
        return string5;
    }

    private final String getScoreEvaluationTip(int i) {
        if (i == 0) {
            String string = getString(R.string.energy_score_ll_evaluation_0);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            return string;
        }
        if (i == 1) {
            String string2 = getString(R.string.energy_score_ll_evaluation_1);
            Intrinsics.O10IXXX0X(string2, "getString(...)");
            return string2;
        }
        if (i == 2) {
            String string3 = getString(R.string.energy_score_ll_evaluation_2);
            Intrinsics.O10IXXX0X(string3, "getString(...)");
            return string3;
        }
        if (i == 3) {
            String string4 = getString(R.string.energy_score_ll_evaluation_3);
            Intrinsics.O10IXXX0X(string4, "getString(...)");
            return string4;
        }
        if (i != 4) {
            return HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
        }
        String string5 = getString(R.string.energy_score_ll_evaluation_4);
        Intrinsics.O10IXXX0X(string5, "getString(...)");
        return string5;
    }

    private final String getScoreSuggestions(int i) {
        if (i == 0) {
            String string = getString(R.string.energy_score_ll_suggestions_0);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            return string;
        }
        if (i == 1) {
            String string2 = getString(R.string.energy_score_ll_suggestions_1);
            Intrinsics.O10IXXX0X(string2, "getString(...)");
            return string2;
        }
        if (i == 2) {
            String string3 = getString(R.string.energy_score_ll_suggestions_2);
            Intrinsics.O10IXXX0X(string3, "getString(...)");
            return string3;
        }
        if (i == 3) {
            String string4 = getString(R.string.energy_score_ll_suggestions_3);
            Intrinsics.O10IXXX0X(string4, "getString(...)");
            return string4;
        }
        if (i != 4) {
            String string5 = getString(R.string.energy_score_ll_suggestions_none);
            Intrinsics.O10IXXX0X(string5, "getString(...)");
            return string5;
        }
        String string6 = getString(R.string.energy_score_ll_suggestions_4);
        Intrinsics.O10IXXX0X(string6, "getString(...)");
        return string6;
    }

    private final void initLineChart() {
        iO1Xi1X1i io1xi1x1i = iO1Xi1X1i.OXO1;
        LineChart lineChart = getLineChart();
        Intrinsics.O10IXXX0X(lineChart, "<get-lineChart>(...)");
        io1xi1x1i.XIi00iiXO(lineChart);
        YAxis axisLeft = getLineChart().getAxisLeft();
        Intrinsics.O10IXXX0X(axisLeft, "getAxisLeft(...)");
        YAxis axisRight = getLineChart().getAxisRight();
        Intrinsics.O10IXXX0X(axisRight, "getAxisRight(...)");
        io1xi1x1i.OIX0iXi(axisLeft, axisRight, 200.0f, 0.0f, ContextCompat.getColor(this, R.color.line_color));
        getLineChart().getAxisLeft().X00Xi1X(false);
        getLineChart().getAxisRight().X00Xi1X(false);
        getLineChart().getAxisLeft().XOO0ii0(false);
        getLineChart().getAxisRight().XOO0ii0(false);
        Calendar calendar = Calendar.getInstance();
        Intrinsics.O10IXXX0X(calendar, "getInstance(...)");
        List<by6> listIXXOO = O0X11OiO.IXXOO(calendar.getTimeInMillis());
        XAxis xAxis = getLineChart().getXAxis();
        Intrinsics.XXI(xAxis);
        Context context = getLineChart().getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        io1xi1x1i.OIi0(xAxis, false, context);
        xAxis.IO0II0i(true);
        xAxis.IXOIIIO(1.0f);
        xAxis.i0X000X0O(-1.0f);
        xAxis.iOiXi11II(7.0f);
        ArrayList arrayList = new ArrayList();
        Iterator<by6> it = listIXXOO.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().IiI10X());
        }
        xAxis.m603Oi(new C2829q4(arrayList));
        LineChart lineChart2 = getLineChart();
        lineChart2.getDescription().XOO0ii0(false);
        lineChart2.getLegend().XOO0ii0(false);
        lineChart2.setScaleEnabled(false);
        O11X1i1 o11X1i1 = new O11X1i1(getLineChart(), getLineChart().getAnimator(), getLineChart().getViewPortHandler());
        o11X1i1.i010I(gk4.m1859iO(this, R.color.line_color));
        getLineChart().setRenderer(o11X1i1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineChart lineChart_delegate$lambda$0(EnergyRatingActivity energyRatingActivity) {
        return (LineChart) energyRatingActivity.findViewById(R.id.lineChart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AloneProgressBar mAloneProgressBar_delegate$lambda$0(EnergyRatingActivity energyRatingActivity) {
        return (AloneProgressBar) energyRatingActivity.findViewById(R.id.energy_rating_alone_bar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mScoreEvaluationTip_delegate$lambda$0(EnergyRatingActivity energyRatingActivity) {
        return (TextView) energyRatingActivity.findViewById(R.id.energy_score_evaluation_tip);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mScoreEvaluation_delegate$lambda$0(EnergyRatingActivity energyRatingActivity) {
        return (TextView) energyRatingActivity.findViewById(R.id.energy_score_evaluation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mScoreSuggestions_delegate$lambda$0(EnergyRatingActivity energyRatingActivity) {
        return (TextView) energyRatingActivity.findViewById(R.id.energy_score_today_suggestions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mScoreValue_delegate$lambda$0(EnergyRatingActivity energyRatingActivity) {
        return (TextView) energyRatingActivity.findViewById(R.id.energy_score_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(EnergyRatingActivity energyRatingActivity, ActivityResult result) {
        Intrinsics.X0O(result, "result");
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            Long lValueOf = data != null ? Long.valueOf(data.getLongExtra("startTime", 0L)) : null;
            Long lValueOf2 = data != null ? Long.valueOf(data.getLongExtra(SDKConstants.PARAM_END_TIME, 0L)) : null;
            if (lValueOf != null && lValueOf.longValue() == 0) {
                return;
            }
            if (lValueOf2 != null && lValueOf2.longValue() == 0) {
                return;
            }
            long[] range = energyRatingActivity.getRange();
            Intrinsics.XXI(lValueOf);
            range[0] = lValueOf.longValue();
            long[] range2 = energyRatingActivity.getRange();
            Intrinsics.XXI(lValueOf2);
            range2[1] = lValueOf2.longValue();
            energyRatingActivity.setEnergyRatingList(energyRatingActivity.mEnergyRatingDao.getEnergyRating(energyRatingActivity.getRange()[0], energyRatingActivity.getRange()[1]));
            energyRatingActivity.setChartData();
        }
    }

    private final void openEnergyRatingRecord() {
        Intent intent = new Intent(this, (Class<?>) EnergyRatingRecordActivity.class);
        intent.putExtra("curTime", getRange()[0]);
        ActivityResultLauncher<Intent> activityResultLauncher = this.energyRatingLauncher;
        if (activityResultLauncher == null) {
            Intrinsics.XXO("energyRatingLauncher");
            activityResultLauncher = null;
        }
        activityResultLauncher.launch(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScrollView rootView_delegate$lambda$0(EnergyRatingActivity energyRatingActivity) {
        return (ScrollView) energyRatingActivity.findViewById(R.id.rootView);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
    }

    public final ImageView getAbhTitleOtherRight() {
        return (ImageView) this.abhTitleOtherRight$delegate.getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    @aa1
    public final List<EnergyRating> getEnergyRatingList() {
        List<EnergyRating> list = this.energyRatingList;
        if (list != null) {
            return list;
        }
        Intrinsics.XXO("energyRatingList");
        return null;
    }

    public final AloneProgressBar getMAloneProgressBar() {
        return (AloneProgressBar) this.mAloneProgressBar$delegate.getValue();
    }

    public final TextView getMScoreEvaluation() {
        return (TextView) this.mScoreEvaluation$delegate.getValue();
    }

    public final TextView getMScoreEvaluationTip() {
        return (TextView) this.mScoreEvaluationTip$delegate.getValue();
    }

    public final TextView getMScoreSuggestions() {
        return (TextView) this.mScoreSuggestions$delegate.getValue();
    }

    public final TextView getMScoreValue() {
        return (TextView) this.mScoreValue$delegate.getValue();
    }

    @aa1
    public final long[] getRange() {
        long[] jArr = this.range;
        if (jArr != null) {
            return jArr;
        }
        Intrinsics.XXO("range");
        return null;
    }

    public final ScrollView getRootView() {
        return (ScrollView) this.rootView$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        setRange(O0X11OiO.iOOX010X(null, TimePeriod.DAY, 0, 5, null));
        setEnergyRatingList(this.mEnergyRatingDao.getEnergyRating(getRange()[0], getRange()[1]));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        getAbhTitleCenter().setText(getString(R.string.status_body_energy));
        getAbhTitleRight().setImageResource(R.drawable.energy_rating_share_icon);
        getAbhTitleRight().setVisibility(0);
        getAbhTitleOtherRight().setVisibility(0);
        getAbhTitleOtherRight().setImageResource(R.drawable.energy_rating_calendar_icon);
        initLineChart();
        setChartData();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_energy_rating;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle bundle) {
        super.onCreate(bundle);
        this.energyRatingLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.android.mltcode.paycertificationapi.IO0i0I1I0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                EnergyRatingActivity.onCreate$lambda$0(this.OXO1, (ActivityResult) obj);
            }
        });
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getRootView().getWidth(), getRootView().getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.O10IXXX0X(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(gk4.m1859iO(this, R.color.view_page_main_bg));
        XIi1i01O xIi1i01O = XIi1i01O.OXO1;
        ScrollView rootView = getRootView();
        Intrinsics.O10IXXX0X(rootView, "<get-rootView>(...)");
        canvas.drawBitmap(xIi1i01O.XIi00iiXO(rootView), 0.0f, 0.0f, (Paint) null);
        sz0 sz0Var = sz0.OXO1;
        ImageUtils.save(bitmapCreateBitmap, uz0.XOX0O0(sz0Var), Bitmap.CompressFormat.JPEG);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", "");
        intent.putExtra("android.intent.extra.STREAM", UriUtils.file2Uri(uz0.XOX0O0(sz0Var)));
        intent.setType("image/*");
        Intent intentCreateChooser = Intent.createChooser(intent, "");
        Intrinsics.O10IXXX0X(intentCreateChooser, "createChooser(...)");
        intentCreateChooser.addFlags(268435456);
        startActivity(intentCreateChooser);
    }

    public final void onTitleRightOtherClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        openEnergyRatingRecord();
    }

    public final void setChartData() {
        if (getEnergyRatingList().isEmpty()) {
            getMAloneProgressBar().m38869iO(0, 15);
            getMScoreValue().setVisibility(8);
            getMScoreEvaluation().setVisibility(8);
            getMScoreEvaluationTip().setVisibility(8);
            getMScoreSuggestions().setText(getString(R.string.energy_score_ll_suggestions_null));
        } else {
            Iterator<T> it = getEnergyRatingList().iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it.next();
            if (it.hasNext()) {
                int mScore = ((EnergyRating) next).getMScore();
                do {
                    Object next2 = it.next();
                    int mScore2 = ((EnergyRating) next2).getMScore();
                    if (mScore < mScore2) {
                        next = next2;
                        mScore = mScore2;
                    }
                } while (it.hasNext());
            }
            EnergyRating energyRating = (EnergyRating) next;
            getMAloneProgressBar().setProgressSelectedBgColor(EnergyRatingDataKt.getEnergyRatingColorLevel(this).get(EnergyRatingDataKt.getEnergyRatingLevel(energyRating.getMScore())).intValue());
            getMAloneProgressBar().m38869iO(energyRating.getMScore(), 15);
            getMScoreValue().setText(getString(R.string.energy_score_ll_value, Integer.valueOf(energyRating.getMScore())));
            int energyRatingLevel = EnergyRatingDataKt.getEnergyRatingLevel(energyRating.getMScore());
            getMScoreEvaluation().setText(getScoreEvaluationText(energyRatingLevel));
            getMScoreEvaluationTip().setText(getScoreEvaluationTip(energyRatingLevel));
            getMScoreSuggestions().setText(getScoreSuggestions(energyRatingLevel));
        }
        Calendar calendar = Calendar.getInstance();
        Intrinsics.O10IXXX0X(calendar, "getInstance(...)");
        long[] jArrIOOX010X = O0X11OiO.iOOX010X(calendar, TimePeriod.WEEK, 0, 4, null);
        List<EnergyRating> energyRating2 = this.mEnergyRatingDao.getEnergyRating(jArrIOOX010X[0], jArrIOOX010X[1]);
        this.weekData.clear();
        for (int i = 1; i < 8; i++) {
            this.weekData.put(Long.valueOf(jArrIOOX010X[0] + (((long) (86400 * i)) * 1000)), new ArrayList<>());
        }
        EnergyRatingDataKt.filterEnergyRatingDayData(energyRating2, this.weekData, this.values);
        updateChartData(this.values);
    }

    public final void setEnergyRatingList(@aa1 List<EnergyRating> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.energyRatingList = list;
    }

    public final void setRange(@aa1 long[] jArr) {
        Intrinsics.X0O(jArr, "<set-?>");
        this.range = jArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateChartData(@aa1 List<Entry> values) {
        Intrinsics.X0O(values, "values");
        if (getLineChart().getData() == 0 || ((C2305co) getLineChart().getData()).XXI() <= 0) {
            LineDataSet lineDataSet = new LineDataSet(values, "EnergyRatingActivity");
            lineDataSet.II1(ContextCompat.getColor(this, R.color.blue));
            lineDataSet.I00(ContextCompat.getColor(this, R.color.blue));
            lineDataSet.I00(ContextCompat.getColor(getMContext(), R.color.blue));
            lineDataSet.OXOO0X0i(true);
            lineDataSet.I1XII0X(2.0f);
            lineDataSet.iXOII(1.0f);
            lineDataSet.IOI0i0I(false);
            lineDataSet.XXI(false);
            lineDataSet.O1iXiI(true);
            C2305co c2305co = new C2305co(lineDataSet);
            c2305co.m1316iI(false);
            getLineChart().setData(c2305co);
        } else {
            T tOIX0iXi = ((C2305co) getLineChart().getData()).OIX0iXi(0);
            Intrinsics.X1ii(tOIX0iXi, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
            LineDataSet lineDataSet2 = (LineDataSet) tOIX0iXi;
            lineDataSet2.IOX1(values);
            lineDataSet2.i0X1iIO();
            ((C2305co) getLineChart().getData()).mo1167iX();
            getLineChart().X0i1O();
        }
        getLineChart().I0IIOi(1000);
        getLineChart().invalidate();
    }
}
