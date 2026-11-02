.class public Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private retryCount:I

.field private final sendParam:Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private status:I


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;I[BLcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;)V
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
    .param p5    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    new-instance v0, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;

    const/4 v6, 0x3

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;I[BILcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;)V

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;-><init>(Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;)V

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

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p4

    .line 1
    invoke-direct/range {v0 .. v6}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;I[BLcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;)V

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;)V
    .locals 0
    .param p1    # Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->sendParam:Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->retryCount:I

    const/4 p1, -0x1

    .line 6
    iput p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->status:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->sendParam:Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;

    iget-object p1, p1, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->sendParam:Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public getCallback()Lcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->sendParam:Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->getCallback()Lcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;

    move-result-object v0

    return-object v0
.end method

.method public getCharacteristicUUID()Ljava/util/UUID;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->sendParam:Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->getCharacteristicUUID()Ljava/util/UUID;

    move-result-object v0

    return-object v0
.end method

.method public getData()[B
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->sendParam:Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->getData()[B

    move-result-object v0

    return-object v0
.end method

.method public getDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->sendParam:Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method public getSendParam()Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->sendParam:Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;

    return-object v0
.end method

.method public getServiceUUID()Ljava/util/UUID;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->sendParam:Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->getServiceUUID()Ljava/util/UUID;

    move-result-object v0

    return-object v0
.end method

.method public getStatus()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->status:I

    return v0
.end method

.method public getWriteType()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->sendParam:Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->getWriteType()I

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->sendParam:Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public isSendFailedOverLimit()Z
    .locals 3

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->retryCount:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->retryCount:I

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->sendParam:Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;

    invoke-virtual {v2}, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->getRetryLimit()I

    move-result v2

    if-lt v0, v2, :cond_0

    return v1

    :cond_0
    const/4 v0, -0x1

    iput v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->status:I

    const/4 v0, 0x0

    return v0
.end method

.method public setCallback(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;)Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->sendParam:Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;->setCallback(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;)Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;

    return-object p0
.end method

.method public setStatus(I)Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->status:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleSendTask{sendParam="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->sendParam:Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retryCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->retryCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->status:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
