.class Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$5;
.super Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;->onBleMtuChange(Landroid/bluetooth/BluetoothGatt;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

.field final synthetic val$gatt:Landroid/bluetooth/BluetoothGatt;

.field final synthetic val$mtu:I

.field final synthetic val$status:I


# direct methods
.method public constructor <init>(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;Landroid/bluetooth/BluetoothGatt;II)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010,
            0x1010
        }
        names = {
            null,
            null,
            null,
            null
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$5;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager;

    iput-object p2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$5;->val$gatt:Landroid/bluetooth/BluetoothGatt;

    iput p3, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$5;->val$mtu:I

    iput p4, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$5;->val$status:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$BtEventCbImpl;-><init>(Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$1;)V

    return-void
.end method


# virtual methods
.method public onCallback(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V
    .locals 3

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$5;->val$gatt:Landroid/bluetooth/BluetoothGatt;

    iget v1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$5;->val$mtu:I

    iget v2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BtEventCbManager$5;->val$status:I

    invoke-virtual {p1, v0, v1, v2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;->onBleMtuChange(Landroid/bluetooth/BluetoothGatt;II)V

    return-void
.end method
