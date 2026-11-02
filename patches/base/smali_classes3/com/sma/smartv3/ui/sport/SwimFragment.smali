.class public final Lcom/sma/smartv3/ui/sport/SwimFragment;
.super Lcom/sma/smartv3/ui/sport/BaseNoGpsSportFragment;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseNoGpsSportFragment;-><init>()V

    return-void
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/16 p1, 0xb

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->setMSportMode(I)V

    return-void
.end method

.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/sma/smartv3/ui/sport/BaseNoGpsSportFragment;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->getIvBg()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method
