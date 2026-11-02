package com.sma.smartv3.ui.sport.coach.item;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.OXI1i1;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cx1;
import com.android.mltcode.paycertificationapi.dx1;
import com.android.mltcode.paycertificationapi.ex1;
import com.android.mltcode.paycertificationapi.fx1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.sport.coach.AICoachManage;
import com.sma.smartv3.ui.sport.coach.CreatePlanActivity;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleAICoachGeneratePlan;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class PlanDetailItem extends BaseDslItem {
    private TextView cumulativeCalories;
    private TextView cumulativeMETS;
    private TextView cumulativeTime;
    private TextView currentCompleted;
    private TextView currentDay;
    private ProgressBar currentProgress;

    @tb1
    private PopupWindow mPopupWindow;
    private ImageView planArrowIv;

    public PlanDetailItem() {
    }

    public static /* synthetic */ void I0IIOi(PlanDetailItem r0, View r1, View r2) {
        initView$lambda$0$0(r0, r1, r2);
    }

    public static /* synthetic */ void IiI10X(PlanDetailItem r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ void O00(PlanDetailItem r0, View r1) {
        initView$lambda$0$1(r0, r1);
    }

    public static /* synthetic */ Unit XOO0ii0(View r0, BleConnector r1) {
        return initView$lambda$0$0$0(r0, r1);
    }

    private final int differenceTime(long r8) {
        long r0 = System.currentTimeMillis() - r8;
        i1O0OXO1O.OXO1.OXO1("planDetail differenceTime time=" + r8 + "  , currentTimeMillis = " + System.currentTimeMillis());
        if (r8 <= System.currentTimeMillis()) goto L6;
        return 1;
    L6:
        return ((int) (r0 / ((long) 86400000))) + 1;
    }

    private static final void initView$lambda$0(final PlanDetailItem r8, View r9) {
        ImageView r10 = r8.planArrowIv;
        ImageView r1 = null;
        if (r10 != null) goto L5;
        Intrinsics.XXO("planArrowIv");
        r10 = null;
    L5:
        Object r11 = r10.getContext().getSystemService("layout_inflater");
        Intrinsics.X1ii(r11, "null cannot be cast to non-null type android.view.LayoutInflater");
        View r12 = ((LayoutInflater) r11).inflate(R.layout.popup_plan_layout, null);
        Intrinsics.O10IXXX0X(r12, "inflate(...)");
        PopupWindow r2 = r8.mPopupWindow;
        if (r2 != null) goto L8;
        r8.mPopupWindow = new PopupWindow(r12, -2, -2);
    L10:
        PopupWindow r3 = r8.mPopupWindow;
        if (r3 == null) goto L13;
        r3.setFocusable(true);
    L13:
        int[] r4 = new int[2];
        ImageView r5 = r8.planArrowIv;
        if (r5 != null) goto L16;
        Intrinsics.XXO("planArrowIv");
        r5 = null;
    L16:
        r5.getLocationOnScreen(r4);
        int r6 = r4[0];
        ImageView r7 = r8.planArrowIv;
        if (r7 != null) goto L19;
        Intrinsics.XXO("planArrowIv");
        r7 = null;
    L19:
        int r13 = r6 + (r6 - r7.getWidth());
        ImageView r14 = r8.planArrowIv;
        if (r14 != null) goto L22;
        Intrinsics.XXO("planArrowIv");
        r14 = null;
    L22:
        int r15 = r13 + OXI1i1.XIi00iiXO(r14.getContext(), 20.0f);
        int r16 = r4[1];
        ImageView r17 = r8.planArrowIv;
        if (r17 != null) goto L25;
        Intrinsics.XXO("planArrowIv");
        r17 = null;
    L25:
        int r18 = r16 + r17.getHeight();
        PopupWindow r19 = r8.mPopupWindow;
        if (r19 == null) goto L32;
        ImageView r20 = r8.planArrowIv;
        if (r20 != null) goto L30;
        Intrinsics.XXO("planArrowIv");
    L31:
        r19.showAtLocation(r1, 0, r15 - 10, r18);
        goto L32
    L30:
        r1 = r20;
    L32:
        final View r0 = r12.findViewById(R.id.popup_make_plans_again);
        r0.setOnClickListener(new dx1(r8, r0));
        r12.findViewById(R.id.popup_terminate_plan).setOnClickListener(new ex1(r8));
        return;
    L8:
        if (r2 == null) goto L10;
        r2.dismiss();
        goto L10
    }

    private static final void initView$lambda$0$0(PlanDetailItem r2, final View r3, View r4) {
        if (i72.OXO1.iOIi00Ii() == false) goto L5;
        X0IOiX1O.XIi00iiXO(false, new fx1(r3), 1, null);
    L6:
        PopupWindow r5 = r2.mPopupWindow;
        if (r5 == null) goto L10;
        r5.dismiss();
        return;
    L10:
        return;
    L5:
        ToastUtils.showLong(R.string.abh_login_tip);
        goto L6
    }

    private static final Unit initView$lambda$0$0$0(View r2, BleConnector r3) {
        Intrinsics.X0O(r3, "it");
        Intent r4 = new Intent(r2.getContext(), CreatePlanActivity.class);
        r4.putExtra("type", 1);
        r2.getContext().startActivity(r4);
        return Unit.OXO1;
    }

    private static final void initView$lambda$0$1(PlanDetailItem r2, View r3) {
        I01XX0.XIi00iiXO(I01XX0.XOIO11O, null, 2, null);
        PopupWindow r4 = r2.mPopupWindow;
        if (r4 == null) goto L6;
        r4.dismiss();
        return;
    }

    private final void setCompletedTime(int r6, int r7) {
        TextView r0 = this.currentDay;
        TextView r1 = null;
        if (r0 != null) goto L5;
        Intrinsics.XXO("currentDay");
        r0 = null;
    L5:
        TextView r3 = this.currentDay;
        if (r3 != null) goto L8;
        Intrinsics.XXO("currentDay");
    L9:
        Context r2 = r1.getContext();
        Intrinsics.O10IXXX0X(r2, "getContext(...)");
        if (UtilsKt.IXI(r2) == false) goto L12;
        String r8 = r6 + "/" + r7 + " " + UtilsKt.XXO(R.string.days);
    L13:
        r0.setText(r8);
        return;
    L12:
        r8 = UtilsKt.XXO(R.string.days) + " " + r6 + "/" + r7;
        goto L13
    L8:
        r1 = r3;
        goto L9
    }

    public static /* synthetic */ void setCompletedTime$default(PlanDetailItem r0, int r1, int r2, int r3, Object r4) {
        if (r4 != null) goto L12;
        if ((r3 & 1) == 0) goto L7;
        r1 = 1;
    L7:
        if ((r3 & 2) == 0) goto L9;
        r2 = 28;
    L9:
        r0.setCompletedTime(r1, r2);
        return;
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCompletedTime");
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder r2) {
        Intrinsics.X0O(r2, "itemHolder");
        View r0 = r2.v(R.id.plan_detail_day_tv);
        Intrinsics.XXI(r0);
        this.currentDay = (TextView) r0;
        View r1 = r2.v(R.id.plan_detail_completed_tv);
        Intrinsics.XXI(r1);
        this.currentCompleted = (TextView) r1;
        View r3 = r2.v(R.id.plan_detail_progress);
        Intrinsics.XXI(r3);
        this.currentProgress = (ProgressBar) r3;
        View r4 = r2.v(R.id.plan_cumulative_exercise_time_tv);
        Intrinsics.XXI(r4);
        this.cumulativeTime = (TextView) r4;
        View r5 = r2.v(R.id.plan_cumulative_mets_tv);
        Intrinsics.XXI(r5);
        this.cumulativeMETS = (TextView) r5;
        View r6 = r2.v(R.id.plan_cumulative_calories_tv);
        Intrinsics.XXI(r6);
        this.cumulativeCalories = (TextView) r6;
        View r7 = r2.v(R.id.plan_detail_arrow_iv);
        Intrinsics.XXI(r7);
        this.planArrowIv = (ImageView) r7;
    }

    @tb1
    public final PopupWindow getMPopupWindow() {
        return this.mPopupWindow;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        int r0 = 0;
        ImageView r2 = null;
        setCompletedTime$default(this, 0, 0, 3, null);
        TextView r1 = this.currentCompleted;
        if (r1 != null) goto L5;
        Intrinsics.XXO("currentCompleted");
        r1 = null;
    L5:
        AICoachManage.OXO1 r3 = AICoachManage.IiI10X;
        r1.setText(r3.OXO1().X0O().getMProgress() + "% " + UtilsKt.XXO(R.string.coach_plan_complete));
        ProgressBar r4 = this.currentProgress;
        if (r4 != null) goto L8;
        Intrinsics.XXO("currentProgress");
        r4 = null;
    L8:
        r4.setMax(100);
        ProgressBar r5 = this.currentProgress;
        if (r5 != null) goto L11;
        Intrinsics.XXO("currentProgress");
        r5 = null;
    L11:
        r5.setProgress(r3.OXO1().X0O().getMProgress());
        TextView r6 = this.cumulativeTime;
        if (r6 != null) goto L14;
        Intrinsics.XXO("cumulativeTime");
        r6 = null;
    L14:
        r6.setText(r3.OXO1().X0O().getMAllExerciseTime() + " " + UtilsKt.XXO(R.string.min));
        TextView r7 = this.cumulativeMETS;
        if (r7 != null) goto L17;
        Intrinsics.XXO("cumulativeMETS");
        r7 = null;
    L17:
        r7.setText(((int) r3.OXO1().X0O().getMAll_METS()) + " " + UtilsKt.XXO(R.string.abh_mets_unit));
        TextView r8 = this.cumulativeCalories;
        if (r8 != null) goto L20;
        Intrinsics.XXO("cumulativeCalories");
        r8 = null;
    L20:
        r8.setText(r3.OXO1().X0O().getMAllCalorie() + " " + UtilsKt.XXO(R.string.kcal));
        if (r3.OXO1().I0iXXO() == null) goto L42;
        int r9 = differenceTime(r3.OXO1().X0O().getStartTime());
        BleAICoachGeneratePlan r10 = r3.OXO1().I0iXXO();
        if (r10 == null) goto L25;
        int r11 = r10.getMProgress();
    L26:
        BleAICoachGeneratePlan r12 = r3.OXO1().I0iXXO();
        if (r12 == null) goto L29;
        int r13 = r12.getMProgress();
    L30:
        BleAICoachGeneratePlan r14 = r3.OXO1().I0iXXO();
        if (r14 == null) goto L33;
        int r15 = r14.getMAllExerciseTime();
    L34:
        BleAICoachGeneratePlan r16 = r3.OXO1().I0iXXO();
        if (r16 == null) goto L37;
        int r17 = (int) r16.getMAll_METS();
    L38:
        BleAICoachGeneratePlan r18 = r3.OXO1().I0iXXO();
        if (r18 == null) goto L41;
        r0 = r18.getMAllCalorie();
    L41:
        PlanDetailItem r19 = this;
        r19.setPlanDetail(r9, 28, r11, r13, r15, r17, r0);
    L43:
        ImageView r20 = r19.planArrowIv;
        if (r20 != null) goto L46;
        Intrinsics.XXO("planArrowIv");
    L47:
        r2.setOnClickListener(new cx1(this));
        return;
    L46:
        r2 = r20;
        goto L47
    L37:
        r17 = 0;
        goto L38
    L33:
        r15 = 0;
        goto L34
    L29:
        r13 = 0;
        goto L30
    L25:
        r11 = 0;
        goto L26
    L42:
        r19 = this;
        goto L43
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.coach_item_plan_detail;
    }

    public final void setMPopupWindow(@tb1 PopupWindow r1) {
        this.mPopupWindow = r1;
    }

    public final void setPlanDetail(int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
        setCompletedTime(r3, r4);
        TextView r10 = this.currentCompleted;
        TextView r11 = null;
        if (r10 != null) goto L5;
        Intrinsics.XXO("currentCompleted");
        r10 = null;
    L5:
        r10.setText(r5 + "% " + UtilsKt.XXO(R.string.coach_plan_complete));
        ProgressBar r12 = this.currentProgress;
        if (r12 != null) goto L8;
        Intrinsics.XXO("currentProgress");
        r12 = null;
    L8:
        r12.setMax(100);
        ProgressBar r13 = this.currentProgress;
        if (r13 != null) goto L11;
        Intrinsics.XXO("currentProgress");
        r13 = null;
    L11:
        r13.setProgress(r6);
        TextView r14 = this.cumulativeTime;
        if (r14 != null) goto L14;
        Intrinsics.XXO("cumulativeTime");
        r14 = null;
    L14:
        r14.setText(r7 + " " + UtilsKt.XXO(R.string.min));
        TextView r15 = this.cumulativeMETS;
        if (r15 != null) goto L17;
        Intrinsics.XXO("cumulativeMETS");
        r15 = null;
    L17:
        r15.setText(r8 + " " + UtilsKt.XXO(R.string.abh_mets_unit));
        TextView r16 = this.cumulativeCalories;
        if (r16 != null) goto L20;
        Intrinsics.XXO("cumulativeCalories");
    L21:
        r11.setText(r9 + " " + UtilsKt.XXO(R.string.kcal));
        return;
    L20:
        r11 = r16;
        goto L21
    }
}
