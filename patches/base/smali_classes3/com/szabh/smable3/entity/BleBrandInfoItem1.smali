.class final Lcom/szabh/smable3/entity/BleBrandInfoItem1;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleBrandInfoItem1$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleBrandInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleBrandInfo.kt\ncom/szabh/smable3/entity/BleBrandInfoItem1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,251:1\n13805#2,2:252\n13805#2,2:254\n13805#2,2:256\n*S KotlinDebug\n*F\n+ 1 BleBrandInfo.kt\ncom/szabh/smable3/entity/BleBrandInfoItem1\n*L\n77#1:252,2\n91#1:254,2\n94#1:256,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleBrandInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleBrandInfo.kt\ncom/szabh/smable3/entity/BleBrandInfoItem1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,251:1\n13805#2,2:252\n13805#2,2:254\n13805#2,2:256\n*S KotlinDebug\n*F\n+ 1 BleBrandInfo.kt\ncom/szabh/smable3/entity/BleBrandInfoItem1\n*L\n77#1:252,2\n91#1:254,2\n94#1:256,2\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleBrandInfoItem1$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_HEADER_LENGTH:I = 0x20


# instance fields
.field private mAnchor:I

.field private mCount:I

.field private mImageBuffers:[[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mImageInfos:[Lcom/szabh/smable3/entity/BleBrandInfoImage;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mPlayInterval:I

.field private mX:I

.field private mY:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleBrandInfoItem1$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleBrandInfoItem1$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->Companion:Lcom/szabh/smable3/entity/BleBrandInfoItem1$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleBrandInfoItem1;-><init>(IIIII[Lcom/szabh/smable3/entity/BleBrandInfoImage;[[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIII[Lcom/szabh/smable3/entity/BleBrandInfoImage;[[B)V
    .locals 1
    .param p6    # [Lcom/szabh/smable3/entity/BleBrandInfoImage;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # [[B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mImageInfos"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mImageBuffers"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mX:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mY:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mAnchor:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mCount:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mPlayInterval:I

    .line 8
    iput-object p6, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mImageInfos:[Lcom/szabh/smable3/entity/BleBrandInfoImage;

    .line 9
    iput-object p7, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mImageBuffers:[[B

    return-void
.end method

.method public synthetic constructor <init>(IIIII[Lcom/szabh/smable3/entity/BleBrandInfoImage;[[BILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    .line 10
    new-array p6, v0, [Lcom/szabh/smable3/entity/BleBrandInfoImage;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    new-array p7, v0, [[B

    :cond_6
    move-object p8, p7

    move-object p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p8}, Lcom/szabh/smable3/entity/BleBrandInfoItem1;-><init>(IIIII[Lcom/szabh/smable3/entity/BleBrandInfoImage;[[B)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleBrandInfoItem1;IIIII[Lcom/szabh/smable3/entity/BleBrandInfoImage;[[BILjava/lang/Object;)Lcom/szabh/smable3/entity/BleBrandInfoItem1;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mX:I

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mY:I

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mAnchor:I

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mCount:I

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mPlayInterval:I

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mImageInfos:[Lcom/szabh/smable3/entity/BleBrandInfoImage;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mImageBuffers:[[B

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->copy(IIIII[Lcom/szabh/smable3/entity/BleBrandInfoImage;[[B)Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    move-result-object p0

    return-object p0
.end method

.method private final getImageBufferSize()I
    .locals 5

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mImageBuffers:[[B

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
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mX:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mY:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mAnchor:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mCount:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mPlayInterval:I

    return v0
.end method

.method public final component6()[Lcom/szabh/smable3/entity/BleBrandInfoImage;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mImageInfos:[Lcom/szabh/smable3/entity/BleBrandInfoImage;

    return-object v0
.end method

.method public final component7()[[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mImageBuffers:[[B

    return-object v0
.end method

.method public final copy(IIIII[Lcom/szabh/smable3/entity/BleBrandInfoImage;[[B)Lcom/szabh/smable3/entity/BleBrandInfoItem1;
    .locals 9
    .param p6    # [Lcom/szabh/smable3/entity/BleBrandInfoImage;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # [[B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mImageInfos"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mImageBuffers"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/szabh/smable3/entity/BleBrandInfoItem1;-><init>(IIIII[Lcom/szabh/smable3/entity/BleBrandInfoImage;[[B)V

    return-object v1
.end method

.method public encode()V
    .locals 7

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mX:I

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v2, "LITTLE_ENDIAN"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mY:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mAnchor:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mCount:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mPlayInterval:I

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    const/16 v0, 0x14

    new-array v0, v0, [B

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mImageInfos:[Lcom/szabh/smable3/entity/BleBrandInfoImage;

    array-length v3, v0

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_0

    aget-object v6, v0, v5

    invoke-virtual {p0, v6}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mImageBuffers:[[B

    array-length v3, v0

    :goto_1
    if-ge v4, v3, :cond_1

    aget-object v5, v0, v4

    invoke-static {p0, v5, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mX:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mX:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mY:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mY:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mAnchor:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mAnchor:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mCount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mCount:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mPlayInterval:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mPlayInterval:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mImageInfos:[Lcom/szabh/smable3/entity/BleBrandInfoImage;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mImageInfos:[Lcom/szabh/smable3/entity/BleBrandInfoImage;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mImageBuffers:[[B

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mImageBuffers:[[B

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getMAnchor()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mAnchor:I

    return v0
.end method

.method public final getMCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mCount:I

    return v0
.end method

.method public final getMImageBuffers()[[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mImageBuffers:[[B

    return-object v0
.end method

.method public final getMImageInfos()[Lcom/szabh/smable3/entity/BleBrandInfoImage;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mImageInfos:[Lcom/szabh/smable3/entity/BleBrandInfoImage;

    return-object v0
.end method

.method public getMLengthToWrite()I
    .locals 2

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mImageInfos:[Lcom/szabh/smable3/entity/BleBrandInfoImage;

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x10

    add-int/lit8 v0, v0, 0x20

    invoke-direct {p0}, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->getImageBufferSize()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final getMPlayInterval()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mPlayInterval:I

    return v0
.end method

.method public final getMX()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mX:I

    return v0
.end method

.method public final getMY()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mY:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mX:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mY:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mAnchor:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mPlayInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mImageInfos:[Lcom/szabh/smable3/entity/BleBrandInfoImage;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mImageBuffers:[[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAnchor(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mAnchor:I

    return-void
.end method

.method public final setMCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mCount:I

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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mImageBuffers:[[B

    return-void
.end method

.method public final setMImageInfos([Lcom/szabh/smable3/entity/BleBrandInfoImage;)V
    .locals 1
    .param p1    # [Lcom/szabh/smable3/entity/BleBrandInfoImage;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mImageInfos:[Lcom/szabh/smable3/entity/BleBrandInfoImage;

    return-void
.end method

.method public final setMPlayInterval(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mPlayInterval:I

    return-void
.end method

.method public final setMX(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mX:I

    return-void
.end method

.method public final setMY(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mY:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleBrandInfoItem1(mX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mX:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mY:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAnchor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mAnchor:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPlayInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mPlayInterval:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mImageInfos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mImageInfos:[Lcom/szabh/smable3/entity/BleBrandInfoImage;

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mImageBuffers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->mImageBuffers:[[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
