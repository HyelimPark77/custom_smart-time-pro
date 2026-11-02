.class public final Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment$mBluetoothReceiver$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment$mBluetoothReceiver$1;->OXO1:Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment$mBluetoothReceiver$1;->OXO1:Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "BluetoothReceiver onReceive intent -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const-string v1, "android.bluetooth.device.action.BOND_STATE_CHANGED"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const-string p1, "android.bluetooth.device.extra.DEVICE"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p2

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMClassicAddress()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result p2

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;->access$getBondFailedTime$p(Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;)I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BluetoothReceiver onReceive ACTION_BOND_STATE_CHANGED -> device = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", bondState = "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", bondFailedTime = "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const/16 p1, 0xa

    if-eq p2, p1, :cond_4

    const/16 p1, 0xc

    if-eq p2, p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v0}, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;->access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_3
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getBtnSet()Landroid/widget/Button;

    move-result-object p1

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_4
    invoke-static {v0}, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;->access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_5
    invoke-static {v0}, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;->access$getBondFailedTime$p(Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;->access$setBondFailedTime$p(Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;I)V

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;->access$getBondFailedTime$p(Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;)I

    move-result p1

    const/4 p2, 0x3

    if-lt p1, p2, :cond_7

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getBtnSet()Landroid/widget/Button;

    move-result-object p1

    const p2, 0x7f14122c

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getTvTip()Landroid/widget/TextView;

    move-result-object p1

    const p2, 0x7f140c8b

    const v1, 0x7f140c5a

    invoke-static {v0, p2, v1}, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;->access$getTip(Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;II)Landroid/text/Spanned;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_6
    const-string p2, "android.bluetooth.device.action.ACL_DISCONNECTED"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;->access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_7
    :goto_0
    return-void
.end method
