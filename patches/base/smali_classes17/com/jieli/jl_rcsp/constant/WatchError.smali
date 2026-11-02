.class public Lcom/jieli/jl_rcsp/constant/WatchError;
.super Lcom/jieli/jl_rcsp/constant/RcspErrorCode;
.source "SourceFile"


# static fields
.field public static final ERR_CRC_CHECK:I = 0x3100

.field public static final ERR_DATA_OVER_LIMIT:I = 0x4203

.field public static final ERR_DEVICE_IN_CALLING:I = 0x3101

.field public static final ERR_FAT_BEGIN:I = 0x411b

.field public static final ERR_FAT_DENIED:I = 0x4107

.field public static final ERR_FAT_DISK:I = 0x4101

.field public static final ERR_FAT_END:I = 0x411c

.field public static final ERR_FAT_EXIST:I = 0x4108

.field public static final ERR_FAT_INIT:I = 0x4102

.field public static final ERR_FAT_INVALID_DRIVE:I = 0x410b

.field public static final ERR_FAT_INVALID_NAME:I = 0x4106

.field public static final ERR_FAT_INVALID_OBJECT:I = 0x4109

.field public static final ERR_FAT_INVALID_PARAMETER:I = 0x4113

.field public static final ERR_FAT_JNI_INIT:I = 0x4116

.field public static final ERR_FAT_LOCKED:I = 0x4110

.field public static final ERR_FAT_MKFS_ABORTED:I = 0x410e

.field public static final ERR_FAT_NOT_ENABLED:I = 0x410c

.field public static final ERR_FAT_NOT_ENOUGH_CORE:I = 0x4111

.field public static final ERR_FAT_NOT_READY:I = 0x4103

.field public static final ERR_FAT_NO_FILE:I = 0x4104

.field public static final ERR_FAT_NO_FILESYSTEM:I = 0x410d

.field public static final ERR_FAT_NO_PATH:I = 0x4105

.field public static final ERR_FAT_READ:I = 0x4118

.field public static final ERR_FAT_SYNC:I = 0x4119

.field public static final ERR_FAT_TIMEOUT:I = 0x410f

.field public static final ERR_FAT_TOO_BIG:I = 0x4114

.field public static final ERR_FAT_TOO_MANY_OPEN_FILES:I = 0x4112

.field public static final ERR_FAT_WRITE:I = 0x4117

.field public static final ERR_FAT_WRITE_PROTECTED:I = 0x410a

.field public static final ERR_FUNC_NOT_SUPPORT:I = 0x1101

.field public static final ERR_IN_PROGRESS:I = 0x1100

.field public static final ERR_NETWORK_OTA_FAILED:I = 0x5001

.field public static final ERR_NETWORK_OTA_TIMEOUT:I = 0x5002

.field public static final ERR_NETWORK_OTA_UNKNOWN:I = 0x5000

.field public static final ERR_NETWORK_OTA_WAITING_COMMAND_TIMEOUT:I = 0x5003

.field public static final ERR_OP_NOT_ALLOW:I = 0x3102

.field public static final ERR_RENAME_FILE:I = 0x4202

.field public static final ERR_SPACE_TO_UPDATE:I = 0x4201

.field public static final ERR_VERSION_NOT_MATCH:I = 0x4200


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/constant/RcspErrorCode;-><init>()V

    return-void
.end method

.method public static fatfsToWatchErr(I)I
    .locals 0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    return p0

    :pswitch_1
    const/16 p0, 0x411c

    return p0

    :pswitch_2
    const/16 p0, 0x411b

    return p0

    :pswitch_3
    const/16 p0, 0x4119

    return p0

    :pswitch_4
    const/16 p0, 0x4118

    return p0

    :pswitch_5
    const/16 p0, 0x4117

    return p0

    :pswitch_6
    const/16 p0, 0x4116

    return p0

    :pswitch_7
    const/16 p0, 0x4114

    return p0

    :pswitch_8
    const/16 p0, 0x4113

    return p0

    :pswitch_9
    const/16 p0, 0x4112

    return p0

    :pswitch_a
    const/16 p0, 0x4111

    return p0

    :pswitch_b
    const/16 p0, 0x4110

    return p0

    :pswitch_c
    const/16 p0, 0x410f

    return p0

    :pswitch_d
    const/16 p0, 0x410e

    return p0

    :pswitch_e
    const/16 p0, 0x410d

    return p0

    :pswitch_f
    const/16 p0, 0x410c

    return p0

    :pswitch_10
    const/16 p0, 0x410b

    return p0

    :pswitch_11
    const/16 p0, 0x410a

    return p0

    :pswitch_12
    const/16 p0, 0x4109

    return p0

    :pswitch_13
    const/16 p0, 0x4108

    return p0

    :pswitch_14
    const/16 p0, 0x4107

    return p0

    :pswitch_15
    const/16 p0, 0x4106

    return p0

    :pswitch_16
    const/16 p0, 0x4105

    return p0

    :pswitch_17
    const/16 p0, 0x4104

    return p0

    :pswitch_18
    const/16 p0, 0x4103

    return p0

    :pswitch_19
    const/16 p0, 0x4102

    return p0

    :pswitch_1a
    const/16 p0, 0x4101

    return p0

    :pswitch_1b
    const/4 p0, 0x0

    return p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static getErrorDesc(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_6

    const/16 v0, 0x1001

    if-eq p0, v0, :cond_5

    const/16 v0, 0x1002

    if-eq p0, v0, :cond_4

    const/16 v0, 0x1100

    if-eq p0, v0, :cond_3

    const/16 v0, 0x1101

    if-eq p0, v0, :cond_2

    const/16 v0, 0x411b

    if-eq p0, v0, :cond_1

    const/16 v0, 0x411c

    if-eq p0, v0, :cond_0

    sparse-switch p0, :sswitch_data_0

    packed-switch p0, :pswitch_data_0

    packed-switch p0, :pswitch_data_1

    packed-switch p0, :pswitch_data_2

    packed-switch p0, :pswitch_data_3

    packed-switch p0, :pswitch_data_4

    packed-switch p0, :pswitch_data_5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown Code : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_0
    const-string p0, "The data sent exceeds the limit."

    return-object p0

    :pswitch_1
    const-string p0, "Failed to rename the file."

    return-object p0

    :pswitch_2
    const-string p0, "Insufficient space to update multiple files."

    return-object p0

    :pswitch_3
    const-string p0, "File information does not match."

    return-object p0

    :pswitch_4
    const-string p0, "Sync data error."

    return-object p0

    :pswitch_5
    const-string p0, "Read data failed."

    return-object p0

    :pswitch_6
    const-string p0, "Write data failed."

    return-object p0

    :pswitch_7
    const-string p0, "Watch system has not been initialized."

    return-object p0

    :pswitch_8
    const-string p0, "IO Exception."

    return-object p0

    :pswitch_9
    const-string p0, "Directory hierarchy is too deep."

    return-object p0

    :pswitch_a
    const-string p0, "Missing file data."

    return-object p0

    :pswitch_b
    const-string p0, "File data is loaded."

    return-object p0

    :pswitch_c
    const-string p0, "File browsing."

    return-object p0

    :pswitch_d
    const-string p0, "Storage offline."

    return-object p0

    :pswitch_e
    const-string p0, "The operation is not allowed."

    return-object p0

    :pswitch_f
    const-string p0, "The device is in calling."

    return-object p0

    :pswitch_10
    const-string p0, "CRC is error."

    return-object p0

    :pswitch_11
    const-string p0, "Device returns a failure result."

    return-object p0

    :pswitch_12
    const-string p0, "Device returns a failed state."

    return-object p0

    :pswitch_13
    const-string p0, "System is busy."

    return-object p0

    :pswitch_14
    const-string p0, "Waiting for a reply packet timed out."

    return-object p0

    :pswitch_15
    const-string p0, "Failed to parse RCSP data."

    return-object p0

    :pswitch_16
    const-string p0, "Command sending failed."

    return-object p0

    :pswitch_17
    const-string p0, "Failed to auth device."

    return-object p0

    :pswitch_18
    const-string p0, "Failed to use system reflection function."

    return-object p0

    :pswitch_19
    const-string p0, "The device is not the same as the device in use."

    return-object p0

    :pswitch_1a
    const-string p0, "The remote device is not connected."

    return-object p0

    :sswitch_0
    const-string p0, "Network module timeout waiting for upgrade command."

    return-object p0

    :sswitch_1
    const-string p0, "Network module upgrade timeout."

    return-object p0

    :sswitch_2
    const-string p0, "Network module upgrade failed."

    return-object p0

    :sswitch_3
    const-string p0, "Undefined upgrade error code."

    return-object p0

    :sswitch_4
    const-string p0, "Image size to big, do not to support big size image."

    return-object p0

    :sswitch_5
    const-string p0, "Given parameter is invalid"

    return-object p0

    :sswitch_6
    const-string p0, "Number of open files > FF_FS_LOCK."

    return-object p0

    :sswitch_7
    const-string p0, "LFN working buffer could not be allocated."

    return-object p0

    :sswitch_8
    const-string p0, "The operation is rejected according to the file sharing policy."

    return-object p0

    :sswitch_9
    const-string p0, "Could not get a grant to access the volume within defined period."

    return-object p0

    :sswitch_a
    const-string p0, "The f_mkfs() aborted due to any problem."

    return-object p0

    :sswitch_b
    const-string p0, "There is no valid FAT volume."

    return-object p0

    :sswitch_c
    const-string p0, "The volume has no work area."

    return-object p0

    :sswitch_d
    const-string p0, "The logical drive number is invalid."

    return-object p0

    :sswitch_e
    const-string p0, "The physical drive is write protected."

    return-object p0

    :sswitch_f
    const-string p0, "The file/directory object is invalid."

    return-object p0

    :sswitch_10
    const-string p0, "Access denied due to prohibited access."

    return-object p0

    :sswitch_11
    const-string p0, "Access denied due to prohibited access or directory full."

    return-object p0

    :sswitch_12
    const-string p0, "The path name format is invalid."

    return-object p0

    :sswitch_13
    const-string p0, "Could not find the path."

    return-object p0

    :sswitch_14
    const-string p0, "Could not find the file."

    return-object p0

    :sswitch_15
    const-string p0, "The physical drive cannot work."

    return-object p0

    :sswitch_16
    const-string p0, "Assertion failed."

    return-object p0

    :sswitch_17
    const-string p0, "A hard error occurred in the low level disk I/O layer."

    return-object p0

    :cond_0
    const-string p0, "Process end error."

    return-object p0

    :cond_1
    const-string p0, "Process start error."

    return-object p0

    :cond_2
    const-string p0, "Feature not supported."

    return-object p0

    :cond_3
    const-string p0, "Task is in progress."

    return-object p0

    :cond_4
    const-string p0, "Cancel Operation."

    return-object p0

    :cond_5
    const-string p0, "Invalid Parameter."

    return-object p0

    :cond_6
    :sswitch_18
    const-string p0, "Success"

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_18
        0x4101 -> :sswitch_17
        0x4102 -> :sswitch_16
        0x4103 -> :sswitch_15
        0x4104 -> :sswitch_14
        0x4105 -> :sswitch_13
        0x4106 -> :sswitch_12
        0x4107 -> :sswitch_11
        0x4108 -> :sswitch_10
        0x4109 -> :sswitch_f
        0x410a -> :sswitch_e
        0x410b -> :sswitch_d
        0x410c -> :sswitch_c
        0x410d -> :sswitch_b
        0x410e -> :sswitch_a
        0x410f -> :sswitch_9
        0x4110 -> :sswitch_8
        0x4111 -> :sswitch_7
        0x4112 -> :sswitch_6
        0x4113 -> :sswitch_5
        0x4114 -> :sswitch_4
        0x5000 -> :sswitch_3
        0x5001 -> :sswitch_2
        0x5002 -> :sswitch_1
        0x5003 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x2000
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3000
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x3100
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x4000
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x4116
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x4200
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
