.class public final Lcom/szabh/smable3/entity/BleWeatherForecast;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleWeatherForecast$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleWeatherForecast$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x24


# instance fields
.field private mTime:I

.field private mWeather1:Lcom/szabh/smable3/entity/BleWeather;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mWeather2:Lcom/szabh/smable3/entity/BleWeather;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mWeather3:Lcom/szabh/smable3/entity/BleWeather;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleWeatherForecast$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleWeatherForecast$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleWeatherForecast;->Companion:Lcom/szabh/smable3/entity/BleWeatherForecast$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/szabh/smable3/entity/BleWeatherForecast;-><init>(ILcom/szabh/smable3/entity/BleWeather;Lcom/szabh/smable3/entity/BleWeather;Lcom/szabh/smable3/entity/BleWeather;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILcom/szabh/smable3/entity/BleWeather;Lcom/szabh/smable3/entity/BleWeather;Lcom/szabh/smable3/entity/BleWeather;)V
    .locals 0
    .param p2    # Lcom/szabh/smable3/entity/BleWeather;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p3    # Lcom/szabh/smable3/entity/BleWeather;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p4    # Lcom/szabh/smable3/entity/BleWeather;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mTime:I

    .line 4
    iput-object p2, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather1:Lcom/szabh/smable3/entity/BleWeather;

    .line 5
    iput-object p3, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather2:Lcom/szabh/smable3/entity/BleWeather;

    .line 6
    iput-object p4, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather3:Lcom/szabh/smable3/entity/BleWeather;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/szabh/smable3/entity/BleWeather;Lcom/szabh/smable3/entity/BleWeather;Lcom/szabh/smable3/entity/BleWeather;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    .line 7
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleWeatherForecast;-><init>(ILcom/szabh/smable3/entity/BleWeather;Lcom/szabh/smable3/entity/BleWeather;Lcom/szabh/smable3/entity/BleWeather;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleWeatherForecast;ILcom/szabh/smable3/entity/BleWeather;Lcom/szabh/smable3/entity/BleWeather;Lcom/szabh/smable3/entity/BleWeather;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleWeatherForecast;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mTime:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather1:Lcom/szabh/smable3/entity/BleWeather;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather2:Lcom/szabh/smable3/entity/BleWeather;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather3:Lcom/szabh/smable3/entity/BleWeather;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleWeatherForecast;->copy(ILcom/szabh/smable3/entity/BleWeather;Lcom/szabh/smable3/entity/BleWeather;Lcom/szabh/smable3/entity/BleWeather;)Lcom/szabh/smable3/entity/BleWeatherForecast;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mTime:I

    return v0
.end method

.method public final component2()Lcom/szabh/smable3/entity/BleWeather;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather1:Lcom/szabh/smable3/entity/BleWeather;

    return-object v0
.end method

.method public final component3()Lcom/szabh/smable3/entity/BleWeather;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather2:Lcom/szabh/smable3/entity/BleWeather;

    return-object v0
.end method

.method public final component4()Lcom/szabh/smable3/entity/BleWeather;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather3:Lcom/szabh/smable3/entity/BleWeather;

    return-object v0
.end method

.method public final copy(ILcom/szabh/smable3/entity/BleWeather;Lcom/szabh/smable3/entity/BleWeather;Lcom/szabh/smable3/entity/BleWeather;)Lcom/szabh/smable3/entity/BleWeatherForecast;
    .locals 1
    .param p2    # Lcom/szabh/smable3/entity/BleWeather;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p3    # Lcom/szabh/smable3/entity/BleWeather;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p4    # Lcom/szabh/smable3/entity/BleWeather;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleWeatherForecast;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleWeatherForecast;-><init>(ILcom/szabh/smable3/entity/BleWeather;Lcom/szabh/smable3/entity/BleWeather;Lcom/szabh/smable3/entity/BleWeather;)V

    return-object v0
.end method

.method public encode()V
    .locals 5

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    sget-object v0, Lcom/szabh/smable3/entity/BleTime;->Companion:Lcom/szabh/smable3/entity/BleTime$Companion;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mTime:I

    int-to-long v1, v1

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lcom/szabh/smable3/entity/BleTime$Companion;->ofLocal(J)Lcom/szabh/smable3/entity/BleTime;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather1:Lcom/szabh/smable3/entity/BleWeather;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather2:Lcom/szabh/smable3/entity/BleWeather;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather3:Lcom/szabh/smable3/entity/BleWeather;

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleWeatherForecast;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleWeatherForecast;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeatherForecast;->mTime:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather1:Lcom/szabh/smable3/entity/BleWeather;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather1:Lcom/szabh/smable3/entity/BleWeather;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather2:Lcom/szabh/smable3/entity/BleWeather;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather2:Lcom/szabh/smable3/entity/BleWeather;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather3:Lcom/szabh/smable3/entity/BleWeather;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather3:Lcom/szabh/smable3/entity/BleWeather;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x24

    return v0
.end method

.method public final getMTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mTime:I

    return v0
.end method

.method public final getMWeather1()Lcom/szabh/smable3/entity/BleWeather;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather1:Lcom/szabh/smable3/entity/BleWeather;

    return-object v0
.end method

.method public final getMWeather2()Lcom/szabh/smable3/entity/BleWeather;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather2:Lcom/szabh/smable3/entity/BleWeather;

    return-object v0
.end method

.method public final getMWeather3()Lcom/szabh/smable3/entity/BleWeather;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather3:Lcom/szabh/smable3/entity/BleWeather;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mTime:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather1:Lcom/szabh/smable3/entity/BleWeather;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWeather;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather2:Lcom/szabh/smable3/entity/BleWeather;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWeather;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather3:Lcom/szabh/smable3/entity/BleWeather;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWeather;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public final setMTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mTime:I

    return-void
.end method

.method public final setMWeather1(Lcom/szabh/smable3/entity/BleWeather;)V
    .locals 0
    .param p1    # Lcom/szabh/smable3/entity/BleWeather;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather1:Lcom/szabh/smable3/entity/BleWeather;

    return-void
.end method

.method public final setMWeather2(Lcom/szabh/smable3/entity/BleWeather;)V
    .locals 0
    .param p1    # Lcom/szabh/smable3/entity/BleWeather;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather2:Lcom/szabh/smable3/entity/BleWeather;

    return-void
.end method

.method public final setMWeather3(Lcom/szabh/smable3/entity/BleWeather;)V
    .locals 0
    .param p1    # Lcom/szabh/smable3/entity/BleWeather;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather3:Lcom/szabh/smable3/entity/BleWeather;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleWeatherForecast(mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lcom/szabh/smable3/entity/BleTime;->Companion:Lcom/szabh/smable3/entity/BleTime$Companion;

    iget v2, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mTime:I

    int-to-long v2, v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Lcom/szabh/smable3/entity/BleTime$Companion;->ofLocal(J)Lcom/szabh/smable3/entity/BleTime;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mWeather1="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather1:Lcom/szabh/smable3/entity/BleWeather;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mWeather2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather2:Lcom/szabh/smable3/entity/BleWeather;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mWeather3="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherForecast;->mWeather3:Lcom/szabh/smable3/entity/BleWeather;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
