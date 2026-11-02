.class public abstract Lcom/sma/smartv3/ui/sport/course/BaseNoGpsSportV2Fragment;
.super Lcom/sma/smartv3/ui/sport/course/BaseSportV2Fragment;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/BaseSportV2Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/sma/smartv3/ui/sport/course/BaseSportV2Fragment;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/BaseSportV2Fragment;->getGpsLl()Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/BaseSportV2Fragment;->getIvBg()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f08157e

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method
