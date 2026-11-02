.class public Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$DevParam;
.super Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Param;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DevParam"
.end annotation


# instance fields
.field private dev:I


# direct methods
.method public constructor <init>(BI)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Param;-><init>(B)V

    .line 3
    iput p2, p0, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$DevParam;->dev:I

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Param;-><init>([B)V

    return-void
.end method


# virtual methods
.method public getDev()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$DevParam;->dev:I

    return v0
.end method

.method public parse([B)I
    .locals 3

    invoke-super {p0, p1}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Param;->parse([B)I

    move-result v0

    if-eqz v0, :cond_1

    add-int/lit8 v1, v0, 0x4

    array-length v2, p1

    if-le v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x4

    invoke-static {p1, v0, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$DevParam;->dev:I

    return v1

    :cond_1
    :goto_0
    return v0
.end method

.method public toData()[B
    .locals 2

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    invoke-super {p0}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Param;->toData()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$DevParam;->dev:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

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

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DevParam{op="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Param;->getOp()B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", dev="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$DevParam;->dev:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "} "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
