.class public Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/tool/datahandles/DataHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify$TimeOutCheck;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

.field public final c:Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;

.field public final d:Lcom/jieli/jl_rcsp/tool/datahandles/BasePacketParse;

.field public final e:Lcom/jieli/jl_rcsp/tool/datahandles/DataInfoCache;

.field public final f:Landroid/os/HandlerThread;

.field public final g:Landroid/os/Handler;

.field public final h:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->a:Ljava/lang/String;

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getInstance()Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->b:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    new-instance v0, Lcom/jieli/jl_rcsp/tool/datahandles/DataInfoCache;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataInfoCache;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->e:Lcom/jieli/jl_rcsp/tool/datahandles/DataInfoCache;

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "DataHandlerModify"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->f:Landroid/os/HandlerThread;

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->h:Landroid/os/Handler;

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->c:Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;

    new-instance p1, Lcom/jieli/jl_rcsp/tool/datahandles/BasePacketParse;

    invoke-direct {p1}, Lcom/jieli/jl_rcsp/tool/datahandles/BasePacketParse;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->d:Lcom/jieli/jl_rcsp/tool/datahandles/BasePacketParse;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    new-instance p1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XXXIOiI;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/XXXIOiI;-><init>()V

    invoke-direct {p1, v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->g:Landroid/os/Handler;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "IBluetoothProxy can not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 31
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-interface {p0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;->onCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    :cond_0
    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->a(Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public static synthetic a(Landroid/os/Message;)Z
    .locals 1

    .line 3
    iget-object p0, p0, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, p0, Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 4
    check-cast p0, Ljava/lang/Runnable;

    .line 5
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;)Lcom/jieli/jl_rcsp/tool/datahandles/DataInfoCache;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->e:Lcom/jieli/jl_rcsp/tool/datahandles/DataInfoCache;

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/bluetooth/BluetoothDevice;)I
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->b:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getMaxCommunicationMtu(Landroid/bluetooth/BluetoothDevice;)I

    move-result p1

    return p1
.end method

.method public final a()J
    .locals 2

    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic a(Lcom/jieli/jl_rcsp/model/DataInfo;)V
    .locals 7

    .line 6
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->d:Lcom/jieli/jl_rcsp/tool/datahandles/BasePacketParse;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->b(Landroid/bluetooth/BluetoothDevice;)I

    move-result v1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getRecvData()[B

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/jieli/jl_rcsp/tool/datahandles/BasePacketParse;->findPacketData(I[B)Ljava/util/ArrayList;

    move-result-object v0

    const-string v1, "addRecvData"

    if-eqz v0, :cond_5

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_2

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_rcsp/model/base/BasePacket;

    .line 9
    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getType()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    .line 10
    iget-object v3, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->c:Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->receiveDataFromDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V

    goto :goto_0

    .line 11
    :cond_1
    iget-object v3, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->e:Lcom/jieli/jl_rcsp/tool/datahandles/DataInfoCache;

    invoke-virtual {v3, v2}, Lcom/jieli/jl_rcsp/tool/datahandles/DataInfoCache;->getDataInfo(Lcom/jieli/jl_rcsp/model/base/BasePacket;)Lcom/jieli/jl_rcsp/model/DataInfo;

    move-result-object v3

    if-nez v3, :cond_2

    .line 12
    iget-object v3, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->a:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "No cached command found. "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 13
    :cond_2
    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    invoke-static {v4, v2}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->convert2Command(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v4

    if-nez v4, :cond_3

    .line 14
    new-instance v5, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v6, 0x3001

    invoke-direct {v5, v6}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(I)V

    .line 15
    invoke-virtual {p0, v3, v5}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->a(Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    goto :goto_1

    .line 16
    :cond_3
    iget-object v5, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->c:Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v6

    invoke-interface {v5, v6, v2}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->receiveDataFromDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V

    .line 17
    :goto_1
    iget-object v5, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->e:Lcom/jieli/jl_rcsp/tool/datahandles/DataInfoCache;

    invoke-virtual {v5, v3}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 18
    iget-object v5, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->g:Landroid/os/Handler;

    invoke-virtual {p0, v3}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->d(Lcom/jieli/jl_rcsp/model/DataInfo;)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/os/Handler;->removeMessages(I)V

    .line 19
    invoke-virtual {p0, v3, v4}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->a(Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    .line 20
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v4

    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    invoke-virtual {v4, v3, v2}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->removeCommandBase(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)V

    goto :goto_0

    :cond_4
    return-void

    .line 21
    :cond_5
    :goto_2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->a:Ljava/lang/String;

    const-string v0, "Not found command."

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 2

    if-eqz p1, :cond_2

    .line 24
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getRcspCmdCallback()Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

    move-result-object v0

    if-eqz v0, :cond_2

    if-nez p2, :cond_0

    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 26
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;->setOpCode(I)Lcom/jieli/jl_rcsp/model/base/BaseError;

    .line 27
    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->h:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I1XIO0i;

    invoke-direct {v1, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/I1XIO0i;-><init>(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    :goto_0
    return-void
.end method

.method public final a(Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 3

    if-eqz p1, :cond_1

    .line 28
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getRcspCmdCallback()Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

    move-result-object v0

    if-eqz v0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getRcspCmdCallback()Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

    move-result-object v0

    .line 30
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->h:Landroid/os/Handler;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/iO0XO1X1;

    invoke-direct {v2, v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/iO0XO1X1;-><init>(Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public addRecvData(Lcom/jieli/jl_rcsp/model/DataInfo;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->g:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X00IX1X1i;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/X00IX1X1i;-><init>(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;Lcom/jieli/jl_rcsp/model/DataInfo;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public addSendData(Lcom/jieli/jl_rcsp/model/DataInfo;)V
    .locals 2

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->a()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/jieli/jl_rcsp/model/DataInfo;->setSendTime(J)Lcom/jieli/jl_rcsp/model/DataInfo;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->g:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O0O0iI;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/O0O0iI;-><init>(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;Lcom/jieli/jl_rcsp/model/DataInfo;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final b(Landroid/bluetooth/BluetoothDevice;)I
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->b:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getMaxReceiveMtu(Landroid/bluetooth/BluetoothDevice;)I

    move-result p1

    return p1
.end method

.method public final synthetic b(Lcom/jieli/jl_rcsp/model/DataInfo;)V
    .locals 4

    .line 2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->c(Lcom/jieli/jl_rcsp/model/DataInfo;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v1, 0x3000

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(I)V

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->a(Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    .line 4
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getHasResponse()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 5
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->e:Lcom/jieli/jl_rcsp/tool/datahandles/DataInfoCache;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 6
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->g:Landroid/os/Handler;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->d(Lcom/jieli/jl_rcsp/model/DataInfo;)I

    move-result v1

    new-instance v2, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify$TimeOutCheck;

    invoke-direct {v2, p0, p1}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify$TimeOutCheck;-><init>(Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;Lcom/jieli/jl_rcsp/model/DataInfo;)V

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getTimeoutMs()I

    move-result p1

    int-to-long v2, p1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void

    .line 7
    :cond_1
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v1

    const/16 v2, 0x100

    .line 9
    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/BasePacket;

    .line 10
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->convert2Command(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BasePacket;)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 11
    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    .line 12
    :cond_2
    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->a(Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    return-void
.end method

.method public final synthetic b(Lcom/jieli/jl_rcsp/model/DataInfo;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 3

    .line 14
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "device : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "callError"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getRcspCmdCallback()Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

    move-result-object v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;->onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    .line 16
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->c:Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;

    invoke-interface {p1, p2}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->callbackErrorEvent(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public final c(Lcom/jieli/jl_rcsp/model/DataInfo;)Z
    .locals 6

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/tool/datahandles/ParseHelper;->packSendBasePacket(Lcom/jieli/jl_rcsp/model/base/BasePacket;)[B

    move-result-object v0

    const-string v1, "sendData"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->a:Ljava/lang/String;

    const-string v0, "Packing data failed."

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v2

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->a(Landroid/bluetooth/BluetoothDevice;)I

    move-result v3

    array-length v4, v0

    if-le v4, v3, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "The length of the sent data exceeds the limit["

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "]."

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v2

    :cond_1
    move v3, v2

    :goto_0
    const/4 v4, 0x3

    if-ge v2, v4, :cond_3

    iget-object v3, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->c:Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    invoke-interface {v3, v4, v0}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->sendDataToDevice(Landroid/bluetooth/BluetoothDevice;[B)Z

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
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->a:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "result : %s, data : [%s]"

    invoke-static {v2, v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v3
.end method

.method public final d(Lcom/jieli/jl_rcsp/model/DataInfo;)I
    .locals 1

    if-nez p1, :cond_0

    const p1, 0x7fffffff

    return p1

    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v0

    shl-int/lit8 v0, v0, 0x10

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result p1

    or-int/2addr p1, v0

    return p1
.end method

.method public release()V
    .locals 5

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->a:Ljava/lang/String;

    const-string v1, "release"

    const-string v2, "=====>>>"

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->g:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->d:Lcom/jieli/jl_rcsp/tool/datahandles/BasePacketParse;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/datahandles/BasePacketParse;->release()V

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->getInstance()Lcom/jieli/jl_rcsp/tool/CommandHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/CommandHelper;->release()V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->e:Lcom/jieli/jl_rcsp/tool/datahandles/DataInfoCache;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->e:Lcom/jieli/jl_rcsp/tool/datahandles/DataInfoCache;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->e:Lcom/jieli/jl_rcsp/tool/datahandles/DataInfoCache;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->clear()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/model/DataInfo;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getRcspCmdCallback()Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    new-instance v3, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v4, 0x2000

    invoke-direct {v3, v4}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(I)V

    invoke-interface {v2, v1, v3}, Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;->onErrCode(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/datahandles/DataHandlerModify;->f:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    return-void
.end method
