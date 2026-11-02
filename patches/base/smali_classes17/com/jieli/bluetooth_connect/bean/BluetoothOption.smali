.class public Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private bleScanMode:I

.field private bleScanStrategy:I

.field private final bleUUIDMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation
.end field

.field private enterLowPowerMode:Z

.field private isAutoConnectBle:Z

.field private isNeedChangeBleMtu:Z

.field private isNotAssociatedEDR:Z

.field private isOnlyConnect:Z

.field private isSkipNoneNameDevice:Z

.field private isSupportA2DP:Z

.field private isSupportCTKD:Z

.field private isUseBleBondWay:Z

.field private isUseDeviceAuth:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private isUseMultiDevice:Z

.field private mtu:I

.field private otaScanFilterData:Ljava/lang/String;

.field private priority:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private reconnect:Z

.field private scanFilterData:Ljava/lang/String;

.field private sppUUID:Ljava/util/UUID;

.field private timeoutMs:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->priority:I

    const/16 v1, 0x7d0

    iput v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->timeoutMs:I

    iput-boolean v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->enterLowPowerMode:Z

    iput-boolean v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isUseMultiDevice:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isUseDeviceAuth:Z

    iput-boolean v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isNotAssociatedEDR:Z

    iput-boolean v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isSkipNoneNameDevice:Z

    iput-boolean v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isSupportCTKD:Z

    const-string v2, "JLOTA"

    iput-object v2, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->otaScanFilterData:Ljava/lang/String;

    iput v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->bleScanStrategy:I

    iput v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->bleScanMode:I

    const/16 v2, 0x14

    iput v2, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->mtu:I

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->bleUUIDMap:Ljava/util/Map;

    iput-boolean v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isUseBleBondWay:Z

    iput-boolean v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isAutoConnectBle:Z

    iput-boolean v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isNeedChangeBleMtu:Z

    iput-boolean v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isOnlyConnect:Z

    sget-object v0, Lcom/jieli/bluetooth_connect/constant/BluetoothConstant;->UUID_SPP:Ljava/util/UUID;

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->sppUUID:Ljava/util/UUID;

    iput-boolean v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isSupportA2DP:Z

    sget-object v0, Lcom/jieli/bluetooth_connect/constant/BluetoothConstant;->UUID_SERVICE:Ljava/util/UUID;

    sget-object v1, Lcom/jieli/bluetooth_connect/constant/BluetoothConstant;->UUID_WRITE:Ljava/util/UUID;

    sget-object v2, Lcom/jieli/bluetooth_connect/constant/BluetoothConstant;->UUID_NOTIFICATION:Ljava/util/UUID;

    invoke-virtual {p0, v0, v1, v2}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->setBleUUID(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    return-void
.end method

.method public static createDefaultOption()Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 2

    new-instance v0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    invoke-direct {v0}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->setReconnect(Z)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object v0

    const/16 v1, 0x7d0

    invoke-virtual {v0, v1}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->setTimeoutMs(I)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object v0

    const/16 v1, 0x14

    invoke-virtual {v0, v1}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->setMtu(I)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object v0

    const-string v1, "JLAISDK"

    invoke-virtual {v0, v1}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->setScanFilterData(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getBleNotificationUUID()Ljava/util/UUID;
    .locals 2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->bleUUIDMap:Ljava/util/Map;

    const-string v1, "ble_notification_characteristic_uuid"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/UUID;

    if-nez v0, :cond_0

    sget-object v0, Lcom/jieli/bluetooth_connect/constant/BluetoothConstant;->UUID_NOTIFICATION:Ljava/util/UUID;

    :cond_0
    return-object v0
.end method

.method public getBleScanMode()I
    .locals 1

    iget v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->bleScanMode:I

    return v0
.end method

.method public getBleScanStrategy()I
    .locals 1

    iget v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->bleScanStrategy:I

    return v0
.end method

.method public getBleServiceUUID()Ljava/util/UUID;
    .locals 2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->bleUUIDMap:Ljava/util/Map;

    const-string v1, "ble_service_uuid"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/UUID;

    if-nez v0, :cond_0

    sget-object v0, Lcom/jieli/bluetooth_connect/constant/BluetoothConstant;->UUID_SERVICE:Ljava/util/UUID;

    :cond_0
    return-object v0
.end method

.method public getBleWriteUUID()Ljava/util/UUID;
    .locals 2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->bleUUIDMap:Ljava/util/Map;

    const-string v1, "ble_write_characteristic_uuid"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/UUID;

    if-nez v0, :cond_0

    sget-object v0, Lcom/jieli/bluetooth_connect/constant/BluetoothConstant;->UUID_WRITE:Ljava/util/UUID;

    :cond_0
    return-object v0
.end method

.method public getMtu()I
    .locals 1

    iget v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->mtu:I

    return v0
.end method

.method public getOtaScanFilterData()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->otaScanFilterData:Ljava/lang/String;

    return-object v0
.end method

.method public getPriority()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->priority:I

    return v0
.end method

.method public getScanFilterData()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->scanFilterData:Ljava/lang/String;

    return-object v0
.end method

.method public getSppUUID()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->sppUUID:Ljava/util/UUID;

    return-object v0
.end method

.method public getTimeoutMs()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->timeoutMs:I

    return v0
.end method

.method public isAutoConnectBle()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isAutoConnectBle:Z

    return v0
.end method

.method public isEnterLowPowerMode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->enterLowPowerMode:Z

    return v0
.end method

.method public isNeedChangeBleMtu()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isNeedChangeBleMtu:Z

    return v0
.end method

.method public isNotAssociatedEDR()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isNotAssociatedEDR:Z

    return v0
.end method

.method public isOnlyConnect()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isOnlyConnect:Z

    return v0
.end method

.method public isReconnect()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->reconnect:Z

    return v0
.end method

.method public isSkipNoneNameDevice()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isSkipNoneNameDevice:Z

    return v0
.end method

.method public isSupportA2DP()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isSupportA2DP:Z

    return v0
.end method

.method public isSupportCTKD()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isSupportCTKD:Z

    return v0
.end method

.method public isUseBleBondWay()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isUseBleBondWay:Z

    return v0
.end method

.method public isUseDeviceAuth()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-boolean v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isUseDeviceAuth:Z

    return v0
.end method

.method public isUseMultiDevice()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isUseMultiDevice:Z

    return v0
.end method

.method public setAutoConnectBle(Z)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "autoConnectBle"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isAutoConnectBle:Z

    return-object p0
.end method

.method public setBleScanMode(I)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "bleScanMode"
        }
    .end annotation

    iput p1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->bleScanMode:I

    return-object p0
.end method

.method public setBleScanStrategy(I)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "bleScanStrategy"
        }
    .end annotation

    iput p1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->bleScanStrategy:I

    return-object p0
.end method

.method public setBleUUID(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "serviceUUID",
            "writeCharacteristicUUID",
            "notificationCharacteristicUUID"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->bleUUIDMap:Ljava/util/Map;

    const-string v1, "ble_service_uuid"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->bleUUIDMap:Ljava/util/Map;

    const-string v0, "ble_write_characteristic_uuid"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->bleUUIDMap:Ljava/util/Map;

    const-string p2, "ble_notification_characteristic_uuid"

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public setEnterLowPowerMode(Z)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "enterLowPowerMode"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->enterLowPowerMode:Z

    return-object p0
.end method

.method public setMtu(I)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "mtu"
        }
    .end annotation

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->formatBleMtu(I)I

    move-result p1

    iput p1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->mtu:I

    return-object p0
.end method

.method public setNeedChangeBleMtu(Z)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "needChangeBleMtu"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isNeedChangeBleMtu:Z

    return-object p0
.end method

.method public setNotAssociatedEDR(Z)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "notAssociatedEDR"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isNotAssociatedEDR:Z

    return-object p0
.end method

.method public setOnlyConnect(Z)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "onlyConnect"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isOnlyConnect:Z

    return-object p0
.end method

.method public setOtaScanFilterData(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "otaScanFilterData"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->otaScanFilterData:Ljava/lang/String;

    return-object p0
.end method

.method public setPriority(I)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "priority"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput p1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->priority:I

    return-object p0
.end method

.method public setReconnect(Z)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "reconnect"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->reconnect:Z

    return-object p0
.end method

.method public setScanFilterData(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "scanFilterData"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->scanFilterData:Ljava/lang/String;

    return-object p0
.end method

.method public setSkipNoneNameDevice(Z)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "skipNoneNameDevice"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isSkipNoneNameDevice:Z

    return-object p0
.end method

.method public setSppUUID(Ljava/util/UUID;)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "sppUUID"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->sppUUID:Ljava/util/UUID;

    return-object p0
.end method

.method public setSupportA2DP(Z)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "supportA2DP"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isSupportA2DP:Z

    return-object p0
.end method

.method public setSupportCTKD(Z)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "supportCTKD"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isSupportCTKD:Z

    return-object p0
.end method

.method public setTimeoutMs(I)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "timeoutMs"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput p1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->timeoutMs:I

    return-object p0
.end method

.method public setUseBleBondWay(Z)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "useBleBondWay"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isUseBleBondWay:Z

    return-object p0
.end method

.method public setUseDeviceAuth(Z)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "useDeviceAuth"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-boolean p1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isUseDeviceAuth:Z

    return-object p0
.end method

.method public setUseMultiDevice(Z)Lcom/jieli/bluetooth_connect/bean/BluetoothOption;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "useMultiDevice"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isUseMultiDevice:Z

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BluetoothOption{priority="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->priority:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", reconnect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->reconnect:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", timeoutMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->timeoutMs:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", scanFilterData=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->scanFilterData:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", mtu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->mtu:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", enterLowPowerMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->enterLowPowerMode:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", bleScanStrategy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->bleScanStrategy:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bleScanMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->bleScanMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bleUUIDMap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->bleUUIDMap:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sppUUID="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->sppUUID:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isUseBleBondWay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isUseBleBondWay:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isAutoConnectBle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isAutoConnectBle:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isUseDeviceAuth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isUseDeviceAuth:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isNotAssociatedEDR="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isNotAssociatedEDR:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isOnlyConnect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isOnlyConnect:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSkipNoneNameDevice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isSkipNoneNameDevice:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportA2DP="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isSupportA2DP:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportCTKD="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isSupportCTKD:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
