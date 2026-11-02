package com.sma.smartv3.ui.status.fragment;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.u95;
import com.android.mltcode.paycertificationapi.v95;
import com.android.mltcode.paycertificationapi.w95;
import com.android.mltcode.paycertificationapi.x95;
import com.android.mltcode.paycertificationapi.y95;
import com.android.mltcode.paycertificationapi.z95;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.db.entity.Activity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.status.base.ActivityBaseDayFragment;
import com.sma.smartv3.util.HeathReportsUtils;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.PFMedium;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StepDayFragment extends ActivityBaseDayFragment {

    @aa1
    private final Lazy healthBtn$delegate;

    @aa1
    private final Lazy healthBtnView$delegate;

    @aa1
    private final Lazy healthLayout$delegate;

    @aa1
    private final Lazy healthQuestions$delegate;

    @aa1
    private final Lazy healthTipLayout$delegate;

    @aa1
    private final Lazy healthTv$delegate;

    public StepDayFragment() {
        this.healthLayout$delegate = LazyKt__LazyJVMKt.iO(new u95(this));
        this.healthBtn$delegate = LazyKt__LazyJVMKt.iO(new v95(this));
        this.healthTv$delegate = LazyKt__LazyJVMKt.iO(new w95(this));
        this.healthTipLayout$delegate = LazyKt__LazyJVMKt.iO(new x95(this));
        this.healthQuestions$delegate = LazyKt__LazyJVMKt.iO(new y95(this));
        this.healthBtnView$delegate = LazyKt__LazyJVMKt.iO(new z95(this));
    }

    public static /* synthetic */ LinearLayout OII(StepDayFragment r0) {
        return healthTipLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OX(StepDayFragment r0) {
        return healthTv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ LinearLayout OiIIX101O(StepDayFragment r0) {
        return healthLayout_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XX0(StepDayFragment r0) {
        return healthQuestions_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XiOIii1(StepDayFragment r0) {
        return healthBtnView_delegate$lambda$0(r0);
    }

    private final Button getHealthBtn() {
        return (Button) getValue();
    }

    private final View getHealthBtnView() {
        return (View) getValue();
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

    private static final View healthBtnView_delegate$lambda$0(StepDayFragment r1) {
        return r1.getMView().findViewById(R.id.health_btn_view);
    }

    private static final Button healthBtn_delegate$lambda$0(StepDayFragment r1) {
        return (Button) r1.getMView().findViewById(R.id.btn_common_heathy);
    }

    private static final LinearLayout healthLayout_delegate$lambda$0(StepDayFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.item_health_btn_layout);
    }

    private static final PFMedium healthQuestions_delegate$lambda$0(StepDayFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.tv_common_healthy_questions);
    }

    private static final LinearLayout healthTipLayout_delegate$lambda$0(StepDayFragment r1) {
        return (LinearLayout) r1.getMView().findViewById(R.id.questions_healthy_tip_layout);
    }

    private static final PFMedium healthTv_delegate$lambda$0(StepDayFragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.tv_common_heathy);
    }

    public static /* synthetic */ Button iIiiO(StepDayFragment r0) {
        return healthBtn_delegate$lambda$0(r0);
    }

    @Override // com.sma.smartv3.ui.status.base.ActivityBaseDayFragment
    public void filterData(@aa1 List<Activity> r14) {
        Intrinsics.X0O(r14, "data");
        super.filterData(r14);
        if (r14.isEmpty() == false) goto L5;
        getTwoValue().setText(UtilsKt.Ii1iii0("0"));
    L6:
        Iterator<Activity> r0 = r14.iterator();
    L8:
        if (r0.hasNext() == false) goto L15;
        Activity r1 = r0.next();
        Iterator<Map.Entry<Long, ArrayList<Activity>>> r2 = getFilterData().entrySet().iterator();
    L11:
        if (r2.hasNext() == false) goto L8;
        Map.Entry<Long, ArrayList<Activity>> r3 = r2.next();
        long r4 = r3.getKey().longValue();
        ArrayList<Activity> r5 = r3.getValue();
        if (r1.getMTime() > r4) goto L11;
        r5.add(r1);
        goto L8
    L15:
        Iterator<Map.Entry<Long, ArrayList<Activity>>> r6 = getFilterData().entrySet().iterator();
        int r7 = 0;
        int r8 = 0;
    L17:
        if (r6.hasNext() == false) goto L35;
        ArrayList<Activity> r9 = r6.next().getValue();
        if (r9.isEmpty() == false) goto L21;
        int r10 = 0;
    L34:
        getValues().add(new BarEntry(r7, r10));
        r7 = r7 + 1;
        goto L17
    L21:
        Iterator<Activity> r11 = r9.iterator();
        Intrinsics.O10IXXX0X(r11, "iterator(...)");
        r10 = 0;
        int r12 = 0;
    L23:
        if (r11.hasNext() == false) goto L33;
        Activity r13 = r11.next();
        Intrinsics.O10IXXX0X(r13, "next(...)");
        int r15 = r13.getMStep();
        if (r12 > r15) goto L32;
        if (r12 != 0) goto L30;
        if (r8 == 0) goto L30;
        if (r15 < r8) goto L30;
        int r16 = r15 - r8;
    L31:
        r10 = r10 + r16;
    L30:
        r16 = r15 - r12;
    L32:
        r12 = r15;
        goto L23
    L33:
        r8 = ((Activity) CollectionsKt___CollectionsKt.Xi1XO00(r9)).getMStep();
        goto L34
    L35:
        Iterator<Activity> r17 = r14.iterator();
        int r18 = 0;
        int r19 = 0;
    L37:
        if (r17.hasNext() == false) goto L42;
        int r20 = r17.next().getMStep();
        if (r19 > r20) goto L41;
        r18 = r18 + (r20 - r19);
    L41:
        r19 = r20;
        goto L37
    L42:
        getOneValue().setText(UtilsKt.Ii1iii0(String.valueOf(r18)));
        if (r14.isEmpty() == true) goto L71;
        Activity r110 = (Activity) CollectionsKt___CollectionsKt.Xi1XO00(r14);
        if (r110.getMStep() != 0) goto L50;
        Button r111 = getHealthBtn();
        if (r111 == null) goto L72;
        r111.setEnabled(false);
        return;
    L72:
        return;
    L50:
        HeathReportsUtils r21 = HeathReportsUtils.OXO1;
        String r22 = setDataLabel();
        long r23 = r110.getMTime();
        Button r24 = getHealthBtn();
        Intrinsics.O10IXXX0X(r24, "<get-healthBtn>(...)");
        PFMedium r25 = getHealthTv();
        Intrinsics.O10IXXX0X(r25, "<get-healthTv>(...)");
        LinearLayout r26 = getHealthTipLayout();
        Intrinsics.O10IXXX0X(r26, "<get-healthTipLayout>(...)");
        PFMedium r27 = getHealthQuestions();
        Intrinsics.O10IXXX0X(r27, "<get-healthQuestions>(...)");
        r21.X1(r22, r23, r24, r25, r26, r27, getMActivity());
        i72 r28 = i72.OXO1;
        boolean r29 = r28.I0i0();
        getHealthBtnView().setVisibility(8);
        if (r28.OIIOI() == false) goto L53;
        String r30 = getString(R.string.step_ai_health_analysis_v2);
        Intrinsics.O10IXXX0X(r30, "getString(...)");
        boolean r31 = r28.I0i0();
        getHealthBtnView().setVisibility(0);
        boolean r112 = r31;
    L54:
        LinearLayout r32 = getHealthLayout();
        Intrinsics.O10IXXX0X(r32, "<get-healthLayout>(...)");
        String r113 = r30;
        Button r33 = getHealthBtn();
        Intrinsics.O10IXXX0X(r33, "<get-healthBtn>(...)");
        PFMedium r34 = getHealthTv();
        Intrinsics.O10IXXX0X(r34, "<get-healthTv>(...)");
        r21.iOiXi11II(r32, r33, r34, getMActivity(), setDataLabel(), "", r110.getMTime(), r113, r112);
        return;
    L53:
        r112 = r29;
        r30 = "";
        goto L54
    L71:
        return;
    L5:
        getTwoValue().setText(String.valueOf(r14.get(r14.size() - 1).getMStep()));
        goto L6
    }

    @Override // com.sma.smartv3.ui.status.base.ActivityBaseDayFragment, com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getImage().setImageResource(R.drawable.icon_step_info);
        getValueUnit().setText(R.string.steps);
        getOneTV().setText(R.string.total_steps);
        getTotalUnit().setText(R.string.steps);
        getTwoTV().setText(R.string.current_device_total_steps);
        getTwoUnit().setText(R.string.steps);
    }

    @Override // com.sma.smartv3.ui.status.base.ActivityBaseDayFragment
    public void setColor(@aa1 XXX1X11 r4) {
        Intrinsics.X0O(r4, "value");
        r4.OI1IiOO1i(ContextCompat.getColor(getMActivity(), R.color.step_show_1), ContextCompat.getColor(getMActivity(), R.color.step_show_2));
    }

    @Override // com.sma.smartv3.ui.status.base.ActivityBaseDayFragment
    @aa1
    public String setDataLabel() {
        return "Step day Data";
    }

    @Override // com.sma.smartv3.ui.status.base.ActivityBaseDayFragment
    public void updateItemData(@aa1 Entry r2) {
        Intrinsics.X0O(r2, "e");
        getNowValue().setText(UtilsKt.Ii1iii0(String.valueOf((int) r2.O00())));
    }
}
