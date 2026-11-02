.class public Lcom/sma/smartv3/ui/status/item/PressureItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPressureItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PressureItem.kt\ncom/sma/smartv3/ui/status/item/PressureItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,258:1\n1#2:259\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPressureItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PressureItem.kt\ncom/sma/smartv3/ui/status/item/PressureItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,258:1\n1#2:259\n*E\n"
    }
.end annotation


# instance fields
.field public barChart:Lcom/github/mikephil/charting/charts/BarChart;

.field private final filterData:Ljava/util/LinkedHashMap;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/db/entity/Pressure;",
            ">;>;"
        }
    .end annotation
.end field

.field private final initEvent:Z

.field public mContext:Landroid/content/Context;

.field private final mPressureDao:Lcom/sma/smartv3/db/dao/PressureDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private noData:Lcom/sma/smartv3/view/text/DINCondBold;

.field private range:[J

.field private tvTime:Lcom/sma/smartv3/view/text/DINCondBold;

.field private tvValue:Lcom/sma/smartv3/view/text/DINCondBold;

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

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->pressureDao()Lcom/sma/smartv3/db/dao/PressureDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->mPressureDao:Lcom/sma/smartv3/db/dao/PressureDao;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->filterData:Ljava/util/LinkedHashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->values:Ljava/util/List;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->initEvent:Z

    return-void
.end method

.method private final initChart(Ljava/util/List;)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Pressure;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/PressureDayData;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    const/4 v1, 0x0

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/PressureItem;->filterData:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V

    const/4 v2, 0x1

    move v3, v2

    :goto_0
    const/16 v4, 0x19

    if-ge v3, v4, :cond_1

    iget-object v4, v0, Lcom/sma/smartv3/ui/status/item/PressureItem;->filterData:Ljava/util/LinkedHashMap;

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/item/PressureItem;->range:[J

    if-nez v5, :cond_0

    const-string v5, "range"

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v5, 0x0

    :cond_0
    aget-wide v6, v5, v1

    mul-int/lit16 v5, v3, 0xe10

    int-to-long v8, v5

    const-wide/16 v10, 0x3e8

    mul-long/2addr v8, v10

    add-long/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/2addr v3, v2

    goto :goto_0

    :cond_1
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sma/smartv3/db/entity/Pressure;

    iget-object v6, v0, Lcom/sma/smartv3/ui/status/item/PressureItem;->filterData:Ljava/util/LinkedHashMap;

    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/ArrayList;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Pressure;->getMTime()J

    move-result-wide v10

    cmp-long v8, v10, v8

    if-gtz v8, :cond_3

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/item/PressureItem;->filterData:Ljava/util/LinkedHashMap;

    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/ArrayList;

    new-instance v7, Lcom/sma/smartv3/model/PressureDayData;

    const/16 v12, 0xf

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lcom/sma/smartv3/model/PressureDayData;-><init>(IIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-eqz v8, :cond_c

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const-string v9, "iterator(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    move v9, v1

    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    const-string v11, "next(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Lcom/sma/smartv3/db/entity/Pressure;

    invoke-virtual {v7}, Lcom/sma/smartv3/model/PressureDayData;->getMin()I

    move-result v11

    if-eqz v11, :cond_5

    invoke-virtual {v7}, Lcom/sma/smartv3/model/PressureDayData;->getMin()I

    move-result v11

    invoke-virtual {v10}, Lcom/sma/smartv3/db/entity/Pressure;->getMValue()I

    move-result v12

    if-le v11, v12, :cond_6

    :cond_5
    invoke-virtual {v10}, Lcom/sma/smartv3/db/entity/Pressure;->getMValue()I

    move-result v11

    invoke-virtual {v7, v11}, Lcom/sma/smartv3/model/PressureDayData;->setMin(I)V

    :cond_6
    invoke-virtual {v7}, Lcom/sma/smartv3/model/PressureDayData;->getMax()I

    move-result v11

    invoke-virtual {v10}, Lcom/sma/smartv3/db/entity/Pressure;->getMValue()I

    move-result v12

    if-ge v11, v12, :cond_7

    invoke-virtual {v10}, Lcom/sma/smartv3/db/entity/Pressure;->getMValue()I

    move-result v11

    invoke-virtual {v7, v11}, Lcom/sma/smartv3/model/PressureDayData;->setMax(I)V

    :cond_7
    invoke-virtual {v10}, Lcom/sma/smartv3/db/entity/Pressure;->getMValue()I

    move-result v10

    add-int/2addr v9, v10

    goto :goto_3

    :cond_8
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v8

    div-int v8, v9, v8

    invoke-virtual {v7, v8}, Lcom/sma/smartv3/model/PressureDayData;->setAvg(I)V

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    div-int/2addr v9, v6

    invoke-virtual {v7, v9}, Lcom/sma/smartv3/model/PressureDayData;->setAvg(I)V

    invoke-virtual {v7}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result v6

    if-ge v6, v4, :cond_9

    const v6, 0x7f14111c

    invoke-static {v6}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Lcom/sma/smartv3/model/PressureDayData;->setStatus(Ljava/lang/String;)V

    goto :goto_4

    :cond_9
    invoke-virtual {v7}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result v6

    const/16 v8, 0x32

    if-ge v6, v8, :cond_a

    const v6, 0x7f14111a

    invoke-static {v6}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Lcom/sma/smartv3/model/PressureDayData;->setStatus(Ljava/lang/String;)V

    goto :goto_4

    :cond_a
    invoke-virtual {v7}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result v6

    const/16 v8, 0x4b

    if-ge v6, v8, :cond_b

    const v6, 0x7f141119

    invoke-static {v6}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Lcom/sma/smartv3/model/PressureDayData;->setStatus(Ljava/lang/String;)V

    goto :goto_4

    :cond_b
    const v6, 0x7f14111b

    invoke-static {v6}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Lcom/sma/smartv3/model/PressureDayData;->setStatus(Ljava/lang/String;)V

    :cond_c
    :goto_4
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_d
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    move v7, v1

    move v8, v7

    move v6, v5

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_12

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/sma/smartv3/model/PressureDayData;

    invoke-virtual {v9}, Lcom/sma/smartv3/model/PressureDayData;->getMin()I

    move-result v10

    int-to-float v10, v10

    invoke-virtual {v9}, Lcom/sma/smartv3/model/PressureDayData;->getMax()I

    move-result v11

    int-to-float v11, v11

    invoke-virtual {v9}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result v12

    int-to-float v12, v12

    iget-object v13, v0, Lcom/sma/smartv3/ui/status/item/PressureItem;->values:Ljava/util/List;

    new-instance v14, Lcom/github/mikephil/charting/data/BarEntry;

    const/4 v15, 0x2

    new-array v15, v15, [F

    aput v5, v15, v1

    aput v12, v15, v2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getMContext()Landroid/content/Context;

    move-result-object v12

    invoke-virtual {v9}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result v1

    invoke-static {v12, v1}, Lcom/sma/smartv3/model/PressureDataKt;->getBarColors(Landroid/content/Context;I)[I

    move-result-object v1

    invoke-direct {v14, v6, v15, v1}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(F[FLjava/lang/Object;)V

    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    int-to-float v1, v7

    cmpg-float v1, v1, v11

    if-gez v1, :cond_e

    float-to-int v7, v11

    :cond_e
    if-nez v8, :cond_f

    invoke-virtual {v9}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result v8

    :cond_f
    cmpg-float v1, v10, v5

    if-nez v1, :cond_10

    goto :goto_6

    :cond_10
    int-to-float v1, v8

    cmpl-float v1, v1, v10

    if-lez v1, :cond_11

    float-to-int v1, v10

    move v8, v1

    :cond_11
    :goto_6
    invoke-virtual {v9}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v6, v1

    const/4 v1, 0x0

    goto :goto_5

    :cond_12
    sget-object v1, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v2

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v2

    const-string v4, "getAxisLeft(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v4

    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v4

    const-string v6, "getAxisRight(...)"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v6, 0x42c80000    # 100.0f

    invoke-virtual {v1, v2, v4, v6, v5}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->IO(Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/components/YAxis;FF)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/PressureItem;->values:Ljava/util/List;

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/status/item/PressureItem;->updateData(Ljava/util/List;)V

    return-object v3
.end method

.method private final updateData(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XOi0;->XXI()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/XOi0;->IXXOO(I)Z

    :cond_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXX1X11;

    const-string v2, ""

    invoke-direct {v0, p1, v2}, Lcom/android/mltcode/paycertificationapi/XXX1X11;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getMContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f0600b4

    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {p1, v2}, [Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->I011X(Ljava/util/List;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/android/mltcode/paycertificationapi/XIXi1iX00;

    aput-object v0, v2, v1

    invoke-direct {p1, v2}, Lcom/android/mltcode/paycertificationapi/IXIX1X1;-><init>([Lcom/android/mltcode/paycertificationapi/XIXi1iX00;)V

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/XOi0;->iI(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/github/mikephil/charting/charts/Chart;->setData(Lcom/android/mltcode/paycertificationapi/XOi0;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 13
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a096a

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->setBarChart(Lcom/github/mikephil/charting/charts/BarChart;)V

    const v0, 0x7f0a096b

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->tvTime:Lcom/sma/smartv3/view/text/DINCondBold;

    const v0, 0x7f0a096c

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->tvValue:Lcom/sma/smartv3/view/text/DINCondBold;

    const v0, 0x7f0a0897

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast p1, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->noData:Lcom/sma/smartv3/view/text/DINCondBold;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "getContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/item/PressureItem;->setMContext(Landroid/content/Context;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1(Lcom/github/mikephil/charting/charts/BarChart;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v1

    const-string v2, "getAxisLeft(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v2

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v2

    const-string v3, "getAxisRight(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v3, 0x42c80000    # 100.0f

    const/4 v4, 0x0

    invoke-virtual {p1, v1, v2, v3, v4}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->IO(Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/components/YAxis;FF)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/github/mikephil/charting/charts/Chart;->setTouchEnabled(Z)V

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getDescription()Lcom/android/mltcode/paycertificationapi/IOOI00X0I;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getMContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->iO(Landroid/content/Context;)Lcom/github/mikephil/charting/components/LimitLine;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->XXI(Lcom/github/mikephil/charting/components/LimitLine;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v1, v0, v3}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIi0(Lcom/github/mikephil/charting/components/XAxis;ZLandroid/content/Context;)V

    sget-object p1, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    const/4 v3, 0x0

    const/4 v5, 0x5

    invoke-static {v3, p1, v2, v5, v3}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iOOX010X(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;IILjava/lang/Object;)[J

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->range:[J

    iput v4, v1, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->O1O:F

    const/high16 p1, 0x41c00000    # 24.0f

    iput p1, v1, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOO1ii1:F

    invoke-static {v2, v0, v3}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XXiIiX10(ZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object p1

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    const/16 v6, 0x19

    if-ge v0, v6, :cond_1

    iget-object v6, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->range:[J

    if-nez v6, :cond_0

    const-string v6, "range"

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v6, v3

    :cond_0
    aget-wide v7, v6, v2

    mul-int/lit16 v6, v0, 0xe10

    int-to-long v9, v6

    const-wide/16 v11, 0x3e8

    mul-long/2addr v9, v11

    add-long/2addr v7, v9

    invoke-static {v7, v8, p1}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "millis2String(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/android/mltcode/paycertificationapi/q4;

    invoke-direct {p1, v4}, Lcom/android/mltcode/paycertificationapi/q4;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Oi(Lcom/android/mltcode/paycertificationapi/he6;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getAnimator()Lcom/android/mltcode/paycertificationapi/X1i1iOX;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v2

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->getViewPortHandler()Lcom/android/mltcode/paycertificationapi/jh6;

    move-result-object v2

    invoke-direct {p1, v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;-><init>(Lcom/android/mltcode/paycertificationapi/IXi0IO;Lcom/android/mltcode/paycertificationapi/X1i1iOX;Lcom/android/mltcode/paycertificationapi/jh6;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getMContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f06024d

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iOOX010X(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getMContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f060544

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getMContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f060545

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    filled-new-array {v0, v1}, [I

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->I1([I)V

    invoke-virtual {p1, v5}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iIiiO(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/github/mikephil/charting/charts/Chart;->setRenderer(Lcom/android/mltcode/paycertificationapi/i0OX00;)V

    return-void
.end method

.method public final getBarChart()Lcom/github/mikephil/charting/charts/BarChart;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "barChart"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->initEvent:Z

    return v0
.end method

.method public final getMContext()Landroid/content/Context;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public initView()V
    .locals 10

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isBound()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemHidden(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->values:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    sget-object v0, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    const/4 v2, 0x5

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v3, v0, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iOOX010X(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;IILjava/lang/Object;)[J

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->range:[J

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->mPressureDao:Lcom/sma/smartv3/db/dao/PressureDao;

    const-string v5, "range"

    if-nez v0, :cond_0

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_0
    aget-wide v6, v0, v4

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->range:[J

    if-nez v0, :cond_1

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_1
    aget-wide v8, v0, v1

    invoke-interface {v2, v6, v7, v8, v9}, Lcom/sma/smartv3/db/dao/PressureDao;->getPressures(JJ)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const-string v6, "tvTime"

    const-string v7, "noData"

    const/16 v8, 0x8

    const-string v9, "tvValue"

    if-eqz v2, :cond_8

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->tvTime:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v0, :cond_2

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_2
    const v2, 0x7f1403bc

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->tvValue:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v0, :cond_3

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_3
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->noData:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v0, :cond_4

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_4
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->XIIO11I()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->noData:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v0, :cond_5

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_5
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->mPressureDao:Lcom/sma/smartv3/db/dao/PressureDao;

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->range:[J

    if-nez v2, :cond_6

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v3

    :cond_6
    aget-wide v6, v2, v4

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->range:[J

    if-nez v2, :cond_7

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_7
    move-object v3, v2

    :goto_0
    aget-wide v1, v3, v1

    invoke-interface {v0, v6, v7, v1, v2}, Lcom/sma/smartv3/db/dao/PressureDao;->getTestPressures(JJ)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->initChart(Ljava/util/List;)Ljava/util/List;

    return-void

    :cond_8
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v2

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->noData:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v1, :cond_9

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_9
    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->tvTime:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v1, :cond_a

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_a
    const/4 v2, 0x3

    invoke-static {v4, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->i0X000X0O(ZZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v2

    new-instance v4, Ljava/util/Date;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sma/smartv3/db/entity/Pressure;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Pressure;->getMTime()J

    move-result-wide v5

    invoke-direct {v4, v5, v6}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->tvValue:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v1, :cond_b

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_b
    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/Pressure;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Pressure;->getMValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->initChart(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->i000X()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_c
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/sma/smartv3/model/PressureDayData;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result v2

    if-lez v2, :cond_c

    goto :goto_1

    :cond_d
    move-object v1, v3

    :goto_1
    check-cast v1, Lcom/sma/smartv3/model/PressureDayData;

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result v0

    invoke-virtual {v1}, Lcom/sma/smartv3/model/PressureDayData;->getStatus()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Landroid/text/SpannableString;

    invoke-direct {v2, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    new-instance v4, Landroid/text/style/RelativeSizeSpan;

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-direct {v4, v5}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v5, 0x21

    invoke-virtual {v2, v4, v1, v0, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->tvValue:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v0, :cond_e

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_e
    move-object v3, v0

    :goto_2
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_f
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d1075

    return v0
.end method

.method public final onPressureChanged(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "pressure_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onPressureChanged"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/PressureItem;->initView()V

    return-void
.end method

.method public final setBarChart(Lcom/github/mikephil/charting/charts/BarChart;)V
    .locals 1
    .param p1    # Lcom/github/mikephil/charting/charts/BarChart;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    return-void
.end method

.method public final setMContext(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/PressureItem;->mContext:Landroid/content/Context;

    return-void
.end method
