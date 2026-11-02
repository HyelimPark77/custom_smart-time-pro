.class public Lcom/sma/smartv3/ui/status/item/TodayDataItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTodayDataItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodayDataItem.kt\ncom/sma/smartv3/ui/status/item/TodayDataItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTodayDataItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodayDataItem.kt\ncom/sma/smartv3/ui/status/item/TodayDataItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"
    }
.end annotation


# instance fields
.field private context:Landroid/content/Context;

.field private mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

.field private roomView:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    return-void
.end method

.method public static synthetic O00(I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/item/TodayDataItem;->initView$lambda$0(I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getContext$p(Lcom/sma/smartv3/ui/status/item/TodayDataItem;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/item/TodayDataItem;->context:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic access$getMRecyclerView$p(Lcom/sma/smartv3/ui/status/item/TodayDataItem;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/item/TodayDataItem;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private static final initView$lambda$0(I)Lkotlin/Unit;
    .locals 0

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
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

    const v0, 0x7f0a0b30

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/TodayDataItem;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f0a0bbd

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/TodayDataItem;->roomView:Landroid/view/View;

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/TodayDataItem;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-nez p1, :cond_0

    const-string p1, "mRecyclerView"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "getContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/TodayDataItem;->context:Landroid/content/Context;

    return-void
.end method

.method public initView()V
    .locals 10

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/TodayDataItem;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    const-string v1, "mRecyclerView"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    new-instance v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/TodayDataItem;->context:Landroid/content/Context;

    const-string v5, "context"

    if-nez v4, :cond_1

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v2

    :cond_1
    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-direct {v3, v4, v6, v7}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ru5;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/ru5;-><init>()V

    invoke-static {v7, v0, v6, v2}, Lcom/sma/smartv3/model/TodayHealthyDataKt;->getItemHealthyData$default(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "TodayDataItem list = "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    move v6, v7

    :goto_0
    invoke-virtual {p0, v6}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemHidden(Z)V

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/item/TodayDataItem;->roomView:Landroid/view/View;

    if-nez v3, :cond_3

    const-string v3, "roomView"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v2

    :cond_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_4
    const/16 v7, 0x8

    :goto_1
    invoke-virtual {v3, v7}, Landroid/view/View;->setVisibility(I)V

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/item/TodayDataItem;->context:Landroid/content/Context;

    if-nez v3, :cond_5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v2

    :cond_5
    new-instance v4, Lcom/sma/smartv3/ui/status/item/TodayDataItem$initView$mAdapter$1;

    invoke-direct {v4, v0, p0, v3}, Lcom/sma/smartv3/ui/status/item/TodayDataItem$initView$mAdapter$1;-><init>(Ljava/util/List;Lcom/sma/smartv3/ui/status/item/TodayDataItem;Landroid/content/Context;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/TodayDataItem;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_6

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    move-object v2, v0

    :goto_2
    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d1081

    return v0
.end method
