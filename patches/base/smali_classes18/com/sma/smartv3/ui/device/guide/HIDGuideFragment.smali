.class public final Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;
.super Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;
.source "SourceFile"


# instance fields
.field private final BOUND_MAX_TIME:I

.field private bondFailedTime:I

.field private canSwipe:Z

.field private mBluetoothReceiver:Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment$mBluetoothReceiver$1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final tvHighTip$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->BOUND_MAX_TIME:I

    new-instance v0, Lcom/android/mltcode/paycertificationapi/III1OI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/III1OI;-><init>(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->tvHighTip$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment$mBluetoothReceiver$1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment$mBluetoothReceiver$1;-><init>(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->mBluetoothReceiver:Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment$mBluetoothReceiver$1;

    return-void
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->initView$lambda$0(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;Landroid/view/View;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$doPairDone(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->doPairDone(Z)V

    return-void
.end method

.method public static final synthetic access$getBOUND_MAX_TIME$p(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->BOUND_MAX_TIME:I

    return p0
.end method

.method public static final synthetic access$getBondFailedTime$p(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->bondFailedTime:I

    return p0
.end method

.method public static final synthetic access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;)Lcom/android/mltcode/paycertificationapi/uq;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    return-object p0
.end method

.method public static final synthetic access$getTvHighTip(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->getTvHighTip()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setBondFailedTime$p(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->bondFailedTime:I

    return-void
.end method

.method private final doPairDone(Z)V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->canSwipe:Z

    if-eqz p1, :cond_0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v2, "bind_stage_change"

    invoke-static {v2, v1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->getAppGuideActivity()Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->setSwipe(Z)V

    if-eqz p1, :cond_1

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->getNext()Landroid/widget/TextView;

    move-result-object p1

    const v0, 0x7f140fe5

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    return-void

    :cond_1
    invoke-virtual {v1}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->getNext()Landroid/widget/TextView;

    move-result-object p1

    const v0, 0x7f140d06

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    :cond_2
    return-void
.end method

.method private final getAppGuideActivity()Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;
    .locals 2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v0

    instance-of v0, v0, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.sma.smartv3.ui.device.guide.AppGuideActivity"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->tipColor()Ljava/lang/String;

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

.method private final getTvHighTip()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->tvHighTip$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->tvHighTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p3, 0x0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x4

    if-ne p2, p1, :cond_0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

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

.method private static final tvHighTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c93

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final getCanSwipe()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->canSwipe:Z

    return v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/android/mltcode/paycertificationapi/I0iIi;->OXO1:Lcom/android/mltcode/paycertificationapi/I0iIi;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->mBluetoothReceiver:Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment$mBluetoothReceiver$1;

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
    .locals 3

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getIvPic()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f081577

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getTvTitle()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140c8f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140c8e

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget v0, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->bondFailedTime:I

    iget v1, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->BOUND_MAX_TIME:I

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->getTvHighTip()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getBtnSet()Landroid/widget/Button;

    move-result-object v0

    const v1, 0x7f14115d

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->getTvHighTip()Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getBtnSet()Landroid/widget/Button;

    move-result-object v0

    const v1, 0x7f141096

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getBtnSet()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X1X1II;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/X1X1II;-><init>(Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->isBoundHID()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getBtnSet()Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->doPairDone(Z)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getBtnSet()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->onDestroy()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->mBluetoothReceiver:Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment$mBluetoothReceiver$1;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method public onSetClick()V
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getBtnSet()Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getBtnSet()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    iget v0, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->bondFailedTime:I

    iget v1, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->BOUND_MAX_TIME:I

    if-lt v0, v1, :cond_1

    const-string v0, "REBIND"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->getAppGuideActivity()Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->setNeedConnectHID(Z)V

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez v0, :cond_2

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_3
    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->connectHID()V

    return-void
.end method

.method public onSlideDeselected()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->getAppGuideActivity()Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->getNext()Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    const v1, 0x7f140fe5

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    return-void
.end method

.method public onSlideSelected()V
    .locals 3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->getAppGuideActivity()Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;

    move-result-object v0

    if-eqz v0, :cond_1

    iget v1, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->bondFailedTime:I

    iget v2, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->BOUND_MAX_TIME:I

    if-lt v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->getNext()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140d06

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/guide/AppGuideActivity;->getNext()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140fe5

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    :cond_1
    return-void
.end method

.method public final setCanSwipe(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/guide/HIDGuideFragment;->canSwipe:Z

    return-void
.end method
