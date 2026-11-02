.class public Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithClusterParam;
.super Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StartWithClusterParam"
.end annotation


# instance fields
.field public cluster:I

.field public devHandler:I

.field public offset:I


# direct methods
.method public constructor <init>(III)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;-><init>(B)V

    iput p2, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithClusterParam;->offset:I

    iput p3, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithClusterParam;->cluster:I

    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithClusterParam;->devHandler:I

    return-void
.end method


# virtual methods
.method public getParamData()[B
    .locals 3

    const/16 v0, 0xd

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;->op:B

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget v2, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithClusterParam;->devHandler:I

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget v2, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithClusterParam;->offset:I

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget v2, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithClusterParam;->cluster:I

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StartWithClusterParam{op="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;->op:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithClusterParam;->offset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", cluster="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithClusterParam;->cluster:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
