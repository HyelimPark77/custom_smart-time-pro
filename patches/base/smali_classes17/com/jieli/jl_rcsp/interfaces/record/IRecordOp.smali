.class public interface abstract Lcom/jieli/jl_rcsp/interfaces/record/IRecordOp;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract addOnRecordStateCallback(Lcom/jieli/jl_rcsp/interfaces/record/OnRecordStateCallback;)V
.end method

.method public abstract getRecordState()Lcom/jieli/jl_rcsp/model/RecordState;
.end method

.method public abstract release()V
.end method

.method public abstract removeOnRecordStateCallback(Lcom/jieli/jl_rcsp/interfaces/record/OnRecordStateCallback;)V
.end method

.method public abstract setSupportPlayTTS(Z)V
.end method

.method public abstract setSupportSyncIatText(Z)V
.end method

.method public abstract setSupportSyncNlpText(Z)V
.end method

.method public abstract startRecord(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/RecordParam;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/model/RecordParam;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract stopRecord(Landroid/bluetooth/BluetoothDevice;IZZZLcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "IZZZ",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method
