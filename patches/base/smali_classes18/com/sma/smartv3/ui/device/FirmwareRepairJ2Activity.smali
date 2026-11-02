.class public final Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;
.super Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFirmwareRepairJ2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairJ2Activity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJ2Activity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,297:1\n18#2,2:298\n15#2:300\n15#2:301\n27#2,2:302\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairJ2Activity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJ2Activity\n*L\n45#1:298,2\n45#1:300\n49#1:301\n129#1:302,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFirmwareRepairJ2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairJ2Activity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJ2Activity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,297:1\n18#2,2:298\n15#2:300\n15#2:301\n27#2,2:302\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairJ2Activity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJ2Activity\n*L\n45#1:298,2\n45#1:300\n49#1:301\n129#1:302,2\n*E\n"
    }
.end annotation


# instance fields
.field private isUseDfuAddress:Z

.field private final mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

.field private final mBtEventListener:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mDeviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mDfuAddress:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mDownloaded:I

.field private final mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;
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

.field private mStepsIndex:I


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;-><init>()V

    sget-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->NONE:Lcom/sma/smartv3/ui/device/OTAStatus;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mOTAStatus:Lcom/sma/smartv3/ui/device/OTAStatus;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    :cond_0
    check-cast v1, Lcom/szabh/smable3/entity/BleDeviceInfo;

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mDeviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMBleAddress()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->I1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mDfuAddress:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/FirmwareVersion;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getInstance(Landroid/app/Application;)Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mBtEventListener:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XIi00iiXO;

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$iO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$iO;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mOTAEventCallback:Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;

    return-void
.end method

.method public static final synthetic access$canOTA(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;Lcom/sma/smartv3/ui/device/OTAStatus;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->canOTA(Lcom/sma/smartv3/ui/device/OTAStatus;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$checkDownload(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->checkDownload()V

    return-void
.end method

.method public static final synthetic access$getMDeviceInfo$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)Lcom/szabh/smable3/entity/BleDeviceInfo;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mDeviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    return-object p0
.end method

.method public static final synthetic access$getMDownloaded$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mDownloaded:I

    return p0
.end method

.method public static final synthetic access$getMLatestFirmware$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMOTAManager$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    return-object p0
.end method

.method public static final synthetic access$getMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)Lcom/sma/smartv3/ui/device/OTAStatus;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mOTAStatus:Lcom/sma/smartv3/ui/device/OTAStatus;

    return-object p0
.end method

.method public static final synthetic access$getMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mStepsIndex:I

    return p0
.end method

.method public static final synthetic access$setMDownloaded$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mDownloaded:I

    return-void
.end method

.method public static final synthetic access$setMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;Lcom/sma/smartv3/ui/device/OTAStatus;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mOTAStatus:Lcom/sma/smartv3/ui/device/OTAStatus;

    return-void
.end method

.method public static final synthetic access$setMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mStepsIndex:I

    return-void
.end method

.method public static final synthetic access$setUseDfuAddress$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->isUseDfuAddress:Z

    return-void
.end method

.method public static final synthetic access$updateUpgradeStatus(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;Lcom/sma/smartv3/ui/device/OTAStatus;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->updateUpgradeStatus(Lcom/sma/smartv3/ui/device/OTAStatus;)V

    return-void
.end method

.method private final canOTA(Lcom/sma/smartv3/ui/device/OTAStatus;)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->isOTAError(Lcom/sma/smartv3/ui/device/OTAStatus;)Z

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
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mDownloaded:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f141117

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->upgrade()V

    :cond_0
    return-void
.end method

.method private final destroyOTA()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mOTAEventCallback:Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->unregisterBluetoothCallback(Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->release()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    return-void
.end method

.method private final initOTA()V
    .locals 2

    new-instance v0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    invoke-direct {v0, p0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mOTAEventCallback:Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->registerBluetoothCallback(Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;)V

    return-void
.end method

.method private final isOTAError(Lcom/sma/smartv3/ui/device/OTAStatus;)Z
    .locals 2

    sget-object v0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$OXO1;->OXO1:[I

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
    .locals 2

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mOTAStatus:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->isOTAError(Lcom/sma/smartv3/ui/device/OTAStatus;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->setMStarted(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object p1

    const v0, 0x7f140bf5

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->setMStarted(Z)V

    return-void
.end method


# virtual methods
.method public final checkFirmware()V
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mDeviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mDeviceInfo -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140be8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl2()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName2()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$checkFirmware$1;

    invoke-direct {v5, p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$checkFirmware$1;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)V

    invoke-virtual {v0, v1, v3, v4, v5}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$checkFirmware$2;

    invoke-direct {v4, p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$checkFirmware$2;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    return-void
.end method

.method public final connectDevice(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

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

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->closeConnection(Z)V

    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/sc;->XIi00iiXO(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mBtEventListener:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XIi00iiXO;

    invoke-virtual {p1, v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->addBluetoothEventListener(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V

    return-void
.end method

.method public initView()V
    .locals 1

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->initView()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mDfuAddress:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->checkFirmware()V

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onAttachedToWindow()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->setMStarted(Z)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-class v1, Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mBtEventListener:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XIi00iiXO;

    invoke-virtual {v0, v1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->removeBluetoothEventListener(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->destroy()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->destroyOTA()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleConnector;->launch()V

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->onDestroy()V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getMStarted()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->setFirmwareFilePath(Ljava/lang/String;)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)V

    invoke-virtual {p1, v0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->startOTA(Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;)V

    :cond_1
    return-void
.end method

.method public final upgrade()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->destroyOTA()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->initOTA()V

    sget-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->updateUpgradeStatus(Lcom/sma/smartv3/ui/device/OTAStatus;)V

    iget v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mStepsIndex:I

    if-lez v0, :cond_1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->isUseDfuAddress:Z

    if-eqz v0, :cond_0

    const-string v0, "upgrade FIRMWARE2 -> use dfuAddress"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mDfuAddress:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->connectDevice(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "upgrade FIRMWARE2 -> use bleAddress"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mDeviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMBleAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->connectDevice(Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->mDfuAddress:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->connectDevice(Ljava/lang/String;)V

    return-void
.end method
