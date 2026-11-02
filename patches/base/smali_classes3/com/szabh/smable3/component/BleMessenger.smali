.class public final Lcom/szabh/smable3/component/BleMessenger;
.super Lcom/android/mltcode/paycertificationapi/iO00;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/component/BleMessenger$Companion;,
        Lcom/szabh/smable3/component/BleMessenger$MessageTask;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleMessenger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMessenger.kt\ncom/szabh/smable3/component/BleMessenger\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,243:1\n1#2:244\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleMessenger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleMessenger.kt\ncom/szabh/smable3/component/BleMessenger\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,243:1\n1#2:244\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/component/BleMessenger$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final LOG_HEADER:Ljava/lang/String; = "BleMessenger"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final RETRY_MAX_TIMES:I = 0x3


# instance fields
.field private final mBleMessages:Ljava/util/LinkedList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lcom/android/mltcode/paycertificationapi/X01O0O1;",
            ">;"
        }
    .end annotation
.end field

.field private mHandler:Landroid/os/Handler;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mMessageTask:Lcom/szabh/smable3/component/BleMessenger$MessageTask;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mMessengerCallback:Lcom/szabh/smable3/component/BleMessengerCallback;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mPacketSemaphore:Ljava/util/concurrent/Semaphore;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mPacketThread:Ljava/lang/Thread;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private volatile mRunning:Z

.field private final mWritePackets:Ljava/util/concurrent/LinkedBlockingDeque;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingDeque<",
            "Lcom/android/mltcode/paycertificationapi/h77;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/component/BleMessenger$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/component/BleMessenger$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/component/BleMessenger;->Companion:Lcom/szabh/smable3/component/BleMessenger$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    invoke-direct {p0}, Lcom/android/mltcode/paycertificationapi/iO00;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mRunning:Z

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lcom/szabh/smable3/component/BleMessenger;->mBleMessages:Ljava/util/LinkedList;

    new-instance v1, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v1}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    iput-object v1, p0, Lcom/szabh/smable3/component/BleMessenger;->mWritePackets:Ljava/util/concurrent/LinkedBlockingDeque;

    new-instance v1, Ljava/util/concurrent/Semaphore;

    invoke-direct {v1, v0}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v1, p0, Lcom/szabh/smable3/component/BleMessenger;->mPacketSemaphore:Ljava/util/concurrent/Semaphore;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mHandler:Landroid/os/Handler;

    new-instance v7, Lcom/android/mltcode/paycertificationapi/O1iO;

    invoke-direct {v7, p0}, Lcom/android/mltcode/paycertificationapi/O1iO;-><init>(Lcom/szabh/smable3/component/BleMessenger;)V

    const/16 v8, 0x17

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "BleMessenger WritePacket"

    const/4 v6, 0x0

    invoke-static/range {v2 .. v9}, Lkotlin/concurrent/ThreadsKt;->iO(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mPacketThread:Ljava/lang/Thread;

    return-void
.end method

.method public static synthetic OXO1(Lcom/szabh/smable3/component/BleMessenger;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/szabh/smable3/component/BleMessenger;->mPacketThread$lambda$0(Lcom/szabh/smable3/component/BleMessenger;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMHandler$p(Lcom/szabh/smable3/component/BleMessenger;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/szabh/smable3/component/BleMessenger;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method private static final mPacketThread$lambda$0(Lcom/szabh/smable3/component/BleMessenger;)Lkotlin/Unit;
    .locals 8

    :cond_0
    :goto_0
    :try_start_0
    iget-boolean v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mRunning:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mWritePackets:Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingDeque;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/h77;

    iget-object v1, p0, Lcom/szabh/smable3/component/BleMessenger;->mPacketSemaphore:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v1}, Ljava/util/concurrent/Semaphore;->acquire()V

    iget-boolean v1, p0, Lcom/szabh/smable3/component/BleMessenger;->mRunning:Z

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/iO00;->getMAbsBleConnector()Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getMBluetoothGatt()Landroid/bluetooth/BluetoothGatt;

    move-result-object v1

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/iO00;->getMAbsBleConnector()Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object v2

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/h77;->iO()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/h77;->OXO1()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getCharacteristic(Ljava/lang/String;Ljava/lang/String;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/iO00;->getMAbsBleConnector()Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object v4

    invoke-virtual {v4}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getWriteType()I

    move-result v4

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x21

    if-lt v5, v6, :cond_1

    const/4 v5, -0x1

    if-eq v4, v5, :cond_1

    sget-object v5, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "BleMessenger WritePacket writeType "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getWriteType()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ", "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/h77;->XIi00iiXO()[B

    move-result-object v0

    invoke-static {v1, v2, v0, v4}, Lcom/android/mltcode/paycertificationapi/I1Ii;->OXO1(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;[BI)I

    move-result v0

    if-nez v0, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/h77;->XIi00iiXO()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    invoke-virtual {v1, v2}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result v3

    :cond_2
    :goto_1
    if-nez v3, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "BleMessenger WritePacket failed"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mPacketSemaphore:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    sget-object p0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "BleMessenger BleMessageThread interrupted -> exit"

    invoke-virtual {p0, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    :cond_3
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public declared-synchronized dequeueMessage()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mMessageTask:Lcom/szabh/smable3/component/BleMessenger$MessageTask;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/szabh/smable3/component/BleMessenger;->mHandler:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mMessageTask:Lcom/szabh/smable3/component/BleMessenger$MessageTask;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mBleMessages:Ljava/util/LinkedList;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/szabh/smable3/component/BleMessenger$MessageTask;

    iget-object v1, p0, Lcom/szabh/smable3/component/BleMessenger;->mBleMessages:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "removeFirst(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/android/mltcode/paycertificationapi/X01O0O1;

    invoke-direct {v0, p0, v1}, Lcom/szabh/smable3/component/BleMessenger$MessageTask;-><init>(Lcom/szabh/smable3/component/BleMessenger;Lcom/android/mltcode/paycertificationapi/X01O0O1;)V

    iget-object v1, p0, Lcom/szabh/smable3/component/BleMessenger;->mHandler:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iput-object v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mMessageTask:Lcom/szabh/smable3/component/BleMessenger$MessageTask;

    goto :goto_1

    :cond_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "BleMessenger dequeueMessage -> No message right now"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized dequeueWritePacket()V
    .locals 2

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getDisableStreamLog()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "BleMessenger dequeueWritePacket"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mPacketSemaphore:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->availablePermits()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mPacketSemaphore:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized enqueueMessage(Lcom/android/mltcode/paycertificationapi/X01O0O1;)V
    .locals 3
    .param p1    # Lcom/android/mltcode/paycertificationapi/X01O0O1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getDisableStreamLog()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BleMessenger enqueueMessage -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mBleMessages:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/szabh/smable3/component/BleMessenger;->mMessageTask:Lcom/szabh/smable3/component/BleMessenger$MessageTask;

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lcom/szabh/smable3/component/BleMessenger;->dequeueMessage()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized enqueueWritePackets(Lcom/android/mltcode/paycertificationapi/h77;)V
    .locals 6
    .param p1    # Lcom/android/mltcode/paycertificationapi/h77;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/h77;->XIi00iiXO()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/iO00;->getMPacketSize()I

    move-result v1

    rem-int/2addr v0, v1

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/h77;->XIi00iiXO()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/iO00;->getMPacketSize()I

    move-result v2

    div-int/2addr v0, v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_0
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/h77;->XIi00iiXO()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/iO00;->getMPacketSize()I

    move-result v2

    div-int/2addr v0, v2

    add-int/2addr v0, v1

    :goto_0
    if-ne v0, v1, :cond_2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getDisableStreamLog()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BleMessenger enqueueWritePackets -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mWritePackets:Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/LinkedBlockingDeque;->put(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_5

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/h77;->XIi00iiXO()[B

    move-result-object v2

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/iO00;->getMPacketSize()I

    move-result v3

    mul-int/2addr v3, v1

    add-int/lit8 v4, v0, -0x1

    if-ne v1, v4, :cond_3

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/h77;->XIi00iiXO()[B

    move-result-object v4

    array-length v4, v4

    goto :goto_2

    :cond_3
    add-int/lit8 v4, v1, 0x1

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/iO00;->getMPacketSize()I

    move-result v5

    mul-int/2addr v4, v5

    :goto_2
    invoke-static {v2, v3, v4}, Lkotlin/collections/ArraysKt___ArraysJvmKt;->I0IIOI([BII)[B

    move-result-object v2

    new-instance v3, Lcom/android/mltcode/paycertificationapi/h77;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/h77;->iO()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/h77;->OXO1()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5, v2}, Lcom/android/mltcode/paycertificationapi/h77;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->getDisableStreamLog()Z

    move-result v2

    if-nez v2, :cond_4

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "BleMessenger enqueueWritePackets -> "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    :cond_4
    iget-object v2, p0, Lcom/szabh/smable3/component/BleMessenger;->mWritePackets:Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-virtual {v2, v3}, Ljava/util/concurrent/LinkedBlockingDeque;->put(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_5
    :goto_3
    monitor-exit p0

    return-void

    :goto_4
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final getMMessengerCallback()Lcom/szabh/smable3/component/BleMessengerCallback;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mMessengerCallback:Lcom/szabh/smable3/component/BleMessengerCallback;

    return-object v0
.end method

.method public final declared-synchronized release()V
    .locals 2

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "BleMessenger -> release"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mRunning:Z

    invoke-virtual {p0}, Lcom/szabh/smable3/component/BleMessenger;->reset()V

    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mPacketThread:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
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

.method public final declared-synchronized replyMessage(Lcom/android/mltcode/paycertificationapi/h77;)V
    .locals 3
    .param p1    # Lcom/android/mltcode/paycertificationapi/h77;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BleMessenger replyMessage -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/szabh/smable3/component/BleMessenger;->enqueueWritePackets(Lcom/android/mltcode/paycertificationapi/h77;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized reset()V
    .locals 3

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "BleMessenger -> reset"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mMessageTask:Lcom/szabh/smable3/component/BleMessenger$MessageTask;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/szabh/smable3/component/BleMessenger;->mHandler:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mMessageTask:Lcom/szabh/smable3/component/BleMessenger$MessageTask;

    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mBleMessages:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mWritePackets:Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingDeque;->clear()V

    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mPacketSemaphore:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->availablePermits()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mPacketSemaphore:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mPacketSemaphore:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->availablePermits()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mPacketSemaphore:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->availablePermits()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-virtual {v0, v2}, Ljava/util/concurrent/Semaphore;->acquire(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized sendDataDirectly(Lcom/android/mltcode/paycertificationapi/h77;)V
    .locals 3
    .param p1    # Lcom/android/mltcode/paycertificationapi/h77;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/szabh/smable3/component/BleMessenger;->mWritePackets:Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/LinkedBlockingDeque;->addFirst(Ljava/lang/Object;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BleMessenger \u63d2\u961f\u53d1\u9001:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/h77;->XIi00iiXO()[B

    move-result-object p1

    invoke-static {p1}, Lcom/bestmafen/baseble/data/ByteArrayExtKt;->getMHexString([B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final setMMessengerCallback(Lcom/szabh/smable3/component/BleMessengerCallback;)V
    .locals 0
    .param p1    # Lcom/szabh/smable3/component/BleMessengerCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/szabh/smable3/component/BleMessenger;->mMessengerCallback:Lcom/szabh/smable3/component/BleMessengerCallback;

    return-void
.end method
