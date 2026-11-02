.class Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$BluetoothHandFreeReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "BluetoothHandFreeReceiver"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;


# direct methods
.method private constructor <init>(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010
        }
        names = {
            "this$0"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$BluetoothHandFreeReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$BluetoothHandFreeReceiver;-><init>(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "context",
            "intent"
        }
    .end annotation

    const/4 p1, 0x1

    const/4 v0, 0x0

    const/4 v1, -0x1

    if-nez p2, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "android.bluetooth.device.extra.DEVICE"

    invoke-virtual {p2, v3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    if-nez v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, ", state : "

    const-string v5, "device : "

    const-string v6, "android.bluetooth.profile.extra.STATE"

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    :goto_0
    move v2, v1

    goto :goto_1

    :sswitch_0
    const-string v7, "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x3

    goto :goto_1

    :sswitch_1
    const-string v7, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x2

    goto :goto_1

    :sswitch_2
    const-string v7, "android.bluetooth.device.action.UUID"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_0

    :cond_5
    move v2, p1

    goto :goto_1

    :sswitch_3
    const-string v7, "android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED"

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_0

    :cond_6
    move v2, v0

    :goto_1
    packed-switch v2, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    :try_start_0
    invoke-virtual {p2, v6, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$100()Ljava/lang/String;

    move-result-object p2

    const-string v0, "A2DP#ACTION_CONNECTION_STATE_CHANGED"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$BluetoothHandFreeReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-static {v5, v3}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$800(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v0, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-ne p1, v1, :cond_7

    goto/16 :goto_3

    :cond_7
    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$BluetoothHandFreeReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-static {p2, v3, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$1300(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothDevice;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto/16 :goto_3

    :pswitch_1
    :try_start_1
    invoke-virtual {p2, v6, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$100()Ljava/lang/String;

    move-result-object p2

    const-string v0, "HFP#ACTION_CONNECTION_STATE_CHANGED"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$BluetoothHandFreeReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-static {v5, v3}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$800(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v0, v2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-ne p1, v1, :cond_8

    goto :goto_3

    :cond_8
    iget-object p2, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$BluetoothHandFreeReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-static {p2, v3, p1}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$1200(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothDevice;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_3

    :pswitch_2
    const-string v1, "android.bluetooth.device.extra.UUID"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getParcelableArrayExtra(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object p2

    const-string v1, "ACTION_UUID"

    if-nez p2, :cond_9

    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$BluetoothHandFreeReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    const/4 p2, 0x0

    invoke-static {p1, v3, p2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$1400(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothDevice;[Landroid/os/ParcelUuid;)V

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$100()Ljava/lang/String;

    move-result-object p1

    const-string p2, "no uuids"

    invoke-static {p1, v1, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_9
    array-length v2, p2

    new-array v2, v2, [Landroid/os/ParcelUuid;

    :goto_2
    array-length v4, p2

    if-ge v0, v4, :cond_a

    aget-object v4, p2, v0

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    move-result-object v4

    aput-object v4, v2, v0

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$100()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Landroid/os/ParcelUuid;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v1, v4}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    add-int/2addr v0, p1

    goto :goto_2

    :cond_a
    iget-object p1, p0, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr$BluetoothHandFreeReceiver;->this$0:Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;

    invoke-static {p1, v3, v2}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$1400(Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;Landroid/bluetooth/BluetoothDevice;[Landroid/os/ParcelUuid;)V

    return-void

    :pswitch_3
    const/16 p1, 0xb

    invoke-virtual {p2, v6, p1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-static {}, Lcom/jieli/bluetooth_connect/impl/BluetoothBrEdr;->access$100()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "state : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "A2DP#ACTION_PLAYING_STATE_CHANGED"

    invoke-static {p2, v0, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_b
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x32fde36c -> :sswitch_3
        -0x16809cc6 -> :sswitch_2
        0x2083ec2d -> :sswitch_1
        0x4a286686 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
