.class public final Lcom/sma/smartv3/ui/device/FontRepairRActivity;
.super Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/FontRepairRActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFontRepairRActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontRepairRActivity.kt\ncom/sma/smartv3/ui/device/FontRepairRActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,153:1\n18#2,2:154\n15#2:156\n*S KotlinDebug\n*F\n+ 1 FontRepairRActivity.kt\ncom/sma/smartv3/ui/device/FontRepairRActivity\n*L\n85#1:154,2\n85#1:156\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFontRepairRActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontRepairRActivity.kt\ncom/sma/smartv3/ui/device/FontRepairRActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,153:1\n18#2,2:154\n15#2:156\n*S KotlinDebug\n*F\n+ 1 FontRepairRActivity.kt\ncom/sma/smartv3/ui/device/FontRepairRActivity\n*L\n85#1:154,2\n85#1:156\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/device/FontRepairRActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final FIRMWARE_FONT_DIR:Ljava/lang/String; = "firmware_font"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private final mDfuCallback:Lcom/sma/smartv3/ui/device/FontRepairRActivity$XIi00iiXO;
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

.field private final mLanguageData:Lcom/sma/smartv3/model/ExtraPackageData;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/device/FontRepairRActivity$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/device/FontRepairRActivity$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/device/FontRepairRActivity;->Companion:Lcom/sma/smartv3/ui/device/FontRepairRActivity$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OI1iIi0i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OI1iIi0i;-><init>(Lcom/sma/smartv3/ui/device/FontRepairRActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FontRepairRActivity;->mDfuHelper$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/device/FontRepairRActivity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/FontRepairRActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/FontRepairRActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FontRepairRActivity;->mDfuCallback:Lcom/sma/smartv3/ui/device/FontRepairRActivity$XIi00iiXO;

    new-instance v0, Lcom/realsil/sdk/dfu/model/DfuConfig;

    invoke-direct {v0}, Lcom/realsil/sdk/dfu/model/DfuConfig;-><init>()V

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMDfuAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/realsil/sdk/dfu/model/DfuConfig;->setAddress(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/realsil/sdk/dfu/model/DfuConfig;->setAutomaticActiveEnabled(Z)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/realsil/sdk/dfu/model/DfuConfig;->setFileLocation(I)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FontRepairRActivity;->mDfuConfig:Lcom/realsil/sdk/dfu/model/DfuConfig;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

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

    if-nez v0, :cond_0

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    :cond_0
    check-cast v0, Lcom/sma/smartv3/model/ExtraPackageData;

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FontRepairRActivity;->mLanguageData:Lcom/sma/smartv3/model/ExtraPackageData;

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/FontRepairRActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/FontRepairRActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/device/FontRepairRActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/FontRepairRActivity;)Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FontRepairRActivity;->mDfuHelper_delegate$lambda$0(Lcom/sma/smartv3/ui/device/FontRepairRActivity;)Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/FontRepairRActivity;D)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/FontRepairRActivity;->initCacheFile$lambda$0(Lcom/sma/smartv3/ui/device/FontRepairRActivity;D)V

    return-void
.end method

.method public static final synthetic access$getMLanguageData$p(Lcom/sma/smartv3/ui/device/FontRepairRActivity;)Lcom/sma/smartv3/model/ExtraPackageData;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FontRepairRActivity;->mLanguageData:Lcom/sma/smartv3/model/ExtraPackageData;

    return-object p0
.end method

.method public static final synthetic access$initCacheFile(Lcom/sma/smartv3/ui/device/FontRepairRActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FontRepairRActivity;->initCacheFile()V

    return-void
.end method

.method private final getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FontRepairRActivity;->mDfuHelper$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    return-object v0
.end method

.method private final initCacheFile()V
    .locals 5

    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->IO0iXO0O()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->IO0iXO0O()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "firmware_font/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/IXIO0XI;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/IXIO0XI;-><init>(Lcom/sma/smartv3/ui/device/FontRepairRActivity;)V

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromIS(Ljava/io/File;Ljava/io/InputStream;ZLcom/blankj/utilcode/util/FileIOUtils$OnProgressUpdateListener;)Z

    return-void
.end method

.method private static final initCacheFile$lambda$0(Lcom/sma/smartv3/ui/device/FontRepairRActivity;D)V
    .locals 2

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double p1, p1, v0

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FontRepairRActivity;->upgrade()V

    :cond_0
    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/FontRepairRActivity;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getMStarted()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FontRepairRActivity;->upgrade()V

    :cond_0
    return-void
.end method

.method private static final mDfuHelper_delegate$lambda$0(Lcom/sma/smartv3/ui/device/FontRepairRActivity;)Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p0

    invoke-static {p0}, Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;->getInstance(Landroid/content/Context;)Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object p0

    return-object p0
.end method

.method private final upgrade()V
    .locals 4

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->setMStarted(Z)V

    const-string v0, "upgrade"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f1412ba

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FontRepairRActivity;->mDfuConfig:Lcom/realsil/sdk/dfu/model/DfuConfig;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lcom/realsil/sdk/dfu/model/DfuConfig;->setOtaWorkMode(I)V

    new-instance v1, Ljava/io/File;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v2

    sget-object v3, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/q62;->IO0iXO0O()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/realsil/sdk/dfu/model/DfuConfig;->setFilePath(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FontRepairRActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->startOtaProcess(Lcom/realsil/sdk/dfu/model/DfuConfig;)Z

    :cond_0
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

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->closeConnection(Z)V

    return-void
.end method

.method public initView()V
    .locals 5

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->initView()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->setMStarted(Z)V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140c02

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvName()Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "\ud55c\uad6d\uc5b4"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvSize()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->IO0iXO0O()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "firmware_font/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2}, Lcom/blankj/utilcode/util/ConvertUtils;->byte2FitMemorySize(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f141117

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XX11iOI00;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/XX11iOI00;-><init>(Lcom/sma/smartv3/ui/device/FontRepairRActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FontRepairRActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FontRepairRActivity;->mDfuCallback:Lcom/sma/smartv3/ui/device/FontRepairRActivity$XIi00iiXO;

    invoke-virtual {v0, v1}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->initialize(Lcom/realsil/sdk/dfu/utils/DfuAdapter$DfuHelperCallback;)Z

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
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FontRepairRActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->abort()Z

    invoke-virtual {v0}, Lcom/realsil/sdk/dfu/utils/BluetoothDfuAdapter;->close()V

    :cond_0
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
