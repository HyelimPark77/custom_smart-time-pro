.class public final synthetic Lcom/jieli/jl_bt_ota/impl/XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;


# instance fields
.field public final synthetic OXO1:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic XIi00iiXO:Lcom/jieli/jl_bt_ota/model/base/BaseError;


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/XIi00iiXO;->OXO1:Landroid/bluetooth/BluetoothDevice;

    iput-object p2, p0, Lcom/jieli/jl_bt_ota/impl/XIi00iiXO;->XIi00iiXO:Lcom/jieli/jl_bt_ota/model/base/BaseError;

    return-void
.end method


# virtual methods
.method public final onHandle(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/XIi00iiXO;->OXO1:Landroid/bluetooth/BluetoothDevice;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/XIi00iiXO;->XIi00iiXO:Lcom/jieli/jl_bt_ota/model/base/BaseError;

    check-cast p1, Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;->XIi00iiXO(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BaseError;Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V

    return-void
.end method
