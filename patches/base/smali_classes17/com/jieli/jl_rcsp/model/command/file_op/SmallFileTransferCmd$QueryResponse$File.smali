.class public Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "File"
.end annotation


# instance fields
.field public id:S

.field public size:I

.field public type:B


# direct methods
.method public constructor <init>(BSI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;->type:B

    iput-short p2, p0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;->id:S

    iput p3, p0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;->size:I

    return-void
.end method
