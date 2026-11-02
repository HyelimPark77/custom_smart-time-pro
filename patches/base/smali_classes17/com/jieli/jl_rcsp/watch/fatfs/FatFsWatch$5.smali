.class Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->deleteWatchFile(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
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
.field public final synthetic a:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5;->c:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5;->a:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5;->a:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_0
    return-void
.end method

.method public onSuccess(Ljava/lang/Boolean;)V
    .locals 3

    .line 2
    new-instance p1, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5;->c:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5;->a:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    const/4 v2, 0x2

    invoke-direct {p1, v0, v2, v1}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;-><init>(Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;ILcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5;->c:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5;->b:Ljava/lang/String;

    new-instance v2, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5$1;

    invoke-direct {v2, p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5$1;-><init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5;Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)V

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5;->onSuccess(Ljava/lang/Boolean;)V

    return-void
.end method
