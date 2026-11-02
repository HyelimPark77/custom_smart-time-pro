.class public final Lcom/sma/smartv3/ui/device/dial/DialV2Activity;
.super Lcom/sma/smartv3/ui/device/dial/DialActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dial/DialActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    new-instance p1, Lcom/sma/smartv3/ui/device/dial/DialOnlineV2Fragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/dial/DialOnlineV2Fragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->setOnlineFragment(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->getOnlineFragment()Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;

    move-result-object p1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "mArg0"

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mArg1"

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    new-instance p1, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->setCustomizeFragment(Lcom/sma/smartv3/ui/device/dial/DialCustomizeFragment;)V

    new-instance p1, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->setAigcFragment(Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V

    new-instance p1, Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->setDialRecordingFragment(Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->IXiOXO()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dial/DialActivity;->setShowCustom(Z)V

    return-void
.end method
