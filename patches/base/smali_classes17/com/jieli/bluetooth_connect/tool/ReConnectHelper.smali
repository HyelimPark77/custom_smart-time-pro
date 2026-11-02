.class public Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;
    }
.end annotation


# static fields
.field private static final DEFAULT_TASK_TIMEOUT:J = 0xc350L

.field private static final DELAY:J = 0x7d0L

.field private static final FAIL_CONNECT_MAX:I = 0x2

.field private static final MSG_RECONNECT:I = 0x9967

.field private static final MSG_RECONNECT_TIMEOUT:I = 0x9966

.field private static final RECONNECT_TIMEOUT:J = 0xcb20L

.field private static final SCAN_LIMIT:J = 0x3e80L

.field private static final STATE_CONNECTING:I = 0x2

.field private static final STATE_IDLE:I = 0x0

.field private static final STATE_SCANNING:I = 0x1

.field private static final TAG:Ljava/lang/String; = "ReConnectHelper"

.field private static sTaskID:I = 0x1


# instance fields
.field private final mBluetoothEventCallback:Lcom/jieli/bluetooth_connect/interfaces/callback/BluetoothEventCallback;

.field private final mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

.field private final mContext:Landroid/content/Context;

.field private final mHandler:Landroid/os/Handler;

.field private final mTaskList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;",
            ">;"
        }
    .end annotation
.end field

.field private startTime:J

.field private taskState:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "context",
            "operation"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mTaskList:Ljava/util/List;

    const/4 v0, 0x0

    iput v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->taskState:I

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/jf2;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/jf2;-><init>(Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mHandler:Landroid/os/Handler;

    new-instance v0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$1;

    invoke-direct {v0, p0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$1;-><init>(Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;)V

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBluetoothEventCallback:Lcom/jieli/bluetooth_connect/interfaces/callback/BluetoothEventCallback;

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mContext:Landroid/content/Context;

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {p1, v0}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->registerBluetoothCallback(Lcom/jieli/bluetooth_connect/interfaces/callback/BluetoothEventCallback;)Z

    return-void
.end method

.method public static synthetic OXO1(Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;Landroid/os/Message;)Z
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p1, Landroid/os/Message;->what:I

    const-string v1, ""

    packed-switch v0, :pswitch_data_0

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    sget-object v0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "address \uff1a "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "TASK_TIMEOUT"

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->removeTask(Ljava/lang/String;Z)V

    goto :goto_0

    :pswitch_0
    sget-object p1, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->TAG:Ljava/lang/String;

    const-string v0, "MSG_RECONNECT"

    invoke-static {p1, v0, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->startReconnectTask()V

    goto :goto_0

    :pswitch_1
    sget-object p1, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->TAG:Ljava/lang/String;

    const-string v0, "MSG_RECONNECT_TIMEOUT"

    invoke-static {p1, v0, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->stopReconnect()V

    :cond_0
    :goto_0
    const/4 p0, 0x1

    return p0

    :pswitch_data_0
    .packed-switch 0x9966
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic access$100(Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->postReconnectTaskMsg(J)V

    return-void
.end method

.method public static synthetic access$1000(Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->removeTask(Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic access$200(Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->setTaskState(I)V

    return-void
.end method

.method public static synthetic access$300()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic access$400(Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;)I
    .locals 0

    iget p0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->taskState:I

    return p0
.end method

.method public static synthetic access$500(Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$600(Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;Ljava/lang/String;)Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->findReconnectTask(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$700(Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;)Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;
    .locals 0

    iget-object p0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    return-object p0
.end method

.method public static synthetic access$800(Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;I)Landroid/bluetooth/BluetoothDevice;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->findTargetDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;I)Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$900(Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->connectBtDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;)V

    return-void
.end method

.method private addTask(Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "task"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mTaskList:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getTaskType()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mTaskList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mTaskList:Ljava/util/List;

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;

    invoke-virtual {v3}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getTaskType()I

    move-result v3

    if-ne v2, v3, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mTaskList:Ljava/util/List;

    invoke-interface {v1, v0, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    move v0, v2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mTaskList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v0

    :cond_3
    :goto_1
    if-eqz v0, :cond_5

    invoke-static {}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->autoIncTaskId()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->setTaskId(I)V

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getTaskTimeout()I

    move-result v0

    if-nez v0, :cond_4

    const v0, 0xc350

    invoke-virtual {p1, v0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->setTaskTimeout(I)V

    :cond_4
    sget-object v0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "addTask"

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mHandler:Landroid/os/Handler;

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getTaskId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mHandler:Landroid/os/Handler;

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getTaskId()I

    move-result v1

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getTaskTimeout()I

    move-result p1

    int-to-long v2, p1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->getCurrentTime()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->setStartTime(J)V

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mHandler:Landroid/os/Handler;

    const v0, 0x9966

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mHandler:Landroid/os/Handler;

    const-wide/32 v1, 0xcb20

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->postReconnectTaskMsg(J)V

    :cond_5
    return-void
.end method

.method private static autoIncTaskId()I
    .locals 3

    sget v0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->sTaskID:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->sTaskID:I

    const/16 v2, 0x100

    if-lt v1, v2, :cond_0

    const/4 v1, 0x1

    sput v1, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->sTaskID:I

    :cond_0
    return v0
.end method

.method private connectBtDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;)V
    .locals 6
    .param p1    # Landroid/bluetooth/BluetoothDevice;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "task"
        }
    .end annotation

    sget-object v0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Ready to connect device. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "connectBtDevice"

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->setTaskState(I)V

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->stopScan()V

    iget-object v3, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getConnectWay()I

    move-result v4

    invoke-interface {v3, p1, v4}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->connectBtDevice(Landroid/bluetooth/BluetoothDevice;I)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getConnectFailCount()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    const/4 v3, 0x0

    invoke-direct {p0, v3}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->setTaskState(I)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Connect device failed. Failure count = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", limit = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v2, v4}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-ge p1, v1, :cond_0

    invoke-virtual {p2, p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->setConnectFailCount(I)V

    const-wide/16 p1, 0x7d0

    invoke-direct {p0, p1, p2}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->postReconnectTaskMsg(J)V

    return-void

    :cond_0
    invoke-direct {p0, p2, v3}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->removeTask(Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;Z)V

    :cond_1
    return-void
.end method

.method private doReconnectEvent(Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;)V
    .locals 10
    .param p1    # Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "task"
        }
    .end annotation

    invoke-static {}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->isBluetoothEnable()Z

    move-result v0

    const-string v1, "doReconnectEvent"

    if-nez v0, :cond_0

    sget-object p1, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->TAG:Ljava/lang/String;

    const-string v0, "bluetooth is close."

    invoke-static {p1, v1, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->isTaskRunning()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->TAG:Ljava/lang/String;

    const-string v0, "task is running."

    invoke-static {p1, v1, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getTaskType()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->getBluetoothOption()Lcom/jieli/bluetooth_connect/bean/BluetoothOption;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isUseMultiDevice()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object p1, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->TAG:Ljava/lang/String;

    const-string v0, "single device manager "

    invoke-static {p1, v1, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->stopReconnect()V

    return-void

    :cond_2
    invoke-static {p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->access$000(Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->findSysConnectedDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    sget-object v3, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "device \uff1a "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, v0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", reconnectTask = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v1, v4}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_3

    invoke-direct {p0, v0, p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->connectBtDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;)V

    return-void

    :cond_3
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->isScanning()Z

    move-result v0

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->getScanType()I

    move-result v0

    if-ne v0, v2, :cond_4

    move v0, v5

    goto :goto_0

    :cond_4
    move v0, v4

    :goto_0
    if-nez v0, :cond_8

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getConnectWay()I

    move-result v0

    if-ne v0, v5, :cond_5

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->getScanType()I

    move-result v0

    if-eq v0, v5, :cond_6

    :cond_5
    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getConnectWay()I

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->getScanType()I

    move-result v0

    if-nez v0, :cond_7

    :cond_6
    move v0, v5

    goto :goto_1

    :cond_7
    move v0, v4

    :cond_8
    :goto_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "isScanOk : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v1, v6}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_9

    goto/16 :goto_4

    :cond_9
    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->stopScan()V

    const-wide/16 v6, 0x32

    :try_start_0
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_a
    :goto_2
    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->getNowLeftTime()J

    move-result-wide v6

    sget-object v0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "leftTime \uff1a "

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, ", startTime : "

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v8, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->startTime:J

    invoke-virtual {v3, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v3}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v8, 0x4e20

    cmp-long v3, v6, v8

    if-ltz v3, :cond_c

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getConnectWay()I

    move-result p1

    const-wide/16 v2, 0x3e80

    if-ne p1, v5, :cond_b

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {p1, v2, v3}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->startDeviceScan(J)Z

    move-result p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startDeviceScan ---> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_b
    iget-object p1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {p1, v2, v3}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->startBLEScan(J)Z

    move-result p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startBLEScan ---> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_c
    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getConnectWay()I

    move-result p1

    if-ne p1, v5, :cond_d

    move v2, v4

    :cond_d
    iget-object p1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {p1, v2, v6, v7}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->startDeviceScan(IJ)Z

    move-result p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "startDeviceScan : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ", way = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    if-eqz p1, :cond_e

    invoke-direct {p0, v5}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->setTaskState(I)V

    goto :goto_4

    :cond_e
    const-wide/16 v0, 0x7d0

    invoke-direct {p0, v0, v1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->postReconnectTaskMsg(J)V

    :goto_4
    return-void
.end method

.method private findReconnectTask(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "address"
        }
    .end annotation

    invoke-static {p1}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mTaskList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mTaskList:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;

    invoke-virtual {v2}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v2

    :cond_2
    return-object v1
.end method

.method private findSysConnectedDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "address"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->getSystemConnectedBtDeviceList(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private findTargetDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;I)Landroid/bluetooth/BluetoothDevice;
    .locals 2
    .param p1    # Landroid/bluetooth/BluetoothDevice;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "target",
            "scanMessage",
            "connectWay"
        }
    .end annotation

    const/4 v0, 0x1

    if-nez p3, :cond_2

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mContext:Landroid/content/Context;

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasConnectPermission(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result p2

    if-ne p2, v0, :cond_5

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, p3}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->getHistoryRecord(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getConnectType()I

    move-result p3

    if-nez p3, :cond_0

    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getAddress()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getMappedAddress()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-direct {p0, p2}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    if-eqz p2, :cond_5

    invoke-static {p1, p2}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p3

    if-nez p3, :cond_5

    return-object p2

    :cond_2
    invoke-virtual {p2}, Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;->getEdrAddr()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    if-nez p2, :cond_4

    iget-object p3, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p3, v1}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->getHistoryRecord(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    move-result-object p3

    if-eqz p3, :cond_4

    invoke-virtual {p3}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getConnectType()I

    move-result p2

    if-ne p2, v0, :cond_3

    invoke-virtual {p3}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getAddress()Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    :cond_3
    invoke-virtual {p3}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getMappedAddress()Ljava/lang/String;

    move-result-object p2

    :goto_2
    invoke-direct {p0, p2}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    :cond_4
    if-eqz p2, :cond_5

    return-object p2

    :cond_5
    return-object p1
.end method

.method private getCurrentTime()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method private getNowLeftTime()J
    .locals 4

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->getCurrentTime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->startTime:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0xcb20

    sub-long/2addr v2, v0

    return-wide v2
.end method

.method private getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "address"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->getRemoteDevice(Landroid/content/Context;Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    return-object p1
.end method

.method private isMatchAddress(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "address",
            "address2"
        }
    .end annotation

    invoke-static {p1}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-static {p2}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0, p1}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->getHistoryRecord(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getMappedAddress()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getUpdateAddress()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    return v1

    :cond_3
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_1
    return v1
.end method

.method private isTaskRunning()Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->isConnecting()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->isScanning()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->taskState:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private postReconnectTaskMsg(J)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "delay"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mHandler:Landroid/os/Handler;

    const v1, 0x9967

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    const-wide/16 v2, 0x0

    cmp-long v0, p1, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void

    :cond_0
    iget-object p1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mHandler:Landroid/os/Handler;

    invoke-virtual {p1, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method private printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mContext:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->printBtDeviceInfo(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private release()V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->setTaskState(I)V

    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->setStartTime(J)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mHandler:Landroid/os/Handler;

    const v1, 0x9966

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method private removeTask(Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;Z)V
    .locals 4
    .param p1    # Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "task",
            "result"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mTaskList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v0

    .line 4
    sget-object v1, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", ret = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, ", result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "removeTask"

    invoke-static {v1, v3, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_3

    .line 5
    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getCallback()Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    .line 6
    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getCallback()Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;

    move-result-object p2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->getHistoryRecord(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;->onSuccess(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getCallback()Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;

    move-result-object p2

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getAddress()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Connect device[%s] timeout."

    invoke-static {v1, v0}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x9

    invoke-interface {p2, v1, v0}, Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;->onFailed(ILjava/lang/String;)V

    .line 8
    :cond_1
    :goto_0
    iget-object p2, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mHandler:Landroid/os/Handler;

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getTaskId()I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeMessages(I)V

    .line 9
    iget-object p1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mTaskList:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    const-wide/16 p1, 0x0

    .line 10
    invoke-direct {p0, p1, p2}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->postReconnectTaskMsg(J)V

    return-void

    .line 11
    :cond_2
    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->stopReconnect()V

    :cond_3
    return-void
.end method

.method private removeTask(Ljava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "address",
            "result"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->findReconnectTask(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->removeTask(Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;Z)V

    :cond_0
    return-void
.end method

.method private setStartTime(J)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "time"
        }
    .end annotation

    iput-wide p1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->startTime:J

    return-void
.end method

.method private setTaskState(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "taskState"
        }
    .end annotation

    iput p1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->taskState:I

    return-void
.end method

.method private startReconnectTask()V
    .locals 6

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mTaskList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->isReconnecting()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->isTaskRunning()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mTaskList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->getNowLeftTime()J

    move-result-wide v1

    sget-object v3, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "left = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", start reconnect task."

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "startReconnectTask"

    invoke-static {v3, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->doReconnectEvent(Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;)V

    :cond_0
    return-void
.end method

.method private stopScan()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->isScanning()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->getScanType()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->stopBLEScan()Z

    return-void

    :cond_1
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    invoke-interface {v0}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->stopDeviceScan()Z

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 2

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->stopReconnect()V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBtOp:Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mBluetoothEventCallback:Lcom/jieli/bluetooth_connect/interfaces/callback/BluetoothEventCallback;

    invoke-interface {v0, v1}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->unregisterBluetoothCallback(Lcom/jieli/bluetooth_connect/interfaces/callback/BluetoothEventCallback;)Z

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public isReconnectDev(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->findReconnectTask(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method public isReconnecting()Z
    .locals 2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mHandler:Landroid/os/Handler;

    const v1, 0x9966

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    return v0
.end method

.method public reconnectDevice(Ljava/lang/String;IILcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "address",
            "connectWay",
            "timeout",
            "callback"
        }
    .end annotation

    .line 2
    invoke-static {p1}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    if-eqz p4, :cond_0

    .line 3
    const-string p1, "Address is error."

    invoke-interface {p4, v1, p1}, Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;->onFailed(ILjava/lang/String;)V

    :cond_0
    return-void

    .line 4
    :cond_1
    new-instance v0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;

    invoke-direct {v0, p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->setTaskType(I)V

    .line 6
    invoke-virtual {v0, p2}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->setConnectWay(I)V

    .line 7
    invoke-virtual {v0, p3}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->setTaskTimeout(I)V

    .line 8
    invoke-virtual {v0, p4}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->setCallback(Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;)V

    .line 9
    invoke-direct {p0, v0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->addTask(Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;)V

    return-void
.end method

.method public reconnectDevice(Ljava/lang/String;ILcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "address",
            "connectWay",
            "callback"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0, p3}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->reconnectDevice(Ljava/lang/String;IILcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;)V

    return-void
.end method

.method public reconnectHistory(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V
    .locals 4
    .param p1    # Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "record"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getDevType()I

    move-result v0

    const/4 v1, 0x5

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getSdkFlag()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getSdkFlag()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v3

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v2

    :goto_1
    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getConnectType()I

    move-result v1

    if-ne v1, v2, :cond_2

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getMappedAddress()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getAddress()Ljava/lang/String;

    move-result-object v1

    :goto_2
    if-eqz v0, :cond_3

    move v0, v3

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getConnectType()I

    move-result v0

    :goto_3
    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getUpdateAddress()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getUpdateAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getUpdateAddress()Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_4
    move v3, v0

    :goto_4
    new-instance p1, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;

    invoke-direct {p1, v1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->setConnectWay(I)V

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->setTaskType(I)V

    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->addTask(Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;)V

    return-void
.end method

.method public stopReconnect()V
    .locals 5

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mTaskList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mTaskList:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;

    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getCallback()Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getCallback()Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;

    move-result-object v2

    const/4 v3, 0x0

    const-string v4, "Reconnect task is stop."

    invoke-interface {v2, v3, v4}, Lcom/jieli/bluetooth_connect/interfaces/callback/OnHistoryRecordCallback;->onFailed(ILjava/lang/String;)V

    :cond_0
    iget-object v2, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mHandler:Landroid/os/Handler;

    invoke-virtual {v1}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper$ReconnectTask;->getTaskId()I

    move-result v1

    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeMessages(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->mTaskList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_2
    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/tool/ReConnectHelper;->release()V

    return-void
.end method
