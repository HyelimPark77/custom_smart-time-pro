.class public final Lcom/sma/smartv3/model/TodayHealthyDataKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTodayHealthyData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodayHealthyData.kt\ncom/sma/smartv3/model/TodayHealthyDataKt\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,474:1\n19#2:475\n15#2:476\n1869#3,2:477\n1011#3,2:479\n1878#3,3:481\n1878#3,3:484\n*S KotlinDebug\n*F\n+ 1 TodayHealthyData.kt\ncom/sma/smartv3/model/TodayHealthyDataKt\n*L\n60#1:475\n60#1:476\n73#1:477,2\n168#1:479,2\n392#1:481,3\n436#1:484,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTodayHealthyData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodayHealthyData.kt\ncom/sma/smartv3/model/TodayHealthyDataKt\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,474:1\n19#2:475\n15#2:476\n1869#3,2:477\n1011#3,2:479\n1878#3,3:481\n1878#3,3:484\n*S KotlinDebug\n*F\n+ 1 TodayHealthyData.kt\ncom/sma/smartv3/model/TodayHealthyDataKt\n*L\n60#1:475\n60#1:476\n73#1:477,2\n168#1:479,2\n392#1:481,3\n436#1:484,3\n*E\n"
    }
.end annotation


# direct methods
.method private static final addDeepLengthData(ILjava/util/List;Ljava/util/List;ILkotlin/jvm/functions/Function1;Lcom/sma/smartv3/model/SleepAllDayData;)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Sleep;",
            ">;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/TodayData;",
            ">;I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/sma/smartv3/model/SleepAllDayData;",
            ")V"
        }
    .end annotation

    move/from16 v0, p3

    move-object/from16 v1, p4

    const/4 v2, 0x0

    if-eqz p0, :cond_5

    move-object/from16 v3, p1

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const-wide/16 v4, 0x0

    move v6, v2

    move-wide v8, v4

    move-wide v10, v8

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v12, v2, 0x1

    if-gez v2, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_0
    check-cast v7, Lcom/sma/smartv3/db/entity/Sleep;

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Sleep;->getMMode()I

    move-result v13

    const/16 v14, 0x11

    if-ne v13, v14, :cond_1

    cmp-long v13, v10, v4

    if-nez v13, :cond_1

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Sleep;->getMTime()J

    move-result-wide v10

    move v6, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Sleep;->getMMode()I

    move-result v13

    const/16 v14, 0x22

    if-ne v13, v14, :cond_3

    cmp-long v13, v10, v4

    if-eqz v13, :cond_3

    cmp-long v13, v8, v4

    if-nez v13, :cond_3

    add-int/lit8 v13, v6, 0x1

    if-eq v13, v2, :cond_2

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Sleep;->getMTime()J

    move-result-wide v8

    goto :goto_1

    :cond_2
    move-wide v10, v4

    :cond_3
    :goto_1
    move v2, v12

    goto :goto_0

    :cond_4
    add-int v2, v0, p0

    new-instance v7, Lcom/sma/smartv3/model/TodayData;

    const v3, 0x7f140fee

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v10

    div-int/lit8 v3, v2, 0x3c

    const v4, 0x7f140c98

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v4

    rem-int/lit8 v2, v2, 0x3c

    const v5, 0x7f140c99

    invoke-static {v5}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    int-to-float v0, v0

    const/16 v19, 0x2d0

    const/16 v20, 0x0

    const-string v11, ""

    const/4 v13, 0x0

    const-string v14, "sleep"

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    move/from16 v17, v0

    invoke-direct/range {v7 .. v20}, Lcom/sma/smartv3/model/TodayData;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, p2

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {p5 .. p5}, Lcom/sma/smartv3/model/SleepAllDayData;->getTotal()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final addHealthyDataBloodOxy(Ljava/util/List;IJLjava/lang/String;)V
    .locals 17
    .param p0    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/TodayData;",
            ">;IJ",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    const-string v2, "list"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "mExtraInfo"

    move-object/from16 v12, p4

    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x5c

    if-lt v1, v2, :cond_0

    const v2, 0x7f14111a

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    :goto_0
    move-object v8, v2

    move v9, v3

    goto :goto_1

    :cond_0
    const v2, 0x7f1403ba

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    goto :goto_0

    :goto_1
    const v2, 0x7f14021d

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v6

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "%"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    int-to-float v13, v1

    new-instance v3, Lcom/sma/smartv3/model/TodayData;

    const/16 v15, 0x240

    const/16 v16, 0x0

    const-string v10, "blood_oxygen"

    const/4 v11, 0x0

    const/4 v14, 0x0

    move-wide/from16 v4, p2

    invoke-direct/range {v3 .. v16}, Lcom/sma/smartv3/model/TodayData;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic addHealthyDataBloodOxy$default(Ljava/util/List;IJLjava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const-string p4, ""

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/model/TodayHealthyDataKt;->addHealthyDataBloodOxy(Ljava/util/List;IJLjava/lang/String;)V

    return-void
.end method

.method public static final addHealthyDataBloodPressure(Ljava/util/List;IIJLjava/lang/String;)V
    .locals 18
    .param p0    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/TodayData;",
            ">;IIJ",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    const-string v3, "list"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "mExtraInfo"

    move-object/from16 v13, p5

    invoke-static {v13, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x82

    if-lt v1, v3, :cond_0

    const v3, 0x7f140e18

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    :goto_0
    move-object v9, v3

    move v10, v4

    goto :goto_1

    :cond_0
    const/16 v3, 0x5a

    if-lt v1, v3, :cond_1

    const v3, 0x7f14111a

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    goto :goto_0

    :cond_1
    const v3, 0x7f1403ba

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    goto :goto_0

    :goto_1
    const v3, 0x7f14021d

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v7

    const v3, 0x7f141301

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f140447

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ":"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "\n"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    int-to-float v14, v1

    int-to-float v15, v2

    new-instance v4, Lcom/sma/smartv3/model/TodayData;

    const/16 v16, 0x40

    const/16 v17, 0x0

    const-string v11, "blood_pressure"

    const/4 v12, 0x0

    move-wide/from16 v5, p3

    invoke-direct/range {v4 .. v17}, Lcom/sma/smartv3/model/TodayData;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic addHealthyDataBloodPressure$default(Ljava/util/List;IIJLjava/lang/String;ILjava/lang/Object;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const-string p5, ""

    :cond_0
    move-object v0, p0

    move v1, p1

    move v2, p2

    move-wide v3, p3

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lcom/sma/smartv3/model/TodayHealthyDataKt;->addHealthyDataBloodPressure(Ljava/util/List;IIJLjava/lang/String;)V

    return-void
.end method

.method public static final addHealthyDataHeart(Ljava/util/List;IJLjava/lang/String;)V
    .locals 17
    .param p0    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/TodayData;",
            ">;IJ",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    const-string v2, "list"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "mExtraInfo"

    move-object/from16 v12, p4

    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x3d

    if-ltz v1, :cond_0

    if-ge v1, v2, :cond_0

    const v2, 0x7f1403ba

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    :goto_0
    move-object v8, v2

    move v9, v3

    goto :goto_1

    :cond_0
    if-gt v2, v1, :cond_1

    const/16 v2, 0x65

    if-ge v1, v2, :cond_1

    const v2, 0x7f14111a

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    goto :goto_0

    :cond_1
    const v2, 0x7f1403b8

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    goto :goto_0

    :goto_1
    const v2, 0x7f140cb6

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v6

    const v2, 0x7f140248

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    int-to-float v13, v1

    new-instance v3, Lcom/sma/smartv3/model/TodayData;

    const/16 v15, 0x240

    const/16 v16, 0x0

    const-string v10, "heart_rate"

    const/4 v11, 0x0

    const/4 v14, 0x0

    move-wide/from16 v4, p2

    invoke-direct/range {v3 .. v16}, Lcom/sma/smartv3/model/TodayData;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic addHealthyDataHeart$default(Ljava/util/List;IJLjava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const-string p4, ""

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/model/TodayHealthyDataKt;->addHealthyDataHeart(Ljava/util/List;IJLjava/lang/String;)V

    return-void
.end method

.method public static final addHealthyDataPressure(Ljava/util/List;IJLjava/lang/String;)V
    .locals 17
    .param p0    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/TodayData;",
            ">;IJ",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    const-string v2, "list"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "mExtraInfo"

    move-object/from16 v12, p4

    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f14111b

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x19

    if-ge v1, v3, :cond_0

    const v2, 0x7f14111c

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    :goto_0
    move-object v8, v2

    move v9, v3

    goto :goto_1

    :cond_0
    const/16 v3, 0x32

    if-ge v1, v3, :cond_1

    const v2, 0x7f14111a

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/16 v3, 0x4b

    if-ge v1, v3, :cond_2

    const v2, 0x7f141119

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    goto :goto_0

    :cond_2
    const/4 v3, 0x3

    goto :goto_0

    :goto_1
    const v2, 0x7f141118

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    int-to-float v13, v1

    new-instance v3, Lcom/sma/smartv3/model/TodayData;

    const/16 v15, 0x240

    const/16 v16, 0x0

    const-string v10, "pressure"

    const/4 v11, 0x0

    const/4 v14, 0x0

    move-wide/from16 v4, p2

    invoke-direct/range {v3 .. v16}, Lcom/sma/smartv3/model/TodayData;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic addHealthyDataPressure$default(Ljava/util/List;IJLjava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const-string p4, ""

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/model/TodayHealthyDataKt;->addHealthyDataPressure(Ljava/util/List;IJLjava/lang/String;)V

    return-void
.end method

.method private static final addPiecemealData(ILjava/util/List;Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Sleep;",
            ">;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/TodayData;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->IXi01O()Z

    move-result v0

    if-eqz v0, :cond_5

    if-eqz p0, :cond_5

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    move v3, v0

    move-wide v4, v1

    move-wide v6, v4

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v9, v0, 0x1

    if-gez v0, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_0
    check-cast v8, Lcom/sma/smartv3/db/entity/Sleep;

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Sleep;->getMMode()I

    move-result v10

    const/16 v11, 0x11

    if-ne v10, v11, :cond_1

    cmp-long v10, v4, v1

    if-nez v10, :cond_1

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Sleep;->getMTime()J

    move-result-wide v4

    move v3, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Sleep;->getMMode()I

    move-result v10

    const/16 v11, 0x22

    if-ne v10, v11, :cond_2

    cmp-long v10, v4, v1

    if-eqz v10, :cond_2

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Sleep;->getMTime()J

    move-result-wide v6

    goto :goto_1

    :cond_2
    add-int/lit8 v8, v3, 0x1

    if-ne v8, v0, :cond_3

    cmp-long v0, v6, v1

    if-nez v0, :cond_3

    move-wide v4, v1

    :cond_3
    :goto_1
    move v0, v9

    goto :goto_0

    :cond_4
    move v9, p0

    move-object v8, p2

    invoke-static/range {v4 .. v9}, Lcom/sma/smartv3/model/TodayHealthyDataKt;->addPiecemealTime(JJLjava/util/List;I)V

    :cond_5
    return-void
.end method

.method private static final addPiecemealTime(JJLjava/util/List;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/TodayData;",
            ">;I)V"
        }
    .end annotation

    move-wide/from16 v0, p0

    move/from16 v2, p5

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-eqz v5, :cond_0

    cmp-long v3, p2, v3

    if-eqz v3, :cond_0

    new-instance v4, Lcom/sma/smartv3/model/TodayData;

    const v3, 0x7f1410da

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v7

    div-int/lit8 v3, v2, 0x3c

    const v5, 0x7f140c98

    invoke-static {v5}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v5

    rem-int/lit8 v6, v2, 0x3c

    const v8, 0x7f140c99

    invoke-static {v8}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    int-to-float v14, v2

    long-to-float v15, v0

    const/16 v16, 0xd0

    const/16 v17, 0x0

    const-string v8, ""

    const/4 v10, 0x0

    const-string v11, "sleep"

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-wide/from16 v5, p2

    invoke-direct/range {v4 .. v17}, Lcom/sma/smartv3/model/TodayData;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, p4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method private static final addWorkList(Lcom/sma/smartv3/db/entity/Workout;Ljava/util/List;Lcom/sma/smartv3/model/AppUser;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/db/entity/Workout;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/TodayData;",
            ">;",
            "Lcom/sma/smartv3/model/AppUser;",
            ")V"
        }
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lcom/android/mltcode/paycertificationapi/q62;->X0XI11I(Lcom/android/mltcode/paycertificationapi/q62;IZILjava/lang/Object;)Z

    move-result v1

    const v3, 0x7f140d64

    if-eqz v1, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v1

    invoke-virtual/range {p2 .. p2}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    const/4 v6, 0x4

    invoke-static {v1, v5, v2, v6, v4}, Lcom/android/mltcode/paycertificationapi/cp5;->X1ii(IIZILjava/lang/Object;)F

    move-result v1

    invoke-virtual/range {p2 .. p2}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v2

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v2

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/db/entity/Workout;->getMCalorie()I

    move-result v4

    div-int/lit16 v4, v4, 0x3e8

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    move-object v6, v1

    goto :goto_1

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/db/entity/Workout;->getMCalorie()I

    move-result v1

    div-int/lit16 v1, v1, 0x3e8

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result v1

    mul-int/lit16 v1, v1, 0x3e8

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iXiX011(I)Ljava/lang/String;

    move-result-object v7

    new-instance v2, Lcom/sma/smartv3/model/TodayData;

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v3

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/q62;->i01OOiI(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/db/entity/Workout;->getMId()I

    move-result v10

    const/16 v14, 0x380

    const/4 v15, 0x0

    const/4 v8, 0x0

    const-string v9, "sportRecord"

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v2 .. v15}, Lcom/sma/smartv3/model/TodayData;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, p1

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static final getBloodOxyDataHeart(Ljava/util/List;Ljava/util/List;)V
    .locals 7
    .param p0    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/BloodOxygen;",
            ">;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/TodayData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "bloodOxygenList"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/db/entity/BloodOxygen;

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/BloodOxygen;->getMValue()I

    move-result v1

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/BloodOxygen;->getMTime()J

    move-result-wide v2

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/model/TodayHealthyDataKt;->addHealthyDataBloodOxy$default(Ljava/util/List;IJLjava/lang/String;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static final getBloodPressureDataHeart(Ljava/util/List;Ljava/util/List;)V
    .locals 8
    .param p0    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/BloodPressure;",
            ">;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/TodayData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "bloodPressureList"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/db/entity/BloodPressure;

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v1

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v2

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMTime()J

    move-result-wide v3

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v7}, Lcom/sma/smartv3/model/TodayHealthyDataKt;->addHealthyDataBloodPressure$default(Ljava/util/List;IIJLjava/lang/String;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static final getHealthyDataHeart(Ljava/util/List;Ljava/util/List;)V
    .locals 7
    .param p0    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/HeartRate;",
            ">;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/TodayData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "heartList"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/db/entity/HeartRate;

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v1

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/HeartRate;->getMTime()J

    move-result-wide v2

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/model/TodayHealthyDataKt;->addHealthyDataHeart$default(Ljava/util/List;IJLjava/lang/String;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static final getHealthyDataPressure(Ljava/util/List;Ljava/util/List;)V
    .locals 7
    .param p0    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Pressure;",
            ">;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/TodayData;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pressureList"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/db/entity/Pressure;

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Pressure;->getMValue()I

    move-result v1

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Pressure;->getMTime()J

    move-result-wide v2

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/model/TodayHealthyDataKt;->addHealthyDataPressure$default(Ljava/util/List;IJLjava/lang/String;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static final getItemHealthyData(ZLkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 36
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/TodayData;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "callback"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sget-object v2, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    const/4 v3, 0x5

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v4, v2, v5, v3, v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iOOX010X(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;IILjava/lang/Object;)[J

    move-result-object v2

    sget-object v3, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    new-instance v6, Lcom/sma/smartv3/model/AppUser;

    const v34, 0x7ffffff

    const/16 v35, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v6 .. v35}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    const-class v7, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3, v7}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v6, v3

    :goto_0
    check-cast v6, Lcom/sma/smartv3/model/AppUser;

    sget-object v3, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/db/AppDatabase;->heartRateDao()Lcom/sma/smartv3/db/dao/HeartRateDao;

    move-result-object v4

    aget-wide v7, v2, v5

    const/4 v9, 0x1

    aget-wide v10, v2, v9

    invoke-interface {v4, v7, v8, v10, v11}, Lcom/sma/smartv3/db/dao/HeartRateDao;->getHeartRates(JJ)Ljava/util/List;

    move-result-object v4

    invoke-static {v4, v1}, Lcom/sma/smartv3/model/TodayHealthyDataKt;->getHealthyDataHeart(Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v3}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/db/AppDatabase;->bloodOxygenDao()Lcom/sma/smartv3/db/dao/BloodOxygenDao;

    move-result-object v4

    aget-wide v7, v2, v5

    aget-wide v10, v2, v9

    invoke-interface {v4, v7, v8, v10, v11}, Lcom/sma/smartv3/db/dao/BloodOxygenDao;->getBloodOxygen(JJ)Ljava/util/List;

    move-result-object v4

    invoke-static {v4, v1}, Lcom/sma/smartv3/model/TodayHealthyDataKt;->getBloodOxyDataHeart(Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v3}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/AppDatabase;->workoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v10

    aget-wide v11, v2, v5

    aget-wide v13, v2, v9

    const/16 v16, 0x4

    const/16 v17, 0x0

    const/4 v15, 0x0

    invoke-static/range {v10 .. v17}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getListDESC$default(Lcom/sma/smartv3/db/dao/WorkoutDao;JJIILjava/lang/Object;)Ljava/util/List;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/Workout;

    invoke-static {v4, v1, v6}, Lcom/sma/smartv3/model/TodayHealthyDataKt;->addWorkList(Lcom/sma/smartv3/db/entity/Workout;Ljava/util/List;Lcom/sma/smartv3/model/AppUser;)V

    goto :goto_1

    :cond_1
    sget-object v3, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/db/AppDatabase;->pressureDao()Lcom/sma/smartv3/db/dao/PressureDao;

    move-result-object v4

    aget-wide v7, v2, v5

    aget-wide v10, v2, v9

    invoke-interface {v4, v7, v8, v10, v11}, Lcom/sma/smartv3/db/dao/PressureDao;->getPressures(JJ)Ljava/util/List;

    move-result-object v4

    invoke-static {v4, v1}, Lcom/sma/smartv3/model/TodayHealthyDataKt;->getHealthyDataPressure(Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v3}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/db/AppDatabase;->sleepDao()Lcom/sma/smartv3/db/dao/SleepDao;

    move-result-object v4

    aget-wide v7, v2, v5

    const v10, 0x1b77400

    int-to-long v10, v10

    sub-long/2addr v7, v10

    aget-wide v10, v2, v9

    invoke-interface {v4, v7, v8, v10, v11}, Lcom/sma/smartv3/db/dao/SleepDao;->getSleeps(JJ)Ljava/util/List;

    move-result-object v4

    aget-wide v7, v2, v5

    invoke-static {v4, v1, v7, v8, v0}, Lcom/sma/smartv3/model/TodayHealthyDataKt;->getSleepList(Ljava/util/List;Ljava/util/List;JLkotlin/jvm/functions/Function1;)V

    invoke-virtual {v3}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->hrvDao()Lcom/sma/smartv3/db/dao/HrvDao;

    move-result-object v0

    aget-wide v7, v2, v5

    aget-wide v10, v2, v9

    invoke-interface {v0, v7, v8, v10, v11}, Lcom/sma/smartv3/db/dao/HrvDao;->getHrv(JJ)Ljava/util/List;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/entity/Hrv;

    new-instance v10, Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Hrv;->getMTime()J

    move-result-wide v11

    const v4, 0x7f140cfb

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Hrv;->getMValue()I

    move-result v4

    const v7, 0x7f140f7d

    invoke-static {v7}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Hrv;->getMValue()I

    move-result v0

    int-to-float v0, v0

    const/16 v22, 0x2d8

    const/16 v23, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-string v17, "hrv"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    move/from16 v20, v0

    invoke-direct/range {v10 .. v23}, Lcom/sma/smartv3/model/TodayData;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {v3}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->bloodPressureDao()Lcom/sma/smartv3/db/dao/BloodPressureDao;

    move-result-object v0

    aget-wide v7, v2, v5

    aget-wide v10, v2, v9

    invoke-interface {v0, v7, v8, v10, v11}, Lcom/sma/smartv3/db/dao/BloodPressureDao;->getBloodPressures(JJ)Ljava/util/List;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    const/4 v7, 0x3

    if-nez v4, :cond_7

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/entity/BloodPressure;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v4

    const/16 v8, 0x8c

    if-ge v4, v8, :cond_6

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v4

    const/16 v8, 0x5a

    if-lt v4, v8, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v4

    if-ge v4, v8, :cond_5

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v4

    const/16 v8, 0x3c

    if-lt v4, v8, :cond_4

    goto :goto_2

    :cond_4
    const v4, 0x7f1403ba

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v4

    move-object v15, v4

    move/from16 v16, v9

    goto :goto_4

    :cond_5
    :goto_2
    const v4, 0x7f14111a

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v4

    const/4 v8, 0x2

    move-object v15, v4

    move/from16 v16, v8

    goto :goto_4

    :cond_6
    :goto_3
    const v4, 0x7f1403b8

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v4

    move-object v15, v4

    move/from16 v16, v7

    :goto_4
    new-instance v10, Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMTime()J

    move-result-wide v11

    const v4, 0x7f140220

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v4

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v8

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "/"

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v0

    int-to-float v0, v0

    const/16 v22, 0xc0

    const/16 v23, 0x0

    const-string v17, "blood_pressure"

    const/16 v18, 0x0

    const/16 v19, 0x0

    move/from16 v21, v0

    move/from16 v20, v4

    invoke-direct/range {v10 .. v23}, Lcom/sma/smartv3/model/TodayData;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    invoke-virtual {v3}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->temperatureDao()Lcom/sma/smartv3/db/dao/TemperatureDao;

    move-result-object v0

    aget-wide v10, v2, v5

    aget-wide v12, v2, v9

    invoke-interface {v0, v10, v11, v12, v13}, Lcom/sma/smartv3/db/dao/TemperatureDao;->getListDesc(JJ)Ljava/util/List;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_9

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/entity/Temperature;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Temperature;->getMTemperature()I

    move-result v4

    int-to-float v4, v4

    const/high16 v8, 0x41200000    # 10.0f

    div-float/2addr v4, v8

    invoke-virtual {v6}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v6

    invoke-static {v6}, Lcom/android/mltcode/paycertificationapi/cp5;->II1Xi0(I)I

    move-result v6

    if-ne v6, v9, :cond_8

    move v6, v9

    goto :goto_5

    :cond_8
    move v6, v5

    :goto_5
    invoke-static {v4, v6}, Lcom/android/mltcode/paycertificationapi/cp5;->i010I(FZ)F

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v14

    new-instance v10, Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Temperature;->getMTime()J

    move-result-wide v11

    const v4, 0x7f141316

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Temperature;->getMTemperature()I

    move-result v0

    int-to-float v0, v0

    const/16 v22, 0x2d8

    const/16 v23, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-string v17, "temperature"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    move/from16 v20, v0

    invoke-direct/range {v10 .. v23}, Lcom/sma/smartv3/model/TodayData;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    invoke-virtual {v3}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->bloodGlucoseDao()Lcom/sma/smartv3/db/dao/BloodGlucoseDao;

    move-result-object v0

    aget-wide v3, v2, v5

    aget-wide v5, v2, v9

    invoke-interface {v0, v3, v4, v5, v6}, Lcom/sma/smartv3/db/dao/BloodGlucoseDao;->getListDesc(JJ)Ljava/util/List;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_a

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/entity/BloodGlucose;

    new-instance v10, Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodGlucose;->getMTime()J

    move-result-wide v11

    const v2, 0x7f140218

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodGlucose;->getMValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodGlucose;->getMValue()I

    move-result v0

    int-to-float v0, v0

    const/16 v22, 0x2d8

    const/16 v23, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-string v17, "blood_glucose"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    move/from16 v20, v0

    invoke-direct/range {v10 .. v23}, Lcom/sma/smartv3/model/TodayData;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_a
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v9, :cond_b

    new-instance v0, Lcom/sma/smartv3/model/TodayHealthyDataKt$getItemHealthyData$$inlined$sortBy$1;

    invoke-direct {v0}, Lcom/sma/smartv3/model/TodayHealthyDataKt$getItemHealthyData$$inlined$sortBy$1;-><init>()V

    invoke-static {v1, v0}, Lcom/android/mltcode/paycertificationapi/XiX0OOXI0;->XOXiX0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_b
    if-nez p0, :cond_c

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v7, :cond_c

    invoke-static {v1, v7}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IO0OOi(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_c
    return-object v1
.end method

.method public static synthetic getItemHealthyData$default(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0, p1}, Lcom/sma/smartv3/model/TodayHealthyDataKt;->getItemHealthyData(ZLkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final getSleepList(Ljava/util/List;Ljava/util/List;JLkotlin/jvm/functions/Function1;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Sleep;",
            ">;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/TodayData;",
            ">;J",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v1, Lcom/sma/smartv3/model/SleepAllDayDataParse;->INSTANCE:Lcom/sma/smartv3/model/SleepAllDayDataParse;

    const/high16 v3, 0x42c80000    # 100.0f

    const/4 v4, 0x0

    move-object v2, p0

    move-wide v5, p2

    invoke-virtual/range {v1 .. v6}, Lcom/sma/smartv3/model/SleepAllDayDataParse;->filterData(Ljava/util/List;FLjava/util/List;J)Lcom/sma/smartv3/model/SleepAllDayData;

    move-result-object v10

    invoke-virtual {v10}, Lcom/sma/smartv3/model/SleepAllDayData;->getStatus()Landroid/util/SparseIntArray;

    move-result-object p0

    const/16 p2, 0x8

    invoke-virtual {p0, p2}, Landroid/util/SparseIntArray;->get(I)I

    move-result p0

    invoke-static {p0, v2, p1}, Lcom/sma/smartv3/model/TodayHealthyDataKt;->addPiecemealData(ILjava/util/List;Ljava/util/List;)V

    invoke-virtual {v10}, Lcom/sma/smartv3/model/SleepAllDayData;->getTotal()I

    move-result v5

    const/4 v8, 0x0

    move-object v7, p1

    move-object v9, p4

    move-object v6, v2

    invoke-static/range {v5 .. v10}, Lcom/sma/smartv3/model/TodayHealthyDataKt;->addDeepLengthData(ILjava/util/List;Ljava/util/List;ILkotlin/jvm/functions/Function1;Lcom/sma/smartv3/model/SleepAllDayData;)V

    :cond_0
    return-void
.end method

.method public static synthetic getSleepList$default(Ljava/util/List;Ljava/util/List;JLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const-wide/16 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/model/TodayHealthyDataKt;->getSleepList(Ljava/util/List;Ljava/util/List;JLkotlin/jvm/functions/Function1;)V

    return-void
.end method
