.class Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ChangeBleMtuTimeoutTask"
.end annotation


# instance fields
.field private final mDevice:Landroid/bluetooth/BluetoothDevice;

.field final synthetic this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;


# direct methods
.method public constructor <init>(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010,
            0x0
        }
        names = {
            null,
            null
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;->mDevice:Landroid/bluetooth/BluetoothDevice;

    return-void
.end method


# virtual methods
.method public getDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;->mDevice:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-static {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$700(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;)Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;->mDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-interface {v0, v1}, Lcom/jieli/bluetooth_connect/interfaces/IBluetoothOperation;->isConnectedDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    iget-object v1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;->mDevice:Landroid/bluetooth/BluetoothDevice;

    invoke-static {v0, v1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$600(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    iget-object v1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$ChangeBleMtuTimeoutTask;->mDevice:Landroid/bluetooth/BluetoothDevice;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$300(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method
