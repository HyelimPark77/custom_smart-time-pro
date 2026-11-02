.class Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;-><init>(Landroid/content/Context;Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;)V
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

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$2;->a:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$2;->a:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-static {v0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public onReceivedData(Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl$2;->a:Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;

    invoke-static {v0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;->a(Lcom/jieli/jl_bt_ota/impl/RcspOpImpl;Landroid/bluetooth/BluetoothDevice;[B)V

    return-void
.end method
