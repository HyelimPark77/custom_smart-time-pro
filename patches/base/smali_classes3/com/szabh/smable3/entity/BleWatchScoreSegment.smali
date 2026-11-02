.class public final Lcom/szabh/smable3/entity/BleWatchScoreSegment;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleWatchScoreSegment$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleWatchScoreSegment$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_HEADER_LENGTH:I = 0xc


# instance fields
.field private mFairwayHit:I

.field private mGreenInRegulation:I

.field private mHandicap:I

.field private mHoleId:I

.field private mPar:I

.field private mPuttCount:I

.field private mReserved:I

.field private mStartTime:J

.field private mStrokeCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleWatchScoreSegment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleWatchScoreSegment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->Companion:Lcom/szabh/smable3/entity/BleWatchScoreSegment$Companion;

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

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mHoleId:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mPar:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mHandicap:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mStrokeCount:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mPuttCount:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mFairwayHit:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mGreenInRegulation:I

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt32(Ljava/nio/ByteOrder;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mStartTime:J

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mReserved:I

    return-void
.end method

.method public encode()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mHoleId:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mPar:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mHandicap:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mStrokeCount:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mPuttCount:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mFairwayHit:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mGreenInRegulation:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mStartTime:J

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v3, "LITTLE_ENDIAN"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeUInt32(JLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mReserved:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    return-void
.end method

.method public final getMFairwayHit()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mFairwayHit:I

    return v0
.end method

.method public final getMGreenInRegulation()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mGreenInRegulation:I

    return v0
.end method

.method public final getMHandicap()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mHandicap:I

    return v0
.end method

.method public final getMHoleId()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mHoleId:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0xc

    return v0
.end method

.method public final getMPar()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mPar:I

    return v0
.end method

.method public final getMPuttCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mPuttCount:I

    return v0
.end method

.method public final getMReserved()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mReserved:I

    return v0
.end method

.method public final getMStartTime()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mStartTime:J

    return-wide v0
.end method

.method public final getMStrokeCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mStrokeCount:I

    return v0
.end method

.method public final setMFairwayHit(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mFairwayHit:I

    return-void
.end method

.method public final setMGreenInRegulation(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mGreenInRegulation:I

    return-void
.end method

.method public final setMHandicap(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mHandicap:I

    return-void
.end method

.method public final setMHoleId(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mHoleId:I

    return-void
.end method

.method public final setMPar(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mPar:I

    return-void
.end method

.method public final setMPuttCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mPuttCount:I

    return-void
.end method

.method public final setMReserved(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mReserved:I

    return-void
.end method

.method public final setMStartTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mStartTime:J

    return-void
.end method

.method public final setMStrokeCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mStrokeCount:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\n            BleWatchScoreSegment(mHoleId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mHoleId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mPar="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mPar:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mHandicap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mHandicap:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mStrokeCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mStrokeCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mPuttCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mPuttCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mFairWayHit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mFairwayHit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mGreenInRegulation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mGreenInRegulation:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mReserved="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mReserved:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mStartTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleWatchScoreSegment;->mStartTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ")\n        "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/he5;->OiIIX101O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
