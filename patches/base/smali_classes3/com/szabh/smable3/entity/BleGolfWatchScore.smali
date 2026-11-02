.class public final Lcom/szabh/smable3/entity/BleGolfWatchScore;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleGolfWatchScore$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleGolfWatchScore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleGolfWatchScore.kt\ncom/szabh/smable3/entity/BleGolfWatchScore\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,135:1\n232#2,3:136\n222#2,15:139\n*S KotlinDebug\n*F\n+ 1 BleGolfWatchScore.kt\ncom/szabh/smable3/entity/BleGolfWatchScore\n*L\n42#1:136,3\n42#1:139,15\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleGolfWatchScore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleGolfWatchScore.kt\ncom/szabh/smable3/entity/BleGolfWatchScore\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,135:1\n232#2,3:136\n222#2,15:139\n*S KotlinDebug\n*F\n+ 1 BleGolfWatchScore.kt\ncom/szabh/smable3/entity/BleGolfWatchScore\n*L\n42#1:136,3\n42#1:139,15\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleGolfWatchScore$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_HEADER_LENGTH:I = 0x50


# instance fields
.field private mCourseId:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCourseName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCoursePar:I

.field private mDifficultyName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mDuration:J

.field private mHoleCount:I

.field private mHoleScores:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleWatchScoreSegment;",
            ">;"
        }
    .end annotation
.end field

.field private mRating:F

.field private mSlope:F

.field private mStartTime:J

.field private mTotalLength:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleGolfWatchScore$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleGolfWatchScore$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->Companion:Lcom/szabh/smable3/entity/BleGolfWatchScore$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mCourseId:Ljava/lang/String;

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mCourseName:Ljava/lang/String;

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mDifficultyName:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mHoleScores:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public decode()V
    .locals 6

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt32(Ljava/nio/ByteOrder;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mStartTime:J

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt32(Ljava/nio/ByteOrder;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mDuration:J

    const/16 v2, 0x10

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {p0, v2, v3, v4, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mCourseId:Ljava/lang/String;

    const/16 v2, 0x20

    invoke-static {p0, v2, v3, v4, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mCourseName:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mHoleCount:I

    const/16 v2, 0x8

    invoke-static {p0, v2, v3, v4, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mDifficultyName:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt32(Ljava/nio/ByteOrder;)J

    move-result-wide v4

    iput-wide v4, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mTotalLength:J

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mSlope:F

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mRating:F

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mCoursePar:I

    const/4 v0, 0x1

    invoke-static {p0, v3, v0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mHoleCount:I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    const-class v3, Lcom/szabh/smable3/entity/BleWatchScoreSegment;

    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/bestmafen/baseble/data/BleReadable;

    const/16 v4, 0xc

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v3}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iput-object v1, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mHoleScores:Ljava/util/List;

    return-void
.end method

.method public encode()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mStartTime:J

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v3, "LITTLE_ENDIAN"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeUInt32(JLjava/nio/ByteOrder;)V

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mDuration:J

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeUInt32(JLjava/nio/ByteOrder;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mCourseId:Ljava/lang/String;

    sget-object v1, Lkotlin/text/Charsets;->IiI10X:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeString(Ljava/lang/String;Ljava/nio/charset/Charset;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mCourseName:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeString(Ljava/lang/String;Ljava/nio/charset/Charset;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mHoleCount:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mDifficultyName:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeString(Ljava/lang/String;Ljava/nio/charset/Charset;)V

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mTotalLength:J

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeUInt32(JLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mSlope:F

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mRating:F

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mCoursePar:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mHoleScores:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeList(Ljava/util/List;)V

    return-void
.end method

.method public final getMCourseId()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mCourseId:Ljava/lang/String;

    return-object v0
.end method

.method public final getMCourseName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mCourseName:Ljava/lang/String;

    return-object v0
.end method

.method public final getMCoursePar()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mCoursePar:I

    return v0
.end method

.method public final getMDifficultyName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mDifficultyName:Ljava/lang/String;

    return-object v0
.end method

.method public final getMDuration()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mDuration:J

    return-wide v0
.end method

.method public final getMHoleCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mHoleCount:I

    return v0
.end method

.method public final getMHoleScores()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleWatchScoreSegment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mHoleScores:Ljava/util/List;

    return-object v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x50

    return v0
.end method

.method public final getMRating()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mRating:F

    return v0
.end method

.method public final getMSlope()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mSlope:F

    return v0
.end method

.method public final getMStartTime()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mStartTime:J

    return-wide v0
.end method

.method public final getMTotalLength()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mTotalLength:J

    return-wide v0
.end method

.method public final setMCourseId(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mCourseId:Ljava/lang/String;

    return-void
.end method

.method public final setMCourseName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mCourseName:Ljava/lang/String;

    return-void
.end method

.method public final setMCoursePar(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mCoursePar:I

    return-void
.end method

.method public final setMDifficultyName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mDifficultyName:Ljava/lang/String;

    return-void
.end method

.method public final setMDuration(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mDuration:J

    return-void
.end method

.method public final setMHoleCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mHoleCount:I

    return-void
.end method

.method public final setMHoleScores(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleWatchScoreSegment;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mHoleScores:Ljava/util/List;

    return-void
.end method

.method public final setMRating(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mRating:F

    return-void
.end method

.method public final setMSlope(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mSlope:F

    return-void
.end method

.method public final setMStartTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mStartTime:J

    return-void
.end method

.method public final setMTotalLength(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mTotalLength:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\n            BleGolfWatchScore(mStartTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mStartTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ",mDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mDuration:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ",mCourseId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mCourseId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",mCourseName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mCourseName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",mHoleCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mHoleCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mDifficultyName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mDifficultyName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",mTotalLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mTotalLength:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ",mSlope="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mSlope:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ",mRating="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mRating:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ",mCoursePar="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mCoursePar:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",mHoleScores="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleGolfWatchScore;->mHoleScores:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")\n        "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/he5;->OiIIX101O(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
