.class public final Lcom/szabh/smable3/entity/BrandInfoImageItem;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mAnchor:I

.field private mImageInfos:[Lcom/szabh/smable3/entity/BrandInfoImage;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mPlayInterval:I

.field private mX:I

.field private mY:I


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/szabh/smable3/entity/BrandInfoImageItem;-><init>(IIII[Lcom/szabh/smable3/entity/BrandInfoImage;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIII[Lcom/szabh/smable3/entity/BrandInfoImage;)V
    .locals 1
    .param p5    # [Lcom/szabh/smable3/entity/BrandInfoImage;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mImageInfos"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mX:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mY:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mAnchor:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mPlayInterval:I

    .line 7
    iput-object p5, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mImageInfos:[Lcom/szabh/smable3/entity/BrandInfoImage;

    return-void
.end method

.method public synthetic constructor <init>(IIII[Lcom/szabh/smable3/entity/BrandInfoImage;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    .line 8
    new-array p5, v0, [Lcom/szabh/smable3/entity/BrandInfoImage;

    :cond_4
    move-object p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p6}, Lcom/szabh/smable3/entity/BrandInfoImageItem;-><init>(IIII[Lcom/szabh/smable3/entity/BrandInfoImage;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BrandInfoImageItem;IIII[Lcom/szabh/smable3/entity/BrandInfoImage;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BrandInfoImageItem;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mX:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mY:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mAnchor:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mPlayInterval:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mImageInfos:[Lcom/szabh/smable3/entity/BrandInfoImage;

    :cond_4
    move p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/szabh/smable3/entity/BrandInfoImageItem;->copy(IIII[Lcom/szabh/smable3/entity/BrandInfoImage;)Lcom/szabh/smable3/entity/BrandInfoImageItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mX:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mY:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mAnchor:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mPlayInterval:I

    return v0
.end method

.method public final component5()[Lcom/szabh/smable3/entity/BrandInfoImage;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mImageInfos:[Lcom/szabh/smable3/entity/BrandInfoImage;

    return-object v0
.end method

.method public final copy(IIII[Lcom/szabh/smable3/entity/BrandInfoImage;)Lcom/szabh/smable3/entity/BrandInfoImageItem;
    .locals 7
    .param p5    # [Lcom/szabh/smable3/entity/BrandInfoImage;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mImageInfos"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BrandInfoImageItem;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/szabh/smable3/entity/BrandInfoImageItem;-><init>(IIII[Lcom/szabh/smable3/entity/BrandInfoImage;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BrandInfoImageItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BrandInfoImageItem;

    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mX:I

    iget v3, p1, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mX:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mY:I

    iget v3, p1, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mY:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mAnchor:I

    iget v3, p1, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mAnchor:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mPlayInterval:I

    iget v3, p1, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mPlayInterval:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mImageInfos:[Lcom/szabh/smable3/entity/BrandInfoImage;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mImageInfos:[Lcom/szabh/smable3/entity/BrandInfoImage;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getMAnchor()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mAnchor:I

    return v0
.end method

.method public final getMImageInfos()[Lcom/szabh/smable3/entity/BrandInfoImage;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mImageInfos:[Lcom/szabh/smable3/entity/BrandInfoImage;

    return-object v0
.end method

.method public final getMPlayInterval()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mPlayInterval:I

    return v0
.end method

.method public final getMX()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mX:I

    return v0
.end method

.method public final getMY()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mY:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mX:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mY:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mAnchor:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mPlayInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mImageInfos:[Lcom/szabh/smable3/entity/BrandInfoImage;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAnchor(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mAnchor:I

    return-void
.end method

.method public final setMImageInfos([Lcom/szabh/smable3/entity/BrandInfoImage;)V
    .locals 1
    .param p1    # [Lcom/szabh/smable3/entity/BrandInfoImage;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mImageInfos:[Lcom/szabh/smable3/entity/BrandInfoImage;

    return-void
.end method

.method public final setMPlayInterval(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mPlayInterval:I

    return-void
.end method

.method public final setMX(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mX:I

    return-void
.end method

.method public final setMY(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mY:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BrandInfoImageItem(mX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mX:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mY:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAnchor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mAnchor:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mPlayInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mPlayInterval:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mImageInfos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BrandInfoImageItem;->mImageInfos:[Lcom/szabh/smable3/entity/BrandInfoImage;

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
