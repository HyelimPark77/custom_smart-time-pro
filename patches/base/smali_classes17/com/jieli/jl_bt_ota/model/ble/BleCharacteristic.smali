.class public Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final RETRY_LIMIT:I = 0x2


# instance fields
.field private final characteristicUUID:Ljava/util/UUID;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private enable:Z

.field private final requiredProperty:I

.field private retryCount:I

.field private final retryLimit:I

.field private final serviceUUID:Ljava/util/UUID;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/UUID;Ljava/util/UUID;I)V
    .locals 1
    .param p1    # Ljava/util/UUID;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/UUID;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x2

    .line 1
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;-><init>(Ljava/util/UUID;Ljava/util/UUID;II)V

    return-void
.end method

.method public constructor <init>(Ljava/util/UUID;Ljava/util/UUID;II)V
    .locals 1
    .param p1    # Ljava/util/UUID;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/UUID;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->enable:Z

    .line 4
    iput-object p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->serviceUUID:Ljava/util/UUID;

    .line 5
    iput-object p2, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->characteristicUUID:Ljava/util/UUID;

    .line 6
    iput p3, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->requiredProperty:I

    .line 7
    iput p4, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->retryLimit:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    instance-of v0, p1, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->serviceUUID:Ljava/util/UUID;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->getServiceUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->characteristicUUID:Ljava/util/UUID;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->getCharacteristicUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public getCharacteristicUUID()Ljava/util/UUID;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->characteristicUUID:Ljava/util/UUID;

    return-object v0
.end method

.method public getRequiredProperty()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->requiredProperty:I

    return v0
.end method

.method public getRetryCount()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->retryCount:I

    return v0
.end method

.method public getRetryLimit()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->retryLimit:I

    return v0
.end method

.method public getServiceUUID()Ljava/util/UUID;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->serviceUUID:Ljava/util/UUID;

    return-object v0
.end method

.method public hasProperty(I)Z
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->requiredProperty:I

    and-int/2addr v0, p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->serviceUUID:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->characteristicUUID:Ljava/util/UUID;

    invoke-virtual {v1}, Ljava/util/UUID;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public isEnable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->enable:Z

    return v0
.end method

.method public isOverLimit()Z
    .locals 3

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->retryCount:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->retryCount:I

    iget v2, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->retryLimit:I

    if-le v0, v2, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public setEnable(Z)Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->enable:Z

    return-object p0
.end method

.method public setRetryCount(I)Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->retryCount:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleCharacteristic{serviceUUID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->serviceUUID:Ljava/util/UUID;

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->read16BitUUID(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", characteristicUUID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->characteristicUUID:Ljava/util/UUID;

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/UuidUtil;->read16BitUUID(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", requiredProperty="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->requiredProperty:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", retryLimit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->retryLimit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", retryCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->retryCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", enable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->enable:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
