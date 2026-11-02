.class public final Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;
.super Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$FileType;,
        Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperUpgradeRSmaActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperUpgradeRSmaActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,611:1\n19#2:612\n15#2:613\n15#2:614\n15#2:615\n19#2:616\n15#2:617\n11#2,2:618\n*S KotlinDebug\n*F\n+ 1 DeveloperUpgradeRSmaActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity\n*L\n53#1:612\n53#1:613\n243#1:614\n244#1:615\n298#1:616\n298#1:617\n604#1:618,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperUpgradeRSmaActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperUpgradeRSmaActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,611:1\n19#2:612\n15#2:613\n15#2:614\n15#2:615\n19#2:616\n15#2:617\n11#2,2:618\n*S KotlinDebug\n*F\n+ 1 DeveloperUpgradeRSmaActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity\n*L\n53#1:612\n53#1:613\n243#1:614\n244#1:615\n298#1:616\n298#1:617\n604#1:618,2\n*E\n"
    }
.end annotation


# instance fields
.field private final alreadyUpdateDeviceList:Lcom/android/mltcode/paycertificationapi/OIOO0X00O;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final deviceAddress:Ljava/lang/String;

.field private isAutoShutdown:Z

.field private isStartShutdown:Z

.field private lastPackageSize:I

.field private mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCurrentFirmware:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCurrentLanguage:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCurrentUi:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mDfuCallback:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$iO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mDfuConfig:Lcom/realsil/sdk/dfu/model/DfuConfig;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mDfuHelper$delegate:Lkotlin/Lazy;
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

.field private final mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mOtaDeviceInfo:Lcom/realsil/sdk/dfu/model/OtaDeviceInfo;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mSteps:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$FileType;",
            ">;"
        }
    .end annotation
.end field

.field private mStepsIndex:I

.field private time1:J


# direct methods
.method public constructor <init>()V
    .locals 11

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;-><init>()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4, v3}, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;-><init>(Ljava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    const-class v6, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1, v6}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    iput-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->alreadyUpdateDeviceList:Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "TEST_MODE_OTA_DEVICE_ADDRESS"

    invoke-virtual {v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->deviceAddress:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    const-string v5, "DEVELOPER_AUTO_SHUTDOWN"

    const/4 v6, 0x0

    invoke-virtual {v2, v5, v6}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->isAutoShutdown:Z

    new-instance v2, Lcom/android/mltcode/paycertificationapi/i1Oi11XIi;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/i1Oi11XIi;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    invoke-static {v2}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v2

    iput-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mDfuHelper$delegate:Lkotlin/Lazy;

    new-instance v2, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$iO;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$iO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    iput-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mDfuCallback:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$iO;

    new-instance v2, Lcom/realsil/sdk/dfu/model/DfuConfig;

    invoke-direct {v2}, Lcom/realsil/sdk/dfu/model/DfuConfig;-><init>()V

    invoke-virtual {v2, v1}, Lcom/realsil/sdk/dfu/model/DfuConfig;->setAddress(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Lcom/realsil/sdk/dfu/model/DfuConfig;->setAutomaticActiveEnabled(Z)V

    invoke-virtual {v2, v6}, Lcom/realsil/sdk/dfu/model/DfuConfig;->setFileLocation(I)V

    invoke-virtual {v2, v6}, Lcom/realsil/sdk/dfu/model/DfuConfig;->setVersionCheckEnabled(Z)V

    iput-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mDfuConfig:Lcom/realsil/sdk/dfu/model/DfuConfig;

    new-instance v1, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$XIi00iiXO;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/FirmwareVersion;

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/sma/smartv3/model/ExtraPackVersions;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/ExtraPackVersions;

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestExtraPacks:Lcom/sma/smartv3/model/ExtraPackVersions;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ExtraPackVersions;->getUiPackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v3

    :goto_1
    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ExtraPackVersions;->getLanguagePackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v3

    :goto_2
    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ExtraPackVersions;->getFontPackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v3

    :cond_3
    iput-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

    sget-object v4, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v5, Lcom/szabh/smable3/BleKey;->FIRMWARE_VERSION:Lcom/szabh/smable3/BleKey;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/szabh/smable3/component/BaseBleCache;->getString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mCurrentFirmware:Ljava/lang/String;

    sget-object v5, Lcom/szabh/smable3/BleKey;->UI_PACK_VERSION:Lcom/szabh/smable3/BleKey;

    invoke-static/range {v4 .. v9}, Lcom/szabh/smable3/component/BaseBleCache;->getString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mCurrentUi:Ljava/lang/String;

    sget-object v5, Lcom/szabh/smable3/BleKey;->LANGUAGE_PACK_VERSION:Lcom/szabh/smable3/BleKey;

    const/16 v9, 0xc

    const/4 v10, 0x0

    const-class v6, Lcom/szabh/smable3/entity/BleLanguagePackVersion;

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lcom/szabh/smable3/component/BaseBleCache;->getObjectNotNull$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleLanguagePackVersion;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->getMVersion()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mCurrentLanguage:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mSteps:Ljava/util/List;

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->upgrade$lambda$5(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    return-void
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->checkDownload$lambda$3(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    return-void
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->upgrade$lambda$3(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    return-void
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->upgradeDone$lambda$1(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    return-void
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->upgrade$lambda$1(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    return-void
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->checkDownload$lambda$5(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    return-void
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mDfuHelper_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$checkDownload(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->checkDownload()V

    return-void
.end method

.method public static final synthetic access$getLastPackageSize$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->lastPackageSize:I

    return p0
.end method

.method public static final synthetic access$getMDfuHelper(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMDownloaded$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mDownloaded:I

    return p0
.end method

.method public static final synthetic access$getMLatestFont$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMLatestLanguage$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMLatestUi$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)Lcom/android/mltcode/paycertificationapi/uq;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    return-object p0
.end method

.method public static final synthetic access$getMSteps$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mSteps:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getMStepsIndex$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mStepsIndex:I

    return p0
.end method

.method public static final synthetic access$getProgressButton(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)Lcom/sma/smartv3/view/ProgressButton;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTime1$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->time1:J

    return-wide v0
.end method

.method public static final synthetic access$getTvSpeed(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvSpeed()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTvStep(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$isStartShutdown$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->isStartShutdown:Z

    return p0
.end method

.method public static final synthetic access$setLastPackageSize$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->lastPackageSize:I

    return-void
.end method

.method public static final synthetic access$setMDownloaded$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mDownloaded:I

    return-void
.end method

.method public static final synthetic access$setMStarted(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    return-void
.end method

.method public static final synthetic access$setMStepsIndex$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mStepsIndex:I

    return-void
.end method

.method public static final synthetic access$setTime1$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->time1:J

    return-void
.end method

.method public static final synthetic access$startOtaProcess(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->startOtaProcess()V

    return-void
.end method

.method public static final synthetic access$upgrade(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->upgrade()V

    return-void
.end method

.method public static final synthetic access$upgradeDone(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->upgradeDone()V

    return-void
.end method

.method public static final synthetic access$upgradeExit(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->upgradeExit()V

    return-void
.end method

.method private final checkDownload()V
    .locals 10

    iget v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mDownloaded:I

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mSteps:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_a

    const-string v0, "checkDownload"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x7f141117

    const/4 v4, 0x2

    invoke-static {v0, v3, v1, v4, v2}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mSteps:Ljava/util/List;

    iget v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mStepsIndex:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$FileType;

    sget-object v1, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$OXO1;->OXO1:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_9

    const-wide/16 v1, 0xfa0

    if-eq v0, v4, :cond_6

    const/4 v3, 0x3

    if-eq v0, v3, :cond_3

    const/4 v3, 0x4

    if-ne v0, v3, :cond_2

    sget-object v4, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v5, Lcom/szabh/smable3/BleKey;->FONT_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v6, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

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
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->abort()Z

    invoke-virtual {v0}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->close()V

    :cond_1
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/XXI1;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/XXI1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_3
    move-wide v2, v1

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v2, Lcom/szabh/smable3/BleKey;->LANGUAGE_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v3, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v4, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Ljava/io/File;IILjava/lang/Object;)Z

    return-void

    :cond_4
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->abort()Z

    invoke-virtual {v0}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->close()V

    :cond_5
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OOXIOiO;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OOXIOiO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_6
    move-wide v2, v1

    sget-object v4, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v5, Lcom/szabh/smable3/BleKey;->UI_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v6, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v6, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Ljava/io/File;IILjava/lang/Object;)Z

    return-void

    :cond_7
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->abort()Z

    invoke-virtual {v0}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->close()V

    :cond_8
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iOIOX1i;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/iOIOX1i;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_9
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mDfuCallback:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$iO;

    invoke-virtual {v0, v1}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->initialize(Lcom/realsil/sdk/dfu/utils/DfuAdapter$DfuHelperCallback;)Z

    :cond_a
    return-void
.end method

.method private static final checkDownload$lambda$1(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->deviceAddress:Ljava/lang/String;

    const-string v1, "deviceAddress"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setAddress(Ljava/lang/String;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    return-void
.end method

.method private static final checkDownload$lambda$3(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->deviceAddress:Ljava/lang/String;

    const-string v1, "deviceAddress"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setAddress(Ljava/lang/String;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    return-void
.end method

.method private static final checkDownload$lambda$5(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->deviceAddress:Ljava/lang/String;

    const-string v1, "deviceAddress"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setAddress(Ljava/lang/String;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    return-void
.end method

.method private final getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mDfuHelper$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    return-object v0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->checkDownload$lambda$1(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    return-void
.end method

.method private static final mDfuHelper_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p0

    invoke-static {p0}, Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;->getInstance(Landroid/content/Context;)Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object p0

    return-object p0
.end method

.method private final otaConnect(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/realsil/sdk/dfu/utils/ConnectParams$Builder;

    invoke-direct {v0}, Lcom/realsil/sdk/dfu/utils/ConnectParams$Builder;-><init>()V

    invoke-virtual {v0, p1}, Lcom/realsil/sdk/dfu/utils/ConnectParams$Builder;->address(Ljava/lang/String;)Lcom/realsil/sdk/dfu/utils/ConnectParams$Builder;

    move-result-object p1

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/realsil/sdk/dfu/utils/ConnectParams$Builder;->reconnectTimes(I)Lcom/realsil/sdk/dfu/utils/ConnectParams$Builder;

    move-result-object p1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object v0

    invoke-virtual {p1}, Lcom/realsil/sdk/dfu/utils/ConnectParams$Builder;->build()Lcom/realsil/sdk/dfu/utils/ConnectParams;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;->connectDevice(Lcom/realsil/sdk/dfu/utils/ConnectParams;)Z

    return-void
.end method

.method private final startOtaProcess()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mDfuConfig:Lcom/realsil/sdk/dfu/model/DfuConfig;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/realsil/sdk/dfu/model/DfuConfig;->setOtaWorkMode(I)V

    new-instance v1, Ljava/io/File;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/realsil/sdk/dfu/model/DfuConfig;->setFilePath(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mOtaDeviceInfo:Lcom/realsil/sdk/dfu/model/OtaDeviceInfo;

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v2, v3}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->startOtaProcedure(Lcom/realsil/sdk/dfu/model/DfuConfig;Lcom/realsil/sdk/dfu/model/OtaDeviceInfo;Z)Z

    :cond_0
    return-void
.end method

.method private final upgrade()V
    .locals 10

    const-string v0, "upgrade"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    const/4 v2, 0x0

    const v3, 0x7f1412ba

    const/4 v4, 0x2

    invoke-static {v0, v3, v1, v4, v2}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mStepsIndex:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mSteps:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v1, v3}, [Ljava/lang/Object;

    move-result-object v1

    const v3, 0x7f14146e

    invoke-virtual {p0, v3, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mSteps:Ljava/util/List;

    iget v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mStepsIndex:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$FileType;

    sget-object v1, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$OXO1;->OXO1:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v2, :cond_9

    const-wide/16 v1, 0xfa0

    if-eq v0, v4, :cond_6

    const/4 v3, 0x3

    if-eq v0, v3, :cond_3

    const/4 v3, 0x4

    if-ne v0, v3, :cond_2

    sget-object v4, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v5, Lcom/szabh/smable3/BleKey;->FONT_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v6, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

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
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->abort()Z

    invoke-virtual {v0}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->close()V

    :cond_1
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/XX1IOII1X;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/XX1IOII1X;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_3
    move-wide v2, v1

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v2, Lcom/szabh/smable3/BleKey;->LANGUAGE_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v3, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v4, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Ljava/io/File;IILjava/lang/Object;)Z

    return-void

    :cond_4
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->abort()Z

    invoke-virtual {v0}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->close()V

    :cond_5
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OO010XXO;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OO010XXO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_6
    move-wide v2, v1

    sget-object v4, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v5, Lcom/szabh/smable3/BleKey;->UI_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v6, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v6, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Ljava/io/File;IILjava/lang/Object;)Z

    return-void

    :cond_7
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->abort()Z

    invoke-virtual {v0}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->close()V

    :cond_8
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IXi01III;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/IXi01III;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_9
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->deviceAddress:Ljava/lang/String;

    const-string v1, "deviceAddress"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->otaConnect(Ljava/lang/String;)V

    return-void
.end method

.method private static final upgrade$lambda$1(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->deviceAddress:Ljava/lang/String;

    const-string v1, "deviceAddress"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setAddress(Ljava/lang/String;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    return-void
.end method

.method private static final upgrade$lambda$3(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->deviceAddress:Ljava/lang/String;

    const-string v1, "deviceAddress"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setAddress(Ljava/lang/String;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    return-void
.end method

.method private static final upgrade$lambda$5(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->deviceAddress:Ljava/lang/String;

    const-string v1, "deviceAddress"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setAddress(Ljava/lang/String;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    return-void
.end method

.method private final upgradeDone()V
    .locals 9

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->isAutoShutdown:Z

    if-eqz v0, :cond_4

    const-string v0, "start shutdown"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->isStartShutdown:Z

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v2, Lcom/szabh/smable3/BleKey;->SHUTDOWN:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    return-void

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->abort()Z

    invoke-virtual {v0}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->close()V

    :cond_3
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O1OiiOI10;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/O1OiiOI10;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_4
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->upgradeExit()V

    return-void
.end method

.method private static final upgradeDone$lambda$1(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->deviceAddress:Ljava/lang/String;

    const-string v1, "deviceAddress"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setAddress(Ljava/lang/String;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    return-void
.end method

.method private final upgradeExit()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->alreadyUpdateDeviceList:Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;->XO0O10()Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->deviceAddress:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->alreadyUpdateDeviceList:Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    const-class v2, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v3, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method


# virtual methods
.method public final getMOtaDeviceInfo()Lcom/realsil/sdk/dfu/model/OtaDeviceInfo;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mOtaDeviceInfo:Lcom/realsil/sdk/dfu/model/OtaDeviceInfo;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$XIi00iiXO;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BaseBleConnector;->setNeedBind(Z)V

    return-void
.end method

.method public initView()V
    .locals 14

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->initView()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    const/4 v1, 0x0

    const-string v2, "000"

    const-string v3, "."

    const v4, 0x7f14148f

    if-nez v0, :cond_0

    iget-object v5, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v5, :cond_0

    iget-object v5, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v5, :cond_0

    iget-object v5, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v5, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mCurrentFirmware:Ljava/lang/String;

    iget-object v5, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mCurrentUi:Ljava/lang/String;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v6, "."

    const-string v7, ""

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mCurrentLanguage:Ljava/lang/String;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const-string v7, "."

    const-string v8, ""

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvLatest()Landroid/widget/TextView;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v4, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvCurrent()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_8

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mCurrentFirmware:Ljava/lang/String;

    :cond_2
    iget-object v5, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    move-object v6, v5

    goto :goto_2

    :cond_4
    :goto_1
    iget-object v5, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mCurrentUi:Ljava/lang/String;

    goto :goto_0

    :goto_2
    const/4 v10, 0x4

    const/4 v11, 0x0

    const-string v7, "."

    const-string v8, ""

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    move-object v7, v6

    goto :goto_5

    :cond_6
    :goto_4
    iget-object v6, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mCurrentLanguage:Ljava/lang/String;

    goto :goto_3

    :goto_5
    const/4 v11, 0x4

    const/4 v12, 0x0

    const-string v8, "."

    const-string v9, ""

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v7, :cond_8

    invoke-virtual {v7}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_7

    goto :goto_6

    :cond_7
    move-object v8, v7

    goto :goto_7

    :cond_8
    :goto_6
    move-object v8, v2

    :goto_7
    const/4 v12, 0x4

    const/4 v13, 0x0

    const-string v9, "."

    const-string v10, ""

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvLatest()Landroid/widget/TextView;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v4, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v8, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mCurrentUi:Ljava/lang/String;

    const-string v9, "."

    const-string v10, ""

    invoke-static/range {v8 .. v13}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v5, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mCurrentLanguage:Ljava/lang/String;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v6, "."

    const-string v7, ""

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvCurrent()Landroid/widget/TextView;

    move-result-object v5

    iget-object v6, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mCurrentFirmware:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v4, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mSteps:Ljava/util/List;

    sget-object v2, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$FileType;->FIRMWARE:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$FileType;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mSteps:Ljava/util/List;

    sget-object v2, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$FileType;->LANGUAGE_PACK:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$FileType;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_a
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mSteps:Ljava/util/List;

    sget-object v2, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$FileType;->UI_PACK:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$FileType;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_b
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mSteps:Ljava/util/List;

    sget-object v2, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$FileType;->FONT_PACK:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$FileType;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_c
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_8
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getDevInfo()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvAlreadyOta()Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v2, v4, v3, v4}, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;-><init>(Ljava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_d

    goto :goto_9

    :cond_d
    move-object v2, v1

    :goto_9
    check-cast v2, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;->XO0O10()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvInfo()Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "R sma"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->onBottomClick(Landroid/view/View;)V

    return-void
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 5
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->closeConnection(Z)V

    const/4 p1, 0x0

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mDownloaded:I

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const v4, 0x7f140476

    invoke-static {v1, v4, p1, v2, v3}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    iget p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mStepsIndex:I

    if-nez p1, :cond_8

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_1

    new-instance p1, Ljava/io/File;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mDownloaded:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mDownloaded:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->checkDownload()V

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$onBottomClick$1;

    invoke-direct {v4, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$onBottomClick$1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    invoke-virtual {p1, v2, v1, v3, v4}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_3

    new-instance p1, Ljava/io/File;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_2

    iget p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mDownloaded:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mDownloaded:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->checkDownload()V

    goto :goto_1

    :cond_2
    sget-object p1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$onBottomClick$2;

    invoke-direct {v4, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$onBottomClick$2;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    invoke-virtual {p1, v2, v1, v3, v4}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_5

    new-instance p1, Ljava/io/File;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_4

    iget p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mDownloaded:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mDownloaded:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->checkDownload()V

    goto :goto_2

    :cond_4
    sget-object p1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$onBottomClick$3;

    invoke-direct {v4, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$onBottomClick$3;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    invoke-virtual {p1, v2, v1, v3, v4}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_5
    :goto_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_7

    new-instance p1, Ljava/io/File;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_6

    iget p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mDownloaded:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mDownloaded:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->checkDownload()V

    return-void

    :cond_6
    sget-object p1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$onBottomClick$4;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$onBottomClick$4;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_7
    return-void

    :cond_8
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->upgrade()V

    return-void
.end method

.method public onDestroy()V
    .locals 6

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$XIi00iiXO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mSteps:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    iget v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mStepsIndex:I

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mSteps:Ljava/util/List;

    invoke-static {v3}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result v3

    if-ne v1, v3, :cond_0

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v3, Lcom/szabh/smable3/BleKey;->UI_FILE:Lcom/szabh/smable3/BleKey;

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-static {v1, v3, v4, v5, v4}, Lcom/szabh/smable3/component/BaseBleCache;->remove$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    sget-object v3, Lcom/szabh/smable3/BleKey;->LANGUAGE_FILE:Lcom/szabh/smable3/BleKey;

    invoke-static {v1, v3, v4, v5, v4}, Lcom/szabh/smable3/component/BaseBleCache;->remove$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    sget-object v3, Lcom/szabh/smable3/BleKey;->FONT_FILE:Lcom/szabh/smable3/BleKey;

    invoke-static {v1, v3, v4, v5, v4}, Lcom/szabh/smable3/component/BaseBleCache;->remove$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->closeConnection(Z)V

    :cond_0
    invoke-virtual {v0, v2}, Lcom/szabh/smable3/component/BaseBleConnector;->setNeedBind(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->abort()Z

    invoke-virtual {v0}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->close()V

    :cond_1
    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->onDestroy()V

    return-void
.end method

.method public final setMOtaDeviceInfo(Lcom/realsil/sdk/dfu/model/OtaDeviceInfo;)V
    .locals 0
    .param p1    # Lcom/realsil/sdk/dfu/model/OtaDeviceInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->mOtaDeviceInfo:Lcom/realsil/sdk/dfu/model/OtaDeviceInfo;

    return-void
.end method
