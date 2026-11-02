.class public interface abstract Lcom/jieli/jl_rcsp/interfaces/health/IHealthOp;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract configHealthSettings(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/health/IHealthSettingToAttr;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/model/device/health/IHealthSettingToAttr;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract configHealthSettings(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract pauseSports(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
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

.method public abstract readHealthData(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/HealthDataQuery;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/model/HealthDataQuery;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract readHealthSettings(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "I",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract readRealTimeSportsData(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Lcom/jieli/jl_rcsp/model/RealTimeSportsData;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract readSportsInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract resumeSports(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
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

.method public abstract startSports(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "I",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract stopSports(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
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
