.class Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$BluetoothHandFreeReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "BluetoothHandFreeReceiver"
.end annotation


# instance fields
.field final synthetic a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;


# direct methods
.method private constructor <init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$BluetoothHandFreeReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$BluetoothHandFreeReceiver;-><init>(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 9

    const/4 p1, 0x2

    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-nez p2, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "android.bluetooth.device.extra.DEVICE"

    invoke-virtual {p2, v4}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Landroid/bluetooth/BluetoothDevice;

    if-nez v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v5, ", state : "

    const-string v6, "device : "

    const-string v7, "android.bluetooth.profile.extra.STATE"

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_0

    :goto_0
    move v3, v1

    goto :goto_1

    :sswitch_0
    const-string v8, "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    move v3, p1

    goto :goto_1

    :sswitch_1
    const-string v8, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_0

    :cond_4
    move v3, v2

    goto :goto_1

    :sswitch_2
    const-string v8, "android.bluetooth.device.action.UUID"

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_0

    :cond_5
    move v3, v0

    :goto_1
    packed-switch v3, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    invoke-virtual {p2, v7, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    if-ne v1, p2, :cond_6

    goto/16 :goto_3

    :cond_6
    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$BluetoothHandFreeReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;

    iget-object v0, v0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$BluetoothHandFreeReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;

    invoke-virtual {v2, v4}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->printBtConnectionState(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "A2DP#ACTION_CONNECTION_STATE_CHANGED"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$BluetoothHandFreeReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;

    invoke-static {v0, v4, p1, p2}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;Landroid/bluetooth/BluetoothDevice;II)V

    return-void

    :pswitch_1
    invoke-virtual {p2, v7, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    if-ne v1, p1, :cond_7

    goto :goto_3

    :cond_7
    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$BluetoothHandFreeReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;

    iget-object p2, p2, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$BluetoothHandFreeReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;

    invoke-virtual {v1, v4}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->printBtDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/jieli/jl_bt_ota/util/BluetoothUtil;->printBtConnectionState(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HFP#ACTION_CONNECTION_STATE_CHANGED"

    invoke-static {p2, v1, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$BluetoothHandFreeReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;

    invoke-static {p2, v4, v2, p1}, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;->a(Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;Landroid/bluetooth/BluetoothDevice;II)V

    return-void

    :pswitch_2
    const-string p1, "android.bluetooth.device.extra.UUID"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getParcelableArrayExtra(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object p1

    const-string p2, "ACTION_UUID"

    if-nez p1, :cond_8

    iget-object p1, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$BluetoothHandFreeReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;

    iget-object p1, p1, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    const-string v0, "No uuids."

    invoke-static {p1, p2, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_8
    array-length v1, p1

    new-array v1, v1, [Landroid/os/ParcelUuid;

    :goto_2
    array-length v3, p1

    if-ge v0, v3, :cond_9

    aget-object v3, p1, v0

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/os/ParcelUuid;->fromString(Ljava/lang/String;)Landroid/os/ParcelUuid;

    move-result-object v3

    aput-object v3, v1, v0

    iget-object v3, p0, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles$BluetoothHandFreeReceiver;->a:Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBreProfiles;

    iget-object v3, v3, Lcom/jieli/jl_bt_ota/impl/bt/BluetoothBase;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "uuid : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v1, v0

    invoke-virtual {v5}, Landroid/os/ParcelUuid;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, p2, v4}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    add-int/2addr v0, v2

    goto :goto_2

    :cond_9
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x16809cc6 -> :sswitch_2
        0x2083ec2d -> :sswitch_1
        0x4a286686 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
