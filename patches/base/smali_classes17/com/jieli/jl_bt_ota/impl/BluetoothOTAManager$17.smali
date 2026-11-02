.class Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$17;
.super Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;
.source "SourceFile"


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

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$17;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnectStateChange(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$17;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {v0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->b(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;I)V

    :cond_0
    return-void
.end method

.method public onMandatoryUpgrade(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$17;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->j(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->onMandatoryUpgrade(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public onRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$17;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->j(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->onReceiveCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->isResponseCmd()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$17;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {v0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$17;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {v0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->b(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public onRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 0

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$17;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->j(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method public onRcspInit(Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 1

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$17;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {p2, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->f(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :cond_0
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$17;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    const/4 v0, 0x1

    invoke-static {p2, p1, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->b(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method
