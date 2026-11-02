.class Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    const-string v1, "upgradeStep05"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Ljava/lang/String;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Integer;)V
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    iget-object v0, v0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Step05. Check upgrade status. Result : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v2}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatInt(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "upgradeStep05"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getDeviceInfo()Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    move-result-object v1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_2

    .line 6
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {p1, v4}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Z)V

    if-eqz v1, :cond_0

    .line 7
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->d(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Lcom/jieli/jl_bt_ota/tool/configure/OtaConfigureHelper;

    move-result-object p1

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getUid()I

    move-result v0

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getPid()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/jieli/jl_bt_ota/tool/configure/OtaConfigureHelper;->removeAddress(II)V

    .line 8
    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isPriorityCallbackOtaFinish()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 9
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V

    goto :goto_0

    .line 10
    :cond_1
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->l(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Landroid/os/Handler;

    move-result-object p1

    const/16 v0, 0x1240

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 11
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->l(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Landroid/os/Handler;

    move-result-object p1

    const-wide/16 v1, 0x1f4

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 12
    :goto_0
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->c(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Lcom/jieli/jl_bt_ota/tool/RcspOTA;

    move-result-object p1

    new-instance v0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13$1;

    invoke-direct {v0, p0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13$1;-><init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;)V

    invoke-virtual {p1, v0}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->rebootDevice(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    return-void

    .line 13
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v5, 0x80

    if-ne v3, v5, :cond_5

    .line 14
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->f(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V

    const/4 p1, 0x1

    if-eqz v1, :cond_3

    .line 15
    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isSupportDoubleBackup()Z

    move-result v1

    if-eqz v1, :cond_3

    move v4, p1

    .line 16
    :cond_3
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    iget-object v1, v1, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "download resource finish. isSupportDoubleBackup : "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v4, :cond_4

    .line 17
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->g(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V

    return-void

    .line 18
    :cond_4
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {v1, v0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;I)V

    return-void

    .line 19
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0xfe

    if-ne v2, v3, :cond_7

    .line 20
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->f(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V

    const/4 p1, 0x2

    if-eqz v1, :cond_6

    .line 21
    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isSupportReuseSpaceOTA()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 22
    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getExpandMode()I

    move-result v2

    if-ne v2, p1, :cond_6

    .line 23
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isMandatoryUpgrade()Z

    move-result v1

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;Z)Ljava/lang/String;

    move-result-object p1

    .line 24
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->c(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Lcom/jieli/jl_bt_ota/tool/RcspOTA;

    move-result-object v0

    new-instance v1, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13$2;

    invoke-direct {v1, p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13$2;-><init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->rebootDevice(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    return-void

    .line 25
    :cond_6
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {v1, v0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;I)V

    return-void

    .line 26
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->convertCmdE6Error(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$13;->onSuccess(Ljava/lang/Integer;)V

    return-void
.end method
