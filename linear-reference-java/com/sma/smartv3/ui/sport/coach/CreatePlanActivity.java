package com.sma.smartv3.ui.sport.coach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.I0XXi1i0;
import com.android.mltcode.paycertificationapi.I1Ii0X1;
import com.android.mltcode.paycertificationapi.O01OXX0;
import com.android.mltcode.paycertificationapi.O11XO1X;
import com.android.mltcode.paycertificationapi.OX1Oi1;
import com.android.mltcode.paycertificationapi.XI0OI1;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i0OOI1X1;
import com.android.mltcode.paycertificationapi.iIO11Oi1;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.angcyo.dsladapter.LibExKt;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.device.guide.BaseAppGuideActivity;
import com.sma.smartv3.ui.me.WebViewActivity;
import com.sma.smartv3.ui.sport.coach.guide.PersonalActivityConfirmFragment;
import com.sma.smartv3.ui.sport.coach.guide.PersonalActivityFragment;
import com.sma.smartv3.ui.sport.coach.guide.PersonalInformationFragment;
import com.sma.smartv3.ui.sport.coach.guide.PlanChooseDaysFragment;
import com.sma.smartv3.ui.sport.coach.guide.PlanGoalFragment;
import com.sma.smartv3.ui.sport.coach.guide.PlanStartTimeFragment;
import com.sma.smartv3.view.text.PFMedium;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCreatePlanActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreatePlanActivity.kt\ncom/sma/smartv3/ui/sport/coach/CreatePlanActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,197:1\n87#2,7:198\n94#2,3:206\n70#2,7:209\n97#2:216\n140#2,5:217\n145#2,5:223\n1#3:205\n1#3:222\n85#4,3:228\n*S KotlinDebug\n*F\n+ 1 CreatePlanActivity.kt\ncom/sma/smartv3/ui/sport/coach/CreatePlanActivity\n*L\n81#1:198,7\n81#1:206,3\n81#1:209,7\n81#1:216\n107#1:217,5\n107#1:223,5\n81#1:205\n107#1:222\n118#1:228,3\n*E\n"})
public final class CreatePlanActivity extends BaseAppGuideActivity {
    private final int CREATE_PLAN_DONE;

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private final Lazy doneButton$delegate;
    private final int layoutId;

    @aa1
    private final Lazy mPagerView$delegate;

    @aa1
    private final Lazy nextButton$delegate;

    @aa1
    private final Lazy nextButtonClick$delegate;

    public CreatePlanActivity() {
        this.CREATE_PLAN_DONE = 254;
        this.layoutId = R.layout.activity_coach_create_plan;
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new OX1Oi1(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new O01OXX0(this));
        this.nextButton$delegate = LazyKt__LazyJVMKt.iO(new I0XXi1i0(this));
        this.nextButtonClick$delegate = LazyKt__LazyJVMKt.iO(new I1Ii0X1(this));
        this.doneButton$delegate = LazyKt__LazyJVMKt.iO(new iIO11Oi1(this));
        this.mPagerView$delegate = LazyKt__LazyJVMKt.iO(new XI0OI1(this));
    }

    public static /* synthetic */ PFMedium I1XOi1(CreatePlanActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Button IIX1OXO(CreatePlanActivity r0) {
        return nextButtonClick_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ViewPager O10IXXX0X(CreatePlanActivity r0) {
        return mPagerView_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X0O(View r0) {
        onCreate$lambda$0(r0);
    }

    public static /* synthetic */ Button X1ii(CreatePlanActivity r0) {
        return nextButton_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XiOIO(CreatePlanActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(CreatePlanActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(CreatePlanActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    private static final Button doneButton_delegate$lambda$0(CreatePlanActivity r1) {
        return (Button) r1.findViewById(R.id.done);
    }

    public static /* synthetic */ Button iIiiO(CreatePlanActivity r0) {
        return doneButton_delegate$lambda$0(r0);
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

    private static final ViewPager mPagerView_delegate$lambda$0(CreatePlanActivity r1) {
        return (ViewPager) r1.findViewById(R.id.view_pager);
    }

    private static final Button nextButtonClick_delegate$lambda$0(CreatePlanActivity r1) {
        return (Button) r1.findViewById(R.id.next_custom_click);
    }

    private static final Button nextButton_delegate$lambda$0(CreatePlanActivity r1) {
        return (Button) r1.findViewById(R.id.next);
    }

    private static final void onCreate$lambda$0(View r0) {
        ToastUtils.showLong(R.string.abh_choose_day_tip);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    public final Button getDoneButton() {
        return (Button) getValue();
    }

    @Override // com.sma.smartv3.ui.device.guide.BaseAppGuideActivity, com.github.appintro.AppIntro, com.github.appintro.AppIntroBase
    public int getLayoutId() {
        return this.layoutId;
    }

    public final ViewPager getMPagerView() {
        return (ViewPager) getValue();
    }

    public final Button getNextButton() {
        return (Button) getValue();
    }

    public final Button getNextButtonClick() {
        return (Button) getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @Deprecated(message = "Deprecated in Java")
    public void onActivityResult(int r5, int r6, @tb1 Intent r7) {
        super.onActivityResult(r5, r6, r7);
        if (r5 == this.CREATE_PLAN_DONE) goto L5;
        return;
    L5:
        if (r6 != (-1)) goto L8;
        LogUtils.i(new Object[]{"onActivityResult"});
        SPUtils r8 = a01.OXO1.IiI10X();
        AICoachManage.OXO1 r0 = AICoachManage.IiI10X;
        r8.put(b01.O1i0 + '_' + AICoachManage.VitalityData.class.getName(), new Gson().toJson(r0.OXO1().X0O()), false);
        I01XX0.XIi00iiXO(I01XX0.XIO11I, null, 2, null);
        r0.OXO1().IIX1OXO();
        finish();
    L8:
        if (r6 != 9000) goto L12;
        getMPagerView().setCurrentItem(0);
        return;
    }

    @Override // com.sma.smartv3.ui.device.guide.BaseAppGuideActivity, com.github.appintro.AppIntroBase, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@tb1 Bundle r3) {
        super.onCreate(r3);
        O11XO1X.XO0O10().X1ii(this);
        initConfiguration();
        if (getIntent().getIntExtra("type", 0) != 0) goto L5;
        addSlide(new PersonalInformationFragment());
        addSlide(new PersonalActivityFragment());
        addSlide(new PersonalActivityConfirmFragment());
    L5:
        addSlide(new PlanChooseDaysFragment());
        addSlide(new PlanStartTimeFragment());
        addSlide(new PlanGoalFragment());
        getNextButtonClick().setOnClickListener(new i0OOI1X1());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        O11XO1X.XO0O10().OiIIX101O(this);
    }

    @Override // com.github.appintro.AppIntroBase
    public void onDonePressed(@tb1 Fragment r3) {
        super.onDonePressed(r3);
        int r4 = this.CREATE_PLAN_DONE;
        startActivityForResult(new Intent(this, PlanConfirmActivity.class), r4);
    }

    @sf5(tag = I01XX0.IOIi00)
    public final void onPlanChooseDayChanged(int r4) {
        LogUtils.v(new Object[]{"onBloodGlucoseChanged"});
        if (r4 < 3) goto L6;
        getNextButtonClick().setVisibility(8);
        getNextButton().setVisibility(0);
        return;
    L6:
        getNextButtonClick().setVisibility(0);
        getNextButton().setVisibility(8);
    }

    @Override // com.github.appintro.AppIntroBase
    public void onSlideChanged(@tb1 Fragment r3, @tb1 Fragment r4) {
        super.onSlideChanged(r3, r4);
        LibExKt.XX1Oi(getAbhTitleRight(), true);
        if ((r4 instanceof PersonalInformationFragment) == false) goto L7;
        getAbhTitleCenter().setText(getString(R.string.personal_information));
        getNextButton().setText(getString(R.string.coach_create_plan_btn_next_step));
        return;
    L7:
        if ((r4 instanceof PersonalActivityFragment) == false) goto L11;
        getAbhTitleCenter().setText(getString(R.string.coach_create_plan_aa_title));
        getNextButton().setText(getString(R.string.btn_start));
        LibExKt.I0XXi0X(getAbhTitleRight(), true);
        getAbhTitleRight().setImageResource(R.drawable.plan_coach_ic_waring);
        return;
    L11:
        if ((r4 instanceof PersonalActivityConfirmFragment) == false) goto L15;
        getAbhTitleCenter().setText(getString(R.string.coach_create_plan_aa_title));
        getNextButton().setText(getString(R.string.next));
        return;
    L15:
        if ((r4 instanceof PlanChooseDaysFragment) == false) goto L23;
        getNextButtonClick().setText(getString(R.string.next));
        getNextButton().setText(getString(R.string.next));
        if (((PlanChooseDaysFragment) r4).getChoicesSize() < 3) goto L19;
        getNextButtonClick().setVisibility(8);
        getNextButton().setVisibility(0);
    L20:
        getAbhTitleCenter().setText(getString(R.string.coach_create_plan_cd_title));
        return;
    L19:
        getNextButtonClick().setVisibility(0);
        getNextButton().setVisibility(8);
        goto L20
    L23:
        if ((r4 instanceof PlanStartTimeFragment) == false) goto L27;
        getAbhTitleCenter().setText(getString(R.string.coach_create_plan_st_title));
        getNextButton().setText(getString(R.string.next));
        return;
    L27:
        if ((r4 instanceof PlanGoalFragment) == false) goto L30;
        getAbhTitleCenter().setText(getString(R.string.coach_create_plan_pg_title));
        getNextButton().setText(getString(R.string.got_it));
        return;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        onHandleBackPressed();
    }

    public final void onTitleRightClick(@aa1 View r3) {
        Intrinsics.X0O(r3, "view");
        Bundle r4 = new Bundle();
        r4.putString("mArg0", "https://api.iot-solution.net/web/help/ai_coach_activity_assessment.html");
        r4.putInt("mArg1", 2);
        r4.putParcelable("mArg2", null);
        r4.putSerializable("mArg3", null);
        Intent r0 = new Intent(this, WebViewActivity.class);
        r0.putExtras(r4);
        startActivity(r0);
    }
}
