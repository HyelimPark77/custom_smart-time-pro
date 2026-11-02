.class public final Lcom/sma/smartv3/model/SleepAllDayDataParse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSleepAllDayData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAllDayData.kt\ncom/sma/smartv3/model/SleepAllDayDataParse\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n*L\n1#1,344:1\n1563#2:345\n1634#2,3:346\n1878#2,3:349\n31#3:352\n31#3:353\n31#3:354\n31#3:355\n31#3:356\n*S KotlinDebug\n*F\n+ 1 SleepAllDayData.kt\ncom/sma/smartv3/model/SleepAllDayDataParse\n*L\n42#1:345\n42#1:346,3\n56#1:349,3\n179#1:352\n180#1:353\n181#1:354\n182#1:355\n183#1:356\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSleepAllDayData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAllDayData.kt\ncom/sma/smartv3/model/SleepAllDayDataParse\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n*L\n1#1,344:1\n1563#2:345\n1634#2,3:346\n1878#2,3:349\n31#3:352\n31#3:353\n31#3:354\n31#3:355\n31#3:356\n*S KotlinDebug\n*F\n+ 1 SleepAllDayData.kt\ncom/sma/smartv3/model/SleepAllDayDataParse\n*L\n42#1:345\n42#1:346,3\n56#1:349,3\n179#1:352\n180#1:353\n181#1:354\n182#1:355\n183#1:356\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/model/SleepAllDayDataParse;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/model/SleepAllDayDataParse;

    invoke-direct {v0}, Lcom/sma/smartv3/model/SleepAllDayDataParse;-><init>()V

    sput-object v0, Lcom/sma/smartv3/model/SleepAllDayDataParse;->INSTANCE:Lcom/sma/smartv3/model/SleepAllDayDataParse;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic filterData$default(Lcom/sma/smartv3/model/SleepAllDayDataParse;Ljava/util/List;FLjava/util/List;JILjava/lang/Object;)Lcom/sma/smartv3/model/SleepAllDayData;
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const/high16 p2, 0x42c80000    # 100.0f

    :cond_0
    move v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const/4 p3, 0x0

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    const-wide/16 p4, 0x0

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/model/SleepAllDayDataParse;->filterData(Ljava/util/List;FLjava/util/List;J)Lcom/sma/smartv3/model/SleepAllDayData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final filterData(Ljava/util/List;FLjava/util/List;J)Lcom/sma/smartv3/model/SleepAllDayData;
    .locals 29
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
            ">;J)",
            "Lcom/sma/smartv3/model/SleepAllDayData;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    const-string v2, "data"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v3, Lcom/sma/smartv3/model/SleepAllDayData;

    const/16 v10, 0x3f

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lcom/sma/smartv3/model/SleepAllDayData;-><init>(IIILandroid/util/SparseIntArray;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_0
    sget-object v2, Lcom/szabh/smable3/entity/BleSleep;->Companion:Lcom/szabh/smable3/entity/BleSleep$Companion;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/Sleep;

    new-instance v5, Lcom/szabh/smable3/entity/BleSleep;

    sget-object v6, Lcom/bestmafen/baseble/data/BleReadable;->Companion:Lcom/bestmafen/baseble/data/BleReadable$Companion;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Sleep;->getMTime()J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Lcom/bestmafen/baseble/data/BleReadable$Companion;->millisToTime(J)J

    move-result-wide v6

    long-to-int v6, v6

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Sleep;->getMMode()I

    move-result v7

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Sleep;->getMSoft()I

    move-result v8

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Sleep;->getMStrong()I

    move-result v4

    invoke-direct {v5, v6, v7, v8, v4}, Lcom/szabh/smable3/entity/BleSleep;-><init>(IIII)V

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    move-wide/from16 v4, p4

    invoke-virtual {v2, v3, v4, v5}, Lcom/szabh/smable3/entity/BleSleep$Companion;->analyseSleepAllDay(Ljava/util/List;J)Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v1, Lcom/sma/smartv3/model/SleepAllDayData;

    const/16 v8, 0x3f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lcom/sma/smartv3/model/SleepAllDayData;-><init>(IIILandroid/util/SparseIntArray;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    sget-object v0, Lcom/szabh/smable3/entity/BleSleep;->Companion:Lcom/szabh/smable3/entity/BleSleep$Companion;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v0, v10, v3, v4, v2}, Lcom/szabh/smable3/entity/BleSleep$Companion;->getSleepAllDayViewDatas$default(Lcom/szabh/smable3/entity/BleSleep$Companion;Ljava/util/List;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v5, v3

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v5, 0x1

    if-gez v5, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_3
    check-cast v6, Lcom/szabh/smable3/entity/BleSleep;

    sget-object v8, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "analyseSleepAllDayView -> "

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    move v5, v7

    goto :goto_1

    :cond_4
    invoke-static {v10}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleSleep;->getMLocalTime()J

    move-result-wide v5

    const/16 v2, 0x3e8

    int-to-long v7, v2

    div-long/2addr v5, v7

    long-to-int v2, v5

    invoke-static {v10}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BleSleep;->getMLocalTime()J

    move-result-wide v5

    div-long/2addr v5, v7

    long-to-int v5, v5

    move-object v6, v0

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_5

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleSleep;->getMLocalTime()J

    move-result-wide v11

    div-long/2addr v11, v7

    long-to-int v2, v11

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BleSleep;->getMLocalTime()J

    move-result-wide v11

    div-long/2addr v11, v7

    long-to-int v5, v11

    :cond_5
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    const/4 v13, 0x1

    if-nez v6, :cond_1a

    const/4 v6, 0x4

    int-to-float v6, v6

    div-float v6, p2, v6

    move v14, v3

    move v15, v14

    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v16

    move/from16 p1, v3

    add-int/lit8 v3, v16, -0x1

    if-ge v14, v3, :cond_19

    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/szabh/smable3/entity/BleSleep;

    const-wide/16 v16, 0x1

    const/16 v9, 0x3c

    if-nez v14, :cond_6

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleSleep;->getMLocalTime()J

    move-result-wide v18

    div-long v18, v18, v7

    int-to-long v11, v9

    div-long v18, v18, v11

    move-wide/from16 v27, v18

    move/from16 v19, v5

    move-wide/from16 v4, v27

    goto :goto_3

    :cond_6
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleSleep;->getMLocalTime()J

    move-result-wide v11

    div-long/2addr v11, v7

    move/from16 v19, v5

    int-to-long v4, v9

    div-long/2addr v11, v4

    add-long v4, v11, v16

    :goto_3
    add-int/lit8 v14, v14, 0x1

    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v11}, Lcom/szabh/smable3/entity/BleSleep;->getMLocalTime()J

    move-result-wide v20

    div-long v20, v20, v7

    move/from16 v22, v14

    int-to-long v13, v9

    div-long v20, v20, v13

    cmp-long v9, v4, v20

    if-gtz v9, :cond_17

    :goto_4
    sget-object v9, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v9}, Lcom/android/mltcode/paycertificationapi/i72;->iX01()Z

    move-result v9

    const/16 v13, 0x11

    if-eqz v9, :cond_e

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v9

    const/4 v12, 0x1

    if-eq v9, v12, :cond_d

    const/4 v14, 0x2

    const/16 v23, 0x0

    if-eq v9, v14, :cond_c

    move/from16 v24, v12

    const/4 v12, 0x3

    if-eq v9, v12, :cond_b

    const/16 v12, 0x8

    if-eq v9, v12, :cond_a

    const/16 v12, 0x9

    if-eq v9, v12, :cond_9

    if-eq v9, v13, :cond_7

    new-array v9, v14, [F

    aput v23, v9, p1

    aput p2, v9, v24

    goto/16 :goto_5

    :cond_7
    invoke-virtual {v11}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v9

    const/16 v12, 0x8

    if-ne v9, v12, :cond_8

    new-array v9, v14, [F

    aput v23, v9, p1

    const/4 v12, 0x3

    int-to-float v13, v12

    mul-float/2addr v13, v6

    aput v13, v9, v24

    goto/16 :goto_5

    :cond_8
    new-array v9, v14, [F

    aput v23, v9, p1

    aput p2, v9, v24

    goto/16 :goto_5

    :cond_9
    new-array v9, v14, [F

    int-to-float v12, v14

    mul-float/2addr v12, v6

    aput v12, v9, p1

    aput v6, v9, v24

    goto/16 :goto_5

    :cond_a
    new-array v9, v14, [F

    aput v23, v9, p1

    const/4 v12, 0x3

    int-to-float v13, v12

    mul-float/2addr v13, v6

    aput v13, v9, v24

    goto/16 :goto_5

    :cond_b
    new-array v9, v14, [F

    int-to-float v13, v12

    mul-float/2addr v13, v6

    aput v13, v9, p1

    aput v6, v9, v24

    goto/16 :goto_5

    :cond_c
    move/from16 v24, v12

    new-array v9, v14, [F

    aput v6, v9, p1

    aput v6, v9, v24

    goto/16 :goto_5

    :cond_d
    move/from16 v24, v12

    const/4 v14, 0x2

    const/16 v23, 0x0

    new-array v9, v14, [F

    aput v23, v9, p1

    aput v6, v9, v24

    goto/16 :goto_5

    :cond_e
    const/4 v14, 0x2

    const/16 v23, 0x0

    const/16 v24, 0x1

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v9

    move/from16 v12, v24

    if-eq v9, v12, :cond_15

    if-eq v9, v14, :cond_14

    move/from16 v24, v12

    const/4 v12, 0x3

    if-eq v9, v12, :cond_13

    const/16 v12, 0x8

    if-eq v9, v12, :cond_12

    const/16 v12, 0x9

    if-eq v9, v12, :cond_11

    if-eq v9, v13, :cond_f

    new-array v9, v14, [F

    aput v23, v9, p1

    aput p2, v9, v24

    goto :goto_5

    :cond_f
    invoke-virtual {v11}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v9

    const/16 v12, 0x8

    if-ne v9, v12, :cond_10

    new-array v9, v14, [F

    aput v23, v9, p1

    const/4 v12, 0x3

    int-to-float v13, v12

    mul-float/2addr v13, v6

    aput v13, v9, v24

    goto :goto_5

    :cond_10
    new-array v9, v14, [F

    aput v23, v9, p1

    aput p2, v9, v24

    goto :goto_5

    :cond_11
    new-array v9, v14, [F

    int-to-float v12, v14

    mul-float/2addr v12, v6

    aput v12, v9, p1

    aput v12, v9, v24

    goto :goto_5

    :cond_12
    new-array v9, v14, [F

    aput v23, v9, p1

    const/4 v12, 0x3

    int-to-float v13, v12

    mul-float/2addr v13, v6

    aput v13, v9, v24

    goto :goto_5

    :cond_13
    new-array v9, v14, [F

    int-to-float v12, v14

    mul-float/2addr v12, v6

    aput v12, v9, p1

    aput v6, v9, v24

    goto :goto_5

    :cond_14
    move/from16 v24, v12

    new-array v9, v14, [F

    aput v6, v9, p1

    aput v6, v9, v24

    goto :goto_5

    :cond_15
    move/from16 v24, v12

    new-array v9, v14, [F

    aput v23, v9, p1

    aput v6, v9, v24

    :goto_5
    if-eqz v1, :cond_16

    new-instance v13, Lcom/github/mikephil/charting/data/BarEntry;

    int-to-float v14, v15

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v12

    move-object/from16 v23, v0

    const-string v0, "getApp(...)"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v0

    move/from16 v25, v2

    invoke-virtual {v11}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v2

    move-object/from16 v26, v11

    move-object/from16 v11, p0

    invoke-virtual {v11, v12, v0, v2}, Lcom/sma/smartv3/model/SleepAllDayDataParse;->getBarColors(Landroid/content/Context;II)[I

    move-result-object v0

    invoke-direct {v13, v14, v9, v0}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(F[FLjava/lang/Object;)V

    invoke-interface {v1, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_16
    move-object/from16 v23, v0

    move/from16 v25, v2

    move-object/from16 v26, v11

    move-object/from16 v11, p0

    :goto_6
    add-int/lit8 v15, v15, 0x1

    cmp-long v0, v4, v20

    if-eqz v0, :cond_18

    add-long v4, v4, v16

    move-object/from16 v0, v23

    move/from16 v2, v25

    move-object/from16 v11, v26

    goto/16 :goto_4

    :cond_17
    move-object/from16 v11, p0

    move-object/from16 v23, v0

    move/from16 v25, v2

    :cond_18
    move/from16 v3, p1

    move/from16 v5, v19

    move/from16 v14, v22

    move-object/from16 v0, v23

    move/from16 v2, v25

    const/4 v4, 0x2

    const/4 v13, 0x1

    goto/16 :goto_2

    :cond_19
    :goto_7
    move-object/from16 v11, p0

    move/from16 v25, v2

    move/from16 v19, v5

    goto :goto_8

    :cond_1a
    move/from16 p1, v3

    goto :goto_7

    :goto_8
    sget-object v0, Lcom/szabh/smable3/entity/BleSleep;->Companion:Lcom/szabh/smable3/entity/BleSleep$Companion;

    invoke-virtual {v0, v10}, Lcom/szabh/smable3/entity/BleSleep$Companion;->getSleepAllDayStatus(Ljava/util/List;)Ljava/util/HashMap;

    move-result-object v0

    new-instance v8, Landroid/util/SparseIntArray;

    invoke-direct {v8}, Landroid/util/SparseIntArray;-><init>()V

    const/4 v14, 0x2

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_1b

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_9

    :cond_1b
    move/from16 v1, p1

    :goto_9
    invoke-virtual {v8, v14, v1}, Landroid/util/SparseIntArray;->put(II)V

    const/4 v12, 0x1

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_1c

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_a

    :cond_1c
    move/from16 v1, p1

    :goto_a
    invoke-virtual {v8, v12, v1}, Landroid/util/SparseIntArray;->put(II)V

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_1d

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_b

    :cond_1d
    move/from16 v2, p1

    :goto_b
    invoke-virtual {v8, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const/16 v1, 0x9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_1e

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_c

    :cond_1e
    move/from16 v2, p1

    :goto_c
    invoke-virtual {v8, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_d

    :cond_1f
    move/from16 v3, p1

    :goto_d
    invoke-virtual {v8, v1, v3}, Landroid/util/SparseIntArray;->put(II)V

    const/4 v14, 0x2

    invoke-virtual {v8, v14}, Landroid/util/SparseIntArray;->get(I)I

    move-result v0

    const/4 v12, 0x1

    invoke-virtual {v8, v12}, Landroid/util/SparseIntArray;->get(I)I

    move-result v2

    add-int/2addr v0, v2

    const/4 v12, 0x3

    invoke-virtual {v8, v12}, Landroid/util/SparseIntArray;->get(I)I

    move-result v2

    add-int/2addr v0, v2

    const/16 v12, 0x9

    invoke-virtual {v8, v12}, Landroid/util/SparseIntArray;->get(I)I

    move-result v2

    add-int/2addr v0, v2

    invoke-virtual {v8, v1}, Landroid/util/SparseIntArray;->get(I)I

    move-result v1

    add-int v5, v0, v1

    new-instance v4, Lcom/sma/smartv3/model/SleepAllDayData;

    const/16 v11, 0x10

    const/4 v12, 0x0

    const/4 v9, 0x0

    move/from16 v7, v19

    move/from16 v6, v25

    invoke-direct/range {v4 .. v12}, Lcom/sma/smartv3/model/SleepAllDayData;-><init>(IIILandroid/util/SparseIntArray;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method

.method public final filterDayData(Landroid/content/Context;Ljava/util/List;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;)I
    .locals 27
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
            "Lcom/sma/smartv3/model/SleepAllDayData;",
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

    if-nez v4, :cond_d

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const-wide/16 v7, 0x1

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/Sleep;

    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->longValue()J

    move-result-wide v11

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/ArrayList;

    sget-object v13, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v13, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v13

    sub-long v13, v11, v13

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Sleep;->getMTime()J

    move-result-wide v15

    const v6, 0x2932e00

    int-to-long v7, v6

    sub-long/2addr v13, v7

    cmp-long v6, v15, v13

    if-ltz v6, :cond_1

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Sleep;->getMTime()J

    move-result-wide v6

    cmp-long v6, v6, v11

    if-gtz v6, :cond_1

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    const-wide/16 v7, 0x1

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

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Ljava/util/ArrayList;

    sget-object v4, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v10, 0x1

    invoke-virtual {v4, v10, v11}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v12

    sub-long v12, v6, v12

    sget-object v4, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->IO0iXO0O()Ljava/text/SimpleDateFormat;

    move-result-object v6

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "zeroClockTime -> "

    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ", "

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v18, Lcom/sma/smartv3/model/SleepAllDayData;

    const/16 v25, 0x3f

    const/16 v26, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v18 .. v26}, Lcom/sma/smartv3/model/SleepAllDayData;-><init>(IIILandroid/util/SparseIntArray;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_8

    const/4 v14, 0x6

    const/4 v15, 0x0

    move-wide/from16 v18, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v8, p0

    move-wide/from16 v6, v18

    invoke-static/range {v8 .. v15}, Lcom/sma/smartv3/model/SleepAllDayDataParse;->filterData$default(Lcom/sma/smartv3/model/SleepAllDayDataParse;Ljava/util/List;FLjava/util/List;JILjava/lang/Object;)Lcom/sma/smartv3/model/SleepAllDayData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/model/SleepAllDayData;->getTotal()I

    move-result v8

    const/16 v9, 0x3c

    if-le v8, v9, :cond_7

    invoke-virtual {v4}, Lcom/sma/smartv3/model/SleepAllDayData;->getTotal()I

    move-result v8

    const/16 v10, 0x21c

    const-string v11, "getString(...)"

    if-le v8, v10, :cond_3

    const v5, 0x7f14126b

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/model/SleepAllDayData;->setEvaluation(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v4}, Lcom/sma/smartv3/model/SleepAllDayData;->getTotal()I

    move-result v8

    const/16 v10, 0x1a4

    const v12, 0x7f1401ae

    if-le v8, v10, :cond_6

    invoke-virtual {v4}, Lcom/sma/smartv3/model/SleepAllDayData;->getStatus()Landroid/util/SparseIntArray;

    move-result-object v8

    invoke-virtual {v8, v5}, Landroid/util/SparseIntArray;->get(I)I

    move-result v8

    const/16 v10, 0x78

    if-lt v8, v10, :cond_4

    const v5, 0x7f140c68

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/model/SleepAllDayData;->setEvaluation(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Lcom/sma/smartv3/model/SleepAllDayData;->getStatus()Landroid/util/SparseIntArray;

    move-result-object v8

    invoke-virtual {v8, v5}, Landroid/util/SparseIntArray;->get(I)I

    move-result v5

    if-lt v5, v9, :cond_5

    const v5, 0x7f140c41

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/model/SleepAllDayData;->setEvaluation(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v0, v12}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/model/SleepAllDayData;->setEvaluation(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    invoke-virtual {v0, v12}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/model/SleepAllDayData;->setEvaluation(Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/model/SleepAllDayData;->setTotal(I)V

    const-string v5, "--"

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/model/SleepAllDayData;->setEvaluation(Ljava/lang/String;)V

    goto :goto_2

    :cond_8
    move-wide v6, v10

    move-object/from16 v4, v18

    :goto_2
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_9
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v6, 0x0

    const/16 v17, 0x0

    :cond_a
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/SleepAllDayData;

    new-instance v4, Lcom/github/mikephil/charting/data/BarEntry;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SleepAllDayData;->getTotal()I

    move-result v7

    int-to-float v7, v7

    const/high16 v8, 0x42700000    # 60.0f

    div-float/2addr v7, v8

    invoke-direct {v4, v1, v7}, Lcom/github/mikephil/charting/data/BarEntry;-><init>(FF)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/high16 v4, 0x3f800000    # 1.0f

    add-float/2addr v1, v4

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SleepAllDayData;->getTotal()I

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SleepAllDayData;->getTotal()I

    move-result v2

    add-int/2addr v6, v2

    add-int/lit8 v17, v17, 0x1

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

    if-nez v17, :cond_c

    goto :goto_4

    :cond_c
    move/from16 v5, v17

    :goto_4
    div-int/2addr v6, v5

    return v6

    :cond_d
    const/16 v17, 0x0

    return v17
.end method

.method public final getBarColors(Landroid/content/Context;II)[I
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq p2, v2, :cond_6

    if-eq p2, v1, :cond_5

    const/4 v3, 0x3

    if-eq p2, v3, :cond_4

    const/16 v3, 0x8

    const v4, 0x7f060706

    if-eq p2, v3, :cond_3

    const/16 v5, 0x9

    if-eq p2, v5, :cond_2

    const/16 v5, 0x11

    const v6, 0x7f060760

    if-eq p2, v5, :cond_0

    new-array p2, v1, [I

    invoke-static {p1, v6}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p3

    aput p3, p2, v0

    invoke-static {p1, v6}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    aput p1, p2, v2

    return-object p2

    :cond_0
    if-ne p3, v3, :cond_1

    new-array p2, v1, [I

    invoke-static {p1, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p3

    aput p3, p2, v0

    invoke-static {p1, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    aput p1, p2, v2

    return-object p2

    :cond_1
    new-array p2, v1, [I

    invoke-static {p1, v6}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p3

    aput p3, p2, v0

    invoke-static {p1, v6}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    aput p1, p2, v2

    return-object p2

    :cond_2
    new-array p2, v1, [I

    const p3, 0x7f0606fe

    invoke-static {p1, p3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    aput v1, p2, v0

    invoke-static {p1, p3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    aput p1, p2, v2

    return-object p2

    :cond_3
    new-array p2, v1, [I

    invoke-static {p1, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p3

    aput p3, p2, v0

    invoke-static {p1, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    aput p1, p2, v2

    return-object p2

    :cond_4
    new-array p2, v1, [I

    const p3, 0x7f0606fd

    invoke-static {p1, p3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    aput v1, p2, v0

    invoke-static {p1, p3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    aput p1, p2, v2

    return-object p2

    :cond_5
    new-array p2, v1, [I

    const p3, 0x7f060701

    invoke-static {p1, p3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    aput v1, p2, v0

    invoke-static {p1, p3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    aput p1, p2, v2

    return-object p2

    :cond_6
    new-array p2, v1, [I

    const p3, 0x7f060703

    invoke-static {p1, p3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    aput v1, p2, v0

    invoke-static {p1, p3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    aput p1, p2, v2

    return-object p2
.end method
