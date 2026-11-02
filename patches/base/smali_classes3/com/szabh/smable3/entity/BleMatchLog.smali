.class public final Lcom/szabh/smable3/entity/BleMatchLog;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleMatchLog$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleMatchLog$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final GOAL_GUEST:I = 0x7

.field public static final GOAL_HOME:I = 0x6

.field public static final ITEM_LENGTH:I = 0x8

.field public static final KICK_OFF:I = 0x0

.field public static final MERCY_END:I = 0x9

.field public static final PENALTY:I = 0x5

.field public static final PERIOD_END:I = 0x3

.field public static final PERIOD_RESET:I = 0x4

.field public static final TIME_START:I = 0x1

.field public static final TIME_STOP:I = 0x2

.field public static final UNDO_LAST:I = 0x8


# instance fields
.field private mCancelType:I

.field private mCount:I

.field private mPeriodNumber:I

.field private mPeriodTime:I

.field private mTime:I

.field private mType:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleMatchLog$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleMatchLog$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleMatchLog;->Companion:Lcom/szabh/smable3/entity/BleMatchLog$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/szabh/smable3/entity/BleMatchLog;-><init>(IIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mTime:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mPeriodTime:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mPeriodNumber:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mType:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mCount:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mCancelType:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    move p7, v0

    :goto_0
    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move p7, p6

    goto :goto_0

    .line 9
    :goto_1
    invoke-direct/range {p1 .. p7}, Lcom/szabh/smable3/entity/BleMatchLog;-><init>(IIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleMatchLog;IIIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleMatchLog;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mTime:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mPeriodTime:I

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mPeriodNumber:I

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mType:I

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mCount:I

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mCancelType:I

    :cond_5
    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/szabh/smable3/entity/BleMatchLog;->copy(IIIIII)Lcom/szabh/smable3/entity/BleMatchLog;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mTime:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mPeriodTime:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mPeriodNumber:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mType:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mCount:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mCancelType:I

    return v0
.end method

.method public final copy(IIIIII)Lcom/szabh/smable3/entity/BleMatchLog;
    .locals 7
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleMatchLog;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/szabh/smable3/entity/BleMatchLog;-><init>(IIIIII)V

    return-object v0
.end method

.method public decode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mTime:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mPeriodTime:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mPeriodNumber:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mType:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mCount:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mCancelType:I

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleMatchLog;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleMatchLog;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchLog;->mTime:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mPeriodTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchLog;->mPeriodTime:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mPeriodNumber:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchLog;->mPeriodNumber:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchLog;->mType:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchLog;->mCount:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mCancelType:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleMatchLog;->mCancelType:I

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getMCancelType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mCancelType:I

    return v0
.end method

.method public final getMCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mCount:I

    return v0
.end method

.method public final getMPeriodNumber()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mPeriodNumber:I

    return v0
.end method

.method public final getMPeriodTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mPeriodTime:I

    return v0
.end method

.method public final getMTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mTime:I

    return v0
.end method

.method public final getMType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mType:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mTime:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mPeriodTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mPeriodNumber:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mCancelType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMCancelType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mCancelType:I

    return-void
.end method

.method public final setMCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mCount:I

    return-void
.end method

.method public final setMPeriodNumber(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mPeriodNumber:I

    return-void
.end method

.method public final setMPeriodTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mPeriodTime:I

    return-void
.end method

.method public final setMTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mTime:I

    return-void
.end method

.method public final setMType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mType:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleMatchLog(mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPeriodTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mPeriodTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPeriodNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mPeriodNumber:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCancelType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog;->mCancelType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
