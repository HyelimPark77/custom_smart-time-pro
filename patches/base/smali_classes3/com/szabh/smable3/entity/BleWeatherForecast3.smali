.class public final Lcom/szabh/smable3/entity/BleWeatherForecast3;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleWeatherForecast3$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleWeatherForecast3$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x390

.field public static final NAME_LENGTH:I = 0x42


# instance fields
.field private mCityName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mTime:I

.field private mWeather1:Lcom/szabh/smable3/entity/BleWeather3;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mWeather2:Lcom/szabh/smable3/entity/BleWeather3;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mWeather3:Lcom/szabh/smable3/entity/BleWeather3;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mWeather4:Lcom/szabh/smable3/entity/BleWeather3;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mWeather5:Lcom/szabh/smable3/entity/BleWeather3;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mWeather6:Lcom/szabh/smable3/entity/BleWeather3;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mWeather7:Lcom/szabh/smable3/entity/BleWeather3;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleWeatherForecast3$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleWeatherForecast3$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->Companion:Lcom/szabh/smable3/entity/BleWeatherForecast3$Companion;

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

    invoke-direct/range {v0 .. v11}, Lcom/szabh/smable3/entity/BleWeatherForecast3;-><init>(ILjava/lang/String;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/szabh/smable3/entity/BleWeather3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p4    # Lcom/szabh/smable3/entity/BleWeather3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p5    # Lcom/szabh/smable3/entity/BleWeather3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p6    # Lcom/szabh/smable3/entity/BleWeather3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p7    # Lcom/szabh/smable3/entity/BleWeather3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p8    # Lcom/szabh/smable3/entity/BleWeather3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p9    # Lcom/szabh/smable3/entity/BleWeather3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const-string v0, "mCityName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mTime:I

    .line 4
    iput-object p2, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mCityName:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather1:Lcom/szabh/smable3/entity/BleWeather3;

    .line 6
    iput-object p4, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather2:Lcom/szabh/smable3/entity/BleWeather3;

    .line 7
    iput-object p5, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather3:Lcom/szabh/smable3/entity/BleWeather3;

    .line 8
    iput-object p6, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather4:Lcom/szabh/smable3/entity/BleWeather3;

    .line 9
    iput-object p7, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather5:Lcom/szabh/smable3/entity/BleWeather3;

    .line 10
    iput-object p8, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather6:Lcom/szabh/smable3/entity/BleWeather3;

    .line 11
    iput-object p9, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather7:Lcom/szabh/smable3/entity/BleWeather3;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    .line 12
    const-string p2, ""

    :cond_1
    and-int/lit8 p11, p10, 0x4

    const/4 v0, 0x0

    if-eqz p11, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    move-object p8, v0

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    move-object p11, v0

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    goto :goto_0

    :cond_8
    move-object p11, p9

    move-object p10, p8

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    .line 13
    :goto_0
    invoke-direct/range {p2 .. p11}, Lcom/szabh/smable3/entity/BleWeatherForecast3;-><init>(ILjava/lang/String;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleWeatherForecast3;ILjava/lang/String;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleWeatherForecast3;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mTime:I

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mCityName:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather1:Lcom/szabh/smable3/entity/BleWeather3;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather2:Lcom/szabh/smable3/entity/BleWeather3;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather3:Lcom/szabh/smable3/entity/BleWeather3;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather4:Lcom/szabh/smable3/entity/BleWeather3;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather5:Lcom/szabh/smable3/entity/BleWeather3;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather6:Lcom/szabh/smable3/entity/BleWeather3;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather7:Lcom/szabh/smable3/entity/BleWeather3;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/szabh/smable3/entity/BleWeatherForecast3;->copy(ILjava/lang/String;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;)Lcom/szabh/smable3/entity/BleWeatherForecast3;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mTime:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mCityName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/szabh/smable3/entity/BleWeather3;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather1:Lcom/szabh/smable3/entity/BleWeather3;

    return-object v0
.end method

.method public final component4()Lcom/szabh/smable3/entity/BleWeather3;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather2:Lcom/szabh/smable3/entity/BleWeather3;

    return-object v0
.end method

.method public final component5()Lcom/szabh/smable3/entity/BleWeather3;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather3:Lcom/szabh/smable3/entity/BleWeather3;

    return-object v0
.end method

.method public final component6()Lcom/szabh/smable3/entity/BleWeather3;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather4:Lcom/szabh/smable3/entity/BleWeather3;

    return-object v0
.end method

.method public final component7()Lcom/szabh/smable3/entity/BleWeather3;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather5:Lcom/szabh/smable3/entity/BleWeather3;

    return-object v0
.end method

.method public final component8()Lcom/szabh/smable3/entity/BleWeather3;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather6:Lcom/szabh/smable3/entity/BleWeather3;

    return-object v0
.end method

.method public final component9()Lcom/szabh/smable3/entity/BleWeather3;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather7:Lcom/szabh/smable3/entity/BleWeather3;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;)Lcom/szabh/smable3/entity/BleWeatherForecast3;
    .locals 11
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/szabh/smable3/entity/BleWeather3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p4    # Lcom/szabh/smable3/entity/BleWeather3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p5    # Lcom/szabh/smable3/entity/BleWeather3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p6    # Lcom/szabh/smable3/entity/BleWeather3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p7    # Lcom/szabh/smable3/entity/BleWeather3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p8    # Lcom/szabh/smable3/entity/BleWeather3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p9    # Lcom/szabh/smable3/entity/BleWeather3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mCityName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleWeatherForecast3;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/szabh/smable3/entity/BleWeatherForecast3;-><init>(ILjava/lang/String;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;Lcom/szabh/smable3/entity/BleWeather3;)V

    return-object v1
.end method

.method public encode()V
    .locals 7

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    sget-object v0, Lcom/szabh/smable3/entity/BleTime;->Companion:Lcom/szabh/smable3/entity/BleTime$Companion;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mTime:I

    int-to-long v1, v1

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lcom/szabh/smable3/entity/BleTime$Companion;->ofLocal(J)Lcom/szabh/smable3/entity/BleTime;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget-object v2, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mCityName:Ljava/lang/String;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v3, 0x42

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithFix$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;ILjava/nio/charset/Charset;ILjava/lang/Object;)V

    iget-object v0, v1, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather1:Lcom/szabh/smable3/entity/BleWeather3;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget-object v0, v1, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather2:Lcom/szabh/smable3/entity/BleWeather3;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget-object v0, v1, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather3:Lcom/szabh/smable3/entity/BleWeather3;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget-object v0, v1, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather4:Lcom/szabh/smable3/entity/BleWeather3;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget-object v0, v1, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather5:Lcom/szabh/smable3/entity/BleWeather3;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget-object v0, v1, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather6:Lcom/szabh/smable3/entity/BleWeather3;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget-object v0, v1, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather7:Lcom/szabh/smable3/entity/BleWeather3;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleWeatherForecast3;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleWeatherForecast3;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mTime:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mCityName:Ljava/lang/String;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mCityName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather1:Lcom/szabh/smable3/entity/BleWeather3;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather1:Lcom/szabh/smable3/entity/BleWeather3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather2:Lcom/szabh/smable3/entity/BleWeather3;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather2:Lcom/szabh/smable3/entity/BleWeather3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather3:Lcom/szabh/smable3/entity/BleWeather3;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather3:Lcom/szabh/smable3/entity/BleWeather3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather4:Lcom/szabh/smable3/entity/BleWeather3;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather4:Lcom/szabh/smable3/entity/BleWeather3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather5:Lcom/szabh/smable3/entity/BleWeather3;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather5:Lcom/szabh/smable3/entity/BleWeather3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather6:Lcom/szabh/smable3/entity/BleWeather3;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather6:Lcom/szabh/smable3/entity/BleWeather3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather7:Lcom/szabh/smable3/entity/BleWeather3;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather7:Lcom/szabh/smable3/entity/BleWeather3;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getMCityName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mCityName:Ljava/lang/String;

    return-object v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x390

    return v0
.end method

.method public final getMTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mTime:I

    return v0
.end method

.method public final getMWeather1()Lcom/szabh/smable3/entity/BleWeather3;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather1:Lcom/szabh/smable3/entity/BleWeather3;

    return-object v0
.end method

.method public final getMWeather2()Lcom/szabh/smable3/entity/BleWeather3;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather2:Lcom/szabh/smable3/entity/BleWeather3;

    return-object v0
.end method

.method public final getMWeather3()Lcom/szabh/smable3/entity/BleWeather3;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather3:Lcom/szabh/smable3/entity/BleWeather3;

    return-object v0
.end method

.method public final getMWeather4()Lcom/szabh/smable3/entity/BleWeather3;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather4:Lcom/szabh/smable3/entity/BleWeather3;

    return-object v0
.end method

.method public final getMWeather5()Lcom/szabh/smable3/entity/BleWeather3;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather5:Lcom/szabh/smable3/entity/BleWeather3;

    return-object v0
.end method

.method public final getMWeather6()Lcom/szabh/smable3/entity/BleWeather3;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather6:Lcom/szabh/smable3/entity/BleWeather3;

    return-object v0
.end method

.method public final getMWeather7()Lcom/szabh/smable3/entity/BleWeather3;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather7:Lcom/szabh/smable3/entity/BleWeather3;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mTime:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mCityName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather1:Lcom/szabh/smable3/entity/BleWeather3;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWeather3;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather2:Lcom/szabh/smable3/entity/BleWeather3;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWeather3;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather3:Lcom/szabh/smable3/entity/BleWeather3;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWeather3;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather4:Lcom/szabh/smable3/entity/BleWeather3;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWeather3;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather5:Lcom/szabh/smable3/entity/BleWeather3;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWeather3;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather6:Lcom/szabh/smable3/entity/BleWeather3;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWeather3;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather7:Lcom/szabh/smable3/entity/BleWeather3;

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWeather3;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    return v0
.end method

.method public final setMCityName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mCityName:Ljava/lang/String;

    return-void
.end method

.method public final setMTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mTime:I

    return-void
.end method

.method public final setMWeather1(Lcom/szabh/smable3/entity/BleWeather3;)V
    .locals 0
    .param p1    # Lcom/szabh/smable3/entity/BleWeather3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather1:Lcom/szabh/smable3/entity/BleWeather3;

    return-void
.end method

.method public final setMWeather2(Lcom/szabh/smable3/entity/BleWeather3;)V
    .locals 0
    .param p1    # Lcom/szabh/smable3/entity/BleWeather3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather2:Lcom/szabh/smable3/entity/BleWeather3;

    return-void
.end method

.method public final setMWeather3(Lcom/szabh/smable3/entity/BleWeather3;)V
    .locals 0
    .param p1    # Lcom/szabh/smable3/entity/BleWeather3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather3:Lcom/szabh/smable3/entity/BleWeather3;

    return-void
.end method

.method public final setMWeather4(Lcom/szabh/smable3/entity/BleWeather3;)V
    .locals 0
    .param p1    # Lcom/szabh/smable3/entity/BleWeather3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather4:Lcom/szabh/smable3/entity/BleWeather3;

    return-void
.end method

.method public final setMWeather5(Lcom/szabh/smable3/entity/BleWeather3;)V
    .locals 0
    .param p1    # Lcom/szabh/smable3/entity/BleWeather3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather5:Lcom/szabh/smable3/entity/BleWeather3;

    return-void
.end method

.method public final setMWeather6(Lcom/szabh/smable3/entity/BleWeather3;)V
    .locals 0
    .param p1    # Lcom/szabh/smable3/entity/BleWeather3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather6:Lcom/szabh/smable3/entity/BleWeather3;

    return-void
.end method

.method public final setMWeather7(Lcom/szabh/smable3/entity/BleWeather3;)V
    .locals 0
    .param p1    # Lcom/szabh/smable3/entity/BleWeather3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast3;->mWeather7:Lcom/szabh/smable3/entity/BleWeather3;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "BleWeatherForecast3()"

    return-object v0
.end method
