.class public final Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private final wevView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/mb5;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/mb5;-><init>(Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;->wevView$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;)Landroid/webkit/WebView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;->wevView_delegate$lambda$0(Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;)Landroid/webkit/WebView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMContext(Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;)Landroid/app/Activity;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method private final getWevView()Landroid/webkit/WebView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;->wevView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    return-object v0
.end method

.method private static final wevView_delegate$lambda$0(Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;)Landroid/webkit/WebView;
    .locals 1

    const v0, 0x7f0a1935

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/webkit/WebView;

    return-object p0
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
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;->getWevView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setLoadsImagesAutomatically(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;->getWevView()Landroid/webkit/WebView;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/fitness_site/StravaAuthActivity;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0141

    return v0
.end method

.method public onAttachedToWindow()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onAttachedToWindow()V

    const v0, 0x7f0a1935

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    const v1, 0x7f1412d9

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "https://www.strava.com/oauth/mobile/authorize?client_id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&redirect_uri=http://localhost/auth/callback&response_type=code&scope=activity:write"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method
