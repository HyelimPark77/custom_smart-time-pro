package com.sma.smartv3.ui.status.item;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.XO00iX1i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iz3;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.angcyo.dsladapter.LibExKt;
import com.baidu.platform.comapi.map.MapController;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.sma.smartv3.model.BloodGlucose2DataKt;
import com.sma.smartv3.model.TodayData;
import com.sma.smartv3.model.WeightMeasureDataKt;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.main.MainActivity;
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

    public static /* synthetic */ void O00(HeathAIAnalyzeItem r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    private final void initBarView() {
        ArrayList r0 = new ArrayList();
        Context r5 = null;
        float r2 = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(3.4f, 0.0f, 2, null);
        float r7 = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.1f, 0.0f, 2, null);
        Context r8 = this.mContext;
        if (r8 != null) goto L5;
        Intrinsics.XXO("mContext");
        r8 = null;
    L5:
        int r9 = r8.getResources().getColor(R.color.bg_level_color_normal_bg);
        Context r10 = this.mContext;
        if (r10 != null) goto L8;
        Intrinsics.XXO("mContext");
        r10 = null;
    L8:
        r0.add(new iz3(r2, r7, r9, r10.getResources().getColor(R.color.bg_level_color_normal)));
        float r3 = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.1f, 0.0f, 2, null);
        float r11 = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.9f, 0.0f, 2, null);
        Context r12 = this.mContext;
        if (r12 != null) goto L11;
        Intrinsics.XXO("mContext");
        r12 = null;
    L11:
        int r13 = r12.getResources().getColor(R.color.bg_level_color_prediabetes_bg);
        Context r14 = this.mContext;
        if (r14 != null) goto L14;
        Intrinsics.XXO("mContext");
        r14 = null;
    L14:
        r0.add(new iz3(r3, r11, r13, r14.getResources().getColor(R.color.bg_level_color_prediabetes)));
        float r4 = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(6.9f, 0.0f, 2, null);
        float r6 = BloodGlucose2DataKt.getBloodGlucoseBarValue$default(8.1f, 0.0f, 2, null);
        Context r15 = this.mContext;
        if (r15 != null) goto L17;
        Intrinsics.XXO("mContext");
        r15 = null;
    L17:
        int r16 = r15.getResources().getColor(R.color.bg_level_color_diabetes_bg);
        Context r17 = this.mContext;
        if (r17 != null) goto L20;
        Intrinsics.XXO("mContext");
    L21:
        r0.add(new iz3(r4, r6, r16, r5.getResources().getColor(R.color.bg_level_color_diabetes)));
        SegmentedBarView2 r1 = this.barView;
        if (r1 == null) goto L24;
        r1.setSegments(r0);
    L24:
        SegmentedBarView2 r18 = this.barView;
        if (r18 == null) goto L27;
        LibExKt.I0XXi0X(r18, true);
    L27:
        LinearLayout r19 = this.barViewTipLayout;
        if (r19 == null) goto L31;
        LibExKt.I0XXi0X(r19, true);
        return;
    L31:
        return;
    L20:
        r5 = r17;
        goto L21
    }

    private static final void initView$lambda$0(HeathAIAnalyzeItem r3, View r4) {
        Context r5 = r3.mContext;
        Context r0 = null;
        if (r5 != null) goto L5;
        Intrinsics.XXO("mContext");
        r5 = null;
    L5:
        Context r6 = r3.mContext;
        if (r6 != null) goto L8;
        Intrinsics.XXO("mContext");
    L9:
        r5.startActivity(new Intent(r0, MainActivity.class));
        return;
    L8:
        r0 = r6;
        goto L9
    }

    private final void setBmi(double r10, List<Double> r12, String[] r13, int[] r14) {
        CircleThumbSegmentedBarView r0 = this.mSbvBmi;
        Intrinsics.XXI(r0);
        WeightMeasureDataKt.setBarView$default(r0, r10, r12, r13, r14, false, 32, null);
        CircleThumbSegmentedBarView r11 = this.mSbvBmi;
        if (r11 == null) goto L6;
        LibExKt.I0XXi0X(r11, true);
        return;
    }

    public static /* synthetic */ void setViewHidden$default(HeathAIAnalyzeItem r0, int r1, boolean r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = -1;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = false;
    L8:
        r0.setViewHidden(r1, r2);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r5) {
        Intrinsics.X0O(r5, "itemHolder");
        Context r0 = r5.getContext();
        Intrinsics.O10IXXX0X(r0, "<get-context>(...)");
        this.mContext = r0;
        View r1 = r5.view(R.id.tv_heart_rate);
        Intrinsics.X1ii(r1, "null cannot be cast to non-null type android.widget.TextView");
        this.mValueTitle = (TextView) r1;
        View r2 = r5.view(R.id.tv_hr_zone);
        Intrinsics.X1ii(r2, "null cannot be cast to non-null type android.widget.TextView");
        this.mValueState = (TextView) r2;
        View r3 = r5.view(R.id.tv_heart_rate_value);
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type android.widget.TextView");
        this.mValueTime = (TextView) r3;
        View r4 = r5.view(R.id.tv_ave_value);
        Intrinsics.X1ii(r4, "null cannot be cast to non-null type android.widget.TextView");
        this.mValueFront = (TextView) r4;
        View r6 = r5.view(R.id.sbv_bmi);
        Intrinsics.X1ii(r6, "null cannot be cast to non-null type com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView");
        CircleThumbSegmentedBarView r7 = (CircleThumbSegmentedBarView) r6;
        this.mSbvBmi = r7;
        if (r7 == null) goto L5;
        r7.setVisibility(8);
    L5:
        View r8 = r5.view(R.id.bar_view);
        Intrinsics.X1ii(r8, "null cannot be cast to non-null type com.sma.smartv3.view.segmentedbar.SegmentedBarView2");
        SegmentedBarView2 r9 = (SegmentedBarView2) r8;
        this.barView = r9;
        if (r9 == null) goto L8;
        r9.setVisibility(8);
    L8:
        View r10 = r5.view(R.id.ll_bar_view);
        Intrinsics.X1ii(r10, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout r11 = (LinearLayout) r10;
        this.barViewTipLayout = r11;
        if (r11 == null) goto L11;
        r11.setVisibility(8);
    L11:
        View r12 = r5.view(R.id.iv_bad);
        Intrinsics.X1ii(r12, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
        this.mBadIv = (AppCompatImageView) r12;
        View r13 = r5.view(R.id.tv_bad);
        Intrinsics.X1ii(r13, "null cannot be cast to non-null type android.widget.TextView");
        this.mBadTv = (TextView) r13;
        View r14 = r5.view(R.id.iv_general);
        Intrinsics.X1ii(r14, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
        this.mMediumIv = (AppCompatImageView) r14;
        View r15 = r5.view(R.id.tv_general);
        Intrinsics.X1ii(r15, "null cannot be cast to non-null type android.widget.TextView");
        this.mMediumTv = (TextView) r15;
        View r16 = r5.view(R.id.iv_good);
        Intrinsics.X1ii(r16, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
        this.mGoodIv = (AppCompatImageView) r16;
        View r17 = r5.view(R.id.tv_good);
        Intrinsics.X1ii(r17, "null cannot be cast to non-null type android.widget.TextView");
        this.mGoodTv = (TextView) r17;
        View r18 = r5.view(R.id.iv_highest);
        Intrinsics.X1ii(r18, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
        this.mHighestIv = (AppCompatImageView) r18;
        View r19 = r5.view(R.id.tv_highest);
        Intrinsics.X1ii(r19, "null cannot be cast to non-null type android.widget.TextView");
        this.mHighestTv = (TextView) r19;
        setViewHidden$default(this, 0, false, 3, null);
        View r20 = r5.view(R.id.tv_ai_analysis);
        Intrinsics.X1ii(r20, "null cannot be cast to non-null type android.widget.TextView");
        this.mAiAnalysisTitle = (TextView) r20;
        View r21 = r5.view(R.id.tv_ai_analysis_content);
        Intrinsics.X1ii(r21, "null cannot be cast to non-null type android.widget.TextView");
        this.mAiAnalysisResult = (TextView) r21;
        View r22 = r5.view(R.id.tv_avg_bpm_value);
        Intrinsics.X1ii(r22, "null cannot be cast to non-null type android.widget.TextView");
        this.mValueTv = (TextView) r22;
        View r23 = r5.view(R.id.tv_generate_report);
        Intrinsics.X1ii(r23, "null cannot be cast to non-null type android.widget.TextView");
        this.mCommonBtn = (TextView) r23;
    }

    @aa1
    public final TodayData getItem() {
        return this.item;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        TextView r1 = this.mCommonBtn;
        if (r1 == null) goto L5;
        r1.setVisibility(8);
    L5:
        String r2 = this.item.getDataType();
        switch(r2.hashCode()) {
            case -1276242363: goto L41;
            case -791592328: goto L34;
            case -240915579: goto L28;
            case 109522647: goto L24;
            case 560044778: goto L20;
            case 1467734697: goto L16;
            case 1930449209: goto L9;
            default: goto L42;
        };
    L42:
        TextView r3 = this.mCommonBtn;
        if (r3 == null) goto L45;
        r3.setVisibility(0);
    L45:
        TextView r4 = this.mCommonBtn;
        if (r4 == null) goto L48;
        r4.setText(UtilsKt.XXO(R.string.go_to_sports));
    L48:
        TextView r5 = this.mCommonBtn;
        if (r5 == null) goto L59;
        r5.setOnClickListener(new XO00iX1i(this));
    L59:
        if (this.item.getMExtraInfo().length() <= 0) goto L63;
        LibExKt.I0XXi0X(this.mAiAnalysisTitle, true);
        LibExKt.I0XXi0X(this.mAiAnalysisResult, true);
        TextView r6 = this.mAiAnalysisResult;
        if (r6 == null) goto L64;
        r6.setText(this.item.getMExtraInfo());
    L64:
        TextView r7 = this.mValueTv;
        if (r7 == null) goto L67;
        r7.setText(this.item.getValue());
    L67:
        TextView r8 = this.mValueFront;
        if (r8 == null) goto L70;
        r8.setText(UtilsKt.XXO(R.string.ave_value) + ": ");
    L70:
        TextView r9 = this.mValueState;
        if (r9 == null) goto L74;
        r9.setText(this.item.getState());
    L74:
        if (this.item.getTime() == 0) goto L78;
        TextView r10 = this.mValueTime;
        if (r10 == null) goto L78;
        r10.setText(O0X11OiO.i0X000X0O(false, false, 3, null).format(Long.valueOf(this.item.getTime())));
    L78:
        TextView r11 = this.mValueTitle;
        if (r11 == null) goto L81;
        r11.setText(this.item.getTitle() + ": ");
    L81:
        TextView r12 = this.mValueState;
        if (r12 == null) goto L93;
        int r13 = this.item.getStateColor();
        if (r13 == 0) goto L90;
        if (r13 == 1) goto L89;
        if (r13 == 2) goto L88;
        int r14 = -65536;
    L91:
        r12.setTextColor(r14);
        return;
    L88:
        r14 = -16711936;
        goto L91
    L89:
        TextView r15 = this.mValueState;
        Intrinsics.XXI(r15);
        Resources r16 = r15.getResources();
        Intrinsics.XXI(r16);
        r14 = r16.getColor(R.color.colorAccent);
        goto L91
    L90:
        r14 = Color.parseColor("#FE6D00");
        goto L91
    L93:
        return;
    L63:
        LibExKt.XX1Oi(this.mAiAnalysisTitle, true);
        LibExKt.XX1Oi(this.mAiAnalysisResult, true);
        goto L64
    L9:
        if (r2.equals("heart_rate") == false) goto L42;
        Context r17 = this.mContext;
        if (r17 != null) goto L14;
        Intrinsics.XXO("mContext");
        r17 = null;
    L14:
        r17.getResources().getColor(R.color.colorAccent);
        setBmi(this.item.getValue1(), CollectionsKt__CollectionsKt.iXiX011(new Double[]{Double.valueOf(0.0d), Double.valueOf(60.0d), Double.valueOf(100.0d), Double.valueOf(180.0d)}), new String[]{UtilsKt.XXO(R.string.lightness_low), UtilsKt.XXO(R.string.lightness_middle), UtilsKt.XXO(R.string.lightness_high)}, ArraysKt___ArraysKt.iiIX1(new Integer[]{-16776961, -16711936, -65536}));
        goto L59
    L16:
        if (r2.equals(q62.O001OXi) == false) goto L42;
        initBarView();
        goto L59
    L20:
        if (r2.equals(q62.OXOXXiI) == false) goto L42;
        setViewHidden$default(this, this.item.getStateColor(), false, 2, null);
        goto L59
    L24:
        if (r2.equals("sleep") == false) goto L42;
        setViewHidden(this.item.getStateColor(), true);
        goto L59
    L28:
        if (r2.equals(q62.IiOIO1OX) == false) goto L42;
        setBmi(this.item.getValue1(), CollectionsKt__CollectionsKt.iXiX011(new Double[]{Double.valueOf(0.0d), Double.valueOf(92.0d), Double.valueOf(100.0d)}), new String[]{UtilsKt.XXO(R.string.lightness_low), UtilsKt.XXO(R.string.bg_normal)}, ArraysKt___ArraysKt.iiIX1(new Integer[]{-16776961, -16711936}));
        CircleThumbSegmentedBarView r18 = this.mSbvBmi;
        if (r18 == null) goto L59;
        r18.setSegmentSideRule(0);
        goto L59
    L34:
        if (r2.equals("weight") == false) goto L42;
        double r19 = this.item.getValue1();
        List<Double> r20 = CollectionsKt__CollectionsKt.iXiX011(new Double[]{Double.valueOf(0.0d), Double.valueOf(18.4d), Double.valueOf(24.9d), Double.valueOf(29.9d)});
        String[] r21 = {UtilsKt.XXO(R.string.thin), UtilsKt.XXO(R.string.normal), UtilsKt.XXO(R.string.too_heavy), UtilsKt.XXO(R.string.class_1_obesity)};
        Context r110 = this.mContext;
        if (r110 != null) goto L39;
        Intrinsics.XXO("mContext");
        r110 = null;
    L39:
        setBmi(r19, r20, r21, ArraysKt___ArraysKt.iiIX1(new Integer[]{-16776961, -16711936, Integer.valueOf(r110.getResources().getColor(R.color.bg_level_color_prediabetes)), -65536}));
        goto L59
    L41:
        if (r2.equals(q62.IIII0II) == false) goto L42;
        double r22 = this.item.getValue1();
        List<Double> r23 = CollectionsKt__CollectionsKt.iXiX011(new Double[]{Double.valueOf(0.0d), Double.valueOf(25.0d), Double.valueOf(50.0d), Double.valueOf(75.0d), Double.valueOf(100.0d)});
        Context r24 = this.mContext;
        if (r24 != null) goto L54;
        Intrinsics.XXO("mContext");
        r24 = null;
    L54:
        String[] r25 = r24.getResources().getStringArray(R.array.level_range_4_2_bmi);
        Intrinsics.O10IXXX0X(r25, "getStringArray(...)");
        Context r26 = this.mContext;
        if (r26 != null) goto L57;
        Intrinsics.XXO("mContext");
        r26 = null;
    L57:
        int[] r27 = r26.getResources().getIntArray(R.array.level_color_4_2);
        Intrinsics.O10IXXX0X(r27, "getIntArray(...)");
        setBmi(r22, r23, r25, r27);
        goto L59
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.v2_status_item_heart_rate_heath;
    }

    public final void setViewHidden(int r6, boolean r7) {
        AppCompatImageView r0 = this.mBadIv;
        int r1 = 8;
        if (r0 == null) goto L8;
        if (r6 != 0) goto L6;
        int r3 = 0;
    L7:
        r0.setVisibility(r3);
        goto L8
    L6:
        r3 = 8;
    L8:
        AppCompatImageView r2 = this.mMediumIv;
        if (r2 != null) goto L11;
    L15:
        AppCompatImageView r4 = this.mGoodIv;
        if (r4 != null) goto L18;
    L22:
        AppCompatImageView r5 = this.mHighestIv;
        if (r5 != null) goto L25;
    L29:
        TextView r8 = this.mBadTv;
        if (r8 == null) goto L35;
        if (r6 <= (-1)) goto L33;
        int r9 = 0;
    L34:
        r8.setVisibility(r9);
        goto L35
    L33:
        r9 = 8;
    L35:
        TextView r10 = this.mMediumTv;
        if (r10 == null) goto L41;
        if (r6 <= (-1)) goto L39;
        int r11 = 0;
    L40:
        r10.setVisibility(r11);
        goto L41
    L39:
        r11 = 8;
    L41:
        TextView r12 = this.mGoodTv;
        if (r12 == null) goto L47;
        if (r6 <= (-1)) goto L45;
        int r13 = 0;
    L46:
        r12.setVisibility(r13);
        goto L47
    L45:
        r13 = 8;
    L47:
        TextView r14 = this.mHighestTv;
        if (r14 == null) goto L54;
        if (r7 == false) goto L52;
        if (r6 <= (-1)) goto L52;
        r1 = 0;
    L52:
        r14.setVisibility(r1);
        return;
    L54:
        return;
    L25:
        if (r6 != 3) goto L27;
        int r15 = 0;
    L28:
        r5.setVisibility(r15);
        goto L29
    L27:
        r15 = 8;
        goto L28
    L18:
        if (r6 != 2) goto L20;
        int r16 = 0;
    L21:
        r4.setVisibility(r16);
        goto L22
    L20:
        r16 = 8;
        goto L21
    L11:
        if (r6 != 1) goto L13;
        int r17 = 0;
    L14:
        r2.setVisibility(r17);
        goto L15
    L13:
        r17 = 8;
        goto L14
    }

    public HeathAIAnalyzeItem(@aa1 TodayData r2) {
        Intrinsics.X0O(r2, MapController.ITEM_LAYER_TAG);
        this.item = r2;
    }

    public /* synthetic */ HeathAIAnalyzeItem(TodayData r16, int r17, DefaultConstructorMarker r18) {
        if ((r17 & 1) == 0) goto L5;
        TodayData r1 = new TodayData(0, null, null, null, 0, null, 0, null, 0.0f, 0.0f, 1023, null);
    L6:
        this(r1);
        return;
    L5:
        r1 = r16;
        goto L6
    }
}
