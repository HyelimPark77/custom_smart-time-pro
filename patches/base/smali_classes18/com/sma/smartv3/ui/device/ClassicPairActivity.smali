.class public final Lcom/sma/smartv3/ui/device/ClassicPairActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nClassicPairActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicPairActivity.kt\ncom/sma/smartv3/ui/device/ClassicPairActivity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n*L\n1#1,36:1\n98#2,4:37\n*S KotlinDebug\n*F\n+ 1 ClassicPairActivity.kt\ncom/sma/smartv3/ui/device/ClassicPairActivity\n*L\n24#1:37,4\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nClassicPairActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicPairActivity.kt\ncom/sma/smartv3/ui/device/ClassicPairActivity\n+ 2 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n*L\n1#1,36:1\n98#2,4:37\n*S KotlinDebug\n*F\n+ 1 ClassicPairActivity.kt\ncom/sma/smartv3/ui/device/ClassicPairActivity\n*L\n24#1:37,4\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    sget-object v1, Lcom/bestmafen/androidbase/base/BaseFragment;->Companion:Lcom/bestmafen/androidbase/base/BaseFragment$OXO1;

    const-class v1, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuide2Fragment;

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bestmafen/androidbase/base/BaseFragment;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    if-eqz v1, :cond_1

    check-cast v1, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuide2Fragment;

    const v2, 0x7f0a027e

    invoke-virtual {v0, v2, v1}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isBoundClassic()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f14020c

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "3.0 "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type com.sma.smartv3.ui.device.guide.ClassicPairGuide2Fragment"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0045

    return v0
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
