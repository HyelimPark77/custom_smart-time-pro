.class public final Lcom/szabh/smable3/entity/BrandInfoImage;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private hasAlpha:I

.field private mCompression:I

.field private mHeight:I

.field private mImageBuffer:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mPixelFormat:I

.field private mWidth:I


# direct methods
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

    invoke-direct/range {v0 .. v8}, Lcom/szabh/smable3/entity/BrandInfoImage;-><init>(IIIII[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIII[B)V
    .locals 1
    .param p6    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mImageBuffer"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mWidth:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mHeight:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mCompression:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mPixelFormat:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->hasAlpha:I

    .line 8
    iput-object p6, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mImageBuffer:[B

    return-void
.end method

.method public synthetic constructor <init>(IIIII[BILkotlin/jvm/internal/DefaultConstructorMarker;)V
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

    .line 9
    new-array p6, v0, [B

    :cond_5
    move-object p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    .line 10
    invoke-direct/range {p1 .. p7}, Lcom/szabh/smable3/entity/BrandInfoImage;-><init>(IIIII[B)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BrandInfoImage;IIIII[BILjava/lang/Object;)Lcom/szabh/smable3/entity/BrandInfoImage;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mWidth:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mHeight:I

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mCompression:I

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mPixelFormat:I

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->hasAlpha:I

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mImageBuffer:[B

    :cond_5
    move p7, p5

    move-object p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/szabh/smable3/entity/BrandInfoImage;->copy(IIIII[B)Lcom/szabh/smable3/entity/BrandInfoImage;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mWidth:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mHeight:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mCompression:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mPixelFormat:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->hasAlpha:I

    return v0
.end method

.method public final component6()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mImageBuffer:[B

    return-object v0
.end method

.method public final copy(IIIII[B)Lcom/szabh/smable3/entity/BrandInfoImage;
    .locals 8
    .param p6    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mImageBuffer"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BrandInfoImage;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/szabh/smable3/entity/BrandInfoImage;-><init>(IIIII[B)V

    return-object v1
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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BrandInfoImage;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BrandInfoImage;

    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mWidth:I

    iget v3, p1, Lcom/szabh/smable3/entity/BrandInfoImage;->mWidth:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mHeight:I

    iget v3, p1, Lcom/szabh/smable3/entity/BrandInfoImage;->mHeight:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mCompression:I

    iget v3, p1, Lcom/szabh/smable3/entity/BrandInfoImage;->mCompression:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mPixelFormat:I

    iget v3, p1, Lcom/szabh/smable3/entity/BrandInfoImage;->mPixelFormat:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->hasAlpha:I

    iget v3, p1, Lcom/szabh/smable3/entity/BrandInfoImage;->hasAlpha:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mImageBuffer:[B

    iget-object p1, p1, Lcom/szabh/smable3/entity/BrandInfoImage;->mImageBuffer:[B

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getHasAlpha()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->hasAlpha:I

    return v0
.end method

.method public final getMCompression()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mCompression:I

    return v0
.end method

.method public final getMHeight()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mHeight:I

    return v0
.end method

.method public final getMImageBuffer()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mImageBuffer:[B

    return-object v0
.end method

.method public final getMPixelFormat()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mPixelFormat:I

    return v0
.end method

.method public final getMWidth()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mWidth:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mWidth:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mHeight:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mCompression:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mPixelFormat:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->hasAlpha:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mImageBuffer:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setHasAlpha(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->hasAlpha:I

    return-void
.end method

.method public final setMCompression(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mCompression:I

    return-void
.end method

.method public final setMHeight(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mHeight:I

    return-void
.end method

.method public final setMImageBuffer([B)V
    .locals 1
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mImageBuffer:[B

    return-void
.end method

.method public final setMPixelFormat(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mPixelFormat:I

    return-void
.end method

.method public final setMWidth(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mWidth:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BrandInfoImage(mWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mWidth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mHeight:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCompression="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mCompression:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPixelFormat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mPixelFormat:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", hasAlpha="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->hasAlpha:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mImageBuffer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BrandInfoImage;->mImageBuffer:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
