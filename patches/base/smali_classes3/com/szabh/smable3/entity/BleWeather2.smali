.class public final Lcom/szabh/smable3/entity/BleWeather2;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleWeather2$Companion;
    }
.end annotation


# static fields
.field public static final CLOUDY:I = 0x2

.field public static final Companion:Lcom/szabh/smable3/entity/BleWeather2$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final DRIZZLE:I = 0xd

.field public static final FOGGY:I = 0x9

.field public static final HAZE:I = 0xb

.field public static final HEAVY_RAIN:I = 0xe

.field public static final HEAVY_SNOW:I = 0x11

.field public static final HIGH_WINDY:I = 0x7

.field public static final ITEM_LENGTH:I = 0x14

.field public static final LIGHTNING:I = 0xf

.field public static final LIGHT_SNOW:I = 0x10

.field public static final OTHER:I = 0x0

.field public static final OVERCAST:I = 0x3

.field public static final RAINY:I = 0x4

.field public static final SAND_STORM:I = 0xa

.field public static final SLEET:I = 0x12

.field public static final SNOWSTORM:I = 0x14

.field public static final SNOWY:I = 0x8

.field public static final SUNNY:I = 0x1

.field public static final THUNDER:I = 0x5

.field public static final THUNDERSHOWER:I = 0x6

.field public static final TORNADO:I = 0x13

.field public static final WIND:I = 0xc


# instance fields
.field private mAQI:I

.field private mAltitude:I

.field private mCurrentTemperature:I

.field private mHumidity:I

.field private mMaxTemperature:I

.field private mMinTemperature:I

.field private mPrecipitation:I

.field private mSunrisMinute:I

.field private mSunrisSecond:I

.field private mSunriseHour:I

.field private mSunsetHour:I

.field private mSunsetMinute:I

.field private mSunsetSecond:I

.field private mUltraVioletIntensity:I

.field private mVisibility:I

.field private mWeatherCode:I

.field private mWindSpeed:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleWeather2$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleWeather2$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleWeather2;->Companion:Lcom/szabh/smable3/entity/BleWeather2$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 20

    .line 1
    const v18, 0x1ffff

    const/16 v19, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

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

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v19}, Lcom/szabh/smable3/entity/BleWeather2;-><init>(IIIIIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIIIIIIIIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mCurrentTemperature:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleWeather2;->mMaxTemperature:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleWeather2;->mMinTemperature:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleWeather2;->mWeatherCode:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleWeather2;->mWindSpeed:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleWeather2;->mHumidity:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleWeather2;->mVisibility:I

    .line 10
    iput p8, p0, Lcom/szabh/smable3/entity/BleWeather2;->mUltraVioletIntensity:I

    .line 11
    iput p9, p0, Lcom/szabh/smable3/entity/BleWeather2;->mPrecipitation:I

    .line 12
    iput p10, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunriseHour:I

    .line 13
    iput p11, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunrisMinute:I

    .line 14
    iput p12, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunrisSecond:I

    .line 15
    iput p13, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetHour:I

    .line 16
    iput p14, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetMinute:I

    .line 17
    iput p15, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetSecond:I

    move/from16 p1, p16

    .line 18
    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mAltitude:I

    move/from16 p1, p17

    .line 19
    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mAQI:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p18

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    const/4 v4, 0x0

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    const/4 v5, 0x0

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    const/4 v6, 0x0

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    const/4 v7, 0x0

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    const/4 v8, 0x0

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    const/4 v9, 0x0

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    const/4 v10, 0x0

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    const/4 v11, 0x0

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    const/4 v12, 0x0

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_b

    const/4 v13, 0x0

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    if-eqz v14, :cond_c

    const/4 v14, 0x0

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v0, 0x2000

    if-eqz v15, :cond_d

    const/4 v15, 0x0

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    and-int/lit16 v2, v0, 0x4000

    if-eqz v2, :cond_e

    const/4 v2, 0x0

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    const/16 v16, 0x0

    goto :goto_f

    :cond_f
    move/from16 v16, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v0, v0, v17

    if-eqz v0, :cond_10

    const/16 p18, 0x0

    :goto_10
    move-object/from16 p1, p0

    move/from16 p2, v1

    move/from16 p16, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move/from16 p17, v16

    goto :goto_11

    :cond_10
    move/from16 p18, p17

    goto :goto_10

    .line 20
    :goto_11
    invoke-direct/range {p1 .. p18}, Lcom/szabh/smable3/entity/BleWeather2;-><init>(IIIIIIIIIIIIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleWeather2;IIIIIIIIIIIIIIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleWeather2;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p18

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/szabh/smable3/entity/BleWeather2;->mCurrentTemperature:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/szabh/smable3/entity/BleWeather2;->mMaxTemperature:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lcom/szabh/smable3/entity/BleWeather2;->mMinTemperature:I

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/szabh/smable3/entity/BleWeather2;->mWeatherCode:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lcom/szabh/smable3/entity/BleWeather2;->mWindSpeed:I

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lcom/szabh/smable3/entity/BleWeather2;->mHumidity:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lcom/szabh/smable3/entity/BleWeather2;->mVisibility:I

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lcom/szabh/smable3/entity/BleWeather2;->mUltraVioletIntensity:I

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget v10, v0, Lcom/szabh/smable3/entity/BleWeather2;->mPrecipitation:I

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget v11, v0, Lcom/szabh/smable3/entity/BleWeather2;->mSunriseHour:I

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lcom/szabh/smable3/entity/BleWeather2;->mSunrisMinute:I

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget v13, v0, Lcom/szabh/smable3/entity/BleWeather2;->mSunrisSecond:I

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget v14, v0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetHour:I

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget v15, v0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetMinute:I

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget v2, v0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetSecond:I

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget v1, v0, Lcom/szabh/smable3/entity/BleWeather2;->mAltitude:I

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p18, v16

    if-eqz v16, :cond_10

    move/from16 p2, v1

    iget v1, v0, Lcom/szabh/smable3/entity/BleWeather2;->mAQI:I

    move/from16 p17, p2

    move/from16 p18, v1

    move/from16 p16, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_10

    :cond_10
    move/from16 p18, p17

    move/from16 p17, v1

    move/from16 p2, p1

    move-object/from16 p1, v0

    move/from16 p16, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    :goto_10
    invoke-virtual/range {p1 .. p18}, Lcom/szabh/smable3/entity/BleWeather2;->copy(IIIIIIIIIIIIIIIII)Lcom/szabh/smable3/entity/BleWeather2;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getMAltitude$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "\u6d77\u62d4\u5df2\u5e9f\u5f03"
    .end annotation

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mCurrentTemperature:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunriseHour:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunrisMinute:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunrisSecond:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetHour:I

    return v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetMinute:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetSecond:I

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mAltitude:I

    return v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mAQI:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mMaxTemperature:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mMinTemperature:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mWeatherCode:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mWindSpeed:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mHumidity:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mVisibility:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mUltraVioletIntensity:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mPrecipitation:I

    return v0
.end method

.method public final copy(IIIIIIIIIIIIIIIII)Lcom/szabh/smable3/entity/BleWeather2;
    .locals 18
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleWeather2;

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move/from16 v13, p13

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p16

    move/from16 v17, p17

    invoke-direct/range {v0 .. v17}, Lcom/szabh/smable3/entity/BleWeather2;-><init>(IIIIIIIIIIIIIIIII)V

    return-object v0
.end method

.method public decode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mCurrentTemperature:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mMaxTemperature:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mMinTemperature:I

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWeather2;->mWeatherCode:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWeather2;->mWindSpeed:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWeather2;->mHumidity:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWeather2;->mVisibility:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWeather2;->mUltraVioletIntensity:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWeather2;->mPrecipitation:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunriseHour:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunrisMinute:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunrisSecond:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetHour:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetMinute:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetSecond:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mAQI:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    return-void
.end method

.method public encode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mCurrentTemperature:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mMaxTemperature:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mMinTemperature:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mWeatherCode:I

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v2, "LITTLE_ENDIAN"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mWindSpeed:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mHumidity:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mVisibility:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mUltraVioletIntensity:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mPrecipitation:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunriseHour:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunrisMinute:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunrisSecond:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetHour:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetMinute:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetSecond:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mAQI:I

    if-eqz v0, :cond_0

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mAltitude:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleWeather2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleWeather2;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mCurrentTemperature:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather2;->mCurrentTemperature:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mMaxTemperature:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather2;->mMaxTemperature:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mMinTemperature:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather2;->mMinTemperature:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mWeatherCode:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather2;->mWeatherCode:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mWindSpeed:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather2;->mWindSpeed:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mHumidity:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather2;->mHumidity:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mVisibility:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather2;->mVisibility:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mUltraVioletIntensity:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather2;->mUltraVioletIntensity:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mPrecipitation:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather2;->mPrecipitation:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunriseHour:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather2;->mSunriseHour:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunrisMinute:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather2;->mSunrisMinute:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunrisSecond:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather2;->mSunrisSecond:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetHour:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetHour:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetMinute:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetMinute:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetSecond:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetSecond:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mAltitude:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather2;->mAltitude:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mAQI:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleWeather2;->mAQI:I

    if-eq v1, p1, :cond_12

    return v2

    :cond_12
    return v0
.end method

.method public final getMAQI()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mAQI:I

    return v0
.end method

.method public final getMAltitude()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mAltitude:I

    return v0
.end method

.method public final getMCurrentTemperature()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mCurrentTemperature:I

    return v0
.end method

.method public final getMHumidity()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mHumidity:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x14

    return v0
.end method

.method public final getMMaxTemperature()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mMaxTemperature:I

    return v0
.end method

.method public final getMMinTemperature()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mMinTemperature:I

    return v0
.end method

.method public final getMPrecipitation()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mPrecipitation:I

    return v0
.end method

.method public final getMSunrisMinute()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunrisMinute:I

    return v0
.end method

.method public final getMSunrisSecond()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunrisSecond:I

    return v0
.end method

.method public final getMSunriseHour()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunriseHour:I

    return v0
.end method

.method public final getMSunsetHour()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetHour:I

    return v0
.end method

.method public final getMSunsetMinute()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetMinute:I

    return v0
.end method

.method public final getMSunsetSecond()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetSecond:I

    return v0
.end method

.method public final getMUltraVioletIntensity()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mUltraVioletIntensity:I

    return v0
.end method

.method public final getMVisibility()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mVisibility:I

    return v0
.end method

.method public final getMWeatherCode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mWeatherCode:I

    return v0
.end method

.method public final getMWindSpeed()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mWindSpeed:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather2;->mCurrentTemperature:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mMaxTemperature:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mMinTemperature:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mWeatherCode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mWindSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mHumidity:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mVisibility:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mUltraVioletIntensity:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mPrecipitation:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunriseHour:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunrisMinute:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunrisSecond:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetHour:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetMinute:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetSecond:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mAltitude:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mAQI:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAQI(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mAQI:I

    return-void
.end method

.method public final setMAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mAltitude:I

    return-void
.end method

.method public final setMCurrentTemperature(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mCurrentTemperature:I

    return-void
.end method

.method public final setMHumidity(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mHumidity:I

    return-void
.end method

.method public final setMMaxTemperature(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mMaxTemperature:I

    return-void
.end method

.method public final setMMinTemperature(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mMinTemperature:I

    return-void
.end method

.method public final setMPrecipitation(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mPrecipitation:I

    return-void
.end method

.method public final setMSunrisMinute(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunrisMinute:I

    return-void
.end method

.method public final setMSunrisSecond(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunrisSecond:I

    return-void
.end method

.method public final setMSunriseHour(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunriseHour:I

    return-void
.end method

.method public final setMSunsetHour(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetHour:I

    return-void
.end method

.method public final setMSunsetMinute(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetMinute:I

    return-void
.end method

.method public final setMSunsetSecond(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetSecond:I

    return-void
.end method

.method public final setMUltraVioletIntensity(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mUltraVioletIntensity:I

    return-void
.end method

.method public final setMVisibility(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mVisibility:I

    return-void
.end method

.method public final setMWeatherCode(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mWeatherCode:I

    return-void
.end method

.method public final setMWindSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mWindSpeed:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleWeather(mCurrentTemperature="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mCurrentTemperature:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxTemperature="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mMaxTemperature:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinTemperature="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mMinTemperature:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mWeatherCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mWeatherCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mWindSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mWindSpeed:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHumidity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mHumidity:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mVisibility="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mVisibility:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mUltraVioletIntensity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mUltraVioletIntensity:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPrecipitation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mPrecipitation:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSunriseHour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunriseHour:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSunrisMinute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunrisMinute:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSunrisSecond="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunrisSecond:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSunsetHour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetHour:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSunsetMinute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetMinute:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSunsetSecond="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mSunsetSecond:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAQI="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather2;->mAQI:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
