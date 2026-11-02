.class public final Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;
.super Lcom/sma/smartv3/ui/status/base/BaseDetailsWeekFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sma/smartv3/ui/status/base/BaseDetailsWeekFragment<",
        "Lcom/sma/smartv3/db/entity/BloodGlucose;",
        ">;"
    }
.end annotation


# instance fields
.field private final avgValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final bloodGlucoseDayDataList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/BloodGlucoseDayData;",
            ">;"
        }
    .end annotation
.end field

.field private final lineChart$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBloodGlucoseDao:Lcom/sma/smartv3/db/dao/BloodGlucoseDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final maxValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final minValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final monitorRetVal$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public setValue:Lcom/github/mikephil/charting/data/LineDataSet;

.field private final values:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/Entry;",
            ">;"
        }
    .end annotation
.end field

.field private final weekData:Ljava/util/LinkedHashMap;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/db/entity/BloodGlucose;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailsWeekFragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XiOO0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XiOO0;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->lineChart$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/II0Oi1i0i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/II0Oi1i0i;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->minValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OI1i1X000;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OI1i1X000;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->maxValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XX1I0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XX1I0;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->avgValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I01XiiI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I01XiiI;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->monitorRetVal$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->values:Ljava/util/List;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->weekData:Ljava/util/LinkedHashMap;

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->bloodGlucoseDao()Lcom/sma/smartv3/db/dao/BloodGlucoseDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->mBloodGlucoseDao:Lcom/sma/smartv3/db/dao/BloodGlucoseDao;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->bloodGlucoseDayDataList:Ljava/util/List;

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->maxValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->avgValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->monitorRetVal_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;)Lcom/github/mikephil/charting/charts/LineChart;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->lineChart_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;)Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->minValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method private static final avgValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a00f4

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private final getAvgValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->avgValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getLineChart()Lcom/github/mikephil/charting/charts/LineChart;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->lineChart$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/charts/LineChart;

    return-object v0
.end method

.method private final getMaxValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->maxValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getMinValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->minValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getMonitorRetVal()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->monitorRetVal$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private static final lineChart_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;)Lcom/github/mikephil/charting/charts/LineChart;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a06a8

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/github/mikephil/charting/charts/LineChart;

    return-object p0
.end method

.method private static final maxValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0768

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final minValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a083a

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final monitorRetVal_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a083e

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method


# virtual methods
.method public final clearCache(J)V
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->weekData:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    const/4 v0, 0x1

    :goto_0
    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->weekData:Ljava/util/LinkedHashMap;

    const v2, 0x15180

    mul-int/2addr v2, v0

    int-to-long v2, v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    add-long/2addr v2, p1

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
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
            "Lcom/sma/smartv3/db/entity/BloodGlucose;",
            ">;)V"
        }
    .end annotation

    const-string v0, "bloodGlucoses"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->values:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    sget-object v1, Lcom/sma/smartv3/model/BloodGlucoseDataParse;->INSTANCE:Lcom/sma/smartv3/model/BloodGlucoseDataParse;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->weekData:Ljava/util/LinkedHashMap;

    iget-object v5, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->bloodGlucoseDayDataList:Ljava/util/List;

    iget-object v6, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->values:Ljava/util/List;

    move-object v3, p1

    invoke-virtual/range {v1 .. v6}, Lcom/sma/smartv3/model/BloodGlucoseDataParse;->filterDayData(Landroid/content/Context;Ljava/util/List;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getMinValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->i010I(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getMaxValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p1

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->i010I(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getAvgValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p1

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->i010I(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getNowValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p1

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->i010I(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getMonitorRetVal()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    const-string v0, "--"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "format(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->values:Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->updateChartData(Ljava/util/List;)V

    return-void
.end method

.method public final getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->setValue:Lcom/github/mikephil/charting/data/LineDataSet;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "setValue"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public initView()V
    .locals 7

    sget-object v0, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v1

    const-string v2, "<get-lineChart>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->XIi00iiXO(Lcom/github/mikephil/charting/charts/LineChart;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v1

    const-string v2, "getAxisLeft(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

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

    const/high16 v3, 0x42a00000    # 80.0f

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIX0iXi(Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/components/YAxis;FFI)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getMCalendar()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->IXXOO(J)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/status/base/BaseDetailsWeekFragment;->setWeekDay(Ljava/util/List;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIi0(Lcom/github/mikephil/charting/components/XAxis;ZLandroid/content/Context;)V

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->IO0II0i(Z)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->IXOIIIO(F)V

    const/high16 v0, -0x40800000    # -1.0f

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->i0X000X0O(F)V

    const/high16 v0, 0x40e00000    # 7.0f

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOiXi11II(F)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailsWeekFragment;->getWeekDay()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/android/mltcode/paycertificationapi/by6;

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/by6;->IiI10X()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/android/mltcode/paycertificationapi/q4;

    invoke-direct {v2, v0}, Lcom/android/mltcode/paycertificationapi/q4;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Oi(Lcom/android/mltcode/paycertificationapi/he6;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getDescription()Lcom/android/mltcode/paycertificationapi/IOOI00X0I;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v0, v3}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->setScaleEnabled(Z)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O11X1i1;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v2

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->getAnimator()Lcom/android/mltcode/paycertificationapi/X1i1iOX;

    move-result-object v2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v4

    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/Chart;->getViewPortHandler()Lcom/android/mltcode/paycertificationapi/jh6;

    move-result-object v4

    invoke-direct {v0, v1, v2, v4}, Lcom/android/mltcode/paycertificationapi/O11X1i1;-><init>(Lcom/android/mltcode/paycertificationapi/eo;Lcom/android/mltcode/paycertificationapi/X1i1iOX;Lcom/android/mltcode/paycertificationapi/jh6;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1, v6}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/O11X1i1;->i010I(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/github/mikephil/charting/charts/Chart;->setRenderer(Lcom/android/mltcode/paycertificationapi/i0OX00;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment$OXO1;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;)V

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/Chart;->setOnChartValueSelectedListener(Lcom/android/mltcode/paycertificationapi/uf1;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment$XIi00iiXO;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment$XIi00iiXO;-><init>()V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Oi(Lcom/android/mltcode/paycertificationapi/he6;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getTvCurrent()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getMCalendar()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailsWeekFragment;->getMTimePeriod()Lcom/sma/smartv3/util/TimePeriod;

    move-result-object v2

    invoke-static {v1, v3, v2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OII(Ljava/util/Calendar;ILcom/sma/smartv3/util/TimePeriod;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0704

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v0

    const v2, 0x7f0a0708

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a070b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment;->initView()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e93

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
            "Lcom/sma/smartv3/db/entity/BloodGlucose;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->filterData(Ljava/util/List;)V

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
            "Lcom/sma/smartv3/db/entity/BloodGlucose;",
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

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->IXXOO(J)Ljava/util/List;

    move-result-object p3

    invoke-virtual {p0, p3}, Lcom/sma/smartv3/ui/status/base/BaseDetailsWeekFragment;->setWeekDay(Ljava/util/List;)V

    aget-wide v0, p1, p2

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->clearCache(J)V

    iget-object p3, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->mBloodGlucoseDao:Lcom/sma/smartv3/db/dao/BloodGlucoseDao;

    aget-wide v0, p1, p2

    const/4 p2, 0x1

    aget-wide v2, p1, p2

    invoke-interface {p3, v0, v1, v2, v3}, Lcom/sma/smartv3/db/dao/BloodGlucoseDao;->getListDesc(JJ)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final setDataLabel()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "BloodOxyGen week Data"

    return-object v0
.end method

.method public final setSetValue(Lcom/github/mikephil/charting/data/LineDataSet;)V
    .locals 1
    .param p1    # Lcom/github/mikephil/charting/data/LineDataSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->setValue:Lcom/github/mikephil/charting/data/LineDataSet;

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
            "Lcom/github/mikephil/charting/data/Entry;",
            ">;)V"
        }
    .end annotation

    const-string v0, "values"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/co;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XOi0;->XXI()I

    move-result v0

    if-lez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/co;

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/XOi0;->OIX0iXi(I)Lcom/android/mltcode/paycertificationapi/IXIiiOXi;

    move-result-object v0

    const-string v3, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/github/mikephil/charting/data/LineDataSet;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->setSetValue(Lcom/github/mikephil/charting/data/LineDataSet;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/github/mikephil/charting/data/DataSet;->IOX1(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->i0X1iIO()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/co;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XOi0;->iX()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->X0i1O()V

    goto/16 :goto_0

    :cond_0
    new-instance v0, Lcom/github/mikephil/charting/data/LineDataSet;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->setDataLabel()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, p1, v3}, Lcom/github/mikephil/charting/data/LineDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->setSetValue(Lcom/github/mikephil/charting/data/LineDataSet;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v3

    const v4, 0x7f060080

    invoke-static {v3, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->II1(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-static {v3, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/github/mikephil/charting/data/LineDataSet;->I00(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;

    move-result-object v0

    const/high16 v3, 0x40000000    # 2.0f

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/ho;->I1XII0X(F)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;

    move-result-object v0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v0, v3}, Lcom/github/mikephil/charting/data/LineDataSet;->iXOII(F)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/github/mikephil/charting/data/LineDataSet;->IOI0i0I(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->XXI(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/ho;->O1iXiI(Z)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v0

    const v3, 0x7f0816d1

    invoke-static {v0, v3}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const-string v3, "null cannot be cast to non-null type android.graphics.drawable.Drawable"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/android/mltcode/paycertificationapi/ho;->I0i1OXiI(Landroid/graphics/drawable/Drawable;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/co;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;

    move-result-object v3

    new-array v4, v1, [Lcom/android/mltcode/paycertificationapi/IiXO1XOi;

    aput-object v3, v4, v2

    invoke-direct {v0, v4}, Lcom/android/mltcode/paycertificationapi/co;-><init>([Lcom/android/mltcode/paycertificationapi/IiXO1XOi;)V

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/XOi0;->iI(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/github/mikephil/charting/charts/Chart;->setData(Lcom/android/mltcode/paycertificationapi/XOi0;)V

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    const/16 v3, 0x3e8

    invoke-virtual {v0, v3}, Lcom/github/mikephil/charting/charts/Chart;->I0IIOi(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/github/mikephil/charting/data/Entry;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/Entry;->OIX0iXi()F

    move-result p1

    :goto_1
    invoke-virtual {v0, p1, v2}, Lcom/github/mikephil/charting/charts/Chart;->II1Xi0(FI)V

    return-void
.end method

.method public final updateItemData(Lcom/github/mikephil/charting/data/Entry;)V
    .locals 2
    .param p1    # Lcom/github/mikephil/charting/data/Entry;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->bloodGlucoseDayDataList:Ljava/util/List;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/Entry;->OIX0iXi()F

    move-result p1

    float-to-int p1, p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/model/BloodGlucoseDayData;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getMinValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BloodGlucoseDayData;->getMin()I

    move-result v1

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->i010I(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getMaxValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BloodGlucoseDayData;->getMax()I

    move-result v1

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->i010I(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getAvgValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BloodGlucoseDayData;->getAvg()I

    move-result v1

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->i010I(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getNowValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BloodGlucoseDayData;->getAvg()I

    move-result v1

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->i010I(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodGlucoseWeekFragment;->getMonitorRetVal()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BloodGlucoseDayData;->getStatus()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
