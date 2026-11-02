.class public final Lcom/sma/smartv3/ui/device/guide/WarmTipGuideFragment;
.super Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;-><init>()V

    return-void
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
    .locals 2

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getIvPic()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f08157b

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getTvTitle()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140c95

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->iXiiiO()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getBtnSet()Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
