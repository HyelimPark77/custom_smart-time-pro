.class public final Lcom/sma/smartv3/ui/status/item/SpaceItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field private height:I

.field private view:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    const/16 v0, 0x14

    iput v0, p0, Lcom/sma/smartv3/ui/status/item/SpaceItem;->height:I

    return-void
.end method

.method private final dp2px(I)F
    .locals 0

    int-to-float p1, p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result p1

    int-to-float p1, p1

    return p1
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 1
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a18f9

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/SpaceItem;->view:Landroid/view/View;

    return-void
.end method

.method public final getHeight()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/status/item/SpaceItem;->height:I

    return v0
.end method

.method public initView()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/SpaceItem;->view:Landroid/view/View;

    const/4 v1, 0x0

    const-string v2, "view"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v3, p0, Lcom/sma/smartv3/ui/status/item/SpaceItem;->height:I

    invoke-direct {p0, v3}, Lcom/sma/smartv3/ui/status/item/SpaceItem;->dp2px(I)F

    move-result v3

    float-to-int v3, v3

    iput v3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/item/SpaceItem;->view:Landroid/view/View;

    if-nez v3, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0187

    return v0
.end method

.method public final setHeight(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/status/item/SpaceItem;->height:I

    return-void
.end method
