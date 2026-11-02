.class public final Lcom/szabh/smable3/entity/BleWeatherRealtime;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleWeatherRealtime$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleWeatherRealtime$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x10


# instance fields
.field private mTime:I

.field private mWeather:Lcom/szabh/smable3/entity/BleWeather;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleWeatherRealtime$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleWeatherRealtime$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleWeatherRealtime;->Companion:Lcom/szabh/smable3/entity/BleWeatherRealtime$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, v0}, Lcom/szabh/smable3/entity/BleWeatherRealtime;-><init>(ILcom/szabh/smable3/entity/BleWeather;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILcom/szabh/smable3/entity/BleWeather;)V
    .locals 0
    .param p2    # Lcom/szabh/smable3/entity/BleWeather;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleWeatherRealtime;->mTime:I

    .line 4
    iput-object p2, p0, Lcom/szabh/smable3/entity/BleWeatherRealtime;->mWeather:Lcom/szabh/smable3/entity/BleWeather;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/szabh/smable3/entity/BleWeather;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/szabh/smable3/entity/BleWeatherRealtime;-><init>(ILcom/szabh/smable3/entity/BleWeather;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleWeatherRealtime;ILcom/szabh/smable3/entity/BleWeather;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleWeatherRealtime;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleWeatherRealtime;->mTime:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/szabh/smable3/entity/BleWeatherRealtime;->mWeather:Lcom/szabh/smable3/entity/BleWeather;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/szabh/smable3/entity/BleWeatherRealtime;->copy(ILcom/szabh/smable3/entity/BleWeather;)Lcom/szabh/smable3/entity/BleWeatherRealtime;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeatherRealtime;->mTime:I

    return v0
.end method

.method public final component2()Lcom/szabh/smable3/entity/BleWeather;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherRealtime;->mWeather:Lcom/szabh/smable3/entity/BleWeather;

    return-object v0
.end method

.method public final copy(ILcom/szabh/smable3/entity/BleWeather;)Lcom/szabh/smable3/entity/BleWeatherRealtime;
    .locals 1
    .param p2    # Lcom/szabh/smable3/entity/BleWeather;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleWeatherRealtime;

    invoke-direct {v0, p1, p2}, Lcom/szabh/smable3/entity/BleWeatherRealtime;-><init>(ILcom/szabh/smable3/entity/BleWeather;)V

    return-object v0
.end method

.method public encode()V
    .locals 5

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    sget-object v0, Lcom/szabh/smable3/entity/BleTime;->Companion:Lcom/szabh/smable3/entity/BleTime$Companion;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeatherRealtime;->mTime:I

    int-to-long v1, v1

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lcom/szabh/smable3/entity/BleTime$Companion;->ofLocal(J)Lcom/szabh/smable3/entity/BleTime;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherRealtime;->mWeather:Lcom/szabh/smable3/entity/BleWeather;

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleWeatherRealtime;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleWeatherRealtime;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWeatherRealtime;->mTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWeatherRealtime;->mTime:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherRealtime;->mWeather:Lcom/szabh/smable3/entity/BleWeather;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleWeatherRealtime;->mWeather:Lcom/szabh/smable3/entity/BleWeather;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x10

    return v0
.end method

.method public final getMTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeatherRealtime;->mTime:I

    return v0
.end method

.method public final getMWeather()Lcom/szabh/smable3/entity/BleWeather;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleWeatherRealtime;->mWeather:Lcom/szabh/smable3/entity/BleWeather;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleWeatherRealtime;->mTime:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherRealtime;->mWeather:Lcom/szabh/smable3/entity/BleWeather;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleWeather;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final setMTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWeatherRealtime;->mTime:I

    return-void
.end method

.method public final setMWeather(Lcom/szabh/smable3/entity/BleWeather;)V
    .locals 0
    .param p1    # Lcom/szabh/smable3/entity/BleWeather;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleWeatherRealtime;->mWeather:Lcom/szabh/smable3/entity/BleWeather;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleWeatherRealtime(mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lcom/szabh/smable3/entity/BleTime;->Companion:Lcom/szabh/smable3/entity/BleTime$Companion;

    iget v2, p0, Lcom/szabh/smable3/entity/BleWeatherRealtime;->mTime:I

    int-to-long v2, v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Lcom/szabh/smable3/entity/BleTime$Companion;->ofLocal(J)Lcom/szabh/smable3/entity/BleTime;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mWeather="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleWeatherRealtime;->mWeather:Lcom/szabh/smable3/entity/BleWeather;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
