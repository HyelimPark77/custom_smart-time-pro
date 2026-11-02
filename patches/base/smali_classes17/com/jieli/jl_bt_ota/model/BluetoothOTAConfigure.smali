.class public Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final PREFER_BLE:I = 0x0

.field public static final PREFER_SPP:I = 0x1


# instance fields
.field private bleConnectParam:Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;

.field private bleIntervalMs:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private bleScanMode:I

.field private firmwareFileData:[B

.field private firmwareFilePath:Ljava/lang/String;

.field private isNeedChangeMtu:Z

.field private isPriorityCallbackOtaFinish:Z

.field private isUseAuthDevice:Z

.field private isUseJLServer:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private isUseReconnect:Z

.field private mtu:I

.field private priority:I

.field private scanFilterData:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private snGenerator:Lcom/jieli/jl_bt_ota/interfaces/rcsp/ICmdSnGenerator;

.field private timeoutMs:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isUseReconnect:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isUseAuthDevice:Z

    const/16 v2, 0x1f4

    iput v2, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->bleIntervalMs:I

    const/16 v2, 0xbb8

    iput v2, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->timeoutMs:I

    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isUseJLServer:Z

    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isPriorityCallbackOtaFinish:Z

    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isNeedChangeMtu:Z

    const/16 v0, 0x14

    iput v0, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->mtu:I

    iput v1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->bleScanMode:I

    return-void
.end method

.method public static createDefault()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;
    .locals 1

    new-instance v0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;-><init>()V

    return-object v0
.end method


# virtual methods
.method public getBleConnectParam()Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->bleConnectParam:Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;

    return-object v0
.end method

.method public getBleIntervalMs()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->bleIntervalMs:I

    return v0
.end method

.method public getBleScanMode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->bleScanMode:I

    return v0
.end method

.method public getFirmwareFileData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->firmwareFileData:[B

    return-object v0
.end method

.method public getFirmwareFilePath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->firmwareFilePath:Ljava/lang/String;

    return-object v0
.end method

.method public getMtu()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->mtu:I

    return v0
.end method

.method public getPriority()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->priority:I

    return v0
.end method

.method public getScanFilterData()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->scanFilterData:Ljava/lang/String;

    return-object v0
.end method

.method public getSnGenerator()Lcom/jieli/jl_bt_ota/interfaces/rcsp/ICmdSnGenerator;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->snGenerator:Lcom/jieli/jl_bt_ota/interfaces/rcsp/ICmdSnGenerator;

    return-object v0
.end method

.method public getTimeoutMs()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->timeoutMs:I

    return v0
.end method

.method public isAutoConnectBle()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isUseReconnect:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->bleConnectParam:Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;->isValid()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isNeedChangeMtu()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isNeedChangeMtu:Z

    return v0
.end method

.method public isPriorityCallbackOtaFinish()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isPriorityCallbackOtaFinish:Z

    return v0
.end method

.method public isUseAuthDevice()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isUseAuthDevice:Z

    return v0
.end method

.method public isUseJLServer()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isUseJLServer:Z

    return v0
.end method

.method public isUseReconnect()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isUseReconnect:Z

    return v0
.end method

.method public setBleConnectParam(Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->bleConnectParam:Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;

    return-object p0
.end method

.method public setBleIntervalMs(I)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->bleIntervalMs:I

    return-object p0
.end method

.method public setBleScanMode(I)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->bleScanMode:I

    return-object p0
.end method

.method public setFirmwareFileData([B)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->firmwareFileData:[B

    return-object p0
.end method

.method public setFirmwareFilePath(Ljava/lang/String;)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->firmwareFilePath:Ljava/lang/String;

    return-object p0
.end method

.method public setMtu(I)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->mtu:I

    return-object p0
.end method

.method public setNeedChangeMtu(Z)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isNeedChangeMtu:Z

    return-object p0
.end method

.method public setPriority(I)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->priority:I

    return-object p0
.end method

.method public setPriorityCallbackOtaFinish(Z)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isPriorityCallbackOtaFinish:Z

    return-object p0
.end method

.method public setScanFilterData(Ljava/lang/String;)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->scanFilterData:Ljava/lang/String;

    return-object p0
.end method

.method public setSnGenerator(Lcom/jieli/jl_bt_ota/interfaces/rcsp/ICmdSnGenerator;)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->snGenerator:Lcom/jieli/jl_bt_ota/interfaces/rcsp/ICmdSnGenerator;

    return-object p0
.end method

.method public setTimeoutMs(I)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;
    .locals 1

    const/16 v0, 0x1f4

    if-ge p1, v0, :cond_0

    move p1, v0

    :cond_0
    iput p1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->timeoutMs:I

    return-object p0
.end method

.method public setUseAuthDevice(Z)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isUseAuthDevice:Z

    return-object p0
.end method

.method public setUseJLServer(Z)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isUseJLServer:Z

    return-object p0
.end method

.method public setUseReconnect(Z)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isUseReconnect:Z

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BluetoothOTAConfigure{priority="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->priority:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isUseReconnect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isUseReconnect:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isUseAuthDevice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isUseAuthDevice:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", timeoutMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->timeoutMs:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",\n firmwareFilePath=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->firmwareFilePath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ",\n firmwareFileData= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->firmwareFileData:[B

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    array-length v1, v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isNeedChangeMtu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isNeedChangeMtu:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mtu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->mtu:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bleScanMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->bleScanMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isPriorityCallbackOtaFinish="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isPriorityCallbackOtaFinish:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",\n snGenerator="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->snGenerator:Lcom/jieli/jl_bt_ota/interfaces/rcsp/ICmdSnGenerator;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",\n bleConnectParam="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->bleConnectParam:Lcom/jieli/jl_bt_ota/model/ble/BleConnectParam;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
