.class Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Lcom/jieli/jl_rcsp/model/data/SendDataCache;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
        "Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public onSuccess(Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;)V
    .locals 6

    .line 2
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->getResult()I

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    :try_start_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->getMessage()[B

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->getMessage()[B

    move-result-object v0

    array-length v0, v0

    if-lez v0, :cond_0

    .line 4
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->getMessage()[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 6
    :cond_0
    const-string v0, ""

    :goto_0
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->getResult()I

    move-result p1

    const/16 v1, 0x30

    const/16 v2, 0x3005

    invoke-static {v1, v2, p1, v0}, Lcom/jieli/jl_rcsp/constant/RcspErrorCode;->buildJsonError(IIILjava/lang/String;)Lcom/jieli/jl_rcsp/model/base/BaseError;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$3;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->isDataTransfer()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_1

    .line 8
    :cond_2
    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;->isEnd()Z

    move-result p1

    const/high16 v0, 0x42c80000    # 100.0f

    if-eqz p1, :cond_3

    .line 9
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->getCallback()Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;

    move-result-object p1

    .line 10
    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/data/DataParams;->getDataType()I

    move-result v1

    .line 11
    iget-object v2, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {v2}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    move-result-object v2

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/data/SendParams;->getData()[B

    move-result-object v2

    .line 12
    iget-object v3, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {v3}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    move-result-object v3

    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->release()V

    .line 13
    iget-object v3, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->a(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;Lcom/jieli/jl_rcsp/model/data/SendDataCache;)Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    .line 14
    iget-object v3, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {v3}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->f(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;

    move-result-object v3

    iget-object v4, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {v4}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->e(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Lcom/jieli/jl_rcsp/tool/DeviceStatusManager;->updateDataTransfer(Landroid/bluetooth/BluetoothDevice;Z)V

    if-eqz p1, :cond_5

    .line 15
    invoke-interface {p1, v0}, Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;->onProgress(F)V

    .line 16
    invoke-interface {p1, v1, v2}, Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;->onStop(I[B)V

    return-void

    .line 17
    :cond_3
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/SendParams;->getDataLen()I

    move-result p1

    if-lez p1, :cond_4

    .line 18
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->getOffset()I

    move-result p1

    int-to-float p1, p1

    mul-float/2addr p1, v0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/data/SendParams;->getDataLen()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p1, v0

    .line 19
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->getCallback()Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 20
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/data/SendDataCache;->getCallback()Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;->onProgress(F)V

    .line 21
    :cond_4
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$3;->a:Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->c(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;)Lcom/jieli/jl_rcsp/model/data/SendDataCache;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;->b(Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;Lcom/jieli/jl_rcsp/model/data/SendDataCache;)V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$3;->onSuccess(Lcom/jieli/jl_rcsp/model/command/data/DataTransferCmd$DataTransferResponse;)V

    return-void
.end method
