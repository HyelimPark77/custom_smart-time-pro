.class final Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;
.super Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CallbackManager"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper<",
        "Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;-><init>()V

    return-void
.end method

.method public static synthetic O00(Landroid/bluetooth/BluetoothDevice;ZLcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;->a(Landroid/bluetooth/BluetoothDevice;ZLcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V

    return-void
.end method

.method public static synthetic OXO1(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BaseError;Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BaseError;Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V

    return-void
.end method

.method public static synthetic XO0O10(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V

    return-void
.end method

.method private static synthetic a(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V
    .locals 0

    .line 5
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;->onConnectStateChange(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method private static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V
    .locals 0

    .line 4
    invoke-virtual {p1, p0}, Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;->onMandatoryUpgrade(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method private static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BaseError;Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V
    .locals 0

    .line 3
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;->onRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method private static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V
    .locals 0

    .line 2
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;->onRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    return-void
.end method

.method private static synthetic a(Landroid/bluetooth/BluetoothDevice;ZLcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V
    .locals 0

    .line 1
    invoke-virtual {p2, p0, p1}, Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;->onRcspInit(Landroid/bluetooth/BluetoothDevice;Z)V

    return-void
.end method

.method public static synthetic iO(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;->a(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V

    return-void
.end method


# virtual methods
.method public onConnectStateChange(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_bt_ota/impl/OXO1;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/OXO1;-><init>(Landroid/bluetooth/BluetoothDevice;I)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->callbackEvent(Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;)V

    return-void
.end method

.method public onMandatoryUpgrade(Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_bt_ota/impl/iO;

    invoke-direct {v0, p1}, Lcom/jieli/jl_bt_ota/impl/iO;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->callbackEvent(Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;)V

    return-void
.end method

.method public onRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_bt_ota/impl/XO0O10;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/XO0O10;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->callbackEvent(Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;)V

    return-void
.end method

.method public onRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_bt_ota/impl/XIi00iiXO;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/XIi00iiXO;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->callbackEvent(Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;)V

    return-void
.end method

.method public onRcspInit(Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_bt_ota/impl/O00;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/O00;-><init>(Landroid/bluetooth/BluetoothDevice;Z)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;->callbackEvent(Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;)V

    return-void
.end method
