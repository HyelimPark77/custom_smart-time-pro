.class Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/bt/IBtProxy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$2;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public setOnBtListener(Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtListener;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$2;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {v0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtListener;)Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtListener;

    return-void
.end method

.method public writeData(Landroid/bluetooth/BluetoothDevice;[B)Z
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$2;->a:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    invoke-static {v0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;[B)Z

    move-result p1

    return p1
.end method
