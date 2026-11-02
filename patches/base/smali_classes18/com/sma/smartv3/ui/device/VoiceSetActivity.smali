.class public final Lcom/sma/smartv3/ui/device/VoiceSetActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nVoiceSetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceSetActivity.kt\ncom/sma/smartv3/ui/device/VoiceSetActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,154:1\n176#2,11:155\n196#2:174\n252#3,7:166\n270#3:173\n*S KotlinDebug\n*F\n+ 1 VoiceSetActivity.kt\ncom/sma/smartv3/ui/device/VoiceSetActivity\n*L\n87#1:155,11\n87#1:174\n87#1:166,7\n87#1:173\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nVoiceSetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceSetActivity.kt\ncom/sma/smartv3/ui/device/VoiceSetActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,154:1\n176#2,11:155\n196#2:174\n252#3,7:166\n270#3:173\n*S KotlinDebug\n*F\n+ 1 VoiceSetActivity.kt\ncom/sma/smartv3/ui/device/VoiceSetActivity\n*L\n87#1:155,11\n87#1:174\n87#1:166,7\n87#1:173\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnActive$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/VoiceSetActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    const-string v0, "VoiceSet"

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->TAG:Ljava/lang/String;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ak6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ak6;-><init>(Lcom/sma/smartv3/ui/device/VoiceSetActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->btnActive$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/device/VoiceSetActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/VoiceSetActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/VoiceSetActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/VoiceSetActivity$OXO1;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/VoiceSetActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->btnActive_delegate$lambda$0(Lcom/sma/smartv3/ui/device/VoiceSetActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/VoiceSetActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->sendNewAddress$lambda$0(Lcom/sma/smartv3/ui/device/VoiceSetActivity;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/VoiceSetActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->dismissLoadPopup$lambda$0(Lcom/sma/smartv3/ui/device/VoiceSetActivity;)V

    return-void
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/VoiceSetActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/device/VoiceSetActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/VoiceSetActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->sendNewAddress$lambda$0$0(Lcom/sma/smartv3/ui/device/VoiceSetActivity;)V

    return-void
.end method

.method public static final synthetic access$dismissLoadPopup(Lcom/sma/smartv3/ui/device/VoiceSetActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->dismissLoadPopup()V

    return-void
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/device/VoiceSetActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$sendNewAddress(Lcom/sma/smartv3/ui/device/VoiceSetActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->sendNewAddress(Ljava/lang/String;)V

    return-void
.end method

.method private static final btnActive_delegate$lambda$0(Lcom/sma/smartv3/ui/device/VoiceSetActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a01b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private final dismissLoadPopup()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/bk6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/bk6;-><init>(Lcom/sma/smartv3/ui/device/VoiceSetActivity;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method private static final dismissLoadPopup$lambda$0(Lcom/sma/smartv3/ui/device/VoiceSetActivity;)V
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method private final getBtnActive()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->btnActive$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getPayMacAddress()V
    .locals 8

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->TAG:Ljava/lang/String;

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

    new-instance v2, Lcom/sma/smartv3/ui/device/VoiceSetActivity$getPayMacAddress$1;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/ui/device/VoiceSetActivity$getPayMacAddress$1;-><init>(Lcom/sma/smartv3/ui/device/VoiceSetActivity;)V

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

    new-instance v5, Lcom/sma/smartv3/ui/device/VoiceSetActivity$getPayMacAddress$$inlined$post$default$1;

    invoke-direct {v5, v3, v2, v4}, Lcom/sma/smartv3/ui/device/VoiceSetActivity$getPayMacAddress$$inlined$post$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

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

    new-instance v2, Lcom/sma/smartv3/ui/device/VoiceSetActivity$getPayMacAddress$$inlined$post$default$2;

    invoke-direct {v2, v5}, Lcom/sma/smartv3/ui/device/VoiceSetActivity$getPayMacAddress$$inlined$post$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {v0, v1, v2}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/VoiceSetActivity;Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->getPayMacAddress()V

    return-void
.end method

.method private final sendNewAddress(Ljava/lang/String;)V
    .locals 12

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " sendNewAddress -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v3, Lcom/szabh/smable3/BleKey;->ALIPAY_SET:Lcom/szabh/smable3/BleKey;

    sget-object v4, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v5, Lcom/szabh/smable3/entity/BleAlipaySettings;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const-string v7, ":"

    const-string v8, ""

    const/4 v9, 0x0

    move-object v6, p1

    invoke-static/range {v6 .. v11}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/ConvertUtils;->hexString2Bytes(Ljava/lang/String;)[B

    move-result-object p1

    const-string v0, "hexString2Bytes(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {v5, v0, v0, p1}, Lcom/szabh/smable3/entity/BleAlipaySettings;-><init>(II[B)V

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/dk6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/dk6;-><init>(Lcom/sma/smartv3/ui/device/VoiceSetActivity;)V

    const-wide/16 v1, 0x1770

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private static final sendNewAddress$lambda$0(Lcom/sma/smartv3/ui/device/VoiceSetActivity;)V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->TAG:Ljava/lang/String;

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

    new-instance v1, Lcom/android/mltcode/paycertificationapi/zj6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/zj6;-><init>(Lcom/sma/smartv3/ui/device/VoiceSetActivity;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method private static final sendNewAddress$lambda$0$0(Lcom/sma/smartv3/ui/device/VoiceSetActivity;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "show_device_unbind_popup"

    invoke-static {v2, v0, v1, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->dismissLoadPopup()V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/VoiceSetActivity$OXO1;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public initView()V
    .locals 2

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->XI()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->getBtnActive()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ck6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ck6;-><init>(Lcom/sma/smartv3/ui/device/VoiceSetActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0138

    return v0
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/VoiceSetActivity$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public onHandleBackPressed()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/VoiceSetActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

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
