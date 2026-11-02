.class Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_filebrowse/interfaces/DeleteCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->a(Lcom/jieli/jl_filebrowse/bean/SDCardBean;Lcom/jieli/jl_filebrowse/bean/FileStruct;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

.field public final synthetic b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$10;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$10;->a:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(ILcom/jieli/jl_filebrowse/bean/FileStruct;)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$10;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->e(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onError :: code = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "deleteFlashFile"

    invoke-static {v0, v1, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$10;->a:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_0
    return-void
.end method

.method public onFinish()V
    .locals 0

    return-void
.end method

.method public onSuccess(Lcom/jieli/jl_filebrowse/bean/FileStruct;)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$10;->b:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->d(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onSuccess :: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "deleteFlashFile"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$10;->a:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    if-eqz p1, :cond_0

    const/high16 v0, 0x42c80000    # 100.0f

    invoke-interface {p1, v0}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onProgress(F)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch$10;->a:Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;->onStop(I)V

    :cond_0
    return-void
.end method
