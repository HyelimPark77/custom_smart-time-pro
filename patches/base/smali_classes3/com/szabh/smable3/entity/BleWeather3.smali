.class public final Lcom/szabh/smable3/entity/BleWeather3;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleWeather3$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleWeather3$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x78


# instance fields
.field private mAQI:I

.field private mCurrentTemperature:I

.field private final mHourWeatherCodes:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/HourWeatherCode;",
            ">;"
        }
    .end annotation
.end field

.field private final mHourWeatherValues:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/HourWeatherValue;",
            ">;"
        }
    .end annotation
.end field

.field private mMaxTemperature:I

.field private mMinTemperature:I

.field private mSunriseHour:I

.field private mSunriseMinute:I

.field private mSunsetHour:I

.field private mSunsetMinute:I

.field private final mTides:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/TideWeather;",
            ">;"
        }
    .end annotation
.end field

.field private mWeatherCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleWeather3$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleWeather3$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleWeather3;->Companion:Lcom/szabh/smable3/entity/BleWeather3$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 15

    .line 1
    const/16 v13, 0xfff

    const/4 v14, 0x0

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

    move-object v0, p0

    invoke-direct/range {v0 .. v14}, Lcom/szabh/smable3/entity/BleWeather3;-><init>(IIIILjava/util/List;Ljava/util/List;IIIIILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIILjava/util/List;Ljava/util/List;IIIIILjava/util/List;)V
    .locals 0
    .param p5    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p12    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIII",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/HourWeatherCode;",
            ">;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/HourWeatherValue;",
            ">;IIIII",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/TideWeather;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mCurrentTemperature:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleWeather3;->mMaxTemperature:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleWeather3;->mMinTemperature:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleWeather3;->mWeatherCode:I

    .line 7
    iput-object p5, p0, Lcom/szabh/smable3/entity/BleWeather3;->mHourWeatherCodes:Ljava/util/List;

    .line 8
    iput-object p6, p0, Lcom/szabh/smable3/entity/BleWeather3;->mHourWeatherValues:Ljava/util/List;

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunriseHour:I

    .line 10
    iput p8, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunriseMinute:I

    .line 11
    iput p9, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunsetHour:I

    .line 12
    iput p10, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunsetMinute:I

    .line 13
    iput p11, p0, Lcom/szabh/smable3/entity/BleWeather3;->mAQI:I

    .line 14
    iput-object p12, p0, Lcom/szabh/smable3/entity/BleWeather3;->mTides:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(IIIILjava/util/List;Ljava/util/List;IIIIILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move p1, v2

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    move v1, p2

    :goto_0
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    move v3, v2

    goto :goto_1

    :cond_2
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    move v4, v2

    goto :goto_2

    :cond_3
    move/from16 v4, p4

    :goto_2
    and-int/lit8 v5, v0, 0x10

    const/4 v6, 0x0

    if-eqz v5, :cond_4

    move-object v5, v6

    goto :goto_3

    :cond_4
    move-object/from16 v5, p5

    :goto_3
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    move-object v7, v6

    goto :goto_4

    :cond_5
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    move v8, v2

    goto :goto_5

    :cond_6
    move/from16 v8, p7

    :goto_5
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    move v9, v2

    goto :goto_6

    :cond_7
    move/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    move v10, v2

    goto :goto_7

    :cond_8
    move/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    move v11, v2

    goto :goto_8

    :cond_9
    move/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    goto :goto_9

    :cond_a
    move/from16 v2, p11

    :goto_9
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_b

    move-object/from16 p13, v6

    :goto_a
    move p2, p1

    move/from16 p3, v1

    move/from16 p12, v2

    move/from16 p4, v3

    move/from16 p5, v4

    move-object/from16 p6, v5

    move-object/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move-object p1, p0

    goto :goto_b

    :cond_b
    move-object/from16 p13, p12

    goto :goto_a

    .line 15
    :goto_b
    invoke-direct/range {p1 .. p13}, Lcom/szabh/smable3/entity/BleWeather3;-><init>(IIIILjava/util/List;Ljava/util/List;IIIIILjava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleWeather3;IIIILjava/util/List;Ljava/util/List;IIIIILjava/util/List;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleWeather3;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mCurrentTemperature:I

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleWeather3;->mMaxTemperature:I

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleWeather3;->mMinTemperature:I

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleWeather3;->mWeatherCode:I

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/szabh/smable3/entity/BleWeather3;->mHourWeatherCodes:Ljava/util/List;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/szabh/smable3/entity/BleWeather3;->mHourWeatherValues:Ljava/util/List;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget p7, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunriseHour:I

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget p8, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunriseMinute:I

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget p9, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunsetHour:I

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget p10, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunsetMinute:I

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget p11, p0, Lcom/szabh/smable3/entity/BleWeather3;->mAQI:I

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/szabh/smable3/entity/BleWeather3;->mTides:Ljava/util/List;

    :cond_b
    move p13, p11

    move-object p14, p12

    move p11, p9

    move p12, p10

    move p9, p7

    move p10, p8

    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/szabh/smable3/entity/BleWeather3;->copy(IIIILjava/util/List;Ljava/util/List;IIIIILjava/util/List;)Lcom/szabh/smable3/entity/BleWeather3;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mCurrentTemperature:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunsetMinute:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mAQI:I

    return v0
.end method

.method public final component12()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/TideWeather;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mTides:Ljava/util/List;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mMaxTemperature:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mMinTemperature:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mWeatherCode:I

    return v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/HourWeatherCode;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mHourWeatherCodes:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/HourWeatherValue;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mHourWeatherValues:Ljava/util/List;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunriseHour:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunriseMinute:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunsetHour:I

    return v0
.end method

.method public final copy(IIIILjava/util/List;Ljava/util/List;IIIIILjava/util/List;)Lcom/szabh/smable3/entity/BleWeather3;
    .locals 13
    .param p5    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p12    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIII",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/HourWeatherCode;",
            ">;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/HourWeatherValue;",
            ">;IIIII",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/TideWeather;",
            ">;)",
            "Lcom/szabh/smable3/entity/BleWeather3;"
        }
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleWeather3;

    move v1, p1

    move v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move-object/from16 v12, p12

    invoke-direct/range {v0 .. v12}, Lcom/szabh/smable3/entity/BleWeather3;-><init>(IIIILjava/util/List;Ljava/util/List;IIIIILjava/util/List;)V

    return-object v0
.end method

.method public encode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mCurrentTemperature:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mMaxTemperature:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mMinTemperature:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mWeatherCode:I

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v2, "LITTLE_ENDIAN"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mHourWeatherCodes:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeList(Ljava/util/List;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mHourWeatherValues:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeList(Ljava/util/List;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunriseHour:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunriseMinute:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunsetHour:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunsetMinute:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mAQI:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mTides:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeList(Ljava/util/List;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleWeather3;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleWeather3;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mCurrentTemperature:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather3;->mCurrentTemperature:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mMaxTemperature:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather3;->mMaxTemperature:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mMinTemperature:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather3;->mMinTemperature:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mWeatherCode:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather3;->mWeatherCode:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mHourWeatherCodes:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWeather3;->mHourWeatherCodes:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mHourWeatherValues:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWeather3;->mHourWeatherValues:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunriseHour:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather3;->mSunriseHour:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunriseMinute:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather3;->mSunriseMinute:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunsetHour:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather3;->mSunsetHour:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunsetMinute:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather3;->mSunsetMinute:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mAQI:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather3;->mAQI:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mTides:Ljava/util/List;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleWeather3;->mTides:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getMAQI()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mAQI:I

    return v0
.end method

.method public final getMCurrentTemperature()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mCurrentTemperature:I

    return v0
.end method

.method public final getMHourWeatherCodes()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/HourWeatherCode;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mHourWeatherCodes:Ljava/util/List;

    return-object v0
.end method

.method public final getMHourWeatherValues()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/HourWeatherValue;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mHourWeatherValues:Ljava/util/List;

    return-object v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x78

    return v0
.end method

.method public final getMMaxTemperature()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mMaxTemperature:I

    return v0
.end method

.method public final getMMinTemperature()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mMinTemperature:I

    return v0
.end method

.method public final getMSunriseHour()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunriseHour:I

    return v0
.end method

.method public final getMSunriseMinute()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunriseMinute:I

    return v0
.end method

.method public final getMSunsetHour()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunsetHour:I

    return v0
.end method

.method public final getMSunsetMinute()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunsetMinute:I

    return v0
.end method

.method public final getMTides()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/TideWeather;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mTides:Ljava/util/List;

    return-object v0
.end method

.method public final getMWeatherCode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mWeatherCode:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather3;->mCurrentTemperature:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mMaxTemperature:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mMinTemperature:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mWeatherCode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mHourWeatherCodes:Ljava/util/List;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mHourWeatherValues:Ljava/util/List;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunriseHour:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunriseMinute:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunsetHour:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunsetMinute:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mAQI:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mTides:Ljava/util/List;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public final setMAQI(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mAQI:I

    return-void
.end method

.method public final setMCurrentTemperature(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mCurrentTemperature:I

    return-void
.end method

.method public final setMMaxTemperature(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mMaxTemperature:I

    return-void
.end method

.method public final setMMinTemperature(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mMinTemperature:I

    return-void
.end method

.method public final setMSunriseHour(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunriseHour:I

    return-void
.end method

.method public final setMSunriseMinute(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunriseMinute:I

    return-void
.end method

.method public final setMSunsetHour(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunsetHour:I

    return-void
.end method

.method public final setMSunsetMinute(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunsetMinute:I

    return-void
.end method

.method public final setMWeatherCode(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mWeatherCode:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleWeather3(mCurrentTemperature = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mCurrentTemperature:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxTemperature = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mMaxTemperature:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinTemperature ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mMinTemperature:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " ,mWeatherCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mWeatherCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHourWeatherCodes = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mHourWeatherCodes:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mHourWeatherValues = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mHourWeatherValues:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mSunriseHour = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunriseHour:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSunriseMinute = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunriseMinute:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " ,mSunsetHour ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunsetHour:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " mSunsetMinute = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mSunsetMinute:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mAQI = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mAQI:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " . mTides = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeather3;->mTides:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
