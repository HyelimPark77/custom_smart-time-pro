.class public final Lcom/sma/smartv3/ui/status/item/BloodPressureItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field private barChart:Lcom/github/mikephil/charting/charts/BarChart;

.field private bpLastTime:Lcom/sma/smartv3/view/text/DINCondBold;

.field private final dataMap:Ljava/util/LinkedHashMap;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Lcom/sma/smartv3/model/BPHourData;",
            ">;"
        }
    .end annotation
.end field

.field private dbp:Lcom/sma/smartv3/view/text/DINCondBold;

.field private final initEvent:Z

.field private final mBloodPressureDao:Lcom/sma/smartv3/db/dao/BloodPressureDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mContext:Landroid/content/Context;

.field private noData:Lcom/sma/smartv3/view/text/DINCondBold;

.field private range:[J

.field private sbp:Lcom/sma/smartv3/view/text/DINCondBold;

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

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->bloodPressureDao()Lcom/sma/smartv3/db/dao/BloodPressureDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->mBloodPressureDao:Lcom/sma/smartv3/db/dao/BloodPressureDao;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->dataMap:Ljava/util/LinkedHashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->values:Ljava/util/List;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->initEvent:Z

    return-void
.end method

.method private final initChart(Ljava/util/List;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/BloodPressure;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v3, v0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->dataMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->clear()V

    iget-object v3, v0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->range:[J

    const/4 v4, 0x0

    const-string v5, "range"

    if-nez v3, :cond_0

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v4

    :cond_0
    aget-wide v6, v3, v2

    iget-object v3, v0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->range:[J

    if-nez v3, :cond_1

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v4, v3

    :goto_0
    aget-wide v8, v4, v1

    const-wide/32 v10, 0x36ee80

    invoke-static/range {v6 .. v11}, Lkotlin/internal/ProgressionUtilKt;->XO0O10(JJJ)J

    move-result-wide v3

    cmp-long v5, v6, v3

    if-gtz v5, :cond_2

    :goto_1
    iget-object v5, v0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->dataMap:Ljava/util/LinkedHashMap;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    new-instance v9, Lcom/sma/smartv3/model/BPHourData;

    const/16 v18, 0xff

    const/16 v19, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v9 .. v19}, Lcom/sma/smartv3/model/BPHourData;-><init>(IIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v5, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    cmp-long v5, v6, v3

    if-eqz v5, :cond_2

    const-wide/32 v8, 0x36ee80

    add-long/2addr v6, v8

    goto :goto_1

    :cond_2
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/BloodPressure;

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->dataMap:Ljava/util/LinkedHashMap;

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

    check-cast v6, Lcom/sma/smartv3/model/BPHourData;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMTime()J

    move-result-wide v9

    cmp-long v7, v9, v7

    if-gez v7, :cond_4

    invoke-virtual {v6}, Lcom/sma/smartv3/model/BPHourData;->getDbpMax()I

    move-result v5

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v7

    if-ge v5, v7, :cond_5

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v5

    invoke-virtual {v6, v5}, Lcom/sma/smartv3/model/BPHourData;->setDbpMax(I)V

    :cond_5
    invoke-virtual {v6}, Lcom/sma/smartv3/model/BPHourData;->getDbpMin()I

    move-result v5

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v7

    if-gt v5, v7, :cond_6

    invoke-virtual {v6}, Lcom/sma/smartv3/model/BPHourData;->getDbpMin()I

    move-result v5

    if-nez v5, :cond_7

    :cond_6
    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v5

    invoke-virtual {v6, v5}, Lcom/sma/smartv3/model/BPHourData;->setDbpMin(I)V

    :cond_7
    invoke-virtual {v6}, Lcom/sma/smartv3/model/BPHourData;->getSbpMax()I

    move-result v5

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v7

    if-ge v5, v7, :cond_8

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v5

    invoke-virtual {v6, v5}, Lcom/sma/smartv3/model/BPHourData;->setSbpMax(I)V

    :cond_8
    invoke-virtual {v6}, Lcom/sma/smartv3/model/BPHourData;->getSbpMin()I

    move-result v5

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v7

    if-gt v5, v7, :cond_9

    invoke-virtual {v6}, Lcom/sma/smartv3/model/BPHourData;->getSbpMin()I

    move-result v5

    if-nez v5, :cond_a

    :cond_9
    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v5

    invoke-virtual {v6, v5}, Lcom/sma/smartv3/model/BPHourData;->setSbpMin(I)V

    :cond_a
    invoke-virtual {v6}, Lcom/sma/smartv3/model/BPHourData;->getDbpTotal()I

    move-result v5

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v7

    add-int/2addr v5, v7

    invoke-virtual {v6, v5}, Lcom/sma/smartv3/model/BPHourData;->setDbpTotal(I)V

    invoke-virtual {v6}, Lcom/sma/smartv3/model/BPHourData;->getDbpNum()I

    move-result v5

    add-int/2addr v5, v1

    invoke-virtual {v6, v5}, Lcom/sma/smartv3/model/BPHourData;->setDbpNum(I)V

    invoke-virtual {v6}, Lcom/sma/smartv3/model/BPHourData;->getSbpTotal()I

    move-result v5

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v4

    add-int/2addr v5, v4

    invoke-virtual {v6, v5}, Lcom/sma/smartv3/model/BPHourData;->setSbpTotal(I)V

    invoke-virtual {v6}, Lcom/sma/smartv3/model/BPHourData;->getSbpNum()I

    move-result v4

    add-int/2addr v4, v1

    invoke-virtual {v6, v4}, Lcom/sma/smartv3/model/BPHourData;->setSbpNum(I)V

    goto/16 :goto_2

    :cond_b
    iget-object v3, v0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->dataMap:Ljava/util/LinkedHashMap;

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v4, v2

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sma/smartv3/model/BPHourData;

    iget-object v6, v0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->values:Ljava/util/List;

    new-instance v7, Lcom/github/mikephil/charting/data/BarEntry;

    int-to-float v8, v4

    invoke-virtual {v5}, Lcom/sma/smartv3/model/BPHourData;->getDbpMin()I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v5}, Lcom/sma/smartv3/model/BPHourData;->getSbpMax()I

    move-result v10

    invoke-virtual {v5}, Lcom/sma/smartv3/model/BPHourData;->getDbpMin()I

    move-result v5

    sub-int/2addr v10, v5

    int-to-float v5, v10

    const/4 v10, 0x2

    new-array v10, v10, [F

    aput v9, v10, v2

    aput v5, v10, v1

    invoke-direct {v7, v8, v10}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(F[F)V

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v4, v1

    goto :goto_3

    :cond_c
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->values:Ljava/util/List;

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->updateData(Ljava/util/List;)V

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

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    const-string v2, "barChart"

    const/4 v3, 0x0

    if-nez v1, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_0
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

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

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

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

    const-string v4, "BP Data"

    invoke-direct {v1, p1, v4}, Lcom/android/mltcode/paycertificationapi/XXX1X11;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->mContext:Landroid/content/Context;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v0, :cond_5

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_5
    invoke-virtual {v0, p1}, Lcom/github/mikephil/charting/charts/Chart;->setData(Lcom/android/mltcode/paycertificationapi/XOi0;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

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
    .locals 14
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a016f

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/github/mikephil/charting/charts/BarChart;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    const v0, 0x7f0a0171

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->bpLastTime:Lcom/sma/smartv3/view/text/DINCondBold;

    const v0, 0x7f0a09db

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->sbp:Lcom/sma/smartv3/view/text/DINCondBold;

    const v0, 0x7f0a02d9

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->dbp:Lcom/sma/smartv3/view/text/DINCondBold;

    const v0, 0x7f0a0897

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast p1, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->noData:Lcom/sma/smartv3/view/text/DINCondBold;

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    const-string v0, "barChart"

    const/4 v1, 0x0

    if-nez p1, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v1

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v2, "getContext(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->mContext:Landroid/content/Context;

    sget-object p1, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v2, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v1

    :cond_1
    invoke-virtual {p1, v2}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1(Lcom/github/mikephil/charting/charts/BarChart;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v2, :cond_2

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v1

    :cond_2
    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v2

    const-string v3, "getAxisLeft(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v3, :cond_3

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    :cond_3
    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v3

    const-string v4, "getAxisRight(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v4, 0x43480000    # 200.0f

    const/high16 v5, 0x41f00000    # 30.0f

    invoke-virtual {p1, v2, v3, v4, v5}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->IO(Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/components/YAxis;FF)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v2, :cond_4

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v1

    :cond_4
    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->getDescription()Lcom/android/mltcode/paycertificationapi/IOOI00X0I;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v2, v4}, Lcom/github/mikephil/charting/charts/Chart;->setTouchEnabled(Z)V

    invoke-virtual {v2, v4}, Lcom/github/mikephil/charting/charts/BarChart;->setDrawValueAboveBar(Z)V

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->mContext:Landroid/content/Context;

    const-string v5, "mContext"

    if-nez v3, :cond_5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    :cond_5
    invoke-virtual {p1, v3}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->iO(Landroid/content/Context;)Lcom/github/mikephil/charting/components/LimitLine;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->XXI(Lcom/github/mikephil/charting/components/LimitLine;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v2, :cond_6

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v1

    :cond_6
    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->mContext:Landroid/content/Context;

    if-nez v3, :cond_7

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    :cond_7
    const/4 v6, 0x1

    invoke-virtual {p1, v2, v6, v3}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIi0(Lcom/github/mikephil/charting/components/XAxis;ZLandroid/content/Context;)V

    sget-object p1, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    const/4 v3, 0x5

    invoke-static {v1, p1, v4, v3, v1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iOOX010X(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;IILjava/lang/Object;)[J

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->range:[J

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-virtual {v2, p1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->IXOIIIO(F)V

    const/4 p1, 0x7

    invoke-virtual {v2, p1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->XOIX(I)V

    const/high16 p1, 0x41c00000    # 24.0f

    invoke-virtual {v2, p1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOiXi11II(F)V

    invoke-static {v4, v6, v1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->IXI(ZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object p1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move v6, v4

    :goto_0
    const/16 v7, 0x19

    if-ge v6, v7, :cond_9

    iget-object v7, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->range:[J

    if-nez v7, :cond_8

    const-string v7, "range"

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v7, v1

    :cond_8
    aget-wide v8, v7, v4

    mul-int/lit16 v7, v6, 0xe10

    int-to-long v10, v7

    const-wide/16 v12, 0x3e8

    mul-long/2addr v10, v12

    add-long/2addr v8, v10

    invoke-static {v8, v9, p1}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "millis2String(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_9
    new-instance p1, Lcom/android/mltcode/paycertificationapi/q4;

    invoke-direct {p1, v3}, Lcom/android/mltcode/paycertificationapi/q4;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v2, p1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Oi(Lcom/android/mltcode/paycertificationapi/he6;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v2, :cond_a

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v1

    :cond_a
    iget-object v3, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v3, :cond_b

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    :cond_b
    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/Chart;->getAnimator()Lcom/android/mltcode/paycertificationapi/X1i1iOX;

    move-result-object v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v4, :cond_c

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v1

    :cond_c
    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/Chart;->getViewPortHandler()Lcom/android/mltcode/paycertificationapi/jh6;

    move-result-object v4

    invoke-direct {p1, v2, v3, v4}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;-><init>(Lcom/android/mltcode/paycertificationapi/IXi0IO;Lcom/android/mltcode/paycertificationapi/X1i1iOX;Lcom/android/mltcode/paycertificationapi/jh6;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->mContext:Landroid/content/Context;

    if-nez v2, :cond_d

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v1

    :cond_d
    const v3, 0x7f06024d

    invoke-static {v2, v3}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p1, v2}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iOOX010X(I)V

    const/16 v2, 0x8

    invoke-virtual {p1, v2}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->II1Xi0(I)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->mContext:Landroid/content/Context;

    if-nez v2, :cond_e

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v1

    :cond_e
    const v3, 0x7f06008c

    invoke-static {v2, v3}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p1, v2}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->OII(I)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->mContext:Landroid/content/Context;

    if-nez v2, :cond_f

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v1

    :cond_f
    const v3, 0x7f06008f

    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->mContext:Landroid/content/Context;

    if-nez v3, :cond_10

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    :cond_10
    const v4, 0x7f060087

    invoke-static {v3, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    filled-new-array {v2, v3}, [I

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->I1([I)V

    const/4 v2, 0x3

    invoke-virtual {p1, v2}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iIiiO(I)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v2, :cond_11

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_11
    move-object v1, v2

    :goto_1
    invoke-virtual {v1, p1}, Lcom/github/mikephil/charting/charts/Chart;->setRenderer(Lcom/android/mltcode/paycertificationapi/i0OX00;)V

    return-void
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->initEvent:Z

    return v0
.end method

.method public initView()V
    .locals 12

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->values:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    sget-object v0, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    const/4 v1, 0x5

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v2, v0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iOOX010X(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;IILjava/lang/Object;)[J

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->range:[J

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->mBloodPressureDao:Lcom/sma/smartv3/db/dao/BloodPressureDao;

    const-string v4, "range"

    if-nez v0, :cond_0

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    aget-wide v5, v0, v3

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->range:[J

    if-nez v0, :cond_1

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_1
    const/4 v7, 0x1

    aget-wide v8, v0, v7

    invoke-interface {v1, v5, v6, v8, v9}, Lcom/sma/smartv3/db/dao/BloodPressureDao;->getBloodPressures(JJ)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const-string v5, "dbp"

    const-string v6, "sbp"

    const-string v8, "bpLastTime"

    const-string v9, "noData"

    const/16 v10, 0x8

    const-string v11, "barChart"

    if-eqz v1, :cond_d

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->bpLastTime:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v0, :cond_2

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_2
    const v1, 0x7f1403bc

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->sbp:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v0, :cond_3

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->dbp:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v0, :cond_4

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_4
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v0, :cond_5

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_5
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->noData:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v0, :cond_6

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_6
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->XIIO11I()Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v0, :cond_7

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_7
    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v0, :cond_8

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_8
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->noData:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v0, :cond_9

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_9
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->mBloodPressureDao:Lcom/sma/smartv3/db/dao/BloodPressureDao;

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->range:[J

    if-nez v1, :cond_a

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_a
    aget-wide v5, v1, v3

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->range:[J

    if-nez v1, :cond_b

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_b
    move-object v2, v1

    :goto_0
    aget-wide v1, v2, v7

    invoke-interface {v0, v5, v6, v1, v2}, Lcom/sma/smartv3/db/dao/BloodPressureDao;->getTestBloodPressures(JJ)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->initChart(Ljava/util/List;)V

    :cond_c
    return-void

    :cond_d
    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v1, :cond_e

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_e
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v1

    invoke-virtual {v1, v7}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v1, :cond_f

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_f
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->noData:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v1, :cond_10

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_10
    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/BloodPressure;

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->bpLastTime:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v4, :cond_11

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v2

    :cond_11
    const/4 v7, 0x3

    invoke-static {v3, v3, v7, v2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->i0X000X0O(ZZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v3

    new-instance v7, Ljava/util/Date;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMTime()J

    move-result-wide v8

    invoke-direct {v7, v8, v9}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v7}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->sbp:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v3, :cond_12

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v2

    :cond_12
    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->dbp:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v3, :cond_13

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_13
    move-object v2, v3

    :goto_1
    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->initChart(Ljava/util/List;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d106b

    return v0
.end method

.method public final onBloodPressureChanged(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "blood_pressure_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onBloodPressureChanged"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/BloodPressureItem;->initView()V

    return-void
.end method
