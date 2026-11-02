.class public final Lcom/sma/smartv3/model/HRDataParse;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/model/HRDataParse;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/model/HRDataParse;

    invoke-direct {v0}, Lcom/sma/smartv3/model/HRDataParse;-><init>()V

    sput-object v0, Lcom/sma/smartv3/model/HRDataParse;->INSTANCE:Lcom/sma/smartv3/model/HRDataParse;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final filterDayData(Landroid/content/Context;Ljava/util/List;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/util/LinkedHashMap;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/HeartRate;",
            ">;",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/db/entity/HeartRate;",
            ">;>;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/HRDayData;",
            ">;",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    const-string v1, "context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "data"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "weekData"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "hrDayDataList"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "values"

    invoke-static {p5, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/HeartRate;

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/HeartRate;->getMTime()J

    move-result-wide v6

    cmp-long v4, v6, v4

    if-gtz v4, :cond_1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {p4}, Ljava/util/List;->clear()V

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/ArrayList;

    new-instance v1, Lcom/sma/smartv3/model/HRDayData;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/sma/smartv3/model/HRDayData;-><init>(IIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-string v3, "iterator(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    move v3, v0

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    const-string v5, "next(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lcom/sma/smartv3/db/entity/HeartRate;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/HRDayData;->getMin()I

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v1}, Lcom/sma/smartv3/model/HRDayData;->getMin()I

    move-result v5

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v6

    if-le v5, v6, :cond_4

    :cond_3
    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v5

    invoke-virtual {v1, v5}, Lcom/sma/smartv3/model/HRDayData;->setMin(I)V

    :cond_4
    invoke-virtual {v1}, Lcom/sma/smartv3/model/HRDayData;->getMax()I

    move-result v5

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v6

    if-ge v5, v6, :cond_5

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v5

    invoke-virtual {v1, v5}, Lcom/sma/smartv3/model/HRDayData;->setMax(I)V

    :cond_5
    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v4

    add-int/2addr v3, v4

    goto :goto_2

    :cond_6
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    div-int/2addr v3, p3

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/model/HRDayData;->setAvg(I)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/HRDayData;->getAvg()I

    move-result p3

    const/16 v2, 0x3c

    const-string v3, "getString(...)"

    if-ge p3, v2, :cond_7

    const p3, 0x7f140e48

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Lcom/sma/smartv3/model/HRDayData;->setStatus(Ljava/lang/String;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v1}, Lcom/sma/smartv3/model/HRDayData;->getAvg()I

    move-result p3

    const/16 v2, 0x64

    if-le p3, v2, :cond_8

    const p3, 0x7f140cd5

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Lcom/sma/smartv3/model/HRDayData;->setStatus(Ljava/lang/String;)V

    goto :goto_3

    :cond_8
    const p3, 0x7f141021

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Lcom/sma/smartv3/model/HRDayData;->setStatus(Ljava/lang/String;)V

    :cond_9
    :goto_3
    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_a
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/sma/smartv3/model/HRDayData;

    new-instance p4, Lcom/github/mikephil/charting/data/BarEntry;

    invoke-virtual {p3}, Lcom/sma/smartv3/model/HRDayData;->getMin()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p3}, Lcom/sma/smartv3/model/HRDayData;->getMax()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p3}, Lcom/sma/smartv3/model/HRDayData;->getMin()I

    move-result p3

    int-to-float p3, p3

    sub-float/2addr v2, p3

    const/4 p3, 0x2

    new-array p3, p3, [F

    aput v1, p3, v0

    const/4 v1, 0x1

    aput v2, p3, v1

    invoke-direct {p4, p2, p3}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(F[F)V

    invoke-interface {p5, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/high16 p3, 0x3f800000    # 1.0f

    add-float/2addr p2, p3

    goto :goto_4

    :cond_b
    return-void
.end method

.method public final filterMinuteData([JLjava/util/List;Ljava/util/List;)Lcom/sma/smartv3/model/HRDayData;
    .locals 19
    .param p1    # [J
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([J",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/HeartRate;",
            ">;",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/Entry;",
            ">;)",
            "Lcom/sma/smartv3/model/HRDayData;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    const-string v2, "range"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "heartRates"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "values"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    const/4 v4, 0x0

    aget-wide v5, v0, v4

    const/4 v11, 0x1

    aget-wide v7, v0, v11

    const-wide/32 v9, 0xea60

    invoke-static/range {v5 .. v10}, Lkotlin/internal/ProgressionUtilKt;->XO0O10(JJJ)J

    move-result-wide v7

    cmp-long v0, v5, v7

    if-gtz v0, :cond_0

    :goto_0
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v9, Lcom/sma/smartv3/model/HRMinuteData;

    invoke-direct {v9, v4, v4}, Lcom/sma/smartv3/model/HRMinuteData;-><init>(II)V

    invoke-interface {v2, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    cmp-long v0, v5, v7

    if-eqz v0, :cond_0

    const-wide/32 v9, 0xea60

    add-long/2addr v5, v9

    goto :goto_0

    :cond_0
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v13, v4

    move v14, v13

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/db/entity/HeartRate;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
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

    check-cast v6, Lcom/sma/smartv3/model/HRMinuteData;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/HeartRate;->getMTime()J

    move-result-wide v9

    cmp-long v7, v9, v7

    if-gtz v7, :cond_2

    invoke-virtual {v6}, Lcom/sma/smartv3/model/HRMinuteData;->getTotal()I

    move-result v5

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v7

    add-int/2addr v5, v7

    invoke-virtual {v6, v5}, Lcom/sma/smartv3/model/HRMinuteData;->setTotal(I)V

    invoke-virtual {v6}, Lcom/sma/smartv3/model/HRMinuteData;->getNum()I

    move-result v5

    add-int/2addr v5, v11

    invoke-virtual {v6, v5}, Lcom/sma/smartv3/model/HRMinuteData;->setNum(I)V

    :cond_3
    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v5

    if-ge v13, v5, :cond_4

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v13

    :cond_4
    if-eqz v14, :cond_5

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v5

    if-le v14, v5, :cond_1

    :cond_5
    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v14

    goto :goto_1

    :cond_6
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    move v3, v4

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sma/smartv3/model/HRMinuteData;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/HRMinuteData;->getNum()I

    move-result v6

    const/high16 v7, 0x3f800000    # 1.0f

    if-eqz v6, :cond_7

    invoke-virtual {v5}, Lcom/sma/smartv3/model/HRMinuteData;->getTotal()I

    move-result v6

    if-eqz v6, :cond_7

    invoke-virtual {v5}, Lcom/sma/smartv3/model/HRMinuteData;->getTotal()I

    move-result v6

    invoke-virtual {v5}, Lcom/sma/smartv3/model/HRMinuteData;->getNum()I

    move-result v5

    div-int/2addr v6, v5

    new-instance v5, Lcom/github/mikephil/charting/data/Entry;

    int-to-float v8, v6

    invoke-direct {v5, v2, v8}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v3, v6

    :cond_7
    add-float/2addr v2, v7

    goto :goto_2

    :cond_8
    new-instance v12, Lcom/sma/smartv3/model/HRDayData;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_9

    :goto_3
    move v15, v4

    goto :goto_4

    :cond_9
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    div-int v4, v3, v0

    goto :goto_3

    :goto_4
    const/16 v17, 0x8

    const/16 v18, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v12 .. v18}, Lcom/sma/smartv3/model/HRDayData;-><init>(IIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v12
.end method

.method public final getHeartRateStatus(I)Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const/16 v0, 0x3c

    if-ge p1, v0, :cond_0

    const p1, 0x7f1403ba

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/16 v0, 0x64

    if-le p1, v0, :cond_1

    const p1, 0x7f1403b8

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const p1, 0x7f141021

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getStateColor(Landroid/content/Context;I)I
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x3c

    if-ge p2, v0, :cond_0

    const p2, 0x7f06001b

    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    return p1

    :cond_0
    const/16 v0, 0x64

    if-le p2, v0, :cond_1

    const p2, 0x7f06001d

    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    return p1

    :cond_1
    const p2, 0x7f06001c

    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    return p1
.end method
