.class Lcom/jieli/bluetooth_connect/impl/BluetoothBle$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/bluetooth_connect/interfaces/listener/OnThreadStateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->startSendDataThread()V
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

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$2;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEnd(JLjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "id",
            "name"
        }
    .end annotation

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBle$2;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBle;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBle;->access$802(Lcom/jieli/bluetooth_connect/impl/BluetoothBle;Lcom/jieli/bluetooth_connect/tool/SendBleDataThread;)Lcom/jieli/bluetooth_connect/tool/SendBleDataThread;

    return-void
.end method

.method public onStart(JLjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "id",
            "name"
        }
    .end annotation

    return-void
.end method
