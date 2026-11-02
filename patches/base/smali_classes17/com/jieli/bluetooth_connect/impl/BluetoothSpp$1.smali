.class Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;


# direct methods
.method public constructor <init>(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 3
    .param p1    # Landroid/os/Message;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "msg"
        }
    .end annotation

    iget p1, p1, Landroid/os/Message;->what:I

    const-string v0, "device : "

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$000(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$100()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$200(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "MSG_WAIT_SYSTEM_CONNECT_EDR_TIMEOUT"

    invoke-static {v1, v2, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$500(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)Landroid/os/Handler;

    move-result-object p1

    const v0, 0xa036

    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    :pswitch_1
    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$000(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$100()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$200(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "MSG_CONNECT_SPP"

    invoke-static {v1, v2, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$400(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Landroid/bluetooth/BluetoothDevice;)V

    goto :goto_0

    :pswitch_2
    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$000(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$100()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-static {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$200(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "MSG_CONNECT_SPP_TIMEOUT"

    invoke-static {v1, v2, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    invoke-virtual {v0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->isConnectedSppDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp$1;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;->access$300(Lcom/jieli/bluetooth_connect/impl/BluetoothSpp;Landroid/bluetooth/BluetoothDevice;I)V

    :cond_0
    :goto_0
    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0xa035
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
