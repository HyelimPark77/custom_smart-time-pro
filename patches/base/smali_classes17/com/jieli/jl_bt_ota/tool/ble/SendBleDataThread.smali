.class public Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread$IBleOperation;
    }
.end annotation


# static fields
.field private static final j:Ljava/lang/String; = "SendBleDataThread"

.field private static final k:J = 0x32L

.field private static final l:I = 0x6741


# instance fields
.field private final a:Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread$IBleOperation;

.field private final b:Landroidx/core/util/Consumer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/core/util/Consumer<",
            "Lcom/jieli/jl_bt_ota/model/base/ThreadState;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;",
            ">;"
        }
    .end annotation
.end field

.field private volatile d:Z

.field private volatile e:Z

.field private volatile f:Z

.field private volatile g:Z

.field private volatile h:Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;

.field private final i:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread$IBleOperation;Landroidx/core/util/Consumer;)V
    .locals 3
    .param p1    # Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread$IBleOperation;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/core/util/Consumer;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread$IBleOperation;",
            "Landroidx/core/util/Consumer<",
            "Lcom/jieli/jl_bt_ota/model/base/ThreadState;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->j:Ljava/lang/String;

    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->d:Z

    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->e:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->f:Z

    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->g:Z

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/w04;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/w04;-><init>(Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->i:Landroid/os/Handler;

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a:Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread$IBleOperation;

    iput-object p2, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->b:Landroidx/core/util/Consumer;

    return-void
.end method

.method public static synthetic OXO1(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;Z)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;Landroid/os/Message;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a(Landroid/os/Message;)Z

    move-result p0

    return p0
.end method

.method private a()V
    .locals 4

    .line 40
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->b()Z

    move-result v0

    .line 41
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unlock : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "tryToUnlock"

    invoke-direct {p0, v2, v1}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v0, :cond_0

    .line 42
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->i:Landroid/os/Handler;

    const/16 v1, 0x6741

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 43
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->i:Landroid/os/Handler;

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_0
    return-void
.end method

.method private a(J)V
    .locals 4

    .line 25
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    monitor-enter v0

    .line 26
    :try_start_0
    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->e:Z

    if-eqz v1, :cond_0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 27
    :cond_0
    :try_start_1
    const-string v1, "lock"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "try to lock, timeout = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v1, 0x0

    cmp-long v1, p1, v1

    const/4 v2, 0x1

    if-lez v1, :cond_1

    .line 28
    iput-boolean v2, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->e:Z

    .line 29
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v1, p1, p2}, Ljava/lang/Object;->wait(J)V

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    .line 30
    :cond_1
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    .line 31
    sget-object p1, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->j:Ljava/lang/String;

    const-string p2, "lock"

    const-string v1, "Continue working because the task queue is not empty"

    invoke-static {p1, p2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-void

    .line 33
    :cond_2
    :try_start_3
    iput-boolean v2, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->e:Z

    .line 34
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {p1}, Ljava/lang/Object;->wait()V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    .line 35
    :goto_0
    :try_start_4
    sget-object p2, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->j:Ljava/lang/String;

    const-string v1, "lock"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "occurred exception : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v1, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    const/4 p1, 0x0

    .line 36
    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->e:Z

    .line 37
    const-string p1, "lock"

    const-string p2, "release lock."

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    monitor-exit v0

    return-void

    .line 39
    :goto_2
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method private static synthetic a(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;Z)V
    .locals 6

    .line 11
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->getServiceUUID()Ljava/util/UUID;

    move-result-object v2

    .line 12
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->getCharacteristicUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->getData()[B

    move-result-object v5

    move-object v0, p0

    move v4, p2

    .line 13
    invoke-interface/range {v0 .. v5}, Lcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;->onResult(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;Z[B)V

    return-void
.end method

.method private a(Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;Z)V
    .locals 2

    if-eqz p1, :cond_2

    .line 5
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->getCallback()Lcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->getCallback()Lcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    new-instance v1, Lcom/android/mltcode/paycertificationapi/v04;

    invoke-direct {v1, v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/v04;-><init>(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;Z)V

    .line 8
    sget-boolean p1, Lcom/jieli/jl_bt_ota/constant/BluetoothConstant;->IS_CALLBACK_IN_MAIN:Z

    if-eqz p1, :cond_1

    .line 9
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->i:Landroid/os/Handler;

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 10
    :cond_1
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    :cond_2
    :goto_0
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 44
    sget-boolean v0, Lcom/jieli/jl_bt_ota/constant/BluetoothConstant;->IS_LOG_BLE_SEND:Z

    if-nez v0, :cond_0

    return-void

    .line 45
    :cond_0
    sget-object v0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->j:Ljava/lang/String;

    invoke-static {v0, p1, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic a(Landroid/os/Message;)Z
    .locals 2

    .line 1
    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0x6741

    if-ne v0, p1, :cond_0

    .line 2
    iget-boolean p1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->e:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    .line 3
    sget-object p1, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->j:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "size ---> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/LinkedBlockingQueue;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MSG_CHECK_QUEUE"

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private a(Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;)Z
    .locals 7
    .param p1    # Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 14
    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->d:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    monitor-enter v0

    .line 16
    :try_start_0
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v2, p1}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception v2

    .line 17
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    move v2, v1

    .line 18
    :goto_0
    iget-object v3, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v3}, Ljava/util/concurrent/LinkedBlockingQueue;->size()I

    move-result v3

    .line 19
    const-string v4, "addTask"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "result : "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v6, ", "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\n size : "

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", isQueueEmpty : "

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean p1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->f:Z

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, ", isWaitingForResult : "

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean p1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->g:Z

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v4, p1}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v2, :cond_1

    .line 20
    iget-boolean p1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->f:Z

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->g:Z

    if-nez p1, :cond_1

    .line 21
    iput-boolean v1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->f:Z

    .line 22
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a()V

    .line 23
    :cond_1
    monitor-exit v0

    return v2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private b()Z
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    monitor-enter v0

    .line 2
    :try_start_0
    const-string v1, "unlock"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isLocked : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v3, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->e:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->e:Z

    const/4 v2, 0x0

    if-nez v1, :cond_0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v2

    :catchall_0
    move-exception v1

    goto :goto_0

    .line 4
    :cond_0
    :try_start_1
    const-string v1, "unlock"

    const-string v3, "try to unlock"

    invoke-direct {p0, v1, v3}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 6
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->i:Landroid/os/Handler;

    const/16 v3, 0x6741

    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeMessages(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x1

    .line 7
    :try_start_2
    monitor-exit v0

    return v1

    :catch_0
    move-exception v1

    .line 8
    sget-object v3, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->j:Ljava/lang/String;

    const-string v4, "unlock"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "occurred exception : "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v4, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    monitor-exit v0

    return v2

    .line 10
    :goto_0
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method private b(Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    .line 11
    :cond_0
    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->h:Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;

    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "handleTask"

    invoke-direct {p0, v1, p1}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->h:Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;

    const/16 v2, 0x101

    invoke-virtual {p1, v2}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->setStatus(I)Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;

    .line 14
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a:Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread$IBleOperation;

    iget-object v3, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->h:Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->getSendParam()Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;

    move-result-object v3

    invoke-interface {p1, v3}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread$IBleOperation;->writeBleData(Lcom/jieli/jl_bt_ota/model/ble/BleSendParam;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->g:Z

    .line 15
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "writeDataByBleSync : "

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v3, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->g:Z

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v1, p1}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    iget-boolean p1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->g:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->h:Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->getStatus()I

    move-result p1

    if-ne p1, v2, :cond_1

    const-wide/16 v2, 0x1770

    .line 17
    invoke-direct {p0, v2, v3}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a(J)V

    .line 18
    :cond_1
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->h:Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->getStatus()I

    move-result p1

    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "send data status : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p1, :cond_2

    const-string v3, "success"

    goto :goto_0

    :cond_2
    const-string v3, "fail"

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_4

    .line 20
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->h:Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->isSendFailedOverLimit()Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 21
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->h:Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;

    invoke-direct {p0, p1, v1}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a(Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;Z)V

    goto :goto_1

    :cond_3
    const-wide/16 v2, 0xa

    .line 22
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    return v1

    .line 23
    :cond_4
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->h:Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;

    invoke-direct {p0, p1, v0}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a(Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;Z)V

    :goto_1
    return v0
.end method


# virtual methods
.method public addSendTask(Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;)Z
    .locals 12
    .param p1    # Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->d:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->getData()[B

    move-result-object v0

    array-length v2, v0

    if-nez v2, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a:Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread$IBleOperation;

    invoke-interface {v2, v4}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread$IBleOperation;->getBleMtu(Landroid/bluetooth/BluetoothDevice;)I

    move-result v2

    if-gtz v2, :cond_2

    return v1

    :cond_2
    move v10, v1

    :goto_0
    array-length v3, v0

    if-ge v10, v3, :cond_4

    array-length v3, v0

    sub-int/2addr v3, v10

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v11

    new-array v8, v11, [B

    invoke-static {v0, v10, v8, v1, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v3, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->getServiceUUID()Ljava/util/UUID;

    move-result-object v5

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->getCharacteristicUUID()Ljava/util/UUID;

    move-result-object v6

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->getWriteType()I

    move-result v7

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->getCallback()Lcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;

    move-result-object v9

    invoke-direct/range {v3 .. v9}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/UUID;I[BLcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;)V

    invoke-direct {p0, v3}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a(Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;)Z

    move-result v3

    if-nez v3, :cond_3

    sget-object p1, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->j:Ljava/lang/String;

    invoke-static {v8}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "loss data, data = [ %s ]"

    invoke-static {v2, v0}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "addSendTask"

    invoke-static {p1, v2, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_3
    add-int/2addr v10, v11

    goto :goto_0

    :cond_4
    const/4 p1, 0x1

    return p1
.end method

.method public isRunning()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->d:Z

    return v0
.end method

.method public run()V
    .locals 7

    sget-object v0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->j:Ljava/lang/String;

    const-string v1, "start"

    const-string v2, "run"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->b:Landroidx/core/util/Consumer;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    new-instance v3, Lcom/jieli/jl_bt_ota/model/base/ThreadState;

    invoke-virtual {p0}, Ljava/lang/Thread;->getId()J

    move-result-wide v4

    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v4, v5, v6}, Lcom/jieli/jl_bt_ota/model/base/ThreadState;-><init>(JLjava/lang/String;)V

    invoke-virtual {v3, v1}, Lcom/jieli/jl_bt_ota/model/base/ThreadState;->setState(I)Lcom/jieli/jl_bt_ota/model/base/ThreadState;

    move-result-object v3

    invoke-interface {v0, v3}, Landroidx/core/util/Consumer;->accept(Ljava/lang/Object;)V

    :cond_0
    :goto_0
    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->d:Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v0, :cond_3

    iput-object v3, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->h:Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;

    iput-boolean v4, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->g:Z

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->f:Z

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->f:Z

    if-eqz v0, :cond_1

    sget-object v0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->j:Ljava/lang/String;

    const-string v3, "queue is empty, so waiting for data"

    invoke-static {v0, v2, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v3, 0x0

    invoke-direct {p0, v3, v4}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a(J)V

    goto :goto_0

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->b(Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_2

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v3, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->j:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "exception : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v2, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->poll()Ljava/lang/Object;

    goto :goto_0

    :cond_3
    iput-boolean v4, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->d:Z

    iput-boolean v4, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->e:Z

    iput-boolean v4, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->g:Z

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->c:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    iput-boolean v1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->f:Z

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->i:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->b:Landroidx/core/util/Consumer;

    if-eqz v0, :cond_4

    new-instance v1, Lcom/jieli/jl_bt_ota/model/base/ThreadState;

    invoke-virtual {p0}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v5, v6, v3}, Lcom/jieli/jl_bt_ota/model/base/ThreadState;-><init>(JLjava/lang/String;)V

    invoke-virtual {v1, v4}, Lcom/jieli/jl_bt_ota/model/base/ThreadState;->setState(I)Lcom/jieli/jl_bt_ota/model/base/ThreadState;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/core/util/Consumer;->accept(Ljava/lang/Object;)V

    :cond_4
    sget-object v0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->j:Ljava/lang/String;

    const-string v1, "exit"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public declared-synchronized start()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->d:Z

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

.method public declared-synchronized stopThread()V
    .locals 3

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->j:Ljava/lang/String;

    const-string v1, "stopThread"

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->d:Z

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a()V
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

.method public wakeupSendThread(Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;)V
    .locals 2

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->d:Z

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->h:Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->getCallback()Lcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->setCallback(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBleSendDataCallback;)Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->h:Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "status = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/ble/BleSendTask;->getStatus()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "wakeupSendThread"

    invoke-direct {p0, v0, p1}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/ble/SendBleDataThread;->a()V

    :cond_1
    :goto_0
    return-void
.end method
