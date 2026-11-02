.class public interface abstract Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/bt/IBtAssistantCallback;


# virtual methods
.method public abstract onBleDataBlockChanged(Landroid/bluetooth/BluetoothDevice;II)V
.end method

.method public abstract onConnection(Landroid/bluetooth/BluetoothDevice;I)V
.end method

.method public abstract onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
.end method

.method public abstract onMandatoryUpgrade(Landroid/bluetooth/BluetoothDevice;)V
.end method

.method public abstract onReceiveCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V
.end method
