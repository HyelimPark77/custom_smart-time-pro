.class Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Landroid/bluetooth/BluetoothDevice;[B)V
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
.field final synthetic a:Landroid/bluetooth/BluetoothDevice;

.field final synthetic b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$8;->b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    iput-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$8;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$8;->b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    const-string v1, "upgradeStep02"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Ljava/lang/String;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Integer;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$8;->b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    iget-object v0, v0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->TAG:Ljava/lang/String;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Step2.Check if the device can be upgraded. Result : %d"

    invoke-static {v2, v1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "inquiryDeviceCanOTA"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$8;->b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$8;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-static {p1, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->d(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;)V

    return-void

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->convertCmdE2Error(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$8;->onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$8;->onSuccess(Ljava/lang/Integer;)V

    return-void
.end method
