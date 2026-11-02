.class public final enum Lcom/sma/smartv3/ui/device/OTAStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sma/smartv3/ui/device/OTAStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/sma/smartv3/ui/device/OTAStatus;

.field public static final enum NONE:Lcom/sma/smartv3/ui/device/OTAStatus;

.field public static final enum UPGRADEING:Lcom/sma/smartv3/ui/device/OTAStatus;

.field public static final enum UPGRADE_CHECKING:Lcom/sma/smartv3/ui/device/OTAStatus;

.field public static final enum UPGRADE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

.field public static final enum UPGRADE_PREPARE:Lcom/sma/smartv3/ui/device/OTAStatus;

.field public static final enum UPGRADE_PREPARE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

.field public static final enum UPGRADE_SCANNING_START:Lcom/sma/smartv3/ui/device/OTAStatus;

.field public static final enum UPGRADE_SCANNING_STOP:Lcom/sma/smartv3/ui/device/OTAStatus;

.field public static final enum UPGRADE_SCANNING_TIMEOUT:Lcom/sma/smartv3/ui/device/OTAStatus;

.field public static final enum UPGRADE_START:Lcom/sma/smartv3/ui/device/OTAStatus;

.field public static final enum UPGRADE_STOP:Lcom/sma/smartv3/ui/device/OTAStatus;


# direct methods
.method private static final synthetic $values()[Lcom/sma/smartv3/ui/device/OTAStatus;
    .locals 11

    sget-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->NONE:Lcom/sma/smartv3/ui/device/OTAStatus;

    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_SCANNING_START:Lcom/sma/smartv3/ui/device/OTAStatus;

    sget-object v2, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_SCANNING_TIMEOUT:Lcom/sma/smartv3/ui/device/OTAStatus;

    sget-object v3, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_SCANNING_STOP:Lcom/sma/smartv3/ui/device/OTAStatus;

    sget-object v4, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE:Lcom/sma/smartv3/ui/device/OTAStatus;

    sget-object v5, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    sget-object v6, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_START:Lcom/sma/smartv3/ui/device/OTAStatus;

    sget-object v7, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_CHECKING:Lcom/sma/smartv3/ui/device/OTAStatus;

    sget-object v8, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADEING:Lcom/sma/smartv3/ui/device/OTAStatus;

    sget-object v9, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_STOP:Lcom/sma/smartv3/ui/device/OTAStatus;

    sget-object v10, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    filled-new-array/range {v0 .. v10}, [Lcom/sma/smartv3/ui/device/OTAStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/sma/smartv3/ui/device/OTAStatus;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/device/OTAStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->NONE:Lcom/sma/smartv3/ui/device/OTAStatus;

    new-instance v0, Lcom/sma/smartv3/ui/device/OTAStatus;

    const-string v1, "UPGRADE_SCANNING_START"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/device/OTAStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_SCANNING_START:Lcom/sma/smartv3/ui/device/OTAStatus;

    new-instance v0, Lcom/sma/smartv3/ui/device/OTAStatus;

    const-string v1, "UPGRADE_SCANNING_TIMEOUT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/device/OTAStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_SCANNING_TIMEOUT:Lcom/sma/smartv3/ui/device/OTAStatus;

    new-instance v0, Lcom/sma/smartv3/ui/device/OTAStatus;

    const-string v1, "UPGRADE_SCANNING_STOP"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/device/OTAStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_SCANNING_STOP:Lcom/sma/smartv3/ui/device/OTAStatus;

    new-instance v0, Lcom/sma/smartv3/ui/device/OTAStatus;

    const-string v1, "UPGRADE_PREPARE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/device/OTAStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE:Lcom/sma/smartv3/ui/device/OTAStatus;

    new-instance v0, Lcom/sma/smartv3/ui/device/OTAStatus;

    const-string v1, "UPGRADE_PREPARE_FAILED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/device/OTAStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    new-instance v0, Lcom/sma/smartv3/ui/device/OTAStatus;

    const-string v1, "UPGRADE_START"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/device/OTAStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_START:Lcom/sma/smartv3/ui/device/OTAStatus;

    new-instance v0, Lcom/sma/smartv3/ui/device/OTAStatus;

    const-string v1, "UPGRADE_CHECKING"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/device/OTAStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_CHECKING:Lcom/sma/smartv3/ui/device/OTAStatus;

    new-instance v0, Lcom/sma/smartv3/ui/device/OTAStatus;

    const-string v1, "UPGRADEING"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/device/OTAStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADEING:Lcom/sma/smartv3/ui/device/OTAStatus;

    new-instance v0, Lcom/sma/smartv3/ui/device/OTAStatus;

    const-string v1, "UPGRADE_STOP"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/device/OTAStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_STOP:Lcom/sma/smartv3/ui/device/OTAStatus;

    new-instance v0, Lcom/sma/smartv3/ui/device/OTAStatus;

    const-string v1, "UPGRADE_FAILED"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/ui/device/OTAStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {}, Lcom/sma/smartv3/ui/device/OTAStatus;->$values()[Lcom/sma/smartv3/ui/device/OTAStatus;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->$VALUES:[Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->iO([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->$ENTRIES:Lkotlin/enums/EnumEntries;

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
            "Lcom/sma/smartv3/ui/device/OTAStatus;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sma/smartv3/ui/device/OTAStatus;
    .locals 1

    const-class v0, Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/ui/device/OTAStatus;

    return-object p0
.end method

.method public static values()[Lcom/sma/smartv3/ui/device/OTAStatus;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->$VALUES:[Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/sma/smartv3/ui/device/OTAStatus;

    return-object v0
.end method
