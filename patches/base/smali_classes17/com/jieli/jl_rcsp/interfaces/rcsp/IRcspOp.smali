.class public interface abstract Lcom/jieli/jl_rcsp/interfaces/rcsp/IRcspOp;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract registerOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V
.end method

.method public abstract registerOnRcspEventListener(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
.end method

.method public abstract release()V
.end method

.method public abstract sendCommandAsync(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;ILcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/jieli/jl_rcsp/model/base/CommandBase;",
            ">(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/model/base/CommandBase;",
            "I",
            "Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback<",
            "TT;>;)V"
        }
    .end annotation
.end method

.method public abstract sendCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/jieli/jl_rcsp/model/base/CommandBase;",
            ">(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/model/base/CommandBase;",
            "Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback<",
            "TT;>;)V"
        }
    .end annotation
.end method

.method public abstract switchConnectedDevice(Landroid/bluetooth/BluetoothDevice;)V
.end method

.method public abstract unregisterOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V
.end method

.method public abstract unregisterOnRcspEventListener(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspEventListener;)V
.end method
