.class public final Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;
.super Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFirmwareRepairNActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairNActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairNActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,182:1\n176#2,11:183\n196#2:202\n252#3,7:194\n270#3:201\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairNActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairNActivity\n*L\n133#1:183,11\n133#1:202\n133#1:194,7\n133#1:201\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFirmwareRepairNActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairNActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairNActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,182:1\n176#2,11:183\n196#2:202\n252#3,7:194\n270#3:201\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairNActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairNActivity\n*L\n133#1:183,11\n133#1:202\n133#1:194,7\n133#1:201\n*E\n"
    }
.end annotation


# instance fields
.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleScanner$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mDevice:Landroid/bluetooth/BluetoothDevice;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mDfuProgressListener:Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$iO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0iX0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O0iX0;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;->mBleScanner$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$iO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$iO;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;->mDfuProgressListener:Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$iO;

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$OXO1;

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;->mBleScanner_delegate$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMBleScanner(Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;->getMBleScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMDevice$p(Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;)Landroid/bluetooth/BluetoothDevice;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;->mDevice:Landroid/bluetooth/BluetoothDevice;

    return-object p0
.end method

.method public static final synthetic access$setMDevice$p(Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;->mDevice:Landroid/bluetooth/BluetoothDevice;

    return-void
.end method

.method private final getMBleScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;->mBleScanner$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    return-object v0
.end method

.method private static final mBleScanner_delegate$lambda$0(Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;
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

    new-instance v1, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->X1ii(Lcom/android/mltcode/paycertificationapi/i1OIOOIiX;)Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final checkFirmware()V
    .locals 8

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140be8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const-string v1, "0"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/sma/smartv3/network/RequestBodyKt;->getCheckFirmwareVersionBody$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/HashMap;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$checkFirmware$1;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$checkFirmware$1;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v3

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

    new-instance v5, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$checkFirmware$$inlined$post$default$1;

    invoke-direct {v5, v3, v2, v4}, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$checkFirmware$$inlined$post$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

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

    new-instance v2, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$checkFirmware$$inlined$post$default$2;

    invoke-direct {v2, v5}, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$checkFirmware$$inlined$post$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final download(Lcom/sma/smartv3/model/FirmwareVersion;)V
    .locals 5
    .param p1    # Lcom/sma/smartv3/model/FirmwareVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "firmwareVersion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileUrl()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$download$1;

    invoke-direct {v4, p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$download$1;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;Lcom/sma/smartv3/model/FirmwareVersion;)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    return-void
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$OXO1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initView()V
    .locals 1

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->initView()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;->mDfuProgressListener:Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$iO;

    invoke-static {p0, v0}, Lno/nordicsemi/android/dfu/DfuServiceListenerHelper;->registerProgressListener(Landroid/content/Context;Lno/nordicsemi/android/dfu/DfuProgressListener;)V

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onAttachedToWindow()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->setMStarted(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;->getMBleScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XXI(Z)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;->getMBleScanner()Lcom/android/mltcode/paycertificationapi/OXOI0XII;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OXOI0XII;->XIi00iiXO()V

    invoke-super {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->onDestroy()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity;->mDfuProgressListener:Lcom/sma/smartv3/ui/device/FirmwareRepairNActivity$iO;

    invoke-static {p0, v0}, Lno/nordicsemi/android/dfu/DfuServiceListenerHelper;->unregisterProgressListener(Landroid/content/Context;Lno/nordicsemi/android/dfu/DfuProgressListener;)V

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

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    return-void
.end method
