.class public Lcom/jieli/jl_rcsp/task/UriTransferTask;
.super Lcom/jieli/jl_rcsp/task/TransferTask;
.source "SourceFile"


# instance fields
.field public final g:Landroid/content/Context;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_rcsp/task/TransferTask$Param;)V
    .locals 1

    const-string v0, ""

    invoke-direct {p0, p2, v0, p5}, Lcom/jieli/jl_rcsp/task/TransferTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Ljava/lang/String;Lcom/jieli/jl_rcsp/task/TransferTask$Param;)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object p5

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object p5, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/task/TransferTask;->setPath(Ljava/lang/String;)V

    iput-object p3, p0, Lcom/jieli/jl_rcsp/task/UriTransferTask;->h:Ljava/lang/String;

    iput-object p4, p0, Lcom/jieli/jl_rcsp/task/UriTransferTask;->i:Ljava/lang/String;

    iput-object p1, p0, Lcom/jieli/jl_rcsp/task/UriTransferTask;->g:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final synthetic l()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/UriTransferTask;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/UriTransferTask;->h:Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/util/JLFileIOUtil;->isToFile(Ljava/lang/String;Ljava/io/InputStream;)V

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TaskBase;->isRun()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->start()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to read file . uri = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/task/UriTransferTask;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1001

    invoke-virtual {p0, v1, v0}, Lcom/jieli/jl_rcsp/task/TransferTask;->onError(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public release()V
    .locals 2

    invoke-super {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->release()V

    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_0
    return-void
.end method

.method public start()V
    .locals 2

    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/task/TransferTask;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/pa6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/pa6;-><init>(Lcom/jieli/jl_rcsp/task/UriTransferTask;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    invoke-super {p0}, Lcom/jieli/jl_rcsp/task/TransferTask;->start()V

    return-void
.end method
