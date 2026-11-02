.class Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TimerThread"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:J

.field private volatile c:Z

.field private final d:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$ThreadStateListener;

.field final synthetic e:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;JLcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$ThreadStateListener;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;->e:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;

    const-string p1, "TimerThread"

    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;->a:Ljava/lang/String;

    iput-wide p2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;->b:J

    iput-object p4, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;->d:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$ThreadStateListener;

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;->c:Z

    return p0
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;->c:Z

    return p1
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;->c:Z
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

.method public run()V
    .locals 3

    :goto_0
    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;->c:Z

    if-eqz v0, :cond_0

    :try_start_0
    iget-wide v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;->b:J

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;->e:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->a(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;)Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;->e:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->a(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;)Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;

    move-result-object v0

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->b(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;->c:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "end....id : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DataHandler"

    const-string v2, "TimerThread"

    invoke-static {v1, v2, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;->d:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$ThreadStateListener;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$ThreadStateListener;->onFinish(J)V

    :cond_1
    return-void
.end method

.method public declared-synchronized start()V
    .locals 3

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;->c:Z

    invoke-super {p0}, Ljava/lang/Thread;->start()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " start.... id : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DataHandler"

    const-string v2, "TimerThread"

    invoke-static {v1, v2, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;->d:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$ThreadStateListener;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$ThreadStateListener;->onStart(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
