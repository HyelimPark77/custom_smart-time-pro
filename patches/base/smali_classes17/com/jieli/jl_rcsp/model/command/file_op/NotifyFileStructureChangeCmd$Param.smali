.class public Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/cmd/IDataOp;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# instance fields
.field private cluster:I

.field private devHandle:I

.field private filePath:Ljava/lang/String;

.field private op:I


# direct methods
.method public constructor <init>(IIILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    .line 2
    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->devHandle:I

    .line 3
    iput p2, p0, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->op:I

    .line 4
    iput p3, p0, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->cluster:I

    .line 5
    iput-object p4, p0, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->filePath:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    .line 7
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->parse([B)I

    return-void
.end method


# virtual methods
.method public getCluster()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->cluster:I

    return v0
.end method

.method public getDevHandle()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->devHandle:I

    return v0
.end method

.method public getFilePath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->filePath:Ljava/lang/String;

    return-object v0
.end method

.method public getOp()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->op:I

    return v0
.end method

.method public getParamData()[B
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->toData()[B

    move-result-object v0

    return-object v0
.end method

.method public parse([B)I
    .locals 3

    const-string v0, ""

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->filePath:Ljava/lang/String;

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    array-length v1, p1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    array-length v1, p1

    const/16 v2, 0xb

    if-ge v1, v2, :cond_1

    return v0

    :cond_1
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->devHandle:I

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->op:I

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->cluster:I

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-lez v0, :cond_2

    :try_start_0
    new-array v0, v0, [B

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->filePath:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    :cond_3
    :goto_1
    return v0
.end method

.method public toData()[B
    .locals 3

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->devHandle:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->op:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->cluster:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->filePath:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    :goto_0
    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/OutputStream;->write([B)V

    if-lez v1, :cond_1

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/NotifyFileStructureChangeCmd$Param;->filePath:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_1
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method
