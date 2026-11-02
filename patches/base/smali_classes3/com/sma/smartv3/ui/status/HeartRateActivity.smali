.class public final Lcom/sma/smartv3/ui/status/HeartRateActivity;
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

    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/HeartRateDayFragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/HeartRateDayFragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->setDayFragment(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/HeartRateWeekFragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/HeartRateWeekFragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->setWeeFragment(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/HeartRateMonthFragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/HeartRateMonthFragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->setMonthFragment(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    return-void
.end method

.method public setTitle()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const v0, 0x7f140cb6

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
