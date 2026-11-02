.class public final Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$googlePayCheckOrder$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->googlePayCheckOrder(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/smartv3/model/GooglePayOrderData;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$googlePayCheckOrder$1;->OXO1:Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/model/GooglePayOrderData;)V
    .locals 6

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$googlePayCheckOrder$1;->OXO1:Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getOrderType()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartGooglePlayUtil handleResponse -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", orderType = "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$googlePayCheckOrder$1;->OXO1:Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->getSmartGooglePlayUtil()Lcom/smart/playlib/SmartGooglePlayUtil;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/smart/playlib/SmartGooglePlayUtil;->I0iXXO()V

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "GOOGLE_PAY_TOKEN"

    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$googlePayCheckOrder$1;->OXO1:Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getOrderType()Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/OrderManager;->iX()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/sma/smartv3/biz/OrderManager;->i010I()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$googlePayCheckOrder$1;->OXO1:Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getWebView()Landroid/webkit/WebView;

    move-result-object p1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i0O111;->OXO1:Lcom/android/mltcode/paycertificationapi/i0O111;

    const-string v1, "1"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i0O111;->O10IXXX0X(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-virtual {v0}, Lcom/sma/smartv3/biz/OrderManager;->IXXOO()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$googlePayCheckOrder$1;->OXO1:Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->access$loadTranslationUrl(Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;)V

    return-void

    :cond_3
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$googlePayCheckOrder$1;->OXO1:Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/me/WebViewActivity;->payStatusCallBackSuccess()V

    return-void

    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$googlePayCheckOrder$1;->OXO1:Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getWebView()Landroid/webkit/WebView;

    move-result-object p1

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const-string v1, "1"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sma/smartv3/biz/OrderManager;->OX(Lcom/sma/smartv3/biz/OrderManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 6

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$googlePayCheckOrder$1;->OXO1:Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getOrderType()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "smartGooglePlayUtil handleError -> error = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " , orderType = "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$googlePayCheckOrder$1;->OXO1:Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;->getSmartGooglePlayUtil()Lcom/smart/playlib/SmartGooglePlayUtil;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/smart/playlib/SmartGooglePlayUtil;->I0iXXO()V

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "GOOGLE_PAY_TOKEN"

    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$googlePayCheckOrder$1;->OXO1:Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getOrderType()Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/OrderManager;->iX()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/sma/smartv3/biz/OrderManager;->i010I()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$googlePayCheckOrder$1;->OXO1:Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getWebView()Landroid/webkit/WebView;

    move-result-object p1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i0O111;->OXO1:Lcom/android/mltcode/paycertificationapi/i0O111;

    const-string v1, "2"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i0O111;->O10IXXX0X(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$googlePayCheckOrder$1;->OXO1:Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/me/WebViewActivity;->payStatusCallBackSuccess()V

    return-void

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$googlePayCheckOrder$1;->OXO1:Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getWebView()Landroid/webkit/WebView;

    move-result-object p1

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const-string v1, "2"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sma/smartv3/biz/OrderManager;->OX(Lcom/sma/smartv3/biz/OrderManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/GooglePayOrderData;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity$googlePayCheckOrder$1;->OXO1(Lcom/sma/smartv3/model/GooglePayOrderData;)V

    return-void
.end method
