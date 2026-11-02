.class public Lcom/jieli/jl_rcsp/tool/NfcEventCbHelper;
.super Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/nfc/OnNfcEventCallback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager<",
        "Lcom/jieli/jl_rcsp/interfaces/nfc/OnNfcEventCallback;",
        ">;",
        "Lcom/jieli/jl_rcsp/interfaces/nfc/OnNfcEventCallback;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/interfaces/nfc/OnNfcEventCallback;)V
    .locals 0

    .line 4
    invoke-interface {p1, p0}, Lcom/jieli/jl_rcsp/interfaces/nfc/OnNfcEventCallback;->onRequestSynNfcMsg(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/NfcMsg;Lcom/jieli/jl_rcsp/interfaces/nfc/OnNfcEventCallback;)V
    .locals 0

    .line 2
    invoke-interface {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/nfc/OnNfcEventCallback;->onModifyNfcMsg(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/NfcMsg;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;Lcom/jieli/jl_rcsp/interfaces/nfc/OnNfcEventCallback;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/nfc/OnNfcEventCallback;->onNfcMsgChange(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;SLcom/jieli/jl_rcsp/interfaces/nfc/OnNfcEventCallback;)V
    .locals 0

    .line 3
    invoke-interface {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/nfc/OnNfcEventCallback;->onDefaultNfc(Landroid/bluetooth/BluetoothDevice;S)V

    return-void
.end method


# virtual methods
.method public onDefaultNfc(Landroid/bluetooth/BluetoothDevice;S)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/a81;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/a81;-><init>(Landroid/bluetooth/BluetoothDevice;S)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onModifyNfcMsg(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/NfcMsg;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/x71;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/x71;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/NfcMsg;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onNfcMsgChange(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/NfcMsg;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/z71;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/z71;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onRequestSynNfcMsg(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/y71;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/y71;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method
