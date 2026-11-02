.class public final Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field private final filterData:Ljava/util/LinkedHashMap;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Lcom/sma/smartv3/model/ECGMinuteData;",
            ">;"
        }
    .end annotation
.end field

.field private final initEvent:Z

.field private lineChart:Lcom/github/mikephil/charting/charts/LineChart;

.field private mContext:Landroid/content/Context;

.field private final mElectrocardiogramDao:Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private noData:Lcom/sma/smartv3/view/text/DINCondBold;

.field private range:[J

.field private tvBpm:Lcom/sma/smartv3/view/text/DINCondBold;

.field private tvTime:Lcom/sma/smartv3/view/text/DINCondBold;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->electrocardiogramDao()Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->mElectrocardiogramDao:Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->filterData:Ljava/util/LinkedHashMap;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->initEvent:Z

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 14
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string v2, "itemHolder"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f0a0442

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v2, Lcom/github/mikephil/charting/charts/LineChart;

    iput-object v2, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    const v2, 0x7f0a0440

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v2, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object v2, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->tvTime:Lcom/sma/smartv3/view/text/DINCondBold;

    const v2, 0x7f0a0441

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v2, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object v2, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->tvBpm:Lcom/sma/smartv3/view/text/DINCondBold;

    const v2, 0x7f0a0897

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast p1, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->noData:Lcom/sma/smartv3/view/text/DINCondBold;

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    const-string v2, "lineChart"

    const/4 v3, 0x0

    if-nez p1, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v3

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v4, "getContext(...)"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->mContext:Landroid/content/Context;

    sget-object p1, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    iget-object v5, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez v5, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v3

    :cond_1
    invoke-virtual {p1, v5}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->XIi00iiXO(Lcom/github/mikephil/charting/charts/LineChart;)V

    iget-object v5, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez v5, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v3

    :cond_2
    invoke-virtual {v5}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v5

    const-string v6, "getAxisLeft(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez v6, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v6, v3

    :cond_3
    invoke-virtual {v6}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v6

    const-string v7, "getAxisRight(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v7, 0x43480000    # 200.0f

    const/high16 v8, 0x41f00000    # 30.0f

    invoke-virtual {p1, v5, v6, v7, v8}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->IO(Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/components/YAxis;FF)V

    iget-object v5, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez v5, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v3

    :cond_4
    invoke-virtual {v5, v0}, Lcom/github/mikephil/charting/charts/Chart;->setTouchEnabled(Z)V

    invoke-virtual {v5}, Lcom/github/mikephil/charting/charts/Chart;->getDescription()Lcom/android/mltcode/paycertificationapi/IOOI00X0I;

    move-result-object v6

    invoke-virtual {v6, v0}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v5}, Lcom/github/mikephil/charting/charts/Chart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v6

    invoke-virtual {v6, v0}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v5}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v5

    iget-object v6, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->mContext:Landroid/content/Context;

    const-string v7, "mContext"

    if-nez v6, :cond_5

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v6, v3

    :cond_5
    invoke-virtual {p1, v6}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->iO(Landroid/content/Context;)Lcom/github/mikephil/charting/components/LimitLine;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->XXI(Lcom/github/mikephil/charting/components/LimitLine;)V

    iget-object v5, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez v5, :cond_6

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v3

    :cond_6
    invoke-virtual {v5}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v6, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez v6, :cond_7

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v6, v3

    :cond_7
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v5, v1, v6}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIi0(Lcom/github/mikephil/charting/components/XAxis;ZLandroid/content/Context;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XIi00iiXO()I

    move-result p1

    sget-object v4, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    const/4 v6, 0x5

    invoke-static {v3, v4, v0, v6, v3}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iOOX010X(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;IILjava/lang/Object;)[J

    move-result-object v4

    iput-object v4, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->range:[J

    const/4 v4, 0x0

    invoke-virtual {v5, v4}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->i0X000X0O(F)V

    int-to-float v4, p1

    const/4 v6, 0x6

    int-to-float v6, v6

    div-float v6, v4, v6

    invoke-virtual {v5, v6}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->IXOIIIO(F)V

    invoke-virtual {v5, v4}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOiXi11II(F)V

    invoke-static {v0, v1, v3}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->IXI(ZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v4

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    if-ltz p1, :cond_9

    move v8, v0

    :goto_0
    iget-object v9, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->range:[J

    if-nez v9, :cond_8

    const-string v9, "range"

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v9, v3

    :cond_8
    aget-wide v10, v9, v0

    const v9, 0xea60

    mul-int/2addr v9, v8

    int-to-long v12, v9

    add-long/2addr v10, v12

    invoke-static {v10, v11, v4}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "millis2String(...)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq v8, p1, :cond_9

    add-int/2addr v8, v1

    goto :goto_0

    :cond_9
    new-instance p1, Lcom/android/mltcode/paycertificationapi/q4;

    invoke-direct {p1, v6}, Lcom/android/mltcode/paycertificationapi/q4;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v5, p1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Oi(Lcom/android/mltcode/paycertificationapi/he6;)V

    new-instance p1, Lcom/github/mikephil/charting/data/LineDataSet;

    const-string v4, ""

    invoke-direct {p1, v3, v4}, Lcom/github/mikephil/charting/data/LineDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->mContext:Landroid/content/Context;

    if-nez v4, :cond_a

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v3

    :cond_a
    const v5, 0x7f060236

    invoke-static {v4, v5}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {p1, v4}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->II1(I)V

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->mContext:Landroid/content/Context;

    if-nez v4, :cond_b

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v3

    :cond_b
    invoke-static {v4, v5}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {p1, v4}, Lcom/github/mikephil/charting/data/LineDataSet;->I00(I)V

    const/high16 v4, 0x40000000    # 2.0f

    invoke-virtual {p1, v4}, Lcom/android/mltcode/paycertificationapi/ho;->I1XII0X(F)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {p1, v4}, Lcom/github/mikephil/charting/data/LineDataSet;->iXOII(F)V

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->mContext:Landroid/content/Context;

    if-nez v4, :cond_c

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v3

    :cond_c
    const v5, 0x7f0816d1

    invoke-static {v4, v5}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/android/mltcode/paycertificationapi/ho;->I0i1OXiI(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1, v0}, Lcom/github/mikephil/charting/data/LineDataSet;->IOI0i0I(Z)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->XXI(Z)V

    sget-object v4, Lcom/github/mikephil/charting/data/LineDataSet$Mode;->CUBIC_BEZIER:Lcom/github/mikephil/charting/data/LineDataSet$Mode;

    invoke-virtual {p1, v4}, Lcom/github/mikephil/charting/data/LineDataSet;->OXXO0O1X(Lcom/github/mikephil/charting/data/LineDataSet$Mode;)V

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/ho;->O1iXiI(Z)V

    new-instance v4, Lcom/android/mltcode/paycertificationapi/co;

    new-array v1, v1, [Lcom/android/mltcode/paycertificationapi/IiXO1XOi;

    aput-object p1, v1, v0

    invoke-direct {v4, v1}, Lcom/android/mltcode/paycertificationapi/co;-><init>([Lcom/android/mltcode/paycertificationapi/IiXO1XOi;)V

    invoke-virtual {v4, v0}, Lcom/android/mltcode/paycertificationapi/XOi0;->iI(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez p1, :cond_d

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_d
    move-object v3, p1

    :goto_1
    invoke-virtual {v3, v4}, Lcom/github/mikephil/charting/charts/Chart;->setData(Lcom/android/mltcode/paycertificationapi/XOi0;)V

    return-void
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->initEvent:Z

    return v0
.end method

.method public final initChart(Ljava/util/List;)V
    .locals 11
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Electrocardiogram;",
            ">;)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->filterData:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->range:[J

    const-string v1, "range"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    const/4 v3, 0x0

    aget-wide v4, v0, v3

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->range:[J

    if-nez v0, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_1
    const/4 v1, 0x1

    aget-wide v6, v0, v1

    const-wide/32 v8, 0xea60

    invoke-static/range {v4 .. v9}, Lkotlin/internal/ProgressionUtilKt;->XO0O10(JJJ)J

    move-result-wide v6

    cmp-long v0, v4, v6

    if-gtz v0, :cond_2

    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->filterData:Ljava/util/LinkedHashMap;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    new-instance v9, Lcom/sma/smartv3/model/ECGMinuteData;

    invoke-direct {v9, v3, v3}, Lcom/sma/smartv3/model/ECGMinuteData;-><init>(II)V

    invoke-interface {v0, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    cmp-long v0, v4, v6

    if-eqz v0, :cond_2

    const-wide/32 v8, 0xea60

    add-long/2addr v4, v8

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/Electrocardiogram;

    iget-object v5, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->filterData:Ljava/util/LinkedHashMap;

    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v7

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sma/smartv3/model/ECGMinuteData;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Electrocardiogram;->getMTime()J

    move-result-wide v9

    cmp-long v7, v9, v7

    if-gez v7, :cond_4

    invoke-virtual {v6}, Lcom/sma/smartv3/model/ECGMinuteData;->getTotal()I

    move-result v5

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Electrocardiogram;->getMValue()I

    move-result v4

    add-int/2addr v5, v4

    invoke-virtual {v6, v5}, Lcom/sma/smartv3/model/ECGMinuteData;->setTotal(I)V

    invoke-virtual {v6}, Lcom/sma/smartv3/model/ECGMinuteData;->getNum()I

    move-result v4

    add-int/2addr v4, v1

    invoke-virtual {v6, v4}, Lcom/sma/smartv3/model/ECGMinuteData;->setNum(I)V

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->filterData:Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/model/ECGMinuteData;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/ECGMinuteData;->getNum()I

    move-result v5

    const/high16 v6, 0x3f800000    # 1.0f

    if-eqz v5, :cond_6

    invoke-virtual {v4}, Lcom/sma/smartv3/model/ECGMinuteData;->getTotal()I

    move-result v5

    if-eqz v5, :cond_6

    new-instance v5, Lcom/github/mikephil/charting/data/Entry;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/ECGMinuteData;->getTotal()I

    move-result v7

    invoke-virtual {v4}, Lcom/sma/smartv3/model/ECGMinuteData;->getNum()I

    move-result v4

    div-int/2addr v7, v4

    int-to-float v4, v7

    invoke-direct {v5, v1, v4}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    add-float/2addr v1, v6

    goto :goto_2

    :cond_7
    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    const-string v1, "lineChart"

    if-nez p1, :cond_8

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v2

    :cond_8
    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object p1

    check-cast p1, Lcom/android/mltcode/paycertificationapi/co;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/XOi0;->I1XOi1()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string v3, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/github/mikephil/charting/data/LineDataSet;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/DataSet;->i0O()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez p1, :cond_9

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_3

    :cond_9
    move-object v2, p1

    :goto_3
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public initView()V
    .locals 11

    sget-object v0, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    const/4 v1, 0x5

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v2, v0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iOOX010X(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;IILjava/lang/Object;)[J

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->range:[J

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->mElectrocardiogramDao:Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;

    const-string v4, "range"

    if-nez v0, :cond_0

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    aget-wide v5, v0, v3

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->range:[J

    if-nez v0, :cond_1

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_1
    const/4 v7, 0x1

    aget-wide v8, v0, v7

    invoke-interface {v1, v5, v6, v8, v9}, Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;->getElectrocardiograms(JJ)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const-string v5, "tvBpm"

    const-string v6, "tvTime"

    const-string v8, "noData"

    const/16 v9, 0x8

    const-string v10, "lineChart"

    if-eqz v1, :cond_c

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->tvTime:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v0, :cond_2

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_2
    const v1, 0x7f1403bc

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->tvBpm:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v0, :cond_3

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez v0, :cond_4

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_4
    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->noData:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v0, :cond_5

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_5
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->XIIO11I()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez v0, :cond_6

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_6
    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez v0, :cond_7

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_7
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->noData:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v0, :cond_8

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_8
    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->mElectrocardiogramDao:Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->range:[J

    if-nez v1, :cond_9

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_9
    aget-wide v5, v1, v3

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->range:[J

    if-nez v1, :cond_a

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_a
    move-object v2, v1

    :goto_0
    aget-wide v1, v2, v7

    invoke-interface {v0, v5, v6, v1, v2}, Lcom/sma/smartv3/db/dao/ElectrocardiogramDao;->getTestElectrocardiograms(JJ)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->initChart(Ljava/util/List;)V

    :cond_b
    return-void

    :cond_c
    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez v1, :cond_d

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_d
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v1

    invoke-virtual {v1, v7}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez v1, :cond_e

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_e
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->noData:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v1, :cond_f

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_f
    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->tvTime:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v1, :cond_10

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_10
    const/4 v4, 0x3

    invoke-static {v3, v3, v4, v2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->i0X000X0O(ZZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v3

    new-instance v4, Ljava/util/Date;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sma/smartv3/db/entity/Electrocardiogram;

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Electrocardiogram;->getMTime()J

    move-result-wide v6

    invoke-direct {v4, v6, v7}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->tvBpm:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v1, :cond_11

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_11
    move-object v2, v1

    :goto_1
    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/Electrocardiogram;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Electrocardiogram;->getMValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->initChart(Ljava/util/List;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d106d

    return v0
.end method

.method public final onHeartRateChanged(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "heart_rate_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onHeartRateChanged"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/ElectrocardiogramItem;->initView()V

    return-void
.end method
