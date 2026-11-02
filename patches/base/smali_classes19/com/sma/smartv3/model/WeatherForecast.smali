.class public final Lcom/sma/smartv3/model/WeatherForecast;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private clouds_all:I

.field private cnt:I

.field private dt:J

.field private dt_read:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private feels_like_day:F

.field private feels_like_eve:F

.field private feels_like_morn:F

.field private feels_like_night:F

.field private humidity:I

.field private lat:F

.field private lon:F

.field private population:I

.field private pressure:I

.field private rain:F

.field private rain_pop:F

.field private snow:F

.field private sys_cod:I

.field private sys_country:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private sys_message:F

.field private sys_sunrise:J

.field private sys_sunrise_read:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private sys_sunset:J

.field private sys_sunset_read:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private temp_day:F

.field private temp_eve:F

.field private temp_max:F

.field private temp_min:F

.field private temp_morn:F

.field private temp_night:F

.field private timezone:I

.field private updateTime:J

.field private uvi:I

.field private weather_description:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private weather_icon:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private weather_id:I

.field private weather_main:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private wind_deg:I

.field private wind_gust:F

.field private wind_speed:F


# direct methods
.method public constructor <init>(FFLjava/lang/String;IIIFIJLjava/lang/String;FFFFFFFFFFIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;FIFIIFFFJLjava/lang/String;JLjava/lang/String;J)V
    .locals 7
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p25    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p26    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p27    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p38    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p41    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-object/from16 v0, p11

    move-object/from16 v1, p25

    move-object/from16 v2, p26

    move-object/from16 v3, p27

    move-object/from16 v4, p38

    move-object/from16 v5, p41

    const-string v6, "sys_country"

    invoke-static {p3, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "dt_read"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "weather_main"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "weather_description"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "weather_icon"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "sys_sunrise_read"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "sys_sunset_read"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->lat:F

    iput p2, p0, Lcom/sma/smartv3/model/WeatherForecast;->lon:F

    iput-object p3, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_country:Ljava/lang/String;

    iput p4, p0, Lcom/sma/smartv3/model/WeatherForecast;->population:I

    iput p5, p0, Lcom/sma/smartv3/model/WeatherForecast;->timezone:I

    iput p6, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_cod:I

    iput p7, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_message:F

    iput p8, p0, Lcom/sma/smartv3/model/WeatherForecast;->cnt:I

    move-wide/from16 p1, p9

    iput-wide p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->dt:J

    iput-object v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->dt_read:Ljava/lang/String;

    move/from16 p1, p12

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_day:F

    move/from16 p1, p13

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_min:F

    move/from16 p1, p14

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_max:F

    move/from16 p1, p15

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_night:F

    move/from16 p1, p16

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_eve:F

    move/from16 p1, p17

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_morn:F

    move/from16 p1, p18

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_day:F

    move/from16 p1, p19

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_night:F

    move/from16 p1, p20

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_eve:F

    move/from16 p1, p21

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_morn:F

    move/from16 p1, p22

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->pressure:I

    move/from16 p1, p23

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->humidity:I

    move/from16 p1, p24

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_id:I

    iput-object v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_main:Ljava/lang/String;

    iput-object v2, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_description:Ljava/lang/String;

    iput-object v3, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_icon:Ljava/lang/String;

    move/from16 p1, p28

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->wind_speed:F

    move/from16 p1, p29

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->wind_deg:I

    move/from16 p1, p30

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->wind_gust:F

    move/from16 p1, p31

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->clouds_all:I

    move/from16 p1, p32

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->uvi:I

    move/from16 p1, p33

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->rain:F

    move/from16 p1, p34

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->snow:F

    move/from16 p1, p35

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->rain_pop:F

    move-wide/from16 p1, p36

    iput-wide p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunrise:J

    iput-object v4, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunrise_read:Ljava/lang/String;

    move-wide/from16 p1, p39

    iput-wide p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunset:J

    iput-object v5, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunset_read:Ljava/lang/String;

    move-wide/from16 p1, p42

    iput-wide p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->updateTime:J

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/WeatherForecast;FFLjava/lang/String;IIIFIJLjava/lang/String;FFFFFFFFFFIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;FIFIIFFFJLjava/lang/String;JLjava/lang/String;JIILjava/lang/Object;)Lcom/sma/smartv3/model/WeatherForecast;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p44

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/sma/smartv3/model/WeatherForecast;->lat:F

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/sma/smartv3/model/WeatherForecast;->lon:F

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/sma/smartv3/model/WeatherForecast;->sys_country:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/sma/smartv3/model/WeatherForecast;->population:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lcom/sma/smartv3/model/WeatherForecast;->timezone:I

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lcom/sma/smartv3/model/WeatherForecast;->sys_cod:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lcom/sma/smartv3/model/WeatherForecast;->sys_message:F

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lcom/sma/smartv3/model/WeatherForecast;->cnt:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-wide v10, v0, Lcom/sma/smartv3/model/WeatherForecast;->dt:J

    goto :goto_8

    :cond_8
    move-wide/from16 v10, p9

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-object v12, v0, Lcom/sma/smartv3/model/WeatherForecast;->dt_read:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget v13, v0, Lcom/sma/smartv3/model/WeatherForecast;->temp_day:F

    goto :goto_a

    :cond_a
    move/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget v14, v0, Lcom/sma/smartv3/model/WeatherForecast;->temp_min:F

    goto :goto_b

    :cond_b
    move/from16 v14, p13

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget v15, v0, Lcom/sma/smartv3/model/WeatherForecast;->temp_max:F

    goto :goto_c

    :cond_c
    move/from16 v15, p14

    :goto_c
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget v2, v0, Lcom/sma/smartv3/model/WeatherForecast;->temp_night:F

    goto :goto_d

    :cond_d
    move/from16 v2, p15

    :goto_d
    move/from16 p2, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget v2, v0, Lcom/sma/smartv3/model/WeatherForecast;->temp_eve:F

    goto :goto_e

    :cond_e
    move/from16 v2, p16

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->temp_morn:F

    goto :goto_f

    :cond_f
    move/from16 v1, p17

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p44, v16

    move/from16 p3, v1

    if-eqz v16, :cond_10

    iget v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_day:F

    goto :goto_10

    :cond_10
    move/from16 v1, p18

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p44, v16

    move/from16 p4, v1

    if-eqz v16, :cond_11

    iget v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_night:F

    goto :goto_11

    :cond_11
    move/from16 v1, p19

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p44, v16

    move/from16 p5, v1

    if-eqz v16, :cond_12

    iget v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_eve:F

    goto :goto_12

    :cond_12
    move/from16 v1, p20

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p44, v16

    move/from16 p6, v1

    if-eqz v16, :cond_13

    iget v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_morn:F

    goto :goto_13

    :cond_13
    move/from16 v1, p21

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p44, v16

    move/from16 p7, v1

    if-eqz v16, :cond_14

    iget v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->pressure:I

    goto :goto_14

    :cond_14
    move/from16 v1, p22

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p44, v16

    move/from16 p8, v1

    if-eqz v16, :cond_15

    iget v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->humidity:I

    goto :goto_15

    :cond_15
    move/from16 v1, p23

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p44, v16

    move/from16 p9, v1

    if-eqz v16, :cond_16

    iget v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->weather_id:I

    goto :goto_16

    :cond_16
    move/from16 v1, p24

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p44, v16

    move/from16 p10, v1

    if-eqz v16, :cond_17

    iget-object v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->weather_main:Ljava/lang/String;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p25

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p44, v16

    move-object/from16 p11, v1

    if-eqz v16, :cond_18

    iget-object v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->weather_description:Ljava/lang/String;

    goto :goto_18

    :cond_18
    move-object/from16 v1, p26

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p44, v16

    move-object/from16 p12, v1

    if-eqz v16, :cond_19

    iget-object v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->weather_icon:Ljava/lang/String;

    goto :goto_19

    :cond_19
    move-object/from16 v1, p27

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, p44, v16

    move-object/from16 p13, v1

    if-eqz v16, :cond_1a

    iget v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->wind_speed:F

    goto :goto_1a

    :cond_1a
    move/from16 v1, p28

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v16, p44, v16

    move/from16 p14, v1

    if-eqz v16, :cond_1b

    iget v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->wind_deg:I

    goto :goto_1b

    :cond_1b
    move/from16 v1, p29

    :goto_1b
    const/high16 v16, 0x10000000

    and-int v16, p44, v16

    move/from16 p15, v1

    if-eqz v16, :cond_1c

    iget v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->wind_gust:F

    goto :goto_1c

    :cond_1c
    move/from16 v1, p30

    :goto_1c
    const/high16 v16, 0x20000000

    and-int v16, p44, v16

    move/from16 p16, v1

    if-eqz v16, :cond_1d

    iget v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->clouds_all:I

    goto :goto_1d

    :cond_1d
    move/from16 v1, p31

    :goto_1d
    const/high16 v16, 0x40000000    # 2.0f

    and-int v16, p44, v16

    move/from16 p17, v1

    if-eqz v16, :cond_1e

    iget v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->uvi:I

    goto :goto_1e

    :cond_1e
    move/from16 v1, p32

    :goto_1e
    const/high16 v16, -0x80000000

    and-int v16, p44, v16

    move/from16 p18, v1

    if-eqz v16, :cond_1f

    iget v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->rain:F

    goto :goto_1f

    :cond_1f
    move/from16 v1, p33

    :goto_1f
    and-int/lit8 v16, p45, 0x1

    move/from16 p19, v1

    if-eqz v16, :cond_20

    iget v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->snow:F

    goto :goto_20

    :cond_20
    move/from16 v1, p34

    :goto_20
    and-int/lit8 v16, p45, 0x2

    move/from16 p20, v1

    if-eqz v16, :cond_21

    iget v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->rain_pop:F

    goto :goto_21

    :cond_21
    move/from16 v1, p35

    :goto_21
    and-int/lit8 v16, p45, 0x4

    move/from16 p21, v1

    move/from16 p46, v2

    if-eqz v16, :cond_22

    iget-wide v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunrise:J

    goto :goto_22

    :cond_22
    move-wide/from16 v1, p36

    :goto_22
    and-int/lit8 v16, p45, 0x8

    move-wide/from16 p22, v1

    if-eqz v16, :cond_23

    iget-object v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunrise_read:Ljava/lang/String;

    goto :goto_23

    :cond_23
    move-object/from16 v1, p38

    :goto_23
    and-int/lit8 v2, p45, 0x10

    move-object/from16 p24, v1

    if-eqz v2, :cond_24

    iget-wide v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunset:J

    goto :goto_24

    :cond_24
    move-wide/from16 v1, p39

    :goto_24
    and-int/lit8 v16, p45, 0x20

    move-wide/from16 p25, v1

    if-eqz v16, :cond_25

    iget-object v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunset_read:Ljava/lang/String;

    goto :goto_25

    :cond_25
    move-object/from16 v1, p41

    :goto_25
    and-int/lit8 v2, p45, 0x40

    if-eqz v2, :cond_26

    move-object/from16 p27, v1

    iget-wide v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->updateTime:J

    move-object/from16 p42, p27

    move-wide/from16 p43, v1

    move-object/from16 p28, p13

    move/from16 p29, p14

    move/from16 p30, p15

    move/from16 p31, p16

    move/from16 p32, p17

    move/from16 p33, p18

    move/from16 p34, p19

    move/from16 p35, p20

    move/from16 p36, p21

    move-wide/from16 p37, p22

    move-object/from16 p39, p24

    move-wide/from16 p40, p25

    move/from16 p17, p46

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move/from16 p16, p2

    move/from16 p18, p3

    move/from16 p19, p4

    move/from16 p20, p5

    move/from16 p21, p6

    move/from16 p22, p7

    move/from16 p23, p8

    move/from16 p24, p9

    move/from16 p25, p10

    move-object/from16 p26, p11

    move-object/from16 p27, p12

    move/from16 p3, v3

    move-object/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move-wide/from16 p10, v10

    move-object/from16 p12, v12

    :goto_26
    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_27

    :cond_26
    move-wide/from16 p43, p42

    move-object/from16 p42, v1

    move-object/from16 p27, p12

    move-object/from16 p28, p13

    move/from16 p29, p14

    move/from16 p30, p15

    move/from16 p31, p16

    move/from16 p32, p17

    move/from16 p33, p18

    move/from16 p34, p19

    move/from16 p35, p20

    move/from16 p36, p21

    move-wide/from16 p37, p22

    move-object/from16 p39, p24

    move-wide/from16 p40, p25

    move/from16 p17, p46

    move-object/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move/from16 p16, p2

    move/from16 p18, p3

    move/from16 p19, p4

    move/from16 p20, p5

    move/from16 p21, p6

    move/from16 p22, p7

    move/from16 p23, p8

    move/from16 p24, p9

    move/from16 p25, p10

    move-object/from16 p26, p11

    move/from16 p3, v3

    move-object/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move-wide/from16 p10, v10

    goto :goto_26

    :goto_27
    invoke-virtual/range {p1 .. p44}, Lcom/sma/smartv3/model/WeatherForecast;->copy(FFLjava/lang/String;IIIFIJLjava/lang/String;FFFFFFFFFFIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;FIFIIFFFJLjava/lang/String;JLjava/lang/String;J)Lcom/sma/smartv3/model/WeatherForecast;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->lat:F

    return v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->dt_read:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_day:F

    return v0
.end method

.method public final component12()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_min:F

    return v0
.end method

.method public final component13()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_max:F

    return v0
.end method

.method public final component14()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_night:F

    return v0
.end method

.method public final component15()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_eve:F

    return v0
.end method

.method public final component16()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_morn:F

    return v0
.end method

.method public final component17()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_day:F

    return v0
.end method

.method public final component18()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_night:F

    return v0
.end method

.method public final component19()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_eve:F

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->lon:F

    return v0
.end method

.method public final component20()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_morn:F

    return v0
.end method

.method public final component21()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->pressure:I

    return v0
.end method

.method public final component22()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->humidity:I

    return v0
.end method

.method public final component23()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_id:I

    return v0
.end method

.method public final component24()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_main:Ljava/lang/String;

    return-object v0
.end method

.method public final component25()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_description:Ljava/lang/String;

    return-object v0
.end method

.method public final component26()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_icon:Ljava/lang/String;

    return-object v0
.end method

.method public final component27()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->wind_speed:F

    return v0
.end method

.method public final component28()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->wind_deg:I

    return v0
.end method

.method public final component29()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->wind_gust:F

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_country:Ljava/lang/String;

    return-object v0
.end method

.method public final component30()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->clouds_all:I

    return v0
.end method

.method public final component31()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->uvi:I

    return v0
.end method

.method public final component32()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->rain:F

    return v0
.end method

.method public final component33()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->snow:F

    return v0
.end method

.method public final component34()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->rain_pop:F

    return v0
.end method

.method public final component35()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunrise:J

    return-wide v0
.end method

.method public final component36()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunrise_read:Ljava/lang/String;

    return-object v0
.end method

.method public final component37()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunset:J

    return-wide v0
.end method

.method public final component38()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunset_read:Ljava/lang/String;

    return-object v0
.end method

.method public final component39()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->updateTime:J

    return-wide v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->population:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->timezone:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_cod:I

    return v0
.end method

.method public final component7()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_message:F

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->cnt:I

    return v0
.end method

.method public final component9()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->dt:J

    return-wide v0
.end method

.method public final copy(FFLjava/lang/String;IIIFIJLjava/lang/String;FFFFFFFFFFIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;FIFIIFFFJLjava/lang/String;JLjava/lang/String;J)Lcom/sma/smartv3/model/WeatherForecast;
    .locals 45
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p11    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p25    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p26    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p27    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p38    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p41    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "sys_country"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dt_read"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weather_main"

    move-object/from16 v1, p25

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weather_description"

    move-object/from16 v2, p26

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weather_icon"

    move-object/from16 v3, p27

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sys_sunrise_read"

    move-object/from16 v5, p38

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sys_sunset_read"

    move-object/from16 v6, p41

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/WeatherForecast;

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-wide/from16 v10, p9

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move/from16 v19, p18

    move/from16 v20, p19

    move/from16 v21, p20

    move/from16 v22, p21

    move/from16 v23, p22

    move/from16 v24, p23

    move/from16 v25, p24

    move-object/from16 v26, p25

    move/from16 v29, p28

    move/from16 v30, p29

    move/from16 v31, p30

    move/from16 v32, p31

    move/from16 v33, p32

    move/from16 v34, p33

    move/from16 v35, p34

    move/from16 v36, p35

    move-wide/from16 v37, p36

    move-wide/from16 v40, p39

    move-wide/from16 v43, p42

    move-object/from16 v27, v2

    move-object/from16 v28, v3

    move-object/from16 v39, v5

    move-object/from16 v42, v6

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v5, p4

    move/from16 v6, p5

    invoke-direct/range {v1 .. v44}, Lcom/sma/smartv3/model/WeatherForecast;-><init>(FFLjava/lang/String;IIIFIJLjava/lang/String;FFFFFFFFFFIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;FIFIIFFFJLjava/lang/String;JLjava/lang/String;J)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/sma/smartv3/model/WeatherForecast;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/WeatherForecast;

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->lat:F

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->lat:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->lon:F

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->lon:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_country:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->sys_country:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->population:I

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->population:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->timezone:I

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->timezone:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_cod:I

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->sys_cod:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_message:F

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->sys_message:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->cnt:I

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->cnt:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Lcom/sma/smartv3/model/WeatherForecast;->dt:J

    iget-wide v5, p1, Lcom/sma/smartv3/model/WeatherForecast;->dt:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->dt_read:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->dt_read:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_day:F

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->temp_day:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_min:F

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->temp_min:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_max:F

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->temp_max:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_night:F

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->temp_night:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_eve:F

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->temp_eve:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_morn:F

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->temp_morn:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_day:F

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_day:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_12

    return v2

    :cond_12
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_night:F

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_night:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_eve:F

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_eve:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_14

    return v2

    :cond_14
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_morn:F

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_morn:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_15

    return v2

    :cond_15
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->pressure:I

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->pressure:I

    if-eq v1, v3, :cond_16

    return v2

    :cond_16
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->humidity:I

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->humidity:I

    if-eq v1, v3, :cond_17

    return v2

    :cond_17
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_id:I

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->weather_id:I

    if-eq v1, v3, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_main:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->weather_main:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_description:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->weather_description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_icon:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->weather_icon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->wind_speed:F

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->wind_speed:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_1c

    return v2

    :cond_1c
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->wind_deg:I

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->wind_deg:I

    if-eq v1, v3, :cond_1d

    return v2

    :cond_1d
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->wind_gust:F

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->wind_gust:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_1e

    return v2

    :cond_1e
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->clouds_all:I

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->clouds_all:I

    if-eq v1, v3, :cond_1f

    return v2

    :cond_1f
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->uvi:I

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->uvi:I

    if-eq v1, v3, :cond_20

    return v2

    :cond_20
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->rain:F

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->rain:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_21

    return v2

    :cond_21
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->snow:F

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->snow:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_22

    return v2

    :cond_22
    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->rain_pop:F

    iget v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->rain_pop:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_23

    return v2

    :cond_23
    iget-wide v3, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunrise:J

    iget-wide v5, p1, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunrise:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_24

    return v2

    :cond_24
    iget-object v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunrise_read:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunrise_read:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    return v2

    :cond_25
    iget-wide v3, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunset:J

    iget-wide v5, p1, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunset:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_26

    return v2

    :cond_26
    iget-object v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunset_read:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunset_read:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    return v2

    :cond_27
    iget-wide v3, p0, Lcom/sma/smartv3/model/WeatherForecast;->updateTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/model/WeatherForecast;->updateTime:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_28

    return v2

    :cond_28
    return v0
.end method

.method public final getClouds_all()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->clouds_all:I

    return v0
.end method

.method public final getCnt()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->cnt:I

    return v0
.end method

.method public final getDt()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->dt:J

    return-wide v0
.end method

.method public final getDt_read()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->dt_read:Ljava/lang/String;

    return-object v0
.end method

.method public final getFeels_like_day()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_day:F

    return v0
.end method

.method public final getFeels_like_eve()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_eve:F

    return v0
.end method

.method public final getFeels_like_morn()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_morn:F

    return v0
.end method

.method public final getFeels_like_night()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_night:F

    return v0
.end method

.method public final getHumidity()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->humidity:I

    return v0
.end method

.method public final getLat()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->lat:F

    return v0
.end method

.method public final getLon()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->lon:F

    return v0
.end method

.method public final getPopulation()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->population:I

    return v0
.end method

.method public final getPressure()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->pressure:I

    return v0
.end method

.method public final getRain()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->rain:F

    return v0
.end method

.method public final getRain_pop()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->rain_pop:F

    return v0
.end method

.method public final getSnow()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->snow:F

    return v0
.end method

.method public final getSys_cod()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_cod:I

    return v0
.end method

.method public final getSys_country()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_country:Ljava/lang/String;

    return-object v0
.end method

.method public final getSys_message()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_message:F

    return v0
.end method

.method public final getSys_sunrise()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunrise:J

    return-wide v0
.end method

.method public final getSys_sunrise_read()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunrise_read:Ljava/lang/String;

    return-object v0
.end method

.method public final getSys_sunset()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunset:J

    return-wide v0
.end method

.method public final getSys_sunset_read()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunset_read:Ljava/lang/String;

    return-object v0
.end method

.method public final getTemp_day()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_day:F

    return v0
.end method

.method public final getTemp_eve()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_eve:F

    return v0
.end method

.method public final getTemp_max()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_max:F

    return v0
.end method

.method public final getTemp_min()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_min:F

    return v0
.end method

.method public final getTemp_morn()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_morn:F

    return v0
.end method

.method public final getTemp_night()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_night:F

    return v0
.end method

.method public final getTimezone()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->timezone:I

    return v0
.end method

.method public final getUpdateTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->updateTime:J

    return-wide v0
.end method

.method public final getUvi()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->uvi:I

    return v0
.end method

.method public final getWeather_description()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_description:Ljava/lang/String;

    return-object v0
.end method

.method public final getWeather_icon()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_icon:Ljava/lang/String;

    return-object v0
.end method

.method public final getWeather_id()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_id:I

    return v0
.end method

.method public final getWeather_main()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_main:Ljava/lang/String;

    return-object v0
.end method

.method public final getWind_deg()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->wind_deg:I

    return v0
.end method

.method public final getWind_gust()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->wind_gust:F

    return v0
.end method

.method public final getWind_speed()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->wind_speed:F

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/sma/smartv3/model/WeatherForecast;->lat:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->lon:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_country:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->population:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->timezone:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_cod:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_message:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->cnt:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->dt:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->dt_read:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_day:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_min:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_max:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_night:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_eve:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_morn:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_day:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_night:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_eve:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_morn:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->pressure:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->humidity:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_id:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_main:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_description:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_icon:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->wind_speed:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->wind_deg:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->wind_gust:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->clouds_all:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->uvi:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->rain:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->snow:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->rain_pop:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunrise:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunrise_read:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunset:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunset_read:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/model/WeatherForecast;->updateTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setClouds_all(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->clouds_all:I

    return-void
.end method

.method public final setCnt(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->cnt:I

    return-void
.end method

.method public final setDt(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->dt:J

    return-void
.end method

.method public final setDt_read(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->dt_read:Ljava/lang/String;

    return-void
.end method

.method public final setFeels_like_day(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_day:F

    return-void
.end method

.method public final setFeels_like_eve(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_eve:F

    return-void
.end method

.method public final setFeels_like_morn(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_morn:F

    return-void
.end method

.method public final setFeels_like_night(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_night:F

    return-void
.end method

.method public final setHumidity(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->humidity:I

    return-void
.end method

.method public final setLat(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->lat:F

    return-void
.end method

.method public final setLon(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->lon:F

    return-void
.end method

.method public final setPopulation(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->population:I

    return-void
.end method

.method public final setPressure(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->pressure:I

    return-void
.end method

.method public final setRain(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->rain:F

    return-void
.end method

.method public final setRain_pop(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->rain_pop:F

    return-void
.end method

.method public final setSnow(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->snow:F

    return-void
.end method

.method public final setSys_cod(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_cod:I

    return-void
.end method

.method public final setSys_country(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_country:Ljava/lang/String;

    return-void
.end method

.method public final setSys_message(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_message:F

    return-void
.end method

.method public final setSys_sunrise(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunrise:J

    return-void
.end method

.method public final setSys_sunrise_read(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunrise_read:Ljava/lang/String;

    return-void
.end method

.method public final setSys_sunset(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunset:J

    return-void
.end method

.method public final setSys_sunset_read(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunset_read:Ljava/lang/String;

    return-void
.end method

.method public final setTemp_day(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_day:F

    return-void
.end method

.method public final setTemp_eve(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_eve:F

    return-void
.end method

.method public final setTemp_max(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_max:F

    return-void
.end method

.method public final setTemp_min(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_min:F

    return-void
.end method

.method public final setTemp_morn(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_morn:F

    return-void
.end method

.method public final setTemp_night(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->temp_night:F

    return-void
.end method

.method public final setTimezone(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->timezone:I

    return-void
.end method

.method public final setUpdateTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->updateTime:J

    return-void
.end method

.method public final setUvi(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->uvi:I

    return-void
.end method

.method public final setWeather_description(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_description:Ljava/lang/String;

    return-void
.end method

.method public final setWeather_icon(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_icon:Ljava/lang/String;

    return-void
.end method

.method public final setWeather_id(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_id:I

    return-void
.end method

.method public final setWeather_main(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->weather_main:Ljava/lang/String;

    return-void
.end method

.method public final setWind_deg(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->wind_deg:I

    return-void
.end method

.method public final setWind_gust(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->wind_gust:F

    return-void
.end method

.method public final setWind_speed(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/WeatherForecast;->wind_speed:F

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 46
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p0

    iget v1, v0, Lcom/sma/smartv3/model/WeatherForecast;->lat:F

    iget v2, v0, Lcom/sma/smartv3/model/WeatherForecast;->lon:F

    iget-object v3, v0, Lcom/sma/smartv3/model/WeatherForecast;->sys_country:Ljava/lang/String;

    iget v4, v0, Lcom/sma/smartv3/model/WeatherForecast;->population:I

    iget v5, v0, Lcom/sma/smartv3/model/WeatherForecast;->timezone:I

    iget v6, v0, Lcom/sma/smartv3/model/WeatherForecast;->sys_cod:I

    iget v7, v0, Lcom/sma/smartv3/model/WeatherForecast;->sys_message:F

    iget v8, v0, Lcom/sma/smartv3/model/WeatherForecast;->cnt:I

    iget-wide v9, v0, Lcom/sma/smartv3/model/WeatherForecast;->dt:J

    iget-object v11, v0, Lcom/sma/smartv3/model/WeatherForecast;->dt_read:Ljava/lang/String;

    iget v12, v0, Lcom/sma/smartv3/model/WeatherForecast;->temp_day:F

    iget v13, v0, Lcom/sma/smartv3/model/WeatherForecast;->temp_min:F

    iget v14, v0, Lcom/sma/smartv3/model/WeatherForecast;->temp_max:F

    iget v15, v0, Lcom/sma/smartv3/model/WeatherForecast;->temp_night:F

    move/from16 v16, v15

    iget v15, v0, Lcom/sma/smartv3/model/WeatherForecast;->temp_eve:F

    move/from16 v17, v15

    iget v15, v0, Lcom/sma/smartv3/model/WeatherForecast;->temp_morn:F

    move/from16 v18, v15

    iget v15, v0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_day:F

    move/from16 v19, v15

    iget v15, v0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_night:F

    move/from16 v20, v15

    iget v15, v0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_eve:F

    move/from16 v21, v15

    iget v15, v0, Lcom/sma/smartv3/model/WeatherForecast;->feels_like_morn:F

    move/from16 v22, v15

    iget v15, v0, Lcom/sma/smartv3/model/WeatherForecast;->pressure:I

    move/from16 v23, v15

    iget v15, v0, Lcom/sma/smartv3/model/WeatherForecast;->humidity:I

    move/from16 v24, v15

    iget v15, v0, Lcom/sma/smartv3/model/WeatherForecast;->weather_id:I

    move/from16 v25, v15

    iget-object v15, v0, Lcom/sma/smartv3/model/WeatherForecast;->weather_main:Ljava/lang/String;

    move-object/from16 v26, v15

    iget-object v15, v0, Lcom/sma/smartv3/model/WeatherForecast;->weather_description:Ljava/lang/String;

    move-object/from16 v27, v15

    iget-object v15, v0, Lcom/sma/smartv3/model/WeatherForecast;->weather_icon:Ljava/lang/String;

    move-object/from16 v28, v15

    iget v15, v0, Lcom/sma/smartv3/model/WeatherForecast;->wind_speed:F

    move/from16 v29, v15

    iget v15, v0, Lcom/sma/smartv3/model/WeatherForecast;->wind_deg:I

    move/from16 v30, v15

    iget v15, v0, Lcom/sma/smartv3/model/WeatherForecast;->wind_gust:F

    move/from16 v31, v15

    iget v15, v0, Lcom/sma/smartv3/model/WeatherForecast;->clouds_all:I

    move/from16 v32, v15

    iget v15, v0, Lcom/sma/smartv3/model/WeatherForecast;->uvi:I

    move/from16 v33, v15

    iget v15, v0, Lcom/sma/smartv3/model/WeatherForecast;->rain:F

    move/from16 v34, v15

    iget v15, v0, Lcom/sma/smartv3/model/WeatherForecast;->snow:F

    move/from16 v35, v15

    iget v15, v0, Lcom/sma/smartv3/model/WeatherForecast;->rain_pop:F

    move/from16 v36, v14

    move/from16 v37, v15

    iget-wide v14, v0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunrise:J

    move-wide/from16 v38, v14

    iget-object v14, v0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunrise_read:Ljava/lang/String;

    move-object/from16 v40, v14

    iget-wide v14, v0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunset:J

    move-wide/from16 v41, v14

    iget-object v14, v0, Lcom/sma/smartv3/model/WeatherForecast;->sys_sunset_read:Ljava/lang/String;

    move-object/from16 v43, v14

    iget-wide v14, v0, Lcom/sma/smartv3/model/WeatherForecast;->updateTime:J

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-wide/from16 v44, v14

    const-string v14, "WeatherForecast(lat="

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", lon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", sys_country="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", population="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", timezone="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sys_cod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sys_message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", cnt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", dt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", dt_read="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", temp_day="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", temp_min="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", temp_max="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", temp_night="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", temp_eve="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", temp_morn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", feels_like_day="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", feels_like_night="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", feels_like_eve="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", feels_like_morn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", pressure="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", humidity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", weather_id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", weather_main="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", weather_description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", weather_icon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", wind_speed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", wind_deg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", wind_gust="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", clouds_all="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", uvi="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", rain="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v34

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", snow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", rain_pop="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v37

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", sys_sunrise="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v38

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", sys_sunrise_read="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sys_sunset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v41

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", sys_sunset_read="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v43

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", updateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v44

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
