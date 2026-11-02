.class public interface abstract Lcom/jieli/jl_bt_ota/interfaces/rcsp/IRcspOp;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract configure(Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;)V
.end method

.method public abstract getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;
.end method

.method public abstract getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;
.end method

.method public abstract getTargetDevice()Landroid/bluetooth/BluetoothDevice;
.end method

.method public abstract registerOnRcspCallback(Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V
.end method

.method public abstract release()V
.end method

.method public abstract sendCommandAsync(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;ILcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/jieli/jl_bt_ota/model/base/CommandBase<",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/BaseParameter;",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/CommonResponse;",
            ">;>(",
            "Landroid/bluetooth/BluetoothDevice;",
            "TT;I",
            "Lcom/jieli/jl_bt_ota/interfaces/CommandCallback<",
            "TT;>;)V"
        }
    .end annotation
.end method

.method public abstract sendCommandResponse(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/CommandCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/jieli/jl_bt_ota/model/base/CommandBase<",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/BaseParameter;",
            "+",
            "Lcom/jieli/jl_bt_ota/model/base/CommonResponse;",
            ">;>(",
            "Landroid/bluetooth/BluetoothDevice;",
            "TT;",
            "Lcom/jieli/jl_bt_ota/interfaces/CommandCallback<",
            "TT;>;)V"
        }
    .end annotation
.end method

.method public abstract unregisterOnRcspCallback(Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V
.end method
