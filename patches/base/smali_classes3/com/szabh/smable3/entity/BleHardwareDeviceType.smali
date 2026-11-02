.class public final enum Lcom/szabh/smable3/entity/BleHardwareDeviceType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleHardwareDeviceType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/szabh/smable3/entity/BleHardwareDeviceType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/szabh/smable3/entity/BleHardwareDeviceType;

.field public static final enum CD_DEVICE_TYPE_AIR_PRESSURE:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

.field public static final enum CD_DEVICE_TYPE_GEOMAGNETISM:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

.field public static final enum CD_DEVICE_TYPE_GPS:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

.field public static final enum CD_DEVICE_TYPE_G_SENSOR:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

.field public static final enum CD_DEVICE_TYPE_HEARTRATE:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

.field public static final enum CD_DEVICE_TYPE_LCD:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

.field public static final enum CD_DEVICE_TYPE_MAX:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

.field public static final enum CD_DEVICE_TYPE_NONE:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

.field public static final enum CD_DEVICE_TYPE_TEMPERATURE:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

.field public static final enum CD_DEVICE_TYPE_TP:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

.field public static final Companion:Lcom/szabh/smable3/entity/BleHardwareDeviceType$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private final type:I


# direct methods
.method private static final synthetic $values()[Lcom/szabh/smable3/entity/BleHardwareDeviceType;
    .locals 10

    sget-object v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->CD_DEVICE_TYPE_NONE:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    sget-object v1, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->CD_DEVICE_TYPE_LCD:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    sget-object v2, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->CD_DEVICE_TYPE_HEARTRATE:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    sget-object v3, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->CD_DEVICE_TYPE_G_SENSOR:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    sget-object v4, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->CD_DEVICE_TYPE_TP:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    sget-object v5, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->CD_DEVICE_TYPE_GPS:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    sget-object v6, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->CD_DEVICE_TYPE_GEOMAGNETISM:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    sget-object v7, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->CD_DEVICE_TYPE_AIR_PRESSURE:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    sget-object v8, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->CD_DEVICE_TYPE_TEMPERATURE:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    sget-object v9, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->CD_DEVICE_TYPE_MAX:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    filled-new-array/range {v0 .. v9}, [Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    const-string v1, "CD_DEVICE_TYPE_NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/BleHardwareDeviceType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->CD_DEVICE_TYPE_NONE:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    new-instance v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    const-string v1, "CD_DEVICE_TYPE_LCD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/BleHardwareDeviceType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->CD_DEVICE_TYPE_LCD:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    new-instance v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    const-string v1, "CD_DEVICE_TYPE_HEARTRATE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/BleHardwareDeviceType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->CD_DEVICE_TYPE_HEARTRATE:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    new-instance v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    const-string v1, "CD_DEVICE_TYPE_G_SENSOR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/BleHardwareDeviceType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->CD_DEVICE_TYPE_G_SENSOR:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    new-instance v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    const-string v1, "CD_DEVICE_TYPE_TP"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/BleHardwareDeviceType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->CD_DEVICE_TYPE_TP:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    new-instance v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    const-string v1, "CD_DEVICE_TYPE_GPS"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/BleHardwareDeviceType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->CD_DEVICE_TYPE_GPS:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    new-instance v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    const-string v1, "CD_DEVICE_TYPE_GEOMAGNETISM"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/BleHardwareDeviceType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->CD_DEVICE_TYPE_GEOMAGNETISM:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    new-instance v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    const-string v1, "CD_DEVICE_TYPE_AIR_PRESSURE"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/BleHardwareDeviceType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->CD_DEVICE_TYPE_AIR_PRESSURE:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    new-instance v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    const-string v1, "CD_DEVICE_TYPE_TEMPERATURE"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/BleHardwareDeviceType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->CD_DEVICE_TYPE_TEMPERATURE:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    new-instance v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    const/16 v1, 0x9

    const/16 v2, 0xff

    const-string v3, "CD_DEVICE_TYPE_MAX"

    invoke-direct {v0, v3, v1, v2}, Lcom/szabh/smable3/entity/BleHardwareDeviceType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->CD_DEVICE_TYPE_MAX:Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    invoke-static {}, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->$values()[Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->$VALUES:[Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleHardwareDeviceType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->Companion:Lcom/szabh/smable3/entity/BleHardwareDeviceType$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->type:I

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/szabh/smable3/entity/BleHardwareDeviceType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/szabh/smable3/entity/BleHardwareDeviceType;
    .locals 1

    const-class v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    return-object p0
.end method

.method public static values()[Lcom/szabh/smable3/entity/BleHardwareDeviceType;
    .locals 1

    sget-object v0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->$VALUES:[Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/szabh/smable3/entity/BleHardwareDeviceType;

    return-object v0
.end method


# virtual methods
.method public final getType()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->type:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    iget v1, p0, Lcom/szabh/smable3/entity/BleHardwareDeviceType;->type:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "0x%02X_"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "format(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
