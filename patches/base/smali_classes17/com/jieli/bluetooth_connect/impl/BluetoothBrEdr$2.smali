.class Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/bluetooth_connect/interfaces/listener/OnBtDevicePairListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;


# direct methods
.method public constructor <init>(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$2;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdapterStatus(ZZ)V
    .locals 2
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

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$2;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-virtual {p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->getConnectingBrEdrDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$2;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    const-wide/16 v0, 0x0

    invoke-static {p2, p1, v0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$700(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothDevice;J)V

    :cond_0
    return-void
.end method

.method public onBtDeviceBond(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

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

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$2;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->getConnectingBrEdrDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$100()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$2;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-static {v1, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$800(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "device : [%s], status : %d"

    invoke-static {v2, v1}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onBtDeviceBond"

    invoke-static {v0, v2, v1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0xa

    if-ne p2, v0, :cond_1

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$2;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$900(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothDevice;I)V

    return-void

    :cond_1
    const/16 v0, 0xc

    if-ne p2, v0, :cond_3

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$2;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$1000(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;)Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->isHasConnectPermission(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$2;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-static {p2, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$1100(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothDevice;)Z

    :cond_2
    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$2;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    const-wide/16 v0, 0x7530

    invoke-static {p2, p1, v0, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$700(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothDevice;J)V

    :cond_3
    :goto_0
    return-void
.end method

.method public onPairError(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/bluetooth_connect/bean/ErrorInfo;)V
    .locals 2
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

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$2;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->getConnectingBrEdrDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/jieli/bluetooth_connect/util/BluetoothUtil;->deviceEquals(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$100()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$2;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-static {v1, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$800(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1, p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string v1, "device : [%s], error : %s"

    invoke-static {v1, p2}, Lcom/jieli/bluetooth_connect/util/ConnectUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "onPairError"

    invoke-static {v0, v1, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$2;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$900(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method
