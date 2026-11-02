.class public final Lcom/sma/smartv3/model/PrayerTimesCalculationMethod$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPrayerTimes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrayerTimes.kt\ncom/sma/smartv3/model/PrayerTimesCalculationMethod$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,413:1\n1#2:414\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPrayerTimes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrayerTimes.kt\ncom/sma/smartv3/model/PrayerTimesCalculationMethod$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,413:1\n1#2:414\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getMethodName(I)Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod$Companion;->getMethods()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->getMethod()I

    move-result v2

    if-ne v2, p1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->getName()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    return-object p1

    :cond_3
    :goto_1
    const-string p1, ""

    return-object p1
.end method

.method public final getMethodParameters(Lcom/sma/smartv3/model/PrayerTimeSettings;)Lcom/batoulapps/adhan2/OXO1;
    .locals 16
    .param p1    # Lcom/sma/smartv3/model/PrayerTimeSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "prayerTimeSettings"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getArsJuristicMethod()I

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/batoulapps/adhan2/Madhab;->HANAFI:Lcom/batoulapps/adhan2/Madhab;

    :goto_0
    move-object v8, v0

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/batoulapps/adhan2/Madhab;->SHAFI:Lcom/batoulapps/adhan2/Madhab;

    goto :goto_0

    :goto_1
    invoke-virtual {v1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getCalculationMethod()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    new-instance v1, Lcom/batoulapps/adhan2/OXO1;

    new-instance v9, Lcom/android/mltcode/paycertificationapi/k22;

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getFajrAdjustment()I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getSunriseAdjustment()I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getDhuhrAdjustment()I

    move-result v12

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getAsrAdjustment()I

    move-result v13

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getMaghribAdjustment()I

    move-result v14

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getIshaAdjustment()I

    move-result v15

    invoke-direct/range {v9 .. v15}, Lcom/android/mltcode/paycertificationapi/k22;-><init>(IIIIII)V

    const/16 v14, 0x36c

    const/4 v15, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v15}, Lcom/batoulapps/adhan2/OXO1;-><init>(DDILcom/batoulapps/adhan2/CalculationMethod;Lcom/batoulapps/adhan2/Madhab;Lcom/batoulapps/adhan2/HighLatitudeRule;Lcom/android/mltcode/paycertificationapi/k22;Lcom/android/mltcode/paycertificationapi/k22;Lcom/batoulapps/adhan2/model/Rounding;Lcom/batoulapps/adhan2/model/Shafaq;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :pswitch_1
    new-instance v1, Lcom/batoulapps/adhan2/OXO1;

    new-instance v9, Lcom/android/mltcode/paycertificationapi/k22;

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getFajrAdjustment()I

    move-result v0

    add-int/lit8 v10, v0, 0x1

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getSunriseAdjustment()I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getDhuhrAdjustment()I

    move-result v12

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getAsrAdjustment()I

    move-result v13

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getMaghribAdjustment()I

    move-result v14

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getIshaAdjustment()I

    move-result v15

    invoke-direct/range {v9 .. v15}, Lcom/android/mltcode/paycertificationapi/k22;-><init>(IIIIII)V

    const/16 v14, 0x36c

    const/4 v15, 0x0

    const-wide/high16 v2, 0x4034000000000000L    # 20.0

    const-wide/high16 v4, 0x4032000000000000L    # 18.0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v15}, Lcom/batoulapps/adhan2/OXO1;-><init>(DDILcom/batoulapps/adhan2/CalculationMethod;Lcom/batoulapps/adhan2/Madhab;Lcom/batoulapps/adhan2/HighLatitudeRule;Lcom/android/mltcode/paycertificationapi/k22;Lcom/android/mltcode/paycertificationapi/k22;Lcom/batoulapps/adhan2/model/Rounding;Lcom/batoulapps/adhan2/model/Shafaq;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :pswitch_2
    new-instance v1, Lcom/batoulapps/adhan2/OXO1;

    new-instance v9, Lcom/android/mltcode/paycertificationapi/k22;

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getFajrAdjustment()I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getSunriseAdjustment()I

    move-result v0

    add-int/lit8 v11, v0, -0x7

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getDhuhrAdjustment()I

    move-result v0

    add-int/lit8 v12, v0, 0x5

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getAsrAdjustment()I

    move-result v0

    add-int/lit8 v13, v0, 0x4

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getMaghribAdjustment()I

    move-result v0

    add-int/lit8 v14, v0, 0x7

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getIshaAdjustment()I

    move-result v15

    invoke-direct/range {v9 .. v15}, Lcom/android/mltcode/paycertificationapi/k22;-><init>(IIIIII)V

    const/16 v14, 0x36c

    const/4 v15, 0x0

    const-wide/high16 v2, 0x4032000000000000L    # 18.0

    const-wide/high16 v4, 0x4031000000000000L    # 17.0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v15}, Lcom/batoulapps/adhan2/OXO1;-><init>(DDILcom/batoulapps/adhan2/CalculationMethod;Lcom/batoulapps/adhan2/Madhab;Lcom/batoulapps/adhan2/HighLatitudeRule;Lcom/android/mltcode/paycertificationapi/k22;Lcom/android/mltcode/paycertificationapi/k22;Lcom/batoulapps/adhan2/model/Rounding;Lcom/batoulapps/adhan2/model/Shafaq;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :pswitch_3
    new-instance v1, Lcom/batoulapps/adhan2/OXO1;

    new-instance v9, Lcom/android/mltcode/paycertificationapi/k22;

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getFajrAdjustment()I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getSunriseAdjustment()I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getDhuhrAdjustment()I

    move-result v0

    add-int/lit8 v12, v0, 0x1

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getAsrAdjustment()I

    move-result v13

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getMaghribAdjustment()I

    move-result v14

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getIshaAdjustment()I

    move-result v15

    invoke-direct/range {v9 .. v15}, Lcom/android/mltcode/paycertificationapi/k22;-><init>(IIIIII)V

    sget-object v12, Lcom/batoulapps/adhan2/model/Rounding;->UP:Lcom/batoulapps/adhan2/model/Rounding;

    const/16 v14, 0x26c

    const/4 v15, 0x0

    const-wide/high16 v2, 0x4034000000000000L    # 20.0

    const-wide/high16 v4, 0x4032000000000000L    # 18.0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v15}, Lcom/batoulapps/adhan2/OXO1;-><init>(DDILcom/batoulapps/adhan2/CalculationMethod;Lcom/batoulapps/adhan2/Madhab;Lcom/batoulapps/adhan2/HighLatitudeRule;Lcom/android/mltcode/paycertificationapi/k22;Lcom/android/mltcode/paycertificationapi/k22;Lcom/batoulapps/adhan2/model/Rounding;Lcom/batoulapps/adhan2/model/Shafaq;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :pswitch_4
    new-instance v1, Lcom/batoulapps/adhan2/OXO1;

    new-instance v9, Lcom/android/mltcode/paycertificationapi/k22;

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getFajrAdjustment()I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getSunriseAdjustment()I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getDhuhrAdjustment()I

    move-result v12

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getAsrAdjustment()I

    move-result v13

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getMaghribAdjustment()I

    move-result v14

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getIshaAdjustment()I

    move-result v15

    invoke-direct/range {v9 .. v15}, Lcom/android/mltcode/paycertificationapi/k22;-><init>(IIIIII)V

    const/16 v14, 0x36a

    const/4 v15, 0x0

    const-wide/high16 v2, 0x4032000000000000L    # 18.0

    const-wide/16 v4, 0x0

    const/16 v6, 0x5a

    const/4 v7, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v15}, Lcom/batoulapps/adhan2/OXO1;-><init>(DDILcom/batoulapps/adhan2/CalculationMethod;Lcom/batoulapps/adhan2/Madhab;Lcom/batoulapps/adhan2/HighLatitudeRule;Lcom/android/mltcode/paycertificationapi/k22;Lcom/android/mltcode/paycertificationapi/k22;Lcom/batoulapps/adhan2/model/Rounding;Lcom/batoulapps/adhan2/model/Shafaq;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :pswitch_5
    new-instance v1, Lcom/batoulapps/adhan2/OXO1;

    new-instance v9, Lcom/android/mltcode/paycertificationapi/k22;

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getFajrAdjustment()I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getSunriseAdjustment()I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getDhuhrAdjustment()I

    move-result v12

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getAsrAdjustment()I

    move-result v13

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getMaghribAdjustment()I

    move-result v14

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getIshaAdjustment()I

    move-result v15

    invoke-direct/range {v9 .. v15}, Lcom/android/mltcode/paycertificationapi/k22;-><init>(IIIIII)V

    const/16 v14, 0x36c

    const/4 v15, 0x0

    const-wide/high16 v2, 0x4032000000000000L    # 18.0

    const-wide v4, 0x4031800000000000L    # 17.5

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v15}, Lcom/batoulapps/adhan2/OXO1;-><init>(DDILcom/batoulapps/adhan2/CalculationMethod;Lcom/batoulapps/adhan2/Madhab;Lcom/batoulapps/adhan2/HighLatitudeRule;Lcom/android/mltcode/paycertificationapi/k22;Lcom/android/mltcode/paycertificationapi/k22;Lcom/batoulapps/adhan2/model/Rounding;Lcom/batoulapps/adhan2/model/Shafaq;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :pswitch_6
    new-instance v1, Lcom/batoulapps/adhan2/OXO1;

    new-instance v9, Lcom/android/mltcode/paycertificationapi/k22;

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getFajrAdjustment()I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getSunriseAdjustment()I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getDhuhrAdjustment()I

    move-result v0

    add-int/lit8 v12, v0, 0x1

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getAsrAdjustment()I

    move-result v13

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getMaghribAdjustment()I

    move-result v14

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getIshaAdjustment()I

    move-result v15

    invoke-direct/range {v9 .. v15}, Lcom/android/mltcode/paycertificationapi/k22;-><init>(IIIIII)V

    const/16 v14, 0x36c

    const/4 v15, 0x0

    const-wide/high16 v2, 0x402e000000000000L    # 15.0

    const-wide/high16 v4, 0x402e000000000000L    # 15.0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v15}, Lcom/batoulapps/adhan2/OXO1;-><init>(DDILcom/batoulapps/adhan2/CalculationMethod;Lcom/batoulapps/adhan2/Madhab;Lcom/batoulapps/adhan2/HighLatitudeRule;Lcom/android/mltcode/paycertificationapi/k22;Lcom/android/mltcode/paycertificationapi/k22;Lcom/batoulapps/adhan2/model/Rounding;Lcom/batoulapps/adhan2/model/Shafaq;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :pswitch_7
    new-instance v1, Lcom/batoulapps/adhan2/OXO1;

    new-instance v9, Lcom/android/mltcode/paycertificationapi/k22;

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getFajrAdjustment()I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getSunriseAdjustment()I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getDhuhrAdjustment()I

    move-result v0

    add-int/lit8 v12, v0, 0x5

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getAsrAdjustment()I

    move-result v13

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getMaghribAdjustment()I

    move-result v0

    add-int/lit8 v14, v0, 0x3

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getIshaAdjustment()I

    move-result v15

    invoke-direct/range {v9 .. v15}, Lcom/android/mltcode/paycertificationapi/k22;-><init>(IIIIII)V

    const/16 v14, 0x36c

    const/4 v15, 0x0

    const-wide/high16 v2, 0x4032000000000000L    # 18.0

    const-wide/high16 v4, 0x4032000000000000L    # 18.0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v15}, Lcom/batoulapps/adhan2/OXO1;-><init>(DDILcom/batoulapps/adhan2/CalculationMethod;Lcom/batoulapps/adhan2/Madhab;Lcom/batoulapps/adhan2/HighLatitudeRule;Lcom/android/mltcode/paycertificationapi/k22;Lcom/android/mltcode/paycertificationapi/k22;Lcom/batoulapps/adhan2/model/Rounding;Lcom/batoulapps/adhan2/model/Shafaq;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :pswitch_8
    new-instance v1, Lcom/batoulapps/adhan2/OXO1;

    new-instance v9, Lcom/android/mltcode/paycertificationapi/k22;

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getFajrAdjustment()I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getSunriseAdjustment()I

    move-result v0

    add-int/lit8 v11, v0, -0x3

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getDhuhrAdjustment()I

    move-result v0

    add-int/lit8 v12, v0, 0x3

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getAsrAdjustment()I

    move-result v0

    add-int/lit8 v13, v0, 0x3

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getMaghribAdjustment()I

    move-result v0

    add-int/lit8 v14, v0, 0x3

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getIshaAdjustment()I

    move-result v15

    invoke-direct/range {v9 .. v15}, Lcom/android/mltcode/paycertificationapi/k22;-><init>(IIIIII)V

    const/16 v14, 0x36c

    const/4 v15, 0x0

    const-wide v2, 0x4032333333333333L    # 18.2

    const-wide v4, 0x4032333333333333L    # 18.2

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v15}, Lcom/batoulapps/adhan2/OXO1;-><init>(DDILcom/batoulapps/adhan2/CalculationMethod;Lcom/batoulapps/adhan2/Madhab;Lcom/batoulapps/adhan2/HighLatitudeRule;Lcom/android/mltcode/paycertificationapi/k22;Lcom/android/mltcode/paycertificationapi/k22;Lcom/batoulapps/adhan2/model/Rounding;Lcom/batoulapps/adhan2/model/Shafaq;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :pswitch_9
    new-instance v1, Lcom/batoulapps/adhan2/OXO1;

    new-instance v9, Lcom/android/mltcode/paycertificationapi/k22;

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getFajrAdjustment()I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getSunriseAdjustment()I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getDhuhrAdjustment()I

    move-result v12

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getAsrAdjustment()I

    move-result v13

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getMaghribAdjustment()I

    move-result v14

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getIshaAdjustment()I

    move-result v15

    invoke-direct/range {v9 .. v15}, Lcom/android/mltcode/paycertificationapi/k22;-><init>(IIIIII)V

    const/16 v14, 0x36a

    const/4 v15, 0x0

    const-wide v2, 0x4032800000000000L    # 18.5

    const-wide/16 v4, 0x0

    const/16 v6, 0x5a

    const/4 v7, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v15}, Lcom/batoulapps/adhan2/OXO1;-><init>(DDILcom/batoulapps/adhan2/CalculationMethod;Lcom/batoulapps/adhan2/Madhab;Lcom/batoulapps/adhan2/HighLatitudeRule;Lcom/android/mltcode/paycertificationapi/k22;Lcom/android/mltcode/paycertificationapi/k22;Lcom/batoulapps/adhan2/model/Rounding;Lcom/batoulapps/adhan2/model/Shafaq;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :pswitch_a
    new-instance v1, Lcom/batoulapps/adhan2/OXO1;

    new-instance v9, Lcom/android/mltcode/paycertificationapi/k22;

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getFajrAdjustment()I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getSunriseAdjustment()I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getDhuhrAdjustment()I

    move-result v0

    add-int/lit8 v12, v0, 0x1

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getAsrAdjustment()I

    move-result v13

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getMaghribAdjustment()I

    move-result v14

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getIshaAdjustment()I

    move-result v15

    invoke-direct/range {v9 .. v15}, Lcom/android/mltcode/paycertificationapi/k22;-><init>(IIIIII)V

    const/16 v14, 0x36c

    const/4 v15, 0x0

    const-wide/high16 v2, 0x4032000000000000L    # 18.0

    const-wide/high16 v4, 0x4032000000000000L    # 18.0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v15}, Lcom/batoulapps/adhan2/OXO1;-><init>(DDILcom/batoulapps/adhan2/CalculationMethod;Lcom/batoulapps/adhan2/Madhab;Lcom/batoulapps/adhan2/HighLatitudeRule;Lcom/android/mltcode/paycertificationapi/k22;Lcom/android/mltcode/paycertificationapi/k22;Lcom/batoulapps/adhan2/model/Rounding;Lcom/batoulapps/adhan2/model/Shafaq;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :pswitch_b
    new-instance v1, Lcom/batoulapps/adhan2/OXO1;

    new-instance v9, Lcom/android/mltcode/paycertificationapi/k22;

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getFajrAdjustment()I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getSunriseAdjustment()I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getDhuhrAdjustment()I

    move-result v0

    add-int/lit8 v12, v0, 0x1

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getAsrAdjustment()I

    move-result v13

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getMaghribAdjustment()I

    move-result v14

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getIshaAdjustment()I

    move-result v15

    invoke-direct/range {v9 .. v15}, Lcom/android/mltcode/paycertificationapi/k22;-><init>(IIIIII)V

    const/16 v14, 0x36c

    const/4 v15, 0x0

    const-wide v2, 0x4033800000000000L    # 19.5

    const-wide v4, 0x4031800000000000L    # 17.5

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v15}, Lcom/batoulapps/adhan2/OXO1;-><init>(DDILcom/batoulapps/adhan2/CalculationMethod;Lcom/batoulapps/adhan2/Madhab;Lcom/batoulapps/adhan2/HighLatitudeRule;Lcom/android/mltcode/paycertificationapi/k22;Lcom/android/mltcode/paycertificationapi/k22;Lcom/batoulapps/adhan2/model/Rounding;Lcom/batoulapps/adhan2/model/Shafaq;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :pswitch_c
    new-instance v1, Lcom/batoulapps/adhan2/OXO1;

    new-instance v9, Lcom/android/mltcode/paycertificationapi/k22;

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getFajrAdjustment()I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getSunriseAdjustment()I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getDhuhrAdjustment()I

    move-result v0

    add-int/lit8 v12, v0, 0x1

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getAsrAdjustment()I

    move-result v13

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getMaghribAdjustment()I

    move-result v14

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/PrayerTimeSettings;->getIshaAdjustment()I

    move-result v15

    invoke-direct/range {v9 .. v15}, Lcom/android/mltcode/paycertificationapi/k22;-><init>(IIIIII)V

    const/16 v14, 0x36c

    const/4 v15, 0x0

    const-wide/high16 v2, 0x4032000000000000L    # 18.0

    const-wide/high16 v4, 0x4031000000000000L    # 17.0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v15}, Lcom/batoulapps/adhan2/OXO1;-><init>(DDILcom/batoulapps/adhan2/CalculationMethod;Lcom/batoulapps/adhan2/Madhab;Lcom/batoulapps/adhan2/HighLatitudeRule;Lcom/android/mltcode/paycertificationapi/k22;Lcom/android/mltcode/paycertificationapi/k22;Lcom/batoulapps/adhan2/model/Rounding;Lcom/batoulapps/adhan2/model/Shafaq;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final getMethods()Ljava/util/List;
    .locals 19
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;

    const-wide/high16 v3, 0x4032000000000000L    # 18.0

    const-wide/high16 v5, 0x4031000000000000L    # 17.0

    const/4 v1, 0x0

    const-string v2, "Muslim World League"

    invoke-direct/range {v0 .. v6}, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;-><init>(ILjava/lang/String;DD)V

    new-instance v1, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;

    const-wide/high16 v4, 0x4034000000000000L    # 20.0

    const-wide/high16 v6, 0x4032000000000000L    # 18.0

    const/16 v2, 0xc

    const-string v3, "Sihat/Kemenag"

    invoke-direct/range {v1 .. v7}, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;-><init>(ILjava/lang/String;DD)V

    new-instance v2, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;

    const-wide v5, 0x4033800000000000L    # 19.5

    const-wide v7, 0x4031800000000000L    # 17.5

    const/4 v3, 0x1

    const-string v4, "Egyptian"

    invoke-direct/range {v2 .. v8}, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;-><init>(ILjava/lang/String;DD)V

    new-instance v3, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;

    const-wide/high16 v6, 0x4032000000000000L    # 18.0

    const-wide/high16 v8, 0x4032000000000000L    # 18.0

    const/4 v4, 0x2

    const-string v5, "Karachi"

    invoke-direct/range {v3 .. v9}, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;-><init>(ILjava/lang/String;DD)V

    new-instance v4, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;

    const-wide v7, 0x4032800000000000L    # 18.5

    const-wide v9, 0x4056800000000000L    # 90.0

    const/4 v5, 0x3

    const-string v6, "Umm al-Qura"

    invoke-direct/range {v4 .. v10}, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;-><init>(ILjava/lang/String;DD)V

    new-instance v5, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;

    const-wide v8, 0x4032333333333333L    # 18.2

    const-wide v10, 0x4032333333333333L    # 18.2

    const/4 v6, 0x4

    const-string v7, "Dubai"

    invoke-direct/range {v5 .. v11}, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;-><init>(ILjava/lang/String;DD)V

    new-instance v6, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;

    const-wide/high16 v9, 0x4032000000000000L    # 18.0

    const-wide/high16 v11, 0x4032000000000000L    # 18.0

    const/4 v7, 0x5

    const-string v8, "Moon Sighting Committee"

    invoke-direct/range {v6 .. v12}, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;-><init>(ILjava/lang/String;DD)V

    new-instance v7, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;

    const-wide/high16 v10, 0x402e000000000000L    # 15.0

    const-wide/high16 v12, 0x402e000000000000L    # 15.0

    const/4 v8, 0x6

    const-string v9, "North America"

    invoke-direct/range {v7 .. v13}, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;-><init>(ILjava/lang/String;DD)V

    new-instance v8, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;

    const-wide/high16 v11, 0x4032000000000000L    # 18.0

    const-wide v13, 0x4031800000000000L    # 17.5

    const/4 v9, 0x7

    const-string v10, "Kuwait"

    invoke-direct/range {v8 .. v14}, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;-><init>(ILjava/lang/String;DD)V

    new-instance v9, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;

    const-wide/high16 v12, 0x4032000000000000L    # 18.0

    const-wide/high16 v14, 0x4032000000000000L    # 18.0

    const/16 v10, 0x8

    const-string v11, "Qatar"

    invoke-direct/range {v9 .. v15}, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;-><init>(ILjava/lang/String;DD)V

    new-instance v10, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;

    const-wide/high16 v13, 0x4034000000000000L    # 20.0

    const-wide/high16 v15, 0x4032000000000000L    # 18.0

    const/16 v11, 0x9

    const-string v12, "Singapore"

    invoke-direct/range {v10 .. v16}, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;-><init>(ILjava/lang/String;DD)V

    new-instance v11, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;

    const-wide/high16 v14, 0x4032000000000000L    # 18.0

    const-wide/high16 v16, 0x4031000000000000L    # 17.0

    const/16 v12, 0xa

    const-string v13, "Turkey"

    invoke-direct/range {v11 .. v17}, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;-><init>(ILjava/lang/String;DD)V

    new-instance v12, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v13, 0xb

    const-string v14, "Other"

    invoke-direct/range {v12 .. v18}, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;-><init>(ILjava/lang/String;DD)V

    filled-new-array/range {v0 .. v12}, [Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iIiiO([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method
