.class public Lcom/jieli/jl_rcsp/constant/RcspErrorCode;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ERR_AUTH_DEVICE:I = 0x2003

.field public static final ERR_CANCEL_OP:I = 0x1002

.field public static final ERR_CMD_SEND:I = 0x3000

.field public static final ERR_DATA_LOAD_COMPLETE:I = 0x4002

.field public static final ERR_DEVICE_NOT_MATCH:I = 0x2001

.field public static final ERR_DIR_TOO_DEEP:I = 0x4004

.field public static final ERR_FILE_BROWSING:I = 0x4001

.field public static final ERR_FILE_NOT_IN_STORAGE:I = 0x4006

.field public static final ERR_INVALID_PARAMETER:I = 0x1001

.field public static final ERR_IO_EXCEPTION:I = 0x4005

.field public static final ERR_MISSING_FILE_DATA:I = 0x4003

.field public static final ERR_NONE:I = 0x0

.field public static final ERR_OPERATION_TIMEOUT:I = 0x1003

.field public static final ERR_PARSE_DATA:I = 0x3001

.field public static final ERR_REMOTE_NOT_CONNECT:I = 0x2000

.field public static final ERR_RESPONSE_BAD_RESULT:I = 0x3005

.field public static final ERR_RESPONSE_BAD_STATUS:I = 0x3004

.field public static final ERR_RESPONSE_TIMEOUT:I = 0x3002

.field public static final ERR_STORAGE_OFFLINE:I = 0x4000

.field public static final ERR_SYSTEM_BUSY:I = 0x3003

.field public static final ERR_USE_SYSTEM_API:I = 0x2002


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static buildJsonError(IIILjava/lang/String;)Lcom/jieli/jl_rcsp/model/base/BaseError;
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/base/CmdError;

    invoke-direct {v0, p0, p1, p2}, Lcom/jieli/jl_rcsp/model/base/CmdError;-><init>(III)V

    invoke-static {p1}, Lcom/jieli/jl_rcsp/constant/RcspErrorCode;->getErrorDesc(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/jieli/jl_rcsp/model/base/CmdError;->setDesc(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Lcom/jieli/jl_rcsp/model/base/CmdError;->setSubDesc(Ljava/lang/String;)V

    new-instance p0, Lcom/jieli/jl_rcsp/model/base/BaseError;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/CmdError;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    return-object p0
.end method

.method public static getErrorDesc(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_0

    packed-switch p0, :pswitch_data_0

    packed-switch p0, :pswitch_data_1

    packed-switch p0, :pswitch_data_2

    packed-switch p0, :pswitch_data_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown Code : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_0
    const-string p0, "File does not match storage"

    return-object p0

    :pswitch_1
    const-string p0, "IO Exception."

    return-object p0

    :pswitch_2
    const-string p0, "Directory hierarchy is too deep."

    return-object p0

    :pswitch_3
    const-string p0, "Missing file data."

    return-object p0

    :pswitch_4
    const-string p0, "File data is loaded."

    return-object p0

    :pswitch_5
    const-string p0, "File browsing."

    return-object p0

    :pswitch_6
    const-string p0, "Storage offline."

    return-object p0

    :pswitch_7
    const-string p0, "Device returns a failure result."

    return-object p0

    :pswitch_8
    const-string p0, "Device returns a failed state."

    return-object p0

    :pswitch_9
    const-string p0, "System is busy."

    return-object p0

    :pswitch_a
    const-string p0, "Waiting for a reply packet timed out."

    return-object p0

    :pswitch_b
    const-string p0, "Failed to parse RCSP data."

    return-object p0

    :pswitch_c
    const-string p0, "Command sending failed."

    return-object p0

    :pswitch_d
    const-string p0, "Failed to auth device."

    return-object p0

    :pswitch_e
    const-string p0, "Failed to use system reflection function."

    return-object p0

    :pswitch_f
    const-string p0, "The device is not the same as the device in use."

    return-object p0

    :pswitch_10
    const-string p0, "The remote device is not connected."

    return-object p0

    :pswitch_11
    const-string p0, "Operation timeout."

    return-object p0

    :pswitch_12
    const-string p0, "Cancel Operation."

    return-object p0

    :pswitch_13
    const-string p0, "Invalid Parameter."

    return-object p0

    :cond_0
    const-string p0, "Success"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1001
        :pswitch_13
        :pswitch_12
        :pswitch_11
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2000
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x3000
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x4000
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
