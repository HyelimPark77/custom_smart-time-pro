.class public final Lcom/szabh/smable3/entity/BleCPListener;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleCPListener$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleCPListener$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x20

.field public static final STATUS_CLOSE:I = 0x2

.field public static final STATUS_NORMAL:I = 0x0

.field public static final STATUS_OPEN:I = 0x1


# instance fields
.field private mLastReceivedRecordTimes:J

.field private mLastRecordNum:I

.field private mLastSendRecordTimes:J

.field private mStatus:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleCPListener$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleCPListener$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleCPListener;->Companion:Lcom/szabh/smable3/entity/BleCPListener$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/szabh/smable3/entity/BleCPListener;-><init>(IJJIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IJJI)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleCPListener;->mStatus:I

    .line 4
    iput-wide p2, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastSendRecordTimes:J

    .line 5
    iput-wide p4, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastReceivedRecordTimes:J

    .line 6
    iput p6, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastRecordNum:I

    return-void
.end method

.method public synthetic constructor <init>(IJJIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    const-wide/16 v1, 0x0

    if-eqz p8, :cond_1

    move-wide p2, v1

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    move-wide p4, v1

    :cond_2
    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_3

    move p7, v0

    :goto_0
    move-wide p5, p4

    move-wide p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_3
    move p7, p6

    goto :goto_0

    .line 7
    :goto_1
    invoke-direct/range {p1 .. p7}, Lcom/szabh/smable3/entity/BleCPListener;-><init>(IJJI)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleCPListener;IJJIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleCPListener;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleCPListener;->mStatus:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-wide p2, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastSendRecordTimes:J

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-wide p4, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastReceivedRecordTimes:J

    :cond_2
    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_3

    iget p6, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastRecordNum:I

    :cond_3
    move p8, p6

    move-wide p6, p4

    move-wide p4, p2

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p8}, Lcom/szabh/smable3/entity/BleCPListener;->copy(IJJI)Lcom/szabh/smable3/entity/BleCPListener;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPListener;->mStatus:I

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastSendRecordTimes:J

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastReceivedRecordTimes:J

    return-wide v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastRecordNum:I

    return v0
.end method

.method public final copy(IJJI)Lcom/szabh/smable3/entity/BleCPListener;
    .locals 7
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleCPListener;

    move v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/szabh/smable3/entity/BleCPListener;-><init>(IJJI)V

    return-object v0
.end method

.method public decode()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleCPListener;->mStatus:I

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt64(Ljava/nio/ByteOrder;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastSendRecordTimes:J

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt64(Ljava/nio/ByteOrder;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastReceivedRecordTimes:J

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastRecordNum:I

    return-void
.end method

.method public encode()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPListener;->mStatus:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastSendRecordTimes:J

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v3, "LITTLE_ENDIAN"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeLong(JLjava/nio/ByteOrder;)V

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastReceivedRecordTimes:J

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeLong(JLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastRecordNum:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleCPListener;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleCPListener;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPListener;->mStatus:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPListener;->mStatus:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastSendRecordTimes:J

    iget-wide v5, p1, Lcom/szabh/smable3/entity/BleCPListener;->mLastSendRecordTimes:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastReceivedRecordTimes:J

    iget-wide v5, p1, Lcom/szabh/smable3/entity/BleCPListener;->mLastReceivedRecordTimes:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastRecordNum:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleCPListener;->mLastRecordNum:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getMLastReceivedRecordTimes()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastReceivedRecordTimes:J

    return-wide v0
.end method

.method public final getMLastRecordNum()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastRecordNum:I

    return v0
.end method

.method public final getMLastSendRecordTimes()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastSendRecordTimes:J

    return-wide v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x20

    return v0
.end method

.method public final getMStatus()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPListener;->mStatus:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPListener;->mStatus:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastSendRecordTimes:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastReceivedRecordTimes:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastRecordNum:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMLastReceivedRecordTimes(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastReceivedRecordTimes:J

    return-void
.end method

.method public final setMLastRecordNum(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastRecordNum:I

    return-void
.end method

.method public final setMLastSendRecordTimes(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastSendRecordTimes:J

    return-void
.end method

.method public final setMStatus(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPListener;->mStatus:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleCPListener(mStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPListener;->mStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLastSendRecordTimes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastSendRecordTimes:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mLastReceivedRecordTimes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastReceivedRecordTimes:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mLastRecordNum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPListener;->mLastRecordNum:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
