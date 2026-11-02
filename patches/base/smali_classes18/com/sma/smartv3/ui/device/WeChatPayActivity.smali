.class public final Lcom/sma/smartv3/ui/device/WeChatPayActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWeChatPayActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeChatPayActivity.kt\ncom/sma/smartv3/ui/device/WeChatPayActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,334:1\n176#2,11:335\n196#2:354\n176#2,11:355\n196#2:374\n252#3,7:346\n270#3:353\n252#3,7:366\n270#3:373\n*S KotlinDebug\n*F\n+ 1 WeChatPayActivity.kt\ncom/sma/smartv3/ui/device/WeChatPayActivity\n*L\n186#1:335,11\n186#1:354\n210#1:355,11\n210#1:374\n186#1:346,7\n186#1:353\n210#1:366,7\n210#1:373\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWeChatPayActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeChatPayActivity.kt\ncom/sma/smartv3/ui/device/WeChatPayActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,334:1\n176#2,11:335\n196#2:354\n176#2,11:355\n196#2:374\n252#3,7:346\n270#3:353\n252#3,7:366\n270#3:373\n*S KotlinDebug\n*F\n+ 1 WeChatPayActivity.kt\ncom/sma/smartv3/ui/device/WeChatPayActivity\n*L\n186#1:335,11\n186#1:354\n210#1:355,11\n210#1:374\n186#1:346,7\n186#1:353\n210#1:366,7\n210#1:373\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final TEST_MODE_SDK_NORMAL:I

.field private final TEST_MODE_SDK_TEST:I

.field private final VERIFY_TIMEOUT:J

.field private final btnActive$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/WeChatPayActivity$iO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCheckingActivateState:Z

.field private mDeviceState:Lcom/sma/smartv3/model/DeviceState;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mVerifyJob:Lkotlinx/coroutines/XiOIO;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mWechatPaySettings:Lcom/szabh/smable3/entity/BleWechatPaySettings;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private testMode:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    const-string v0, "WeChatPayActivity"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/qq6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/qq6;-><init>(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->btnActive$delegate:Lkotlin/Lazy;

    const/4 v0, 0x1

    iput v0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->TEST_MODE_SDK_TEST:I

    iget v0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->TEST_MODE_SDK_NORMAL:I

    iput v0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->testMode:I

    const-wide/16 v0, 0x7530

    iput-wide v0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->VERIFY_TIMEOUT:J

    new-instance v0, Lcom/sma/smartv3/ui/device/WeChatPayActivity$iO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity$iO;-><init>(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/WeChatPayActivity$iO;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->dismissLoadPopup$lambda$0(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/WeChatPayActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->onClick$lambda$0$0(Lcom/sma/smartv3/ui/device/WeChatPayActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->btnActive_delegate$lambda$0(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/WeChatPayActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->onClick$lambda$0(Lcom/sma/smartv3/ui/device/WeChatPayActivity;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$cancelVerifyTimeout(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->cancelVerifyTimeout()V

    return-void
.end method

.method public static final synthetic access$dismissLoadPopup(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->dismissLoadPopup()V

    return-void
.end method

.method public static final synthetic access$distributionData(Lcom/sma/smartv3/ui/device/WeChatPayActivity;[B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->distributionData([B)V

    return-void
.end method

.method public static final synthetic access$getBtnActive(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)Landroid/widget/Button;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->getBtnActive()Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMCheckingActivateState$p(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->mCheckingActivateState:Z

    return p0
.end method

.method public static final synthetic access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)Lcom/android/mltcode/paycertificationapi/uq;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getVERIFY_TIMEOUT$p(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->VERIFY_TIMEOUT:J

    return-wide v0
.end method

.method public static final synthetic access$gotoActive(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->gotoActive()V

    return-void
.end method

.method public static final synthetic access$setMCheckingActivateState$p(Lcom/sma/smartv3/ui/device/WeChatPayActivity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->mCheckingActivateState:Z

    return-void
.end method

.method public static final synthetic access$setMDeviceState$p(Lcom/sma/smartv3/ui/device/WeChatPayActivity;Lcom/sma/smartv3/model/DeviceState;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->mDeviceState:Lcom/sma/smartv3/model/DeviceState;

    return-void
.end method

.method public static final synthetic access$setMWechatPaySettings$p(Lcom/sma/smartv3/ui/device/WeChatPayActivity;Lcom/szabh/smable3/entity/BleWechatPaySettings;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->mWechatPaySettings:Lcom/szabh/smable3/entity/BleWechatPaySettings;

    return-void
.end method

.method public static final synthetic access$setView(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->setView()V

    return-void
.end method

.method public static final synthetic access$showActivated(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->showActivated()V

    return-void
.end method

.method private static final btnActive_delegate$lambda$0(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a01b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private final cancelVerifyTimeout()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->mVerifyJob:Lkotlinx/coroutines/XiOIO;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/XiOIO$OXO1;->XIi00iiXO(Lkotlinx/coroutines/XiOIO;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    iput-object v1, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->mVerifyJob:Lkotlinx/coroutines/XiOIO;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->mCheckingActivateState:Z

    return-void
.end method

.method private final changeDeviceState()V
    .locals 8

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    const/4 v1, 0x2

    invoke-static {v1}, Lcom/sma/smartv3/network/RequestBodyKt;->getChangeDeviceStateBody(I)Ljava/util/HashMap;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/device/WeChatPayActivity$changeDeviceState$1;

    invoke-direct {v2}, Lcom/sma/smartv3/ui/device/WeChatPayActivity$changeDeviceState$1;-><init>()V

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v4

    sget-object v5, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v5}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v5

    const-string v6, "/wechat/pay/changeDeviceState"

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

    new-instance v5, Lcom/sma/smartv3/ui/device/WeChatPayActivity$changeDeviceState$$inlined$post$default$1;

    invoke-direct {v5, v3, v2, v4}, Lcom/sma/smartv3/ui/device/WeChatPayActivity$changeDeviceState$$inlined$post$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

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

    new-instance v2, Lcom/sma/smartv3/ui/device/WeChatPayActivity$changeDeviceState$$inlined$post$default$2;

    invoke-direct {v2, v5}, Lcom/sma/smartv3/ui/device/WeChatPayActivity$changeDeviceState$$inlined$post$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method private final dismissLoadPopup()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/pq6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/pq6;-><init>(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method private static final dismissLoadPopup$lambda$0(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)V
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method private final distributionData([B)V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->startVerifyTimeout()V

    new-instance v0, Lcom/sma/smartv3/ui/device/WeChatPayActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)V

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/PayCertificationApi;->distributionData([BLcom/android/mltcode/paycertification/call/VerificationListener;)V

    return-void
.end method

.method private final getBtnActive()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->btnActive$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final gotoActive()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " gotoActive"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->initAliAgent()V

    return-void
.end method

.method private final initAliAgent()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->TAG:Ljava/lang/String;

    iget v2, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->testMode:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " initAliAgent -> testMode="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/device/WeChatPayActivity$XIi00iiXO;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)V

    invoke-static {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/PayCertificationApi;->init(Landroid/content/Context;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/IWrite;)V

    return-void
.end method

.method private final onClick()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->getBtnActive()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/oq6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/oq6;-><init>(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final onClick$lambda$0(Lcom/sma/smartv3/ui/device/WeChatPayActivity;Landroid/view/View;)V
    .locals 2

    new-instance p1, Lcom/android/mltcode/paycertificationapi/nq6;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/nq6;-><init>(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)V

    const/4 p0, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v1, p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    return-void
.end method

.method private static final onClick$lambda$0$0(Lcom/sma/smartv3/ui/device/WeChatPayActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->startVerifyTimeout()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->getDeviceState()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final setView()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->mWechatPaySettings:Lcom/szabh/smable3/entity/BleWechatPaySettings;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleWechatPaySettings;->isActivate()I

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->getBtnActive()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->getBtnActive()Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->changeDeviceState()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->getBtnActive()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->getBtnActive()Landroid/widget/Button;

    move-result-object v0

    const v2, 0x7f140062

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->getBtnActive()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method private final showActivated()V
    .locals 6

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->changeDeviceState()V

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/device/WeChatPayActivity$showActivated$1;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, Lcom/sma/smartv3/ui/device/WeChatPayActivity$showActivated$1;-><init>(Lcom/sma/smartv3/ui/device/WeChatPayActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method private final startVerifyTimeout()V
    .locals 6

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->cancelVerifyTimeout()V

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/device/WeChatPayActivity$startVerifyTimeout$1;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, Lcom/sma/smartv3/ui/device/WeChatPayActivity$startVerifyTimeout$1;-><init>(Lcom/sma/smartv3/ui/device/WeChatPayActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->mVerifyJob:Lkotlinx/coroutines/XiOIO;

    return-void
.end method


# virtual methods
.method public final getAlipayStateFromDevice()V
    .locals 10

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " getAlipayStateFromDevice"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->WECHAT_PAY_SET:Lcom/szabh/smable3/BleKey;

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

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->TAG:Ljava/lang/String;

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

    new-instance v2, Lcom/sma/smartv3/ui/device/WeChatPayActivity$getDeviceState$1;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity$getDeviceState$1;-><init>(Lcom/sma/smartv3/ui/device/WeChatPayActivity;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v4

    sget-object v5, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v5}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v5

    const-string v6, "/wechat/pay/getDeviceState"

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

    new-instance v5, Lcom/sma/smartv3/ui/device/WeChatPayActivity$getDeviceState$$inlined$post$default$1;

    invoke-direct {v5, v3, v2, v4}, Lcom/sma/smartv3/ui/device/WeChatPayActivity$getDeviceState$$inlined$post$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

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

    new-instance v2, Lcom/sma/smartv3/ui/device/WeChatPayActivity$getDeviceState$$inlined$post$default$2;

    invoke-direct {v2, v5}, Lcom/sma/smartv3/ui/device/WeChatPayActivity$getDeviceState$$inlined$post$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 7
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/WeChatPayActivity$iO;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v2, Lcom/szabh/smable3/BleKey;->WECHAT_PAY_SET:Lcom/szabh/smable3/BleKey;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-class v3, Lcom/szabh/smable3/entity/BleWechatPaySettings;

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/szabh/smable3/component/BaseBleCache;->getObject$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/szabh/smable3/entity/BleWechatPaySettings;

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->mWechatPaySettings:Lcom/szabh/smable3/entity/BleWechatPaySettings;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->getAlipayStateFromDevice()V

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

    const v1, 0x7f1414ee

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->onClick()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->setView()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0143

    return v0
.end method

.method public onDestroy()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->cancelVerifyTimeout()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/WeChatPayActivity$iO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WeChatPayActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

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
