.class public Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;
.super Lcom/jieli/bluetooth_connect/tool/BaseCbManager;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/bluetooth_connect/tool/BaseCbManager<",
        "Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;",
        ">;",
        "Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/bluetooth_connect/tool/BaseCbManager;-><init>()V

    return-void
.end method

.method public static synthetic O00(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;->onA2dpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic OXO1(ZILandroid/bluetooth/BluetoothProfile;Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;)V
    .locals 0

    invoke-interface {p3, p0, p1, p2}, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;->onEdrService(ZILandroid/bluetooth/BluetoothProfile;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;->onHfpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic XO0O10(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;->onBrEdrConnection(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic iO(Landroid/bluetooth/BluetoothDevice;[Landroid/os/ParcelUuid;Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/bluetooth_connect/interfaces/listener/OnBrEdrListener;->onDeviceUuids(Landroid/bluetooth/BluetoothDevice;[Landroid/os/ParcelUuid;)V

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

.method public onA2dpStatus(Landroid/bluetooth/BluetoothDevice;I)V
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Oi0IX10i;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/Oi0IX10i;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onBrEdrConnection(Landroid/bluetooth/BluetoothDevice;I)V
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OO0IIiX;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/OO0IIiX;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onDeviceUuids(Landroid/bluetooth/BluetoothDevice;[Landroid/os/ParcelUuid;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "uuids"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XiI0iiXO1;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/XiI0iiXO1;-><init>(Landroid/bluetooth/BluetoothDevice;[Landroid/os/ParcelUuid;)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onEdrService(ZILandroid/bluetooth/BluetoothProfile;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "isConnected",
            "profile",
            "proxy"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OO0OiXXI;

    invoke-direct {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/OO0OiXXI;-><init>(ZILandroid/bluetooth/BluetoothProfile;)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

    return-void
.end method

.method public onHfpStatus(Landroid/bluetooth/BluetoothDevice;I)V
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXXX0OO;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/IXXX0OO;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/bluetooth_connect/tool/BrEdrEventCbManager;->callbackEvent(Lcom/jieli/bluetooth_connect/tool/BaseCbManager$CallbackImpl;)V

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
