.class public final Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleEarphoneSoundEffectsSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleEarphoneSoundEffectsSettings.kt\ncom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,60:1\n13826#2,2:61\n*S KotlinDebug\n*F\n+ 1 BleEarphoneSoundEffectsSettings.kt\ncom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings\n*L\n24#1:61,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleEarphoneSoundEffectsSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleEarphoneSoundEffectsSettings.kt\ncom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,60:1\n13826#2,2:61\n*S KotlinDebug\n*F\n+ 1 BleEarphoneSoundEffectsSettings.kt\ncom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings\n*L\n24#1:61,2\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final DEFAULT_EQ_FREQS:[I
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x22

.field public static final MODE_CLASSICAL:I = 0x3

.field public static final MODE_COUNTRY:I = 0x5

.field public static final MODE_JAZZ:I = 0x4

.field public static final MODE_NORMAL:I = 0x0

.field public static final MODE_POP:I = 0x2

.field public static final MODE_ROCK:I = 0x1

.field public static final MODE_USER:I = 0x6


# instance fields
.field private mCount:I

.field private mDynamic:I

.field private mFreqs:[I
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mMode:I

.field private mValue:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->Companion:Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings$Companion;

    const/16 v0, 0xa

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->DEFAULT_EQ_FREQS:[I

    return-void

    :array_0
    .array-data 4
        0x1f
        0x3f
        0x7d
        0xfa
        0x1f4
        0x3e8
        0x7d0
        0xfa0
        0x1f40
        0x3e80
    .end array-data
.end method

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

    invoke-direct/range {v0 .. v7}, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;-><init>(II[B[IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(II[B[II)V
    .locals 1
    .param p3    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mValue"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mFreqs"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mMode:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mDynamic:I

    .line 5
    iput-object p3, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mValue:[B

    .line 6
    iput-object p4, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mFreqs:[I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mCount:I

    return-void
.end method

.method public synthetic constructor <init>(II[B[IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
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

    const/16 v0, 0xa

    if-eqz p7, :cond_2

    .line 8
    new-array p3, v0, [B

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    .line 9
    sget-object p4, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->DEFAULT_EQ_FREQS:[I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move p6, p5

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;-><init>(II[B[II)V

    return-void
.end method

.method public static final synthetic access$getDEFAULT_EQ_FREQS$cp()[I
    .locals 1

    sget-object v0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->DEFAULT_EQ_FREQS:[I

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;II[B[IIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mMode:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mDynamic:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mValue:[B

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mFreqs:[I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mCount:I

    :cond_4
    move-object p6, p4

    move p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->copy(II[B[II)Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mMode:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mDynamic:I

    return v0
.end method

.method public final component3()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mValue:[B

    return-object v0
.end method

.method public final component4()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mFreqs:[I

    return-object v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mCount:I

    return v0
.end method

.method public final copy(II[B[II)Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;
    .locals 7
    .param p3    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mValue"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mFreqs"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;-><init>(II[B[II)V

    return-object v1
.end method

.method public decode()V
    .locals 5

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mMode:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mDynamic:I

    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mValue:[B

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mFreqs:[I

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mFreqs:[I

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v4, "LITTLE_ENDIAN"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mCount:I

    return-void
.end method

.method public encode()V
    .locals 6

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mMode:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mDynamic:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mValue:[B

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mFreqs:[I

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    const-string v3, "LITTLE_ENDIAN"

    if-ge v2, v1, :cond_0

    aget v4, v0, v2

    sget-object v5, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v4, v5}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mCount:I

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mMode:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mMode:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mDynamic:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mDynamic:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mValue:[B

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mValue:[B

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mFreqs:[I

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mFreqs:[I

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mCount:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mCount:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getMCount()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mCount:I

    return v0
.end method

.method public final getMDynamic()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mDynamic:I

    return v0
.end method

.method public final getMFreqs()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mFreqs:[I

    return-object v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x22

    return v0
.end method

.method public final getMMode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mMode:I

    return v0
.end method

.method public final getMValue()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mValue:[B

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mMode:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mDynamic:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mValue:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mFreqs:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMCount(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mCount:I

    return-void
.end method

.method public final setMDynamic(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mDynamic:I

    return-void
.end method

.method public final setMFreqs([I)V
    .locals 1
    .param p1    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mFreqs:[I

    return-void
.end method

.method public final setMMode(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mMode:I

    return-void
.end method

.method public final setMValue([B)V
    .locals 1
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mValue:[B

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleEarphoneSoundEffectsSettings(mMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mMode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDynamic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mDynamic:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mValue:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mFreqs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mFreqs:[I

    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;->mCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
