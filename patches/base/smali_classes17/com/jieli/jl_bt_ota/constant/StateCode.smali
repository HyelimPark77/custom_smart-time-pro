.class public Lcom/jieli/jl_bt_ota/constant/StateCode;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CONNECTION_CONNECTED:I = 0x4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final CONNECTION_CONNECTING:I = 0x3

.field public static final CONNECTION_DISCONNECT:I = 0x0

.field public static final CONNECTION_FAILED:I = 0x2

.field public static final CONNECTION_OK:I = 0x1

.field public static final RESULT_CAN_UPDATE:I = 0x0

.field public static final RESULT_DEVICE_IN_DOUBLE_CONNECTION:I = 0x7

.field public static final RESULT_DEVICE_LOW_VOLTAGE_EQUIPMENT:I = 0x1

.field public static final RESULT_FAIL:I = 0x1

.field public static final RESULT_FIRMWARE_INFO_ERROR:I = 0x2

.field public static final RESULT_FIRMWARE_VERSION_NO_CHANGE:I = 0x3

.field public static final RESULT_HEADSET_NOT_IN_CHARGING_BIN:I = 0x5

.field public static final RESULT_OK:I = 0x0

.field public static final RESULT_OTA_IN_PROGRESS:I = 0x6

.field public static final RESULT_TWS_NOT_CONNECT:I = 0x4

.field public static final STATUS_ALL_DATA_CRC_ERROR:I = 0x6

.field public static final STATUS_BUSY:I = 0x3

.field public static final STATUS_CRC_ERROR:I = 0x5

.field public static final STATUS_FAIL:I = 0x1

.field public static final STATUS_NO_RESOURCE:I = 0x4

.field public static final STATUS_PARAMETER_ERROR:I = 0x7

.field public static final STATUS_RESPONSE_DATA_OVER_LIMIT:I = 0x8

.field public static final STATUS_SUCCESS:I = 0x0

.field public static final STATUS_UNKNOWN_CMD:I = 0x2

.field public static final UPGRADE_RESULT_CMD_TIMEOUT:I = 0x8

.field public static final UPGRADE_RESULT_COMPLETE:I = 0x0

.field public static final UPGRADE_RESULT_DATA_CHECK_ERROR:I = 0x1

.field public static final UPGRADE_RESULT_DOWNLOAD_BOOT_LOADER_SUCCESS:I = 0x80

.field public static final UPGRADE_RESULT_ENCRYPTED_KEY_NOT_MATCH:I = 0x3

.field public static final UPGRADE_RESULT_ERROR_LENGTH:I = 0x6

.field public static final UPGRADE_RESULT_FAIL:I = 0x2

.field public static final UPGRADE_RESULT_FLASH_READ:I = 0x7

.field public static final UPGRADE_RESULT_NEED_UPDATE_RESOURCE:I = 0xfe

.field public static final UPGRADE_RESULT_SAME_FILE:I = 0x9

.field public static final UPGRADE_RESULT_UPGRADE_FILE_ERROR:I = 0x4

.field public static final UPGRADE_RESULT_UPGRADE_TYPE_ERROR:I = 0x5


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static printConnectionState(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v1, "UNKNOWN STATE(%d)"

    invoke-static {v0, v1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "CONNECTION_CONNECTED(4)"

    return-object p0

    :cond_1
    const-string p0, "CONNECTION_CONNECTING(3)"

    return-object p0

    :cond_2
    const-string p0, "CONNECTION_FAILED(2)"

    return-object p0

    :cond_3
    const-string p0, "CONNECTION_OK(1)"

    return-object p0

    :cond_4
    const-string p0, "CONNECTION_DISCONNECT(0)"

    return-object p0
.end method

.method public static printStatusCode(I)Ljava/lang/String;
    .locals 2

    packed-switch p0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UNKNOWN STATUS : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_0
    const-string p0, "STATUS_RESPONSE_DATA_OVER_LIMIT(8)"

    return-object p0

    :pswitch_1
    const-string p0, "STATUS_PARAMETER_ERROR(7)"

    return-object p0

    :pswitch_2
    const-string p0, "STATUS_ALL_DATA_CRC_ERROR(6)"

    return-object p0

    :pswitch_3
    const-string p0, "STATUS_CRC_ERROR(5)"

    return-object p0

    :pswitch_4
    const-string p0, "STATUS_NO_RESOURCE(4)"

    return-object p0

    :pswitch_5
    const-string p0, "STATUS_BUSY(3)"

    return-object p0

    :pswitch_6
    const-string p0, "STATUS_UNKNOWN_COMMAND(2)"

    return-object p0

    :pswitch_7
    const-string p0, "STATUS_FAIL(1)"

    return-object p0

    :pswitch_8
    const-string p0, "STATUS_SUCCESS(0)"

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
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
