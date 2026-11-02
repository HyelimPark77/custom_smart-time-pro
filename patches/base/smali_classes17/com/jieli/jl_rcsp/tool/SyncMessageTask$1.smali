.class Lcom/jieli/jl_rcsp/tool/SyncMessageTask$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Lcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

.field public final synthetic c:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;ILcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$1;->c:Lcom/jieli/jl_rcsp/tool/SyncMessageTask;

    iput p2, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$1;->a:I

    iput-object p3, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$1;->b:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$1;->b:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void
.end method

.method public onSuccess(Ljava/lang/Boolean;)V
    .locals 1

    .line 2
    iget p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$1;->a:I

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$1;->b:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    if-eqz p1, :cond_0

    .line 3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$1;->onSuccess(Ljava/lang/Boolean;)V

    return-void
.end method
