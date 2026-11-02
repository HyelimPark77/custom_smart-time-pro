.class public final Lcom/sma/smartv3/ui/me/DeveloperUpgradeGQActivity$onBottomClick$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/androidnetworklib/method/HttpProgressCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperUpgradeGQActivity;->onBottomClick(Landroid/view/View;)V
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
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeGQActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGQActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGQActivity$onBottomClick$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeGQActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 8

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGQActivity$onBottomClick$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeGQActivity;

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGQActivity$onBottomClick$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeGQActivity;

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Goodix_Fast_DFU"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGQActivity$onBottomClick$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeGQActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGQActivity;->access$upgrade(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGQActivity;)V

    return-void

    :cond_1
    :goto_0
    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->OTA:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x1c

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGQActivity$onBottomClick$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeGQActivity;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGQActivity;->access$setMStarted(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGQActivity;Z)V

    return-void
.end method

.method public handleProgress(I)V
    .locals 0

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGQActivity$onBottomClick$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
