.class public final Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleStandbyWatchFaceSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleStandbyWatchFaceSet.kt\ncom/szabh/smable3/entity/BleStandbyWatchFaceSet\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,34:1\n222#2,4:35\n*S KotlinDebug\n*F\n+ 1 BleStandbyWatchFaceSet.kt\ncom/szabh/smable3/entity/BleStandbyWatchFaceSet\n*L\n26#1:35,4\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleStandbyWatchFaceSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleStandbyWatchFaceSet.kt\ncom/szabh/smable3/entity/BleStandbyWatchFaceSet\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,34:1\n222#2,4:35\n*S KotlinDebug\n*F\n+ 1 BleStandbyWatchFaceSet.kt\ncom/szabh/smable3/entity/BleStandbyWatchFaceSet\n*L\n26#1:35,4\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x8


# instance fields
.field private mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mEnabled:I

.field private mReserved:I

.field private mStandbyEnable:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->Companion:Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;-><init>(IILcom/szabh/smable3/entity/BleTimeRange;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IILcom/szabh/smable3/entity/BleTimeRange;I)V
    .locals 1
    .param p3    # Lcom/szabh/smable3/entity/BleTimeRange;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mBleTimeRange1"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mStandbyEnable:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mEnabled:I

    .line 5
    iput-object p3, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mReserved:I

    return-void
.end method

.method public synthetic constructor <init>(IILcom/szabh/smable3/entity/BleTimeRange;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    .line 7
    new-instance v0, Lcom/szabh/smable3/entity/BleTimeRange;

    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/szabh/smable3/entity/BleTimeRange;-><init>(IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    const/4 p4, 0x1

    .line 8
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;-><init>(IILcom/szabh/smable3/entity/BleTimeRange;I)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;IILcom/szabh/smable3/entity/BleTimeRange;IILjava/lang/Object;)Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mStandbyEnable:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mEnabled:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mReserved:I

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->copy(IILcom/szabh/smable3/entity/BleTimeRange;I)Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mStandbyEnable:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mEnabled:I

    return v0
.end method

.method public final component3()Lcom/szabh/smable3/entity/BleTimeRange;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mReserved:I

    return v0
.end method

.method public final copy(IILcom/szabh/smable3/entity/BleTimeRange;I)Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;
    .locals 1
    .param p3    # Lcom/szabh/smable3/entity/BleTimeRange;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mBleTimeRange1"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;-><init>(IILcom/szabh/smable3/entity/BleTimeRange;I)V

    return-object v0
.end method

.method public decode()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mStandbyEnable:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mEnabled:I

    const-class v0, Lcom/szabh/smable3/entity/BleTimeRange;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/data/BleReadable;

    const/4 v1, 0x5

    invoke-virtual {p0, v1}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/szabh/smable3/entity/BleTimeRange;

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mReserved:I

    return-void
.end method

.method public encode()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mStandbyEnable:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mEnabled:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mReserved:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;

    iget v1, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mStandbyEnable:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mStandbyEnable:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mEnabled:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mEnabled:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mReserved:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mReserved:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getMBleTimeRange1()Lcom/szabh/smable3/entity/BleTimeRange;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;

    return-object v0
.end method

.method public final getMEnabled()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mEnabled:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public final getMReserved()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mReserved:I

    return v0
.end method

.method public final getMStandbyEnable()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mStandbyEnable:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mStandbyEnable:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mEnabled:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleTimeRange;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mReserved:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMBleTimeRange1(Lcom/szabh/smable3/entity/BleTimeRange;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleTimeRange;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;

    return-void
.end method

.method public final setMEnabled(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mEnabled:I

    return-void
.end method

.method public final setMReserved(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mReserved:I

    return-void
.end method

.method public final setMStandbyEnable(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mStandbyEnable:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleStandbyWatchFaceSet(mStandbyEnable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mStandbyEnable:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mEnabled:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mBleTimeRange1="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mReserved="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;->mReserved:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
