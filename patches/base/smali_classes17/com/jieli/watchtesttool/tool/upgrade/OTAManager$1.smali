.class Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$1;
.super Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;


# direct methods
.method public constructor <init>(Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$1;->this$0:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    invoke-direct {p0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onBleMtuChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$1;->this$0:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    invoke-virtual {v0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V

    return-void
.end method

.method public onConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    invoke-static {p2}, Lcom/jieli/watchtesttool/util/AppUtil;->convertOtaConnectStatus(I)I

    move-result p2

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$1;->this$0:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->onBtDeviceConnection(Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public onReceiveData(Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager$1;->this$0:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    invoke-virtual {v0, p1, p2}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->onReceiveDeviceData(Landroid/bluetooth/BluetoothDevice;[B)V

    return-void
.end method
