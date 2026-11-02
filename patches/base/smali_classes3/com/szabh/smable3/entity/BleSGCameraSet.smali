.class public final Lcom/szabh/smable3/entity/BleSGCameraSet;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleSGCameraSet$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleSGCameraSet$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x5


# instance fields
.field private mRecordLocation:I

.field private mVideoDuration:I

.field private mVideoOrientation:I

.field private mVideoResolution:Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleSGCameraSet$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleSGCameraSet$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleSGCameraSet;->Companion:Lcom/szabh/smable3/entity/BleSGCameraSet$Companion;

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

    invoke-direct/range {v0 .. v6}, Lcom/szabh/smable3/entity/BleSGCameraSet;-><init>(IIILcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIILcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;)V
    .locals 1
    .param p4    # Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mVideoResolution"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoDuration:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoOrientation:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mRecordLocation:I

    .line 6
    iput-object p4, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoResolution:Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;

    return-void
.end method

.method public synthetic constructor <init>(IIILcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

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

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    .line 7
    sget-object p4, Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;->VR_100WP25:Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;

    .line 8
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleSGCameraSet;-><init>(IIILcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleSGCameraSet;IIILcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleSGCameraSet;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoDuration:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoOrientation:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mRecordLocation:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoResolution:Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleSGCameraSet;->copy(IIILcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;)Lcom/szabh/smable3/entity/BleSGCameraSet;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoDuration:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoOrientation:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mRecordLocation:I

    return v0
.end method

.method public final component4()Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoResolution:Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;

    return-object v0
.end method

.method public final copy(IIILcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;)Lcom/szabh/smable3/entity/BleSGCameraSet;
    .locals 1
    .param p4    # Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mVideoResolution"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/szabh/smable3/entity/BleSGCameraSet;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleSGCameraSet;-><init>(IIILcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;)V

    return-object v0
.end method

.method public decode()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v1, "LITTLE_ENDIAN"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16(Ljava/nio/ByteOrder;)S

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoDuration:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoOrientation:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mRecordLocation:I

    sget-object v0, Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;->Companion:Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution$Companion;

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v1

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution$Companion;->of(I)Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;

    move-result-object v0

    iput-object v0, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoResolution:Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;

    return-void
.end method

.method public encode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoDuration:I

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    const-string v2, "LITTLE_ENDIAN"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt16(ILjava/nio/ByteOrder;)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoOrientation:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mRecordLocation:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoResolution:Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;->getValue()I

    move-result v0

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleSGCameraSet;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleSGCameraSet;

    iget v1, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoDuration:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoDuration:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoOrientation:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoOrientation:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mRecordLocation:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleSGCameraSet;->mRecordLocation:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoResolution:Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoResolution:Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public final getMRecordLocation()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mRecordLocation:I

    return v0
.end method

.method public final getMVideoDuration()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoDuration:I

    return v0
.end method

.method public final getMVideoOrientation()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoOrientation:I

    return v0
.end method

.method public final getMVideoResolution()Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoResolution:Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoDuration:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoOrientation:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mRecordLocation:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoResolution:Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMRecordLocation(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mRecordLocation:I

    return-void
.end method

.method public final setMVideoDuration(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoDuration:I

    return-void
.end method

.method public final setMVideoOrientation(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoOrientation:I

    return-void
.end method

.method public final setMVideoResolution(Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;)V
    .locals 1
    .param p1    # Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoResolution:Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleSGCameraSet(mVideoDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mVideoOrientation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoOrientation:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRecordLocation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mRecordLocation:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mVideoResolution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleSGCameraSet;->mVideoResolution:Lcom/szabh/smable3/entity/BleIPCSupport$VideoResolution;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
