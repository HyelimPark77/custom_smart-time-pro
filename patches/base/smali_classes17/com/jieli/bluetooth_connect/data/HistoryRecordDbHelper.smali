.class public Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final mBtConnectDatabase:Lcom/jieli/bluetooth_connect/data/BtConnectDatabase;

.field private final mContext:Landroid/content/Context;

.field private final mObserver:Lcom/jieli/bluetooth_connect/data/HistoryRecordObserver;

.field private final mThreadPool:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/jieli/bluetooth_connect/bean/BluetoothOption;Lcom/jieli/bluetooth_connect/data/HistoryRecordObserver;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "option",
            "observer"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mThreadPool:Ljava/util/concurrent/ExecutorService;

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mContext:Landroid/content/Context;

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/data/BtConnectDatabase;->buildDatabase(Landroid/content/Context;)Lcom/jieli/bluetooth_connect/data/BtConnectDatabase;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mBtConnectDatabase:Lcom/jieli/bluetooth_connect/data/BtConnectDatabase;

    iput-object p3, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mObserver:Lcom/jieli/bluetooth_connect/data/HistoryRecordObserver;

    invoke-virtual {p0, p2}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->syncSystemDeviceList(Lcom/jieli/bluetooth_connect/bean/BluetoothOption;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Please call initDb method at first!"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic O00(Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 4

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->getHistoryRecordByDevice(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    new-instance v0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    invoke-direct {v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;-><init>()V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getUpdateAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-void

    :cond_2
    :goto_1
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setName(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setAddress(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setDevType(I)V

    invoke-virtual {v0, p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setConnectType(I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setOnlineTime(J)V

    iget-object v2, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mContext:Landroid/content/Context;

    invoke-static {v2, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->printBtDeviceInfo(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    filled-new-array {p1, p2, v2}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "device : %s, connectWay : %d, isAddRecord = %s"

    invoke-static {p2, p1}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "HistoryRecordDbHelper"

    const-string v2, "saveHistoryRecord"

    invoke-static {p2, v2, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v1, :cond_3

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->saveHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    return-void

    :cond_3
    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->updateHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;)V
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->getHistoryRecordList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->clearHistoryRecords(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;Landroid/bluetooth/BluetoothDevice;ILjava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->getHistoryRecordByDevice(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setSdkFlag(I)V

    invoke-virtual {p1, p3}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setMappedAddress(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->updateHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;Landroid/bluetooth/BluetoothDevice;III)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->getHistoryRecordByDevice(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, p2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setVid(I)V

    invoke-virtual {p1, p3}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setUid(I)V

    invoke-virtual {p1, p4}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->setPid(I)V

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->updateHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    return-void
.end method

.method public static synthetic iO(Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;Landroid/bluetooth/BluetoothDevice;DDIJ)V
    .locals 3

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->getHistoryRecordByDevice(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    move-result-object p1

    if-eqz p1, :cond_5

    const-wide/16 v0, 0x0

    cmpl-double v2, p2, v0

    if-nez v2, :cond_0

    cmpl-double v0, p4, v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p6, :cond_3

    const/4 v0, 0x1

    if-eq p6, v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getRightDevLatitude()D

    move-result-wide v0

    cmpl-double p6, p2, v0

    if-nez p6, :cond_2

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getRightDevLongitude()D

    move-result-wide v0

    cmpl-double p6, p4, v0

    if-nez p6, :cond_2

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getRightDevUpdateTime()J

    move-result-wide v0

    cmp-long p6, p7, v0

    if-lez p6, :cond_5

    :cond_2
    move-wide p6, p7

    invoke-virtual/range {p1 .. p7}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->updateRightDevGpsInfo(DDJ)V

    goto :goto_0

    :cond_3
    move-wide p6, p7

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getLeftDevLatitude()D

    move-result-wide v0

    cmpl-double p8, p2, v0

    if-nez p8, :cond_4

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getLeftDevLongitude()D

    move-result-wide v0

    cmpl-double p8, p4, v0

    if-nez p8, :cond_4

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getLeftDevUpdateTime()J

    move-result-wide v0

    cmp-long p8, p6, v0

    if-lez p8, :cond_5

    :cond_4
    invoke-virtual/range {p1 .. p7}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->updateLeftDevGpsInfo(DDJ)V

    :goto_0
    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->updateHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    :cond_5
    :goto_1
    return-void
.end method


# virtual methods
.method public clearAllHistoryRecord()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mThreadPool:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OOi1X1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OOi1X1;-><init>(Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public clearHistoryRecords(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "historyRecords"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mBtConnectDatabase:Lcom/jieli/bluetooth_connect/data/BtConnectDatabase;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/data/BtConnectDatabase;->historyRecordDao()Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao;->removeHistoryRecords(Ljava/util/List;)V

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mObserver:Lcom/jieli/bluetooth_connect/data/HistoryRecordObserver;

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/jieli/bluetooth_connect/data/HistoryRecordObserver;->onDelete(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public deleteHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "historyRecord"
        }
    .end annotation

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mBtConnectDatabase:Lcom/jieli/bluetooth_connect/data/BtConnectDatabase;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/data/BtConnectDatabase;->historyRecordDao()Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao;->removeHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mObserver:Lcom/jieli/bluetooth_connect/data/HistoryRecordObserver;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/data/HistoryRecordObserver;->onDelete(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public destroy()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mThreadPool:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mThreadPool:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    :cond_0
    return-void
.end method

.method public getHistoryRecordByDevice(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->getHistoryRecordByMac(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    move-result-object p1

    return-object p1
.end method

.method public getHistoryRecordByMac(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;
    .locals 1
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

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->getHistoryRecordDao()Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao;->getHistoryRecord(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    move-result-object p1

    return-object p1
.end method

.method public getHistoryRecordDao()Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao;
    .locals 1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mBtConnectDatabase:Lcom/jieli/bluetooth_connect/data/BtConnectDatabase;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/data/BtConnectDatabase;->historyRecordDao()Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao;

    move-result-object v0

    return-object v0
.end method

.method public getHistoryRecordList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->getHistoryRecordDao()Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao;

    move-result-object v0

    invoke-interface {v0}, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao;->getHistoryRecordList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getMappedAddress(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "address"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->getHistoryRecordByMac(Ljava/lang/String;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getMappedAddress()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getAddress()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public isMatchDevice(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "address",
            "address1"
        }
    .end annotation

    invoke-static {p1}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p2}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->getMappedAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    :cond_0
    if-nez v0, :cond_1

    invoke-virtual {p0, p2}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->getMappedAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/bluetooth/BluetoothAdapter;->checkBluetoothAddress(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    return v0

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public saveHistoryRecord(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10,
            0x10
        }
        names = {
            "device",
            "connectWay"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 3
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mThreadPool:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasConnectPermission(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O1OXi;

    invoke-direct {v1, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/O1OXi;-><init>(Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;Landroid/bluetooth/BluetoothDevice;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    :cond_1
    :goto_0
    return-void
.end method

.method public saveHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "historyRecord"
        }
    .end annotation

    if-nez p1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mBtConnectDatabase:Lcom/jieli/bluetooth_connect/data/BtConnectDatabase;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/data/BtConnectDatabase;->historyRecordDao()Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao;->addHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    .line 2
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mObserver:Lcom/jieli/bluetooth_connect/data/HistoryRecordObserver;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/data/HistoryRecordObserver;->onInsert(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public syncSystemDeviceList(Lcom/jieli/bluetooth_connect/bean/BluetoothOption;)V
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "option"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/bean/BluetoothOption;->isNotAssociatedEDR()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->isBluetoothEnable()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->getHistoryRecordList()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->getPairedDevices(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    invoke-virtual {v2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getConnectType()I

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getMappedAddress()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_4

    goto :goto_0

    :cond_4
    if-eqz v0, :cond_6

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v2}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;->getAddress()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v5, v4}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->isMatchDevice(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/4 v2, 0x0

    :cond_6
    if-eqz v2, :cond_3

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_7
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_8

    invoke-virtual {p0, v1}, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->clearHistoryRecords(Ljava/util/List;)V

    :cond_8
    :goto_1
    return-void
.end method

.method public updateDeviceIDs(Landroid/bluetooth/BluetoothDevice;III)V
    .locals 7
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10,
            0x10,
            0x10,
            0x10
        }
        names = {
            "device",
            "vid",
            "uid",
            "pid"
        }
    .end annotation

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mThreadPool:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O0iOIIiIi;

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/O0iOIIiIi;-><init>(Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;Landroid/bluetooth/BluetoothDevice;III)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    :cond_1
    :goto_0
    return-void
.end method

.method public updateDeviceInfo(Landroid/bluetooth/BluetoothDevice;ILjava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10,
            0x10,
            0x10
        }
        names = {
            "device",
            "sdkFlag",
            "mappedAddress"
        }
    .end annotation

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mThreadPool:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IXX1IiO0;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/IXX1IiO0;-><init>(Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;Landroid/bluetooth/BluetoothDevice;ILjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    :cond_1
    :goto_0
    return-void
.end method

.method public updateGpsInfo(Landroid/bluetooth/BluetoothDevice;IDDJ)V
    .locals 11
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10,
            0x10,
            0x0,
            0x0,
            0x0
        }
        names = {
            "device",
            "devFlag",
            "latitude",
            "longitude",
            "updateTime"
        }
    .end annotation

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mThreadPool:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mThreadPool:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/Xii11;

    move-object v2, p0

    move-object v3, p1

    move v8, p2

    move-wide v4, p3

    move-wide/from16 v6, p5

    move-wide/from16 v9, p7

    invoke-direct/range {v1 .. v10}, Lcom/android/mltcode/paycertificationapi/Xii11;-><init>(Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;Landroid/bluetooth/BluetoothDevice;DDIJ)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    :cond_1
    :goto_0
    return-void
.end method

.method public updateHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "historyRecord"
        }
    .end annotation

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mBtConnectDatabase:Lcom/jieli/bluetooth_connect/data/BtConnectDatabase;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/data/BtConnectDatabase;->historyRecordDao()Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/jieli/bluetooth_connect/data/dao/HistoryRecordDao;->updateHistoryRecord(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/data/HistoryRecordDbHelper;->mObserver:Lcom/jieli/bluetooth_connect/data/HistoryRecordObserver;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/data/HistoryRecordObserver;->onModify(Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;)V

    :cond_1
    :goto_0
    return-void
.end method
