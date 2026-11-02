.class public final Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;
.super Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLanguageRepairRActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageRepairRActivity.kt\ncom/sma/smartv3/ui/device/LanguageRepairRActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,155:1\n18#2,2:156\n15#2:158\n27#2,2:159\n*S KotlinDebug\n*F\n+ 1 LanguageRepairRActivity.kt\ncom/sma/smartv3/ui/device/LanguageRepairRActivity\n*L\n85#1:156,2\n85#1:158\n148#1:159,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLanguageRepairRActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageRepairRActivity.kt\ncom/sma/smartv3/ui/device/LanguageRepairRActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,155:1\n18#2,2:156\n15#2:158\n27#2,2:159\n*S KotlinDebug\n*F\n+ 1 LanguageRepairRActivity.kt\ncom/sma/smartv3/ui/device/LanguageRepairRActivity\n*L\n85#1:156,2\n85#1:158\n148#1:159,2\n*E\n"
    }
.end annotation


# instance fields
.field private final mDfuCallback:Lcom/sma/smartv3/ui/device/LanguageRepairRActivity$OXO1;
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
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/oj;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/oj;-><init>(Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;->mDfuHelper$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;->mDfuCallback:Lcom/sma/smartv3/ui/device/LanguageRepairRActivity$OXO1;

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

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;->mDfuConfig:Lcom/realsil/sdk/dfu/model/DfuConfig;

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

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;->mLanguageData:Lcom/sma/smartv3/model/ExtraPackageData;

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;)Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;->mDfuHelper_delegate$lambda$0(Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;)Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$downloadLanguagePage(Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;->downloadLanguagePage()V

    return-void
.end method

.method public static final synthetic access$getMLanguageData$p(Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;)Lcom/sma/smartv3/model/ExtraPackageData;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;->mLanguageData:Lcom/sma/smartv3/model/ExtraPackageData;

    return-object p0
.end method

.method public static final synthetic access$upgrade(Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;->upgrade()V

    return-void
.end method

.method private final downloadLanguagePage()V
    .locals 5

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;->mLanguageData:Lcom/sma/smartv3/model/ExtraPackageData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/ExtraPackageData;->getFileUrl()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;->mLanguageData:Lcom/sma/smartv3/model/ExtraPackageData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/ExtraPackageData;->getFileName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity$downloadLanguagePage$1;

    invoke-direct {v4, p0}, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity$downloadLanguagePage$1;-><init>(Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    return-void
.end method

.method private final getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;->mDfuHelper$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    return-object v0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getMStarted()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;->upgrade()V

    :cond_0
    return-void
.end method

.method private static final mDfuHelper_delegate$lambda$0(Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;)Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;
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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;->mDfuConfig:Lcom/realsil/sdk/dfu/model/DfuConfig;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lcom/realsil/sdk/dfu/model/DfuConfig;->setOtaWorkMode(I)V

    new-instance v1, Ljava/io/File;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;->mLanguageData:Lcom/sma/smartv3/model/ExtraPackageData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/ExtraPackageData;->getFileName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/realsil/sdk/dfu/model/DfuConfig;->setFilePath(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

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
    .locals 3

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->initView()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->setMStarted(Z)V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvName()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvSize()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;->mLanguageData:Lcom/sma/smartv3/model/ExtraPackageData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/ExtraPackageData;->getFileSize()I

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

    new-instance v1, Lcom/android/mltcode/paycertificationapi/nj;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/nj;-><init>(Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;->mDfuCallback:Lcom/sma/smartv3/ui/device/LanguageRepairRActivity$OXO1;

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
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/model/ExtraPackageData;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/LanguageRepairRActivity;->getMDfuHelper()Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

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
