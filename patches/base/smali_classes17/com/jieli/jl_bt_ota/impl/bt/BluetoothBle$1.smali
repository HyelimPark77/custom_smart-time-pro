.class Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread$IBleOperation;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$1;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBleMtu(Landroid/bluetooth/BluetoothDevice;)I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$1;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->getBleMtu(Landroid/bluetooth/BluetoothDevice;)I

    move-result p1

    return p1
.end method

.method public writeBleData(Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;)Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle$1;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->writeBleData(Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;)Z

    move-result p1

    return p1
.end method
