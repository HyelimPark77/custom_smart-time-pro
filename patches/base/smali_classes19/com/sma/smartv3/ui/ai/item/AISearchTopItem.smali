.class public Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAISearchTopItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AISearchTopItem.kt\ncom/sma/smartv3/ui/ai/item/AISearchTopItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAISearchTopItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AISearchTopItem.kt\ncom/sma/smartv3/ui/ai/item/AISearchTopItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"
    }
.end annotation


# instance fields
.field public mContext:Landroid/content/Context;

.field private mHotrv:Landroidx/recyclerview/widget/RecyclerView;

.field private mList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mRecordsCleartv:Landroid/widget/TextView;

.field private mRecordsrv:Landroidx/recyclerview/widget/RecyclerView;

.field private mRecordstv:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "mList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->mList:Ljava/util/List;

    return-void
.end method

.method public static synthetic O00(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->bindView$lambda$0(Landroid/view/View;)V

    return-void
.end method

.method private static final bindView$lambda$0(Landroid/view/View;)V
    .locals 1

    const-string p0, "search_clear_records"

    const-string v0, ""

    invoke-static {p0, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic setRecyclerView$default(Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;Landroidx/recyclerview/widget/RecyclerView;ILjava/util/List;ILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x3

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->setRecyclerView(Landroidx/recyclerview/widget/RecyclerView;ILjava/util/List;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: setRecyclerView"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
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

    const v0, 0x7f0a09f6

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->mRecordstv:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "mRecordstv"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "getContext(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->setMContext(Landroid/content/Context;)V

    const v0, 0x7f0a09f5

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->mRecordsrv:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f0a09f3

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->mHotrv:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f0a09fd

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->mRecordsCleartv:Landroid/widget/TextView;

    if-nez p1, :cond_1

    const-string p1, "mRecordsCleartv"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, p1

    :goto_0
    new-instance p1, Lcom/android/mltcode/paycertificationapi/O0i;

    invoke-direct {p1}, Lcom/android/mltcode/paycertificationapi/O0i;-><init>()V

    invoke-virtual {v1, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final getMContext()Landroid/content/Context;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->mList:Ljava/util/List;

    return-object v0
.end method

.method public initView()V
    .locals 10

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->getMContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f030043

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    const-string v1, "getStringArray(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/collections/ArraysKt___ArraysKt;->OXI0X0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XIi10()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-lez v1, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XIi10()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->setTitle(Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    const/4 v1, 0x1

    invoke-static {v0, v8, v1, v9}, Lcom/sma/smartv3/biz/AIManager;->O10IXXX0X(Lcom/sma/smartv3/biz/AIManager;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->setTitle(Ljava/lang/String;)Ljava/lang/String;

    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->mHotrv:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_1

    const-string v0, "mHotrv"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v9

    goto :goto_1

    :cond_1
    move-object v3, v0

    :goto_1
    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->setRecyclerView$default(Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;Landroidx/recyclerview/widget/RecyclerView;ILjava/util/List;ILjava/lang/Object;)V

    iget-object v0, v2, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->mRecordstv:Landroid/widget/TextView;

    if-nez v0, :cond_2

    const-string v0, "mRecordstv"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v9

    :cond_2
    iget-object v1, v2, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->mList:Ljava/util/List;

    const-string v3, "mRecordsCleartv"

    const-string v4, "mRecordsrv"

    if-eqz v1, :cond_6

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, v2, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->mRecordsrv:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v1, :cond_3

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v9

    :cond_3
    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v2, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->mRecordsrv:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v1, :cond_4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v9

    :cond_4
    const/4 v4, 0x3

    iget-object v5, v2, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->mList:Ljava/util/List;

    invoke-virtual {p0, v1, v4, v5}, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->setRecyclerView(Landroidx/recyclerview/widget/RecyclerView;ILjava/util/List;)V

    iget-object v1, v2, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->mRecordsCleartv:Landroid/widget/TextView;

    if-nez v1, :cond_5

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    move-object v9, v1

    :goto_2
    invoke-virtual {v9, v8}, Landroid/view/View;->setVisibility(I)V

    goto :goto_4

    :cond_6
    iget-object v1, v2, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->mRecordsrv:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v1, :cond_7

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v9

    :cond_7
    const/16 v8, 0x8

    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v2, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->mRecordsCleartv:Landroid/widget/TextView;

    if-nez v1, :cond_8

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_3

    :cond_8
    move-object v9, v1

    :goto_3
    invoke-virtual {v9, v8}, Landroid/view/View;->setVisibility(I)V

    :goto_4
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0183

    return v0
.end method

.method public final setMContext(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->mContext:Landroid/content/Context;

    return-void
.end method

.method public final setMList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->mList:Ljava/util/List;

    return-void
.end method

.method public final setRecyclerView(Landroidx/recyclerview/widget/RecyclerView;ILjava/util/List;)V
    .locals 2
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "mRecyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "list"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->getMContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem;->getMContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem$setRecyclerView$mAdapter$1;

    invoke-direct {v1, p3, v0}, Lcom/sma/smartv3/ui/ai/item/AISearchTopItem$setRecyclerView$mAdapter$1;-><init>(Ljava/util/List;Landroid/content/Context;)V

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result p3

    if-nez p3, :cond_0

    new-instance p3, Lcom/sma/smartv3/view/AIGridSpacingItemDecoration;

    const/high16 v0, 0x41700000    # 15.0f

    invoke-static {v0}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v0

    invoke-direct {p3, p2, v0}, Lcom/sma/smartv3/view/AIGridSpacingItemDecoration;-><init>(II)V

    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    :cond_0
    return-void
.end method

.method public final setTitle(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "titleStr"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/AIManager;->iOiXi11II(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
