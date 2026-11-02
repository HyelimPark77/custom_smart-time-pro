.class public Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;
.super Lcom/jieli/jl_audio_decode/tool/OperationThread;
.source "SourceFile"


# instance fields
.field private final dataQueue:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "[B>;"
        }
    .end annotation
.end field

.field private final dataType:I

.field private volatile isLocked:Z

.field private volatile isRunning:Z


# direct methods
.method public constructor <init>(Lcom/jieli/jl_audio_decode/tool/BaseManager;ILcom/jieli/jl_audio_decode/callback/OnStateCallback;Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;)V
    .locals 1

    const-string v0, "AddStreamDataThread"

    invoke-direct {p0, v0, p1, p3, p4}, Lcom/jieli/jl_audio_decode/tool/OperationThread;-><init>(Ljava/lang/String;Lcom/jieli/jl_audio_decode/tool/BaseManager;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;)V

    new-instance p1, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {p1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->dataQueue:Ljava/util/concurrent/LinkedBlockingQueue;

    iput p2, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->dataType:I

    return-void
.end method

.method private lock()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->dataQueue:Ljava/util/concurrent/LinkedBlockingQueue;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->isLocked:Z

    if-eqz v1, :cond_0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    :try_start_1
    iput-boolean v1, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->isLocked:Z

    iget-object v1, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->dataQueue:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->isLocked:Z

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method private unlock()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->dataQueue:Ljava/util/concurrent/LinkedBlockingQueue;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->isLocked:Z

    if-nez v1, :cond_0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->dataQueue:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->isLocked:Z

    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method


# virtual methods
.method public addStreamData([B)V
    .locals 1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->dataQueue:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-direct {p0}, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->unlock()V

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public operation()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public run()V
    .locals 7

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/tool/OperationThread;->manager:Lcom/jieli/jl_audio_decode/tool/BaseManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->dataQueue:Ljava/util/concurrent/LinkedBlockingQueue;

    monitor-enter v0

    :cond_0
    :goto_0
    :try_start_0
    iget-boolean v2, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->isRunning:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->dataQueue:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-direct {p0}, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->lock()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    iget-object v2, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->dataQueue:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v2}, Ljava/util/concurrent/LinkedBlockingQueue;->poll()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    if-eqz v2, :cond_0

    array-length v3, v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    :try_start_1
    iget-object v3, p0, Lcom/jieli/jl_audio_decode/tool/OperationThread;->manager:Lcom/jieli/jl_audio_decode/tool/BaseManager;

    iget v4, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->dataType:I

    invoke-virtual {v3, v4, v2}, Lcom/jieli/jl_audio_decode/tool/BaseManager;->nativeAddAudioStream(I[B)Z

    move-result v2

    if-nez v2, :cond_0

    iput-boolean v1, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->isRunning:Z

    const/16 v2, -0x3ec

    invoke-virtual {p0, v2}, Lcom/jieli/jl_audio_decode/tool/OperationThread;->callbackError(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v2

    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v4, "%s: %s"

    const/16 v5, -0x7d0

    invoke-static {v5}, Lcom/jieli/jl_audio_decode/constant/ErrorCode;->getErrorMsg(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v6, v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3, v4, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v5, v2}, Lcom/jieli/jl_audio_decode/tool/OperationThread;->callbackError(ILjava/lang/String;)V

    iput-boolean v1, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->isRunning:Z

    :cond_3
    :goto_1
    monitor-exit v0

    goto :goto_3

    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    :cond_4
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/jieli/jl_audio_decode/tool/OperationThread;->callbackError(I)V

    :goto_3
    iput-boolean v1, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->isRunning:Z

    iput-boolean v1, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->isLocked:Z

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->dataQueue:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    invoke-virtual {p0}, Lcom/jieli/jl_audio_decode/tool/OperationThread;->onThreadFinish()V

    return-void
.end method

.method public declared-synchronized start()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->isRunning:Z

    invoke-super {p0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public stopThread()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->isRunning:Z

    invoke-direct {p0}, Lcom/jieli/jl_audio_decode/tool/AddStreamDataThread;->unlock()V

    return-void
.end method
