.class public interface abstract Lcom/jieli/jl_rcsp/interfaces/nfc/INfcOp;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract addNfcFile(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;ILcom/jieli/jl_rcsp/task/TaskListener;)V
.end method

.method public abstract addOnNfcEventCallback(Lcom/jieli/jl_rcsp/interfaces/nfc/OnNfcEventCallback;)V
.end method

.method public abstract getDefaultNfc(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "I",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Short;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract modifyNfcMsg(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$ModifyMsgParam;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract removeNfcMsg(Landroid/bluetooth/BluetoothDevice;ISLcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "IS",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract removeOnNfcEventCallback(Lcom/jieli/jl_rcsp/interfaces/nfc/OnNfcEventCallback;)V
.end method

.method public abstract setDefaultNfc(Landroid/bluetooth/BluetoothDevice;ISLcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "IS",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract syncNfcMsg(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/nfc/OnSyncNfcMsgListener;)V
.end method
