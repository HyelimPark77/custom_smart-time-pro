.class public Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;
.super Lcom/jieli/jl_bt_ota/model/base/CommonResponse;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/command/IDataOp;


# instance fields
.field private allowConnectFlag:I

.field private authKey:Ljava/lang/String;

.field public final bleInfo:Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;

.field public final classicBtInfo:Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;

.field private customVersionMsg:Ljava/lang/String;

.field public final expandFunc:Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

.field public final functionConfiguration:Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;

.field public final otaSettings:Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;

.field public final otaState:Lcom/jieli/jl_bt_ota/model/response/device/OTAState;

.field public final productInfo:Lcom/jieli/jl_bt_ota/model/response/device/ProductInfo;

.field private projectCode:Ljava/lang/String;

.field public final protocolMtu:Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;

.field public final protocolVersion:Lcom/jieli/jl_bt_ota/model/response/device/ProtocolVersion;

.field private sdkType:I

.field public final systemInfo:Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;

.field public final uBootVersion:Lcom/jieli/jl_bt_ota/model/response/device/Version;

.field public final version:Lcom/jieli/jl_bt_ota/model/response/device/Version;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/model/base/CommonResponse;-><init>()V

    new-instance v0, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolVersion;

    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolVersion;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->protocolVersion:Lcom/jieli/jl_bt_ota/model/response/device/ProtocolVersion;

    new-instance v0, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;

    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->systemInfo:Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;

    new-instance v0, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;

    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->classicBtInfo:Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;

    new-instance v0, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;

    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->functionConfiguration:Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;

    new-instance v0, Lcom/jieli/jl_bt_ota/model/response/device/Version;

    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/model/response/device/Version;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->version:Lcom/jieli/jl_bt_ota/model/response/device/Version;

    new-instance v0, Lcom/jieli/jl_bt_ota/model/response/device/Version;

    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/model/response/device/Version;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->uBootVersion:Lcom/jieli/jl_bt_ota/model/response/device/Version;

    new-instance v0, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;

    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->otaSettings:Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;

    new-instance v0, Lcom/jieli/jl_bt_ota/model/response/device/OTAState;

    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/model/response/device/OTAState;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->otaState:Lcom/jieli/jl_bt_ota/model/response/device/OTAState;

    new-instance v0, Lcom/jieli/jl_bt_ota/model/response/device/ProductInfo;

    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ProductInfo;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->productInfo:Lcom/jieli/jl_bt_ota/model/response/device/ProductInfo;

    new-instance v0, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;

    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->protocolMtu:Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;

    new-instance v0, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;

    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->bleInfo:Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;

    new-instance v0, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    return-void
.end method

.method private static stringToData(Ljava/lang/String;)[B
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    new-array p0, p0, [B

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getAllowConnectFlag()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->allowConnectFlag:I

    return v0
.end method

.method public getAuthKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->authKey:Ljava/lang/String;

    return-object v0
.end method

.method public getBleAddr()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->bleInfo:Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;->getBleAddr()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCurFunction()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->functionConfiguration:Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->getCurFunction()I

    move-result v0

    return v0
.end method

.method public getCustomVersionMsg()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->customVersionMsg:Ljava/lang/String;

    return-object v0
.end method

.method public getEdrAddr()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->classicBtInfo:Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->getEdrAddr()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getEdrProfile()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->classicBtInfo:Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->getEdrProfile()I

    move-result v0

    return v0
.end method

.method public getEdrStatus()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->classicBtInfo:Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->getEdrStatus()I

    move-result v0

    return v0
.end method

.method public getExpandMode()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->otaState:Lcom/jieli/jl_bt_ota/model/response/device/OTAState;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/OTAState;->getExpandMode()I

    move-result v0

    return v0
.end method

.method public getFunctionMask()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->functionConfiguration:Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->getFunctionMask()I

    move-result v0

    return v0
.end method

.method public getLowPowerLimit()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->systemInfo:Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->getLowPowerLimit()I

    move-result v0

    return v0
.end method

.method public getMandatoryUpgradeFlag()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->otaState:Lcom/jieli/jl_bt_ota/model/response/device/OTAState;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/OTAState;->getMandatoryUpgradeFlag()I

    move-result v0

    return v0
.end method

.method public getMaxVol()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->systemInfo:Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->getMaxVol()I

    move-result v0

    return v0
.end method

.method public getPid()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->productInfo:Lcom/jieli/jl_bt_ota/model/response/device/ProductInfo;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ProductInfo;->getPid()I

    move-result v0

    return v0
.end method

.method public getProjectCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->projectCode:Ljava/lang/String;

    return-object v0
.end method

.method public getProtocolVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->protocolVersion:Lcom/jieli/jl_bt_ota/model/response/device/ProtocolVersion;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolVersion;->getVersionName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getQuantity()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->systemInfo:Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->getQuantity()I

    move-result v0

    return v0
.end method

.method public getReceiveMtu()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->protocolMtu:Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;->getReceiveMtu()I

    move-result v0

    return v0
.end method

.method public getRequestOtaFlag()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->otaState:Lcom/jieli/jl_bt_ota/model/response/device/OTAState;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/OTAState;->getRequestOtaFlag()I

    move-result v0

    return v0
.end method

.method public getSdkType()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->sdkType:I

    return v0
.end method

.method public getSendMtu()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->protocolMtu:Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;->getSendMtu()I

    move-result v0

    return v0
.end method

.method public getSingleBackupOtaWay()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->otaSettings:Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->getSingleBackupOtaWay()I

    move-result v0

    return v0
.end method

.method public getUbootVersionCode()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->uBootVersion:Lcom/jieli/jl_bt_ota/model/response/device/Version;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/Version;->getVersionCode()I

    move-result v0

    return v0
.end method

.method public getUbootVersionName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->uBootVersion:Lcom/jieli/jl_bt_ota/model/response/device/Version;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/Version;->getVersionName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getUid()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->productInfo:Lcom/jieli/jl_bt_ota/model/response/device/ProductInfo;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ProductInfo;->getUid()I

    move-result v0

    return v0
.end method

.method public getVersionCode()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->version:Lcom/jieli/jl_bt_ota/model/response/device/Version;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/Version;->getVersionCode()I

    move-result v0

    return v0
.end method

.method public getVersionName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->version:Lcom/jieli/jl_bt_ota/model/response/device/Version;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/Version;->getVersionName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getVid()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->productInfo:Lcom/jieli/jl_bt_ota/model/response/device/ProductInfo;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ProductInfo;->getVid()I

    move-result v0

    return v0
.end method

.method public getVolume()I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->systemInfo:Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->getVolume()I

    move-result v0

    return v0
.end method

.method public isBLEToSppWay()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->bleInfo:Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;->isBLEToSppWay()Z

    move-result v0

    return v0
.end method

.method public isBanEq()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isBanEq()Z

    move-result v0

    return v0
.end method

.method public isBleOnly()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->bleInfo:Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;->isBleOnly()Z

    move-result v0

    return v0
.end method

.method public isGameMode()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isGameMode()Z

    move-result v0

    return v0
.end method

.method public isHideNetRadio()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->functionConfiguration:Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->isHideNetRadio()Z

    move-result v0

    return v0
.end method

.method public isMandatoryUpgrade()Z
    .locals 2

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getMandatoryUpgradeFlag()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isNeedBootLoader()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->otaSettings:Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->isNeedBootLoader()Z

    move-result v0

    return v0
.end method

.method public isSupportAdaptiveANC()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isSupportAdaptiveANC()Z

    move-result v0

    return v0
.end method

.method public isSupportAnc()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isSupportAnc()Z

    move-result v0

    return v0
.end method

.method public isSupportDevConfigure()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isSupportDevConfigure()Z

    move-result v0

    return v0
.end method

.method public isSupportDoubleBackup()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->otaSettings:Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->isSupportDoubleBackup()Z

    move-result v0

    return v0
.end method

.method public isSupportDoubleConnection()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isSupportDoubleConnection()Z

    move-result v0

    return v0
.end method

.method public isSupportExternalFlashTransfer()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isSupportExternalFlashTransfer()Z

    move-result v0

    return v0
.end method

.method public isSupportHearingAssist()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isSupportHearingAssist()Z

    move-result v0

    return v0
.end method

.method public isSupportMD5()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isSupportMD5()Z

    move-result v0

    return v0
.end method

.method public isSupportOfflineShow()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->functionConfiguration:Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->isSupportOfflineShow()Z

    move-result v0

    return v0
.end method

.method public isSupportReadErrorMSg()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isSupportReadErrorMSg()Z

    move-result v0

    return v0
.end method

.method public isSupportReuseSpaceOTA()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->otaSettings:Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->isSupportReuseSpaceOTA()Z

    move-result v0

    return v0
.end method

.method public isSupportSceneDenoising()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isSupportSceneDenoising()Z

    move-result v0

    return v0
.end method

.method public isSupportSd0()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->functionConfiguration:Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->isSupportSd0()Z

    move-result v0

    return v0
.end method

.method public isSupportSd1()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->functionConfiguration:Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->isSupportSd1()Z

    move-result v0

    return v0
.end method

.method public isSupportSearchDevice()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isSupportSearchDevice()Z

    move-result v0

    return v0
.end method

.method public isSupportSmartNoPick()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isSupportSmartNoPick()Z

    move-result v0

    return v0
.end method

.method public isSupportSoundCard()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isSupportSoundCard()Z

    move-result v0

    return v0
.end method

.method public isSupportUsb()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->functionConfiguration:Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->isSupportUsb()Z

    move-result v0

    return v0
.end method

.method public isSupportVocalBooster()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isSupportVocalBooster()Z

    move-result v0

    return v0
.end method

.method public isSupportVolumeSync()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->systemInfo:Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->isSupportVolumeSync()Z

    move-result v0

    return v0
.end method

.method public isSupportWindNoiseDetection()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->isSupportWindNoiseDetection()Z

    move-result v0

    return v0
.end method

.method public parse([B)I
    .locals 7

    const/4 v0, 0x0

    if-eqz p1, :cond_10

    array-length v1, p1

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-static {p1}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->parseLTVData([B)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/jieli/jl_bt_ota/model/base/LtvBean;

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->getData()[B

    move-result-object v4

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->getType()I

    move-result v3

    if-eqz v3, :cond_e

    const/4 v5, 0x1

    if-eq v3, v5, :cond_d

    if-eq v3, v2, :cond_c

    const/16 v6, 0x11

    if-eq v3, v6, :cond_b

    const/16 v6, 0x13

    if-eq v3, v6, :cond_a

    const/16 v6, 0x1f

    if-eq v3, v6, :cond_8

    packed-switch v3, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    if-eqz v4, :cond_1

    array-length v3, v4

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    aget-byte v3, v4, v0

    invoke-static {v3}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byteToInt(B)I

    move-result v3

    invoke-virtual {p0, v3}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->setAllowConnectFlag(I)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    goto :goto_0

    :pswitch_1
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->protocolMtu:Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;

    invoke-virtual {v3, v4}, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;->parse([B)I

    goto :goto_0

    :pswitch_2
    if-nez v4, :cond_3

    goto :goto_0

    :cond_3
    :try_start_0
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v4}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {p0, v3}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->setProjectCode(Ljava/lang/String;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :pswitch_3
    if-nez v4, :cond_4

    goto :goto_0

    :cond_4
    :try_start_1
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v4}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {p0, v3}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->setAuthKey(Ljava/lang/String;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v3

    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :pswitch_4
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->productInfo:Lcom/jieli/jl_bt_ota/model/response/device/ProductInfo;

    invoke-virtual {v3, v4}, Lcom/jieli/jl_bt_ota/model/response/device/ProductInfo;->parse([B)I

    goto :goto_0

    :pswitch_5
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->otaState:Lcom/jieli/jl_bt_ota/model/response/device/OTAState;

    invoke-virtual {v3, v4}, Lcom/jieli/jl_bt_ota/model/response/device/OTAState;->parse([B)I

    goto :goto_0

    :pswitch_6
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->otaSettings:Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;

    invoke-virtual {v3, v4}, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->parse([B)I

    goto :goto_0

    :pswitch_7
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->uBootVersion:Lcom/jieli/jl_bt_ota/model/response/device/Version;

    invoke-virtual {v3, v4}, Lcom/jieli/jl_bt_ota/model/response/device/Version;->parse([B)I

    goto :goto_0

    :pswitch_8
    if-eqz v4, :cond_1

    array-length v3, v4

    if-nez v3, :cond_5

    goto/16 :goto_0

    :cond_5
    aget-byte v3, v4, v0

    invoke-static {v3}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byteToInt(B)I

    move-result v3

    invoke-virtual {p0, v3}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->setSdkType(I)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isSupportVolumeSync()Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->systemInfo:Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getSdkType()I

    move-result v4

    if-eq v4, v2, :cond_7

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getSdkType()I

    move-result v4

    const/4 v6, 0x4

    if-ne v4, v6, :cond_6

    goto :goto_1

    :cond_6
    move v5, v0

    :cond_7
    :goto_1
    invoke-virtual {v3, v5}, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->setSupportVolumeSync(Z)Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;

    goto/16 :goto_0

    :pswitch_9
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->version:Lcom/jieli/jl_bt_ota/model/response/device/Version;

    invoke-virtual {v3, v4}, Lcom/jieli/jl_bt_ota/model/response/device/Version;->parse([B)I

    goto/16 :goto_0

    :pswitch_a
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->functionConfiguration:Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;

    invoke-virtual {v3, v4}, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->parse([B)I

    goto/16 :goto_0

    :cond_8
    if-nez v4, :cond_9

    goto/16 :goto_0

    :cond_9
    :try_start_2
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v4}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {p0, v3}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->setCustomVersionMsg(Ljava/lang/String;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_0

    :catch_2
    move-exception v3

    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    goto/16 :goto_0

    :cond_a
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-virtual {v3, v4}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->parse([B)I

    goto/16 :goto_0

    :cond_b
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->bleInfo:Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;

    invoke-virtual {v3, v4}, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;->parse([B)I

    goto/16 :goto_0

    :cond_c
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->classicBtInfo:Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;

    invoke-virtual {v3, v4}, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->parse([B)I

    goto/16 :goto_0

    :cond_d
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->systemInfo:Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;

    invoke-virtual {v3, v4}, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->parse([B)I

    goto/16 :goto_0

    :cond_e
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->protocolVersion:Lcom/jieli/jl_bt_ota/model/response/device/ProtocolVersion;

    invoke-virtual {v3, v4}, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolVersion;->parse([B)I

    goto/16 :goto_0

    :cond_f
    array-length p1, p1

    return p1

    :cond_10
    :goto_2
    return v0

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setAllowConnectFlag(I)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->allowConnectFlag:I

    return-object p0
.end method

.method public setAuthKey(Ljava/lang/String;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->authKey:Ljava/lang/String;

    return-object p0
.end method

.method public setCurFunction(I)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->functionConfiguration:Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->setCurFunction(I)Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;

    return-object p0
.end method

.method public setCustomVersionMsg(Ljava/lang/String;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->customVersionMsg:Ljava/lang/String;

    return-object p0
.end method

.method public setProjectCode(Ljava/lang/String;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->projectCode:Ljava/lang/String;

    return-object p0
.end method

.method public setSdkType(I)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->sdkType:I

    return-object p0
.end method

.method public setVolume(I)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->systemInfo:Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->setVolume(I)Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;

    return-object p0
.end method

.method public toData()[B
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->protocolVersion:Lcom/jieli/jl_bt_ota/model/response/device/ProtocolVersion;

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolVersion;->getVersionName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->protocolVersion:Lcom/jieli/jl_bt_ota/model/response/device/ProtocolVersion;

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolVersion;->getVersionName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    new-instance v3, Lcom/jieli/jl_bt_ota/model/base/LtvBean;

    iget-object v4, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->protocolVersion:Lcom/jieli/jl_bt_ota/model/response/device/ProtocolVersion;

    invoke-virtual {v4}, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolVersion;->toData()[B

    move-result-object v4

    invoke-direct {v3, v1, v4}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;-><init>(I[B)V

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->toData()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_1

    :cond_0
    :goto_0
    new-instance v3, Lcom/jieli/jl_bt_ota/model/base/LtvBean;

    iget-object v4, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->systemInfo:Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;

    invoke-virtual {v4}, Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;->toData()[B

    move-result-object v4

    invoke-direct {v3, v0, v4}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;-><init>(I[B)V

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->toData()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V

    iget-object v3, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->classicBtInfo:Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->getEdrAddr()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance v3, Lcom/jieli/jl_bt_ota/model/base/LtvBean;

    iget-object v4, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->classicBtInfo:Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;

    invoke-virtual {v4}, Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;->toData()[B

    move-result-object v4

    const/4 v5, 0x2

    invoke-direct {v3, v5, v4}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;-><init>(I[B)V

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->toData()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V

    :cond_1
    new-instance v3, Lcom/jieli/jl_bt_ota/model/base/LtvBean;

    iget-object v4, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->functionConfiguration:Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;

    invoke-virtual {v4}, Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;->toData()[B

    move-result-object v4

    const/4 v5, 0x4

    invoke-direct {v3, v5, v4}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;-><init>(I[B)V

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->toData()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V

    iget-object v3, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->version:Lcom/jieli/jl_bt_ota/model/response/device/Version;

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/response/device/Version;->getVersionName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->version:Lcom/jieli/jl_bt_ota/model/response/device/Version;

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/response/device/Version;->getVersionName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    new-instance v3, Lcom/jieli/jl_bt_ota/model/base/LtvBean;

    iget-object v4, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->version:Lcom/jieli/jl_bt_ota/model/response/device/Version;

    invoke-virtual {v4}, Lcom/jieli/jl_bt_ota/model/response/device/Version;->toData()[B

    move-result-object v4

    const/4 v5, 0x5

    invoke-direct {v3, v5, v4}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;-><init>(I[B)V

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->toData()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V

    :cond_2
    new-instance v3, Lcom/jieli/jl_bt_ota/model/base/LtvBean;

    iget v4, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->sdkType:I

    invoke-static {v4}, Lcom/jieli/jl_bt_ota/util/CHexConver;->intToByte(I)B

    move-result v4

    new-array v5, v0, [B

    aput-byte v4, v5, v1

    const/4 v4, 0x6

    invoke-direct {v3, v4, v5}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;-><init>(I[B)V

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->toData()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V

    iget-object v3, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->uBootVersion:Lcom/jieli/jl_bt_ota/model/response/device/Version;

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/response/device/Version;->getVersionName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->uBootVersion:Lcom/jieli/jl_bt_ota/model/response/device/Version;

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/response/device/Version;->getVersionName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    new-instance v3, Lcom/jieli/jl_bt_ota/model/base/LtvBean;

    iget-object v4, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->uBootVersion:Lcom/jieli/jl_bt_ota/model/response/device/Version;

    invoke-virtual {v4}, Lcom/jieli/jl_bt_ota/model/response/device/Version;->toData()[B

    move-result-object v4

    const/4 v5, 0x7

    invoke-direct {v3, v5, v4}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;-><init>(I[B)V

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->toData()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V

    :cond_3
    new-instance v3, Lcom/jieli/jl_bt_ota/model/base/LtvBean;

    iget-object v4, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->otaSettings:Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;

    invoke-virtual {v4}, Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;->toData()[B

    move-result-object v4

    const/16 v5, 0x8

    invoke-direct {v3, v5, v4}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;-><init>(I[B)V

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->toData()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V

    new-instance v3, Lcom/jieli/jl_bt_ota/model/base/LtvBean;

    iget-object v4, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->otaState:Lcom/jieli/jl_bt_ota/model/response/device/OTAState;

    invoke-virtual {v4}, Lcom/jieli/jl_bt_ota/model/response/device/OTAState;->toData()[B

    move-result-object v4

    const/16 v5, 0x9

    invoke-direct {v3, v5, v4}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;-><init>(I[B)V

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->toData()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V

    new-instance v3, Lcom/jieli/jl_bt_ota/model/base/LtvBean;

    iget-object v4, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->productInfo:Lcom/jieli/jl_bt_ota/model/response/device/ProductInfo;

    invoke-virtual {v4}, Lcom/jieli/jl_bt_ota/model/response/device/ProductInfo;->toData()[B

    move-result-object v4

    const/16 v5, 0xa

    invoke-direct {v3, v5, v4}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;-><init>(I[B)V

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->toData()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V

    iget-object v3, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->authKey:Ljava/lang/String;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_4

    new-instance v3, Lcom/jieli/jl_bt_ota/model/base/LtvBean;

    iget-object v4, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->authKey:Ljava/lang/String;

    invoke-static {v4}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->stringToData(Ljava/lang/String;)[B

    move-result-object v4

    const/16 v5, 0xb

    invoke-direct {v3, v5, v4}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;-><init>(I[B)V

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->toData()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V

    :cond_4
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->projectCode:Ljava/lang/String;

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5

    new-instance v3, Lcom/jieli/jl_bt_ota/model/base/LtvBean;

    iget-object v4, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->projectCode:Ljava/lang/String;

    invoke-static {v4}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->stringToData(Ljava/lang/String;)[B

    move-result-object v4

    const/16 v5, 0xc

    invoke-direct {v3, v5, v4}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;-><init>(I[B)V

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->toData()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V

    :cond_5
    new-instance v3, Lcom/jieli/jl_bt_ota/model/base/LtvBean;

    iget-object v4, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->protocolMtu:Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;

    invoke-virtual {v4}, Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;->toData()[B

    move-result-object v4

    const/16 v5, 0xd

    invoke-direct {v3, v5, v4}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;-><init>(I[B)V

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->toData()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/io/OutputStream;->write([B)V

    new-instance v3, Lcom/jieli/jl_bt_ota/model/base/LtvBean;

    iget v4, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->allowConnectFlag:I

    invoke-static {v4}, Lcom/jieli/jl_bt_ota/util/CHexConver;->intToByte(I)B

    move-result v4

    new-array v0, v0, [B

    aput-byte v4, v0, v1

    const/16 v1, 0xe

    invoke-direct {v3, v1, v0}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;-><init>(I[B)V

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->toData()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->bleInfo:Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;->getBleAddr()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->bleInfo:Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;->toData()[B

    move-result-object v1

    const/16 v3, 0x11

    invoke-direct {v0, v3, v1}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;-><init>(I[B)V

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->toData()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    :cond_6
    new-instance v0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;->toData()[B

    move-result-object v1

    const/16 v3, 0x13

    invoke-direct {v0, v3, v1}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;-><init>(I[B)V

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->toData()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->customVersionMsg:Ljava/lang/String;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    new-instance v0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->customVersionMsg:Ljava/lang/String;

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->stringToData(Ljava/lang/String;)[B

    move-result-object v1

    const/16 v3, 0x1f

    invoke-direct {v0, v3, v1}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;-><init>(I[B)V

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->toData()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_7
    :goto_2
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TargetInfoResponse{protocolVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->protocolVersion:Lcom/jieli/jl_bt_ota/model/response/device/ProtocolVersion;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \nsystemInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->systemInfo:Lcom/jieli/jl_bt_ota/model/response/device/SystemInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \nclassicBtInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->classicBtInfo:Lcom/jieli/jl_bt_ota/model/response/device/ClassicBtInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \nfunctionConfiguration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->functionConfiguration:Lcom/jieli/jl_bt_ota/model/response/device/FunctionConfiguration;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \nversion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->version:Lcom/jieli/jl_bt_ota/model/response/device/Version;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \nsdkType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->sdkType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", \nuBootVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->uBootVersion:Lcom/jieli/jl_bt_ota/model/response/device/Version;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \notaSettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->otaSettings:Lcom/jieli/jl_bt_ota/model/response/device/OTASettings;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \notaState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->otaState:Lcom/jieli/jl_bt_ota/model/response/device/OTAState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \nproductInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->productInfo:Lcom/jieli/jl_bt_ota/model/response/device/ProductInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \nauthKey=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->authKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", \nprojectCode=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->projectCode:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", \nprotocolMtu="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->protocolMtu:Lcom/jieli/jl_bt_ota/model/response/device/ProtocolMTU;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", \nallowConnectFlag="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->allowConnectFlag:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", \nbleInfo="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->bleInfo:Lcom/jieli/jl_bt_ota/model/response/device/BleInfo;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", \nexpandFunc="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->expandFunc:Lcom/jieli/jl_bt_ota/model/response/device/ExpandFunc;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", \ncustomVersionMsg=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->customVersionMsg:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
