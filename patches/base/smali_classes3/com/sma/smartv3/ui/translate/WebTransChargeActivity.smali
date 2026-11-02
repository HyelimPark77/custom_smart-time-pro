.class public final Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;
.super Lcom/sma/smartv3/binding/BaseBindingActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sma/smartv3/binding/BaseBindingActivity<",
        "Lcom/sma/smartv3/databinding/ActivityTranslateChargeWebBinding;",
        ">;"
    }
.end annotation


# instance fields
.field private isAllowDirectBack:Z

.field private final webChromeClient:Landroid/webkit/WebChromeClient;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final webViewClient:Landroid/webkit/WebViewClient;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/binding/BaseBindingActivity;-><init>()V

    new-instance v0, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity$OXO1;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity$OXO1;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;->webChromeClient:Landroid/webkit/WebChromeClient;

    new-instance v0, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;->webViewClient:Landroid/webkit/WebViewClient;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;->initWebview$lambda$0(Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;Landroid/view/View;)V

    return-void
.end method

.method private final initWebview(Ljava/lang/String;)V
    .locals 4

    const v0, 0x7f0a0024

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/qw6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/qw6;-><init>(Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f1413ab

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/binding/BaseBindingActivity;->getBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/databinding/ActivityTranslateChargeWebBinding;

    iget-object v0, v0, Lcom/sma/smartv3/databinding/ActivityTranslateChargeWebBinding;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setLoadsImagesAutomatically(Z)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setMediaPlaybackRequiresUserGesture(Z)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/binding/BaseBindingActivity;->getMArg1()I

    move-result v1

    sget-object v2, Lcom/sma/smartv3/ui/me/WebViewActivity;->Companion:Lcom/sma/smartv3/ui/me/WebViewActivity$OXO1;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/me/WebViewActivity$OXO1;->XOO0ii0()I

    move-result v3

    if-ne v1, v3, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/binding/BaseBindingActivity;->getMArg1()I

    move-result v1

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/me/WebViewActivity$OXO1;->iO()I

    move-result v2

    if-ne v1, v2, :cond_1

    :cond_0
    const-string v1, "Chrome Mobile"

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    :cond_1
    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/binding/BaseBindingActivity;->getBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/databinding/ActivityTranslateChargeWebBinding;

    iget-object v0, v0, Lcom/sma/smartv3/databinding/ActivityTranslateChargeWebBinding;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/binding/BaseBindingActivity;->getBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/databinding/ActivityTranslateChargeWebBinding;

    iget-object p1, p1, Lcom/sma/smartv3/databinding/ActivityTranslateChargeWebBinding;->webView:Landroid/webkit/WebView;

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;->webChromeClient:Landroid/webkit/WebChromeClient;

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/binding/BaseBindingActivity;->getBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/databinding/ActivityTranslateChargeWebBinding;

    iget-object p1, p1, Lcom/sma/smartv3/databinding/ActivityTranslateChargeWebBinding;->webView:Landroid/webkit/WebView;

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;->webViewClient:Landroid/webkit/WebViewClient;

    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    return-void
.end method

.method private static final initWebview$lambda$0(Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method


# virtual methods
.method public final getWebChromeClient()Landroid/webkit/WebChromeClient;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;->webChromeClient:Landroid/webkit/WebChromeClient;

    return-object v0
.end method

.method public final getWebViewClient()Landroid/webkit/WebViewClient;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;->webViewClient:Landroid/webkit/WebViewClient;

    return-object v0
.end method

.method public bridge synthetic inflateBinding(Landroid/view/LayoutInflater;)Landroidx/viewbinding/ViewBinding;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;->inflateBinding(Landroid/view/LayoutInflater;)Lcom/sma/smartv3/databinding/ActivityTranslateChargeWebBinding;

    move-result-object p1

    return-object p1
.end method

.method public inflateBinding(Landroid/view/LayoutInflater;)Lcom/sma/smartv3/databinding/ActivityTranslateChargeWebBinding;
    .locals 1
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "inflater"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Lcom/sma/smartv3/databinding/ActivityTranslateChargeWebBinding;->inflate(Landroid/view/LayoutInflater;)Lcom/sma/smartv3/databinding/ActivityTranslateChargeWebBinding;

    move-result-object p1

    const-string v0, "inflate(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final isAllowDirectBack()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;->isAllowDirectBack:Z

    return v0
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lskin/support/app/SkinCompatActivity;->onDestroy()V

    invoke-virtual {p0}, Lcom/sma/smartv3/binding/BaseBindingActivity;->getBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/databinding/ActivityTranslateChargeWebBinding;

    iget-object v0, v0, Lcom/sma/smartv3/databinding/ActivityTranslateChargeWebBinding;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1
    .param p2    # Landroid/view/KeyEvent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/sma/smartv3/binding/BaseBindingActivity;->getBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/databinding/ActivityTranslateChargeWebBinding;

    iget-object v0, v0, Lcom/sma/smartv3/databinding/ActivityTranslateChargeWebBinding;->webView:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;->isAllowDirectBack:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/binding/BaseBindingActivity;->getBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/databinding/ActivityTranslateChargeWebBinding;

    iget-object p1, p1, Lcom/sma/smartv3/databinding/ActivityTranslateChargeWebBinding;->webView:Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->goBack()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/binding/BaseBindingActivity;->getBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/databinding/ActivityTranslateChargeWebBinding;

    iget-object p1, p1, Lcom/sma/smartv3/databinding/ActivityTranslateChargeWebBinding;->webView:Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoBack()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;->isAllowDirectBack:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/binding/BaseBindingActivity;->getBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/databinding/ActivityTranslateChargeWebBinding;

    iget-object p1, p1, Lcom/sma/smartv3/databinding/ActivityTranslateChargeWebBinding;->webView:Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->goBack()V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onViewCreated()V
    .locals 4

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "url"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WebTransChargeUrl:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;->initWebview(Ljava/lang/String;)V

    return-void
.end method

.method public final returnAllowDirectBack()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;->isAllowDirectBack:Z

    return-void
.end method

.method public final setAllowDirectBack(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/translate/WebTransChargeActivity;->isAllowDirectBack:Z

    return-void
.end method
