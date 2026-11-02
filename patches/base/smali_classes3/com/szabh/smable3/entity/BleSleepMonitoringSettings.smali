.class public final Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleSleepMonitoringSettings$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleSleepMonitoringSettings$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x5


# instance fields
.field private mEnabled:I

.field private mEndHour:I

.field private mEndMinute:I

.field private mStartHour:I

.field private mStartMinute:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->Companion:Lcom/szabh/smable3/entity/BleSleepMonitoringSettings$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;-><init>(IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEnabled:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mStartHour:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mStartMinute:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEndHour:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEndMinute:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move p6, v0

    :goto_0
    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move p6, p5

    goto :goto_0

    .line 8
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;-><init>(IIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;IIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEnabled:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mStartHour:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mStartMinute:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEndHour:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEndMinute:I

    :cond_4
    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->copy(IIIII)Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEnabled:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mStartHour:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mStartMinute:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEndHour:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEndMinute:I

    return v0
.end method

.method public final copy(IIIII)Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;-><init>(IIIII)V

    return-object v0
.end method

.method public decode()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEnabled:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mStartHour:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mStartMinute:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEndHour:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEndMinute:I

    return-void
.end method

.method public encode()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEnabled:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mStartHour:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mStartMinute:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEndHour:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEndMinute:I

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;

    iget v1, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEnabled:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEnabled:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mStartHour:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mStartHour:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mStartMinute:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mStartMinute:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEndHour:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEndHour:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEndMinute:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEndMinute:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getMEnabled()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEnabled:I

    return v0
.end method

.method public final getMEndHour()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEndHour:I

    return v0
.end method

.method public final getMEndMinute()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEndMinute:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public final getMStartHour()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mStartHour:I

    return v0
.end method

.method public final getMStartMinute()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mStartMinute:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEnabled:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mStartHour:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mStartMinute:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEndHour:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEndMinute:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMEnabled(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEnabled:I

    return-void
.end method

.method public final setMEndHour(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEndHour:I

    return-void
.end method

.method public final setMEndMinute(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEndMinute:I

    return-void
.end method

.method public final setMStartHour(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mStartHour:I

    return-void
.end method

.method public final setMStartMinute(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mStartMinute:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleSleepMonitoringSettings(mEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEnabled:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStartHour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mStartHour:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStartMinute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mStartMinute:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mEndHour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEndHour:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mEndMinute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleSleepMonitoringSettings;->mEndMinute:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
