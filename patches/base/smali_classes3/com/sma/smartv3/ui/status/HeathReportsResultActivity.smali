.class public final Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHeathReportsResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeathReportsResultActivity.kt\ncom/sma/smartv3/ui/status/HeathReportsResultActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,147:1\n1#2:148\n1#2:160\n1563#3:149\n1634#3,3:150\n1563#3:153\n1634#3,3:154\n69#4,3:157\n72#4,5:161\n*S KotlinDebug\n*F\n+ 1 HeathReportsResultActivity.kt\ncom/sma/smartv3/ui/status/HeathReportsResultActivity\n*L\n144#1:160\n107#1:149\n107#1:150,3\n112#1:153\n112#1:154,3\n144#1:157,3\n144#1:161,5\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHeathReportsResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeathReportsResultActivity.kt\ncom/sma/smartv3/ui/status/HeathReportsResultActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,147:1\n1#2:148\n1#2:160\n1563#3:149\n1634#3,3:150\n1563#3:153\n1634#3,3:154\n69#4,3:157\n72#4,5:161\n*S KotlinDebug\n*F\n+ 1 HeathReportsResultActivity.kt\ncom/sma/smartv3/ui/status/HeathReportsResultActivity\n*L\n144#1:160\n107#1:149\n107#1:150,3\n112#1:153\n112#1:154,3\n144#1:157,3\n144#1:161,5\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleOtherRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private dslAdapter:Lcom/angcyo/dsladapter/DslAdapter;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mGenerateBtn$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mHealthyReport:Lcom/sma/smartv3/db/entity/HealthyReport;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mShareLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mTodayDataList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/TodayData;",
            ">;"
        }
    .end annotation
.end field

.field private reportsId:J

.field private final showList:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/angcyo/dsladapter/DslAdapterItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    const-string v0, "HeathReportsResultActivity"

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XO00IX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XO00IX;-><init>(Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IiiiXOXX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IiiiXOXX;-><init>(Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IIO0I00XI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IIO0I00XI;-><init>(Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->abhTitleOtherRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OXOOOi1OI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OXOOOi1OI;-><init>(Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->mShareLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->showList:Ljava/util/ArrayList;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXOIO1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iXOIO1;-><init>(Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->mGenerateBtn$delegate:Lkotlin/Lazy;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->reportsId:J

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->abhTitleOtherRight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->mShareLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->mGenerateBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final abhTitleOtherRight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0025

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private final getAbhTitleCenter()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getAbhTitleOtherRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->abhTitleOtherRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMGenerateBtn()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->mGenerateBtn$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMShareLayout()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->mShareLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private static final mGenerateBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c88

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mShareLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0a2a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getShowList()Ljava/util/ArrayList;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/angcyo/dsladapter/DslAdapterItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->showList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object p1

    const-wide/16 v0, -0x1

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    goto :goto_0

    :cond_0
    move-wide v2, v0

    :goto_0
    iput-wide v2, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->reportsId:J

    cmp-long p1, v2, v0

    if-lez p1, :cond_1

    sget-object p1, Lcom/sma/smartv3/util/HeathReportsUtils;->OXO1:Lcom/sma/smartv3/util/HeathReportsUtils;

    invoke-virtual {p1, v2, v3}, Lcom/sma/smartv3/util/HeathReportsUtils;->i010I(J)Lcom/sma/smartv3/db/entity/HealthyReport;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->mHealthyReport:Lcom/sma/smartv3/db/entity/HealthyReport;

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/util/HeathReportsUtils;->OX110i(Lcom/sma/smartv3/db/entity/HealthyReport;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->mTodayDataList:Ljava/util/List;

    :cond_1
    return-void
.end method

.method public initView()V
    .locals 5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140cb4

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->getMGenerateBtn()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/angcyo/dsladapter/LibExKt;->XX1Oi(Landroid/view/View;Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v3, 0x7f081350

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v3, 0x7f06074b

    invoke-static {p0, v3}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->getAbhTitleOtherRight()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->getAbhTitleOtherRight()Landroid/widget/ImageView;

    move-result-object v0

    const v2, 0x7f081087

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->getAbhTitleOtherRight()Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {p0, v3}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->showCard()Ljava/util/ArrayList;

    const v0, 0x7f0a09c1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    const/16 v2, 0xa

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setItemViewCacheSize(I)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;)V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_2

    new-instance v2, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    :cond_2
    new-instance v0, Lcom/angcyo/dsladapter/DslAdapter;

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->showList:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;-><init>(Ljava/util/List;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v1, :cond_3

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    :cond_3
    iput-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->dslAdapter:Lcom/angcyo/dsladapter/DslAdapter;

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00b4

    return v0
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onTitleRightClick(Landroid/view/View;)V
    .locals 4
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->getMShareLayout()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->getMShareLayout()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string v0, "createBitmap(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->OXO1:Lcom/android/mltcode/paycertificationapi/XIi1i01O;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->getMShareLayout()Landroid/view/View;

    move-result-object v2

    const-string v3, "<get-mShareLayout>(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->XIi00iiXO(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->XOX0O0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {p1, v1, v2}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;)Z

    new-instance p1, Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND"

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "android.intent.extra.TEXT"

    const-string v2, ""

    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->XOX0O0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/UriUtils;->file2Uri(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "android.intent.extra.STREAM"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string v0, "image/*"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {p1, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "createChooser(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v0, 0x10000000

    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final onTitleRightOtherClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final showCard()Ljava/util/ArrayList;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/angcyo/dsladapter/DslAdapterItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->showList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->mHealthyReport:Lcom/sma/smartv3/db/entity/HealthyReport;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/HealthyReport;->getMTime()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "HEATH_REPORTS_MEASUREMENT_TIME"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    :goto_0
    new-instance v2, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->mHealthyReport:Lcom/sma/smartv3/db/entity/HealthyReport;

    invoke-direct {v2, v0, v1, v3, v4}, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;-><init>(JZLcom/sma/smartv3/db/entity/HealthyReport;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->showList:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->mTodayDataList:Ljava/util/List;

    const/16 v2, 0xa

    if-eqz v1, :cond_1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/model/TodayData;

    new-instance v5, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;

    invoke-direct {v5, v4}, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;-><init>(Lcom/sma/smartv3/model/TodayData;)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->showList:Ljava/util/ArrayList;

    new-instance v3, Lcom/sma/smartv3/ui/status/item/MainStatusFunctionsItem;

    invoke-direct {v3}, Lcom/sma/smartv3/ui/status/item/MainStatusFunctionsItem;-><init>()V

    invoke-virtual {v3, v0}, Lcom/sma/smartv3/ui/status/item/MainStatusFunctionsItem;->setItems(Ljava/util/List;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->mTodayDataList:Ljava/util/List;

    if-eqz v0, :cond_2

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/TodayData;

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->showList:Ljava/util/ArrayList;

    new-instance v4, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;

    invoke-direct {v4, v2}, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;-><init>(Lcom/sma/smartv3/model/TodayData;)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;->showList:Ljava/util/ArrayList;

    return-object v0
.end method
