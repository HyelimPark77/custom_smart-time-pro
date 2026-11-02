.class public final Lcom/sma/smartv3/model/PressureDataParse;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/model/PressureDataParse;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/model/PressureDataParse;

    invoke-direct {v0}, Lcom/sma/smartv3/model/PressureDataParse;-><init>()V

    sput-object v0, Lcom/sma/smartv3/model/PressureDataParse;->INSTANCE:Lcom/sma/smartv3/model/PressureDataParse;

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
            "Lcom/sma/smartv3/db/entity/Pressure;",
            ">;",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/db/entity/Pressure;",
            ">;>;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/PressureDayData;",
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

    const-string v1, "pressureDayDataList"

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

    check-cast v1, Lcom/sma/smartv3/db/entity/Pressure;

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

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Pressure;->getMTime()J

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

    if-eqz p3, :cond_b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/ArrayList;

    new-instance v1, Lcom/sma/smartv3/model/PressureDayData;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/sma/smartv3/model/PressureDayData;-><init>(IIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-eqz v2, :cond_a

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

    check-cast v4, Lcom/sma/smartv3/db/entity/Pressure;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/PressureDayData;->getMin()I

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v1}, Lcom/sma/smartv3/model/PressureDayData;->getMin()I

    move-result v5

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Pressure;->getMValue()I

    move-result v6

    if-le v5, v6, :cond_4

    :cond_3
    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Pressure;->getMValue()I

    move-result v5

    invoke-virtual {v1, v5}, Lcom/sma/smartv3/model/PressureDayData;->setMin(I)V

    :cond_4
    invoke-virtual {v1}, Lcom/sma/smartv3/model/PressureDayData;->getMax()I

    move-result v5

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Pressure;->getMValue()I

    move-result v6

    if-ge v5, v6, :cond_5

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Pressure;->getMValue()I

    move-result v5

    invoke-virtual {v1, v5}, Lcom/sma/smartv3/model/PressureDayData;->setMax(I)V

    :cond_5
    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Pressure;->getMValue()I

    move-result v4

    add-int/2addr v3, v4

    goto :goto_2

    :cond_6
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    div-int/2addr v3, p3

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/model/PressureDayData;->setAvg(I)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result p3

    const/16 v2, 0x19

    const-string v3, "getString(...)"

    if-ge p3, v2, :cond_7

    const p3, 0x7f14111c

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Lcom/sma/smartv3/model/PressureDayData;->setStatus(Ljava/lang/String;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v1}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result p3

    const/16 v2, 0x32

    if-ge p3, v2, :cond_8

    const p3, 0x7f14111a

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Lcom/sma/smartv3/model/PressureDayData;->setStatus(Ljava/lang/String;)V

    goto :goto_3

    :cond_8
    invoke-virtual {v1}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result p3

    const/16 v2, 0x4b

    if-ge p3, v2, :cond_9

    const p3, 0x7f141119

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Lcom/sma/smartv3/model/PressureDayData;->setStatus(Ljava/lang/String;)V

    goto :goto_3

    :cond_9
    const p3, 0x7f14111b

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Lcom/sma/smartv3/model/PressureDayData;->setStatus(Ljava/lang/String;)V

    :cond_a
    :goto_3
    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_b
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 p3, 0x0

    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_d

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/sma/smartv3/model/PressureDayData;

    invoke-virtual {p4}, Lcom/sma/smartv3/model/PressureDayData;->getMin()I

    move-result v1

    invoke-virtual {p4}, Lcom/sma/smartv3/model/PressureDayData;->getMin()I

    move-result v2

    invoke-virtual {p4}, Lcom/sma/smartv3/model/PressureDayData;->getMax()I

    move-result v3

    if-ne v2, v3, :cond_c

    move v1, v0

    :cond_c
    new-instance v2, Lcom/github/mikephil/charting/data/BarEntry;

    int-to-float v1, v1

    invoke-virtual {p4}, Lcom/sma/smartv3/model/PressureDayData;->getMax()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v3, v1

    const/4 v4, 0x2

    new-array v4, v4, [F

    aput v1, v4, v0

    const/4 v1, 0x1

    aput v3, v4, v1

    invoke-virtual {p4}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result p4

    invoke-static {p1, p4}, Lcom/sma/smartv3/model/PressureDataKt;->getBarColors(Landroid/content/Context;I)[I

    move-result-object p4

    invoke-direct {v2, p3, v4, p4}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(F[FLjava/lang/Object;)V

    invoke-interface {p5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/high16 p4, 0x3f800000    # 1.0f

    add-float/2addr p3, p4

    goto :goto_4

    :cond_d
    return-void
.end method

.method public final filterHourData(Landroid/content/Context;Ljava/util/List;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;)Lcom/sma/smartv3/model/PressureDayData;
    .locals 16
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
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Pressure;",
            ">;",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/db/entity/Pressure;",
            ">;>;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/PressureDayData;",
            ">;",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;)",
            "Lcom/sma/smartv3/model/PressureDayData;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    const/4 v3, 0x0

    const-string v4, "context"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "data"

    move-object/from16 v5, p2

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "hourData"

    move-object/from16 v6, p3

    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "pressureHourDataList"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "values"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sma/smartv3/db/entity/Pressure;

    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    move-result-wide v9

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/ArrayList;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Pressure;->getMTime()J

    move-result-wide v11

    cmp-long v9, v11, v9

    if-gtz v9, :cond_1

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->clear()V

    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    new-instance v6, Lcom/sma/smartv3/model/PressureDayData;

    const/16 v11, 0xf

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lcom/sma/smartv3/model/PressureDayData;-><init>(IIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-eqz v7, :cond_a

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const-string v8, "iterator(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    move v8, v3

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    const-string v10, "next(...)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Lcom/sma/smartv3/db/entity/Pressure;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/PressureDayData;->getMin()I

    move-result v10

    if-eqz v10, :cond_3

    invoke-virtual {v6}, Lcom/sma/smartv3/model/PressureDayData;->getMin()I

    move-result v10

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Pressure;->getMValue()I

    move-result v11

    if-le v10, v11, :cond_4

    :cond_3
    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Pressure;->getMValue()I

    move-result v10

    invoke-virtual {v6, v10}, Lcom/sma/smartv3/model/PressureDayData;->setMin(I)V

    :cond_4
    invoke-virtual {v6}, Lcom/sma/smartv3/model/PressureDayData;->getMax()I

    move-result v10

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Pressure;->getMValue()I

    move-result v11

    if-ge v10, v11, :cond_5

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Pressure;->getMValue()I

    move-result v10

    invoke-virtual {v6, v10}, Lcom/sma/smartv3/model/PressureDayData;->setMax(I)V

    :cond_5
    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Pressure;->getMValue()I

    move-result v9

    add-int/2addr v8, v9

    goto :goto_2

    :cond_6
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    div-int/2addr v8, v5

    invoke-virtual {v6, v8}, Lcom/sma/smartv3/model/PressureDayData;->setAvg(I)V

    invoke-virtual {v6}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result v5

    const/16 v7, 0x19

    const-string v8, "getString(...)"

    if-ge v5, v7, :cond_7

    const v5, 0x7f14111c

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Lcom/sma/smartv3/model/PressureDayData;->setStatus(Ljava/lang/String;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v6}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result v5

    const/16 v7, 0x32

    if-ge v5, v7, :cond_8

    const v5, 0x7f14111a

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Lcom/sma/smartv3/model/PressureDayData;->setStatus(Ljava/lang/String;)V

    goto :goto_3

    :cond_8
    invoke-virtual {v6}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result v5

    const/16 v7, 0x4b

    if-ge v5, v7, :cond_9

    const v5, 0x7f141119

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Lcom/sma/smartv3/model/PressureDayData;->setStatus(Ljava/lang/String;)V

    goto :goto_3

    :cond_9
    const v5, 0x7f14111b

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Lcom/sma/smartv3/model/PressureDayData;->setStatus(Ljava/lang/String;)V

    :cond_a
    :goto_3
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_b
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v4, 0x0

    move v6, v3

    move v7, v6

    move v8, v7

    move v5, v4

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

    new-instance v13, Lcom/github/mikephil/charting/data/BarEntry;

    const/4 v14, 0x2

    new-array v14, v14, [F

    aput v4, v14, v3

    const/4 v15, 0x1

    aput v12, v14, v15

    invoke-virtual {v9}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result v12

    invoke-static {v0, v12}, Lcom/sma/smartv3/model/PressureDataKt;->getBarColors(Landroid/content/Context;I)[I

    move-result-object v12

    invoke-direct {v13, v5, v14, v12}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(F[FLjava/lang/Object;)V

    invoke-interface {v2, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    int-to-float v12, v6

    cmpg-float v12, v12, v11

    if-gez v12, :cond_c

    float-to-int v6, v11

    :cond_c
    if-nez v7, :cond_d

    invoke-virtual {v9}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result v7

    :cond_d
    cmpg-float v11, v10, v4

    if-nez v11, :cond_e

    goto :goto_5

    :cond_e
    int-to-float v11, v7

    cmpl-float v11, v11, v10

    if-lez v11, :cond_f

    float-to-int v7, v10

    :cond_f
    :goto_5
    invoke-virtual {v9}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result v9

    add-int/2addr v8, v9

    const/high16 v9, 0x3f800000    # 1.0f

    add-float/2addr v5, v9

    goto :goto_4

    :cond_10
    new-instance v5, Lcom/sma/smartv3/model/PressureDayData;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_11

    :goto_6
    move v8, v3

    goto :goto_7

    :cond_11
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    div-int v3, v8, v0

    goto :goto_6

    :goto_7
    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lcom/sma/smartv3/model/PressureDayData;-><init>(IIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5
.end method

.method public final filterMinuteData([JLjava/util/List;Ljava/util/List;)Lcom/sma/smartv3/model/PressureDayData;
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
            "Lcom/sma/smartv3/db/entity/Pressure;",
            ">;",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/Entry;",
            ">;)",
            "Lcom/sma/smartv3/model/PressureDayData;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    const-string v2, "range"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "pressures"

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

    new-instance v9, Lcom/sma/smartv3/model/PressureMinuteData;

    invoke-direct {v9, v4, v4}, Lcom/sma/smartv3/model/PressureMinuteData;-><init>(II)V

    invoke-interface {v2, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    cmp-long v0, v5, v7

    if-eqz v0, :cond_0

    const-wide/32 v9, 0xea60

    add-long/2addr v5, v9

    goto :goto_0

    :cond_0
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/db/entity/Pressure;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

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

    check-cast v6, Lcom/sma/smartv3/model/PressureMinuteData;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Pressure;->getMTime()J

    move-result-wide v9

    cmp-long v7, v9, v7

    if-gtz v7, :cond_2

    invoke-virtual {v6}, Lcom/sma/smartv3/model/PressureMinuteData;->getTotal()I

    move-result v5

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Pressure;->getMValue()I

    move-result v3

    add-int/2addr v5, v3

    invoke-virtual {v6, v5}, Lcom/sma/smartv3/model/PressureMinuteData;->setTotal(I)V

    invoke-virtual {v6}, Lcom/sma/smartv3/model/PressureMinuteData;->getNum()I

    move-result v3

    add-int/2addr v3, v11

    invoke-virtual {v6, v3}, Lcom/sma/smartv3/model/PressureMinuteData;->setNum(I)V

    goto :goto_1

    :cond_3
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    move v3, v4

    move v13, v3

    move v14, v13

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sma/smartv3/model/PressureMinuteData;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/PressureMinuteData;->getNum()I

    move-result v6

    const/high16 v7, 0x3f800000    # 1.0f

    if-eqz v6, :cond_7

    invoke-virtual {v5}, Lcom/sma/smartv3/model/PressureMinuteData;->getTotal()I

    move-result v6

    if-eqz v6, :cond_7

    invoke-virtual {v5}, Lcom/sma/smartv3/model/PressureMinuteData;->getTotal()I

    move-result v6

    invoke-virtual {v5}, Lcom/sma/smartv3/model/PressureMinuteData;->getNum()I

    move-result v5

    div-int/2addr v6, v5

    new-instance v5, Lcom/github/mikephil/charting/data/Entry;

    int-to-float v8, v6

    invoke-direct {v5, v2, v8}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-ge v13, v6, :cond_4

    move v13, v6

    :cond_4
    if-nez v14, :cond_5

    move v14, v6

    :cond_5
    if-gt v11, v6, :cond_6

    if-ge v6, v14, :cond_6

    move v14, v6

    :cond_6
    add-int/2addr v3, v6

    :cond_7
    add-float/2addr v2, v7

    goto :goto_2

    :cond_8
    new-instance v12, Lcom/sma/smartv3/model/PressureDayData;

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

    invoke-direct/range {v12 .. v18}, Lcom/sma/smartv3/model/PressureDayData;-><init>(IIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v12
.end method
