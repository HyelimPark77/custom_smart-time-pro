.class public final Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;
.super Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$FileType;,
        Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperUpgradeJSmaActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperUpgradeJSmaActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,792:1\n19#2:793\n15#2:794\n15#2:795\n15#2:796\n19#2:797\n15#2:798\n11#2,2:799\n*S KotlinDebug\n*F\n+ 1 DeveloperUpgradeJSmaActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity\n*L\n60#1:793\n60#1:794\n270#1:795\n271#1:796\n338#1:797\n338#1:798\n785#1:799,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperUpgradeJSmaActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperUpgradeJSmaActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,792:1\n19#2:793\n15#2:794\n15#2:795\n15#2:796\n19#2:797\n15#2:798\n11#2,2:799\n*S KotlinDebug\n*F\n+ 1 DeveloperUpgradeJSmaActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity\n*L\n60#1:793\n60#1:794\n270#1:795\n271#1:796\n338#1:797\n338#1:798\n785#1:799,2\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final alreadyUpdateDeviceList:Lcom/android/mltcode/paycertificationapi/OIOO0X00O;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private autoRetryCount:I

.field private final deviceAddress:Ljava/lang/String;

.field private final deviceOTAAddress:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isAutoShutdown:Z

.field private isRepairMode:I

.field private isStartShutdown:Z

.field private isSupportOTAFile:Z

.field private isUseDfuAddress:Z

.field private lastPackageSize:I

.field private mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mBtEventListener:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$iO;
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

.field private mDownloaded:I

.field private final mLatestBrand:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mLatestDial:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

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

.field private final mOTAEventCallback:Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mOTAStatus:Lcom/sma/smartv3/ui/device/OTAStatus;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSteps:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$FileType;",
            ">;"
        }
    .end annotation
.end field

.field private mStepsIndex:I

.field private startTime:J

.field private time1:J

.field private upgradeRunnable:Ljava/lang/Runnable;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 13

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;-><init>()V

    const-string v0, "DeveloperUpgradeJ"

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->TAG:Ljava/lang/String;

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

    iput-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->alreadyUpdateDeviceList:Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "TEST_MODE_OTA_DEVICE_ADDRESS"

    invoke-virtual {v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->deviceAddress:Ljava/lang/String;

    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    const-string v1, "deviceAddress"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v6, ":"

    const-string v7, ""

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v2}, Lkotlin/text/OXO1;->OXO1(I)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v1

    const-wide/16 v5, 0x1

    add-long/2addr v1, v5

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "%012X"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "format(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    invoke-static {v1, v2}, Lkotlin/text/StringsKt___StringsKt;->OXO(Ljava/lang/CharSequence;I)Ljava/util/List;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/Iterable;

    const/16 v11, 0x3e

    const/4 v12, 0x0

    const-string v5, ":"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v4 .. v12}, Lkotlin/collections/CollectionsKt___CollectionsKt;->XOiXXOO(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->deviceOTAAddress:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "DEVELOPER_AUTO_SHUTDOWN"

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->isAutoShutdown:Z

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "DEVELOPER_OTA_FILE"

    invoke-virtual {v1, v2, v4}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->isSupportOTAFile:Z

    const/4 v1, -0x1

    iput v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->isRepairMode:I

    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->NONE:Lcom/sma/smartv3/ui/device/OTAStatus;

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mOTAStatus:Lcom/sma/smartv3/ui/device/OTAStatus;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i00XI11i;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/i00XI11i;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->upgradeRunnable:Ljava/lang/Runnable;

    new-instance v1, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$iO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$iO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mBtEventListener:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$iO;

    new-instance v1, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$XO0O10;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$XO0O10;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mOTAEventCallback:Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;

    new-instance v1, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$XIi00iiXO;

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

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

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

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestExtraPacks:Lcom/sma/smartv3/model/ExtraPackVersions;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ExtraPackVersions;->getUiPackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v3

    :goto_1
    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ExtraPackVersions;->getLanguagePackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v3

    :goto_2
    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ExtraPackVersions;->getBrandPackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v1

    goto :goto_3

    :cond_3
    move-object v1, v3

    :goto_3
    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestBrand:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ExtraPackVersions;->getFontPackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v1

    goto :goto_4

    :cond_4
    move-object v1, v3

    :goto_4
    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ExtraPackVersions;->getDialPackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v3

    :cond_5
    iput-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestDial:Lcom/sma/smartv3/model/FirmwareVersion;

    sget-object v4, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v5, Lcom/szabh/smable3/BleKey;->FIRMWARE_VERSION:Lcom/szabh/smable3/BleKey;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/szabh/smable3/component/BaseBleCache;->getString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mCurrentFirmware:Ljava/lang/String;

    sget-object v5, Lcom/szabh/smable3/BleKey;->UI_PACK_VERSION:Lcom/szabh/smable3/BleKey;

    invoke-static/range {v4 .. v9}, Lcom/szabh/smable3/component/BaseBleCache;->getString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mCurrentUi:Ljava/lang/String;

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

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mCurrentLanguage:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mSteps:Ljava/util/List;

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->upgrade$lambda$4(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    return-void
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->upgradeRunnable$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    return-void
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->upgrade$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    return-void
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->upgrade$lambda$1(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    return-void
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->upgrade$lambda$3(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    return-void
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->updateUpgradeStatus$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    return-void
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->upgrade$lambda$2(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    return-void
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->upgradeDone$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    return-void
.end method

.method public static final synthetic access$canOTA(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->canOTA(Lcom/sma/smartv3/ui/device/OTAStatus;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$checkDownload(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->checkDownload()V

    return-void
.end method

.method public static final synthetic access$getDeviceAddress$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->deviceAddress:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getLastPackageSize$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->lastPackageSize:I

    return p0
.end method

.method public static final synthetic access$getMDownloaded$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mDownloaded:I

    return p0
.end method

.method public static final synthetic access$getMLatestBrand$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestBrand:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMLatestDial$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestDial:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMLatestFirmware$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMLatestFont$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMLatestLanguage$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMLatestUi$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Lcom/android/mltcode/paycertificationapi/uq;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    return-object p0
.end method

.method public static final synthetic access$getMOTAManager$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    return-object p0
.end method

.method public static final synthetic access$getMOTAStatus$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Lcom/sma/smartv3/ui/device/OTAStatus;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mOTAStatus:Lcom/sma/smartv3/ui/device/OTAStatus;

    return-object p0
.end method

.method public static final synthetic access$getMSteps$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mSteps:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getMStepsIndex$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mStepsIndex:I

    return p0
.end method

.method public static final synthetic access$getProgressButton(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Lcom/sma/smartv3/view/ProgressButton;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getStartTime$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->startTime:J

    return-wide v0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getTime1$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->time1:J

    return-wide v0
.end method

.method public static final synthetic access$getTvSpeed(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvSpeed()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTvStep(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getUpgradeRunnable$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->upgradeRunnable:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static final synthetic access$isStartShutdown$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->isStartShutdown:Z

    return p0
.end method

.method public static final synthetic access$setLastPackageSize$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->lastPackageSize:I

    return-void
.end method

.method public static final synthetic access$setMDownloaded$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mDownloaded:I

    return-void
.end method

.method public static final synthetic access$setMOTAStatus$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mOTAStatus:Lcom/sma/smartv3/ui/device/OTAStatus;

    return-void
.end method

.method public static final synthetic access$setMStarted(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    return-void
.end method

.method public static final synthetic access$setMStepsIndex$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mStepsIndex:I

    return-void
.end method

.method public static final synthetic access$setStartTime$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->startTime:J

    return-void
.end method

.method public static final synthetic access$setTime1$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->time1:J

    return-void
.end method

.method public static final synthetic access$setUseDfuAddress$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->isUseDfuAddress:Z

    return-void
.end method

.method public static final synthetic access$updateUpgradeStatus(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->updateUpgradeStatus(Lcom/sma/smartv3/ui/device/OTAStatus;)V

    return-void
.end method

.method public static final synthetic access$upgradeDone(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->upgradeDone()V

    return-void
.end method

.method public static final synthetic access$upgradeExit(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->upgradeExit()V

    return-void
.end method

.method private final canOTA(Lcom/sma/smartv3/ui/device/OTAStatus;)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->isOTAError(Lcom/sma/smartv3/ui/device/OTAStatus;)Z

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

    iget v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mDownloaded:I

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mSteps:Ljava/util/List;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->upgrade()V

    :cond_0
    return-void
.end method

.method private final connectDevice(Ljava/lang/String;)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " connectDevice: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->connectDevice(Landroid/bluetooth/BluetoothDevice;)V

    :cond_1
    return-void
.end method

.method private final destroyOTA()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mOTAEventCallback:Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->unregisterBluetoothCallback(Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->release()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    if-eqz v1, :cond_2

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mBtEventListener:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$iO;

    invoke-virtual {v1, v2}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->removeBluetoothEventListener(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->destroy()V

    :cond_3
    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    return-void
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->upgradeDone$lambda$1(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    return-void
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->upgrade$lambda$5(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    return-void
.end method

.method private final initOTA()V
    .locals 2

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getInstance(Landroid/app/Application;)Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mBtEventListener:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$iO;

    invoke-virtual {v0, v1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->addBluetoothEventListener(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V

    :cond_0
    new-instance v0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    invoke-direct {v0, p0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mOTAEventCallback:Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->registerBluetoothCallback(Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;)V

    return-void
.end method

.method private final isOTAError(Lcom/sma/smartv3/ui/device/OTAStatus;)Z
    .locals 2

    sget-object v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$OXO1;->XIi00iiXO:[I

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

.method private final updateUpgradeStatus(Lcom/sma/smartv3/ui/device/OTAStatus;)V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->TAG:Ljava/lang/String;

    iget v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->autoRetryCount:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " updateUpgradeStatus status = "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", autoRetryCount = "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mOTAStatus:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->isOTAError(Lcom/sma/smartv3/ui/device/OTAStatus;)Z

    move-result p1

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    iget p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->autoRetryCount:I

    if-ge p1, v1, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " wait to retry Upgrade -> autoRetryCount = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iI10i1IX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iI10i1IX;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    const-wide/16 v1, 0x1388

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    const/4 p1, 0x0

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->autoRetryCount:I

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const v3, 0x7f140bf5

    invoke-static {v0, v3, p1, v1, v2}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_1
    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    return-void
.end method

.method private static final updateUpgradeStatus$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 4

    iget v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->autoRetryCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->autoRetryCount:I

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mOTAStatus:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->isOTAError(Lcom/sma/smartv3/ui/device/OTAStatus;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->TAG:Ljava/lang/String;

    iget v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->autoRetryCount:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " retry Upgrade -> autoRetryCount = "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->destroyOTA()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->initOTA()V

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->isUseDfuAddress:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " upgrade -> use dfuAddress"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->deviceOTAAddress:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->connectDevice(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " upgrade -> use bleAddress"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->deviceAddress:Ljava/lang/String;

    const-string v1, "deviceAddress"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->connectDevice(Ljava/lang/String;)V

    :goto_0
    sget-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->updateUpgradeStatus(Lcom/sma/smartv3/ui/device/OTAStatus;)V

    :cond_1
    return-void
.end method

.method private final upgrade()V
    .locals 10

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->startTime:J

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    const v4, 0x7f1412ba

    invoke-static {v0, v4, v1, v2, v3}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mStepsIndex:I

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mSteps:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const v2, 0x7f14146e

    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mSteps:Ljava/util/List;

    iget v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mStepsIndex:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$FileType;

    sget-object v1, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$OXO1;->OXO1:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const-wide/16 v1, 0xfa0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v3, "DIAL_PACK"

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->jlDestory()V

    sget-object v4, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v5, Lcom/szabh/smable3/BleKey;->FAT_BIN_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v6, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestDial:Lcom/sma/smartv3/model/FirmwareVersion;

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

    new-instance v3, Lcom/android/mltcode/paycertificationapi/iOIIXI0II;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/iOIIXI0II;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :pswitch_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v3, "OTA_PACK"

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->jlDestory()V

    sget-object v4, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v5, Lcom/szabh/smable3/BleKey;->OTA_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v6, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

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

    new-instance v3, Lcom/android/mltcode/paycertificationapi/I1O01X1;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/I1O01X1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :pswitch_2
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v3, "BRAND_PACK"

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->jlDestory()V

    sget-object v4, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v5, Lcom/szabh/smable3/BleKey;->BRAND_INFO_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v6, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestBrand:Lcom/sma/smartv3/model/FirmwareVersion;

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

    new-instance v3, Lcom/android/mltcode/paycertificationapi/OXOO;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/OXOO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :pswitch_3
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v3, "FONT_PACK"

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->jlDestory()V

    sget-object v4, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v5, Lcom/szabh/smable3/BleKey;->FONT_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v6, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

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

    new-instance v3, Lcom/android/mltcode/paycertificationapi/I0Ii1XOO0;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/I0Ii1XOO0;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :pswitch_4
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v3, "LANGUAGE_PACK"

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->jlDestory()V

    sget-object v4, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v5, Lcom/szabh/smable3/BleKey;->LANGUAGE_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v6, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

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

    new-instance v3, Lcom/android/mltcode/paycertificationapi/I001OO0X;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/I001OO0X;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :pswitch_5
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v3, "UI_PACK"

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->jlDestory()V

    sget-object v4, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v5, Lcom/szabh/smable3/BleKey;->UI_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v6, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v6, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Ljava/io/File;IILjava/lang/Object;)Z

    return-void

    :cond_5
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/O111OiI;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/O111OiI;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :pswitch_6
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "FIRMWARE"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->destroyOTA()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->initOTA()V

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->isUseDfuAddress:Z

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " upgrade -> use dfuAddress"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->deviceOTAAddress:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->connectDevice(Ljava/lang/String;)V

    goto :goto_0

    :cond_6
    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " upgrade -> use bleAddress"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->deviceAddress:Ljava/lang/String;

    const-string v1, "deviceAddress"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->connectDevice(Ljava/lang/String;)V

    :goto_0
    sget-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->updateUpgradeStatus(Lcom/sma/smartv3/ui/device/OTAStatus;)V

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

.method private static final upgrade$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->deviceAddress:Ljava/lang/String;

    const-string v1, "deviceAddress"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setAddress(Ljava/lang/String;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    return-void
.end method

.method private static final upgrade$lambda$1(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->deviceAddress:Ljava/lang/String;

    const-string v1, "deviceAddress"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setAddress(Ljava/lang/String;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    return-void
.end method

.method private static final upgrade$lambda$2(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->deviceAddress:Ljava/lang/String;

    const-string v1, "deviceAddress"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setAddress(Ljava/lang/String;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    return-void
.end method

.method private static final upgrade$lambda$3(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->deviceAddress:Ljava/lang/String;

    const-string v1, "deviceAddress"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setAddress(Ljava/lang/String;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    return-void
.end method

.method private static final upgrade$lambda$4(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->deviceAddress:Ljava/lang/String;

    const-string v1, "deviceAddress"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setAddress(Ljava/lang/String;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    return-void
.end method

.method private static final upgrade$lambda$5(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->deviceAddress:Ljava/lang/String;

    const-string v1, "deviceAddress"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setAddress(Ljava/lang/String;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    return-void
.end method

.method private final upgradeDone()V
    .locals 13

    iget v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->isRepairMode:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->isAutoShutdown:Z

    if-eqz v0, :cond_4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " start shutdown"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez v0, :cond_1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/II0i1O0X;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/II0i1O0X;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    const-wide/16 v3, 0x61a8

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iput-boolean v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->isStartShutdown:Z

    sget-object v5, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v5}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v6, Lcom/szabh/smable3/BleKey;->SHUTDOWN:Lcom/szabh/smable3/BleKey;

    sget-object v7, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v11, 0x18

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    return-void

    :cond_3
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OII1XX1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OII1XX1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_4
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->upgradeExit()V

    return-void
.end method

.method private static final upgradeDone$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " shutdown time out force exit!"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->upgradeExit()V

    :cond_1
    return-void
.end method

.method private static final upgradeDone$lambda$1(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->deviceAddress:Ljava/lang/String;

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

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ota => upgradeExit"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->alreadyUpdateDeviceList:Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;->XO0O10()Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->deviceAddress:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->alreadyUpdateDeviceList:Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

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

.method private static final upgradeRunnable$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->upgrade()V

    return-void
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->isRepairMode:I

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$XIi00iiXO;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BaseBleConnector;->setNeedBind(Z)V

    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/sc;->XIi00iiXO(Landroid/content/Context;)V

    return-void
.end method

.method public initView()V
    .locals 17

    move-object/from16 v0, p0

    invoke-super {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->initView()V

    iget-object v1, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const-string v4, "000"

    const-string v5, "."

    const v6, 0x7f14148f

    if-nez v1, :cond_0

    iget-object v7, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v7, :cond_0

    iget-object v7, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v7, :cond_0

    iget-object v7, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestBrand:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v7, :cond_0

    iget-object v7, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v7, :cond_0

    iget-object v7, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestDial:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v7, :cond_0

    iget-object v1, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mCurrentFirmware:Ljava/lang/String;

    iget-object v7, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mCurrentUi:Ljava/lang/String;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-string v8, "."

    const-string v9, ""

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    iget-object v8, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mCurrentLanguage:Ljava/lang/String;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const-string v9, "."

    const-string v10, ""

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvLatest()Landroid/widget/TextView;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v6, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvCurrent()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/view/ViewGroup;

    const/16 v4, 0x8

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_c

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    :cond_1
    iget-object v1, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mCurrentFirmware:Ljava/lang/String;

    :cond_2
    iget-object v7, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    move-object v8, v7

    goto :goto_2

    :cond_4
    :goto_1
    iget-object v7, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mCurrentUi:Ljava/lang/String;

    goto :goto_0

    :goto_2
    const/4 v12, 0x4

    const/4 v13, 0x0

    const-string v9, "."

    const-string v10, ""

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    iget-object v8, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v8, :cond_6

    invoke-virtual {v8}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    move-object v9, v8

    goto :goto_5

    :cond_6
    :goto_4
    iget-object v8, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mCurrentLanguage:Ljava/lang/String;

    goto :goto_3

    :goto_5
    const/4 v13, 0x4

    const/4 v14, 0x0

    const-string v10, "."

    const-string v11, ""

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    iget-object v9, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestBrand:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v9, :cond_8

    invoke-virtual {v9}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_7

    goto :goto_7

    :cond_7
    :goto_6
    move-object v10, v9

    goto :goto_8

    :cond_8
    :goto_7
    const-string v9, "0.0.0"

    goto :goto_6

    :goto_8
    const/4 v14, 0x4

    const/4 v15, 0x0

    const-string v11, "."

    const-string v12, ""

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    iget-object v10, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v10, :cond_a

    invoke-virtual {v10}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_9

    goto :goto_9

    :cond_9
    move-object v11, v10

    goto :goto_a

    :cond_a
    :goto_9
    move-object v11, v4

    :goto_a
    const/4 v15, 0x4

    const/16 v16, 0x0

    const-string v12, "."

    const-string v13, ""

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvLatest()Landroid/widget/TextView;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v6, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v11, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mCurrentUi:Ljava/lang/String;

    const-string v12, "."

    const-string v13, ""

    invoke-static/range {v11 .. v16}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v7, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mCurrentLanguage:Ljava/lang/String;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-string v8, "."

    const-string v9, ""

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvCurrent()Landroid/widget/TextView;

    move-result-object v7

    iget-object v8, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mCurrentFirmware:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v6, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v1, :cond_c

    iget-boolean v1, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->isSupportOTAFile:Z

    if-eqz v1, :cond_b

    iget-object v1, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mSteps:Ljava/util/List;

    sget-object v4, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$FileType;->OTA_PACK:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$FileType;

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_b
    iget-object v1, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mSteps:Ljava/util/List;

    sget-object v4, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$FileType;->FIRMWARE:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$FileType;

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_c
    :goto_b
    iget v1, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->isRepairMode:I

    if-eq v1, v3, :cond_11

    iget-object v1, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v1, :cond_d

    iget-object v1, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mSteps:Ljava/util/List;

    sget-object v4, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$FileType;->LANGUAGE_PACK:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$FileType;

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_d
    iget-object v1, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v1, :cond_e

    iget-object v1, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mSteps:Ljava/util/List;

    sget-object v4, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$FileType;->UI_PACK:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$FileType;

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_e
    iget-object v1, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v1, :cond_f

    iget-object v1, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mSteps:Ljava/util/List;

    sget-object v4, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$FileType;->FONT_PACK:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$FileType;

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_f
    iget-object v1, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestDial:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v1, :cond_10

    iget-object v1, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mSteps:Ljava/util/List;

    sget-object v4, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$FileType;->DIAL_PACK:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$FileType;

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_10
    iget-object v1, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestBrand:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v1, :cond_11

    iget-object v1, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mSteps:Ljava/util/List;

    sget-object v4, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$FileType;->BRAND_PACK:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$FileType;

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_11
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_c
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getDevInfo()Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvAlreadyOta()Landroid/widget/TextView;

    move-result-object v1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    new-instance v4, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v3, v5}, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;-><init>(Ljava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v5, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2, v5}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_12

    goto :goto_d

    :cond_12
    move-object v4, v2

    :goto_d
    check-cast v4, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;->XO0O10()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvInfo()Landroid/widget/TextView;

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->deviceAddress:Ljava/lang/String;

    iget v3, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->isRepairMode:I

    iget-boolean v4, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->isSupportOTAFile:Z

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Jsma "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", Mode:"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->TAG:Ljava/lang/String;

    iget-object v3, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->deviceAddress:Ljava/lang/String;

    iget-object v4, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->deviceOTAAddress:Ljava/lang/String;

    iget-object v5, v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mSteps:Ljava/util/List;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " ota => deviceAddress:"

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " deviceOTAAddress:"

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", mSteps:"

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->onBottomClick(Landroid/view/View;)V

    return-void
.end method

.method public final jlDestory()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->destroyOTA()V

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

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BleConnector;->unbind()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mDownloaded:I

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const v3, 0x7f140476

    invoke-static {v0, v3, p1, v1, v2}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    iget p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mStepsIndex:I

    if-nez p1, :cond_6

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_0

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$onBottomClick$1;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$onBottomClick$1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_1

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$onBottomClick$2;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$onBottomClick$2;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_2

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$onBottomClick$3;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$onBottomClick$3;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestBrand:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_3

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestBrand:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$onBottomClick$4;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$onBottomClick$4;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_3
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_4

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestFont:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$onBottomClick$5;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$onBottomClick$5;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_4
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestDial:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_5

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mLatestDial:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$onBottomClick$6;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$onBottomClick$6;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_5
    return-void

    :cond_6
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->upgrade()V

    return-void
.end method

.method public onDestroy()V
    .locals 6

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$XIi00iiXO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mSteps:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    iget v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mStepsIndex:I

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mSteps:Ljava/util/List;

    invoke-static {v3}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result v3

    if-ne v1, v3, :cond_0

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v3, Lcom/szabh/smable3/BleKey;->UI_FILE:Lcom/szabh/smable3/BleKey;

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v1, v3, v5, v4, v5}, Lcom/szabh/smable3/component/BaseBleCache;->remove$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->closeConnection(Z)V

    :cond_0
    invoke-virtual {v0, v2}, Lcom/szabh/smable3/component/BaseBleConnector;->setNeedBind(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->jlDestory()V

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->onDestroy()V

    return-void
.end method

.method public final startOTA(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "filePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " startOTA :: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->setFirmwareFilePath(Ljava/lang/String;)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    invoke-virtual {p1, v0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->startOTA(Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;)V

    :cond_1
    return-void
.end method
