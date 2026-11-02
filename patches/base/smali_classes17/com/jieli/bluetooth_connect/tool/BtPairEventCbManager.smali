.class public Lcom/jieli/bluetooth_connect/tool/BtPairEventCbManager;
.super Lcom/jieli/bluetooth_connect/tool/BaseCbManager;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/bluetooth_connect/tool/BaseCbManager<",
        "Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;",
        ">;",
        "Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/tool/BaseCbManager;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(ZZLcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;->onAdapterStatus(ZZ)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;->onBtDeviceBond(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic iO(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ErrorInfo;Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;->onPairError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V

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

.method public onAdapterStatus(ZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "bEnabled",
            "bHasBle"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XI10IO;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/XI10IO;-><init>(ZZ)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BtPairEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onBtDeviceBond(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "status"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XOi10;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/XOi10;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BtPairEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onPairError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "error"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OI10iiO;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/OI10iiO;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BtPairEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

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
