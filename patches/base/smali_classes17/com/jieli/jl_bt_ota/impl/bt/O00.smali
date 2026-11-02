.class public final synthetic Lcom/jieli/jl_bt_ota/impl/bt/O00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/bluetooth/BluetoothAdapter$LeScanCallback;


# instance fields
.field public final synthetic OXO1:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;


# direct methods
.method public synthetic constructor <init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/O00;->OXO1:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    return-void
.end method


# virtual methods
.method public final onLeScan(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/O00;->OXO1:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    invoke-static {v0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->OXO1(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;Landroid/bluetooth/BluetoothDevice;I[B)V

    return-void
.end method
