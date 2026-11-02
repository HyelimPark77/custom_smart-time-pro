.class public Lcom/jieli/jl_bt_ota/tool/RcspOTA;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/rcsp/IRcspOTA;


# instance fields
.field private final a:Lcom/jieli/jl_bt_ota/interfaces/rcsp/IRcspOp;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/interfaces/rcsp/IRcspOp;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->a:Lcom/jieli/jl_bt_ota/interfaces/rcsp/IRcspOp;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "BluetoothOTAManager can not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private a(Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/jieli/jl_bt_ota/model/base/CommandBase<",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/BaseParameter;",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/CommonResponse;",
            ">;>(TT;",
            "Lcom/jieli/jl_bt_ota/interfaces/CommandCallback<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->a:Lcom/jieli/jl_bt_ota/interfaces/rcsp/IRcspOp;

    invoke-interface {v0}, Lcom/jieli/jl_bt_ota/interfaces/rcsp/IRcspOp;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->a:Lcom/jieli/jl_bt_ota/interfaces/rcsp/IRcspOp;

    invoke-interface {v2}, Lcom/jieli/jl_bt_ota/interfaces/rcsp/IRcspOp;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v2

    invoke-virtual {v2}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->getTimeoutMs()I

    move-result v2

    invoke-interface {v0, v1, p1, v2, p2}, Lcom/jieli/jl_bt_ota/interfaces/rcsp/IRcspOp;->sendCommandAsync(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;ILcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void
.end method

.method public static convertCmdE2Error(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;
    .locals 2

    packed-switch p0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown Error : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatInt(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x4001

    invoke-static {v1, p0, v0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(IILjava/lang/String;)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p0

    return-object p0

    :pswitch_0
    const/16 p0, 0x4014

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p0

    return-object p0

    :pswitch_1
    const/16 p0, 0x4013

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p0

    return-object p0

    :pswitch_2
    const/16 p0, 0x400e

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p0

    return-object p0

    :pswitch_3
    const/16 p0, 0x400d

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p0

    return-object p0

    :pswitch_4
    const/16 p0, 0x400c

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p0

    return-object p0

    :pswitch_5
    const/16 p0, 0x4003

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p0

    return-object p0

    :pswitch_6
    const/16 p0, 0x4002

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static convertCmdE6Error(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;
    .locals 2

    packed-switch p0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Device returned to an unknown code : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatInt(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x4010

    invoke-static {v1, p0, v0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(IILjava/lang/String;)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p0

    return-object p0

    :pswitch_0
    const/16 p0, 0x400f

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p0

    return-object p0

    :pswitch_1
    const/16 p0, 0x400b

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p0

    return-object p0

    :pswitch_2
    const/16 p0, 0x400a

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p0

    return-object p0

    :pswitch_3
    const/16 p0, 0x4009

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p0

    return-object p0

    :pswitch_4
    const/16 p0, 0x4007

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p0

    return-object p0

    :pswitch_5
    const/16 p0, 0x4003

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p0

    return-object p0

    :pswitch_6
    const/16 p0, 0x4006

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p0

    return-object p0

    :pswitch_7
    const/16 p0, 0x4001

    const-string v0, "Device return update failed."

    invoke-static {p0, v0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(ILjava/lang/String;)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p0

    return-object p0

    :pswitch_8
    const/16 p0, 0x4005

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
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


# virtual methods
.method public changeCommunicationWay(IILcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/jieli/jl_bt_ota/model/command/NotifyCommunicationWayCmd;

    new-instance v1, Lcom/jieli/jl_bt_ota/model/parameter/NotifyCommunicationWayParam;

    invoke-direct {v1, p1, p2}, Lcom/jieli/jl_bt_ota/model/parameter/NotifyCommunicationWayParam;-><init>(II)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_bt_ota/model/command/NotifyCommunicationWayCmd;-><init>(Lcom/jieli/jl_bt_ota/model/parameter/NotifyCommunicationWayParam;)V

    new-instance p1, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;

    new-instance p2, Lcom/jieli/jl_bt_ota/tool/RcspOTA$1;

    invoke-direct {p2, p0}, Lcom/jieli/jl_bt_ota/tool/RcspOTA$1;-><init>(Lcom/jieli/jl_bt_ota/tool/RcspOTA;)V

    const-string v1, "changeCommunicationWay"

    invoke-direct {p1, v1, p3, p2}, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult;)V

    invoke-direct {p0, v0, p1}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->a(Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void
.end method

.method public enterUpdateMode(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/jieli/jl_bt_ota/model/command/EnterUpdateModeCmd;

    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/model/command/EnterUpdateModeCmd;-><init>()V

    new-instance v1, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;

    new-instance v2, Lcom/jieli/jl_bt_ota/tool/RcspOTA$4;

    invoke-direct {v2, p0}, Lcom/jieli/jl_bt_ota/tool/RcspOTA$4;-><init>(Lcom/jieli/jl_bt_ota/tool/RcspOTA;)V

    const-string v3, "enterUpdateMode"

    invoke-direct {v1, v3, p1, v2}, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult;)V

    invoke-direct {p0, v0, v1}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->a(Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void
.end method

.method public exitUpdateMode(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/jieli/jl_bt_ota/model/command/ExitUpdateModeCmd;

    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/model/command/ExitUpdateModeCmd;-><init>()V

    new-instance v1, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;

    new-instance v2, Lcom/jieli/jl_bt_ota/tool/RcspOTA$5;

    invoke-direct {v2, p0}, Lcom/jieli/jl_bt_ota/tool/RcspOTA$5;-><init>(Lcom/jieli/jl_bt_ota/tool/RcspOTA;)V

    const-string v3, "exitUpdateMode"

    invoke-direct {v1, v3, p1, v2}, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult;)V

    invoke-direct {p0, v0, v1}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->a(Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void
.end method

.method public inquiryDeviceCanOTA([BLcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/jieli/jl_bt_ota/model/command/InquireUpdateCmd;

    new-instance v1, Lcom/jieli/jl_bt_ota/model/parameter/InquireUpdateParam;

    invoke-direct {v1, p1}, Lcom/jieli/jl_bt_ota/model/parameter/InquireUpdateParam;-><init>([B)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_bt_ota/model/command/InquireUpdateCmd;-><init>(Lcom/jieli/jl_bt_ota/model/parameter/InquireUpdateParam;)V

    new-instance p1, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;

    new-instance v1, Lcom/jieli/jl_bt_ota/tool/RcspOTA$3;

    invoke-direct {v1, p0}, Lcom/jieli/jl_bt_ota/tool/RcspOTA$3;-><init>(Lcom/jieli/jl_bt_ota/tool/RcspOTA;)V

    const-string v2, "inquiryDeviceCanOTA"

    invoke-direct {p1, v2, p2, v1}, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult;)V

    invoke-direct {p0, v0, p1}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->a(Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void
.end method

.method public queryUpdateResult(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/jieli/jl_bt_ota/model/command/FirmwareUpdateStatusCmd;

    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/model/command/FirmwareUpdateStatusCmd;-><init>()V

    new-instance v1, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;

    new-instance v2, Lcom/jieli/jl_bt_ota/tool/RcspOTA$6;

    invoke-direct {v2, p0}, Lcom/jieli/jl_bt_ota/tool/RcspOTA$6;-><init>(Lcom/jieli/jl_bt_ota/tool/RcspOTA;)V

    const-string v3, "queryUpdateResult"

    invoke-direct {v1, v3, p1, v2}, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult;)V

    invoke-direct {p0, v0, v1}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->a(Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void
.end method

.method public readUpgradeFileFlag(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "Lcom/jieli/jl_bt_ota/model/FileOffset;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/jieli/jl_bt_ota/model/command/GetUpdateFileOffsetCmd;

    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/model/command/GetUpdateFileOffsetCmd;-><init>()V

    new-instance v1, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;

    new-instance v2, Lcom/jieli/jl_bt_ota/tool/RcspOTA$2;

    invoke-direct {v2, p0}, Lcom/jieli/jl_bt_ota/tool/RcspOTA$2;-><init>(Lcom/jieli/jl_bt_ota/tool/RcspOTA;)V

    const-string v3, "readUpgradeFileFlag"

    invoke-direct {v1, v3, p1, v2}, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult;)V

    invoke-direct {p0, v0, v1}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->a(Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void
.end method

.method public rebootDevice(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/jieli/jl_bt_ota/model/command/RebootDeviceCmd;

    new-instance v1, Lcom/jieli/jl_bt_ota/model/parameter/RebootDeviceParam;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/jieli/jl_bt_ota/model/parameter/RebootDeviceParam;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/jieli/jl_bt_ota/model/command/RebootDeviceCmd;-><init>(Lcom/jieli/jl_bt_ota/model/parameter/RebootDeviceParam;)V

    new-instance v1, Lcom/jieli/jl_bt_ota/tool/callback/CmdBooleanCallback;

    const-string v2, "rebootDevice"

    invoke-direct {v1, v2, p1}, Lcom/jieli/jl_bt_ota/tool/callback/CmdBooleanCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    invoke-direct {p0, v0, v1}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->a(Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void
.end method

.method public sendCommandResponse(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/jieli/jl_bt_ota/model/base/CommandBase<",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/BaseParameter;",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/CommonResponse;",
            ">;>(TT;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->sendCommandResponse(Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void
.end method

.method public sendCommandResponse(Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/jieli/jl_bt_ota/model/base/CommandBase<",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/BaseParameter;",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/CommonResponse;",
            ">;>(TT;",
            "Lcom/jieli/jl_bt_ota/interfaces/CommandCallback<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->a:Lcom/jieli/jl_bt_ota/interfaces/rcsp/IRcspOp;

    invoke-interface {v0}, Lcom/jieli/jl_bt_ota/interfaces/rcsp/IRcspOp;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, Lcom/jieli/jl_bt_ota/interfaces/rcsp/IRcspOp;->sendCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void
.end method

.method public stopADVInfo(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lcom/jieli/jl_bt_ota/util/CommandBuilder;->buildStopDeviceNotifyADVInfoCmd()Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    move-result-object v0

    new-instance v1, Lcom/jieli/jl_bt_ota/tool/callback/CmdBooleanCallback;

    const-string v2, "stopADVInfo"

    invoke-direct {v1, v2, p1}, Lcom/jieli/jl_bt_ota/tool/callback/CmdBooleanCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    invoke-direct {p0, v0, v1}, Lcom/jieli/jl_bt_ota/tool/RcspOTA;->a(Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void
.end method
