.class public Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# instance fields
.field public data:[B

.field public op:B


# direct methods
.method public constructor <init>(B[B)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;->op:B

    iput-object p2, p0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;->data:[B

    return-void
.end method


# virtual methods
.method public getParamData()[B
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;->data:[B

    array-length v0, v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;->op:B

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;->data:[B

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    return-object v0
.end method
