.class public final Lcom/sma/smartv3/ui/me/WebViewV2Activity$initView$3;
.super Lcom/android/mltcode/paycertificationapi/II10X1I;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/WebViewV2Activity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/ui/me/WebViewV2Activity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/WebViewV2Activity;Lcom/github/lzyzsd/jsbridge/BridgeWebView;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity$initView$3;->XIi00iiXO:Lcom/sma/smartv3/ui/me/WebViewV2Activity;

    invoke-direct {p0, p2}, Lcom/android/mltcode/paycertificationapi/II10X1I;-><init>(Lcom/github/lzyzsd/jsbridge/BridgeWebView;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/me/WebViewV2Activity;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/X1OI0;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/me/WebViewV2Activity$initView$3;->XIi00iiXO(Lcom/sma/smartv3/ui/me/WebViewV2Activity;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/X1OI0;)V

    return-void
.end method

.method public static final XIi00iiXO(Lcom/sma/smartv3/ui/me/WebViewV2Activity;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/X1OI0;)V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "webView shareLog "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "true"

    const/4 v3, 0x0

    invoke-static {p1, v2, v3, v0, v1}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p1

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->shareLog(ZLcom/android/mltcode/paycertificationapi/X1OI0;)V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 6

    invoke-super {p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/II10X1I;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity$initView$3;->XIi00iiXO:Lcom/sma/smartv3/ui/me/WebViewV2Activity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->access$getWebView(Lcom/sma/smartv3/ui/me/WebViewV2Activity;)Lcom/github/lzyzsd/jsbridge/BridgeWebView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity$initView$3;->XIi00iiXO:Lcom/sma/smartv3/ui/me/WebViewV2Activity;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/ux6;

    invoke-direct {v2, v1}, Lcom/android/mltcode/paycertificationapi/ux6;-><init>(Lcom/sma/smartv3/ui/me/WebViewV2Activity;)V

    const-string v1, "shareLog"

    invoke-virtual {v0, v1, v2}, Lcom/github/lzyzsd/jsbridge/BridgeWebView;->I0iXXO(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/X0i00iX1;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity$initView$3;->XIi00iiXO:Lcom/sma/smartv3/ui/me/WebViewV2Activity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/me/WebViewV2Activity;->isUseWebViewTitle()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " view.title -> ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " view.url -> ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity$initView$3;->XIi00iiXO:Lcom/sma/smartv3/ui/me/WebViewV2Activity;

    invoke-static {p2}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/me/WebViewV2Activity$initView$3$onPageFinished$2;

    iget-object p2, p0, Lcom/sma/smartv3/ui/me/WebViewV2Activity$initView$3;->XIi00iiXO:Lcom/sma/smartv3/ui/me/WebViewV2Activity;

    const/4 v1, 0x0

    invoke-direct {v3, p2, p1, v1}, Lcom/sma/smartv3/ui/me/WebViewV2Activity$initView$3$onPageFinished$2;-><init>(Lcom/sma/smartv3/ui/me/WebViewV2Activity;Landroid/webkit/WebView;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    :cond_0
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/II10X1I;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
