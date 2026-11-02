.class public final Lcom/sma/smartv3/util/ClassicBluetoothUtil$myReceiver$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/util/ClassicBluetoothUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.BLUETOOTH_CONNECT"
    .end annotation

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x6a269925

    if-eq v1, v2, :cond_9

    const v2, 0x459717c3

    if-eq v1, v2, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v1, "android.bluetooth.device.action.FOUND"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    const-string v0, "android.bluetooth.device.extra.DEVICE"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    move-object v1, p2

    check-cast v1, Landroid/bluetooth/BluetoothDevice;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object p2

    move-object v4, p2

    goto :goto_1

    :cond_2
    move-object v4, p1

    :goto_1
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    :cond_3
    move-object v6, p1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result p1

    :goto_2
    move v5, p1

    goto :goto_3

    :cond_4
    const/4 p1, 0x0

    goto :goto_2

    :goto_3
    if-eqz v4, :cond_8

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_5

    goto :goto_4

    :cond_5
    if-eqz v6, :cond_8

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_6

    goto :goto_4

    :cond_6
    const/4 p1, 0x2

    if-ne v5, p1, :cond_7

    goto :goto_5

    :cond_7
    new-instance v0, Lcom/bestmafen/baseble/scanner/BleDevice;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/bestmafen/baseble/scanner/BleDevice;-><init>(Landroid/bluetooth/BluetoothDevice;I[BLjava/lang/String;ILjava/lang/String;)V

    invoke-static {}, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->XIi00iiXO()Lcom/android/mltcode/paycertificationapi/ry0;

    move-result-object p1

    invoke-interface {p1, v0}, Lcom/android/mltcode/paycertificationapi/ry0;->iO(Ljava/lang/Object;)Z

    :cond_8
    :goto_4
    return-void

    :cond_9
    const-string p1, "android.bluetooth.adapter.action.DISCOVERY_FINISHED"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_5

    :cond_a
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/util/ClassicBluetoothUtil;->OXO1()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " Discovery Finished"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_b
    :goto_5
    return-void
.end method
