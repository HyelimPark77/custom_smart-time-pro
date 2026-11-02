.class public Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/rcsp/IRcspOp;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Landroid/content/Context;

.field private final c:Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;

.field private final d:Lcom/jieli/jl_bt_ota/impl/RcspAuth;

.field private final e:Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;

.field private final f:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;

.field private g:Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

.field private volatile h:Landroid/bluetooth/BluetoothDevice;

.field private volatile i:Lcom/jieli/jl_bt_ota/tool/data_handler/IDataHandler;

.field private j:Lcom/jieli/jl_bt_ota/interfaces/rcsp/ICmdSnGenerator;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->createDefault()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;-><init>(Landroid/content/Context;Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a:Ljava/lang/String;

    .line 4
    invoke-static {p1}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->b:Landroid/content/Context;

    .line 5
    invoke-static {p2}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;

    iput-object p2, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->c:Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;

    .line 6
    invoke-virtual {p0, p3}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->configure(Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;)V

    .line 7
    new-instance p3, Lcom/jieli/jl_bt_ota/impl/RcspAuth;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/bf2;

    invoke-direct {v0, p2}, Lcom/android/mltcode/paycertificationapi/bf2;-><init>(Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;)V

    new-instance v1, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$1;

    invoke-direct {v1, p0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$1;-><init>(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;)V

    invoke-direct {p3, p1, v0, v1}, Lcom/jieli/jl_bt_ota/impl/RcspAuth;-><init>(Landroid/content/Context;Lcom/jieli/jl_bt_ota/impl/RcspAuth$IRcspAuthOp;Lcom/jieli/jl_bt_ota/impl/RcspAuth$OnRcspAuthListener;)V

    iput-object p3, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->d:Lcom/jieli/jl_bt_ota/impl/RcspAuth;

    .line 8
    new-instance p1, Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;

    invoke-direct {p1}, Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->e:Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;

    .line 9
    new-instance p1, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;

    const/4 p3, 0x0

    invoke-direct {p1, p3}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;-><init>(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$1;)V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->f:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;

    .line 10
    new-instance p1, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$2;

    invoke-direct {p1, p0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$2;-><init>(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;)V

    invoke-interface {p2, p1}, Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;->setOnBtListener(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtListener;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a:Ljava/lang/String;

    return-object p0
.end method

.method private a()V
    .locals 3

    .line 28
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dataHandler : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->i:Lcom/jieli/jl_bt_ota/tool/data_handler/IDataHandler;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "releaseDataHandler"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->i:Lcom/jieli/jl_bt_ota/tool/data_handler/IDataHandler;

    if-nez v0, :cond_0

    return-void

    .line 30
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->i:Lcom/jieli/jl_bt_ota/tool/data_handler/IDataHandler;

    invoke-interface {v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/IDataHandler;->release()V

    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->i:Lcom/jieli/jl_bt_ota/tool/data_handler/IDataHandler;

    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;)V
    .locals 3

    .line 19
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->d(Landroid/bluetooth/BluetoothDevice;)V

    .line 20
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->isDeviceAuthPass(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 21
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->d:Lcom/jieli/jl_bt_ota/impl/RcspAuth;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/jieli/jl_bt_ota/impl/RcspAuth;->stopAuth(Landroid/bluetooth/BluetoothDevice;Z)V

    .line 22
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->d:Lcom/jieli/jl_bt_ota/impl/RcspAuth;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspAuth;->startAuth(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 23
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->f:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;

    const/16 v1, 0x5001

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;->onRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    :cond_0
    return-void

    .line 24
    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->i:Lcom/jieli/jl_bt_ota/tool/data_handler/IDataHandler;

    if-nez v0, :cond_2

    .line 25
    new-instance v0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$5;

    invoke-direct {v0, p0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$5;-><init>(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;)V

    .line 26
    new-instance v1, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->c:Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;

    invoke-direct {v1, v2, v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/RcspDataHandler;-><init>(Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;Lcom/jieli/jl_bt_ota/interfaces/command/OnDataHandlerListener;)V

    iput-object v1, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->i:Lcom/jieli/jl_bt_ota/tool/data_handler/IDataHandler;

    .line 27
    :cond_2
    new-instance v0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$6;

    invoke-direct {v0, p0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$6;-><init>(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->syncDeviceInfo(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->f:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;->onConnectStateChange(Landroid/bluetooth/BluetoothDevice;I)V

    if-eqz p2, :cond_1

    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    return-void

    .line 8
    :cond_0
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    .line 9
    :cond_1
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->b(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;IILcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/jieli/jl_bt_ota/model/base/CommandBase<",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/BaseParameter;",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/CommonResponse;",
            ">;>(",
            "Landroid/bluetooth/BluetoothDevice;",
            "TT;II",
            "Lcom/jieli/jl_bt_ota/interfaces/CommandCallback<",
            "TT;>;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 32
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    :cond_0
    move-object v1, p1

    const/16 p1, 0x1012

    if-nez v1, :cond_1

    .line 33
    invoke-static {p1}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p1

    invoke-direct {p0, p1, p5}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a(Lcom/jieli/jl_bt_ota/model/base/BaseError;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void

    :cond_1
    if-nez p2, :cond_2

    const/16 p1, 0x1001

    .line 34
    invoke-static {p1}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p1

    invoke-direct {p0, p1, p5}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a(Lcom/jieli/jl_bt_ota/model/base/BaseError;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void

    .line 35
    :cond_2
    invoke-virtual {p0, v1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->isDeviceAuthPass(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_3

    const/16 p1, 0x5001

    .line 36
    invoke-static {p1}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(I)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p1

    invoke-direct {p0, p1, p5}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a(Lcom/jieli/jl_bt_ota/model/base/BaseError;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void

    .line 37
    :cond_3
    iget-object v6, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->i:Lcom/jieli/jl_bt_ota/tool/data_handler/IDataHandler;

    if-nez v6, :cond_4

    .line 38
    const-string p2, "No data processor."

    invoke-static {p1, p2}, Lcom/jieli/jl_bt_ota/model/OTAError;->buildError(ILjava/lang/String;)Lcom/jieli/jl_bt_ota/model/base/BaseError;

    move-result-object p1

    invoke-direct {p0, p1, p5}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a(Lcom/jieli/jl_bt_ota/model/base/BaseError;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void

    :cond_4
    const/4 p1, 0x1

    if-ne p3, p1, :cond_5

    .line 39
    invoke-direct {p0, v1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->c(Landroid/bluetooth/BluetoothDevice;)I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/jieli/jl_bt_ota/model/base/CommandBase;->setOpCodeSn(I)Lcom/jieli/jl_bt_ota/model/base/CommandBase;

    .line 40
    :cond_5
    new-instance v0, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    move-object v3, p2

    move v2, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;-><init>(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/model/base/CommandBase;ILcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    .line 41
    invoke-virtual {p0, v1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    move-result-object p1

    if-eqz p1, :cond_6

    .line 42
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getReceiveMtu()I

    move-result p2

    if-lez p2, :cond_6

    .line 43
    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getReceiveMtu()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;->setDeviceReceiveMtu(I)Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;

    .line 44
    :cond_6
    invoke-interface {v6, v0}, Lcom/jieli/jl_bt_ota/tool/data_handler/IDataHandler;->addSendData(Lcom/jieli/jl_bt_ota/model/data/SendDataInfo;)V

    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;)V
    .locals 2

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_1

    .line 49
    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isMandatoryUpgrade()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->isSupportReuseSpaceOTA()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 50
    invoke-virtual {p2}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getExpandMode()I

    move-result p2

    const/4 v0, 0x3

    if-ne p2, v0, :cond_1

    goto :goto_0

    .line 51
    :cond_1
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->f:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;

    invoke-virtual {p2, p1, v1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;->onRcspInit(Landroid/bluetooth/BluetoothDevice;Z)V

    return-void

    .line 52
    :cond_2
    :goto_0
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->f:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;

    invoke-virtual {p2, p1, v1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;->onRcspInit(Landroid/bluetooth/BluetoothDevice;Z)V

    .line 53
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->f:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;

    invoke-virtual {p2, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;->onMandatoryUpgrade(Landroid/bluetooth/BluetoothDevice;)V

    :cond_3
    :goto_1
    return-void
.end method

.method private a(Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 2

    .line 10
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->isDeviceAuthPass(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 11
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->d:Lcom/jieli/jl_bt_ota/impl/RcspAuth;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/RcspAuth;->handleAuthData(Landroid/bluetooth/BluetoothDevice;[B)V

    return-void

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->i:Lcom/jieli/jl_bt_ota/tool/data_handler/IDataHandler;

    if-nez v0, :cond_1

    .line 13
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a:Ljava/lang/String;

    const-string p2, "onReceiveDeviceData"

    const-string v0, "No data processor."

    invoke-static {p1, p2, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 14
    :cond_1
    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    move-result-object v0

    .line 15
    new-instance v1, Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;

    invoke-direct {v1, p1, p2}, Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;-><init>(Landroid/bluetooth/BluetoothDevice;[B)V

    if-eqz v0, :cond_2

    .line 16
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getSendMtu()I

    move-result p1

    if-lez p1, :cond_2

    .line 17
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;->getSendMtu()I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;->setDeviceSendMtu(I)V

    .line 18
    :cond_2
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->i:Lcom/jieli/jl_bt_ota/tool/data_handler/IDataHandler;

    invoke-interface {p1, v1}, Lcom/jieli/jl_bt_ota/tool/data_handler/IDataHandler;->addRecvData(Lcom/jieli/jl_bt_ota/model/data/ReceivedDataInfo;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a(Landroid/bluetooth/BluetoothDevice;[B)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    return-void
.end method

.method private a(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 45
    new-instance v0, Lcom/jieli/jl_bt_ota/model/command/GetDevMD5Cmd;

    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/model/command/GetDevMD5Cmd;-><init>()V

    new-instance v1, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;

    new-instance v2, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$7;

    invoke-direct {v2, p0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$7;-><init>(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;)V

    const-string v3, "getMD5"

    invoke-direct {v1, v3, p1, v2}, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult;)V

    invoke-virtual {p0, v0, v1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->sendRcspCommand(Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void
.end method

.method private a(Lcom/jieli/jl_bt_ota/model/base/BaseError;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/model/base/BaseError;",
            "Lcom/jieli/jl_bt_ota/interfaces/CommandCallback<",
            "*>;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 46
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "callback : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "cbCommandError"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    .line 47
    invoke-interface {p2, p1}, Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;->onErrCode(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void

    .line 48
    :cond_1
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->f:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p2, v0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;->onRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;)Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->e:Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;

    return-object p0
.end method

.method private b(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    .line 3
    invoke-static {p1, v0}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->d(Landroid/bluetooth/BluetoothDevice;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->e:Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;->removeDeviceStatus(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/DeviceStatus;

    .line 6
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a()V

    return-void
.end method

.method private c(Landroid/bluetooth/BluetoothDevice;)I
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->j:Lcom/jieli/jl_bt_ota/interfaces/rcsp/ICmdSnGenerator;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/jieli/jl_bt_ota/tool/SnGenerator;

    invoke-direct {v0}, Lcom/jieli/jl_bt_ota/tool/SnGenerator;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->j:Lcom/jieli/jl_bt_ota/interfaces/rcsp/ICmdSnGenerator;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->j:Lcom/jieli/jl_bt_ota/interfaces/rcsp/ICmdSnGenerator;

    invoke-interface {v0, p1}, Lcom/jieli/jl_bt_ota/interfaces/rcsp/ICmdSnGenerator;->getRcspCmdSeq(Landroid/bluetooth/BluetoothDevice;)I

    move-result p1

    return p1
.end method

.method public static synthetic c(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;)Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->f:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;

    return-object p0
.end method

.method private d(Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->h:Landroid/bluetooth/BluetoothDevice;

    return-void
.end method


# virtual methods
.method public configure(Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->g:Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->getSnGenerator()Lcom/jieli/jl_bt_ota/interfaces/rcsp/ICmdSnGenerator;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->j:Lcom/jieli/jl_bt_ota/interfaces/rcsp/ICmdSnGenerator;

    return-void
.end method

.method public getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->g:Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    return-object v0
.end method

.method public getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->e:Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    move-result-object p1

    return-object p1
.end method

.method public getDeviceStatusCache()Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->e:Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;

    return-object v0
.end method

.method public getTargetDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->h:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public isDeviceAuthPass(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->g:Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->isUseAuthDevice()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->e:Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;->isAuthBtDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public registerOnRcspCallback(Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->f:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->addCallback(Ljava/lang/Object;)Z

    return-void
.end method

.method public release()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->d:Lcom/jieli/jl_bt_ota/impl/RcspAuth;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/impl/RcspAuth;->destroy()V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->e:Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/tool/DeviceStatusCache;->clear()V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->f:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->release()V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->j:Lcom/jieli/jl_bt_ota/interfaces/rcsp/ICmdSnGenerator;

    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/jieli/jl_bt_ota/tool/SnGenerator;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/jieli/jl_bt_ota/tool/SnGenerator;

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/tool/SnGenerator;->destroy()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->j:Lcom/jieli/jl_bt_ota/interfaces/rcsp/ICmdSnGenerator;

    :cond_1
    return-void
.end method

.method public sendCommandAsync(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;ILcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/jieli/jl_bt_ota/model/base/CommandBase<",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/BaseParameter;",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/CommonResponse;",
            ">;>(",
            "Landroid/bluetooth/BluetoothDevice;",
            "TT;I",
            "Lcom/jieli/jl_bt_ota/interfaces/CommandCallback<",
            "TT;>;)V"
        }
    .end annotation

    const/4 v3, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;IILcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void
.end method

.method public sendCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/jieli/jl_bt_ota/model/base/CommandBase<",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/BaseParameter;",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/CommonResponse;",
            ">;>(",
            "Landroid/bluetooth/BluetoothDevice;",
            "TT;",
            "Lcom/jieli/jl_bt_ota/interfaces/CommandCallback<",
            "TT;>;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->getTimeoutMs()I

    move-result v5

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;IILcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void
.end method

.method public sendRcspCommand(Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/jieli/jl_bt_ota/model/base/CommandBase<",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/BaseParameter;",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/CommonResponse;",
            ">;>(TT;",
            "Lcom/jieli/jl_bt_ota/interfaces/CommandCallback<",
            "TT;>;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->getTargetDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->getTimeoutMs()I

    move-result v1

    invoke-virtual {p0, v0, p1, v1, p2}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->sendCommandAsync(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;ILcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void
.end method

.method public syncDeviceInfo(Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
            "Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lcom/jieli/jl_bt_ota/util/CommandBuilder;->buildGetTargetInfoCmdForAll()Lcom/jieli/jl_bt_ota/model/command/GetTargetInfoCmd;

    move-result-object v0

    new-instance v1, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;

    new-instance v2, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3;

    invoke-direct {v2, p0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$3;-><init>(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;)V

    new-instance p1, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$4;

    invoke-direct {p1, p0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$4;-><init>(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;)V

    const-string v3, "getDeviceInfo"

    invoke-direct {v1, v3, v2, p1}, Lcom/jieli/jl_bt_ota/tool/callback/CmdResultCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;Lcom/jieli/jl_bt_ota/interfaces/rcsp/IHandleResult;)V

    invoke-virtual {p0, v0, v1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->sendRcspCommand(Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V

    return-void
.end method

.method public unregisterOnRcspCallback(Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->f:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->removeCallback(Ljava/lang/Object;)Z

    return-void
.end method
