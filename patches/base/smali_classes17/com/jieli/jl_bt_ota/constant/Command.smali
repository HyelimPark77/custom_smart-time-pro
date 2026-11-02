.class public Lcom/jieli/jl_bt_ota/constant/Command;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CMD_ADV_DEVICE_NOTIFY:I = 0xc2

.field public static final CMD_ADV_DEV_REQUEST_OPERATION:I = 0xc4

.field public static final CMD_ADV_NOTIFY_SETTINGS:I = 0xc3

.field public static final CMD_CUSTOM:I = 0xf0

.field public static final CMD_DATA:I = 0x1

.field public static final CMD_DISCONNECT_CLASSIC_BLUETOOTH:I = 0x6

.field public static final CMD_EXTRA_CUSTOM:I = 0xff

.field public static final CMD_GET_DEV_MD5:I = 0xd4

.field public static final CMD_GET_TARGET_FEATURE_MAP:I = 0x2

.field public static final CMD_GET_TARGET_INFO:I = 0x3

.field public static final CMD_OTA_ENTER_UPDATE_MODE:I = 0xe3

.field public static final CMD_OTA_EXIT_UPDATE_MODE:I = 0xe4

.field public static final CMD_OTA_GET_DEVICE_REFRESH_FIRMWARE_STATUS:I = 0xe6

.field public static final CMD_OTA_GET_DEVICE_UPDATE_FILE_INFO_OFFSET:I = 0xe1

.field public static final CMD_OTA_INQUIRE_DEVICE_IF_CAN_UPDATE:I = 0xe2

.field public static final CMD_OTA_NOTIFY_UPDATE_CONTENT_SIZE:I = 0xe8

.field public static final CMD_OTA_SEND_FIRMWARE_UPDATE_BLOCK:I = 0xe5

.field public static final CMD_REBOOT_DEVICE:I = 0xe7

.field public static final CMD_SETTINGS_COMMUNICATION_MTU:I = 0xd1

.field public static final CMD_SWITCH_DEVICE_REQUEST:I = 0xb

.field private static a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/jieli/jl_bt_ota/interfaces/command/ICmdHandler;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getValidCommandList()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/jieli/jl_bt_ota/interfaces/command/ICmdHandler;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/jieli/jl_bt_ota/constant/Command;->a:Ljava/util/Map;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/jieli/jl_bt_ota/constant/Command;->a:Ljava/util/Map;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/model/cmdHandler/DataCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_bt_ota/model/cmdHandler/DataCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_bt_ota/constant/Command;->a:Ljava/util/Map;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/model/cmdHandler/GetTargetFeatureMapCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_bt_ota/model/cmdHandler/GetTargetFeatureMapCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_bt_ota/constant/Command;->a:Ljava/util/Map;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/model/cmdHandler/GetTargetInfoCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_bt_ota/model/cmdHandler/GetTargetInfoCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_bt_ota/constant/Command;->a:Ljava/util/Map;

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/model/cmdHandler/DisconnectClassicBluetoothCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_bt_ota/model/cmdHandler/DisconnectClassicBluetoothCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_bt_ota/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xb

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/model/cmdHandler/NotifyCommunicationWayCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_bt_ota/model/cmdHandler/NotifyCommunicationWayCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_bt_ota/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xe1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/model/cmdHandler/OtaCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_bt_ota/model/cmdHandler/OtaCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_bt_ota/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xe2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/model/cmdHandler/OtaCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_bt_ota/model/cmdHandler/OtaCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_bt_ota/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xe3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/model/cmdHandler/OtaCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_bt_ota/model/cmdHandler/OtaCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_bt_ota/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xe4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/model/cmdHandler/OtaCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_bt_ota/model/cmdHandler/OtaCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_bt_ota/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xe5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/model/cmdHandler/OtaCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_bt_ota/model/cmdHandler/OtaCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_bt_ota/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xe6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/model/cmdHandler/OtaCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_bt_ota/model/cmdHandler/OtaCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_bt_ota/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xe7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/model/cmdHandler/OtaCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_bt_ota/model/cmdHandler/OtaCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_bt_ota/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xe8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/model/cmdHandler/OtaCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_bt_ota/model/cmdHandler/OtaCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_bt_ota/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xd1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/model/cmdHandler/SettingsMtuCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_bt_ota/model/cmdHandler/SettingsMtuCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_bt_ota/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xd4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/model/cmdHandler/GetDevMD5CmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_bt_ota/model/cmdHandler/GetDevMD5CmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_bt_ota/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xf0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/model/cmdHandler/RcspCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_bt_ota/model/cmdHandler/RcspCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_bt_ota/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xff

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/model/cmdHandler/CustomCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_bt_ota/model/cmdHandler/CustomCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_bt_ota/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xc2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/model/cmdHandler/TwsCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_bt_ota/model/cmdHandler/TwsCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_bt_ota/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xc3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/model/cmdHandler/TwsCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_bt_ota/model/cmdHandler/TwsCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_bt_ota/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xc4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/model/cmdHandler/TwsCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_bt_ota/model/cmdHandler/TwsCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object v0, Lcom/jieli/jl_bt_ota/constant/Command;->a:Ljava/util/Map;

    return-object v0
.end method

.method public static isValidCmd(I)Z
    .locals 1

    invoke-static {}, Lcom/jieli/jl_bt_ota/constant/Command;->getValidCommandList()Ljava/util/Map;

    move-result-object v0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
