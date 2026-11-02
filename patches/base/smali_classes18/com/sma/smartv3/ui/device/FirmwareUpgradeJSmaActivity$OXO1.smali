.class public final synthetic Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "OXO1"
.end annotation


# static fields
.field public static final synthetic OXO1:[I

.field public static final synthetic XIi00iiXO:[I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    invoke-static {}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->values()[Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->FIRMWARE:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v2, 0x2

    :try_start_1
    sget-object v3, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->UI_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v2, v0, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    const/4 v3, 0x3

    :try_start_2
    sget-object v4, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->LANGUAGE_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v3, v0, v4
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v4, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->FONT_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/4 v5, 0x4

    aput v5, v0, v4
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v4, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->OTA_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/4 v5, 0x5

    aput v5, v0, v4
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    sget-object v4, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->GPS_FIRMWARE:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/4 v5, 0x6

    aput v5, v0, v4
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :try_start_6
    sget-object v4, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->NETWORK_FIRMWARE:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/4 v5, 0x7

    aput v5, v0, v4
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    sput-object v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$OXO1;->OXO1:[I

    invoke-static {}, Lcom/sma/smartv3/ui/device/OTAStatus;->values()[Lcom/sma/smartv3/ui/device/OTAStatus;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_7
    sget-object v4, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_SCANNING_TIMEOUT:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aput v1, v0, v4
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    :try_start_8
    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    :catch_8
    :try_start_9
    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v3, v0, v1
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    :catch_9
    sput-object v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$OXO1;->XIi00iiXO:[I

    return-void
.end method
