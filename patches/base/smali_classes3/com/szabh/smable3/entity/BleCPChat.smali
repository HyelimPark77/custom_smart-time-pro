.class public final Lcom/szabh/smable3/entity/BleCPChat;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleCPChat$Companion;
    }
.end annotation


# static fields
.field public static final CONTENT_TYPE_AAC:I = 0x6

.field public static final CONTENT_TYPE_DELETE:I = 0x7

.field public static final CONTENT_TYPE_EMOJI:I = 0x3

.field public static final CONTENT_TYPE_IMAGE:I = 0x1

.field public static final CONTENT_TYPE_LOCATION:I = 0x4

.field public static final CONTENT_TYPE_OPUS:I = 0x5

.field public static final CONTENT_TYPE_TEXT:I = 0x0

.field public static final CONTENT_TYPE_UNDO:I = 0x8

.field public static final CONTENT_TYPE_VIDEO:I = 0x2

.field public static final Companion:Lcom/szabh/smable3/entity/BleCPChat$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private mContentType:I

.field private mData:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mTime:J

.field private mUser:I

.field private mVoiceDuration:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleCPChat$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleCPChat$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleCPChat;->Companion:Lcom/szabh/smable3/entity/BleCPChat$Companion;

    return-void
.end method

.method public constructor <init>(IJII[B)V
    .locals 1
    .param p6    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mData"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 2
    iput p1, p0, Lcom/szabh/smable3/entity/BleCPChat;->mUser:I

    .line 3
    iput-wide p2, p0, Lcom/szabh/smable3/entity/BleCPChat;->mTime:J

    .line 4
    iput p4, p0, Lcom/szabh/smable3/entity/BleCPChat;->mContentType:I

    .line 5
    iput p5, p0, Lcom/szabh/smable3/entity/BleCPChat;->mVoiceDuration:I

    .line 6
    iput-object p6, p0, Lcom/szabh/smable3/entity/BleCPChat;->mData:[B

    return-void
.end method

.method public synthetic constructor <init>(IJII[BILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    const-wide/16 p2, 0x0

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    move p4, v0

    :cond_2
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_3

    .line 7
    new-array p6, v0, [B

    :cond_3
    move-object p7, p6

    move p6, p5

    move p5, p4

    move-wide p3, p2

    move p2, p1

    move-object p1, p0

    .line 8
    invoke-direct/range {p1 .. p7}, Lcom/szabh/smable3/entity/BleCPChat;-><init>(IJII[B)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleCPChat;IJII[BILjava/lang/Object;)Lcom/szabh/smable3/entity/BleCPChat;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleCPChat;->mUser:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-wide p2, p0, Lcom/szabh/smable3/entity/BleCPChat;->mTime:J

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget p4, p0, Lcom/szabh/smable3/entity/BleCPChat;->mContentType:I

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget p5, p0, Lcom/szabh/smable3/entity/BleCPChat;->mVoiceDuration:I

    :cond_3
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_4

    iget-object p6, p0, Lcom/szabh/smable3/entity/BleCPChat;->mData:[B

    :cond_4
    move p7, p5

    move-object p8, p6

    move p6, p4

    move-wide p4, p2

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p8}, Lcom/szabh/smable3/entity/BleCPChat;->copy(IJII[B)Lcom/szabh/smable3/entity/BleCPChat;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPChat;->mUser:I

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPChat;->mTime:J

    return-wide v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPChat;->mContentType:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPChat;->mVoiceDuration:I

    return v0
.end method

.method public final component5()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPChat;->mData:[B

    return-object v0
.end method

.method public final copy(IJII[B)Lcom/szabh/smable3/entity/BleCPChat;
    .locals 8
    .param p6    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mData"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleCPChat;

    move v2, p1

    move-wide v3, p2

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/szabh/smable3/entity/BleCPChat;-><init>(IJII[B)V

    return-object v1
.end method

.method public decode()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleCPChat;->mUser:I

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt64(Ljava/nio/ByteOrder;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/szabh/smable3/entity/BleCPChat;->mTime:J

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleCPChat;->mContentType:I

    const/4 v2, 0x5

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleCPChat;->mVoiceDuration:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleCPChat;->mData:[B

    return-void
.end method

.method public encode()V
    .locals 5

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPChat;->mUser:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPChat;->mTime:J

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v3, "LITTLE_ENDIAN"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeLong(JLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPChat;->mContentType:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    const/4 v0, 0x5

    new-array v0, v0, [B

    const/4 v1, 0x0

    const/4 v4, 0x2

    invoke-static {p0, v0, v1, v4, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPChat;->mVoiceDuration:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPChat;->mData:[B

    array-length v0, v0

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPChat;->mData:[B

    invoke-static {p0, v0, v1, v4, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleCPChat;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleCPChat;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPChat;->mUser:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPChat;->mUser:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/szabh/smable3/entity/BleCPChat;->mTime:J

    iget-wide v5, p1, Lcom/szabh/smable3/entity/BleCPChat;->mTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPChat;->mContentType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPChat;->mContentType:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPChat;->mVoiceDuration:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPChat;->mVoiceDuration:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPChat;->mData:[B

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleCPChat;->mData:[B

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getMContentType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPChat;->mContentType:I

    return v0
.end method

.method public final getMData()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPChat;->mData:[B

    return-object v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPChat;->mData:[B

    array-length v0, v0

    add-int/lit8 v0, v0, 0x14

    return v0
.end method

.method public final getMTime()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPChat;->mTime:J

    return-wide v0
.end method

.method public final getMUser()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPChat;->mUser:I

    return v0
.end method

.method public final getMVoiceDuration()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPChat;->mVoiceDuration:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPChat;->mUser:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleCPChat;->mTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPChat;->mContentType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPChat;->mVoiceDuration:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPChat;->mData:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMContentType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPChat;->mContentType:I

    return-void
.end method

.method public final setMData([B)V
    .locals 1
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleCPChat;->mData:[B

    return-void
.end method

.method public final setMTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleCPChat;->mTime:J

    return-void
.end method

.method public final setMUser(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPChat;->mUser:I

    return-void
.end method

.method public final setMVoiceDuration(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPChat;->mVoiceDuration:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleCPChat(mUser="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPChat;->mUser:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleCPChat;->mTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mContentType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPChat;->mContentType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mVoiceDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPChat;->mVoiceDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPChat;->mData:[B

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
