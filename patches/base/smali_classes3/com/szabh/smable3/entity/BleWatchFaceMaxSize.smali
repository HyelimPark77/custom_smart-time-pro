.class public final Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleWatchFaceMaxSize$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleWatchFaceMaxSize$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x14


# instance fields
.field private mCurrentSize:I

.field private mFreeSize:I

.field private mMaxSize:I

.field private mOneWatchSize:I

.field private mTotalSize:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->Companion:Lcom/szabh/smable3/entity/BleWatchFaceMaxSize$Companion;

    return-void
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

    invoke-direct/range {v0 .. v7}, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;-><init>(IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mCurrentSize:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mMaxSize:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mOneWatchSize:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mFreeSize:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mTotalSize:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
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

    move p6, v0

    :goto_0
    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move p6, p5

    goto :goto_0

    .line 8
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;-><init>(IIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;IIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mCurrentSize:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mMaxSize:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mOneWatchSize:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mFreeSize:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mTotalSize:I

    :cond_4
    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->copy(IIIII)Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mCurrentSize:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mMaxSize:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mOneWatchSize:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mFreeSize:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mTotalSize:I

    return v0
.end method

.method public final copy(IIIII)Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;-><init>(IIIII)V

    return-object v0
.end method

.method public decode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mCurrentSize:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mMaxSize:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mOneWatchSize:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mFreeSize:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt32(Ljava/nio/ByteOrder;)I

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mTotalSize:I

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mCurrentSize:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mCurrentSize:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mMaxSize:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mMaxSize:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mOneWatchSize:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mOneWatchSize:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mFreeSize:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mFreeSize:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mTotalSize:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mTotalSize:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getMCurrentSize()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mCurrentSize:I

    return v0
.end method

.method public final getMFreeSize()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mFreeSize:I

    return v0
.end method

.method public final getMMaxSize()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mMaxSize:I

    return v0
.end method

.method public final getMOneWatchSize()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mOneWatchSize:I

    return v0
.end method

.method public final getMTotalSize()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mTotalSize:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mCurrentSize:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mMaxSize:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mOneWatchSize:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mFreeSize:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mTotalSize:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMCurrentSize(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mCurrentSize:I

    return-void
.end method

.method public final setMFreeSize(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mFreeSize:I

    return-void
.end method

.method public final setMMaxSize(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mMaxSize:I

    return-void
.end method

.method public final setMOneWatchSize(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mOneWatchSize:I

    return-void
.end method

.method public final setMTotalSize(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mTotalSize:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleWatchFaceMaxSize(mCurrentSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mCurrentSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMaxSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mMaxSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mOneWatchSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mOneWatchSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mFreeSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mFreeSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mTotalSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;->mTotalSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
