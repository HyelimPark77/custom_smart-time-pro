.class public final Lcom/szabh/smable3/entity/BleFoodBalance;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleFoodBalance$Companion;
    }
.end annotation


# static fields
.field public static final AMOUNT_A_LITTLE:I = 0x1

.field public static final AMOUNT_A_LOT:I = 0x3

.field public static final AMOUNT_NONE:I = 0x0

.field public static final AMOUNT_NORMAL:I = 0x2

.field public static final CATEGORY_BREAKFAST:I = 0x0

.field public static final CATEGORY_DINNER:I = 0x2

.field public static final CATEGORY_LUNCH:I = 0x1

.field public static final CATEGORY_SNACK:I = 0x3

.field public static final Companion:Lcom/szabh/smable3/entity/BleFoodBalance$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0xc


# instance fields
.field private mFishAmount:I

.field private mLiquorAmount:I

.field private mMealCategoryFlag:I

.field private mMeatAmount:I

.field private mRiceAmount:I

.field private mTime:I

.field private mVegetableAmount:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleFoodBalance$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleFoodBalance$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleFoodBalance;->Companion:Lcom/szabh/smable3/entity/BleFoodBalance$Companion;

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

    invoke-direct/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleFoodBalance;-><init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mTime:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mMealCategoryFlag:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mRiceAmount:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mFishAmount:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mMeatAmount:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mVegetableAmount:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mLiquorAmount:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
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

    move p6, v0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    move p8, v0

    :goto_0
    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_6
    move p8, p7

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/szabh/smable3/entity/BleFoodBalance;-><init>(IIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleFoodBalance;IIIIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleFoodBalance;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mTime:I

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mMealCategoryFlag:I

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mRiceAmount:I

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mFishAmount:I

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mMeatAmount:I

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mVegetableAmount:I

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget p7, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mLiquorAmount:I

    :cond_6
    move p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/szabh/smable3/entity/BleFoodBalance;->copy(IIIIIII)Lcom/szabh/smable3/entity/BleFoodBalance;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mTime:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mMealCategoryFlag:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mRiceAmount:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mFishAmount:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mMeatAmount:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mVegetableAmount:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mLiquorAmount:I

    return v0
.end method

.method public final copy(IIIIIII)Lcom/szabh/smable3/entity/BleFoodBalance;
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleFoodBalance;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/szabh/smable3/entity/BleFoodBalance;-><init>(IIIIIII)V

    return-object v0
.end method

.method public decode()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mTime:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mMealCategoryFlag:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mRiceAmount:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mFishAmount:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mMeatAmount:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mVegetableAmount:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mLiquorAmount:I

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleFoodBalance;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleFoodBalance;

    iget v1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleFoodBalance;->mTime:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mMealCategoryFlag:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleFoodBalance;->mMealCategoryFlag:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mRiceAmount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleFoodBalance;->mRiceAmount:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mFishAmount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleFoodBalance;->mFishAmount:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mMeatAmount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleFoodBalance;->mMeatAmount:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mVegetableAmount:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleFoodBalance;->mVegetableAmount:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mLiquorAmount:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleFoodBalance;->mLiquorAmount:I

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getMFishAmount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mFishAmount:I

    return v0
.end method

.method public final getMLiquorAmount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mLiquorAmount:I

    return v0
.end method

.method public final getMMealCategoryFlag()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mMealCategoryFlag:I

    return v0
.end method

.method public final getMMeatAmount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mMeatAmount:I

    return v0
.end method

.method public final getMRiceAmount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mRiceAmount:I

    return v0
.end method

.method public final getMTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mTime:I

    return v0
.end method

.method public final getMVegetableAmount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mVegetableAmount:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mTime:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mMealCategoryFlag:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mRiceAmount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mFishAmount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mMeatAmount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mVegetableAmount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mLiquorAmount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMFishAmount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mFishAmount:I

    return-void
.end method

.method public final setMLiquorAmount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mLiquorAmount:I

    return-void
.end method

.method public final setMMealCategoryFlag(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mMealCategoryFlag:I

    return-void
.end method

.method public final setMMeatAmount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mMeatAmount:I

    return-void
.end method

.method public final setMRiceAmount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mRiceAmount:I

    return-void
.end method

.method public final setMTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mTime:I

    return-void
.end method

.method public final setMVegetableAmount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mVegetableAmount:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleFoodBalance(mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMealCategoryFlag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mMealCategoryFlag:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRiceAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mRiceAmount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mFishAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mFishAmount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMeatAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mMeatAmount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mVegetableAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mVegetableAmount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLiquorAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleFoodBalance;->mLiquorAmount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
