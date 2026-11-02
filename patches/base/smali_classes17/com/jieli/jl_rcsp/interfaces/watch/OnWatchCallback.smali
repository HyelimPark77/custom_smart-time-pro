.class public abstract Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchCallback;
.super Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onBigDataError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 0

    return-void
.end method

.method public onCurrentWatchInfo(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onDevicePower(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/BatteryInfo;)V
    .locals 0

    return-void
.end method

.method public onExternalFlashMsg(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/response/ExternalFlashMsgResponse;)V
    .locals 0

    return-void
.end method

.method public onExternalFlashWriteFlag(Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 0

    return-void
.end method

.method public onNetworkModuleException(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;)V
    .locals 0

    return-void
.end method

.method public onReceiveBigData(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 0

    return-void
.end method

.method public onResourceUpdateUnfinished(Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    return-void
.end method

.method public onWatchSystemException(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    return-void
.end method

.method public onWatchSystemInit(I)V
    .locals 0

    return-void
.end method
