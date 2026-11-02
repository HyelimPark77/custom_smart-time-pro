.class Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 10
    .param p1    # Landroid/os/Message;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x1238

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_6

    const/16 v1, 0x1239

    if-eq v0, v1, :cond_5

    const-string v1, "device : "

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    goto/16 :goto_1

    :pswitch_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, p1, Landroid/bluetooth/BluetoothDevice;

    if-nez v0, :cond_0

    return v3

    :cond_0
    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    iget-object v0, v0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v4, "DISCONNECT_DEVICE_TIMEOUT"

    invoke-static {v0, v4, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-virtual {v0, p1, v3}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->onBtDeviceConnection(Landroid/bluetooth/BluetoothDevice;I)V

    goto/16 :goto_1

    :pswitch_1
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    const/16 v0, 0x4011

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v0

    const-string v1, "OTA_RECONNECT_DEVICE_TIMEOUT"

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Ljava/lang/String;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    goto/16 :goto_1

    :pswitch_2
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    iget-object p1, p1, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string v0, "CALLBACK_OTA_FINISH"

    const-string v1, "---->"

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V

    goto/16 :goto_1

    :pswitch_3
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->isOTA()Z

    move-result p1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {v1, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->e(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v1

    iget-object v4, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {v4}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->i(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->isWaitingForUpdate()Z

    move-result v4

    iget-object v5, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {v5}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->k(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Lcom/jieli/jl_bt_ota/model/ReconnectParam;

    move-result-object v5

    iget-object v6, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    iget-object v7, v6, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    invoke-virtual {v6, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    filled-new-array {v0, v6, v8, v9, v5}, [Ljava/lang/Object;

    move-result-object v0

    const-string v6, "device : %s, isOTA = %s, isWaitingForUpdate = %s, isConnectedDevice = %s\n %s"

    invoke-static {v6, v0}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v6, "OTA_RECONNECT_DEVICE"

    invoke-static {v7, v6, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_8

    if-eqz v4, :cond_8

    if-nez v1, :cond_3

    if-eqz v5, :cond_3

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->i(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->getReconnectAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Lcom/jieli/jl_bt_ota/model/ReconnectParam;->getFlag()I

    move-result v1

    if-ne v1, v2, :cond_1

    move v3, v2

    :cond_1
    invoke-static {p1, v0, v3}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Ljava/lang/String;Z)V

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isUseReconnect()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->i(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->startReconnectTask()V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->l(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Landroid/os/Handler;

    move-result-object p1

    const/16 v0, 0x1241

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->l(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Landroid/os/Handler;

    move-result-object p1

    sget-wide v3, Lcom/jieli/jl_bt_ota/tool/DeviceReConnectManager;->RECONNECT_TIMEOUT:J

    invoke-virtual {p1, v0, v3, v4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :goto_0
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Lcom/jieli/jl_bt_ota/model/ReconnectParam;)V

    goto/16 :goto_1

    :cond_3
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    iget-object p1, p1, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    const-string v0, "Is the implementation of getConnectedDevice() incorrect?"

    invoke-static {p1, v6, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, p1, Landroid/bluetooth/BluetoothDevice;

    if-nez v0, :cond_4

    return v3

    :cond_4
    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    iget-object v0, v0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-virtual {v1, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "CHANGE_BLE_MTU_TIMEOUT"

    invoke-static {v0, v3, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {v0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;)V

    goto :goto_1

    :pswitch_5
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    const/16 v0, 0x300b

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v0

    const-string v1, "RECEIVE_CMD_TIMEOUT"

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Ljava/lang/String;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    iget-object p1, p1, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "----> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->k(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Lcom/jieli/jl_bt_ota/model/ReconnectParam;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WAIT_DEVICE_DISCONNECT"

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->k(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Lcom/jieli/jl_bt_ota/model/ReconnectParam;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/ReconnectParam;)V

    goto :goto_1

    :cond_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, p1, Landroid/bluetooth/BluetoothDevice;

    if-nez v0, :cond_7

    return v3

    :cond_7
    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    iget-object v0, v0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sppDevice :"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-virtual {v3, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "WAIT_EDR_DISCONNECT"

    invoke-static {v0, v3, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$1;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {v0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->g(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;)V

    :cond_8
    :goto_1
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x1234
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1240
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
