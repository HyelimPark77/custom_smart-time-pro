.class public interface abstract Lcom/jieli/jl_rcsp/interfaces/nfc/OnNfcEventCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract onDefaultNfc(Landroid/bluetooth/BluetoothDevice;S)V
.end method

.method public abstract onModifyNfcMsg(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/NfcMsg;)V
.end method

.method public abstract onNfcMsgChange(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/NfcMsg;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onRequestSynNfcMsg(Landroid/bluetooth/BluetoothDevice;)V
.end method
