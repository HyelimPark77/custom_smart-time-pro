.class public final synthetic Lcom/jieli/jl_bt_ota/impl/O00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;


# instance fields
.field public final synthetic OXO1:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic XIi00iiXO:Z


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothDevice;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/O00;->OXO1:Landroid/bluetooth/BluetoothDevice;

    iput-boolean p2, p0, Lcom/jieli/jl_bt_ota/impl/O00;->XIi00iiXO:Z

    return-void
.end method


# virtual methods
.method public final onHandle(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/O00;->OXO1:Landroid/bluetooth/BluetoothDevice;

    iget-boolean v1, p0, Lcom/jieli/jl_bt_ota/impl/O00;->XIi00iiXO:Z

    check-cast p1, Lcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;->O00(Landroid/bluetooth/BluetoothDevice;ZLcom/jieli/jl_bt_ota/interfaces/rcsp/OnRcspCallback;)V

    return-void
.end method
