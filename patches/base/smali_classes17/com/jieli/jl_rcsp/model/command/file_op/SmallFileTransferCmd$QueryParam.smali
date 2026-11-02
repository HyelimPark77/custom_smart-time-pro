.class public Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryParam;
.super Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "QueryParam"
.end annotation


# direct methods
.method public constructor <init>(B)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    invoke-direct {p0, v1, v0}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;-><init>(B[B)V

    return-void
.end method
