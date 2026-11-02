.class public Lcom/sma/smartv3/ui/me/item/MainMiddleItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field private btContactUs:Landroid/widget/LinearLayout;

.field private btFAQ:Landroid/widget/LinearLayout;

.field private btHelp:Landroid/widget/LinearLayout;

.field private btTalk:Landroid/widget/LinearLayout;

.field private final initEvent:Z

.field private ivContactUs:Landroid/widget/ImageView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mOnClick:Landroid/view/View$OnClickListener;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MainMiddleItem;->initEvent:Z

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 6
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0182

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/item/MainMiddleItem;->btHelp:Landroid/widget/LinearLayout;

    const v1, 0x7f0a018a

    invoke-virtual {p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v2, Landroid/widget/LinearLayout;

    iput-object v2, p0, Lcom/sma/smartv3/ui/me/item/MainMiddleItem;->btTalk:Landroid/widget/LinearLayout;

    const v2, 0x7f0a0179

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v3, Landroid/widget/LinearLayout;

    iput-object v3, p0, Lcom/sma/smartv3/ui/me/item/MainMiddleItem;->btContactUs:Landroid/widget/LinearLayout;

    const v3, 0x7f0a017b

    invoke-virtual {p1, v3}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v4, Landroid/widget/LinearLayout;

    iput-object v4, p0, Lcom/sma/smartv3/ui/me/item/MainMiddleItem;->btFAQ:Landroid/widget/LinearLayout;

    const v4, 0x7f0a0624

    invoke-virtual {p1, v4}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, p0, Lcom/sma/smartv3/ui/me/item/MainMiddleItem;->ivContactUs:Landroid/widget/ImageView;

    const v4, 0x7f0a0180

    iget-object v5, p0, Lcom/sma/smartv3/ui/me/item/MainMiddleItem;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v4, v5}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v4, p0, Lcom/sma/smartv3/ui/me/item/MainMiddleItem;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0, v4}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainMiddleItem;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainMiddleItem;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v3, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainMiddleItem;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v2, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    return-void
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MainMiddleItem;->initEvent:Z

    return v0
.end method

.method public final getMOnClick()Landroid/view/View$OnClickListener;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainMiddleItem;->mOnClick:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method public initView()V
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainMiddleItem;->btHelp:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "btHelp"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    sget-object v2, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/i72;->IX0IXOi()Z

    move-result v3

    const/16 v4, 0x8

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    move v3, v5

    goto :goto_0

    :cond_1
    move v3, v4

    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainMiddleItem;->btTalk:Landroid/widget/LinearLayout;

    if-nez v0, :cond_2

    const-string v0, "btTalk"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_2
    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/i72;->iIX0i()Z

    move-result v3

    if-eqz v3, :cond_3

    move v3, v5

    goto :goto_1

    :cond_3
    move v3, v4

    :goto_1
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainMiddleItem;->btContactUs:Landroid/widget/LinearLayout;

    if-nez v0, :cond_4

    const-string v0, "btContactUs"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_4
    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/i72;->Oi()Z

    move-result v3

    if-eqz v3, :cond_5

    move v3, v5

    goto :goto_2

    :cond_5
    move v3, v4

    :goto_2
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    sget-object v3, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/q62;->i000X()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainMiddleItem;->ivContactUs:Landroid/widget/ImageView;

    if-eqz v0, :cond_6

    const v3, 0x7f081261

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_6
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MainMiddleItem;->btFAQ:Landroid/widget/LinearLayout;

    if-nez v0, :cond_7

    const-string v0, "btFAQ"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_3

    :cond_7
    move-object v1, v0

    :goto_3
    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/i72;->iOI()Z

    move-result v0

    if-eqz v0, :cond_8

    move v4, v5

    :cond_8
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0fc4

    return v0
.end method

.method public final onBindStateChange(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "bind_stage_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MainMiddleItem;->initView()V

    return-void
.end method

.method public final setMOnClick(Landroid/view/View$OnClickListener;)V
    .locals 0
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MainMiddleItem;->mOnClick:Landroid/view/View$OnClickListener;

    return-void
.end method
