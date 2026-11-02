.class public Lcom/jieli/jl_audio_decode/constant/DecodeConstant;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final DATA_TYPE_OPUS:I = 0x2

.field public static final DATA_TYPE_PCM:I = 0x0

.field public static final DATA_TYPE_SPX:I = 0x1

.field public static final JL_OPUS_LIB:Ljava/lang/String; = "jl_opus"

.field public static final JL_SPEEX_LIB:Ljava/lang/String; = "jl_speex"

.field public static final STATE_ERROR:I = 0x2

.field public static final STATE_IDLE:I = 0x0

.field public static final STATE_WORKING:I = 0x1

.field public static final TYPE_DECODE_FILE:I = 0x1

.field public static final TYPE_DECODE_STREAM:I = 0x3

.field public static final TYPE_ENCODE_FILE:I = 0x2

.field public static final TYPE_ENCODE_STREAM:I = 0x4

.field public static final TYPE_TRANSCODING_OGG_FILE:I = 0x5

.field public static final TYPE_TRANSCODING_OGG_STREAM:I = 0x6


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getLibVersionCode()I
    .locals 1

    const/16 v0, 0x4e2c

    return v0
.end method

.method public static getLibVersionName()Ljava/lang/String;
    .locals 1

    :try_start_0
    const-string v0, "2.1.0"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const-string v0, "0.0.0"

    return-object v0
.end method
