.class public final Lcom/sma/smartv3/model/BloodGlucose2DataParse;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/model/BloodGlucose2DataParse;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/model/BloodGlucose2DataParse;

    invoke-direct {v0}, Lcom/sma/smartv3/model/BloodGlucose2DataParse;-><init>()V

    sput-object v0, Lcom/sma/smartv3/model/BloodGlucose2DataParse;->INSTANCE:Lcom/sma/smartv3/model/BloodGlucose2DataParse;

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
            "Lcom/sma/smartv3/db/entity/BloodGlucose2;",
            ">;",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/db/entity/BloodGlucose2;",
            ">;>;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/BloodGlucose2DayData;",
            ">;",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    const-string v1, "context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "data"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "weekData"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "bloodGlucoseDayDataList"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "values"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sma/smartv3/db/entity/BloodGlucose2;

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

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMTime()J

    move-result-wide v5

    cmp-long v3, v5, v3

    if-gez v3, :cond_1

    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {p4}, Ljava/util/List;->clear()V

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/ArrayList;

    new-instance v1, Lcom/sma/smartv3/model/BloodGlucose2DayData;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/model/BloodGlucose2DayData;-><init>(IILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p2, v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OI1O(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sma/smartv3/db/entity/BloodGlucose2;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMLowerBound()D

    move-result-wide v2

    const/16 p3, 0xa

    int-to-double v4, p3

    mul-double/2addr v2, v4

    double-to-int p3, v2

    invoke-virtual {v1, p3}, Lcom/sma/smartv3/model/BloodGlucose2DayData;->setMin(I)V

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMUpperBound()D

    move-result-wide p2

    mul-double/2addr p2, v4

    double-to-int p2, p2

    invoke-virtual {v1, p2}, Lcom/sma/smartv3/model/BloodGlucose2DayData;->setMax(I)V

    :cond_3
    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/sma/smartv3/model/BloodGlucose2DayData;

    new-instance p4, Lcom/github/mikephil/charting/data/BarEntry;

    invoke-virtual {p3}, Lcom/sma/smartv3/model/BloodGlucose2DayData;->getMin()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p3}, Lcom/sma/smartv3/model/BloodGlucose2DayData;->getMax()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p3}, Lcom/sma/smartv3/model/BloodGlucose2DayData;->getMin()I

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

    goto :goto_2

    :cond_5
    return-void
.end method

.method public final filterHourData(Landroid/content/Context;Ljava/util/List;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;)V
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
            "Lcom/sma/smartv3/db/entity/BloodGlucose2;",
            ">;",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/db/entity/BloodGlucose2;",
            ">;>;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/BloodGlucose2DayData;",
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

    const-string p1, "data"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "hourData"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "hourDataList"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "values"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sma/smartv3/db/entity/BloodGlucose2;

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

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMTime()J

    move-result-wide v6

    cmp-long v4, v6, v4

    if-gtz v4, :cond_1

    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {p4}, Ljava/util/List;->clear()V

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move p2, v1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/ArrayList;

    new-instance v2, Lcom/sma/smartv3/model/BloodGlucose2DayData;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/sma/smartv3/model/BloodGlucose2DayData;-><init>(IILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-nez p2, :cond_3

    invoke-static {p3, v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OI1O(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/sma/smartv3/db/entity/BloodGlucose2;

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMLowerBound()D

    move-result-wide v3

    const/16 p2, 0xa

    int-to-double v5, p2

    mul-double/2addr v3, v5

    double-to-int p2, v3

    invoke-virtual {v2, p2}, Lcom/sma/smartv3/model/BloodGlucose2DayData;->setMin(I)V

    invoke-virtual {p3}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMUpperBound()D

    move-result-wide p2

    mul-double/2addr p2, v5

    double-to-int p2, p2

    invoke-virtual {v2, p2}, Lcom/sma/smartv3/model/BloodGlucose2DayData;->setMax(I)V

    move p2, v0

    :cond_3
    invoke-interface {p4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/sma/smartv3/model/BloodGlucose2DayData;

    new-instance p4, Lcom/github/mikephil/charting/data/BarEntry;

    invoke-virtual {p3}, Lcom/sma/smartv3/model/BloodGlucose2DayData;->getMin()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p3}, Lcom/sma/smartv3/model/BloodGlucose2DayData;->getMax()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p3}, Lcom/sma/smartv3/model/BloodGlucose2DayData;->getMin()I

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

    goto :goto_2

    :cond_5
    return-void
.end method
