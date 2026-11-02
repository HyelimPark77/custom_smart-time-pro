.class public Lcom/jieli/jl_bt_ota/model/ble/BleDevice;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final RETRY_LIMIT:I = 0x2


# instance fields
.field private bleMtu:I

.field private bluetoothGatt:Landroid/bluetooth/BluetoothGatt;

.field private final connectParam:Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private connection:I

.field private final device:Landroid/bluetooth/BluetoothDevice;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private isUsing:Z

.field private retryCount:I

.field private final retryLimit:I


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;)V
    .locals 1
    .param p1    # Landroid/bluetooth/BluetoothDevice;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x2

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;I)V

    return-void
.end method

.method public constructor <init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;I)V
    .locals 1
    .param p1    # Landroid/bluetooth/BluetoothDevice;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x14

    .line 3
    iput v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->bleMtu:I

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->connection:I

    .line 5
    iput-object p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->device:Landroid/bluetooth/BluetoothDevice;

    .line 6
    iput-object p2, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->connectParam:Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;

    .line 7
    iput p3, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->retryLimit:I

    .line 8
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->resetRetryCount()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    instance-of v0, p1, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->device:Landroid/bluetooth/BluetoothDevice;

    check-cast p1, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    iget-object p1, p1, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->device:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0, p1}, Landroid/bluetooth/BluetoothDevice;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getBleMtu()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->bleMtu:I

    return v0
.end method

.method public getBluetoothGatt()Landroid/bluetooth/BluetoothGatt;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->bluetoothGatt:Landroid/bluetooth/BluetoothGatt;

    return-object v0
.end method

.method public getConnectParam()Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->connectParam:Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;

    return-object v0
.end method

.method public getConnection()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->connection:I

    return v0
.end method

.method public getDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->device:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public getRetryCount()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->retryCount:I

    return v0
.end method

.method public getRetryLimit()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->retryLimit:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->device:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->hashCode()I

    move-result v0

    return v0
.end method

.method public isConnectATT()Z
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->connectParam:Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->getTransport()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isConnected()Z
    .locals 2

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->connection:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->bluetoothGatt:Landroid/bluetooth/BluetoothGatt;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isOverRetryLimit()Z
    .locals 3

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->retryCount:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->retryCount:I

    iget v2, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->retryLimit:I

    if-lt v0, v2, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isUsing()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->isUsing:Z

    return v0
.end method

.method public setBleMtu(I)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x14L
            to = 0x1fdL
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "Range"
        }
    .end annotation

    const/16 v0, 0x80

    if-lt p1, v0, :cond_0

    add-int/lit8 p1, p1, -0x6

    :cond_0
    iput p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->bleMtu:I

    return-object p0
.end method

.method public setBluetoothGatt(Landroid/bluetooth/BluetoothGatt;)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->bluetoothGatt:Landroid/bluetooth/BluetoothGatt;

    return-object p0
.end method

.method public setConnection(I)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;
    .locals 2

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->connection:I

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    iput v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->retryCount:I

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->connectParam:Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->resetRetryCount()V

    return-object p0

    :cond_0
    invoke-virtual {p0, v1}, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->setUsing(Z)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;

    return-object p0
.end method

.method public setUsing(Z)Lcom/jieli/jl_bt_ota/model/ble/BleDevice;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->isUsing:Z

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleDevice{device="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->device:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \nconnectParam="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->connectParam:Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \nbluetoothGatt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->bluetoothGatt:Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bleMtu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->bleMtu:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", connection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->connection:I

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->printBtConnectionState(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isUsing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleDevice;->isUsing:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
