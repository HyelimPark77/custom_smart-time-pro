.class public final Lcom/szabh/smable3/entity/BleHanBaoSettings;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleHanBaoSettings$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleHanBaoSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleHanBaoSettings.kt\ncom/szabh/smable3/entity/BleHanBaoSettings\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,45:1\n222#2,4:46\n222#2,4:50\n*S KotlinDebug\n*F\n+ 1 BleHanBaoSettings.kt\ncom/szabh/smable3/entity/BleHanBaoSettings\n*L\n32#1:46,4\n33#1:50,4\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleHanBaoSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleHanBaoSettings.kt\ncom/szabh/smable3/entity/BleHanBaoSettings\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable\n*L\n1#1,45:1\n222#2,4:46\n222#2,4:50\n*S KotlinDebug\n*F\n+ 1 BleHanBaoSettings.kt\ncom/szabh/smable3/entity/BleHanBaoSettings\n*L\n32#1:46,4\n33#1:50,4\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleHanBaoSettings$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x10


# instance fields
.field private mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBleTimeRange2:Lcom/szabh/smable3/entity/BleTimeRange;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mInterval:I

.field private mSpo2Threshold:I

.field private mVibration:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleHanBaoSettings$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleHanBaoSettings$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->Companion:Lcom/szabh/smable3/entity/BleHanBaoSettings$Companion;

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

    invoke-direct/range {v0 .. v7}, Lcom/szabh/smable3/entity/BleHanBaoSettings;-><init>(IIILcom/szabh/smable3/entity/BleTimeRange;Lcom/szabh/smable3/entity/BleTimeRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIILcom/szabh/smable3/entity/BleTimeRange;Lcom/szabh/smable3/entity/BleTimeRange;)V
    .locals 1
    .param p4    # Lcom/szabh/smable3/entity/BleTimeRange;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Lcom/szabh/smable3/entity/BleTimeRange;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mBleTimeRange1"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mBleTimeRange2"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mVibration:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mInterval:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mSpo2Threshold:I

    .line 6
    iput-object p4, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;

    .line 7
    iput-object p5, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mBleTimeRange2:Lcom/szabh/smable3/entity/BleTimeRange;

    return-void
.end method

.method public synthetic constructor <init>(IIILcom/szabh/smable3/entity/BleTimeRange;Lcom/szabh/smable3/entity/BleTimeRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

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

    const/16 p3, 0x5d

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    .line 8
    new-instance v0, Lcom/szabh/smable3/entity/BleTimeRange;

    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/szabh/smable3/entity/BleTimeRange;-><init>(IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    .line 9
    new-instance v0, Lcom/szabh/smable3/entity/BleTimeRange;

    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/szabh/smable3/entity/BleTimeRange;-><init>(IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move-object p6, p5

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/szabh/smable3/entity/BleHanBaoSettings;-><init>(IIILcom/szabh/smable3/entity/BleTimeRange;Lcom/szabh/smable3/entity/BleTimeRange;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleHanBaoSettings;IIILcom/szabh/smable3/entity/BleTimeRange;Lcom/szabh/smable3/entity/BleTimeRange;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleHanBaoSettings;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mVibration:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mInterval:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mSpo2Threshold:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mBleTimeRange2:Lcom/szabh/smable3/entity/BleTimeRange;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/szabh/smable3/entity/BleHanBaoSettings;->copy(IIILcom/szabh/smable3/entity/BleTimeRange;Lcom/szabh/smable3/entity/BleTimeRange;)Lcom/szabh/smable3/entity/BleHanBaoSettings;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mVibration:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mInterval:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mSpo2Threshold:I

    return v0
.end method

.method public final component4()Lcom/szabh/smable3/entity/BleTimeRange;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;

    return-object v0
.end method

.method public final component5()Lcom/szabh/smable3/entity/BleTimeRange;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mBleTimeRange2:Lcom/szabh/smable3/entity/BleTimeRange;

    return-object v0
.end method

.method public final copy(IIILcom/szabh/smable3/entity/BleTimeRange;Lcom/szabh/smable3/entity/BleTimeRange;)Lcom/szabh/smable3/entity/BleHanBaoSettings;
    .locals 7
    .param p4    # Lcom/szabh/smable3/entity/BleTimeRange;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Lcom/szabh/smable3/entity/BleTimeRange;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mBleTimeRange1"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mBleTimeRange2"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleHanBaoSettings;

    move v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/szabh/smable3/entity/BleHanBaoSettings;-><init>(IIILcom/szabh/smable3/entity/BleTimeRange;Lcom/szabh/smable3/entity/BleTimeRange;)V

    return-object v1
.end method

.method public decode()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mVibration:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mInterval:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mSpo2Threshold:I

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt24$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)I

    const-class v0, Lcom/szabh/smable3/entity/BleTimeRange;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bestmafen/baseble/data/BleReadable;

    const/4 v2, 0x5

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v1}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v1, Lcom/szabh/smable3/entity/BleTimeRange;

    iput-object v1, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/baseble/data/BleReadable;

    invoke-virtual {p0, v2}, Lcom/bestmafen/baseble/data/BleReadable;->readBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/szabh/smable3/entity/BleTimeRange;

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mBleTimeRange2:Lcom/szabh/smable3/entity/BleTimeRange;

    return-void
.end method

.method public encode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mVibration:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mInterval:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mSpo2Threshold:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt24$default(Lcom/bestmafen/baseble/data/BleWritable;ILjava/nio/ByteOrder;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mBleTimeRange2:Lcom/szabh/smable3/entity/BleTimeRange;

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeObject(Lcom/bestmafen/baseble/data/BleBuffer;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleHanBaoSettings;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleHanBaoSettings;

    iget v1, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mVibration:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mVibration:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mInterval:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mInterval:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mSpo2Threshold:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mSpo2Threshold:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mBleTimeRange2:Lcom/szabh/smable3/entity/BleTimeRange;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mBleTimeRange2:Lcom/szabh/smable3/entity/BleTimeRange;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getMBleTimeRange1()Lcom/szabh/smable3/entity/BleTimeRange;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;

    return-object v0
.end method

.method public final getMBleTimeRange2()Lcom/szabh/smable3/entity/BleTimeRange;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mBleTimeRange2:Lcom/szabh/smable3/entity/BleTimeRange;

    return-object v0
.end method

.method public final getMInterval()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mInterval:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x10

    return v0
.end method

.method public final getMSpo2Threshold()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mSpo2Threshold:I

    return v0
.end method

.method public final getMVibration()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mVibration:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mVibration:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mInterval:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mSpo2Threshold:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleTimeRange;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mBleTimeRange2:Lcom/szabh/smable3/entity/BleTimeRange;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleTimeRange;->hashCode()I

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

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;

    return-void
.end method

.method public final setMBleTimeRange2(Lcom/szabh/smable3/entity/BleTimeRange;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleTimeRange;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mBleTimeRange2:Lcom/szabh/smable3/entity/BleTimeRange;

    return-void
.end method

.method public final setMInterval(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mInterval:I

    return-void
.end method

.method public final setMSpo2Threshold(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mSpo2Threshold:I

    return-void
.end method

.method public final setMVibration(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mVibration:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleHanBaoSettings(mVibration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mVibration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mInterval="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mInterval:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSpo2Threshold="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mSpo2Threshold:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mBleTimeRange1="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mBleTimeRange1:Lcom/szabh/smable3/entity/BleTimeRange;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mBleTimeRange2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleHanBaoSettings;->mBleTimeRange2:Lcom/szabh/smable3/entity/BleTimeRange;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
