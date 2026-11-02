.class public final Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHeathReportsGenerateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeathReportsGenerateActivity.kt\ncom/sma/smartv3/ui/status/HeathReportsGenerateActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,197:1\n1#2:198\n1#2:210\n1563#3:199\n1634#3,3:200\n87#4,7:203\n94#4,3:211\n70#4,7:214\n97#4:221\n*S KotlinDebug\n*F\n+ 1 HeathReportsGenerateActivity.kt\ncom/sma/smartv3/ui/status/HeathReportsGenerateActivity\n*L\n135#1:210\n165#1:199\n165#1:200,3\n135#1:203,7\n135#1:211,3\n135#1:214,7\n135#1:221\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHeathReportsGenerateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeathReportsGenerateActivity.kt\ncom/sma/smartv3/ui/status/HeathReportsGenerateActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n*L\n1#1,197:1\n1#2:198\n1#2:210\n1563#3:199\n1634#3,3:200\n87#4,7:203\n94#4,3:211\n70#4,7:214\n97#4:221\n*S KotlinDebug\n*F\n+ 1 HeathReportsGenerateActivity.kt\ncom/sma/smartv3/ui/status/HeathReportsGenerateActivity\n*L\n135#1:210\n165#1:199\n165#1:200,3\n135#1:203,7\n135#1:211,3\n135#1:214,7\n135#1:221\n*E\n"
    }
.end annotation


# instance fields
.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
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

.field private forNumber:I

.field private final mGenerateBtn$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mGenerateImgView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mGenerateTvView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mHandler:Landroid/os/Handler;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRecyclerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iX10Ii;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iX10Ii;-><init>(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXiX1IO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XXiX1IO;-><init>(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IOXXIIOX1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IOXXIIOX1;-><init>(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->mGenerateBtn$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXOX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XXOX;-><init>(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->mGenerateImgView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Oi0O11II;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Oi0O11II;-><init>(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->mGenerateTvView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OXXOO0O;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OXXOO0O;-><init>(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->mRecyclerView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XiIO0OII;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XiIO0OII;-><init>(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->mShareLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->showList:Ljava/util/ArrayList;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->mHandler:Landroid/os/Handler;

    const/4 v0, 0x1

    iput v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->forNumber:I

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;J)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->startAIAnalyze$lambda$0$0(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;J)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->initView$lambda$1(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->mGenerateTvView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->mRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->mShareLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->initView$lambda$1$0(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)V

    return-void
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->mGenerateBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;Lcom/sma/smartv3/model/TodayData;Lcom/sma/smartv3/model/AIAnswer;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->startAIAnalyze$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;Lcom/sma/smartv3/model/TodayData;Lcom/sma/smartv3/model/AIAnswer;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private final getAbhTitleCenter()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMGenerateBtn()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->mGenerateBtn$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMGenerateImgView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->mGenerateImgView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMGenerateTvView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->mGenerateTvView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->mRecyclerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private final getMShareLayout()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->mShareLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->mGenerateImgView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final initRecyclerView()V
    .locals 5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    const/16 v1, 0x1e

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemViewCacheSize(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance v0, Lcom/angcyo/dsladapter/DslAdapter;

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->showList:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;-><init>(Ljava/util/List;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->dslAdapter:Lcom/angcyo/dsladapter/DslAdapter;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/angcyo/dsladapter/DslAdapter;->notifyDataChanged()V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->mTodayDataList:Ljava/util/List;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->getMGenerateImgView()Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->getMGenerateTvView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->getMRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->getMGenerateBtn()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    const/4 p1, 0x1

    iput p1, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->forNumber:I

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->mTodayDataList:Ljava/util/List;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->startAIAnalyze()V

    :cond_0
    return-void

    :cond_1
    const p0, 0x7f140cc6

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Lkotlin/Unit;
    .locals 2

    sget-object v0, Lcom/sma/smartv3/util/HeathReportsUtils;->OXO1:Lcom/sma/smartv3/util/HeathReportsUtils;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/HeathReportsUtils;->O1O()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->showCard(Ljava/util/List;)Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iiiXOiX0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/iiiXOiX0;-><init>(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initView$lambda$1$0(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->initRecyclerView()V

    return-void
.end method

.method private static final mGenerateBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c88

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mGenerateImgView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0666

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mGenerateTvView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0cfb

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    const v0, 0x7f0a09c1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private static final mShareLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0a2a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final showCard(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/TodayData;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lcom/angcyo/dsladapter/DslAdapterItem;",
            ">;"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->mTodayDataList:Ljava/util/List;

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->showList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "HEATH_REPORTS_MEASUREMENT_TIME"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->showList:Ljava/util/ArrayList;

    new-instance v3, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v3, v0, v1, v4, v5}, Lcom/sma/smartv3/ui/status/item/HeathReportsTopItem;-><init>(JZLcom/sma/smartv3/db/entity/HealthyReport;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/TodayData;

    new-instance v3, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;

    invoke-direct {v3, v2}, Lcom/sma/smartv3/ui/status/item/HeathReportsBaseItem;-><init>(Lcom/sma/smartv3/model/TodayData;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->showList:Ljava/util/ArrayList;

    new-instance v1, Lcom/sma/smartv3/ui/status/item/MainStatusFunctionsItem;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/status/item/MainStatusFunctionsItem;-><init>()V

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/ui/status/item/MainStatusFunctionsItem;->setItems(Ljava/util/List;)V

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->showList:Ljava/util/ArrayList;

    return-object p1
.end method

.method private final startAIAnalyze()V
    .locals 8

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->mTodayDataList:Ljava/util/List;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget v1, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->forNumber:I

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/TodayData;

    sget-object v1, Lcom/sma/smartv3/util/HeathReportsUtils;->OXO1:Lcom/sma/smartv3/util/HeathReportsUtils;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/TodayData;->getDataType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/sma/smartv3/model/TodayData;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/sma/smartv3/model/TodayData;->getValue()Ljava/lang/String;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/sma/smartv3/util/HeathReportsUtils;->iX1O1(Lcom/sma/smartv3/util/HeathReportsUtils;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_0

    new-instance v4, Lcom/android/mltcode/paycertificationapi/IIO0XXI;

    invoke-direct {v4, p0, v0}, Lcom/android/mltcode/paycertificationapi/IIO0XXI;-><init>(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;Lcom/sma/smartv3/model/TodayData;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/sma/smartv3/util/HeathReportsUtils;->iXi(Lcom/sma/smartv3/util/HeathReportsUtils;Ljava/lang/String;ILkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private static final startAIAnalyze$lambda$0(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;Lcom/sma/smartv3/model/TodayData;Lcom/sma/smartv3/model/AIAnswer;)Lkotlin/Unit;
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->forNumber:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->forNumber:I

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/sma/smartv3/model/AIAnswer;->getText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p2}, Lcom/sma/smartv3/model/AIAnswer;->getText()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/model/TodayData;->setMExtraInfo(Ljava/lang/String;)V

    :cond_0
    iget p1, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->forNumber:I

    iget-object p2, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->mTodayDataList:Ljava/util/List;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-lt p1, p2, :cond_1

    sget-object p1, Lcom/sma/smartv3/util/HeathReportsUtils;->OXO1:Lcom/sma/smartv3/util/HeathReportsUtils;

    iget-object p2, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->mTodayDataList:Ljava/util/List;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I00X101XX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I00X101XX;-><init>(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)V

    invoke-virtual {p1, p2, v0}, Lcom/sma/smartv3/util/HeathReportsUtils;->OO(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->startAIAnalyze()V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final startAIAnalyze$lambda$0$0(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;J)Lkotlin/Unit;
    .locals 4

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "HEATH_REPORTS_MEASUREMENT_TIME"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    invoke-virtual {p2, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "mArg2"

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/status/HeathReportsResultActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_0
    const p1, 0x7f140c43

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final getForNumber()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->forNumber:I

    return v0
.end method

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->showList:Ljava/util/ArrayList;

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
    .locals 10
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140cb4

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f081350

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f06074b

    invoke-static {p0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->initRecyclerView()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->getMGenerateBtn()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O0OOOXXX;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/O0OOOXXX;-><init>(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v7, Lcom/android/mltcode/paycertificationapi/XI0III0O;

    invoke-direct {v7, p0}, Lcom/android/mltcode/paycertificationapi/XI0III0O;-><init>(Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;)V

    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v9}, Lkotlin/concurrent/ThreadsKt;->iO(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Thread;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->getMShareLayout()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->getMShareLayout()Landroid/view/View;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->getMShareLayout()Landroid/view/View;

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

.method public final setForNumber(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/status/HeathReportsGenerateActivity;->forNumber:I

    return-void
.end method
