package com.sma.smartv3.p610ui.status.fragment.p255v2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.ProgressBar;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.blankj.utilcode.util.SPUtils;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.p608db.entity.Activity;
import com.sma.smartv3.p610ui.p612me.GoalSettingActivity;
import com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment;
import com.sma.smartv3.p610ui.status.fragment.p255v2.StepDayV2Fragment;
import com.sma.smartv3.pro.R;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nStepDayV2Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepDayV2Fragment.kt\ncom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,203:1\n19#2:204\n15#2:205\n*S KotlinDebug\n*F\n+ 1 StepDayV2Fragment.kt\ncom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment\n*L\n49#1:204\n49#1:205\n*E\n"})
public final class StepDayV2Fragment extends ActivityBaseDayFragment {
    private int countCR_Step;

    @aa1
    private final String formatDecimal;

    @aa1
    private final AppUser userProfile;

    @aa1
    private final Lazy goalValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.aa5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StepDayV2Fragment.goalValue_delegate$lambda$0(this.f5452IO);
        }
    });

    @aa1
    private final Lazy progressBar$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ba5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StepDayV2Fragment.progressBar_delegate$lambda$0(this.f5695IO);
        }
    });

    @aa1
    private final Lazy goalTip$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ca5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StepDayV2Fragment.goalTip_delegate$lambda$0(this.f5937IO);
        }
    });

    @aa1
    private final Lazy caloriesValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.da5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StepDayV2Fragment.caloriesValue_delegate$lambda$0(this.f6155IO);
        }
    });

    @aa1
    private final Lazy distanceValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ea5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StepDayV2Fragment.distanceValue_delegate$lambda$0(this.f6372IO);
        }
    });

    @aa1
    private final Lazy caloriesDeviceValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.fa5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StepDayV2Fragment.caloriesDeviceValue_delegate$lambda$0(this.f6602IO);
        }
    });

    @aa1
    private final Lazy distanceDeviceValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ga5
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StepDayV2Fragment.distanceDeviceValue_delegate$lambda$0(this.f6840IO);
        }
    });

    public StepDayV2Fragment() {
        this.formatDecimal = q62.OXO1.iIX0i() ? "%.2f" : "%.1f";
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.userProfile = (AppUser) (objFromJson != null ? objFromJson : appUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold caloriesDeviceValue_delegate$lambda$0(StepDayV2Fragment stepDayV2Fragment) {
        return (DINCondBold) stepDayV2Fragment.getMView().findViewById(R.id.step_v2_calories_value2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold caloriesValue_delegate$lambda$0(StepDayV2Fragment stepDayV2Fragment) {
        return (DINCondBold) stepDayV2Fragment.getMView().findViewById(R.id.step_v2_calories_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold distanceDeviceValue_delegate$lambda$0(StepDayV2Fragment stepDayV2Fragment) {
        return (DINCondBold) stepDayV2Fragment.getMView().findViewById(R.id.step_v2_distance_value2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DINCondBold distanceValue_delegate$lambda$0(StepDayV2Fragment stepDayV2Fragment) {
        return (DINCondBold) stepDayV2Fragment.getMView().findViewById(R.id.step_v2_distance_value);
    }

    private final DINCondBold getCaloriesDeviceValue() {
        return (DINCondBold) this.caloriesDeviceValue$delegate.getValue();
    }

    private final DINCondBold getCaloriesValue() {
        return (DINCondBold) this.caloriesValue$delegate.getValue();
    }

    private final DINCondBold getDistanceDeviceValue() {
        return (DINCondBold) this.distanceDeviceValue$delegate.getValue();
    }

    private final DINCondBold getDistanceValue() {
        return (DINCondBold) this.distanceValue$delegate.getValue();
    }

    private final PFMedium getGoalTip() {
        return (PFMedium) this.goalTip$delegate.getValue();
    }

    private final PFMedium getGoalValue() {
        return (PFMedium) this.goalValue$delegate.getValue();
    }

    private final ProgressBar getProgressBar() {
        return (ProgressBar) this.progressBar$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium goalTip_delegate$lambda$0(StepDayV2Fragment stepDayV2Fragment) {
        return (PFMedium) stepDayV2Fragment.getMView().findViewById(R.id.step_v2_goal_tip);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium goalValue_delegate$lambda$0(StepDayV2Fragment stepDayV2Fragment) {
        return (PFMedium) stepDayV2Fragment.getMView().findViewById(R.id.step_v2_goal_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(StepDayV2Fragment stepDayV2Fragment, View view) {
        stepDayV2Fragment.startActivity(new Intent(stepDayV2Fragment.getActivity(), (Class<?>) GoalSettingActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgressBar progressBar_delegate$lambda$0(StepDayV2Fragment stepDayV2Fragment) {
        return (ProgressBar) stepDayV2Fragment.getMView().findViewById(R.id.step_v2_goal_pb_progress);
    }

    @Override // com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment
    public void filterData(@aa1 List<Activity> data) {
        int i;
        Intrinsics.X0O(data, "data");
        super.filterData(data);
        if (data.isEmpty()) {
            getTwoValue().setText(UtilsKt.Ii1iii0("0"));
        } else {
            getTwoValue().setText(String.valueOf(data.get(data.size() - 1).getMStep()));
        }
        for (Activity activity : data) {
            for (Map.Entry<Long, ArrayList<Activity>> entry : getFilterData().entrySet()) {
                long jLongValue = entry.getKey().longValue();
                ArrayList<Activity> value = entry.getValue();
                if (activity.getMTime() <= jLongValue) {
                    value.add(activity);
                    break;
                }
            }
        }
        Iterator<Map.Entry<Long, ArrayList<Activity>>> it = getFilterData().entrySet().iterator();
        int i2 = 0;
        int mStep = 0;
        while (it.hasNext()) {
            ArrayList<Activity> value2 = it.next().getValue();
            if (value2.isEmpty()) {
                i = 0;
            } else {
                Iterator<Activity> it2 = value2.iterator();
                Intrinsics.O10IXXX0X(it2, "iterator(...)");
                i = 0;
                int i3 = 0;
                while (it2.hasNext()) {
                    Activity next = it2.next();
                    Intrinsics.O10IXXX0X(next, "next(...)");
                    int mStep2 = next.getMStep();
                    if (i3 <= mStep2) {
                        i += (i3 != 0 || mStep == 0 || mStep2 < mStep) ? mStep2 - i3 : mStep2 - mStep;
                    }
                    i3 = mStep2;
                }
                mStep = ((Activity) CollectionsKt___CollectionsKt.Xi1XO00(value2)).getMStep();
            }
            getValues().add(new BarEntry(i2, i));
            i2++;
        }
        this.countCR_Step = 0;
        float fX1ii = 0.0f;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (Activity activity2 : data) {
            int mStep3 = activity2.getMStep();
            if (i5 <= mStep3) {
                this.countCR_Step += mStep3 - i5;
            }
            int mDistance = activity2.getMDistance();
            if (i6 <= mDistance) {
                fX1ii += cp5.X1ii(mDistance - i6, this.userProfile.getUnit(), false, 4, null);
            }
            int mCalorie = activity2.getMCalorie() / 10000;
            if (i7 <= mCalorie) {
                i4 += mCalorie - i7;
            }
            i7 = mCalorie;
            i6 = mDistance;
            i5 = mStep3;
        }
        getOneValue().setText(UtilsKt.Ii1iii0(String.valueOf(this.countCR_Step)));
        setGoalChange();
        getCaloriesValue().setText(UtilsKt.Ii1iii0(String.valueOf(i4)));
        DINCondBold distanceValue = getDistanceValue();
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        float f = fX1ii / 10000.0f;
        String str = String.format(this.formatDecimal, Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        distanceValue.setText(UtilsKt.Ii1iii0(str));
        getCaloriesDeviceValue().setText(UtilsKt.Ii1iii0(String.valueOf(i4)));
        DINCondBold distanceDeviceValue = getDistanceDeviceValue();
        String str2 = String.format(this.formatDecimal, Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        Intrinsics.O10IXXX0X(str2, "format(...)");
        distanceDeviceValue.setText(UtilsKt.Ii1iii0(str2));
    }

    public final int getCountCR_Step() {
        return this.countCR_Step;
    }

    @aa1
    public final String getFormatDecimal() {
        return this.formatDecimal;
    }

    @Override // com.bestmafen.androidbase.base.BaseFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public boolean initEvent() {
        return true;
    }

    @Override // com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment, com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getImage().setImageResource(R.drawable.icon_step_info_v2);
        View viewFindViewById = getMView().findViewById(R.id.step_v2_set_goal);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ha5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StepDayV2Fragment.initView$lambda$0(this.f7078IO, view);
                }
            });
        }
    }

    @Override // com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.fragment_status_day_v2;
    }

    @sf5(tag = I01XX0.XOIX)
    public final void onGoalChange(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        setGoalChange();
    }

    @Override // com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment
    public void setColor(@aa1 XXX1X11 value) {
        Intrinsics.X0O(value, "value");
        value.OI1IiOO1i(ContextCompat.getColor(getMActivity(), R.color.step_show_1_v2), ContextCompat.getColor(getMActivity(), R.color.step_show_2_v2));
    }

    public final void setCountCR_Step(int i) {
        this.countCR_Step = i;
    }

    @Override // com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment
    @aa1
    public String setDataLabel() {
        return "Step day Data";
    }

    @SuppressLint({"SetTextI18n"})
    public final void setGoalChange() {
        PFMedium goalValue = getGoalValue();
        CharSequence text = Intrinsics.XOO0ii0(getOneValue().getText(), HelpFormatter.DEFAULT_LONG_OPT_PREFIX) ? "0" : getOneValue().getText();
        BleCache bleCache = BleCache.INSTANCE;
        BleKey bleKey = BleKey.STEP_GOAL;
        goalValue.setText(((Object) text) + "/" + BaseBleCache.getInt$default(bleCache, bleKey, 0, null, 6, null));
        getProgressBar().setMax(BaseBleCache.getInt$default(bleCache, bleKey, 0, null, 6, null));
        getProgressBar().setProgress(this.countCR_Step);
        int int$default = BaseBleCache.getInt$default(bleCache, bleKey, 0, null, 6, null) - this.countCR_Step;
        getGoalTip().setText(int$default > 0 ? getString(R.string.implement_goal_reminder, Integer.valueOf(int$default)) : getString(R.string.segment_completion_goal));
    }

    @Override // com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment
    public void updateItemData(@aa1 Entry e) {
        Intrinsics.X0O(e, "e");
        getNowValue().setText(UtilsKt.Ii1iii0(String.valueOf((int) e.O00())));
    }
}
