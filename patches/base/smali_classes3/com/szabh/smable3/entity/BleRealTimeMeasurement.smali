.class public final Lcom/szabh/smable3/entity/BleRealTimeMeasurement;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleRealTimeMeasurement$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleRealTimeMeasurement$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x1

.field public static final STATE_DONE:I = 0x0

.field public static final STATE_PAUSE:I = 0x1

.field public static final STATE_START:I = 0x2

.field public static final STATE_STOP_TIP:I = 0x3


# instance fields
.field private mBOSwitch:I

.field private mBPSwitch:I

.field private mHRSwitch:I

.field private mHrvSwitch:I

.field private mState:I

.field private mStressSwitch:I

.field private mTemperature:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleRealTimeMeasurement$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->Companion:Lcom/szabh/smable3/entity/BleRealTimeMeasurement$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;-><init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mHRSwitch:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mBOSwitch:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mBPSwitch:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mStressSwitch:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mTemperature:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mHrvSwitch:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mState:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    move p8, v0

    :goto_0
    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_6
    move p8, p7

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;-><init>(IIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleRealTimeMeasurement;IIIIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleRealTimeMeasurement;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mHRSwitch:I

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mBOSwitch:I

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mBPSwitch:I

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mStressSwitch:I

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mTemperature:I

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mHrvSwitch:I

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget p7, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mState:I

    :cond_6
    move p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->copy(IIIIIII)Lcom/szabh/smable3/entity/BleRealTimeMeasurement;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mHRSwitch:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mBOSwitch:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mBPSwitch:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mStressSwitch:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mTemperature:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mHrvSwitch:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mState:I

    return v0
.end method

.method public final copy(IIIIIII)Lcom/szabh/smable3/entity/BleRealTimeMeasurement;
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;-><init>(IIIIIII)V

    return-object v0
.end method

.method public decode()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mState:I

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    move-result v1

    iput v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mHrvSwitch:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    move-result v1

    iput v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mTemperature:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    move-result v1

    iput v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mStressSwitch:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    move-result v1

    iput v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mBPSwitch:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    move-result v1

    iput v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mBOSwitch:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mHRSwitch:I

    return-void
.end method

.method public encode()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mState:I

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mHrvSwitch:I

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mTemperature:I

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mStressSwitch:I

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mBPSwitch:I

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mBOSwitch:I

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mHRSwitch:I

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;

    iget v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mHRSwitch:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mHRSwitch:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mBOSwitch:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mBOSwitch:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mBPSwitch:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mBPSwitch:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mStressSwitch:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mStressSwitch:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mTemperature:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mTemperature:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mHrvSwitch:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mHrvSwitch:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mState:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mState:I

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getMBOSwitch()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mBOSwitch:I

    return v0
.end method

.method public final getMBPSwitch()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mBPSwitch:I

    return v0
.end method

.method public final getMHRSwitch()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mHRSwitch:I

    return v0
.end method

.method public final getMHrvSwitch()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mHrvSwitch:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final getMState()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mState:I

    return v0
.end method

.method public final getMStressSwitch()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mStressSwitch:I

    return v0
.end method

.method public final getMTemperature()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mTemperature:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mHRSwitch:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mBOSwitch:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mBPSwitch:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mStressSwitch:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mTemperature:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mHrvSwitch:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mState:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMBOSwitch(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mBOSwitch:I

    return-void
.end method

.method public final setMBPSwitch(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mBPSwitch:I

    return-void
.end method

.method public final setMHRSwitch(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mHRSwitch:I

    return-void
.end method

.method public final setMHrvSwitch(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mHrvSwitch:I

    return-void
.end method

.method public final setMState(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mState:I

    return-void
.end method

.method public final setMStressSwitch(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mStressSwitch:I

    return-void
.end method

.method public final setMTemperature(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mTemperature:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleRealTimeMeasurement(mState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mState:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHRSwitch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mHRSwitch:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mBOSwitch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mBOSwitch:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mBPSwitch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mBPSwitch:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStressSwitch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mStressSwitch:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTemperature="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mTemperature:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHrvSwitch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;->mHrvSwitch:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
