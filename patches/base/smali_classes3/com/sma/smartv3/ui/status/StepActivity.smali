.class public final Lcom/sma/smartv3/ui/status/StepActivity;
.super Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public initFragment()V
    .locals 1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->i101iO()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/v2/StepDayV2Fragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->setDayFragment(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/v2/StepWeekV2Fragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/v2/StepWeekV2Fragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->setWeeFragment(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/v2/StepMonthV2Fragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/v2/StepMonthV2Fragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->setMonthFragment(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    return-void

    :cond_0
    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/StepDayFragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->setDayFragment(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/StepWeekFragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/StepWeekFragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->setWeeFragment(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/StepMonthFragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/StepMonthFragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->setMonthFragment(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    return-void
.end method

.method public initView()V
    .locals 3

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->initView()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->i101iO()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f060718

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, p0, v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->setStatusBarColor(Landroid/app/Activity;I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f060795

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    const v0, 0x7f0a0bcb

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public layoutId()I
    .locals 1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->i101iO()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f0d0122

    return v0

    :cond_0
    const v0, 0x7f0d0120

    return v0
.end method

.method public setTitle()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const v0, 0x7f1412c6

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
