.class public final Lcom/sma/smartv3/model/SleepDataParse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSleepData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepData.kt\ncom/sma/smartv3/model/SleepDataParse\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n1573#2:175\n1604#2,4:176\n*S KotlinDebug\n*F\n+ 1 SleepData.kt\ncom/sma/smartv3/model/SleepDataParse\n*L\n31#1:175\n31#1:176,4\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSleepData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepData.kt\ncom/sma/smartv3/model/SleepDataParse\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n1573#2:175\n1604#2,4:176\n*S KotlinDebug\n*F\n+ 1 SleepData.kt\ncom/sma/smartv3/model/SleepDataParse\n*L\n31#1:175\n31#1:176,4\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/model/SleepDataParse;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/model/SleepDataParse;

    invoke-direct {v0}, Lcom/sma/smartv3/model/SleepDataParse;-><init>()V

    sput-object v0, Lcom/sma/smartv3/model/SleepDataParse;->INSTANCE:Lcom/sma/smartv3/model/SleepDataParse;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic filterData$default(Lcom/sma/smartv3/model/SleepDataParse;Ljava/util/List;FLjava/util/List;ILjava/lang/Object;)Lcom/sma/smartv3/model/SleepDayData;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/high16 p2, 0x42c80000    # 100.0f

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/model/SleepDataParse;->filterData(Ljava/util/List;FLjava/util/List;)Lcom/sma/smartv3/model/SleepDayData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final filterData(Ljava/util/List;FLjava/util/List;)Lcom/sma/smartv3/model/SleepDayData;
    .locals 16
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Sleep;",
            ">;F",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;)",
            "Lcom/sma/smartv3/model/SleepDayData;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    const-string v2, "data"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v3, Lcom/sma/smartv3/model/SleepDayData;

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lcom/sma/smartv3/model/SleepDayData;-><init>(IILandroid/util/SparseIntArray;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_0
    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/db/entity/Sleep;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Sleep;->getMAlgorithmType()I

    move-result v3

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v0, v5}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v5, v2

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v5, 0x1

    if-gez v5, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_1
    check-cast v6, Lcom/sma/smartv3/db/entity/Sleep;

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Sleep;->getMMode()I

    move-result v5

    const/16 v8, 0x11

    if-ne v5, v8, :cond_2

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Sleep;->getMAlgorithmType()I

    move-result v3

    :cond_2
    new-instance v5, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Sleep;->getMTime()J

    move-result-wide v8

    const/16 v10, 0x3e8

    int-to-long v10, v10

    div-long/2addr v8, v10

    long-to-int v8, v8

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Sleep;->getMMode()I

    move-result v9

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Sleep;->getMSoft()I

    move-result v10

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Sleep;->getMStrong()I

    move-result v6

    invoke-direct {v5, v8, v9, v10, v6}, Lcom/szabh/smable3/entity/BleSleep;-><init>(IIII)V

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v5, v7

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "source "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/szabh/smable3/entity/BleSleep;->Companion:Lcom/szabh/smable3/entity/BleSleep$Companion;

    invoke-virtual {v0, v4, v3}, Lcom/szabh/smable3/entity/BleSleep$Companion;->analyseSleep(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_4

    new-instance v6, Lcom/sma/smartv3/model/SleepDayData;

    const/16 v11, 0xf

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lcom/sma/smartv3/model/SleepDayData;-><init>(IILandroid/util/SparseIntArray;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :cond_4
    move v5, v2

    move v6, v5

    :cond_5
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v7

    const/4 v8, 0x1

    sub-int/2addr v7, v8

    const/4 v9, 0x3

    const/4 v10, 0x2

    if-ge v5, v7, :cond_a

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/szabh/smable3/entity/BleSleep;

    if-nez v5, :cond_6

    invoke-virtual {v7}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v11

    div-int/lit8 v11, v11, 0x3c

    goto :goto_1

    :cond_6
    invoke-virtual {v7}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v11

    div-int/lit8 v11, v11, 0x3c

    add-int/2addr v11, v8

    :goto_1
    add-int/lit8 v5, v5, 0x1

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v12}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v12

    div-int/lit8 v12, v12, 0x3c

    if-gt v11, v12, :cond_5

    :goto_2
    invoke-virtual {v7}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v13

    const/4 v14, 0x0

    if-eq v13, v8, :cond_8

    if-eq v13, v10, :cond_7

    new-array v13, v9, [F

    aput v14, v13, v2

    aput v14, v13, v8

    aput p2, v13, v10

    goto :goto_3

    :cond_7
    new-array v13, v9, [F

    aput v14, v13, v2

    aput p2, v13, v8

    aput v14, v13, v10

    goto :goto_3

    :cond_8
    new-array v13, v9, [F

    aput p2, v13, v2

    aput v14, v13, v8

    aput v14, v13, v10

    :goto_3
    if-eqz v1, :cond_9

    new-instance v14, Lcom/github/mikephil/charting/data/BarEntry;

    int-to-float v15, v6

    invoke-direct {v14, v15, v13}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(F[F)V

    invoke-interface {v1, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    add-int/lit8 v6, v6, 0x1

    if-eq v11, v12, :cond_5

    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_a
    if-ne v3, v8, :cond_b

    sget-object v1, Lcom/szabh/smable3/entity/BleSleep;->Companion:Lcom/szabh/smable3/entity/BleSleep$Companion;

    invoke-virtual {v1, v0, v4}, Lcom/szabh/smable3/entity/BleSleep$Companion;->getSleepStatusDuration(Ljava/util/List;Ljava/util/List;)Landroid/util/SparseIntArray;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/util/SparseIntArray;->get(I)I

    move-result v2

    :goto_4
    move-object v6, v1

    move v4, v2

    goto :goto_5

    :cond_b
    sget-object v1, Lcom/szabh/smable3/entity/BleSleep;->Companion:Lcom/szabh/smable3/entity/BleSleep$Companion;

    invoke-virtual {v1, v0}, Lcom/szabh/smable3/entity/BleSleep$Companion;->getSleepStatusDuration(Ljava/util/List;)Landroid/util/SparseIntArray;

    move-result-object v1

    invoke-virtual {v1, v10}, Landroid/util/SparseIntArray;->get(I)I

    move-result v2

    invoke-virtual {v1, v8}, Landroid/util/SparseIntArray;->get(I)I

    move-result v3

    add-int/2addr v2, v3

    invoke-virtual {v1, v9}, Landroid/util/SparseIntArray;->get(I)I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_4

    :goto_5
    new-instance v3, Lcom/sma/smartv3/model/SleepDayData;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v5

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lcom/sma/smartv3/model/SleepDayData;-><init>(IILandroid/util/SparseIntArray;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

.method public final filterDayData(Landroid/content/Context;Ljava/util/List;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;)I
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
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Sleep;",
            ">;",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/db/entity/Sleep;",
            ">;>;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/SleepDayData;",
            ">;",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;)I"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    const-string v4, "context"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "data"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "monthData"

    move-object/from16 v5, p3

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "sleepDayDataList"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "values"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    const/4 v6, 0x0

    if-nez v4, :cond_d

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/Sleep;

    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

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

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Sleep;->getMTime()J

    move-result-wide v11

    cmp-long v9, v11, v9

    if-gtz v9, :cond_1

    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Ljava/util/ArrayList;

    new-instance v9, Lcom/sma/smartv3/model/SleepDayData;

    const/16 v14, 0xf

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lcom/sma/smartv3/model/SleepDayData;-><init>(IILandroid/util/SparseIntArray;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_8

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v7, p0

    invoke-static/range {v7 .. v12}, Lcom/sma/smartv3/model/SleepDataParse;->filterData$default(Lcom/sma/smartv3/model/SleepDataParse;Ljava/util/List;FLjava/util/List;ILjava/lang/Object;)Lcom/sma/smartv3/model/SleepDayData;

    move-result-object v9

    invoke-virtual {v9}, Lcom/sma/smartv3/model/SleepDayData;->getTotal()I

    move-result v4

    const/16 v7, 0x3c

    if-le v4, v7, :cond_7

    invoke-virtual {v9}, Lcom/sma/smartv3/model/SleepDayData;->getTotal()I

    move-result v4

    const/16 v8, 0x21c

    const-string v10, "getString(...)"

    if-le v4, v8, :cond_3

    const v4, 0x7f14126b

    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Lcom/sma/smartv3/model/SleepDayData;->setEvaluation(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v9}, Lcom/sma/smartv3/model/SleepDayData;->getTotal()I

    move-result v4

    const/16 v8, 0x1a4

    const v11, 0x7f1401ae

    if-le v4, v8, :cond_6

    invoke-virtual {v9}, Lcom/sma/smartv3/model/SleepDayData;->getStatus()Landroid/util/SparseIntArray;

    move-result-object v4

    invoke-virtual {v4, v5}, Landroid/util/SparseIntArray;->get(I)I

    move-result v4

    const/16 v8, 0x78

    if-lt v4, v8, :cond_4

    const v4, 0x7f140c68

    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Lcom/sma/smartv3/model/SleepDayData;->setEvaluation(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v9}, Lcom/sma/smartv3/model/SleepDayData;->getStatus()Landroid/util/SparseIntArray;

    move-result-object v4

    invoke-virtual {v4, v5}, Landroid/util/SparseIntArray;->get(I)I

    move-result v4

    if-lt v4, v7, :cond_5

    const v4, 0x7f140c41

    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Lcom/sma/smartv3/model/SleepDayData;->setEvaluation(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v0, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Lcom/sma/smartv3/model/SleepDayData;->setEvaluation(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    invoke-virtual {v0, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Lcom/sma/smartv3/model/SleepDayData;->setEvaluation(Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    invoke-virtual {v9, v6}, Lcom/sma/smartv3/model/SleepDayData;->setTotal(I)V

    const-string v4, "--"

    invoke-virtual {v9, v4}, Lcom/sma/smartv3/model/SleepDayData;->setEvaluation(Ljava/lang/String;)V

    :cond_8
    :goto_2
    invoke-interface {v2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_9
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v6

    :cond_a
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/model/SleepDayData;

    new-instance v7, Lcom/github/mikephil/charting/data/BarEntry;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/SleepDayData;->getTotal()I

    move-result v8

    int-to-float v8, v8

    const/high16 v9, 0x42700000    # 60.0f

    div-float/2addr v8, v9

    invoke-direct {v7, v1, v8}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(FF)V

    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/high16 v7, 0x3f800000    # 1.0f

    add-float/2addr v1, v7

    invoke-virtual {v4}, Lcom/sma/smartv3/model/SleepDayData;->getTotal()I

    move-result v7

    if-eqz v7, :cond_a

    invoke-virtual {v4}, Lcom/sma/smartv3/model/SleepDayData;->getTotal()I

    move-result v4

    add-int/2addr v6, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " sleep "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    if-nez v2, :cond_c

    goto :goto_4

    :cond_c
    move v5, v2

    :goto_4
    div-int/2addr v6, v5

    :cond_d
    return v6
.end method
