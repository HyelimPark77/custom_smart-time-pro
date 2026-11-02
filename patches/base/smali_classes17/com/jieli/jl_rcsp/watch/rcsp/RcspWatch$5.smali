.class Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->updateWatchResource(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
        "Ljava/util/ArrayList<",
        "Lcom/jieli/jl_fatfs/model/FatFile;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

.field public final synthetic c:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;->c:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;->b:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;->b:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result p1

    invoke-static {p1}, Lcom/jieli/jl_rcsp/constant/WatchError;->getErrorDesc(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;->onError(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;->onSuccess(Ljava/util/ArrayList;)V

    return-void
.end method

.method public onSuccess(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;)V"
        }
    .end annotation

    .line 2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;->c:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->b(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    move-result-object p1

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;->c:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    new-instance v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;->c:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;->b:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

    new-instance v4, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5$1;

    invoke-direct {v4, p0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5$1;-><init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;-><init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;)V

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;)Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    .line 4
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$5;->c:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->b(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    :cond_0
    return-void
.end method
