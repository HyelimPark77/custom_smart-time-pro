package com.sma.smartv3.ui.status.fragment.v2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.ProgressBar;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.aa5;
import com.android.mltcode.paycertificationapi.ba5;
import com.android.mltcode.paycertificationapi.ca5;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.da5;
import com.android.mltcode.paycertificationapi.ea5;
import com.android.mltcode.paycertificationapi.fa5;
import com.android.mltcode.paycertificationapi.ga5;
import com.android.mltcode.paycertificationapi.ha5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.blankj.utilcode.util.SPUtils;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.google.gson.Gson;
import com.sma.smartv3.db.entity.Activity;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.me.GoalSettingActivity;
import com.sma.smartv3.ui.status.base.ActivityBaseDayFragment;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nStepDayV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepDayV2Fragment.kt\ncom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,203:1\n19#2:204\n15#2:205\n*S KotlinDebug\n*F\n+ 1 StepDayV2Fragment.kt\ncom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment\n*L\n49#1:204\n49#1:205\n*E\n"})
public final class StepDayV2Fragment extends ActivityBaseDayFragment {

    @aa1
    private final Lazy caloriesDeviceValue$delegate;

    @aa1
    private final Lazy caloriesValue$delegate;
    private int countCR_Step;

    @aa1
    private final Lazy distanceDeviceValue$delegate;

    @aa1
    private final Lazy distanceValue$delegate;

    @aa1
    private final String formatDecimal;

    @aa1
    private final Lazy goalTip$delegate;

    @aa1
    private final Lazy goalValue$delegate;

    @aa1
    private final Lazy progressBar$delegate;

    @aa1
    private final AppUser userProfile;

    public StepDayV2Fragment() {
        this.goalValue$delegate = LazyKt__LazyJVMKt.iO(new aa5(this));
        this.progressBar$delegate = LazyKt__LazyJVMKt.iO(new ba5(this));
        this.goalTip$delegate = LazyKt__LazyJVMKt.iO(new ca5(this));
        this.caloriesValue$delegate = LazyKt__LazyJVMKt.iO(new da5(this));
        this.distanceValue$delegate = LazyKt__LazyJVMKt.iO(new ea5(this));
        this.caloriesDeviceValue$delegate = LazyKt__LazyJVMKt.iO(new fa5(this));
        this.distanceDeviceValue$delegate = LazyKt__LazyJVMKt.iO(new ga5(this));
        if (q62.OXO1.iIX0i() == false) goto L5;
        String r1 = "%.2f";
    L6:
        this.formatDecimal = r1;
        SPUtils r2 = a01.OXO1.IiI10X();
        Object r3 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r4 = new Gson().fromJson(r2.getString(AppUser.class.getName()), AppUser.class);
        if (r4 == null) goto L10;
        r3 = r4;
    L10:
        this.userProfile = (AppUser) r3;
        return;
    L5:
        r1 = "%.1f";
        goto L6
    }

    public static /* synthetic */ DINCondBold I1(StepDayV2Fragment r0) {
        return caloriesDeviceValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium OII(StepDayV2Fragment r0) {
        return goalTip_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OX(StepDayV2Fragment r0, View r1) {
        initView$lambda$0(r0, r1);
    }

    public static /* synthetic */ DINCondBold OiIIX101O(StepDayV2Fragment r0) {
        return caloriesValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium XX0(StepDayV2Fragment r0) {
        return goalValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ DINCondBold XiOIii1(StepDayV2Fragment r0) {
        return distanceDeviceValue_delegate$lambda$0(r0);
    }

    private static final DINCondBold caloriesDeviceValue_delegate$lambda$0(StepDayV2Fragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.step_v2_calories_value2);
    }

    private static final DINCondBold caloriesValue_delegate$lambda$0(StepDayV2Fragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.step_v2_calories_value);
    }

    private static final DINCondBold distanceDeviceValue_delegate$lambda$0(StepDayV2Fragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.step_v2_distance_value2);
    }

    private static final DINCondBold distanceValue_delegate$lambda$0(StepDayV2Fragment r1) {
        return (DINCondBold) r1.getMView().findViewById(R.id.step_v2_distance_value);
    }

    private final DINCondBold getCaloriesDeviceValue() {
        return (DINCondBold) getValue();
    }

    private final DINCondBold getCaloriesValue() {
        return (DINCondBold) getValue();
    }

    private final DINCondBold getDistanceDeviceValue() {
        return (DINCondBold) getValue();
    }

    private final DINCondBold getDistanceValue() {
        return (DINCondBold) getValue();
    }

    private final PFMedium getGoalTip() {
        return (PFMedium) getValue();
    }

    private final PFMedium getGoalValue() {
        return (PFMedium) getValue();
    }

    private final ProgressBar getProgressBar() {
        return (ProgressBar) getValue();
    }

    private static final PFMedium goalTip_delegate$lambda$0(StepDayV2Fragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.step_v2_goal_tip);
    }

    private static final PFMedium goalValue_delegate$lambda$0(StepDayV2Fragment r1) {
        return (PFMedium) r1.getMView().findViewById(R.id.step_v2_goal_value);
    }

    public static /* synthetic */ DINCondBold iIiiO(StepDayV2Fragment r0) {
        return distanceValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ProgressBar iOOX010X(StepDayV2Fragment r0) {
        return progressBar_delegate$lambda$0(r0);
    }

    private static final void initView$lambda$0(StepDayV2Fragment r2, View r3) {
        r2.startActivity(new Intent(r2.getActivity(), GoalSettingActivity.class));
    }

    private static final ProgressBar progressBar_delegate$lambda$0(StepDayV2Fragment r1) {
        return (ProgressBar) r1.getMView().findViewById(R.id.step_v2_goal_pb_progress);
    }

    @Override // com.sma.smartv3.ui.status.base.ActivityBaseDayFragment
    public void filterData(@aa1 List<Activity> r13) {
        Intrinsics.X0O(r13, "data");
        super.filterData(r13);
        if (r13.isEmpty() == false) goto L5;
        getTwoValue().setText(UtilsKt.Ii1iii0("0"));
    L6:
        Iterator<Activity> r0 = r13.iterator();
    L8:
        if (r0.hasNext() == false) goto L15;
        Activity r2 = r0.next();
        Iterator<Map.Entry<Long, ArrayList<Activity>>> r3 = getFilterData().entrySet().iterator();
    L11:
        if (r3.hasNext() == false) goto L8;
        Map.Entry<Long, ArrayList<Activity>> r4 = r3.next();
        long r5 = r4.getKey().longValue();
        ArrayList<Activity> r6 = r4.getValue();
        if (r2.getMTime() > r5) goto L11;
        r6.add(r2);
        goto L8
    L15:
        Iterator<Map.Entry<Long, ArrayList<Activity>>> r1 = getFilterData().entrySet().iterator();
        int r7 = 0;
        int r8 = 0;
    L17:
        if (r1.hasNext() == false) goto L35;
        ArrayList<Activity> r9 = r1.next().getValue();
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
        Activity r14 = r11.next();
        Intrinsics.O10IXXX0X(r14, "next(...)");
        int r15 = r14.getMStep();
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
        this.countCR_Step = 0;
        Iterator<Activity> r17 = r13.iterator();
        float r18 = 0.0f;
        int r19 = 0;
        int r20 = 0;
        int r21 = 0;
        int r22 = 0;
    L37:
        if (r17.hasNext() == false) goto L48;
        Activity r23 = r17.next();
        int r24 = r23.getMStep();
        if (r20 > r24) goto L41;
        this.countCR_Step += r24 - r20;
    L41:
        int r25 = r23.getMDistance();
        if (r21 > r25) goto L44;
        r18 = r18 + cp5.X1ii(r25 - r21, this.userProfile.getUnit(), false, 4, null);
    L44:
        int r26 = r23.getMCalorie() / 10000;
        if (r22 > r26) goto L47;
        r19 = r19 + (r26 - r22);
    L47:
        r22 = r26;
        r21 = r25;
        r20 = r24;
        goto L37
    L48:
        getOneValue().setText(UtilsKt.Ii1iii0(String.valueOf(this.countCR_Step)));
        setGoalChange();
        getCaloriesValue().setText(UtilsKt.Ii1iii0(String.valueOf(r19)));
        DINCondBold r110 = getDistanceValue();
        StringCompanionObject r27 = StringCompanionObject.OXO1;
        float r28 = r18 / 10000.0f;
        String r29 = String.format(this.formatDecimal, Arrays.copyOf(new Object[]{Float.valueOf(r28)}, 1));
        Intrinsics.O10IXXX0X(r29, "format(...)");
        r110.setText(UtilsKt.Ii1iii0(r29));
        getCaloriesDeviceValue().setText(UtilsKt.Ii1iii0(String.valueOf(r19)));
        DINCondBold r111 = getDistanceDeviceValue();
        String r30 = String.format(this.formatDecimal, Arrays.copyOf(new Object[]{Float.valueOf(r28)}, 1));
        Intrinsics.O10IXXX0X(r30, "format(...)");
        r111.setText(UtilsKt.Ii1iii0(r30));
        return;
    L5:
        getTwoValue().setText(String.valueOf(r13.get(r13.size() - 1).getMStep()));
        goto L6
    }

    public final int getCountCR_Step() {
        return this.countCR_Step;
    }

    @aa1
    public final String getFormatDecimal() {
        return this.formatDecimal;
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.sma.smartv3.ui.status.base.ActivityBaseDayFragment, com.sma.smartv3.ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.k5
    public void initView() {
        super.initView();
        getImage().setImageResource(R.drawable.icon_step_info_v2);
        View r0 = getMView().findViewById(R.id.step_v2_set_goal);
        if (r0 == null) goto L6;
        r0.setOnClickListener(new ha5(this));
        return;
    }

    @Override // com.sma.smartv3.ui.status.base.ActivityBaseDayFragment, com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.fragment_status_day_v2;
    }

    @sf5(tag = I01XX0.XOIX)
    public final void onGoalChange(@aa1 Object r2) {
        Intrinsics.X0O(r2, "data");
        setGoalChange();
    }

    @Override // com.sma.smartv3.ui.status.base.ActivityBaseDayFragment
    public void setColor(@aa1 XXX1X11 r4) {
        Intrinsics.X0O(r4, "value");
        r4.OI1IiOO1i(ContextCompat.getColor(getMActivity(), R.color.step_show_1_v2), ContextCompat.getColor(getMActivity(), R.color.step_show_2_v2));
    }

    public final void setCountCR_Step(int r1) {
        this.countCR_Step = r1;
    }

    @Override // com.sma.smartv3.ui.status.base.ActivityBaseDayFragment
    @aa1
    public String setDataLabel() {
        return "Step day Data";
    }

    @SuppressLint({"SetTextI18n"})
    public final void setGoalChange() {
        PFMedium r0 = getGoalValue();
        if (Intrinsics.XOO0ii0(getOneValue().getText(), HelpFormatter.DEFAULT_LONG_OPT_PREFIX) == false) goto L5;
        CharSequence r1 = "0";
    L6:
        BleCache r2 = BleCache.INSTANCE;
        BleKey r3 = BleKey.STEP_GOAL;
        r0.setText(r1 + "/" + BaseBleCache.getInt$default(r2, r3, 0, null, 6, null));
        getProgressBar().setMax(BaseBleCache.getInt$default(r2, r3, 0, null, 6, null));
        getProgressBar().setProgress(this.countCR_Step);
        int r4 = BaseBleCache.getInt$default(r2, r3, 0, null, 6, null) - this.countCR_Step;
        PFMedium r5 = getGoalTip();
        if (r4 <= 0) goto L9;
        String r6 = getString(R.string.implement_goal_reminder, new Object[]{Integer.valueOf(r4)});
    L10:
        r5.setText(r6);
        return;
    L9:
        r6 = getString(R.string.segment_completion_goal);
        goto L10
    L5:
        r1 = getOneValue().getText();
        goto L6
    }

    @Override // com.sma.smartv3.ui.status.base.ActivityBaseDayFragment
    public void updateItemData(@aa1 Entry r2) {
        Intrinsics.X0O(r2, "e");
        getNowValue().setText(UtilsKt.Ii1iii0(String.valueOf((int) r2.O00())));
    }
}
