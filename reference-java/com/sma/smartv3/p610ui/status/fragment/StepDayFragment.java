package com.sma.smartv3.p610ui.status.fragment;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.XXX1X11;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i72;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.sma.smartv3.p608db.entity.Activity;
import com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment;
import com.sma.smartv3.p610ui.status.fragment.StepDayFragment;
import com.sma.smartv3.pro.R;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StepDayFragment extends ActivityBaseDayFragment {

    @aa1
    private final Lazy healthLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.u95
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StepDayFragment.healthLayout_delegate$lambda$0(this.f11446IO);
        }
    });

    @aa1
    private final Lazy healthBtn$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.v95
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StepDayFragment.healthBtn_delegate$lambda$0(this.f11679IO);
        }
    });

    @aa1
    private final Lazy healthTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.w95
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StepDayFragment.healthTv_delegate$lambda$0(this.f11909IO);
        }
    });

    @aa1
    private final Lazy healthTipLayout$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.x95
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StepDayFragment.healthTipLayout_delegate$lambda$0(this.f12134IO);
        }
    });

    @aa1
    private final Lazy healthQuestions$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.y95
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StepDayFragment.healthQuestions_delegate$lambda$0(this.f12335IO);
        }
    });

    @aa1
    private final Lazy healthBtnView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.z95
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return StepDayFragment.healthBtnView_delegate$lambda$0(this.f12567IO);
        }
    });

    private final Button getHealthBtn() {
        return (Button) this.healthBtn$delegate.getValue();
    }

    private final View getHealthBtnView() {
        return (View) this.healthBtnView$delegate.getValue();
    }

    private final LinearLayout getHealthLayout() {
        return (LinearLayout) this.healthLayout$delegate.getValue();
    }

    private final PFMedium getHealthQuestions() {
        return (PFMedium) this.healthQuestions$delegate.getValue();
    }

    private final LinearLayout getHealthTipLayout() {
        return (LinearLayout) this.healthTipLayout$delegate.getValue();
    }

    private final PFMedium getHealthTv() {
        return (PFMedium) this.healthTv$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View healthBtnView_delegate$lambda$0(StepDayFragment stepDayFragment) {
        return stepDayFragment.getMView().findViewById(R.id.health_btn_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button healthBtn_delegate$lambda$0(StepDayFragment stepDayFragment) {
        return (Button) stepDayFragment.getMView().findViewById(R.id.btn_common_heathy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout healthLayout_delegate$lambda$0(StepDayFragment stepDayFragment) {
        return (LinearLayout) stepDayFragment.getMView().findViewById(R.id.item_health_btn_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium healthQuestions_delegate$lambda$0(StepDayFragment stepDayFragment) {
        return (PFMedium) stepDayFragment.getMView().findViewById(R.id.tv_common_healthy_questions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout healthTipLayout_delegate$lambda$0(StepDayFragment stepDayFragment) {
        return (LinearLayout) stepDayFragment.getMView().findViewById(R.id.questions_healthy_tip_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium healthTv_delegate$lambda$0(StepDayFragment stepDayFragment) {
        return (PFMedium) stepDayFragment.getMView().findViewById(R.id.tv_common_heathy);
    }

    @Override // com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment
    public void filterData(@aa1 List<Activity> data) {
        boolean z;
        String string;
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
        Iterator<Activity> it3 = data.iterator();
        int i4 = 0;
        int i5 = 0;
        while (it3.hasNext()) {
            int mStep3 = it3.next().getMStep();
            if (i5 <= mStep3) {
                i4 += mStep3 - i5;
            }
            i5 = mStep3;
        }
        getOneValue().setText(UtilsKt.Ii1iii0(String.valueOf(i4)));
        if (data.isEmpty()) {
            return;
        }
        Activity activity2 = (Activity) CollectionsKt___CollectionsKt.Xi1XO00(data);
        if (activity2.getMStep() == 0) {
            Button healthBtn = getHealthBtn();
            if (healthBtn != null) {
                healthBtn.setEnabled(false);
                return;
            }
            return;
        }
        HeathReportsUtils heathReportsUtils = HeathReportsUtils.OXO1;
        String dataLabel = setDataLabel();
        long mTime = activity2.getMTime();
        Button healthBtn2 = getHealthBtn();
        Intrinsics.O10IXXX0X(healthBtn2, "<get-healthBtn>(...)");
        PFMedium healthTv = getHealthTv();
        Intrinsics.O10IXXX0X(healthTv, "<get-healthTv>(...)");
        LinearLayout healthTipLayout = getHealthTipLayout();
        Intrinsics.O10IXXX0X(healthTipLayout, "<get-healthTipLayout>(...)");
        PFMedium healthQuestions = getHealthQuestions();
        Intrinsics.O10IXXX0X(healthQuestions, "<get-healthQuestions>(...)");
        heathReportsUtils.m38814X1(dataLabel, mTime, healthBtn2, healthTv, healthTipLayout, healthQuestions, getMActivity());
        i72 i72Var = i72.OXO1;
        boolean zI0i0 = i72Var.I0i0();
        getHealthBtnView().setVisibility(8);
        if (i72Var.OIIOI()) {
            string = getString(R.string.step_ai_health_analysis_v2);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            boolean zI0i1 = i72Var.I0i0();
            getHealthBtnView().setVisibility(0);
            z = zI0i1;
        } else {
            z = zI0i0;
            string = "";
        }
        LinearLayout healthLayout = getHealthLayout();
        Intrinsics.O10IXXX0X(healthLayout, "<get-healthLayout>(...)");
        String str = string;
        Button healthBtn3 = getHealthBtn();
        Intrinsics.O10IXXX0X(healthBtn3, "<get-healthBtn>(...)");
        PFMedium healthTv2 = getHealthTv();
        Intrinsics.O10IXXX0X(healthTv2, "<get-healthTv>(...)");
        heathReportsUtils.iOiXi11II(healthLayout, healthBtn3, healthTv2, getMActivity(), setDataLabel(), "", activity2.getMTime(), str, z);
    }

    @Override // com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment, com.sma.smartv3.p610ui.status.base.BaseDetailsFragment, com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        super.initView();
        getImage().setImageResource(R.drawable.icon_step_info);
        getValueUnit().setText(R.string.steps);
        getOneTV().setText(R.string.total_steps);
        getTotalUnit().setText(R.string.steps);
        getTwoTV().setText(R.string.current_device_total_steps);
        getTwoUnit().setText(R.string.steps);
    }

    @Override // com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment
    public void setColor(@aa1 XXX1X11 value) {
        Intrinsics.X0O(value, "value");
        value.OI1IiOO1i(ContextCompat.getColor(getMActivity(), R.color.step_show_1), ContextCompat.getColor(getMActivity(), R.color.step_show_2));
    }

    @Override // com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment
    @aa1
    public String setDataLabel() {
        return "Step day Data";
    }

    @Override // com.sma.smartv3.p610ui.status.base.ActivityBaseDayFragment
    public void updateItemData(@aa1 Entry e) {
        Intrinsics.X0O(e, "e");
        getNowValue().setText(UtilsKt.Ii1iii0(String.valueOf((int) e.O00())));
    }
}
