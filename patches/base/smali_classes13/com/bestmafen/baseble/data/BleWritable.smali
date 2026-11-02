.class public Lcom/bestmafen/baseble/data/BleWritable;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"

# interfaces
.implements Lcom/bestmafen/baseble/data/BleBuffer;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleWritable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleWritable.kt\ncom/bestmafen/baseble/data/BleWritable\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,263:1\n13812#2,2:264\n1869#3,2:266\n1869#3,2:268\n*S KotlinDebug\n*F\n+ 1 BleWritable.kt\ncom/bestmafen/baseble/data/BleWritable\n*L\n155#1:264,2\n159#1:266,2\n258#1:268,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleWritable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleWritable.kt\ncom/bestmafen/baseble/data/BleWritable\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,263:1\n13812#2,2:264\n1869#3,2:266\n1869#3,2:268\n*S KotlinDebug\n*F\n+ 1 BleWritable.kt\ncom/bestmafen/baseble/data/BleWritable\n*L\n155#1:264,2\n159#1:266,2\n258#1:268,2\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    return-void
.end method

.method public static synthetic writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMByteOrder()Ljava/nio/ByteOrder;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes([BLjava/nio/ByteOrder;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: writeBytes"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic writeDouble$default(Lcom/bestmafen/baseble/data/BleWritable;DLjava/nio/ByteOrder;ILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMByteOrder()Ljava/nio/ByteOrder;

    move-result-object p3

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/bestmafen/baseble/data/BleWritable;->writeDouble(DLjava/nio/ByteOrder;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: writeDouble"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic writeFloat$default(Lcom/bestmafen/baseble/data/BleWritable;FLjava/nio/ByteOrder;ILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMByteOrder()Ljava/nio/ByteOrder;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/bestmafen/baseble/data/BleWritable;->writeFloat(FLjava/nio/ByteOrder;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: writeFloat"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic writeInt16$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMByteOrder()Ljava/nio/ByteOrder;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: writeInt16"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic writeInt24$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMByteOrder()Ljava/nio/ByteOrder;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt24(ILjava/nio/ByteOrder;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: writeInt24"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic writeInt32$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMByteOrder()Ljava/nio/ByteOrder;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: writeInt32"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic writeLong$default(Lcom/bestmafen/baseble/data/BleWritable;JLjava/nio/ByteOrder;ILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMByteOrder()Ljava/nio/ByteOrder;

    move-result-object p3

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/bestmafen/baseble/data/BleWritable;->writeLong(JLjava/nio/ByteOrder;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: writeLong"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic writeString$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object p2

    const-string p3, "defaultCharset(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/bestmafen/baseble/data/BleWritable;->writeString(Ljava/lang/String;Ljava/nio/charset/Charset;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: writeString"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic writeStringWithFix$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;ILjava/nio/charset/Charset;ILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object p3

    const-string p4, "defaultCharset(...)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithFix(Ljava/lang/String;ILjava/nio/charset/Charset;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: writeStringWithFix"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic writeStringWithLimit$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;ILjava/nio/charset/Charset;ZILjava/lang/Object;)V
    .locals 0

    if-nez p6, :cond_2

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object p3

    const-string p6, "defaultCharset(...)"

    invoke-static {p3, p6}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/4 p4, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithLimit(Ljava/lang/String;ILjava/nio/charset/Charset;Z)V

    return-void

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: writeStringWithLimit"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic writeStringWithMax$default(Lcom/bestmafen/baseble/data/BleWritable;Ljava/lang/String;ILjava/nio/charset/Charset;ILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object p3

    const-string p4, "defaultCharset(...)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithMax(Ljava/lang/String;ILjava/nio/charset/Charset;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: writeStringWithMax"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic writeUInt32$default(Lcom/bestmafen/baseble/data/BleWritable;JLjava/nio/ByteOrder;ILjava/lang/Object;)V
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMByteOrder()Ljava/nio/ByteOrder;

    move-result-object p3

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/bestmafen/baseble/data/BleWritable;->writeUInt32(JLjava/nio/ByteOrder;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: writeUInt32"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public encode()V
    .locals 1
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->resetOffset()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleWritable;->getMLengthToWrite()I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    return-void
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toByteArray()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMBytes()[B

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final writeBoolean(Z)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    return-void
.end method

.method public final writeByte(B)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    return-void
.end method

.method public final writeBytes([BLjava/nio/ByteOrder;)V
    .locals 2
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Ljava/nio/ByteOrder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "order"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    goto :goto_2

    :cond_0
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    array-length p2, p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_2

    aget-byte v1, p1, v0

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lkotlin/collections/ArraysKt___ArraysKt;->iiXX([B)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->byteValue()B

    move-result p2

    invoke-virtual {p0, p2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method

.method public final writeDouble(DLjava/nio/ByteOrder;)V
    .locals 1
    .param p3    # Ljava/nio/ByteOrder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "order"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, p3}, Lcom/bestmafen/baseble/data/BleWritable;->writeLong(JLjava/nio/ByteOrder;)V

    return-void
.end method

.method public final writeFloat(FLjava/nio/ByteOrder;)V
    .locals 1
    .param p2    # Ljava/nio/ByteOrder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "order"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    return-void
.end method

.method public final writeInt16(ILjava/nio/ByteOrder;)V
    .locals 2
    .param p2    # Ljava/nio/ByteOrder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "order"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    shr-int/lit8 p2, p1, 0x8

    and-int/lit16 p2, p2, 0xff

    and-int/lit16 p1, p1, 0xff

    goto :goto_0

    :cond_0
    shr-int/lit8 p2, p1, 0x8

    and-int/lit16 p2, p2, 0xff

    and-int/lit16 p1, p1, 0xff

    move v1, p2

    move p2, p1

    move p1, v1

    :goto_0
    invoke-virtual {p0, p2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    return-void
.end method

.method public final writeInt24(ILjava/nio/ByteOrder;)V
    .locals 1
    .param p2    # Ljava/nio/ByteOrder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "order"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    shr-int/lit8 v0, p1, 0x8

    invoke-virtual {p0, v0, p2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    and-int/lit16 p1, p1, 0xff

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    return-void

    :cond_0
    const v0, 0xffff

    and-int/2addr v0, p1

    invoke-virtual {p0, v0, p2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    shr-int/lit8 p1, p1, 0x10

    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    return-void
.end method

.method public final writeInt32(ILjava/nio/ByteOrder;)V
    .locals 2
    .param p2    # Ljava/nio/ByteOrder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "order"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const v1, 0xffff

    if-eqz v0, :cond_0

    shr-int/lit8 v0, p1, 0x10

    invoke-virtual {p0, v0, p2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    and-int/2addr p1, v1

    invoke-virtual {p0, p1, p2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    return-void

    :cond_0
    and-int v0, p1, v1

    invoke-virtual {p0, v0, p2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    shr-int/lit8 p1, p1, 0x10

    invoke-virtual {p0, p1, p2}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    return-void
.end method

.method public final writeInt8(I)V
    .locals 1

    const/16 v0, 0x8

    invoke-virtual {p0, p1, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeIntN(II)V

    return-void
.end method

.method public final writeIntN(II)V
    .locals 9
    .param p2    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x1L
            to = 0x8L
        .end annotation
    .end param

    const/4 v0, 0x1

    if-lt p2, v0, :cond_2

    const/16 v1, 0x8

    if-gt p2, v1, :cond_2

    invoke-virtual {p0, p2}, Lcom/bestmafen/baseble/data/BleByteArray;->outOfRange(I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_1

    :cond_0
    const/4 v2, 0x2

    shl-int v3, v2, p2

    shr-int/2addr v3, v0

    sub-int/2addr v3, v0

    and-int/2addr p1, v3

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMPositions()[I

    move-result-object v3

    aget v3, v3, v0

    add-int/2addr v3, p2

    const/4 v4, 0x0

    if-gt v3, v1, :cond_1

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMPositions()[I

    move-result-object v2

    aget v0, v2, v0

    add-int/2addr v0, p2

    sub-int/2addr v1, v0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMBytes()[B

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMPositions()[I

    move-result-object v2

    aget v2, v2, v4

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMBytes()[B

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMPositions()[I

    move-result-object v5

    aget v4, v5, v4

    aget-byte v3, v3, v4

    shl-int/2addr p1, v1

    int-to-byte p1, p1

    or-int/2addr p1, v3

    int-to-byte p1, p1

    aput-byte p1, v0, v2

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMPositions()[I

    move-result-object v3

    aget v3, v3, v0

    add-int/2addr v3, p2

    sub-int/2addr v3, v1

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMBytes()[B

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMPositions()[I

    move-result-object v6

    aget v6, v6, v4

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMBytes()[B

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMPositions()[I

    move-result-object v8

    aget v8, v8, v4

    aget-byte v7, v7, v8

    shr-int v8, p1, v3

    int-to-byte v8, v8

    or-int/2addr v7, v8

    int-to-byte v7, v7

    aput-byte v7, v5, v6

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMBytes()[B

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMPositions()[I

    move-result-object v6

    aget v6, v6, v4

    add-int/2addr v6, v0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMBytes()[B

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMPositions()[I

    move-result-object v8

    aget v4, v8, v4

    add-int/2addr v4, v0

    aget-byte v4, v7, v4

    shl-int/2addr v2, v3

    shr-int/2addr v2, v0

    sub-int/2addr v2, v0

    and-int/2addr p1, v2

    sub-int/2addr v1, v3

    shl-int/2addr p1, v1

    int-to-byte p1, p1

    or-int/2addr p1, v4

    int-to-byte p1, p1

    aput-byte p1, v5, v6

    :goto_0
    invoke-virtual {p0, p2}, Lcom/bestmafen/baseble/data/BleByteArray;->skip(I)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final writeList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/bestmafen/baseble/data/BleBuffer;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/data/BleBuffer;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final writeLong(JLjava/nio/ByteOrder;)V
    .locals 2
    .param p3    # Ljava/nio/ByteOrder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "order"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/16 v1, 0x20

    if-eqz v0, :cond_0

    shr-long v0, p1, v1

    long-to-int v0, v0

    invoke-virtual {p0, v0, p3}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    long-to-int p1, p1

    invoke-virtual {p0, p1, p3}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    return-void

    :cond_0
    long-to-int v0, p1

    invoke-virtual {p0, v0, p3}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    shr-long/2addr p1, v1

    long-to-int p1, p1

    invoke-virtual {p0, p1, p3}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    return-void
.end method

.method public final writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V
    .locals 2
    .param p1    # Lcom/bestmafen/baseble/data/BleBuffer;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Lcom/bestmafen/baseble/data/BleBuffer;->toByteArray()[B

    move-result-object p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    return-void
.end method

.method public final writeString(Ljava/lang/String;Ljava/nio/charset/Charset;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Ljava/nio/charset/Charset;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "charSet"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string p2, "getBytes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x2

    const/4 v0, 0x0

    invoke-static {p0, p1, v0, p2, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final writeStringWithFix(Ljava/lang/String;ILjava/nio/charset/Charset;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p3    # Ljava/nio/charset/Charset;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "charSet"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1, p3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string p3, "getBytes(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p3, p1

    invoke-static {p3, p2}, Ljava/lang/Math;->min(II)I

    move-result p3

    const/4 v0, 0x0

    invoke-static {v0, p3}, Lkotlin/ranges/iO;->Oi1(II)Lkotlin/ranges/IntRange;

    move-result-object p3

    invoke-static {p1, p3}, Lkotlin/collections/ArraysKt___ArraysKt;->O11IIOOX([BLkotlin/ranges/IntRange;)[B

    move-result-object p3

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, p3, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    array-length p3, p1

    if-ge p3, p2, :cond_2

    array-length p1, p1

    sub-int/2addr p2, p1

    new-array p1, p2, [B

    move p3, v0

    :goto_0
    if-ge p3, p2, :cond_1

    aput-byte v0, p1, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {p0, p1, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    :cond_2
    return-void

    :cond_3
    :goto_1
    mul-int/lit8 p2, p2, 0x8

    invoke-virtual {p0, p2}, Lcom/bestmafen/baseble/data/BleByteArray;->skip(I)V

    return-void
.end method

.method public final writeStringWithLimit(Ljava/lang/String;ILjava/nio/charset/Charset;Z)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p3    # Ljava/nio/charset/Charset;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "charSet"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_4

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, p3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "getBytes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v2, v0

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-gt v2, p2, :cond_1

    invoke-static {p0, v0, v4, v3, v4}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    return-void

    :cond_1
    const/4 v2, 0x0

    if-eqz p4, :cond_3

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p4

    add-int/lit8 p4, p4, -0x1

    :goto_0
    const/4 v0, -0x1

    if-ge v0, p4, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v2, p4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    const-string v6, "substring(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x2026

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v5, v0

    if-gt v5, p2, :cond_2

    invoke-static {p0, v0, v4, v3, v4}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    return-void

    :cond_2
    add-int/lit8 p4, p4, -0x1

    goto :goto_0

    :cond_3
    array-length p1, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v2, p1}, Lkotlin/ranges/iO;->Oi1(II)Lkotlin/ranges/IntRange;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/collections/ArraysKt___ArraysKt;->O11IIOOX([BLkotlin/ranges/IntRange;)[B

    move-result-object p1

    invoke-static {p0, p1, v4, v3, v4}, Lcom/bestmafen/baseble/data/BleWritable;->writeBytes$default(Lcom/bestmafen/baseble/data/BleWritable;[BLjava/nio/ByteOrder;ILjava/lang/Object;)V

    :cond_4
    return-void
.end method

.method public final writeStringWithMax(Ljava/lang/String;ILjava/nio/charset/Charset;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/nio/charset/Charset;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "charSet"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v0, p2, -0x1

    invoke-static {p1, v0, p3}, Lcom/android/mltcode/paycertificationapi/OOXX1OOO1;->XIi00iiXO(Ljava/lang/String;ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3}, Lcom/bestmafen/baseble/data/BleWritable;->writeStringWithFix(Ljava/lang/String;ILjava/nio/charset/Charset;)V

    return-void
.end method

.method public final writeUInt32(JLjava/nio/ByteOrder;)V
    .locals 1
    .param p3    # Ljava/nio/ByteOrder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "order"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    long-to-int p1, p1

    invoke-virtual {p0, p1, p3}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt32(ILjava/nio/ByteOrder;)V

    return-void
.end method
