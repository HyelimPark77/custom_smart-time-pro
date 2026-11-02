.class public Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/tool/data_handler/IDataHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler$TimeOutCheck;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;

.field private final c:Lcom/jieli/jl_bt_ota/interfaces/command/OnDataHandlerListener;

.field private final d:Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;

.field private final e:Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;

.field private final f:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/jieli/jl_bt_ota/model/data/SendDataInfo<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final g:Landroid/os/HandlerThread;

.field private final h:Landroid/os/Handler;

.field private final i:Landroid/os/Handler;

.field private j:Lcom/jieli/jl_bt_ota/model/base/CommandBase;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;Lcom/jieli/jl_bt_ota/interfaces/command/OnDataHandlerListener;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a:Ljava/lang/String;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Landroid/os/HandlerThread;

    const-string v2, "RcspDataHandler"

    invoke-direct {v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->g:Landroid/os/HandlerThread;

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->i:Landroid/os/Handler;

    const-string v2, "IBtProxy can not be null."

    invoke-static {p1, v2}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->b:Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;

    iput-object p2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->c:Lcom/jieli/jl_bt_ota/interfaces/command/OnDataHandlerListener;

    new-instance p1, Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;

    invoke-direct {p1}, Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->d:Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;

    new-instance p1, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;

    invoke-direct {p1}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->e:Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    new-instance p1, Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p2

    new-instance v1, Lcom/android/mltcode/paycertificationapi/kd2;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/kd2;-><init>()V

    invoke-direct {p1, p2, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->h:Landroid/os/Handler;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, ""

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "init"

    invoke-static {v0, p2, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic O00(Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a(Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a(Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->b(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;Lcom/jieli/jl_bt_ota/model/base/BaseError;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a(Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;Lcom/jieli/jl_bt_ota/model/base/BaseError;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V

    return-void
.end method

.method private a()J
    .locals 2

    .line 25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BasePacket;)Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_bt_ota/model/base/BasePacket;",
            ")",
            "Lcom/jieli/jl_bt_ota/model/data/SendDataInfo<",
            "*>;"
        }
    .end annotation

    .line 27
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_3

    if-nez p2, :cond_0

    goto :goto_1

    .line 28
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    .line 29
    invoke-virtual {v2}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getCommand()Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_0

    .line 30
    :cond_2
    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getId()I

    move-result v4

    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->getOpCode()I

    move-result v5

    if-ne v4, v5, :cond_1

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getOpCodeSn()I

    move-result v3

    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->getOpCodeSn()I

    move-result v4

    if-ne v3, v4, :cond_1

    .line 31
    invoke-virtual {v2}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    invoke-static {p1, v3}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v2

    :cond_3
    :goto_1
    return-object v1
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a:Ljava/lang/String;

    return-object p0
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;II)V
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->d:Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;

    invoke-virtual {v0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;->removeCommandBase(Landroid/bluetooth/BluetoothDevice;II)V

    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_bt_ota/model/base/CommandBase<",
            "**>;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    goto :goto_0

    .line 46
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "device : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "RX"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->isResponseCmd()Z

    move-result v0

    if-nez v0, :cond_2

    .line 48
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->j:Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    invoke-virtual {p2, v0}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 49
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Same as the previous command, skip this commands. opCode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getId()I

    move-result v1

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatInt(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sn : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->getOpCodeSn()I

    move-result p2

    invoke-static {p2}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatInt(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 51
    invoke-static {p1, v2, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 52
    :cond_1
    iput-object p2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->j:Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    .line 53
    :cond_2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->c:Lcom/jieli/jl_bt_ota/interfaces/command/OnDataHandlerListener;

    if-eqz v0, :cond_3

    .line 54
    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_bt_ota/interfaces/command/OnDataHandlerListener;->onReceivedCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    :cond_3
    :goto_0
    return-void
.end method

.method private synthetic a(Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;Lcom/jieli/jl_bt_ota/model/base/BaseError;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 40
    invoke-interface {p1, p2}, Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;->onErrCode(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    .line 41
    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->c:Lcom/jieli/jl_bt_ota/interfaces/command/OnDataHandlerListener;

    if-eqz p1, :cond_1

    .line 42
    invoke-virtual {p3}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p3

    invoke-interface {p1, p3, p2}, Lcom/jieli/jl_bt_ota/interfaces/command/OnDataHandlerListener;->onRCSPError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    :cond_1
    return-void
.end method

.method private static synthetic a(Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V
    .locals 0

    .line 45
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getCommand()Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;->onCommandResponse(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    return-void
.end method

.method private synthetic a(Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;)V
    .locals 8

    .line 7
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    .line 8
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;->getData()[B

    move-result-object v1

    .line 9
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->e:Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;->getDeviceSendMtu()I

    move-result p1

    invoke-virtual {v2, p1, v1}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->findPacketData(I[B)Ljava/util/ArrayList;

    move-result-object p1

    const-string v2, "addRecvData"

    if-eqz p1, :cond_5

    .line 10
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_2

    .line 11
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_4

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    check-cast v4, Lcom/jieli/jl_bt_ota/model/base/BasePacket;

    .line 12
    invoke-virtual {v4}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->getType()I

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_1

    const/4 v5, 0x0

    .line 13
    invoke-static {v4, v5}, Lcom/jieli/jl_bt_ota/tool/ParseHelper;->convert2Command(Lcom/jieli/jl_bt_ota/model/base/BasePacket;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    move-result-object v4

    invoke-direct {p0, v0, v4}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    goto :goto_0

    .line 14
    :cond_1
    invoke-direct {p0, v0, v4}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BasePacket;)Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    move-result-object v5

    if-nez v5, :cond_2

    .line 15
    iget-object v5, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Not found cache send data. "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v2, v4}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 16
    :cond_2
    invoke-direct {p0, v0, v4}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->b(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BasePacket;)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    move-result-object v6

    invoke-static {v4, v6}, Lcom/jieli/jl_bt_ota/tool/ParseHelper;->convert2Command(Lcom/jieli/jl_bt_ota/model/base/BasePacket;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    move-result-object v6

    if-nez v6, :cond_3

    const/16 v6, 0x3005

    .line 17
    invoke-static {v6}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v6

    invoke-virtual {v4}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->getOpCode()I

    move-result v7

    invoke-virtual {v6, v7}, Lcom/jieli/jl_bt_ota/model/base/BaseError;->setOpCode(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v6

    invoke-direct {p0, v5, v6}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    goto :goto_1

    .line 18
    :cond_3
    invoke-direct {p0, v0, v6}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    .line 19
    invoke-virtual {v5, v6}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->setCommand(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    .line 20
    invoke-direct {p0, v5}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V

    .line 21
    :goto_1
    iget-object v6, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v6, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 22
    iget-object v6, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->h:Landroid/os/Handler;

    invoke-direct {p0, v5}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->d(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)I

    move-result v5

    invoke-virtual {v6, v5}, Landroid/os/Handler;->removeMessages(I)V

    .line 23
    invoke-virtual {v4}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->getOpCode()I

    move-result v5

    invoke-virtual {v4}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->getOpCodeSn()I

    move-result v4

    invoke-direct {p0, v0, v5, v4}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a(Landroid/bluetooth/BluetoothDevice;II)V

    goto :goto_0

    :cond_4
    return-void

    .line 24
    :cond_5
    :goto_2
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Not found Command. data : "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v2, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C:",
            "Lcom/jieli/jl_bt_ota/model/base/CommandBase<",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/BaseParameter;",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/CommonResponse;",
            ">;>(",
            "Lcom/jieli/jl_bt_ota/model/data/SendDataInfo<",
            "TC;>;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getCallback()Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;

    move-result-object v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    .line 44
    :cond_1
    new-instance v1, Lcom/android/mltcode/paycertificationapi/ld2;

    invoke-direct {v1, v0, p1}, Lcom/android/mltcode/paycertificationapi/ld2;-><init>(Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V

    invoke-direct {p0, v1}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method private a(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/model/data/SendDataInfo<",
            "*>;",
            "Lcom/jieli/jl_bt_ota/model/base/BaseError;",
            ")V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "callError"

    if-nez p2, :cond_1

    .line 35
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a:Ljava/lang/String;

    const-string p2, "error is null"

    invoke-static {p1, v0, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 36
    :cond_1
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getOpCode()I

    move-result v1

    invoke-virtual {p2, v1}, Lcom/jieli/jl_bt_ota/model/base/BaseError;->setOpCode(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v1

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getSn()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_bt_ota/model/base/BaseError;->setCmdSn(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    .line 37
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getCallback()Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;

    move-result-object v1

    .line 38
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "device : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    new-instance v0, Lcom/android/mltcode/paycertificationapi/nd2;

    invoke-direct {v0, p0, v1, p2, p1}, Lcom/android/mltcode/paycertificationapi/nd2;-><init>(Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;Lcom/jieli/jl_bt_ota/model/base/BaseError;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;Landroid/bluetooth/BluetoothDevice;II)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a(Landroid/bluetooth/BluetoothDevice;II)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method private a(Ljava/lang/Runnable;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 32
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    .line 33
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    .line 34
    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->i:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static synthetic a(Landroid/os/Message;)Z
    .locals 1

    .line 4
    iget-object p0, p0, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, p0, Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 5
    check-cast p0, Ljava/lang/Runnable;

    .line 6
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method private b(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BasePacket;)Lcom/jieli/jl_bt_ota/model/base/CommandBase;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_bt_ota/model/base/BasePacket;",
            ")",
            "Lcom/jieli/jl_bt_ota/model/base/CommandBase<",
            "**>;"
        }
    .end annotation

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->d:Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;

    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->getOpCode()I

    move-result v1

    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {v0, p1, v1, p2}, Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic b(Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object p0
.end method

.method private synthetic b(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V
    .locals 4

    .line 2
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->c(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x3002

    .line 3
    invoke-static {v0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void

    .line 4
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "device : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getCommand()Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "TX"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->setSendTime(J)Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    .line 7
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getBasePacket()Lcom/jieli/jl_bt_ota/model/base/BasePacket;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->getHasResponse()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    .line 8
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->d:Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getCommand()Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;->putCommandBase(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    .line 9
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 10
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    :cond_1
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->d(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)I

    move-result v0

    .line 12
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->h:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 13
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->h:Landroid/os/Handler;

    new-instance v2, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler$TimeOutCheck;

    invoke-direct {v2, p0, p1}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler$TimeOutCheck;-><init>(Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V

    invoke-virtual {v1, v0, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getTimeoutMs()I

    move-result p1

    int-to-long v2, p1

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void

    .line 14
    :cond_2
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getCommand()Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    .line 15
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V

    return-void
.end method

.method private c(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/model/data/SendDataInfo<",
            "*>;)Z"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getSendData()[B

    move-result-object v0

    const-string v1, "sendData"

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    array-length v3, v0

    if-nez v3, :cond_0

    goto :goto_3

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getDeviceReceiveMtu()I

    move-result v3

    array-length v4, v0

    if-le v4, v3, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a:Ljava/lang/String;

    array-length v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v0

    const-string v3, "Data size(%d) exceeds communication mtu(%d)."

    invoke-static {v3, v0}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v2

    :cond_1
    move v3, v2

    :goto_0
    const/4 v4, 0x3

    if-ge v2, v4, :cond_3

    iget-object v3, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->b:Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    invoke-interface {v3, v4, v0}, Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;->writeData(Landroid/bluetooth/BluetoothDevice;[B)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    const-wide/16 v4, 0xa

    :try_start_0
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v4

    invoke-virtual {v4}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_4
    :goto_3
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a:Ljava/lang/String;

    const-string v0, "Failed to pack data."

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v2
.end method

.method private d(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/model/data/SendDataInfo<",
            "*>;)I"
        }
    .end annotation

    if-nez p1, :cond_0

    const p1, 0x7fffffff

    return p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getSn()I

    move-result v0

    shl-int/lit8 v0, v0, 0x10

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getOpCode()I

    move-result p1

    or-int/2addr p1, v0

    return p1
.end method

.method public static synthetic iO(Landroid/os/Message;)Z
    .locals 0

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a(Landroid/os/Message;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public addRecvData(Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->h:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/md2;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/md2;-><init>(Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public addSendData(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/model/data/SendDataInfo<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->h:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/od2;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/od2;-><init>(Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public release()V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->j:Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->h:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->i:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->d:Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;->release()V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->e:Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspParser;->release()V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->g:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->g:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "release"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
