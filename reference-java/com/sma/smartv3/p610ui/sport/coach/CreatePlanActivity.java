package com.sma.smartv3.p610ui.sport.coach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O11XO1X;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.LibExKt;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.sma.smartv3.p610ui.device.guide.BaseAppGuideActivity;
import com.sma.smartv3.p610ui.p612me.WebViewActivity;
import com.sma.smartv3.p610ui.sport.coach.CreatePlanActivity;
import com.sma.smartv3.p610ui.sport.coach.guide.PersonalActivityConfirmFragment;
import com.sma.smartv3.p610ui.sport.coach.guide.PersonalActivityFragment;
import com.sma.smartv3.p610ui.sport.coach.guide.PersonalInformationFragment;
import com.sma.smartv3.p610ui.sport.coach.guide.PlanChooseDaysFragment;
import com.sma.smartv3.p610ui.sport.coach.guide.PlanGoalFragment;
import com.sma.smartv3.p610ui.sport.coach.guide.PlanStartTimeFragment;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCreatePlanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreatePlanActivity.kt\ncom/sma/smartv3/ui/sport/coach/CreatePlanActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,197:1\n87#2,7:198\n94#2,3:206\n70#2,7:209\n97#2:216\n140#2,5:217\n145#2,5:223\n1#3:205\n1#3:222\n85#4,3:228\n*S KotlinDebug\n*F\n+ 1 CreatePlanActivity.kt\ncom/sma/smartv3/ui/sport/coach/CreatePlanActivity\n*L\n81#1:198,7\n81#1:206,3\n81#1:209,7\n81#1:216\n107#1:217,5\n107#1:223,5\n81#1:205\n107#1:222\n118#1:228,3\n*E\n"})
public final class CreatePlanActivity extends BaseAppGuideActivity {
    private final int CREATE_PLAN_DONE = 254;
    private final int layoutId = R.layout.activity_coach_create_plan;

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OX1Oi1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CreatePlanActivity.abhTitleCenter_delegate$lambda$0(this.f3440IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.O01OXX0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CreatePlanActivity.abhTitleRight_delegate$lambda$0(this.f2412IO);
        }
    });

    @aa1
    private final Lazy nextButton$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I0XXi1i0
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CreatePlanActivity.nextButton_delegate$lambda$0(this.f1240IO);
        }
    });

    @aa1
    private final Lazy nextButtonClick$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I1Ii0X1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CreatePlanActivity.nextButtonClick_delegate$lambda$0(this.f1399IO);
        }
    });

    @aa1
    private final Lazy doneButton$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iIO11Oi1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CreatePlanActivity.doneButton_delegate$lambda$0(this.f7867IO);
        }
    });

    @aa1
    private final Lazy mPagerView$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.XI0OI1
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return CreatePlanActivity.mPagerView_delegate$lambda$0(this.f4435IO);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(CreatePlanActivity createPlanActivity) {
        return (PFMedium) createPlanActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(CreatePlanActivity createPlanActivity) {
        return (ImageView) createPlanActivity.findViewById(R.id.abh_title_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button doneButton_delegate$lambda$0(CreatePlanActivity createPlanActivity) {
        return (Button) createPlanActivity.findViewById(R.id.done);
    }

    private final void initConfiguration() {
        setSkipButtonEnabled(false);
        setIndicatorEnabled(false);
        setWizardMode(true);
        showStatusBar(true);
        setSwipe(false);
        getAbhTitleCenter().setText(getString(R.string.personal_information));
        getNextButton().setText(getString(R.string.coach_create_plan_btn_next_step));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewPager mPagerView_delegate$lambda$0(CreatePlanActivity createPlanActivity) {
        return (ViewPager) createPlanActivity.findViewById(R.id.view_pager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button nextButtonClick_delegate$lambda$0(CreatePlanActivity createPlanActivity) {
        return (Button) createPlanActivity.findViewById(R.id.next_custom_click);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button nextButton_delegate$lambda$0(CreatePlanActivity createPlanActivity) {
        return (Button) createPlanActivity.findViewById(R.id.next);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    public final Button getDoneButton() {
        return (Button) this.doneButton$delegate.getValue();
    }

    @Override // com.sma.smartv3.p610ui.device.guide.BaseAppGuideActivity, com.github.appintro.AppIntro, com.github.appintro.AppIntroBase
    public int getLayoutId() {
        return this.layoutId;
    }

    public final ViewPager getMPagerView() {
        return (ViewPager) this.mPagerView$delegate.getValue();
    }

    public final Button getNextButton() {
        return (Button) this.nextButton$delegate.getValue();
    }

    public final Button getNextButtonClick() {
        return (Button) this.nextButtonClick$delegate.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.CREATE_PLAN_DONE) {
            if (i2 == -1) {
                LogUtils.m11130i("onActivityResult");
                SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
                AICoachManage.OXO1 oxo1 = AICoachManage.IiI10X;
                sPUtilsIiI10X.put(b01.O1i0 + '_' + AICoachManage.VitalityData.class.getName(), new Gson().toJson(oxo1.OXO1().X0O()), false);
                I01XX0.XIi00iiXO(I01XX0.XIO11I, null, 2, null);
                oxo1.OXO1().IIX1OXO();
                finish();
            }
            if (i2 == 9000) {
                getMPagerView().setCurrentItem(0);
            }
        }
    }

    @Override // com.sma.smartv3.p610ui.device.guide.BaseAppGuideActivity, com.github.appintro.AppIntroBase, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle bundle) {
        super.onCreate(bundle);
        O11XO1X.XO0O10().X1ii(this);
        initConfiguration();
        if (getIntent().getIntExtra("type", 0) == 0) {
            addSlide(new PersonalInformationFragment());
            addSlide(new PersonalActivityFragment());
            addSlide(new PersonalActivityConfirmFragment());
        }
        addSlide(new PlanChooseDaysFragment());
        addSlide(new PlanStartTimeFragment());
        addSlide(new PlanGoalFragment());
        getNextButtonClick().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.i0OOI1X1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToastUtils.showLong(com.sma.smartv3.pro.R.string.abh_choose_day_tip);
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        O11XO1X.XO0O10().OiIIX101O(this);
    }

    @Override // com.github.appintro.AppIntroBase
    public void onDonePressed(@tb1 Fragment fragment) {
        super.onDonePressed(fragment);
        startActivityForResult(new Intent(this, (Class<?>) PlanConfirmActivity.class), this.CREATE_PLAN_DONE);
    }

    @sf5(tag = I01XX0.IOIi00)
    public final void onPlanChooseDayChanged(int i) {
        LogUtils.m11131v("onBloodGlucoseChanged");
        if (i >= 3) {
            getNextButtonClick().setVisibility(8);
            getNextButton().setVisibility(0);
        } else {
            getNextButtonClick().setVisibility(0);
            getNextButton().setVisibility(8);
        }
    }

    @Override // com.github.appintro.AppIntroBase
    public void onSlideChanged(@tb1 Fragment fragment, @tb1 Fragment fragment2) {
        super.onSlideChanged(fragment, fragment2);
        LibExKt.XX1Oi(getAbhTitleRight(), true);
        if (fragment2 instanceof PersonalInformationFragment) {
            getAbhTitleCenter().setText(getString(R.string.personal_information));
            getNextButton().setText(getString(R.string.coach_create_plan_btn_next_step));
            return;
        }
        if (fragment2 instanceof PersonalActivityFragment) {
            getAbhTitleCenter().setText(getString(R.string.coach_create_plan_aa_title));
            getNextButton().setText(getString(R.string.btn_start));
            LibExKt.I0XXi0X(getAbhTitleRight(), true);
            getAbhTitleRight().setImageResource(R.drawable.plan_coach_ic_waring);
            return;
        }
        if (fragment2 instanceof PersonalActivityConfirmFragment) {
            getAbhTitleCenter().setText(getString(R.string.coach_create_plan_aa_title));
            getNextButton().setText(getString(R.string.next));
            return;
        }
        if (fragment2 instanceof PlanChooseDaysFragment) {
            getNextButtonClick().setText(getString(R.string.next));
            getNextButton().setText(getString(R.string.next));
            if (((PlanChooseDaysFragment) fragment2).getChoicesSize() >= 3) {
                getNextButtonClick().setVisibility(8);
                getNextButton().setVisibility(0);
            } else {
                getNextButtonClick().setVisibility(0);
                getNextButton().setVisibility(8);
            }
            getAbhTitleCenter().setText(getString(R.string.coach_create_plan_cd_title));
            return;
        }
        if (fragment2 instanceof PlanStartTimeFragment) {
            getAbhTitleCenter().setText(getString(R.string.coach_create_plan_st_title));
            getNextButton().setText(getString(R.string.next));
        } else if (fragment2 instanceof PlanGoalFragment) {
            getAbhTitleCenter().setText(getString(R.string.coach_create_plan_pg_title));
            getNextButton().setText(getString(R.string.got_it));
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        onHandleBackPressed();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", "https://api.iot-solution.net/web/help/ai_coach_activity_assessment.html");
        bundle.putInt("mArg1", 2);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(this, (Class<?>) WebViewActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
