.class public final synthetic Lcom/sma/smartv3/ui/device/FirmwareUpgradeGPSActivity$XIi00iiXO$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/device/FirmwareUpgradeGPSActivity$XIi00iiXO;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "OXO1"
.end annotation


# static fields
.field public static final synthetic OXO1:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGPSActivity$FileType;->values()[Lcom/sma/smartv3/ui/device/FirmwareUpgradeGPSActivity$FileType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGPSActivity$FileType;->AGPS_FILE:Lcom/sma/smartv3/ui/device/FirmwareUpgradeGPSActivity$FileType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGPSActivity$FileType;->GPS_FIRMWARE:Lcom/sma/smartv3/ui/device/FirmwareUpgradeGPSActivity$FileType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    sput-object v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGPSActivity$XIi00iiXO$OXO1;->OXO1:[I

    return-void
.end method
