.class Lcom/jieli/jl_rcsp/tool/SyncMessageTask$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(I[BLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

.field public final synthetic b:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$2;->b:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$2;->a:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 3

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onFailed ---> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "pushMessageInfo"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$2;->b:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;Z)Z

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$2;->b:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$2;->a:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void
.end method

.method public onSuccess(Ljava/lang/Boolean;)V
    .locals 3

    .line 2
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "pushMessageInfo"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$2;->b:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;Z)Z

    .line 4
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$2;->b:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;)V

    .line 5
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$2;->a:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    if-eqz p1, :cond_0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$2;->onSuccess(Ljava/lang/Boolean;)V

    return-void
.end method
