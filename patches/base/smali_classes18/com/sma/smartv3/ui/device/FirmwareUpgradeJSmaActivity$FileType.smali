.class public final enum Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "FileType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

.field public static final enum FIRMWARE:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

.field public static final enum FONT_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

.field public static final enum GPS_FIRMWARE:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

.field public static final enum LANGUAGE_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

.field public static final enum NETWORK_FIRMWARE:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

.field public static final enum OTA_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

.field public static final enum UI_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;


# direct methods
.method private static final synthetic $values()[Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;
    .locals 7

    sget-object v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->FIRMWARE:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->UI_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    sget-object v2, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->LANGUAGE_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    sget-object v3, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->FONT_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    sget-object v4, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->OTA_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    sget-object v5, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->GPS_FIRMWARE:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    sget-object v6, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->NETWORK_FIRMWARE:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    filled-new-array/range {v0 .. v6}, [Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    const-string v1, "FIRMWARE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->FIRMWARE:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    const-string v1, "UI_PACK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->UI_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    const-string v1, "LANGUAGE_PACK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->LANGUAGE_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    const-string v1, "FONT_PACK"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->FONT_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    const-string v1, "OTA_PACK"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->OTA_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    const-string v1, "GPS_FIRMWARE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->GPS_FIRMWARE:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    const-string v1, "NETWORK_FIRMWARE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->NETWORK_FIRMWARE:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    invoke-static {}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->$values()[Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->$VALUES:[Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

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
            "Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;
    .locals 1

    const-class v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->$VALUES:[Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    return-object v0
.end method
