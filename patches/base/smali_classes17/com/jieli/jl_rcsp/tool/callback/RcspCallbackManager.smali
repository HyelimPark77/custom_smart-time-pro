.class public Lcom/jieli/jl_rcsp/tool/callback/RcspCallbackManager;
.super Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager<",
        "Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V
    .locals 0

    .line 5
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;->onConnectStateChange(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V
    .locals 0

    .line 4
    invoke-virtual {p1, p0}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;->onMandatoryUpgrade(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V
    .locals 0

    .line 3
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;->onRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V
    .locals 0

    .line 2
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;->onRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;ZLcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;->onRcspInit(Landroid/bluetooth/BluetoothDevice;Z)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;[BLcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V
    .locals 0

    .line 6
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;->onPutDataToDataHandler(Landroid/bluetooth/BluetoothDevice;[B)V

    return-void
.end method

.method public static synthetic b(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V
    .locals 0

    .line 2
    invoke-virtual {p1, p0}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;->onSwitchConnectedDevice(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic b(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;->onRcspDataCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    return-void
.end method


# virtual methods
.method public onConnectStateChange(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/id2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/id2;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onMandatoryUpgrade(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/dd2;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/dd2;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onPutDataToDataHandler(Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/hd2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/hd2;-><init>(Landroid/bluetooth/BluetoothDevice;[B)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ed2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/ed2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onRcspDataCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/fd2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/fd2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/cd2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/cd2;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onRcspInit(Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/gd2;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/gd2;-><init>(Landroid/bluetooth/BluetoothDevice;Z)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onSwitchConnectedDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/jd2;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/jd2;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method
