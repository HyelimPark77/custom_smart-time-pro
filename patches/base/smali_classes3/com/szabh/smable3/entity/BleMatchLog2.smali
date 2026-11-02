.class public final Lcom/szabh/smable3/entity/BleMatchLog2;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleMatchLog2$Companion;
    }
.end annotation


# static fields
.field public static final CONVERSION:I = 0x12

.field public static final Companion:Lcom/szabh/smable3/entity/BleMatchLog2$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final DROP_KICK:I = 0x14

.field public static final FOUL_AWAY:I = 0xf

.field public static final FOUL_HOME:I = 0xe

.field public static final GOAL_GUEST:I = 0x7

.field public static final GOAL_HOME:I = 0x6

.field public static final GREEN_CARD:I = 0x17

.field public static final INCIDENT_BREAK:I = 0xa

.field public static final INJURY_ASSESSMENT:I = 0x16

.field public static final ITEM_LENGTH:I = 0xc

.field public static final KICK_OFF:I = 0x0

.field public static final MERCY_END:I = 0x9

.field public static final PENALTY:I = 0x5

.field public static final PENALTY_KICK:I = 0x13

.field public static final PENALTY_TRY:I = 0x15

.field public static final PERIOD_END:I = 0x3

.field public static final PERIOD_RESET:I = 0x4

.field public static final RED_CARD:I = 0xc

.field public static final SUBSTITUTION:I = 0xd

.field public static final TIME_OUT:I = 0x10

.field public static final TIME_START:I = 0x1

.field public static final TIME_STOP:I = 0x2

.field public static final TRY:I = 0x11

.field public static final UNDO_LAST:I = 0x8

.field public static final YELLOW_CARD:I = 0xb

.field public static final YELLOW_CARD1:I = 0x18

.field public static final YELLOW_CARD2:I = 0x19


# instance fields
.field private mCancelType:I

.field private mCount:I

.field private mOtherType:I

.field private mPeriodNumber:I

.field private mPeriodTime:I

.field private mPlayer:I

.field private mStopWatchTotal:I

.field private mTeam:I

.field private mTime:I

.field private mType:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleMatchLog2$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleMatchLog2$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleMatchLog2;->Companion:Lcom/szabh/smable3/entity/BleMatchLog2$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 13

    .line 1
    const/16 v11, 0x3ff

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lcom/szabh/smable3/entity/BleMatchLog2;-><init>(IIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mTime:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPeriodTime:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPeriodNumber:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mType:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mCount:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mCancelType:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mTeam:I

    .line 10
    iput p8, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPlayer:I

    .line 11
    iput p9, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mOtherType:I

    .line 12
    iput p10, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mStopWatchTotal:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p11, 0x1

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    move p8, v0

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    move p9, v0

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    move p11, v0

    :goto_0
    move p10, p9

    move p9, p8

    move p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_9
    move p11, p10

    goto :goto_0

    .line 13
    :goto_1
    invoke-direct/range {p1 .. p11}, Lcom/szabh/smable3/entity/BleMatchLog2;-><init>(IIIIIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleMatchLog2;IIIIIIIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleMatchLog2;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mTime:I

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPeriodTime:I

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPeriodNumber:I

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mType:I

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mCount:I

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mCancelType:I

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget p7, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mTeam:I

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget p8, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPlayer:I

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget p9, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mOtherType:I

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget p10, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mStopWatchTotal:I

    :cond_9
    move p11, p9

    move p12, p10

    move p9, p7

    move p10, p8

    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/szabh/smable3/entity/BleMatchLog2;->copy(IIIIIIIIII)Lcom/szabh/smable3/entity/BleMatchLog2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mTime:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mStopWatchTotal:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPeriodTime:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPeriodNumber:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mType:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mCount:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mCancelType:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mTeam:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPlayer:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mOtherType:I

    return v0
.end method

.method public final copy(IIIIIIIIII)Lcom/szabh/smable3/entity/BleMatchLog2;
    .locals 11
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleMatchLog2;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/szabh/smable3/entity/BleMatchLog2;-><init>(IIIIIIIIII)V

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

    iput v2, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mTime:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPeriodTime:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v1

    iput v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPeriodNumber:I

    iput v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mType:I

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v1

    iput v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mStopWatchTotal:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mCount:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mCancelType:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mTeam:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPlayer:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mOtherType:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleMatchLog2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleMatchLog2;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchLog2;->mTime:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPeriodTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchLog2;->mPeriodTime:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPeriodNumber:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchLog2;->mPeriodNumber:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchLog2;->mType:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchLog2;->mCount:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mCancelType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchLog2;->mCancelType:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mTeam:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchLog2;->mTeam:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPlayer:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchLog2;->mPlayer:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mOtherType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMatchLog2;->mOtherType:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mStopWatchTotal:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleMatchLog2;->mStopWatchTotal:I

    if-eq v1, p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getMCancelType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mCancelType:I

    return v0
.end method

.method public final getMCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mCount:I

    return v0
.end method

.method public final getMOtherType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mOtherType:I

    return v0
.end method

.method public final getMPeriodNumber()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPeriodNumber:I

    return v0
.end method

.method public final getMPeriodTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPeriodTime:I

    return v0
.end method

.method public final getMPlayer()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPlayer:I

    return v0
.end method

.method public final getMStopWatchTotal()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mStopWatchTotal:I

    return v0
.end method

.method public final getMTeam()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mTeam:I

    return v0
.end method

.method public final getMTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mTime:I

    return v0
.end method

.method public final getMType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mType:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mTime:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPeriodTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPeriodNumber:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mCancelType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mTeam:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPlayer:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mOtherType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mStopWatchTotal:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMCancelType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mCancelType:I

    return-void
.end method

.method public final setMCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mCount:I

    return-void
.end method

.method public final setMOtherType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mOtherType:I

    return-void
.end method

.method public final setMPeriodNumber(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPeriodNumber:I

    return-void
.end method

.method public final setMPeriodTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPeriodTime:I

    return-void
.end method

.method public final setMPlayer(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPlayer:I

    return-void
.end method

.method public final setMStopWatchTotal(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mStopWatchTotal:I

    return-void
.end method

.method public final setMTeam(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mTeam:I

    return-void
.end method

.method public final setMTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mTime:I

    return-void
.end method

.method public final setMType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mType:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleMatchLog2(mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPeriodTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPeriodTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPeriodNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPeriodNumber:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCancelType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mCancelType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTeam="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mTeam:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPlayer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mPlayer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mOtherType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mOtherType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStopWatchTotal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMatchLog2;->mStopWatchTotal:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
