.class public Lcom/jieli/jl_rcsp/model/device/DeviceStatus;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final MODE_LOW_POWER:I = 0x3

.field public static final MODE_MANDATORY_UPGRADE:I = 0x2

.field public static final MODE_NORMAL:I = 0x1

.field public static final MODE_UNKNOWN:I


# instance fields
.field private deviceConfigure:Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;

.field private isAuthDevice:Z

.field private isDataTransfer:Z

.field private isEnableLatencyMode:Z

.field private isFileTransfer:Z

.field private isTwsConnected:Z

.field private mADVInfo:Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

.field private mDevMD5:Ljava/lang/String;

.field private mDeviceInfo:Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

.field private mExtFlashMSg:Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

.field private mLatencySettings:Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;

.field private mVoiceData:Lcom/jieli/jl_rcsp/model/device/VoiceData;

.field private maxCommunicationMtu:I

.field private maxReceiveMtu:I

.field private status:I

.field private workMode:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x212

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->maxCommunicationMtu:I

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->maxReceiveMtu:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->workMode:I

    return-void
.end method


# virtual methods
.method public getADVInfo()Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->mADVInfo:Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    return-object v0
.end method

.method public getDevMD5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->mDevMD5:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceConfigure()Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->deviceConfigure:Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;

    return-object v0
.end method

.method public getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->mDeviceInfo:Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    return-object v0
.end method

.method public getExtFlashMSg()Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->mExtFlashMSg:Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    return-object v0
.end method

.method public getLatencySettings()Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->mLatencySettings:Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;

    return-object v0
.end method

.method public getMaxCommunicationMtu()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->maxCommunicationMtu:I

    return v0
.end method

.method public getMaxReceiveMtu()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->maxReceiveMtu:I

    return v0
.end method

.method public getStatus()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->status:I

    return v0
.end method

.method public getVoiceData()Lcom/jieli/jl_rcsp/model/device/VoiceData;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->mVoiceData:Lcom/jieli/jl_rcsp/model/device/VoiceData;

    return-object v0
.end method

.method public getWorkMode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->workMode:I

    return v0
.end method

.method public isAuthDevice()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isAuthDevice:Z

    return v0
.end method

.method public isDataTransfer()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isDataTransfer:Z

    return v0
.end method

.method public isEnableLatencyMode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isEnableLatencyMode:Z

    return v0
.end method

.method public isEnterLowPowerMode()Z
    .locals 2

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->workMode:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isFileTransfer()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isFileTransfer:Z

    return v0
.end method

.method public isMandatoryUpgrade()Z
    .locals 2

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->workMode:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isTwsConnected()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isTwsConnected:Z

    return v0
.end method

.method public setADVInfo(Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;
    .locals 1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->mADVInfo:Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getLeftDeviceQuantity()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;->getRightDeviceQuantity()I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->setTwsConnected(Z)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;

    return-object p0
.end method

.method public setAuthDevice(Z)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isAuthDevice:Z

    return-object p0
.end method

.method public setDataTransfer(Z)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isDataTransfer:Z

    return-object p0
.end method

.method public setDevMD5(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->mDevMD5:Ljava/lang/String;

    return-object p0
.end method

.method public setDeviceConfigure(Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->deviceConfigure:Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;

    return-object p0
.end method

.method public setDeviceInfo(Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;
    .locals 1

    instance-of v0, p1, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->mDeviceInfo:Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    return-object p0

    :cond_0
    invoke-static {p1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->convertFromTargetInfo(Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->mDeviceInfo:Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    return-object p0
.end method

.method public setEnableLatencyMode(Z)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isEnableLatencyMode:Z

    return-object p0
.end method

.method public setExtFlashMSg(Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->mExtFlashMSg:Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    return-object p0
.end method

.method public setFileTransfer(Z)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isFileTransfer:Z

    return-object p0
.end method

.method public setLatencySettings(Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->mLatencySettings:Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;

    return-object p0
.end method

.method public setMaxCommunicationMtu(I)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->maxCommunicationMtu:I

    return-object p0
.end method

.method public setMaxReceiveMtu(I)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->maxReceiveMtu:I

    return-object p0
.end method

.method public setStatus(I)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->status:I

    return-object p0
.end method

.method public setTwsConnected(Z)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isTwsConnected:Z

    return-object p0
.end method

.method public setVoiceData(Lcom/jieli/jl_rcsp/model/device/VoiceData;)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->mVoiceData:Lcom/jieli/jl_rcsp/model/device/VoiceData;

    return-object p0
.end method

.method public setWorkMode(I)Lcom/jieli/jl_rcsp/model/device/DeviceStatus;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->workMode:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DeviceStatus{status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->status:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isAuthDevice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isAuthDevice:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isEnableLatencyMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isEnableLatencyMode:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isFileTransfer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isFileTransfer:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isDataTransfer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isDataTransfer:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", workState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->workMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDeviceInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->mDeviceInfo:Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mADVInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->mADVInfo:Lcom/jieli/jl_rcsp/model/response/ADVInfoResponse;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mDevMD5=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->mDevMD5:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", mLatencySettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->mLatencySettings:Lcom/jieli/jl_rcsp/model/response/GetLowLatencySettingsResponse;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", maxCommunicationMtu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->maxCommunicationMtu:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", maxReceiveMtu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->maxReceiveMtu:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mVoiceData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->mVoiceData:Lcom/jieli/jl_rcsp/model/device/VoiceData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isTwsConnected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->isTwsConnected:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mExtFlashMSg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->mExtFlashMSg:Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deviceConfigure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceStatus;->deviceConfigure:Lcom/jieli/jl_rcsp/model/device/DeviceConfiguration;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
