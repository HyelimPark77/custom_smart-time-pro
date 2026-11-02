.class public final Lcom/sma/smartv3/ui/sport/Sport2Fragment;
.super Lcom/sma/smartv3/ui/sport/SportFragment;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportFragment;-><init>()V

    return-void
.end method


# virtual methods
.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/sma/smartv3/ui/sport/SportFragment;->initView()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a072a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/BarUtils;->addMarginTopEqualStatusBarHeight(Landroid/view/View;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d1090

    return v0
.end method
