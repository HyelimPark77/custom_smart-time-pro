.class final Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/impl/WatchOpImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "RcspProgressListener"
.end annotation


# instance fields
.field public final a:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

.field public final synthetic b:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;->b:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;->a:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;)Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;->a:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    return-object p0
.end method


# virtual methods
.method public onProgress(F)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;->a:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onProgress(F)V

    :cond_0
    return-void
.end method

.method public onStart(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;->a:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStart(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onStop(I)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;->b:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    move-result-object v0

    instance-of v0, v0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;->b:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->c(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    new-instance v0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener$1;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener$1;-><init>(Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;)V

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->reLoadFolder(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    invoke-static {}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a()Ljava/lang/String;

    move-result-object p1

    const-string v0, "RcspHandProgressListener"

    const-string v1, "reLoadFolder >>>> "

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;->a:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$RcspProgressListener;->a:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_2
    return-void
.end method
