.class public final Lcom/bestmafen/baseble/data/BleReadable$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bestmafen/baseble/data/BleReadable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleReadable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable$Companion\n*L\n1#1,322:1\n277#1,5:323\n*S KotlinDebug\n*F\n+ 1 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable$Companion\n*L\n295#1:323,5\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleReadable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable$Companion\n*L\n1#1,322:1\n277#1,5:323\n*S KotlinDebug\n*F\n+ 1 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable$Companion\n*L\n295#1:323,5\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable$Companion;-><init>()V

    return-void
.end method

.method public static synthetic ofList$default(Lcom/bestmafen/baseble/data/BleReadable$Companion;[BIIIILjava/lang/Object;)Ljava/util/List;
    .locals 4

    and-int/lit8 p0, p5, 0x4

    const/4 p6, 0x0

    if-eqz p0, :cond_0

    move p3, p6

    :cond_0
    and-int/lit8 p0, p5, 0x8

    if-eqz p0, :cond_1

    array-length p4, p1

    :cond_1
    const-string p0, "bytes"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    sub-int/2addr p4, p3

    div-int/2addr p4, p2

    if-lez p4, :cond_2

    move p5, p6

    :goto_0
    if-ge p5, p4, :cond_2

    sget-object v0, Lcom/bestmafen/baseble/data/BleReadable;->Companion:Lcom/bestmafen/baseble/data/BleReadable$Companion;

    mul-int v0, p2, p5

    add-int/2addr v0, p3

    add-int/lit8 p5, p5, 0x1

    mul-int v1, p2, p5

    add-int/2addr v1, p3

    invoke-static {p1, v0, v1}, Lkotlin/collections/ArraysKt___ArraysJvmKt;->I0IIOI([BII)[B

    move-result-object v0

    array-length v1, v0

    const-string v2, "T"

    const/4 v3, 0x4

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->OX(ILjava/lang/String;)V

    const-class v2, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-static {v0, p6, v1}, Lkotlin/collections/ArraysKt___ArraysJvmKt;->I0IIOI([BII)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v3}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    const-string v0, "also(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object p0
.end method

.method public static synthetic ofObject$default(Lcom/bestmafen/baseble/data/BleReadable$Companion;[BIIILjava/lang/Object;)Lcom/bestmafen/baseble/data/BleReadable;
    .locals 0

    and-int/lit8 p0, p4, 0x2

    if-eqz p0, :cond_0

    const/4 p2, 0x0

    :cond_0
    const/4 p0, 0x4

    and-int/2addr p4, p0

    if-eqz p4, :cond_1

    array-length p3, p1

    :cond_1
    const-string p4, "bytes"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "T"

    invoke-static {p0, p4}, Lkotlin/jvm/internal/Intrinsics;->OX(ILjava/lang/String;)V

    const-class p0, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p0

    move-object p4, p0

    check-cast p4, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-static {p1, p2, p3}, Lkotlin/collections/ArraysKt___ArraysJvmKt;->I0IIOI([BII)[B

    move-result-object p1

    invoke-virtual {p4, p1}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {p4}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    const-string p1, "also(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p4
.end method

.method public static synthetic timeFormat$default(Lcom/bestmafen/baseble/data/BleReadable$Companion;Ljava/lang/String;ILjava/lang/Object;)Ljava/text/SimpleDateFormat;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-string p1, "yyyy/MM/dd HH:mm:ss"

    :cond_0
    invoke-virtual {p0, p1}, Lcom/bestmafen/baseble/data/BleReadable$Companion;->timeFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final millisToTime(J)J
    .locals 3

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/TimeZone;->getOffset(J)I

    move-result v0

    int-to-long v0, v0

    add-long/2addr p1, v0

    const/16 v0, 0x3e8

    int-to-long v0, v0

    div-long/2addr p1, v0

    const v0, 0x386d4380

    int-to-long v0, v0

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public final synthetic ofList([BIII)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/bestmafen/baseble/data/BleReadable;",
            ">([BIII)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sub-int/2addr p4, p3

    div-int/2addr p4, p2

    if-lez p4, :cond_0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p4, :cond_0

    sget-object v3, Lcom/bestmafen/baseble/data/BleReadable;->Companion:Lcom/bestmafen/baseble/data/BleReadable$Companion;

    mul-int v3, p2, v2

    add-int/2addr v3, p3

    add-int/lit8 v2, v2, 0x1

    mul-int v4, p2, v2

    add-int/2addr v4, p3

    invoke-static {p1, v3, v4}, Lkotlin/collections/ArraysKt___ArraysJvmKt;->I0IIOI([BII)[B

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x4

    const-string v6, "T"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->OX(ILjava/lang/String;)V

    const-class v5, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {v5}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-static {v3, v1, v4}, Lkotlin/collections/ArraysKt___ArraysJvmKt;->I0IIOI([BII)[B

    move-result-object v3

    invoke-virtual {v6, v3}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v6}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    const-string v3, "also(...)"

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final synthetic ofObject([BII)Lcom/bestmafen/baseble/data/BleReadable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/bestmafen/baseble/data/BleReadable;",
            ">([BII)TT;"
        }
    .end annotation

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    const-string v1, "T"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->OX(ILjava/lang/String;)V

    const-class v0, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-static {p1, p2, p3}, Lkotlin/collections/ArraysKt___ArraysJvmKt;->I0IIOI([BII)[B

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v1}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    const-string p1, "also(...)"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method public final timeFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "pattern"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/text/SimpleDateFormat;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v0, p1, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    return-object v0
.end method

.method public final timeToMillis(I)J
    .locals 6

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/TimeZone;->getOffset(J)I

    move-result v0

    int-to-long v0, v0

    const v2, 0x386d4380

    add-int/2addr p1, v2

    int-to-long v2, p1

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    sub-long/2addr v2, v0

    return-wide v2
.end method
