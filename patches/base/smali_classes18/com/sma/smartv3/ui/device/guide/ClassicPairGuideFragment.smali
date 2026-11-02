.class public final Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;
.super Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;
.source "SourceFile"


# instance fields
.field private bondFailedTime:I

.field private mBluetoothReceiver:Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment$mBluetoothReceiver$1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;-><init>()V

    new-instance v0, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment$mBluetoothReceiver$1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment$mBluetoothReceiver$1;-><init>(Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;->mBluetoothReceiver:Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment$mBluetoothReceiver$1;

    return-void
.end method

.method public static final synthetic access$getBondFailedTime$p(Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;->bondFailedTime:I

    return p0
.end method

.method public static final synthetic access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;)Lcom/android/mltcode/paycertificationapi/uq;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    return-object p0
.end method

.method public static final synthetic access$getTip(Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;II)Landroid/text/Spanned;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;->getTip(II)Landroid/text/Spanned;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setBondFailedTime$p(Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;->bondFailedTime:I

    return-void
.end method

.method private final getTip(II)Landroid/text/Spanned;
    .locals 8

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string p1, "getString(...)"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "\n"

    const-string v2, "<br>"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;->tipColor()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v3, "\n"

    const-string v4, "<br>"

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "<br><br><font color = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ">"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "</font>"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    const-string p2, "fromHtml(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;->initView$lambda$0(Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;Landroid/view/View;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p3, 0x0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x4

    if-ne p2, p1, :cond_0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p0

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    return p3
.end method

.method private final tipColor()Ljava/lang/String;
    .locals 1

    const-string v0, "grey"

    return-object v0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/android/mltcode/paycertificationapi/I0iIi;->OXO1:Lcom/android/mltcode/paycertificationapi/I0iIi;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;->mBluetoothReceiver:Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment$mBluetoothReceiver$1;

    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    const-string v3, "android.bluetooth.device.action.BOND_STATE_CHANGED"

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v3, "android.bluetooth.device.action.ACL_DISCONNECTED"

    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v3, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    const/4 v3, 0x2

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/I0iIi;->OXO1(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)V

    return-void
.end method

.method public initView()V
    .locals 4

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getIvPic()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f081576

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getTvTitle()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140c8d

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v2

    const-string v3, "JL"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v3, 0x7f140c8b

    if-nez v2, :cond_1

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMPlatform()Ljava/lang/String;

    move-result-object v1

    const-string v2, "JL707"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const v1, 0x7f140c8c

    invoke-direct {p0, v3, v1}, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;->getTip(II)Landroid/text/Spanned;

    move-result-object v1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getBtnSet()Landroid/widget/Button;

    move-result-object v0

    const v1, 0x7f140c59

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getBtnSet()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IiXXO10Oi;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/IiXXO10Oi;-><init>(Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->onDestroy()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;->mBluetoothReceiver:Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment$mBluetoothReceiver$1;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method public onSetClick()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getBtnSet()Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getBtnSet()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    iget v0, p0, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;->bondFailedTime:I

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.BLUETOOTH_SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez v0, :cond_1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/ClassicPairGuideFragment;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->connectClassic()V

    return-void
.end method
