.class public Lcom/bestmafen/baseble/data/BleByteArray;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private transient mByteOrder:Ljava/nio/ByteOrder;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private transient mBytes:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final transient mPositions:[I
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleByteArray;-><init>([BLjava/nio/ByteOrder;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>([BLjava/nio/ByteOrder;)V
    .locals 1
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Ljava/nio/ByteOrder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mByteOrder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/bestmafen/baseble/data/BleByteArray;->mBytes:[B

    .line 4
    iput-object p2, p0, Lcom/bestmafen/baseble/data/BleByteArray;->mByteOrder:Ljava/nio/ByteOrder;

    const/4 p1, 0x2

    .line 5
    new-array p1, p1, [I

    iput-object p1, p0, Lcom/bestmafen/baseble/data/BleByteArray;->mPositions:[I

    return-void
.end method

.method public synthetic constructor <init>([BLjava/nio/ByteOrder;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 6
    sget-object p2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    const-string p3, "BIG_ENDIAN"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/bestmafen/baseble/data/BleByteArray;-><init>([BLjava/nio/ByteOrder;)V

    return-void
.end method


# virtual methods
.method public final bitsLeft()I
    .locals 2

    iget-object v0, p0, Lcom/bestmafen/baseble/data/BleByteArray;->mBytes:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x8

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->bitsOffset()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public final bitsOffset()I
    .locals 3

    iget-object v0, p0, Lcom/bestmafen/baseble/data/BleByteArray;->mPositions:[I

    const/4 v1, 0x0

    aget v1, v0, v1

    mul-int/lit8 v1, v1, 0x8

    const/4 v2, 0x1

    aget v0, v0, v2

    add-int/2addr v1, v0

    return v1
.end method

.method public final getMByteOrder()Ljava/nio/ByteOrder;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/baseble/data/BleByteArray;->mByteOrder:Ljava/nio/ByteOrder;

    return-object v0
.end method

.method public final getMBytes()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/baseble/data/BleByteArray;->mBytes:[B

    return-object v0
.end method

.method public final getMPositions()[I
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/baseble/data/BleByteArray;->mPositions:[I

    return-object v0
.end method

.method public final outOfRange(I)Z
    .locals 2

    iget-object v0, p0, Lcom/bestmafen/baseble/data/BleByteArray;->mBytes:[B

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->bitsOffset()I

    move-result v0

    add-int/2addr v0, p1

    if-ltz v0, :cond_2

    iget-object p1, p0, Lcom/bestmafen/baseble/data/BleByteArray;->mBytes:[B

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    array-length p1, p1

    mul-int/lit8 p1, p1, 0x8

    if-le v0, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method public final resetOffset()V
    .locals 2

    iget-object v0, p0, Lcom/bestmafen/baseble/data/BleByteArray;->mPositions:[I

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    return-void
.end method

.method public final setMByteOrder(Ljava/nio/ByteOrder;)V
    .locals 1
    .param p1    # Ljava/nio/ByteOrder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/bestmafen/baseble/data/BleByteArray;->mByteOrder:Ljava/nio/ByteOrder;

    return-void
.end method

.method public final setMBytes([B)V
    .locals 0
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/bestmafen/baseble/data/BleByteArray;->mBytes:[B

    return-void
.end method

.method public final skip(I)V
    .locals 3

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->bitsOffset()I

    move-result v0

    add-int/2addr v0, p1

    const/4 p1, 0x0

    if-gez v0, :cond_0

    move v0, p1

    :cond_0
    iget-object v1, p0, Lcom/bestmafen/baseble/data/BleByteArray;->mPositions:[I

    div-int/lit8 v2, v0, 0x8

    aput v2, v1, p1

    const/4 p1, 0x1

    rem-int/lit8 v0, v0, 0x8

    aput v0, v1, p1

    return-void
.end method
