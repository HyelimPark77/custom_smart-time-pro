.class public Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;
.super Lcom/jieli/bluetooth_connect/tool/BaseCbManager;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/bluetooth_connect/tool/BaseCbManager<",
        "Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;",
        ">;",
        "Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/tool/BaseCbManager;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/jieli/bluetooth_connect/bean/ErrorInfo;Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;)V
    .locals 0

    invoke-interface {p1, p0}, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;->onDiscoveryError(Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;->onDiscoveryDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V

    return-void
.end method

.method public static synthetic XO0O10(ZZLcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;->onDiscoveryStatusChange(ZZ)V

    return-void
.end method

.method public static synthetic iO(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDiscoveryListener;->onShowProductDialog(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic addListener(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            "listener"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/jieli/bluetooth_connect/tool/BaseCbManager;->addListener(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            "impl"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/jieli/bluetooth_connect/tool/BaseCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public bridge synthetic destroy()V
    .locals 0

    invoke-super {p0}, Lcom/jieli/bluetooth_connect/tool/BaseCbManager;->destroy()V

    return-void
.end method

.method public onDiscoveryDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "bleScanMessage"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IIOXiiXiO;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/IIOXiiXiO;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onDiscoveryError(Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "error"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OXOOIi;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/OXOOIi;-><init>(Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onDiscoveryStatusChange(ZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "isBle",
            "bStart"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XIOOI1Oi;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/XIOOI1Oi;-><init>(ZZ)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onShowProductDialog(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "bleScanMessage"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXOX1OO11;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/XXOX1OO11;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ble/BleScanMessage;)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BtDiscoveryCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public bridge synthetic removeListener(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            "listener"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/jieli/bluetooth_connect/tool/BaseCbManager;->removeListener(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
