.class public final Lcom/sma/smartv3/ui/device/TouchSettingsActivity$mBluetoothReceiver$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/TouchSettingsActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/TouchSettingsActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity$mBluetoothReceiver$1;->OXO1:Lcom/sma/smartv3/ui/device/TouchSettingsActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 9

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/TouchSettingsActivity$mBluetoothReceiver$1;->OXO1:Lcom/sma/smartv3/ui/device/TouchSettingsActivity;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BluetoothReceiver onReceive intent -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const-string v2, "android.bluetooth.device.action.BOND_STATE_CHANGED"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const-string p1, "android.bluetooth.device.extra.DEVICE"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p2

    sget-object v2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v2}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleAddress()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BluetoothReceiver onReceive ACTION_BOND_STATE_CHANGED -> device = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", bondState = "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/16 p1, 0xa

    if-eq p2, p1, :cond_4

    const/16 p1, 0xc

    if-eq p2, p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_3
    invoke-static {v0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->access$getMSettings$p(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/szabh/smable3/entity/BleTouchSettings;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/szabh/smable3/entity/BleTouchSettings;->setMEnabled(I)V

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->TOUCH_SET:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->access$getMSettings$p(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/szabh/smable3/entity/BleTouchSettings;

    move-result-object v4

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->access$updateUI(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    return-void

    :cond_4
    invoke-static {v0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_5
    invoke-static {v0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->access$getMSettings$p(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/szabh/smable3/entity/BleTouchSettings;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/szabh/smable3/entity/BleTouchSettings;->setMEnabled(I)V

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->TOUCH_SET:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->access$getMSettings$p(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/szabh/smable3/entity/BleTouchSettings;

    move-result-object v4

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->access$showConnectFailPopup(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->access$updateUI(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)V

    return-void

    :cond_6
    const-string p2, "android.bluetooth.device.action.ACL_DISCONNECTED"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/TouchSettingsActivity;->access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/device/TouchSettingsActivity;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_7
    :goto_0
    return-void
.end method
