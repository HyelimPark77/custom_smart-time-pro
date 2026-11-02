.class public final Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;
.super Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity$FileType;,
        Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGPSFirmwareRepairSmaActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GPSFirmwareRepairSmaActivity.kt\ncom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,232:1\n15#2:233\n18#2,2:234\n15#2:236\n27#2,2:237\n*S KotlinDebug\n*F\n+ 1 GPSFirmwareRepairSmaActivity.kt\ncom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity\n*L\n37#1:233\n87#1:234,2\n87#1:236\n225#1:237,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGPSFirmwareRepairSmaActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GPSFirmwareRepairSmaActivity.kt\ncom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,232:1\n15#2:233\n18#2,2:234\n15#2:236\n27#2,2:237\n*S KotlinDebug\n*F\n+ 1 GPSFirmwareRepairSmaActivity.kt\ncom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity\n*L\n37#1:233\n87#1:234,2\n87#1:236\n225#1:237,2\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBleHandleCallback:Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mDownloaded:I

.field private final mLatestExtraPacks:Lcom/sma/smartv3/model/ExtraPackVersions;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mLatestGpsFirmware:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mSteps:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity$FileType;",
            ">;"
        }
    .end annotation
.end field

.field private mStepsIndex:I

.field private final mUiData:Lcom/sma/smartv3/model/ExtraPackageData;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;-><init>()V

    const-string v0, "RepairGPSFirmware"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->TAG:Ljava/lang/String;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/sma/smartv3/model/ExtraPackVersions;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/ExtraPackVersions;

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mLatestExtraPacks:Lcom/sma/smartv3/model/ExtraPackVersions;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/model/ExtraPackVersions;->getGpsFirmwareVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-object v1, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mLatestGpsFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mSteps:Ljava/util/List;

    new-instance v1, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity$XIi00iiXO;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/sma/smartv3/model/ExtraPackageData;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    :cond_1
    check-cast v0, Lcom/sma/smartv3/model/ExtraPackageData;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mUiData:Lcom/sma/smartv3/model/ExtraPackageData;

    return-void
.end method

.method public static synthetic I1XOi1()V
    .locals 0

    invoke-static {}, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->upgrade$lambda$0()V

    return-void
.end method

.method public static synthetic O10IXXX0X()V
    .locals 0

    invoke-static {}, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->upgrade$lambda$1()V

    return-void
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$checkDownload(Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->checkDownload()V

    return-void
.end method

.method public static final synthetic access$getMDownloaded$p(Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mDownloaded:I

    return p0
.end method

.method public static final synthetic access$getMSteps$p(Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mSteps:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getMStepsIndex$p(Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mStepsIndex:I

    return p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$setMDownloaded$p(Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mDownloaded:I

    return-void
.end method

.method public static final synthetic access$setMStepsIndex$p(Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mStepsIndex:I

    return-void
.end method

.method public static final synthetic access$upgrade(Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->upgrade()V

    return-void
.end method

.method private final checkDownload()V
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mDownloaded:I

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mSteps:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f141117

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    const-string v0, "checkDownload done start upgrade"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->upgrade()V

    :cond_0
    return-void
.end method

.method private final downloadUiPage()V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->TAG:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->TAG:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mUiData:Lcom/sma/smartv3/model/ExtraPackageData;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " download -> "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140476

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mDownloaded:I

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->setMStarted(Z)V

    iget v0, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mStepsIndex:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mLatestGpsFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mLatestGpsFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity$downloadUiPage$1;

    invoke-direct {v4, p0}, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity$downloadUiPage$1;-><init>(Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;)V

    invoke-virtual {v1, v0, v2, v3, v4}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_0
    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMAGpsFileUrl()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity$downloadUiPage$2;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity$downloadUiPage$2;-><init>(Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;)V

    const-string v4, "agps"

    invoke-virtual {v0, v1, v2, v4, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->upgrade()V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getMStarted()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->upgrade()V

    :cond_0
    return-void
.end method

.method private final upgrade()V
    .locals 10

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->setMStarted(Z)V

    const-string v1, "upgrade"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v1

    const v2, 0x7f1412ba

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "gps_firmware_upgrade_failed"

    invoke-virtual {v1, v2, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mSteps:Ljava/util/List;

    iget v2, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mStepsIndex:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity$FileType;

    sget-object v2, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity$OXO1;->OXO1:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const-wide/16 v2, 0xfa0

    if-eq v1, v0, :cond_2

    const/4 v0, 0x2

    if-ne v1, v0, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " agps_file"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v4, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v5, Lcom/szabh/smable3/BleKey;->AGPS_FILE:Lcom/szabh/smable3/BleKey;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->IiI10X(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Ljava/io/File;IILjava/lang/Object;)Z

    return-void

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/III0iOIX;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/III0iOIX;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->TAG:Ljava/lang/String;

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

    if-eqz v0, :cond_3

    sget-object v5, Lcom/szabh/smable3/BleKey;->GPS_FIRMWARE_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v6, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mLatestGpsFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

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

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iOXO00OI0;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/iOXO00OI0;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity$XIi00iiXO;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initView()V
    .locals 3

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->initView()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->setMStarted(Z)V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140c75

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvName()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mLatestGpsFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvSize()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mLatestGpsFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileSize()I

    move-result v1

    int-to-long v1, v1

    goto :goto_1

    :cond_1
    const-wide/16 v1, 0x0

    :goto_1
    invoke-static {v1, v2}, Lcom/blankj/utilcode/util/ConvertUtils;->byte2FitMemorySize(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f141117

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OiXiXO;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OiXiXO;-><init>(Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mLatestGpsFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mSteps:Ljava/util/List;

    sget-object v1, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity$FileType;->GPS_FIRMWARE:Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity$FileType;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mSteps:Ljava/util/List;

    sget-object v1, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity$FileType;->AGPS_FILE:Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity$FileType;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->downloadUiPage()V

    return-void
.end method

.method public isNeedLaunch()Z
    .locals 1

    const/4 v0, 0x0

    return v0
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

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/GPSFirmwareRepairSmaActivity$XIi00iiXO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/model/ExtraPackageData;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

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

.method public final upgradeDone()V
    .locals 11

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "gps_firmware_upgrade_failed"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    sget-object v3, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v4, Lcom/szabh/smable3/BleKey;->GPS_FIRMWARE_VERSION:Lcom/szabh/smable3/BleKey;

    sget-object v5, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v9, 0x1c

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v10}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
