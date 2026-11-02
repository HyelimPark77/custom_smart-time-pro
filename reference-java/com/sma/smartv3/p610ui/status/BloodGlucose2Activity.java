package com.sma.smartv3.p610ui.status;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iz3;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter;
import com.bestmafen.androidbase.adapter.recyclerview.base.ViewHolder;
import com.bestmafen.androidbase.base.BaseActivity;
import com.google.gson.Gson;
import com.sma.smartv3.biz.BGEMManager;
import com.sma.smartv3.model.BGEMKt;
import com.sma.smartv3.model.BGEMRangeAnalysisResult;
import com.sma.smartv3.model.BGEMUser;
import com.sma.smartv3.model.BloodGlucose2DataKt;
import com.sma.smartv3.p608db.MyDb;
import com.sma.smartv3.p608db.entity.BloodGlucose2;
import com.sma.smartv3.p610ui.status.BloodGlucose2Activity;
import com.sma.smartv3.p610ui.status.p254bg.BloodGlucoseMeasurementActivity;
import com.sma.smartv3.p610ui.status.p254bg.BloodGlucoseTrendActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.segmentedbar.SegmentedBarView2;
import com.szabh.smable3.component.BleConnector;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C20141iO;
import kotlin.ranges.LongRange;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBloodGlucose2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucose2Activity.kt\ncom/sma/smartv3/ui/status/BloodGlucose2Activity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,287:1\n15#2:288\n69#3,3:289\n72#3,5:293\n69#3,3:298\n72#3,5:302\n69#3,3:307\n72#3,5:311\n1#4:292\n1#4:301\n1#4:310\n*S KotlinDebug\n*F\n+ 1 BloodGlucose2Activity.kt\ncom/sma/smartv3/ui/status/BloodGlucose2Activity\n*L\n75#1:288\n279#1:289,3\n279#1:293,5\n135#1:298,3\n135#1:302,5\n129#1:307,3\n129#1:311,5\n279#1:292\n135#1:301\n129#1:310\n*E\n"})
public final class BloodGlucose2Activity extends BaseActivity {

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X01X01i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucose2Activity.abhTitleRight_delegate$lambda$0(this.f3929IO);
        }
    });

    @aa1
    private final Lazy llNoMeasurement$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OX10O1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucose2Activity.llNoMeasurement_delegate$lambda$0(this.f3424IO);
        }
    });

    @aa1
    private final Lazy barView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ii0OX0i
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucose2Activity.barView_delegate$lambda$0(this.f8527IO);
        }
    });

    @aa1
    private final Lazy btnMeasure$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.i1IIOX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucose2Activity.btnMeasure_delegate$lambda$0(this.f7578IO);
        }
    });

    @aa1
    private final Lazy tvMeasureDate$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X1X101OXX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucose2Activity.tvMeasureDate_delegate$lambda$0(this.f4331IO);
        }
    });

    @aa1
    private final Lazy tvNoRecord$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OiiI1I0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucose2Activity.tvNoRecord_delegate$lambda$0(this.f3823IO);
        }
    });

    @aa1
    private final Lazy ivRiskLevel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I011iiIXO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucose2Activity.ivRiskLevel_delegate$lambda$0(this.f1059IO);
        }
    });

    @aa1
    private final Lazy btnRiskLevel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XOXX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucose2Activity.btnRiskLevel_delegate$lambda$0(this.f4874IO);
        }
    });

    @aa1
    private final Lazy tvRiskRangeDate$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IiO0X101I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucose2Activity.tvRiskRangeDate_delegate$lambda$0(this.f2254IO);
        }
    });

    @aa1
    private final Lazy rvRiskLevel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OOXO01
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucose2Activity.rvRiskLevel_delegate$lambda$0(this.f3330IO);
        }
    });

    @aa1
    private final Lazy llDiabeticRiskInsight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OO0OX1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucose2Activity.llDiabeticRiskInsight_delegate$lambda$0(this.f3138IO);
        }
    });

    @aa1
    private final Lazy tvDiabeticRiskInsight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.II1XXIX
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucose2Activity.tvDiabeticRiskInsight_delegate$lambda$0(this.f1555IO);
        }
    });

    @aa1
    private final Lazy tvRiskDate$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0XO
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucose2Activity.tvRiskDate_delegate$lambda$0(this.f4039IO);
        }
    });

    @aa1
    private final Lazy tvDiabeticRiskTips$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0XXiIX0X
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return BloodGlucose2Activity.tvDiabeticRiskTips_delegate$lambda$0(this.f1241IO);
        }
    });

    @aa1
    private List<BloodGlucose2> mBloodGlucoseList = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(BloodGlucose2Activity bloodGlucose2Activity) {
        return (ImageView) bloodGlucose2Activity.findViewById(R.id.abh_title_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SegmentedBarView2 barView_delegate$lambda$0(BloodGlucose2Activity bloodGlucose2Activity) {
        return (SegmentedBarView2) bloodGlucose2Activity.findViewById(R.id.bar_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView btnMeasure_delegate$lambda$0(BloodGlucose2Activity bloodGlucose2Activity) {
        return (TextView) bloodGlucose2Activity.findViewById(R.id.btn_measure);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView btnRiskLevel_delegate$lambda$0(BloodGlucose2Activity bloodGlucose2Activity) {
        return (TextView) bloodGlucose2Activity.findViewById(R.id.btn_risk_level);
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    private final SegmentedBarView2 getBarView() {
        return (SegmentedBarView2) this.barView$delegate.getValue();
    }

    private final TextView getBtnMeasure() {
        return (TextView) this.btnMeasure$delegate.getValue();
    }

    private final TextView getBtnRiskLevel() {
        return (TextView) this.btnRiskLevel$delegate.getValue();
    }

    private final ImageView getIvRiskLevel() {
        return (ImageView) this.ivRiskLevel$delegate.getValue();
    }

    private final LinearLayout getLlDiabeticRiskInsight() {
        return (LinearLayout) this.llDiabeticRiskInsight$delegate.getValue();
    }

    private final LinearLayout getLlNoMeasurement() {
        return (LinearLayout) this.llNoMeasurement$delegate.getValue();
    }

    private final RecyclerView getRvRiskLevel() {
        return (RecyclerView) this.rvRiskLevel$delegate.getValue();
    }

    private final TextView getTvDiabeticRiskInsight() {
        return (TextView) this.tvDiabeticRiskInsight$delegate.getValue();
    }

    private final TextView getTvDiabeticRiskTips() {
        return (TextView) this.tvDiabeticRiskTips$delegate.getValue();
    }

    private final TextView getTvMeasureDate() {
        return (TextView) this.tvMeasureDate$delegate.getValue();
    }

    private final TextView getTvNoRecord() {
        return (TextView) this.tvNoRecord$delegate.getValue();
    }

    private final TextView getTvRiskDate() {
        return (TextView) this.tvRiskDate$delegate.getValue();
    }

    private final TextView getTvRiskRangeDate() {
        return (TextView) this.tvRiskRangeDate$delegate.getValue();
    }

    private final String getValueText(float f) {
        return f + "<br><small>mmol/L</small>";
    }

    private final void initBarView() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new iz3(BloodGlucose2DataKt.getBloodGlucoseBarValue$default(3.4f, 0.0f, 2, null), BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.1f, 0.0f, 2, null), getResources().getColor(R.color.bg_level_color_normal_bg), getResources().getColor(R.color.bg_level_color_normal)));
        arrayList.add(new iz3(BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.1f, 0.0f, 2, null), BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.9f, 0.0f, 2, null), getResources().getColor(R.color.bg_level_color_prediabetes_bg), getResources().getColor(R.color.bg_level_color_prediabetes)));
        arrayList.add(new iz3(BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.9f, 0.0f, 2, null), BloodGlucose2DataKt.getBloodGlucoseBarValue$default(8.1f, 0.0f, 2, null), getResources().getColor(R.color.bg_level_color_diabetes_bg), getResources().getColor(R.color.bg_level_color_diabetes)));
        getBarView().setSegments(arrayList);
    }

    private final void initRange() {
        getBtnMeasure().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.O0iIX
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodGlucose2Activity.initRange$lambda$0(this.f2588IO, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initRange$lambda$0(final BloodGlucose2Activity bloodGlucose2Activity, View view) {
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.i1I1O
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BloodGlucose2Activity.initRange$lambda$0$0(this.f7570IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initRange$lambda$0$0(final BloodGlucose2Activity bloodGlucose2Activity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        if (MyDb.INSTANCE.getMDatabase().bloodGlucose2Dao().getTodayList().isEmpty()) {
            bloodGlucose2Activity.startActivity(new Intent(bloodGlucose2Activity, (Class<?>) BloodGlucoseMeasurementActivity.class));
        } else {
            go0 go0Var = new go0(bloodGlucose2Activity, 0, 2, null);
            go0Var.m1865iX(Integer.valueOf(R.string.bg_measurement_record_used_tip));
            go0Var.iX1O1(Integer.valueOf(R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.I1XXiOiX
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BloodGlucose2Activity.initRange$lambda$0$0$0$0());
                }
            });
            go0Var.X1IX(R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.OO0iX1IX
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2() {
                    return Boolean.valueOf(BloodGlucose2Activity.initRange$lambda$0$0$0$1(this.f3162IO));
                }
            });
            go0Var.IIX1OXO();
        }
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initRange$lambda$0$0$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initRange$lambda$0$0$0$1(BloodGlucose2Activity bloodGlucose2Activity) {
        bloodGlucose2Activity.startActivity(new Intent(bloodGlucose2Activity, (Class<?>) BloodGlucoseMeasurementActivity.class));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivRiskLevel_delegate$lambda$0(BloodGlucose2Activity bloodGlucose2Activity) {
        return (ImageView) bloodGlucose2Activity.findViewById(R.id.iv_risk_level);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llDiabeticRiskInsight_delegate$lambda$0(BloodGlucose2Activity bloodGlucose2Activity) {
        return (LinearLayout) bloodGlucose2Activity.findViewById(R.id.ll_diabetic_risk_insight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llNoMeasurement_delegate$lambda$0(BloodGlucose2Activity bloodGlucose2Activity) {
        return (LinearLayout) bloodGlucose2Activity.findViewById(R.id.ll_no_measurement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView rvRiskLevel_delegate$lambda$0(BloodGlucose2Activity bloodGlucose2Activity) {
        return (RecyclerView) bloodGlucose2Activity.findViewById(R.id.rv_risk_level);
    }

    private final void setBarValue(float f, float f2) {
        getBarView().X1ii(BloodGlucose2DataKt.getBloodGlucoseBarValue$default(f, 0.0f, 2, null), getValueText(f));
        getBarView().O10IXXX0X(BloodGlucose2DataKt.getBloodGlucoseBarValue$default(f2, 0.0f, 2, null), getValueText(f2));
    }

    private final void syncData() {
        long[] jArrXX0 = O0X11OiO.XX0(50);
        BGEMManager bGEMManager = BGEMManager.OXO1;
        String str = O0X11OiO.IO0iXO0O().format(Long.valueOf(jArrXX0[0]));
        Intrinsics.O10IXXX0X(str, "format(...)");
        String str2 = O0X11OiO.IO0iXO0O().format(Long.valueOf(jArrXX0[1]));
        Intrinsics.O10IXXX0X(str2, "format(...)");
        bGEMManager.m38088iO(str, str2, new O1XIiIO<BGEMRangeAnalysisResult[]>() { // from class: com.sma.smartv3.ui.status.BloodGlucose2Activity.syncData.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(BGEMRangeAnalysisResult[] bGEMRangeAnalysisResultArr) {
                if (bGEMRangeAnalysisResultArr != null) {
                    for (BGEMRangeAnalysisResult bGEMRangeAnalysisResult : bGEMRangeAnalysisResultArr) {
                        BloodGlucose2 bloodGlucose2 = bGEMRangeAnalysisResult.toBloodGlucose2();
                        if (bloodGlucose2 != null) {
                            MyDb.INSTANCE.getMDatabase().bloodGlucose2Dao().insert(CollectionsKt__CollectionsKt.iIiiO(bloodGlucose2));
                        }
                    }
                }
                BloodGlucose2Activity.this.showData(new Object());
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDiabeticRiskInsight_delegate$lambda$0(BloodGlucose2Activity bloodGlucose2Activity) {
        return (TextView) bloodGlucose2Activity.findViewById(R.id.tv_diabetic_risk_insight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDiabeticRiskTips_delegate$lambda$0(BloodGlucose2Activity bloodGlucose2Activity) {
        return (TextView) bloodGlucose2Activity.findViewById(R.id.tv_diabetic_risk_tips);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvMeasureDate_delegate$lambda$0(BloodGlucose2Activity bloodGlucose2Activity) {
        return (TextView) bloodGlucose2Activity.findViewById(R.id.tv_measure_date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvNoRecord_delegate$lambda$0(BloodGlucose2Activity bloodGlucose2Activity) {
        return (TextView) bloodGlucose2Activity.findViewById(R.id.tv_no_record);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvRiskDate_delegate$lambda$0(BloodGlucose2Activity bloodGlucose2Activity) {
        return (TextView) bloodGlucose2Activity.findViewById(R.id.tv_risk_date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvRiskRangeDate_delegate$lambda$0(BloodGlucose2Activity bloodGlucose2Activity) {
        return (TextView) bloodGlucose2Activity.findViewById(R.id.tv_risk_range_date);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
        if (((BGEMUser) new Gson().fromJson(a01.OXO1.IiI10X().getString(BGEMUser.class.getName()), BGEMUser.class)) == null) {
            BGEMManager.I0IIOi(BGEMManager.OXO1, null, 1, null);
        } else {
            BGEMManager.m38087IO(BGEMManager.OXO1, null, 1, null);
        }
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        ((TextView) findViewById(R.id.abh_title_center)).setText(R.string.blood_glucose);
        getAbhTitleRight().setVisibility(0);
        getAbhTitleRight().setImageResource(R.drawable.ic_blood_glucose_trend);
        getAbhTitleRight().setImageTintList(gk4.O00(this, R.color.text_color));
        initRange();
        initBarView();
        showData(new Object());
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_blood_glucose2;
    }

    public final void onHelp(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        i72.OXO1.XO1(this);
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        startActivity(new Intent(this, (Class<?>) BloodGlucoseTrendActivity.class));
    }

    @sf5(tag = I01XX0.X1ii)
    public final void showData(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        this.mBloodGlucoseList.clear();
        this.mBloodGlucoseList.addAll(MyDb.INSTANCE.getMDatabase().bloodGlucose2Dao().getListForDay());
        long[] jArrXX0 = O0X11OiO.XX0(6);
        getTvRiskRangeDate().setText(O0X11OiO.X0i1O(null, 1, null).format(Long.valueOf(jArrXX0[0])) + " - " + O0X11OiO.X0i1O(null, 1, null).format(Long.valueOf(jArrXX0[1])));
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        CharSequence text = getTvRiskRangeDate().getText();
        i1o0oxo1o.OXO1("showData -> " + ((Object) text) + ", " + this.mBloodGlucoseList.size());
        if (!this.mBloodGlucoseList.isEmpty()) {
            BloodGlucose2 bloodGlucose2 = (BloodGlucose2) CollectionsKt___CollectionsKt.Xi1XO00(this.mBloodGlucoseList);
            setBarValue((float) bloodGlucose2.getMLowerBound(), (float) bloodGlucose2.getMUpperBound());
            getLlNoMeasurement().setVisibility(8);
            getTvMeasureDate().setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(Long.valueOf(bloodGlucose2.getMTime())));
            int mCurrentLevel = bloodGlucose2.getMCurrentLevel();
            if (mCurrentLevel > 0) {
                getIvRiskLevel().setVisibility(0);
                getTvNoRecord().setVisibility(8);
            } else {
                getIvRiskLevel().setVisibility(8);
                getTvNoRecord().setVisibility(0);
            }
            if (mCurrentLevel == 0) {
                getBtnRiskLevel().setText(R.string.diabetic_risk_level_0);
                getBtnRiskLevel().setBackgroundTintList(getResources().getColorStateList(R.color.bg_risk_0));
            } else if (mCurrentLevel == 1) {
                getIvRiskLevel().setImageResource(R.drawable.ic_bg_risk_low);
                getBtnRiskLevel().setText(R.string.diabetic_risk_level_1);
                getBtnRiskLevel().setBackgroundTintList(getResources().getColorStateList(R.color.bg_risk_1));
            } else if (mCurrentLevel == 2) {
                getIvRiskLevel().setImageResource(R.drawable.ic_bg_risk_marginal);
                getBtnRiskLevel().setText(R.string.diabetic_risk_level_2);
                getBtnRiskLevel().setBackgroundTintList(getResources().getColorStateList(R.color.bg_risk_2));
            } else if (mCurrentLevel == 3) {
                getIvRiskLevel().setImageResource(R.drawable.ic_bg_risk_moderate);
                getBtnRiskLevel().setText(R.string.diabetic_risk_level_3);
                getBtnRiskLevel().setBackgroundTintList(getResources().getColorStateList(R.color.bg_risk_3));
            } else if (mCurrentLevel == 4) {
                getIvRiskLevel().setImageResource(R.drawable.ic_bg_risk_high);
                getBtnRiskLevel().setText(R.string.diabetic_risk_level_4);
                getBtnRiskLevel().setBackgroundTintList(getResources().getColorStateList(R.color.bg_risk_4));
            }
            if (TextUtils.isEmpty(bloodGlucose2.getMInsights())) {
                getLlDiabeticRiskInsight().setVisibility(8);
            } else {
                getLlDiabeticRiskInsight().setVisibility(0);
                getTvRiskDate().setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(Long.valueOf(bloodGlucose2.getMTime())));
                getTvDiabeticRiskInsight().setText(Html.fromHtml(BGEMKt.getInsights(bloodGlucose2)));
                getTvDiabeticRiskTips().setText(Html.fromHtml(BGEMKt.getInsightsTip(bloodGlucose2)));
            }
        }
        getRvRiskLevel().setLayoutManager(new GridLayoutManager(this, 7));
        getRvRiskLevel().setAdapter(new CommonAdapter<Long>(CollectionsKt___CollectionsKt.Ii00iIX01(C20141iO.IiiiOIIi0(new LongRange(jArrXX0[0], jArrXX0[1]), TimeUnit.DAYS.toMillis(1L)))) { // from class: com.sma.smartv3.ui.status.BloodGlucose2Activity.showData.1
            final /* synthetic */ List<Long> $days;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(BloodGlucose2Activity.this, R.layout.item_bg_risk_level, list);
                this.$days = list;
            }

            @Override // com.bestmafen.androidbase.adapter.recyclerview.CommonAdapter
            public /* bridge */ /* synthetic */ void convert(ViewHolder viewHolder, Long l, int i) {
                convert(viewHolder, l.longValue(), i);
            }

            public void convert(ViewHolder holder, long j, int i) {
                Object next;
                int i2;
                Intrinsics.X0O(holder, "holder");
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j);
                String displayName = calendar.getDisplayName(7, 1, Locale.getDefault());
                if (displayName == null) {
                    Intrinsics.XXI(calendar);
                    displayName = String.valueOf(OIi1iX.XIi00iiXO(calendar) + 1);
                }
                ((TextView) holder.getView(R.id.tv_title)).setText(displayName);
                holder.getView(R.id.fl_bg_select).setBackgroundTintList(i == this.$days.size() - 1 ? BloodGlucose2Activity.this.getResources().getColorStateList(R.color.black) : BloodGlucose2Activity.this.getResources().getColorStateList(R.color.transparent));
                Iterator it = BloodGlucose2Activity.this.mBloodGlucoseList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.XOO0ii0(O0X11OiO.iiIOiX().format(Long.valueOf(((BloodGlucose2) next).getMTime())), O0X11OiO.iiIOiX().format(Long.valueOf(j))));
                BloodGlucose2 bloodGlucose3 = (BloodGlucose2) next;
                int mCurrentLevel2 = 0;
                if (bloodGlucose3 != null) {
                    holder.getView(R.id.iv_risk_level_icon).setVisibility(0);
                    mCurrentLevel2 = bloodGlucose3.getMCurrentLevel();
                } else {
                    holder.getView(R.id.iv_risk_level_icon).setVisibility(8);
                }
                View view = holder.getView(R.id.fl_bg);
                Resources resources = BloodGlucose2Activity.this.getResources();
                if (mCurrentLevel2 == 1) {
                    i2 = R.color.bg_risk_1;
                } else if (mCurrentLevel2 == 2) {
                    i2 = R.color.bg_risk_2;
                } else if (mCurrentLevel2 != 3) {
                    i2 = mCurrentLevel2 != 4 ? R.color.bg_risk_0 : R.color.bg_risk_4;
                } else {
                    i2 = R.color.bg_risk_3;
                }
                view.setBackgroundTintList(resources.getColorStateList(i2));
            }
        });
    }
}
