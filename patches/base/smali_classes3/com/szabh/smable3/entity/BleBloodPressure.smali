.class public final Lcom/szabh/smable3/entity/BleBloodPressure;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleBloodPressure$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleBloodPressure$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x6


# instance fields
.field private mDiastolic:I

.field private mSystolic:I

.field private mTime:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleBloodPressure$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleBloodPressure$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleBloodPressure;->Companion:Lcom/szabh/smable3/entity/BleBloodPressure$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/szabh/smable3/entity/BleBloodPressure;-><init>(IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mTime:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mSystolic:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mDiastolic:I

    return-void
.end method

.method public synthetic constructor <init>(IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move p3, v0

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/szabh/smable3/entity/BleBloodPressure;-><init>(III)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleBloodPressure;IIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleBloodPressure;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mTime:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mSystolic:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mDiastolic:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/szabh/smable3/entity/BleBloodPressure;->copy(III)Lcom/szabh/smable3/entity/BleBloodPressure;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mTime:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mSystolic:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mDiastolic:I

    return v0
.end method

.method public final copy(III)Lcom/szabh/smable3/entity/BleBloodPressure;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleBloodPressure;

    invoke-direct {v0, p1, p2, p3}, Lcom/szabh/smable3/entity/BleBloodPressure;-><init>(III)V

    return-object v0
.end method

.method public decode()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mTime:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mSystolic:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mDiastolic:I

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleBloodPressure;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleBloodPressure;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBloodPressure;->mTime:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mSystolic:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBloodPressure;->mSystolic:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mDiastolic:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleBloodPressure;->mDiastolic:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getMDiastolic()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mDiastolic:I

    return v0
.end method

.method public final getMSystolic()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mSystolic:I

    return v0
.end method

.method public final getMTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mTime:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mTime:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mSystolic:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mDiastolic:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMDiastolic(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mDiastolic:I

    return-void
.end method

.method public final setMSystolic(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mSystolic:I

    return-void
.end method

.method public final setMTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mTime:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleBloodPressure(mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSystolic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mSystolic:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDiastolic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBloodPressure;->mDiastolic:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
