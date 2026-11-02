.class Lcom/jieli/jl_rcsp/impl/WatchOpImpl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/data/OnDataTransferListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_rcsp/impl/WatchOpImpl;-><init>(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$1;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$1;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->onBigDataError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public onReceiveData(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$1;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;)Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/jieli/jl_rcsp/tool/WatchCallbackManager;->onReceiveBigData(Landroid/bluetooth/BluetoothDevice;I[B)V

    const/4 p1, 0x2

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$1;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    iget-object p2, p1, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->mRcspEventListenerManager:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-static {p1, p2, p3}, Lcom/jieli/jl_rcsp/impl/RTCOpImpl;->parseRTCBigData(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;[B)V

    return-void

    :cond_0
    const/4 p1, 0x5

    if-ne p2, p1, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/WatchOpImpl$1;->a:Lcom/jieli/jl_rcsp/impl/WatchOpImpl;

    invoke-static {p1, p3}, Lcom/jieli/jl_rcsp/impl/WatchOpImpl;->a(Lcom/jieli/jl_rcsp/impl/WatchOpImpl;[B)V

    :cond_1
    return-void
.end method
