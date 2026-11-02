.class Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1$1;
.super Lcom/jieli/jl_rcsp/task/SimpleTaskListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;->onSuccess(Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;

.field public final synthetic b:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1$1;->b:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1$1;->a:Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/task/SimpleTaskListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(I)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1$1;->b:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;->b(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;I)V

    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1$1;->b:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;

    invoke-static {v0, p1, p2}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;->a(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;ILjava/lang/String;)V

    return-void
.end method

.method public onFinish()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1$1;->b:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;->b(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;)Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/task/smallfile/ReadFileTask;->getReadData()[B

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1$1;->b:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;

    iget-object v1, v1, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1$1;->a:Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;

    iget-short v2, v2, Lcom/jieli/jl_rcsp/model/command/file_op/SmallFileTransferCmd$QueryResponse$File;->id:S

    invoke-static {v1, v2, v0}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;->a(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;S[B)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1$1;->b:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;->d(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;)V

    return-void
.end method

.method public onProgress(I)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1$1;->b:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask$1;->a:Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;->a(Lcom/jieli/jl_rcsp/task/contacts/ReadContactsBySmallFileTask;I)V

    return-void
.end method
