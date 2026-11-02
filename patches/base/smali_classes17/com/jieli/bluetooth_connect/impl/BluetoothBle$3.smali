.class Lcom/jieli/bluetooth_connect/impl/BluetoothBle$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/bluetooth_connect/impl/BluetoothBle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;


# direct methods
.method public constructor <init>(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$3;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdapterStatus(ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "bEnabled",
            "bHasBle"
        }
    .end annotation

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$3;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1000(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)V

    :cond_0
    return-void
.end method

.method public onBtDeviceBond(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 7
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "status"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$3;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1100(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$600()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "device : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", status : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "onBondStatus"

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0xc

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$3;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {p2, p1, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1200(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;Landroid/bluetooth/BluetoothDevice;I)V

    return-void

    :cond_0
    const/16 v0, 0xa

    if-ne p2, v0, :cond_2

    invoke-static {}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->getCurrentTime()J

    move-result-wide v3

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$3;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1300(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)J

    move-result-wide v5

    sub-long/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    move-result-wide v3

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$3;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1408(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)I

    const-wide/16 v5, 0x1388

    cmp-long p2, v3, v5

    if-gez p2, :cond_1

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$3;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1400(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)I

    move-result p2

    const/4 v1, 0x2

    if-gt p2, v1, :cond_1

    const-wide/16 v3, 0x12c

    invoke-static {v3, v4}, Landroid/os/SystemClock;->sleep(J)V

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$3;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {p2, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1500(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$600()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "restart bond ble device : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", failedCount \uff1a "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$3;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1400(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v2, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$3;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {p2, p1, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1200(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;Landroid/bluetooth/BluetoothDevice;I)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$3;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {v0, p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1200(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;Landroid/bluetooth/BluetoothDevice;I)V

    :cond_3
    return-void
.end method

.method public onPairError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "device",
            "error"
        }
    .end annotation

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$3;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1100(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$3;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    const/16 v0, 0xa

    invoke-static {p2, p1, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$1200(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;Landroid/bluetooth/BluetoothDevice;I)V

    :cond_0
    return-void
.end method
