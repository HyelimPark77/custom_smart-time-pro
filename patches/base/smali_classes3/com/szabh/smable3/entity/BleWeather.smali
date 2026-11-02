.class public final Lcom/szabh/smable3/entity/BleWeather;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleWeather$Companion;
    }
.end annotation


# static fields
.field public static final CLOUDY:I = 0x2

.field public static final Companion:Lcom/szabh/smable3/entity/BleWeather$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final FOGGY:I = 0x9

.field public static final HAZE:I = 0xb

.field public static final HIGH_WINDY:I = 0x7

.field public static final ITEM_LENGTH:I = 0xa

.field public static final OTHER:I = 0x0

.field public static final OVERCAST:I = 0x3

.field public static final RAINY:I = 0x4

.field public static final SAND_STORM:I = 0xa

.field public static final SNOWY:I = 0x8

.field public static final SUNNY:I = 0x1

.field public static final THUNDER:I = 0x5

.field public static final THUNDERSHOWER:I = 0x6


# instance fields
.field private mCurrentTemperature:I

.field private mHumidity:I

.field private mMaxTemperature:I

.field private mMinTemperature:I

.field private mPrecipitation:I

.field private mUltraVioletIntensity:I

.field private mVisibility:I

.field private mWeatherCode:I

.field private mWindSpeed:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleWeather$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleWeather$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleWeather;->Companion:Lcom/szabh/smable3/entity/BleWeather$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0x1ff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/szabh/smable3/entity/BleWeather;-><init>(IIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather;->mCurrentTemperature:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleWeather;->mMaxTemperature:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleWeather;->mMinTemperature:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleWeather;->mWeatherCode:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleWeather;->mWindSpeed:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleWeather;->mHumidity:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleWeather;->mVisibility:I

    .line 10
    iput p8, p0, Lcom/szabh/smable3/entity/BleWeather;->mUltraVioletIntensity:I

    .line 11
    iput p9, p0, Lcom/szabh/smable3/entity/BleWeather;->mPrecipitation:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x1

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    move p8, v0

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    move p10, v0

    :goto_0
    move p9, p8

    move p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_8
    move p10, p9

    goto :goto_0

    .line 12
    :goto_1
    invoke-direct/range {p1 .. p10}, Lcom/szabh/smable3/entity/BleWeather;-><init>(IIIIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleWeather;IIIIIIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleWeather;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleWeather;->mCurrentTemperature:I

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleWeather;->mMaxTemperature:I

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleWeather;->mMinTemperature:I

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleWeather;->mWeatherCode:I

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleWeather;->mWindSpeed:I

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleWeather;->mHumidity:I

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget p7, p0, Lcom/szabh/smable3/entity/BleWeather;->mVisibility:I

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget p8, p0, Lcom/szabh/smable3/entity/BleWeather;->mUltraVioletIntensity:I

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget p9, p0, Lcom/szabh/smable3/entity/BleWeather;->mPrecipitation:I

    :cond_8
    move p10, p8

    move p11, p9

    move p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/szabh/smable3/entity/BleWeather;->copy(IIIIIIIII)Lcom/szabh/smable3/entity/BleWeather;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mCurrentTemperature:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mMaxTemperature:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mMinTemperature:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mWeatherCode:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mWindSpeed:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mHumidity:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mVisibility:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mUltraVioletIntensity:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mPrecipitation:I

    return v0
.end method

.method public final copy(IIIIIIIII)Lcom/szabh/smable3/entity/BleWeather;
    .locals 10
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleWeather;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleWeather;-><init>(IIIIIIIII)V

    return-object v0
.end method

.method public decode()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mCurrentTemperature:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mMaxTemperature:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mMinTemperature:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mWeatherCode:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mWindSpeed:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mHumidity:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mVisibility:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mUltraVioletIntensity:I

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mPrecipitation:I

    return-void
.end method

.method public encode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mCurrentTemperature:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mMaxTemperature:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mMinTemperature:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mWeatherCode:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mWindSpeed:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mHumidity:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mVisibility:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mUltraVioletIntensity:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mPrecipitation:I

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v2, "LITTLE_ENDIAN"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleWeather;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleWeather;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mCurrentTemperature:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather;->mCurrentTemperature:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mMaxTemperature:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather;->mMaxTemperature:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mMinTemperature:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather;->mMinTemperature:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mWeatherCode:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather;->mWeatherCode:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mWindSpeed:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather;->mWindSpeed:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mHumidity:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather;->mHumidity:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mVisibility:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather;->mVisibility:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mUltraVioletIntensity:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeather;->mUltraVioletIntensity:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mPrecipitation:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleWeather;->mPrecipitation:I

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getMCurrentTemperature()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mCurrentTemperature:I

    return v0
.end method

.method public final getMHumidity()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mHumidity:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0xa

    return v0
.end method

.method public final getMMaxTemperature()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mMaxTemperature:I

    return v0
.end method

.method public final getMMinTemperature()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mMinTemperature:I

    return v0
.end method

.method public final getMPrecipitation()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mPrecipitation:I

    return v0
.end method

.method public final getMUltraVioletIntensity()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mUltraVioletIntensity:I

    return v0
.end method

.method public final getMVisibility()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mVisibility:I

    return v0
.end method

.method public final getMWeatherCode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mWeatherCode:I

    return v0
.end method

.method public final getMWindSpeed()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mWindSpeed:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeather;->mCurrentTemperature:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mMaxTemperature:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mMinTemperature:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mWeatherCode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mWindSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mHumidity:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mVisibility:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mUltraVioletIntensity:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mPrecipitation:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMCurrentTemperature(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather;->mCurrentTemperature:I

    return-void
.end method

.method public final setMHumidity(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather;->mHumidity:I

    return-void
.end method

.method public final setMMaxTemperature(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather;->mMaxTemperature:I

    return-void
.end method

.method public final setMMinTemperature(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather;->mMinTemperature:I

    return-void
.end method

.method public final setMPrecipitation(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather;->mPrecipitation:I

    return-void
.end method

.method public final setMUltraVioletIntensity(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather;->mUltraVioletIntensity:I

    return-void
.end method

.method public final setMVisibility(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather;->mVisibility:I

    return-void
.end method

.method public final setMWeatherCode(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather;->mWeatherCode:I

    return-void
.end method

.method public final setMWindSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeather;->mWindSpeed:I

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

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mCurrentTemperature:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxTemperature="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mMaxTemperature:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinTemperature="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mMinTemperature:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mWeatherCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mWeatherCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mWindSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mWindSpeed:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHumidity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mHumidity:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mVisibility="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mVisibility:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mUltraVioletIntensity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mUltraVioletIntensity:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPrecipitation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeather;->mPrecipitation:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
