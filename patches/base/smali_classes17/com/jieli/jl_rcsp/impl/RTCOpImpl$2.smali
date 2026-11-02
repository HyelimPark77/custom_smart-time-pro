.class Lcom/jieli/jl_rcsp/impl/RTCOpImpl$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/data/OnDataTransferListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/impl/RTCOpImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/RTCOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RTCOpImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$2;->a:Lcom/jieli/jl_rcsp/impl/RTCOpImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 0

    return-void
.end method

.method public onReceiveData(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 0

    const/4 p1, 0x2

    if-ne p2, p1, :cond_1

    new-instance p1, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$BigRTCData;

    invoke-direct {p1, p3}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$BigRTCData;-><init>([B)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$2;->a:Lcom/jieli/jl_rcsp/impl/RTCOpImpl;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->a(Lcom/jieli/jl_rcsp/impl/RTCOpImpl;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget p1, p1, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$BigRTCData;->b:I

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$2;->a:Lcom/jieli/jl_rcsp/impl/RTCOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->b(Lcom/jieli/jl_rcsp/impl/RTCOpImpl;)Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$2;->a:Lcom/jieli/jl_rcsp/impl/RTCOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->b(Lcom/jieli/jl_rcsp/impl/RTCOpImpl;)Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    move-result-object p1

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, p2}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onSuccess(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$2;->a:Lcom/jieli/jl_rcsp/impl/RTCOpImpl;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->a(Lcom/jieli/jl_rcsp/impl/RTCOpImpl;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;

    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/RTCOpImpl$2;->a:Lcom/jieli/jl_rcsp/impl/RTCOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->c(Lcom/jieli/jl_rcsp/impl/RTCOpImpl;)Landroid/os/Handler;

    move-result-object p1

    const p2, 0xa100

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeMessages(I)V

    :cond_1
    return-void
.end method
