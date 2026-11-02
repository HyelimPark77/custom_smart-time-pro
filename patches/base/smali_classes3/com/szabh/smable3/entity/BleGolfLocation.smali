.class public final Lcom/szabh/smable3/entity/BleGolfLocation;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleGolfLocation$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleGolfLocation$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_HEADER_LENGTH:I = 0xc


# instance fields
.field private mBack:I

.field private mBanker:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/szabh/smable3/entity/BleGolfImageItem;",
            ">;"
        }
    .end annotation
.end field

.field private mCenter:I

.field private mElevation:I

.field private mFront:I

.field private mMapIndex:I

.field private mWater:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/szabh/smable3/entity/BleGolfImageItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleGolfLocation$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleGolfLocation$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleGolfLocation;->Companion:Lcom/szabh/smable3/entity/BleGolfLocation$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mBanker:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mWater:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public encode()V
    .locals 6

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mElevation:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mMapIndex:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mFront:I

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mCenter:I

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mBack:I

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mBanker:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mBanker:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v3, "iterator(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const-string v5, "next(...)"

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lcom/szabh/smable3/entity/BleGolfImageItem;

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleGolfImageItem;->getType()I

    move-result v5

    invoke-virtual {p0, v5}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleGolfImageItem;->getDistance()I

    move-result v4

    invoke-static {p0, v4, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt24$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mWater:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-static {p0, v0, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mWater:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lcom/szabh/smable3/entity/BleGolfImageItem;

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleGolfImageItem;->getType()I

    move-result v4

    invoke-virtual {p0, v4}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleGolfImageItem;->getDistance()I

    move-result v3

    invoke-static {p0, v3, v1, v2, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt24$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final getMBack()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mBack:I

    return v0
.end method

.method public final getMBanker()Ljava/util/ArrayList;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/szabh/smable3/entity/BleGolfImageItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mBanker:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getMCenter()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mCenter:I

    return v0
.end method

.method public final getMElevation()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mElevation:I

    return v0
.end method

.method public final getMFront()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mFront:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 2

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mBanker:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0xc

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mWater:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x4

    add-int/2addr v0, v1

    return v0
.end method

.method public final getMMapIndex()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mMapIndex:I

    return v0
.end method

.method public final getMWater()Ljava/util/ArrayList;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/szabh/smable3/entity/BleGolfImageItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mWater:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final setMBack(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mBack:I

    return-void
.end method

.method public final setMBanker(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/szabh/smable3/entity/BleGolfImageItem;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mBanker:Ljava/util/ArrayList;

    return-void
.end method

.method public final setMCenter(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mCenter:I

    return-void
.end method

.method public final setMElevation(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mElevation:I

    return-void
.end method

.method public final setMFront(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mFront:I

    return-void
.end method

.method public final setMMapIndex(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mMapIndex:I

    return-void
.end method

.method public final setMWater(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/szabh/smable3/entity/BleGolfImageItem;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mWater:Ljava/util/ArrayList;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleGolfLocation(,mMapIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mMapIndex:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mElevation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mElevation:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "mFront="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mFront:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " mCenter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mCenter:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "mBack="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mBack:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " mBanker="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mBanker:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " mWater="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleGolfLocation;->mWater:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
