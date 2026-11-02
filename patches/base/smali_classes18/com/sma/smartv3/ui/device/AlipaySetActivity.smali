.class public final Lcom/sma/smartv3/ui/device/AlipaySetActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAlipaySetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlipaySetActivity.kt\ncom/sma/smartv3/ui/device/AlipaySetActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,517:1\n176#2,11:518\n196#2:537\n176#2,11:538\n196#2:557\n176#2,11:558\n196#2:577\n252#3,7:529\n270#3:536\n252#3,7:549\n270#3:556\n252#3,7:569\n270#3:576\n*S KotlinDebug\n*F\n+ 1 AlipaySetActivity.kt\ncom/sma/smartv3/ui/device/AlipaySetActivity\n*L\n228#1:518,11\n228#1:537\n251#1:538,11\n251#1:557\n283#1:558,11\n283#1:577\n228#1:529,7\n228#1:536\n251#1:549,7\n251#1:556\n283#1:569,7\n283#1:576\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAlipaySetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlipaySetActivity.kt\ncom/sma/smartv3/ui/device/AlipaySetActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,517:1\n176#2,11:518\n196#2:537\n176#2,11:538\n196#2:557\n176#2,11:558\n196#2:577\n252#3,7:529\n270#3:536\n252#3,7:549\n270#3:556\n252#3,7:569\n270#3:576\n*S KotlinDebug\n*F\n+ 1 AlipaySetActivity.kt\ncom/sma/smartv3/ui/device/AlipaySetActivity\n*L\n228#1:518,11\n228#1:537\n251#1:538,11\n251#1:557\n283#1:558,11\n283#1:577\n228#1:529,7\n228#1:536\n251#1:549,7\n251#1:556\n283#1:569,7\n283#1:576\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final TEST_MODE_SDK_NORMAL:I

.field private final TEST_MODE_SDK_TEST:I

.field private final btnActive$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isIOTServerConnect:Z

.field private final mActiveCheckTask:Lcom/sma/smartv3/ui/device/AlipaySetActivity$XO0O10;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mActiveCheckTime:I

.field private final mActiveCheckTimer:Ljava/util/Timer;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mAliAgent:Lcom/alibaba/aliagentsdk/api/IAliAgent;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mAlipaySettings:Lcom/szabh/smable3/entity/BleAlipaySettings;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mAutoRetryActiveTime:I

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/AlipaySetActivity$O00;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBtDataUploadCallback:Lcom/alibaba/aliagentsdk/callback/IBtDataUploadCallback;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mDeviceState:Lcom/sma/smartv3/model/DeviceState;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private testMode:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    const-string v0, "Alipay"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXX11XXiO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XXX11XXiO;-><init>(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->btnActive$delegate:Lkotlin/Lazy;

    const/4 v0, 0x1

    iput v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->TEST_MODE_SDK_TEST:I

    iget v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->TEST_MODE_SDK_NORMAL:I

    iput v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->testMode:I

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mActiveCheckTimer:Ljava/util/Timer;

    new-instance v0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$XO0O10;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity$XO0O10;-><init>(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mActiveCheckTask:Lcom/sma/smartv3/ui/device/AlipaySetActivity$XO0O10;

    new-instance v0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$O00;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity$O00;-><init>(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/AlipaySetActivity$O00;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->btnActive_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->sendNewAddress$lambda$0$0(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/AlipaySetActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->initView$lambda$0$0(Lcom/sma/smartv3/ui/device/AlipaySetActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->sendNewAddress$lambda$0(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V

    return-void
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->showFirmwareUpgradePopup$lambda$0$0(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->dismissLoadPopup$lambda$0(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V

    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/AlipaySetActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/device/AlipaySetActivity;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$changeDeviceState(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->changeDeviceState()V

    return-void
.end method

.method public static final synthetic access$connect(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->connect()V

    return-void
.end method

.method public static final synthetic access$connectIOTServer(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->connectIOTServer()V

    return-void
.end method

.method public static final synthetic access$dismissLoadPopup(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->dismissLoadPopup()V

    return-void
.end method

.method public static final synthetic access$getMActiveCheckTask$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)Lcom/sma/smartv3/ui/device/AlipaySetActivity$XO0O10;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mActiveCheckTask:Lcom/sma/smartv3/ui/device/AlipaySetActivity$XO0O10;

    return-object p0
.end method

.method public static final synthetic access$getMActiveCheckTime$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mActiveCheckTime:I

    return p0
.end method

.method public static final synthetic access$getMActiveCheckTimer$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)Ljava/util/Timer;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mActiveCheckTimer:Ljava/util/Timer;

    return-object p0
.end method

.method public static final synthetic access$getMAliAgent$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)Lcom/alibaba/aliagentsdk/api/IAliAgent;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mAliAgent:Lcom/alibaba/aliagentsdk/api/IAliAgent;

    return-object p0
.end method

.method public static final synthetic access$getMAlipaySettings$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)Lcom/szabh/smable3/entity/BleAlipaySettings;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mAlipaySettings:Lcom/szabh/smable3/entity/BleAlipaySettings;

    return-object p0
.end method

.method public static final synthetic access$getMAutoRetryActiveTime$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mAutoRetryActiveTime:I

    return p0
.end method

.method public static final synthetic access$getMBtDataUploadCallback$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)Lcom/alibaba/aliagentsdk/callback/IBtDataUploadCallback;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mBtDataUploadCallback:Lcom/alibaba/aliagentsdk/callback/IBtDataUploadCallback;

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getTestMode$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->testMode:I

    return p0
.end method

.method public static final synthetic access$gotoActive(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->gotoActive()V

    return-void
.end method

.method public static final synthetic access$initAliAgent(Lcom/sma/smartv3/ui/device/AlipaySetActivity;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->initAliAgent(Landroid/content/Context;)V

    return-void
.end method

.method public static final synthetic access$sendNewAddress(Lcom/sma/smartv3/ui/device/AlipaySetActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->sendNewAddress(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$setIOTServerConnect$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->isIOTServerConnect:Z

    return-void
.end method

.method public static final synthetic access$setMActiveCheckTime$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mActiveCheckTime:I

    return-void
.end method

.method public static final synthetic access$setMAlipaySettings$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;Lcom/szabh/smable3/entity/BleAlipaySettings;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mAlipaySettings:Lcom/szabh/smable3/entity/BleAlipaySettings;

    return-void
.end method

.method public static final synthetic access$setMAutoRetryActiveTime$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mAutoRetryActiveTime:I

    return-void
.end method

.method public static final synthetic access$setMBtDataUploadCallback$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;Lcom/alibaba/aliagentsdk/callback/IBtDataUploadCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mBtDataUploadCallback:Lcom/alibaba/aliagentsdk/callback/IBtDataUploadCallback;

    return-void
.end method

.method public static final synthetic access$setMDeviceState$p(Lcom/sma/smartv3/ui/device/AlipaySetActivity;Lcom/sma/smartv3/model/DeviceState;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mDeviceState:Lcom/sma/smartv3/model/DeviceState;

    return-void
.end method

.method private static final btnActive_delegate$lambda$0(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a01b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private final changeDeviceState()V
    .locals 8

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    const/4 v1, 0x2

    invoke-static {v1}, Lcom/sma/smartv3/network/RequestBodyKt;->getChangeDeviceStateBody(I)Ljava/util/HashMap;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/device/AlipaySetActivity$changeDeviceState$1;

    invoke-direct {v2}, Lcom/sma/smartv3/ui/device/AlipaySetActivity$changeDeviceState$1;-><init>()V

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v4

    sget-object v5, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v5}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v5

    const-string v6, "/pay/changeDeviceState"

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

    new-instance v5, Lcom/sma/smartv3/ui/device/AlipaySetActivity$changeDeviceState$$inlined$post$default$1;

    invoke-direct {v5, v3, v2, v4}, Lcom/sma/smartv3/ui/device/AlipaySetActivity$changeDeviceState$$inlined$post$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

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

    const-class v2, Lcom/sma/smartv3/model/DeviceState;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v2, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/device/AlipaySetActivity$changeDeviceState$$inlined$post$default$2;

    invoke-direct {v2, v5}, Lcom/sma/smartv3/ui/device/AlipaySetActivity$changeDeviceState$$inlined$post$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method private final connect()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mAliAgent:Lcom/alibaba/aliagentsdk/api/IAliAgent;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " connect#checkFgsState"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mAliAgent:Lcom/alibaba/aliagentsdk/api/IAliAgent;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v1, Lcom/sma/smartv3/ui/device/AlipaySetActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V

    invoke-interface {v0, v1}, Lcom/alibaba/aliagentsdk/api/IAliAgent;->checkFgsState(Lcom/alibaba/aliagentsdk/callback/IFgsStateCheckCallback;)V

    return-void
.end method

.method private final connectIOTServer()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mAliAgent:Lcom/alibaba/aliagentsdk/api/IAliAgent;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->TAG:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->isIOTServerConnect:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " connectIOTServer -> isIOTServerConnect="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->isIOTServerConnect:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mAliAgent:Lcom/alibaba/aliagentsdk/api/IAliAgent;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v0}, Lcom/alibaba/aliagentsdk/api/IAliAgent;->connectLp()V

    :cond_1
    :goto_0
    return-void
.end method

.method private final dismissLoadPopup()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXO1OiX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IXO1OiX;-><init>(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method private static final dismissLoadPopup$lambda$0(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method private final getBtnActive()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->btnActive$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getPayMacAddress()V
    .locals 8

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " getPayMacAddress"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-static {}, Lcom/sma/smartv3/network/RequestBodyKt;->getPayMacAddressBody()Ljava/util/HashMap;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/device/AlipaySetActivity$getPayMacAddress$1;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity$getPayMacAddress$1;-><init>(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v4

    sget-object v5, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v5}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v5

    const-string v6, "/pay/getPayMacAddress"

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

    new-instance v5, Lcom/sma/smartv3/ui/device/AlipaySetActivity$getPayMacAddress$$inlined$post$default$1;

    invoke-direct {v5, v3, v2, v4}, Lcom/sma/smartv3/ui/device/AlipaySetActivity$getPayMacAddress$$inlined$post$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

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

    const-class v2, Lcom/sma/smartv3/model/DeviceState;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v2, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/device/AlipaySetActivity$getPayMacAddress$$inlined$post$default$2;

    invoke-direct {v2, v5}, Lcom/sma/smartv3/ui/device/AlipaySetActivity$getPayMacAddress$$inlined$post$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method private final gotoActive()V
    .locals 10

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " gotoActive"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mDeviceState:Lcom/sma/smartv3/model/DeviceState;

    const/4 v2, 0x1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mAlipaySettings:Lcom/szabh/smable3/entity/BleAlipaySettings;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleAlipaySettings;->getMAlipayVersion()I

    move-result v1

    if-ne v1, v2, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->getPayMacAddress()V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mDeviceState:Lcom/sma/smartv3/model/DeviceState;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/DeviceState;->getPayAddress()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    sget-object v3, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v3}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleAddress()Ljava/lang/String;

    move-result-object v4

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v5, ":"

    const-string v6, ""

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "toUpperCase(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mAlipaySettings:Lcom/szabh/smable3/entity/BleAlipaySettings;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleAlipaySettings;->getMAlipayVersion()I

    move-result v3

    if-ne v3, v2, :cond_2

    invoke-direct {p0, v1}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->sendNewAddress(Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " startActive"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->connect()V

    return-void
.end method

.method private final initAliAgent(Landroid/content/Context;)V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->TAG:Ljava/lang/String;

    iget v2, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->testMode:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " initAliAgent -> testMode="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-static {}, Lcom/alibaba/aliagentsdk/AliAgentSdk;->getInstance()Lcom/alibaba/aliagentsdk/AliAgentSdk;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iget v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->testMode:I

    iget v2, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->TEST_MODE_SDK_TEST:I

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, p1, v1}, Lcom/alibaba/aliagentsdk/AliAgentSdk;->init(Landroid/content/Context;Z)V

    invoke-virtual {v0}, Lcom/alibaba/aliagentsdk/AliAgentSdk;->getAgent()Lcom/alibaba/aliagentsdk/api/IAliAgent;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mAliAgent:Lcom/alibaba/aliagentsdk/api/IAliAgent;

    if-eqz p1, :cond_1

    new-instance v0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V

    invoke-interface {p1, v0}, Lcom/alibaba/aliagentsdk/api/IAliAgent;->customBtImpl(Lcom/alibaba/aliagentsdk/api/IAliBt;)V

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mAliAgent:Lcom/alibaba/aliagentsdk/api/IAliAgent;

    if-eqz p1, :cond_2

    new-instance v0, Lcom/sma/smartv3/ui/device/AlipaySetActivity$iO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity$iO;-><init>(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V

    invoke-interface {p1, v0}, Lcom/alibaba/aliagentsdk/api/IAliAgent;->setLpConnectedCallback(Lcom/alibaba/aliagentsdk/callback/IConnectCallback;)V

    :cond_2
    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/AlipaySetActivity;Landroid/view/View;)V
    .locals 2

    new-instance p1, Lcom/android/mltcode/paycertificationapi/iI0O;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/iI0O;-><init>(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V

    const/4 p0, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v1, p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    return-void
.end method

.method private static final initView$lambda$0$0(Lcom/sma/smartv3/ui/device/AlipaySetActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    const/4 p1, 0x0

    iput p1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mActiveCheckTime:I

    iput p1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mAutoRetryActiveTime:I

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->getAlipayStateFromDevice()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final sendNewAddress(Ljava/lang/String;)V
    .locals 11

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " sendNewAddress -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 v1, 0x0

    :try_start_0
    const-string v3, ":"

    const-string v4, ""
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    :try_start_1
    invoke-static/range {v2 .. v7}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/ConvertUtils;->hexString2Bytes(Ljava/lang/String;)[B

    move-result-object p1

    sget-object v3, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v4, Lcom/szabh/smable3/BleKey;->ALIPAY_SET:Lcom/szabh/smable3/BleKey;

    sget-object v5, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v6, Lcom/szabh/smable3/entity/BleAlipaySettings;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {v6, v1, v1, p1}, Lcom/szabh/smable3/entity/BleAlipaySettings;-><init>(II[B)V

    const/16 v9, 0x18

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v10}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1iOX0O1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1iOX0O1;-><init>(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V

    const-wide/16 v3, 0x1770

    invoke-virtual {p1, v0, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    :goto_0
    move-object p1, v0

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v2, p1

    goto :goto_0

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " sendNewAddress -> error: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->dismissLoadPopup()V

    const-string p1, "mac error!"

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private static final sendNewAddress$lambda$0(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " sendNewAddress -> done! need rebind!"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v1, "unbind"

    invoke-static {v1, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/Oi10I1XI;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/Oi10I1XI;-><init>(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method private static final sendNewAddress$lambda$0$0(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "show_device_unbind_popup"

    invoke-static {v2, v0, v1, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->dismissLoadPopup()V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private static final showFirmwareUpgradePopup$lambda$0$0(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)Z
    .locals 2

    sget-object v0, Lcom/sma/smartv3/biz/DeviceInfoChecker;->OXO1:Lcom/sma/smartv3/biz/DeviceInfoChecker;

    new-instance v1, Lcom/sma/smartv3/ui/device/AlipaySetActivity$IiI10X;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity$IiI10X;-><init>(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V

    const-string p0, "N"

    invoke-virtual {v0, v1, p0}, Lcom/sma/smartv3/biz/DeviceInfoChecker;->XOO0ii0(Lcom/android/mltcode/paycertificationapi/O0Oiii;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final disconnectIOTServer()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mAliAgent:Lcom/alibaba/aliagentsdk/api/IAliAgent;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->TAG:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->isIOTServerConnect:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " disconnectIOTServer -> isIOTServerConnect="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->isIOTServerConnect:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mAliAgent:Lcom/alibaba/aliagentsdk/api/IAliAgent;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v1}, Lcom/alibaba/aliagentsdk/api/IAliAgent;->disconnectLp()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->isIOTServerConnect:Z

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->isIOTServerConnect:Z

    goto :goto_1

    :goto_0
    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->isIOTServerConnect:Z

    throw v1

    :cond_1
    :goto_1
    return-void
.end method

.method public final getAlipayStateFromDevice()V
    .locals 10

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " getAlipayStateFromDevice"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->ALIPAY_SET:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v8, 0x1c

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    return-void
.end method

.method public final getDeviceState()V
    .locals 8

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " getDeviceState"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-static {}, Lcom/sma/smartv3/network/RequestBodyKt;->getDeviceStateBody()Ljava/util/HashMap;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/device/AlipaySetActivity$getDeviceState$1;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity$getDeviceState$1;-><init>(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v4

    sget-object v5, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v5}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v5

    const-string v6, "/pay/getDeviceState"

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

    new-instance v5, Lcom/sma/smartv3/ui/device/AlipaySetActivity$getDeviceState$$inlined$post$default$1;

    invoke-direct {v5, v3, v2, v4}, Lcom/sma/smartv3/ui/device/AlipaySetActivity$getDeviceState$$inlined$post$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

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

    const-class v2, Lcom/sma/smartv3/model/DeviceState;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v2, v1}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/device/AlipaySetActivity$getDeviceState$$inlined$post$default$2;

    invoke-direct {v2, v5}, Lcom/sma/smartv3/ui/device/AlipaySetActivity$getDeviceState$$inlined$post$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/AlipaySetActivity$O00;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 2

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140112

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->getBtnActive()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OXi1iX0X;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OXi1iX0X;-><init>(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d002f

    return v0
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/AlipaySetActivity$O00;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->disconnectIOTServer()V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public final onFirmwareUpgradeDone(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "FRIMWARE_UPGRADE_DONE"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> onFirmwareUpgradeDone"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AlipaySetActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onHandleBackPressed()V

    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final showFirmwareUpgradePopup()V
    .locals 4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f1410f3

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XIiX;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/XIiX;-><init>(Lcom/sma/smartv3/ui/device/AlipaySetActivity;)V

    const v2, 0x7f14034b

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    return-void
.end method
