.class public final Lcom/sma/smartv3/model/PrayerTimesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/model/PrayerTimesKt$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPrayerTimes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrayerTimes.kt\ncom/sma/smartv3/model/PrayerTimesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,413:1\n1869#2:414\n1869#2,2:415\n1870#2:417\n*S KotlinDebug\n*F\n+ 1 PrayerTimes.kt\ncom/sma/smartv3/model/PrayerTimesKt\n*L\n368#1:414\n370#1:415,2\n368#1:417\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPrayerTimes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrayerTimes.kt\ncom/sma/smartv3/model/PrayerTimesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,413:1\n1869#2:414\n1869#2,2:415\n1870#2:417\n*S KotlinDebug\n*F\n+ 1 PrayerTimes.kt\ncom/sma/smartv3/model/PrayerTimesKt\n*L\n368#1:414\n370#1:415,2\n368#1:417\n*E\n"
    }
.end annotation


# direct methods
.method public static final getPrayerTime(Lcom/sma/smartv3/model/PrayerTimeSettings;DDJ)Ljava/util/List;
    .locals 7
    .param p0    # Lcom/sma/smartv3/model/PrayerTimeSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/model/PrayerTimeSettings;",
            "DDJ)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/PrayerTime;",
            ">;"
        }
    .end annotation

    const-string v0, "prayerTimeSettings"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/IIIOOX1I1;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/android/mltcode/paycertificationapi/IIIOOX1I1;-><init>(DD)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/X101I10I;->XO0O10:Lcom/android/mltcode/paycertificationapi/X101I10I$OXO1;

    sget-object p2, Lcom/android/mltcode/paycertificationapi/m6;->Companion:Lcom/android/mltcode/paycertificationapi/m6$OXO1;

    invoke-virtual {p2, p5, p6}, Lcom/android/mltcode/paycertificationapi/m6$OXO1;->XIi00iiXO(J)Lcom/android/mltcode/paycertificationapi/m6;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/X101I10I$OXO1;->OXO1(Lcom/android/mltcode/paycertificationapi/m6;)Lcom/android/mltcode/paycertificationapi/X101I10I;

    move-result-object p1

    sget-object p2, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod;->Companion:Lcom/sma/smartv3/model/PrayerTimesCalculationMethod$Companion;

    invoke-virtual {p2, p0}, Lcom/sma/smartv3/model/PrayerTimesCalculationMethod$Companion;->getMethodParameters(Lcom/sma/smartv3/model/PrayerTimeSettings;)Lcom/batoulapps/adhan2/OXO1;

    move-result-object p0

    new-instance p2, Lcom/batoulapps/adhan2/XIi00iiXO;

    invoke-direct {p2, v0, p1, p0}, Lcom/batoulapps/adhan2/XIi00iiXO;-><init>(Lcom/android/mltcode/paycertificationapi/IIIOOX1I1;Lcom/android/mltcode/paycertificationapi/X101I10I;Lcom/batoulapps/adhan2/OXO1;)V

    new-instance v1, Lcom/sma/smartv3/model/PrayerTime;

    sget-object p0, Lcom/sma/smartv3/model/PrayTimeType;->FAJR:Lcom/sma/smartv3/model/PrayTimeType;

    invoke-virtual {p2}, Lcom/batoulapps/adhan2/XIi00iiXO;->X1ii()Lcom/android/mltcode/paycertificationapi/m6;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/m6;->X0O()J

    move-result-wide p3

    invoke-direct {v1, p0, p3, p4}, Lcom/sma/smartv3/model/PrayerTime;-><init>(Lcom/sma/smartv3/model/PrayTimeType;J)V

    new-instance v2, Lcom/sma/smartv3/model/PrayerTime;

    sget-object p0, Lcom/sma/smartv3/model/PrayTimeType;->SUNRISE:Lcom/sma/smartv3/model/PrayTimeType;

    invoke-virtual {p2}, Lcom/batoulapps/adhan2/XIi00iiXO;->I1XOi1()Lcom/android/mltcode/paycertificationapi/m6;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/m6;->X0O()J

    move-result-wide p3

    invoke-direct {v2, p0, p3, p4}, Lcom/sma/smartv3/model/PrayerTime;-><init>(Lcom/sma/smartv3/model/PrayTimeType;J)V

    new-instance v3, Lcom/sma/smartv3/model/PrayerTime;

    sget-object p0, Lcom/sma/smartv3/model/PrayTimeType;->DHUHR:Lcom/sma/smartv3/model/PrayTimeType;

    invoke-virtual {p2}, Lcom/batoulapps/adhan2/XIi00iiXO;->XXI()Lcom/android/mltcode/paycertificationapi/m6;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/m6;->X0O()J

    move-result-wide p3

    invoke-direct {v3, p0, p3, p4}, Lcom/sma/smartv3/model/PrayerTime;-><init>(Lcom/sma/smartv3/model/PrayTimeType;J)V

    new-instance v4, Lcom/sma/smartv3/model/PrayerTime;

    sget-object p0, Lcom/sma/smartv3/model/PrayTimeType;->ASR:Lcom/sma/smartv3/model/PrayTimeType;

    invoke-virtual {p2}, Lcom/batoulapps/adhan2/XIi00iiXO;->OIi0()Lcom/android/mltcode/paycertificationapi/m6;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/m6;->X0O()J

    move-result-wide p3

    invoke-direct {v4, p0, p3, p4}, Lcom/sma/smartv3/model/PrayerTime;-><init>(Lcom/sma/smartv3/model/PrayTimeType;J)V

    new-instance v5, Lcom/sma/smartv3/model/PrayerTime;

    sget-object p0, Lcom/sma/smartv3/model/PrayTimeType;->MAGHRIB:Lcom/sma/smartv3/model/PrayTimeType;

    invoke-virtual {p2}, Lcom/batoulapps/adhan2/XIi00iiXO;->X0O()Lcom/android/mltcode/paycertificationapi/m6;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/m6;->X0O()J

    move-result-wide p3

    invoke-direct {v5, p0, p3, p4}, Lcom/sma/smartv3/model/PrayerTime;-><init>(Lcom/sma/smartv3/model/PrayTimeType;J)V

    new-instance v6, Lcom/sma/smartv3/model/PrayerTime;

    sget-object p0, Lcom/sma/smartv3/model/PrayTimeType;->ISHA:Lcom/sma/smartv3/model/PrayTimeType;

    invoke-virtual {p2}, Lcom/batoulapps/adhan2/XIi00iiXO;->O10IXXX0X()Lcom/android/mltcode/paycertificationapi/m6;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/m6;->X0O()J

    move-result-wide p1

    invoke-direct {v6, p0, p1, p2}, Lcom/sma/smartv3/model/PrayerTime;-><init>(Lcom/sma/smartv3/model/PrayTimeType;J)V

    filled-new-array/range {v1 .. v6}, [Lcom/sma/smartv3/model/PrayerTime;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    move-object p0, v0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "getPrayerTime -> error: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final getPrayerTimeMap(Lcom/sma/smartv3/model/PrayerTimeSettings;DDJI)Ljava/util/Map;
    .locals 16
    .param p0    # Lcom/sma/smartv3/model/PrayerTimeSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/model/PrayerTimeSettings;",
            "DDJI)",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/PrayerTime;",
            ">;>;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-wide/from16 v7, p5

    move/from16 v9, p7

    const-string v1, "prayerTimeSettings"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getPrayerTime -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v3, p1

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v5, ", "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v10, p3

    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v12, Ljava/util/LinkedHashMap;

    invoke-direct {v12}, Ljava/util/LinkedHashMap;-><init>()V

    const/4 v1, 0x0

    move v13, v1

    :goto_0
    if-ge v13, v9, :cond_0

    int-to-long v1, v13

    sget-object v5, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v14, 0x1

    invoke-virtual {v5, v14, v15}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v5

    mul-long/2addr v1, v5

    add-long v5, v7, v1

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    move-wide v1, v3

    move-wide v3, v10

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/model/PrayerTimesKt;->getPrayerTime(Lcom/sma/smartv3/model/PrayerTimeSettings;DDJ)Ljava/util/List;

    move-result-object v5

    invoke-interface {v12, v14, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, p0

    move-wide/from16 v3, p1

    move-wide/from16 v10, p3

    goto :goto_0

    :cond_0
    return-object v12
.end method

.method public static synthetic getPrayerTimeMap$default(Lcom/sma/smartv3/model/PrayerTimeSettings;DDJIILjava/lang/Object;)Ljava/util/Map;
    .locals 9

    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_0

    const/16 v0, 0x1f

    move v8, v0

    :goto_0
    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    move-wide v6, p5

    goto :goto_1

    :cond_0
    move/from16 v8, p7

    goto :goto_0

    :goto_1
    invoke-static/range {v1 .. v8}, Lcom/sma/smartv3/model/PrayerTimesKt;->getPrayerTimeMap(Lcom/sma/smartv3/model/PrayerTimeSettings;DDJI)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final toBlePrayerTimes(Ljava/util/Map;)Ljava/util/List;
    .locals 18
    .param p0    # Ljava/util/Map;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "+",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/PrayerTime;",
            ">;>;)",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BlePrayerTimes;",
            ">;"
        }
    .end annotation

    const-string v0, "map"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    new-instance v3, Lcom/szabh/smable3/entity/BlePrayerTimes;

    const/16 v16, 0xfff

    const/16 v17, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v3 .. v17}, Lcom/szabh/smable3/entity/BlePrayerTimes;-><init>(IIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/model/PrayerTime;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/PrayerTime;->getType()Lcom/sma/smartv3/model/PrayTimeType;

    move-result-object v5

    sget-object v6, Lcom/sma/smartv3/model/PrayerTimesKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v6, v5

    packed-switch v5, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    invoke-virtual {v4}, Lcom/sma/smartv3/model/PrayerTime;->getTimeHour()I

    move-result v5

    invoke-virtual {v3, v5}, Lcom/szabh/smable3/entity/BlePrayerTimes;->setMIshaHour(I)V

    invoke-virtual {v4}, Lcom/sma/smartv3/model/PrayerTime;->getTimeMinute()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/szabh/smable3/entity/BlePrayerTimes;->setMIshaMinite(I)V

    goto :goto_1

    :pswitch_1
    invoke-virtual {v4}, Lcom/sma/smartv3/model/PrayerTime;->getTimeHour()I

    move-result v5

    invoke-virtual {v3, v5}, Lcom/szabh/smable3/entity/BlePrayerTimes;->setMMaghribHour(I)V

    invoke-virtual {v4}, Lcom/sma/smartv3/model/PrayerTime;->getTimeMinute()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/szabh/smable3/entity/BlePrayerTimes;->setMMaghribMinite(I)V

    goto :goto_1

    :pswitch_2
    invoke-virtual {v4}, Lcom/sma/smartv3/model/PrayerTime;->getTimeHour()I

    move-result v5

    invoke-virtual {v3, v5}, Lcom/szabh/smable3/entity/BlePrayerTimes;->setMAsrHour(I)V

    invoke-virtual {v4}, Lcom/sma/smartv3/model/PrayerTime;->getTimeMinute()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/szabh/smable3/entity/BlePrayerTimes;->setMAsrMinite(I)V

    goto :goto_1

    :pswitch_3
    invoke-virtual {v4}, Lcom/sma/smartv3/model/PrayerTime;->getTimeHour()I

    move-result v5

    invoke-virtual {v3, v5}, Lcom/szabh/smable3/entity/BlePrayerTimes;->setMDhuhrHour(I)V

    invoke-virtual {v4}, Lcom/sma/smartv3/model/PrayerTime;->getTimeMinute()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/szabh/smable3/entity/BlePrayerTimes;->setMDhuhrMinite(I)V

    goto :goto_1

    :pswitch_4
    invoke-virtual {v4}, Lcom/sma/smartv3/model/PrayerTime;->getTimeHour()I

    move-result v5

    invoke-virtual {v3, v5}, Lcom/szabh/smable3/entity/BlePrayerTimes;->setMSunriseHour(I)V

    invoke-virtual {v4}, Lcom/sma/smartv3/model/PrayerTime;->getTimeMinute()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/szabh/smable3/entity/BlePrayerTimes;->setMSunriseMinite(I)V

    goto :goto_1

    :pswitch_5
    invoke-virtual {v4}, Lcom/sma/smartv3/model/PrayerTime;->getTimeHour()I

    move-result v5

    invoke-virtual {v3, v5}, Lcom/szabh/smable3/entity/BlePrayerTimes;->setMFajrHour(I)V

    invoke-virtual {v4}, Lcom/sma/smartv3/model/PrayerTime;->getTimeMinute()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/szabh/smable3/entity/BlePrayerTimes;->setMFajrMinite(I)V

    goto :goto_1

    :cond_0
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_1
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
