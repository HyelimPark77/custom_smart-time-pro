.class public final Lcom/szabh/smable3/entity/BleGolfScore;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleGolfScore$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleGolfScore$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_HEADER_LENGTH:I = 0x8


# instance fields
.field private mGreensweepingRate:I

.field private mIsToEnterTheLane:I

.field private mMapId:I

.field private mNumberOfPutts:I

.field private mTime:I

.field private mTotalNumberOfSwings:I

.field private mTotalPar:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleGolfScore$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleGolfScore$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleGolfScore;->Companion:Lcom/szabh/smable3/entity/BleGolfScore$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    return-void
.end method


# virtual methods
.method public decode()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mMapId:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mTotalNumberOfSwings:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mNumberOfPutts:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mIsToEnterTheLane:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mGreensweepingRate:I

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mTotalPar:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    return-void
.end method

.method public encode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mMapId:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mTotalNumberOfSwings:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mNumberOfPutts:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mIsToEnterTheLane:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mGreensweepingRate:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mTotalPar:I

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    return-void
.end method

.method public final getMGreensweepingRate()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mGreensweepingRate:I

    return v0
.end method

.method public final getMIsToEnterTheLane()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mIsToEnterTheLane:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public final getMMapId()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mMapId:I

    return v0
.end method

.method public final getMNumberOfPutts()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mNumberOfPutts:I

    return v0
.end method

.method public final getMTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mTime:I

    return v0
.end method

.method public final getMTotalNumberOfSwings()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mTotalNumberOfSwings:I

    return v0
.end method

.method public final getMTotalPar()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mTotalPar:I

    return v0
.end method

.method public final setMGreensweepingRate(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mGreensweepingRate:I

    return-void
.end method

.method public final setMIsToEnterTheLane(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mIsToEnterTheLane:I

    return-void
.end method

.method public final setMMapId(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mMapId:I

    return-void
.end method

.method public final setMNumberOfPutts(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mNumberOfPutts:I

    return-void
.end method

.method public final setMTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mTime:I

    return-void
.end method

.method public final setMTotalNumberOfSwings(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mTotalNumberOfSwings:I

    return-void
.end method

.method public final setMTotalPar(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mTotalPar:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleGolfScore(mMapId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mMapId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTotalNumberOfSwings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mTotalNumberOfSwings:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mNumberOfPutts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mNumberOfPutts:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " mIsToEnterTheLane="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mIsToEnterTheLane:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " mGreensweepingRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mGreensweepingRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " mTotalPar="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGolfScore;->mTotalPar:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "  )"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
