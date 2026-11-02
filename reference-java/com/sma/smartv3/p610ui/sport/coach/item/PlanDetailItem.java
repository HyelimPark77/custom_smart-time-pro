package com.sma.smartv3.p610ui.sport.coach.item;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.OXI1i1;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.DslViewHolder;
import com.bestmafen.androidbase.dsl.BaseDslItem;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.p610ui.sport.coach.AICoachManage;
import com.sma.smartv3.p610ui.sport.coach.CreatePlanActivity;
import com.sma.smartv3.p610ui.sport.coach.item.PlanDetailItem;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleAICoachGeneratePlan;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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

    private final int differenceTime(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        i1O0OXO1O.OXO1.OXO1("planDetail differenceTime time=" + j + "  , currentTimeMillis = " + System.currentTimeMillis());
        if (j > System.currentTimeMillis()) {
            return 1;
        }
        return ((int) (jCurrentTimeMillis / ((long) 86400000))) + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(final PlanDetailItem planDetailItem, View view) {
        ImageView imageView = planDetailItem.planArrowIv;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.XXO("planArrowIv");
            imageView = null;
        }
        Object systemService = imageView.getContext().getSystemService("layout_inflater");
        Intrinsics.X1ii(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_plan_layout, (ViewGroup) null);
        Intrinsics.O10IXXX0X(viewInflate, "inflate(...)");
        PopupWindow popupWindow = planDetailItem.mPopupWindow;
        if (popupWindow == null) {
            planDetailItem.mPopupWindow = new PopupWindow(viewInflate, -2, -2);
        } else if (popupWindow != null) {
            popupWindow.dismiss();
        }
        PopupWindow popupWindow2 = planDetailItem.mPopupWindow;
        if (popupWindow2 != null) {
            popupWindow2.setFocusable(true);
        }
        int[] iArr = new int[2];
        ImageView imageView3 = planDetailItem.planArrowIv;
        if (imageView3 == null) {
            Intrinsics.XXO("planArrowIv");
            imageView3 = null;
        }
        imageView3.getLocationOnScreen(iArr);
        int i = iArr[0];
        ImageView imageView4 = planDetailItem.planArrowIv;
        if (imageView4 == null) {
            Intrinsics.XXO("planArrowIv");
            imageView4 = null;
        }
        int width = i + (i - imageView4.getWidth());
        ImageView imageView5 = planDetailItem.planArrowIv;
        if (imageView5 == null) {
            Intrinsics.XXO("planArrowIv");
            imageView5 = null;
        }
        int iXIi00iiXO = width + OXI1i1.XIi00iiXO(imageView5.getContext(), 20.0f);
        int i2 = iArr[1];
        ImageView imageView6 = planDetailItem.planArrowIv;
        if (imageView6 == null) {
            Intrinsics.XXO("planArrowIv");
            imageView6 = null;
        }
        int height = i2 + imageView6.getHeight();
        PopupWindow popupWindow3 = planDetailItem.mPopupWindow;
        if (popupWindow3 != null) {
            ImageView imageView7 = planDetailItem.planArrowIv;
            if (imageView7 == null) {
                Intrinsics.XXO("planArrowIv");
            } else {
                imageView2 = imageView7;
            }
            popupWindow3.showAtLocation(imageView2, 0, iXIi00iiXO - 10, height);
        }
        final View viewFindViewById = viewInflate.findViewById(R.id.popup_make_plans_again);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.dx1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PlanDetailItem.initView$lambda$0$0(this.f6288IO, viewFindViewById, view2);
            }
        });
        viewInflate.findViewById(R.id.popup_terminate_plan).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ex1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PlanDetailItem.initView$lambda$0$1(this.f6508IO, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0$0(PlanDetailItem planDetailItem, final View view, View view2) {
        if (i72.OXO1.iOIi00Ii()) {
            X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.fx1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return PlanDetailItem.initView$lambda$0$0$0(view, (BleConnector) obj);
                }
            }, 1, null);
        } else {
            ToastUtils.showLong(R.string.abh_login_tip);
        }
        PopupWindow popupWindow = planDetailItem.mPopupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$0$0$0(View view, BleConnector it) {
        Intrinsics.X0O(it, "it");
        Intent intent = new Intent(view.getContext(), (Class<?>) CreatePlanActivity.class);
        intent.putExtra("type", 1);
        view.getContext().startActivity(intent);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0$1(PlanDetailItem planDetailItem, View view) {
        I01XX0.XIi00iiXO(I01XX0.XOIO11O, null, 2, null);
        PopupWindow popupWindow = planDetailItem.mPopupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    private final void setCompletedTime(int i, int i2) {
        String str;
        TextView textView = this.currentDay;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.XXO("currentDay");
            textView = null;
        }
        TextView textView3 = this.currentDay;
        if (textView3 == null) {
            Intrinsics.XXO("currentDay");
        } else {
            textView2 = textView3;
        }
        Context context = textView2.getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        if (UtilsKt.IXI(context)) {
            str = i + "/" + i2 + " " + UtilsKt.XXO(R.string.days);
        } else {
            str = UtilsKt.XXO(R.string.days) + " " + i + "/" + i2;
        }
        textView.setText(str);
    }

    public static /* synthetic */ void setCompletedTime$default(PlanDetailItem planDetailItem, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCompletedTime");
        }
        if ((i3 & 1) != 0) {
            i = 1;
        }
        if ((i3 & 2) != 0) {
            i2 = 28;
        }
        planDetailItem.setCompletedTime(i, i2);
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void bindView(@aa1 DslViewHolder itemHolder) {
        Intrinsics.X0O(itemHolder, "itemHolder");
        View viewM3483v = itemHolder.m3483v(R.id.plan_detail_day_tv);
        Intrinsics.XXI(viewM3483v);
        this.currentDay = (TextView) viewM3483v;
        View viewM3483v2 = itemHolder.m3483v(R.id.plan_detail_completed_tv);
        Intrinsics.XXI(viewM3483v2);
        this.currentCompleted = (TextView) viewM3483v2;
        View viewM3483v3 = itemHolder.m3483v(R.id.plan_detail_progress);
        Intrinsics.XXI(viewM3483v3);
        this.currentProgress = (ProgressBar) viewM3483v3;
        View viewM3483v4 = itemHolder.m3483v(R.id.plan_cumulative_exercise_time_tv);
        Intrinsics.XXI(viewM3483v4);
        this.cumulativeTime = (TextView) viewM3483v4;
        View viewM3483v5 = itemHolder.m3483v(R.id.plan_cumulative_mets_tv);
        Intrinsics.XXI(viewM3483v5);
        this.cumulativeMETS = (TextView) viewM3483v5;
        View viewM3483v6 = itemHolder.m3483v(R.id.plan_cumulative_calories_tv);
        Intrinsics.XXI(viewM3483v6);
        this.cumulativeCalories = (TextView) viewM3483v6;
        View viewM3483v7 = itemHolder.m3483v(R.id.plan_detail_arrow_iv);
        Intrinsics.XXI(viewM3483v7);
        this.planArrowIv = (ImageView) viewM3483v7;
    }

    @tb1
    public final PopupWindow getMPopupWindow() {
        return this.mPopupWindow;
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public void initView() {
        PlanDetailItem planDetailItem;
        ImageView imageView = null;
        setCompletedTime$default(this, 0, 0, 3, null);
        TextView textView = this.currentCompleted;
        if (textView == null) {
            Intrinsics.XXO("currentCompleted");
            textView = null;
        }
        AICoachManage.OXO1 oxo1 = AICoachManage.IiI10X;
        textView.setText(oxo1.OXO1().X0O().getMProgress() + "% " + UtilsKt.XXO(R.string.coach_plan_complete));
        ProgressBar progressBar = this.currentProgress;
        if (progressBar == null) {
            Intrinsics.XXO("currentProgress");
            progressBar = null;
        }
        progressBar.setMax(100);
        ProgressBar progressBar2 = this.currentProgress;
        if (progressBar2 == null) {
            Intrinsics.XXO("currentProgress");
            progressBar2 = null;
        }
        progressBar2.setProgress(oxo1.OXO1().X0O().getMProgress());
        TextView textView2 = this.cumulativeTime;
        if (textView2 == null) {
            Intrinsics.XXO("cumulativeTime");
            textView2 = null;
        }
        textView2.setText(oxo1.OXO1().X0O().getMAllExerciseTime() + " " + UtilsKt.XXO(R.string.min));
        TextView textView3 = this.cumulativeMETS;
        if (textView3 == null) {
            Intrinsics.XXO("cumulativeMETS");
            textView3 = null;
        }
        textView3.setText(((int) oxo1.OXO1().X0O().getMAll_METS()) + " " + UtilsKt.XXO(R.string.abh_mets_unit));
        TextView textView4 = this.cumulativeCalories;
        if (textView4 == null) {
            Intrinsics.XXO("cumulativeCalories");
            textView4 = null;
        }
        textView4.setText(oxo1.OXO1().X0O().getMAllCalorie() + " " + UtilsKt.XXO(R.string.kcal));
        if (oxo1.OXO1().I0iXXO() != null) {
            int iDifferenceTime = differenceTime(oxo1.OXO1().X0O().getStartTime());
            BleAICoachGeneratePlan bleAICoachGeneratePlanI0iXXO = oxo1.OXO1().I0iXXO();
            int mProgress = bleAICoachGeneratePlanI0iXXO != null ? bleAICoachGeneratePlanI0iXXO.getMProgress() : 0;
            BleAICoachGeneratePlan bleAICoachGeneratePlanI0iXXO2 = oxo1.OXO1().I0iXXO();
            int mProgress2 = bleAICoachGeneratePlanI0iXXO2 != null ? bleAICoachGeneratePlanI0iXXO2.getMProgress() : 0;
            BleAICoachGeneratePlan bleAICoachGeneratePlanI0iXXO3 = oxo1.OXO1().I0iXXO();
            int mAllExerciseTime = bleAICoachGeneratePlanI0iXXO3 != null ? bleAICoachGeneratePlanI0iXXO3.getMAllExerciseTime() : 0;
            BleAICoachGeneratePlan bleAICoachGeneratePlanI0iXXO4 = oxo1.OXO1().I0iXXO();
            int mAll_METS = bleAICoachGeneratePlanI0iXXO4 != null ? (int) bleAICoachGeneratePlanI0iXXO4.getMAll_METS() : 0;
            BleAICoachGeneratePlan bleAICoachGeneratePlanI0iXXO5 = oxo1.OXO1().I0iXXO();
            planDetailItem = this;
            planDetailItem.setPlanDetail(iDifferenceTime, 28, mProgress, mProgress2, mAllExerciseTime, mAll_METS, bleAICoachGeneratePlanI0iXXO5 != null ? bleAICoachGeneratePlanI0iXXO5.getMAllCalorie() : 0);
        } else {
            planDetailItem = this;
        }
        ImageView imageView2 = planDetailItem.planArrowIv;
        if (imageView2 == null) {
            Intrinsics.XXO("planArrowIv");
        } else {
            imageView = imageView2;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.cx1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlanDetailItem.initView$lambda$0(this.f6072IO, view);
            }
        });
    }

    @Override // com.bestmafen.androidbase.dsl.BaseDslItem
    public int layoutId() {
        return R.layout.coach_item_plan_detail;
    }

    public final void setMPopupWindow(@tb1 PopupWindow popupWindow) {
        this.mPopupWindow = popupWindow;
    }

    public final void setPlanDetail(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        setCompletedTime(i, i2);
        TextView textView = this.currentCompleted;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.XXO("currentCompleted");
            textView = null;
        }
        textView.setText(i3 + "% " + UtilsKt.XXO(R.string.coach_plan_complete));
        ProgressBar progressBar = this.currentProgress;
        if (progressBar == null) {
            Intrinsics.XXO("currentProgress");
            progressBar = null;
        }
        progressBar.setMax(100);
        ProgressBar progressBar2 = this.currentProgress;
        if (progressBar2 == null) {
            Intrinsics.XXO("currentProgress");
            progressBar2 = null;
        }
        progressBar2.setProgress(i4);
        TextView textView3 = this.cumulativeTime;
        if (textView3 == null) {
            Intrinsics.XXO("cumulativeTime");
            textView3 = null;
        }
        textView3.setText(i5 + " " + UtilsKt.XXO(R.string.min));
        TextView textView4 = this.cumulativeMETS;
        if (textView4 == null) {
            Intrinsics.XXO("cumulativeMETS");
            textView4 = null;
        }
        textView4.setText(i6 + " " + UtilsKt.XXO(R.string.abh_mets_unit));
        TextView textView5 = this.cumulativeCalories;
        if (textView5 == null) {
            Intrinsics.XXO("cumulativeCalories");
        } else {
            textView2 = textView5;
        }
        textView2.setText(i7 + " " + UtilsKt.XXO(R.string.kcal));
    }
}
