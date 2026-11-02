.class Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "DataHandlerThread"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private volatile b:Z

.field private volatile c:Z

.field private final d:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Lcom/jieli/jl_bt_ota/model/data/DataInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/jieli/jl_bt_ota/model/data/SendDataInfo<",
            "*>;>;"
        }
    .end annotation
.end field

.field private g:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;

.field final synthetic h:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->h:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;

    const-string p1, "DataHandlerThread"

    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    const-class p1, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->a:Ljava/lang/String;

    new-instance p1, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {p1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-void
.end method

.method public static synthetic O00(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->a(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->b(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V
    .locals 0

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->a(Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->a(Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V

    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BasePacket;)Lcom/jieli/jl_bt_ota/model/base/CommandBase;
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

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->h:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->b(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;)Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;

    move-result-object v0

    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->getOpCode()I

    move-result v1

    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->getOpCodeSn()I

    move-result p2

    invoke-virtual {v0, p1, v1, p2}, Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;->getCommand(Landroid/bluetooth/BluetoothDevice;II)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;)Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->g:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;

    return-object p0
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;)Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->g:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;

    return-object p1
.end method

.method private a()V
    .locals 10

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    .line 16
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 17
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;

    .line 18
    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    .line 19
    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;->getDeviceSendMtu()I

    move-result v5

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;->getData()[B

    move-result-object v6

    invoke-static {v4, v5, v6}, Lcom/jieli/jl_bt_ota/tool/ParseHelper;->findPacketData(Landroid/bluetooth/BluetoothDevice;I[B)Ljava/util/ArrayList;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 20
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v6, 0x0

    :cond_2
    :goto_1
    if-ge v6, v3, :cond_0

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v6, v6, 0x1

    check-cast v7, Lcom/jieli/jl_bt_ota/model/base/BasePacket;

    .line 23
    invoke-virtual {v7}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->getType()I

    move-result v8

    const/4 v9, 0x1

    if-ne v8, v9, :cond_4

    .line 24
    invoke-direct {p0, v4, v7}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BasePacket;)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/jieli/jl_bt_ota/tool/ParseHelper;->convert2Command(Lcom/jieli/jl_bt_ota/model/base/BasePacket;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    move-result-object v7

    if-nez v7, :cond_3

    goto :goto_1

    .line 25
    :cond_3
    iget-object v8, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->h:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;

    invoke-static {v8}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->e(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;)Lcom/jieli/jl_bt_ota/interfaces/command/OnDataHandlerListener;

    move-result-object v8

    if-eqz v8, :cond_2

    .line 26
    iget-object v8, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->h:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;

    invoke-static {v8}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->e(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;)Lcom/jieli/jl_bt_ota/interfaces/command/OnDataHandlerListener;

    move-result-object v8

    invoke-interface {v8, v4, v7}, Lcom/jieli/jl_bt_ota/interfaces/command/OnDataHandlerListener;->onReceivedCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    goto :goto_1

    .line 27
    :cond_4
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 28
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    .line 29
    iget-object v2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 30
    :cond_6
    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->a(Ljava/util/ArrayList;)V

    return-void

    :cond_7
    const/4 v0, 0x0

    .line 31
    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->a(Ljava/util/ArrayList;)V

    return-void
.end method

.method private a(I)V
    .locals 4

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->g:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->h:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;

    int-to-long v2, p1

    new-instance p1, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread$1;

    invoke-direct {p1, p0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread$1;-><init>(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;)V

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;-><init>(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;JLcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$ThreadStateListener;)V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->g:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;

    .line 5
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;->start()V

    return-void

    .line 6
    :cond_0
    invoke-static {v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;->a(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;)Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 7
    invoke-static {v0, p1}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;->a(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;Z)Z

    :cond_1
    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;II)V
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->h:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->b(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;)Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/tool/data_handler/CommandCache;->removeCommandBase(Landroid/bluetooth/BluetoothDevice;II)V

    return-void
.end method

.method private static synthetic a(Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V
    .locals 1

    const/4 v0, 0x0

    .line 10
    invoke-interface {p0, v0}, Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;->onCommandResponse(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    return-void
.end method

.method private static synthetic a(Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V
    .locals 0

    .line 63
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getCommand()Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;->onCommandResponse(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    return-void
.end method

.method private a(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V
    .locals 3
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

    .line 61
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getCallback()Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;

    move-result-object v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    .line 62
    :cond_1
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->h:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->d(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;)Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/tool/data_handler/OXO1;

    invoke-direct {v2, v0, p1}, Lcom/jieli/jl_bt_ota/tool/data_handler/OXO1;-><init>(Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private synthetic a(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V
    .locals 2

    const/16 v0, 0x3007

    .line 64
    invoke-static {v0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v0

    .line 65
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getOpCode()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/model/base/BaseError;->setOpCode(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v0

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getSn()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/model/base/BaseError;->setCmdSn(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v0

    if-eqz p2, :cond_0

    .line 66
    invoke-interface {p2, v0}, Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;->onErrCode(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    .line 67
    :cond_0
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->h:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;

    invoke-static {p2}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->e(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;)Lcom/jieli/jl_bt_ota/interfaces/command/OnDataHandlerListener;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 68
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->h:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;

    invoke-static {p2}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->e(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;)Lcom/jieli/jl_bt_ota/interfaces/command/OnDataHandlerListener;

    move-result-object p2

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-interface {p2, p1, v0}, Lcom/jieli/jl_bt_ota/interfaces/command/OnDataHandlerListener;->onRCSPError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    :cond_1
    return-void
.end method

.method private a(Ljava/util/ArrayList;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_bt_ota/model/base/BasePacket;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-eqz v1, :cond_a

    .line 32
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_6

    .line 33
    :cond_0
    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->b()Ljava/util/ArrayList;

    move-result-object v2

    .line 34
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_6

    .line 35
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "waitList size : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "DataHandler"

    const-string v5, "checkHaveResponseList"

    invoke-static {v4, v5, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 37
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v6

    .line 38
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v8, :cond_9

    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v10, v10, 0x1

    check-cast v11, Lcom/jieli/jl_bt_ota/model/base/BasePacket;

    if-nez v11, :cond_3

    :cond_2
    :goto_1
    move-object v15, v2

    const/4 v1, 0x0

    goto/16 :goto_5

    .line 39
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v12

    const/4 v13, 0x0

    :goto_2
    if-ge v13, v12, :cond_2

    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    add-int/lit8 v13, v13, 0x1

    check-cast v14, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    .line 40
    invoke-virtual {v14}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getOpCode()I

    move-result v15

    invoke-virtual {v11}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->getOpCode()I

    move-result v9

    if-ne v15, v9, :cond_5

    invoke-virtual {v14}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getSn()I

    move-result v9

    invoke-virtual {v11}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->getOpCodeSn()I

    move-result v15

    if-ne v9, v15, :cond_5

    .line 41
    invoke-virtual {v14}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v9

    invoke-direct {v0, v9, v11}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BasePacket;)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    move-result-object v9

    invoke-static {v11, v9}, Lcom/jieli/jl_bt_ota/tool/ParseHelper;->convert2Command(Lcom/jieli/jl_bt_ota/model/base/BasePacket;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    move-result-object v9

    .line 42
    invoke-virtual {v14}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getCallback()Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;

    move-result-object v11

    .line 43
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "callback command -> "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v4, v5, v12}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    invoke-virtual {v14}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v12

    invoke-virtual {v14}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getOpCode()I

    move-result v13

    invoke-virtual {v14}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getSn()I

    move-result v15

    invoke-direct {v0, v12, v13, v15}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->a(Landroid/bluetooth/BluetoothDevice;II)V

    if-nez v9, :cond_4

    .line 45
    iget-object v9, v0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->h:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;

    invoke-static {v9}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->d(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;)Landroid/os/Handler;

    move-result-object v9

    new-instance v12, Lcom/jieli/jl_bt_ota/tool/data_handler/O00;

    invoke-direct {v12, v11, v14}, Lcom/jieli/jl_bt_ota/tool/data_handler/O00;-><init>(Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V

    invoke-virtual {v9, v12}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_3

    .line 46
    :cond_4
    invoke-virtual {v14, v9}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->setCommand(Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    .line 47
    invoke-direct {v0, v14}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->a(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V

    .line 48
    :goto_3
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 49
    :cond_5
    invoke-virtual {v14}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getTimeoutMs()I

    move-result v9

    const/16 v15, 0x1f4

    if-ge v9, v15, :cond_6

    .line 50
    invoke-virtual {v14, v15}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->setTimeoutMs(I)Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    .line 51
    :cond_6
    invoke-virtual {v14}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getSendTime()J

    move-result-wide v16

    sub-long v16, v6, v16

    invoke-virtual {v14}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getTimeoutMs()I

    move-result v9

    move-object v15, v2

    int-to-long v1, v9

    cmp-long v1, v16, v1

    if-lez v1, :cond_7

    .line 52
    invoke-virtual {v14}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getReSendCount()I

    move-result v1

    .line 53
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "wait for response timeout !!! reSend count : "

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ", data : "

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v5, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x3

    if-lt v1, v2, :cond_8

    .line 54
    const-string v1, "retry count over time, callbackTimeOutError."

    invoke-static {v4, v5, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    invoke-direct {v0, v14}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->b(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V

    .line 56
    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    const/4 v1, 0x0

    goto :goto_4

    :cond_8
    add-int/lit8 v1, v1, 0x1

    .line 57
    invoke-virtual {v14, v1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->setReSendCount(I)Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    const/4 v1, 0x0

    .line 58
    invoke-virtual {v14, v1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->setSend(Z)Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    :goto_4
    move-object/from16 v1, p1

    move-object v2, v15

    goto/16 :goto_2

    :goto_5
    move-object/from16 v1, p1

    move-object v2, v15

    goto/16 :goto_0

    .line 59
    :cond_9
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_a

    .line 60
    iget-object v1, v0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->removeAll(Ljava/util/Collection;)Z

    :cond_a
    :goto_6
    return-void
.end method

.method private a(Lcom/jieli/jl_bt_ota/model/data/DataInfo;)Z
    .locals 4

    if-eqz p1, :cond_0

    .line 11
    :try_start_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x3

    invoke-virtual {v0, p1, v2, v3, v1}, Ljava/util/concurrent/LinkedBlockingQueue;->offer(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 13
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->f()V

    :cond_1
    return p1
.end method

.method private b()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_bt_ota/model/data/SendDataInfo<",
            "*>;>;"
        }
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    .line 15
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    .line 17
    invoke-virtual {v2}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->isSend()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 18
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private static synthetic b(Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V
    .locals 2

    if-eqz p0, :cond_0

    const/16 v0, 0x3005

    .line 11
    invoke-static {v0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v0

    .line 12
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getOpCode()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/model/base/BaseError;->setOpCode(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v0

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getSn()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/model/base/BaseError;->setCmdSn(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p1

    .line 13
    invoke-interface {p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;->onErrCode(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    :cond_0
    return-void
.end method

.method private b(Lcom/jieli/jl_bt_ota/model/data/DataInfo;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 7
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/DataInfo;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 8
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    check-cast p1, Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->f()V

    return-void

    .line 10
    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    check-cast p1, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private b(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/model/data/SendDataInfo<",
            "*>;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 19
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getCallback()Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;

    move-result-object v0

    .line 20
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getOpCode()I

    move-result v2

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getSn()I

    move-result v3

    invoke-direct {p0, v1, v2, v3}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->a(Landroid/bluetooth/BluetoothDevice;II)V

    .line 21
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->h:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->d(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;)Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/tool/data_handler/XIi00iiXO;

    invoke-direct {v2, p0, p1, v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/XIi00iiXO;-><init>(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private synthetic b(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V
    .locals 2

    const/16 v0, 0x3002

    .line 2
    invoke-static {v0}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getOpCode()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/model/base/BaseError;->setOpCode(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v0

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getSn()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/model/base/BaseError;->setCmdSn(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v0

    if-eqz p2, :cond_0

    .line 4
    invoke-interface {p2, v0}, Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;->onErrCode(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    .line 5
    :cond_0
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->h:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;

    invoke-static {p2}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->e(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;)Lcom/jieli/jl_bt_ota/interfaces/command/OnDataHandlerListener;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 6
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->h:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;

    invoke-static {p2}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->e(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;)Lcom/jieli/jl_bt_ota/interfaces/command/OnDataHandlerListener;

    move-result-object p2

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-interface {p2, p1, v0}, Lcom/jieli/jl_bt_ota/interfaces/command/OnDataHandlerListener;->onRCSPError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    :cond_1
    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->f()V

    return-void
.end method

.method private c()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->a()V

    .line 2
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->d()Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    move-result-object v0

    if-nez v0, :cond_1

    .line 3
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->b()Ljava/util/ArrayList;

    move-result-object v0

    .line 4
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x1f4

    .line 5
    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->a(I)V

    return-void

    .line 6
    :cond_0
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->e()V

    return-void

    .line 7
    :cond_1
    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->d(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V

    return-void
.end method

.method private c(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/model/data/SendDataInfo<",
            "*>;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 9
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getCallback()Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;

    move-result-object v0

    .line 10
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->h:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->d(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;)Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/tool/data_handler/iO;

    invoke-direct {v2, p0, p1, v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/iO;-><init>(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private d()Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/jieli/jl_bt_ota/model/data/SendDataInfo<",
            "*>;"
        }
    .end annotation

    .line 21
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    .line 23
    invoke-virtual {v2}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->isSend()Z

    move-result v3

    if-nez v3, :cond_1

    return-object v2

    :cond_2
    return-object v1
.end method

.method private d(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/model/data/SendDataInfo<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getSendData()[B

    move-result-object v0

    const-string v1, "sendData"

    const-string v2, "DataHandler"

    if-eqz v0, :cond_7

    .line 2
    array-length v3, v0

    if-nez v3, :cond_0

    goto/16 :goto_4

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getDeviceReceiveMtu()I

    move-result v3

    .line 4
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "data : ["

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "], sendMtu = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v1, v4}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    array-length v4, v0

    add-int/lit8 v5, v3, 0x8

    if-le v4, v5, :cond_1

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "data over communication mtu ["

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "] limit."

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->c(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V

    return-void

    :cond_1
    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/4 v5, 0x3

    if-ge v3, v5, :cond_3

    .line 8
    iget-object v4, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->h:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;

    invoke-static {v4}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->c(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;)Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;

    move-result-object v4

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v5

    invoke-interface {v4, v5, v0}, Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;->writeData(Landroid/bluetooth/BluetoothDevice;[B)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    const-wide/16 v5, 0xa

    .line 9
    :try_start_0
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v5

    .line 10
    invoke-virtual {v5}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 11
    :cond_3
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v4, :cond_4

    .line 12
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->c(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V

    goto :goto_3

    .line 13
    :cond_4
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getBasePacket()Lcom/jieli/jl_bt_ota/model/base/BasePacket;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/base/BasePacket;->getHasResponse()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 14
    invoke-virtual {p1, v1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->setSend(Z)Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    .line 15
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->setSendTime(J)Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    goto :goto_3

    .line 16
    :cond_5
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->getCallback()Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 17
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->h:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->d(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;)Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_bt_ota/tool/data_handler/XO0O10;

    invoke-direct {v2, v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/XO0O10;-><init>(Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 18
    :cond_6
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    :goto_3
    return-void

    .line 19
    :cond_7
    :goto_4
    const-string v0, "pack data error."

    invoke-static {v2, v1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->c(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V

    return-void
.end method

.method private e()V
    .locals 4

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->g:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;->a(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "stopTimer"

    const-string v2, ""

    const-string v3, "DataHandler"

    invoke-static {v3, v1, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$TimerThread;->a()V

    :cond_0
    return-void
.end method

.method private f()V
    .locals 4

    iget-boolean v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->c:Z

    if-eqz v1, :cond_0

    const-string v1, "DataHandler"

    const-string v2, "wakeUpThread"

    const-string v3, "notifyAll"

    invoke-static {v1, v2, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    return-void
.end method

.method public static synthetic iO(Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->b(Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    monitor-enter v0

    :goto_0
    :try_start_0
    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->b:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->c:Z

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->c()V

    const-string v1, "DataHandler"

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->a:Ljava/lang/String;

    const-string v3, "Thread is waiting..."

    invoke-static {v1, v2, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :cond_0
    iput-boolean v2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->c:Z

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/LinkedBlockingQueue;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_bt_ota/model/data/DataInfo;

    invoke-direct {p0, v1}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->b(Lcom/jieli/jl_bt_ota/model/data/DataInfo;)V

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->c()V

    goto :goto_0

    :cond_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->a:Ljava/lang/String;

    const-string v1, "DataHandler"

    const-string v3, "exit..."

    invoke-static {v1, v0, v3}, Lcom/jieli/jl_bt_ota/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    iput-boolean v2, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->b:Z

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->e()V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->h:Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;->a(Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler;Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;)Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;

    return-void

    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public declared-synchronized start()V
    .locals 3

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->b:Z

    invoke-super {p0}, Ljava/lang/Thread;->start()V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->a:Ljava/lang/String;

    const-string v1, "DataHandler"

    const-string v2, "start...."

    invoke-static {v1, v0, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
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
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->a:Ljava/lang/String;

    const-string v1, "DataHandler"

    const-string v2, "stopThread"

    invoke-static {v1, v0, v2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->b:Z

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->f()V

    return-void
.end method

.method public tryToAddRecvData(Lcom/jieli/jl_bt_ota/model/data/DataInfo;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->a(Lcom/jieli/jl_bt_ota/model/data/DataInfo;)Z

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, ",isWaiting = "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->c:Z

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "DataHandler"

    const-string v1, "tryToAddRecvData"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public tryToAddSendData(Lcom/jieli/jl_bt_ota/model/data/DataInfo;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->a(Lcom/jieli/jl_bt_ota/model/data/DataInfo;)Z

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, ",isWaiting = "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean p1, p0, Lcom/jieli/jl_bt_ota/tool/data_handler/DataHandler$DataHandlerThread;->c:Z

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "DataHandler"

    const-string v1, "tryToAddSendData"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
