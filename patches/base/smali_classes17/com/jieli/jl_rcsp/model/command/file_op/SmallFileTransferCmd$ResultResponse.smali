.class public Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ResultResponse;
.super Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Response;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ResultResponse"
.end annotation


# instance fields
.field public ret:B


# direct methods
.method public constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Response;-><init>()V

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$ResultResponse;->ret:B

    return-void
.end method
