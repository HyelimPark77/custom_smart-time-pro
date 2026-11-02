.class public final synthetic Lcom/jieli/jl_bt_ota/impl/OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;


# instance fields
.field public final synthetic OXO1:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic XIi00iiXO:I


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/OXO1;->OXO1:Landroid/bluetooth/BluetoothDevice;

    iput p2, p0, Lcom/jieli/jl_bt_ota/impl/OXO1;->XIi00iiXO:I

    return-void
.end method


# virtual methods
.method public final onHandle(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/OXO1;->OXO1:Landroid/bluetooth/BluetoothDevice;

    iget v1, p0, Lcom/jieli/jl_bt_ota/impl/OXO1;->XIi00iiXO:I

    check-cast p1, Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;->iO(Landroid/bluetooth/BluetoothDevice;ILcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V

    return-void
.end method
