.class public Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask;
.super Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask$Param;
    }
.end annotation


# instance fields
.field public final d:Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask$Param;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask$Param;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;)V

    iput-object p2, p0, Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask;->d:Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask$Param;

    new-instance p1, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$File;

    iget-byte v0, p2, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->type:B

    invoke-static {p2}, Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask$Param;->a(Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask$Param;)S

    move-result v1

    iget p2, p2, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->size:I

    invoke-direct {p1, v0, v1, p2}, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$File;-><init>(BSI)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->c:Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$File;

    return-void
.end method


# virtual methods
.method public a(SS[BS)Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$Param;
    .locals 7

    new-instance v0, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$UpdateFileParam;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask;->d:Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask$Param;

    move-object v2, v1

    iget-byte v1, v2, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;->type:B

    invoke-static {v2}, Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask$Param;->a(Lcom/jieli/jl_rcsp/task/smallfile/UpdateFileTask$Param;)S

    move-result v2

    move v3, p1

    move v4, p2

    move-object v5, p3

    move v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$UpdateFileParam;-><init>(BSSS[BS)V

    return-object v0
.end method
