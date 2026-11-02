.class public final Lcom/szabh/smable3/entity/BleHrWarningSettings;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleHrWarningSettings$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/szabh/smable3/entity/BleHrWarningSettings$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ITEM_LENGTH:I = 0x4


# instance fields
.field private mHighSwitch:I

.field private mHighValue:I

.field private mLowSwitch:I

.field private mLowValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/szabh/smable3/entity/BleHrWarningSettings$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleHrWarningSettings$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->Companion:Lcom/szabh/smable3/entity/BleHrWarningSettings$Companion;

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

    invoke-direct/range {v0 .. v6}, Lcom/szabh/smable3/entity/BleHrWarningSettings;-><init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mHighSwitch:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mHighValue:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mLowSwitch:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mLowValue:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
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

    move p4, v0

    .line 7
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleHrWarningSettings;-><init>(IIII)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleHrWarningSettings;IIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleHrWarningSettings;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mHighSwitch:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mHighValue:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mLowSwitch:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mLowValue:I

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleHrWarningSettings;->copy(IIII)Lcom/szabh/smable3/entity/BleHrWarningSettings;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mHighSwitch:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mHighValue:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mLowSwitch:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mLowValue:I

    return v0
.end method

.method public final copy(IIII)Lcom/szabh/smable3/entity/BleHrWarningSettings;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/szabh/smable3/entity/BleHrWarningSettings;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleHrWarningSettings;-><init>(IIII)V

    return-object v0
.end method

.method public decode()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mHighSwitch:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mHighValue:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mLowSwitch:I

    invoke-virtual {p0}, Lcom/bestmafen/baseble/data/BleReadable;->readUInt8()C

    move-result v0

    iput v0, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mLowValue:I

    return-void
.end method

.method public encode()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleWritable;->encode()V

    iget v0, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mHighSwitch:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mHighValue:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mLowSwitch:I

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/data/BleWritable;->writeInt8(I)V

    iget v0, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mLowValue:I

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleHrWarningSettings;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleHrWarningSettings;

    iget v1, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mHighSwitch:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mHighSwitch:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mHighValue:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mHighValue:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mLowSwitch:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mLowSwitch:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mLowValue:I

    iget p1, p1, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mLowValue:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getMHighSwitch()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mHighSwitch:I

    return v0
.end method

.method public final getMHighValue()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mHighValue:I

    return v0
.end method

.method public getMLengthToWrite()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public final getMLowSwitch()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mLowSwitch:I

    return v0
.end method

.method public final getMLowValue()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mLowValue:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mHighSwitch:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mHighValue:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mLowSwitch:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mLowValue:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMHighSwitch(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mHighSwitch:I

    return-void
.end method

.method public final setMHighValue(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mHighValue:I

    return-void
.end method

.method public final setMLowSwitch(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mLowSwitch:I

    return-void
.end method

.method public final setMLowValue(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mLowValue:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleHrWarningSettings(mHighSwitch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mHighSwitch:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHighValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mHighValue:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLowSwitch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mLowSwitch:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLowValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleHrWarningSettings;->mLowValue:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
