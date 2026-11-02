.class public final Lcom/szabh/smable3/entity/BleCPAnniversary;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleCPAnniversary$Companion;
    }
.end annotation


# static fields
.field public static final CONTENT_MAX_LENGTH:I = 0x12c

.field public static final Companion:Lcom/szabh/smable3/entity/BleCPAnniversary$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TITLE_MAX_LENGTH:I = 0x28

.field public static final TYPE_CREATE:I = 0x0

.field public static final TYPE_DELETE:I = 0x2

.field public static final TYPE_UPDATE:I = 0x1


# instance fields
.field private mAnniversaryTime:J

.field private mContent:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mTime:J

.field private mTitle:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mType:I

.field private mUser:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleCPAnniversary$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleCPAnniversary$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleCPAnniversary;->Companion:Lcom/szabh/smable3/entity/BleCPAnniversary$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0x3f

    const/4 v10, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/szabh/smable3/entity/BleCPAnniversary;-><init>(IJJILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IJJILjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mTitle"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mContent"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mUser:I

    .line 4
    iput-wide p2, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mTime:J

    .line 5
    iput-wide p4, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mAnniversaryTime:J

    .line 6
    iput p6, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mType:I

    .line 7
    iput-object p7, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mTitle:Ljava/lang/String;

    .line 8
    iput-object p8, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mContent:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(IJJILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3

    and-int/lit8 p10, p9, 0x1

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p10, p9, 0x2

    const-wide/16 v1, 0x0

    if-eqz p10, :cond_1

    move-wide p2, v1

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    move-wide p4, v1

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    move p6, v0

    :cond_3
    and-int/lit8 p10, p9, 0x10

    .line 9
    const-string v0, ""

    if-eqz p10, :cond_4

    move-object p7, v0

    :cond_4
    and-int/lit8 p9, p9, 0x20

    if-eqz p9, :cond_5

    move-object p9, v0

    :goto_0
    move-object p8, p7

    move p7, p6

    move-wide p5, p4

    move-wide p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move-object p9, p8

    goto :goto_0

    :goto_1
    invoke-direct/range {p1 .. p9}, Lcom/szabh/smable3/entity/BleCPAnniversary;-><init>(IJJILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleCPAnniversary;IJJILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleCPAnniversary;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mUser:I

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-wide p2, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mTime:J

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-wide p4, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mAnniversaryTime:J

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget p6, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mType:I

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p7, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mTitle:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p9, 0x20

    if-eqz p9, :cond_5

    iget-object p8, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mContent:Ljava/lang/String;

    :cond_5
    move-object p9, p7

    move-object p10, p8

    move p8, p6

    move-wide p6, p4

    move-wide p4, p2

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p10}, Lcom/szabh/smable3/entity/BleCPAnniversary;->copy(IJJILjava/lang/String;Ljava/lang/String;)Lcom/szabh/smable3/entity/BleCPAnniversary;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mUser:I

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mTime:J

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mAnniversaryTime:J

    return-wide v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mType:I

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mContent:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(IJJILjava/lang/String;Ljava/lang/String;)Lcom/szabh/smable3/entity/BleCPAnniversary;
    .locals 10
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mTitle"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mContent"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleCPAnniversary;

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    move/from16 v7, p6

    invoke-direct/range {v1 .. v9}, Lcom/szabh/smable3/entity/BleCPAnniversary;-><init>(IJJILjava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public decode()V
    .locals 5

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mUser:I

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt64(Ljava/nio/ByteOrder;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mTime:J

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt64(Ljava/nio/ByteOrder;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mAnniversaryTime:J

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mType:I

    const/4 v2, 0x7

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    const/16 v2, 0x28

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {p0, v2, v3, v4, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mTitle:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    const/16 v0, 0x12c

    invoke-static {p0, v0, v3, v4, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mContent:Ljava/lang/String;

    return-void
.end method

.method public encode()V
    .locals 10

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mUser:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mTime:J

    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v7, "LITTLE_ENDIAN"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1, v2, v6}, Lcom/bestmafen/baseble/data/BleWritable;->writeLong(JLjava/nio/ByteOrder;)V

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mAnniversaryTime:J

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1, v2, v6}, Lcom/bestmafen/baseble/data/BleWritable;->writeLong(JLjava/nio/ByteOrder;)V

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mType:I

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    const/4 v1, 0x7

    new-array v1, v1, [B

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p0, v1, v2, v3, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mTitle:Ljava/lang/String;

    sget-object v8, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    const-string v9, "getBytes(...)"

    invoke-static {v1, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v1

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1, v6}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mTitle:Ljava/lang/String;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/16 v2, 0x28

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithMax$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;ILjava/nio/charset/Charset;ILjava/lang/Object;)V

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mContent:Ljava/lang/String;

    invoke-virtual {v1, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-static {v1, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v1

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1, v6}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mContent:Ljava/lang/String;

    const/16 v2, 0x12c

    invoke-static/range {v0 .. v5}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithMax$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;ILjava/nio/charset/Charset;ILjava/lang/Object;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleCPAnniversary;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleCPAnniversary;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mUser:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPAnniversary;->mUser:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mTime:J

    iget-wide v5, p1, Lcom/szabh/smable3/entity/BleCPAnniversary;->mTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mAnniversaryTime:J

    iget-wide v5, p1, Lcom/szabh/smable3/entity/BleCPAnniversary;->mAnniversaryTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPAnniversary;->mType:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleCPAnniversary;->mTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mContent:Ljava/lang/String;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleCPAnniversary;->mContent:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getMAnniversaryTime()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mAnniversaryTime:J

    return-wide v0
.end method

.method public final getMContent()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mContent:Ljava/lang/String;

    return-object v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x171

    return v0
.end method

.method public final getMTime()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mTime:J

    return-wide v0
.end method

.method public final getMTitle()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getMType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mType:I

    return v0
.end method

.method public final getMUser()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mUser:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mUser:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mAnniversaryTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mTitle:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mContent:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAnniversaryTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mAnniversaryTime:J

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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mContent:Ljava/lang/String;

    return-void
.end method

.method public final setMTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mTime:J

    return-void
.end method

.method public final setMTitle(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mTitle:Ljava/lang/String;

    return-void
.end method

.method public final setMType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mType:I

    return-void
.end method

.method public final setMUser(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mUser:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleCPAnniversary(mUser="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mUser:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mAnniversaryTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mAnniversaryTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTitle=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mTitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', mContent=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPAnniversary;->mContent:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
