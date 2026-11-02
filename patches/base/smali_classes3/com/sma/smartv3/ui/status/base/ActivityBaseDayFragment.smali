.class public Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;
.super Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment<",
        "Lcom/sma/smartv3/db/entity/Activity;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nActivityBaseDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityBaseDayFragment.kt\ncom/sma/smartv3/ui/status/base/ActivityBaseDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1869#2,2:191\n*S KotlinDebug\n*F\n+ 1 ActivityBaseDayFragment.kt\ncom/sma/smartv3/ui/status/base/ActivityBaseDayFragment\n*L\n166#1:191,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nActivityBaseDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityBaseDayFragment.kt\ncom/sma/smartv3/ui/status/base/ActivityBaseDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1869#2,2:191\n*S KotlinDebug\n*F\n+ 1 ActivityBaseDayFragment.kt\ncom/sma/smartv3/ui/status/base/ActivityBaseDayFragment\n*L\n166#1:191,2\n*E\n"
    }
.end annotation


# instance fields
.field private final barChart$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private filterData:Ljava/util/LinkedHashMap;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;>;"
        }
    .end annotation
.end field

.field private highlight:F

.field private final mActivityDao:Lcom/sma/smartv3/db/dao/ActivityDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final oneTV$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final oneValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public setValue:Lcom/android/mltcode/paycertificationapi/XXX1X11;

.field private final totalUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X01I1OX1i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X01I1OX1i;-><init>(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->barChart$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ii0I0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ii0I0;-><init>(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->oneValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0i0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0i0;-><init>(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->oneTV$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iiO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iiO;-><init>(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->totalUnit$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXi1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iXi1;-><init>(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->twoValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iXX;-><init>(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->twoTV$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IIXXi1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IIXXi1;-><init>(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->twoUnit$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->values:Ljava/util/List;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->filterData:Ljava/util/LinkedHashMap;

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->activityDao()Lcom/sma/smartv3/db/dao/ActivityDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->mActivityDao:Lcom/sma/smartv3/db/dao/ActivityDao;

    const/high16 v0, 0x40400000    # 3.0f

    iput v0, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->highlight:F

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->twoValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)Lcom/github/mikephil/charting/charts/BarChart;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->barChart_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->twoUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->oneValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->twoTV_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->oneTV_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->totalUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method private static final barChart_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)Lcom/github/mikephil/charting/charts/BarChart;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0108

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/github/mikephil/charting/charts/BarChart;

    return-object p0
.end method

.method private final getBarChart()Lcom/github/mikephil/charting/charts/BarChart;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->barChart$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/charts/BarChart;

    return-object v0
.end method

.method private static final oneTV_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a08c1

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final oneValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a08c3

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final totalUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a08c2

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final twoTV_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a18d1

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final twoUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a18d2

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final twoValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a18d3

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private final updateChartData()V
    .locals 7

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->values:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/github/mikephil/charting/data/BarEntry;

    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/BarEntry;->O00()F

    move-result v5

    cmpg-float v5, v3, v5

    if-gez v5, :cond_0

    invoke-virtual {v4}, Lcom/github/mikephil/charting/data/BarEntry;->O00()F

    move-result v3

    goto :goto_0

    :cond_1
    sget-object v1, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v4

    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v4

    const-string v5, "getAxisLeft(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v5

    invoke-virtual {v5}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v5

    const-string v6, "getAxisRight(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v4, v5, v3}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->IiI10X(Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/components/YAxis;F)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/XOi0;->XXI()I

    move-result v1

    if-lez v1, :cond_2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/XOi0;->OIX0iXi(I)Lcom/android/mltcode/paycertificationapi/IXIiiOXi;

    move-result-object v1

    const-string v3, "null cannot be cast to non-null type com.github.mikephil.charting.data.BarDataSet"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/android/mltcode/paycertificationapi/XXX1X11;

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->setSetValue(Lcom/android/mltcode/paycertificationapi/XXX1X11;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getSetValue()Lcom/android/mltcode/paycertificationapi/XXX1X11;

    move-result-object v1

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->values:Ljava/util/List;

    invoke-virtual {v1, v3}, Lcom/github/mikephil/charting/data/DataSet;->IOX1(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getSetValue()Lcom/android/mltcode/paycertificationapi/XXX1X11;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->i0X1iIO()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/XOi0;->iX()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->X0i1O()V

    goto :goto_1

    :cond_2
    new-instance v1, Lcom/android/mltcode/paycertificationapi/XXX1X11;

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->values:Ljava/util/List;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->setDataLabel()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lcom/android/mltcode/paycertificationapi/XXX1X11;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->setSetValue(Lcom/android/mltcode/paycertificationapi/XXX1X11;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getSetValue()Lcom/android/mltcode/paycertificationapi/XXX1X11;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->setColor(Lcom/android/mltcode/paycertificationapi/XXX1X11;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getSetValue()Lcom/android/mltcode/paycertificationapi/XXX1X11;

    move-result-object v3

    const/4 v4, 0x1

    new-array v4, v4, [Lcom/android/mltcode/paycertificationapi/XIXi1iX00;

    aput-object v3, v4, v0

    invoke-direct {v1, v4}, Lcom/android/mltcode/paycertificationapi/IXIX1X1;-><init>([Lcom/android/mltcode/paycertificationapi/XIXi1iX00;)V

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/XOi0;->iI(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/github/mikephil/charting/charts/Chart;->setData(Lcom/android/mltcode/paycertificationapi/XOi0;)V

    :goto_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    const/16 v3, 0x3e8

    invoke-virtual {v1, v3}, Lcom/github/mikephil/charting/charts/Chart;->I0IIOi(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->values:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/github/mikephil/charting/data/BarEntry;

    invoke-virtual {v3}, Lcom/github/mikephil/charting/data/BarEntry;->O00()F

    move-result v4

    cmpl-float v4, v4, v2

    if-lez v4, :cond_3

    invoke-virtual {v3}, Lcom/github/mikephil/charting/data/Entry;->OIX0iXi()F

    move-result v3

    iput v3, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->highlight:F

    goto :goto_2

    :cond_4
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    iget v2, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->highlight:F

    invoke-virtual {v1, v2, v0}, Lcom/github/mikephil/charting/charts/Chart;->II1Xi0(FI)V

    return-void
.end method


# virtual methods
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
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->values:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final getFilterData()Ljava/util/LinkedHashMap;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->filterData:Ljava/util/LinkedHashMap;

    return-object v0
.end method

.method public final getHighlight()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->highlight:F

    return v0
.end method

.method public final getOneTV()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->oneTV$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getOneValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->oneValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public final getSetValue()Lcom/android/mltcode/paycertificationapi/XXX1X11;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->setValue:Lcom/android/mltcode/paycertificationapi/XXX1X11;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "setValue"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTotalUnit()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->totalUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getTwoTV()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->twoTV$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getTwoUnit()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->twoUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getTwoValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->twoValue$delegate:Lkotlin/Lazy;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->values:Ljava/util/List;

    return-object v0
.end method

.method public initView()V
    .locals 15

    sget-object v0, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    const-string v2, "<get-barChart>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1(Lcom/github/mikephil/charting/charts/BarChart;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v1

    const-string v2, "getAxisLeft(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v2

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v2

    const-string v3, "getAxisRight(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v3

    const v6, 0x7f06024d

    invoke-static {v3, v6}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v5

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIX0iXi(Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/components/YAxis;FFI)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/github/mikephil/charting/charts/BarChart;->setDrawValueAboveBar(Z)V

    invoke-virtual {v1, v2}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->setScaleEnabled(Z)V

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getDescription()Lcom/android/mltcode/paycertificationapi/IOOI00X0I;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "getContext(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIi0(Lcom/github/mikephil/charting/components/XAxis;ZLandroid/content/Context;)V

    sget-object v0, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    const/4 v3, 0x5

    const/4 v4, 0x0

    invoke-static {v4, v0, v2, v3, v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iOOX010X(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;IILjava/lang/Object;)[J

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->setRange([J)V

    const/high16 v0, 0x40800000    # 4.0f

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->IXOIIIO(F)V

    const/high16 v0, -0x40800000    # -1.0f

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->i0X000X0O(F)V

    const/high16 v0, 0x41c80000    # 25.0f

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOiXi11II(F)V

    const/4 v0, 0x1

    invoke-static {v2, v0, v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XXiIiX10(ZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v3

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    move v7, v2

    :goto_0
    const/16 v8, 0x19

    if-ge v7, v8, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getRange()[J

    move-result-object v8

    aget-wide v9, v8, v2

    mul-int/lit16 v8, v7, 0xe10

    int-to-long v11, v8

    const-wide/16 v13, 0x3e8

    mul-long/2addr v11, v13

    add-long/2addr v9, v11

    invoke-static {v9, v10, v3}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v9

    const/16 v10, 0xc

    if-le v9, v10, :cond_0

    const-string v9, "0"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    const-string v8, "24"

    :cond_0
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    new-instance v3, Lcom/android/mltcode/paycertificationapi/q4;

    invoke-direct {v3, v5}, Lcom/android/mltcode/paycertificationapi/q4;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Oi(Lcom/android/mltcode/paycertificationapi/he6;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v5

    invoke-virtual {v5}, Lcom/github/mikephil/charting/charts/Chart;->getAnimator()Lcom/android/mltcode/paycertificationapi/X1i1iOX;

    move-result-object v5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v7

    invoke-virtual {v7}, Lcom/github/mikephil/charting/charts/Chart;->getViewPortHandler()Lcom/android/mltcode/paycertificationapi/jh6;

    move-result-object v7

    invoke-direct {v1, v3, v5, v7}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;-><init>(Lcom/android/mltcode/paycertificationapi/IXi0IO;Lcom/android/mltcode/paycertificationapi/X1i1iOX;Lcom/android/mltcode/paycertificationapi/jh6;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-static {v3, v6}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iOOX010X(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/github/mikephil/charting/charts/Chart;->setRenderer(Lcom/android/mltcode/paycertificationapi/i0OX00;)V

    invoke-static {v2, v0, v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XO0X10iO(ZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment$OXO1;

    invoke-direct {v2, p0, v0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment$OXO1;-><init>(Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;Ljava/text/SimpleDateFormat;)V

    invoke-virtual {v1, v2}, Lcom/github/mikephil/charting/charts/Chart;->setOnChartValueSelectedListener(Lcom/android/mltcode/paycertificationapi/uf1;)V

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment;->initView()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e96

    return v0
.end method

.method public onDataChange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->filterData(Ljava/util/List;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->updateChartData()V

    return-void
.end method

.method public onTimePeriodChange(Ljava/util/Calendar;ILcom/sma/smartv3/util/TimePeriod;)Ljava/util/List;
    .locals 4
    .param p1    # Ljava/util/Calendar;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/util/TimePeriod;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Calendar;",
            "I",
            "Lcom/sma/smartv3/util/TimePeriod;",
            ")",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;"
        }
    .end annotation

    const-string v0, "calendar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timePeriod"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3, p2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->I1(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;I)[J

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->setRange([J)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->filterData:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->clear()V

    const/4 p1, 0x1

    move p2, p1

    :goto_0
    const/16 p3, 0x19

    const/4 v0, 0x0

    if-ge p2, p3, :cond_0

    iget-object p3, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->filterData:Ljava/util/LinkedHashMap;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getRange()[J

    move-result-object v1

    aget-wide v0, v1, v0

    const v2, 0x36ee80

    mul-int/2addr v2, p2

    int-to-long v2, v2

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->mActivityDao:Lcom/sma/smartv3/db/dao/ActivityDao;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getRange()[J

    move-result-object p3

    aget-wide v0, p3, v0

    const/16 p3, 0x3e8

    int-to-long v2, p3

    add-long/2addr v0, v2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getRange()[J

    move-result-object p3

    aget-wide v2, p3, p1

    invoke-interface {p2, v0, v1, v2, v3}, Lcom/sma/smartv3/db/dao/ActivityDao;->getListASC(JJ)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public setColor(Lcom/android/mltcode/paycertificationapi/XXX1X11;)V
    .locals 1
    .param p1    # Lcom/android/mltcode/paycertificationapi/XXX1X11;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public setDataLabel()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, ""

    return-object v0
.end method

.method public final setFilterData(Ljava/util/LinkedHashMap;)V
    .locals 1
    .param p1    # Ljava/util/LinkedHashMap;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->filterData:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public final setHighlight(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->highlight:F

    return-void
.end method

.method public final setSetValue(Lcom/android/mltcode/paycertificationapi/XXX1X11;)V
    .locals 1
    .param p1    # Lcom/android/mltcode/paycertificationapi/XXX1X11;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/base/ActivityBaseDayFragment;->setValue:Lcom/android/mltcode/paycertificationapi/XXX1X11;

    return-void
.end method

.method public updateItemData(Lcom/github/mikephil/charting/data/Entry;)V
    .locals 1
    .param p1    # Lcom/github/mikephil/charting/data/Entry;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
