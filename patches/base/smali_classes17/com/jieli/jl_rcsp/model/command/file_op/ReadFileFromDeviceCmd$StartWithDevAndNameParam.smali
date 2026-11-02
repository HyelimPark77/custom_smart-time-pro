.class public Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithDevAndNameParam;
.super Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StartWithDevAndNameParam"
.end annotation


# instance fields
.field public devHandler:I

.field public name:Ljava/lang/String;

.field public offset:I

.field public unicode:Z


# direct methods
.method public constructor <init>(IILjava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;-><init>(B)V

    iput p2, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithDevAndNameParam;->offset:I

    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithDevAndNameParam;->devHandler:I

    iput-object p3, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithDevAndNameParam;->name:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithDevAndNameParam;->unicode:Z

    return-void
.end method


# virtual methods
.method public getParamData()[B
    .locals 4

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithDevAndNameParam;->name:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithDevAndNameParam;->unicode:Z

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;->getNameData(Ljava/lang/String;Z)[B

    move-result-object v0

    array-length v1, v0

    add-int/lit8 v1, v1, 0xa

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-byte v2, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$Param;->op:B

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v2

    iget v3, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithDevAndNameParam;->devHandler:I

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    iget v3, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithDevAndNameParam;->offset:I

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    array-length v3, v0

    int-to-byte v3, v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StartWithNameParam{offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithDevAndNameParam;->offset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", name=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithDevAndNameParam;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", unicode=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/jieli/jl_rcsp/model/command/file_op/ReadFileFromDeviceCmd$StartWithDevAndNameParam;->unicode:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
