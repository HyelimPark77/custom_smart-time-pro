.class public final Lcom/szabh/smable3/entity/BleCPMissYou;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleCPMissYou$Companion;
    }
.end annotation


# static fields
.field public static final CONTENT_2_MAX_LENGTH:I = 0x19

.field public static final CONTENT_MAX_LENGTH:I = 0x3c

.field public static final Companion:Lcom/szabh/smable3/entity/BleCPMissYou$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private mAudioData:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mAudioType:I

.field private mCPMissTime:I

.field private mContent1:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mContent2:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mImageData:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mMissTime:I

.field private mTime:J

.field private mUser:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleCPMissYou$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleCPMissYou$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleCPMissYou;->Companion:Lcom/szabh/smable3/entity/BleCPMissYou$Companion;

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

    invoke-direct/range {v0 .. v12}, Lcom/szabh/smable3/entity/BleCPMissYou;-><init>(IJIILjava/lang/String;Ljava/lang/String;I[B[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IJIILjava/lang/String;Ljava/lang/String;I[B[B)V
    .locals 1
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p9    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mContent1"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mContent2"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mImageData"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mAudioData"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mUser:I

    .line 4
    iput-wide p2, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mTime:J

    .line 5
    iput p4, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mMissTime:I

    .line 6
    iput p5, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mCPMissTime:I

    .line 7
    iput-object p6, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent1:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent2:Ljava/lang/String;

    .line 9
    iput p8, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioType:I

    .line 10
    iput-object p9, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mImageData:[B

    .line 11
    iput-object p10, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioData:[B

    return-void
.end method

.method public synthetic constructor <init>(IJIILjava/lang/String;Ljava/lang/String;I[B[BILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

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

    .line 12
    const-string v1, ""

    if-eqz p12, :cond_4

    move-object p6, v1

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    move-object p7, v1

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    move p8, v0

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    .line 13
    new-array p9, v0, [B

    :cond_7
    and-int/lit16 p11, p11, 0x100

    if-eqz p11, :cond_8

    .line 14
    new-array p10, v0, [B

    :cond_8
    move-object p11, p10

    move-object p10, p9

    move p9, p8

    move-object p8, p7

    move-object p7, p6

    move p6, p5

    move p5, p4

    move-wide p3, p2

    move p2, p1

    move-object p1, p0

    .line 15
    invoke-direct/range {p1 .. p11}, Lcom/szabh/smable3/entity/BleCPMissYou;-><init>(IJIILjava/lang/String;Ljava/lang/String;I[B[B)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleCPMissYou;IJIILjava/lang/String;Ljava/lang/String;I[B[BILjava/lang/Object;)Lcom/szabh/smable3/entity/BleCPMissYou;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mUser:I

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-wide p2, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mTime:J

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget p4, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mMissTime:I

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget p5, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mCPMissTime:I

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p6, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent1:Ljava/lang/String;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p7, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent2:Ljava/lang/String;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget p8, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioType:I

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p9, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mImageData:[B

    :cond_7
    and-int/lit16 p11, p11, 0x100

    if-eqz p11, :cond_8

    iget-object p10, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioData:[B

    :cond_8
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move p10, p8

    move p7, p5

    move-object p8, p6

    move p6, p4

    move-wide p4, p2

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p12}, Lcom/szabh/smable3/entity/BleCPMissYou;->copy(IJIILjava/lang/String;Ljava/lang/String;I[B[B)Lcom/szabh/smable3/entity/BleCPMissYou;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mUser:I

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mTime:J

    return-wide v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mMissTime:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mCPMissTime:I

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent1:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent2:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioType:I

    return v0
.end method

.method public final component8()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mImageData:[B

    return-object v0
.end method

.method public final component9()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioData:[B

    return-object v0
.end method

.method public final copy(IJIILjava/lang/String;Ljava/lang/String;I[B[B)Lcom/szabh/smable3/entity/BleCPMissYou;
    .locals 12
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p9    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p10    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mContent1"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mContent2"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mImageData"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mAudioData"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleCPMissYou;

    move v2, p1

    move-wide v3, p2

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v9, p8

    invoke-direct/range {v1 .. v11}, Lcom/szabh/smable3/entity/BleCPMissYou;-><init>(IJIILjava/lang/String;Ljava/lang/String;I[B[B)V

    return-object v1
.end method

.method public decode()V
    .locals 6

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mUser:I

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt64(Ljava/nio/ByteOrder;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mTime:J

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mMissTime:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mCPMissTime:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-static {p0, v2, v4, v5, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent1:Ljava/lang/String;

    invoke-static {p0, v3, v4, v5, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent2:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v1

    iput v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioType:I

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v1

    iput-object v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mImageData:[B

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioData:[B

    return-void
.end method

.method public encode()V
    .locals 15

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mUser:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mTime:J

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v3, "LITTLE_ENDIAN"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeLong(JLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mMissTime:I

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mCPMissTime:I

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent1:Ljava/lang/String;

    sget-object v1, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v4, "getBytes(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v0

    const/16 v5, 0x3c

    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v8

    invoke-virtual {p0, v8}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent2:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v0

    const/16 v1, 0x19

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    if-lez v8, :cond_0

    iget-object v7, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent1:Ljava/lang/String;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v6, p0

    invoke-static/range {v6 .. v11}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithFix$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;ILjava/nio/charset/Charset;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    move-object v6, p0

    :goto_0
    if-lez v0, :cond_1

    iget-object v10, v6, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent2:Ljava/lang/String;

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    move v11, v0

    move-object v9, v6

    invoke-static/range {v9 .. v14}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithFix$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;ILjava/nio/charset/Charset;ILjava/lang/Object;)V

    :cond_1
    iget-object v0, v6, Lcom/szabh/smable3/entity/BleCPMissYou;->mImageData:[B

    array-length v0, v0

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    iget-object v1, v6, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioData:[B

    array-length v1, v1

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    iget v2, v6, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioType:I

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-lez v0, :cond_2

    iget-object v0, v6, Lcom/szabh/smable3/entity/BleCPMissYou;->mImageData:[B

    invoke-static {p0, v0, v3, v2, v3}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    :cond_2
    if-lez v1, :cond_3

    iget-object v0, v6, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioData:[B

    invoke-static {p0, v0, v3, v2, v3}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    :cond_3
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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleCPMissYou;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleCPMissYou;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mUser:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPMissYou;->mUser:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mTime:J

    iget-wide v5, p1, Lcom/szabh/smable3/entity/BleCPMissYou;->mTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mMissTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPMissYou;->mMissTime:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mCPMissTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPMissYou;->mCPMissTime:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent1:Ljava/lang/String;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent1:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent2:Ljava/lang/String;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent2:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioType:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mImageData:[B

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleCPMissYou;->mImageData:[B

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioData:[B

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioData:[B

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getMAudioData()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioData:[B

    return-object v0
.end method

.method public final getMAudioType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioType:I

    return v0
.end method

.method public final getMCPMissTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mCPMissTime:I

    return v0
.end method

.method public final getMContent1()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent1:Ljava/lang/String;

    return-object v0
.end method

.method public final getMContent2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent2:Ljava/lang/String;

    return-object v0
.end method

.method public final getMImageData()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mImageData:[B

    return-object v0
.end method

.method public getMLengthToWrite()I
    .locals 4

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent1:Ljava/lang/String;

    sget-object v1, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v2, "getBytes(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v0

    const/16 v3, 0x3c

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x13

    iget-object v3, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent2:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v1

    const/16 v2, 0x19

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x4

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mImageData:[B

    array-length v1, v1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x5

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioData:[B

    array-length v1, v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final getMMissTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mMissTime:I

    return v0
.end method

.method public final getMTime()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mTime:J

    return-wide v0
.end method

.method public final getMUser()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mUser:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mUser:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mMissTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mCPMissTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent1:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent2:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mImageData:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioData:[B

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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioData:[B

    return-void
.end method

.method public final setMAudioType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioType:I

    return-void
.end method

.method public final setMCPMissTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mCPMissTime:I

    return-void
.end method

.method public final setMContent1(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent1:Ljava/lang/String;

    return-void
.end method

.method public final setMContent2(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent2:Ljava/lang/String;

    return-void
.end method

.method public final setMImageData([B)V
    .locals 1
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mImageData:[B

    return-void
.end method

.method public final setMMissTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mMissTime:I

    return-void
.end method

.method public final setMTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mTime:J

    return-void
.end method

.method public final setMUser(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mUser:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleCPMissYou(mUser="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mUser:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mMissTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mMissTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCPMissTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mCPMissTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mContent1=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent1:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', mContent2=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mContent2:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', mAudioType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mImageData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mImageData:[B

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAudioData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPMissYou;->mAudioData:[B

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
