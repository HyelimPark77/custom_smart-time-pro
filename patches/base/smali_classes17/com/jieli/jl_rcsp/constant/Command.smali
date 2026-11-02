.class public Lcom/jieli/jl_rcsp/constant/Command;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CMD_ADV_DEVICE_NOTIFY:I = 0xc2

.field public static final CMD_ADV_DEV_REQUEST_OPERATION:I = 0xc4

.field public static final CMD_ADV_GET_INFO:I = 0xc1

.field public static final CMD_ADV_NOTIFY_SETTINGS:I = 0xc3

.field public static final CMD_ADV_SETTINGS:I = 0xc0

.field public static final CMD_AI_OPERATE:I = 0x32

.field public static final CMD_APP_PUSH_INFO_DATA_TO_DEVICE:I = 0xa1

.field public static final CMD_BATCH:I = 0x26

.field public static final CMD_CANCEL_LARGE_FILE_TRANSFER:I = 0x1e

.field public static final CMD_CUSTOM:I = 0xf0

.field public static final CMD_DATA:I = 0x1

.field public static final CMD_DATA_TRANSFER:I = 0x30

.field public static final CMD_DELETE_FILE_BY_NAME:I = 0x23

.field public static final CMD_DEVICE_PUSH_INFO_DATA_TO_APP:I = 0xa2

.field public static final CMD_DEVICE_PUSH_SENSOR_LOG_TO_APP:I = 0xa3

.field public static final CMD_DEV_PARAM_EXTEND:I = 0x27

.field public static final CMD_DISCONNECT_CLASSIC_BLUETOOTH:I = 0x6

.field public static final CMD_EXTERNAL_FLASH_IO_CTRL:I = 0x1a

.field public static final CMD_EXTRA_CUSTOM:I = 0xff

.field public static final CMD_FILE_BROWSE_DELETE:I = 0x1f

.field public static final CMD_FORMAT_DEVICE:I = 0x22

.field public static final CMD_FUNCTION:I = 0xe

.field public static final CMD_GET_DEVICE_CONFIG_INFO:I = 0xd9

.field public static final CMD_GET_DEV_MD5:I = 0xd4

.field public static final CMD_GET_EXTERNAL_FLASH_MSG:I = 0xd6

.field public static final CMD_GET_HEALTH_DATA:I = 0xa0

.field public static final CMD_GET_LOW_LATENCY_SETTINGS:I = 0xd5

.field public static final CMD_GET_SYS_INFO:I = 0x7

.field public static final CMD_GET_TARGET_FEATURE_MAP:I = 0x2

.field public static final CMD_GET_TARGET_INFO:I = 0x3

.field public static final CMD_HEALTH_SETTING:I = 0xa5

.field public static final CMD_LARGE_FILE_TRANSFER_GET_NAME:I = 0x20

.field public static final CMD_LARGE_FILE_TRANSFER_OP:I = 0x1d

.field public static final CMD_LRC_GET_START:I = 0xf

.field public static final CMD_LRC_GET_STOP:I = 0x10

.field public static final CMD_LRC_PUSH_START_TTS:I = 0x11

.field public static final CMD_NFC_OPERATION:I = 0xa4

.field public static final CMD_NOTIFY_DEVICE_APP_INFO:I = 0xd0

.field public static final CMD_NOTIFY_FILE_STRUCTURE_CHANGE:I = 0xf2

.field public static final CMD_NOTIFY_FILE_TRANSFER_OP:I = 0x18
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final CMD_NOTIFY_PREPARE_ENV:I = 0x21

.field public static final CMD_OTA_ENTER_UPDATE_MODE:I = 0xe3

.field public static final CMD_OTA_EXIT_UPDATE_MODE:I = 0xe4

.field public static final CMD_OTA_GET_DEVICE_REFRESH_FIRMWARE_STATUS:I = 0xe6

.field public static final CMD_OTA_GET_DEVICE_UPDATE_FILE_INFO_OFFSET:I = 0xe1

.field public static final CMD_OTA_INQUIRE_DEVICE_IF_CAN_UPDATE:I = 0xe2

.field public static final CMD_OTA_NOTIFY_UPDATE_CONTENT_SIZE:I = 0xe8

.field public static final CMD_OTA_SEND_FIRMWARE_UPDATE_BLOCK:I = 0xe5

.field public static final CMD_PHONE_CALL_REQUEST:I = 0xa

.field public static final CMD_PHONE_NUMBER_PLAY_MODE:I = 0xf1

.field public static final CMD_PUBLIC_SETTINGS:I = 0x33

.field public static final CMD_QUERY_CONNECTED_PHONE_BT_INFO:I = 0x31

.field public static final CMD_READ_ERROR_MSG:I = 0x29

.field public static final CMD_READ_FILE_FROM_DEVICE:I = 0x24

.field public static final CMD_REBOOT_DEVICE:I = 0xe7

.field public static final CMD_RECEIVE_SPEECH_CANCEL:I = 0xd2

.field public static final CMD_RECEIVE_SPEECH_START:I = 0x4

.field public static final CMD_RECEIVE_SPEECH_STOP:I = 0x5

.field public static final CMD_RTC_EXPAND:I = 0x25

.field public static final CMD_SEARCH_DEVICE:I = 0x19

.field public static final CMD_SETTINGS_COMMUNICATION_MTU:I = 0xd1

.field public static final CMD_SET_DEVICE_STORAGE:I = 0xd8

.field public static final CMD_SET_SYS_INFO:I = 0x8

.field public static final CMD_SMALL_FILE_TRANSFER:I = 0x28

.field public static final CMD_SPORTS_INFO_STATUS_SYNC:I = 0xa6

.field public static final CMD_START_FILE_BROWSE:I = 0xc

.field public static final CMD_START_FILE_TRANSFER:I = 0x16
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final CMD_START_LARGE_FILE_TRANSFER:I = 0x1b

.field public static final CMD_STOP_FILE_BROWSE:I = 0xd

.field public static final CMD_STOP_FILE_TRANSFER:I = 0x17
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final CMD_STOP_LARGE_FILE_TRANSFER:I = 0x1c

.field public static final CMD_SWITCH_DEVICE_REQUEST:I = 0xb

.field public static final CMD_SYS_INFO_AUTO_UPDATE:I = 0x9

.field public static a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/jieli/jl_rcsp/interfaces/cmd/ICmdHandler;",
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
            "Lcom/jieli/jl_rcsp/interfaces/cmd/ICmdHandler;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/DataCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/DataCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/GetTargetFeatureMapCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/GetTargetFeatureMapCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/GetTargetInfoCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/GetTargetInfoCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/DisconnectClassicBluetoothCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/DisconnectClassicBluetoothCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/SysInfoCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/SysInfoCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/SysInfoCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/SysInfoCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/SysInfoCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/SysInfoCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/PhoneCallRequestCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/PhoneCallRequestCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xb

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/NotifyCommunicationWayCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/NotifyCommunicationWayCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/FunctionCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/FunctionCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xe1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/OtaCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/OtaCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xe2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/OtaCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/OtaCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xe3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/OtaCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/OtaCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xe4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/OtaCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/OtaCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xe5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/OtaCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/OtaCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xe6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/OtaCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/OtaCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xe7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/OtaCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/OtaCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xe8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/OtaCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/OtaCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xd4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/GetDevMD5CmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/GetDevMD5CmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xd0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/NotifyAppInfoCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/NotifyAppInfoCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xd1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/SettingsMtuCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/SettingsMtuCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xf1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/NotifyPhoneNumberPlayModeCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/NotifyPhoneNumberPlayModeCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xd8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/SetDevStorageCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/SetDevStorageCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xd9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/GetDevConfigureCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/GetDevConfigureCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xf0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/RcspCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/RcspCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xff

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/CustomCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/CustomCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xd6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/ExternalFlashCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/ExternalFlashCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x1a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/ExternalFlashCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/ExternalFlashCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x1b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/LargeFileTransferCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/LargeFileTransferCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x1c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/LargeFileTransferCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/LargeFileTransferCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x1d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/LargeFileTransferCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/LargeFileTransferCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x20

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/LargeFileTransferCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/LargeFileTransferCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x1e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/LargeFileTransferCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/LargeFileTransferCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x21

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/LargeFileTransferCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/LargeFileTransferCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x16

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/FileTransferCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/FileTransferCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x17

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/FileTransferCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/FileTransferCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x18

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/FileTransferCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/FileTransferCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/FileBrowseCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/FileBrowseCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xd

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/FileBrowseCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/FileBrowseCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x1f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/FileBrowseCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/FileBrowseCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x23

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/FileBrowseCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/FileBrowseCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xf

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/LrcCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/LrcCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x10

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/LrcCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/LrcCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/LrcCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/LrcCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x22

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/FileBrowseCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/FileBrowseCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xf2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/FileBrowseCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/FileBrowseCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x24

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/ReadFileFromDeviceCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/ReadFileFromDeviceCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xa1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/HealthDataCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/HealthDataCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xa2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/HealthDataCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/HealthDataCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xa3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/HealthDataCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/HealthDataCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x25

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/AlarmExpandCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/AlarmExpandCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x26

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/BatchHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/BatchHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x27

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/DeviceExtendParamCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/DeviceExtendParamCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/SpeechCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/SpeechCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/SpeechCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/SpeechCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xd2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/SpeechCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/SpeechCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xd5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/GetLowLatencySettingsCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/GetLowLatencySettingsCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xc0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/TwsCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/TwsCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xc1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/TwsCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/TwsCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xc2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/TwsCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/TwsCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xc3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/TwsCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/TwsCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xc4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/TwsCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/TwsCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/SearchDevCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/SearchDevCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xa0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/HealthDataCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/HealthDataCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xa4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/NFCOperationCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/NFCOperationCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xa5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/HealthSettingCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/HealthSettingCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0xa6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/SportsInfoStatusCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/SportsInfoStatusCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x28

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/SmallFileTransferCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/SmallFileTransferCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x29

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/ReadErrorMsgCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/ReadErrorMsgCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x30

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/DataTransferCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/DataTransferCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x31

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/QueryPhoneBtInfoCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/QueryPhoneBtInfoCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x32

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/AiOperateCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/AiOperateCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    const/16 v1, 0x33

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/cmdHandler/PublicSettingsCmdHandler;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/cmdHandler/PublicSettingsCmdHandler;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object v0, Lcom/jieli/jl_rcsp/constant/Command;->a:Ljava/util/Map;

    return-object v0
.end method

.method public static isValidCmd(I)Z
    .locals 1

    invoke-static {}, Lcom/jieli/jl_rcsp/constant/Command;->getValidCommandList()Ljava/util/Map;

    move-result-object v0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
