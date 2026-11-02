.class public final synthetic Lcom/jieli/jl_bt_ota/impl/bt/XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic I1:Landroid/bluetooth/BluetoothDevice;

.field public final synthetic IO:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

.field public final synthetic X11iII1O1:I

.field public final synthetic iX1O1:Landroid/bluetooth/BluetoothGatt;


# direct methods
.method public synthetic constructor <init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothGatt;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/XIi00iiXO;->IO:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    iput-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/XIi00iiXO;->I1:Landroid/bluetooth/BluetoothDevice;

    iput-object p3, p0, Lcom/jieli/jl_bt_ota/impl/bt/XIi00iiXO;->iX1O1:Landroid/bluetooth/BluetoothGatt;

    iput p4, p0, Lcom/jieli/jl_bt_ota/impl/bt/XIi00iiXO;->X11iII1O1:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/XIi00iiXO;->IO:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/XIi00iiXO;->I1:Landroid/bluetooth/BluetoothDevice;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/XIi00iiXO;->iX1O1:Landroid/bluetooth/BluetoothGatt;

    iget v3, p0, Lcom/jieli/jl_bt_ota/impl/bt/XIi00iiXO;->X11iII1O1:I

    invoke-static {v0, v1, v2, v3}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;->XIi00iiXO(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBle;Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothGatt;I)V

    return-void
.end method
