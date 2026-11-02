.class public final synthetic Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;
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

    invoke-static {}, Lcom/sma/smartv3/ui/device/OTAStatus;->values()[Lcom/sma/smartv3/ui/device/OTAStatus;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_SCANNING_TIMEOUT:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    sput-object v0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$OXO1;->OXO1:[I

    return-void
.end method
