.class public final Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;
.super Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$FileType;,
        Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFirmwareUpgradeZActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareUpgradeZActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeZActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,354:1\n15#2:355\n*S KotlinDebug\n*F\n+ 1 FirmwareUpgradeZActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeZActivity\n*L\n110#1:355\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFirmwareUpgradeZActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareUpgradeZActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeZActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,354:1\n15#2:355\n*S KotlinDebug\n*F\n+ 1 FirmwareUpgradeZActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeZActivity\n*L\n110#1:355\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mAbOta:Lcom/bluetrum/fota/abota/ABOta;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mBluetoothEventListener:Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBluetoothManager:Lcom/bluetrum/abota/bluetooth/BleManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mCurrentFirmware:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mDownloaded:I

.field private final mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mOTAEventListener:Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$iO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSteps:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$FileType;",
            ">;"
        }
    .end annotation
.end field

.field private mStepsIndex:I


# direct methods
.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;-><init>()V

    const-string v0, "UpgradeZ"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mBluetoothEventListener:Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$XIi00iiXO;

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$iO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$iO;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mOTAEventListener:Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$iO;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

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

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v2, Lcom/szabh/smable3/BleKey;->FIRMWARE_VERSION:Lcom/szabh/smable3/BleKey;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/szabh/smable3/component/BaseBleCache;->getString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mCurrentFirmware:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mSteps:Ljava/util/List;

    return-void
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->otaUpdating$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;I)V

    return-void
.end method

.method public static final synthetic access$checkDownload(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->checkDownload()V

    return-void
.end method

.method public static final synthetic access$getMAbOta$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;)Lcom/bluetrum/fota/abota/ABOta;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mAbOta:Lcom/bluetrum/fota/abota/ABOta;

    return-object p0
.end method

.method public static final synthetic access$getMBluetoothManager$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;)Lcom/bluetrum/abota/bluetooth/BleManager;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mBluetoothManager:Lcom/bluetrum/abota/bluetooth/BleManager;

    return-object p0
.end method

.method public static final synthetic access$getMDownloaded$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mDownloaded:I

    return p0
.end method

.method public static final synthetic access$getMLatestFirmware$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$otaContinue(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->otaContinue()V

    return-void
.end method

.method public static final synthetic access$otaFinish(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->otaFinish()V

    return-void
.end method

.method public static final synthetic access$otaPause(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->otaPause()V

    return-void
.end method

.method public static final synthetic access$otaReady(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->otaReady()V

    return-void
.end method

.method public static final synthetic access$otaStart(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->otaStart()V

    return-void
.end method

.method public static final synthetic access$otaStatusFail(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->otaStatusFail(I)V

    return-void
.end method

.method public static final synthetic access$otaUpdating(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->otaUpdating(I)V

    return-void
.end method

.method public static final synthetic access$otaWaitFinish(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->otaWaitFinish()V

    return-void
.end method

.method public static final synthetic access$setMDownloaded$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mDownloaded:I

    return-void
.end method

.method public static final synthetic access$updateUpgradeStatus(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->updateUpgradeStatus(ZLjava/lang/String;)V

    return-void
.end method

.method private final checkDownload()V
    .locals 5

    iget v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mDownloaded:I

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mSteps:Ljava/util/List;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->upgrade()V

    :cond_0
    return-void
.end method

.method private final destroyOTA()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mBluetoothManager:Lcom/bluetrum/abota/bluetooth/BleManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/bluetrum/abota/bluetooth/BleManager;->close()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mAbOta:Lcom/bluetrum/fota/abota/ABOta;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mBluetoothManager:Lcom/bluetrum/abota/bluetooth/BleManager;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " destroyOTA"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method private final initOTA()V
    .locals 3

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    new-instance v1, Lcom/bluetrum/abota/bluetooth/BleManager;

    invoke-direct {v1, p0, v0}, Lcom/bluetrum/abota/bluetooth/BleManager;-><init>(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mBluetoothManager:Lcom/bluetrum/abota/bluetooth/BleManager;

    new-instance v0, Lcom/bluetrum/fota/abota/ABOta;

    invoke-direct {v0}, Lcom/bluetrum/fota/abota/ABOta;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mAbOta:Lcom/bluetrum/fota/abota/ABOta;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mOTAEventListener:Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$iO;

    invoke-virtual {v0, v2}, Lcom/bluetrum/fota/abota/ABOta;->setEventListener(Lcom/bluetrum/fota/abota/ABOta$EventListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mAbOta:Lcom/bluetrum/fota/abota/ABOta;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lcom/bluetrum/fota/abota/ABOta;->setSendCallback(Lcom/bluetrum/fota/abota/ABOta$SendCallback;)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mBluetoothManager:Lcom/bluetrum/abota/bluetooth/BleManager;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mBluetoothEventListener:Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$XIi00iiXO;

    invoke-virtual {v0, v1}, Lcom/bluetrum/abota/bluetooth/BleManager;->setEventListener(Lcom/bluetrum/abota/bluetooth/BluetoothEventListener;)V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mBluetoothManager:Lcom/bluetrum/abota/bluetooth/BleManager;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/bluetrum/abota/bluetooth/BleManager;->open()V

    :cond_2
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " initOTA"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method private final otaContinue()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " otaContinue -> Upgrading firmware..."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method private final otaFinish()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " otaFinish -> The upgrade is complete"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method private final otaPause()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " otaPause -> The upgrade has been paused"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method private final otaReady()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " otaReady -> Ready"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method private final otaStart()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " otaStart -> Upgrading firmware..."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1, v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->updateUpgradeStatus$default(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;ZLjava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private final otaStatusFail(I)V
    .locals 4

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/16 v1, 0xb

    if-eq p1, v1, :cond_1

    const/16 v1, 0x1001

    if-eq p1, v1, :cond_0

    packed-switch p1, :pswitch_data_0

    const-string p1, "Unknown error"

    goto :goto_0

    :pswitch_0
    const-string p1, "DataReader error"

    goto :goto_0

    :pswitch_1
    const-string p1, "TWS is disconnected and the upgrade is stopped"

    goto :goto_0

    :pswitch_2
    const-string p1, "Receive timeout"

    goto :goto_0

    :cond_0
    const-string p1, "The device refuses to be upgraded"

    goto :goto_0

    :cond_1
    const-string p1, "CRC error"

    goto :goto_0

    :cond_2
    const-string p1, "The key does not correspond"

    goto :goto_0

    :cond_3
    const-string p1, "The firmware is the same"

    :goto_0
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " otaStatusFail -> "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0, v0, p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->updateUpgradeStatus(ZLjava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1003
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final otaUpdating(I)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXOXiO;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/IXOXiO;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;I)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final otaUpdating$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;I)V
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p0

    int-to-float p1, p1

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p1, v0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    return-void
.end method

.method private final otaWaitFinish()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " otaWaitFinish -> The data transfer is complete, please wait for the upgrade to complete, and the device will restart automatically"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->upgradeDone()V

    return-void
.end method

.method private final updateUpgradeStatus(ZLjava/lang/String;)V
    .locals 4

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

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p2, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    return-void
.end method

.method public static synthetic updateUpgradeStatus$default(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;ZLjava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, ""

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->updateUpgradeStatus(ZLjava/lang/String;)V

    return-void
.end method

.method private final upgrade()V
    .locals 6

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->TAG:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mSteps:Ljava/util/List;

    iget v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mStepsIndex:I

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

    const/4 v3, 0x2

    const/4 v4, 0x0

    const v5, 0x7f1412ba

    invoke-static {v1, v5, v2, v3, v4}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object v1

    iget v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mStepsIndex:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mSteps:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v2, v4}, [Ljava/lang/Object;

    move-result-object v2

    const v4, 0x7f14146e

    invoke-virtual {p0, v4, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mSteps:Ljava/util/List;

    iget v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mStepsIndex:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$FileType;

    sget-object v2, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$OXO1;->OXO1:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    if-ne v1, v3, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " firmware"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->destroyOTA()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->initOTA()V

    return-void

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 5

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->initView()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->TAG:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->TAG:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " Firmware -> "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    const v2, 0x7f14148f

    if-nez v1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mCurrentFirmware:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvLatest()Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

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
    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mCurrentFirmware:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvLatest()Landroid/widget/TextView;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->TAG:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvLatest()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " latest -> "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvCurrent()Landroid/widget/TextView;

    move-result-object v1

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mCurrentFirmware:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->TAG:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvCurrent()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " current -> "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mSteps:Ljava/util/List;

    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$FileType;->FIRMWARE:Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$FileType;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

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
    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->iiOOI()Z

    move-result p1

    const/4 v1, 0x1

    if-nez p1, :cond_1

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {p1, v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->closeConnection(Z)V

    :cond_1
    iput v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mDownloaded:I

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const v4, 0x7f140476

    invoke-static {p1, v4, v0, v2, v3}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    iget p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mStepsIndex:I

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_3

    new-instance p1, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mDownloaded:I

    add-int/2addr p1, v1

    iput p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mDownloaded:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->checkDownload()V

    return-void

    :cond_2
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " download firmware"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v2

    const-string v3, "getParent(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v3, "getName(...)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$onBottomClick$1;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity$onBottomClick$1;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;)V

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_3
    return-void

    :cond_4
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->upgrade()V

    return-void
.end method

.method public onDestroy()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mSteps:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mStepsIndex:I

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mSteps:Ljava/util/List;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result v1

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v1, Lcom/szabh/smable3/BleKey;->UI_FILE:Lcom/szabh/smable3/BleKey;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, Lcom/szabh/smable3/component/BaseBleCache;->remove$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->closeConnection(Z)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->destroyOTA()V

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->onDestroy()V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getMStarted()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->onHandleBackPressed()V

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

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " startOTA -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Lcom/bluetrum/abota/data/MyDataReader;

    invoke-direct {v0, p1}, Lcom/bluetrum/abota/data/MyDataReader;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mAbOta:Lcom/bluetrum/fota/abota/ABOta;

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Lcom/bluetrum/fota/abota/ABOta;->setDataReader(Lcom/bluetrum/fota/manager/DataReader;)V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mAbOta:Lcom/bluetrum/fota/abota/ABOta;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/bluetrum/fota/abota/ABOta;->startOTA()V

    :cond_1
    return-void
.end method

.method public final upgradeDone()V
    .locals 3

    const v0, 0x7f1412e8

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->updateDeviceInfo(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeZActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/FirmwareVersion;->getFlag()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v2, "unbind"

    invoke-static {v2, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "show_device_unbind_popup"

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    :cond_1
    const-string v0, "FRIMWARE_UPGRADE_DONE"

    const-string v1, "done"

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
