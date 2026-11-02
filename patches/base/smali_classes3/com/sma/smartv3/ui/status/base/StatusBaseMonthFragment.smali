.class public abstract Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;
.super Lcom/sma/smartv3/ui/status/base/BaseDetailsMonthFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/sma/smartv3/ui/status/base/BaseDetailsMonthFragment<",
        "TT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStatusBaseMonthFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatusBaseMonthFragment.kt\ncom/sma/smartv3/ui/status/base/StatusBaseMonthFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n1869#2,2:158\n*S KotlinDebug\n*F\n+ 1 StatusBaseMonthFragment.kt\ncom/sma/smartv3/ui/status/base/StatusBaseMonthFragment\n*L\n145#1:158,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nStatusBaseMonthFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatusBaseMonthFragment.kt\ncom/sma/smartv3/ui/status/base/StatusBaseMonthFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n1869#2,2:158\n*S KotlinDebug\n*F\n+ 1 StatusBaseMonthFragment.kt\ncom/sma/smartv3/ui/status/base/StatusBaseMonthFragment\n*L\n145#1:158,2\n*E\n"
    }
.end annotation


# instance fields
.field private axisMinimum:F

.field private final barChart$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private highlight:F

.field private maxHeight:F

.field private final monthData:Ljava/util/LinkedHashMap;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Ljava/util/ArrayList<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public monthDays:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final oneLl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final oneTV$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final oneUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final oneValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private setValue:Lcom/android/mltcode/paycertificationapi/XXX1X11;

.field private final twoTV$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final twoUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final twoValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final values:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailsMonthFragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/b95;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/b95;-><init>(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->barChart$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/c95;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/c95;-><init>(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->oneValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/d95;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/d95;-><init>(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->twoValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/e95;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/e95;-><init>(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->oneTV$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/f95;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/f95;-><init>(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->oneUnit$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/g95;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/g95;-><init>(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->twoTV$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/h95;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/h95;-><init>(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->twoUnit$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i95;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i95;-><init>(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->oneLl$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->values:Ljava/util/List;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->monthData:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->oneUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->twoTV_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->twoValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->oneValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->oneLl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->twoUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->oneTV_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method private static final barChart_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Lcom/sma/smartv3/view/CustomBarChartView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0108

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/CustomBarChartView;

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Lcom/sma/smartv3/view/CustomBarChartView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->barChart_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object p0

    return-object p0
.end method

.method private static final oneLl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a08bf

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final oneTV_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a08c1

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final oneUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a08c2

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final oneValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a08c3

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final twoTV_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a18d1

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final twoUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a18d2

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final twoValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a18d3

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method


# virtual methods
.method public final clearCache(J)V
    .locals 7

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->monthData:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getMonthDays()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v1, v0, :cond_0

    :goto_0
    iget-object v2, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->monthData:Ljava/util/LinkedHashMap;

    const v3, 0x15180

    mul-int/2addr v3, v1

    int-to-long v3, v3

    const-wide/16 v5, 0x3e8

    mul-long/2addr v3, v5

    add-long/2addr v3, p1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eq v1, v0, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public filterData(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+TT;>;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->values:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final getAxisMinimum()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->axisMinimum:F

    return v0
.end method

.method public final getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->barChart$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/CustomBarChartView;

    return-object v0
.end method

.method public final getHighlight()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->highlight:F

    return v0
.end method

.method public final getMaxHeight()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->maxHeight:F

    return v0
.end method

.method public final getMonthData()Ljava/util/LinkedHashMap;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Ljava/util/ArrayList<",
            "TT;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->monthData:Ljava/util/LinkedHashMap;

    return-object v0
.end method

.method public final getMonthDays()Ljava/util/List;
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

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->monthDays:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "monthDays"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getOneLl()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->oneLl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public final getOneTV()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->oneTV$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getOneUnit()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->oneUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getOneValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->oneValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public final getTwoTV()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->twoTV$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getTwoUnit()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->twoUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getTwoValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->twoValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public final getValues()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->values:Ljava/util/List;

    return-object v0
.end method

.method public initView()V
    .locals 8
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getMCalendar()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XiOIO(JLcom/sma/smartv3/util/DateTimeFormat;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->setMonthDays(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getTvCurrent()Landroid/widget/TextView;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iiiO()Ljava/text/SimpleDateFormat;

    move-result-object v1

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    const-string v1, "<get-barChart>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1(Lcom/github/mikephil/charting/charts/BarChart;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v3

    const-string v0, "getAxisLeft(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v4

    const-string v0, "getAxisRight(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget v5, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->maxHeight:F

    iget v6, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->axisMinimum:F

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f06024d

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual/range {v2 .. v7}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIX0iXi(Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/components/YAxis;FFI)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/BarChart;->setDrawValueAboveBar(Z)V

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->setScaleEnabled(Z)V

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getDescription()Lcom/android/mltcode/paycertificationapi/IOOI00X0I;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "getContext(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1, v3}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIi0(Lcom/github/mikephil/charting/components/XAxis;ZLandroid/content/Context;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->IXOIIIO(F)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getMonthDays()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v1, v1, 0x1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/android/mltcode/paycertificationapi/q4;

    invoke-direct {v1, v2}, Lcom/android/mltcode/paycertificationapi/q4;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Oi(Lcom/android/mltcode/paycertificationapi/he6;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->setChartRenderer()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment$OXO1;-><init>(Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;)V

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/Chart;->setOnChartValueSelectedListener(Lcom/android/mltcode/paycertificationapi/uf1;)V

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment;->initView()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e9c

    return v0
.end method

.method public final setAxisMinimum(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->axisMinimum:F

    return-void
.end method

.method public setChartRenderer()V
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->getAnimator()Lcom/android/mltcode/paycertificationapi/X1i1iOX;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v3

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/Chart;->getViewPortHandler()Lcom/android/mltcode/paycertificationapi/jh6;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;-><init>(Lcom/android/mltcode/paycertificationapi/IXi0IO;Lcom/android/mltcode/paycertificationapi/X1i1iOX;Lcom/android/mltcode/paycertificationapi/jh6;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f06024d

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iOOX010X(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/github/mikephil/charting/charts/Chart;->setRenderer(Lcom/android/mltcode/paycertificationapi/i0OX00;)V

    return-void
.end method

.method public abstract setColor(Lcom/android/mltcode/paycertificationapi/XXX1X11;)V
    .param p1    # Lcom/android/mltcode/paycertificationapi/XXX1X11;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
.end method

.method public abstract setDataLabel()Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end method

.method public final setHighlight(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->highlight:F

    return-void
.end method

.method public final setMaxHeight(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->maxHeight:F

    return-void
.end method

.method public final setMonthDays(Ljava/util/List;)V
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

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->monthDays:Ljava/util/List;

    return-void
.end method

.method public final updateChartData(Ljava/util/List;)V
    .locals 5
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;)V"
        }
    .end annotation

    const-string v0, "values"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "setValue"

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XOi0;->XXI()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/XOi0;->OIX0iXi(I)Lcom/android/mltcode/paycertificationapi/IXIiiOXi;

    move-result-object v0

    const-string v4, "null cannot be cast to non-null type com.github.mikephil.charting.data.BarDataSet"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/android/mltcode/paycertificationapi/XXX1X11;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->setValue:Lcom/android/mltcode/paycertificationapi/XXX1X11;

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0, p1}, Lcom/github/mikephil/charting/data/DataSet;->IOX1(Ljava/util/List;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->setValue:Lcom/android/mltcode/paycertificationapi/XXX1X11;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->i0X1iIO()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XOi0;->iX()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->X0i1O()V

    goto :goto_2

    :cond_2
    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXX1X11;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->setDataLabel()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, p1, v4}, Lcom/android/mltcode/paycertificationapi/XXX1X11;-><init>(Ljava/util/List;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->setValue:Lcom/android/mltcode/paycertificationapi/XXX1X11;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->setColor(Lcom/android/mltcode/paycertificationapi/XXX1X11;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->setValue:Lcom/android/mltcode/paycertificationapi/XXX1X11;

    if-nez v4, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    move-object v1, v4

    :goto_1
    const/4 v2, 0x1

    new-array v2, v2, [Lcom/android/mltcode/paycertificationapi/XIXi1iX00;

    aput-object v1, v2, v3

    invoke-direct {v0, v2}, Lcom/android/mltcode/paycertificationapi/IXIX1X1;-><init>([Lcom/android/mltcode/paycertificationapi/XIXi1iX00;)V

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/XOi0;->iI(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/github/mikephil/charting/charts/Chart;->setData(Lcom/android/mltcode/paycertificationapi/XOi0;)V

    :goto_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/Chart;->I0IIOi(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    iput v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->highlight:F

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/data/BarEntry;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/data/BarEntry;->O00()F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-lez v1, :cond_4

    invoke-virtual {v0}, Lcom/github/mikephil/charting/data/Entry;->OIX0iXi()F

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->highlight:F

    goto :goto_3

    :cond_5
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object p1

    iget v0, p0, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->highlight:F

    invoke-virtual {p1, v0, v3}, Lcom/github/mikephil/charting/charts/Chart;->II1Xi0(FI)V

    return-void
.end method

.method public abstract updateItemData(Lcom/github/mikephil/charting/data/Entry;)V
    .param p1    # Lcom/github/mikephil/charting/data/Entry;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
.end method
