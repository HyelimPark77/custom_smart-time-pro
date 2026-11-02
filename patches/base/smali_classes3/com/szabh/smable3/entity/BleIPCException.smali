.class public final Lcom/szabh/smable3/entity/BleIPCException;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleIPCException$Companion;
    }
.end annotation


# static fields
.field public static final CODE_BATTERY_LOW:I = 0x13

.field public static final CODE_BUSY_CLEAR_SD:I = 0x8

.field public static final CODE_BUSY_EXPORT:I = 0x4

.field public static final CODE_BUSY_OTA:I = 0x5

.field public static final CODE_BUSY_PHOTO:I = 0x1

.field public static final CODE_BUSY_PREVIEW:I = 0x7

.field public static final CODE_BUSY_RECORD:I = 0x2

.field public static final CODE_BUSY_UBOOT_OTA:I = 0x6

.field public static final CODE_BUSY_VISION:I = 0x3

.field public static final CODE_CHARGING_NOT_OPERATE:I = 0x15

.field public static final CODE_GENERAL_ERROR:I = 0x21

.field public static final CODE_MEMORY_LOW:I = 0x11

.field public static final CODE_NO_TF_CARD:I = 0x17

.field public static final CODE_OPERATION_FAILED:I = 0x12

.field public static final CODE_OTHER_ERROR:I = 0x20

.field public static final CODE_RECORD_TIME_TOO_SHORT:I = 0x16

.field public static final CODE_TIMEOUT:I = 0x14

.field public static final Companion:Lcom/szabh/smable3/entity/BleIPCException$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x8

.field public static final TYPE_CLEAR_SD:I = 0x8

.field public static final TYPE_EXPORT:I = 0x4

.field public static final TYPE_OTA:I = 0x5

.field public static final TYPE_PHOTO:I = 0x1

.field public static final TYPE_PREVIEW:I = 0x7

.field public static final TYPE_RECORD:I = 0x2

.field public static final TYPE_RECORD_AUDIO:I = 0xa

.field public static final TYPE_UBOOT_OTA:I = 0x6

.field public static final TYPE_VISION:I = 0x3

.field public static final TYPE_VOICE:I = 0xb


# instance fields
.field private mCode:I

.field private mSubCode:I

.field private mType:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleIPCException$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleIPCException$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleIPCException;->Companion:Lcom/szabh/smable3/entity/BleIPCException$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/szabh/smable3/entity/BleIPCException;-><init>(IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleIPCException;->mType:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleIPCException;->mCode:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleIPCException;->mSubCode:I

    return-void
.end method

.method public synthetic constructor <init>(IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move p3, v0

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/szabh/smable3/entity/BleIPCException;-><init>(III)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleIPCException;IIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleIPCException;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleIPCException;->mType:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleIPCException;->mCode:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleIPCException;->mSubCode:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/szabh/smable3/entity/BleIPCException;->copy(III)Lcom/szabh/smable3/entity/BleIPCException;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCException;->mType:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCException;->mCode:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCException;->mSubCode:I

    return v0
.end method

.method public final copy(III)Lcom/szabh/smable3/entity/BleIPCException;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleIPCException;

    invoke-direct {v0, p1, p2, p3}, Lcom/szabh/smable3/entity/BleIPCException;-><init>(III)V

    return-object v0
.end method

.method public decode()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleIPCException;->mType:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleIPCException;->mCode:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readInt8()B

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleIPCException;->mSubCode:I

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleIPCException;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleIPCException;

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCException;->mType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleIPCException;->mType:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCException;->mCode:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleIPCException;->mCode:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCException;->mSubCode:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleIPCException;->mSubCode:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getMCode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCException;->mCode:I

    return v0
.end method

.method public final getMSubCode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCException;->mSubCode:I

    return v0
.end method

.method public final getMType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCException;->mType:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCException;->mType:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCException;->mCode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCException;->mSubCode:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMCode(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleIPCException;->mCode:I

    return-void
.end method

.method public final setMSubCode(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleIPCException;->mSubCode:I

    return-void
.end method

.method public final setMType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleIPCException;->mType:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleIPCException(mType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCException;->mType:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v3, "0x%02X"

    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "format(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCException;->mCode:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mSubCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCException;->mSubCode:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
