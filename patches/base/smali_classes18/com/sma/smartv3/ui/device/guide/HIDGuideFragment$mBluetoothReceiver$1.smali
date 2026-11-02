.class public final Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment$mBluetoothReceiver$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment$mBluetoothReceiver$1;->OXO1:Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment$mBluetoothReceiver$1;->OXO1:Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;

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

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->access$getBondFailedTime$p(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;)I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "BluetoothReceiver onReceive ACTION_BOND_STATE_CHANGED -> device = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", bondState = "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", bondFailedTime = "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/16 p1, 0xa

    const/4 v1, 0x1

    if-eq p2, p1, :cond_4

    const/16 p1, 0xc

    if-eq p2, p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v0}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_3
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getBtnSet()Landroid/widget/Button;

    move-result-object p1

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->access$doPairDone(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;Z)V

    return-void

    :cond_4
    invoke-static {v0}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_5
    invoke-static {v0}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->access$getBondFailedTime$p(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;)I

    move-result p1

    add-int/2addr p1, v1

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->access$setBondFailedTime$p(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;I)V

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->access$getBondFailedTime$p(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;)I

    move-result p1

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->access$getBOUND_MAX_TIME$p(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;)I

    move-result p2

    if-lt p1, p2, :cond_7

    const/4 p1, 0x0

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->access$doPairDone(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;Z)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getBtnSet()Landroid/widget/Button;

    move-result-object p2

    const v1, 0x7f14115d

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->access$getTvHighTip(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;)Landroid/widget/TextView;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_6
    const-string p2, "android.bluetooth.device.action.ACL_DISCONNECTED"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_7
    :goto_0
    return-void
.end method
