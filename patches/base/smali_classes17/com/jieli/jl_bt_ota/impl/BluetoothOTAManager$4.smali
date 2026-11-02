.class Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/IActionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->startOTA(Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/jieli/jl_bt_ota/interfaces/IActionCallback<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/bluetooth/BluetoothDevice;

.field final synthetic b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$4;->b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    iput-object p2, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$4;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$4;->b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    const-string v1, "startOTA"

    invoke-static {v0, v1, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->a(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Ljava/lang/String;Lcom/jieli/jl_bt_ota/model/base/BaseError;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Boolean;)V
    .locals 1

    .line 2
    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$4;->b:Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$4;->a:Landroid/bluetooth/BluetoothDevice;

    invoke-static {p1, v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->b(Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager$4;->onSuccess(Ljava/lang/Boolean;)V

    return-void
.end method
