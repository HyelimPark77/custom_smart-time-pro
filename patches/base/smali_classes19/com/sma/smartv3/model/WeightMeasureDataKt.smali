.class public final Lcom/sma/smartv3/model/WeightMeasureDataKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWeightMeasureData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightMeasureData.kt\ncom/sma/smartv3/model/WeightMeasureDataKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,572:1\n1#2:573\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWeightMeasureData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightMeasureData.kt\ncom/sma/smartv3/model/WeightMeasureDataKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,572:1\n1#2:573\n*E\n"
    }
.end annotation


# direct methods
.method public static final centigradeFilter(D)D
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->keepOneDecimal(D)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final getAgeByBirth(Ljava/lang/String;)I
    .locals 7
    .param p0    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SimpleDateFormat"
        }
    .end annotation

    const-string v0, " "

    const-string v1, "birthdayString"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/i72;->IiXIIX1O1()Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance v3, Ljava/text/SimpleDateFormat;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/i72;->XiOIO()Lcom/sma/smartv3/util/DateTimeFormat;

    move-result-object v2

    sget-object v4, Lcom/sma/smartv3/util/DateTimeFormat;->MMddyyyy:Lcom/sma/smartv3/util/DateTimeFormat;

    if-ne v2, v4, :cond_0

    const-string v2, "dd/MM/yyyy"

    goto :goto_0

    :cond_0
    const-string v2, "MM/dd/yyyy"

    :goto_0
    invoke-direct {v3, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    goto :goto_1

    :cond_1
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v3, "dd.MM.yyyy"

    invoke-direct {v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    :goto_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2, v3}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    invoke-virtual {v3, v2}, Ljava/util/Calendar;->after(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    return v1

    :cond_2
    const/4 p0, 0x1

    invoke-virtual {v2, p0}, Ljava/util/Calendar;->get(I)I

    move-result v4

    invoke-virtual {v3, p0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    sub-int/2addr v4, v5

    const/4 v5, 0x2

    invoke-virtual {v2, v5}, Ljava/util/Calendar;->get(I)I

    move-result v6

    invoke-virtual {v3, v5}, Ljava/util/Calendar;->get(I)I

    move-result v5

    sub-int/2addr v6, v5

    const/4 v5, 0x5

    invoke-virtual {v2, v5}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-virtual {v3, v5}, Ljava/util/Calendar;->get(I)I

    move-result v3

    sub-int/2addr v2, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-lez v6, :cond_4

    const/4 v0, 0x6

    if-le v6, v0, :cond_3

    add-int/2addr v4, p0

    return v4

    :cond_3
    if-ne v6, v0, :cond_6

    if-ltz v2, :cond_6

    add-int/2addr v4, p0

    return v4

    :cond_4
    const/4 p0, -0x6

    if-ge v6, p0, :cond_5

    add-int/lit8 v4, v4, -0x1

    return v4

    :cond_5
    if-ne v6, p0, :cond_6

    if-gez v2, :cond_6

    add-int/lit8 v4, v4, -0x1

    :cond_6
    return v4

    :catch_0
    return v1
.end method

.method public static final getLevel(DLjava/util/List;)I
    .locals 6
    .param p2    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)I"
        }
    .end annotation

    const-string v0, "levelRange"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    double-to-int p0, p0

    return p0

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_3

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v3

    cmpg-double v0, p0, v3

    if-gez v0, :cond_1

    return v1

    :cond_1
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    cmpg-double p0, p0, v0

    if-nez p0, :cond_2

    const/4 p0, 0x2

    return p0

    :cond_2
    const/4 p0, 0x3

    return p0

    :cond_3
    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move v0, v2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    add-int/lit8 v0, v2, 0x1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v3

    cmpg-double v1, p0, v3

    if-gtz v1, :cond_4

    return v2

    :cond_4
    move v5, v2

    move v2, v0

    move v0, v5

    goto :goto_0

    :cond_5
    return v0
.end method

.method public static synthetic getLevel$default(DLjava/util/List;ILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object p2

    :cond_0
    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->getLevel(DLjava/util/List;)I

    move-result p0

    return p0
.end method

.method public static final getLevelType(II)Lcom/sma/smartv3/model/LevelType;
    .locals 0
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    if-ge p1, p0, :cond_0

    sget-object p0, Lcom/sma/smartv3/model/LevelType;->LOW:Lcom/sma/smartv3/model/LevelType;

    return-object p0

    :cond_0
    if-le p1, p0, :cond_1

    sget-object p0, Lcom/sma/smartv3/model/LevelType;->HIGH:Lcom/sma/smartv3/model/LevelType;

    return-object p0

    :cond_1
    sget-object p0, Lcom/sma/smartv3/model/LevelType;->STANDARD:Lcom/sma/smartv3/model/LevelType;

    return-object p0
.end method

.method public static final getWeightValue(DI)D
    .locals 1

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    invoke-static {p0, p1}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->kg2Lbs(D)D

    move-result-wide p0

    :cond_0
    return-wide p0
.end method

.method public static final keepOneDecimal(D)Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/text/DecimalFormat;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v1}, Ljava/text/DecimalFormatSymbols;->getInstance(Ljava/util/Locale;)Ljava/text/DecimalFormatSymbols;

    move-result-object v1

    const-string v2, "#.#"

    invoke-direct {v0, v2, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;Ljava/text/DecimalFormatSymbols;)V

    sget-object v1, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    invoke-virtual {v0, v1}, Ljava/text/DecimalFormat;->setRoundingMode(Ljava/math/RoundingMode;)V

    invoke-virtual {v0, p0, p1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object p0

    const-string p1, "format(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final kg2Lbs(D)D
    .locals 2

    const v0, 0x400d187e

    float-to-double v0, v0

    mul-double/2addr p0, v0

    return-wide p0
.end method

.method public static final setBarView(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;DLjava/util/List;[Ljava/lang/String;[IZ)V
    .locals 16
    .param p0    # Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # [Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;",
            "D",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;[",
            "Ljava/lang/String;",
            "[IZ)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    const-string v6, "sbv"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "levelRange"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "levelRangeText"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "levelColor"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    move-object v7, v3

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    const-string v8, ""

    const/4 v9, 0x0

    if-nez v7, :cond_9

    array-length v7, v4

    :goto_0
    const/4 v10, 0x1

    if-ge v9, v7, :cond_7

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v11

    if-gt v9, v11, :cond_7

    if-nez v9, :cond_0

    const/4 v11, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v11

    double-to-float v11, v11

    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v12

    sub-int/2addr v12, v10

    if-ne v9, v12, :cond_1

    float-to-double v12, v11

    add-int/lit8 v14, v9, -0x1

    invoke-interface {v3, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v14

    sub-double/2addr v12, v14

    double-to-float v12, v12

    add-float/2addr v12, v11

    goto :goto_2

    :cond_1
    add-int/lit8 v12, v9, 0x1

    invoke-interface {v3, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v12

    double-to-float v12, v12

    :goto_2
    new-instance v13, Lcom/android/mltcode/paycertificationapi/iz3;

    aget-object v14, v4, v9

    aget v15, v5, v9

    invoke-direct {v13, v11, v12, v14, v15}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFLjava/lang/String;I)V

    invoke-virtual {v13, v8}, Lcom/android/mltcode/paycertificationapi/iz3;->X1ii(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/iz3;

    move-result-object v13

    const-string v14, "&"

    if-eqz p6, :cond_4

    if-nez v9, :cond_2

    invoke-static {v11}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v13, v10}, Lcom/android/mltcode/paycertificationapi/iz3;->X1ii(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/iz3;

    goto :goto_3

    :cond_2
    array-length v15, v4

    sub-int/2addr v15, v10

    if-ne v9, v15, :cond_3

    invoke-static {v12}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v13, v10}, Lcom/android/mltcode/paycertificationapi/iz3;->X1ii(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/iz3;

    goto :goto_3

    :cond_3
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v13, v10}, Lcom/android/mltcode/paycertificationapi/iz3;->X1ii(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/iz3;

    goto :goto_3

    :cond_4
    array-length v15, v4

    const/4 v5, 0x2

    if-ne v15, v5, :cond_5

    if-ne v9, v10, :cond_6

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13, v5}, Lcom/android/mltcode/paycertificationapi/iz3;->X1ii(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/iz3;

    goto :goto_3

    :cond_5
    if-eqz v9, :cond_6

    array-length v5, v4

    sub-int/2addr v5, v10

    if-eq v9, v5, :cond_6

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13, v5}, Lcom/android/mltcode/paycertificationapi/iz3;->X1ii(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/iz3;

    :cond_6
    :goto_3
    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v5, p5

    goto/16 :goto_0

    :cond_7
    invoke-virtual {v0, v10}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setShowDescriptionText(Z)V

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v4, v10

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    cmpl-double v4, v1, v4

    if-lez v4, :cond_8

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v10

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    :cond_8
    double-to-float v1, v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setValue(Ljava/lang/Float;)V

    goto :goto_5

    :cond_9
    array-length v1, v4

    :goto_4
    if-ge v9, v1, :cond_a

    new-instance v2, Lcom/android/mltcode/paycertificationapi/iz3;

    int-to-float v3, v9

    add-int/lit8 v5, v9, 0x1

    int-to-float v7, v5

    aget-object v10, v4, v9

    aget v9, p5, v9

    invoke-direct {v2, v3, v7, v10, v9}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFLjava/lang/String;I)V

    invoke-virtual {v2, v8}, Lcom/android/mltcode/paycertificationapi/iz3;->X1ii(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/iz3;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v9, v5

    goto :goto_4

    :cond_a
    :goto_5
    invoke-virtual {v0, v6}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setSegments(Ljava/util/List;)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f06074b

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setDescriptionTextColor(I)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setDescriptionTopTextColor(I)V

    return-void
.end method

.method public static synthetic setBarView$default(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;DLjava/util/List;[Ljava/lang/String;[IZILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    const/4 p6, 0x0

    :cond_0
    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->setBarView(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;DLjava/util/List;[Ljava/lang/String;[IZ)V

    return-void
.end method

.method public static final setBmi(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;FLjava/util/List;[Ljava/lang/String;[IZ)V
    .locals 8
    .param p0    # Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # [Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;",
            "F",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;[",
            "Ljava/lang/String;",
            "[IZ)V"
        }
    .end annotation

    const-string v0, "levelRange"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "levelRangeText"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "levelColor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    float-to-double v2, p1

    move-object v1, p0

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    invoke-static/range {v1 .. v7}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->setTopCenterBarView(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;DLjava/util/List;[Ljava/lang/String;[IZ)V

    return-void
.end method

.method public static final setLevelView(Landroid/widget/TextView;I[Ljava/lang/String;[I)V
    .locals 3
    .param p0    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # [Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "levelRangeText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "levelColor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-nez v0, :cond_2

    if-ltz p1, :cond_1

    array-length v0, p2

    if-ge p1, v0, :cond_1

    aget-object p2, p2, p1

    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_1
    const/16 p2, 0x8

    invoke-virtual {p0, p2}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    :goto_1
    array-length p2, p3

    if-nez p2, :cond_3

    goto :goto_2

    :cond_3
    move v1, v2

    :goto_2
    if-nez v1, :cond_5

    if-ltz p1, :cond_4

    array-length p2, p3

    if-ge p1, p2, :cond_4

    aget p1, p3, p1

    goto :goto_3

    :cond_4
    aget p1, p3, v2

    :goto_3
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const p3, 0x7f0816dd

    invoke-static {p2, p3}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    const-string p3, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/graphics/drawable/GradientDrawable;

    const/high16 p3, 0x3f800000    # 1.0f

    invoke-static {p3}, Lcom/android/mltcode/paycertificationapi/ed6;->O00(F)F

    move-result p3

    float-to-int p3, p3

    invoke-virtual {p2, p3, p1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    invoke-static {p0, p2}, Lcom/angcyo/dsladapter/LibExKt;->iii0(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0, p2}, Landroid/widget/TextView;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_5
    return-void
.end method

.method public static final setTopCenterBarView(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;DLjava/util/List;[Ljava/lang/String;[IZ)V
    .locals 16
    .param p0    # Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # [Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;",
            "D",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;[",
            "Ljava/lang/String;",
            "[IZ)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    const-string v6, "sbv"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "levelRange"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "levelRangeText"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "levelColor"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    move-object v7, v3

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    const-string v8, ""

    const/4 v9, 0x0

    if-nez v7, :cond_6

    array-length v7, v4

    move v10, v9

    :goto_0
    if-ge v10, v7, :cond_3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v11

    if-gt v10, v11, :cond_3

    if-nez v10, :cond_0

    const/4 v11, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v11

    double-to-float v11, v11

    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v12

    add-int/lit8 v12, v12, -0x1

    if-ne v10, v12, :cond_1

    float-to-double v12, v11

    add-int/lit8 v14, v10, -0x1

    invoke-interface {v3, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v14

    sub-double/2addr v12, v14

    double-to-float v12, v12

    add-float/2addr v12, v11

    goto :goto_2

    :cond_1
    add-int/lit8 v12, v10, 0x1

    invoke-interface {v3, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v12

    double-to-float v12, v12

    :goto_2
    new-instance v13, Lcom/android/mltcode/paycertificationapi/iz3;

    aget-object v14, v4, v10

    aget v15, v5, v10

    invoke-direct {v13, v11, v12, v14, v15}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFLjava/lang/String;I)V

    invoke-virtual {v13, v8}, Lcom/android/mltcode/paycertificationapi/iz3;->X1ii(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/iz3;

    move-result-object v13

    if-eqz p6, :cond_2

    float-to-double v14, v11

    cmpg-double v11, v14, v1

    if-gez v11, :cond_2

    float-to-double v11, v12

    cmpg-double v11, v1, v11

    if-gez v11, :cond_2

    aget-object v11, v4, v10

    invoke-virtual {v13, v11}, Lcom/android/mltcode/paycertificationapi/iz3;->X1ii(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/iz3;

    goto :goto_3

    :cond_2
    invoke-virtual {v13, v8}, Lcom/android/mltcode/paycertificationapi/iz3;->X1ii(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/iz3;

    :goto_3
    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_3
    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    cmpg-double v4, v1, v4

    if-nez v4, :cond_4

    goto :goto_5

    :cond_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    cmpl-double v4, v1, v4

    if-lez v4, :cond_5

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    :cond_5
    double-to-float v1, v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setValue(Ljava/lang/Float;)V

    goto :goto_5

    :cond_6
    array-length v1, v4

    move v2, v9

    :goto_4
    if-ge v2, v1, :cond_7

    new-instance v3, Lcom/android/mltcode/paycertificationapi/iz3;

    int-to-float v7, v2

    add-int/lit8 v10, v2, 0x1

    int-to-float v11, v10

    aget-object v12, v4, v2

    aget v2, v5, v2

    invoke-direct {v3, v7, v11, v12, v2}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFLjava/lang/String;I)V

    invoke-virtual {v3, v8}, Lcom/android/mltcode/paycertificationapi/iz3;->X1ii(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/iz3;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v2, v10

    goto :goto_4

    :cond_7
    :goto_5
    invoke-virtual {v0, v9}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setShowDescriptionText(Z)V

    invoke-virtual {v0, v6}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setSegments(Ljava/util/List;)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f06001e

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setDescriptionTextColor(I)V

    return-void
.end method

.method public static synthetic setTopCenterBarView$default(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;DLjava/util/List;[Ljava/lang/String;[IZILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_0

    const-wide/high16 p1, -0x4010000000000000L    # -1.0

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x20

    if-eqz p1, :cond_1

    const/4 p6, 0x1

    :cond_1
    move-object v0, p0

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->setTopCenterBarView(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;DLjava/util/List;[Ljava/lang/String;[IZ)V

    return-void
.end method
