.class Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl$CallbackManager;
.super Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/data/OnDataTransferListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/impl/DataTransferOpImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallbackManager"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager<",
        "Lcom/jieli/jl_rcsp/interfaces/data/OnDataTransferListener;",
        ">;",
        "Lcom/jieli/jl_rcsp/interfaces/data/OnDataTransferListener;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;-><init>(Landroid/os/Handler;)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;I[BLcom/jieli/jl_rcsp/interfaces/data/OnDataTransferListener;)V
    .locals 0

    .line 1
    invoke-interface {p3, p0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/data/OnDataTransferListener;->onReceiveData(Landroid/bluetooth/BluetoothDevice;I[B)V

    return-void
.end method

.method public static synthetic a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;Lcom/jieli/jl_rcsp/interfaces/data/OnDataTransferListener;)V
    .locals 0

    .line 2
    invoke-interface {p2, p0, p1}, Lcom/jieli/jl_rcsp/interfaces/data/OnDataTransferListener;->onError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void
.end method


# virtual methods
.method public onError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/impl/XIi00iiXO;

    invoke-direct {v0, p1, p2}, Lcom/jieli/jl_rcsp/impl/XIi00iiXO;-><init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onReceiveData(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/impl/iO;

    invoke-direct {v0, p1, p2, p3}, Lcom/jieli/jl_rcsp/impl/iO;-><init>(Landroid/bluetooth/BluetoothDevice;I[B)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method
