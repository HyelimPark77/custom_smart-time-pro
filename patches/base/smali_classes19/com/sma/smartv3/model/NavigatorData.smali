.class public final Lcom/sma/smartv3/model/NavigatorData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNavigatorData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorData.kt\ncom/sma/smartv3/model/NavigatorData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n1669#2,8:214\n1669#2,8:222\n1788#2,4:231\n1788#2,4:235\n1788#2,4:239\n1788#2,4:243\n1788#2,4:247\n1788#2,4:251\n1788#2,4:255\n1788#2,4:259\n1788#2,4:263\n1#3:230\n*S KotlinDebug\n*F\n+ 1 NavigatorData.kt\ncom/sma/smartv3/model/NavigatorData\n*L\n87#1:214,8\n88#1:222,8\n153#1:231,4\n154#1:235,4\n155#1:239,4\n165#1:243,4\n171#1:247,4\n177#1:251,4\n190#1:255,4\n195#1:259,4\n200#1:263,4\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNavigatorData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorData.kt\ncom/sma/smartv3/model/NavigatorData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n1669#2,8:214\n1669#2,8:222\n1788#2,4:231\n1788#2,4:235\n1788#2,4:239\n1788#2,4:243\n1788#2,4:247\n1788#2,4:251\n1788#2,4:255\n1788#2,4:259\n1788#2,4:263\n1#3:230\n*S KotlinDebug\n*F\n+ 1 NavigatorData.kt\ncom/sma/smartv3/model/NavigatorData\n*L\n87#1:214,8\n88#1:222,8\n153#1:231,4\n154#1:235,4\n155#1:239,4\n165#1:243,4\n171#1:247,4\n177#1:251,4\n190#1:255,4\n195#1:259,4\n200#1:263,4\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/model/NavigatorData;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/model/NavigatorData;

    invoke-direct {v0}, Lcom/sma/smartv3/model/NavigatorData;-><init>()V

    sput-object v0, Lcom/sma/smartv3/model/NavigatorData;->INSTANCE:Lcom/sma/smartv3/model/NavigatorData;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$packageData(Lcom/sma/smartv3/model/NavigatorData;JLjava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/sma/smartv3/model/NavigatorData;->packageData(JLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic getTimestamps$default(Lcom/sma/smartv3/model/NavigatorData;IIJILjava/lang/Object;)J
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    const-wide/16 p3, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/model/NavigatorData;->getTimestamps(IIJ)J

    move-result-wide p0

    return-wide p0
.end method

.method private final packageData(JLjava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Workout;",
            ">;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Workout;",
            ">;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/NavigatorItem;",
            ">;)V"
        }
    .end annotation

    invoke-interface/range {p4 .. p4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    move-object/from16 v0, p3

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object/from16 v0, p4

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-static {v3}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/sma/smartv3/db/entity/Workout;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const/4 v4, 0x1

    :goto_2
    const/16 v5, 0x20

    if-ge v4, v5, :cond_5

    const v5, 0x15180

    mul-int/2addr v5, v4

    int-to-long v5, v5

    const-wide/16 v7, 0x3e8

    mul-long/2addr v5, v7

    add-long v5, p1, v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_5
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_6
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sma/smartv3/db/entity/Workout;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    move-result-wide v10

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/ArrayList;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v12

    cmp-long v8, v12, v10

    if-gez v8, :cond_7

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v8, 0x0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    const/16 v12, 0xa

    const/16 v22, 0x0

    if-eqz v11, :cond_1d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map$Entry;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/ArrayList;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_1b

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    move/from16 v14, v22

    :goto_5
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_9

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual/range {v16 .. v16}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetTime()I

    move-result v16

    add-int v14, v14, v16

    goto :goto_5

    :cond_9
    if-eqz v14, :cond_b

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    move/from16 v14, v22

    :goto_6
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_a

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual/range {v16 .. v16}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetTime()I

    move-result v16

    add-int v14, v14, v16

    goto :goto_6

    :cond_a
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v13

    div-int/2addr v14, v13

    int-to-float v13, v14

    new-instance v14, Lcom/github/mikephil/charting/data/Entry;

    invoke-direct {v14, v8, v13}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-interface {v15, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_b
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    move/from16 v14, v22

    :goto_7
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_c

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual/range {v16 .. v16}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorActualTime()I

    move-result v16

    add-int v14, v14, v16

    goto :goto_7

    :cond_c
    if-eqz v14, :cond_e

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    move/from16 v14, v22

    :goto_8
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_d

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual/range {v16 .. v16}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorActualTime()I

    move-result v16

    add-int v14, v14, v16

    goto :goto_8

    :cond_d
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v13

    div-int/2addr v14, v13

    int-to-float v13, v14

    new-instance v14, Lcom/github/mikephil/charting/data/Entry;

    invoke-direct {v14, v8, v13}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-interface {v4, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_e
    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v13

    if-ne v13, v12, :cond_15

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    const-wide/16 v16, 0x0

    :goto_9
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_f

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lcom/sma/smartv3/db/entity/Workout;

    const/16 p1, 0x0

    invoke-virtual/range {v18 .. v18}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetSpeedV2()F

    move-result v7

    const-wide/16 p2, 0x0

    float-to-double v13, v7

    add-double v16, v16, v13

    goto :goto_9

    :cond_f
    const/16 p1, 0x0

    const-wide/16 p2, 0x0

    cmpg-double v7, v16, p2

    if-nez v7, :cond_10

    move-object/from16 v17, v2

    goto :goto_b

    :cond_10
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move-wide/from16 v12, p2

    :goto_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_11

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v14}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetSpeedV2()F

    move-result v14

    move-object/from16 v17, v2

    float-to-double v1, v14

    add-double/2addr v12, v1

    move-object/from16 v2, v17

    goto :goto_a

    :cond_11
    move-object/from16 v17, v2

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v1

    int-to-double v1, v1

    div-double/2addr v12, v1

    double-to-float v1, v12

    new-instance v2, Lcom/github/mikephil/charting/data/Entry;

    invoke-direct {v2, v8, v1}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_b
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-wide/from16 v12, p2

    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetSpeedV2()F

    move-result v2

    move-object v7, v0

    move-object v14, v1

    float-to-double v0, v2

    add-double/2addr v12, v0

    move-object v0, v7

    move-object v1, v14

    goto :goto_c

    :cond_12
    move-object v7, v0

    cmpg-double v0, v12, p2

    if-nez v0, :cond_13

    goto/16 :goto_12

    :cond_13
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-wide/from16 v13, p2

    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetSpeedV2()F

    move-result v1

    float-to-double v1, v1

    add-double/2addr v13, v1

    goto :goto_d

    :cond_14
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v0

    int-to-double v0, v0

    div-double/2addr v13, v0

    double-to-float v0, v13

    new-instance v1, Lcom/github/mikephil/charting/data/Entry;

    invoke-direct {v1, v8, v0}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_12

    :cond_15
    move-object v7, v0

    move-object/from16 v17, v2

    const/16 p1, 0x0

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move/from16 v1, v22

    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetPace()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_e

    :cond_16
    if-eqz v1, :cond_18

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move/from16 v1, v22

    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetPace()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_f

    :cond_17
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v0

    div-int/2addr v1, v0

    int-to-float v0, v1

    new-instance v1, Lcom/github/mikephil/charting/data/Entry;

    invoke-direct {v1, v8, v0}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-interface {v5, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_18
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move/from16 v1, v22

    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorActualPace()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_10

    :cond_19
    if-eqz v1, :cond_1c

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorActualPace()I

    move-result v1

    add-int v22, v22, v1

    goto :goto_11

    :cond_1a
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v0

    div-int v0, v22, v0

    int-to-float v0, v0

    new-instance v1, Lcom/github/mikephil/charting/data/Entry;

    invoke-direct {v1, v8, v0}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-interface {v6, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_12

    :cond_1b
    move-object v7, v0

    move-object/from16 v17, v2

    const/16 p1, 0x0

    :cond_1c
    :goto_12
    const/high16 v0, 0x3f800000    # 1.0f

    add-float/2addr v8, v0

    move-object v0, v7

    move-object/from16 v2, v17

    goto/16 :goto_4

    :cond_1d
    move-object/from16 v17, v2

    const/16 p1, 0x0

    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1e

    move/from16 v1, v22

    goto :goto_14

    :cond_1e
    invoke-interface/range {v17 .. v17}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move/from16 v1, v22

    :cond_1f
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_20

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorStatusTime()I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v8, :cond_1f

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetTime()I

    move-result v2

    if-eqz v2, :cond_1f

    add-int/lit8 v1, v1, 0x1

    if-gez v1, :cond_1f

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->OO()V

    goto :goto_13

    :cond_20
    :goto_14
    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v2, 0x2

    if-eqz v0, :cond_21

    move/from16 v13, v22

    goto :goto_16

    :cond_21
    invoke-interface/range {v17 .. v17}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move/from16 v7, v22

    :cond_22
    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_23

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorStatusTime()I

    move-result v11

    if-ne v11, v2, :cond_22

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetTime()I

    move-result v8

    if-eqz v8, :cond_22

    add-int/lit8 v7, v7, 0x1

    if-gez v7, :cond_22

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->OO()V

    goto :goto_15

    :cond_23
    move v13, v7

    :goto_16
    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_24

    move/from16 v14, v22

    goto :goto_18

    :cond_24
    invoke-interface/range {v17 .. v17}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move/from16 v7, v22

    :cond_25
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_26

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorStatusTime()I

    move-result v11

    if-nez v11, :cond_25

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetTime()I

    move-result v8

    if-eqz v8, :cond_25

    add-int/lit8 v7, v7, 0x1

    if-gez v7, :cond_25

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->OO()V

    goto :goto_17

    :cond_26
    move v14, v7

    :goto_18
    new-instance v11, Lcom/sma/smartv3/model/NavigatorMoonItem;

    move-object/from16 v16, v4

    move v0, v12

    move v12, v1

    invoke-direct/range {v11 .. v16}, Lcom/sma/smartv3/model/NavigatorMoonItem;-><init>(IIILjava/util/List;Ljava/util/List;)V

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_27

    move/from16 v4, v22

    goto :goto_1a

    :cond_27
    invoke-interface/range {v17 .. v17}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move/from16 v4, v22

    :cond_28
    :goto_19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v8

    if-ne v8, v0, :cond_29

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorStatusSpeed()I

    move-result v8

    const/4 v11, 0x1

    if-ne v8, v11, :cond_28

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetSpeedV2()F

    move-result v7

    cmpg-float v7, v7, p1

    if-nez v7, :cond_2a

    goto :goto_19

    :cond_29
    const/4 v11, 0x1

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorStatusPace()I

    move-result v8

    if-ne v8, v11, :cond_28

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetPace()I

    move-result v7

    if-eqz v7, :cond_28

    :cond_2a
    add-int/lit8 v4, v4, 0x1

    if-gez v4, :cond_28

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->OO()V

    goto :goto_19

    :cond_2b
    :goto_1a
    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2c

    move/from16 v18, v22

    goto :goto_1c

    :cond_2c
    invoke-interface/range {v17 .. v17}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move/from16 v7, v22

    :cond_2d
    :goto_1b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_30

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v11

    if-ne v11, v0, :cond_2e

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorStatusSpeed()I

    move-result v11

    if-ne v11, v2, :cond_2d

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetSpeedV2()F

    move-result v8

    cmpg-float v8, v8, p1

    if-nez v8, :cond_2f

    goto :goto_1b

    :cond_2e
    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorStatusPace()I

    move-result v11

    if-ne v11, v2, :cond_2d

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetPace()I

    move-result v8

    if-eqz v8, :cond_2d

    :cond_2f
    add-int/lit8 v7, v7, 0x1

    if-gez v7, :cond_2d

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->OO()V

    goto :goto_1b

    :cond_30
    move/from16 v18, v7

    :goto_1c
    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_31

    move/from16 v19, v22

    goto :goto_1e

    :cond_31
    invoke-interface/range {v17 .. v17}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move/from16 v7, v22

    :cond_32
    :goto_1d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_35

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v11

    if-ne v11, v0, :cond_33

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorStatusSpeed()I

    move-result v11

    if-nez v11, :cond_32

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetSpeedV2()F

    move-result v8

    cmpg-float v8, v8, p1

    if-nez v8, :cond_34

    goto :goto_1d

    :cond_33
    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorStatusPace()I

    move-result v11

    if-nez v11, :cond_32

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetPace()I

    move-result v8

    if-eqz v8, :cond_32

    :cond_34
    add-int/lit8 v7, v7, 0x1

    if-gez v7, :cond_32

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->OO()V

    goto :goto_1d

    :cond_35
    move/from16 v19, v7

    :goto_1e
    new-instance v16, Lcom/sma/smartv3/model/NavigatorMoonItem;

    move/from16 v17, v4

    move-object/from16 v20, v5

    move-object/from16 v21, v6

    invoke-direct/range {v16 .. v21}, Lcom/sma/smartv3/model/NavigatorMoonItem;-><init>(IIILjava/util/List;Ljava/util/List;)V

    move-object/from16 v0, v16

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v5

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_36

    move/from16 v6, v22

    goto :goto_20

    :cond_36
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move/from16 v1, v22

    :cond_37
    :goto_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorStatusTime()I

    move-result v6

    const/4 v11, 0x1

    if-ne v6, v11, :cond_38

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetTime()I

    move-result v6

    if-nez v6, :cond_3a

    :cond_38
    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorStatusPace()I

    move-result v6

    if-ne v6, v11, :cond_39

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetPace()I

    move-result v6

    if-nez v6, :cond_3a

    :cond_39
    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorStatusSpeed()I

    move-result v6

    if-ne v6, v11, :cond_37

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetSpeedV2()F

    move-result v4

    cmpg-float v4, v4, p1

    if-nez v4, :cond_3a

    goto :goto_1f

    :cond_3a
    add-int/lit8 v1, v1, 0x1

    if-gez v1, :cond_37

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->OO()V

    goto :goto_1f

    :cond_3b
    move v6, v1

    :goto_20
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3c

    move/from16 v7, v22

    goto :goto_22

    :cond_3c
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move/from16 v1, v22

    :cond_3d
    :goto_21
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_41

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorStatusTime()I

    move-result v7

    if-ne v7, v2, :cond_3e

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetTime()I

    move-result v7

    if-nez v7, :cond_40

    :cond_3e
    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorStatusPace()I

    move-result v7

    if-ne v7, v2, :cond_3f

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetPace()I

    move-result v7

    if-nez v7, :cond_40

    :cond_3f
    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorStatusSpeed()I

    move-result v7

    if-ne v7, v2, :cond_3d

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetSpeedV2()F

    move-result v4

    cmpg-float v4, v4, p1

    if-nez v4, :cond_40

    goto :goto_21

    :cond_40
    add-int/lit8 v1, v1, 0x1

    if-gez v1, :cond_3d

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->OO()V

    goto :goto_21

    :cond_41
    move v7, v1

    :goto_22
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_43

    :cond_42
    move/from16 v8, v22

    goto :goto_24

    :cond_43
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_44
    :goto_23
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_42

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorStatusTime()I

    move-result v2

    if-nez v2, :cond_45

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetTime()I

    move-result v2

    if-nez v2, :cond_47

    :cond_45
    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorStatusPace()I

    move-result v2

    if-nez v2, :cond_46

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetPace()I

    move-result v2

    if-nez v2, :cond_47

    :cond_46
    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorStatusSpeed()I

    move-result v2

    if-nez v2, :cond_44

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMNavigatorTargetSpeedV2()F

    move-result v1

    cmpg-float v1, v1, p1

    if-nez v1, :cond_47

    goto :goto_23

    :cond_47
    add-int/lit8 v22, v22, 0x1

    if-gez v22, :cond_44

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->OO()V

    goto :goto_23

    :goto_24
    new-instance v4, Lcom/sma/smartv3/model/NavigatorItem;

    invoke-direct/range {v4 .. v10}, Lcom/sma/smartv3/model/NavigatorItem;-><init>(IIIILcom/sma/smartv3/db/entity/Workout;Ljava/util/List;)V

    move-object/from16 v0, p5

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final getNavigatorData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/NavigatorItem;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$1;

    iget v1, v0, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$1;

    invoke-direct {v0, p0, p1}, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$1;-><init>(Lcom/sma/smartv3/model/NavigatorData;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$1;->result:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    new-instance v4, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$2;

    const/4 v5, 0x0

    invoke-direct {v4, p1, v5}, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$2;-><init>(Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$1;->label:I

    invoke-static {v2, v4, v0}, Lcom/android/mltcode/paycertificationapi/I100X1;->I0IIOi(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final getTimestamps(IIJ)J
    .locals 7

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const-wide/16 v1, 0x0

    cmp-long v1, p3, v1

    const/16 v2, 0xe

    const/16 v3, 0xd

    const/16 v4, 0xc

    const/16 v5, 0xb

    const/4 v6, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v0, p3, p4}, Ljava/util/Calendar;->setTimeInMillis(J)V

    const/16 p2, 0x17

    invoke-virtual {v0, v5, p2}, Ljava/util/Calendar;->set(II)V

    const/16 p2, 0x3b

    invoke-virtual {v0, v4, p2}, Ljava/util/Calendar;->set(II)V

    invoke-virtual {v0, v3, p2}, Ljava/util/Calendar;->set(II)V

    invoke-virtual {v0, v2, v6}, Ljava/util/Calendar;->set(II)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v5, p2}, Ljava/util/Calendar;->set(II)V

    invoke-virtual {v0, v4, v6}, Ljava/util/Calendar;->set(II)V

    invoke-virtual {v0, v3, v6}, Ljava/util/Calendar;->set(II)V

    invoke-virtual {v0, v2, v6}, Ljava/util/Calendar;->set(II)V

    :goto_0
    const/4 p2, 0x6

    invoke-virtual {v0, p2, p1}, Ljava/util/Calendar;->add(II)V

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide p1

    return-wide p1
.end method
