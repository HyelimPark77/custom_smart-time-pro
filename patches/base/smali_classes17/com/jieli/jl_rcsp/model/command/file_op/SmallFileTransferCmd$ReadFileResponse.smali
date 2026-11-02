.class public Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ReadFileResponse;
.super Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Response;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ReadFileResponse"
.end annotation


# instance fields
.field public crc:S

.field public fileData:[B

.field public ret:B


# direct methods
.method public constructor <init>([B)V
    .locals 4

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Response;-><init>()V

    const/4 v0, 0x0

    aget-byte v1, p1, v0

    iput-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ReadFileResponse;->ret:B

    if-nez v1, :cond_0

    array-length v1, p1

    const/4 v2, 0x3

    sub-int/2addr v1, v2

    new-array v1, v1, [B

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ReadFileResponse;->fileData:[B

    const/4 v1, 0x1

    aget-byte v1, p1, v1

    const/4 v3, 0x2

    aget-byte v3, p1, v3

    invoke-static {v1, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result v1

    iput-short v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ReadFileResponse;->crc:S

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ReadFileResponse;->fileData:[B

    array-length v3, v1

    invoke-static {p1, v2, v1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_0
    return-void
.end method
