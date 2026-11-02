.class public Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;
.super Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper<",
        "Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;-><init>()V

    return-void
.end method

.method public static synthetic IiI10X(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;->a(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V

    return-void
.end method

.method public static synthetic O00(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/BleScanMessage;Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/BleScanMessage;Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V

    return-void
.end method

.method public static synthetic OXO1(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;->b(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;->c(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V

    return-void
.end method

.method public static synthetic XO0O10(ZZLcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;->b(ZZLcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V

    return-void
.end method

.method private static synthetic a(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V
    .locals 0

    .line 3
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;->onA2dpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method private static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/BleScanMessage;Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V
    .locals 0

    .line 2
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;->onDiscovery(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/BleScanMessage;)V

    return-void
.end method

.method private static synthetic a(ZZLcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;->onAdapterStatus(ZZ)V

    return-void
.end method

.method private static synthetic b(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V
    .locals 0

    .line 2
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;->onBtDeviceConnection(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method private static synthetic b(ZZLcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;->onDiscoveryStatus(ZZ)V

    return-void
.end method

.method private static synthetic c(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V
    .locals 0

    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;->onHfpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic iO(ZZLcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtAssistantCallbackManager;->a(ZZLcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;)V

    return-void
.end method


# virtual methods
.method public onA2dpStatus(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IOX11iI0;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/IOX11iI0;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->callbackEvent(Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;)V

    return-void
.end method

.method public onAdapterStatus(ZZ)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O001XIiX;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/O001XIiX;-><init>(ZZ)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->callbackEvent(Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;)V

    return-void
.end method

.method public onBtDeviceConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XOiO10;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/XOiO10;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->callbackEvent(Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;)V

    return-void
.end method

.method public onDiscovery(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/BleScanMessage;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XX0Ii0O;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/XX0Ii0O;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/BleScanMessage;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->callbackEvent(Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;)V

    return-void
.end method

.method public onDiscoveryStatus(ZZ)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IOi1I0Xi;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/IOi1I0Xi;-><init>(ZZ)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->callbackEvent(Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;)V

    return-void
.end method

.method public onHfpStatus(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iiIi1XIXI;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/iiIi1XIXI;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->callbackEvent(Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;)V

    return-void
.end method
