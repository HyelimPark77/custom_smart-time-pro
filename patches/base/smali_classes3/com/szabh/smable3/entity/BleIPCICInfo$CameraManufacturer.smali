.class public final enum Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/entity/BleIPCICInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "CameraManufacturer"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;

.field public static final Companion:Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final enum OV:Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;

.field public static final enum UNKNOWN:Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;

.field public static final enum 格科微:Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;


# instance fields
.field private final value:I


# direct methods
.method private static final synthetic $values()[Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;
    .locals 3

    sget-object v0, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;->UNKNOWN:Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;

    sget-object v1, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;->格科微:Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;

    sget-object v2, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;->OV:Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;

    filled-new-array {v0, v1, v2}, [Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;->UNKNOWN:Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;

    new-instance v0, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;

    const-string v1, "\u683c\u79d1\u5fae"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;->格科微:Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;

    new-instance v0, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;

    const-string v1, "OV"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;->OV:Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;

    invoke-static {}, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;->$values()[Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;->$VALUES:[Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;->Companion:Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer$Companion;

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

    iput p3, p0, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;->value:I

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
            "Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;
    .locals 1

    const-class v0, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;

    return-object p0
.end method

.method public static values()[Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;
    .locals 1

    sget-object v0, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;->$VALUES:[Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;

    return-object v0
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;->value:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    iget v1, p0, Lcom/szabh/smable3/entity/BleIPCICInfo$CameraManufacturer;->value:I

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
