.class public Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_fatfs/interfaces/IBluetoothCtrl;


# static fields
.field public static final e:Ljava/lang/String; = "FatFsBluetoothImp"


# instance fields
.field public final a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

.field public final b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

.field public final c:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

.field public final d:Lcom/jieli/jl_rcsp/tool/WatchCacheManager;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getInstance()Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->c:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/watch/WatchBase;->getRcspOp()Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    new-instance p1, Lcom/jieli/jl_rcsp/tool/WatchCacheManager;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/tool/WatchCacheManager;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->d:Lcom/jieli/jl_rcsp/tool/WatchCacheManager;

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_fatfs/FatFileSystem;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_fatfs/FatFileSystem;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 6
    sget-object v0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    .line 9
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;II)V
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;II)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 0

    .line 7
    invoke-virtual {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;I[B)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;Z)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;Z[B)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;Z[B)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;I)Z
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(I)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->b(Landroid/bluetooth/BluetoothDevice;I[B)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->b(Landroid/bluetooth/BluetoothDevice;Z)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/bluetooth/BluetoothDevice;)V
    .locals 3

    .line 32
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_fatfs/FatFileSystem;

    move-result-object v0

    const-string v1, "checkWriteDataResult"

    if-nez v0, :cond_0

    .line 33
    const-string v0, "No Fat File System."

    invoke-virtual {p0, p1, v1, v0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 34
    :cond_0
    iget-object v2, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->d:Lcom/jieli/jl_rcsp/tool/WatchCacheManager;

    invoke-virtual {v2, p1}, Lcom/jieli/jl_rcsp/tool/WatchCacheManager;->getWatchCacheByDevice(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;

    move-result-object v2

    if-nez v2, :cond_1

    .line 35
    const-string v0, "No write data cache."

    invoke-virtual {p0, p1, v1, v0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const/4 v1, 0x1

    .line 36
    invoke-virtual {v2, v1}, Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;->setNeedCheckReadData(Z)Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;

    .line 37
    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;->getWriteLen()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_fatfs/FatFileSystem;->createReadBuffer(I)V

    .line 38
    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;->getWriteOffset()I

    move-result v0

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;->getWriteLen()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;II)V

    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 10

    .line 24
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_fatfs/FatFileSystem;

    move-result-object v0

    const-string v1, "queryWriteDataResult"

    if-nez v0, :cond_0

    .line 25
    const-string p2, "No Fat File System."

    invoke-virtual {p0, p1, v1, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne p2, v3, :cond_1

    .line 26
    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->getNeedWriteData()[B

    move-result-object v4

    invoke-static {v4, v2}, Lcom/jieli/jl_rcsp/util/CryptoUtil;->CRC16([BS)S

    move-result v2

    move v9, v3

    move v3, v2

    move v2, v9

    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {v0}, Lcom/jieli/jl_fatfs/FatFileSystem;->getCrc16()S

    move-result v3

    .line 28
    :goto_0
    sget-object v4, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e:Ljava/lang/String;

    .line 29
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v6

    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    filled-new-array {v5, v6, v7, v8}, [Ljava/lang/Object;

    move-result-object v5

    .line 30
    const-string v6, "version = %d, crc16 = %d(0x%X), flag = %d."

    invoke-static {v6, v5}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v1, v5}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    iget-object v1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {v2, v3}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildExternalFlashQueryWriteResultCmd(IS)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v2

    new-instance v3, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$6;

    invoke-direct {v3, p0, p2, v0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$6;-><init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;ILcom/jieli/jl_fatfs/FatFileSystem;)V

    invoke-virtual {v1, p1, v2, v3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;II)V
    .locals 6

    .line 39
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->d(Landroid/bluetooth/BluetoothDevice;)I

    move-result v0

    if-nez v0, :cond_0

    .line 40
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->b(Landroid/bluetooth/BluetoothDevice;)I

    move-result v0

    :cond_0
    const-string v1, "handleReadData"

    const/4 v2, 0x0

    if-nez v0, :cond_1

    .line 41
    sget-object p2, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e:Ljava/lang/String;

    const-string p3, "mtu is 0."

    invoke-static {p2, v1, p3}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    new-array p2, v2, [B

    invoke-virtual {p0, p1, v2, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;Z[B)V

    return-void

    .line 43
    :cond_1
    sget-object v3, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "offset = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", size = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v1, v4}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-gt p3, v0, :cond_2

    .line 44
    invoke-virtual {p0, p1, v2, p2, p3}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;III)V

    return-void

    :cond_2
    const/4 p3, 0x1

    .line 45
    invoke-virtual {p0, p1, p3, p2, v0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;III)V

    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;III)V
    .locals 5

    .line 57
    sget-object v0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e:Ljava/lang/String;

    .line 58
    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v1, v2, v3, v4}, [Ljava/lang/Object;

    move-result-object v1

    .line 59
    const-string v2, "device = %s, flag = %d, offset=%d, size=%s"

    invoke-static {v2, v1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "readDataFromDevice"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {p2, p3, p4}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildExternalFlashReadDataCmd(III)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p2

    new-instance p3, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$7;

    invoke-direct {p3, p0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$7;-><init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;)V

    invoke-virtual {v0, p1, p2, p3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;II[B)V
    .locals 3

    .line 22
    sget-object v0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "device ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", offset = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", flag = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "writeDataToDevice"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {p2, p3, p4}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildExternalFlashWriteDataCmd(II[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p2

    new-instance p3, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$3;

    invoke-direct {p3, p0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$3;-><init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;)V

    invoke-virtual {v0, p1, p2, p3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 3

    .line 10
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->b(Landroid/bluetooth/BluetoothDevice;)I

    move-result v0

    const-string v1, "handleWriteFatData"

    if-nez v0, :cond_0

    .line 11
    const-string p2, "mtu is 0."

    invoke-virtual {p0, p1, v1, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_fatfs/FatFileSystem;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 13
    invoke-virtual {v2}, Lcom/jieli/jl_fatfs/FatFileSystem;->writeBufferIsEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    .line 14
    :cond_1
    array-length v1, p3

    const/4 v2, 0x0

    if-gt v1, v0, :cond_2

    goto :goto_0

    .line 15
    :cond_2
    new-array v1, v0, [B

    .line 16
    invoke-static {p3, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v2, 0x1

    move-object p3, v1

    .line 17
    :goto_0
    invoke-virtual {p0, p1, v2, p2, p3}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;II[B)V

    return-void

    .line 18
    :cond_3
    :goto_1
    const-string p2, "FatFs is null or write buffer is empty."

    invoke-virtual {p0, p1, v1, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V
    .locals 3

    .line 19
    sget-object v0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "device : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "updateWriteFailed"

    invoke-static {v0, v1, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 20
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->b(Landroid/bluetooth/BluetoothDevice;Z)V

    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 21
    filled-new-array {p2, p3}, [Ljava/lang/Object;

    move-result-object p2

    const-string p3, "(%s) ---> %s"

    invoke-static {p3, p2}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 0

    .line 61
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_fatfs/FatFileSystem;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 62
    :cond_0
    invoke-virtual {p1, p2}, Lcom/jieli/jl_fatfs/FatFileSystem;->updateFlagStatus(Z)V

    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;Z[B)V
    .locals 6

    .line 46
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_fatfs/FatFileSystem;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 47
    :cond_0
    sget-object v1, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "device : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", isSuccess : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "updateReadResult"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    sget-boolean v2, Lcom/jieli/jl_rcsp/constant/WatchConstant;->ENABLE_WRITE_DATA_CHECK:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->d:Lcom/jieli/jl_rcsp/tool/WatchCacheManager;

    invoke-virtual {v2, p1}, Lcom/jieli/jl_rcsp/tool/WatchCacheManager;->isNeedCheckReadData(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 49
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->d:Lcom/jieli/jl_rcsp/tool/WatchCacheManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/WatchCacheManager;->removeWatchCacheByDevice(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz p2, :cond_2

    .line 50
    invoke-static {p3, v2}, Lcom/jieli/jl_rcsp/util/CryptoUtil;->CRC16([BS)S

    move-result p3

    .line 51
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "readCrc16 : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", cacheCrc16 : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;->getCrc16()S

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", cache offset = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;->getWriteOffset()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v3, v4}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;->getCrc16()S

    move-result v0

    if-ne v0, p3, :cond_2

    .line 53
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->d(Landroid/bluetooth/BluetoothDevice;)I

    move-result p2

    if-eqz p2, :cond_1

    const/4 v2, 0x1

    :cond_1
    invoke-virtual {p0, p1, v2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;I)V

    return-void

    .line 54
    :cond_2
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "isSuccess : "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p2, ", crc is error. "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, v3, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    invoke-virtual {p0, p1, v2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->b(Landroid/bluetooth/BluetoothDevice;Z)V

    return-void

    .line 56
    :cond_3
    invoke-virtual {v0, p2, p3}, Lcom/jieli/jl_fatfs/FatFileSystem;->updateReadStatus(Z[B)V

    return-void
.end method

.method public final a(I)Z
    .locals 1

    .line 63
    sget-boolean v0, Lcom/jieli/jl_rcsp/constant/WatchConstant;->ENABLE_WRITE_DATA_CHECK:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x2000

    if-lt p1, v0, :cond_0

    const/16 v0, 0x4000

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Landroid/bluetooth/BluetoothDevice;)I
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->c:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getExtFlashMsg(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->getBlockSize()I

    move-result p1

    return p1
.end method

.method public final b(Landroid/bluetooth/BluetoothDevice;II[B)V
    .locals 3

    .line 10
    sget-object v0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "device ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", offset = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", flag = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "writeDataToDeviceModify"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {p2, p3, p4}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildExternalFlashWriteDataCmd(II[B)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object p2

    new-instance p3, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$4;

    invoke-direct {p3, p0}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$4;-><init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;)V

    invoke-virtual {v0, p1, p2, p3}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public final b(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 7

    const-string v0, "handleWriteFatDataModify"

    if-eqz p3, :cond_6

    .line 12
    array-length v1, p3

    if-nez v1, :cond_0

    goto/16 :goto_2

    .line 13
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->b(Landroid/bluetooth/BluetoothDevice;)I

    move-result v1

    if-nez v1, :cond_1

    .line 14
    const-string p2, "mtu is 0."

    invoke-virtual {p0, p1, v0, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 15
    :cond_1
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_fatfs/FatFileSystem;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 16
    invoke-virtual {v2}, Lcom/jieli/jl_fatfs/FatFileSystem;->writeBufferIsEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    .line 17
    :cond_2
    invoke-virtual {v2}, Lcom/jieli/jl_fatfs/FatFileSystem;->getLeftDevSize()I

    move-result v3

    .line 18
    sget-object v4, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "lefDevSize = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", mtu = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", leftData length = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v6, p3

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v0, v5}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v4, 0x0

    if-ge v3, v1, :cond_3

    .line 19
    invoke-virtual {v2}, Lcom/jieli/jl_fatfs/FatFileSystem;->getNeedWriteData()[B

    move-result-object v1

    invoke-static {v1, v4}, Lcom/jieli/jl_rcsp/util/CryptoUtil;->CRC16([BS)S

    move-result v1

    .line 20
    iget-object v3, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/CommandBuilder;->buildExternalFlashQueryWriteResultCmd(IS)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    new-instance v1, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$5;

    invoke-direct {v1, p0, v2, p2, p3}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$5;-><init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Lcom/jieli/jl_fatfs/FatFileSystem;I[B)V

    invoke-virtual {v3, p1, v0, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void

    .line 21
    :cond_3
    array-length v3, p3

    if-gt v3, v1, :cond_4

    .line 22
    array-length v1, p3

    invoke-virtual {v2, v1}, Lcom/jieli/jl_fatfs/FatFileSystem;->judgeWriteFinish(I)Z

    move-result v1

    xor-int/2addr v0, v1

    goto :goto_0

    .line 23
    :cond_4
    new-array v2, v1, [B

    .line 24
    invoke-static {p3, v4, v2, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p3, v2

    .line 25
    :goto_0
    invoke-virtual {p0, p1, v0, p2, p3}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->b(Landroid/bluetooth/BluetoothDevice;II[B)V

    return-void

    .line 26
    :cond_5
    :goto_1
    const-string p2, "fatfs is null or write buffer is empty."

    invoke-virtual {p0, p1, v0, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 27
    :cond_6
    :goto_2
    const-string p2, "data is null."

    invoke-virtual {p0, p1, v0, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 3

    .line 6
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    sget-object v0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "device : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", isSuccess : "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "updateWriteResult"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->getWatchSystem()Lcom/jieli/jl_fatfs/FatFileSystem;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 9
    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->getWatchSystem()Lcom/jieli/jl_fatfs/FatFileSystem;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/jieli/jl_fatfs/FatFileSystem;->updateWriteStatus(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final c(Landroid/bluetooth/BluetoothDevice;)I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->c:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getExtFlashMsg(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->getCluster()I

    move-result p1

    return p1
.end method

.method public final d(Landroid/bluetooth/BluetoothDevice;)I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->c:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getExtFlashMsg(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;->getReceiveMtu()I

    move-result p1

    return p1
.end method

.method public final e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_fatfs/FatFileSystem;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;->getWatchSystem()Lcom/jieli/jl_fatfs/FatFileSystem;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getConnectedDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method public readFatDataFromDevice(Landroid/bluetooth/BluetoothDevice;II)V
    .locals 4

    sget-object v0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e:Ljava/lang/String;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "device = %s, offset = %d, size = %d"

    invoke-static {v2, v1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "readFatDataFromDevice"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_fatfs/FatFileSystem;

    move-result-object v1

    if-nez v1, :cond_0

    const-string p2, "No Fat File System."

    invoke-static {v0, v2, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x0

    new-array p3, p2, [B

    invoke-virtual {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;Z[B)V

    return-void

    :cond_0
    invoke-virtual {v1, p3}, Lcom/jieli/jl_fatfs/FatFileSystem;->createReadBuffer(I)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;II)V

    return-void
.end method

.method public release()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->d:Lcom/jieli/jl_rcsp/tool/WatchCacheManager;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/WatchCacheManager;->destroy()V

    return-void
.end method

.method public sendWriteFlag(Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 3

    sget-object v0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e:Ljava/lang/String;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "device = %s, writeFlag = %s"

    invoke-static {v2, v1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "sendWriteFlag"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_fatfs/FatFileSystem;

    move-result-object v1

    if-nez v1, :cond_0

    const-string p2, "No Fat File System."

    invoke-static {v0, v2, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;Z)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->b:Lcom/jieli/jl_rcsp/watch/fatfs/FatFsWatch;

    new-instance v1, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$2;

    invoke-direct {v1, p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp$2;-><init>(Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {v0, p2, v1}, Lcom/jieli/jl_rcsp/watch/WatchBase;->sendWriteProtectFlag(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    return-void
.end method

.method public writeFatDataToDevice(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 6

    sget-object v0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e:Ljava/lang/String;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p3}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "device = %s, offset = %d, \ndata = %s"

    invoke-static {v2, v1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "writeFatDataToDevice"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->e(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_fatfs/FatFileSystem;

    move-result-object v1

    if-nez v1, :cond_0

    const-string p2, "No Fat File System."

    invoke-virtual {p0, p1, v2, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {v1, p3}, Lcom/jieli/jl_fatfs/FatFileSystem;->setWriteBuffer([B)V

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(I)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->d:Lcom/jieli/jl_rcsp/tool/WatchCacheManager;

    new-instance v4, Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;

    invoke-direct {v4}, Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;-><init>()V

    invoke-virtual {v4, p2}, Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;->setWriteOffset(I)Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;

    move-result-object v4

    array-length v5, p3

    invoke-virtual {v4, v5}, Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;->setWriteLen(I)Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {p3, v5}, Lcom/jieli/jl_rcsp/util/CryptoUtil;->CRC16([BS)S

    move-result v5

    invoke-virtual {v4, v5}, Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;->setCrc16(S)Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;

    move-result-object v4

    invoke-virtual {v3, p1, v4}, Lcom/jieli/jl_rcsp/tool/WatchCacheManager;->putWatchCacheByDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/tool/WatchCacheManager$WatchCache;)V

    :cond_1
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->d(Landroid/bluetooth/BluetoothDevice;)I

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v1}, Lcom/jieli/jl_fatfs/FatFileSystem;->getLeftDevSize()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "leftDevSize ==> "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v2, v4}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-lez v3, :cond_2

    invoke-virtual {v1, v3}, Lcom/jieli/jl_fatfs/FatFileSystem;->setNeedWriteData(I)V

    invoke-virtual {v1}, Lcom/jieli/jl_fatfs/FatFileSystem;->getNeedSendLeftData()[B

    move-result-object p3

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->b(Landroid/bluetooth/BluetoothDevice;I[B)V

    return-void

    :cond_3
    invoke-virtual {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/watch/fatfs/FatFsBluetoothImp;->a(Landroid/bluetooth/BluetoothDevice;I[B)V

    return-void
.end method
