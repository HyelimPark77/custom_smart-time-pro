.class public Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final RE_SEND_LIMIT:I = 0x3


# instance fields
.field private callback:Lcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;

.field private final characteristicUUID:Ljava/util/UUID;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final data:[B
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final device:Landroid/bluetooth/BluetoothDevice;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final retryLimit:I

.field private final serviceUUID:Ljava/util/UUID;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final writeType:I


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;I[BILcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;)V
    .locals 0
    .param p1    # Landroid/bluetooth/BluetoothDevice;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/UUID;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/UUID;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->device:Landroid/bluetooth/BluetoothDevice;

    .line 6
    iput-object p2, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->serviceUUID:Ljava/util/UUID;

    .line 7
    iput-object p3, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->characteristicUUID:Ljava/util/UUID;

    .line 8
    iput p4, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->writeType:I

    .line 9
    iput-object p5, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->data:[B

    .line 10
    iput p6, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->retryLimit:I

    .line 11
    invoke-virtual {p0, p7}, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->setCallback(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;)Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;

    return-void
.end method

.method public constructor <init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[B)V
    .locals 7
    .param p1    # Landroid/bluetooth/BluetoothDevice;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/UUID;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/UUID;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 1
    invoke-direct/range {v0 .. v6}, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[BILcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;)V

    return-void
.end method

.method public constructor <init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[BILcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;)V
    .locals 8
    .param p1    # Landroid/bluetooth/BluetoothDevice;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/UUID;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/UUID;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    .line 3
    invoke-direct/range {v0 .. v7}, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;I[BILcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;)V

    return-void
.end method

.method public constructor <init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;[BLcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;)V
    .locals 8
    .param p1    # Landroid/bluetooth/BluetoothDevice;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/UUID;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/UUID;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v4, 0x0

    const/4 v6, 0x3

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    move-object v7, p5

    .line 2
    invoke-direct/range {v0 .. v7}, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;I[BILcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->device:Landroid/bluetooth/BluetoothDevice;

    iget-object v3, p1, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->device:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v2, v3}, Landroid/bluetooth/BluetoothDevice;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->serviceUUID:Ljava/util/UUID;

    iget-object v3, p1, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->serviceUUID:Ljava/util/UUID;

    invoke-virtual {v2, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->characteristicUUID:Ljava/util/UUID;

    iget-object p1, p1, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->characteristicUUID:Ljava/util/UUID;

    invoke-virtual {v2, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public getCallback()Lcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->callback:Lcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;

    return-object v0
.end method

.method public getCharacteristicUUID()Ljava/util/UUID;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->characteristicUUID:Ljava/util/UUID;

    return-object v0
.end method

.method public getData()[B
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->data:[B

    return-object v0
.end method

.method public getDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->device:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public getRetryLimit()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->retryLimit:I

    return v0
.end method

.method public getServiceUUID()Ljava/util/UUID;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->serviceUUID:Ljava/util/UUID;

    return-object v0
.end method

.method public getWriteType()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->writeType:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->device:Landroid/bluetooth/BluetoothDevice;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->serviceUUID:Ljava/util/UUID;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->characteristicUUID:Ljava/util/UUID;

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public setCallback(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;)Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->callback:Lcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleSendParam{device="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->device:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", serviceUUID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->serviceUUID:Ljava/util/UUID;

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->read16BitUUID(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", characteristicUUID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->characteristicUUID:Ljava/util/UUID;

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->read16BitUUID(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", writeType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->writeType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->data:[B

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", retryLimit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->retryLimit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", callback="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->callback:Lcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
