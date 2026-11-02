.class public Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;
.super Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper<",
        "Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;",
        ">;",
        "Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;-><init>()V

    return-void
.end method

.method public static synthetic I0IIOi(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->a(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V

    return-void
.end method

.method public static synthetic IO(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/BleScanMessage;Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/BleScanMessage;Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V

    return-void
.end method

.method public static synthetic IiI10X(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V

    return-void
.end method

.method public static synthetic O00(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->b(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V

    return-void
.end method

.method public static synthetic OIi0(Lcom/jieli/jl_bt_ota/model/base/BaseError;Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->a(Lcom/jieli/jl_bt_ota/model/base/BaseError;Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V

    return-void
.end method

.method public static synthetic OXO1(Landroid/bluetooth/BluetoothDevice;IILcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->a(Landroid/bluetooth/BluetoothDevice;IILcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->d(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V

    return-void
.end method

.method public static synthetic XO0O10(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->c(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V

    return-void
.end method

.method public static synthetic XOO0ii0(ZZLcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->b(ZZLcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V

    return-void
.end method

.method private static synthetic a(Landroid/bluetooth/BluetoothDevice;IILcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V
    .locals 0

    .line 3
    invoke-interface {p3, p0, p1, p2}, Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;->onBleDataBlockChanged(Landroid/bluetooth/BluetoothDevice;II)V

    return-void
.end method

.method private static synthetic a(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V
    .locals 0

    .line 5
    invoke-interface {p2, p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/bt/IBtAssistantCallback;->onA2dpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method private static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V
    .locals 0

    .line 6
    invoke-interface {p1, p0}, Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;->onMandatoryUpgrade(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method private static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/BleScanMessage;Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V
    .locals 0

    .line 2
    invoke-interface {p2, p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/bt/IBtAssistantCallback;->onDiscovery(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/BleScanMessage;)V

    return-void
.end method

.method private static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V
    .locals 0

    .line 4
    invoke-interface {p2, p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;->onReceiveCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    return-void
.end method

.method private static synthetic a(Lcom/jieli/jl_bt_ota/model/base/BaseError;Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V
    .locals 0

    .line 7
    invoke-interface {p1, p0}, Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;->onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method private static synthetic a(ZZLcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/bt/IBtAssistantCallback;->onAdapterStatus(ZZ)V

    return-void
.end method

.method private static synthetic b(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V
    .locals 0

    .line 2
    invoke-interface {p2, p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/bt/IBtAssistantCallback;->onBtDeviceConnection(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method private static synthetic b(ZZLcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/bt/IBtAssistantCallback;->onDiscoveryStatus(ZZ)V

    return-void
.end method

.method private static synthetic c(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;->onConnection(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method private static synthetic d(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/bt/IBtAssistantCallback;->onHfpStatus(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic iO(ZZLcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/tool/callback/BtEventCallbackHelper;->a(ZZLcom/jieli/jl_bt_ota/interfaces/bt/IBluetoothCallback;)V

    return-void
.end method


# virtual methods
.method public onA2dpStatus(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XIOi1O;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/XIOi1O;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->callbackEvent(Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;)V

    return-void
.end method

.method public onAdapterStatus(ZZ)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I01O1iOOO;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/I01O1iOOO;-><init>(ZZ)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->callbackEvent(Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;)V

    return-void
.end method

.method public onBleDataBlockChanged(Landroid/bluetooth/BluetoothDevice;II)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXXXXIO;

    invoke-direct {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/iXXXXIO;-><init>(Landroid/bluetooth/BluetoothDevice;II)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->callbackEvent(Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;)V

    return-void
.end method

.method public onBtDeviceConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXIIIOX;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/XXIIIOX;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->callbackEvent(Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;)V

    return-void
.end method

.method public onConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XOI0OX10;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/XOI0OX10;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->callbackEvent(Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;)V

    return-void
.end method

.method public onDiscovery(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/BleScanMessage;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IOiXXiI;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/IOiXXiI;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/BleScanMessage;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->callbackEvent(Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;)V

    return-void
.end method

.method public onDiscoveryStatus(ZZ)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OiX10IX10;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/OiX10IX10;-><init>(ZZ)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->callbackEvent(Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;)V

    return-void
.end method

.method public onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XIX01IX;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/XIX01IX;-><init>(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->callbackEvent(Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;)V

    return-void
.end method

.method public onHfpStatus(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iIiOiiXII;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/iIiOiiXII;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->callbackEvent(Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;)V

    return-void
.end method

.method public onMandatoryUpgrade(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XiOiI;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/XiOiI;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->callbackEvent(Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;)V

    return-void
.end method

.method public onReceiveCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0XOXXi;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/X0XOXXi;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->callbackEvent(Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;)V

    return-void
.end method
