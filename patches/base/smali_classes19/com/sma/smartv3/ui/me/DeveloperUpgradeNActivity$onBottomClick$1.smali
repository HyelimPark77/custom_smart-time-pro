.class public final Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity$onBottomClick$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/androidnetworklib/method/HttpProgressCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;->onBottomClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/sma/androidnetworklib/method/HttpProgressCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity$onBottomClick$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity$onBottomClick$1;->iO(Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;)V

    return-void
.end method

.method public static final iO(Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;)V
    .locals 10

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->SESSION:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->CREATE:Lcom/szabh/smable3/BleKeyFlag;

    sget-object v9, Lkotlin/random/Random;->Default:Lkotlin/random/Random$Default;

    invoke-virtual {v9}, Lkotlin/random/Random$Default;->nextInt()I

    move-result v3

    const/16 v7, 0x38

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt32$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/nio/ByteOrder;ZZILjava/lang/Object;)Z

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    invoke-virtual {v9}, Lkotlin/random/Random$Default;->nextInt()I

    move-result v3

    invoke-static/range {v0 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt32$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/nio/ByteOrder;ZZILjava/lang/Object;)Z

    sget-object v1, Lcom/szabh/smable3/BleKey;->OTA:Lcom/szabh/smable3/BleKey;

    const/16 v6, 0x1c

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;->access$getMBleScanner(Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XXI(Z)V

    return-void
.end method


# virtual methods
.method public XIi00iiXO(Ljava/lang/String;)V
    .locals 4

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity$onBottomClick$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O10iXXI;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/O10iXXI;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;)V

    const-wide/16 v2, 0xfa0

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity$onBottomClick$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;->access$setMStarted(Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;Z)V

    return-void
.end method

.method public handleProgress(I)V
    .locals 0

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity$onBottomClick$1;->XIi00iiXO(Ljava/lang/String;)V

    return-void
.end method
