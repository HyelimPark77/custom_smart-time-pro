.class public Lcom/jieli/bluetooth_connect/tool/SppEventCbManager;
.super Lcom/jieli/bluetooth_connect/tool/BaseCbManager;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtSppListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/bluetooth_connect/tool/BaseCbManager<",
        "Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtSppListener;",
        ">;",
        "Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtSppListener;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/tool/BaseCbManager;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;[BLcom/jieli/bluetooth_connect/interfaces/listener/OnBtSppListener;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtSppListener;->onSppDataNotify(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;[B)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtSppListener;)V
    .locals 0

    invoke-interface {p1, p0}, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtSppListener;->onSwitchSppDevice(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic iO(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;ILcom/jieli/bluetooth_connect/interfaces/listener/OnBtSppListener;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtSppListener;->onSppConnection(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;I)V

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

.method public onSppConnection(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;I)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "device",
            "sppUUID",
            "status"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/q65;

    invoke-direct {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/q65;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/SppEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onSppDataNotify(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;[B)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "device",
            "sppUUID",
            "data"
        }
    .end annotation

    if-nez p3, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/p65;

    invoke-direct {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/p65;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;[B)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/SppEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onSwitchSppDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "device"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/r65;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/r65;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/SppEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

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
