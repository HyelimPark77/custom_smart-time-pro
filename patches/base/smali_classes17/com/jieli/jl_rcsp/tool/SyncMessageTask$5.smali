.class Lcom/jieli/jl_rcsp/tool/SyncMessageTask$5;
.super Lcom/jieli/jl_rcsp/task/SimpleTaskListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->d(Lcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

.field public final synthetic c:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$5;->c:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$5;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$5;->b:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/task/SimpleTaskListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(I)V
    .locals 4

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$5;->c:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;Z)Z

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$5;->c:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$5;->b:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cancel operation. reason : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 v2, 0x1002

    invoke-direct {v1, v2, p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$5;->c:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;Z)Z

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$5;->c:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$5;->b:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    invoke-direct {v1, p1, p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void
.end method

.method public onFinish()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$5;->c:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$5;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$5;->c:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;Z)Z

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$5;->c:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$5;->b:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    if-eqz v0, :cond_0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
