.class public final Lcom/szabh/smable3/entity/BrandInfoBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleBrandInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleBrandInfo.kt\ncom/szabh/smable3/entity/BrandInfoBuilder\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,251:1\n13805#2,2:252\n37#3,2:254\n37#3,2:256\n*S KotlinDebug\n*F\n+ 1 BleBrandInfo.kt\ncom/szabh/smable3/entity/BrandInfoBuilder\n*L\n233#1:252,2\n246#1:254,2\n247#1:256,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleBrandInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleBrandInfo.kt\ncom/szabh/smable3/entity/BrandInfoBuilder\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,251:1\n13805#2,2:252\n37#3,2:254\n37#3,2:256\n*S KotlinDebug\n*F\n+ 1 BleBrandInfo.kt\ncom/szabh/smable3/entity/BrandInfoBuilder\n*L\n233#1:252,2\n246#1:254,2\n247#1:256,2\n*E\n"
    }
.end annotation


# static fields
.field public static final CD_BITMAP_COMPRESSION_JL:I = 0x2

.field public static final CD_BITMAP_COMPRESSION_JL_JPEG:I = 0x3

.field public static final CD_BITMAP_COMPRESSION_NONE:I = 0x0

.field public static final CD_BITMAP_COMPRESSION_RLE_LINE:I = 0x1

.field public static final CD_RGB_565:I = 0x1

.field public static final CD_RGB_565_BE:I = 0x2

.field public static final CD_RGB_888:I = 0x2

.field public static final GRAVITY_X_CENTER:I = 0x4

.field public static final GRAVITY_X_LEFT:I = 0x1

.field public static final GRAVITY_X_RIGHT:I = 0x2

.field public static final GRAVITY_Y_BOTTOM:I = 0x10

.field public static final GRAVITY_Y_CENTER:I = 0x20

.field public static final GRAVITY_Y_TOP:I = 0x8

.field public static final INSTANCE:Lcom/szabh/smable3/entity/BrandInfoBuilder;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/szabh/smable3/entity/BrandInfoBuilder;

    invoke-direct {v0}, Lcom/szabh/smable3/entity/BrandInfoBuilder;-><init>()V

    sput-object v0, Lcom/szabh/smable3/entity/BrandInfoBuilder;->INSTANCE:Lcom/szabh/smable3/entity/BrandInfoBuilder;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final build(Ljava/lang/String;Lcom/szabh/smable3/entity/BrandInfoImageItem;)[B
    .locals 18
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/szabh/smable3/entity/BrandInfoImageItem;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "bleName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "item"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/szabh/smable3/entity/BleBrandInfo;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/szabh/smable3/entity/BleBrandInfo;-><init>(Lcom/szabh/smable3/entity/BleBrandInfoHeader;Lcom/szabh/smable3/entity/BleBrandInfoItem0;Lcom/szabh/smable3/entity/BleBrandInfoItem1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleBrandInfo;->getMHeader()Lcom/szabh/smable3/entity/BleBrandInfoHeader;

    move-result-object v1

    const/4 v4, 0x2

    invoke-virtual {v1, v4}, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->setMItemCount(I)V

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleBrandInfo;->getMHeader()Lcom/szabh/smable3/entity/BleBrandInfoHeader;

    move-result-object v1

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->getMLengthToWrite()I

    move-result v1

    int-to-long v4, v1

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleBrandInfo;->getMHeader()Lcom/szabh/smable3/entity/BleBrandInfoHeader;

    move-result-object v1

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleBrandInfoHeader;->getMItemCount()I

    move-result v1

    mul-int/lit8 v1, v1, 0x4

    int-to-long v6, v1

    add-long/2addr v4, v6

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleBrandInfo;->getMItem0()Lcom/szabh/smable3/entity/BleBrandInfoItem0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/szabh/smable3/entity/BleBrandInfoItem0;->setMBleName(Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleBrandInfo;->getMItem0()Lcom/szabh/smable3/entity/BleBrandInfoItem0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleBrandInfoItem0;->getMLengthToWrite()I

    move-result v0

    int-to-long v0, v0

    add-long/2addr v4, v0

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleBrandInfo;->getMItem1()Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    move-result-object v0

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BrandInfoImageItem;->getMX()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->setMX(I)V

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleBrandInfo;->getMItem1()Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    move-result-object v0

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BrandInfoImageItem;->getMY()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->setMY(I)V

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleBrandInfo;->getMItem1()Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    move-result-object v0

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BrandInfoImageItem;->getMAnchor()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->setMAnchor(I)V

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleBrandInfo;->getMItem1()Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    move-result-object v0

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BrandInfoImageItem;->getMImageInfos()[Lcom/szabh/smable3/entity/BrandInfoImage;

    move-result-object v1

    array-length v1, v1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->setMCount(I)V

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleBrandInfo;->getMItem1()Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    move-result-object v0

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BrandInfoImageItem;->getMPlayInterval()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->setMPlayInterval(I)V

    const/16 v0, 0x20

    int-to-long v0, v0

    add-long/2addr v4, v0

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleBrandInfo;->getMItem1()Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->getMCount()I

    move-result v0

    mul-int/lit8 v0, v0, 0x10

    int-to-long v0, v0

    add-long/2addr v4, v0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BrandInfoImageItem;->getMImageInfos()[Lcom/szabh/smable3/entity/BrandInfoImage;

    move-result-object v2

    array-length v6, v2

    const/4 v7, 0x0

    move-wide v11, v4

    move v4, v7

    :goto_0
    if-ge v4, v6, :cond_0

    aget-object v5, v2, v4

    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BrandInfoImage;->getMImageBuffer()[B

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v8, Lcom/szabh/smable3/entity/BleBrandInfoImage;

    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BrandInfoImage;->getMWidth()I

    move-result v13

    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BrandInfoImage;->getMHeight()I

    move-result v14

    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BrandInfoImage;->getHasAlpha()I

    move-result v15

    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BrandInfoImage;->getMCompression()I

    move-result v16

    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BrandInfoImage;->getMPixelFormat()I

    move-result v17

    const-wide v9, 0xffffffffL

    invoke-direct/range {v8 .. v17}, Lcom/szabh/smable3/entity/BleBrandInfoImage;-><init>(JJIIIII)V

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BrandInfoImage;->getMImageBuffer()[B

    move-result-object v5

    array-length v5, v5

    int-to-long v8, v5

    add-long/2addr v11, v8

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleBrandInfo;->getMItem1()Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    move-result-object v2

    new-array v4, v7, [Lcom/szabh/smable3/entity/BleBrandInfoImage;

    invoke-interface {v1, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/szabh/smable3/entity/BleBrandInfoImage;

    invoke-virtual {v2, v1}, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->setMImageInfos([Lcom/szabh/smable3/entity/BleBrandInfoImage;)V

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleBrandInfo;->getMItem1()Lcom/szabh/smable3/entity/BleBrandInfoItem1;

    move-result-object v1

    new-array v2, v7, [[B

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[B

    invoke-virtual {v1, v0}, Lcom/szabh/smable3/entity/BleBrandInfoItem1;->setMImageBuffers([[B)V

    invoke-virtual {v3}, Lcom/bestmafen/baseble/data/BleWritable;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method
