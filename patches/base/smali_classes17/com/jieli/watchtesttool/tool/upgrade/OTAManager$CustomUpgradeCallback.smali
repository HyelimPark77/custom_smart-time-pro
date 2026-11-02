.class final Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$CustomUpgradeCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "CustomUpgradeCallback"
.end annotation


# instance fields
.field private final mIUpgradeCallback:Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;

.field final synthetic this$0:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;


# direct methods
.method public constructor <init>(Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010,
            0x0
        }
        names = {
            null,
            null
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$CustomUpgradeCallback;->this$0:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$CustomUpgradeCallback;->mIUpgradeCallback:Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;

    return-void
.end method


# virtual methods
.method public onCancelOTA()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$CustomUpgradeCallback;->mIUpgradeCallback:Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;->onCancelOTA()V

    :cond_0
    return-void
.end method

.method public onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$CustomUpgradeCallback;->mIUpgradeCallback:Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;->onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    :cond_0
    return-void
.end method

.method public onNeedReconnect(Ljava/lang/String;Z)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$CustomUpgradeCallback;->this$0:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    invoke-static {v0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->access$000(Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;)Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getBluetoothOp()Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getHistoryRecord(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getConnectType()I

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getMappedAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setAddress(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setConnectType(I)V

    invoke-virtual {v0, v2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setMappedAddress(Ljava/lang/String;)V

    :try_start_0
    iget-object v1, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$CustomUpgradeCallback;->this$0:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    invoke-static {v1}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->access$000(Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;)Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getBluetoothOp()Lcom/jieli/bluetooth_connect/impl/BluetoothManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothManager;->getHistoryRecordHelper()Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->updateHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$CustomUpgradeCallback;->mIUpgradeCallback:Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;->onNeedReconnect(Ljava/lang/String;Z)V

    :cond_1
    return-void
.end method

.method public onProgress(IF)V
    .locals 2

    if-nez p1, :cond_0

    const/high16 v0, 0x42480000    # 50.0f

    cmpl-float v0, p2, v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$CustomUpgradeCallback;->this$0:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    invoke-static {v0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->access$100(Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$CustomUpgradeCallback;->this$0:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    invoke-static {v0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->access$200(Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$CustomUpgradeCallback;->this$0:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    invoke-virtual {v0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->access$102(Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;Ljava/lang/String;)Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$CustomUpgradeCallback;->mIUpgradeCallback:Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;->onProgress(IF)V

    :cond_1
    return-void
.end method

.method public onStartOTA()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$CustomUpgradeCallback;->mIUpgradeCallback:Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;->onStartOTA()V

    :cond_0
    return-void
.end method

.method public onStopOTA()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$CustomUpgradeCallback;->this$0:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->access$300(Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$CustomUpgradeCallback;->this$0:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    invoke-static {v0, v1}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->access$102(Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$CustomUpgradeCallback;->mIUpgradeCallback:Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;->onStopOTA()V

    :cond_0
    return-void
.end method
