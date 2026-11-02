.class public Lcom/bestmafen/baseble/data/BleReadable;
.super Lcom/bestmafen/baseble/data/BleByteArray;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bestmafen/baseble/data/BleReadable$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleReadable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,322:1\n222#1,4:329\n1784#2,6:323\n13880#2,3:333\n*S KotlinDebug\n*F\n+ 1 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n234#1:329,4\n190#1:323,6\n244#1:333,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleReadable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,322:1\n222#1,4:329\n1784#2,6:323\n13880#2,3:333\n*S KotlinDebug\n*F\n+ 1 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n234#1:329,4\n190#1:323,6\n244#1:333,3\n*E\n"
    }
.end annotation


# static fields
.field private static final BYTE0:B

.field public static final Companion:Lcom/bestmafen/baseble/data/BleReadable$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/bestmafen/baseble/data/BleReadable$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/bestmafen/baseble/data/BleReadable$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/bestmafen/baseble/data/BleReadable;->Companion:Lcom/bestmafen/baseble/data/BleReadable$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleByteArray;-><init>([BLjava/nio/ByteOrder;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic readDouble$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)D
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMByteOrder()Ljava/nio/ByteOrder;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readDouble(Ljava/nio/ByteOrder;)D

    move-result-wide p0

    return-wide p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: readDouble"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic readFloat$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)F
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMByteOrder()Ljava/nio/ByteOrder;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readFloat(Ljava/nio/ByteOrder;)F

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: readFloat"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMByteOrder()Ljava/nio/ByteOrder;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: readInt16"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic readInt24$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMByteOrder()Ljava/nio/ByteOrder;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt24(Ljava/nio/ByteOrder;)I

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: readInt24"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic readInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMByteOrder()Ljava/nio/ByteOrder;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: readInt32"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic readInt64$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)J
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMByteOrder()Ljava/nio/ByteOrder;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt64(Ljava/nio/ByteOrder;)J

    move-result-wide p0

    return-wide p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: readInt64"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic readString$default(Lcom/bestmafen/baseble/data/BleReadable;ILjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object p2

    const-string p3, "defaultCharset(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/bestmafen/baseble/data/BleReadable;->readString(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: readString"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic readStringUtil$default(Lcom/bestmafen/baseble/data/BleReadable;BLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object p2

    const-string p3, "defaultCharset(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/bestmafen/baseble/data/BleReadable;->readStringUtil(BLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: readStringUtil"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic readUInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)C
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMByteOrder()Ljava/nio/ByteOrder;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: readUInt16"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic readUInt32$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)J
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMByteOrder()Ljava/nio/ByteOrder;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt32(Ljava/nio/ByteOrder;)J

    move-result-wide p0

    return-wide p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: readUInt32"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public decode()V
    .locals 0
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->resetOffset()V

    return-void
.end method

.method public final readBoolean()Z
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    move-result v1

    if-ne v1, v0, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final readBytes(I)[B
    .locals 4
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const/4 v0, 0x0

    if-gez p1, :cond_0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "readBytes error length = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x20

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-array p1, v0, [B

    return-object p1

    :cond_0
    new-array v1, p1, [B

    :goto_0
    if-ge v0, p1, :cond_1

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    aput-byte v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public final readBytesUtil(B)[B
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMBytes()[B

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    array-length v2, v0

    move v3, v1

    move v4, v3

    :goto_0
    if-ge v3, v2, :cond_1

    aget-byte v5, v0, v3

    add-int/lit8 v6, v4, 0x1

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMPositions()[I

    move-result-object v7

    aget v7, v7, v1

    if-lt v4, v7, :cond_0

    if-ne v5, p1, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMPositions()[I

    move-result-object p1

    aget p1, p1, v1

    sub-int/2addr v4, p1

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleByteArray;->skip(I)V

    return-object p1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    move v4, v6

    goto :goto_0

    :cond_1
    new-array p1, v1, [B

    return-object p1
.end method

.method public final readDouble(Ljava/nio/ByteOrder;)D
    .locals 2
    .param p1    # Ljava/nio/ByteOrder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "order"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt64(Ljava/nio/ByteOrder;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0
.end method

.method public final readFloat(Ljava/nio/ByteOrder;)F
    .locals 1
    .param p1    # Ljava/nio/ByteOrder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "order"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    return p1
.end method

.method public final readInt16(Ljava/nio/ByteOrder;)S
    .locals 1
    .param p1    # Ljava/nio/ByteOrder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "order"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result p1

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result p1

    :goto_0
    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 p1, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    or-int/2addr p1, v0

    int-to-short p1, p1

    return p1
.end method

.method public final readInt24(Ljava/nio/ByteOrder;)I
    .locals 1
    .param p1    # Ljava/nio/ByteOrder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "order"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt16(Ljava/nio/ByteOrder;)C

    move-result p1

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    :goto_0
    shl-int/lit8 v0, v0, 0x10

    or-int/2addr p1, v0

    return p1
.end method

.method public final readInt32(Ljava/nio/ByteOrder;)I
    .locals 3
    .param p1    # Ljava/nio/ByteOrder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "order"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v0

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v0

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result p1

    move v2, v0

    move v0, p1

    move p1, v2

    :goto_0
    const v1, 0xffff

    and-int/2addr v0, v1

    shl-int/lit8 v0, v0, 0x10

    and-int/2addr p1, v1

    or-int/2addr p1, v0

    return p1
.end method

.method public final readInt64(Ljava/nio/ByteOrder;)J
    .locals 7
    .param p1    # Ljava/nio/ByteOrder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "order"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v0

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v0

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result p1

    move v6, v0

    move v0, p1

    move p1, v6

    :goto_0
    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    const/16 v4, 0x20

    shl-long/2addr v0, v4

    int-to-long v4, p1

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public final readInt8()B
    .locals 1

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    move-result v0

    return v0
.end method

.method public final readIntN(I)B
    .locals 6
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x1L
            to = 0x8L
        .end annotation
    .end param

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-lt p1, v1, :cond_2

    const/16 v2, 0x8

    if-gt p1, v2, :cond_2

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleByteArray;->outOfRange(I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMPositions()[I

    move-result-object v3

    aget v3, v3, v1

    add-int/2addr v3, p1

    const/4 v4, 0x2

    if-gt v3, v2, :cond_1

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMBytes()[B

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMPositions()[I

    move-result-object v5

    aget v0, v5, v0

    aget-byte v0, v3, v0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMPositions()[I

    move-result-object v3

    aget v3, v3, v1

    sub-int/2addr v2, v3

    sub-int/2addr v2, p1

    shr-int/2addr v0, v2

    shl-int v2, v4, p1

    shr-int/2addr v2, v1

    sub-int/2addr v2, v1

    and-int/2addr v0, v2

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMBytes()[B

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMPositions()[I

    move-result-object v5

    aget v5, v5, v0

    aget-byte v3, v3, v5

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMPositions()[I

    move-result-object v5

    aget v5, v5, v1

    rsub-int/lit8 v5, v5, 0x8

    shl-int/2addr v4, v5

    shr-int/2addr v4, v1

    sub-int/2addr v4, v1

    and-int/2addr v3, v4

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMPositions()[I

    move-result-object v4

    aget v4, v4, v1

    add-int/2addr v4, p1

    sub-int/2addr v4, v2

    shl-int v2, v3, v4

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMBytes()[B

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMPositions()[I

    move-result-object v4

    aget v0, v4, v0

    add-int/2addr v0, v1

    aget-byte v0, v3, v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMPositions()[I

    move-result-object v3

    aget v1, v3, v1

    rsub-int/lit8 v1, v1, 0x10

    sub-int/2addr v1, p1

    shr-int/2addr v0, v1

    or-int/2addr v0, v2

    :goto_0
    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleByteArray;->skip(I)V

    int-to-byte p1, v0

    return p1

    :cond_2
    :goto_1
    return v0
.end method

.method public final synthetic readList(II)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/bestmafen/baseble/data/BleReadable;",
            ">(II)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    const/4 v2, 0x4

    const-string v3, "T"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->OX(ILjava/lang/String;)V

    const-class v2, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {p0, p2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v2}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final synthetic readObject(I)Lcom/bestmafen/baseble/data/BleReadable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/bestmafen/baseble/data/BleReadable;",
            ">(I)TT;"
        }
    .end annotation

    const/4 v0, 0x4

    const-string v1, "T"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->OX(ILjava/lang/String;)V

    const-class v0, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final readString(ILjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 7
    .param p2    # Ljava/nio/charset/Charset;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, ""

    const-string v1, "charset"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v1

    sget-object v2, Lkotlin/text/Charsets;->XIi00iiXO:Ljava/nio/charset/Charset;

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v3, "copyOf(...)"

    const/4 v4, 0x0

    const/4 v5, -0x1

    if-nez v2, :cond_6

    :try_start_1
    sget-object v2, Lkotlin/text/Charsets;->IiI10X:Ljava/nio/charset/Charset;

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_3

    :cond_0
    sget-object v2, Lkotlin/text/Charsets;->iO:Ljava/nio/charset/Charset;

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    sget-object v2, Lkotlin/text/Charsets;->XO0O10:Ljava/nio/charset/Charset;

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    sget-object v2, Lkotlin/text/Charsets;->O00:Ljava/nio/charset/Charset;

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    return-object v0

    :catch_0
    move-exception p1

    goto :goto_6

    :cond_2
    :goto_0
    div-int/lit8 p1, p1, 0x2

    :goto_1
    if-ge v4, p1, :cond_4

    mul-int/lit8 v2, v4, 0x2

    aget-byte v6, v1, v2

    if-nez v6, :cond_3

    add-int/lit8 v6, v2, 0x1

    aget-byte v6, v1, v6

    if-nez v6, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    move v2, v5

    :goto_2
    if-ne v2, v5, :cond_5

    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v1, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/String;

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v1, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object p1

    :cond_6
    :goto_3
    array-length p1, v1

    :goto_4
    if-ge v4, p1, :cond_8

    aget-byte v2, v1, v4

    if-nez v2, :cond_7

    goto :goto_5

    :cond_7
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_8
    move v4, v5

    :goto_5
    if-ne v4, v5, :cond_9

    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v1, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object p1

    :cond_9
    new-instance p1, Ljava/lang/String;

    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v1, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_6
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-object v0
.end method

.method public final readStringUtil(BLjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 1
    .param p2    # Ljava/nio/charset/Charset;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "charset"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readBytesUtil(B)[B

    move-result-object p1

    array-length v0, p1

    if-nez v0, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method

.method public final readUInt16(Ljava/nio/ByteOrder;)C
    .locals 1
    .param p1    # Ljava/nio/ByteOrder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "order"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result p1

    int-to-char p1, p1

    return p1
.end method

.method public final readUInt32(Ljava/nio/ByteOrder;)J
    .locals 4
    .param p1    # Ljava/nio/ByteOrder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "order"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result p1

    int-to-long v0, p1

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method

.method public final readUInt8()C
    .locals 1

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readIntN(I)B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    int-to-char v0, v0

    return v0
.end method
