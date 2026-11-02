.class public final Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPlanConfirmActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlanConfirmActivity.kt\ncom/sma/smartv3/ui/sport/coach/PlanConfirmActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,317:1\n1869#2,2:318\n87#3,7:320\n94#3,3:328\n70#3,7:331\n97#3:338\n87#3,7:339\n94#3,3:347\n70#3,7:350\n97#3:357\n1#4:327\n1#4:346\n*S KotlinDebug\n*F\n+ 1 PlanConfirmActivity.kt\ncom/sma/smartv3/ui/sport/coach/PlanConfirmActivity\n*L\n124#1:318,2\n120#1:320,7\n120#1:328,3\n120#1:331,7\n120#1:338\n128#1:339,7\n128#1:347,3\n128#1:350,7\n128#1:357\n120#1:327\n128#1:346\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPlanConfirmActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlanConfirmActivity.kt\ncom/sma/smartv3/ui/sport/coach/PlanConfirmActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,317:1\n1869#2,2:318\n87#3,7:320\n94#3,3:328\n70#3,7:331\n97#3:338\n87#3,7:339\n94#3,3:347\n70#3,7:350\n97#3:357\n1#4:327\n1#4:346\n*S KotlinDebug\n*F\n+ 1 PlanConfirmActivity.kt\ncom/sma/smartv3/ui/sport/coach/PlanConfirmActivity\n*L\n124#1:318,2\n120#1:320,7\n120#1:328,3\n120#1:331,7\n120#1:338\n128#1:339,7\n128#1:347,3\n128#1:350,7\n128#1:357\n120#1:327\n128#1:346\n*E\n"
    }
.end annotation


# instance fields
.field private final ITEM_GROUPS_TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final confirmPlan$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final confirmPlanIv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private curDataPosition:I

.field private curPosition:I

.field private curTimeDay:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCurrentItem:I

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

.field private final modifyPlan$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;-><init>()V

    const-string v0, "plan_groups"

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->ITEM_GROUPS_TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zw1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/zw1;-><init>(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/kw1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/kw1;-><init>(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/lw1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/lw1;-><init>(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->confirmPlanIv$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/mw1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/mw1;-><init>(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->modifyPlan$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/nw1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/nw1;-><init>(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->confirmPlan$delegate:Lkotlin/Lazy;

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->curTimeDay:Ljava/lang/String;

    const/4 v0, -0x1

    iput v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->curDataPosition:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->mListAdapter:Ljava/util/List;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->showPlanFunction$lambda$1$0$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->showPlanFunction$lambda$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->modifyPlan_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->initView$lambda$1(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->addGroupHead$lambda$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->showData$lambda$0$0(Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->confirmPlanIv_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->showPlanFunction$lambda$1$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->showData$lambda$0$0$0(Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->addGroupHead$lambda$0$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->showPlanFunction$lambda$0$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->showData$lambda$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$addRecyclerView(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/util/List;Landroidx/viewpager2/widget/ViewPager2;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->addRecyclerView(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/util/List;Landroidx/viewpager2/widget/ViewPager2;)V

    return-void
.end method

.method public static final synthetic access$getCurPosition$p(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->curPosition:I

    return p0
.end method

.method public static final synthetic access$getCurTimeDay$p(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->curTimeDay:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getITEM_GROUPS_TAG$p(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->ITEM_GROUPS_TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getMListAdapter$p(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->mListAdapter:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$setCurDataPosition$p(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->curDataPosition:I

    return-void
.end method

.method public static final synthetic access$setCurPosition$p(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->curPosition:I

    return-void
.end method

.method public static final synthetic access$setCurTimeDay$p(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->curTimeDay:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$showPlanFunction(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->showPlanFunction()V

    return-void
.end method

.method private final addGroupHead()V
    .locals 3

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/rw1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/rw1;-><init>(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)V

    const v2, 0x7f0d0186

    invoke-static {v0, v2, v1}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    return-void
.end method

.method private static final addGroupHead$lambda$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsGroupHead(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->ITEM_GROUPS_TAG:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsHover(Z)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ww1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ww1;-><init>(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final addGroupHead$lambda$0$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
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

    invoke-virtual {p0, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

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

    new-instance p4, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity$addGroupHead$1$1$1;

    invoke-direct {p4, p0, p3, p1}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity$addGroupHead$1$1$1;-><init>(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Ljava/util/List;Landroidx/viewpager2/widget/ViewPager2;)V

    invoke-virtual {p1, p4}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iget p4, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->mCurrentItem:I

    invoke-virtual {p1, p4}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    new-instance p4, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity$addGroupHead$1$1$2;

    invoke-direct {p4, p2, p0, p1, p3}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity$addGroupHead$1$1$2;-><init>(Landroid/widget/TextView;Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Landroidx/viewpager2/widget/ViewPager2;Ljava/util/List;)V

    invoke-virtual {p1, p4}, Landroidx/viewpager2/widget/ViewPager2;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final addRecyclerView(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/util/List;Landroidx/viewpager2/widget/ViewPager2;)V
    .locals 3
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

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060760

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/16 v2, 0x10

    invoke-direct {p2, p0, v0, v1, v2}, Lcom/sma/smartv3/otherdevice/jl/view/CommonDecoration;-><init>(Landroid/content/Context;III)V

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

    new-instance p2, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity$addRecyclerView$adapter$1;

    invoke-direct {p2, p0, p3}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity$addRecyclerView$adapter$1;-><init>(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->mListAdapter:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static final confirmPlanIv_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0276

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final confirmPlan_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a0254

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->confirmPlan_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->initView$lambda$3(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Landroid/view/View;)V
    .locals 1

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const/16 v0, 0x2328

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->getConfirmPlan()Landroid/widget/Button;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private static final initView$lambda$3(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)V
    .locals 2

    const v0, 0x7f0a02b8

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/angcyo/dsladapter/LibExKt;->XX1Oi(Landroid/view/View;Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->getConfirmPlanIv()Landroid/widget/ImageView;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->clearAnimation()V

    return-void
.end method

.method private static final modifyPlan_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a025b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
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

    iput v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->curPosition:I

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->getTimeDay()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->curTimeDay:Ljava/lang/String;

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->getMLessonIndex()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->curDataPosition:I

    div-int/2addr v5, v3

    iput v5, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->mCurrentItem:I

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

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->curTimeDay:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->mCurrentItem:I

    iput v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->curPosition:I

    iput v1, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->curDataPosition:I

    :cond_5
    return-void
.end method

.method private final showData()V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X1ii()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->setCurSelected()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uw1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/uw1;-><init>(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final showData$lambda$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->clearAllItems()V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/xw1;

    invoke-direct {v1, p1, p0}, Lcom/android/mltcode/paycertificationapi/xw1;-><init>(Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)V

    const-wide/16 p0, 0x64

    invoke-virtual {v0, p0, p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->postDelay(JLkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0(Lcom/angcyo/dsladapter/DslAdapter;Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)Lkotlin/Unit;
    .locals 9

    new-instance v0, Lcom/sma/smartv3/ui/sport/coach/item/VitalityPlanItem;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/sport/coach/item/VitalityPlanItem;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/angcyo/dsladapter/DslAdapterExKt;->IIX1OXO(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/angcyo/dsladapter/DslAdapterItem;

    invoke-direct {p1}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->addGroupHead()V

    invoke-direct {p1}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->showPlanFunction()V

    new-instance v6, Lcom/android/mltcode/paycertificationapi/jw1;

    invoke-direct {v6}, Lcom/android/mltcode/paycertificationapi/jw1;-><init>()V

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

.method private final showPlanFunction()V
    .locals 15

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->curDataPosition:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-ne v0, v1, :cond_0

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

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;

    invoke-direct {v1, v5, v4, v3, v2}, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;-><init>(Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/sw1;

    invoke-direct {v2, p0, v5}, Lcom/android/mltcode/paycertificationapi/sw1;-><init>(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;)V

    invoke-static {v0, v1, v2}, Lcom/angcyo/dsladapter/DslAdapterExKt;->X0O(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    return-void

    :cond_0
    sget-object v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->IiI10X:Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$OXO1;->OXO1()Lcom/sma/smartv3/ui/sport/coach/AICoachManage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage;->X0O()Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityData;->getMVitalityDayLesson()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->curDataPosition:I

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

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v5

    new-instance v6, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;

    invoke-direct {v6, v1, v4, v3, v2}, Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;-><init>(Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lcom/android/mltcode/paycertificationapi/tw1;

    invoke-direct {v7, p0, v1}, Lcom/android/mltcode/paycertificationapi/tw1;-><init>(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;)V

    invoke-static {v5, v6, v7}, Lcom/angcyo/dsladapter/DslAdapterExKt;->X0O(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_0

    :cond_1
    return-void
.end method

.method private static final showPlanFunction$lambda$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->ITEM_GROUPS_TAG:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/yw1;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/yw1;-><init>(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showPlanFunction$lambda$0$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;Landroid/view/View;)Lkotlin/Unit;
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

    const-class v0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showPlanFunction$lambda$1$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;Lcom/sma/smartv3/ui/sport/coach/item/PlanContentItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->ITEM_GROUPS_TAG:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemGroups(Ljava/util/List;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/vw1;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/vw1;-><init>(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showPlanFunction$lambda$1$0$0(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;Landroid/view/View;)Lkotlin/Unit;
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

    const-class v0, Lcom/sma/smartv3/ui/sport/coach/CoachPlanDetailActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getConfirmPlan()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->confirmPlan$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method public final getConfirmPlanIv()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->confirmPlanIv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getMCurrentItem()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->mCurrentItem:I

    return v0
.end method

.method public final getModifyPlan()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->modifyPlan$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 8

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->getAbhTitleCenter()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f1402fa

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->getConfirmPlan()Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->getModifyPlan()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ow1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ow1;-><init>(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->getConfirmPlan()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/pw1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/pw1;-><init>(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->getConfirmPlanIv()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Landroid/view/animation/RotateAnimation;

    const/4 v6, 0x1

    const/high16 v7, 0x3f000000    # 0.5f

    const/high16 v2, 0x43b40000    # 360.0f

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-direct/range {v1 .. v7}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    const/4 v2, -0x1

    invoke-virtual {v1, v2}, Landroid/view/animation/Animation;->setRepeatCount(I)V

    const-wide/16 v2, 0x708

    invoke-virtual {v1, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    new-instance v2, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v2}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/qw1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/qw1;-><init>(Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0173

    return v0
.end method

.method public onInitBaseLayoutAfter()V
    .locals 5

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->onInitBaseLayoutAfter()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/otherdevice/jl/view/CommonDecoration;

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060760

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    const/16 v3, 0x10

    const/4 v4, 0x1

    invoke-direct {v1, p0, v4, v2, v3}, Lcom/sma/smartv3/otherdevice/jl/view/CommonDecoration;-><init>(Landroid/content/Context;III)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->showData()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

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

.method public final setMCurrentItem(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/coach/PlanConfirmActivity;->mCurrentItem:I

    return-void
.end method
