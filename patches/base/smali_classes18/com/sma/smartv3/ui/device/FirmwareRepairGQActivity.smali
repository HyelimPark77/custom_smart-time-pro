.class public final Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity;
.super Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;
.implements Lcom/goodix/ble/gr/toolbox/app/libfastdfu/FastDfuProgressCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;",
        "Landroidx/lifecycle/Observer<",
        "Ljava/lang/Object;",
        ">;",
        "Lcom/goodix/ble/gr/toolbox/app/libfastdfu/FastDfuProgressCallback;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFirmwareRepairGQActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairGQActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairGQActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,120:1\n15#2:121\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairGQActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairGQActivity\n*L\n31#1:121\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFirmwareRepairGQActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairGQActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairGQActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,120:1\n15#2:121\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairGQActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairGQActivity\n*L\n31#1:121\n*E\n"
    }
.end annotation


# instance fields
.field private final mDevice$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mLatest:Lcom/sma/smartv3/model/FirmwareVersion;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OI0OOI01;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/OI0OOI01;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity;->mDevice$delegate:Lkotlin/Lazy;

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

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity;->mLatest:Lcom/sma/smartv3/model/FirmwareVersion;

    return-void
.end method

.method public static synthetic O10IXXX0X()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity;->mDevice_delegate$lambda$0()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity;->upgrade$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity;)V

    return-void
.end method

.method public static final synthetic access$upgrade(Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity;->upgrade()V

    return-void
.end method

.method private final getMDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity;->mDevice$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method private static final mDevice_delegate$lambda$0()Landroid/bluetooth/BluetoothDevice;
    .locals 2

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMDfuAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method private final upgrade()V
    .locals 4

    const-string v0, "start upgrade"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->setMStarted(Z)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X0OOOIi0I;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/X0OOOIi0I;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private static final upgrade$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity;)V
    .locals 4

    const-string v0, "start OTA"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/io/FileInputStream;

    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity;->mLatest:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    new-instance v0, Lcom/goodix/ble/gr/toolbox/app/libfastdfu/FastDfu;

    invoke-direct {v0}, Lcom/goodix/ble/gr/toolbox/app/libfastdfu/FastDfu;-><init>()V

    invoke-virtual {v0, p0}, Lcom/goodix/ble/gr/toolbox/app/libfastdfu/FastDfu;->setListener(Lcom/goodix/ble/gr/toolbox/app/libfastdfu/FastDfuProgressCallback;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity;->getMDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v0, p0, v2, v1}, Lcom/goodix/ble/gr/toolbox/app/libfastdfu/FastDfu;->startDfu(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/io/InputStream;)Z

    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V

    return-void
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

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->initView()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity;->mLatest:Lcom/sma/smartv3/model/FirmwareVersion;

    if-nez v0, :cond_0

    const v0, 0x7f141027

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->setMStarted(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvName()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity;->mLatest:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvSize()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity;->mLatest:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileSize()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2}, Lcom/blankj/utilcode/util/ConvertUtils;->byte2FitMemorySize(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity;->mLatest:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity;->mLatest:Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity$initView$1;

    invoke-direct {v4, p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity$initView$1;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity;)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    return-void
.end method

.method public onChanged(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "connState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lcom/szabh/androiddfu/goodix/DfuConnection$ConnState;

    sget-object v1, Lcom/sma/smartv3/ui/device/FirmwareRepairGQActivity$OXO1;->OXO1:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DfuConnection.ConnState "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string p1, "DfuConnection.ConnState.READY"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    return-void

    :cond_1
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->setMStarted(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object p1

    const v0, 0x7f140bf5

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    :cond_2
    return-void
.end method

.method public onDfuComplete()V
    .locals 1

    const v0, 0x7f14118e

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onDfuErase(I)V
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object p1

    const v0, 0x7f140265

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public onDfuError(ILjava/lang/String;Ljava/lang/Error;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Error;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->setMStarted(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object p1

    const p2, 0x7f140bf5

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public onDfuProgress(I)V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140beb

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getDfuProgress()Lcom/sma/smartv3/view/DfuProgress;

    move-result-object v0

    int-to-float p1, p1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr p1, v1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/DfuProgress;->setProgress(F)V

    return-void
.end method

.method public onDfuStart()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f1412ba

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method
