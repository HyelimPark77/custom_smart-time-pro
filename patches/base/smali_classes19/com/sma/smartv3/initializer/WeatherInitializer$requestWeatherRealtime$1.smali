.class public final Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/initializer/WeatherInitializer;->X0O(DDD)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/smartv3/model/WeatherRealtime;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWeatherInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n85#2,3:552\n1#3:555\n*S KotlinDebug\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$1\n*L\n267#1:552,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWeatherInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n85#2,3:552\n1#3:555\n*S KotlinDebug\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$1\n*L\n267#1:552,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:D


# direct methods
.method public constructor <init>(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$1;->OXO1:D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final I0iXXO(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
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

    invoke-virtual {p0, v0}, Lcom/android/mltcode/paycertificationapi/tv6;->XXI(Ljava/lang/String;)V

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

    invoke-virtual {p0, v0}, Lcom/android/mltcode/paycertificationapi/tv6;->XXI(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic IiI10X(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$1;->IO(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$1;->XOO0ii0(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;

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

    const-string v0, "OK , but device not support realtime"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/android/mltcode/paycertificationapi/tv6;->XXI(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static final OIi0(Lcom/sma/smartv3/model/WeatherRealtime;Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    invoke-static {v0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->O00(Lcom/sma/smartv3/initializer/WeatherInitializer;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/tv6;->XXI(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/model/WeatherRealtime;Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$1;->OIi0(Lcom/sma/smartv3/model/WeatherRealtime;Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$1;->OIX0iXi(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$1;->I0iXXO(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;

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

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/tv6;->XXI(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final XXI(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    invoke-static {v0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->O00(Lcom/sma/smartv3/initializer/WeatherInitializer;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "OK , but device not support realtime"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/android/mltcode/paycertificationapi/tv6;->XXI(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic iO(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$1;->XXI(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public I0IIOi(Lcom/sma/smartv3/model/WeatherRealtime;)V
    .locals 44

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Weather requestWeatherRealtime getWeather -> "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v3, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "RAW_WEATHER_REALTIME"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x5f

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-class v6, Lcom/sma/smartv3/model/WeatherRealtime;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/google/gson/Gson;

    invoke-direct {v6}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v6, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v4, v5, v6, v7}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;Z)V

    sget-object v4, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    new-instance v5, Lcom/android/mltcode/paycertificationapi/ov6;

    invoke-direct {v5, v1}, Lcom/android/mltcode/paycertificationapi/ov6;-><init>(Lcom/sma/smartv3/model/WeatherRealtime;)V

    invoke-static {v4, v5}, Lcom/sma/smartv3/initializer/WeatherInitializer;->I0IIOi(Lcom/sma/smartv3/initializer/WeatherInitializer;Lkotlin/jvm/functions/Function1;)V

    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    sget-object v6, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/q62;->i0IX1()Z

    move-result v7

    const-string v9, "weather_realtime_change"

    const-string v10, "WEATHER_SYNC_TIME"

    const/16 v15, 0x3e8

    const-wide v16, 0x400ccccccccccccdL    # 3.6

    if-eqz v7, :cond_2

    if-eqz v1, :cond_1

    const-wide/16 v18, 0x3e8

    iget-wide v13, v0, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$1;->OXO1:D

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeatherRealtime;->getSys_sunrise()J

    move-result-wide v20

    move-object/from16 v22, v9

    int-to-long v8, v15

    mul-long v11, v20, v8

    invoke-virtual {v7, v11, v12}, Ljava/util/Calendar;->setTimeInMillis(J)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v11

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeatherRealtime;->getSys_sunset()J

    move-result-wide v20

    mul-long v8, v8, v20

    invoke-virtual {v11, v8, v9}, Ljava/util/Calendar;->setTimeInMillis(J)V

    new-instance v8, Lcom/szabh/smable3/entity/BleWeatherRealtime2;

    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v20

    move-object v9, v6

    div-long v5, v20, v18

    long-to-int v5, v5

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeatherRealtime;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeatherRealtime;->getTemp_max()F

    move-result v12

    float-to-int v12, v12

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeatherRealtime;->getTemp_min()F

    move-result v15

    float-to-int v15, v15

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/WeatherRealtime;->getTemp()F

    move-result v1

    float-to-int v1, v1

    move/from16 v25, v1

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/WeatherRealtime;->getWeather_id()I

    move-result v1

    invoke-static {v4, v1}, Lcom/sma/smartv3/initializer/WeatherInitializer;->XOO0ii0(Lcom/sma/smartv3/initializer/WeatherInitializer;I)I

    move-result v28

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/WeatherRealtime;->getWind_speed()F

    move-result v1

    move-object/from16 v21, v11

    move/from16 v26, v12

    float-to-double v11, v1

    mul-double v11, v11, v16

    double-to-int v1, v11

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/WeatherRealtime;->getHumidity()I

    move-result v30

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/WeatherRealtime;->getVisibility()I

    move-result v11

    const/16 v12, 0x3e8

    div-int/2addr v11, v12

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/WeatherRealtime;->getRain_1h()F

    move-result v12

    float-to-int v12, v12

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v7}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XOO0ii0(Ljava/util/Calendar;)I

    move-result v34

    invoke-static {v7}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->OIi0(Ljava/util/Calendar;)I

    move-result v35

    invoke-static {v7}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XXI(Ljava/util/Calendar;)I

    move-result v36

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static/range {v21 .. v21}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XOO0ii0(Ljava/util/Calendar;)I

    move-result v37

    invoke-static/range {v21 .. v21}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->OIi0(Ljava/util/Calendar;)I

    move-result v38

    invoke-static/range {v21 .. v21}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XXI(Ljava/util/Calendar;)I

    move-result v39

    double-to-int v7, v13

    new-instance v24, Lcom/szabh/smable3/entity/BleWeather2;

    const v42, 0x10080

    const/16 v43, 0x0

    const/16 v32, 0x0

    const/16 v41, 0x0

    move/from16 v29, v1

    move/from16 v40, v7

    move/from16 v31, v11

    move/from16 v33, v12

    move/from16 v27, v15

    invoke-direct/range {v24 .. v43}, Lcom/szabh/smable3/entity/BleWeather2;-><init>(IIIIIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v24

    invoke-direct {v8, v5, v6, v1}, Lcom/szabh/smable3/entity/BleWeatherRealtime2;-><init>(ILjava/lang/String;Lcom/szabh/smable3/entity/BleWeather2;)V

    invoke-virtual {v9}, Lcom/android/mltcode/paycertificationapi/q62;->iiX0i1IX()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v9}, Lcom/android/mltcode/paycertificationapi/q62;->I0OX()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v24, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v25, Lcom/szabh/smable3/BleKey;->WEATHER_REALTIME2:Lcom/szabh/smable3/BleKey;

    sget-object v26, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v30, 0x18

    const/16 v31, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move-object/from16 v27, v8

    invoke-static/range {v24 .. v31}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {v1, v10, v5, v6}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/pv6;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/pv6;-><init>()V

    invoke-static {v4, v1}, Lcom/sma/smartv3/initializer/WeatherInitializer;->I0IIOi(Lcom/sma/smartv3/initializer/WeatherInitializer;Lkotlin/jvm/functions/Function1;)V

    move-object/from16 v1, v22

    const/4 v3, 0x0

    const/4 v12, 0x2

    invoke-static {v1, v3, v12, v3}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_0

    :cond_0
    move-object/from16 v26, v8

    new-instance v1, Lcom/android/mltcode/paycertificationapi/qv6;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/qv6;-><init>()V

    invoke-static {v4, v1}, Lcom/sma/smartv3/initializer/WeatherInitializer;->I0IIOi(Lcom/sma/smartv3/initializer/WeatherInitializer;Lkotlin/jvm/functions/Function1;)V

    sget-object v24, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v25, Lcom/szabh/smable3/BleKey;->WEATHER_REALTIME2:Lcom/szabh/smable3/BleKey;

    const/16 v28, 0x4

    const/16 v29, 0x0

    const/16 v27, 0x0

    invoke-static/range {v24 .. v29}, Lcom/szabh/smable3/component/BaseBleCache;->putObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    goto/16 :goto_0

    :cond_1
    move-object v9, v6

    goto/16 :goto_0

    :cond_2
    move-object v1, v9

    const-wide/16 v18, 0x3e8

    move-object v9, v6

    if-eqz p1, :cond_4

    new-instance v6, Lcom/szabh/smable3/entity/BleWeatherRealtime;

    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    div-long v7, v7, v18

    long-to-int v5, v7

    new-instance v23, Lcom/szabh/smable3/entity/BleWeather;

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/WeatherRealtime;->getTemp()F

    move-result v7

    float-to-int v7, v7

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/WeatherRealtime;->getWeather_id()I

    move-result v8

    invoke-static {v4, v8}, Lcom/sma/smartv3/initializer/WeatherInitializer;->XOO0ii0(Lcom/sma/smartv3/initializer/WeatherInitializer;I)I

    move-result v27

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/WeatherRealtime;->getWind_speed()F

    move-result v8

    float-to-double v13, v8

    mul-double v13, v13, v16

    double-to-int v8, v13

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/WeatherRealtime;->getHumidity()I

    move-result v29

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/WeatherRealtime;->getVisibility()I

    move-result v11

    const/16 v13, 0x3e8

    div-int/2addr v11, v13

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/WeatherRealtime;->getRain_1h()F

    move-result v13

    float-to-int v13, v13

    const/16 v33, 0x86

    const/16 v34, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v31, 0x0

    move/from16 v24, v7

    move/from16 v28, v8

    move/from16 v30, v11

    move/from16 v32, v13

    invoke-direct/range {v23 .. v34}, Lcom/szabh/smable3/entity/BleWeather;-><init>(IIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v7, v23

    invoke-direct {v6, v5, v7}, Lcom/szabh/smable3/entity/BleWeatherRealtime;-><init>(ILcom/szabh/smable3/entity/BleWeather;)V

    invoke-virtual {v9}, Lcom/android/mltcode/paycertificationapi/q62;->iiX0i1IX()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v9}, Lcom/android/mltcode/paycertificationapi/q62;->I0OX()Z

    move-result v5

    if-nez v5, :cond_3

    sget-object v13, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v14, Lcom/szabh/smable3/BleKey;->WEATHER_REALTIME:Lcom/szabh/smable3/BleKey;

    sget-object v15, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v19, 0x18

    const/16 v20, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v6

    invoke-static/range {v13 .. v20}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/a01;->iO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {v3, v10, v5, v6}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/rv6;

    invoke-direct {v3}, Lcom/android/mltcode/paycertificationapi/rv6;-><init>()V

    invoke-static {v4, v3}, Lcom/sma/smartv3/initializer/WeatherInitializer;->I0IIOi(Lcom/sma/smartv3/initializer/WeatherInitializer;Lkotlin/jvm/functions/Function1;)V

    const/4 v3, 0x0

    const/4 v12, 0x2

    invoke-static {v1, v3, v12, v3}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_0

    :cond_3
    move-object/from16 v16, v6

    new-instance v1, Lcom/android/mltcode/paycertificationapi/sv6;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/sv6;-><init>()V

    invoke-static {v4, v1}, Lcom/sma/smartv3/initializer/WeatherInitializer;->I0IIOi(Lcom/sma/smartv3/initializer/WeatherInitializer;Lkotlin/jvm/functions/Function1;)V

    sget-object v10, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v11, Lcom/szabh/smable3/BleKey;->WEATHER_REALTIME:Lcom/szabh/smable3/BleKey;

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    move-object/from16 v12, v16

    invoke-static/range {v10 .. v15}, Lcom/szabh/smable3/component/BaseBleCache;->putObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    :cond_4
    :goto_0
    invoke-virtual {v9}, Lcom/android/mltcode/paycertificationapi/q62;->I11iXOO()Z

    move-result v1

    if-eqz v1, :cond_7

    if-eqz p1, :cond_7

    iget-wide v5, v0, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$1;->OXO1:D

    const-wide/16 v7, 0x0

    cmpg-double v1, v5, v7

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    const-wide/16 v7, 0x1

    cmpg-double v1, v5, v7

    if-nez v1, :cond_6

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/WeatherRealtime;->getPressure()I

    move-result v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Weather calculateAltitude -> "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/WeatherRealtime;->getPressure()I

    move-result v1

    int-to-double v1, v1

    invoke-static {v1, v2}, Lcom/sma/smartv3/util/UtilsKt;->OIi0(D)D

    move-result-wide v1

    double-to-int v1, v1

    goto :goto_2

    :cond_6
    double-to-int v1, v5

    :goto_2
    sget-object v5, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v6, Lcom/szabh/smable3/BleKey;->AIR_PRESSURE_CALIBRATION:Lcom/szabh/smable3/BleKey;

    sget-object v7, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v8, Lcom/szabh/smable3/entity/BleAirPressureCalibration;

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/model/WeatherRealtime;->getPressure()I

    move-result v2

    mul-int/lit8 v2, v2, 0x64

    invoke-direct {v8, v2, v1}, Lcom/szabh/smable3/entity/BleAirPressureCalibration;-><init>(II)V

    const/16 v11, 0x18

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    :cond_7
    const/4 v1, 0x1

    invoke-virtual {v4, v1}, Lcom/sma/smartv3/initializer/WeatherInitializer;->XiOIO(Z)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Weather requestWeatherRealtime error -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/nv6;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/nv6;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/sma/smartv3/initializer/WeatherInitializer;->I0IIOi(Lcom/sma/smartv3/initializer/WeatherInitializer;Lkotlin/jvm/functions/Function1;)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/initializer/WeatherInitializer;->XiOIO(Z)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/WeatherRealtime;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$1;->I0IIOi(Lcom/sma/smartv3/model/WeatherRealtime;)V

    return-void
.end method
