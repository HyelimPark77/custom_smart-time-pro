.class public final Lcom/sma/smartv3/ui/device/dialpay/DialMoveV2Activity;
.super Lcom/sma/smartv3/ui/device/dialpay/DialMoveActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/dialpay/DialMoveActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    new-instance p1, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveV2Fragment;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveV2Fragment;-><init>()V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/DialMoveActivity;->setOnlineFragment(Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/DialMoveActivity;->getOnlineFragment()Lcom/sma/smartv3/ui/device/dialpay/fragment/PayOnlineMoveFragment;

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

    return-void
.end method
