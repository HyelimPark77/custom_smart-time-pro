.class public Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"


# instance fields
.field private allowConnectFlag:I

.field private authKey:Ljava/lang/String;

.field private bleAddr:Ljava/lang/String;

.field private bleOnly:Z

.field private contactsTransferBySmallFile:Z

.field private curFunction:B

.field private customVersionMsg:Ljava/lang/String;

.field private edrAddr:Ljava/lang/String;

.field private edrProfile:I

.field private edrStatus:I

.field private emitterStatus:I

.field private emitterSupport:Z

.field private final expandFunc:Lcom/jieli/jl_rcsp/model/response/ExpandFunc;

.field private expandMode:I

.field private functionMask:I

.field private getFileByNameWithDev:Z

.field private hideNetRadio:Z

.field private isBLEToSppWay:Z

.field private isNeedBootLoader:Z

.field private isSupportDoubleBackup:Z

.field private license:Ljava/lang/String;

.field private lowPowerLimit:I

.field private mandatoryUpgradeFlag:I

.field private maxVol:I

.field private name:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private pid:I

.field private platform:I

.field private projectCode:Ljava/lang/String;

.field private protocolVersion:Ljava/lang/String;

.field private quantity:I

.field private requestOtaFlag:I

.field private sdkType:I

.field private singleBackupOtaWay:I

.field private supportOfflineShow:Z

.field private supportPackageCrc16:Z

.field private supportSd0:Z

.field private supportSd1:Z

.field private supportUsb:Z

.field private supportVolumeSync:Z

.field private ubootVersionCode:I

.field private ubootVersionName:Ljava/lang/String;

.field private uid:I

.field private versionCode:I

.field private versionName:Ljava/lang/String;

.field private vid:I

.field private volume:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->edrStatus:I

    iput v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->edrProfile:I

    const/4 v1, -0x1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->platform:I

    const/16 v1, 0x1e

    iput v1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->lowPowerLimit:I

    iput-byte v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->curFunction:B

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportOfflineShow:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportUsb:Z

    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportSd0:Z

    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportSd1:Z

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->hideNetRadio:Z

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportVolumeSync:Z

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportPackageCrc16:Z

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getFileByNameWithDev:Z

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->contactsTransferBySmallFile:Z

    new-instance v0, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_rcsp/model/response/ExpandFunc;

    return-void
.end method


# virtual methods
.method public getAllowConnectFlag()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->allowConnectFlag:I

    return v0
.end method

.method public getAuthKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->authKey:Ljava/lang/String;

    return-object v0
.end method

.method public getBleAddr()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->bleAddr:Ljava/lang/String;

    return-object v0
.end method

.method public getCurFunction()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->curFunction:B

    return v0
.end method

.method public getCustomVersionMsg()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->customVersionMsg:Ljava/lang/String;

    return-object v0
.end method

.method public getEdrAddr()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->edrAddr:Ljava/lang/String;

    return-object v0
.end method

.method public getEdrProfile()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->edrProfile:I

    return v0
.end method

.method public getEdrStatus()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->edrStatus:I

    return v0
.end method

.method public getEmitterStatus()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->emitterStatus:I

    return v0
.end method

.method public getExpandFunc()Lcom/jieli/jl_rcsp/model/response/ExpandFunc;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_rcsp/model/response/ExpandFunc;

    return-object v0
.end method

.method public getExpandMode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->expandMode:I

    return v0
.end method

.method public getFunctionMask()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->functionMask:I

    return v0
.end method

.method public getLicense()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->license:Ljava/lang/String;

    return-object v0
.end method

.method public getLowPowerLimit()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->lowPowerLimit:I

    return v0
.end method

.method public getMandatoryUpgradeFlag()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->mandatoryUpgradeFlag:I

    return v0
.end method

.method public getMaxVol()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->maxVol:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getPid()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->pid:I

    return v0
.end method

.method public getPlatform()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->platform:I

    return v0
.end method

.method public getProjectCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->projectCode:Ljava/lang/String;

    return-object v0
.end method

.method public getProtocolVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->protocolVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getQuantity()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->quantity:I

    return v0
.end method

.method public getRequestOtaFlag()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->requestOtaFlag:I

    return v0
.end method

.method public getSdkType()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->sdkType:I

    return v0
.end method

.method public getSingleBackupOtaWay()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->singleBackupOtaWay:I

    return v0
.end method

.method public getUbootVersionCode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->ubootVersionCode:I

    return v0
.end method

.method public getUbootVersionName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->ubootVersionName:Ljava/lang/String;

    return-object v0
.end method

.method public getUid()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->uid:I

    return v0
.end method

.method public getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->versionCode:I

    return v0
.end method

.method public getVersionName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->versionName:Ljava/lang/String;

    return-object v0
.end method

.method public getVid()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->vid:I

    return v0
.end method

.method public getVolume()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->volume:I

    return v0
.end method

.method public isBLEToSppWay()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isBLEToSppWay:Z

    return v0
.end method

.method public isBanEq()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_rcsp/model/response/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->isBanEq()Z

    move-result v0

    return v0
.end method

.method public isBleOnly()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->bleOnly:Z

    return v0
.end method

.method public isContactsTransferBySmallFile()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->contactsTransferBySmallFile:Z

    return v0
.end method

.method public isEmitterSupport()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->emitterSupport:Z

    return v0
.end method

.method public isGameMode()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_rcsp/model/response/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->isGameMode()Z

    move-result v0

    return v0
.end method

.method public isGetFileByNameWithDev()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getFileByNameWithDev:Z

    return v0
.end method

.method public isHideNetRadio()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->hideNetRadio:Z

    return v0
.end method

.method public isNeedBootLoader()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isNeedBootLoader:Z

    return v0
.end method

.method public isSupportAdaptiveANC()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_rcsp/model/response/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->isSupportAdaptiveANC()Z

    move-result v0

    return v0
.end method

.method public isSupportAnc()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_rcsp/model/response/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->isSupportAnc()Z

    move-result v0

    return v0
.end method

.method public isSupportDevConfigure()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_rcsp/model/response/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->isSupportDevConfigure()Z

    move-result v0

    return v0
.end method

.method public isSupportDoubleBackup()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isSupportDoubleBackup:Z

    return v0
.end method

.method public isSupportExternalFlashTransfer()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_rcsp/model/response/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->isSupportExternalFlashTransfer()Z

    move-result v0

    return v0
.end method

.method public isSupportHearingAssist()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_rcsp/model/response/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->isSupportHearingAssist()Z

    move-result v0

    return v0
.end method

.method public isSupportMD5()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_rcsp/model/response/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->isSupportMD5()Z

    move-result v0

    return v0
.end method

.method public isSupportOfflineShow()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportOfflineShow:Z

    return v0
.end method

.method public isSupportPackageCrc16()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportPackageCrc16:Z

    return v0
.end method

.method public isSupportReadErrorMSg()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_rcsp/model/response/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->isSupportReadErrorMSg()Z

    move-result v0

    return v0
.end method

.method public isSupportSd0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportSd0:Z

    return v0
.end method

.method public isSupportSd1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportSd1:Z

    return v0
.end method

.method public isSupportSearchDevice()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_rcsp/model/response/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->isSupportSearchDevice()Z

    move-result v0

    return v0
.end method

.method public isSupportSoundCard()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_rcsp/model/response/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->isSupportSoundCard()Z

    move-result v0

    return v0
.end method

.method public isSupportUsb()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportUsb:Z

    return v0
.end method

.method public isSupportVolumeSync()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportVolumeSync:Z

    return v0
.end method

.method public setAllowConnectFlag(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->allowConnectFlag:I

    return-object p0
.end method

.method public setAuthKey(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->authKey:Ljava/lang/String;

    return-object p0
.end method

.method public setBLEToSppWay(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isBLEToSppWay:Z

    return-object p0
.end method

.method public setBleAddr(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->bleAddr:Ljava/lang/String;

    return-object p0
.end method

.method public setBleOnly(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->bleOnly:Z

    return-object p0
.end method

.method public setContactsTransferBySmallFile(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->contactsTransferBySmallFile:Z

    return-object p0
.end method

.method public setCurFunction(B)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->curFunction:B

    return-object p0
.end method

.method public setCustomVersionMsg(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->customVersionMsg:Ljava/lang/String;

    return-object p0
.end method

.method public setEdrAddr(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->edrAddr:Ljava/lang/String;

    return-object p0
.end method

.method public setEdrProfile(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->edrProfile:I

    return-object p0
.end method

.method public setEdrStatus(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->edrStatus:I

    return-object p0
.end method

.method public setEmitterStatus(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->emitterStatus:I

    return-object p0
.end method

.method public setEmitterSupport(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->emitterSupport:Z

    return-object p0
.end method

.method public setExpandFunc([B)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_rcsp/model/response/ExpandFunc;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->parseData([B)V

    return-object p0
.end method

.method public setExpandMode(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->expandMode:I

    return-object p0
.end method

.method public setFunctionMask(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->functionMask:I

    return-object p0
.end method

.method public setGetFileByNameWithDev(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getFileByNameWithDev:Z

    return-object p0
.end method

.method public setHideNetRadio(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->hideNetRadio:Z

    return-object p0
.end method

.method public setLicense(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->license:Ljava/lang/String;

    return-object p0
.end method

.method public setLowPowerLimit(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->lowPowerLimit:I

    return-object p0
.end method

.method public setMandatoryUpgradeFlag(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->mandatoryUpgradeFlag:I

    return-object p0
.end method

.method public setMaxVol(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->maxVol:I

    return-object p0
.end method

.method public setName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->name:Ljava/lang/String;

    return-object p0
.end method

.method public setNeedBootLoader(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isNeedBootLoader:Z

    return-object p0
.end method

.method public setPid(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->pid:I

    return-object p0
.end method

.method public setPlatform(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->platform:I

    return-object p0
.end method

.method public setProjectCode(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->projectCode:Ljava/lang/String;

    return-object p0
.end method

.method public setProtocolVersion(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->protocolVersion:Ljava/lang/String;

    return-object p0
.end method

.method public setQuantity(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->quantity:I

    return-object p0
.end method

.method public setRequestOtaFlag(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->requestOtaFlag:I

    return-object p0
.end method

.method public setSdkType(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->sdkType:I

    return-object p0
.end method

.method public setSingleBackupOtaWay(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->singleBackupOtaWay:I

    return-object p0
.end method

.method public setSupportDoubleBackup(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isSupportDoubleBackup:Z

    return-object p0
.end method

.method public setSupportOfflineShow(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportOfflineShow:Z

    return-object p0
.end method

.method public setSupportPackageCrc16(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportPackageCrc16:Z

    return-object p0
.end method

.method public setSupportSd0(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportSd0:Z

    return-object p0
.end method

.method public setSupportSd1(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportSd1:Z

    return-object p0
.end method

.method public setSupportUsb(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportUsb:Z

    return-object p0
.end method

.method public setSupportVolumeSync(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportVolumeSync:Z

    return-object p0
.end method

.method public setUbootVersionCode(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->ubootVersionCode:I

    return-object p0
.end method

.method public setUbootVersionName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->ubootVersionName:Ljava/lang/String;

    return-object p0
.end method

.method public setUid(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->uid:I

    return-object p0
.end method

.method public setVersionCode(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->versionCode:I

    return-object p0
.end method

.method public setVersionName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->versionName:Ljava/lang/String;

    return-object p0
.end method

.method public setVid(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->vid:I

    return-object p0
.end method

.method public setVolume(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->volume:I

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TargetInfoResponse{versionName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->versionName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", versionCode="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->versionCode:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", protocolVersion=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->protocolVersion:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", edrAddr=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->edrAddr:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", edrStatus="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->edrStatus:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", edrProfile="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->edrProfile:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", bleAddr=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->bleAddr:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", platform="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->platform:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", license=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->license:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", volume="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->volume:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", maxVol="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->maxVol:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", quantity="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->quantity:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", lowPowerLimit="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->lowPowerLimit:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", functionMask="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->functionMask:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", curFunction="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->curFunction:B

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", sdkType="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->sdkType:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", name=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->name:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", pid="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->pid:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", vid="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->vid:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", uid="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->uid:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", mandatoryUpgradeFlag="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->mandatoryUpgradeFlag:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", requestOtaFlag="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->requestOtaFlag:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", ubootVersionCode="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->ubootVersionCode:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", ubootVersionName=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->ubootVersionName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", isSupportDoubleBackup="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isSupportDoubleBackup:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", isNeedBootLoader="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isNeedBootLoader:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", singleBackupOtaWay="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->singleBackupOtaWay:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", allowConnectFlag="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->allowConnectFlag:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", authKey=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->authKey:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", projectCode=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->projectCode:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", customVersionMsg=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->customVersionMsg:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", bleOnly="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->bleOnly:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", emitterSupport="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->emitterSupport:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", emitterStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->emitterStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", supportOfflineShow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportOfflineShow:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", supportUsb="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportUsb:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", supportSd0="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportSd0:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", supportSd1="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportSd1:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", hideNetRadio="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->hideNetRadio:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", supportVolumeSync="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportVolumeSync:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", expandMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->expandMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", supportPackageCrc16 = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->supportPackageCrc16:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", getFileByNameWithDev = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getFileByNameWithDev:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", contactsTransferBySmallFile = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->contactsTransferBySmallFile:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isBLEToSppWay = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isBLEToSppWay:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", expandFunc = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_rcsp/model/response/ExpandFunc;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "} "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
