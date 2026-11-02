.class Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->readLargeData(Lcom/jieli/jl_rcsp/model/data/DataParams;Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
        "Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataResponse;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;

.field public final synthetic b:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic c:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$2;->c:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$2;->a:Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$2;->b:Landroid/bluetooth/BluetoothDevice;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$2;->a:Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;->onError(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void
.end method

.method public onSuccess(Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataResponse;)V
    .locals 9

    .line 2
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataResponse;->getResult()I

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataResponse;->getResult()I

    move-result p1

    const/16 v0, 0x3005

    const/4 v1, 0x0

    const/16 v2, 0x30

    invoke-static {v2, v0, p1, v1}, Lcom/jieli/jl_rcsp/constant/RcspErrorCode;->buildJsonError(IIILjava/lang/String;)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$2;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getInstance()Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$2;->c:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    move-result-object v1

    invoke-interface {v1}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getMaxReceiveMtu(Landroid/bluetooth/BluetoothDevice;)I

    move-result v0

    .line 5
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataResponse;->getSendDataLimit()I

    move-result v1

    if-lt v1, v0, :cond_1

    .line 6
    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Data sending limit exceeded the protocol MTU[%d] range."

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1001

    invoke-direct {p1, v1, v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$2;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    .line 7
    :cond_1
    new-instance v2, Lcom/jieli/jl_rcsp/model/data/ReadParams;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->getType()I

    move-result v3

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$TransferParamResponse;->getVersion()I

    move-result v4

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataResponse;->getSendDataLimit()I

    move-result v5

    .line 8
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataResponse;->getReceiveDataLimit()I

    move-result v6

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataResponse;->getDataLen()I

    move-result v7

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataResponse;->getCrc()S

    move-result v8

    invoke-direct/range {v2 .. v8}, Lcom/jieli/jl_rcsp/model/data/ReadParams;-><init>(IIIIIS)V

    .line 9
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$2;->c:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    new-instance v0, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    invoke-direct {v0, v2}, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;-><init>(Lcom/jieli/jl_rcsp/model/data/ReadParams;)V

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;Lcom/jieli/jl_rcsp/model/data/ReadDataCache;)Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    .line 10
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$2;->c:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->d(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    move-result-object p1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$2;->a:Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->setCallback(Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;)V

    .line 11
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$2;->c:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->f(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object p1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$2;->c:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDataTransfer(Landroid/bluetooth/BluetoothDevice;Z)V

    .line 12
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$2;->c:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->d(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->getCallback()Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 13
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$2;->c:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->d(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/model/data/ReadDataCache;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->getCallback()Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;->onBegin(I)V

    .line 14
    :cond_2
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$2;->c:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->g(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Landroid/os/Handler;

    move-result-object p1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$2;->c:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->g(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$2;->b:Landroid/bluetooth/BluetoothDevice;

    const/16 v2, 0x1475

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    sget v1, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->WAITING_FOR_DATA_TIMEOUT:I

    int-to-long v1, v1

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataResponse;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$2;->onSuccess(Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$ReadDataResponse;)V

    return-void
.end method
