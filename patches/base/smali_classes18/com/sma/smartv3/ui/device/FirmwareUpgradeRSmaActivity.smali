.class public final Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;
.super Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$FileType;,
        Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFirmwareUpgradeRSmaActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareUpgradeRSmaActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,378:1\n15#2:379\n15#2:380\n*S KotlinDebug\n*F\n+ 1 FirmwareUpgradeRSmaActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity\n*L\n168#1:379\n169#1:380\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFirmwareUpgradeRSmaActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareUpgradeRSmaActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,378:1\n15#2:379\n15#2:380\n*S KotlinDebug\n*F\n+ 1 FirmwareUpgradeRSmaActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity\n*L\n168#1:379\n169#1:380\n*E\n"
    }
.end annotation


# instance fields
.field private mBleHandleCallback:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;
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

.field private final mDfuCallback:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$iO;
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

.field private final mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;
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
            "Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$FileType;",
            ">;"
        }
    .end annotation
.end field

.field private mStepsIndex:I


# direct methods
.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XOIIXOO1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XOIIXOO1;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mDfuHelper$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$iO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$iO;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mDfuCallback:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$iO;

    new-instance v0, Lcom/realsil/sdk/dfu/model/DfuConfig;

    invoke-direct {v0}, Lcom/realsil/sdk/dfu/model/DfuConfig;-><init>()V

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMDfuAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/realsil/sdk/dfu/model/DfuConfig;->setAddress(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/realsil/sdk/dfu/model/DfuConfig;->setAutomaticActiveEnabled(Z)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/realsil/sdk/dfu/model/DfuConfig;->setFileLocation(I)V

    invoke-virtual {v0, v2}, Lcom/realsil/sdk/dfu/model/DfuConfig;->setVersionCheckEnabled(Z)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mDfuConfig:Lcom/realsil/sdk/dfu/model/DfuConfig;

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/FirmwareVersion;

    iput-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/sma/smartv3/model/ExtraPackVersions;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/ExtraPackVersions;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestExtraPacks:Lcom/sma/smartv3/model/ExtraPackVersions;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ExtraPackVersions;->getUiPackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    iput-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ExtraPackVersions;->getLanguagePackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v2

    :cond_1
    iput-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    sget-object v2, Lcom/szabh/smable3/BleKey;->FIRMWARE_VERSION:Lcom/szabh/smable3/BleKey;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/szabh/smable3/component/BaseBleCache;->getString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mCurrentFirmware:Ljava/lang/String;

    sget-object v2, Lcom/szabh/smable3/BleKey;->UI_PACK_VERSION:Lcom/szabh/smable3/BleKey;

    invoke-static/range {v1 .. v6}, Lcom/szabh/smable3/component/BaseBleCache;->getString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mCurrentUi:Ljava/lang/String;

    sget-object v2, Lcom/szabh/smable3/BleKey;->LANGUAGE_PACK_VERSION:Lcom/szabh/smable3/BleKey;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-class v3, Lcom/szabh/smable3/entity/BleLanguagePackVersion;

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getObjectNotNull$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Ljava/lang/Object;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleLanguagePackVersion;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleLanguagePackVersion;->getMVersion()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mCurrentLanguage:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mSteps:Ljava/util/List;

    return-void
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mDfuHelper_delegate$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0()V
    .locals 0

    invoke-static {}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->upgrade$lambda$3()V

    return-void
.end method

.method public static synthetic XiOIii1()V
    .locals 0

    invoke-static {}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->upgrade$lambda$1()V

    return-void
.end method

.method public static final synthetic access$checkDownload(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->checkDownload()V

    return-void
.end method

.method public static final synthetic access$getMDfuHelper(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMDownloaded$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mDownloaded:I

    return p0
.end method

.method public static final synthetic access$getMLatestFirmware$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMLatestLanguage$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMLatestUi$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMSteps$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mSteps:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mStepsIndex:I

    return p0
.end method

.method public static final synthetic access$setMDownloaded$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mDownloaded:I

    return-void
.end method

.method public static final synthetic access$setMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mStepsIndex:I

    return-void
.end method

.method public static final synthetic access$startOtaProcess(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->startOtaProcess()V

    return-void
.end method

.method public static final synthetic access$upgrade(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->upgrade()V

    return-void
.end method

.method private final checkDownload()V
    .locals 5

    iget v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mDownloaded:I

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mSteps:Ljava/util/List;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mDfuCallback:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$iO;

    invoke-virtual {v0, v1}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->initialize(Lcom/realsil/sdk/dfu/utils/DfuAdapter$DfuHelperCallback;)Z

    :cond_0
    return-void
.end method

.method private final getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mDfuHelper$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    return-object v0
.end method

.method private static final mDfuHelper_delegate$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;
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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object v0

    invoke-virtual {p1}, Lcom/realsil/sdk/dfu/utils/ConnectParams$Builder;->build()Lcom/realsil/sdk/dfu/utils/ConnectParams;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;->connectDevice(Lcom/realsil/sdk/dfu/utils/ConnectParams;)Z

    return-void
.end method

.method private final startOtaProcess()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mDfuConfig:Lcom/realsil/sdk/dfu/model/DfuConfig;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/realsil/sdk/dfu/model/DfuConfig;->setOtaWorkMode(I)V

    new-instance v1, Ljava/io/File;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/realsil/sdk/dfu/model/DfuConfig;->setFilePath(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mOtaDeviceInfo:Lcom/realsil/sdk/dfu/model/OtaDeviceInfo;

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v2, v3}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->startOtaProcedure(Lcom/realsil/sdk/dfu/model/DfuConfig;Lcom/realsil/sdk/dfu/model/OtaDeviceInfo;Z)Z

    :cond_0
    return-void
.end method

.method private final upgrade()V
    .locals 10

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

    iget v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mStepsIndex:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mSteps:Ljava/util/List;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mSteps:Ljava/util/List;

    iget v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mStepsIndex:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$FileType;

    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$OXO1;->OXO1:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v2, :cond_5

    const-wide/16 v1, 0xfa0

    if-eq v0, v4, :cond_3

    const/4 v3, 0x3

    if-ne v0, v3, :cond_2

    sget-object v4, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v5, Lcom/szabh/smable3/BleKey;->LANGUAGE_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v6, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

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
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->abort()Z

    invoke-virtual {v0}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->close()V

    :cond_1
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/XX1XXiIiX;

    invoke-direct {v3}, Lcom/android/mltcode/paycertificationapi/XX1XXiIiX;-><init>()V

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_3
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->abort()Z

    invoke-virtual {v0}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->close()V

    :cond_4
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/IO0OI0I0;

    invoke-direct {v3}, Lcom/android/mltcode/paycertificationapi/IO0OI0I0;-><init>()V

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_5
    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMDfuAddress()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->otaConnect(Ljava/lang/String;)V

    return-void
.end method

.method private static final upgrade$lambda$1()V
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


# virtual methods
.method public final getMOtaDeviceInfo()Lcom/realsil/sdk/dfu/model/OtaDeviceInfo;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mOtaDeviceInfo:Lcom/realsil/sdk/dfu/model/OtaDeviceInfo;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initView()V
    .locals 12

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->initView()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    const-string v1, "."

    const v2, 0x7f14148f

    if-nez v0, :cond_0

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v3, :cond_0

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v3, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mCurrentFirmware:Ljava/lang/String;

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mCurrentUi:Ljava/lang/String;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-string v4, "."

    const-string v5, ""

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mCurrentLanguage:Ljava/lang/String;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v5, "."

    const-string v6, ""

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvLatest()Landroid/widget/TextView;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

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
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mCurrentFirmware:Ljava/lang/String;

    :cond_2
    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    move-object v4, v3

    goto :goto_2

    :cond_4
    :goto_1
    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mCurrentUi:Ljava/lang/String;

    goto :goto_0

    :goto_2
    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v5, "."

    const-string v6, ""

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    move-object v5, v4

    goto :goto_5

    :cond_6
    :goto_4
    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mCurrentLanguage:Ljava/lang/String;

    goto :goto_3

    :goto_5
    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v6, "."

    const-string v7, ""

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvLatest()Landroid/widget/TextView;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mCurrentUi:Ljava/lang/String;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const-string v7, "."

    const-string v8, ""

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mCurrentLanguage:Ljava/lang/String;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v5, "."

    const-string v6, ""

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvCurrent()Landroid/widget/TextView;

    move-result-object v5

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mCurrentFirmware:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mCurrentFirmware:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMCurrentVersion(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMTargetVersion(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mSteps:Ljava/util/List;

    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$FileType;->FIRMWARE:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$FileType;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mSteps:Ljava/util/List;

    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$FileType;->LANGUAGE_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$FileType;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mSteps:Ljava/util/List;

    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$FileType;->UI_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$FileType;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 4
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

    iput p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mDownloaded:I

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const v3, 0x7f140476

    invoke-static {v0, v3, p1, v1, v2}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    iget p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mStepsIndex:I

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_0

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$onBottomClick$1;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$onBottomClick$1;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_1

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$onBottomClick$2;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$onBottomClick$2;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_2

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$onBottomClick$3;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$onBottomClick$3;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_2
    return-void

    :cond_3
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->upgrade()V

    return-void
.end method

.method public onDestroy()V
    .locals 5

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mSteps:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mStepsIndex:I

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mSteps:Ljava/util/List;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result v2

    if-ne v1, v2, :cond_0

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v2, Lcom/szabh/smable3/BleKey;->UI_FILE:Lcom/szabh/smable3/BleKey;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v4, v3, v4}, Lcom/szabh/smable3/component/BaseBleCache;->remove$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->closeConnection(Z)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mOtaDeviceInfo:Lcom/realsil/sdk/dfu/model/OtaDeviceInfo;

    return-void
.end method

.method public final upgradeDone()V
    .locals 9

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->updateDeviceInfo(Ljava/lang/String;)V

    :cond_0
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

    return-void
.end method
