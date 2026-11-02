.class Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$16;
.super Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;
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

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$16;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onA2dpStatus(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$16;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->j(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->onA2dpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$16;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    const/4 v1, 0x2

    invoke-static {v0, p1, v1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->b(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;II)V

    return-void
.end method

.method public onAdapterStatus(ZZ)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$16;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->j(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->onAdapterStatus(ZZ)V

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$16;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    const/16 p2, 0x1003

    invoke-static {p2}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p2

    const-string v0, "onAdapterStatus"

    invoke-static {p1, v0, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Ljava/lang/String;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$16;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$16;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->b(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onDiscovery(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/BleScanMessage;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$16;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->j(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->onDiscovery(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/BleScanMessage;)V

    return-void
.end method

.method public onDiscoveryStatus(ZZ)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$16;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->j(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->onDiscoveryStatus(ZZ)V

    return-void
.end method

.method public onHfpStatus(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$16;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->j(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->onHfpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$16;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->b(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;II)V

    return-void
.end method
