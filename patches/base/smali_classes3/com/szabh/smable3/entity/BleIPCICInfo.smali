.class public final Lcom/szabh/smable3/entity/BleIPCICInfo;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleIPCICInfo$AntiShakeSensorManufacturer;,
        Lcom/szabh/smable3/entity/BleIPCICInfo$AntiShakeSensorModel;,
        Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;,
        Lcom/szabh/smable3/entity/BleIPCICInfo$CameraModel;,
        Lcom/szabh/smable3/entity/BleIPCICInfo$Companion;,
        Lcom/szabh/smable3/entity/BleIPCICInfo$Manufacturer;,
        Lcom/szabh/smable3/entity/BleIPCICInfo$Model;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleIPCICInfo$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x10


# instance fields
.field private mAntiShakeSensorManufacturer:I

.field private mAntiShakeSensorModel:I

.field private mCameraManufacturer:I

.field private mCameraModel:I

.field private mManufacturer:I

.field private mModel:I

.field private mMotherboardModel:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleIPCICInfo$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleIPCICInfo$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleIPCICInfo;->Companion:Lcom/szabh/smable3/entity/BleIPCICInfo$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/szabh/smable3/entity/BleIPCICInfo;-><init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mManufacturer:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mModel:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mMotherboardModel:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mCameraManufacturer:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mCameraModel:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mAntiShakeSensorManufacturer:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mAntiShakeSensorModel:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    move p8, v0

    :goto_0
    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_6
    move p8, p7

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {p1 .. p8}, Lcom/szabh/smable3/entity/BleIPCICInfo;-><init>(IIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleIPCICInfo;IIIIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleIPCICInfo;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mManufacturer:I

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mModel:I

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mMotherboardModel:I

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mCameraManufacturer:I

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mCameraModel:I

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mAntiShakeSensorManufacturer:I

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget p7, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mAntiShakeSensorModel:I

    :cond_6
    move p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/szabh/smable3/entity/BleIPCICInfo;->copy(IIIIIII)Lcom/szabh/smable3/entity/BleIPCICInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mManufacturer:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mModel:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mMotherboardModel:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mCameraManufacturer:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mCameraModel:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mAntiShakeSensorManufacturer:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mAntiShakeSensorModel:I

    return v0
.end method

.method public final copy(IIIIIII)Lcom/szabh/smable3/entity/BleIPCICInfo;
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleIPCICInfo;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/szabh/smable3/entity/BleIPCICInfo;-><init>(IIIIIII)V

    return-object v0
.end method

.method public decode()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mManufacturer:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mModel:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mMotherboardModel:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mCameraManufacturer:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mCameraModel:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mAntiShakeSensorManufacturer:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mAntiShakeSensorModel:I

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleIPCICInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleIPCICInfo;

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mManufacturer:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleIPCICInfo;->mManufacturer:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mModel:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleIPCICInfo;->mModel:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mMotherboardModel:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleIPCICInfo;->mMotherboardModel:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mCameraManufacturer:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleIPCICInfo;->mCameraManufacturer:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mCameraModel:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleIPCICInfo;->mCameraModel:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mAntiShakeSensorManufacturer:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleIPCICInfo;->mAntiShakeSensorManufacturer:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mAntiShakeSensorModel:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleIPCICInfo;->mAntiShakeSensorModel:I

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getMAntiShakeSensorManufacturer()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mAntiShakeSensorManufacturer:I

    return v0
.end method

.method public final getMAntiShakeSensorModel()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mAntiShakeSensorModel:I

    return v0
.end method

.method public final getMCameraManufacturer()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mCameraManufacturer:I

    return v0
.end method

.method public final getMCameraModel()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mCameraModel:I

    return v0
.end method

.method public final getMManufacturer()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mManufacturer:I

    return v0
.end method

.method public final getMModel()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mModel:I

    return v0
.end method

.method public final getMMotherboardModel()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mMotherboardModel:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mManufacturer:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mModel:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mMotherboardModel:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mCameraManufacturer:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mCameraModel:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mAntiShakeSensorManufacturer:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mAntiShakeSensorModel:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMAntiShakeSensorManufacturer(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mAntiShakeSensorManufacturer:I

    return-void
.end method

.method public final setMAntiShakeSensorModel(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mAntiShakeSensorModel:I

    return-void
.end method

.method public final setMCameraManufacturer(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mCameraManufacturer:I

    return-void
.end method

.method public final setMCameraModel(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mCameraModel:I

    return-void
.end method

.method public final setMManufacturer(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mManufacturer:I

    return-void
.end method

.method public final setMModel(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mModel:I

    return-void
.end method

.method public final setMMotherboardModel(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mMotherboardModel:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleIPCICInfo(mManufacturer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mManufacturer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mModel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mMotherboardModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mMotherboardModel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCameraManufacturer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mCameraManufacturer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCameraModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mCameraModel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAntiShakeSensorManufacturer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mAntiShakeSensorManufacturer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mAntiShakeSensorModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo;->mAntiShakeSensorModel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
