.class public final Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;
.super Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;
.implements Lcom/goodix/ble/gr/libdfu/EasyDfu$DfuEvent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;",
        "Landroidx/lifecycle/Observer<",
        "Ljava/lang/Object;",
        ">;",
        "Lcom/goodix/ble/gr/libdfu/EasyDfu$DfuEvent;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperUpgradeGActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperUpgradeGActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeGActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,210:1\n19#2:211\n15#2:212\n15#2:213\n11#2,2:214\n*S KotlinDebug\n*F\n+ 1 DeveloperUpgradeGActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeGActivity\n*L\n40#1:211\n40#1:212\n53#1:213\n135#1:214,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperUpgradeGActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperUpgradeGActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeGActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,210:1\n19#2:211\n15#2:212\n15#2:213\n11#2,2:214\n*S KotlinDebug\n*F\n+ 1 DeveloperUpgradeGActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeGActivity\n*L\n40#1:211\n40#1:212\n53#1:213\n135#1:214,2\n*E\n"
    }
.end annotation


# instance fields
.field private final alreadyUpdateDeviceList:Lcom/android/mltcode/paycertificationapi/OIOO0X00O;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private dfuConnection:Lcom/szabh/androiddfu/goodix/DfuConnection;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mActivity$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCurrent:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mDevice$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mDfuFiles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field private final mLatest:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;-><init>()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4, v3}, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;-><init>(Ljava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    iput-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->alreadyUpdateDeviceList:Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iI0XO;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/iI0XO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->mActivity$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I0XiIi01;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/I0XiIi01;-><init>()V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->mDevice$delegate:Lkotlin/Lazy;

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

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->mLatest:Lcom/sma/smartv3/model/FirmwareVersion;

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v2, Lcom/szabh/smable3/BleKey;->FIRMWARE_VERSION:Lcom/szabh/smable3/BleKey;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/szabh/smable3/component/BaseBleCache;->getString$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/String;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->mCurrent:Ljava/lang/String;

    new-instance v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity$XIi00iiXO;

    return-void
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;)Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->mActivity_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;)Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->upgrade$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;)V

    return-void
.end method

.method public static synthetic XiOIii1()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->mDevice_delegate$lambda$0()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getMDfuFiles$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->mDfuFiles:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getMLatest$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;)Lcom/sma/smartv3/model/FirmwareVersion;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->mLatest:Lcom/sma/smartv3/model/FirmwareVersion;

    return-object p0
.end method

.method public static final synthetic access$getProgressButton(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;)Lcom/sma/smartv3/view/ProgressButton;
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setMDfuFiles$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->mDfuFiles:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$setMStarted(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    return-void
.end method

.method public static final synthetic access$upgrade(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->upgrade()V

    return-void
.end method

.method private final getMActivity()Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->mActivity$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;

    return-object v0
.end method

.method private final getMDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->mDevice$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method private static final mActivity_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;)Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;
    .locals 0

    return-object p0
.end method

.method private static final mDevice_delegate$lambda$0()Landroid/bluetooth/BluetoothDevice;
    .locals 3

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "TEST_MODE_OTA_DEVICE_ADDRESS"

    invoke-virtual {v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method private final resetDfuConnection()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->dfuConnection:Lcom/szabh/androiddfu/goodix/DfuConnection;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/szabh/androiddfu/goodix/DfuConnection;->XXI()Landroidx/lifecycle/LiveData;

    move-result-object v1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->getMActivity()Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/lifecycle/LiveData;->removeObserver(Landroidx/lifecycle/Observer;)V

    invoke-virtual {v0}, Lcom/szabh/androiddfu/goodix/DfuConnection;->X0O()Landroidx/lifecycle/LiveData;

    move-result-object v1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->getMActivity()Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/lifecycle/LiveData;->removeObserver(Landroidx/lifecycle/Observer;)V

    invoke-virtual {v0}, Lcom/szabh/androiddfu/goodix/DfuConnection;->O10IXXX0X()Lcom/goodix/ble/gr/libdfu/EasyDfu;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/goodix/ble/gr/libdfu/EasyDfu;->setListener(Lcom/goodix/ble/gr/libdfu/EasyDfu$DfuEvent;)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->dfuConnection:Lcom/szabh/androiddfu/goodix/DfuConnection;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/szabh/androiddfu/goodix/DfuConnection;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method private final upgrade()V
    .locals 4

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->closeConnection(Z)V

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IX0XI0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/IX0XI0;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;)V

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private static final upgrade$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;)V
    .locals 4

    const-string v0, "test upgrade"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->resetDfuConnection()V

    new-instance v0, Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->getMDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/szabh/androiddfu/goodix/DfuConnection;-><init>(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)V

    const-string v1, "test dfuConnection"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/szabh/androiddfu/goodix/DfuConnection;->XXI()Landroidx/lifecycle/LiveData;

    move-result-object v1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->getMActivity()Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;

    move-result-object v2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->getMActivity()Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    invoke-virtual {v0}, Lcom/szabh/androiddfu/goodix/DfuConnection;->X0O()Landroidx/lifecycle/LiveData;

    move-result-object v1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->getMActivity()Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;

    move-result-object v2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->getMActivity()Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    invoke-virtual {v0}, Lcom/szabh/androiddfu/goodix/DfuConnection;->O10IXXX0X()Lcom/goodix/ble/gr/libdfu/EasyDfu;

    move-result-object v1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->getMActivity()Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/goodix/ble/gr/libdfu/EasyDfu;->setListener(Lcom/goodix/ble/gr/libdfu/EasyDfu$DfuEvent;)V

    invoke-virtual {v0}, Lcom/szabh/androiddfu/goodix/DfuConnection;->I1XOi1()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->dfuConnection:Lcom/szabh/androiddfu/goodix/DfuConnection;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity$XIi00iiXO;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initView()V
    .locals 3

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->initView()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->mLatest:Lcom/sma/smartv3/model/FirmwareVersion;

    const v1, 0x7f14148f

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvLatest()Landroid/widget/TextView;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->mCurrent:Ljava/lang/String;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

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

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvLatest()Landroid/widget/TextView;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->mLatest:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getVersion()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvCurrent()Landroid/widget/TextView;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->mCurrent:Ljava/lang/String;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->onBottomClick(Landroid/view/View;)V

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

    const-string p1, "test onBottomClick"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const v3, 0x7f141117

    invoke-static {v0, v3, p1, v1, v2}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    sget-object p1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->mLatest:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->mLatest:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity$onBottomClick$1;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity$onBottomClick$1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;)V

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    return-void
.end method

.method public onChanged(Ljava/lang/Object;)V
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "connState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "test "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    instance-of v0, p1, Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;

    if-eqz v0, :cond_4

    check-cast p1, Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;

    sget-object v0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity$OXO1;->OXO1:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v1, :cond_3

    const/4 v3, 0x2

    if-eq p1, v3, :cond_0

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->dfuConnection:Lcom/szabh/androiddfu/goodix/DfuConnection;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/szabh/androiddfu/goodix/DfuConnection;->O10IXXX0X()Lcom/goodix/ble/gr/libdfu/EasyDfu;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v3, Ljava/io/FileInputStream;

    iget-object v4, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->mDfuFiles:Ljava/util/List;

    const-string v5, "mDfuFiles"

    if-nez v4, :cond_1

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v2

    :cond_1
    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-direct {v3, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    new-instance v0, Ljava/io/FileInputStream;

    iget-object v4, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->mDfuFiles:Ljava/util/List;

    if-nez v4, :cond_2

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v2, v4

    :goto_0
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {p1, v3, v0}, Lcom/goodix/ble/gr/libdfu/EasyDfu;->startDfuInABMode(Ljava/io/InputStream;Ljava/io/InputStream;)Z

    return-void

    :cond_3
    iput-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->dfuConnection:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->upgrade()V

    :cond_4
    :goto_1
    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->resetDfuConnection()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity$XIi00iiXO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->onDestroy()V

    return-void
.end method

.method public onDfuComplete()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->alreadyUpdateDeviceList:Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;->XO0O10()Ljava/util/ArrayList;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    const-string v3, "TEST_MODE_OTA_DEVICE_ADDRESS"

    invoke-virtual {v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->alreadyUpdateDeviceList:Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

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

.method public onDfuError(Ljava/lang/String;Ljava/lang/Error;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Error;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "p1"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p2

    const/4 v0, 0x2

    const/4 v1, 0x0

    const v2, 0x7f140bf5

    invoke-static {p2, v2, p1, v0, v1}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->upgrade()V

    return-void
.end method

.method public onDfuErrorFirmwareOverlay()V
    .locals 5

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const v4, 0x7f140bf5

    invoke-static {v1, v4, v0, v2, v3}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->upgrade()V

    return-void
.end method

.method public onDfuProgress(I)V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    int-to-float p1, p1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr p1, v1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    return-void
.end method

.method public onDfuStart()V
    .locals 5

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const v3, 0x7f1412ba

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    return-void
.end method
