.class public final Lcom/szabh/smable3/entity/BleNaviInfo;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleNaviInfo$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleNaviInfo$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final NAME_MAX_LENGTH:I = 0xe8

.field public static final NAVI_END:I = 0x4

.field public static final NAVI_GOING:I = 0x1

.field public static final NAVI_PAUSE:I = 0x2

.field public static final NAVI_RESUME:I = 0x3

.field public static final NAVI_START:I = 0x0

.field public static final TURN_ALONG:I = 0x0

.field public static final TURN_BACK:I = 0x1

.field public static final TURN_BACK_2BRANCH_LEFT:I = 0x2

.field public static final TURN_BACK_2BRANCH_RIGHT:I = 0x3

.field public static final TURN_BACK_3BRANCH_CENTER:I = 0x4

.field public static final TURN_BACK_3BRANCH_LEFT:I = 0x5

.field public static final TURN_BACK_3BRANCH_RIGHT:I = 0x6

.field public static final TURN_BRANCH_CENTER:I = 0x7

.field public static final TURN_BRANCH_LEFT:I = 0x8

.field public static final TURN_BRANCH_LEFT_STRAIGHT:I = 0x9

.field public static final TURN_BRANCH_RIGHT:I = 0xa

.field public static final TURN_BRANCH_RIGHT_STRAIGHT:I = 0xb

.field public static final TURN_DEST:I = 0xc

.field public static final TURN_FRONT:I = 0xd

.field public static final TURN_INFERRY:I = 0xe

.field public static final TURN_LB_2BRANCH_LEFT:I = 0xf

.field public static final TURN_LB_2BRANCH_RIGHT:I = 0x10

.field public static final TURN_LB_3BRANCH_CENTER:I = 0x11

.field public static final TURN_LB_3BRANCH_LEFT:I = 0x12

.field public static final TURN_LB_3BRANCH_RIGHT:I = 0x13

.field public static final TURN_LEFT:I = 0x14

.field public static final TURN_LEFT_BACK:I = 0x15

.field public static final TURN_LEFT_FRONT:I = 0x16

.field public static final TURN_LEFT_SIDE:I = 0x17

.field public static final TURN_LEFT_SIDE_IC:I = 0x18

.field public static final TURN_LEFT_SIDE_MAIN:I = 0x19

.field public static final TURN_LF_2BRANCH_LEFT:I = 0x1a

.field public static final TURN_LF_2BRANCH_RIGHT:I = 0x1b

.field public static final TURN_RB_2BRANCH_LEFT:I = 0x1c

.field public static final TURN_RB_2BRANCH_RIGHT:I = 0x1d

.field public static final TURN_RB_3BRANCH_CENTER:I = 0x1e

.field public static final TURN_RB_3BRANCH_LEFT:I = 0x1f

.field public static final TURN_RB_3BRANCH_RIGHT:I = 0x20

.field public static final TURN_RF_2BRANCH_LEFT:I = 0x21

.field public static final TURN_RF_2BRANCH_RIGHT:I = 0x22

.field public static final TURN_RIGHT:I = 0x23

.field public static final TURN_RIGHT_BACK:I = 0x24

.field public static final TURN_RIGHT_FRONT:I = 0x25

.field public static final TURN_RIGHT_SIDE:I = 0x26

.field public static final TURN_RIGHT_SIDE_IC:I = 0x27

.field public static final TURN_RIGHT_SIDE_MAIN:I = 0x28

.field public static final TURN_RING:I = 0x29

.field public static final TURN_RING_FRONT:I = 0x2a

.field public static final TURN_RING_LEFT:I = 0x2b

.field public static final TURN_RING_LEFTBACK:I = 0x2c

.field public static final TURN_RING_LEFTFRONT:I = 0x2d

.field public static final TURN_RING_RIGHT:I = 0x2e

.field public static final TURN_RING_RIGHTBACK:I = 0x2f

.field public static final TURN_RING_RIGHTFRONT:I = 0x30

.field public static final TURN_RING_TURNBACK:I = 0x31


# instance fields
.field private mDistance:I

.field private mMode:I

.field private mRemainDistance:I

.field private mRemainTime:I

.field private mRoadName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mSpeed:I

.field private mState:I

.field private mTime:J

.field private mTurnType:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleNaviInfo$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleNaviInfo$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleNaviInfo;->Companion:Lcom/szabh/smable3/entity/BleNaviInfo$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 13

    .line 1
    const/16 v11, 0x1ff

    const/4 v12, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lcom/szabh/smable3/entity/BleNaviInfo;-><init>(IJIIIIIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IJIIIIIILjava/lang/String;)V
    .locals 1
    .param p10    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mRoadName"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mState:I

    .line 4
    iput-wide p2, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mTime:J

    .line 5
    iput p4, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mTurnType:I

    .line 6
    iput p5, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRemainDistance:I

    .line 7
    iput p6, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRemainTime:I

    .line 8
    iput p7, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mDistance:I

    .line 9
    iput p8, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mSpeed:I

    .line 10
    iput p9, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mMode:I

    .line 11
    iput-object p10, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRoadName:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(IJIIIIIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p12, p11, 0x1

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    const-wide/16 p2, 0x0

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    move p4, v0

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    move p5, v0

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    move p6, v0

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    move p7, v0

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    move p8, v0

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    move p9, v0

    :cond_7
    and-int/lit16 p11, p11, 0x100

    if-eqz p11, :cond_8

    .line 12
    const-string p10, ""

    :cond_8
    move-object p11, p10

    move p10, p9

    move p9, p8

    move p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move-wide p3, p2

    move p2, p1

    move-object p1, p0

    .line 13
    invoke-direct/range {p1 .. p11}, Lcom/szabh/smable3/entity/BleNaviInfo;-><init>(IJIIIIIILjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleNaviInfo;IJIIIIIILjava/lang/String;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleNaviInfo;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mState:I

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-wide p2, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mTime:J

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget p4, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mTurnType:I

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget p5, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRemainDistance:I

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget p6, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRemainTime:I

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget p7, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mDistance:I

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget p8, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mSpeed:I

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget p9, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mMode:I

    :cond_7
    and-int/lit16 p11, p11, 0x100

    if-eqz p11, :cond_8

    iget-object p10, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRoadName:Ljava/lang/String;

    :cond_8
    move p11, p9

    move-object p12, p10

    move p9, p7

    move p10, p8

    move p7, p5

    move p8, p6

    move p6, p4

    move-wide p4, p2

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p12}, Lcom/szabh/smable3/entity/BleNaviInfo;->copy(IJIIIIIILjava/lang/String;)Lcom/szabh/smable3/entity/BleNaviInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mState:I

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mTime:J

    return-wide v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mTurnType:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRemainDistance:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRemainTime:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mDistance:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mSpeed:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mMode:I

    return v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRoadName:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(IJIIIIIILjava/lang/String;)Lcom/szabh/smable3/entity/BleNaviInfo;
    .locals 12
    .param p10    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mRoadName"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleNaviInfo;

    move v2, p1

    move-wide v3, p2

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v11}, Lcom/szabh/smable3/entity/BleNaviInfo;-><init>(IJIIIIIILjava/lang/String;)V

    return-object v1
.end method

.method public decode()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mState:I

    return-void
.end method

.method public encode()V
    .locals 10

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mState:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    sget-object v0, Lcom/szabh/smable3/entity/BleTime;->Companion:Lcom/szabh/smable3/entity/BleTime$Companion;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mTime:J

    invoke-virtual {v0, v1, v2}, Lcom/szabh/smable3/entity/BleTime$Companion;->ofLocal(J)Lcom/szabh/smable3/entity/BleTime;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mTurnType:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRemainDistance:I

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRemainTime:I

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mDistance:I

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mSpeed:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mMode:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRoadName:Ljava/lang/String;

    sget-object v3, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v3, "getBytes(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v0

    const/16 v3, 0xe8

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget-object v4, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRoadName:Ljava/lang/String;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/16 v5, 0xe8

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v3, p0

    invoke-static/range {v3 .. v9}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithLimit$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;ILjava/nio/charset/Charset;ZILjava/lang/Object;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleNaviInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleNaviInfo;

    iget v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mState:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleNaviInfo;->mState:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mTime:J

    iget-wide v5, p1, Lcom/szabh/smable3/entity/BleNaviInfo;->mTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mTurnType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleNaviInfo;->mTurnType:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRemainDistance:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleNaviInfo;->mRemainDistance:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRemainTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleNaviInfo;->mRemainTime:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mDistance:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleNaviInfo;->mDistance:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mSpeed:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleNaviInfo;->mSpeed:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mMode:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleNaviInfo;->mMode:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRoadName:Ljava/lang/String;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleNaviInfo;->mRoadName:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getMDistance()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mDistance:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 2

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRoadName:Ljava/lang/String;

    sget-object v1, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "getBytes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v0

    const/16 v1, 0xe8

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x18

    return v0
.end method

.method public final getMMode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mMode:I

    return v0
.end method

.method public final getMRemainDistance()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRemainDistance:I

    return v0
.end method

.method public final getMRemainTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRemainTime:I

    return v0
.end method

.method public final getMRoadName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRoadName:Ljava/lang/String;

    return-object v0
.end method

.method public final getMSpeed()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mSpeed:I

    return v0
.end method

.method public final getMState()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mState:I

    return v0
.end method

.method public final getMTime()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mTime:J

    return-wide v0
.end method

.method public final getMTurnType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mTurnType:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mState:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mTurnType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRemainDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRemainTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mDistance:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mSpeed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mMode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRoadName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMDistance(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mDistance:I

    return-void
.end method

.method public final setMMode(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mMode:I

    return-void
.end method

.method public final setMRemainDistance(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRemainDistance:I

    return-void
.end method

.method public final setMRemainTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRemainTime:I

    return-void
.end method

.method public final setMRoadName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRoadName:Ljava/lang/String;

    return-void
.end method

.method public final setMSpeed(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mSpeed:I

    return-void
.end method

.method public final setMState(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mState:I

    return-void
.end method

.method public final setMTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mTime:J

    return-void
.end method

.method public final setMTurnType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mTurnType:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleNaviInfo(mState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mState:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mTurnType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mTurnType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRemainDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRemainDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRemainTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRemainTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDistance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mDistance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpeed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mSpeed:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRoadName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleNaviInfo;->mRoadName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
