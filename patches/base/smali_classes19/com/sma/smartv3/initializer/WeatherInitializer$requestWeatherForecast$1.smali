.class public final Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/initializer/WeatherInitializer;->O10IXXX0X(DD)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "[",
        "Lcom/sma/smartv3/model/WeatherForecast;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWeatherInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n11561#2:552\n11896#2,2:553\n11898#2:556\n11561#2:557\n11896#2,3:558\n1#3:555\n*S KotlinDebug\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$1\n*L\n395#1:552\n395#1:553,2\n395#1:556\n447#1:557\n447#1:558,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWeatherInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n11561#2:552\n11896#2,2:553\n11898#2:556\n11561#2:557\n11896#2,3:558\n1#3:555\n*S KotlinDebug\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$1\n*L\n395#1:552\n395#1:553,2\n395#1:556\n447#1:557\n447#1:558,3\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final I0iXXO(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    invoke-static {v0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->O00(Lcom/sma/smartv3/initializer/WeatherInitializer;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "OK"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/android/mltcode/paycertificationapi/tv6;->OIX0iXi(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static final IO(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    invoke-static {v0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->O00(Lcom/sma/smartv3/initializer/WeatherInitializer;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "OK"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/android/mltcode/paycertificationapi/tv6;->OIX0iXi(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic IiI10X(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$1;->I0iXXO(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$1;->XOO0ii0(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final OIX0iXi(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    invoke-static {v0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->O00(Lcom/sma/smartv3/initializer/WeatherInitializer;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "OK , but device not support forecast"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/android/mltcode/paycertificationapi/tv6;->OIX0iXi(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static final OIi0([Lcom/sma/smartv3/model/WeatherForecast;Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    invoke-static {v0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->O00(Lcom/sma/smartv3/initializer/WeatherInitializer;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "toString(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/tv6;->OIX0iXi(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic OXO1(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$1;->XXI(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$1;->OIX0iXi(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$1;->IO(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final XOO0ii0(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    invoke-static {v0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->O00(Lcom/sma/smartv3/initializer/WeatherInitializer;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/tv6;->OIX0iXi(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static final XXI(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    invoke-static {v0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->O00(Lcom/sma/smartv3/initializer/WeatherInitializer;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "OK , but device not support forecast"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/android/mltcode/paycertificationapi/tv6;->OIX0iXi(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic iO([Lcom/sma/smartv3/model/WeatherForecast;Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$1;->OIi0([Lcom/sma/smartv3/model/WeatherForecast;Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public I0IIOi([Lcom/sma/smartv3/model/WeatherForecast;)V
    .locals 40

    move-object/from16 v0, p1

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Weather requestWeatherForecast getWeatherForecast -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v1, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/iv6;

    invoke-direct {v2, v0}, Lcom/android/mltcode/paycertificationapi/iv6;-><init>([Lcom/sma/smartv3/model/WeatherForecast;)V

    invoke-static {v1, v2}, Lcom/sma/smartv3/initializer/WeatherInitializer;->I0IIOi(Lcom/sma/smartv3/initializer/WeatherInitializer;Lkotlin/jvm/functions/Function1;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->i0IX1()Z

    move-result v1

    const/4 v2, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v1, :cond_2

    if-eqz v0, :cond_5

    new-instance v1, Ljava/util/ArrayList;

    array-length v9, v0

    invoke-direct {v1, v9}, Ljava/util/ArrayList;-><init>(I)V

    array-length v9, v0

    move v10, v8

    :goto_0
    if-ge v10, v9, :cond_0

    aget-object v11, v0, v10

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v12

    invoke-virtual {v11}, Lcom/sma/smartv3/model/WeatherForecast;->getSys_sunrise()J

    move-result-wide v13

    const/16 v15, 0x3e8

    const-wide/16 v16, 0x3e8

    int-to-long v3, v15

    mul-long/2addr v13, v3

    invoke-virtual {v12, v13, v14}, Ljava/util/Calendar;->setTimeInMillis(J)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v13

    invoke-virtual {v11}, Lcom/sma/smartv3/model/WeatherForecast;->getSys_sunset()J

    move-result-wide v14

    mul-long/2addr v14, v3

    invoke-virtual {v13, v14, v15}, Ljava/util/Calendar;->setTimeInMillis(J)V

    invoke-virtual {v11}, Lcom/sma/smartv3/model/WeatherForecast;->getTemp_max()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {v11}, Lcom/sma/smartv3/model/WeatherForecast;->getTemp_min()F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v11}, Lcom/sma/smartv3/model/WeatherForecast;->getTemp_day()F

    move-result v14

    float-to-int v14, v14

    sget-object v15, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    const-wide v38, 0x400ccccccccccccdL    # 3.6

    invoke-virtual {v11}, Lcom/sma/smartv3/model/WeatherForecast;->getWeather_id()I

    move-result v5

    invoke-static {v15, v5}, Lcom/sma/smartv3/initializer/WeatherInitializer;->XOO0ii0(Lcom/sma/smartv3/initializer/WeatherInitializer;I)I

    move-result v22

    invoke-virtual {v11}, Lcom/sma/smartv3/model/WeatherForecast;->getWind_speed()F

    move-result v5

    float-to-double v5, v5

    mul-double v5, v5, v38

    double-to-int v5, v5

    invoke-virtual {v11}, Lcom/sma/smartv3/model/WeatherForecast;->getHumidity()I

    move-result v24

    invoke-virtual {v11}, Lcom/sma/smartv3/model/WeatherForecast;->getUvi()I

    move-result v26

    invoke-virtual {v11}, Lcom/sma/smartv3/model/WeatherForecast;->getRain()F

    move-result v6

    float-to-int v6, v6

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v12}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XOO0ii0(Ljava/util/Calendar;)I

    move-result v28

    invoke-static {v12}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->OIi0(Ljava/util/Calendar;)I

    move-result v29

    invoke-static {v12}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XXI(Ljava/util/Calendar;)I

    move-result v30

    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v13}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XOO0ii0(Ljava/util/Calendar;)I

    move-result v31

    invoke-static {v13}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->OIi0(Ljava/util/Calendar;)I

    move-result v32

    invoke-static {v13}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XXI(Ljava/util/Calendar;)I

    move-result v33

    new-instance v18, Lcom/szabh/smable3/entity/BleWeather2;

    const v36, 0x18000

    const/16 v37, 0x0

    const/16 v25, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    move/from16 v20, v3

    move/from16 v21, v4

    move/from16 v23, v5

    move/from16 v27, v6

    move/from16 v19, v14

    invoke-direct/range {v18 .. v37}, Lcom/szabh/smable3/entity/BleWeather2;-><init>(IIIIIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v18

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    :cond_0
    const-wide/16 v16, 0x3e8

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    new-instance v18, Lcom/szabh/smable3/entity/BleWeatherForecast2;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    div-long v3, v3, v16

    long-to-int v0, v3

    invoke-static {v1, v8}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OI1O(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v21, v3

    check-cast v21, Lcom/szabh/smable3/entity/BleWeather2;

    invoke-static {v1, v7}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OI1O(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v22, v3

    check-cast v22, Lcom/szabh/smable3/entity/BleWeather2;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OI1O(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v23, v2

    check-cast v23, Lcom/szabh/smable3/entity/BleWeather2;

    const/4 v2, 0x3

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OI1O(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v24, v2

    check-cast v24, Lcom/szabh/smable3/entity/BleWeather2;

    const/4 v2, 0x4

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OI1O(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v25, v2

    check-cast v25, Lcom/szabh/smable3/entity/BleWeather2;

    const/4 v2, 0x5

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OI1O(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v26, v2

    check-cast v26, Lcom/szabh/smable3/entity/BleWeather2;

    const/4 v2, 0x6

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OI1O(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v27, v1

    check-cast v27, Lcom/szabh/smable3/entity/BleWeather2;

    const/16 v28, 0x2

    const/16 v29, 0x0

    const/16 v20, 0x0

    move/from16 v19, v0

    invoke-direct/range {v18 .. v29}, Lcom/szabh/smable3/entity/BleWeatherForecast2;-><init>(ILjava/lang/String;Lcom/szabh/smable3/entity/BleWeather2;Lcom/szabh/smable3/entity/BleWeather2;Lcom/szabh/smable3/entity/BleWeather2;Lcom/szabh/smable3/entity/BleWeather2;Lcom/szabh/smable3/entity/BleWeather2;Lcom/szabh/smable3/entity/BleWeather2;Lcom/szabh/smable3/entity/BleWeather2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->I011X()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->I0OX()Z

    move-result v0

    if-nez v0, :cond_1

    move-object/from16 v21, v18

    sget-object v18, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v19, Lcom/szabh/smable3/BleKey;->WEATHER_FORECAST2:Lcom/szabh/smable3/BleKey;

    sget-object v20, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v24, 0x18

    const/16 v25, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v18 .. v25}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/jv6;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/jv6;-><init>()V

    invoke-static {v0, v1}, Lcom/sma/smartv3/initializer/WeatherInitializer;->I0IIOi(Lcom/sma/smartv3/initializer/WeatherInitializer;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_1
    sget-object v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/kv6;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/kv6;-><init>()V

    invoke-static {v0, v1}, Lcom/sma/smartv3/initializer/WeatherInitializer;->I0IIOi(Lcom/sma/smartv3/initializer/WeatherInitializer;Lkotlin/jvm/functions/Function1;)V

    sget-object v9, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v10, Lcom/szabh/smable3/BleKey;->WEATHER_FORECAST2:Lcom/szabh/smable3/BleKey;

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    move-object/from16 v11, v18

    invoke-static/range {v9 .. v14}, Lcom/szabh/smable3/component/BaseBleCache;->putObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    return-void

    :cond_2
    const-wide/16 v16, 0x3e8

    const-wide v38, 0x400ccccccccccccdL    # 3.6

    if-eqz v0, :cond_5

    new-instance v1, Ljava/util/ArrayList;

    array-length v3, v0

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, v0

    move v4, v8

    :goto_1
    if-ge v4, v3, :cond_3

    aget-object v5, v0, v4

    new-instance v18, Lcom/szabh/smable3/entity/BleWeather;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/WeatherForecast;->getTemp_max()F

    move-result v6

    float-to-int v6, v6

    invoke-virtual {v5}, Lcom/sma/smartv3/model/WeatherForecast;->getTemp_min()F

    move-result v9

    float-to-int v9, v9

    sget-object v10, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/WeatherForecast;->getWeather_id()I

    move-result v11

    invoke-static {v10, v11}, Lcom/sma/smartv3/initializer/WeatherInitializer;->XOO0ii0(Lcom/sma/smartv3/initializer/WeatherInitializer;I)I

    move-result v22

    invoke-virtual {v5}, Lcom/sma/smartv3/model/WeatherForecast;->getWind_speed()F

    move-result v10

    float-to-double v10, v10

    mul-double v10, v10, v38

    double-to-int v10, v10

    invoke-virtual {v5}, Lcom/sma/smartv3/model/WeatherForecast;->getHumidity()I

    move-result v24

    invoke-virtual {v5}, Lcom/sma/smartv3/model/WeatherForecast;->getUvi()I

    move-result v26

    invoke-virtual {v5}, Lcom/sma/smartv3/model/WeatherForecast;->getRain()F

    move-result v5

    float-to-int v5, v5

    const/16 v28, 0x1

    const/16 v29, 0x0

    const/16 v19, 0x0

    const/16 v25, 0x0

    move/from16 v27, v5

    move/from16 v20, v6

    move/from16 v21, v9

    move/from16 v23, v10

    invoke-direct/range {v18 .. v29}, Lcom/szabh/smable3/entity/BleWeather;-><init>(IIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, v18

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    new-instance v11, Lcom/szabh/smable3/entity/BleWeatherForecast;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    div-long v3, v3, v16

    long-to-int v0, v3

    invoke-static {v1, v8}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OI1O(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/szabh/smable3/entity/BleWeather;

    invoke-static {v1, v7}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OI1O(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/szabh/smable3/entity/BleWeather;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OI1O(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/szabh/smable3/entity/BleWeather;

    invoke-direct {v11, v0, v3, v4, v1}, Lcom/szabh/smable3/entity/BleWeatherForecast;-><init>(ILcom/szabh/smable3/entity/BleWeather;Lcom/szabh/smable3/entity/BleWeather;Lcom/szabh/smable3/entity/BleWeather;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->I011X()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->I0OX()Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v18, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v19, Lcom/szabh/smable3/BleKey;->WEATHER_FORECAST:Lcom/szabh/smable3/BleKey;

    sget-object v20, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v24, 0x18

    const/16 v25, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v21, v11

    invoke-static/range {v18 .. v25}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/lv6;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/lv6;-><init>()V

    invoke-static {v0, v1}, Lcom/sma/smartv3/initializer/WeatherInitializer;->I0IIOi(Lcom/sma/smartv3/initializer/WeatherInitializer;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_4
    move-object/from16 v21, v11

    sget-object v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/mv6;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/mv6;-><init>()V

    invoke-static {v0, v1}, Lcom/sma/smartv3/initializer/WeatherInitializer;->I0IIOi(Lcom/sma/smartv3/initializer/WeatherInitializer;Lkotlin/jvm/functions/Function1;)V

    sget-object v9, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v10, Lcom/szabh/smable3/BleKey;->WEATHER_FORECAST:Lcom/szabh/smable3/BleKey;

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    move-object/from16 v11, v21

    invoke-static/range {v9 .. v14}, Lcom/szabh/smable3/component/BaseBleCache;->putObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    :cond_5
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Weather requestWeatherForecast error -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/hv6;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/hv6;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/sma/smartv3/initializer/WeatherInitializer;->I0IIOi(Lcom/sma/smartv3/initializer/WeatherInitializer;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Lcom/sma/smartv3/model/WeatherForecast;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$1;->I0IIOi([Lcom/sma/smartv3/model/WeatherForecast;)V

    return-void
.end method
