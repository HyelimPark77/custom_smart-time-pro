.class Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;->onStop(I)V
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
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener$1;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener$1;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;->a(Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;)Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener$1;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;->a(Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;)Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    move-result-object v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener$1;->onSuccess(Ljava/util/ArrayList;)V

    return-void
.end method

.method public onSuccess(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;)V"
        }
    .end annotation

    .line 2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener$1;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;->a(Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;)Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener$1;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;->a(Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;)Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_0
    return-void
.end method
