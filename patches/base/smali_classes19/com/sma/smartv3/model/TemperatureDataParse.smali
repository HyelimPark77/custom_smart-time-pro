.class public final Lcom/sma/smartv3/model/TemperatureDataParse;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/model/TemperatureDataParse;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/model/TemperatureDataParse;

    invoke-direct {v0}, Lcom/sma/smartv3/model/TemperatureDataParse;-><init>()V

    sput-object v0, Lcom/sma/smartv3/model/TemperatureDataParse;->INSTANCE:Lcom/sma/smartv3/model/TemperatureDataParse;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final filterDayData(ZLjava/util/List;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;)V
    .locals 7
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
            "(Z",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Temperature;",
            ">;",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/db/entity/Temperature;",
            ">;>;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/TemperatureDayData;",
            ">;",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weekData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tempDayDataList"

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

    check-cast v0, Lcom/sma/smartv3/db/entity/Temperature;

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

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Temperature;->getMTime()J

    move-result-wide v5

    cmp-long v3, v5, v3

    if-gtz v3, :cond_1

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

    const/4 v0, 0x0

    if-eqz p3, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/ArrayList;

    new-instance v1, Lcom/sma/smartv3/model/TemperatureDayData;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/model/TemperatureDayData;-><init>(FFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-eqz v2, :cond_7

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

    check-cast v4, Lcom/sma/smartv3/db/entity/Temperature;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Temperature;->getMTemperature()I

    move-result v4

    invoke-static {v4, p1}, Lcom/android/mltcode/paycertificationapi/cp5;->iIiiO(IZ)F

    move-result v4

    invoke-virtual {v1}, Lcom/sma/smartv3/model/TemperatureDayData;->getMin()F

    move-result v5

    cmpg-float v5, v5, v0

    if-nez v5, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/sma/smartv3/model/TemperatureDayData;->getMin()F

    move-result v5

    cmpl-float v5, v5, v4

    if-lez v5, :cond_4

    :goto_3
    invoke-virtual {v1, v4}, Lcom/sma/smartv3/model/TemperatureDayData;->setMin(F)V

    :cond_4
    invoke-virtual {v1}, Lcom/sma/smartv3/model/TemperatureDayData;->getMax()F

    move-result v5

    cmpg-float v5, v5, v4

    if-gez v5, :cond_5

    invoke-virtual {v1, v4}, Lcom/sma/smartv3/model/TemperatureDayData;->setMax(F)V

    :cond_5
    add-float/2addr v3, v4

    goto :goto_2

    :cond_6
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    int-to-float p3, p3

    div-float/2addr v3, p3

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/model/TemperatureDayData;->setAvg(F)V

    :cond_7
    invoke-interface {p4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sma/smartv3/model/TemperatureDayData;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/TemperatureDayData;->getMax()F

    move-result p3

    invoke-virtual {p2}, Lcom/sma/smartv3/model/TemperatureDayData;->getMin()F

    move-result p4

    cmpg-float p3, p3, p4

    if-nez p3, :cond_9

    invoke-virtual {p2}, Lcom/sma/smartv3/model/TemperatureDayData;->getMin()F

    move-result p3

    const/high16 p4, 0x41f00000    # 30.0f

    cmpl-float p3, p3, p4

    if-lez p3, :cond_9

    invoke-virtual {p2}, Lcom/sma/smartv3/model/TemperatureDayData;->getMax()F

    move-result p3

    const p4, 0x3c23d70a    # 0.01f

    add-float/2addr p3, p4

    invoke-virtual {p2, p3}, Lcom/sma/smartv3/model/TemperatureDayData;->setMax(F)V

    :cond_9
    new-instance p3, Lcom/github/mikephil/charting/data/BarEntry;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/TemperatureDayData;->getMin()F

    move-result p4

    invoke-virtual {p2}, Lcom/sma/smartv3/model/TemperatureDayData;->getMax()F

    move-result v1

    invoke-virtual {p2}, Lcom/sma/smartv3/model/TemperatureDayData;->getMin()F

    move-result p2

    sub-float/2addr v1, p2

    const/4 p2, 0x2

    new-array p2, p2, [F

    const/4 v2, 0x0

    aput p4, p2, v2

    const/4 p4, 0x1

    aput v1, p2, p4

    invoke-direct {p3, v0, p2}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(F[F)V

    invoke-interface {p5, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/high16 p2, 0x3f800000    # 1.0f

    add-float/2addr v0, p2

    goto :goto_4

    :cond_a
    return-void
.end method
