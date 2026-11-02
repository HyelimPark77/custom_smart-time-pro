.class public final Lcom/sma/smartv3/biz/ad/ADPAdManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/biz/ad/ADPAdManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "ADPAdManager"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final TEST_DEVICE_HASHED_IDS:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/biz/ad/ADPAdManager;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/ad/ADPAdManager;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/ad/ADPAdManager;->INSTANCE:Lcom/sma/smartv3/biz/ad/ADPAdManager;

    const-string v0, "E6F3C043C1A3BECA4DDA296F23244C38"

    const-string v1, "673FC5F2276AE844B7135C868589CFC3"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/ad/ADPAdManager;->TEST_DEVICE_HASHED_IDS:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/google/android/ump/FormError;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/biz/ad/ADPAdManager;->showPrivacyOptionsForm$lambda$0(Lcom/google/android/ump/FormError;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;Lkotlin/jvm/functions/Function2;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/biz/ad/ADPAdManager;->getAdMobConsent$lambda$0$0(Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;Lkotlin/jvm/functions/Function2;Ljava/lang/String;)V

    return-void
.end method

.method private static final getAdMobConsent$lambda$0$0(Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;Lkotlin/jvm/functions/Function2;Ljava/lang/String;)V
    .locals 3

    if-eqz p2, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "gatherConsent error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_0
    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gatherConsent canRequestAds: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;->getCanRequestAds()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isPrivacyOptionsRequired: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;->isPrivacyOptionsRequired()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;->getCanRequestAds()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;->isPrivacyOptionsRequired()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-interface {p1, p2, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final showPrivacyOptionsForm$lambda$0(Lcom/google/android/ump/FormError;)V
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/ump/FormError;->getMessage()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final getAdMobConsent(Landroid/app/Activity;Lkotlin/jvm/functions/Function2;)V
    .locals 3
    .param p1    # Landroid/app/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function2;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Boolean;",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;->Companion:Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$Companion;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$Companion;->getInstance(Landroid/content/Context;)Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X0O;

    invoke-direct {v1, v0, p2}, Lcom/android/mltcode/paycertificationapi/X0O;-><init>(Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v0, p1, v1}, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;->gatherConsent(Landroid/app/Activity;Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$OnConsentGatheringCompleteListener;)V

    return-void
.end method

.method public final getTEST_DEVICE_HASHED_IDS()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/ad/ADPAdManager;->TEST_DEVICE_HASHED_IDS:Ljava/util/List;

    return-object v0
.end method

.method public final initSdk(Landroid/app/Application;Ljava/lang/String;)V
    .locals 3
    .param p1    # Landroid/app/Application;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "ADPAdManager initADPAd"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ADPAdManager initADPAd -> appid: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/biz/ad/ADPAdManager$initSdk$1;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/ad/ADPAdManager$initSdk$1;-><init>()V

    invoke-static {p2, p1, v0}, Lcom/adp/sdk/ADP;->initialize(Ljava/lang/String;Landroid/content/Context;Lcom/adp/sdk/ADP$InitCallback;)V

    return-void
.end method

.method public final showPrivacyOptionsForm(Landroid/app/Activity;)V
    .locals 3
    .param p1    # Landroid/app/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;->Companion:Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$Companion;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$Companion;->getInstance(Landroid/content/Context;)Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O10IXXX0X;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/O10IXXX0X;-><init>()V

    invoke-virtual {v0, p1, v1}, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;->showPrivacyOptionsForm(Landroid/app/Activity;Lcom/google/android/ump/ConsentForm$OnConsentFormDismissedListener;)V

    return-void
.end method
