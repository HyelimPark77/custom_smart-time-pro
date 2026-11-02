.class Lcom/jieli/jl_rcsp/impl/NetworkOpImpl$CallbackManager;
.super Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/impl/NetworkOpImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallbackManager"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager<",
        "Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkListener;",
        ">;",
        "Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkListener;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;-><init>(Landroid/os/Handler;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkListener;)V
    .locals 0

    .line 1
    invoke-interface {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkListener;->onNetworkInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkListener;)V
    .locals 0

    .line 2
    invoke-interface {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkListener;->onNetworkOTAState(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;)V

    return-void
.end method


# virtual methods
.method public onNetworkInfo(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/impl/XO0O10;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_rcsp/impl/XO0O10;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onNetworkOTAState(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/impl/O00;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_rcsp/impl/O00;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkOTAState;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method
