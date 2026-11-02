.class Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;->start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
        "Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;->b(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;ILjava/lang/String;)V

    return-void
.end method

.method public onSuccess(Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse;)V
    .locals 5

    .line 2
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse;->getFiles()Ljava/util/List;

    move-result-object p1

    .line 3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 4
    new-array p1, v1, [B

    .line 5
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;->a(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;S[B)V

    .line 6
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;->a(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;)V

    return-void

    .line 7
    :cond_0
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;

    .line 8
    new-instance v0, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;

    iget-short v2, p1, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;->id:S

    iget v3, p1, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;->size:I

    const/4 v4, 0x1

    invoke-direct {v0, v4, v2, v3, v1}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;-><init>(BSII)V

    .line 9
    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;

    new-instance v2, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;

    iget-object v3, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;

    invoke-static {v3}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;->c(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask$Param;)V

    invoke-static {v1, v2}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;->a(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;)Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;

    .line 10
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;->b(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;)Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;

    move-result-object v0

    new-instance v1, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1$1;

    invoke-direct {v1, p0, p1}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1$1;-><init>(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;)V

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/task/TaskBase;->setListener(Lcom/jieli/jl_rcsp/task/TaskListener;)V

    .line 11
    iget-object p1, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;->b(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;)Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->start()V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;->onSuccess(Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse;)V

    return-void
.end method
