.class public final Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;
.super Lcom/sma/smartv3/ui/status/base/BaseDetailsMonthFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sma/smartv3/ui/status/base/BaseDetailsMonthFragment<",
        "Lcom/sma/smartv3/db/entity/BloodGlucose2;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBloodGlucose2MonthFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucose2MonthFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,204:1\n1869#2,2:205\n*S KotlinDebug\n*F\n+ 1 BloodGlucose2MonthFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment\n*L\n192#1:205,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBloodGlucose2MonthFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucose2MonthFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,204:1\n1869#2,2:205\n*S KotlinDebug\n*F\n+ 1 BloodGlucose2MonthFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment\n*L\n192#1:205,2\n*E\n"
    }
.end annotation


# instance fields
.field private axisMinimum:F

.field private final barChart$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final bloodGlucoseDayDataList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/BloodGlucose2DayData;",
            ">;"
        }
    .end annotation
.end field

.field private highlight:F

.field private infoBarChartRender:Lcom/android/mltcode/paycertificationapi/Oi01X10i;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mBloodGlucose2Dao:Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private maxHeight:F

.field private final monthData:Ljava/util/LinkedHashMap;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/db/entity/BloodGlucose2;",
            ">;>;"
        }
    .end annotation
.end field

.field private monthDays:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final segmentedbar$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private setValue:Lcom/android/mltcode/paycertificationapi/XXX1X11;

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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0111O;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0111O;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->barChart$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OXXO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OXXO;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->segmentedbar$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->values:Ljava/util/List;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->monthData:Ljava/util/LinkedHashMap;

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->bloodGlucose2Dao()Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->mBloodGlucose2Dao:Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->bloodGlucoseDayDataList:Ljava/util/List;

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;)Lcom/sma/smartv3/view/CustomBarChartView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->barChart_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;)Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;)Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->segmentedbar_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;)Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->initView$lambda$2(Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;)V

    return-void
.end method

.method public static final synthetic access$getMonthDays$p(Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->monthDays:Ljava/util/List;

    return-object p0
.end method

.method private static final barChart_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;)Lcom/sma/smartv3/view/CustomBarChartView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0108

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/CustomBarChartView;

    return-object p0
.end method

.method private final getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->barChart$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/CustomBarChartView;

    return-object v0
.end method

.method private final getSegmentedbar()Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->segmentedbar$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;

    return-object v0
.end method

.method private static final initView$lambda$2(Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;)V
    .locals 5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    iget v1, v0, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->O1O:F

    iget v0, v0, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOO1ii1:F

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->infoBarChartRender:Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2, v0}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->OiIIX101O(F)F

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    iget-object v2, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->infoBarChartRender:Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    if-eqz v2, :cond_1

    invoke-virtual {v2, v1}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->OiIIX101O(F)F

    move-result v3

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getViewPortHandler()Lcom/android/mltcode/paycertificationapi/jh6;

    move-result-object v1

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/jh6;->OIX0iXi()F

    move-result v1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v2

    iget v2, v2, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOO1ii1:F

    div-float/2addr v1, v2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v2

    check-cast v2, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/IXIX1X1;->iXiX011()F

    move-result v2

    mul-float/2addr v1, v2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getSegmentedbar()Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    const-string v4, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/widget/LinearLayout$LayoutParams;

    sub-float/2addr v3, v0

    float-to-int v3, v3

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->height:I

    float-to-int v0, v0

    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    float-to-int v0, v1

    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->width:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getSegmentedbar()Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;

    move-result-object p0

    invoke-virtual {p0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private static final segmentedbar_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;)Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a11

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;

    return-object p0
.end method


# virtual methods
.method public final clearCache(J)V
    .locals 7

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->monthData:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->monthDays:Ljava/util/List;

    if-nez v0, :cond_0

    const-string v0, "monthDays"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v1, v0, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->monthData:Ljava/util/LinkedHashMap;

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

    if-eq v1, v0, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final filterData(Ljava/util/List;)V
    .locals 7
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/BloodGlucose2;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->values:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    sget-object v1, Lcom/sma/smartv3/model/BloodGlucose2DataParse;->INSTANCE:Lcom/sma/smartv3/model/BloodGlucose2DataParse;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->monthData:Ljava/util/LinkedHashMap;

    iget-object v5, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->bloodGlucoseDayDataList:Ljava/util/List;

    iget-object v6, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->values:Ljava/util/List;

    move-object v3, p1

    invoke-virtual/range {v1 .. v6}, Lcom/sma/smartv3/model/BloodGlucose2DataParse;->filterDayData(Landroid/content/Context;Ljava/util/List;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->values:Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->updateChartData(Ljava/util/List;)V

    return-void
.end method

.method public final getInfoBarChartRender()Lcom/android/mltcode/paycertificationapi/Oi01X10i;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->infoBarChartRender:Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    return-object v0
.end method

.method public initView()V
    .locals 10

    const/high16 v0, 0x42b40000    # 90.0f

    iput v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->maxHeight:F

    const/high16 v0, 0x41f00000    # 30.0f

    iput v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->axisMinimum:F

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getMCalendar()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XiOIO(JLcom/sma/smartv3/util/DateTimeFormat;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->monthDays:Ljava/util/List;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getTvCurrent()Landroid/widget/TextView;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iiiO()Ljava/text/SimpleDateFormat;

    move-result-object v1

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v4, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    const-string v1, "<get-barChart>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1(Lcom/github/mikephil/charting/charts/BarChart;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v5

    const-string v0, "getAxisLeft(...)"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v6

    const-string v0, "getAxisRight(...)"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget v7, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->maxHeight:F

    iget v8, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->axisMinimum:F

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f06024d

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v9

    invoke-virtual/range {v4 .. v9}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIX0iXi(Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/components/YAxis;FFI)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/BarChart;->setDrawValueAboveBar(Z)V

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->setScaleEnabled(Z)V

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getDescription()Lcom/android/mltcode/paycertificationapi/IOOI00X0I;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v5, "getContext(...)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIi0(Lcom/github/mikephil/charting/components/XAxis;ZLandroid/content/Context;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->IXOIIIO(F)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->monthDays:Ljava/util/List;

    if-nez v4, :cond_0

    const-string v4, "monthDays"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    add-int/lit8 v1, v1, 0x1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v1, Lcom/android/mltcode/paycertificationapi/q4;

    invoke-direct {v1, v2}, Lcom/android/mltcode/paycertificationapi/q4;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Oi(Lcom/android/mltcode/paycertificationapi/he6;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->setChartRenderer()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment$OXO1;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;)V

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/Chart;->setOnChartValueSelectedListener(Lcom/android/mltcode/paycertificationapi/uf1;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getSegmentedbar()Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;

    move-result-object v0

    invoke-static {}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseSegments()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView;->setSegments(Ljava/util/List;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iiiIXX1X0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/iiiIXX1X0;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment;->initView()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e90

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
            "Lcom/sma/smartv3/db/entity/BloodGlucose2;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->filterData(Ljava/util/List;)V

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
            "Lcom/sma/smartv3/db/entity/BloodGlucose2;",
            ">;"
        }
    .end annotation

    const-string v0, "calendar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timePeriod"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3, p2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->I1(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;I)[J

    move-result-object p1

    const/4 p2, 0x0

    aget-wide v0, p1, p2

    const/4 p3, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, p3, v2, p3}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XiOIO(JLcom/sma/smartv3/util/DateTimeFormat;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p3

    iput-object p3, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->monthDays:Ljava/util/List;

    aget-wide v0, p1, p2

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->clearCache(J)V

    iget-object p3, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->mBloodGlucose2Dao:Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;

    aget-wide v0, p1, p2

    const/4 p2, 0x1

    aget-wide v2, p1, p2

    invoke-interface {p3, v0, v1, v2, v3}, Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;->getListForDay(JJ)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final setChartRenderer()V
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->getAnimator()Lcom/android/mltcode/paycertificationapi/X1i1iOX;

    move-result-object v2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v3

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/Chart;->getViewPortHandler()Lcom/android/mltcode/paycertificationapi/jh6;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;-><init>(Lcom/android/mltcode/paycertificationapi/IXi0IO;Lcom/android/mltcode/paycertificationapi/X1i1iOX;Lcom/android/mltcode/paycertificationapi/jh6;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->infoBarChartRender:Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f06024d

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iOOX010X(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->infoBarChartRender:Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    if-eqz v0, :cond_0

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iIiiO(I)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->infoBarChartRender:Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/Chart;->setRenderer(Lcom/android/mltcode/paycertificationapi/i0OX00;)V

    return-void
.end method

.method public final setColor(Lcom/android/mltcode/paycertificationapi/XXX1X11;)V
    .locals 3
    .param p1    # Lcom/android/mltcode/paycertificationapi/XXX1X11;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0600b4

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->I011X(Ljava/util/List;)V

    return-void
.end method

.method public final setDataLabel()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "BloodGlucose month Data"

    return-object v0
.end method

.method public final setInfoBarChartRender(Lcom/android/mltcode/paycertificationapi/Oi01X10i;)V
    .locals 0
    .param p1    # Lcom/android/mltcode/paycertificationapi/Oi01X10i;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->infoBarChartRender:Lcom/android/mltcode/paycertificationapi/Oi01X10i;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "setValue"

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XOi0;->XXI()I

    move-result v0

    if-lez v0, :cond_2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/XOi0;->OIX0iXi(I)Lcom/android/mltcode/paycertificationapi/IXIiiOXi;

    move-result-object v0

    const-string v4, "null cannot be cast to non-null type com.github.mikephil.charting.data.BarDataSet"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/android/mltcode/paycertificationapi/XXX1X11;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->setValue:Lcom/android/mltcode/paycertificationapi/XXX1X11;

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0, p1}, Lcom/github/mikephil/charting/data/DataSet;->IOX1(Ljava/util/List;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->setValue:Lcom/android/mltcode/paycertificationapi/XXX1X11;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->i0X1iIO()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XOi0;->iX()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->X0i1O()V

    goto :goto_2

    :cond_2
    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXX1X11;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->setDataLabel()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, p1, v4}, Lcom/android/mltcode/paycertificationapi/XXX1X11;-><init>(Ljava/util/List;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->setValue:Lcom/android/mltcode/paycertificationapi/XXX1X11;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->setColor(Lcom/android/mltcode/paycertificationapi/XXX1X11;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->setValue:Lcom/android/mltcode/paycertificationapi/XXX1X11;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/github/mikephil/charting/charts/Chart;->setData(Lcom/android/mltcode/paycertificationapi/XOi0;)V

    :goto_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    iput v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->highlight:F

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

    iput v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->highlight:F

    goto :goto_3

    :cond_5
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object p1

    iget v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->highlight:F

    invoke-virtual {p1, v0, v3}, Lcom/github/mikephil/charting/charts/Chart;->II1Xi0(FI)V

    return-void
.end method

.method public final updateItemData(Lcom/github/mikephil/charting/data/Entry;)V
    .locals 3
    .param p1    # Lcom/github/mikephil/charting/data/Entry;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucose2MonthFragment;->bloodGlucoseDayDataList:Ljava/util/List;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/Entry;->OIX0iXi()F

    move-result p1

    float-to-int p1, p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/model/BloodGlucose2DayData;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getNowValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BloodGlucose2DayData;->getMin()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x41200000    # 10.0f

    div-float/2addr v1, v2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BloodGlucose2DayData;->getMax()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p1, v2

    invoke-static {v1, p1}, Lcom/sma/smartv3/util/UtilsKt;->II1Xi0(FF)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
