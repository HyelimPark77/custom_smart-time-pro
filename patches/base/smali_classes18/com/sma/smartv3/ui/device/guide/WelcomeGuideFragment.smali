.class public final Lcom/sma/smartv3/ui/device/guide/WelcomeGuideFragment;
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
    .locals 4

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getIvPic()Landroid/widget/ImageView;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v1, v2, v3, v2}, Lcom/android/mltcode/paycertificationapi/q62;->OiO0IOX(Lcom/android/mltcode/paycertificationapi/q62;Lcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->OiO()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const v1, 0x7f08157c

    goto :goto_1

    :cond_1
    :goto_0
    const v1, 0x7f08157d

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getTvTitle()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f14147a

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140c96

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/guide/BaseGuideFragment;->getBtnSet()Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
