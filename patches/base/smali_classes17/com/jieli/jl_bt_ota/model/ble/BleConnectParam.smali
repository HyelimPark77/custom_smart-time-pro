.class public Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final bleCharacteristicList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;",
            ">;"
        }
    .end annotation
.end field

.field private isNeedChangeBleMtu:Z

.field private preferredPhy:I

.field private reconnect:Z

.field private requestMtu:I

.field private retryCount:I

.field private retryDelay:J

.field private retryLimit:I

.field private final timeout:J

.field private transport:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const-wide/32 v0, 0x9c40

    .line 1
    invoke-direct {p0, v0, v1}, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;-><init>(J)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->timeout:J

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->reconnect:Z

    .line 5
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->bleCharacteristicList:Ljava/util/List;

    .line 6
    new-instance v0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;

    sget-object v1, Lcom/jieli/jl_bt_ota/constant/BluetoothConstant;->UUID_SERVICE:Ljava/util/UUID;

    sget-object v2, Lcom/jieli/jl_bt_ota/constant/BluetoothConstant;->UUID_WRITE:Ljava/util/UUID;

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;-><init>(Ljava/util/UUID;Ljava/util/UUID;I)V

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    new-instance v0, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;

    sget-object v2, Lcom/jieli/jl_bt_ota/constant/BluetoothConstant;->UUID_NOTIFICATION:Ljava/util/UUID;

    const/16 v3, 0x10

    invoke-direct {v0, v1, v2, v3}, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;-><init>(Ljava/util/UUID;Ljava/util/UUID;I)V

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->isNeedChangeBleMtu:Z

    const/16 p2, 0x1fd

    .line 9
    iput p2, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->requestMtu:I

    .line 10
    iput p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->preferredPhy:I

    const/4 p2, 0x2

    .line 11
    iput p2, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->transport:I

    .line 12
    iput p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->retryLimit:I

    const-wide/16 p1, 0x7d0

    .line 13
    iput-wide p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->retryDelay:J

    return-void
.end method


# virtual methods
.method public canRetry()Z
    .locals 3

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->retryCount:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->retryCount:I

    iget v2, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->retryLimit:I

    if-gt v0, v2, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getBleCharacteristicList()Ljava/util/List;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->bleCharacteristicList:Ljava/util/List;

    return-object v0
.end method

.method public getBleCharacteristicList(I)Ljava/util/List;
    .locals 6
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->bleCharacteristicList:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :cond_0
    :goto_0
    if-ge v3, v2, :cond_1

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    check-cast v4, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;

    .line 4
    invoke-virtual {v4, p1}, Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;->hasProperty(I)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 5
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public getBleWriteCharacteristicList()Ljava/util/List;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_bt_ota/model/ble/BleCharacteristic;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x4

    invoke-virtual {p0, v1}, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->getBleCharacteristicList(I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    const/16 v1, 0x8

    invoke-virtual {p0, v1}, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->getBleCharacteristicList(I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public getPreferredPhy()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->preferredPhy:I

    return v0
.end method

.method public getRequestMtu()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->requestMtu:I

    return v0
.end method

.method public getRetryDelay()J
    .locals 2

    iget-wide v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->retryDelay:J

    return-wide v0
.end method

.method public getRetryLimit()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->retryLimit:I

    return v0
.end method

.method public getTimeout()J
    .locals 2

    iget-wide v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->timeout:J

    return-wide v0
.end method

.method public getTransport()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->transport:I

    return v0
.end method

.method public isNeedChangeBleMtu()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->isNeedChangeBleMtu:Z

    return v0
.end method

.method public isReconnect()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->reconnect:Z

    return v0
.end method

.method public isValid()Z
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->bleCharacteristicList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->getBleWriteCharacteristicList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public resetRetryCount()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->retryCount:I

    return-void
.end method

.method public setNeedChangeBleMtu(Z)Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->isNeedChangeBleMtu:Z

    return-object p0
.end method

.method public setPreferredPhy(I)Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->preferredPhy:I

    return-object p0
.end method

.method public setReconnect(Z)Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->reconnect:Z

    return-object p0
.end method

.method public setRequestMtu(I)Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->requestMtu:I

    return-object p0
.end method

.method public setRetryDelay(J)Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;
    .locals 0

    iput-wide p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->retryDelay:J

    return-object p0
.end method

.method public setRetryLimit(I)Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->retryLimit:I

    return-object p0
.end method

.method public setTransport(I)Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->transport:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleConnectParam{timeout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->timeout:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", reconnect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->reconnect:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isNeedChangeBleMtu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->isNeedChangeBleMtu:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", requestMtu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->requestMtu:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bleCharacteristicList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->bleCharacteristicList:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", preferredPhy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->preferredPhy:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", transport="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->transport:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", retryLimit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->retryLimit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", retryDelay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->retryDelay:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", retryCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->retryCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
