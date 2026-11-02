.class public final Lcom/sma/smartv3/model/HRVDataParse;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/model/HRVDataParse;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/model/HRVDataParse;

    invoke-direct {v0}, Lcom/sma/smartv3/model/HRVDataParse;-><init>()V

    sput-object v0, Lcom/sma/smartv3/model/HRVDataParse;->INSTANCE:Lcom/sma/smartv3/model/HRVDataParse;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final filterDayData(Landroid/content/Context;Ljava/util/List;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;)V
    .locals 7
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
            "Lcom/sma/smartv3/db/entity/Hrv;",
            ">;",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/db/entity/Hrv;",
            ">;>;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/HRVDayData;",
            ">;",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/Entry;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weekData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hrvDayDataList"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "values"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/entity/Hrv;

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Hrv;->getMTime()J

    move-result-wide v5

    cmp-long v3, v5, v3

    if-gez v3, :cond_1

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

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

    new-instance v0, Lcom/sma/smartv3/model/HRVDayData;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/sma/smartv3/model/HRVDayData;-><init>(IIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-string v2, "iterator(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "next(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lcom/sma/smartv3/db/entity/Hrv;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/HRVDayData;->getMin()I

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v0}, Lcom/sma/smartv3/model/HRVDayData;->getMin()I

    move-result v4

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Hrv;->getMValue()I

    move-result v5

    if-le v4, v5, :cond_4

    :cond_3
    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Hrv;->getMValue()I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/sma/smartv3/model/HRVDayData;->setMin(I)V

    :cond_4
    invoke-virtual {v0}, Lcom/sma/smartv3/model/HRVDayData;->getMax()I

    move-result v4

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Hrv;->getMValue()I

    move-result v5

    if-ge v4, v5, :cond_5

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Hrv;->getMValue()I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/sma/smartv3/model/HRVDayData;->setMax(I)V

    :cond_5
    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Hrv;->getMValue()I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_2

    :cond_6
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    div-int/2addr v2, p3

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/model/HRVDayData;->setAvg(I)V

    invoke-virtual {v0}, Lcom/sma/smartv3/model/HRVDayData;->getAvg()I

    move-result p3

    const/16 v1, 0x3c

    const-string v2, "getString(...)"

    if-ge p3, v1, :cond_7

    const p3, 0x7f140e48

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Lcom/sma/smartv3/model/HRVDayData;->setStatus(Ljava/lang/String;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v0}, Lcom/sma/smartv3/model/HRVDayData;->getAvg()I

    move-result p3

    const/16 v1, 0x64

    if-le p3, v1, :cond_8

    const p3, 0x7f140cd5

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Lcom/sma/smartv3/model/HRVDayData;->setStatus(Ljava/lang/String;)V

    goto :goto_3

    :cond_8
    const p3, 0x7f141021

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Lcom/sma/smartv3/model/HRVDayData;->setStatus(Ljava/lang/String;)V

    :cond_9
    :goto_3
    invoke-interface {p4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_a
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/sma/smartv3/model/HRVDayData;

    invoke-virtual {p3}, Lcom/sma/smartv3/model/HRVDayData;->getAvg()I

    move-result p4

    if-eqz p4, :cond_b

    new-instance p4, Lcom/github/mikephil/charting/data/Entry;

    invoke-virtual {p3}, Lcom/sma/smartv3/model/HRVDayData;->getAvg()I

    move-result p3

    int-to-float p3, p3

    invoke-direct {p4, p2, p3}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-interface {p5, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_b
    const/high16 p3, 0x3f800000    # 1.0f

    add-float/2addr p2, p3

    goto :goto_4

    :cond_c
    return-void
.end method

.method public final filterMinuteData([JLjava/util/List;Ljava/util/List;)Lcom/sma/smartv3/model/HRVDayData;
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
            "Lcom/sma/smartv3/db/entity/Hrv;",
            ">;",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/Entry;",
            ">;)",
            "Lcom/sma/smartv3/model/HRVDayData;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    const-string v2, "range"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "hrvs"

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

    new-instance v9, Lcom/sma/smartv3/model/HRVMinuteData;

    invoke-direct {v9, v4, v4}, Lcom/sma/smartv3/model/HRVMinuteData;-><init>(II)V

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

    check-cast v3, Lcom/sma/smartv3/db/entity/Hrv;

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

    check-cast v6, Lcom/sma/smartv3/model/HRVMinuteData;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Hrv;->getMTime()J

    move-result-wide v9

    cmp-long v7, v9, v7

    if-gtz v7, :cond_2

    invoke-virtual {v6}, Lcom/sma/smartv3/model/HRVMinuteData;->getTotal()I

    move-result v5

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Hrv;->getMValue()I

    move-result v3

    add-int/2addr v5, v3

    invoke-virtual {v6, v5}, Lcom/sma/smartv3/model/HRVMinuteData;->setTotal(I)V

    invoke-virtual {v6}, Lcom/sma/smartv3/model/HRVMinuteData;->getNum()I

    move-result v3

    add-int/2addr v3, v11

    invoke-virtual {v6, v3}, Lcom/sma/smartv3/model/HRVMinuteData;->setNum(I)V

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

    check-cast v5, Lcom/sma/smartv3/model/HRVMinuteData;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/HRVMinuteData;->getNum()I

    move-result v6

    const/high16 v7, 0x3f800000    # 1.0f

    if-eqz v6, :cond_7

    invoke-virtual {v5}, Lcom/sma/smartv3/model/HRVMinuteData;->getTotal()I

    move-result v6

    if-eqz v6, :cond_7

    invoke-virtual {v5}, Lcom/sma/smartv3/model/HRVMinuteData;->getTotal()I

    move-result v6

    invoke-virtual {v5}, Lcom/sma/smartv3/model/HRVMinuteData;->getNum()I

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
    new-instance v12, Lcom/sma/smartv3/model/HRVDayData;

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

    invoke-direct/range {v12 .. v18}, Lcom/sma/smartv3/model/HRVDayData;-><init>(IIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v12
.end method
