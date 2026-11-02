.class public final Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;
.super Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$FileType;,
        Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFirmwareUpgradeSmaActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareUpgradeSmaActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,591:1\n15#2:592\n15#2:593\n1#3:594\n*S KotlinDebug\n*F\n+ 1 FirmwareUpgradeSmaActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity\n*L\n143#1:592\n144#1:593\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFirmwareUpgradeSmaActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareUpgradeSmaActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,591:1\n15#2:592\n15#2:593\n1#3:594\n*S KotlinDebug\n*F\n+ 1 FirmwareUpgradeSmaActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity\n*L\n143#1:592\n144#1:593\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isReconnect:Z

.field private isUpgradeDoneOTAFile:Z

.field private isUseDfuAddress:Z

.field private mBleHandleCallback:Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCurrentFirmware:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCurrentGps:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCurrentLanguage:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCurrentNetwork:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCurrentUi:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mDownloaded:I

.field private final mLatestExtraPacks:Lcom/sma/smartv3/model/ExtraPackVersions;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mLatestGpsFirmware:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mLatestNetworkFirmware:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mOTAStatus:Lcom/sma/smartv3/ui/device/OTAStatus;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mOtaFailedPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mReconnectCount:I

.field private final mSteps:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$FileType;",
            ">;"
        }
    .end annotation
.end field

.field private mStepsIndex:I


# direct methods
.method public constructor <init>()V
    .locals 9

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;-><init>()V

    const-string v0, "UpgradeJ"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->TAG:Ljava/lang/String;

    sget-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->NONE:Lcom/sma/smartv3/ui/device/OTAStatus;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mOTAStatus:Lcom/sma/smartv3/ui/device/OTAStatus;

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$XIi00iiXO;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/FirmwareVersion;

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/sma/smartv3/model/ExtraPackVersions;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/ExtraPackVersions;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestExtraPacks:Lcom/sma/smartv3/model/ExtraPackVersions;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ExtraPackVersions;->getUiPackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    iput-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ExtraPackVersions;->getLanguagePackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    iput-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ExtraPackVersions;->getFontPackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, v1

    :goto_2
    iput-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ExtraPackVersions;->getGpsFirmwareVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v2

    goto :goto_3

    :cond_3
    move-object v2, v1

    :goto_3
    iput-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestGpsFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ExtraPackVersions;->getNetworkFirmwareVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v1

    :cond_4
    iput-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestNetworkFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    sget-object v2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v3, Lcom/szabh/smable3/BleKey;->FIRMWARE_VERSION:Lcom/szabh/smable3/BleKey;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mCurrentFirmware:Ljava/lang/String;

    sget-object v3, Lcom/szabh/smable3/BleKey;->UI_PACK_VERSION:Lcom/szabh/smable3/BleKey;

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mCurrentUi:Ljava/lang/String;

    sget-object v3, Lcom/szabh/smable3/BleKey;->LANGUAGE_PACK_VERSION:Lcom/szabh/smable3/BleKey;

    const/16 v7, 0xc

    const/4 v8, 0x0

    const-class v4, Lcom/szabh/smable3/entity/BleLanguagePackVersion;

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lcom/szabh/smable3/component/BaseBleCache;->getObjectNotNull$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleLanguagePackVersion;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->getMVersion()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mCurrentLanguage:Ljava/lang/String;

    sget-object v3, Lcom/szabh/smable3/BleKey;->GPS_FIRMWARE_VERSION:Lcom/szabh/smable3/BleKey;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mCurrentGps:Ljava/lang/String;

    sget-object v3, Lcom/szabh/smable3/BleKey;->NETWORK_FIRMWARE_VERSION:Lcom/szabh/smable3/BleKey;

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mCurrentNetwork:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mSteps:Ljava/util/List;

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)V

    return-void
.end method

.method public static synthetic OII()V
    .locals 0

    invoke-static {}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->upgrade$lambda$3()V

    return-void
.end method

.method public static synthetic OX()V
    .locals 0

    invoke-static {}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->upgrade$lambda$1()V

    return-void
.end method

.method public static synthetic OiIIX101O()V
    .locals 0

    invoke-static {}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->upgrade$lambda$2()V

    return-void
.end method

.method public static synthetic X01IiOiIi()V
    .locals 0

    invoke-static {}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->upgrade$lambda$4()V

    return-void
.end method

.method public static synthetic XX0()V
    .locals 0

    invoke-static {}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->upgrade$lambda$0()V

    return-void
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->showOtaFailedPopup$lambda$0$0(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$checkDownload(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->checkDownload()V

    return-void
.end method

.method public static final synthetic access$getMDownloaded$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mDownloaded:I

    return p0
.end method

.method public static final synthetic access$getMLatestFirmware$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMLatestFont$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMLatestGpsFirmware$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestGpsFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMLatestLanguage$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMLatestUi$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMSteps$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mSteps:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mStepsIndex:I

    return p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$setMDownloaded$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mDownloaded:I

    return-void
.end method

.method public static final synthetic access$setMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mStepsIndex:I

    return-void
.end method

.method public static final synthetic access$upgrade(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->upgrade()V

    return-void
.end method

.method private final canOTA(Lcom/sma/smartv3/ui/device/OTAStatus;)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->isOTAError(Lcom/sma/smartv3/ui/device/OTAStatus;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_STOP:Lcom/sma/smartv3/ui/device/OTAStatus;

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final checkDownload()V
    .locals 5

    iget v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mDownloaded:I

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mSteps:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const v3, 0x7f141117

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    const-string v0, "checkDownload done start upgrade"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->upgrade()V

    :cond_0
    return-void
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->updateUpgradeStatus$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)V
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->onBottomClick(Landroid/view/View;)V

    return-void
.end method

.method private final isOTAError(Lcom/sma/smartv3/ui/device/OTAStatus;)Z
    .locals 2

    sget-object v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$OXO1;->XIi00iiXO:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    const/4 v1, 0x3

    if-eq p1, v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    return v0
.end method

.method private final showOtaFailedPopup()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mOtaFailedPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    const v1, 0x7f140bf6

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    invoke-static {v0, v3, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IOI0I1iI;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/IOI0I1iI;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)V

    const v2, 0x7f14034b

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mOtaFailedPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mOtaFailedPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mOtaFailedPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    return-void
.end method

.method private static final showOtaFailedPopup$lambda$0$0(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->onBottomClick(Landroid/view/View;)V

    const/4 p0, 0x1

    return p0
.end method

.method private final updateUpgradeStatus(Lcom/sma/smartv3/ui/device/OTAStatus;Ljava/lang/String;)V
    .locals 11

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " updateUpgradeStatus status -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mOTAStatus:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->isOTAError(Lcom/sma/smartv3/ui/device/OTAStatus;)Z

    move-result p1

    const/4 v1, 0x1

    if-eqz p1, :cond_4

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->isReconnect:Z

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v2

    sget-object v3, Lcom/android/mltcode/paycertificationapi/OOX00;->OXO1:Lcom/android/mltcode/paycertificationapi/OOX00;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/OOX00;->O00()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, p1, v4, v5}, Lcom/sma/smartv3/view/ProgressButton;->IiI10X(Lcom/sma/smartv3/view/ProgressButton;Ljava/lang/String;ZILjava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->isAutoUpdate()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0, p2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->upgradeFailed(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-boolean p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->isReconnect:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->TAG:Ljava/lang/String;

    iget v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mReconnectCount:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " updateUpgradeStatus , isReconnect count = "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    iget p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mReconnectCount:I

    add-int/2addr p1, v1

    iput p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mReconnectCount:I

    const/4 v0, 0x5

    if-le p1, v0, :cond_2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->showOtaFailedPopup()V

    goto :goto_0

    :cond_2
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IIO11iXXI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IIO11iXXI;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)V

    const-wide/16 v1, 0x7d0

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_3
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->showOtaFailedPopup()V

    :goto_0
    const/16 v9, 0x1c

    const/4 v10, 0x0

    const-string v4, "-1"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    move-object v5, p2

    invoke-static/range {v3 .. v10}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->uploadOtaRecord$default(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_4
    move-object v3, p0

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    return-void
.end method

.method public static synthetic updateUpgradeStatus$default(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, ""

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->updateUpgradeStatus(Lcom/sma/smartv3/ui/device/OTAStatus;Ljava/lang/String;)V

    return-void
.end method

.method private static final updateUpgradeStatus$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)V
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->onBottomClick(Landroid/view/View;)V

    return-void
.end method

.method private final upgrade()V
    .locals 10

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->TAG:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mSteps:Ljava/util/List;

    iget v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mStepsIndex:I

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " upgrade "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v1

    const v3, 0x7f1412ba

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v1, v3, v2, v4, v5}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object v1

    iget v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mStepsIndex:I

    add-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mSteps:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    const v3, 0x7f14146e

    invoke-virtual {p0, v3, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mSteps:Ljava/util/List;

    iget v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mStepsIndex:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$FileType;

    sget-object v2, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$OXO1;->OXO1:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const-wide/16 v2, 0xfa0

    packed-switch v1, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " network_firmware"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {p0, v0, v5, v4, v5}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->updateUpgradeStatus$default(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :pswitch_1
    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " gps_firmware"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v4, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v5, Lcom/szabh/smable3/BleKey;->GPS_FIRMWARE_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v6, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestGpsFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v6, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Ljava/io/File;IILjava/lang/Object;)Z

    return-void

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XI0I0Ii;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/XI0I0Ii;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :pswitch_2
    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ota_pack"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v4, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v5, Lcom/szabh/smable3/BleKey;->OTA_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v6, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v6, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Ljava/io/File;IILjava/lang/Object;)Z

    return-void

    :cond_1
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OOXO0;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/OOXO0;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :pswitch_3
    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " font_pack"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v4, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v5, Lcom/szabh/smable3/BleKey;->FONT_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v6, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v6, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Ljava/io/File;IILjava/lang/Object;)Z

    return-void

    :cond_2
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IiiXXIO0;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/IiiXXIO0;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :pswitch_4
    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " language_file"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v4, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v5, Lcom/szabh/smable3/BleKey;->LANGUAGE_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v6, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v6, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Ljava/io/File;IILjava/lang/Object;)Z

    return-void

    :cond_3
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i1IX1IX01;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/i1IX1IX01;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :pswitch_5
    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ui_file"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v4, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v5, Lcom/szabh/smable3/BleKey;->UI_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v6, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v6, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Ljava/io/File;IILjava/lang/Object;)Z

    return-void

    :cond_4
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i11iII1;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/i11iII1;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :pswitch_6
    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " firmware"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->isUseDfuAddress:Z

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " upgrade -> use dfuAddress"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " upgrade -> use bleAddress"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :goto_0
    sget-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {p0, v0, v5, v4, v5}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->updateUpgradeStatus$default(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static final upgrade$lambda$0()V
    .locals 1

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->launch()V

    return-void
.end method

.method private static final upgrade$lambda$1()V
    .locals 1

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->launch()V

    return-void
.end method

.method private static final upgrade$lambda$2()V
    .locals 1

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->launch()V

    return-void
.end method

.method private static final upgrade$lambda$3()V
    .locals 1

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->launch()V

    return-void
.end method

.method private static final upgrade$lambda$4()V
    .locals 1

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->launch()V

    return-void
.end method

.method private final upgradeFailed(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const-string v0, "FRIMWARE_UPGRADE_DONE"

    invoke-static {v0, p1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getMReconnectCount()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mReconnectCount:I

    return v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "firmware_upgrade_failed"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$XIi00iiXO;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initView()V
    .locals 14

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->initView()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->TAG:Ljava/lang/String;

    invoke-static {}, Lcom/sma/smartv3/util/UtilsKt;->X0i1O()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " Server -> "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->TAG:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " Firmware -> "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->TAG:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestExtraPacks:Lcom/sma/smartv3/model/ExtraPackVersions;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ExtraPacks -> "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    const-string v2, "."

    const v3, 0x7f14148f

    if-nez v1, :cond_0

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v4, :cond_0

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v4, :cond_0

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v4, :cond_0

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestGpsFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v4, :cond_0

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestNetworkFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v4, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mCurrentFirmware:Ljava/lang/String;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mCurrentUi:Ljava/lang/String;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v5, "."

    const-string v6, ""

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mCurrentLanguage:Ljava/lang/String;

    const-string v5, "."

    const-string v6, ""

    invoke-static/range {v4 .. v9}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mCurrentGps:Ljava/lang/String;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v6, "."

    const-string v7, ""

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvLatest()Landroid/widget/TextView;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v3, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvCurrent()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    :cond_1
    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mCurrentFirmware:Ljava/lang/String;

    :cond_2
    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    move-object v5, v4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mCurrentUi:Ljava/lang/String;

    goto :goto_0

    :goto_2
    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v6, "."

    const-string v7, ""

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    move-object v6, v5

    goto :goto_5

    :cond_6
    :goto_4
    iget-object v5, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mCurrentLanguage:Ljava/lang/String;

    goto :goto_3

    :goto_5
    const/4 v10, 0x4

    const/4 v11, 0x0

    const-string v7, "."

    const-string v8, ""

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestGpsFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_7

    goto :goto_7

    :cond_7
    :goto_6
    move-object v7, v6

    goto :goto_8

    :cond_8
    :goto_7
    iget-object v6, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mCurrentGps:Ljava/lang/String;

    goto :goto_6

    :goto_8
    const/4 v11, 0x4

    const/4 v12, 0x0

    const-string v8, "."

    const-string v9, ""

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestNetworkFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v7, :cond_a

    invoke-virtual {v7}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_9

    goto :goto_a

    :cond_9
    :goto_9
    move-object v8, v7

    goto :goto_b

    :cond_a
    :goto_a
    iget-object v7, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mCurrentNetwork:Ljava/lang/String;

    goto :goto_9

    :goto_b
    const/4 v12, 0x4

    const/4 v13, 0x0

    const-string v9, "."

    const-string v10, ""

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvLatest()Landroid/widget/TextView;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->TAG:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvLatest()Landroid/widget/TextView;

    move-result-object v5

    invoke-virtual {v5}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " latest -> "

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mCurrentUi:Ljava/lang/String;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v6, "."

    const-string v7, ""

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mCurrentLanguage:Ljava/lang/String;

    const-string v6, "."

    const-string v7, ""

    invoke-static/range {v5 .. v10}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mCurrentGps:Ljava/lang/String;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const-string v7, "."

    const-string v8, ""

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mCurrentNetwork:Ljava/lang/String;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-string v8, "."

    const-string v9, ""

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvCurrent()Landroid/widget/TextView;

    move-result-object v8

    iget-object v9, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mCurrentFirmware:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v3, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->TAG:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvCurrent()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " current -> "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mCurrentFirmware:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMCurrentVersion(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMTargetVersion(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_c

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iiOOI()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mSteps:Ljava/util/List;

    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$FileType;->OTA_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$FileType;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_b
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mSteps:Ljava/util/List;

    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$FileType;->FIRMWARE:Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$FileType;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_c
    :goto_c
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mSteps:Ljava/util/List;

    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$FileType;->LANGUAGE_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$FileType;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_d
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_e

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mSteps:Ljava/util/List;

    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$FileType;->UI_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$FileType;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_e
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_f

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mSteps:Ljava/util/List;

    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$FileType;->FONT_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$FileType;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_f
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestGpsFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_10

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mSteps:Ljava/util/List;

    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$FileType;->GPS_FIRMWARE:Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$FileType;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_10
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestNetworkFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mSteps:Ljava/util/List;

    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$FileType;->NETWORK_FIRMWARE:Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$FileType;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_11
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140d57

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->isAutoUpdate()Z

    move-result v0

    if-eqz v0, :cond_12

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XX0i01;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/XX0i01;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_12
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Lcom/sma/smartv3/model/FirmwareVersion;->getUpdateDesc()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_14

    invoke-static {v0}, Lkotlin/text/StringsKt__StringsKt;->i0XI0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_13

    goto :goto_d

    :cond_13
    const/4 v0, 0x0

    :goto_d
    if-eqz v0, :cond_14

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvUpdateDesc()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_14
    return-void
.end method

.method public isNeedLaunch()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->isUpgradeDoneOTAFile:Z

    return v0
.end method

.method public final isReconnect()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->isReconnect:Z

    return v0
.end method

.method public final isUpgradeDoneOTAFile()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->isUpgradeDoneOTAFile:Z

    return v0
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 5
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const-string p1, "Bluetooth is off!"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iput v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mDownloaded:I

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const v4, 0x7f140476

    invoke-static {v1, v4, v0, v2, v3}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    iget v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mStepsIndex:I

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mDownloaded:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mDownloaded:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->checkDownload()V

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " download firmware"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v2

    const-string v3, "getParent(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v3, "getName(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$onBottomClick$1;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$onBottomClick$1;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)V

    invoke-virtual {p1, v1, v2, v0, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_3

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$onBottomClick$2;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$onBottomClick$2;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_3
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_4

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$onBottomClick$3;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$onBottomClick$3;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_4
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_5

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$onBottomClick$4;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$onBottomClick$4;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_5
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestGpsFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_6

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestGpsFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$onBottomClick$5;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$onBottomClick$5;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_6
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestNetworkFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_7

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestNetworkFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$onBottomClick$6;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$onBottomClick$6;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_7
    return-void

    :cond_8
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->upgrade()V

    return-void
.end method

.method public onDestroy()V
    .locals 5

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity$XIi00iiXO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mSteps:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-nez v1, :cond_0

    iget v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mStepsIndex:I

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mSteps:Ljava/util/List;

    invoke-static {v4}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result v4

    if-ne v1, v4, :cond_0

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v4, Lcom/szabh/smable3/BleKey;->UI_FILE:Lcom/szabh/smable3/BleKey;

    invoke-static {v1, v4, v3, v2, v3}, Lcom/szabh/smable3/component/BaseBleCache;->remove$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->closeConnection(Z)V

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const/4 v1, 0x0

    const-string v4, "firmware_upgrade_failed"

    invoke-virtual {v0, v4, v1}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v4, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    :cond_1
    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->onDestroy()V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mOtaFailedPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getMStarted()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "firmware_upgrade_failed"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->showOtaFailedPopup()V

    return-void

    :cond_1
    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->onHandleBackPressed()V

    return-void
.end method

.method public final setMReconnectCount(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mReconnectCount:I

    return-void
.end method

.method public final setReconnect(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->isReconnect:Z

    return-void
.end method

.method public final setUpgradeDoneOTAFile(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->isUpgradeDoneOTAFile:Z

    return-void
.end method

.method public final upgradeDone()V
    .locals 9

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iiOOI()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->isUpgradeDoneOTAFile:Z

    const v0, 0x7f1412e8

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    goto :goto_0

    :cond_0
    const v0, 0x7f14146f

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->updateDeviceInfo(Ljava/lang/String;)V

    :cond_1
    const/16 v7, 0x1e

    const/4 v8, 0x0

    const-string v2, "0"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v8}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->uploadOtaRecord$default(Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    iget-object v0, v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/sma/smartv3/model/FirmwareVersion;->getFlag()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v3, "unbind"

    invoke-static {v3, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "show_device_unbind_popup"

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    :cond_2
    const-string v0, "FRIMWARE_UPGRADE_DONE"

    const-string v2, "done"

    invoke-static {v0, v2}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
