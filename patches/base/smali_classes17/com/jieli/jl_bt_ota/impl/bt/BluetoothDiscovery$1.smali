.class Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$1;
.super Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$1;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/interfaces/bt/OnBtAssistantCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdapterStatus(ZZ)V
    .locals 0

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$1;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->isScanning()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$1;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;Z)V

    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery$1;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothDiscovery;)V

    :cond_1
    return-void
.end method
