.class public Lcom/jieli/jl_rcsp/tool/SyncMessageTask;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;
    }
.end annotation


# static fields
.field public static final i:Ljava/lang/String; = "SyncMessageTask"


# instance fields
.field public final a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

.field public final b:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;

.field public volatile d:Z

.field public volatile e:Z

.field public f:Z

.field public g:Z

.field public final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Short;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;)V
    .locals 1

    sget-object v0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->i:Ljava/lang/String;

    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->h:Ljava/util/Map;

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->c:Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "RcspOpImpl can not be null."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->i:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;Ljava/lang/String;J)Ljava/lang/String;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;)V
    .locals 0

    .line 3
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->c()V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;Ljava/lang/String;)V
    .locals 0

    .line 6
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->b(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;Ljava/lang/String;S)V
    .locals 0

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Ljava/lang/String;S)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->g:Z

    return p1
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/Short;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 29
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->h:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Short;

    return-object p1
.end method

.method public final a(Ljava/lang/String;J)Ljava/lang/String;
    .locals 1

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "_"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(I[BLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[B",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 22
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$MessageData;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$MessageData;-><init>(I[B)V

    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->g:Z

    .line 24
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildPushMessageInfoCmd(Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$MessageData;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    new-instance v1, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    new-instance v2, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$2;

    invoke-direct {v2, p0, p3}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$2;-><init>(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    const-string p3, "pushMessageInfo"

    invoke-direct {v1, p3, v2}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {p1, p2, v0, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    .line 25
    iget-boolean p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->g:Z

    if-nez p1, :cond_0

    return-void

    .line 26
    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->b()V

    return-void
.end method

.method public final a(Lcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/NotificationMsg;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    goto/16 :goto_3

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_1

    .line 8
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    return-void

    .line 9
    :cond_1
    sget-object v0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->i:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "pushMessageInfo"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    new-instance v3, Lcom/jieli/jl_rcsp/model/device/MessageInfo;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/NotificationMsg;->getAppName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/NotificationMsg;->getFlag()I

    move-result v5

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/NotificationMsg;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/NotificationMsg;->getContent()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/NotificationMsg;->getTime()J

    move-result-wide v8

    invoke-direct/range {v3 .. v9}, Lcom/jieli/jl_rcsp/model/device/MessageInfo;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;J)V

    .line 11
    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/model/device/MessageInfo;->beanToData()[B

    move-result-object p1

    .line 12
    array-length v0, p1

    const/4 v1, 0x0

    const/16 v2, 0xf0

    if-le v0, v2, :cond_6

    .line 13
    array-length v0, p1

    div-int/2addr v0, v2

    .line 14
    array-length v3, p1

    rem-int/2addr v3, v2

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    :goto_0
    add-int/lit8 v0, v0, -0x1

    move v3, v1

    :goto_1
    if-ltz v0, :cond_5

    .line 15
    array-length v4, p1

    sub-int/2addr v4, v3

    if-gtz v4, :cond_3

    goto :goto_3

    :cond_3
    if-le v4, v2, :cond_4

    .line 16
    new-array v4, v2, [B

    goto :goto_2

    .line 17
    :cond_4
    new-array v4, v4, [B

    .line 18
    :goto_2
    array-length v5, v4

    invoke-static {p1, v3, v4, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 19
    array-length v5, v4

    add-int/2addr v3, v5

    .line 20
    new-instance v5, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$1;

    invoke-direct {v5, p0, v0, p2}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$1;-><init>(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;ILcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    invoke-virtual {p0, v0, v4, v5}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(I[BLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_5
    :goto_3
    return-void

    .line 21
    :cond_6
    invoke-virtual {p0, v1, p1, p2}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(I[BLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    return-void
.end method

.method public final a(Ljava/lang/String;S)V
    .locals 1

    if-eqz p1, :cond_0

    .line 28
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->h:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 2

    .line 12
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    monitor-enter v0

    .line 13
    :try_start_0
    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->f:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 14
    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->f:Z

    .line 15
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    .line 16
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 17
    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->f:Z

    .line 18
    monitor-exit v0

    return-void

    .line 19
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final b(Lcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/NotificationMsg;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_1

    .line 2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    return-void

    :cond_1
    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->g:Z

    .line 4
    new-instance v1, Lcom/jieli/jl_rcsp/model/device/MessageInfo;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/NotificationMsg;->getAppName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/NotificationMsg;->getFlag()I

    move-result v3

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/NotificationMsg;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/NotificationMsg;->getContent()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/NotificationMsg;->getTime()J

    move-result-wide v6

    invoke-direct/range {v1 .. v7}, Lcom/jieli/jl_rcsp/model/device/MessageInfo;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;J)V

    .line 5
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/device/MessageInfo;->beanToData()[B

    move-result-object v0

    .line 6
    new-instance v1, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;

    const/4 v2, 0x6

    invoke-direct {v1, v2, v0}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;-><init>(B[B)V

    .line 7
    new-instance v0, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-direct {v0, v2, v1}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask$Param;)V

    .line 8
    new-instance v1, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$4;

    invoke-direct {v1, p0, p1, v0, p2}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$4;-><init>(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;Lcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/task/TaskBase;->setListener(Lcom/jieli/jl_rcsp/task/TaskListener;)V

    .line 9
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/task/smallfile/AddFileTask;->start()V

    .line 10
    iget-boolean p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->g:Z

    if-nez p1, :cond_2

    :goto_0
    return-void

    .line 11
    :cond_2
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->b()V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 20
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->h:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 2

    .line 9
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    monitor-enter v0

    .line 10
    :try_start_0
    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->f:Z

    if-eqz v1, :cond_0

    .line 11
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 12
    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    .line 13
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final c(Lcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/NotificationMsg;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->g:Z

    .line 4
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$RemoveMsg;

    .line 5
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/NotificationMsg;->getAppName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/NotificationMsg;->getTime()J

    move-result-wide v4

    invoke-direct {v2, v3, v4, v5}, Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$RemoveMsg;-><init>(Ljava/lang/String;J)V

    .line 6
    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildRemoveMessageCmd(Lcom/jieli/jl_rcsp/model/command/watch/PushInfoDataToDeviceCmd$RemoveMsg;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p1

    new-instance v2, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    new-instance v3, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$3;

    invoke-direct {v3, p0, p2}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$3;-><init>(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    const-string p2, "removeMessage"

    invoke-direct {v2, p2, v3}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    .line 7
    iget-boolean p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->g:Z

    if-nez p1, :cond_1

    return-void

    .line 8
    :cond_1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->b()V

    return-void
.end method

.method public final d(Lcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/NotificationMsg;",
            "Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/NotificationMsg;->getAppName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/NotificationMsg;->getTime()J

    move-result-wide v1

    invoke-virtual {p0, v0, v1, v2}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Ljava/lang/String;)Ljava/lang/Short;

    move-result-object v0

    sget-object v1, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->i:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "key = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", id = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "removeMessageBySFT"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->g:Z

    new-instance v1, Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;

    invoke-virtual {v0}, Ljava/lang/Short;->shortValue()S

    move-result v0

    const/4 v2, 0x6

    invoke-direct {v1, v2, v0}, Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;-><init>(BS)V

    new-instance v0, Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-direct {v0, v2, v1}, Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/task/smallfile/DeleteFileTask$Param;)V

    new-instance v1, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$5;

    invoke-direct {v1, p0, p1, p2}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$5;-><init>(Lcom/jieli/jl_rcsp/tool/SyncMessageTask;Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    invoke-interface {v0, v1}, Lcom/jieli/jl_rcsp/task/ITask;->setListener(Lcom/jieli/jl_rcsp/task/TaskListener;)V

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/task/ITask;->start()V

    iget-boolean p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->g:Z

    if-nez p1, :cond_3

    :goto_0
    return-void

    :cond_3
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->b()V

    return-void
.end method

.method public exit()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->d:Z

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->c()V

    return-void
.end method

.method public isRunning()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->d:Z

    return v0
.end method

.method public putNotification(Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->isRcspInit()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    iget-boolean p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->e:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->e:Z

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->c()V

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method public run()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->d:Z

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->c:Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;->onStart(J)V

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    monitor-enter v0

    :cond_1
    :goto_0
    :try_start_0
    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->d:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->e:Z

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->e:Z

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->b()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto/16 :goto_1

    :cond_2
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/LinkedBlockingQueue;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;

    iget-object v3, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->isRcspInit()Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    iput-boolean v2, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->d:Z

    monitor-exit v0

    return-void

    :cond_3
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;->getTaskOp()I

    move-result v2

    if-nez v2, :cond_5

    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isContactsTransferBySmallFile()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;->getMessage()Lcom/jieli/jl_rcsp/model/NotificationMsg;

    move-result-object v2

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;->getCallback()Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    move-result-object v1

    invoke-virtual {p0, v2, v1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a(Lcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    goto :goto_0

    :cond_4
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;->getMessage()Lcom/jieli/jl_rcsp/model/NotificationMsg;

    move-result-object v2

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;->getCallback()Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    move-result-object v1

    invoke-virtual {p0, v2, v1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->b(Lcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    goto :goto_0

    :cond_5
    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo()Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/response/TargetInfoResponse;->isContactsTransferBySmallFile()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;->getMessage()Lcom/jieli/jl_rcsp/model/NotificationMsg;

    move-result-object v2

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;->getCallback()Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    move-result-object v1

    invoke-virtual {p0, v2, v1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->c(Lcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    goto :goto_0

    :cond_6
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;->getMessage()Lcom/jieli/jl_rcsp/model/NotificationMsg;

    move-result-object v2

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask$SyncTask;->getCallback()Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;

    move-result-object v1

    invoke-virtual {p0, v2, v1}, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->d(Lcom/jieli/jl_rcsp/model/NotificationMsg;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    goto/16 :goto_0

    :cond_7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iput-boolean v2, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->d:Z

    iput-boolean v2, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->e:Z

    iput-boolean v2, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->g:Z

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->c:Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;->onFinish(J)V

    :cond_8
    sget-object v0, Lcom/jieli/jl_rcsp/tool/SyncMessageTask;->i:Ljava/lang/String;

    const-string v1, "thread end"

    invoke-static {v0, v0, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public declared-synchronized start()V
    .locals 1

    monitor-enter p0

    :try_start_0
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
