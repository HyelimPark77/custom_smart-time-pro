.class Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->sendLargeData(Lcom/jieli/jl_rcsp/model/data/SendParams;Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
        "Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$1;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$1;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public onSuccess(Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;)V
    .locals 3

    .line 2
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;->getResult()I

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;->getResult()I

    move-result p1

    const/16 v0, 0x3005

    const/4 v1, 0x0

    const/16 v2, 0x30

    invoke-static {v2, v0, p1, v1}, Lcom/jieli/jl_rcsp/constant/RcspErrorCode;->buildJsonError(IIILjava/lang/String;)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$1;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$1;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->isDataTransfer()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$1;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    .line 5
    :cond_1
    invoke-static {}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getInstance()Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$1;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    move-result-object v1

    invoke-interface {v1}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->getMaxReceiveMtu(Landroid/bluetooth/BluetoothDevice;)I

    move-result v0

    .line 6
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;->getReceiveDataLimit()I

    move-result v1

    if-lt v1, v0, :cond_2

    .line 7
    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Data Receiving limit exceeded the protocol MTU[%d] range."

    invoke-static {v1, v0}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1001

    invoke-direct {p1, v1, v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$1;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$1;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    move-result-object v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;->getSendDataLimit()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/data/DataParams;->setSendLimit(I)Lcom/jieli/jl_rcsp/model/data/DataParams;

    .line 9
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$1;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    move-result-object v0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;->getReceiveDataLimit()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/model/data/DataParams;->setReceiveLimit(I)Lcom/jieli/jl_rcsp/model/data/DataParams;

    .line 10
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$1;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->setOffset(I)V

    .line 11
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$1;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->setSeq(I)V

    .line 12
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$1;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->getCallback()Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 13
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$1;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->getCallback()Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;->onBegin(I)V

    .line 14
    :cond_3
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$1;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;Lcom/jieli/jl_rcsp/model/data/SendDataCache;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$1;->onSuccess(Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$SendDataResponse;)V

    return-void
.end method
