.class public final Lcom/sma/smartv3/initializer/WeatherInitializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/s5;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWeatherInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 5 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,551:1\n848#2,30:552\n878#2,3:583\n891#2,4:595\n905#2:607\n848#2,30:608\n878#2,3:639\n891#2,4:651\n905#2:663\n1#3:582\n1#3:638\n1#3:668\n226#4,8:586\n245#4:594\n252#4,7:599\n270#4:606\n226#4,8:642\n245#4:650\n252#4,7:655\n270#4:662\n23#5:664\n18#5,2:665\n15#5:667\n11#5,2:669\n24#5:671\n*S KotlinDebug\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer\n*L\n260#1:552,30\n260#1:583,3\n260#1:595,4\n260#1:607\n387#1:608,30\n387#1:639,3\n387#1:651,4\n387#1:663\n260#1:582\n387#1:638\n496#1:668\n260#1:586,8\n260#1:594\n260#1:599,7\n260#1:606\n387#1:642,8\n387#1:650\n387#1:655,7\n387#1:662\n496#1:664\n496#1:665,2\n496#1:667\n496#1:669,2\n496#1:671\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWeatherInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 5 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,551:1\n848#2,30:552\n878#2,3:583\n891#2,4:595\n905#2:607\n848#2,30:608\n878#2,3:639\n891#2,4:651\n905#2:663\n1#3:582\n1#3:638\n1#3:668\n226#4,8:586\n245#4:594\n252#4,7:599\n270#4:606\n226#4,8:642\n245#4:650\n252#4,7:655\n270#4:662\n23#5:664\n18#5,2:665\n15#5:667\n11#5,2:669\n24#5:671\n*S KotlinDebug\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer\n*L\n260#1:552,30\n260#1:583,3\n260#1:595,4\n260#1:607\n387#1:608,30\n387#1:639,3\n387#1:651,4\n387#1:663\n260#1:582\n387#1:638\n496#1:668\n260#1:586,8\n260#1:594\n260#1:599,7\n260#1:606\n387#1:642,8\n387#1:650\n387#1:655,7\n387#1:662\n496#1:664\n496#1:665,2\n496#1:667\n496#1:669,2\n496#1:671\n*E\n"
    }
.end annotation


# static fields
.field public static final I1:Ljava/lang/String; = "Weather"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final IO:Lcom/sma/smartv3/initializer/WeatherInitializer;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final X11iII1O1:I = 0xc

.field public static X1IX:Lcom/android/mltcode/paycertificationapi/ms; = null
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public static XXX11i:Z = false

.field public static final iX1O1:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/initializer/WeatherInitializer;

    invoke-direct {v0}, Lcom/sma/smartv3/initializer/WeatherInitializer;-><init>()V

    sput-object v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    const/4 v0, 0x1

    sput-boolean v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->XXX11i:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic I0IIOi(Lcom/sma/smartv3/initializer/WeatherInitializer;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/initializer/WeatherInitializer;->OX(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/initializer/WeatherInitializer;DDDILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p7, p7, 0x4

    if-eqz p7, :cond_0

    const-wide/16 p5, 0x0

    :cond_0
    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    invoke-virtual/range {v0 .. v6}, Lcom/sma/smartv3/initializer/WeatherInitializer;->X0O(DDD)V

    return-void
.end method

.method private final IIX1OXO(Lcom/szabh/smable3/entity/BleAgpsPrerequisite;)V
    .locals 9

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->IIXXi1()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->AGPS_PREREQUISITE:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v4, p1

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    return-void

    :cond_0
    move-object v4, p1

    sget-object p1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleAgpsPrerequisite;->getMLongitude()F

    move-result v0

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleAgpsPrerequisite;->getMLatitude()F

    move-result v1

    new-instance v2, Lcom/sma/smartv3/initializer/WeatherInitializer$sendAGPSData$1;

    invoke-direct {v2, v4}, Lcom/sma/smartv3/initializer/WeatherInitializer$sendAGPSData$1;-><init>(Lcom/szabh/smable3/entity/BleAgpsPrerequisite;)V

    invoke-virtual {p1, v0, v1, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->findAltitudeByLocation(FFLcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void
.end method

.method public static final synthetic IiI10X(Lcom/sma/smartv3/initializer/WeatherInitializer;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->iIiiO()V

    return-void
.end method

.method public static final synthetic O00(Lcom/sma/smartv3/initializer/WeatherInitializer;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->I0iXXO()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final OiIIX101O(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Device does not support weather"

    invoke-virtual {p0, v0}, Lcom/android/mltcode/paycertificationapi/tv6;->X1ii(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->OiIIX101O(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic XO0O10()Lcom/android/mltcode/paycertificationapi/ms;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->X1IX:Lcom/android/mltcode/paycertificationapi/ms;

    return-object v0
.end method

.method public static final synthetic XOO0ii0(Lcom/sma/smartv3/initializer/WeatherInitializer;I)I
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/initializer/WeatherInitializer;->OII(I)I

    move-result p0

    return p0
.end method

.method public static final XiOIii1(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    invoke-virtual {v0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->I0iXXO()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "BleConnector is not available"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/android/mltcode/paycertificationapi/tv6;->X1ii(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final iIiiO()V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->X1IX:Lcom/android/mltcode/paycertificationapi/ms;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/ms;->I0IIOi()V

    :cond_0
    return-void
.end method

.method public static synthetic iO(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->XiOIii1(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final I0iXXO()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy/MM/dd HH:mm:ss "

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final IO()Z
    .locals 14

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->i0IX1()Z

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0xc

    const-string v3, "WEATHER_FORECAST_INTERVAL"

    const v4, 0x36ee80

    const-wide/16 v5, 0x3e8

    const/4 v7, 0x1

    if-eqz v0, :cond_2

    sget-object v8, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v9, Lcom/szabh/smable3/BleKey;->WEATHER_FORECAST2:Lcom/szabh/smable3/BleKey;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const-class v10, Lcom/szabh/smable3/entity/BleWeatherForecast2;

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lcom/szabh/smable3/component/BaseBleCache;->getObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleWeatherForecast2;

    if-nez v0, :cond_0

    return v7

    :cond_0
    new-instance v8, Ljava/util/Date;

    invoke-direct {v8}, Ljava/util/Date;-><init>()V

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v8

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleWeatherForecast2;->getMTime()I

    move-result v0

    int-to-long v10, v0

    mul-long/2addr v10, v5

    sub-long/2addr v8, v10

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {v0, v3, v2}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v0

    mul-int/2addr v0, v4

    int-to-long v2, v0

    cmp-long v0, v8, v2

    if-ltz v0, :cond_1

    return v7

    :cond_1
    return v1

    :cond_2
    sget-object v8, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v9, Lcom/szabh/smable3/BleKey;->WEATHER_FORECAST:Lcom/szabh/smable3/BleKey;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const-class v10, Lcom/szabh/smable3/entity/BleWeatherForecast;

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lcom/szabh/smable3/component/BaseBleCache;->getObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleWeatherForecast;

    if-nez v0, :cond_3

    return v7

    :cond_3
    new-instance v8, Ljava/util/Date;

    invoke-direct {v8}, Ljava/util/Date;-><init>()V

    invoke-virtual {v8}, Ljava/util/Date;->getTime()J

    move-result-wide v8

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleWeatherForecast;->getMTime()I

    move-result v0

    int-to-long v10, v0

    mul-long/2addr v10, v5

    sub-long/2addr v8, v10

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {v0, v3, v2}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v0

    mul-int/2addr v0, v4

    int-to-long v2, v0

    cmp-long v0, v8, v2

    if-ltz v0, :cond_4

    return v7

    :cond_4
    return v1
.end method

.method public final O10IXXX0X(DD)V
    .locals 18

    const/4 v1, 0x1

    const-string v2, "lon"

    const-string v3, "lat"

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO()Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_3

    :cond_0
    sget-object v4, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Weather requestWeatherForecast -> lon:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v6, p1

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v8, ",lat:"

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v8, p3

    invoke-virtual {v5, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    sget-object v5, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-static/range {p1 .. p4}, Lcom/sma/smartv3/network/RequestBodyKt;->getWeatherForecastBody(DD)Ljava/util/HashMap;

    move-result-object v6

    new-instance v7, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$1;

    invoke-direct {v7}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$1;-><init>()V

    invoke-virtual {v5}, Lcom/sma/smartv3/network/NetWorkUtils;->getHeadersMap()Ljava/util/Map;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v5, v9, v9}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v10

    sget-object v11, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v11}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v11

    const-string v12, "/weather_info/forecast"

    invoke-virtual {v5, v11, v12}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    sget-object v13, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v13}, Lcom/android/mltcode/paycertificationapi/i72;->II1Xi0()Z

    move-result v14

    const-class v15, [Lcom/sma/smartv3/model/WeatherForecast;

    const/16 v16, 0x0

    const-class v0, Lcom/sma/androidnetworklib/model/Response;

    const-string v9, " getNewApiWeather : enableNewWeatherApi = "

    if-eqz v14, :cond_5

    const-string v4, "/weather_info/realtime"

    invoke-static {v12, v4, v1}, Lcom/android/mltcode/paycertificationapi/oe5;->XIIIO(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "/weather_info/realtime/v2"

    goto :goto_0

    :cond_1
    invoke-static {v12, v12, v1}, Lcom/android/mltcode/paycertificationapi/oe5;->XIIIO(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v4, "/weather_info/forecast/v2"

    goto :goto_0

    :cond_2
    move-object v4, v12

    :goto_0
    invoke-static {v6}, Lkotlin/collections/OXO1;->X111IO(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v13

    :try_start_0
    invoke-interface {v13, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_3

    new-instance v14, Ljava/math/BigDecimal;

    invoke-interface {v13, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    move-object/from16 v1, v17

    check-cast v1, Ljava/lang/String;

    invoke-direct {v14, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    sget-object v1, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 p2, v15

    const/4 v15, 0x1

    :try_start_1
    invoke-virtual {v14, v15, v1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v13, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catch_0
    move-object/from16 p2, v15

    goto :goto_2

    :cond_3
    move-object/from16 p2, v15

    :goto_1
    invoke-interface {v13, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v1, Ljava/math/BigDecimal;

    invoke-interface {v13, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v3, Ljava/lang/String;

    invoke-direct {v1, v3}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    sget-object v3, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const/4 v15, 0x1

    invoke-virtual {v1, v15, v3}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v13, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_4
    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v6}, Lkotlin/collections/OXO1;->X111IO(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v8}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    sget-object v3, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {v5, v1, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v2, Lcom/sma/smartv3/biz/UploadInfoManager;->OXO1:Lcom/sma/smartv3/biz/UploadInfoManager;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/UploadInfoManager;->XO0O10()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/i72;->II1Xi0()Z

    move-result v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v1, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$$inlined$getNewApiWeather$default$1;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v7, v10}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$$inlined$getNewApiWeather$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v1}, Lcom/androidnetworking/AndroidNetworking;->get(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v3

    invoke-virtual {v3, v13}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->addQueryParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->addHeaders(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v1

    sget-object v3, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v1, v3}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v1

    const/4 v15, 0x1

    new-array v3, v15, [Ljava/lang/reflect/Type;

    aput-object p2, v3, v16

    invoke-static {v0, v3}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$$inlined$getNewApiWeather$default$2;

    invoke-direct {v3, v2}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$$inlined$getNewApiWeather$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v1, v0, v3}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    :goto_3
    return-void

    :cond_5
    move-object/from16 p2, v15

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v8}, Lkotlin/collections/OXO1;->Ii0i(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v5, v1, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v1, Lcom/sma/smartv3/biz/UploadInfoManager;->OXO1:Lcom/sma/smartv3/biz/UploadInfoManager;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/UploadInfoManager;->XO0O10()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13}, Lcom/android/mltcode/paycertificationapi/i72;->II1Xi0()Z

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v1, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$$inlined$getNewApiWeather$default$3;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v7, v10}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$$inlined$getNewApiWeather$default$3;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v1}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    sget-object v3, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v1, v3}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v1

    const/4 v15, 0x1

    new-array v3, v15, [Ljava/lang/reflect/Type;

    aput-object p2, v3, v16

    invoke-static {v0, v3}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$$inlined$getNewApiWeather$default$4;

    invoke-direct {v3, v2}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$$inlined$getNewApiWeather$default$4;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v1, v0, v3}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final OII(I)I
    .locals 11

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OXIiiX()Z

    move-result v0

    const/4 v1, 0x6

    const/16 v2, 0x8

    const/16 v3, 0x9

    const/16 v4, 0xa

    const/4 v5, 0x7

    const/4 v6, 0x1

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v10, 0x4

    if-eqz v0, :cond_0

    sparse-switch p1, :sswitch_data_0

    return v9

    :sswitch_0
    return v8

    :sswitch_1
    return v7

    :sswitch_2
    return v6

    :sswitch_3
    const/16 p1, 0x13

    return p1

    :sswitch_4
    return v5

    :sswitch_5
    return v4

    :sswitch_6
    const/16 p1, 0xb

    return p1

    :sswitch_7
    return v3

    :sswitch_8
    const/16 p1, 0x14

    return p1

    :sswitch_9
    const/16 p1, 0x12

    return p1

    :sswitch_a
    const/16 p1, 0x11

    return p1

    :sswitch_b
    return v2

    :sswitch_c
    const/16 p1, 0x10

    return p1

    :sswitch_d
    const/16 p1, 0xe

    return p1

    :sswitch_e
    return v10

    :sswitch_f
    const/16 p1, 0xd

    return p1

    :sswitch_10
    const/16 p1, 0xf

    return p1

    :sswitch_11
    const/4 p1, 0x5

    return p1

    :sswitch_12
    return v1

    :cond_0
    sparse-switch p1, :sswitch_data_1

    return v9

    :sswitch_13
    return v8

    :sswitch_14
    return v7

    :sswitch_15
    return v6

    :sswitch_16
    return v5

    :sswitch_17
    return v4

    :sswitch_18
    return v3

    :sswitch_19
    return v2

    :sswitch_1a
    return v10

    :sswitch_1b
    return v1

    :sswitch_data_0
    .sparse-switch
        0xc8 -> :sswitch_12
        0xc9 -> :sswitch_12
        0xca -> :sswitch_12
        0xd2 -> :sswitch_11
        0xd3 -> :sswitch_11
        0xd4 -> :sswitch_11
        0xdd -> :sswitch_10
        0xe6 -> :sswitch_12
        0xe7 -> :sswitch_12
        0xe8 -> :sswitch_12
        0x12c -> :sswitch_f
        0x12d -> :sswitch_f
        0x12e -> :sswitch_e
        0x136 -> :sswitch_f
        0x137 -> :sswitch_f
        0x138 -> :sswitch_f
        0x139 -> :sswitch_f
        0x13a -> :sswitch_f
        0x141 -> :sswitch_f
        0x1f4 -> :sswitch_e
        0x1f5 -> :sswitch_e
        0x1f6 -> :sswitch_d
        0x1f7 -> :sswitch_d
        0x1f8 -> :sswitch_e
        0x1ff -> :sswitch_e
        0x208 -> :sswitch_e
        0x209 -> :sswitch_e
        0x20a -> :sswitch_e
        0x213 -> :sswitch_e
        0x258 -> :sswitch_c
        0x259 -> :sswitch_b
        0x25a -> :sswitch_a
        0x263 -> :sswitch_9
        0x264 -> :sswitch_9
        0x265 -> :sswitch_9
        0x267 -> :sswitch_9
        0x268 -> :sswitch_9
        0x26c -> :sswitch_9
        0x26d -> :sswitch_8
        0x26e -> :sswitch_a
        0x2bd -> :sswitch_7
        0x2c7 -> :sswitch_7
        0x2d1 -> :sswitch_6
        0x2db -> :sswitch_5
        0x2e5 -> :sswitch_7
        0x2ef -> :sswitch_5
        0x2f9 -> :sswitch_5
        0x2fa -> :sswitch_5
        0x303 -> :sswitch_4
        0x30d -> :sswitch_3
        0x320 -> :sswitch_2
        0x321 -> :sswitch_1
        0x322 -> :sswitch_0
        0x323 -> :sswitch_0
        0x324 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0xc8 -> :sswitch_1b
        0xc9 -> :sswitch_1b
        0xca -> :sswitch_1b
        0xd2 -> :sswitch_1b
        0xd3 -> :sswitch_1b
        0xd4 -> :sswitch_1b
        0xe6 -> :sswitch_1b
        0xe7 -> :sswitch_1b
        0xe8 -> :sswitch_1b
        0x12c -> :sswitch_1a
        0x12d -> :sswitch_1a
        0x12e -> :sswitch_1a
        0x136 -> :sswitch_1a
        0x137 -> :sswitch_1a
        0x138 -> :sswitch_1a
        0x139 -> :sswitch_1a
        0x13a -> :sswitch_1a
        0x141 -> :sswitch_1a
        0x1f4 -> :sswitch_1a
        0x1f5 -> :sswitch_1a
        0x1f6 -> :sswitch_1a
        0x1f7 -> :sswitch_1a
        0x1f8 -> :sswitch_1a
        0x1ff -> :sswitch_1a
        0x208 -> :sswitch_1a
        0x209 -> :sswitch_1a
        0x20a -> :sswitch_1a
        0x213 -> :sswitch_1a
        0x258 -> :sswitch_19
        0x259 -> :sswitch_19
        0x25a -> :sswitch_19
        0x263 -> :sswitch_19
        0x264 -> :sswitch_19
        0x265 -> :sswitch_19
        0x267 -> :sswitch_19
        0x268 -> :sswitch_19
        0x26c -> :sswitch_19
        0x26d -> :sswitch_19
        0x26e -> :sswitch_19
        0x2bd -> :sswitch_18
        0x2c7 -> :sswitch_18
        0x2d1 -> :sswitch_18
        0x2db -> :sswitch_17
        0x2e5 -> :sswitch_18
        0x2ef -> :sswitch_17
        0x2f9 -> :sswitch_17
        0x2fa -> :sswitch_17
        0x303 -> :sswitch_16
        0x30d -> :sswitch_16
        0x320 -> :sswitch_15
        0x321 -> :sswitch_14
        0x322 -> :sswitch_13
        0x323 -> :sswitch_13
        0x324 -> :sswitch_13
    .end sparse-switch
.end method

.method public final OIX0iXi()Z
    .locals 14

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "WEATHER_REALTIME_INTERVAL"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->i0IX1()Z

    move-result v1

    const/4 v3, 0x0

    const v4, 0x36ee80

    const-wide/16 v5, 0x3e8

    const-string v7, ", weatherRealtime:"

    if-eqz v1, :cond_2

    sget-object v8, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v9, Lcom/szabh/smable3/BleKey;->WEATHER_REALTIME2:Lcom/szabh/smable3/BleKey;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const-class v10, Lcom/szabh/smable3/entity/BleWeatherRealtime2;

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lcom/szabh/smable3/component/BaseBleCache;->getObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/szabh/smable3/entity/BleWeatherRealtime2;

    if-nez v1, :cond_0

    return v2

    :cond_0
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Weather isTimeToSyncWeatherRealtime2 ->weatherRealtimeInterval:"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    new-instance v7, Ljava/util/Date;

    invoke-direct {v7}, Ljava/util/Date;-><init>()V

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWeatherRealtime2;->getMTime()I

    move-result v1

    int-to-long v9, v1

    mul-long/2addr v9, v5

    sub-long/2addr v7, v9

    mul-int/2addr v0, v4

    int-to-long v0, v0

    cmp-long v0, v7, v0

    if-ltz v0, :cond_1

    return v2

    :cond_1
    return v3

    :cond_2
    sget-object v8, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v9, Lcom/szabh/smable3/BleKey;->WEATHER_REALTIME:Lcom/szabh/smable3/BleKey;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const-class v10, Lcom/szabh/smable3/entity/BleWeatherRealtime;

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lcom/szabh/smable3/component/BaseBleCache;->getObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/szabh/smable3/entity/BleWeatherRealtime;

    if-nez v1, :cond_3

    return v2

    :cond_3
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Weather isTimeToSyncWeatherRealtime ->weatherRealtimeInterval:"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    new-instance v7, Ljava/util/Date;

    invoke-direct {v7}, Ljava/util/Date;-><init>()V

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWeatherRealtime;->getMTime()I

    move-result v1

    int-to-long v9, v1

    mul-long/2addr v9, v5

    sub-long/2addr v7, v9

    mul-int/2addr v0, v4

    int-to-long v0, v0

    cmp-long v0, v7, v0

    if-ltz v0, :cond_4

    return v2

    :cond_4
    return v3
.end method

.method public final OIi0()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->XXX11i:Z

    return v0
.end method

.method public final OX(Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/android/mltcode/paycertificationapi/tv6;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/android/mltcode/paycertificationapi/tv6;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    :cond_0
    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public OXO1(Landroid/app/Application;)V
    .locals 1
    .param p1    # Landroid/app/Application;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "app"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->XO0O10()Lcom/android/mltcode/paycertificationapi/O11XO1X;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/O11XO1X;->X1ii(Ljava/lang/Object;)V

    return-void
.end method

.method public final X0O(DDD)V
    .locals 19

    move-wide/from16 v0, p1

    move-wide/from16 v2, p3

    move-wide/from16 v4, p5

    const/4 v6, 0x1

    const-string v7, "lon"

    const-string v8, "lat"

    sget-object v9, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Weather requestWeatherRealtime -> lon:"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v11, ",lat:"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v11, ",altitude:"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    const/4 v10, 0x0

    sput-boolean v10, Lcom/sma/smartv3/initializer/WeatherInitializer;->XXX11i:Z

    sget-object v11, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v11}, Lcom/szabh/smable3/component/BaseBleCache;->getMAGpsType()I

    move-result v11

    const/16 v12, 0x9

    if-ne v11, v12, :cond_0

    new-instance v11, Lcom/szabh/smable3/entity/BleAgpsPrerequisite;

    double-to-float v12, v0

    double-to-float v13, v2

    double-to-int v14, v4

    invoke-direct {v11, v12, v13, v14}, Lcom/szabh/smable3/entity/BleAgpsPrerequisite;-><init>(FFI)V

    move-object/from16 v12, p0

    invoke-direct {v12, v11}, Lcom/sma/smartv3/initializer/WeatherInitializer;->IIX1OXO(Lcom/szabh/smable3/entity/BleAgpsPrerequisite;)V

    goto :goto_0

    :cond_0
    move-object/from16 v12, p0

    :goto_0
    sget-object v11, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-static/range {p1 .. p4}, Lcom/sma/smartv3/network/RequestBodyKt;->getWeatherRealtimeBody(DD)Ljava/util/HashMap;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$1;

    invoke-direct {v1, v4, v5}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$1;-><init>(D)V

    invoke-virtual {v11}, Lcom/sma/smartv3/network/NetWorkUtils;->getHeadersMap()Ljava/util/Map;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v11, v3, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v4

    sget-object v5, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v5}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v5

    const-string v13, "/weather_info/realtime"

    invoke-virtual {v11, v5, v13}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v14, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v14}, Lcom/android/mltcode/paycertificationapi/i72;->II1Xi0()Z

    move-result v15

    const-class v16, Lcom/sma/smartv3/model/WeatherRealtime;

    move/from16 v17, v10

    const-class v10, Lcom/sma/androidnetworklib/model/Response;

    const-string v3, " getNewApiWeather : enableNewWeatherApi = "

    if-eqz v15, :cond_5

    invoke-static {v13, v13, v6}, Lcom/android/mltcode/paycertificationapi/oe5;->XIIIO(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-eqz v9, :cond_1

    const-string v9, "/weather_info/realtime/v2"

    goto :goto_1

    :cond_1
    const-string v9, "/weather_info/forecast"

    invoke-static {v13, v9, v6}, Lcom/android/mltcode/paycertificationapi/oe5;->XIIIO(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-eqz v9, :cond_2

    const-string v9, "/weather_info/forecast/v2"

    goto :goto_1

    :cond_2
    move-object v9, v13

    :goto_1
    invoke-static {v0}, Lkotlin/collections/OXO1;->X111IO(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v14

    :try_start_0
    invoke-interface {v14, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_3

    new-instance v15, Ljava/math/BigDecimal;

    invoke-interface {v14, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    move-object/from16 v6, v18

    check-cast v6, Ljava/lang/String;

    invoke-direct {v15, v6}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    sget-object v6, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const/4 v12, 0x1

    invoke-virtual {v15, v12, v6}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v6

    invoke-virtual {v6}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v14, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-interface {v14, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    new-instance v6, Ljava/math/BigDecimal;

    invoke-interface {v14, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v8, Ljava/lang/String;

    invoke-direct {v6, v8}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    sget-object v8, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const/4 v12, 0x1

    invoke-virtual {v6, v12, v8}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object v6

    invoke-virtual {v6}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v14, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_4
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0}, Lkotlin/collections/OXO1;->X111IO(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    sget-object v7, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {v11, v6, v0}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v6, Lcom/sma/smartv3/biz/UploadInfoManager;->OXO1:Lcom/sma/smartv3/biz/UploadInfoManager;

    invoke-virtual {v6}, Lcom/sma/smartv3/biz/UploadInfoManager;->XO0O10()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v7}, Lcom/android/mltcode/paycertificationapi/i72;->II1Xi0()Z

    move-result v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$$inlined$getNewApiWeather$default$1;

    const/4 v5, 0x0

    invoke-direct {v3, v5, v1, v4}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$$inlined$getNewApiWeather$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v0}, Lcom/androidnetworking/AndroidNetworking;->get(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v1

    invoke-virtual {v1, v14}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->addQueryParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->addHeaders(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v0

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    const/4 v12, 0x1

    new-array v1, v12, [Ljava/lang/reflect/Type;

    aput-object v16, v1, v17

    invoke-static {v10, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$$inlined$getNewApiWeather$default$2;

    invoke-direct {v2, v3}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$$inlined$getNewApiWeather$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void

    :cond_5
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v2}, Lkotlin/collections/OXO1;->Ii0i(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v11, v6, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v2, Lcom/sma/smartv3/biz/UploadInfoManager;->OXO1:Lcom/sma/smartv3/biz/UploadInfoManager;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/UploadInfoManager;->XO0O10()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14}, Lcom/android/mltcode/paycertificationapi/i72;->II1Xi0()Z

    move-result v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v2, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$$inlined$getNewApiWeather$default$3;

    const/4 v5, 0x0

    invoke-direct {v3, v5, v1, v4}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$$inlined$getNewApiWeather$default$3;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v2}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    const/4 v12, 0x1

    new-array v1, v12, [Ljava/lang/reflect/Type;

    aput-object v16, v1, v17

    invoke-static {v10, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$$inlined$getNewApiWeather$default$4;

    invoke-direct {v2, v3}, Lcom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$$inlined$getNewApiWeather$default$4;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final X1ii()V
    .locals 1

    const-string v0, "Weather start requestWeather....."

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    new-instance v0, Lcom/sma/smartv3/initializer/WeatherInitializer$XIi00iiXO;

    invoke-direct {v0}, Lcom/sma/smartv3/initializer/WeatherInitializer$XIi00iiXO;-><init>()V

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->executeByIo(Lcom/blankj/utilcode/util/ThreadUtils$Task;)V

    return-void
.end method

.method public final XX0()V
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->XXX11i:Z

    if-nez v0, :cond_0

    const-string v0, "Weather syncWeather -> the last Request not done"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    return-void

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OXii10I()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Weather syncWeather -> Device does not support weather"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zu6;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/zu6;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->OX(Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_1
    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "Weather syncWeather -> BleConnector is not available"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/av6;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/av6;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->OX(Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->OIX0iXi()Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "Weather syncWeather -> Not time to sync weather"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    return-void

    :cond_3
    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-virtual {v0}, Lcom/sma/smartv3/initializer/BleInitializer;->OI()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "Weather firmware update....."

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    return-void

    :cond_4
    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->X1ii()V

    return-void
.end method

.method public final XXI(Ljava/lang/Object;)V
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "LOCATION_WHERE"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BleConnector;->isBound()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "Weather onLocationWhere"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    new-instance p1, Lcom/sma/smartv3/initializer/WeatherInitializer$OXO1;

    invoke-direct {p1}, Lcom/sma/smartv3/initializer/WeatherInitializer$OXO1;-><init>()V

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1}, Lcom/android/mltcode/paycertificationapi/ns;->XIi00iiXO(Lcom/android/mltcode/paycertificationapi/IO0OI;ZILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ms;

    move-result-object p1

    sput-object p1, Lcom/sma/smartv3/initializer/WeatherInitializer;->X1IX:Lcom/android/mltcode/paycertificationapi/ms;

    :cond_0
    return-void
.end method

.method public final XiOIO(Z)V
    .locals 0

    sput-boolean p1, Lcom/sma/smartv3/initializer/WeatherInitializer;->XXX11i:Z

    return-void
.end method
