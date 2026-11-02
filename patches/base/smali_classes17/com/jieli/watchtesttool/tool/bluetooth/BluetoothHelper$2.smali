.class Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/impl/RcspAuth$OnRcspAuthListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;


# direct methods
.method public constructor <init>(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$2;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAuthFailed(Landroid/bluetooth/BluetoothDevice;ILjava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$100()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-onAuthFailed- device : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/jieli/watchtesttool/util/AppUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", code = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", message = "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$2;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    const/4 p3, 0x0

    invoke-static {p2, p1, p3}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$900(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;Landroid/bluetooth/BluetoothDevice;Z)V

    iget-object p2, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$2;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {p2, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->disconnectDevice(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public onAuthSuccess(Landroid/bluetooth/BluetoothDevice;)V
    .locals 3

    invoke-static {}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$100()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-onAuthSuccess- device : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/jieli/watchtesttool/util/AppUtil;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$2;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$900(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;Landroid/bluetooth/BluetoothDevice;Z)V

    iget-object v0, p0, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper$2;->this$0:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-static {v0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->access$200(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public onInitResult(Z)V
    .locals 0

    return-void
.end method
