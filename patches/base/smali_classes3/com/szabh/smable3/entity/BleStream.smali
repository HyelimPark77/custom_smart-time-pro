.class public final Lcom/szabh/smable3/entity/BleStream;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final mBleKey:Lcom/szabh/smable3/BleKey;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mData:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mType:I


# direct methods
.method public constructor <init>(Lcom/szabh/smable3/BleKey;I[B)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mBleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleStream;->mBleKey:Lcom/szabh/smable3/BleKey;

    iput p2, p0, Lcom/szabh/smable3/entity/BleStream;->mType:I

    iput-object p3, p0, Lcom/szabh/smable3/entity/BleStream;->mData:[B

    return-void
.end method


# virtual methods
.method public final getMBleKey()Lcom/szabh/smable3/BleKey;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleStream;->mBleKey:Lcom/szabh/smable3/BleKey;

    return-object v0
.end method

.method public final getPacket(IJ)Lcom/szabh/smable3/entity/BleStreamPacket;
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleStream;->mData:[B

    array-length v1, v0

    if-lt p1, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    int-to-long v4, p1

    add-long/2addr p2, v4

    array-length v0, v0

    int-to-long v0, v0

    cmp-long v0, p2, v0

    if-lez v0, :cond_1

    new-instance v0, Lcom/szabh/smable3/entity/BleStreamPacket;

    iget v1, p0, Lcom/szabh/smable3/entity/BleStream;->mType:I

    iget-object p2, p0, Lcom/szabh/smable3/entity/BleStream;->mData:[B

    array-length p3, p2

    int-to-long v2, p3

    array-length p3, p2

    invoke-static {p2, p1, p3}, Lkotlin/collections/ArraysKt___ArraysJvmKt;->I0IIOI([BII)[B

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/szabh/smable3/entity/BleStreamPacket;-><init>(IJJ[B)V

    return-object v0

    :cond_1
    new-instance v0, Lcom/szabh/smable3/entity/BleStreamPacket;

    iget v1, p0, Lcom/szabh/smable3/entity/BleStream;->mType:I

    iget-object v2, p0, Lcom/szabh/smable3/entity/BleStream;->mData:[B

    array-length v3, v2

    int-to-long v6, v3

    long-to-int p2, p2

    invoke-static {v2, p1, p2}, Lkotlin/collections/ArraysKt___ArraysJvmKt;->I0IIOI([BII)[B

    move-result-object p1

    move-wide v2, v6

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/szabh/smable3/entity/BleStreamPacket;-><init>(IJJ[B)V

    return-object v0
.end method
