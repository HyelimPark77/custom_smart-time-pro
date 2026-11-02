.class Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5;->onSuccess(Ljava/lang/Boolean;)V
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
.field public final synthetic a:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

.field public final synthetic b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5;Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5$1;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5$1;->a:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5$1;->a:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;->onStop(I)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Boolean;)V
    .locals 2

    .line 2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5$1;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5;

    iget-object p1, p1, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5;->c:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->t(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Lcom/jieli/jl_fatfs/FatFileSystem;

    move-result-object p1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5$1;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5;

    iget-object v0, v0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5$1;->a:Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    invoke-virtual {p1, v0, v1}, Lcom/jieli/jl_fatfs/FatFileSystem;->deleteFatFile(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$5$1;->onSuccess(Ljava/lang/Boolean;)V

    return-void
.end method
