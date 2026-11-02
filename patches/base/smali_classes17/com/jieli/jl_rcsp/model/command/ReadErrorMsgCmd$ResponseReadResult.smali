.class public Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ResponseReadResult;
.super Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ResponseReadResult"
.end annotation


# instance fields
.field private crc:S

.field private size:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;-><init>()V

    return-void
.end method


# virtual methods
.method public getCrc()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ResponseReadResult;->crc:S

    return v0
.end method

.method public getParamData()[B
    .locals 2

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ResponseReadResult;->size:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget-short v1, p0, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ResponseReadResult;->crc:S

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->shortToBigBytes(S)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public getSize()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ResponseReadResult;->size:I

    return v0
.end method

.method public setCrc(S)V
    .locals 0

    iput-short p1, p0, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ResponseReadResult;->crc:S

    return-void
.end method

.method public setSize(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ResponseReadResult;->size:I

    return-void
.end method
