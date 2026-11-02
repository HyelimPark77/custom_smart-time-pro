.class public final Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;
.super Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$FileType;,
        Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFirmwareUpgradeNSmaActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareUpgradeNSmaActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,342:1\n15#2:343\n15#2:344\n*S KotlinDebug\n*F\n+ 1 FirmwareUpgradeNSmaActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity\n*L\n171#1:343\n172#1:344\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFirmwareUpgradeNSmaActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareUpgradeNSmaActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,342:1\n15#2:343\n15#2:344\n*S KotlinDebug\n*F\n+ 1 FirmwareUpgradeNSmaActivity.kt\ncom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity\n*L\n171#1:343\n172#1:344\n*E\n"
    }
.end annotation


# instance fields
.field private mBleHandleCallback:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleScanner$delegate:Lkotlin/Lazy;
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

.field private final mDfuProgressListener:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XO0O10;
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

.field private final mSteps:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$FileType;",
            ">;"
        }
    .end annotation
.end field

.field private mStepsIndex:I


# direct methods
.method public constructor <init>()V
    .locals 9

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0i111;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O0i111;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mBleScanner$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XO0O10;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XO0O10;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mDfuProgressListener:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XO0O10;

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XIi00iiXO;

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

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

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

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mLatestExtraPacks:Lcom/sma/smartv3/model/ExtraPackVersions;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ExtraPackVersions;->getUiPackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    iput-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ExtraPackVersions;->getLanguagePackVersion()Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v1

    :cond_1
    iput-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    sget-object v2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v3, Lcom/szabh/smable3/BleKey;->FIRMWARE_VERSION:Lcom/szabh/smable3/BleKey;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mCurrentFirmware:Ljava/lang/String;

    sget-object v3, Lcom/szabh/smable3/BleKey;->UI_PACK_VERSION:Lcom/szabh/smable3/BleKey;

    invoke-static/range {v2 .. v7}, Lcom/szabh/smable3/component/BaseBleCache;->getString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mCurrentUi:Ljava/lang/String;

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

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mCurrentLanguage:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mSteps:Ljava/util/List;

    return-void
.end method

.method public static synthetic OII()V
    .locals 0

    invoke-static {}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->upgrade$lambda$2()V

    return-void
.end method

.method public static synthetic OiIIX101O()V
    .locals 0

    invoke-static {}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->upgrade$lambda$1()V

    return-void
.end method

.method public static synthetic XX0(Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->upgrade$lambda$0(Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mBleScanner_delegate$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$checkDownload(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->checkDownload()V

    return-void
.end method

.method public static final synthetic access$getMBleScanner(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->getMBleScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMDownloaded$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mDownloaded:I

    return p0
.end method

.method public static final synthetic access$getMLatestFirmware$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMLatestLanguage$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMLatestUi$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getMSteps$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mSteps:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mStepsIndex:I

    return p0
.end method

.method public static final synthetic access$setMDownloaded$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mDownloaded:I

    return-void
.end method

.method public static final synthetic access$setMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mStepsIndex:I

    return-void
.end method

.method public static final synthetic access$upgrade(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->upgrade()V

    return-void
.end method

.method private final checkDownload()V
    .locals 5

    iget v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mDownloaded:I

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mSteps:Ljava/util/List;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->upgrade()V

    :cond_0
    return-void
.end method

.method private final getMBleScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mBleScanner$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    return-object v0
.end method

.method private static final mBleScanner_delegate$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/ut3;->OXO1:Lcom/android/mltcode/paycertificationapi/ut3;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {v0, v1, v1, v2, v1}, Lcom/android/mltcode/paycertificationapi/ut3;->XIi00iiXO(Lcom/android/mltcode/paycertificationapi/ut3;[Ljava/util/UUID;Lcom/bestmafen/baseble/scanner/ScanMode;ILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->IIX1OXO(I)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O1iiIi;

    sget-object v2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v2}, Lcom/szabh/smable3/component/BaseBleCache;->getMDfuAddress()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/android/mltcode/paycertificationapi/O1iiIi;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XiOIO(Lcom/android/mltcode/paycertificationapi/OOXIOIiOO;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$iO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$iO;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->X1ii(Lcom/android/mltcode/paycertificationapi/i1OIOOIiX;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p0

    return-object p0
.end method

.method private final upgrade()V
    .locals 10

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    const v2, 0x7f1412ba

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v2, v1, v3, v4}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object v0

    iget v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mStepsIndex:I

    const/4 v5, 0x1

    add-int/2addr v2, v5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mSteps:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v2, v6}, [Ljava/lang/Object;

    move-result-object v2

    const v6, 0x7f14146e

    invoke-virtual {p0, v6, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mSteps:Ljava/util/List;

    iget v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mStepsIndex:I

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$FileType;

    sget-object v2, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$OXO1;->OXO1:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    if-eq v0, v5, :cond_3

    const-wide/16 v1, 0xfa0

    if-eq v0, v3, :cond_2

    const/4 v3, 0x3

    if-ne v0, v3, :cond_1

    sget-object v4, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v4}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v5, Lcom/szabh/smable3/BleKey;->LANGUAGE_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v6, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

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

    new-instance v3, Lcom/android/mltcode/paycertificationapi/iO0010I;

    invoke-direct {v3}, Lcom/android/mltcode/paycertificationapi/iO0010I;-><init>()V

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/Xi1XI;

    invoke-direct {v3}, Lcom/android/mltcode/paycertificationapi/Xi1XI;-><init>()V

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_3
    new-instance v0, Lcom/android/mltcode/paycertificationapi/XiIiO1;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/XiIiO1;-><init>()V

    invoke-static {v1, v0, v5, v4}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    return-void
.end method

.method private static final upgrade$lambda$0(Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->OTA:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v7, 0x1c

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
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


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XIi00iiXO;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mDfuProgressListener:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XO0O10;

    invoke-static {p0, p1}, Lno/nordicsemi/android/dfu/DfuServiceListenerHelper;->registerProgressListener(Landroid/content/Context;Lno/nordicsemi/android/dfu/DfuProgressListener;)V

    return-void
.end method

.method public initView()V
    .locals 12

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->initView()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    const-string v1, "."

    const v2, 0x7f14148f

    if-nez v0, :cond_0

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v3, :cond_0

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v3, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mCurrentFirmware:Ljava/lang/String;

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mCurrentUi:Ljava/lang/String;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-string v4, "."

    const-string v5, ""

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mCurrentLanguage:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mCurrentFirmware:Ljava/lang/String;

    :cond_2
    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

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
    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mCurrentUi:Ljava/lang/String;

    goto :goto_0

    :goto_2
    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v5, "."

    const-string v6, ""

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

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
    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mCurrentLanguage:Ljava/lang/String;

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

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mCurrentUi:Ljava/lang/String;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const-string v7, "."

    const-string v8, ""

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mCurrentLanguage:Ljava/lang/String;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-string v4, "."

    const-string v5, ""

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvCurrent()Landroid/widget/TextView;

    move-result-object v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mCurrentFirmware:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mSteps:Ljava/util/List;

    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$FileType;->FIRMWARE:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$FileType;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mSteps:Ljava/util/List;

    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$FileType;->LANGUAGE_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$FileType;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mSteps:Ljava/util/List;

    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$FileType;->UI_PACK:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$FileType;

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

    const/4 p1, 0x0

    iput p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mDownloaded:I

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const v3, 0x7f140476

    invoke-static {v0, v3, p1, v1, v2}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    iget p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mStepsIndex:I

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_0

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mLatestFirmware:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$onBottomClick$1;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$onBottomClick$1;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_1

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mLatestUi:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$onBottomClick$2;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$onBottomClick$2;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    if-eqz p1, :cond_2

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mLatestLanguage:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$onBottomClick$3;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$onBottomClick$3;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    :cond_2
    return-void

    :cond_3
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->upgrade()V

    return-void
.end method

.method public onDestroy()V
    .locals 5

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XIi00iiXO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v2, Lcom/szabh/smable3/BleKey;->UI_FILE:Lcom/szabh/smable3/BleKey;

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4, v3}, Lcom/szabh/smable3/component/BaseBleCache;->remove$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->closeConnection(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->getMBleScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XIi00iiXO()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity;->mDfuProgressListener:Lcom/sma/smartv3/ui/device/FirmwareUpgradeNSmaActivity$XO0O10;

    invoke-static {p0, v0}, Lno/nordicsemi/android/dfu/DfuServiceListenerHelper;->unregisterProgressListener(Landroid/content/Context;Lno/nordicsemi/android/dfu/DfuProgressListener;)V

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->onDestroy()V

    return-void
.end method
