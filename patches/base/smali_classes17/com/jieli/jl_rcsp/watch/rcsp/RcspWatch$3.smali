.class Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->restoreWatchSystem(Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
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
.field public final synthetic a:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

.field public final synthetic b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$3;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$3;->a:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$3;->a:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->onStop(I)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Boolean;)V
    .locals 1

    .line 2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$3;->a:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    const/high16 v0, 0x42c80000    # 100.0f

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->onProgress(F)V

    .line 3
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$3;->a:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->onStop(I)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$3;->onSuccess(Ljava/lang/Boolean;)V

    return-void
.end method
