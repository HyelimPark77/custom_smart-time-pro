.class public Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/tool/datahandles/DataHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;,
        Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;,
        Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final g:Ljava/lang/String; = "jl_rcsp"


# instance fields
.field public final a:Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;

.field public final b:Landroid/os/Handler;

.field public c:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;

.field public d:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;

.field public volatile e:[B

.field public volatile f:I


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->f:I

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a:Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->b:Landroid/os/Handler;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->b()V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "IBluetoothProxy can not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;)I
    .locals 0

    .line 3
    invoke-static {p0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->b(Landroid/bluetooth/BluetoothDevice;)I

    move-result p0

    return p0
.end method

.method public static a(Landroid/bluetooth/BluetoothDevice;[B)Lcom/jieli/jl_rcsp/model/base/BasePacket;
    .locals 10

    if-eqz p1, :cond_4

    .line 10
    array-length v0, p1

    const/4 v1, 0x4

    if-lt v0, v1, :cond_4

    const/4 v0, 0x0

    .line 11
    aget-byte v2, p1, v0

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->getBooleanArrayBig(B)[B

    move-result-object v2

    const/4 v3, 0x1

    .line 12
    aget-byte v4, p1, v3

    invoke-static {v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v4

    const/4 v5, 0x2

    .line 13
    new-array v6, v5, [B

    .line 14
    invoke-static {p1, v5, v6, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 15
    aget-byte v5, v6, v0

    aget-byte v6, v6, v3

    invoke-static {v5, v6}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v5

    .line 16
    new-instance v6, Lcom/jieli/jl_rcsp/model/base/BasePacket;

    invoke-direct {v6}, Lcom/jieli/jl_rcsp/model/base/BasePacket;-><init>()V

    const/4 v7, 0x7

    .line 17
    aget-byte v8, v2, v7

    invoke-static {v8}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v8

    const/4 v9, 0x6

    .line 18
    aget-byte v2, v2, v9

    invoke-static {v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v2

    .line 19
    invoke-virtual {v6, v8}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->setType(I)Lcom/jieli/jl_rcsp/model/base/BasePacket;

    .line 20
    invoke-virtual {v6, v2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->setHasResponse(I)Lcom/jieli/jl_rcsp/model/base/BasePacket;

    .line 21
    invoke-virtual {v6, v4}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->setOpCode(I)Lcom/jieli/jl_rcsp/model/base/BasePacket;

    .line 22
    invoke-virtual {v6, v5}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->setParamLen(I)Lcom/jieli/jl_rcsp/model/base/BasePacket;

    if-lez v5, :cond_3

    const/4 v2, 0x5

    if-nez v8, :cond_1

    .line 23
    new-array v8, v3, [B

    .line 24
    invoke-static {p1, v1, v8, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 25
    aget-byte v1, v8, v0

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    invoke-virtual {v6, v1}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/BasePacket;

    .line 26
    new-array v1, v3, [B

    .line 27
    invoke-static {p1, v2, v1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 28
    aget-byte v1, v1, v0

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    invoke-virtual {v6, v1}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/BasePacket;

    if-ne v4, v3, :cond_0

    .line 29
    new-array v1, v3, [B

    .line 30
    invoke-static {p1, v9, v1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 31
    aget-byte v1, v1, v0

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    invoke-virtual {v6, v1}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->setXmOpCode(I)Lcom/jieli/jl_rcsp/model/base/BasePacket;

    goto :goto_1

    :cond_0
    :goto_0
    move v7, v9

    goto :goto_1

    .line 32
    :cond_1
    new-array v7, v3, [B

    .line 33
    invoke-static {p1, v1, v7, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 34
    aget-byte v1, v7, v0

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    invoke-virtual {v6, v1}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/BasePacket;

    if-ne v4, v3, :cond_2

    .line 35
    new-array v1, v3, [B

    .line 36
    invoke-static {p1, v2, v1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 37
    aget-byte v1, v1, v0

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    invoke-virtual {v6, v1}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->setXmOpCode(I)Lcom/jieli/jl_rcsp/model/base/BasePacket;

    goto :goto_0

    :cond_2
    move v7, v2

    :goto_1
    add-int/lit8 v1, v7, -0x4

    sub-int/2addr v5, v1

    .line 38
    new-array v1, v5, [B

    .line 39
    invoke-static {p1, v7, v1, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 40
    invoke-virtual {v6, v1}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->setParamData([B)Lcom/jieli/jl_rcsp/model/base/BasePacket;

    .line 41
    invoke-virtual {v6}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v6}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {p1, v0, v1, p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 42
    const-string p1, "packet type : %d, opCode : %d, sn :%d, device : %s"

    invoke-static {p1, p0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "jl_rcsp"

    const-string v0, "parsePacketData"

    invoke-static {p1, v0, p0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    return-object v6

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;)Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->d:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;

    return-object p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;)Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->d:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;

    return-object p1
.end method

.method private a(Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 45
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->b:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O00OI1iX;

    invoke-direct {v1, p1, p2}, Lcom/android/mltcode/paycertificationapi/O00OI1iX;-><init>(Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 0

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a(Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a(Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    return-void
.end method

.method private static b(Landroid/bluetooth/BluetoothDevice;)I
    .locals 1

    .line 6
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getInstance()Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getMaxCommunicationMtu(Landroid/bluetooth/BluetoothDevice;)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;)Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a:Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;

    return-object p0
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/DataInfo;->getRcspCmdCallback()Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 11
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/DataInfo;->getRcspCmdCallback()Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    invoke-interface {v0, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;->onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    :cond_0
    return-void
.end method

.method public static c(Landroid/bluetooth/BluetoothDevice;)I
    .locals 1

    .line 5
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getInstance()Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getMaxReceiveMtu(Landroid/bluetooth/BluetoothDevice;)I

    move-result p0

    return p0
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic d(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->b:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 43
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public final a(Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 2

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->b:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i1i00X0;

    invoke-direct {v1, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/i1i00X0;-><init>(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public final a([BII)V
    .locals 2

    if-eqz p1, :cond_0

    .line 6
    array-length v0, p1

    if-lez v0, :cond_0

    if-ltz p2, :cond_0

    if-lez p3, :cond_0

    add-int v0, p2, p3

    array-length v1, p1

    if-gt v0, v1, :cond_0

    .line 7
    new-array v0, p3, [B

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->e:[B

    .line 8
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->e:[B

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 9
    iput p3, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->f:I

    :cond_0
    return-void
.end method

.method public addRecvData(Lcom/jieli/jl_rcsp/model/DataInfo;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->c:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->b()V

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->c:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;->tryToAddRecvData(Lcom/jieli/jl_rcsp/model/DataInfo;)V

    :cond_1
    return-void
.end method

.method public addSendData(Lcom/jieli/jl_rcsp/model/DataInfo;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->c:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->b()V

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->c:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;->tryToAddSendData(Lcom/jieli/jl_rcsp/model/DataInfo;)V

    :cond_1
    return-void
.end method

.method public final b()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->d:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;-><init>(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->d:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;

    .line 4
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->start()V

    .line 5
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->c()V

    :cond_0
    return-void
.end method

.method public final synthetic b(Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    .line 7
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getRcspCmdCallback()Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getRcspCmdCallback()Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

    move-result-object v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;->onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a:Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;

    invoke-interface {p1, p2}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->callbackErrorEvent(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public final c()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->c:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;

    const-string v1, "Work_Thread"

    invoke-direct {v0, p0, v1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;-><init>(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->c:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->c:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public final d()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->d:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->stopThread()V

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->e()V

    return-void
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->c:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->c:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$WorkThread;

    :cond_0
    return-void
.end method

.method public findPacketData(Landroid/bluetooth/BluetoothDevice;[B)Ljava/util/ArrayList;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "[B)",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_rcsp/model/base/BasePacket;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p2, :cond_d

    array-length v1, p2

    if-lez v1, :cond_d

    array-length v1, p2

    iget v2, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->f:I

    const/4 v3, 0x0

    if-lez v2, :cond_0

    iget v2, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->f:I

    add-int/2addr v2, v1

    new-array v2, v2, [B

    iget-object v4, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->e:[B

    iget v5, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->f:I

    invoke-static {v4, v3, v2, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v4, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->f:I

    invoke-static {p2, v3, v2, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p2, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->f:I

    add-int/2addr v1, p2

    iput v3, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->f:I

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, [B->clone()Ljava/lang/Object;

    move-result-object p2

    move-object v2, p2

    check-cast v2, [B

    :goto_0
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, -0x1

    move v5, v3

    move v6, v4

    :goto_1
    if-ge v5, v1, :cond_e

    move v7, v5

    :goto_2
    if-ge v7, v1, :cond_5

    aget-byte v8, v2, v7

    const/4 v9, -0x2

    if-ne v8, v9, :cond_4

    add-int/lit8 v8, v7, 0x1

    if-ge v8, v1, :cond_3

    aget-byte v8, v2, v8

    const/16 v9, -0x24

    if-ne v8, v9, :cond_4

    add-int/lit8 v8, v7, 0x2

    if-ge v8, v1, :cond_2

    aget-byte v8, v2, v8

    const/16 v9, -0x46

    if-ne v8, v9, :cond_4

    add-int/lit8 v8, v7, 0x3

    if-ge v8, v1, :cond_1

    move v6, v8

    goto :goto_3

    :cond_1
    sub-int v8, v1, v7

    invoke-virtual {p0, v2, v7, v8}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a([BII)V

    goto :goto_3

    :cond_2
    sub-int v8, v1, v7

    invoke-virtual {p0, v2, v7, v8}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a([BII)V

    goto :goto_3

    :cond_3
    sub-int v8, v1, v7

    invoke-virtual {p0, v2, v7, v8}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a([BII)V

    goto :goto_3

    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_5
    :goto_3
    const-string v7, "findPacketData"

    const-string v8, "jl_rcsp"

    if-lez v6, :cond_c

    add-int/lit8 v9, v6, 0x4

    if-gt v9, v1, :cond_b

    const/4 v10, 0x2

    new-array v11, v10, [B

    add-int/lit8 v12, v6, 0x2

    invoke-static {v2, v12, v11, v3, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aget-byte v10, v11, v3

    const/4 v12, 0x1

    aget-byte v11, v11, v12

    invoke-static {v10, v11}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v10

    invoke-static {p1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->c(Landroid/bluetooth/BluetoothDevice;)I

    move-result v11

    if-le v10, v11, :cond_6

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {p1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->c(Landroid/bluetooth/BluetoothDevice;)I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v9, v10}, [Ljava/lang/Object;

    move-result-object v9

    const-string v10, "data length[%d] over MAX_RECEIVE_MTU[%d], cast away"

    invoke-static {v10, v9}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v7, v9}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    add-int/2addr v5, v6

    goto :goto_1

    :cond_6
    add-int/2addr v9, v10

    add-int/lit8 v7, v9, 0x1

    if-gt v7, v1, :cond_a

    aget-byte v8, v2, v9

    const/16 v9, -0x11

    if-ne v8, v9, :cond_9

    add-int/lit8 v10, v10, 0x4

    new-array v5, v10, [B

    invoke-static {v2, v6, v5, v3, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {p1, v5}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a(Landroid/bluetooth/BluetoothDevice;[B)Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-virtual {p2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    if-ne v7, v1, :cond_8

    goto :goto_5

    :cond_8
    move v6, v4

    move v5, v7

    goto/16 :goto_1

    :cond_9
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    :cond_a
    add-int/lit8 v5, v6, -0x3

    sub-int v7, v1, v5

    invoke-virtual {p0, v2, v5, v7}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a([BII)V

    goto :goto_4

    :cond_b
    add-int/lit8 v5, v6, -0x3

    sub-int v7, v1, v5

    invoke-virtual {p0, v2, v5, v7}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a([BII)V

    :goto_4
    move v5, v1

    goto/16 :goto_1

    :cond_c
    const-string p1, "No header data found."

    invoke-static {v8, v7, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_d
    move-object p2, v0

    :cond_e
    :goto_5
    if-eqz p2, :cond_f

    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_f

    return-object p2

    :cond_f
    return-object v0
.end method

.method public release()V
    .locals 3

    const-string v0, "release"

    const-string v1, "=====>>>"

    const-string v2, "jl_rcsp"

    invoke-static {v2, v0, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->release()V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->d()V

    return-void
.end method
