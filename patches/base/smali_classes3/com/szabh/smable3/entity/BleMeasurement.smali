.class public final Lcom/szabh/smable3/entity/BleMeasurement;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleMeasurement$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleMeasurement$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final STATE_END:I = 0x2

.field public static final STATE_FAILED:I = 0x3

.field public static final STATE_GOING:I = 0x1

.field public static final STATE_START:I = 0x0

.field public static final TYPE_BLOOD_GLUCOSE:I = 0x0

.field public static final TYPE_BLOOD_GLUCOSE_VALUE:I = 0x1


# instance fields
.field private mDay:I

.field private mHour:I

.field private mLength:I

.field private final mLengthToWrite:I

.field private mMillisecond:I

.field private mMinute:I

.field private mMonth:I

.field private mPacket:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mSecond:I

.field private mState:I

.field private mType:I

.field private mYear:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleMeasurement$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleMeasurement$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleMeasurement;->Companion:Lcom/szabh/smable3/entity/BleMeasurement$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 14

    .line 1
    const/16 v12, 0x7ff

    const/4 v13, 0x0

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

    const/4 v11, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lcom/szabh/smable3/entity/BleMeasurement;-><init>(IIIIIIIIII[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIIIII[B)V
    .locals 1
    .param p11    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mPacket"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mType:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mState:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mYear:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMonth:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mDay:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mHour:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMinute:I

    .line 10
    iput p8, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mSecond:I

    .line 11
    iput p9, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMillisecond:I

    .line 12
    iput p10, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mLength:I

    .line 13
    iput-object p11, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mPacket:[B

    .line 14
    array-length p1, p11

    add-int/lit8 p1, p1, 0x20

    iput p1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mLengthToWrite:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIIII[BILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p13, p12, 0x1

    const/4 v0, 0x0

    if-eqz p13, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    move p8, v0

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    move p9, v0

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    move p10, v0

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    .line 15
    new-array p11, v0, [B

    :cond_a
    move-object p12, p11

    move p11, p10

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

    .line 16
    invoke-direct/range {p1 .. p12}, Lcom/szabh/smable3/entity/BleMeasurement;-><init>(IIIIIIIIII[B)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleMeasurement;IIIIIIIIII[BILjava/lang/Object;)Lcom/szabh/smable3/entity/BleMeasurement;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mType:I

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mState:I

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mYear:I

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMonth:I

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mDay:I

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mHour:I

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget p7, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMinute:I

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget p8, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mSecond:I

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget p9, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMillisecond:I

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget p10, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mLength:I

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mPacket:[B

    :cond_a
    move p12, p10

    move-object p13, p11

    move p10, p8

    move p11, p9

    move p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/szabh/smable3/entity/BleMeasurement;->copy(IIIIIIIIII[B)Lcom/szabh/smable3/entity/BleMeasurement;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mType:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mLength:I

    return v0
.end method

.method public final component11()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mPacket:[B

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mState:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mYear:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMonth:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mDay:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mHour:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMinute:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mSecond:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMillisecond:I

    return v0
.end method

.method public final copy(IIIIIIIIII[B)Lcom/szabh/smable3/entity/BleMeasurement;
    .locals 13
    .param p11    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mPacket"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleMeasurement;

    move v2, p1

    move v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    invoke-direct/range {v1 .. v12}, Lcom/szabh/smable3/entity/BleMeasurement;-><init>(IIIIIIIIII[B)V

    return-object v1
.end method

.method public decode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mType:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mState:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    add-int/lit16 v0, v0, 0x7d0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mYear:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMonth:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mDay:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mHour:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMinute:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mSecond:I

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMillisecond:I

    const/16 v2, 0x14

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mLength:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mPacket:[B

    return-void
.end method

.method public encode()V
    .locals 5

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mType:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mState:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mYear:I

    add-int/lit16 v0, v0, -0x7d0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMonth:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mDay:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mHour:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMinute:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mSecond:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMillisecond:I

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v2, "LITTLE_ENDIAN"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    const/16 v0, 0x14

    new-array v0, v0, [B

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {p0, v0, v3, v4, v3}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mLength:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mPacket:[B

    invoke-static {p0, v0, v3, v4, v3}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleMeasurement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleMeasurement;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMeasurement;->mType:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mState:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMeasurement;->mState:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mYear:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMeasurement;->mYear:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMonth:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMeasurement;->mMonth:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mDay:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMeasurement;->mDay:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mHour:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMeasurement;->mHour:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMinute:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMeasurement;->mMinute:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mSecond:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMeasurement;->mSecond:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMillisecond:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMeasurement;->mMillisecond:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mLength:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleMeasurement;->mLength:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mPacket:[B

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleMeasurement;->mPacket:[B

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getMDay()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mDay:I

    return v0
.end method

.method public final getMHour()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mHour:I

    return v0
.end method

.method public final getMLength()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mLength:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mLengthToWrite:I

    return v0
.end method

.method public final getMMillisecond()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMillisecond:I

    return v0
.end method

.method public final getMMinute()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMinute:I

    return v0
.end method

.method public final getMMonth()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMonth:I

    return v0
.end method

.method public final getMPacket()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mPacket:[B

    return-object v0
.end method

.method public final getMSecond()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mSecond:I

    return v0
.end method

.method public final getMState()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mState:I

    return v0
.end method

.method public final getMType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mType:I

    return v0
.end method

.method public final getMYear()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mYear:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mType:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mState:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mYear:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMonth:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mDay:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mHour:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMinute:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mSecond:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMillisecond:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mLength:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mPacket:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMDay(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mDay:I

    return-void
.end method

.method public final setMHour(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mHour:I

    return-void
.end method

.method public final setMLength(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mLength:I

    return-void
.end method

.method public final setMMillisecond(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMillisecond:I

    return-void
.end method

.method public final setMMinute(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMinute:I

    return-void
.end method

.method public final setMMonth(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMonth:I

    return-void
.end method

.method public final setMPacket([B)V
    .locals 1
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mPacket:[B

    return-void
.end method

.method public final setMSecond(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mSecond:I

    return-void
.end method

.method public final setMState(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mState:I

    return-void
.end method

.method public final setMType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mType:I

    return-void
.end method

.method public final setMYear(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mYear:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleMeasurement(mType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mState:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mYear="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mYear:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMonth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMonth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mDay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mHour:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMinute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMinute:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSecond="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mSecond:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMillisecond="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mMillisecond:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mLength:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPacket="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleMeasurement;->mPacket:[B

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
