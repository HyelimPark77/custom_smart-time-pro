.class Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a(Landroid/bluetooth/BluetoothDevice;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
        "Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/bluetooth/BluetoothDevice;

.field final synthetic b:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$6;->b:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    iput-object p2, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$6;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$6;->b:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->c(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;)Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$6;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0, v1, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;->onRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$6;->b:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->c(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;)Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;

    move-result-object p1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$6;->a:Landroid/bluetooth/BluetoothDevice;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;->onRcspInit(Landroid/bluetooth/BluetoothDevice;Z)V

    return-void
.end method

.method public onSuccess(Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$6;->b:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$6;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$6;->onSuccess(Lcom/jieli/jl_bt_ota/model/response/TargetInfoResponse;)V

    return-void
.end method
