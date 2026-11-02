.class public Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$DeleteFileParam;
.super Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DeleteFileParam"
.end annotation


# direct methods
.method public constructor <init>(BS)V
    .locals 1

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    const/4 p2, 0x4

    invoke-direct {p0, p2, p1}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;-><init>(B[B)V

    return-void
.end method
