package com.sma.smartv3.p610ui.status.item;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iz3;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.LibExKt;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.model.BloodGlucose2DataKt;
import com.sma.smartv3.model.TodayData;
import com.sma.smartv3.model.WeightMeasureDataKt;
import com.sma.smartv3.p610ui.main.MainActivity;
import com.sma.smartv3.p610ui.status.item.HeathAIAnalyzeItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView;
import com.sma.smartv3.view.segmentedbar.SegmentedBarView2;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class HeathAIAnalyzeItem extends BaseDslItem {

    @tb1
    private SegmentedBarView2 barView;

    @tb1
    private LinearLayout barViewTipLayout;

    @aa1
    private final TodayData item;

    @tb1
    private TextView mAiAnalysisResult;

    @tb1
    private TextView mAiAnalysisTitle;

    @tb1
    private AppCompatImageView mBadIv;

    @tb1
    private TextView mBadTv;

    @tb1
    private TextView mCommonBtn;
    private Context mContext;

    @tb1
    private AppCompatImageView mGoodIv;

    @tb1
    private TextView mGoodTv;

    @tb1
    private AppCompatImageView mHighestIv;

    @tb1
    private TextView mHighestTv;

    @tb1
    private AppCompatImageView mMediumIv;

    @tb1
    private TextView mMediumTv;

    @tb1
    private CircleThumbSegmentedBarView mSbvBmi;

    @tb1
    private TextView mValueFront;

    @tb1
    private TextView mValueState;

    @tb1
    private TextView mValueTime;

    @tb1
    private TextView mValueTitle;

    @tb1
    private TextView mValueTv;

    /* JADX WARN: Multi-variable type inference failed */
    public HeathAIAnalyzeItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void initBarView() {
        ArrayList arrayList = new ArrayList();
        Context context = null;
        float bloodGlucoseBarValue$default = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(3.4f, 0.0f, 2, null);
        float bloodGlucoseBarValue$default2 = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.1f, 0.0f, 2, null);
        Context context2 = this.mContext;
        if (context2 == null) {
            Intrinsics.XXO("mContext");
            context2 = null;
        }
        int color = context2.getResources().getColor(R.color.bg_level_color_normal_bg);
        Context context3 = this.mContext;
        if (context3 == null) {
            Intrinsics.XXO("mContext");
            context3 = null;
        }
        arrayList.add(new iz3(bloodGlucoseBarValue$default, bloodGlucoseBarValue$default2, color, context3.getResources().getColor(R.color.bg_level_color_normal)));
        float bloodGlucoseBarValue$default3 = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.1f, 0.0f, 2, null);
        float bloodGlucoseBarValue$default4 = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.9f, 0.0f, 2, null);
        Context context4 = this.mContext;
        if (context4 == null) {
            Intrinsics.XXO("mContext");
            context4 = null;
        }
        int color2 = context4.getResources().getColor(R.color.bg_level_color_prediabetes_bg);
        Context context5 = this.mContext;
        if (context5 == null) {
            Intrinsics.XXO("mContext");
            context5 = null;
        }
        arrayList.add(new iz3(bloodGlucoseBarValue$default3, bloodGlucoseBarValue$default4, color2, context5.getResources().getColor(R.color.bg_level_color_prediabetes)));
        float bloodGlucoseBarValue$default5 = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.9f, 0.0f, 2, null);
        float bloodGlucoseBarValue$default6 = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(8.1f, 0.0f, 2, null);
        Context context6 = this.mContext;
        if (context6 == null) {
            Intrinsics.XXO("mContext");
            context6 = null;
        }
        int color3 = context6.getResources().getColor(R.color.bg_level_color_diabetes_bg);
        Context context7 = this.mContext;
        if (context7 == null) {
            Intrinsics.XXO("mContext");
        } else {
            context = context7;
        }
        arrayList.add(new iz3(bloodGlucoseBarValue$default5, bloodGlucoseBarValue$default6, color3, context.getResources().getColor(R.color.bg_level_color_diabetes)));
        SegmentedBarView2 segmentedBarView2 = this.barView;
        if (segmentedBarView2 != null) {
            segmentedBarView2.setSegments(arrayList);
        }
        SegmentedBarView2 segmentedBarView3 = this.barView;
        if (segmentedBarView3 != null) {
            LibExKt.I0XXi0X(segmentedBarView3, true);
        }
        LinearLayout linearLayout = this.barViewTipLayout;
        if (linearLayout != null) {
            LibExKt.I0XXi0X(linearLayout, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(HeathAIAnalyzeItem heathAIAnalyzeItem, View view) {
        Context context = heathAIAnalyzeItem.mContext;
        Context context2 = null;
        if (context == null) {
            Intrinsics.XXO("mContext");
            context = null;
        }
        Context context3 = heathAIAnalyzeItem.mContext;
        if (context3 == null) {
            Intrinsics.XXO("mContext");
        } else {
            context2 = context3;
        }
        context.startActivity(new Intent(context2, (Class<?>) MainActivity.class));
    }

    private final void setBmi(double d, List<Double> list, String[] strArr, int[] iArr) {
        CircleThumbSegmentedBarView circleThumbSegmentedBarView = this.mSbvBmi;
        Intrinsics.XXI(circleThumbSegmentedBarView);
        WeightMeasureDataKt.setBarView$default(circleThumbSegmentedBarView, d, list, strArr, iArr, false, 32, null);
        CircleThumbSegmentedBarView circleThumbSegmentedBarView2 = this.mSbvBmi;
        if (circleThumbSegmentedBarView2 != null) {
            LibExKt.I0XXi0X(circleThumbSegmentedBarView2, true);
        }
    }

    public static /* synthetic */ void setViewHidden$default(HeathAIAnalyzeItem heathAIAnalyzeItem, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        heathAIAnalyzeItem.setViewHidden(i, z);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        Context context = itemHolder.getContext();
        Intrinsics.O10IXXX0X(context, "<get-context>(...)");
        this.mContext = context;
        View view = itemHolder.view(R.id.tv_heart_rate);
        Intrinsics.X1ii(view, "null cannot be cast to non-null type android.widget.TextView");
        this.mValueTitle = (TextView) view;
        View view2 = itemHolder.view(R.id.tv_hr_zone);
        Intrinsics.X1ii(view2, "null cannot be cast to non-null type android.widget.TextView");
        this.mValueState = (TextView) view2;
        View view3 = itemHolder.view(R.id.tv_heart_rate_value);
        Intrinsics.X1ii(view3, "null cannot be cast to non-null type android.widget.TextView");
        this.mValueTime = (TextView) view3;
        View view4 = itemHolder.view(R.id.tv_ave_value);
        Intrinsics.X1ii(view4, "null cannot be cast to non-null type android.widget.TextView");
        this.mValueFront = (TextView) view4;
        View view5 = itemHolder.view(R.id.sbv_bmi);
        Intrinsics.X1ii(view5, "null cannot be cast to non-null type com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView");
        CircleThumbSegmentedBarView circleThumbSegmentedBarView = (CircleThumbSegmentedBarView) view5;
        this.mSbvBmi = circleThumbSegmentedBarView;
        if (circleThumbSegmentedBarView != null) {
            circleThumbSegmentedBarView.setVisibility(8);
        }
        View view6 = itemHolder.view(R.id.bar_view);
        Intrinsics.X1ii(view6, "null cannot be cast to non-null type com.sma.smartv3.view.segmentedbar.SegmentedBarView2");
        SegmentedBarView2 segmentedBarView2 = (SegmentedBarView2) view6;
        this.barView = segmentedBarView2;
        if (segmentedBarView2 != null) {
            segmentedBarView2.setVisibility(8);
        }
        View view7 = itemHolder.view(R.id.ll_bar_view);
        Intrinsics.X1ii(view7, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) view7;
        this.barViewTipLayout = linearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        View view8 = itemHolder.view(R.id.iv_bad);
        Intrinsics.X1ii(view8, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
        this.mBadIv = (AppCompatImageView) view8;
        View view9 = itemHolder.view(R.id.tv_bad);
        Intrinsics.X1ii(view9, "null cannot be cast to non-null type android.widget.TextView");
        this.mBadTv = (TextView) view9;
        View view10 = itemHolder.view(R.id.iv_general);
        Intrinsics.X1ii(view10, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
        this.mMediumIv = (AppCompatImageView) view10;
        View view11 = itemHolder.view(R.id.tv_general);
        Intrinsics.X1ii(view11, "null cannot be cast to non-null type android.widget.TextView");
        this.mMediumTv = (TextView) view11;
        View view12 = itemHolder.view(R.id.iv_good);
        Intrinsics.X1ii(view12, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
        this.mGoodIv = (AppCompatImageView) view12;
        View view13 = itemHolder.view(R.id.tv_good);
        Intrinsics.X1ii(view13, "null cannot be cast to non-null type android.widget.TextView");
        this.mGoodTv = (TextView) view13;
        View view14 = itemHolder.view(R.id.iv_highest);
        Intrinsics.X1ii(view14, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
        this.mHighestIv = (AppCompatImageView) view14;
        View view15 = itemHolder.view(R.id.tv_highest);
        Intrinsics.X1ii(view15, "null cannot be cast to non-null type android.widget.TextView");
        this.mHighestTv = (TextView) view15;
        setViewHidden$default(this, 0, false, 3, null);
        View view16 = itemHolder.view(R.id.tv_ai_analysis);
        Intrinsics.X1ii(view16, "null cannot be cast to non-null type android.widget.TextView");
        this.mAiAnalysisTitle = (TextView) view16;
        View view17 = itemHolder.view(R.id.tv_ai_analysis_content);
        Intrinsics.X1ii(view17, "null cannot be cast to non-null type android.widget.TextView");
        this.mAiAnalysisResult = (TextView) view17;
        View view18 = itemHolder.view(R.id.tv_avg_bpm_value);
        Intrinsics.X1ii(view18, "null cannot be cast to non-null type android.widget.TextView");
        this.mValueTv = (TextView) view18;
        View view19 = itemHolder.view(R.id.tv_generate_report);
        Intrinsics.X1ii(view19, "null cannot be cast to non-null type android.widget.TextView");
        this.mCommonBtn = (TextView) view19;
    }

    @aa1
    public final TodayData getItem() {
        return this.item;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:44:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:47:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:50:0x01e1  */
    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        int color;
        TextView textView;
        TextView textView2 = this.mCommonBtn;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        switch (this.item.getDataType()) {
            case "pressure":
                double value1 = this.item.getValue1();
                List<Double> listIXiX011 = CollectionsKt__CollectionsKt.iXiX011(Double.valueOf(0.0d), Double.valueOf(25.0d), Double.valueOf(50.0d), Double.valueOf(75.0d), Double.valueOf(100.0d));
                Context context = this.mContext;
                if (context == null) {
                    Intrinsics.XXO("mContext");
                    context = null;
                }
                String[] stringArray = context.getResources().getStringArray(R.array.level_range_4_2_bmi);
                Intrinsics.O10IXXX0X(stringArray, "getStringArray(...)");
                Context context2 = this.mContext;
                if (context2 == null) {
                    Intrinsics.XXO("mContext");
                    context2 = null;
                }
                int[] intArray = context2.getResources().getIntArray(R.array.level_color_4_2);
                Intrinsics.O10IXXX0X(intArray, "getIntArray(...)");
                setBmi(value1, listIXiX011, stringArray, intArray);
                break;
            case "weight":
                double value2 = this.item.getValue1();
                List<Double> listIXiX012 = CollectionsKt__CollectionsKt.iXiX011(Double.valueOf(0.0d), Double.valueOf(18.4d), Double.valueOf(24.9d), Double.valueOf(29.9d));
                String[] strArr = {UtilsKt.XXO(R.string.thin), UtilsKt.XXO(R.string.normal), UtilsKt.XXO(R.string.too_heavy), UtilsKt.XXO(R.string.class_1_obesity)};
                Context context3 = this.mContext;
                if (context3 == null) {
                    Intrinsics.XXO("mContext");
                    context3 = null;
                }
                setBmi(value2, listIXiX012, strArr, ArraysKt___ArraysKt.iiIX1(new Integer[]{-16776961, -16711936, Integer.valueOf(context3.getResources().getColor(R.color.bg_level_color_prediabetes)), -65536}));
                break;
            case "blood_oxygen":
                setBmi(this.item.getValue1(), CollectionsKt__CollectionsKt.iXiX011(Double.valueOf(0.0d), Double.valueOf(92.0d), Double.valueOf(100.0d)), new String[]{UtilsKt.XXO(R.string.lightness_low), UtilsKt.XXO(R.string.bg_normal)}, ArraysKt___ArraysKt.iiIX1(new Integer[]{-16776961, -16711936}));
                CircleThumbSegmentedBarView circleThumbSegmentedBarView = this.mSbvBmi;
                if (circleThumbSegmentedBarView != null) {
                    circleThumbSegmentedBarView.setSegmentSideRule(0);
                }
                break;
            case "sleep":
                setViewHidden(this.item.getStateColor(), true);
                break;
            case "blood_pressure":
                setViewHidden$default(this, this.item.getStateColor(), false, 2, null);
                break;
            case "blood_glucose2":
                initBarView();
                break;
            case "heart_rate":
                Context context4 = this.mContext;
                if (context4 == null) {
                    Intrinsics.XXO("mContext");
                    context4 = null;
                }
                context4.getResources().getColor(R.color.colorAccent);
                setBmi(this.item.getValue1(), CollectionsKt__CollectionsKt.iXiX011(Double.valueOf(0.0d), Double.valueOf(60.0d), Double.valueOf(100.0d), Double.valueOf(180.0d)), new String[]{UtilsKt.XXO(R.string.lightness_low), UtilsKt.XXO(R.string.lightness_middle), UtilsKt.XXO(R.string.lightness_high)}, ArraysKt___ArraysKt.iiIX1(new Integer[]{-16776961, -16711936, -65536}));
                break;
            default:
                TextView textView3 = this.mCommonBtn;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                TextView textView4 = this.mCommonBtn;
                if (textView4 != null) {
                    textView4.setText(UtilsKt.XXO(R.string.go_to_sports));
                }
                TextView textView5 = this.mCommonBtn;
                if (textView5 != null) {
                    textView5.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XO00iX1i
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            HeathAIAnalyzeItem.initView$lambda$0(this.f4651IO, view);
                        }
                    });
                }
                break;
        }
        if (this.item.getMExtraInfo().length() > 0) {
            LibExKt.I0XXi0X(this.mAiAnalysisTitle, true);
            LibExKt.I0XXi0X(this.mAiAnalysisResult, true);
            TextView textView6 = this.mAiAnalysisResult;
            if (textView6 != null) {
                textView6.setText(this.item.getMExtraInfo());
            }
        } else {
            LibExKt.XX1Oi(this.mAiAnalysisTitle, true);
            LibExKt.XX1Oi(this.mAiAnalysisResult, true);
        }
        TextView textView7 = this.mValueTv;
        if (textView7 != null) {
            textView7.setText(this.item.getValue());
        }
        TextView textView8 = this.mValueFront;
        if (textView8 != null) {
            textView8.setText(UtilsKt.XXO(R.string.ave_value) + ": ");
        }
        TextView textView9 = this.mValueState;
        if (textView9 != null) {
            textView9.setText(this.item.getState());
        }
        if (this.item.getTime() != 0 && (textView = this.mValueTime) != null) {
            textView.setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(Long.valueOf(this.item.getTime())));
        }
        TextView textView10 = this.mValueTitle;
        if (textView10 != null) {
            textView10.setText(this.item.getTitle() + ": ");
        }
        TextView textView11 = this.mValueState;
        if (textView11 != null) {
            int stateColor = this.item.getStateColor();
            if (stateColor == 0) {
                color = Color.parseColor("#FE6D00");
            } else if (stateColor != 1) {
                color = stateColor != 2 ? -65536 : -16711936;
            } else {
                TextView textView12 = this.mValueState;
                Intrinsics.XXI(textView12);
                Resources resources = textView12.getResources();
                Intrinsics.XXI(resources);
                color = resources.getColor(R.color.colorAccent);
            }
            textView11.setTextColor(color);
        }
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.v2_status_item_heart_rate_heath;
    }

    public final void setViewHidden(int i, boolean z) {
        AppCompatImageView appCompatImageView = this.mBadIv;
        int i2 = 8;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(i == 0 ? 0 : 8);
        }
        AppCompatImageView appCompatImageView2 = this.mMediumIv;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setVisibility(i == 1 ? 0 : 8);
        }
        AppCompatImageView appCompatImageView3 = this.mGoodIv;
        if (appCompatImageView3 != null) {
            appCompatImageView3.setVisibility(i == 2 ? 0 : 8);
        }
        AppCompatImageView appCompatImageView4 = this.mHighestIv;
        if (appCompatImageView4 != null) {
            appCompatImageView4.setVisibility(i == 3 ? 0 : 8);
        }
        TextView textView = this.mBadTv;
        if (textView != null) {
            textView.setVisibility(i > -1 ? 0 : 8);
        }
        TextView textView2 = this.mMediumTv;
        if (textView2 != null) {
            textView2.setVisibility(i > -1 ? 0 : 8);
        }
        TextView textView3 = this.mGoodTv;
        if (textView3 != null) {
            textView3.setVisibility(i > -1 ? 0 : 8);
        }
        TextView textView4 = this.mHighestTv;
        if (textView4 != null) {
            if (z && i > -1) {
                i2 = 0;
            }
            textView4.setVisibility(i2);
        }
    }

    public HeathAIAnalyzeItem(@aa1 TodayData item) {
        Intrinsics.X0O(item, "item");
        this.item = item;
    }

    public /* synthetic */ HeathAIAnalyzeItem(TodayData todayData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TodayData(0L, null, null, null, 0, null, 0, null, 0.0f, 0.0f, 1023, null) : todayData);
    }
}
