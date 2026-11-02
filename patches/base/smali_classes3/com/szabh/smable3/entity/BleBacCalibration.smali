.class public final Lcom/szabh/smable3/entity/BleBacCalibration;
.super Lcom/szabh/smable3/entity/BleIdObject;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleBacCalibration$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleBacCalibration$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x10


# instance fields
.field private value1:I

.field private value2:I

.field private value3:I

.field private value4:I

.field private value5:I

.field private value6:I

.field private value7:I

.field private value8:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleBacCalibration$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleBacCalibration$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleBacCalibration;->Companion:Lcom/szabh/smable3/entity/BleBacCalibration$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0xff

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/szabh/smable3/entity/BleBacCalibration;-><init>(IIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/szabh/smable3/entity/BleIdObject;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value1:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value2:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value3:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value4:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value5:I

    .line 8
    iput p6, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value6:I

    .line 9
    iput p7, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value7:I

    .line 10
    iput p8, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value8:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p10, p9, 0x2

    const/4 v0, 0x0

    if-eqz p10, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    move p10, v0

    move p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    goto :goto_0

    :cond_7
    move p10, p8

    move p9, p7

    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    .line 11
    :goto_0
    invoke-direct/range {p2 .. p10}, Lcom/szabh/smable3/entity/BleBacCalibration;-><init>(IIIIIIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleBacCalibration;IIIIIIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleBacCalibration;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value1:I

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value2:I

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value3:I

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value4:I

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value5:I

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget p6, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value6:I

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget p7, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value7:I

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget p8, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value8:I

    :cond_7
    move p9, p7

    move p10, p8

    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/szabh/smable3/entity/BleBacCalibration;->copy(IIIIIIII)Lcom/szabh/smable3/entity/BleBacCalibration;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value1:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value2:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value3:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value4:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value5:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value6:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value7:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value8:I

    return v0
.end method

.method public final copy(IIIIIIII)Lcom/szabh/smable3/entity/BleBacCalibration;
    .locals 9
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleBacCalibration;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/szabh/smable3/entity/BleBacCalibration;-><init>(IIIIIIII)V

    return-object v0
.end method

.method public decode()V
    .locals 3

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value1:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value2:I

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value3:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value4:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value5:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value6:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    move-result v2

    iput v2, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value7:I

    invoke-static {p0, v0, v1, v0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt16$default(Lcom/bestmafen/baseble/data/BleReadable;Ljava/nio/ByteOrder;ILjava/lang/Object;)S

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value8:I

    return-void
.end method

.method public encode()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value1:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value2:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value3:I

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleBacCalibration;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleBacCalibration;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value1:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBacCalibration;->value1:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value2:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBacCalibration;->value2:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value3:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBacCalibration;->value3:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value4:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBacCalibration;->value4:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value5:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBacCalibration;->value5:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value6:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBacCalibration;->value6:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value7:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleBacCalibration;->value7:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value8:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleBacCalibration;->value8:I

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/16 v0, 0x10

    return v0
.end method

.method public final getValue1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value1:I

    return v0
.end method

.method public final getValue2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value2:I

    return v0
.end method

.method public final getValue3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value3:I

    return v0
.end method

.method public final getValue4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value4:I

    return v0
.end method

.method public final getValue5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value5:I

    return v0
.end method

.method public final getValue6()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value6:I

    return v0
.end method

.method public final getValue7()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value7:I

    return v0
.end method

.method public final getValue8()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value8:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value1:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value2:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value3:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value4:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value5:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value6:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value7:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value8:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setValue1(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value1:I

    return-void
.end method

.method public final setValue2(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value2:I

    return-void
.end method

.method public final setValue3(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value3:I

    return-void
.end method

.method public final setValue4(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value4:I

    return-void
.end method

.method public final setValue5(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value5:I

    return-void
.end method

.method public final setValue6(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value6:I

    return-void
.end method

.method public final setValue7(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value7:I

    return-void
.end method

.method public final setValue8(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value8:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleBacCalibration(value1="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value1:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", value2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value2:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", value3="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value3:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", value4="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value4:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", value5="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value5:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", value6="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value6:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", value7="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value7:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", value8="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleBacCalibration;->value8:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
