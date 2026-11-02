.class public Lcom/jieli/jl_rcsp/util/CommandBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static buildAuditionAlarmBellCmd(BBI)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [B

    const/4 v1, 0x0

    const/4 v2, 0x1

    aput-byte v2, v0, v1

    aput-byte p0, v0, v2

    const/4 p0, 0x2

    aput-byte p1, v0, p0

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object p1

    const/4 p2, 0x3

    const/4 v2, 0x4

    invoke-static {p1, v1, v0, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance p1, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    const/4 p2, 0x6

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p0, p2}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetSysInfoCmd(BLjava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildAuxPlayOrPauseCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {v2, v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildCustomCmd([B)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/custom/CustomCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/CustomParam;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/CustomParam;-><init>([B)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/custom/CustomCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/CustomParam;)V

    return-object v0
.end method

.method public static buildCustomCmdWithoutResponse([B)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/custom/CustomCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/CustomParam;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/CustomParam;-><init>([B)V

    const/4 p0, 0x1

    invoke-direct {v0, p0, v1}, Lcom/jieli/jl_rcsp/model/command/custom/CustomCmd;-><init>(ILcom/jieli/jl_rcsp/model/parameter/CustomParam;)V

    return-object v0
.end method

.method public static buildDataCmd(Lcom/jieli/jl_rcsp/model/base/CommandBase;[B)Lcom/jieli/jl_rcsp/model/command/data/DataCmd;
    .locals 1

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/DataParam;

    invoke-direct {v0, p1}, Lcom/jieli/jl_rcsp/model/parameter/DataParam;-><init>([B)V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;->setXmOpCode(I)Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    new-instance p0, Lcom/jieli/jl_rcsp/model/command/data/DataCmd;

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/command/data/DataCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/DataParam;)V

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static buildDataCmdWithResponse(Lcom/jieli/jl_rcsp/model/base/CommandBase;[B)Lcom/jieli/jl_rcsp/model/command/data/DataHasResponseCmd;
    .locals 1

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    array-length v0, p1

    if-lez v0, :cond_0

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/DataParam;

    invoke-direct {v0, p1}, Lcom/jieli/jl_rcsp/model/parameter/DataParam;-><init>([B)V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;->setXmOpCode(I)Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    new-instance p0, Lcom/jieli/jl_rcsp/model/command/data/DataHasResponseCmd;

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/command/data/DataHasResponseCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/DataParam;)V

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static buildDelAlarmCmd(Lcom/jieli/jl_rcsp/model/device/AttrBean;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p0, 0x2

    invoke-static {p0, v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetSysInfoCmd(BLjava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildDeleteNFCInfoSyncCmd(IS)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$DeleteMsgParam;

    invoke-direct {v1, p0, p1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$DeleteMsgParam;-><init>(IS)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;)V

    return-object v0
.end method

.method public static buildDisconnectClassicBluetoothCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/DisconnectClassicBluetoothCmd;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/command/DisconnectClassicBluetoothCmd;-><init>()V

    return-object v0
.end method

.method public static buildExternalFlashDeleteFileEndCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;-><init>()V

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFlag(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;)V

    return-object v0
.end method

.method public static buildExternalFlashDeleteFileStartCmd(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;-><init>()V

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFlag(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFilePath(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;)V

    return-object v0
.end method

.method public static buildExternalFlashEnableCustomWatchCmd(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFlag(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFilePath(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;)V

    return-object v0
.end method

.method public static buildExternalFlashErasureDataCmd(II)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;-><init>()V

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOffset(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setSize(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;)V

    return-object v0
.end method

.method public static buildExternalFlashGetCurrentWatchMsgCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFlag(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;)V

    return-object v0
.end method

.method public static buildExternalFlashGetCustomBgInfoCmd(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFlag(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFilePath(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;)V

    return-object v0
.end method

.method public static buildExternalFlashGetFileMsgCmd(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;-><init>()V

    const/16 v2, 0xb

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFilePath(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;)V

    return-object v0
.end method

.method public static buildExternalFlashGetLeftSpaceCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;-><init>()V

    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;)V

    return-object v0
.end method

.method public static buildExternalFlashGetWatchVersionCmd(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFlag(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFilePath(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;)V

    return-object v0
.end method

.method public static buildExternalFlashInsertNewFileEndCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFlag(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;)V

    return-object v0
.end method

.method public static buildExternalFlashInsertNewFileStartCmd(Ljava/lang/String;I)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFlag(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFilePath(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setSize(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;)V

    return-object v0
.end method

.method public static buildExternalFlashOTAResourceCmd(Z)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;-><init>()V

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    xor-int/lit8 p0, p0, 0x1

    invoke-virtual {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFlag(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;)V

    return-object v0
.end method

.method public static buildExternalFlashQueryWriteResultCmd(IS)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;-><init>()V

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFlag(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setCrc16(S)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;)V

    return-object v0
.end method

.method public static buildExternalFlashReadDataCmd(III)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFlag(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOffset(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setSize(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;)V

    return-object v0
.end method

.method public static buildExternalFlashRestoreSystemCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;-><init>()V

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;)V

    return-object v0
.end method

.method public static buildExternalFlashSetWatchCmd(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;-><init>()V

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFlag(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFilePath(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;)V

    return-object v0
.end method

.method public static buildExternalFlashUpdateResourceCmd(Z)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;-><init>()V

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    xor-int/lit8 p0, p0, 0x1

    invoke-virtual {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFlag(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;)V

    return-object v0
.end method

.method public static buildExternalFlashWriteDataCmd(II[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/external_flash/ExtFlashIOCtrlNoResponseCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFlag(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOffset(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setData([B)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/external_flash/ExtFlashIOCtrlNoResponseCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;)V

    return-object v0
.end method

.method public static buildExternalFlashWriteProtectCmd(Z)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;-><init>()V

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object v1

    xor-int/lit8 p0, p0, 0x1

    invoke-virtual {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;->setFlag(I)Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/external_flash/ExternalFlashIOCtrlCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/ExternalFlashIOCtrlParam;)V

    return-object v0
.end method

.method public static buildFastForwardCmd(S)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/CHexConver;->shortToBigBytes(S)[B

    move-result-object p0

    const/4 v0, 0x1

    const/4 v1, 0x7

    invoke-static {v0, v1, p0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildFmDelChannelCmd(B)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte p0, v0, v1

    const/4 p0, 0x4

    const/16 v1, 0x8

    invoke-static {p0, v1, v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildFmFunctionCmd(B[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/4 v0, 0x4

    invoke-static {v0, p0, p1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildFmNextChannelCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    const/4 v0, 0x5

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-static {v2, v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildFmNextFreqCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-static {v2, v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildFmPlayOrPauseCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-static {v2, v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildFmPrevChannelCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-static {v0, v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildFmPrevFreqCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-static {v2, v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildFmScanCmd(B)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte p0, v0, v1

    const/4 p0, 0x4

    const/4 v1, 0x6

    invoke-static {p0, v1, v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildFmSelChannelCmd(B)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte p0, v0, v1

    const/4 p0, 0x4

    const/4 v1, 0x7

    invoke-static {p0, v1, v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildFmSelectFreqCmd(F)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    const/high16 v0, 0x41200000    # 10.0f

    mul-float/2addr p0, v0

    float-to-int p0, p0

    shr-int/lit8 v0, p0, 0x8

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    const/4 v1, 0x2

    new-array v1, v1, [B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    const/4 v0, 0x1

    aput-byte p0, v1, v0

    const/4 p0, 0x4

    const/16 v0, 0x9

    invoke-static {p0, v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;

    invoke-direct {v0, p0, p1}, Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;-><init>(BB)V

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;->setExtend([B)Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;

    new-instance p0, Lcom/jieli/jl_rcsp/model/command/FunctionCmd;

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/command/FunctionCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/FunctionParam;)V

    return-object p0
.end method

.method public static buildGetADVInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/tws/GetADVInfoCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/GetADVInfoParam;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/GetADVInfoParam;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/tws/GetADVInfoCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/GetADVInfoParam;)V

    return-object v0
.end method

.method public static buildGetADVInfoCmdWithAll()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/4 v0, -0x1

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetADVInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetAlarmCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    const/4 v0, 0x2

    const/16 v1, 0x12

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetSysInfoCmd(BI)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetAllVoiceModes()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    const/4 v0, -0x1

    const/16 v1, 0x4000

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetSysInfoCmd(BI)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetAuxPlayStatueCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    const/4 v0, 0x3

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetSysInfoCmd(BI)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetBrowseFileTypeCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/16 v0, 0x20

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetPublicSysInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetBtSysInfoCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/16 v0, 0xfff

    .line 1
    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetBtSysInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetBtSysInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetSysInfoCmd(BI)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildGetCurrentVoiceMode()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    const/4 v0, -0x1

    const/16 v1, 0x2000

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetSysInfoCmd(BI)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetDefaultAlarmBellsCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    const/4 v0, 0x2

    const/16 v1, 0x20

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetSysInfoCmd(BI)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetDefaultNfcOpCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$GetDefaultNfcParam;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$GetDefaultNfcParam;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;)V

    return-object v0
.end method

.method public static buildGetDevConfigureCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/GetDevConfigureCmd;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/command/GetDevConfigureCmd;-><init>()V

    return-object v0
.end method

.method public static buildGetDeviceInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    .line 1
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/status/GetTargetInfoCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/GetTargetInfoParam;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/GetTargetInfoParam;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/status/GetTargetInfoCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/GetTargetInfoParam;)V

    return-object v0
.end method

.method public static buildGetDeviceInfoCmd(IB)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    .line 2
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/status/GetTargetInfoCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/GetTargetInfoParam;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/GetTargetInfoParam;-><init>(I)V

    invoke-virtual {v1, p1}, Lcom/jieli/jl_rcsp/model/parameter/GetTargetInfoParam;->setPlatform(B)Lcom/jieli/jl_rcsp/model/parameter/GetTargetInfoParam;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/status/GetTargetInfoCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/GetTargetInfoParam;)V

    return-object v0
.end method

.method public static buildGetDeviceInfoCmdForAll()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/4 v0, -0x1

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetDeviceInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetEqPresetAndEqValueCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/16 v0, 0x1010

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetPublicSysInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetEqPresetValueCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/16 v0, 0x1000

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetPublicSysInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetEqValueCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/16 v0, 0x10

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetPublicSysInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetExternalFlashMsgCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/external_flash/GetExternalFlashMsgCmd;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/command/external_flash/GetExternalFlashMsgCmd;-><init>()V

    return-object v0
.end method

.method public static buildGetFixedLenDataCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    const/4 v0, -0x1

    const/high16 v1, 0x10000

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetSysInfoCmd(BI)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetFmChannelCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/4 v0, 0x2

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetFmSysInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetFmStatueCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetFmSysInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetFmSysInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/4 v0, 0x4

    invoke-static {v0, p0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetSysInfoCmd(BI)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildGetFrequencyTxInfoCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    const/4 v0, -0x1

    const/16 v1, 0x100

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetSysInfoCmd(BI)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static varargs buildGetHealthDataInfoCmd(II[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;

    int-to-byte p1, p1

    invoke-direct {v0, p0, p1, p2}, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;-><init>(IB[B)V

    new-instance p0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd;

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;)V

    return-object p0
.end method

.method public static buildGetHealthSettingCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$GetParam;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$GetParam;-><init>(I)V

    new-instance p0, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd;

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$Param;)V

    return-object p0
.end method

.method public static buildGetHighAndBassCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    const/4 v0, -0x1

    const/16 v1, 0x800

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetSysInfoCmd(BI)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetLightControlInfoCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    const/4 v0, -0x1

    const/16 v1, 0x80

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetSysInfoCmd(BI)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetMusicFileInfoCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/4 v0, 0x2

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetMusicSysInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetMusicPlayModeCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/4 v0, 0x4

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetMusicSysInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetMusicStatusInfoCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetMusicSysInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetMusicSysInfoCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/16 v0, 0xfff

    .line 1
    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetMusicSysInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetMusicSysInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/4 v0, 0x1

    .line 2
    invoke-static {v0, p0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetSysInfoCmd(BI)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildGetPublicSysInfoCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const v0, 0xfff7

    .line 1
    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetPublicSysInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetPublicSysInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/4 v0, -0x1

    .line 2
    invoke-static {v0, p0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetSysInfoCmd(BI)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildGetSoundCardEqInfo()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/high16 v0, 0x60000

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetPublicSysInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetSoundCardStatusInfo()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/high16 v0, 0x80000

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetPublicSysInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildGetSysInfoCmd(BI)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;

    invoke-direct {v0, p0, p1}, Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;-><init>(BI)V

    new-instance p0, Lcom/jieli/jl_rcsp/model/command/sys/GetSysInfoCmd;

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/command/sys/GetSysInfoCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/GetSysInfoParam;)V

    return-object p0
.end method

.method public static buildGetVolumeCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/4 v0, 0x2

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildGetPublicSysInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildID3DataPushSwitch(B)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte p0, v0, v1

    const/4 p0, 0x4

    invoke-static {v1, p0, v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildID3PlayNextCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildID3PlayOrPauseCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildID3PlayPrevCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildInsertNfcFileCmd(IILjava/lang/String;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$InsertFileParam;

    invoke-direct {v1, p0, p1, p2}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$InsertFileParam;-><init>(IILjava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;)V

    return-object v0
.end method

.method public static buildInsertNfcFileEndCmd(ILjava/lang/String;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$InsertFileEndParam;

    invoke-direct {v1, p0, p1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$InsertFileEndParam;-><init>(ILjava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;)V

    return-object v0
.end method

.method public static buildModifyNFCInfoCmd(Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;)V

    return-object v0
.end method

.method public static buildNextEqModeCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    const/4 v0, 0x5

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildNextPlaymodeCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    const/4 v0, 0x4

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildNotifyAIDialThumbSuccess(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/ai/AIOperateCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->setFlag(I)Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->setThumbPath(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/ai/AIOperateCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;)V

    return-object v0
.end method

.method public static buildNotifyAIPaintStyle(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/ai/AIOperateCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->setOp(I)Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->setFlag(I)Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->setAiDialStyle(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/ai/AIOperateCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;)V

    return-object v0
.end method

.method public static buildNotifyCommunicationWayCmd(II)Lcom/jieli/jl_rcsp/model/command/NotifyCommunicationWayCmd;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/NotifyCommunicationWayCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/NotifyCommunicationWayParam;

    invoke-direct {v1, p0, p1}, Lcom/jieli/jl_rcsp/model/parameter/NotifyCommunicationWayParam;-><init>(II)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/NotifyCommunicationWayCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/NotifyCommunicationWayParam;)V

    return-object v0
.end method

.method public static buildNotifyPrepareEnvCmd(B)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$Param;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$Param;-><init>(B)V

    new-instance p0, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd;

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/NotifyPrepareEnvCmd$Param;)V

    return-object p0
.end method

.method public static buildPhoneCallCmd(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;-><init>(Ljava/lang/String;)V

    const/4 p0, 0x1

    invoke-virtual {v0, p0}, Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;->setType(I)Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;

    new-instance p0, Lcom/jieli/jl_rcsp/model/command/phone/PhoneCallRequestCmd;

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/command/phone/PhoneCallRequestCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/PhoneCallRequestParam;)V

    return-object p0
.end method

.method public static buildPlayNextCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildPlayOrPauseCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v0, v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildPlayPrevCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildPushMessageInfoCmd(Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$MessageData;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Param;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Param;-><init>(Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Param;)V

    return-object v0
.end method

.method public static buildReadBellArgsCmd(B)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$ReadRtcBellArgsParams;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$ReadRtcBellArgsParams;-><init>(B)V

    new-instance p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Param;)V

    return-object p0
.end method

.method public static buildRebootCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/upgrade/RebootDeviceCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/RebootDeviceParam;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/RebootDeviceParam;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/upgrade/RebootDeviceCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/RebootDeviceParam;)V

    return-object v0
.end method

.method public static buildRemoveMessageCmd(Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$RemoveMsg;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Param;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Param;-><init>(Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$BaseInfo;)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$Param;)V

    return-object v0
.end method

.method public static buildRetreatQuicklyCmd(S)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/CHexConver;->shortToBigBytes(S)[B

    move-result-object p0

    const/4 v0, 0x1

    const/4 v1, 0x6

    invoke-static {v0, v1, p0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildSearchDevCmd(II)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, p1, v0, v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSearchDevCmd(IIII)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildSearchDevCmd(IIII)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    .line 2
    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, p1}, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;-><init>(III)V

    .line 3
    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->setWay(I)Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;

    .line 4
    invoke-virtual {v0, p3}, Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;->setPlayer(I)Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;

    .line 5
    new-instance p0, Lcom/jieli/jl_rcsp/model/command/SearchDevCmd;

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/command/SearchDevCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/SearchDevParam;)V

    return-object p0
.end method

.method public static buildSendPathDataCmd(Lcom/jieli/jl_filebrowse/bean/PathData;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/StartFileBrowseCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/StartFileBrowseParam;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/StartFileBrowseParam;-><init>(Lcom/jieli/jl_filebrowse/bean/PathData;)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/StartFileBrowseCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/StartFileBrowseParam;)V

    return-object v0
.end method

.method public static buildSetADVInfoCmd([B)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    new-array p0, p0, [B

    :cond_0
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/tws/SetADVInfoCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/SetADVInfoParam;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/SetADVInfoParam;-><init>([B)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/tws/SetADVInfoCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/SetADVInfoParam;)V

    return-object v0
.end method

.method public static buildSetAlarmCmd(Lcom/jieli/jl_rcsp/model/device/AttrBean;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p0, 0x2

    invoke-static {p0, v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetSysInfoCmd(BLjava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildSetBellArgsCmd(Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$SetRtcBellArgsParams;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$SetRtcBellArgsParams;-><init>(Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$BellArg;)V

    new-instance p0, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/AlarmExpandCmd$Param;)V

    return-object p0
.end method

.method public static buildSetBrowseFileTypeCmd(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 4

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    array-length v0, p0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    new-array v0, v0, [B

    array-length v2, p0

    int-to-byte v2, v2

    const/4 v3, 0x0

    aput-byte v2, v0, v3

    array-length v2, p0

    invoke-static {p0, v3, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance p0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    const/4 v1, 0x5

    invoke-virtual {p0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetPublicSysInfoCmd(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "\u6587\u4ef6\u7c7b\u578b\u53c2\u6570\u4e0d\u80fd\u4e3anull"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static buildSetBtSysInfoCmd(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;)",
            "Lcom/jieli/jl_rcsp/model/base/CommandBase;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0, p0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetSysInfoCmd(BLjava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildSetCurrentVoiceMode(Lcom/jieli/jl_rcsp/model/device/VoiceMode;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/VoiceMode;->getBytes()[B

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v0, -0x1

    invoke-static {v0, p0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetSysInfoCmd(BLjava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildSetDefaultNfcOpCmd(IS)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$SetDefaultNfcParam;

    invoke-direct {v1, p0, p1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$SetDefaultNfcParam;-><init>(IS)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;)V

    return-object v0
.end method

.method public static buildSetDeviceNotifyADVInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/tws/SetDeviceNotifyAdvInfoCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/SetDeviceNotifyAdvInfoParam;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/model/parameter/SetDeviceNotifyAdvInfoParam;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/tws/SetDeviceNotifyAdvInfoCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/SetDeviceNotifyAdvInfoParam;)V

    return-object v0
.end method

.method public static buildSetDeviceStorageCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/SetDevStorageCmd;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/SetDevStorageCmd;-><init>(I)V

    return-object v0
.end method

.method public static buildSetEqValueCmd(B[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    const/4 v1, 0x4

    .line 2
    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    const/16 v1, 0xb

    .line 3
    new-array v1, v1, [B

    const/4 v2, 0x0

    .line 4
    aput-byte p0, v1, v2

    if-eqz p1, :cond_0

    .line 5
    array-length p0, p1

    const/16 v3, 0xa

    if-ne p0, v3, :cond_0

    .line 6
    array-length p0, p1

    const/4 v3, 0x1

    invoke-static {p1, v2, v1, v3, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 7
    :cond_0
    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    .line 8
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetPublicSysInfoCmd(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildSetEqValueCmd(ZB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 4

    if-nez p0, :cond_0

    .line 11
    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetEqValueCmd(B[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0

    .line 12
    :cond_0
    new-instance p0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    const/4 v0, 0x4

    .line 13
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    .line 14
    array-length v0, p2

    const/4 v1, 0x2

    add-int/2addr v0, v1

    new-array v0, v0, [B

    or-int/lit16 p1, p1, 0x80

    int-to-byte p1, p1

    const/4 v2, 0x0

    .line 15
    aput-byte p1, v0, v2

    .line 16
    array-length p1, p2

    int-to-byte p1, p1

    const/4 v3, 0x1

    aput-byte p1, v0, v3

    .line 17
    array-length p1, p2

    invoke-static {p2, v2, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 18
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    .line 19
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetPublicSysInfoCmd(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildSetFixedLenDataCmd(I[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p1

    add-int/lit8 v1, v1, 0x4

    new-array v1, v1, [B

    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object p0

    array-length v2, p0

    const/4 v3, 0x0

    invoke-static {p0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length p0, p0

    array-length v2, p1

    invoke-static {p1, v3, v1, p0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance p0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    const/16 p1, 0x10

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-virtual {p0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p0, -0x1

    invoke-static {p0, v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetSysInfoCmd(BLjava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildSetFrequencyTxInfoCmd(F)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    const/high16 v0, 0x41200000    # 10.0f

    mul-float/2addr p0, v0

    float-to-double v0, p0

    .line 7
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int p0, v0

    .line 8
    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object p0

    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetFrequencyTxInfoCmd([B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildSetFrequencyTxInfoCmd([B)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    .line 1
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    const/16 v1, 0x8

    .line 2
    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    .line 3
    invoke-virtual {v0, p0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    .line 4
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v0, -0x1

    .line 6
    invoke-static {v0, p0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetSysInfoCmd(BLjava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildSetHealthSettingCmd(Lcom/jieli/jl_rcsp/model/device/health/IHealthSettingToAttr;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-interface {p0}, Lcom/jieli/jl_rcsp/model/device/health/IHealthSettingToAttr;->toAttr()Lcom/jieli/jl_rcsp/model/device/AttrBean;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetHealthSettingCmd(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildSetHealthSettingCmd(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;)",
            "Lcom/jieli/jl_rcsp/model/base/CommandBase;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$SetParam;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$SetParam;-><init>(Ljava/util/List;)V

    .line 2
    new-instance p0, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd;

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/watch/HealthSettingCmd$Param;)V

    return-object p0
.end method

.method public static buildSetHighAndBassCmd(II)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    const/16 v2, 0xb

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    const/16 v2, 0x8

    new-array v2, v2, [B

    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object p0

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object p1

    const/4 v3, 0x0

    const/4 v4, 0x4

    invoke-static {p1, v3, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {p0, v3, v2, v4, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p0, -0x1

    invoke-static {p0, v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetSysInfoCmd(BLjava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildSetLightControlInfoCmd([B)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-virtual {v1, p0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p0, -0x1

    invoke-static {p0, v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetSysInfoCmd(BLjava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildSetMusicPlayModeCmd(B)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte p0, v0, v1

    new-instance p0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {p0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetMusicSysInfoCmd(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildSetMusicSysInfoCmd(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;)",
            "Lcom/jieli/jl_rcsp/model/base/CommandBase;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {v0, p0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetSysInfoCmd(BLjava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildSetPublicSysInfoCmd(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;)",
            "Lcom/jieli/jl_rcsp/model/base/CommandBase;"
        }
    .end annotation

    const/4 v0, -0x1

    invoke-static {v0, p0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetSysInfoCmd(BLjava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildSetSoundCardEqValue([B)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 5

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    const/16 v1, 0x12

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    array-length v1, p0

    const/4 v2, 0x1

    add-int/2addr v1, v2

    new-array v1, v1, [B

    array-length v3, p0

    int-to-byte v3, v3

    const/4 v4, 0x0

    aput-byte v3, v1, v4

    array-length v3, p0

    invoke-static {p0, v4, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetPublicSysInfoCmd(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildSetSoundCardInfo(BI)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 4

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    const/16 v1, 0x13

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    shr-int/lit8 v1, p1, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    const/4 v2, 0x3

    new-array v2, v2, [B

    const/4 v3, 0x0

    aput-byte p0, v2, v3

    const/4 p0, 0x1

    aput-byte v1, v2, p0

    const/4 p0, 0x2

    aput-byte p1, v2, p0

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetPublicSysInfoCmd(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildSetSysInfoCmd(BLjava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;)",
            "Lcom/jieli/jl_rcsp/model/base/CommandBase;"
        }
    .end annotation

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/sys/SetSysInfoCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/SetSysInfoParam;

    invoke-direct {v1, p0, p1}, Lcom/jieli/jl_rcsp/model/parameter/SetSysInfoParam;-><init>(BLjava/util/List;)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/sys/SetSysInfoCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/SetSysInfoParam;)V

    return-object v0
.end method

.method public static buildSetVolumeCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    int-to-byte p0, p0

    new-array v1, v1, [B

    const/4 v2, 0x0

    aput-byte p0, v1, v2

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetPublicSysInfoCmd(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildShutdownCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/upgrade/RebootDeviceCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/parameter/RebootDeviceParam;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lcom/jieli/jl_rcsp/model/parameter/RebootDeviceParam;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/upgrade/RebootDeviceCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/RebootDeviceParam;)V

    return-object v0
.end method

.method public static buildStartFileTransferCmd(Ljava/lang/String;IZ)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;

    invoke-direct {v0, p0, p1}, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;->enableDataNeedResponse(Z)Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;

    new-instance p0, Lcom/jieli/jl_rcsp/model/command/file_op/StartFileTransferCmd;

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/StartFileTransferCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/StartFileTransferParam;)V

    return-object p0
.end method

.method public static buildStartNFCInfoSyncCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$StartSyncParam;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$StartSyncParam;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;)V

    return-object v0
.end method

.method public static buildStartReadErrorMsgCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;->setOp(I)V

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd;

    invoke-direct {v1, v0}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;)V

    return-object v1
.end method

.method public static buildStopAlarmCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 4

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    const/4 v2, 0x2

    new-array v1, v1, [B

    const/4 v3, 0x0

    aput-byte v2, v1, v3

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v2, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetSysInfoCmd(BLjava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildStopAuditionAlarmBellCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [B

    new-instance v1, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-virtual {v1, v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x2

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetSysInfoCmd(BLjava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildStopDeviceNotifyADVInfoCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetDeviceNotifyADVInfoCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildStopFileTransferCmd(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/StopFileTransferParam;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/parameter/StopFileTransferParam;-><init>(I)V

    new-instance p0, Lcom/jieli/jl_rcsp/model/command/file_op/StopFileTransferCmd;

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/StopFileTransferCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/StopFileTransferParam;)V

    return-object p0
.end method

.method public static buildStopReadErrorMsgCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;->setOp(I)V

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd;

    invoke-direct {v1, v0}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;)V

    return-object v1
.end method

.method public static buildSwitchBtModeCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSwitchModeCmd(B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildSwitchFMModeCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/4 v0, 0x4

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSwitchModeCmd(B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildSwitchLineInModeCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/4 v0, 0x3

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSwitchModeCmd(B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildSwitchModeCmd(B)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildFunctionCmd(BB[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method

.method public static buildSwitchMusicModeCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSwitchModeCmd(B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildSwitchRtcModeCmd()Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    const/4 v0, 0x2

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSwitchModeCmd(B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    return-object v0
.end method

.method public static buildSyncSportsStatusCmd(Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;)V

    return-object v0
.end method

.method public static buildSyncTimeCmd(Ljava/util/Calendar;)Lcom/jieli/jl_rcsp/model/base/CommandBase;
    .locals 12

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/AttrBean;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setType(B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v3

    shr-int/lit8 v4, v3, 0x8

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    const/4 v5, 0x2

    invoke-virtual {p0, v5}, Ljava/util/Calendar;->get(I)I

    move-result v6

    add-int/2addr v6, v2

    int-to-byte v6, v6

    const/4 v7, 0x5

    invoke-virtual {p0, v7}, Ljava/util/Calendar;->get(I)I

    move-result v8

    int-to-byte v8, v8

    const/16 v9, 0xb

    invoke-virtual {p0, v9}, Ljava/util/Calendar;->get(I)I

    move-result v9

    int-to-byte v9, v9

    const/16 v10, 0xc

    invoke-virtual {p0, v10}, Ljava/util/Calendar;->get(I)I

    move-result v10

    int-to-byte v10, v10

    const/16 v11, 0xd

    invoke-virtual {p0, v11}, Ljava/util/Calendar;->get(I)I

    move-result p0

    int-to-byte p0, p0

    const/4 v11, 0x7

    new-array v11, v11, [B

    aput-byte v4, v11, v1

    aput-byte v3, v11, v2

    aput-byte v6, v11, v5

    const/4 v1, 0x3

    aput-byte v8, v11, v1

    const/4 v1, 0x4

    aput-byte v9, v11, v1

    aput-byte v10, v11, v7

    const/4 v1, 0x6

    aput-byte p0, v11, v1

    invoke-virtual {v0, v11}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->setAttrData([B)Lcom/jieli/jl_rcsp/model/device/AttrBean;

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v5, p0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildSetSysInfoCmd(BLjava/util/List;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p0

    return-object p0
.end method
