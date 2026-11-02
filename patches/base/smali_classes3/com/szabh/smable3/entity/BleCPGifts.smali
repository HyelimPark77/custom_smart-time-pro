.class public final Lcom/szabh/smable3/entity/BleCPGifts;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleCPGifts$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleCPGifts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleCPGifts.kt\ncom/szabh/smable3/entity/BleCPGifts\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,87:1\n13805#2,2:88\n13805#2,2:90\n37#3,2:92\n*S KotlinDebug\n*F\n+ 1 BleCPGifts.kt\ncom/szabh/smable3/entity/BleCPGifts\n*L\n26#1:88,2\n50#1:90,2\n75#1:92,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleCPGifts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleCPGifts.kt\ncom/szabh/smable3/entity/BleCPGifts\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,87:1\n13805#2,2:88\n13805#2,2:90\n37#3,2:92\n*S KotlinDebug\n*F\n+ 1 BleCPGifts.kt\ncom/szabh/smable3/entity/BleCPGifts\n*L\n26#1:88,2\n50#1:90,2\n75#1:92,2\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleCPGifts$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final NAME_MAX_LENGTH:I = 0x12


# instance fields
.field private mGiftsId:I

.field private mGiftsName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mGiftsType:I

.field private mImageBuffers:[[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mTime:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleCPGifts$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleCPGifts$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleCPGifts;->Companion:Lcom/szabh/smable3/entity/BleCPGifts$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x1f

    const/4 v8, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/szabh/smable3/entity/BleCPGifts;-><init>(JIILjava/lang/String;[[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(JIILjava/lang/String;[[B)V
    .locals 1
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # [[B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mGiftsName"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mImageBuffers"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mTime:J

    .line 4
    iput p3, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsType:I

    .line 5
    iput p4, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsId:I

    .line 6
    iput-object p5, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsName:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mImageBuffers:[[B

    return-void
.end method

.method public synthetic constructor <init>(JIILjava/lang/String;[[BILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x2

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    move v3, p2

    goto :goto_0

    :cond_1
    move v3, p3

    :goto_0
    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    move v4, p2

    goto :goto_1

    :cond_2
    move v4, p4

    :goto_1
    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    .line 8
    const-string p5, ""

    :cond_3
    move-object v5, p5

    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    .line 9
    new-array p6, p2, [[B

    :cond_4
    move-object v0, p0

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/szabh/smable3/entity/BleCPGifts;-><init>(JIILjava/lang/String;[[B)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleCPGifts;JIILjava/lang/String;[[BILjava/lang/Object;)Lcom/szabh/smable3/entity/BleCPGifts;
    .locals 7

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-wide p1, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mTime:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    iget p3, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsType:I

    :cond_1
    move v3, p3

    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    iget p4, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsId:I

    :cond_2
    move v4, p4

    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    iget-object p5, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsName:Ljava/lang/String;

    :cond_3
    move-object v5, p5

    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    iget-object p6, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mImageBuffers:[[B

    :cond_4
    move-object v0, p0

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/szabh/smable3/entity/BleCPGifts;->copy(JIILjava/lang/String;[[B)Lcom/szabh/smable3/entity/BleCPGifts;

    move-result-object p0

    return-object p0
.end method

.method private final getImageBufferSize()I
    .locals 5

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mImageBuffers:[[B

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    array-length v4, v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mTime:J

    return-wide v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsType:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsId:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsName:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()[[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mImageBuffers:[[B

    return-object v0
.end method

.method public final copy(JIILjava/lang/String;[[B)Lcom/szabh/smable3/entity/BleCPGifts;
    .locals 8
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # [[B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mGiftsName"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mImageBuffers"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleCPGifts;

    move-wide v2, p1

    move v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/szabh/smable3/entity/BleCPGifts;-><init>(JIILjava/lang/String;[[B)V

    return-object v1
.end method

.method public decode()V
    .locals 6

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt64(Ljava/nio/ByteOrder;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mTime:J

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsType:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsId:I

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    if-lez v0, :cond_0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p0, v0, v3, v2, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsName:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    if-lez v0, :cond_3

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v0, :cond_1

    sget-object v5, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v5}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    move v4, v3

    :goto_1
    if-ge v4, v0, :cond_2

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-virtual {p0, v5}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    new-array v0, v3, [[B

    invoke-interface {v1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[B

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mImageBuffers:[[B

    :cond_3
    return-void
.end method

.method public encode()V
    .locals 11

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mTime:J

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v3, "LITTLE_ENDIAN"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeLong(JLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsType:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsId:I

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    const/16 v0, 0x8

    new-array v0, v0, [B

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsName:Ljava/lang/String;

    sget-object v4, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v4, "getBytes(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v0

    const/16 v4, 0x12

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v7

    invoke-virtual {p0, v7}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    if-lez v7, :cond_0

    iget-object v6, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsName:Ljava/lang/String;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v5, p0

    invoke-static/range {v5 .. v10}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithMax$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;ILjava/nio/charset/Charset;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    move-object v5, p0

    :goto_0
    iget-object v0, v5, Lcom/szabh/smable3/entity/BleCPGifts;->mImageBuffers:[[B

    array-length v0, v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-object v0, v5, Lcom/szabh/smable3/entity/BleCPGifts;->mImageBuffers:[[B

    array-length v4, v0

    const/4 v6, 0x0

    if-nez v4, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    move v4, v6

    :goto_1
    if-nez v4, :cond_3

    array-length v0, v0

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    move v7, v6

    :goto_2
    if-ge v7, v0, :cond_2

    iget-object v8, v5, Lcom/szabh/smable3/entity/BleCPGifts;->mImageBuffers:[[B

    aget-object v8, v8, v7

    array-length v8, v8

    sget-object v9, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v9, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v8, v9}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    sget-object v8, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_2
    iget-object v0, v5, Lcom/szabh/smable3/entity/BleCPGifts;->mImageBuffers:[[B

    array-length v3, v0

    :goto_3
    if-ge v6, v3, :cond_3

    aget-object v4, v0, v6

    invoke-static {p0, v4, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleCPGifts;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleCPGifts;

    iget-wide v3, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mTime:J

    iget-wide v5, p1, Lcom/szabh/smable3/entity/BleCPGifts;->mTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsType:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsId:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsId:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsName:Ljava/lang/String;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mImageBuffers:[[B

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleCPGifts;->mImageBuffers:[[B

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getMGiftsId()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsId:I

    return v0
.end method

.method public final getMGiftsName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsName:Ljava/lang/String;

    return-object v0
.end method

.method public final getMGiftsType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsType:I

    return v0
.end method

.method public final getMImageBuffers()[[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mImageBuffers:[[B

    return-object v0
.end method

.method public getMLengthToWrite()I
    .locals 2

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsName:Ljava/lang/String;

    sget-object v1, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "getBytes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v0

    const/16 v1, 0x12

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x15

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mImageBuffers:[[B

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x4

    add-int/2addr v0, v1

    invoke-direct {p0}, Lcom/szabh/smable3/entity/BleCPGifts;->getImageBufferSize()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final getMTime()J
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mTime:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mTime:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mImageBuffers:[[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMGiftsId(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsId:I

    return-void
.end method

.method public final setMGiftsName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsName:Ljava/lang/String;

    return-void
.end method

.method public final setMGiftsType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsType:I

    return-void
.end method

.method public final setMImageBuffers([[B)V
    .locals 1
    .param p1    # [[B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mImageBuffers:[[B

    return-void
.end method

.method public final setMTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mTime:J

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleCPGifts(mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mGiftsId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mGiftsName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mGiftsName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', mImageBuffers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCPGifts;->mImageBuffers:[[B

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
