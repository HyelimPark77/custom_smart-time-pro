.class Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "DataHandlerThread"
.end annotation


# instance fields
.field public volatile a:Z

.field public volatile b:Z

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/DataInfo;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Lcom/jieli/jl_rcsp/model/DataInfo;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/DataInfo;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/DataInfo;",
            ">;"
        }
    .end annotation
.end field

.field public g:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;

.field public final synthetic h:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->h:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    const-string p1, "DataHandlerThread"

    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->c:Ljava/util/List;

    new-instance p1, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {p1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->e:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->f:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;)Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->g:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;

    return-object p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;)Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->g:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;

    return-object p1
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->g()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    .line 13
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 15
    new-instance v3, Ljava/util/ArrayList;

    iget-object v4, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->c:Ljava/util/List;

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/jieli/jl_rcsp/model/DataInfo;

    .line 16
    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v5

    if-nez v5, :cond_0

    .line 17
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 18
    :cond_0
    iget-object v6, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->h:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    invoke-static {v6}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->b(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;)Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;

    move-result-object v6

    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->receiveDataFromDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V

    .line 19
    invoke-virtual {v5}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_1

    .line 20
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 22
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    .line 23
    iget-object v3, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->c:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 24
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    .line 25
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->c:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 26
    :cond_4
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->a(Ljava/util/ArrayList;)V

    return-void

    :cond_5
    const/4 v0, 0x0

    .line 27
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->a(Ljava/util/ArrayList;)V

    return-void
.end method

.method public final a(I)V
    .locals 4

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->g:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;

    if-nez v0, :cond_0

    .line 4
    new-instance v0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->h:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    int-to-long v2, p1

    new-instance p1, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread$1;

    invoke-direct {p1, p0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread$1;-><init>(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;)V

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;-><init>(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;JLcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->g:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;

    .line 5
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;->start()V

    return-void

    .line 6
    :cond_0
    invoke-static {v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;->a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->g:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;->a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;Z)Z

    :cond_1
    return-void
.end method

.method public final synthetic a(Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/BasePacket;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V
    .locals 2

    .line 89
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->convert2Command(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    if-nez v0, :cond_0

    .line 90
    new-instance v0, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v1, 0x3001

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(I)V

    .line 91
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/base/BaseError;->setOpCode(I)Lcom/jieli/jl_rcsp/model/base/BaseError;

    .line 92
    iget-object p2, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->h:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    invoke-static {p2, p1, v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    goto :goto_0

    .line 93
    :cond_0
    iget-object p2, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->h:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    invoke-static {p2, p1, v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    .line 94
    :goto_0
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object p2

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2, p1, p3}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->removeCommandBase(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V

    return-void
.end method

.method public final a(Ljava/util/ArrayList;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_rcsp/model/DataInfo;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 28
    iget-object v2, v0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->f:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const-string v3, "checkHaveResponseList"

    const-string v4, "jl_rcsp"

    if-nez v2, :cond_11

    .line 29
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->c()Ljava/util/ArrayList;

    move-result-object v2

    .line 30
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "waitList size : "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v2, :cond_0

    const/4 v7, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v7

    :goto_0
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v3, v5}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v2, :cond_12

    .line 31
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_12

    .line 32
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 33
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 34
    iget-object v8, v0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->h:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    invoke-static {v8}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->c(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;)J

    move-result-wide v8

    const-string v11, ", data : "

    if-eqz v1, :cond_b

    .line 35
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_b

    .line 36
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_1
    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_8

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/jieli/jl_rcsp/model/DataInfo;

    .line 37
    invoke-virtual {v14}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v15

    if-nez v15, :cond_2

    goto :goto_1

    .line 38
    :cond_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "opCode : "

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v10

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, ", sn : "

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v10

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, ", device : "

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    invoke-virtual {v14}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v10

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 40
    invoke-static {v4, v3, v6}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/jieli/jl_rcsp/model/DataInfo;

    .line 42
    invoke-virtual {v10}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v12

    move-object/from16 v16, v2

    if-eqz v12, :cond_3

    .line 43
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v17, v6

    const-string v6, "packet opCode : "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", packet sn : "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    move-object/from16 v17, v6

    :goto_3
    if-eqz v12, :cond_4

    .line 44
    invoke-virtual {v12}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v2

    invoke-virtual {v15}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v6

    if-ne v2, v6, :cond_4

    .line 45
    invoke-virtual {v12}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v2

    invoke-virtual {v15}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v6

    if-ne v2, v6, :cond_4

    .line 46
    invoke-virtual {v10}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v14}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v6

    invoke-static {v2, v6}, Lcom/jieli/jl_rcsp/util/RcspUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 47
    const-string v2, "callback"

    invoke-static {v4, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    iget-object v2, v0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->h:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    invoke-static {v2}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->d(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;)Landroid/os/Handler;

    move-result-object v2

    new-instance v6, Lcom/jieli/jl_rcsp/tool/datahandles/OXO1;

    invoke-direct {v6, v0, v10, v15, v12}, Lcom/jieli/jl_rcsp/tool/datahandles/OXO1;-><init>(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/BasePacket;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V

    invoke-virtual {v2, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 49
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, v16

    goto/16 :goto_1

    .line 51
    :cond_4
    invoke-virtual {v10}, Lcom/jieli/jl_rcsp/model/DataInfo;->getTimeoutMs()I

    move-result v2

    const/16 v6, 0x1f4

    if-ge v2, v6, :cond_5

    .line 52
    invoke-virtual {v10, v6}, Lcom/jieli/jl_rcsp/model/DataInfo;->setTimeoutMs(I)Lcom/jieli/jl_rcsp/model/DataInfo;

    .line 53
    :cond_5
    invoke-virtual {v10}, Lcom/jieli/jl_rcsp/model/DataInfo;->getSendTime()J

    move-result-wide v18

    sub-long v18, v8, v18

    invoke-virtual {v10}, Lcom/jieli/jl_rcsp/model/DataInfo;->getTimeoutMs()I

    move-result v2

    move-wide/from16 v20, v8

    int-to-long v8, v2

    cmp-long v2, v18, v8

    if-lez v2, :cond_6

    .line 54
    invoke-virtual {v10}, Lcom/jieli/jl_rcsp/model/DataInfo;->getReSendCount()I

    move-result v2

    .line 55
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "wait for response timeout !!! reSend count : "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v3, v6}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v6, 0x3

    if-lt v2, v6, :cond_7

    .line 56
    const-string v2, "retry count over time, callbackTimeOutError."

    invoke-static {v4, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    invoke-virtual {v0, v10}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->b(Lcom/jieli/jl_rcsp/model/DataInfo;)V

    .line 58
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    :goto_4
    move-object/from16 v2, v16

    move-object/from16 v6, v17

    move-wide/from16 v8, v20

    goto/16 :goto_2

    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 60
    invoke-virtual {v10, v2}, Lcom/jieli/jl_rcsp/model/DataInfo;->setReSendCount(I)Lcom/jieli/jl_rcsp/model/DataInfo;

    const/4 v2, 0x0

    .line 61
    invoke-virtual {v10, v2}, Lcom/jieli/jl_rcsp/model/DataInfo;->setSend(Z)Lcom/jieli/jl_rcsp/model/DataInfo;

    goto :goto_4

    :cond_8
    move-object/from16 v16, v2

    move-wide/from16 v20, v8

    .line 62
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_9

    .line 63
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 64
    iget-object v2, v0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->c:Ljava/util/List;

    invoke-interface {v2, v5}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 65
    :cond_9
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_a

    .line 66
    const-string v2, "remove unused response."

    invoke-static {v4, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    iget-object v2, v0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->c:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 68
    :cond_a
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_c

    .line 69
    iget-object v1, v0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->f:Ljava/util/List;

    invoke-interface {v1, v7}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 70
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 71
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->c()Ljava/util/ArrayList;

    move-result-object v2

    goto :goto_5

    :cond_b
    move-object/from16 v16, v2

    move-wide/from16 v20, v8

    :cond_c
    move-object/from16 v2, v16

    :goto_5
    if-eqz v2, :cond_12

    .line 72
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_12

    .line 73
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_d
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_rcsp/model/DataInfo;

    .line 74
    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/DataInfo;->getTimeoutMs()I

    move-result v5

    const/16 v6, 0x1f4

    if-ge v5, v6, :cond_e

    .line 75
    invoke-virtual {v2, v6}, Lcom/jieli/jl_rcsp/model/DataInfo;->setTimeoutMs(I)Lcom/jieli/jl_rcsp/model/DataInfo;

    .line 76
    :cond_e
    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/DataInfo;->getSendTime()J

    move-result-wide v8

    sub-long v8, v20, v8

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/DataInfo;->getTimeoutMs()I

    move-result v5

    int-to-long v12, v5

    cmp-long v5, v8, v12

    if-lez v5, :cond_d

    .line 77
    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/DataInfo;->getReSendCount()I

    move-result v5

    .line 78
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "wait for response timeout 222222 !!! reSend count : "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v4, v3, v8}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v8, 0x3

    if-lt v5, v8, :cond_f

    .line 79
    const-string v5, "retry count over time 222222, callbackTimeOutError."

    invoke-static {v4, v3, v5}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->b(Lcom/jieli/jl_rcsp/model/DataInfo;)V

    .line 81
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_f
    add-int/lit8 v5, v5, 0x1

    .line 82
    invoke-virtual {v2, v5}, Lcom/jieli/jl_rcsp/model/DataInfo;->setReSendCount(I)Lcom/jieli/jl_rcsp/model/DataInfo;

    const/4 v5, 0x0

    .line 83
    invoke-virtual {v2, v5}, Lcom/jieli/jl_rcsp/model/DataInfo;->setSend(Z)Lcom/jieli/jl_rcsp/model/DataInfo;

    goto :goto_6

    .line 84
    :cond_10
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_12

    .line 85
    iget-object v1, v0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->f:Ljava/util/List;

    invoke-interface {v1, v7}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    return-void

    :cond_11
    if-eqz v1, :cond_12

    .line 86
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_12

    .line 87
    const-string v2, "22222 remove unused response."

    invoke-static {v4, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    iget-object v2, v0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->c:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    :cond_12
    return-void
.end method

.method public final a(Lcom/jieli/jl_rcsp/model/DataInfo;)Z
    .locals 4

    if-eqz p1, :cond_0

    .line 8
    :try_start_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x3

    invoke-virtual {v0, p1, v2, v3, v1}, Ljava/util/concurrent/LinkedBlockingQueue;->offer(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 10
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->g()V

    :cond_1
    return p1
.end method

.method public final b()V
    .locals 9

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    const-string v2, "checkResponseListModify"

    const-string v3, "jl_rcsp"

    if-nez v0, :cond_4

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "start --> size = "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->c:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    iget-object v4, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->c:Ljava/util/List;

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 5
    iget-object v4, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->c:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 6
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/jieli/jl_rcsp/model/DataInfo;

    .line 7
    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v5

    .line 8
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Receive command --> "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v2, v6}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v5, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {v5}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v6

    if-ne v6, v1, :cond_1

    .line 10
    iget-object v6, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->h:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    invoke-static {v6}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->b(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;)Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;

    move-result-object v6

    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    invoke-interface {v6, v4, v5}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->receiveDataFromDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V

    goto :goto_0

    .line 11
    :cond_1
    invoke-virtual {p0, v4}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->c(Lcom/jieli/jl_rcsp/model/DataInfo;)Lcom/jieli/jl_rcsp/model/DataInfo;

    move-result-object v6

    .line 12
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Cache Command --> size = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->f:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, "\t"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v2, v7}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v6, :cond_2

    .line 13
    const-string v4, "No cached command found."

    invoke-static {v3, v2, v4}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 14
    :cond_2
    iget-object v7, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->f:Ljava/util/List;

    invoke-interface {v7, v6}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 15
    invoke-virtual {v6}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v7

    invoke-static {v7, v5}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->convert2Command(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v7

    if-nez v7, :cond_3

    .line 16
    new-instance v4, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v7, 0x3001

    invoke-direct {v4, v7}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(I)V

    .line 17
    invoke-virtual {v5}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v7

    invoke-virtual {v4, v7}, Lcom/jieli/jl_rcsp/model/base/BaseError;->setOpCode(I)Lcom/jieli/jl_rcsp/model/base/BaseError;

    .line 18
    iget-object v7, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->h:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    invoke-static {v7, v6, v4}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    goto :goto_1

    .line 19
    :cond_3
    iget-object v8, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->h:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    invoke-static {v8}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->b(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;)Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;

    move-result-object v8

    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    invoke-interface {v8, v4, v5}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->receiveDataFromDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V

    .line 20
    iget-object v4, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->h:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    invoke-static {v4, v6, v7}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    .line 21
    :goto_1
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v4

    invoke-virtual {v6}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v6

    invoke-virtual {v4, v6, v5}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->removeCommandBase(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V

    goto/16 :goto_0

    .line 22
    :cond_4
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    iget-object v4, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->f:Ljava/util/List;

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/jieli/jl_rcsp/model/DataInfo;

    .line 24
    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/DataInfo;->isSend()Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_2

    .line 25
    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 26
    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/DataInfo;->getSendTime()J

    move-result-wide v7

    sub-long/2addr v5, v7

    .line 27
    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/DataInfo;->getTimeoutMs()I

    move-result v7

    const/16 v8, 0x1f4

    if-ge v7, v8, :cond_6

    .line 28
    invoke-virtual {v4, v8}, Lcom/jieli/jl_rcsp/model/DataInfo;->setTimeoutMs(I)Lcom/jieli/jl_rcsp/model/DataInfo;

    .line 29
    :cond_6
    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/DataInfo;->getTimeoutMs()I

    move-result v7

    int-to-long v7, v7

    cmp-long v5, v5, v7

    if-gez v5, :cond_7

    goto :goto_2

    .line 30
    :cond_7
    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/DataInfo;->getReSendCount()I

    move-result v5

    const/4 v6, 0x3

    if-le v5, v6, :cond_8

    .line 31
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Command timeout --> "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v2, v5}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    invoke-virtual {p0, v4}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->b(Lcom/jieli/jl_rcsp/model/DataInfo;)V

    .line 33
    iget-object v5, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->f:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_2

    .line 34
    :cond_8
    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/DataInfo;->getReSendCount()I

    move-result v5

    add-int/2addr v5, v1

    .line 35
    invoke-virtual {v4, v5}, Lcom/jieli/jl_rcsp/model/DataInfo;->setReSendCount(I)Lcom/jieli/jl_rcsp/model/DataInfo;

    const/4 v5, 0x0

    .line 36
    invoke-virtual {v4, v5}, Lcom/jieli/jl_rcsp/model/DataInfo;->setSend(Z)Lcom/jieli/jl_rcsp/model/DataInfo;

    goto :goto_2

    .line 37
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "end --> size = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Lcom/jieli/jl_rcsp/model/DataInfo;)V
    .locals 3

    .line 38
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->removeCommandBase(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V

    .line 39
    new-instance v0, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v1, 0x3002

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(I)V

    .line 40
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 41
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;->setOpCode(I)Lcom/jieli/jl_rcsp/model/base/BaseError;

    .line 42
    :cond_0
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->h:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    invoke-static {v1, p1, v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public final c(Lcom/jieli/jl_rcsp/model/DataInfo;)Lcom/jieli/jl_rcsp/model/DataInfo;
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->f:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/jieli/jl_rcsp/model/DataInfo;

    .line 3
    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v4

    if-nez v4, :cond_2

    goto :goto_0

    .line 4
    :cond_2
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v5

    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v6

    if-ne v5, v6, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v5

    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v4

    if-ne v5, v4, :cond_1

    .line 6
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/jieli/jl_rcsp/util/RcspUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v4

    if-eqz v4, :cond_1

    return-object v3

    :cond_3
    return-object v1
.end method

.method public final c()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_rcsp/model/DataInfo;",
            ">;"
        }
    .end annotation

    .line 7
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_rcsp/model/DataInfo;

    .line 10
    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/DataInfo;->isSend()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 11
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->b()V

    .line 2
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->e()Lcom/jieli/jl_rcsp/model/DataInfo;

    move-result-object v0

    if-nez v0, :cond_2

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->f()V

    return-void

    :cond_1
    :goto_0
    const/16 v0, 0x1f4

    .line 5
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->a(I)V

    return-void

    .line 6
    :cond_2
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->f(Lcom/jieli/jl_rcsp/model/DataInfo;)V

    return-void
.end method

.method public final d(Lcom/jieli/jl_rcsp/model/DataInfo;)V
    .locals 8

    if-eqz p1, :cond_6

    .line 7
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getType()I

    move-result v0

    const/4 v1, 0x1

    const-string v2, "handlerQueue"

    const-string v3, "jl_rcsp"

    if-ne v0, v1, :cond_2

    .line 8
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->h:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getRecvData()[B

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->findPacketData(Landroid/bluetooth/BluetoothDevice;[B)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 9
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/jieli/jl_rcsp/model/base/BasePacket;

    .line 11
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "opCode : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v2, v6}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    new-instance v6, Lcom/jieli/jl_rcsp/model/DataInfo;

    invoke-direct {v6}, Lcom/jieli/jl_rcsp/model/DataInfo;-><init>()V

    invoke-virtual {v6, v1}, Lcom/jieli/jl_rcsp/model/DataInfo;->setType(I)Lcom/jieli/jl_rcsp/model/DataInfo;

    move-result-object v6

    .line 13
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/jieli/jl_rcsp/model/DataInfo;->setDevice(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/DataInfo;

    move-result-object v6

    .line 14
    invoke-virtual {v6, v5}, Lcom/jieli/jl_rcsp/model/DataInfo;->setBasePacket(Lcom/jieli/jl_rcsp/model/base/BasePacket;)Lcom/jieli/jl_rcsp/model/DataInfo;

    move-result-object v5

    .line 15
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_6

    .line 17
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->c:Ljava/util/List;

    invoke-interface {p1, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 18
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->g()V

    return-void

    .line 19
    :cond_1
    const-string p1, "findPacketData not found. "

    invoke-static {v3, v2, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 20
    :cond_2
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 21
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getHasResponse()I

    move-result v0

    const/16 v4, 0x3003

    if-ne v0, v1, :cond_4

    .line 23
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_3

    .line 24
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 25
    :cond_3
    const-string p1, "haveResponseDataList is busy. "

    invoke-static {v3, v2, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->h:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->b(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;)Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;

    move-result-object p1

    new-instance v0, Lcom/jieli/jl_rcsp/model/base/BaseError;

    invoke-direct {v0, v4}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(I)V

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->callbackErrorEvent(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    .line 27
    :cond_4
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x3c

    if-ge v0, v1, :cond_5

    .line 28
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 29
    :cond_5
    const-string p1, "noResponseDataList is busy. "

    invoke-static {v3, v2, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->h:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->b(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;)Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;

    move-result-object p1

    new-instance v0, Lcom/jieli/jl_rcsp/model/base/BaseError;

    invoke-direct {v0, v4}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(I)V

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->callbackErrorEvent(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_6
    return-void
.end method

.method public final e()Lcom/jieli/jl_rcsp/model/DataInfo;
    .locals 3

    .line 6
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 7
    :goto_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 8
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/DataInfo;

    .line 9
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/DataInfo;->isSend()Z

    move-result v2

    if-nez v2, :cond_0

    return-object v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 10
    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 11
    :goto_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 12
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/DataInfo;

    .line 13
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/DataInfo;->isSend()Z

    move-result v2

    if-nez v2, :cond_2

    return-object v0

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public final e(Lcom/jieli/jl_rcsp/model/DataInfo;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getHasResponse()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    .line 3
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->f:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 4
    :cond_1
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->e:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 5
    :goto_0
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->h:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    new-instance v2, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v3, 0x3000

    invoke-direct {v2, v3}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(I)V

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;->setOpCode(I)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object v0

    invoke-static {v1, p1, v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public final f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->g:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;->a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    const-string v0, "stopTimer"

    const-string v1, ""

    const-string v2, "jl_rcsp"

    invoke-static {v2, v0, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->g:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$TimerThread;->a()V

    :cond_0
    return-void
.end method

.method public final f(Lcom/jieli/jl_rcsp/model/DataInfo;)V
    .locals 7

    if-nez p1, :cond_0

    goto/16 :goto_3

    .line 4
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->packSendBasePacket(Lcom/jieli/jl_rcsp/model/base/BasePacket;)[B

    move-result-object v0

    const-string v1, "sendData"

    const-string v2, "jl_rcsp"

    if-nez v0, :cond_1

    .line 5
    const-string v0, "pack data error."

    invoke-static {v2, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->e(Lcom/jieli/jl_rcsp/model/DataInfo;)V

    return-void

    .line 7
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "]"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v1, v3}, Lcom/jieli/jl_rcsp/util/JL_Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    array-length v3, v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    invoke-static {v4}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a(Landroid/bluetooth/BluetoothDevice;)I

    move-result v4

    add-int/lit8 v4, v4, 0x8

    if-le v3, v4, :cond_2

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Data over communication mtu ["

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    invoke-static {v3}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a(Landroid/bluetooth/BluetoothDevice;)I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "] limit."

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->e(Lcom/jieli/jl_rcsp/model/DataInfo;)V

    return-void

    :cond_2
    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/4 v5, 0x3

    if-ge v3, v5, :cond_4

    .line 11
    iget-object v4, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->h:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    invoke-static {v4}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->b(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;)Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;

    move-result-object v4

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v5

    invoke-interface {v4, v5, v0}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->sendDataToDevice(Landroid/bluetooth/BluetoothDevice;[B)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    const-wide/16 v5, 0xa

    .line 12
    :try_start_0
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v5

    .line 13
    invoke-virtual {v5}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 14
    :cond_4
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v4, :cond_5

    .line 15
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->e(Lcom/jieli/jl_rcsp/model/DataInfo;)V

    goto :goto_3

    .line 16
    :cond_5
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getHasResponse()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_6

    .line 17
    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/DataInfo;->setSend(Z)Lcom/jieli/jl_rcsp/model/DataInfo;

    .line 18
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/jieli/jl_rcsp/model/DataInfo;->setSendTime(J)Lcom/jieli/jl_rcsp/model/DataInfo;

    goto :goto_3

    .line 19
    :cond_6
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->convert2Command(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    .line 20
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->h:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    invoke-static {v1, p1, v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    .line 21
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :goto_3
    return-void
.end method

.method public final g()V
    .locals 2

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_0
    return-void
.end method

.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    monitor-enter v0

    :goto_0
    :try_start_0
    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->a:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->b:Z

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->d:Ljava/util/concurrent/LinkedBlockingQueue;

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
    iput-boolean v2, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->b:Z

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/LinkedBlockingQueue;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/model/DataInfo;

    invoke-virtual {p0, v1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->d(Lcom/jieli/jl_rcsp/model/DataInfo;)V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->d()V

    goto :goto_0

    :cond_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    iput-boolean v2, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->a:Z

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->f()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->h:Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;->a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld;Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;)Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;

    const-string v0, "jl_rcsp"

    const-string v1, "DataHandlerThread"

    const-string v2, "exit"

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

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
    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->a:Z

    invoke-super {p0}, Ljava/lang/Thread;->start()V

    const-string v0, "jl_rcsp"

    const-string v1, "DataHandlerThread"

    const-string v2, "start"

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
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

    const-string v0, "DataHandlerThread"

    const-string v1, "stopThread"

    const-string v2, "jl_rcsp"

    invoke-static {v2, v0, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->a:Z

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->g()V

    return-void
.end method

.method public tryToAddRecvData(Lcom/jieli/jl_rcsp/model/DataInfo;)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->a(Lcom/jieli/jl_rcsp/model/DataInfo;)Z

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, ", isWaiting : "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->b:Z

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "jl_rcsp"

    const-string v1, "tryToAddRecvData"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public tryToAddSendData(Lcom/jieli/jl_rcsp/model/DataInfo;)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->a(Lcom/jieli/jl_rcsp/model/DataInfo;)Z

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, ", isWaiting : "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerOld$DataHandlerThread;->b:Z

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "jl_rcsp"

    const-string v1, "tryToAddSendData"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
