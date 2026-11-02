.class Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->replaceWatchFile(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
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
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

.field public final synthetic c:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$6;->c:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$6;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$6;->b:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$6;->c:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->u(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onFailed ---> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "replaceWatchFile"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$6;->b:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_0
    return-void
.end method

.method public onSuccess(Ljava/lang/Boolean;)V
    .locals 5

    .line 2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$6;->c:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->t(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)Lcom/jieli/jl_fatfs/FatFileSystem;

    move-result-object p1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$6;->a:Ljava/lang/String;

    new-instance v1, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$6;->c:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    iget-object v3, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$6;->b:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    const/4 v4, 0x3

    invoke-direct {v1, v2, v4, v3}, Lcom/jieli/jl_rcsp/watch/WatchProgressHandler;-><init>(Lcom/jieli/jl_rcsp/interfaces/watch/IWatchManager;ILcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    invoke-virtual {p1, v0, v1}, Lcom/jieli/jl_fatfs/FatFileSystem;->replaceFatFile(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch$6;->onSuccess(Ljava/lang/Boolean;)V

    return-void
.end method
