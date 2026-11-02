.class Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask$3;
.super Lcom/jieli/jl_rcsp/task/SimpleTaskListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask$3;->a:Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/task/SimpleTaskListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(I)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask$3;->a:Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->b(Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;I)V

    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask$3;->a:Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;

    invoke-static {v0, p1, p2}, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->b(Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;ILjava/lang/String;)V

    return-void
.end method

.method public onFinish()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask$3;->a:Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->a(Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;)V

    return-void
.end method

.method public onProgress(I)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask$3;->a:Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;->a(Lcom/jieli/jl_rcsp/task/contacts/UpdateContactsBySmallFileTask;I)V

    return-void
.end method
