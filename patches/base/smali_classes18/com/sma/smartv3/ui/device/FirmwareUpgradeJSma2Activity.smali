.class public final Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;
.super Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$FileType;,
        Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFirmwareUpgradeJSma2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareUpgradeJSma2Activity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,505:1\n15#2:506\n15#2:507\n*S KotlinDebug\n*F\n+ 1 FirmwareUpgradeJSma2Activity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity\n*L\n150#1:506\n151#1:507\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFirmwareUpgradeJSma2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareUpgradeJSma2Activity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,505:1\n15#2:506\n15#2:507\n*S KotlinDebug\n*F\n+ 1 FirmwareUpgradeJSma2Activity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity\n*L\n150#1:506\n151#1:507\n*E\n"
    }
.end annotation


# instance fields
.field private isUseDfuAddress:Z

.field private mBleHandleCallback:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

.field private final mBtEventListener:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$iO;
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
            "Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$FileType;",
            ">;"
        }
    .end annotation
.end field

.field private mStepsIndex:I


# direct methods
.method public constructor <init>()V
    .locals 9

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;-><init>()V

    sget-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->NONE:Lcom/sma/smartv3/ui/device/OTAStatus;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mOTAStatus:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getInstance(Landroid/app/Application;)Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$iO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$iO;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mBtEventListener:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$iO;

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$XO0O10;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$XO0O10;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mOTAEventCallback:Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$XIi00iiXO;

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

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

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

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestExtraPacks:Lcom/sma/smartv3/model/ExtraPackVersions;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ExtraPackVersions;->getUiPackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    iput-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ExtraPackVersions;->getLanguagePackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v1

    :cond_1
    iput-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    sget-object v2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v3, Lcom/szabh/smable3/BleKey;->FIRMWARE_VERSION:Lcom/szabh/smable3/BleKey;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mCurrentFirmware:Ljava/lang/String;

    sget-object v3, Lcom/szabh/smable3/BleKey;->UI_PACK_VERSION:Lcom/szabh/smable3/BleKey;

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mCurrentUi:Ljava/lang/String;

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

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mCurrentLanguage:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mSteps:Ljava/util/List;

    return-void
.end method

.method public static synthetic OiIIX101O()V
    .locals 0

    invoke-static {}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->upgrade$lambda$0()V

    return-void
.end method

.method public static synthetic XX0()V
    .locals 0

    invoke-static {}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->upgrade$lambda$1()V

    return-void
.end method

.method public static final synthetic access$canOTA(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;Lcom/sma/smartv3/ui/device/OTAStatus;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->canOTA(Lcom/sma/smartv3/ui/device/OTAStatus;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$checkDownload(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->checkDownload()V

    return-void
.end method

.method public static final synthetic access$getMDownloaded$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mDownloaded:I

    return p0
.end method

.method public static final synthetic access$getMLatestFirmware$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMLatestLanguage$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMLatestUi$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMOTAManager$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;)Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    return-object p0
.end method

.method public static final synthetic access$getMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;)Lcom/sma/smartv3/ui/device/OTAStatus;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mOTAStatus:Lcom/sma/smartv3/ui/device/OTAStatus;

    return-object p0
.end method

.method public static final synthetic access$getMSteps$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mSteps:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mStepsIndex:I

    return p0
.end method

.method public static final synthetic access$setMDownloaded$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mDownloaded:I

    return-void
.end method

.method public static final synthetic access$setMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;Lcom/sma/smartv3/ui/device/OTAStatus;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mOTAStatus:Lcom/sma/smartv3/ui/device/OTAStatus;

    return-void
.end method

.method public static final synthetic access$setMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mStepsIndex:I

    return-void
.end method

.method public static final synthetic access$setUseDfuAddress$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->isUseDfuAddress:Z

    return-void
.end method

.method public static final synthetic access$updateUpgradeStatus(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;Lcom/sma/smartv3/ui/device/OTAStatus;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->updateUpgradeStatus(Lcom/sma/smartv3/ui/device/OTAStatus;)V

    return-void
.end method

.method public static final synthetic access$upgrade(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->upgrade()V

    return-void
.end method

.method private final canOTA(Lcom/sma/smartv3/ui/device/OTAStatus;)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->isOTAError(Lcom/sma/smartv3/ui/device/OTAStatus;)Z

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

    iget v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mDownloaded:I

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mSteps:Ljava/util/List;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->upgrade()V

    :cond_0
    return-void
.end method

.method private final connectDevice(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "connectDevice: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

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

    return-void
.end method

.method private final destroyOTA()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mOTAEventCallback:Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->unregisterBluetoothCallback(Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->release()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    return-void
.end method

.method private final initOTA()V
    .locals 2

    new-instance v0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    invoke-direct {v0, p0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mOTAEventCallback:Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->registerBluetoothCallback(Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;)V

    return-void
.end method

.method private final isOTAError(Lcom/sma/smartv3/ui/device/OTAStatus;)Z
    .locals 2

    sget-object v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$OXO1;->XIi00iiXO:[I

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

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateUpgradeStatus status = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mOTAStatus:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->isOTAError(Lcom/sma/smartv3/ui/device/OTAStatus;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/OOX00;->OXO1:Lcom/android/mltcode/paycertificationapi/OOX00;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/OOX00;->O00()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, p1, v2, v3}, Lcom/sma/smartv3/view/ProgressButton;->IiI10X(Lcom/sma/smartv3/view/ProgressButton;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void

    :cond_0
    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

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

    iget v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mStepsIndex:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mSteps:Ljava/util/List;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mSteps:Ljava/util/List;

    iget v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mStepsIndex:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$FileType;

    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$OXO1;->OXO1:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v2, :cond_6

    if-eq v0, v4, :cond_4

    const/4 v1, 0x3

    const-wide/16 v2, 0xfa0

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->jlDestory()V

    sget-object v4, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v5, Lcom/szabh/smable3/BleKey;->LANGUAGE_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v6, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

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

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OOO0I0;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/OOO0I0;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->jlDestory()V

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v2, Lcom/szabh/smable3/BleKey;->UI_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v3, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Ljava/io/File;IILjava/lang/Object;)Z

    return-void

    :cond_3
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XOOXO1;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/XOOXO1;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_4
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->destroyOTA()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->initOTA()V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->isUseDfuAddress:Z

    if-eqz v0, :cond_5

    const-string v0, "upgrade FIRMWARE2 -> use dfuAddress"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMDfuAddress()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->connectDevice(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    const-string v0, "upgrade FIRMWARE2 -> use bleAddress"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleAddress()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->connectDevice(Ljava/lang/String;)V

    :goto_0
    sget-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->updateUpgradeStatus(Lcom/sma/smartv3/ui/device/OTAStatus;)V

    return-void

    :cond_6
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->destroyOTA()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->initOTA()V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->isUseDfuAddress:Z

    if-eqz v0, :cond_7

    const-string v0, "upgrade FIRMWARE -> use dfuAddress"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMDfuAddress()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->connectDevice(Ljava/lang/String;)V

    goto :goto_1

    :cond_7
    const-string v0, "upgrade FIRMWARE -> use bleAddress"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleAddress()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->connectDevice(Ljava/lang/String;)V

    :goto_1
    sget-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->updateUpgradeStatus(Lcom/sma/smartv3/ui/device/OTAStatus;)V

    return-void
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


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$XIi00iiXO;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/sc;->XIi00iiXO(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mBtEventListener:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$iO;

    invoke-virtual {p1, v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->addBluetoothEventListener(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V

    return-void
.end method

.method public initView()V
    .locals 12

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->initView()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    const-string v1, "."

    const v2, 0x7f14148f

    if-nez v0, :cond_0

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v3, :cond_0

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v3, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mCurrentFirmware:Ljava/lang/String;

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mCurrentUi:Ljava/lang/String;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-string v4, "."

    const-string v5, ""

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mCurrentLanguage:Ljava/lang/String;

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
    const/4 v3, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion2()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v3

    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion2()Ljava/lang/String;

    move-result-object v3

    :cond_3
    :goto_1
    if-nez v3, :cond_4

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mCurrentFirmware:Ljava/lang/String;

    :cond_4
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    move-object v4, v0

    goto :goto_4

    :cond_6
    :goto_3
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mCurrentUi:Ljava/lang/String;

    goto :goto_2

    :goto_4
    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v5, "."

    const-string v6, ""

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v4, :cond_8

    invoke-virtual {v4}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_7

    goto :goto_6

    :cond_7
    :goto_5
    move-object v5, v4

    goto :goto_7

    :cond_8
    :goto_6
    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mCurrentLanguage:Ljava/lang/String;

    goto :goto_5

    :goto_7
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

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mCurrentUi:Ljava/lang/String;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const-string v7, "."

    const-string v8, ""

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mCurrentLanguage:Ljava/lang/String;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-string v4, "."

    const-string v5, ""

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvCurrent()Landroid/widget/TextView;

    move-result-object v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mCurrentFirmware:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mSteps:Ljava/util/List;

    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$FileType;->FIRMWARE:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$FileType;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl2()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mSteps:Ljava/util/List;

    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$FileType;->FIRMWARE2:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$FileType;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mSteps:Ljava/util/List;

    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$FileType;->LANGUAGE_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$FileType;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_a
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mSteps:Ljava/util/List;

    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$FileType;->UI_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$FileType;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_b
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final jlDestory()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mBtEventListener:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$iO;

    invoke-virtual {v0, v1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->removeBluetoothEventListener(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->destroy()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->destroyOTA()V

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

    iput p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mDownloaded:I

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const v3, 0x7f140476

    invoke-static {v0, v3, p1, v1, v2}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    iget p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mStepsIndex:I

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl2()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl2()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName2()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$onBottomClick$1;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$onBottomClick$1;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;)V

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_0
    sget-object p1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$onBottomClick$2;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$onBottomClick$2;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;)V

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_2

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$onBottomClick$3;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$onBottomClick$3;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_3

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$onBottomClick$4;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$onBottomClick$4;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_3
    return-void

    :cond_4
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->upgrade()V

    return-void
.end method

.method public onDestroy()V
    .locals 5

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$XIi00iiXO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mSteps:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-nez v1, :cond_0

    iget v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mStepsIndex:I

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mSteps:Ljava/util/List;

    invoke-static {v4}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result v4

    if-ne v1, v4, :cond_0

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v4, Lcom/szabh/smable3/BleKey;->UI_FILE:Lcom/szabh/smable3/BleKey;

    invoke-static {v1, v4, v3, v2, v3}, Lcom/szabh/smable3/component/BaseBleCache;->remove$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->closeConnection(Z)V

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->jlDestory()V

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

.method public final startOTA(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "filePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startOTA :: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->setFirmwareFilePath(Ljava/lang/String;)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$O00;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity$O00;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSma2Activity;)V

    invoke-virtual {p1, v0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->startOTA(Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;)V

    :cond_1
    return-void
.end method
