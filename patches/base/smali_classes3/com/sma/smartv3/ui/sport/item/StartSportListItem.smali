.class public final Lcom/sma/smartv3/ui/sport/item/StartSportListItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field private mContext:Landroid/content/Context;

.field private mMoreList:Landroid/view/View;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private maxSize:I

.field private spanCount:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    const/4 v0, 0x4

    iput v0, p0, Lcom/sma/smartv3/ui/sport/item/StartSportListItem;->spanCount:I

    const/16 v0, 0x8

    iput v0, p0, Lcom/sma/smartv3/ui/sport/item/StartSportListItem;->maxSize:I

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/sport/item/StartSportListItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/item/StartSportListItem;->initView$lambda$0(Lcom/sma/smartv3/ui/sport/item/StartSportListItem;Landroid/view/View;)V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/sport/item/StartSportListItem;Landroid/view/View;)V
    .locals 4

    new-instance p1, Landroid/content/Intent;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/item/StartSportListItem;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    const-string v2, "mContext"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    const-class v3, Lcom/sma/smartv3/ui/sport/SportListActivity;

    invoke-direct {p1, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/item/StartSportListItem;->mContext:Landroid/content/Context;

    if-nez p0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, p0

    :goto_0
    invoke-virtual {v1, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 4
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslViewHolder;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "<get-context>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/item/StartSportListItem;->mContext:Landroid/content/Context;

    const v0, 0x7f0a0b24

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/item/StartSportListItem;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslViewHolder;->getContext()Landroid/content/Context;

    move-result-object v2

    iget v3, p0, Lcom/sma/smartv3/ui/sport/item/StartSportListItem;->spanCount:I

    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    :cond_0
    const v0, 0x7f0a0af7

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/item/StartSportListItem;->mMoreList:Landroid/view/View;

    return-void
.end method

.method public getInitEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final getMaxSize()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/item/StartSportListItem;->maxSize:I

    return v0
.end method

.method public final getSpanCount()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/item/StartSportListItem;->spanCount:I

    return v0
.end method

.method public initView()V
    .locals 4

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/a15;->XIi00iiXO()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/item/StartSportListItem;->mMoreList:Landroid/view/View;

    if-eqz v1, :cond_0

    new-instance v2, Lcom/android/mltcode/paycertificationapi/g85;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/g85;-><init>(Lcom/sma/smartv3/ui/sport/item/StartSportListItem;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/item/StartSportListItem;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v1, :cond_2

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/item/StartSportListItem;->mContext:Landroid/content/Context;

    if-nez v2, :cond_1

    const-string v2, "mContext"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v2, 0x0

    :cond_1
    new-instance v3, Lcom/sma/smartv3/ui/sport/item/StartSportListItem$initView$2;

    invoke-direct {v3, v0, v2}, Lcom/sma/smartv3/ui/sport/item/StartSportListItem$initView$2;-><init>(Ljava/util/List;Landroid/content/Context;)V

    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    :cond_2
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d1060

    return v0
.end method

.method public final onListDataChange(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "SPORT_MODE_TOP_LIST_CHANGE"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/item/StartSportListItem;->initView()V

    return-void
.end method

.method public final setMaxSize(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/item/StartSportListItem;->maxSize:I

    return-void
.end method

.method public final setSpanCount(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/item/StartSportListItem;->spanCount:I

    return-void
.end method
