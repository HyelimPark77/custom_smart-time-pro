.class public interface abstract Lcom/jieli/jl_rcsp/interfaces/network/INetworkOp;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract addOnNetworkListener(Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkListener;)V
.end method

.method public abstract cancelNetworkOTA(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract isNetworkOTA()Z
.end method

.method public abstract queryNetworkInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract removeOnNetworkListener(Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkListener;)V
.end method

.method public abstract startNetworkOTA(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/network/OTAParam;Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;)V
.end method
