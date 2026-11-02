.class public Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFitnessRecommendItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessRecommendItem.kt\ncom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n1#2:143\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFitnessRecommendItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessRecommendItem.kt\ncom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n1#2:143\n*E\n"
    }
.end annotation


# instance fields
.field public mContext:Landroid/content/Context;

.field private final mFirstColors:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mRecyclerViewFirst:Landroidx/recyclerview/widget/RecyclerView;

.field private mRecyclerViewSecond:Landroidx/recyclerview/widget/RecyclerView;

.field private final mSecondColors:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private tvTitle:Lcom/sma/smartv3/view/text/PFMedium;

.field private tvTitle2:Lcom/sma/smartv3/view/text/PFMedium;

.field private final viewModel:Lcom/sma/smartv3/ui/sport/course/model/CourseViewModel;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    new-instance v0, Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;

    invoke-direct {v0}, Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;-><init>()V

    const-class v1, Lcom/sma/smartv3/ui/sport/course/model/CourseViewModel;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;->create(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/sport/course/model/CourseViewModel;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->viewModel:Lcom/sma/smartv3/ui/sport/course/model/CourseViewModel;

    const-string v0, "#444444"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "#E9BC6A"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "#8C6EB2"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v1, v2, v4}, [Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->mFirstColors:Ljava/util/List;

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "#FF882B"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v1, v2, v0}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->mSecondColors:Ljava/util/List;

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;Lcom/angcyo/dsladapter/DslViewHolder;Ljava/util/ArrayList;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->bindView$lambda$0(Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;Lcom/angcyo/dsladapter/DslViewHolder;Ljava/util/ArrayList;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final bindView$lambda$0(Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;Lcom/angcyo/dsladapter/DslViewHolder;Ljava/util/ArrayList;)Lkotlin/Unit;
    .locals 7

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const-string v1, "tvTitle"

    const-string v2, "get(...)"

    const/16 v3, 0x8

    const/4 v4, 0x0

    if-lez v0, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->mRecyclerViewFirst:Landroidx/recyclerview/widget/RecyclerView;

    if-nez p1, :cond_0

    const-string p1, "mRecyclerViewFirst"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v4

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lcom/sma/smartv3/model/RecommendSearch;

    iget-object v6, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->tvTitle:Lcom/sma/smartv3/view/text/PFMedium;

    if-nez v6, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v6, v4

    :cond_1
    invoke-virtual {p0, p1, v0, v5, v6}, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->addRecyclerAdapter(Landroidx/recyclerview/widget/RecyclerView;ILcom/sma/smartv3/model/RecommendSearch;Lcom/sma/smartv3/view/text/PFMedium;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->tvTitle:Lcom/sma/smartv3/view/text/PFMedium;

    if-nez v0, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v4

    :cond_3
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p1

    const-string v0, "tvTitle2"

    const/4 v1, 0x1

    if-le p1, v1, :cond_6

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->mRecyclerViewSecond:Landroidx/recyclerview/widget/RecyclerView;

    if-nez p1, :cond_4

    const-string p1, "mRecyclerViewSecond"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v4

    :cond_4
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/sma/smartv3/model/RecommendSearch;

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->tvTitle2:Lcom/sma/smartv3/view/text/PFMedium;

    if-nez v2, :cond_5

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    move-object v4, v2

    :goto_1
    invoke-virtual {p0, p1, v1, p2, v4}, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->addRecyclerAdapter(Landroidx/recyclerview/widget/RecyclerView;ILcom/sma/smartv3/model/RecommendSearch;Lcom/sma/smartv3/view/text/PFMedium;)V

    goto :goto_3

    :cond_6
    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->tvTitle2:Lcom/sma/smartv3/view/text/PFMedium;

    if-nez p0, :cond_7

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    move-object v4, p0

    :goto_2
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_8
    :goto_3
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final addRecyclerAdapter(Landroidx/recyclerview/widget/RecyclerView;ILcom/sma/smartv3/model/RecommendSearch;Lcom/sma/smartv3/view/text/PFMedium;)V
    .locals 2
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/model/RecommendSearch;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mRecyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recommendSearch"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tvTitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Lcom/sma/smartv3/model/RecommendSearch;->getRecommendTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance p4, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->getMContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p4, v0, v1, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {p1, p4}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->getMContext()Landroid/content/Context;

    move-result-object p4

    invoke-virtual {p3}, Lcom/sma/smartv3/model/RecommendSearch;->getCourseRecommendList()Ljava/util/ArrayList;

    move-result-object p3

    new-instance v0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem$addRecyclerAdapter$mAdapter$1;

    invoke-direct {v0, p0, p2, p4, p3}, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem$addRecyclerAdapter$mAdapter$1;-><init>(Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;ILandroid/content/Context;Ljava/util/ArrayList;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 2
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a1897

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.sma.smartv3.view.text.PFMedium"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->tvTitle:Lcom/sma/smartv3/view/text/PFMedium;

    const v0, 0x7f0a1899

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->tvTitle2:Lcom/sma/smartv3/view/text/PFMedium;

    const v0, 0x7f0a05d0

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->mRecyclerViewFirst:Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f0a05d1

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->mRecyclerViewSecond:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->mRecyclerViewFirst:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_0

    const-string v0, "mRecyclerViewFirst"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->setMContext(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->viewModel:Lcom/sma/smartv3/ui/sport/course/model/CourseViewModel;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/course/model/CourseViewModel;->getData()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->viewModel:Lcom/sma/smartv3/ui/sport/course/model/CourseViewModel;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/course/model/CourseViewModel;->getCourseLiveData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IIXiiXIX;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/IIXiiXIX;-><init>(Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;Lcom/angcyo/dsladapter/DslViewHolder;)V

    new-instance p1, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem$OXO1;

    invoke-direct {p1, v1}, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem$OXO1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, p1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    return-void
.end method

.method public final getMContext()Landroid/content/Context;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMFirstColors()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->mFirstColors:Ljava/util/List;

    return-object v0
.end method

.method public final getMSecondColors()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->mSecondColors:Ljava/util/List;

    return-object v0
.end method

.method public initView()V
    .locals 0

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e5e

    return v0
.end method

.method public final setBackgroundResource(II)Landroid/graphics/drawable/GradientDrawable;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->mFirstColors:Ljava/util/List;

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    rem-int/2addr p1, v0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    goto :goto_1

    :cond_0
    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->mSecondColors:Ljava/util/List;

    goto :goto_0

    :goto_1
    new-instance p2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {p2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {p1, v1}, [Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->O011OOIO0(Ljava/util/Collection;)[I

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    invoke-virtual {p2, v0}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    sget-object p1, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/GradientDrawable;->setOrientation(Landroid/graphics/drawable/GradientDrawable$Orientation;)V

    const/high16 p1, 0x41200000    # 10.0f

    invoke-static {p1}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/GradientDrawable;->setGradientRadius(F)V

    return-object p2
.end method

.method public final setMContext(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;->mContext:Landroid/content/Context;

    return-void
.end method
