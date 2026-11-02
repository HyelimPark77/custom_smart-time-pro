.class public final Lcom/szabh/smable3/entity/BleCalibrationData;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleCalibrationData$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleCalibrationData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleCalibrationData.kt\ncom/szabh/smable3/entity/BleCalibrationData\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable$Companion\n*L\n1#1,68:1\n277#2,5:69\n*S KotlinDebug\n*F\n+ 1 BleCalibrationData.kt\ncom/szabh/smable3/entity/BleCalibrationData\n*L\n55#1:69,5\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleCalibrationData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleCalibrationData.kt\ncom/szabh/smable3/entity/BleCalibrationData\n+ 2 BleReadable.kt\ncom/bestmafen/baseble/data/BleReadable$Companion\n*L\n1#1,68:1\n277#2,5:69\n*S KotlinDebug\n*F\n+ 1 BleCalibrationData.kt\ncom/szabh/smable3/entity/BleCalibrationData\n*L\n55#1:69,5\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleCalibrationData$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TYPE_HR:I = 0x1


# instance fields
.field private mResponse:Lcom/bestmafen/baseble/data/BleWritable;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mType:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleCalibrationData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleCalibrationData$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleCalibrationData;->Companion:Lcom/szabh/smable3/entity/BleCalibrationData$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, v0}, Lcom/szabh/smable3/entity/BleCalibrationData;-><init>(ILcom/bestmafen/baseble/data/BleWritable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILcom/bestmafen/baseble/data/BleWritable;)V
    .locals 1
    .param p2    # Lcom/bestmafen/baseble/data/BleWritable;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mResponse"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleCalibrationData;->mType:I

    .line 4
    iput-object p2, p0, Lcom/szabh/smable3/entity/BleCalibrationData;->mResponse:Lcom/bestmafen/baseble/data/BleWritable;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/bestmafen/baseble/data/BleWritable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 5
    new-instance p2, Lcom/bestmafen/baseble/data/BleWritable;

    invoke-direct {p2}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/szabh/smable3/entity/BleCalibrationData;-><init>(ILcom/bestmafen/baseble/data/BleWritable;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleCalibrationData;ILcom/bestmafen/baseble/data/BleWritable;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleCalibrationData;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleCalibrationData;->mType:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/szabh/smable3/entity/BleCalibrationData;->mResponse:Lcom/bestmafen/baseble/data/BleWritable;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/szabh/smable3/entity/BleCalibrationData;->copy(ILcom/bestmafen/baseble/data/BleWritable;)Lcom/szabh/smable3/entity/BleCalibrationData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCalibrationData;->mType:I

    return v0
.end method

.method public final component2()Lcom/bestmafen/baseble/data/BleWritable;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCalibrationData;->mResponse:Lcom/bestmafen/baseble/data/BleWritable;

    return-object v0
.end method

.method public final copy(ILcom/bestmafen/baseble/data/BleWritable;)Lcom/szabh/smable3/entity/BleCalibrationData;
    .locals 1
    .param p2    # Lcom/bestmafen/baseble/data/BleWritable;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mResponse"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/szabh/smable3/entity/BleCalibrationData;

    invoke-direct {v0, p1, p2}, Lcom/szabh/smable3/entity/BleCalibrationData;-><init>(ILcom/bestmafen/baseble/data/BleWritable;)V

    return-object v0
.end method

.method public decode()V
    .locals 5

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleCalibrationData;->mType:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    iget v0, p0, Lcom/szabh/smable3/entity/BleCalibrationData;->mType:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleByteArray;->getMBytes()[B

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    array-length v1, v0

    const-class v2, Lcom/szabh/smable3/entity/BleCalibrationHrData;

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/bestmafen/baseble/data/BleReadable;

    const/4 v4, 0x2

    invoke-static {v0, v4, v1}, Lkotlin/collections/ArraysKt___ArraysJvmKt;->I0IIOI([BII)[B

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/bestmafen/baseble/data/BleByteArray;->setMBytes([B)V

    invoke-virtual {v3}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    const-string v0, "also(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lcom/bestmafen/baseble/data/BleWritable;

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/bestmafen/baseble/data/BleWritable;

    invoke-direct {v3}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    :goto_0
    iput-object v3, p0, Lcom/szabh/smable3/entity/BleCalibrationData;->mResponse:Lcom/bestmafen/baseble/data/BleWritable;

    return-void
.end method

.method public encode()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleCalibrationData;->mType:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCalibrationData;->mResponse:Lcom/bestmafen/baseble/data/BleWritable;

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleWritable;->getMLengthToWrite()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCalibrationData;->mResponse:Lcom/bestmafen/baseble/data/BleWritable;

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleCalibrationData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleCalibrationData;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCalibrationData;->mType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleCalibrationData;->mType:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCalibrationData;->mResponse:Lcom/bestmafen/baseble/data/BleWritable;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleCalibrationData;->mResponse:Lcom/bestmafen/baseble/data/BleWritable;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCalibrationData;->mResponse:Lcom/bestmafen/baseble/data/BleWritable;

    invoke-virtual {v0}, Lcom/bestmafen/baseble/data/BleWritable;->getMLengthToWrite()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public final getMResponse()Lcom/bestmafen/baseble/data/BleWritable;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleCalibrationData;->mResponse:Lcom/bestmafen/baseble/data/BleWritable;

    return-object v0
.end method

.method public final getMType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleCalibrationData;->mType:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleCalibrationData;->mType:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCalibrationData;->mResponse:Lcom/bestmafen/baseble/data/BleWritable;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMResponse(Lcom/bestmafen/baseble/data/BleWritable;)V
    .locals 1
    .param p1    # Lcom/bestmafen/baseble/data/BleWritable;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleCalibrationData;->mResponse:Lcom/bestmafen/baseble/data/BleWritable;

    return-void
.end method

.method public final setMType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleCalibrationData;->mType:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleFactoryTest(mType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleCalibrationData;->mType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mResponse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleCalibrationData;->mResponse:Lcom/bestmafen/baseble/data/BleWritable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
