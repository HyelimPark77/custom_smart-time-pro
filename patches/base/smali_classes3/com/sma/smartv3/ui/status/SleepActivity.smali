.class public final Lcom/sma/smartv3/ui/status/SleepActivity;
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
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->IXi01O()Z

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initFragment -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->IXi01O()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/SleepAllDayDayFragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/SleepAllDayDayFragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->setDayFragment(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/SleepAllDayWeekFragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/SleepAllDayWeekFragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->setWeeFragment(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/SleepAllDayMonthFragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/SleepAllDayMonthFragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->setMonthFragment(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    return-void

    :cond_0
    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->setDayFragment(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/SleepWeekFragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/SleepWeekFragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->setWeeFragment(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/SleepMonthFragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/SleepMonthFragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->setMonthFragment(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    return-void
.end method

.method public setTitle()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const v0, 0x7f14125d

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
