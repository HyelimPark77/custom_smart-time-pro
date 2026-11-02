.class public final Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$O00;
.super Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XIi00iiXO;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$O00;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-direct {p0}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XIi00iiXO;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Landroid/view/View;F)V
    .locals 2

    const-string v0, "bottomSheet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$O00;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getBehavior()Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->getPeekHeight()I

    move-result p1

    int-to-float p1, p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$O00;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getRootView()Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$O00;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getBehavior()Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->getPeekHeight()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    mul-float/2addr v0, p2

    add-float/2addr p1, v0

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$O00;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-static {p2}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->access$getCardPanelSubMinHeight$p(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)I

    move-result p2

    int-to-float p2, p2

    cmpl-float p2, p1, p2

    const-string v0, "<get-cardPanelSub>(...)"

    if-lez p2, :cond_0

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$O00;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getCardPanelSub()Landroid/widget/RelativeLayout;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    float-to-int p1, p1

    invoke-static {p2, p1}, Lcom/angcyo/dsladapter/LibExKt;->X111IO(Landroid/view/View;I)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$O00;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getCardPanelSub()Landroid/widget/RelativeLayout;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$O00;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-static {p2}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->access$getCardPanelSubMinHeight$p(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)I

    move-result p2

    invoke-static {p1, p2}, Lcom/angcyo/dsladapter/LibExKt;->X111IO(Landroid/view/View;I)V

    return-void
.end method

.method public XIi00iiXO(Landroid/view/View;I)V
    .locals 1

    const-string v0, "bottomSheet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x3

    if-eq p2, p1, :cond_1

    const/4 p1, 0x4

    if-eq p2, p1, :cond_0

    const/4 p1, 0x5

    if-eq p2, p1, :cond_1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$O00;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getCardPanel()Landroidx/cardview/widget/CardView;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroidx/cardview/widget/CardView;->setRadius(F)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$O00;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getStatuesPanel()Landroid/view/ViewGroup;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$O00;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    const/high16 p2, 0x428c0000    # 70.0f

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->setSportOneShowValue(F)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$O00;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getCardPanel()Landroidx/cardview/widget/CardView;

    move-result-object p1

    const/high16 p2, 0x41a00000    # 20.0f

    invoke-static {p2}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroidx/cardview/widget/CardView;->setRadius(F)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$O00;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getStatuesPanel()Landroid/view/ViewGroup;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$O00;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    const/high16 p2, 0x425c0000    # 55.0f

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->setSportOneShowValue(F)V

    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$O00;->OXO1:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->getSportProcess()Lcom/sma/smartv3/view/CustomNestedScollView;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/core/widget/NestedScrollView;->requestLayout()V

    return-void
.end method
