.class Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->a()V
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
.field public final synthetic a:Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->a(Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;ILjava/lang/String;)V

    return-void
.end method

.method public onSuccess(Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse;)V
    .locals 1

    .line 2
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse;->getFiles()Ljava/util/List;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->a(Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask$1;->onSuccess(Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse;)V

    return-void
.end method
