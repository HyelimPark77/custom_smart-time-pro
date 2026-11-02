.class public final Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "ADPAppOpenAdManager"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static isAdDismiss:Z

.field private static isClicked:Z

.field private static isLeftActivity:Z

.field private static isShowingAd:Z

.field private static showAdCompleteListener:Lcom/sma/smartv3/biz/ad/OnShowADPAdCompleteListener;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private static splashAd:Lcom/adp/sdk/ADPSplash;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->INSTANCE:Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final isAdAvailable()Z
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->splashAd:Lcom/adp/sdk/ADPSplash;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static synthetic loadAd$default(Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;Landroid/app/Activity;Landroid/view/ViewGroup;Ljava/lang/String;Lcom/sma/smartv3/biz/ad/ADPAdListener;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->loadAd(Landroid/app/Activity;Landroid/view/ViewGroup;Ljava/lang/String;Lcom/sma/smartv3/biz/ad/ADPAdListener;)V

    return-void
.end method


# virtual methods
.method public final destroy()V
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->isAdDismiss:Z

    sput-boolean v0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->isClicked:Z

    const/4 v0, 0x0

    sput-object v0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->splashAd:Lcom/adp/sdk/ADPSplash;

    return-void
.end method

.method public final getShowAdCompleteListener()Lcom/sma/smartv3/biz/ad/OnShowADPAdCompleteListener;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->showAdCompleteListener:Lcom/sma/smartv3/biz/ad/OnShowADPAdCompleteListener;

    return-object v0
.end method

.method public final isAdDismiss()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->isAdDismiss:Z

    return v0
.end method

.method public final isClicked()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->isClicked:Z

    return v0
.end method

.method public final isLeftActivity()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->isLeftActivity:Z

    return v0
.end method

.method public final isShowingAd()Z
    .locals 1

    sget-boolean v0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->isShowingAd:Z

    return v0
.end method

.method public final loadAd(Landroid/app/Activity;Landroid/view/ViewGroup;Ljava/lang/String;Lcom/sma/smartv3/biz/ad/ADPAdListener;)V
    .locals 2
    .param p1    # Landroid/app/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Lcom/sma/smartv3/biz/ad/ADPAdListener;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adContainer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "unitId"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->isAdAvailable()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ADPAppOpenAdManager loadAd -> id: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance p2, Lcom/adp/sdk/ADPSplash;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/adp/sdk/ADPSplash;-><init>(Landroid/app/Application;)V

    sput-object p2, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->splashAd:Lcom/adp/sdk/ADPSplash;

    invoke-virtual {p2, p3}, Lcom/adp/sdk/ADPSplash;->setAdUnitId(Ljava/lang/String;)V

    sget-object p2, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->splashAd:Lcom/adp/sdk/ADPSplash;

    if-eqz p2, :cond_1

    new-instance v0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager$loadAd$1;

    invoke-direct {v0, p4, p3}, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager$loadAd$1;-><init>(Lcom/sma/smartv3/biz/ad/ADPAdListener;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/adp/sdk/ADPSplash;->setAdViewListener(Lcom/adp/sdk/ADPSplash$AdViewListener;)V

    :cond_1
    const/4 p2, 0x1

    sput-boolean p2, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->isShowingAd:Z

    sget-object p2, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->splashAd:Lcom/adp/sdk/ADPSplash;

    const/4 p3, 0x5

    if-eqz p2, :cond_2

    invoke-virtual {p2, p3}, Lcom/adp/sdk/ADPSplash;->setDurationTime(I)V

    :cond_2
    sget-object p2, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->splashAd:Lcom/adp/sdk/ADPSplash;

    if-eqz p2, :cond_3

    const/16 p4, 0x708

    invoke-virtual {p2, p4}, Lcom/adp/sdk/ADPSplash;->setIntervals(I)V

    :cond_3
    sget-object p2, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->splashAd:Lcom/adp/sdk/ADPSplash;

    if-eqz p2, :cond_4

    invoke-virtual {p2, p3}, Lcom/adp/sdk/ADPSplash;->setTimeoutTime(I)V

    :cond_4
    sget-object p2, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->splashAd:Lcom/adp/sdk/ADPSplash;

    if-eqz p2, :cond_5

    invoke-virtual {p2, p1}, Lcom/adp/sdk/ADPSplash;->loadAd(Landroid/app/Activity;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public final setAdDismiss(Z)V
    .locals 0

    sput-boolean p1, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->isAdDismiss:Z

    return-void
.end method

.method public final setClicked(Z)V
    .locals 0

    sput-boolean p1, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->isClicked:Z

    return-void
.end method

.method public final setLeftActivity(Z)V
    .locals 0

    sput-boolean p1, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->isLeftActivity:Z

    return-void
.end method

.method public final setShowAdCompleteListener(Lcom/sma/smartv3/biz/ad/OnShowADPAdCompleteListener;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/biz/ad/OnShowADPAdCompleteListener;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sput-object p1, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->showAdCompleteListener:Lcom/sma/smartv3/biz/ad/OnShowADPAdCompleteListener;

    return-void
.end method

.method public final setShowingAd(Z)V
    .locals 0

    sput-boolean p1, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->isShowingAd:Z

    return-void
.end method
