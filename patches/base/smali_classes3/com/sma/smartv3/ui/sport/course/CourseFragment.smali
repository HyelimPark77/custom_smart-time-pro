.class public final Lcom/sma/smartv3/ui/sport/course/CourseFragment;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/sport/course/CourseFragment$OXO1;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/sport/course/CourseFragment$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ONE_DAY_TIME:I = 0x5265c00


# instance fields
.field private mCourseList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/CourseList;",
            ">;"
        }
    .end annotation
.end field

.field public mFitnessSpecialItem:Lcom/sma/smartv3/ui/sport/course/item/FitnessSpecialItem;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/sport/course/CourseFragment$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/sport/course/CourseFragment$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/sport/course/CourseFragment;->Companion:Lcom/sma/smartv3/ui/sport/course/CourseFragment$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseFragment;->mCourseList:Ljava/util/List;

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/sport/course/CourseFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/course/CourseFragment;->showData$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/sport/course/CourseFragment;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/course/CourseFragment;->showData$lambda$0$0(Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/sport/course/CourseFragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/sport/course/CourseFragment;[Lcom/sma/smartv3/model/CourseList;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/course/CourseFragment;->onRefPost$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseFragment;[Lcom/sma/smartv3/model/CourseList;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTime(Lcom/sma/smartv3/ui/sport/course/CourseFragment;Ljava/util/List;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/course/CourseFragment;->getTime(Ljava/util/List;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$onLoadData(Lcom/sma/smartv3/ui/sport/course/CourseFragment;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/course/CourseFragment;->onLoadData(Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic access$onRefPost(Lcom/sma/smartv3/ui/sport/course/CourseFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/CourseFragment;->onRefPost()V

    return-void
.end method

.method private final getTime(Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/CourseList;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/model/CourseList;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/CourseList;->getOnSaveTime()J

    move-result-wide v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v1

    const-wide/32 v1, 0x5265c00

    cmp-long p1, v3, v1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public static synthetic iO(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/CourseFragment;->showData$lambda$0$0$0(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private final onLoadData(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/CourseList;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseFragment;->mCourseList:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/course/CourseFragment;->getMFitnessSpecialItem()Lcom/sma/smartv3/ui/sport/course/item/FitnessSpecialItem;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseFragment;->mCourseList:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/sport/course/item/FitnessSpecialItem;->setData(Ljava/util/List;)V

    const-string p1, "test_refresh_page"

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/DslAdapter;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    return-void
.end method

.method private final onRefPost()V
    .locals 4

    sget-object v0, Lcom/sma/smartv3/biz/CourseManager;->OXO1:Lcom/sma/smartv3/biz/CourseManager;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/Xi01OX0O;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/Xi01OX0O;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseFragment;)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2, v3}, Lcom/sma/smartv3/biz/CourseManager;->I0IIOi(Lcom/sma/smartv3/biz/CourseManager;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method private static final onRefPost$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseFragment;[Lcom/sma/smartv3/model/CourseList;)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    invoke-static {p1}, Lkotlin/collections/ArraysKt___ArraysKt;->OXI0X0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/course/CourseFragment;->onLoadData(Ljava/util/List;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final showData()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OO0X1X0iX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OO0X1X0iX;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseFragment;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final showData$lambda$0(Lcom/sma/smartv3/ui/sport/course/CourseFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->clearAllItems()V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I1ii1OI;

    invoke-direct {v1, p1, p0}, Lcom/android/mltcode/paycertificationapi/I1ii1OI;-><init>(Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/sport/course/CourseFragment;)V

    const-wide/16 p0, 0x64

    invoke-virtual {v0, p0, p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->postDelay(JLkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0(Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/sport/course/CourseFragment;)Lkotlin/Unit;
    .locals 9

    new-instance v0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecordItem;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/angcyo/dsladapter/DslAdapterExKt;->IIX1OXO(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/angcyo/dsladapter/DslAdapterItem;

    new-instance v0, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/sport/course/item/FitnessRecommendItem;-><init>()V

    invoke-static {p0, v0, v1, v2, v1}, Lcom/angcyo/dsladapter/DslAdapterExKt;->IIX1OXO(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/angcyo/dsladapter/DslAdapterItem;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/course/CourseFragment;->getMFitnessSpecialItem()Lcom/sma/smartv3/ui/sport/course/item/FitnessSpecialItem;

    move-result-object p1

    invoke-static {p0, p1, v1, v2, v1}, Lcom/angcyo/dsladapter/DslAdapterExKt;->IIX1OXO(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/angcyo/dsladapter/DslAdapterItem;

    new-instance v6, Lcom/android/mltcode/paycertificationapi/X0OIi0;

    invoke-direct {v6}, Lcom/android/mltcode/paycertificationapi/X0OIi0;-><init>()V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, Lcom/angcyo/dsladapter/DslAdapter;->render$default(Lcom/angcyo/dsladapter/DslAdapter;ZLcom/angcyo/dsladapter/XIi00iiXO;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$0(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$render"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1, v0}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final getMFitnessSpecialItem()Lcom/sma/smartv3/ui/sport/course/item/FitnessSpecialItem;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseFragment;->mFitnessSpecialItem:Lcom/sma/smartv3/ui/sport/course/item/FitnessSpecialItem;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mFitnessSpecialItem"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    new-instance p1, Lcom/sma/smartv3/ui/sport/course/item/FitnessSpecialItem;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/CourseFragment;->mCourseList:Ljava/util/List;

    invoke-direct {p1, v0}, Lcom/sma/smartv3/ui/sport/course/item/FitnessSpecialItem;-><init>(Ljava/util/List;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/sport/course/CourseFragment;->setMFitnessSpecialItem(Lcom/sma/smartv3/ui/sport/course/item/FitnessSpecialItem;)V

    return-void
.end method

.method public initView()V
    .locals 6

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->initView()V

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/sport/course/CourseFragment$initView$1;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, Lcom/sma/smartv3/ui/sport/course/CourseFragment$initView$1;-><init>(Lcom/sma/smartv3/ui/sport/course/CourseFragment;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0264

    return v0
.end method

.method public onInitBaseLayoutAfter()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->onInitBaseLayoutAfter()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/CourseFragment;->showData()V

    return-void
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v1

    invoke-virtual {v1}, Lcom/angcyo/dsladapter/DslAdapter;->getItemCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v1

    invoke-virtual {v1}, Lcom/angcyo/dsladapter/DslAdapter;->getItemCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    return-void
.end method

.method public recyclerViewId()I
    .locals 1

    const v0, 0x7f0a09c1

    return v0
.end method

.method public refreshLayoutId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final setMFitnessSpecialItem(Lcom/sma/smartv3/ui/sport/course/item/FitnessSpecialItem;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/sport/course/item/FitnessSpecialItem;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/CourseFragment;->mFitnessSpecialItem:Lcom/sma/smartv3/ui/sport/course/item/FitnessSpecialItem;

    return-void
.end method
