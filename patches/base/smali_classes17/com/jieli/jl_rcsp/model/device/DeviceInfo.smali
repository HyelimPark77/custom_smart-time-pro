.class public Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
.super Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;
.source "SourceFile"


# instance fields
.field private alarmDefaultBells:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/DefaultAlarmBell;",
            ">;"
        }
    .end annotation
.end field

.field private alarmExpandFlag:B

.field private alarmListInfo:Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;

.field private alarmVersion:I

.field private channelInfos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/ChannelInfo;",
            ">;"
        }
    .end annotation
.end field

.field private cluster:I

.field private currentDevIndex:B

.field private currentVoiceMode:Lcom/jieli/jl_rcsp/model/device/VoiceMode;

.field private devStorageInfo:Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;

.field private eqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;

.field private eqPresetInfo:Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;

.field private expandFunction:Lcom/jieli/jl_rcsp/model/device/ExpandFunction;

.field private fmStatusInfo:Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;

.field private frequency:F

.field private healthSettingInfo:Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;

.field private iD3MusicInfo:Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;

.field private isAuxPlay:Z

.field private lightControlInfo:Lcom/jieli/jl_rcsp/model/device/LightControlInfo;

.field private musicNameInfo:Lcom/jieli/jl_rcsp/model/device/MusicNameInfo;

.field private musicStatusInfo:Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;

.field private networkInfo:Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;

.field private phoneStatus:I

.field private playFileFormat:Ljava/lang/String;

.field private playModeInfo:Lcom/jieli/jl_rcsp/model/device/PlayModeInfo;

.field private soundCardEqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;

.field private sportsInfo:Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

.field private voiceModeList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/VoiceMode;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;-><init>()V

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->alarmExpandFlag:B

    return-void
.end method

.method public static convertFromTargetInfo(Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;-><init>()V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getVersionName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setVersionName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getVersionCode()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setVersionCode(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getProtocolVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setProtocolVersion(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getEdrAddr()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setEdrAddr(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getEdrStatus()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setEdrStatus(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getEdrProfile()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setEdrProfile(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getBleAddr()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setBleAddr(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isBleOnly()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setBleOnly(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getPlatform()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setPlatform(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getLicense()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setLicense(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getVolume()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setVolume(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getMaxVol()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setMaxVol(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getQuantity()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setQuantity(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getLowPowerLimit()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setLowPowerLimit(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getFunctionMask()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setFunctionMask(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getCurFunction()B

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setCurFunction(B)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getSdkType()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setSdkType(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getPid()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setPid(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getVid()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setVid(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getUid()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setUid(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getMandatoryUpgradeFlag()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setMandatoryUpgradeFlag(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getRequestOtaFlag()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setRequestOtaFlag(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getUbootVersionCode()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setUbootVersionCode(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getUbootVersionName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setUbootVersionName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isSupportDoubleBackup()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setSupportDoubleBackup(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isNeedBootLoader()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setNeedBootLoader(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getSingleBackupOtaWay()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setSingleBackupOtaWay(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getAllowConnectFlag()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setAllowConnectFlag(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getAuthKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setAuthKey(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getProjectCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setProjectCode(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getCustomVersionMsg()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setCustomVersionMsg(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isEmitterSupport()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setEmitterSupport(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getEmitterStatus()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setEmitterStatus(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isSupportOfflineShow()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setSupportOfflineShow(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isSupportUsb()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setSupportUsb(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isSupportSd0()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setSupportSd0(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isSupportSd1()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setSupportSd1(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isSupportVolumeSync()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setSupportVolumeSync(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isSupportPackageCrc16()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setSupportPackageCrc16(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isGetFileByNameWithDev()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setGetFileByNameWithDev(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isContactsTransferBySmallFile()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setContactsTransferBySmallFile(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getExpandMode()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setExpandMode(I)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isBLEToSppWay()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setBLEToSppWay(Z)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    move-result-object v1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getExpandFunc()Lcom/jieli/jl_rcsp/model/response/ExpandFunc;

    move-result-object p0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/ExpandFunc;->getRawData()[B

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->setExpandFunc([B)Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;

    return-object v0
.end method

.method public static mergeTargetInfos(Lcom/jieli/jl_rcsp/model/device/DeviceInfo;Lcom/jieli/jl_rcsp/model/device/DeviceInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 2

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getVoiceModeList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setVoiceModeList(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getCurrentVoiceMode()Lcom/jieli/jl_rcsp/model/device/VoiceMode;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setCurrentVoiceMode(Lcom/jieli/jl_rcsp/model/device/VoiceMode;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getAlarmVersion()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setAlarmVersion(I)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getAlarmDefaultBells()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setAlarmDefaultBells(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getAlarmExpandFlag()B

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setAlarmExpandFlag(B)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getAlarmListInfo()Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setAlarmListInfo(Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getMusicNameInfo()Lcom/jieli/jl_rcsp/model/device/MusicNameInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setMusicNameInfo(Lcom/jieli/jl_rcsp/model/device/MusicNameInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getMusicStatusInfo()Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setMusicStatusInfo(Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getPlayModeInfo()Lcom/jieli/jl_rcsp/model/device/PlayModeInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setPlayModeInfo(Lcom/jieli/jl_rcsp/model/device/PlayModeInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getPlayFileFormat()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setPlayFileFormat(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getPhoneStatus()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setPhoneStatus(I)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getEqInfo()Lcom/jieli/jl_rcsp/model/device/EqInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setEqInfo(Lcom/jieli/jl_rcsp/model/device/EqInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getEqPresetInfo()Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setEqPresetInfo(Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getSoundCardEqInfo()Lcom/jieli/jl_rcsp/model/device/EqInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setSoundCardEqInfo(Lcom/jieli/jl_rcsp/model/device/EqInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getLightControlInfo()Lcom/jieli/jl_rcsp/model/device/LightControlInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setLightControlInfo(Lcom/jieli/jl_rcsp/model/device/LightControlInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getCluster()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setCluster(I)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getCurrentDevIndex()B

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setCurrentDevIndex(B)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getFrequency()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setFrequency(F)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getFmStatusInfo()Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setFmStatusInfo(Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->isAuxPlay()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setAuxPlay(Z)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getiD3MusicInfo()Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setiD3MusicInfo(Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getHealthSettingInfo()Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setHealthSettingInfo(Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getSportsInfo()Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setSportsInfo(Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getNetworkInfo()Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setNetworkInfo(Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    return-object p1
.end method


# virtual methods
.method public checkDevModeExist(B)Z
    .locals 6

    const/16 v0, 0x20

    const/4 v1, 0x0

    if-le p1, v0, :cond_0

    return v1

    :cond_0
    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result p1

    int-to-double v2, p1

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    double-to-int p1, v2

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result p1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getFunctionMask()I

    move-result v0

    and-int/2addr v0, p1

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public getAlarmDefaultBells()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/DefaultAlarmBell;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->alarmDefaultBells:Ljava/util/List;

    return-object v0
.end method

.method public getAlarmExpandFlag()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->alarmExpandFlag:B

    return v0
.end method

.method public getAlarmListInfo()Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->alarmListInfo:Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;

    return-object v0
.end method

.method public getAlarmVersion()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->alarmVersion:I

    return v0
.end method

.method public getChannelInfos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/ChannelInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->channelInfos:Ljava/util/List;

    return-object v0
.end method

.method public getCluster()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->cluster:I

    return v0
.end method

.method public getCurrentDevIndex()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->currentDevIndex:B

    return v0
.end method

.method public getCurrentVoiceMode()Lcom/jieli/jl_rcsp/model/device/VoiceMode;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->currentVoiceMode:Lcom/jieli/jl_rcsp/model/device/VoiceMode;

    return-object v0
.end method

.method public getDevStorageInfo()Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->devStorageInfo:Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;

    return-object v0
.end method

.method public getEqInfo()Lcom/jieli/jl_rcsp/model/device/EqInfo;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->eqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;

    return-object v0
.end method

.method public getEqPresetInfo()Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->eqPresetInfo:Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;

    return-object v0
.end method

.method public getExpandFunction()Lcom/jieli/jl_rcsp/model/device/ExpandFunction;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->expandFunction:Lcom/jieli/jl_rcsp/model/device/ExpandFunction;

    return-object v0
.end method

.method public getFmStatusInfo()Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->fmStatusInfo:Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;

    return-object v0
.end method

.method public getFrequency()F
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->frequency:F

    return v0
.end method

.method public getHealthSettingInfo()Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->healthSettingInfo:Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;

    return-object v0
.end method

.method public getLightControlInfo()Lcom/jieli/jl_rcsp/model/device/LightControlInfo;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->lightControlInfo:Lcom/jieli/jl_rcsp/model/device/LightControlInfo;

    return-object v0
.end method

.method public getMusicNameInfo()Lcom/jieli/jl_rcsp/model/device/MusicNameInfo;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->musicNameInfo:Lcom/jieli/jl_rcsp/model/device/MusicNameInfo;

    return-object v0
.end method

.method public getMusicStatusInfo()Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->musicStatusInfo:Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;

    return-object v0
.end method

.method public getNetworkInfo()Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->networkInfo:Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;

    return-object v0
.end method

.method public getPhoneStatus()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->phoneStatus:I

    return v0
.end method

.method public getPlayFileFormat()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->playFileFormat:Ljava/lang/String;

    return-object v0
.end method

.method public getPlayModeInfo()Lcom/jieli/jl_rcsp/model/device/PlayModeInfo;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->playModeInfo:Lcom/jieli/jl_rcsp/model/device/PlayModeInfo;

    return-object v0
.end method

.method public getSoundCardEqInfo()Lcom/jieli/jl_rcsp/model/device/EqInfo;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->soundCardEqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;

    return-object v0
.end method

.method public getSportsInfo()Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->sportsInfo:Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    return-object v0
.end method

.method public getVoiceModeList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/VoiceMode;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->voiceModeList:Ljava/util/List;

    return-object v0
.end method

.method public getiD3MusicInfo()Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->iD3MusicInfo:Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;

    return-object v0
.end method

.method public isAuxEnable()Z
    .locals 1

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->checkDevModeExist(B)Z

    move-result v0

    return v0
.end method

.method public isAuxPlay()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->isAuxPlay:Z

    return v0
.end method

.method public isBtEnable()Z
    .locals 2

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getFunctionMask()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->checkDevModeExist(B)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public isDevMusicEnable()Z
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->checkDevModeExist(B)Z

    move-result v0

    return v0
.end method

.method public isFmEnable()Z
    .locals 1

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->checkDevModeExist(B)Z

    move-result v0

    return v0
.end method

.method public isFmTxEnable()Z
    .locals 1

    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->checkDevModeExist(B)Z

    move-result v0

    return v0
.end method

.method public isLightEnable()Z
    .locals 1

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->checkDevModeExist(B)Z

    move-result v0

    return v0
.end method

.method public isMandatoryUpgrade()Z
    .locals 2

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->getMandatoryUpgradeFlag()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isRTCEnable()Z
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->checkDevModeExist(B)Z

    move-result v0

    return v0
.end method

.method public setAlarmDefaultBells(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/DefaultAlarmBell;",
            ">;)",
            "Lcom/jieli/jl_rcsp/model/device/DeviceInfo;"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->alarmDefaultBells:Ljava/util/List;

    return-object p0
.end method

.method public setAlarmExpandFlag(B)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->alarmExpandFlag:B

    return-object p0
.end method

.method public setAlarmListInfo(Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->alarmListInfo:Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;

    return-object p0
.end method

.method public setAlarmVersion(I)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->alarmVersion:I

    return-object p0
.end method

.method public setAuxPlay(Z)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->isAuxPlay:Z

    return-object p0
.end method

.method public setChannelInfos(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/ChannelInfo;",
            ">;)",
            "Lcom/jieli/jl_rcsp/model/device/DeviceInfo;"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->channelInfos:Ljava/util/List;

    return-object p0
.end method

.method public setCluster(I)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->cluster:I

    return-object p0
.end method

.method public setCurrentDevIndex(B)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->currentDevIndex:B

    return-object p0
.end method

.method public setCurrentVoiceMode(Lcom/jieli/jl_rcsp/model/device/VoiceMode;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->currentVoiceMode:Lcom/jieli/jl_rcsp/model/device/VoiceMode;

    return-object p0
.end method

.method public setDevStorageInfo(Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->devStorageInfo:Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;

    return-object p0
.end method

.method public setEqInfo(Lcom/jieli/jl_rcsp/model/device/EqInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->eqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;

    return-object p0
.end method

.method public setEqPresetInfo(Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->eqPresetInfo:Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;

    return-object p0
.end method

.method public setExpandFunction(Lcom/jieli/jl_rcsp/model/device/ExpandFunction;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->expandFunction:Lcom/jieli/jl_rcsp/model/device/ExpandFunction;

    return-object p0
.end method

.method public setFmStatusInfo(Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->fmStatusInfo:Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;

    return-object p0
.end method

.method public setFrequency(F)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->frequency:F

    return-object p0
.end method

.method public setHealthSettingInfo(Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->healthSettingInfo:Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;

    return-object p0
.end method

.method public setLightControlInfo(Lcom/jieli/jl_rcsp/model/device/LightControlInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->lightControlInfo:Lcom/jieli/jl_rcsp/model/device/LightControlInfo;

    return-object p0
.end method

.method public setMusicNameInfo(Lcom/jieli/jl_rcsp/model/device/MusicNameInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->musicNameInfo:Lcom/jieli/jl_rcsp/model/device/MusicNameInfo;

    return-object p0
.end method

.method public setMusicStatusInfo(Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->musicStatusInfo:Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;

    return-object p0
.end method

.method public setNetworkInfo(Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->networkInfo:Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;

    return-object p0
.end method

.method public setPhoneStatus(I)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->phoneStatus:I

    return-object p0
.end method

.method public setPlayFileFormat(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->playFileFormat:Ljava/lang/String;

    return-object p0
.end method

.method public setPlayModeInfo(Lcom/jieli/jl_rcsp/model/device/PlayModeInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->playModeInfo:Lcom/jieli/jl_rcsp/model/device/PlayModeInfo;

    return-object p0
.end method

.method public setSoundCardEqInfo(Lcom/jieli/jl_rcsp/model/device/EqInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->soundCardEqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;

    return-object p0
.end method

.method public setSportsInfo(Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->sportsInfo:Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    return-object p0
.end method

.method public setVoiceModeList(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/VoiceMode;",
            ">;)",
            "Lcom/jieli/jl_rcsp/model/device/DeviceInfo;"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->voiceModeList:Ljava/util/List;

    return-object p0
.end method

.method public setiD3MusicInfo(Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->iD3MusicInfo:Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DeviceInfo{alarmListInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->alarmListInfo:Lcom/jieli/jl_rcsp/model/device/AlarmListInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", alarmDefaultBells="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->alarmDefaultBells:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", alarmVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->alarmVersion:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", alarmExpandFlag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->alarmExpandFlag:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", musicNameInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->musicNameInfo:Lcom/jieli/jl_rcsp/model/device/MusicNameInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", musicStatusInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->musicStatusInfo:Lcom/jieli/jl_rcsp/model/device/MusicStatusInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", playModeInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->playModeInfo:Lcom/jieli/jl_rcsp/model/device/PlayModeInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isAuxPlay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->isAuxPlay:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", playFileFormat=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->playFileFormat:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", cluster="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->cluster:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", currentDevIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->currentDevIndex:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", eqPresetInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->eqPresetInfo:Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", eqInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->eqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", devStorageInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->devStorageInfo:Lcom/jieli/jl_rcsp/model/device/DevStorageInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lightControlInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->lightControlInfo:Lcom/jieli/jl_rcsp/model/device/LightControlInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", soundCardEqInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->soundCardEqInfo:Lcom/jieli/jl_rcsp/model/device/EqInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", channelInfos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->channelInfos:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fmStatusInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->fmStatusInfo:Lcom/jieli/jl_rcsp/model/device/FmStatusInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", frequency="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->frequency:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", iD3MusicInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->iD3MusicInfo:Lcom/jieli/jl_rcsp/model/device/ID3MusicInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", currentVoiceMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->currentVoiceMode:Lcom/jieli/jl_rcsp/model/device/VoiceMode;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", voiceModeList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->voiceModeList:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", phoneStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->phoneStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", expandFunction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->expandFunction:Lcom/jieli/jl_rcsp/model/device/ExpandFunction;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", healthSettingInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->healthSettingInfo:Lcom/jieli/jl_rcsp/model/device/health/HealthSettingInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sportsInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->sportsInfo:Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", networkInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->networkInfo:Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "} \n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
