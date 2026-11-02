.class public final Lcom/sma/smartv3/ui/status/fragment/PressureWeekFragment;
.super Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment<",
        "Lcom/sma/smartv3/db/entity/Pressure;",
        ">;"
    }
.end annotation


# instance fields
.field private final mPressureDao:Lcom/sma/smartv3/db/dao/PressureDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSbv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final pressureDayDataList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/PressureDayData;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;-><init>()V

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->pressureDao()Lcom/sma/smartv3/db/dao/PressureDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureWeekFragment;->mPressureDao:Lcom/sma/smartv3/db/dao/PressureDao;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureWeekFragment;->pressureDayDataList:Ljava/util/List;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/a52;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/a52;-><init>(Lcom/sma/smartv3/ui/status/fragment/PressureWeekFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureWeekFragment;->mSbv$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/status/fragment/PressureWeekFragment;)Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureWeekFragment;->mSbv_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureWeekFragment;)Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    move-result-object p0

    return-object p0
.end method

.method private final getMSbv()Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureWeekFragment;->mSbv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    return-object v0
.end method

.method private static final mSbv_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureWeekFragment;)Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a09de

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    return-object p0
.end method


# virtual methods
.method public filterData(Ljava/util/List;)V
    .locals 7
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Pressure;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->filterData(Ljava/util/List;)V

    sget-object v1, Lcom/sma/smartv3/model/PressureDataParse;->INSTANCE:Lcom/sma/smartv3/model/PressureDataParse;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->getWeekData()Ljava/util/LinkedHashMap;

    move-result-object v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/status/fragment/PressureWeekFragment;->pressureDayDataList:Ljava/util/List;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->getValues()Ljava/util/List;

    move-result-object v6

    move-object v3, p1

    invoke-virtual/range {v1 .. v6}, Lcom/sma/smartv3/model/PressureDataParse;->filterDayData(Landroid/content/Context;Ljava/util/List;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->getValues()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->updateChartData(Ljava/util/List;)V

    return-void
.end method

.method public initView()V
    .locals 3

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getImage()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f081309

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getValueUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->getOneTV()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v2, 0x7f140192

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->getOneUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->getTwoTV()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v2, 0x7f140f72

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->getTwoUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureWeekFragment;->getMSbv()Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    move-result-object v1

    const-string v2, "<get-mSbv>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/sma/smartv3/model/PressureDataKt;->setPressureSbv(Landroid/content/Context;Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0ea0

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
            "Lcom/sma/smartv3/db/entity/Pressure;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/PressureWeekFragment;->filterData(Ljava/util/List;)V

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
            "Lcom/sma/smartv3/db/entity/Pressure;",
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

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->clearCache(J)V

    iget-object p3, p0, Lcom/sma/smartv3/ui/status/fragment/PressureWeekFragment;->mPressureDao:Lcom/sma/smartv3/db/dao/PressureDao;

    aget-wide v0, p1, p2

    const/4 p2, 0x1

    aget-wide v2, p1, p2

    invoke-interface {p3, v0, v1, v2, v3}, Lcom/sma/smartv3/db/dao/PressureDao;->getPressures(JJ)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public setChartRenderer()V
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->getAnimator()Lcom/android/mltcode/paycertificationapi/X1i1iOX;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

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

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f060544

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f060545

    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    filled-new-array {v1, v2}, [I

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->I1([I)V

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iIiiO(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/github/mikephil/charting/charts/Chart;->setRenderer(Lcom/android/mltcode/paycertificationapi/i0OX00;)V

    return-void
.end method

.method public setColor(Lcom/android/mltcode/paycertificationapi/XXX1X11;)V
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

.method public setDataLabel()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "Pressure week Data"

    return-object v0
.end method

.method public updateItemData(Lcom/github/mikephil/charting/data/Entry;)V
    .locals 3
    .param p1    # Lcom/github/mikephil/charting/data/Entry;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureWeekFragment;->pressureDayDataList:Ljava/util/List;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/Entry;->OIX0iXi()F

    move-result p1

    float-to-int p1, p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/model/PressureDayData;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getNowValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/PressureDayData;->getMin()I

    move-result v1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/PressureDayData;->getMax()I

    move-result v2

    invoke-static {v1, v2}, Lcom/sma/smartv3/util/UtilsKt;->iX(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getValueUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->getOneValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result v1

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->iXiiiO(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseWeekFragment;->getTwoValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/PressureDayData;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->Ii1iii0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureWeekFragment;->getMSbv()Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    move-result-object v0

    const-string v1, "<get-mSbv>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result p1

    int-to-float p1, p1

    invoke-static {v0, p1}, Lcom/sma/smartv3/model/PressureDataKt;->setPressureSbvValue(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;F)V

    return-void
.end method
