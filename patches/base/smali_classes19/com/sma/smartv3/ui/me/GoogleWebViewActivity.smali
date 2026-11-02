.class public Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;
.super Lcom/sma/smartv3/ui/me/WebViewActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGoogleWebViewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleWebViewActivity.kt\ncom/sma/smartv3/ui/me/GoogleWebViewActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,155:1\n325#2,11:156\n336#2:168\n347#2:187\n1#3:167\n383#4,18:169\n*S KotlinDebug\n*F\n+ 1 GoogleWebViewActivity.kt\ncom/sma/smartv3/ui/me/GoogleWebViewActivity\n*L\n115#1:156,11\n115#1:168\n115#1:187\n115#1:167\n115#1:169,18\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGoogleWebViewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleWebViewActivity.kt\ncom/sma/smartv3/ui/me/GoogleWebViewActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,155:1\n325#2,11:156\n336#2:168\n347#2:187\n1#3:167\n383#4,18:169\n*S KotlinDebug\n*F\n+ 1 GoogleWebViewActivity.kt\ncom/sma/smartv3/ui/me/GoogleWebViewActivity\n*L\n115#1:156,11\n115#1:168\n115#1:187\n115#1:167\n115#1:169,18\n*E\n"
    }
.end annotation


# instance fields
.field private lastCheckOrderNum:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private lastCheckOrderTime:J

.field private lastCheckOrderToken:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private orderNum:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private productId:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private smartGooglePlayUtil:Lcom/smart/playlib/SmartGooglePlayUtil;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->productId:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->orderNum:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->lastCheckOrderNum:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->lastCheckOrderToken:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$loadTranslationUrl(Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->loadTranslationUrl()V

    return-void
.end method

.method private final loadTranslationUrl()V
    .locals 7

    sget-object v0, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v0}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "/kotlinweb"

    const-string v3, ""

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/orderDetail/#/translateOrderEn?result=1&orderType=Translate"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getWebView()Landroid/webkit/WebView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getLastCheckOrderNum()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->lastCheckOrderNum:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastCheckOrderTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->lastCheckOrderTime:J

    return-wide v0
.end method

.method public final getLastCheckOrderToken()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->lastCheckOrderToken:Ljava/lang/String;

    return-object v0
.end method

.method public final getOrderNum()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->orderNum:Ljava/lang/String;

    return-object v0
.end method

.method public final getProductId()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->productId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSmartGooglePlayUtil()Lcom/smart/playlib/SmartGooglePlayUtil;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->smartGooglePlayUtil:Lcom/smart/playlib/SmartGooglePlayUtil;

    return-object v0
.end method

.method public final googlePayCheckOrder(Ljava/lang/String;)V
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "purchaseToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->lastCheckOrderTime:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->lastCheckOrderToken:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->lastCheckOrderTime:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->lastCheckOrderTime:J

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->orderNum:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->lastCheckOrderNum:Ljava/lang/String;

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->lastCheckOrderToken:Ljava/lang/String;

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getAppPackageName(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f140142

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "getString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->productId:Ljava/lang/String;

    iget-object v4, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->orderNum:Ljava/lang/String;

    invoke-static {v1, v2, v3, p1, v4}, Lcom/sma/smartv3/network/RequestBodyKt;->getCheckOrderBody(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object p1

    new-instance v1, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$googlePayCheckOrder$1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$googlePayCheckOrder$1;-><init>(Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/network/NetWorkUtils;->getHeadersMap()Ljava/util/Map;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v4

    sget-object v5, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v5}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v5

    const-string v6, "/aliPay/google/checkOrder"

    invoke-virtual {v0, v5, v6}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {p1}, Lkotlin/collections/OXO1;->X111IO(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    sget-object v9, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {v0, v7, v8}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object v0, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$googlePayCheckOrder$$inlined$postJsonV2$default$1;

    invoke-direct {v5, v3, v1, v4}, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$googlePayCheckOrder$$inlined$postJsonV2$default$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {v0}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addHeaders(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addApplicationJsonBody(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object v0, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/reflect/Type;

    const-class v1, Lcom/sma/smartv3/model/GooglePayOrderData;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v1, v0}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$googlePayCheckOrder$$inlined$postJsonV2$default$2;

    invoke-direct {v1, v5}, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$googlePayCheckOrder$$inlined$postJsonV2$default$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, v0, v1}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public initView()V
    .locals 1

    invoke-super {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->initView()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iO1()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/smart/playlib/SmartGooglePlayUtil;->XOO0ii0:Lcom/smart/playlib/SmartGooglePlayUtil$OXO1;

    invoke-virtual {v0}, Lcom/smart/playlib/SmartGooglePlayUtil$OXO1;->OXO1()Lcom/smart/playlib/SmartGooglePlayUtil;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->smartGooglePlayUtil:Lcom/smart/playlib/SmartGooglePlayUtil;

    :cond_0
    return-void
.end method

.method public final overseasPay(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "isSubscribeGoods"

    const-string v1, "getString(...)"

    const-string v2, "data"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "overseasPay  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    const v3, 0x7f1414b0

    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v5, "eleId"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->productId:Ljava/lang/String;

    const-string v5, "orderNum"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v5, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->orderNum:Ljava/lang/String;

    const/4 v1, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {p1, v0, v6, v1, v5}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    move p1, v6

    :goto_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iO1()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->productId:Ljava/lang/String;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_4

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->orderNum:Ljava/lang/String;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_4

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->productId:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "GOOGLE_PAY_TOKEN"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->smartGooglePlayUtil:Lcom/smart/playlib/SmartGooglePlayUtil;

    if-eqz v1, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, Lcom/smart/playlib/SmartGooglePlayUtil;->XXI(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->smartGooglePlayUtil:Lcom/smart/playlib/SmartGooglePlayUtil;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1, p0, p1}, Lcom/smart/playlib/SmartGooglePlayUtil;->X0O(Ljava/lang/String;Landroidx/appcompat/app/AppCompatActivity;Z)V

    goto :goto_1

    :cond_2
    const-string p1, "error : productId is null"

    new-array v0, v6, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->smartGooglePlayUtil:Lcom/smart/playlib/SmartGooglePlayUtil;

    if-eqz p1, :cond_5

    new-instance v0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;)V

    invoke-virtual {p1, v0}, Lcom/smart/playlib/SmartGooglePlayUtil;->XiOIii1(Lcom/smart/playlib/SmartGooglePlayUtil$XIi00iiXO;)V

    return-void

    :cond_4
    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iO1()Z

    move-result p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->orderNum:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->productId:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "overseasPay error :  isSupportGooglePay = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, " ,  "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " , "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    invoke-static {v3}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_2
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "overseasPay error : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    invoke-static {v3}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :cond_5
    return-void
.end method

.method public final setLastCheckOrderNum(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->lastCheckOrderNum:Ljava/lang/String;

    return-void
.end method

.method public final setLastCheckOrderTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->lastCheckOrderTime:J

    return-void
.end method

.method public final setLastCheckOrderToken(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->lastCheckOrderToken:Ljava/lang/String;

    return-void
.end method

.method public final setOrderNum(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->orderNum:Ljava/lang/String;

    return-void
.end method

.method public final setProductId(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->productId:Ljava/lang/String;

    return-void
.end method

.method public final setSmartGooglePlayUtil(Lcom/smart/playlib/SmartGooglePlayUtil;)V
    .locals 0
    .param p1    # Lcom/smart/playlib/SmartGooglePlayUtil;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->smartGooglePlayUtil:Lcom/smart/playlib/SmartGooglePlayUtil;

    return-void
.end method
