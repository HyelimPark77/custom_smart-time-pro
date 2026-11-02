.class public Lcom/jieli/jl_audio_decode/constant/ErrorCode;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ERR_ALLOC_FAIL:I = -0x7

.field public static final ERR_BAD_ARGS:I = -0x1

.field public static final ERR_BUFFER_TOO_SMALL:I = -0x2

.field public static final ERR_ENC_FAILURE:I = -0x81

.field public static final ERR_FILE_NOT_EXIST:I = -0x3ea

.field public static final ERR_INTERNAL_ERROR:I = -0x3

.field public static final ERR_INVALID_PACKET:I = -0x4

.field public static final ERR_INVALID_STATE:I = -0x6

.field public static final ERR_IN_PROCESS:I = -0x3eb

.field public static final ERR_IO_EXCEPTION:I = -0x7d0

.field public static final ERR_NONE:I = 0x0

.field public static final ERR_NONE_INIT:I = -0x3e8

.field public static final ERR_NOT_SUPPORT_FUNCTION:I = -0x3e9

.field public static final ERR_OPEN_FILE:I = -0x82

.field public static final ERR_OP_FAIL:I = -0x3ec

.field public static final ERR_OUTPUT_EXCEPTION:I = -0x80

.field public static final ERR_UNIMPLEMENTED:I = -0x5


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getErrorMsg(I)Ljava/lang/String;
    .locals 2

    const/16 v0, -0x7d0

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    packed-switch p0, :pswitch_data_1

    packed-switch p0, :pswitch_data_2

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v1, "Unknown Error(%d)"

    invoke-static {v0, v1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_0
    const-string p0, "Success"

    return-object p0

    :pswitch_1
    const-string p0, "Invalid Argument"

    return-object p0

    :pswitch_2
    const-string p0, "Buffer too small"

    return-object p0

    :pswitch_3
    const-string p0, "Internal error"

    return-object p0

    :pswitch_4
    const-string p0, "Corrupted stream"

    return-object p0

    :pswitch_5
    const-string p0, "Request not implemented"

    return-object p0

    :pswitch_6
    const-string p0, "Invalid state"

    return-object p0

    :pswitch_7
    const-string p0, "Memory allocation failed"

    return-object p0

    :pswitch_8
    const-string p0, "Abnormal output data"

    return-object p0

    :pswitch_9
    const-string p0, "Encoding failed"

    return-object p0

    :pswitch_a
    const-string p0, "Failed to open file."

    return-object p0

    :pswitch_b
    const-string p0, "Not initialized"

    return-object p0

    :pswitch_c
    const-string p0, "Function not supported"

    return-object p0

    :pswitch_d
    const-string p0, "File does not exist"

    return-object p0

    :pswitch_e
    const-string p0, "Operation in progress"

    return-object p0

    :pswitch_f
    const-string p0, "Operation Failed"

    return-object p0

    :cond_0
    const-string p0, "IO exception"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch -0x3ec
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x82
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch

    :pswitch_data_2
    .packed-switch -0x7
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
