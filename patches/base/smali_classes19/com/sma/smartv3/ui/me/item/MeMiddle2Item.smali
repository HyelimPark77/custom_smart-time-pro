.class public Lcom/sma/smartv3/ui/me/item/MeMiddle2Item;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field private btUserInfo:Landroid/view/View;

.field private final initEvent:Z

.field private mOnClick:Landroid/view/View$OnClickListener;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MeMiddle2Item;->initEvent:Z

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 3
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a018c

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/item/MeMiddle2Item;->btUserInfo:Landroid/view/View;

    const v1, 0x7f0a0180

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/item/MeMiddle2Item;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/item/MeMiddle2Item;->mOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    return-void
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/item/MeMiddle2Item;->initEvent:Z

    return v0
.end method

.method public final getMOnClick()Landroid/view/View$OnClickListener;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/item/MeMiddle2Item;->mOnClick:Landroid/view/View$OnClickListener;

    return-object v0
.end method

.method public initView()V
    .locals 0

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d1095

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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/item/MeMiddle2Item;->initView()V

    return-void
.end method

.method public final setMOnClick(Landroid/view/View$OnClickListener;)V
    .locals 0
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/item/MeMiddle2Item;->mOnClick:Landroid/view/View$OnClickListener;

    return-void
.end method
