.class public final Lcom/sma/smartv3/ui/device/AlipaySetActivity$getPayMacAddress$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/AlipaySetActivity;->getPayMacAddress()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/smartv3/model/DeviceState;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$getPayMacAddress$1;->OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/model/DeviceState;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getPayMacAddress -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$getPayMacAddress$1;->OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->access$setMDeviceState$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;Lcom/sma/smartv3/model/DeviceState;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$getPayMacAddress$1;->OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/DeviceState;->getPayAddress()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->access$sendNewAddress(Lcom/sma/smartv3/ui/device/AlipaySetActivity;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$getPayMacAddress$1;->OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " getPayMacAddress -> error = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$getPayMacAddress$1;->OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->access$setMDeviceState$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;Lcom/sma/smartv3/model/DeviceState;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$getPayMacAddress$1;->OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->access$dismissLoadPopup(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V

    const-string v0, "code=3009"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p1, v0, v2, v3, v1}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$getPayMacAddress$1;->OXO1:Lcom/sma/smartv3/ui/device/AlipaySetActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->showFirmwareUpgradePopup()V

    return-void

    :cond_0
    const-string v0, "code=4005"

    invoke-static {p1, v0, v2, v3, v1}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const p1, 0x7f1410f2

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_1
    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/DeviceState;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/AlipaySetActivity$getPayMacAddress$1;->OXO1(Lcom/sma/smartv3/model/DeviceState;)V

    return-void
.end method
