.class Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$OnWatchRunnable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "OnWatchRunnable"
.end annotation


# instance fields
.field public final a:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;

.field public final synthetic b:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$OnWatchRunnable;->b:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$OnWatchRunnable;->a:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$OnWatchRunnable;->b:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a(Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$OnWatchRunnable;->a:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$OnWatchRunnable;->b:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->a(Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$OnWatchRunnable;->a:Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;

    invoke-interface {v2, v1}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager$WatchCallbackImpl;->onCallback(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;)V

    goto :goto_0

    :cond_0
    return-void
.end method
