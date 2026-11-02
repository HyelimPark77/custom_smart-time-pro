.class Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/data/IDataTransferOp;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$CallbackManager;
    }
.end annotation


# static fields
.field public static WAITING_FOR_DATA_TIMEOUT:I = 0x4e20

.field public static final h:Ljava/lang/String; = "DataTransferOpImpl"

.field public static volatile i:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl; = null

.field public static final j:I = 0x1475


# instance fields
.field public final a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

.field public final b:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

.field public final c:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$CallbackManager;

.field public volatile d:Lcom/jieli/jl_rcsp/model/data/SendDataCache;

.field public volatile e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

.field public final f:Landroid/os/Handler;

.field public final g:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/impl/OXO1;

    invoke-direct {v2, p0}, Lcom/jieli/jl_rcsp/impl/OXO1;-><init>(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->f:Landroid/os/Handler;

    new-instance v1, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$7;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$7;-><init>(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)V

    iput-object v1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->g:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getInstance()Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object v2

    iput-object v2, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    new-instance v2, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$CallbackManager;

    invoke-direct {v2, v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$CallbackManager;-><init>(Landroid/os/Handler;)V

    iput-object v2, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$CallbackManager;

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->registerOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "RcspOpImpl can not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;Lcom/jieli/jl_rcsp/model/data/ReadDataCache;)Lcom/jieli/jl_rcsp/model/data/ReadDataCache;
    .locals 0

    .line 7
    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    return-object p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;Lcom/jieli/jl_rcsp/model/data/SendDataCache;)Lcom/jieli/jl_rcsp/model/data/SendDataCache;
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->d:Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    return-object p1
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 8
    sget-object v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->h:Ljava/lang/String;

    return-object v0
.end method

.method public static a(I)Ljava/lang/String;
    .locals 0

    packed-switch p0, :pswitch_data_0

    .line 111
    const-string p0, ""

    return-object p0

    .line 112
    :pswitch_0
    const-string p0, "Missing parameter configuration."

    return-object p0

    .line 113
    :pswitch_1
    const-string p0, "Read/write Data Exception."

    return-object p0

    .line 114
    :pswitch_2
    const-string p0, "Data length is out of bounds."

    return-object p0

    .line 115
    :pswitch_3
    const-string p0, "Transfer way is not supported."

    return-object p0

    .line 116
    :pswitch_4
    const-string p0, "Data type is not supported."

    return-object p0

    .line 117
    :pswitch_5
    const-string p0, "Sequence error."

    return-object p0

    .line 118
    :pswitch_6
    const-string p0, "CRC error."

    return-object p0

    .line 119
    :pswitch_7
    const-string p0, "Successful."

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 0

    .line 6
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->d()Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    return-object p0
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;Lcom/jieli/jl_rcsp/model/data/SendDataCache;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Lcom/jieli/jl_rcsp/model/data/SendDataCache;)V

    return-void
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/model/data/SendDataCache;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->d:Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    return-object p0
.end method

.method public static synthetic d(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/model/data/ReadDataCache;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    return-object p0
.end method

.method public static synthetic e(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Landroid/bluetooth/BluetoothDevice;
    .locals 0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b()Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    return-object p0
.end method

.method public static synthetic g(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->f:Landroid/os/Handler;

    return-object p0
.end method

.method public static instance(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;
    .locals 2

    sget-object v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->i:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    if-nez v0, :cond_1

    const-class v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->i:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    if-nez v1, :cond_0

    new-instance v1, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;-><init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V

    sput-object v1, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->i:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    sget-object p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->i:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    return-object p0
.end method


# virtual methods
.method public final a(ILcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 110
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;

    new-instance v3, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$CancelTransferParam;

    invoke-direct {v3, p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$CancelTransferParam;-><init>(I)V

    invoke-direct {v2, v3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;)V

    new-instance p1, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    const-string v3, "cancelTransfer"

    invoke-direct {p1, v3, p2}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, v1, v2, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 4

    if-nez p2, :cond_0

    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 20
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->getCallback()Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;

    move-result-object v0

    .line 21
    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->f:Landroid/os/Handler;

    const/16 v2, 0x1475

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 22
    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->release()V

    const/4 v1, 0x0

    .line 23
    iput-object v1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    .line 24
    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDataTransfer(Landroid/bluetooth/BluetoothDevice;Z)V

    .line 25
    sget-object v1, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->h:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "device : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "onReadError"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_1

    .line 26
    invoke-interface {v0, p2}, Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;->onError(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    .line 27
    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$CallbackManager;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$CallbackManager;->onError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    if-eqz v2, :cond_a

    if-nez p3, :cond_0

    goto/16 :goto_2

    .line 57
    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c()Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-nez v3, :cond_1

    .line 58
    new-instance v6, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;

    invoke-virtual/range {p3 .. p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->getType()I

    move-result v7

    invoke-virtual/range {p3 .. p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->getSeq()I

    move-result v9

    const/4 v3, 0x7

    .line 59
    invoke-static {v3}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v11

    const/4 v8, 0x1

    const/4 v10, 0x7

    invoke-direct/range {v6 .. v11}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;-><init>(IZII[B)V

    .line 60
    new-instance v3, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$CustomReplyParam;

    invoke-virtual {v6}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Response;->getParamData()[B

    move-result-object v6

    invoke-direct {v3, v6}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$CustomReplyParam;-><init>([B)V

    invoke-virtual {v2, v3}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setParam(Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    .line 61
    invoke-virtual {v2, v5}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    .line 62
    iget-object v3, v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v3, v1, v2, v4}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void

    .line 63
    :cond_1
    iget-object v3, v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->f:Landroid/os/Handler;

    const/16 v6, 0x1475

    invoke-virtual {v3, v6}, Landroid/os/Handler;->removeMessages(I)V

    .line 64
    invoke-virtual/range {p3 .. p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->getData()[B

    move-result-object v3

    .line 65
    invoke-static {v3, v5}, Lcom/jieli/jl_rcsp/util/CryptoUtil;->CRC16([BS)S

    move-result v7

    .line 66
    sget-object v8, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->h:Ljava/lang/String;

    .line 67
    invoke-virtual/range {p3 .. p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->getCrc()S

    move-result v9

    invoke-static {v9}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v9

    invoke-virtual/range {p3 .. p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->getCrc()S

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v7}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v11

    invoke-static {v7}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v12

    filled-new-array {v9, v10, v11, v12}, [Ljava/lang/Object;

    move-result-object v9

    .line 68
    const-string v10, "device give crc = %d, hex --> %s, app count crc = %d, hex --> %s"

    invoke-static {v10, v9}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "handleDataEvent"

    invoke-static {v8, v10, v9}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    invoke-virtual/range {p3 .. p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->getCrc()S

    move-result v9

    const/4 v11, 0x1

    if-ne v7, v9, :cond_4

    .line 70
    invoke-virtual/range {p3 .. p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->getSeq()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget-object v9, v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    invoke-virtual {v9}, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->getSeq()I

    move-result v9

    add-int/2addr v9, v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    filled-new-array {v7, v9}, [Ljava/lang/Object;

    move-result-object v7

    .line 71
    const-string v9, "device give seq = %d, app count seq = %d"

    invoke-static {v9, v7}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v8, v10, v7}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    iget-object v7, v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    invoke-virtual {v7}, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->getSeq()I

    move-result v7

    add-int/2addr v7, v11

    invoke-virtual/range {p3 .. p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->getSeq()I

    move-result v9

    if-ne v7, v9, :cond_5

    .line 73
    iget-object v7, v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    invoke-virtual {v7, v3}, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->putData([B)Z

    move-result v7

    .line 74
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "write data result : "

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v12, ", data size = "

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v12, v3

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v10, v9}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v7, :cond_3

    .line 75
    iget-object v7, v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    invoke-virtual/range {p3 .. p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->getOffset()I

    move-result v9

    invoke-virtual {v7, v9}, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->setOffset(I)V

    .line 76
    iget-object v7, v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    invoke-virtual/range {p3 .. p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->getSeq()I

    move-result v9

    invoke-virtual {v7, v9}, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->setSeq(I)V

    .line 77
    invoke-virtual/range {p3 .. p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->isEnd()Z

    move-result v7

    if-eqz v7, :cond_2

    .line 78
    iget-object v7, v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    invoke-virtual {v7}, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->getOutputData()[B

    move-result-object v7

    .line 79
    invoke-static {v7, v5}, Lcom/jieli/jl_rcsp/util/CryptoUtil;->CRC16([BS)S

    move-result v7

    .line 80
    invoke-static {v7}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v12

    iget-object v13, v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    .line 81
    invoke-virtual {v13}, Lcom/jieli/jl_rcsp/model/data/ReadParams;->getCrc()S

    move-result v13

    invoke-static {v13}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v13

    iget-object v14, v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    invoke-virtual {v14}, Lcom/jieli/jl_rcsp/model/data/ReadParams;->getCrc()S

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v14

    filled-new-array {v9, v12, v13, v14}, [Ljava/lang/Object;

    move-result-object v9

    .line 82
    const-string v12, "Checking Data Integrity. totalCrc : %d, hex --> %s, device give data crc = %d, hex --> %s."

    invoke-static {v12, v9}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v10, v9}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    iget-object v9, v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    invoke-virtual {v9}, Lcom/jieli/jl_rcsp/model/data/ReadParams;->getCrc()S

    move-result v9

    if-eq v7, v9, :cond_2

    goto :goto_0

    :cond_2
    move/from16 v16, v5

    goto :goto_1

    :cond_3
    const/4 v11, 0x6

    :cond_4
    :goto_0
    move/from16 v16, v11

    goto :goto_1

    :cond_5
    const/4 v11, 0x2

    goto :goto_0

    .line 84
    :goto_1
    new-instance v12, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;

    invoke-virtual/range {p3 .. p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->getType()I

    move-result v13

    invoke-virtual/range {p3 .. p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->isEnd()Z

    move-result v14

    .line 85
    invoke-virtual/range {p3 .. p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->getSeq()I

    move-result v15

    invoke-static/range {v16 .. v16}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->getBytes()[B

    move-result-object v17

    invoke-direct/range {v12 .. v17}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;-><init>(IZII[B)V

    move/from16 v11, v16

    .line 86
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "result = "

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v8, v10, v7}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    new-instance v7, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$CustomReplyParam;

    invoke-virtual {v12}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Response;->getParamData()[B

    move-result-object v8

    invoke-direct {v7, v8}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$CustomReplyParam;-><init>([B)V

    invoke-virtual {v2, v7}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setParam(Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    .line 88
    invoke-virtual {v2, v5}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    .line 89
    iget-object v7, v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v7, v1, v2, v4}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    if-nez v11, :cond_9

    .line 90
    iget-object v2, v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->getCallback()Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;

    move-result-object v2

    .line 91
    invoke-virtual/range {p3 .. p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->isEnd()Z

    move-result v7

    const/high16 v8, 0x42c80000    # 100.0f

    if-eqz v7, :cond_7

    .line 92
    iget-object v3, v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->getOutputData()[B

    move-result-object v3

    invoke-virtual {v3}, [B->clone()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    .line 93
    iget-object v6, v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    invoke-virtual {v6}, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->release()V

    .line 94
    iput-object v4, v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    .line 95
    iget-object v4, v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b()Landroid/bluetooth/BluetoothDevice;

    move-result-object v6

    invoke-virtual {v4, v6, v5}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDataTransfer(Landroid/bluetooth/BluetoothDevice;Z)V

    if-eqz v2, :cond_6

    .line 96
    invoke-interface {v2, v8}, Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;->onProgress(F)V

    .line 97
    invoke-virtual/range {p3 .. p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->getType()I

    move-result v4

    invoke-interface {v2, v4, v3}, Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;->onStop(I[B)V

    .line 98
    :cond_6
    iget-object v2, v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$CallbackManager;

    invoke-virtual/range {p3 .. p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;->getType()I

    move-result v4

    invoke-virtual {v2, v1, v4, v3}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$CallbackManager;->onReceiveData(Landroid/bluetooth/BluetoothDevice;I[B)V

    return-void

    .line 99
    :cond_7
    iget-object v4, v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/data/ReadParams;->getDataLen()I

    move-result v4

    if-lez v4, :cond_8

    .line 100
    iget-object v4, v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->getOffset()I

    move-result v4

    array-length v3, v3

    add-int/2addr v4, v3

    int-to-float v3, v4

    mul-float/2addr v3, v8

    iget-object v4, v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/data/ReadParams;->getDataLen()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    if-eqz v2, :cond_8

    .line 101
    invoke-interface {v2, v3}, Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;->onProgress(F)V

    .line 102
    :cond_8
    iget-object v2, v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->f:Landroid/os/Handler;

    invoke-virtual {v2, v6, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    sget v3, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->WAITING_FOR_DATA_TIMEOUT:I

    int-to-long v3, v3

    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void

    :cond_9
    const/16 v2, 0x30

    const/16 v3, 0x3005

    .line 103
    invoke-static {v2, v3, v11, v4}, Lcom/jieli/jl_rcsp/constant/RcspErrorCode;->buildJsonError(IIILjava/lang/String;)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_a
    :goto_2
    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;)V
    .locals 11

    if-eqz p2, :cond_2

    if-nez p3, :cond_0

    goto/16 :goto_0

    .line 41
    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 42
    invoke-virtual {p2, v1}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setParam(Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    const/4 p3, 0x3

    .line 43
    invoke-virtual {p2, p3}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    .line 44
    iget-object p3, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p3, p1, p2, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void

    .line 45
    :cond_1
    sget-object v0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->h:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "handleDataParam"

    invoke-static {v0, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    new-instance v4, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;

    invoke-virtual {p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParam;->getWay()I

    move-result v5

    invoke-virtual {p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParam;->getType()I

    move-result v6

    .line 47
    invoke-virtual {p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParam;->getVersion()I

    move-result v7

    invoke-virtual {p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->getSendDataLimit()I

    move-result v9

    invoke-virtual {p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->getReceiveDataLimit()I

    move-result v10

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;-><init>(IIIIII)V

    .line 48
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "\n data = "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Response;->getParamData()[B

    move-result-object v5

    invoke-static {v5}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$CustomReplyParam;

    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Response;->getParamData()[B

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$CustomReplyParam;-><init>([B)V

    invoke-virtual {p2, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setParam(Lcom/jieli/jl_rcsp/model/base/BaseParameter;)V

    const/4 v0, 0x0

    .line 50
    invoke-virtual {p2, v0}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->setStatus(I)Lcom/jieli/jl_rcsp/model/base/CommandBase;

    .line 51
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0, p1, p2, v1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    .line 52
    new-instance v2, Lcom/jieli/jl_rcsp/model/data/ReadParams;

    invoke-virtual {p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParam;->getType()I

    move-result v3

    invoke-virtual {p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParam;->getVersion()I

    move-result v4

    invoke-virtual {p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->getSendDataLimit()I

    move-result v5

    invoke-virtual {p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->getReceiveDataLimit()I

    move-result v6

    .line 53
    invoke-virtual {p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->getDataLen()I

    move-result v7

    invoke-virtual {p3}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;->getCrc()S

    move-result v8

    invoke-direct/range {v2 .. v8}, Lcom/jieli/jl_rcsp/model/data/ReadParams;-><init>(IIIIIS)V

    .line 54
    new-instance p2, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    invoke-direct {p2, v2}, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;-><init>(Lcom/jieli/jl_rcsp/model/data/ReadParams;)V

    iput-object p2, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    .line 55
    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b()Landroid/bluetooth/BluetoothDevice;

    move-result-object p3

    const/4 v0, 0x1

    invoke-virtual {p2, p3, v0}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDataTransfer(Landroid/bluetooth/BluetoothDevice;Z)V

    .line 56
    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->f:Landroid/os/Handler;

    const/16 p3, 0x1475

    invoke-virtual {p2, p3, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    sget p3, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->WAITING_FOR_DATA_TIMEOUT:I

    int-to-long v0, p3

    invoke-virtual {p2, p1, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_2
    :goto_0
    return-void
.end method

.method public final a(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 4

    if-nez p1, :cond_0

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 13
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->d:Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->getCallback()Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;

    move-result-object v0

    .line 14
    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->d:Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->release()V

    const/4 v1, 0x0

    .line 15
    iput-object v1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->d:Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    .line 16
    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDataTransfer(Landroid/bluetooth/BluetoothDevice;Z)V

    .line 17
    sget-object v1, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->h:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "device : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b()Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "onSendError"

    invoke-static {v1, v3, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_1

    .line 18
    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;->onError(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final a(Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_1

    if-eqz p2, :cond_0

    .line 108
    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x1001

    const-string v1, "DataTransferParam can not be null."

    invoke-direct {p1, v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void

    .line 109
    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;

    invoke-direct {v2, p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;)V

    new-instance p1, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;

    new-instance v3, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$6;

    invoke-direct {v3, p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$6;-><init>(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)V

    const-string v4, "sendDataBlock"

    invoke-direct {p1, v4, p2, v3}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, v1, v2, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public final a(Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataParam;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataParam;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataResponse;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_1

    if-eqz p2, :cond_0

    .line 106
    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x1001

    const-string v1, "ReadDataParam can not be null."

    invoke-direct {p1, v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void

    .line 107
    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;

    invoke-direct {v2, p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;)V

    new-instance p1, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;

    new-instance v3, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$5;

    invoke-direct {v3, p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$5;-><init>(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)V

    const-string v4, "readDataParam"

    invoke-direct {p1, v4, p2, v3}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, v1, v2, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public final a(Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_1

    if-eqz p2, :cond_0

    .line 104
    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x1001

    const-string v1, "SendDataParam can not be null."

    invoke-direct {p1, v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void

    .line 105
    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    new-instance v2, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;

    invoke-direct {v2, p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd;-><init>(Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$Param;)V

    new-instance p1, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;

    new-instance v3, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$4;

    invoke-direct {v3, p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$4;-><init>(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)V

    const-string v4, "sendDataParam"

    invoke-direct {p1, v4, p2, v3}, Lcom/jieli/jl_rcsp/tool/CustomRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Lcom/jieli/jl_rcsp/interfaces/IHandleResult;)V

    invoke-virtual {v0, v1, v2, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public final a(Lcom/jieli/jl_rcsp/model/data/SendDataCache;)V
    .locals 12

    if-eqz p1, :cond_2

    .line 28
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->isDataTransfer()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 29
    :cond_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/DataParams;->getReceiveLimit()I

    move-result v0

    .line 30
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->getOffset()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/SendParams;->getDataLen()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-lt v1, v2, :cond_1

    move v7, v3

    goto :goto_0

    :cond_1
    move v7, v4

    .line 31
    :goto_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/SendParams;->getDataLen()I

    move-result v1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->getOffset()I

    move-result v2

    sub-int/2addr v1, v2

    .line 32
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 33
    new-array v11, v0, [B

    .line 34
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/SendParams;->getData()[B

    move-result-object v1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->getOffset()I

    move-result v2

    invoke-static {v1, v2, v11, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    invoke-static {v11, v4}, Lcom/jieli/jl_rcsp/util/CryptoUtil;->CRC16([BS)S

    move-result v9

    .line 36
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->getSeq()I

    move-result v1

    add-int/2addr v1, v3

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->setSeq(I)V

    .line 37
    new-instance v5, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/DataParams;->getDataType()I

    move-result v6

    .line 38
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->getSeq()I

    move-result v8

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->getOffset()I

    move-result v10

    invoke-direct/range {v5 .. v11}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;-><init>(IZISI[B)V

    .line 39
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->getOffset()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p1, v1}, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->setOffset(I)V

    .line 40
    new-instance p1, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$3;

    invoke-direct {p1, p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$3;-><init>(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)V

    invoke-virtual {p0, v5, p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferParam;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final synthetic a(Landroid/os/Message;)Z
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 9
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x1475

    if-ne v1, v0, :cond_1

    .line 10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, p1, Landroid/bluetooth/BluetoothDevice;

    if-eqz v0, :cond_1

    .line 11
    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    new-instance v0, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v1, 0x3002

    const-string v2, "Waiting for data timeout."

    invoke-direct {v0, v1, v2}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public addListener(Lcom/jieli/jl_rcsp/interfaces/data/OnDataTransferListener;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$CallbackManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->registerCallback(Ljava/lang/Object;)V

    return-void
.end method

.method public final b()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method public final c()Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e:Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public cancelDataTransfer(Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onSuccess(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final d()Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->d:Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public destroy()V
    .locals 4

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->f:Landroid/os/Handler;

    const/16 v1, 0x1475

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->f:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->g:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->unregisterOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    new-instance v0, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v2, 0x1002

    const-string v3, "Cancel send data task."

    invoke-direct {v0, v2, v3}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$CallbackManager;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->release()V

    sput-object v1, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->i:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    return-void
.end method

.method public isDataTransfer()Z
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->isDataTransfer(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    return v0
.end method

.method public readLargeData(Lcom/jieli/jl_rcsp/model/data/DataParams;Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;)V
    .locals 4

    if-nez p1, :cond_0

    if-eqz p2, :cond_3

    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x1001

    const-string v1, "ReadParams can not be null."

    invoke-direct {p1, v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;->onError(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->isDataTransfer()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->d()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataParam;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/DataParams;->getDataType()I

    move-result v1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/DataParams;->getVersion()I

    move-result v2

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/DataParams;->getSendLimit()I

    move-result v3

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/DataParams;->getReceiveLimit()I

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataParam;-><init>(IIII)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-interface {p1}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    new-instance v1, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$2;

    invoke-direct {v1, p0, p2, p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$2;-><init>(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v0, v1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataParam;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    return-void

    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x1100

    const-string v1, "Data task is in progress."

    invoke-direct {p1, v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;->onError(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_3
    return-void
.end method

.method public removeListener(Lcom/jieli/jl_rcsp/interfaces/data/OnDataTransferListener;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$CallbackManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->unregisterCallback(Ljava/lang/Object;)V

    return-void
.end method

.method public sendLargeData(Lcom/jieli/jl_rcsp/model/data/SendParams;Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;)V
    .locals 9

    if-nez p1, :cond_0

    if-eqz p2, :cond_3

    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x1001

    const-string v1, "SendDataParam can not be null."

    invoke-direct {p1, v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;->onError(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->isDataTransfer()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_rcsp/model/data/SendDataCache;-><init>(Lcom/jieli/jl_rcsp/model/data/SendParams;Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->d:Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b:Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p2, v0, v1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDataTransfer(Landroid/bluetooth/BluetoothDevice;Z)V

    new-instance v2, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/DataParams;->getDataType()I

    move-result v3

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/DataParams;->getVersion()I

    move-result v4

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/SendParams;->getDataLen()I

    move-result v5

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/SendParams;->getDataCrc()S

    move-result v6

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/DataParams;->getSendLimit()I

    move-result v7

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/DataParams;->getReceiveLimit()I

    move-result v8

    invoke-direct/range {v2 .. v8}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;-><init>(IIISII)V

    new-instance p1, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$1;

    invoke-direct {p1, p0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$1;-><init>(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)V

    invoke-virtual {p0, v2, p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataParam;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    return-void

    :cond_2
    :goto_0
    if-eqz p2, :cond_3

    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 v0, 0x1100

    invoke-static {v0}, Lcom/jieli/jl_rcsp/constant/WatchError;->getErrorDesc(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;->onError(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_3
    return-void
.end method
