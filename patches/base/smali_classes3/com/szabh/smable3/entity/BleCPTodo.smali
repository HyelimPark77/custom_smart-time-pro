.class public final Lcom/szabh/smable3/entity/BleCPTodo;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleCPTodo$Companion;
    }
.end annotation


# static fields
.field public static final CONTENT_MAX_LENGTH:I = 0x60

.field public static final Companion:Lcom/szabh/smable3/entity/BleCPTodo$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TYPE_CREATE:I = 0x0

.field public static final TYPE_DELETE:I = 0x2

.field public static final TYPE_UPDATE:I = 0x1


# instance fields
.field private mAudioData:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mAudioType:I

.field private mContent:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mReminder:I

.field private mReminderTime:J

.field private mTime:J

.field private mType:I

.field private mUser:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleCPTodo$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleCPTodo$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleCPTodo;->Companion:Lcom/szabh/smable3/entity/BleCPTodo$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 13

    .line 1
    const/16 v11, 0xff

    const/4 v12, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lcom/szabh/smable3/entity/BleCPTodo;-><init>(JIIIJLjava/lang/String;I[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(JIIIJLjava/lang/String;I[B)V
    .locals 1
    .param p8    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mContent"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mAudioData"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mTime:J

    .line 4
    iput p3, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mType:I

    .line 5
    iput p4, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mUser:I

    .line 6
    iput p5, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mReminder:I

    .line 7
    iput-wide p6, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mReminderTime:J

    .line 8
    iput-object p8, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mContent:Ljava/lang/String;

    .line 9
    iput p9, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioType:I

    .line 10
    iput-object p10, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioData:[B

    return-void
.end method

.method public synthetic constructor <init>(JIIIJLjava/lang/String;I[BILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3

    and-int/lit8 p12, p11, 0x1

    const-wide/16 v0, 0x0

    if-eqz p12, :cond_0

    move-wide p1, v0

    :cond_0
    and-int/lit8 p12, p11, 0x2

    const/4 v2, 0x0

    if-eqz p12, :cond_1

    move p3, v2

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    move p4, v2

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    move p5, v2

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    move-wide p6, v0

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    .line 11
    const-string p8, ""

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    move p9, v2

    :cond_6
    and-int/lit16 p11, p11, 0x80

    if-eqz p11, :cond_7

    .line 12
    new-array p10, v2, [B

    :cond_7
    move-object p11, p10

    move p10, p9

    move-object p9, p8

    move-wide p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move-wide p2, p1

    move-object p1, p0

    .line 13
    invoke-direct/range {p1 .. p11}, Lcom/szabh/smable3/entity/BleCPTodo;-><init>(JIIIJLjava/lang/String;I[B)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleCPTodo;JIIIJLjava/lang/String;I[BILjava/lang/Object;)Lcom/szabh/smable3/entity/BleCPTodo;
    .locals 11

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-wide p1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mTime:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, v0, 0x2

    if-eqz p1, :cond_1

    iget p3, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mType:I

    :cond_1
    move v3, p3

    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_2

    iget p4, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mUser:I

    :cond_2
    move v4, p4

    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_3

    iget p1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mReminder:I

    move v5, p1

    goto :goto_0

    :cond_3
    move/from16 v5, p5

    :goto_0
    and-int/lit8 p1, v0, 0x10

    if-eqz p1, :cond_4

    iget-wide p1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mReminderTime:J

    move-wide v6, p1

    goto :goto_1

    :cond_4
    move-wide/from16 v6, p6

    :goto_1
    and-int/lit8 p1, v0, 0x20

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mContent:Ljava/lang/String;

    move-object v8, p1

    goto :goto_2

    :cond_5
    move-object/from16 v8, p8

    :goto_2
    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_6

    iget p1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioType:I

    move v9, p1

    goto :goto_3

    :cond_6
    move/from16 v9, p9

    :goto_3
    and-int/lit16 p1, v0, 0x80

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioData:[B

    move-object v10, p1

    :goto_4
    move-object v0, p0

    goto :goto_5

    :cond_7
    move-object/from16 v10, p10

    goto :goto_4

    :goto_5
    invoke-virtual/range {v0 .. v10}, Lcom/szabh/smable3/entity/BleCPTodo;->copy(JIIIJLjava/lang/String;I[B)Lcom/szabh/smable3/entity/BleCPTodo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mTime:J

    return-wide v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mType:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mUser:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mReminder:I

    return v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mReminderTime:J

    return-wide v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mContent:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioType:I

    return v0
.end method

.method public final component8()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioData:[B

    return-object v0
.end method

.method public final copy(JIIIJLjava/lang/String;I[B)Lcom/szabh/smable3/entity/BleCPTodo;
    .locals 12
    .param p8    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mContent"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mAudioData"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleCPTodo;

    move-wide v2, p1

    move v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-wide/from16 v7, p6

    move/from16 v10, p9

    invoke-direct/range {v1 .. v11}, Lcom/szabh/smable3/entity/BleCPTodo;-><init>(JIIIJLjava/lang/String;I[B)V

    return-object v1
.end method

.method public decode()V
    .locals 5

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt64(Ljava/nio/ByteOrder;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mTime:J

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mType:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mUser:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mReminder:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt64(Ljava/nio/ByteOrder;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mReminderTime:J

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    if-lez v2, :cond_0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {p0, v2, v4, v3, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mContent:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioType:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioData:[B

    return-void
.end method

.method public encode()V
    .locals 10

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mTime:J

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v3, "LITTLE_ENDIAN"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeLong(JLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mType:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mUser:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mReminder:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mReminderTime:J

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeLong(JLjava/nio/ByteOrder;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mContent:Ljava/lang/String;

    sget-object v1, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "getBytes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v0

    const/16 v1, 0x60

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v6

    invoke-virtual {p0, v6}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-object v5, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mContent:Ljava/lang/String;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v4, p0

    invoke-static/range {v4 .. v9}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithFix$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;ILjava/nio/charset/Charset;ILjava/lang/Object;)V

    iget v0, v4, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioType:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-object v0, v4, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioData:[B

    array-length v0, v0

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    iget-object v0, v4, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioData:[B

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleCPTodo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleCPTodo;

    iget-wide v3, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mTime:J

    iget-wide v5, p1, Lcom/szabh/smable3/entity/BleCPTodo;->mTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPTodo;->mType:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mUser:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPTodo;->mUser:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mReminder:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPTodo;->mReminder:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mReminderTime:J

    iget-wide v5, p1, Lcom/szabh/smable3/entity/BleCPTodo;->mReminderTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mContent:Ljava/lang/String;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleCPTodo;->mContent:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioType:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioData:[B

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioData:[B

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getMAudioData()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioData:[B

    return-object v0
.end method

.method public final getMAudioType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioType:I

    return v0
.end method

.method public final getMContent()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mContent:Ljava/lang/String;

    return-object v0
.end method

.method public getMLengthToWrite()I
    .locals 2

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mContent:Ljava/lang/String;

    sget-object v1, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "getBytes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v0

    const/16 v1, 0x60

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x19

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioData:[B

    array-length v1, v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final getMReminder()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mReminder:I

    return v0
.end method

.method public final getMReminderTime()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mReminderTime:J

    return-wide v0
.end method

.method public final getMTime()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mTime:J

    return-wide v0
.end method

.method public final getMType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mType:I

    return v0
.end method

.method public final getMUser()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mUser:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mTime:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mUser:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mReminder:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mReminderTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mContent:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioData:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAudioData([B)V
    .locals 1
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioData:[B

    return-void
.end method

.method public final setMAudioType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioType:I

    return-void
.end method

.method public final setMContent(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mContent:Ljava/lang/String;

    return-void
.end method

.method public final setMReminder(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mReminder:I

    return-void
.end method

.method public final setMReminderTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mReminderTime:J

    return-void
.end method

.method public final setMTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mTime:J

    return-void
.end method

.method public final setMType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mType:I

    return-void
.end method

.method public final setMUser(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mUser:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleCPTodo(mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mUser="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mUser:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mReminder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mReminder:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mReminderTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mReminderTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mContent=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mContent:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', mAudioType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAudioData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPTodo;->mAudioData:[B

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
