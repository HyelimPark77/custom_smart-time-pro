.class public final Lcom/szabh/smable3/entity/BleStock;
.super Lcom/szabh/smable3/entity/BleIdObject;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleStock$Companion;
    }
.end annotation


# static fields
.field public static final COLOR_TYPE_0:I = 0x0

.field public static final COLOR_TYPE_1:I = 0x1

.field public static final Companion:Lcom/szabh/smable3/entity/BleStock$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x54

.field private static final NAME_LENGTH:I = 0x3e


# instance fields
.field private mColorType:I

.field private mMarketCapitalization:F

.field private mNetChangePercent:F

.field private mNetChangePoint:F

.field private mSharePrice:F

.field private mStockCode:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleStock$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleStock$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleStock;->Companion:Lcom/szabh/smable3/entity/BleStock$Companion;

    return-void
.end method

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

    invoke-direct/range {v0 .. v8}, Lcom/szabh/smable3/entity/BleStock;-><init>(ILjava/lang/String;FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;FFFF)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mStockCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/szabh/smable3/entity/BleIdObject;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleStock;->mColorType:I

    .line 4
    iput-object p2, p0, Lcom/szabh/smable3/entity/BleStock;->mStockCode:Ljava/lang/String;

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleStock;->mSharePrice:F

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePoint:F

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePercent:F

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleStock;->mMarketCapitalization:F

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    .line 9
    const-string p2, ""

    :cond_1
    and-int/lit8 p8, p7, 0x4

    const/4 v0, 0x0

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

    move p8, v0

    move p6, p4

    move p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    goto :goto_0

    :cond_5
    move p8, p6

    move p7, p5

    move p5, p3

    move p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    .line 10
    :goto_0
    invoke-direct/range {p2 .. p8}, Lcom/szabh/smable3/entity/BleStock;-><init>(ILjava/lang/String;FFFF)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleStock;ILjava/lang/String;FFFFILjava/lang/Object;)Lcom/szabh/smable3/entity/BleStock;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleStock;->mColorType:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/szabh/smable3/entity/BleStock;->mStockCode:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleStock;->mSharePrice:F

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePoint:F

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePercent:F

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleStock;->mMarketCapitalization:F

    :cond_5
    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/szabh/smable3/entity/BleStock;->copy(ILjava/lang/String;FFFF)Lcom/szabh/smable3/entity/BleStock;

    move-result-object p0

    return-object p0
.end method

.method private final getNumberOfDecimalPlaces(F)I
    .locals 6

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/16 v1, 0x2e

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt__StringsKt;->IiO1X1OI(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    sub-int/2addr p1, v0

    return p1
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleStock;->mColorType:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleStock;->mStockCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleStock;->mSharePrice:F

    return v0
.end method

.method public final component4()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePoint:F

    return v0
.end method

.method public final component5()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePercent:F

    return v0
.end method

.method public final component6()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleStock;->mMarketCapitalization:F

    return v0
.end method

.method public final copy(ILjava/lang/String;FFFF)Lcom/szabh/smable3/entity/BleStock;
    .locals 8
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mStockCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleStock;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/szabh/smable3/entity/BleStock;-><init>(ILjava/lang/String;FFFF)V

    return-object v1
.end method

.method public decode()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    invoke-virtual {p0, v0}, Lcom/szabh/smable3/entity/BleIdObject;->setMId(I)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleStock;->mColorType:I

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    const/16 v2, 0x3e

    sget-object v3, Lkotlin/text/Charsets;->O00:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v2, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readString(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/szabh/smable3/entity/BleStock;->mStockCode:Ljava/lang/String;

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleStock;->mSharePrice:F

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePoint:F

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePercent:F

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleStock;->mMarketCapitalization:F

    return-void
.end method

.method public encode()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    invoke-virtual {p0}, Lcom/szabh/smable3/entity/BleIdObject;->getMId()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleStock;->mColorType:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePoint:F

    invoke-direct {p0, v0}, Lcom/szabh/smable3/entity/BleStock;->getNumberOfDecimalPlaces(F)I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleStock;->mSharePrice:F

    invoke-direct {p0, v0}, Lcom/szabh/smable3/entity/BleStock;->getNumberOfDecimalPlaces(F)I

    move-result v0

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    iget v2, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePercent:F

    invoke-direct {p0, v2}, Lcom/szabh/smable3/entity/BleStock;->getNumberOfDecimalPlaces(F)I

    move-result v2

    invoke-virtual {p0, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleStock;->mStockCode:Ljava/lang/String;

    const/16 v2, 0x3e

    sget-object v3, Lkotlin/text/Charsets;->O00:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1, v2, v3}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithFix(Ljava/lang/String;ILjava/nio/charset/Charset;)V

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleStock;->mSharePrice:F

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v2, "LITTLE_ENDIAN"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePoint:F

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePercent:F

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleStock;->mMarketCapitalization:F

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleStock;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleStock;

    iget v1, p0, Lcom/szabh/smable3/entity/BleStock;->mColorType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleStock;->mColorType:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleStock;->mStockCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleStock;->mStockCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleStock;->mSharePrice:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleStock;->mSharePrice:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePoint:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleStock;->mNetChangePoint:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePercent:F

    iget v3, p1, Lcom/szabh/smable3/entity/BleStock;->mNetChangePercent:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleStock;->mMarketCapitalization:F

    iget p1, p1, Lcom/szabh/smable3/entity/BleStock;->mMarketCapitalization:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getMColorType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleStock;->mColorType:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x54

    return v0
.end method

.method public final getMMarketCapitalization()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleStock;->mMarketCapitalization:F

    return v0
.end method

.method public final getMNetChangePercent()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePercent:F

    return v0
.end method

.method public final getMNetChangePoint()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePoint:F

    return v0
.end method

.method public final getMSharePrice()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleStock;->mSharePrice:F

    return v0
.end method

.method public final getMStockCode()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleStock;->mStockCode:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleStock;->mColorType:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleStock;->mStockCode:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleStock;->mSharePrice:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePoint:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePercent:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleStock;->mMarketCapitalization:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMColorType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleStock;->mColorType:I

    return-void
.end method

.method public final setMMarketCapitalization(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleStock;->mMarketCapitalization:F

    return-void
.end method

.method public final setMNetChangePercent(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePercent:F

    return-void
.end method

.method public final setMNetChangePoint(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePoint:F

    return-void
.end method

.method public final setMSharePrice(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleStock;->mSharePrice:F

    return-void
.end method

.method public final setMStockCode(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleStock;->mStockCode:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleStock(mId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/szabh/smable3/entity/BleIdObject;->getMId()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleStock;->mSharePrice:F

    invoke-direct {p0, v1}, Lcom/szabh/smable3/entity/BleStock;->getNumberOfDecimalPlaces(F)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePoint:F

    invoke-direct {p0, v2}, Lcom/szabh/smable3/entity/BleStock;->getNumberOfDecimalPlaces(F)I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePercent:F

    invoke-direct {p0, v1}, Lcom/szabh/smable3/entity/BleStock;->getNumberOfDecimalPlaces(F)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "], colorType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleStock;->mColorType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStockCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleStock;->mStockCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mSharePrice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleStock;->mSharePrice:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mNetChangePoint="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePoint:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mNetChangePercent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleStock;->mNetChangePercent:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", mMarketCapitalization="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleStock;->mMarketCapitalization:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
