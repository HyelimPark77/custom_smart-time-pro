.class Lcom/jieli/jl_rcsp/tool/SyncMessageTask$4;
.super Lcom/jieli/jl_rcsp/task/SimpleTaskListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->b(Lcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/model/NotificationMsg;

.field public final synthetic b:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;

.field public final synthetic c:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

.field public final synthetic d:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;Lcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$4;->d:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$4;->a:Lcom/jieli/jl_rcsp/model/NotificationMsg;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$4;->b:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;

    iput-object p4, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$4;->c:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/task/SimpleTaskListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(I)V
    .locals 4

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$4;->d:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;Z)Z

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$4;->d:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$4;->c:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "User cancel. reason : "

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

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$4;->d:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;Z)Z

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$4;->d:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$4;->c:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    invoke-direct {v1, p1, p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void
.end method

.method public onFinish()V
    .locals 4

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$4;->d:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$4;->a:Lcom/jieli/jl_rcsp/model/NotificationMsg;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/NotificationMsg;->getAppName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$4;->a:Lcom/jieli/jl_rcsp/model/NotificationMsg;

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/NotificationMsg;->getTime()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$4;->b:Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->getFile()Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$File;

    move-result-object v2

    iget-short v2, v2, Lcom/jieli/jl_rcsp/task/smallfile/QueryFileTask$File;->id:S

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;Ljava/lang/String;S)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$4;->d:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;Z)Z

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$4;->d:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$4;->c:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    if-eqz v0, :cond_0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
