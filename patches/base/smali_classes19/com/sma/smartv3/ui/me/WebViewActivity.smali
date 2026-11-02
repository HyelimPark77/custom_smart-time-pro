.class public Lcom/sma/smartv3/ui/me/WebViewActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/me/WebViewActivity$OXO1;,
        Lcom/sma/smartv3/ui/me/WebViewActivity$payStatusData;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/me/WebViewActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final TYPE_CHAIN_BREAKAGE:I

.field private static final TYPE_HELP_GUIDE:I

.field private static final TYPE_NO_TITLE:I

.field private static final TYPE_PROVACY_POLICY:I

.field private static final TYPE_TRANSLATE_BUY:I

.field private static final TYPE_USER_AGREEMENT:I

.field private static final TYPE_USER_WEB_TITLE:I


# instance fields
.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleLeft$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleOtherRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isAllowDirectBack:Z

.field private isUseWebViewTitle:Z

.field private orderType:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final titleLl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final webView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/me/WebViewActivity$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/me/WebViewActivity$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/me/WebViewActivity;->Companion:Lcom/sma/smartv3/ui/me/WebViewActivity$OXO1;

    const/4 v0, -0x1

    sput v0, Lcom/sma/smartv3/ui/me/WebViewActivity;->TYPE_PROVACY_POLICY:I

    const/4 v0, 0x1

    sput v0, Lcom/sma/smartv3/ui/me/WebViewActivity;->TYPE_USER_AGREEMENT:I

    const/4 v0, 0x2

    sput v0, Lcom/sma/smartv3/ui/me/WebViewActivity;->TYPE_USER_WEB_TITLE:I

    const/4 v0, 0x3

    sput v0, Lcom/sma/smartv3/ui/me/WebViewActivity;->TYPE_CHAIN_BREAKAGE:I

    const/4 v0, 0x4

    sput v0, Lcom/sma/smartv3/ui/me/WebViewActivity;->TYPE_TRANSLATE_BUY:I

    const/16 v0, 0x63

    sput v0, Lcom/sma/smartv3/ui/me/WebViewActivity;->TYPE_NO_TITLE:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/yw6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/yw6;-><init>(Lcom/sma/smartv3/ui/me/WebViewActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->webView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zw6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/zw6;-><init>(Lcom/sma/smartv3/ui/me/WebViewActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ax6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ax6;-><init>(Lcom/sma/smartv3/ui/me/WebViewActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->abhTitleLeft$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/bx6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/bx6;-><init>(Lcom/sma/smartv3/ui/me/WebViewActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/cx6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/cx6;-><init>(Lcom/sma/smartv3/ui/me/WebViewActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->abhTitleOtherRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/dx6;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/dx6;-><init>(Lcom/sma/smartv3/ui/me/WebViewActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->titleLl$delegate:Lkotlin/Lazy;

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->orderType:Ljava/lang/String;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/me/WebViewActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/me/WebViewActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/me/WebViewActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->titleLl_delegate$lambda$0(Lcom/sma/smartv3/ui/me/WebViewActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/me/WebViewActivity;)Landroid/webkit/WebView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->webView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/WebViewActivity;)Landroid/webkit/WebView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/WebViewActivity;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/WebViewActivity;->reviseWebViewTitle$lambda$0(Lcom/sma/smartv3/ui/me/WebViewActivity;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/me/WebViewActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->abhTitleLeft_delegate$lambda$0(Lcom/sma/smartv3/ui/me/WebViewActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/me/WebViewActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/me/WebViewActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/me/WebViewActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->abhTitleOtherRight_delegate$lambda$0(Lcom/sma/smartv3/ui/me/WebViewActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/me/WebViewActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final abhTitleLeft_delegate$lambda$0(Lcom/sma/smartv3/ui/me/WebViewActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0024

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final abhTitleOtherRight_delegate$lambda$0(Lcom/sma/smartv3/ui/me/WebViewActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0025

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/me/WebViewActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$getTYPE_CHAIN_BREAKAGE$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/ui/me/WebViewActivity;->TYPE_CHAIN_BREAKAGE:I

    return v0
.end method

.method public static final synthetic access$getTYPE_HELP_GUIDE$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/ui/me/WebViewActivity;->TYPE_HELP_GUIDE:I

    return v0
.end method

.method public static final synthetic access$getTYPE_NO_TITLE$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/ui/me/WebViewActivity;->TYPE_NO_TITLE:I

    return v0
.end method

.method public static final synthetic access$getTYPE_PROVACY_POLICY$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/ui/me/WebViewActivity;->TYPE_PROVACY_POLICY:I

    return v0
.end method

.method public static final synthetic access$getTYPE_TRANSLATE_BUY$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/ui/me/WebViewActivity;->TYPE_TRANSLATE_BUY:I

    return v0
.end method

.method public static final synthetic access$getTYPE_USER_AGREEMENT$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/ui/me/WebViewActivity;->TYPE_USER_AGREEMENT:I

    return v0
.end method

.method public static final synthetic access$getTYPE_USER_WEB_TITLE$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/ui/me/WebViewActivity;->TYPE_USER_WEB_TITLE:I

    return v0
.end method

.method private final getAbhTitleLeft()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->abhTitleLeft$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getAbhTitleOtherRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->abhTitleOtherRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getTitleLl()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->titleLl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private static final reviseWebViewTitle$lambda$0(Lcom/sma/smartv3/ui/me/WebViewActivity;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private static final titleLl_delegate$lambda$0(Lcom/sma/smartv3/ui/me/WebViewActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a0022

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final webView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/WebViewActivity;)Landroid/webkit/WebView;
    .locals 1

    const v0, 0x7f0a1935

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/webkit/WebView;

    return-object p0
.end method


# virtual methods
.method public final getAbhTitleCenter()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getOrderType()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->orderType:Ljava/lang/String;

    return-object v0
.end method

.method public final getWebView()Landroid/webkit/WebView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->webView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 12
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetJavaScriptEnabled"
        }
    .end annotation

    const-string v1, "webView orderType = "

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    sget v2, Lcom/sma/smartv3/ui/me/WebViewActivity;->TYPE_PROVACY_POLICY:I

    const/4 v3, 0x1

    if-ne v0, v2, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v0

    const v2, 0x7f141127

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    :cond_0
    sget v2, Lcom/sma/smartv3/ui/me/WebViewActivity;->TYPE_HELP_GUIDE:I

    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v0

    const v2, 0x7f140ccf

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    :cond_1
    sget v2, Lcom/sma/smartv3/ui/me/WebViewActivity;->TYPE_USER_AGREEMENT:I

    if-ne v0, v2, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v0

    const v2, 0x7f14147d

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    :cond_2
    sget v2, Lcom/sma/smartv3/ui/me/WebViewActivity;->TYPE_CHAIN_BREAKAGE:I

    if-ne v0, v2, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v0

    const v2, 0x7f140c87

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    :cond_3
    sget v2, Lcom/sma/smartv3/ui/me/WebViewActivity;->TYPE_TRANSLATE_BUY:I

    if-ne v0, v2, :cond_4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v0

    const v2, 0x7f1413ab

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    :cond_4
    sget v2, Lcom/sma/smartv3/ui/me/WebViewActivity;->TYPE_NO_TITLE:I

    if-ne v0, v2, :cond_5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getAbhTitleLeft()Landroid/widget/ImageView;

    move-result-object v0

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getAbhTitleOtherRight()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getTitleLl()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_5
    iput-boolean v3, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->isUseWebViewTitle:Z

    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setLoadsImagesAutomatically(Z)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setMediaPlaybackRequiresUserGesture(Z)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v4

    sget v5, Lcom/sma/smartv3/ui/me/WebViewActivity;->TYPE_USER_WEB_TITLE:I

    if-ne v4, v5, :cond_6

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v4

    sget v5, Lcom/sma/smartv3/ui/me/WebViewActivity;->TYPE_NO_TITLE:I

    if-ne v4, v5, :cond_7

    :cond_6
    const-string v4, "Chrome Mobile"

    invoke-virtual {v0, v4}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    :cond_7
    const/4 v4, 0x2

    invoke-virtual {v0, v4}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    new-instance v5, Lcom/sma/smartv3/ui/me/WebViewActivity$initView$2;

    invoke-direct {v5, p0}, Lcom/sma/smartv3/ui/me/WebViewActivity$initView$2;-><init>(Lcom/sma/smartv3/ui/me/WebViewActivity;)V

    invoke-virtual {v0, v5}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg0()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_a

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "webView url "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const-string v0, "http://openapi.baidu.com/oauth/2.0/authorize"

    const/4 v5, 0x0

    invoke-static {v6, v0, v2, v4, v5}, Lcom/android/mltcode/paycertificationapi/oe5;->O0(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/webkit/WebView;->clearCache(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->clearHistory()V

    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/webkit/CookieManager;->removeAllCookies(Landroid/webkit/ValueCallback;)V

    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/CookieManager;->flush()V

    :cond_8
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :try_start_0
    const-string v7, "/#"

    const-string v8, ""

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v2, "orderType"

    invoke-virtual {v0, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_9

    const-string v2, ""

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_9
    :goto_1
    iput-object v2, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->orderType:Ljava/lang/String;

    const-string v2, "identity"

    invoke-virtual {v0, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->orderType:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " , pid = "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :goto_2
    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->orderType:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " , e = "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_a
    :goto_3
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    const-string v1, "android"

    invoke-virtual {v0, p0, v1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/WebViewActivity$XIi00iiXO;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/me/WebViewActivity$XIi00iiXO;-><init>()V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    return-void
.end method

.method public final isAllowDirectBack()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->isAllowDirectBack:Z

    return v0
.end method

.method public final isUseWebViewTitle()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->isUseWebViewTitle:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00c6

    return v0
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1
    .param p2    # Landroid/view/KeyEvent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->isAllowDirectBack:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getWebView()Landroid/webkit/WebView;

    move-result-object p1

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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getWebView()Landroid/webkit/WebView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoBack()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->isAllowDirectBack:Z

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/WebViewActivity;->getWebView()Landroid/webkit/WebView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->goBack()V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final payStatusCallBackFall()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "webView payStatusCallBackFall"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/OrderManager;->XXX11i()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method public final payStatusCallBackSuccess()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "webView payStatusCallBackSuccess"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "ORDER_PAY_SUCCESS"

    invoke-static {v2, v0, v1, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/OrderManager;->XXX11i()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method public final prizeInfoSubmit()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "webView prizeInfoSubmit "

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final returnAllowDirectBack()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->isAllowDirectBack:Z

    return-void
.end method

.method public final reviseWebViewTitle(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "webView reviseWebViewTitle webView.title = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ex6;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/ex6;-><init>(Lcom/sma/smartv3/ui/me/WebViewActivity;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final setAllowDirectBack(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->isAllowDirectBack:Z

    return-void
.end method

.method public final setOrderType(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->orderType:Ljava/lang/String;

    return-void
.end method

.method public final setUseWebViewTitle(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/me/WebViewActivity;->isUseWebViewTitle:Z

    return-void
.end method

.method public final toContact(Ljava/lang/String;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "webView toContact : type = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x41efe113

    if-eq v0, v1, :cond_4

    const v1, 0x1b907b2

    if-eq v0, v1, :cond_2

    const v1, 0x1da19ac6

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "facebook"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->i010I()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/sma/smartv3/util/UtilsKt;->X1ii(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_2
    const-string v0, "instagram"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->IXXOO()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/sma/smartv3/util/UtilsKt;->O10IXXX0X(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_4
    const-string v0, "outlook"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    :goto_0
    return-void

    :cond_5
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->iOOX010X()Ljava/lang/String;

    move-result-object v1

    const/16 v4, 0xc

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/sma/smartv3/util/UtilsKt;->XXI(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public final toPermissionsSettings()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "webView toPermissionsSettings"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v1

    const-string v2, "getApp(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/hr1;->Ii0i(Landroid/content/Context;)V

    return-void
.end method

.method public final toSettings()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "webView toSettings"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
