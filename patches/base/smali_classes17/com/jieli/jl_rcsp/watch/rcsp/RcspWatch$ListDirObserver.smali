.class Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$ListDirObserver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_filebrowse/interfaces/FileObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ListDirObserver"
.end annotation


# instance fields
.field public final a:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_fatfs/model/FatFile;",
            ">;>;)V"
        }
    .end annotation

    .line 2
    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$ListDirObserver;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$ListDirObserver;->a:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$ListDirObserver;-><init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    return-void
.end method


# virtual methods
.method public OnFlayCallback(Z)V
    .locals 0

    return-void
.end method

.method public onFileReadFailed(I)V
    .locals 4

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$ListDirObserver;->a:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    if-eqz v0, :cond_0

    const/16 v1, 0x3005

    const/4 v2, 0x0

    const/16 v3, 0xd

    invoke-static {v3, v1, p1, v2}, Lcom/jieli/jl_rcsp/constant/RcspErrorCode;->buildJsonError(IIILjava/lang/String;)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->removeFileObserver(Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V

    return-void
.end method

.method public onFileReadStart()V
    .locals 0

    return-void
.end method

.method public onFileReadStop(Z)V
    .locals 2

    if-nez p1, :cond_0

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$ListDirObserver;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->c(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Lcom/jieli/jl_filebrowse/bean/SDCardBean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->loadMore(Lcom/jieli/jl_filebrowse/bean/SDCardBean;)I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$ListDirObserver;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$ListDirObserver;->a:Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->listWatchList(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    :goto_0
    if-eqz p1, :cond_1

    invoke-static {}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->getInstance()Lcom/jieli/jl_filebrowse/FileBrowseManager;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/jieli/jl_filebrowse/FileBrowseManager;->removeFileObserver(Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V

    :cond_1
    return-void
.end method

.method public onFileReceiver(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/FileStruct;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public onSdCardStatusChange(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/SDCardBean;",
            ">;)V"
        }
    .end annotation

    return-void
.end method
