.class public final Lcom/sma/smartv3/model/BPDataParse;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/model/BPDataParse;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/model/BPDataParse;

    invoke-direct {v0}, Lcom/sma/smartv3/model/BPDataParse;-><init>()V

    sput-object v0, Lcom/sma/smartv3/model/BPDataParse;->INSTANCE:Lcom/sma/smartv3/model/BPDataParse;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final filterDayData(Landroid/content/Context;Ljava/util/List;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;)V
    .locals 10
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
            "Lcom/sma/smartv3/db/entity/BloodPressure;",
            ">;",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/db/entity/BloodPressure;",
            ">;>;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/BPDayData;",
            ">;",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-string v2, "context"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "data"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "monthData"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "bpDayDataList"

    invoke-static {p4, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "values"

    invoke-static {p5, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/BloodPressure;

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMTime()J

    move-result-wide v7

    cmp-long v5, v7, v5

    if-gtz v5, :cond_1

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

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

    if-eqz p3, :cond_10

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/ArrayList;

    new-instance v2, Lcom/sma/smartv3/model/BPDayData;

    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lcom/sma/smartv3/model/BPDayData;-><init>(IIIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-eqz v3, :cond_f

    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    const-string v3, "iterator(...)"

    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    move v3, v1

    move v4, v3

    move v5, v4

    :cond_3
    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    const-string v7, "next(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lcom/sma/smartv3/db/entity/BloodPressure;

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v7

    if-nez v7, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v2}, Lcom/sma/smartv3/model/BPDayData;->getDbpMin()I

    move-result v7

    if-eqz v7, :cond_5

    invoke-virtual {v2}, Lcom/sma/smartv3/model/BPDayData;->getDbpMin()I

    move-result v7

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v8

    if-le v7, v8, :cond_6

    :cond_5
    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v7

    invoke-virtual {v2, v7}, Lcom/sma/smartv3/model/BPDayData;->setDbpMin(I)V

    :cond_6
    invoke-virtual {v2}, Lcom/sma/smartv3/model/BPDayData;->getDbpMax()I

    move-result v7

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v8

    if-ge v7, v8, :cond_7

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v7

    invoke-virtual {v2, v7}, Lcom/sma/smartv3/model/BPDayData;->setDbpMax(I)V

    :cond_7
    invoke-virtual {v2}, Lcom/sma/smartv3/model/BPDayData;->getSbpMin()I

    move-result v7

    if-eqz v7, :cond_8

    invoke-virtual {v2}, Lcom/sma/smartv3/model/BPDayData;->getSbpMin()I

    move-result v7

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v8

    if-le v7, v8, :cond_9

    :cond_8
    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v7

    invoke-virtual {v2, v7}, Lcom/sma/smartv3/model/BPDayData;->setSbpMin(I)V

    :cond_9
    invoke-virtual {v2}, Lcom/sma/smartv3/model/BPDayData;->getSbpMax()I

    move-result v7

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v8

    if-ge v7, v8, :cond_a

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v7

    invoke-virtual {v2, v7}, Lcom/sma/smartv3/model/BPDayData;->setSbpMax(I)V

    :cond_a
    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v7

    add-int/2addr v4, v7

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v6

    add-int/2addr v5, v6

    add-int/2addr v3, v0

    goto :goto_2

    :cond_b
    if-eqz v3, :cond_e

    div-int/2addr v4, v3

    div-int/2addr v5, v3

    const/16 p3, 0x8c

    const-string v3, "getString(...)"

    const/16 v6, 0x5a

    if-lt v5, p3, :cond_c

    if-lt v4, v6, :cond_c

    const p3, 0x7f140cd5

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p3}, Lcom/sma/smartv3/model/BPDayData;->setStatus(Ljava/lang/String;)V

    goto :goto_3

    :cond_c
    if-gt v6, v5, :cond_d

    if-ge v5, p3, :cond_d

    const/16 p3, 0x3c

    if-gt p3, v4, :cond_d

    if-ge v4, v6, :cond_d

    const p3, 0x7f141021

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p3}, Lcom/sma/smartv3/model/BPDayData;->setStatus(Ljava/lang/String;)V

    goto :goto_3

    :cond_d
    const p3, 0x7f140e48

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p3}, Lcom/sma/smartv3/model/BPDayData;->setStatus(Ljava/lang/String;)V

    goto :goto_3

    :cond_e
    const-string p3, "--"

    invoke-virtual {v2, p3}, Lcom/sma/smartv3/model/BPDayData;->setStatus(Ljava/lang/String;)V

    :cond_f
    :goto_3
    invoke-interface {p4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_10
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_11

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/sma/smartv3/model/BPDayData;

    new-instance p4, Lcom/github/mikephil/charting/data/BarEntry;

    invoke-virtual {p3}, Lcom/sma/smartv3/model/BPDayData;->getDbpMin()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p3}, Lcom/sma/smartv3/model/BPDayData;->getSbpMax()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p3}, Lcom/sma/smartv3/model/BPDayData;->getDbpMin()I

    move-result p3

    int-to-float p3, p3

    sub-float/2addr v3, p3

    const/4 p3, 0x2

    new-array p3, p3, [F

    aput v2, p3, v1

    aput v3, p3, v0

    invoke-direct {p4, p2, p3}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(F[F)V

    invoke-interface {p5, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/high16 p3, 0x3f800000    # 1.0f

    add-float/2addr p2, p3

    goto :goto_4

    :cond_11
    return-void
.end method

.method public final filterHourData([JLjava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 24
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
    .param p4    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([J",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/BloodPressure;",
            ">;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/BPHourData;",
            ">;",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    const-string v3, "range"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "data"

    move-object/from16 v4, p2

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "hourData"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "values"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    const/4 v5, 0x0

    aget-wide v6, v0, v5

    const/4 v12, 0x1

    aget-wide v8, v0, v12

    const-wide/32 v10, 0x36ee80

    invoke-static/range {v6 .. v11}, Lkotlin/internal/ProgressionUtilKt;->XO0O10(JJJ)J

    move-result-wide v8

    cmp-long v0, v6, v8

    if-gtz v0, :cond_0

    :goto_0
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v13, Lcom/sma/smartv3/model/BPHourData;

    const/16 v22, 0xff

    const/16 v23, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v13 .. v23}, Lcom/sma/smartv3/model/BPHourData;-><init>(IIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v0, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    cmp-long v0, v6, v8

    if-eqz v0, :cond_0

    const-wide/32 v10, 0x36ee80

    add-long/2addr v6, v10

    goto :goto_0

    :cond_0
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/BloodPressure;

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

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

    check-cast v7, Lcom/sma/smartv3/model/BPHourData;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMTime()J

    move-result-wide v10

    cmp-long v8, v10, v8

    if-gez v8, :cond_2

    invoke-virtual {v7}, Lcom/sma/smartv3/model/BPHourData;->getDbpMax()I

    move-result v6

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v8

    if-ge v6, v8, :cond_3

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v6

    invoke-virtual {v7, v6}, Lcom/sma/smartv3/model/BPHourData;->setDbpMax(I)V

    :cond_3
    invoke-virtual {v7}, Lcom/sma/smartv3/model/BPHourData;->getDbpMin()I

    move-result v6

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v8

    if-gt v6, v8, :cond_4

    invoke-virtual {v7}, Lcom/sma/smartv3/model/BPHourData;->getDbpMin()I

    move-result v6

    if-nez v6, :cond_5

    :cond_4
    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v6

    invoke-virtual {v7, v6}, Lcom/sma/smartv3/model/BPHourData;->setDbpMin(I)V

    :cond_5
    invoke-virtual {v7}, Lcom/sma/smartv3/model/BPHourData;->getSbpMax()I

    move-result v6

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v8

    if-ge v6, v8, :cond_6

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v6

    invoke-virtual {v7, v6}, Lcom/sma/smartv3/model/BPHourData;->setSbpMax(I)V

    :cond_6
    invoke-virtual {v7}, Lcom/sma/smartv3/model/BPHourData;->getSbpMin()I

    move-result v6

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v8

    if-gt v6, v8, :cond_7

    invoke-virtual {v7}, Lcom/sma/smartv3/model/BPHourData;->getSbpMin()I

    move-result v6

    if-nez v6, :cond_8

    :cond_7
    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v6

    invoke-virtual {v7, v6}, Lcom/sma/smartv3/model/BPHourData;->setSbpMin(I)V

    :cond_8
    invoke-virtual {v7}, Lcom/sma/smartv3/model/BPHourData;->getDbpTotal()I

    move-result v6

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v8

    add-int/2addr v6, v8

    invoke-virtual {v7, v6}, Lcom/sma/smartv3/model/BPHourData;->setDbpTotal(I)V

    invoke-virtual {v7}, Lcom/sma/smartv3/model/BPHourData;->getDbpNum()I

    move-result v6

    add-int/2addr v6, v12

    invoke-virtual {v7, v6}, Lcom/sma/smartv3/model/BPHourData;->setDbpNum(I)V

    invoke-virtual {v7}, Lcom/sma/smartv3/model/BPHourData;->getSbpTotal()I

    move-result v6

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v4

    add-int/2addr v6, v4

    invoke-virtual {v7, v6}, Lcom/sma/smartv3/model/BPHourData;->setSbpTotal(I)V

    invoke-virtual {v7}, Lcom/sma/smartv3/model/BPHourData;->getSbpNum()I

    move-result v4

    add-int/2addr v4, v12

    invoke-virtual {v7, v4}, Lcom/sma/smartv3/model/BPHourData;->setSbpNum(I)V

    goto/16 :goto_1

    :cond_9
    invoke-interface {v1}, Ljava/util/List;->clear()V

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v3, v5

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/model/BPHourData;

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v6, Lcom/github/mikephil/charting/data/BarEntry;

    int-to-float v7, v3

    invoke-virtual {v4}, Lcom/sma/smartv3/model/BPHourData;->getDbpMin()I

    move-result v8

    int-to-float v8, v8

    invoke-virtual {v4}, Lcom/sma/smartv3/model/BPHourData;->getDbpMax()I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v4}, Lcom/sma/smartv3/model/BPHourData;->getDbpMin()I

    move-result v10

    int-to-float v10, v10

    sub-float/2addr v9, v10

    invoke-virtual {v4}, Lcom/sma/smartv3/model/BPHourData;->getSbpMin()I

    move-result v10

    int-to-float v10, v10

    invoke-virtual {v4}, Lcom/sma/smartv3/model/BPHourData;->getDbpMax()I

    move-result v11

    int-to-float v11, v11

    sub-float/2addr v10, v11

    invoke-virtual {v4}, Lcom/sma/smartv3/model/BPHourData;->getSbpMax()I

    move-result v11

    int-to-float v11, v11

    invoke-virtual {v4}, Lcom/sma/smartv3/model/BPHourData;->getSbpMin()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v11, v4

    const/4 v4, 0x4

    new-array v4, v4, [F

    aput v8, v4, v5

    aput v9, v4, v12

    const/4 v8, 0x2

    aput v10, v4, v8

    const/4 v8, 0x3

    aput v11, v4, v8

    invoke-direct {v6, v7, v4}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(F[F)V

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/2addr v3, v12

    goto :goto_2

    :cond_a
    return-void
.end method
