.class public final synthetic Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;
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
    .locals 4

    invoke-static {}, Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;->values()[Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;->DISCONNECTED:Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v2, 0x2

    :try_start_1
    sget-object v3, Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;->READY:Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v2, v0, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    sput-object v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$OXO1;->OXO1:[I

    invoke-static {}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$FileType;->values()[Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$FileType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_2
    sget-object v3, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$FileType;->FIRMWARE:Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$FileType;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v1, v0, v3
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$FileType;->UI_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$FileType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$FileType;->LANGUAGE_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$FileType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    sput-object v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$OXO1;->XIi00iiXO:[I

    return-void
.end method
