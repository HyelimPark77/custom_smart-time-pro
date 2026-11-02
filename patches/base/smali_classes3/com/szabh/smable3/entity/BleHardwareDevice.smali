.class public final Lcom/szabh/smable3/entity/BleHardwareDevice;
.super Lcom/bestmafen/baseble/data/BleReadable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleHardwareDevice$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleHardwareInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleHardwareInfo.kt\ncom/szabh/smable3/entity/BleHardwareDevice\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,303:1\n11571#2:304\n11906#2,3:305\n*S KotlinDebug\n*F\n+ 1 BleHardwareInfo.kt\ncom/szabh/smable3/entity/BleHardwareDevice\n*L\n58#1:304\n58#1:305,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleHardwareInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleHardwareInfo.kt\ncom/szabh/smable3/entity/BleHardwareDevice\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,303:1\n11571#2:304\n11906#2,3:305\n*S KotlinDebug\n*F\n+ 1 BleHardwareInfo.kt\ncom/szabh/smable3/entity/BleHardwareDevice\n*L\n58#1:304\n58#1:305,3\n*E\n"
    }
.end annotation


# instance fields
.field private mCompatible:[B
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCurrent:I

.field private mLength:I

.field private mType:I


# direct methods
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

    invoke-direct/range {v0 .. v6}, Lcom/szabh/smable3/entity/BleHardwareDevice;-><init>(III[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(III[B)V
    .locals 1
    .param p4    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mCompatible"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleReadable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mLength:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mType:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mCurrent:I

    .line 6
    iput-object p4, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mCompatible:[B

    return-void
.end method

.method public synthetic constructor <init>(III[BILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    new-array p4, v0, [B

    .line 8
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleHardwareDevice;-><init>(III[B)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleHardwareDevice;III[BILjava/lang/Object;)Lcom/szabh/smable3/entity/BleHardwareDevice;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mLength:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mType:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mCurrent:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mCompatible:[B

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleHardwareDevice;->copy(III[B)Lcom/szabh/smable3/entity/BleHardwareDevice;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mLength:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mType:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mCurrent:I

    return v0
.end method

.method public final component4()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mCompatible:[B

    return-object v0
.end method

.method public final copy(III[B)Lcom/szabh/smable3/entity/BleHardwareDevice;
    .locals 1
    .param p4    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mCompatible"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/szabh/smable3/entity/BleHardwareDevice;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleHardwareDevice;-><init>(III[B)V

    return-object v0
.end method

.method public decode()V
    .locals 0

    invoke-super {p0}, Lcom/bestmafen/baseble/data/BleReadable;->decode()V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleHardwareDevice;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleHardwareDevice;

    iget v1, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mLength:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleHardwareDevice;->mLength:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mType:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleHardwareDevice;->mType:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mCurrent:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleHardwareDevice;->mCurrent:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mCompatible:[B

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleHardwareDevice;->mCompatible:[B

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getHardwareType(II)Lcom/szabh/smable3/entity/BleHardwareType;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->Companion:Lcom/szabh/smable3/entity/BleHardwareDeviceType$Companion;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/entity/BleHardwareDeviceType$Companion;->of(I)Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    move-result-object p1

    sget-object v0, Lcom/szabh/smable3/entity/BleHardwareDevice$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    sget-object p1, Lcom/szabh/smable3/entity/BleHardwareLCDType;->CD_LCD_TYPE_NONE:Lcom/szabh/smable3/entity/BleHardwareLCDType;

    return-object p1

    :pswitch_0
    sget-object p1, Lcom/szabh/smable3/entity/BleHardwareAirPressureType;->Companion:Lcom/szabh/smable3/entity/BleHardwareAirPressureType$Companion;

    invoke-virtual {p1, p2}, Lcom/szabh/smable3/entity/BleHardwareAirPressureType$Companion;->of(I)Lcom/szabh/smable3/entity/BleHardwareAirPressureType;

    move-result-object p1

    return-object p1

    :pswitch_1
    sget-object p1, Lcom/szabh/smable3/entity/BleHardwareTPType;->Companion:Lcom/szabh/smable3/entity/BleHardwareTPType$Companion;

    invoke-virtual {p1, p2}, Lcom/szabh/smable3/entity/BleHardwareTPType$Companion;->of(I)Lcom/szabh/smable3/entity/BleHardwareTPType;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lcom/szabh/smable3/entity/BleHardwareGeomagnetismType;->Companion:Lcom/szabh/smable3/entity/BleHardwareGeomagnetismType$Companion;

    invoke-virtual {p1, p2}, Lcom/szabh/smable3/entity/BleHardwareGeomagnetismType$Companion;->of(I)Lcom/szabh/smable3/entity/BleHardwareGeomagnetismType;

    move-result-object p1

    return-object p1

    :pswitch_3
    sget-object p1, Lcom/szabh/smable3/entity/BleHardwareGsensorType;->Companion:Lcom/szabh/smable3/entity/BleHardwareGsensorType$Companion;

    invoke-virtual {p1, p2}, Lcom/szabh/smable3/entity/BleHardwareGsensorType$Companion;->of(I)Lcom/szabh/smable3/entity/BleHardwareGsensorType;

    move-result-object p1

    return-object p1

    :pswitch_4
    sget-object p1, Lcom/szabh/smable3/entity/BleHardwareHeatrateType;->Companion:Lcom/szabh/smable3/entity/BleHardwareHeatrateType$Companion;

    invoke-virtual {p1, p2}, Lcom/szabh/smable3/entity/BleHardwareHeatrateType$Companion;->of(I)Lcom/szabh/smable3/entity/BleHardwareHeatrateType;

    move-result-object p1

    return-object p1

    :pswitch_5
    sget-object p1, Lcom/szabh/smable3/entity/BleHardwareLCDType;->Companion:Lcom/szabh/smable3/entity/BleHardwareLCDType$Companion;

    invoke-virtual {p1, p2}, Lcom/szabh/smable3/entity/BleHardwareLCDType$Companion;->of(I)Lcom/szabh/smable3/entity/BleHardwareLCDType;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getMCompatible()[B
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mCompatible:[B

    return-object v0
.end method

.method public final getMCurrent()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mCurrent:I

    return v0
.end method

.method public final getMLength()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mLength:I

    return v0
.end method

.method public final getMType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mType:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mLength:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mCurrent:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mCompatible:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMCompatible([B)V
    .locals 1
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mCompatible:[B

    return-void
.end method

.method public final setMCurrent(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mCurrent:I

    return-void
.end method

.method public final setMLength(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mLength:I

    return-void
.end method

.method public final setMType(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mType:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleHardwareDevice(\nmLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mLength:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", \nmType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->Companion:Lcom/szabh/smable3/entity/BleHardwareDeviceType$Companion;

    iget v2, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mType:I

    invoke-virtual {v1, v2}, Lcom/szabh/smable3/entity/BleHardwareDeviceType$Companion;->of(I)Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \nmCurrent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mType:I

    iget v2, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mCurrent:I

    invoke-virtual {p0, v1, v2}, Lcom/szabh/smable3/entity/BleHardwareDevice;->getHardwareType(II)Lcom/szabh/smable3/entity/BleHardwareType;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", \nmCompatible="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mCompatible:[B

    new-instance v2, Ljava/util/ArrayList;

    array-length v3, v1

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-byte v5, v1, v4

    iget v6, p0, Lcom/szabh/smable3/entity/BleHardwareDevice;->mType:I

    invoke-virtual {p0, v6, v5}, Lcom/szabh/smable3/entity/BleHardwareDevice;->getHardwareType(II)Lcom/szabh/smable3/entity/BleHardwareType;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
