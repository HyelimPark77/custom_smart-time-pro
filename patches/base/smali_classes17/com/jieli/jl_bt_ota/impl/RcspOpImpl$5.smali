.class Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/command/OnDataHandlerListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a(Landroid/bluetooth/BluetoothDevice;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$5;->a:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRCSPError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$5;->a:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->c(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;)Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;->onRcspError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method public onReceivedCmd(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$5;->a:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->c(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;)Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$CallbackManager;->onRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_bt_ota/model/base/CommandBase;)V

    return-void
.end method
