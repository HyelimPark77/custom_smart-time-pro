.class public final Lcom/sma/smartv3/ui/status/TemperatureActivity;
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

    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/TemperatureDayFragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->setDayFragment(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/TemperatureWeekFragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/TemperatureWeekFragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->setWeeFragment(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->setMonthFragment(Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;)V

    return-void
.end method

.method public setTitle()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XI1OX0IO()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f140235

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    const v0, 0x7f141316

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    return-object v0
.end method
