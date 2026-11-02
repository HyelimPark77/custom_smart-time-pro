.class public Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$AddFileResponse;
.super Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ResultResponse;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AddFileResponse"
.end annotation


# instance fields
.field public id:S


# direct methods
.method public constructor <init>([B)V
    .locals 2

    const/4 v0, 0x0

    aget-byte v0, p1, v0

    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ResultResponse;-><init>(B)V

    array-length v0, p1

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    aget-byte v0, p1, v0

    const/4 v1, 0x2

    aget-byte p1, p1, v1

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result p1

    iput-short p1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$AddFileResponse;->id:S

    :cond_0
    return-void
.end method
