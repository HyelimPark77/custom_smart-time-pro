.class public final Lcom/sma/smartv3/ui/device/guide/BgRunGuideFragment;
.super Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;-><init>()V

    return-void
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/device/guide/BgRunGuideFragment;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/guide/BgRunGuideFragment;->onSetClick$lambda$0(Lcom/sma/smartv3/ui/device/guide/BgRunGuideFragment;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final onSetClick$lambda$0(Lcom/sma/smartv3/ui/device/guide/BgRunGuideFragment;Z)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BgRunGuideFragment;->initView()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 3

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getIvPic()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f081574

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getTvTitle()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f1401bf

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140c86

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getBtnSet()Landroid/widget/Button;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/hr1;->XXiIiX10(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x8

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public onSetClick()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/OIIOIX0O;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/OIIOIX0O;-><init>(Lcom/sma/smartv3/ui/device/guide/BgRunGuideFragment;)V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/hr1;->iOO1ii1(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
