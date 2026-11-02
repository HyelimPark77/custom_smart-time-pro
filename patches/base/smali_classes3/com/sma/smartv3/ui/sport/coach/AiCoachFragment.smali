.class public final Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiCoachFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiCoachFragment.kt\ncom/sma/smartv3/ui/sport/coach/AiCoachFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,472:1\n90#2:473\n90#2:474\n1869#3,2:475\n99#4,7:477\n106#4,3:485\n79#4,7:488\n109#4:495\n1#5:484\n*S KotlinDebug\n*F\n+ 1 AiCoachFragment.kt\ncom/sma/smartv3/ui/sport/coach/AiCoachFragment\n*L\n135#1:473\n169#1:474\n454#1:475,2\n458#1:477,7\n458#1:485,3\n458#1:488,7\n458#1:495\n458#1:484\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAiCoachFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiCoachFragment.kt\ncom/sma/smartv3/ui/sport/coach/AiCoachFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,472:1\n90#2:473\n90#2:474\n1869#3,2:475\n99#4,7:477\n106#4,3:485\n79#4,7:488\n109#4:495\n1#5:484\n*S KotlinDebug\n*F\n+ 1 AiCoachFragment.kt\ncom/sma/smartv3/ui/sport/coach/AiCoachFragment\n*L\n135#1:473\n169#1:474\n454#1:475,2\n458#1:477,7\n458#1:485,3\n458#1:488,7\n458#1:495\n458#1:484\n*E\n"
    }
.end annotation


# instance fields
.field private final ITEM_GROUPS_TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private curDataPosition:I

.field private curPosition:I

.field private curTimeDay:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isAddItemDecoration:Z

.field private isReachedTarget:Z

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCurrentItem:I

.field private mDeleteWindow:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mExtensionWindow:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mListAdapter:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;",
            ">;>;"
        }
    .end annotation
.end field

.field private mVitalityData:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;-><init>()V

    const-string v0, "AiCoachFragment"

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->TAG:Ljava/lang/String;

    const-string v0, "cocah_groups"

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->ITEM_GROUPS_TAG:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->curTimeDay:Ljava/lang/String;

    const/4 v0, -0x1

    iput v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->curDataPosition:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->mListAdapter:Ljava/util/List;

    new-instance v0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$OXO1;-><init>(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->mBleHandleCallback:Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$OXO1;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->isAddItemDecoration:Z

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->showPlanFunction$lambda$1$0$0(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->addGroupHead$lambda$0$0(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IO()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->showExtensionPopup$lambda$0$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic IiI10X()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->showDeletePopup$lambda$0$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->showData$lambda$0$0(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->showData$lambda$0$0$0(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->showData$lambda$0(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->onRefresh$lambda$0(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;)V

    return-void
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->showPlanFunction$lambda$0(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->showPlanFunction$lambda$1$0(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->addGroupHead$lambda$0(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->showDeletePopup$lambda$0$1()Z

    move-result v0

    return v0
.end method

.method public static final synthetic access$addRecyclerView(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/util/List;Landroidx/viewpager2/widget/ViewPager2;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->addRecyclerView(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/util/List;Landroidx/viewpager2/widget/ViewPager2;)V

    return-void
.end method

.method public static final synthetic access$getCurPosition$p(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->curPosition:I

    return p0
.end method

.method public static final synthetic access$getCurTimeDay$p(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->curTimeDay:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getITEM_GROUPS_TAG$p(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->ITEM_GROUPS_TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getMListAdapter$p(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->mListAdapter:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$setCurDataPosition$p(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->curDataPosition:I

    return-void
.end method

.method public static final synthetic access$setCurPosition$p(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->curPosition:I

    return-void
.end method

.method public static final synthetic access$setCurTimeDay$p(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->curTimeDay:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$showPlanFunction(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->showPlanFunction()V

    return-void
.end method

.method private final addGroupHead()V
    .locals 3

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O1X;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/O1X;-><init>(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;)V

    const v2, 0x7f0d0186

    invoke-static {v0, v2, v1}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    return-void
.end method

.method private static final addGroupHead$lambda$0(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsGroupHead(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->ITEM_GROUPS_TAG:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsHover(Z)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXOX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IXOX;-><init>(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final addGroupHead$lambda$0$0(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 3

    const-string p2, "itemHolder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "adapterItem"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "<unused var>"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x7f0a0933

    invoke-virtual {p1, p2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast p2, Landroid/widget/TextView;

    const p3, 0x7f0a18fd    # 1.835632E38f

    invoke-virtual {p1, p3}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast p1, Landroidx/viewpager2/widget/ViewPager2;

    sget-object p3, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {p3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object p3

    invoke-virtual {p3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XXI()Ljava/util/List;

    move-result-object p3

    if-eqz p3, :cond_0

    check-cast p3, Ljava/lang/Iterable;

    const/4 p4, 0x7

    invoke-static {p3, p4}, Lkotlin/collections/CollectionsKt___CollectionsKt;->X10i(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    const/4 p4, -0x1

    invoke-virtual {p1, p4}, Landroidx/viewpager2/widget/ViewPager2;->setOffscreenPageLimit(I)V

    const p4, 0x7f1414f1

    invoke-virtual {p0, p4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " ("

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, "/"

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, ")"

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p4

    new-instance v0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addGroupHead$1$1$1;

    invoke-direct {v0, p3, p0, p1, p4}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addGroupHead$1$1$1;-><init>(Ljava/util/List;Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Landroidx/viewpager2/widget/ViewPager2;Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iget p4, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->mCurrentItem:I

    invoke-virtual {p1, p4}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    new-instance p4, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addGroupHead$1$1$2;

    invoke-direct {p4, p2, p0, p1, p3}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addGroupHead$1$1$2;-><init>(Landroid/widget/TextView;Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Landroidx/viewpager2/widget/ViewPager2;Ljava/util/List;)V

    invoke-virtual {p1, p4}, Landroidx/viewpager2/widget/ViewPager2;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final addRecyclerView(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/util/List;Landroidx/viewpager2/widget/ViewPager2;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;",
            ">;",
            "Landroidx/viewpager2/widget/ViewPager2;",
            ")V"
        }
    .end annotation

    new-instance p3, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iput-object p2, p3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    const p2, 0x7f0a00aa

    invoke-virtual {p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    new-instance p2, Lcom/sma/smartv3/otherdevice/jl/view/CommonDecoration;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060760

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    const/16 v3, 0x20

    invoke-direct {p2, v1, v0, v2, v3}, Lcom/sma/smartv3/otherdevice/jl/view/CommonDecoration;-><init>(Landroid/content/Context;III)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    :cond_0
    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {p2, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance p2, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x7

    invoke-direct {p2, v0, v1}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p2

    new-instance v0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1;

    invoke-direct {v0, p3, p0, p2}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$addRecyclerView$adapter$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->mListAdapter:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/android/mltcode/paycertificationapi/go0;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->showExtensionPopup$lambda$0$1(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/android/mltcode/paycertificationapi/go0;)Z

    move-result p0

    return p0
.end method

.method private static final onRefresh$lambda$0(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;)V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->OIX0iXi(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getRefreshLayout()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object p0

    invoke-virtual {p0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    return-void
.end method

.method private final setCurSelected()V
    .locals 7

    sget-object v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XXI()Ljava/util/List;

    move-result-object v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x7

    if-eqz v0, :cond_2

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;

    invoke-virtual {v5}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->getMLessonIndex()I

    move-result v6

    if-eq v6, v1, :cond_0

    invoke-virtual {v5}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->isCompleted()Z

    move-result v6

    if-nez v6, :cond_0

    sget-object v6, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {v6}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v6

    invoke-virtual {v6}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X0O()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move-result-object v6

    invoke-virtual {v6}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getDailySchedule()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v5}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->getMLessonIndex()I

    move-result v5

    rem-int/2addr v5, v3

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_0

    goto :goto_0

    :cond_1
    move-object v4, v2

    :goto_0
    check-cast v4, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;

    goto :goto_1

    :cond_2
    move-object v4, v2

    :goto_1
    if-eqz v4, :cond_5

    sget-object v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XXI()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v5, v4}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v5

    if-gt v5, v3, :cond_3

    rem-int/lit8 v0, v5, 0x7

    iput v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->curPosition:I

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->getTimeDay()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->curTimeDay:Ljava/lang/String;

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->getMLessonIndex()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->curDataPosition:I

    div-int/2addr v5, v3

    iput v5, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->mCurrentItem:I

    return-void

    :cond_3
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->XXI()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;

    :cond_4
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->getTimeDay()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->curTimeDay:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->mCurrentItem:I

    iput v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->curPosition:I

    iput v1, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->curDataPosition:I

    :cond_5
    return-void
.end method

.method private final showData()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IIiiXXi1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IIiiXXi1;-><init>(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final showData$lambda$0(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->clearAllItems()V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iO1XOi;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/iO1XOi;-><init>(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/angcyo/dsladapter/DslAdapter;)V

    const-wide/16 p0, 0x64

    invoke-virtual {v0, p0, p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->postDelay(JLkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->mVitalityData:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getPlanTarget()F

    move-result v0

    const/4 v3, 0x0

    cmpg-float v0, v0, v3

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/sport/coach/item/PlanDetailItem;-><init>()V

    invoke-static {p1, v0, v2, v1, v2}, Lcom/angcyo/dsladapter/DslAdapterExKt;->IIX1OXO(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/angcyo/dsladapter/DslAdapterItem;

    sget-object v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X0O()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMProgress()I

    move-result v0

    const/16 v3, 0x64

    if-ne v0, v3, :cond_1

    new-instance p0, Lcom/sma/smartv3/ui/sport/coach/item/CompletePlanItem;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/item/CompletePlanItem;-><init>()V

    invoke-static {p1, p0, v2, v1, v2}, Lcom/angcyo/dsladapter/DslAdapterExKt;->IIX1OXO(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->addGroupHead()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->showPlanFunction()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    goto :goto_1

    :cond_2
    :goto_0
    sget-object p0, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {p0}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object p0

    const-string v0, "https://dev.iot-solution.net/kotlinweb"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    new-instance p0, Lcom/sma/smartv3/ui/sport/coach/item/LackPlanItem;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/item/LackPlanItem;-><init>()V

    invoke-static {p1, p0, v2, v1, v2}, Lcom/angcyo/dsladapter/DslAdapterExKt;->IIX1OXO(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/angcyo/dsladapter/DslAdapterItem;

    move-result-object p0

    check-cast p0, Lcom/bestmafen/androidbase/dsl/BaseDslItem;

    goto :goto_1

    :cond_3
    sget-object p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X0O()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMBeforePlanInfo()Lcom/szabh/smable3/entity/BleAICoachBeforePlan;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object p0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X0O()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move-result-object p0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMBeforePlanInfo()Lcom/szabh/smable3/entity/BleAICoachBeforePlan;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/szabh/smable3/entity/BleAICoachBeforePlan;->getMDayMET()I

    move-result p0

    const/4 v0, 0x3

    if-lt p0, v0, :cond_4

    new-instance p0, Lcom/sma/smartv3/ui/sport/coach/item/LackPlanItem;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/item/LackPlanItem;-><init>()V

    invoke-static {p1, p0, v2, v1, v2}, Lcom/angcyo/dsladapter/DslAdapterExKt;->IIX1OXO(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/angcyo/dsladapter/DslAdapterItem;

    move-result-object p0

    check-cast p0, Lcom/bestmafen/androidbase/dsl/BaseDslItem;

    goto :goto_1

    :cond_4
    new-instance p0, Lcom/sma/smartv3/ui/sport/coach/item/PlanConstrainedItem;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/item/PlanConstrainedItem;-><init>()V

    invoke-static {p1, p0, v2, v1, v2}, Lcom/angcyo/dsladapter/DslAdapterExKt;->IIX1OXO(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/angcyo/dsladapter/DslAdapterItem;

    move-result-object p0

    check-cast p0, Lcom/bestmafen/androidbase/dsl/BaseDslItem;

    :goto_1
    new-instance v3, Lcom/android/mltcode/paycertificationapi/O0iX0iO0;

    invoke-direct {v3}, Lcom/android/mltcode/paycertificationapi/O0iX0iO0;-><init>()V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lcom/angcyo/dsladapter/DslAdapter;->render$default(Lcom/angcyo/dsladapter/DslAdapter;ZLcom/angcyo/dsladapter/XIi00iiXO;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

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

.method private final showDeletePopup()V
    .locals 5

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const-string v2, "requireActivity(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f1410e9

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->mVitalityData:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMProgress()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "%"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v2, 0x7f1410e8

    invoke-virtual {p0, v2, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iOO1ii1(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/iOi1;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/iOi1;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OO01X1XO;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/OO01X1XO;-><init>()V

    const v2, 0x7f14034b

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->mDeleteWindow:Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    return-void
.end method

.method private static final showDeletePopup$lambda$0$0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static final showDeletePopup$lambda$0$1()Z
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->O00()V

    const/4 v0, 0x1

    return v0
.end method

.method private final showExtensionPopup()V
    .locals 5

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const-string v2, "requireActivity(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f1410ec

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f1410eb

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    invoke-virtual {v0, v4}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    const v1, 0x7f141322

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/iiXXOOi;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/iiXXOOi;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O11XIiXI;

    invoke-direct {v1, p0, v0}, Lcom/android/mltcode/paycertificationapi/O11XIiXI;-><init>(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/android/mltcode/paycertificationapi/go0;)V

    const v2, 0x7f1410ea

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->mExtensionWindow:Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    return-void
.end method

.method private static final showExtensionPopup$lambda$0$0()Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "DELETE_AI_COACH_PLAN"

    invoke-static {v2, v0, v1, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    const/4 v0, 0x1

    return v0
.end method

.method private static final showExtensionPopup$lambda$0$1(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/android/mltcode/paycertificationapi/go0;)Z
    .locals 2

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->XO0O10()Landroid/app/Activity;

    move-result-object p1

    const-class v1, Lcom/sma/smartv3/ui/sport/coach/CreatePlanActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    const/4 p0, 0x1

    return p0
.end method

.method private final showPlanFunction()V
    .locals 15

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->curDataPosition:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->isReachedTarget:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X0O()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMVitalityDayLesson()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->curDataPosition:I

    rem-int/lit8 v1, v1, 0x7

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->getDayLesson()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct {v3, v1, v6, v4, v5}, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;-><init>(Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/android/mltcode/paycertificationapi/XO1X;

    invoke-direct {v4, p0, v1}, Lcom/android/mltcode/paycertificationapi/XO1X;-><init>(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;)V

    invoke-static {v2, v3, v4}, Lcom/angcyo/dsladapter/DslAdapterExKt;->X0O(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    :goto_1
    new-instance v5, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    const/16 v13, 0x7f

    const/4 v14, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v5 .. v14}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;-><init>(ILjava/lang/String;Ljava/lang/String;IIFLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->isReachedTarget:Z

    invoke-direct {v1, v5, v2}, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;-><init>(Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;Z)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/OIXOi1IOi;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/OIXOi1IOi;-><init>(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;)V

    invoke-static {v0, v1, v2}, Lcom/angcyo/dsladapter/DslAdapterExKt;->X0O(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    return-void
.end method

.method private static final showPlanFunction$lambda$0(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->ITEM_GROUPS_TAG:Ljava/lang/String;

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showPlanFunction$lambda$1$0(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->ITEM_GROUPS_TAG:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I1Xi1I;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/I1Xi1I;-><init>(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showPlanFunction$lambda$1$0$0(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;Landroid/view/View;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg2"

    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {p2, v0, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final getMCurrentItem()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->mCurrentItem:I

    return v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->mBleHandleCallback:Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$OXO1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 8

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->initView()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AI_COACH_PLAN_MOBILE_PHONE_V2"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5f

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v3, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->mVitalityData:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->mVitalityData:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->iOOX010X(Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X1ii()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->setCurSelected()V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->mVitalityData:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getStartTime()J

    move-result-wide v3

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->I0IIOi(Lcom/sma/smartv3/ui/sport/coach/AICoachManage;JIILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->showExtensionPopup()V

    :cond_0
    sget-object v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->OIX0iXi(I)V

    return-void
.end method

.method public final isReachedTarget()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->isReachedTarget:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0174

    return v0
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->onDestroy()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->mBleHandleCallback:Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public onInitBaseLayoutAfter()V
    .locals 6

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->onInitBaseLayoutAfter()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->isAddItemDecoration:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->isAddItemDecoration:Z

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/otherdevice/jl/view/CommonDecoration;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f060760

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    const/16 v4, 0x10

    const/4 v5, 0x1

    invoke-direct {v1, v2, v5, v3, v4}, Lcom/sma/smartv3/otherdevice/jl/view/CommonDecoration;-><init>(Landroid/content/Context;III)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->showData()V

    return-void
.end method

.method public final onPlanCreateChanged(Ljava/lang/Object;)V
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "CREATE_AI_COACH_PLAN"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AI_COACH_PLAN_MOBILE_PHONE_V2"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5f

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v2, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->mVitalityData:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    if-eqz p1, :cond_0

    sget-object p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->mVitalityData:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->iOOX010X(Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X1ii()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->setCurSelected()V

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->TAG:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->mVitalityData:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " AICoachManage data = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->showData()V

    return-void
.end method

.method public final onPlanDelete(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "DELETE_AI_COACH_PLAN"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->mDeleteWindow:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->showDeletePopup()V

    return-void
.end method

.method public onRefresh()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->onRefresh()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O0XOi;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/O0XOi;-><init>(Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method public recyclerViewId()I
    .locals 1

    const v0, 0x7f0a09c1

    return v0
.end method

.method public refreshLayoutId()I
    .locals 1

    const v0, 0x7f0a0b16

    return v0
.end method

.method public final setMCurrentItem(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->mCurrentItem:I

    return-void
.end method

.method public final setReachedTarget(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/coach/AiCoachFragment;->isReachedTarget:Z

    return-void
.end method
