.class public final Lcom/szabh/smable3/entity/BleGSensorMotion;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleGSensorMotion$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleGSensorMotion$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x2


# instance fields
.field private mMotion:S


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleGSensorMotion$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleGSensorMotion$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleGSensorMotion;->Companion:Lcom/szabh/smable3/entity/BleGSensorMotion$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/szabh/smable3/entity/BleGSensorMotion;-><init>(SILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(S)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput-short p1, p0, Lcom/szabh/smable3/entity/BleGSensorMotion;->mMotion:S

    return-void
.end method

.method public synthetic constructor <init>(SILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lcom/szabh/smable3/entity/BleGSensorMotion;-><init>(S)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleGSensorMotion;SILjava/lang/Object;)Lcom/szabh/smable3/entity/BleGSensorMotion;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-short p1, p0, Lcom/szabh/smable3/entity/BleGSensorMotion;->mMotion:S

    :cond_0
    invoke-virtual {p0, p1}, Lcom/szabh/smable3/entity/BleGSensorMotion;->copy(S)Lcom/szabh/smable3/entity/BleGSensorMotion;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()S
    .locals 1

    iget-short v0, p0, Lcom/szabh/smable3/entity/BleGSensorMotion;->mMotion:S

    return v0
.end method

.method public final copy(S)Lcom/szabh/smable3/entity/BleGSensorMotion;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleGSensorMotion;

    invoke-direct {v0, p1}, Lcom/szabh/smable3/entity/BleGSensorMotion;-><init>(S)V

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

    iput-short v0, p0, Lcom/szabh/smable3/entity/BleGSensorMotion;->mMotion:S

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleGSensorMotion;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleGSensorMotion;

    iget-short v1, p0, Lcom/szabh/smable3/entity/BleGSensorMotion;->mMotion:S

    iget-short p1, p1, Lcom/szabh/smable3/entity/BleGSensorMotion;->mMotion:S

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getMMotion()S
    .locals 1

    iget-short v0, p0, Lcom/szabh/smable3/entity/BleGSensorMotion;->mMotion:S

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-short v0, p0, Lcom/szabh/smable3/entity/BleGSensorMotion;->mMotion:S

    invoke-static {v0}, Ljava/lang/Short;->hashCode(S)I

    move-result v0

    return v0
.end method

.method public final setMMotion(S)V
    .locals 0

    iput-short p1, p0, Lcom/szabh/smable3/entity/BleGSensorMotion;->mMotion:S

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleGSensorMotion(mMotion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/szabh/smable3/entity/BleGSensorMotion;->mMotion:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
