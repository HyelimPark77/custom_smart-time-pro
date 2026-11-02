.class public final Lcom/sma/smartv3/ui/status/item/Pressure2Item;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field private barChart:Lcom/github/mikephil/charting/charts/BarChart;

.field private dataPanel:Landroid/view/View;

.field private emptyPanel:Landroid/view/View;

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

.field private final intervalTime:I

.field private mContext:Landroid/content/Context;

.field private final mPressureDao:Lcom/sma/smartv3/db/dao/PressureDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final maxHour:I

.field private range:[J

.field private tvChartBottomText:Landroid/widget/TextView;

.field private tvTime:Landroid/widget/TextView;

.field private tvValue:Landroid/widget/TextView;

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

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->mPressureDao:Lcom/sma/smartv3/db/dao/PressureDao;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->filterData:Ljava/util/LinkedHashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->values:Ljava/util/List;

    const/16 v0, 0x8

    iput v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->maxHour:I

    const v0, 0x36ee80

    iput v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->intervalTime:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->initEvent:Z

    return-void
.end method

.method private final showChartData(Ljava/util/List;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Pressure;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->filterData:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    iget v1, v0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->maxHour:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-gt v4, v1, :cond_1

    move v5, v4

    :goto_0
    iget-object v6, v0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->filterData:Ljava/util/LinkedHashMap;

    iget-object v7, v0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->range:[J

    if-nez v7, :cond_0

    const-string v7, "range"

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v7, 0x0

    :cond_0
    aget-wide v8, v7, v3

    iget v7, v0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->intervalTime:I

    mul-int/2addr v7, v5

    int-to-long v10, v7

    add-long/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eq v5, v1, :cond_1

    add-int/2addr v5, v4

    goto :goto_0

    :cond_1
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sma/smartv3/db/entity/Pressure;

    iget-object v6, v0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->filterData:Ljava/util/LinkedHashMap;

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
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->filterData:Ljava/util/LinkedHashMap;

    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

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

    if-eqz v8, :cond_9

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const-string v9, "iterator(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    move v9, v3

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

    move-result v6

    div-int/2addr v9, v6

    invoke-virtual {v7, v9}, Lcom/sma/smartv3/model/PressureDayData;->setAvg(I)V

    :cond_9
    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_a
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v5, 0x0

    move v7, v3

    move v8, v7

    move v6, v5

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

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

    iget-object v13, v0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->values:Ljava/util/List;

    new-instance v14, Lcom/github/mikephil/charting/data/BarEntry;

    const/4 v15, 0x2

    new-array v15, v15, [F

    aput v5, v15, v3

    aput v12, v15, v4

    iget-object v12, v0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->mContext:Landroid/content/Context;

    if-nez v12, :cond_b

    const-string v12, "mContext"

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v12, 0x0

    :cond_b
    invoke-virtual {v9}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result v2

    invoke-static {v12, v2}, Lcom/sma/smartv3/model/PressureDataKt;->getBarColors(Landroid/content/Context;I)[I

    move-result-object v2

    invoke-direct {v14, v6, v15, v2}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(F[FLjava/lang/Object;)V

    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    int-to-float v2, v7

    cmpg-float v2, v2, v11

    if-gez v2, :cond_c

    float-to-int v7, v11

    :cond_c
    if-nez v8, :cond_d

    invoke-virtual {v9}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result v8

    :cond_d
    cmpg-float v2, v10, v5

    if-nez v2, :cond_e

    goto :goto_5

    :cond_e
    int-to-float v2, v8

    cmpl-float v2, v2, v10

    if-lez v2, :cond_f

    float-to-int v2, v10

    move v8, v2

    :cond_f
    :goto_5
    invoke-virtual {v9}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v6, v2

    goto :goto_4

    :cond_10
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->values:Ljava/util/List;

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->updateData(Ljava/util/List;)V

    return-void
.end method

.method private final updateData(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    const-string v2, "barChart"

    const/4 v3, 0x0

    if-nez v1, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_0
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v1, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_1
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/XOi0;->XXI()I

    move-result v1

    if-lez v1, :cond_3

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v1, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_2
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/XOi0;->IXXOO(I)Z

    :cond_3
    new-instance v1, Lcom/android/mltcode/paycertificationapi/XXX1X11;

    const-string v4, ""

    invoke-direct {v1, p1, v4}, Lcom/android/mltcode/paycertificationapi/XXX1X11;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->mContext:Landroid/content/Context;

    if-nez v4, :cond_4

    const-string v4, "mContext"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v3

    :cond_4
    const v5, 0x7f0600b4

    invoke-static {v4, v5}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {p1, v4}, [Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->I011X(Ljava/util/List;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    const/4 v4, 0x1

    new-array v4, v4, [Lcom/android/mltcode/paycertificationapi/XIXi1iX00;

    aput-object v1, v4, v0

    invoke-direct {p1, v4}, Lcom/android/mltcode/paycertificationapi/IXIX1X1;-><init>([Lcom/android/mltcode/paycertificationapi/XIXi1iX00;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/XOi0;->iI(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v0, :cond_5

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_5
    invoke-virtual {v0, p1}, Lcom/github/mikephil/charting/charts/Chart;->setData(Lcom/android/mltcode/paycertificationapi/XOi0;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez p1, :cond_6

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_6
    move-object v3, p1

    :goto_0
    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 8
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->maxHour:I

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OiIIX101O(I)[J

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->range:[J

    const v0, 0x7f0a096a

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/github/mikephil/charting/charts/BarChart;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    const v0, 0x7f0a096b

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->tvTime:Landroid/widget/TextView;

    const v0, 0x7f0a096c

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->tvValue:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    const-string v1, "barChart"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v3, "getContext(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->mContext:Landroid/content/Context;

    const v0, 0x7f0a0c50

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->tvChartBottomText:Landroid/widget/TextView;

    if-nez v0, :cond_1

    const-string v0, "tvChartBottomText"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_1
    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->mContext:Landroid/content/Context;

    const-string v5, "mContext"

    if-nez v4, :cond_2

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v2

    :cond_2
    iget v6, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->maxHour:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    const v7, 0x7f140dfa

    invoke-virtual {v4, v7, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0a035c

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->emptyPanel:Landroid/view/View;

    if-nez v0, :cond_3

    const-string v0, "emptyPanel"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_3
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f070096

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    invoke-static {v0, v4}, Lcom/sma/smartv3/util/UtilsKt;->IX1XiI(Landroid/view/View;F)V

    const v0, 0x7f0a02d3

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->dataPanel:Landroid/view/View;

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez p1, :cond_4

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v2

    :cond_4
    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->i100IXOX(FFFF)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez p1, :cond_5

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v2

    :cond_5
    const/4 v4, 0x0

    invoke-virtual {p1, v4}, Lcom/github/mikephil/charting/charts/Chart;->setTouchEnabled(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->getDescription()Lcom/android/mltcode/paycertificationapi/IOOI00X0I;

    move-result-object v6

    invoke-virtual {v6, v4}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v6

    invoke-virtual {v6, v4}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v6

    invoke-virtual {v6, v4}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Ii0X0X(Z)V

    const/high16 v7, 0x42c80000    # 100.0f

    invoke-virtual {v6, v7}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOiXi11II(F)V

    invoke-virtual {v6, v4}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    invoke-virtual {v6, v4}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->XO0X10iO(Z)V

    invoke-virtual {v6, v4}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Ii0X0X(Z)V

    invoke-virtual {v6, v0}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->i0X000X0O(F)V

    invoke-virtual {v6, v0}, Lcom/github/mikephil/charting/components/YAxis;->iIi0(F)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v6

    invoke-virtual {v6, v4}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v6, v0}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->i0X000X0O(F)V

    invoke-virtual {v6, v0}, Lcom/github/mikephil/charting/components/YAxis;->iIi0(F)V

    invoke-virtual {v6, v4}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    invoke-virtual {v6, v4}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Ii0X0X(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object p1

    sget-object v6, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v7, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v7, :cond_6

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v7, v2

    :cond_6
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-virtual {v6, p1, v3, v7}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIi0(Lcom/github/mikephil/charting/components/XAxis;ZLandroid/content/Context;)V

    iput v0, p1, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->O1O:F

    iget v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->maxHour:I

    int-to-float v0, v0

    iput v0, p1, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOO1ii1:F

    invoke-virtual {p1, v4}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    invoke-virtual {p1, v4}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Ii0X0X(Z)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v0, :cond_7

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_7
    iget-object v3, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v3, :cond_8

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v2

    :cond_8
    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/Chart;->getAnimator()Lcom/android/mltcode/paycertificationapi/X1i1iOX;

    move-result-object v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v4, :cond_9

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v2

    :cond_9
    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/Chart;->getViewPortHandler()Lcom/android/mltcode/paycertificationapi/jh6;

    move-result-object v4

    invoke-direct {p1, v0, v3, v4}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;-><init>(Lcom/android/mltcode/paycertificationapi/IXi0IO;Lcom/android/mltcode/paycertificationapi/X1i1iOX;Lcom/android/mltcode/paycertificationapi/jh6;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->mContext:Landroid/content/Context;

    if-nez v0, :cond_a

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_a
    const v3, 0x7f06024d

    invoke-static {v0, v3}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iOOX010X(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->mContext:Landroid/content/Context;

    if-nez v0, :cond_b

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_b
    const v3, 0x7f060544

    invoke-static {v0, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->mContext:Landroid/content/Context;

    if-nez v3, :cond_c

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v2

    :cond_c
    const v4, 0x7f060545

    invoke-static {v3, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    filled-new-array {v0, v3}, [I

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->I1([I)V

    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iIiiO(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v0, :cond_d

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_d
    move-object v2, v0

    :goto_0
    invoke-virtual {v2, p1}, Lcom/github/mikephil/charting/charts/Chart;->setRenderer(Lcom/android/mltcode/paycertificationapi/i0OX00;)V

    return-void
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->initEvent:Z

    return v0
.end method

.method public initView()V
    .locals 9

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->values:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->maxHour:I

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OiIIX101O(I)[J

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->range:[J

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->mPressureDao:Lcom/sma/smartv3/db/dao/PressureDao;

    const-string v2, "range"

    const/4 v3, 0x0

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_0
    const/4 v4, 0x0

    aget-wide v5, v0, v4

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->range:[J

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_1
    const/4 v2, 0x1

    aget-wide v7, v0, v2

    invoke-interface {v1, v5, v6, v7, v8}, Lcom/sma/smartv3/db/dao/PressureDao;->getPressures(JJ)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/16 v5, 0x8

    const-string v6, "dataPanel"

    const-string v7, "emptyPanel"

    const-string v8, "tvTime"

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->tvTime:Landroid/widget/TextView;

    if-nez v1, :cond_2

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_2
    const-string v2, ""

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->emptyPanel:Landroid/view/View;

    if-nez v1, :cond_3

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_3
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->dataPanel:Landroid/view/View;

    if-nez v1, :cond_4

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    move-object v3, v1

    :goto_0
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->emptyPanel:Landroid/view/View;

    if-nez v1, :cond_6

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_6
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->dataPanel:Landroid/view/View;

    if-nez v1, :cond_7

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_7
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v1, :cond_8

    const-string v1, "barChart"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_8
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->tvTime:Landroid/widget/TextView;

    if-nez v1, :cond_9

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_9
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XXX11i()Ljava/text/SimpleDateFormat;

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

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->tvValue:Landroid/widget/TextView;

    if-nez v1, :cond_a

    const-string v1, "tvValue"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_a
    move-object v3, v1

    :goto_1
    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/Pressure;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Pressure;->getMValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_2
    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->showChartData(Ljava/util/List;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d10a0

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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/Pressure2Item;->initView()V

    return-void
.end method
