.class public final Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;
.super Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFirmwareRepairJActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairJActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,275:1\n18#2,2:276\n15#2:278\n27#2,2:279\n176#3,11:281\n196#3:300\n252#4,7:292\n270#4:299\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairJActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJActivity\n*L\n51#1:276,2\n51#1:278\n122#1:279,2\n193#1:281,11\n193#1:300\n193#1:292,7\n193#1:299\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFirmwareRepairJActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairJActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,275:1\n18#2,2:276\n15#2:278\n27#2,2:279\n176#3,11:281\n196#3:300\n252#4,7:292\n270#4:299\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairJActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJActivity\n*L\n51#1:276,2\n51#1:278\n122#1:279,2\n193#1:281,11\n193#1:300\n193#1:292,7\n193#1:299\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mAddress:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

.field private final mBtEventListener:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mDeviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mFilePath:Ljava/lang/String;
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


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;-><init>()V

    const-string v0, "RepairJ"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->TAG:Ljava/lang/String;

    sget-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->NONE:Lcom/sma/smartv3/ui/device/OTAStatus;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mOTAStatus:Lcom/sma/smartv3/ui/device/OTAStatus;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    :cond_0
    check-cast v0, Lcom/szabh/smable3/entity/BleDeviceInfo;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mDeviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMBleAddress()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->I1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mAddress:Ljava/lang/String;

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->getInstance(Landroid/app/Application;)Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mBtEventListener:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XIi00iiXO;

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$iO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$iO;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mOTAEventCallback:Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;

    return-void
.end method

.method public static final synthetic access$canOTA(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->canOTA(Lcom/sma/smartv3/ui/device/OTAStatus;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getMDeviceInfo$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Lcom/szabh/smable3/entity/BleDeviceInfo;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mDeviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    return-object p0
.end method

.method public static final synthetic access$getMFilePath$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mFilePath:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getMOTAManager$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    return-object p0
.end method

.method public static final synthetic access$getMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Lcom/sma/smartv3/ui/device/OTAStatus;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mOTAStatus:Lcom/sma/smartv3/ui/device/OTAStatus;

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$setMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mOTAStatus:Lcom/sma/smartv3/ui/device/OTAStatus;

    return-void
.end method

.method public static final synthetic access$updateUpgradeStatus(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->updateUpgradeStatus(Lcom/sma/smartv3/ui/device/OTAStatus;)V

    return-void
.end method

.method private final canOTA(Lcom/sma/smartv3/ui/device/OTAStatus;)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->isOTAError(Lcom/sma/smartv3/ui/device/OTAStatus;)Z

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

.method private final destroyOTA()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mOTAEventCallback:Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->unregisterBluetoothCallback(Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->release()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    return-void
.end method

.method private final initOTA()V
    .locals 2

    new-instance v0, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    invoke-direct {v0, p0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mOTAEventCallback:Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;

    invoke-virtual {v0, v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->registerBluetoothCallback(Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;)V

    return-void
.end method

.method private final isOTAError(Lcom/sma/smartv3/ui/device/OTAStatus;)Z
    .locals 2

    sget-object v0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$OXO1;->OXO1:[I

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
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " updateUpgradeStatus status -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mOTAStatus:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->isOTAError(Lcom/sma/smartv3/ui/device/OTAStatus;)Z

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
    .locals 8

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->TAG:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->TAG:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mDeviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " checkFirmware deviceInfo -> "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140be8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mDeviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMBleName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mDeviceInfo:Lcom/szabh/smable3/entity/BleDeviceInfo;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMFirmwareFlag()Ljava/lang/String;

    move-result-object v2

    const-string v3, "0"

    const-string v4, "N"

    invoke-static {v3, v4, v1, v2}, Lcom/sma/smartv3/network/RequestBodyKt;->getCheckFirmwareVersionBody(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$checkFirmware$1;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$checkFirmware$1;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v4

    sget-object v5, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v5}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v5

    const-string v6, "/ble_firmware_version/latest"

    invoke-virtual {v0, v5, v6}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7, v1}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v0, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$checkFirmware$$inlined$post$default$1;

    invoke-direct {v5, v3, v2, v4}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$checkFirmware$$inlined$post$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v0}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/reflect/Type;

    const-class v2, Lcom/sma/smartv3/model/FirmwareVersion;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v2, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$checkFirmware$$inlined$post$default$2;

    invoke-direct {v2, v5}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$checkFirmware$$inlined$post$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final connectDevice(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " connectDevice -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

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

.method public final download(Lcom/sma/smartv3/model/FirmwareVersion;)V
    .locals 4
    .param p1    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "firmwareVersion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " download "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mFilePath:Ljava/lang/String;

    sget-object v1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$download$1;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$download$1;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)V

    invoke-virtual {v1, v2, v0, p1, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

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

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mBtEventListener:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XIi00iiXO;

    invoke-virtual {p1, v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->addBluetoothEventListener(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V

    return-void
.end method

.method public initView()V
    .locals 4

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->initView()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mAddress:Ljava/lang/String;

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->TAG:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mAddress:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " mAddress -> "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->checkFirmware()V

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mBtEventListener:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XIi00iiXO;

    invoke-virtual {v0, v1}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->removeBluetoothEventListener(Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mBluetoothHelper:Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;

    invoke-virtual {v0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothHelper;->destroy()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->destroyOTA()V

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
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "filePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " startOTA -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->getBluetoothOption()Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;->setFirmwareFilePath(Ljava/lang/String;)Lcom/jieli/jl_bt_ota/model/BluetoothOTAConfigure;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mOTAManager:Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)V

    invoke-virtual {p1, v0}, Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;->startOTA(Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;)V

    :cond_1
    return-void
.end method

.method public final upgrade()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->destroyOTA()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->initOTA()V

    sget-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->updateUpgradeStatus(Lcom/sma/smartv3/ui/device/OTAStatus;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->mAddress:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->connectDevice(Ljava/lang/String;)V

    return-void
.end method
