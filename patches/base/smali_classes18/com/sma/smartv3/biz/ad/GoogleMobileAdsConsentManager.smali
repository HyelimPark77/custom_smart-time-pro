.class public final Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$Companion;,
        Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$OnConsentGatheringCompleteListener;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static volatile instance:Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# instance fields
.field private final consentInformation:Lcom/google/android/ump/ConsentInformation;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;->Companion:Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$Companion;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/google/android/ump/UserMessagingPlatform;->getConsentInformation(Landroid/content/Context;)Lcom/google/android/ump/ConsentInformation;

    move-result-object p1

    const-string v0, "getConsentInformation(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;->consentInformation:Lcom/google/android/ump/ConsentInformation;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$OnConsentGatheringCompleteListener;Lcom/google/android/ump/FormError;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;->gatherConsent$lambda$1$0(Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$OnConsentGatheringCompleteListener;Lcom/google/android/ump/FormError;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$OnConsentGatheringCompleteListener;Lcom/google/android/ump/FormError;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;->gatherConsent$lambda$2(Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$OnConsentGatheringCompleteListener;Lcom/google/android/ump/FormError;)V

    return-void
.end method

.method public static final synthetic access$getInstance$cp()Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;->instance:Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;

    return-object v0
.end method

.method public static final synthetic access$setInstance$cp(Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;->instance:Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;

    return-void
.end method

.method private static final gatherConsent$lambda$1(Landroid/app/Activity;Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$OnConsentGatheringCompleteListener;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/II0IXXiX;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/II0IXXiX;-><init>(Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$OnConsentGatheringCompleteListener;)V

    invoke-static {p0, v0}, Lcom/google/android/ump/UserMessagingPlatform;->loadAndShowConsentFormIfRequired(Landroid/app/Activity;Lcom/google/android/ump/ConsentForm$OnConsentFormDismissedListener;)V

    return-void
.end method

.method private static final gatherConsent$lambda$1$0(Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$OnConsentGatheringCompleteListener;Lcom/google/android/ump/FormError;)V
    .locals 2

    if-eqz p1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/ump/FormError;->getErrorCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/android/ump/FormError;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {p0, p1}, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$OnConsentGatheringCompleteListener;->consentGatheringComplete(Ljava/lang/String;)V

    return-void
.end method

.method private static final gatherConsent$lambda$2(Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$OnConsentGatheringCompleteListener;Lcom/google/android/ump/FormError;)V
    .locals 2

    if-eqz p1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/ump/FormError;->getErrorCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/android/ump/FormError;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {p0, p1}, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$OnConsentGatheringCompleteListener;->consentGatheringComplete(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic iO(Landroid/app/Activity;Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$OnConsentGatheringCompleteListener;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;->gatherConsent$lambda$1(Landroid/app/Activity;Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$OnConsentGatheringCompleteListener;)V

    return-void
.end method


# virtual methods
.method public final gatherConsent(Landroid/app/Activity;Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$OnConsentGatheringCompleteListener;)V
    .locals 4
    .param p1    # Landroid/app/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$OnConsentGatheringCompleteListener;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onConsentGatheringCompleteListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/ump/ConsentDebugSettings$Builder;

    invoke-direct {v0, p1}, Lcom/google/android/ump/ConsentDebugSettings$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/google/android/ump/ConsentDebugSettings$Builder;->build()Lcom/google/android/ump/ConsentDebugSettings;

    move-result-object v0

    new-instance v1, Lcom/google/android/ump/ConsentRequestParameters$Builder;

    invoke-direct {v1}, Lcom/google/android/ump/ConsentRequestParameters$Builder;-><init>()V

    invoke-virtual {v1, v0}, Lcom/google/android/ump/ConsentRequestParameters$Builder;->setConsentDebugSettings(Lcom/google/android/ump/ConsentDebugSettings;)Lcom/google/android/ump/ConsentRequestParameters$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/ump/ConsentRequestParameters$Builder;->build()Lcom/google/android/ump/ConsentRequestParameters;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v2, "requestConsentInfoUpdate"

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;->consentInformation:Lcom/google/android/ump/ConsentInformation;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/IIiXIO1X0;

    invoke-direct {v2, p1, p2}, Lcom/android/mltcode/paycertificationapi/IIiXIO1X0;-><init>(Landroid/app/Activity;Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$OnConsentGatheringCompleteListener;)V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/XOI0O1;

    invoke-direct {v3, p2}, Lcom/android/mltcode/paycertificationapi/XOI0O1;-><init>(Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$OnConsentGatheringCompleteListener;)V

    invoke-interface {v1, p1, v0, v2, v3}, Lcom/google/android/ump/ConsentInformation;->requestConsentInfoUpdate(Landroid/app/Activity;Lcom/google/android/ump/ConsentRequestParameters;Lcom/google/android/ump/ConsentInformation$OnConsentInfoUpdateSuccessListener;Lcom/google/android/ump/ConsentInformation$OnConsentInfoUpdateFailureListener;)V

    return-void
.end method

.method public final getCanRequestAds()Z
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;->consentInformation:Lcom/google/android/ump/ConsentInformation;

    invoke-interface {v0}, Lcom/google/android/ump/ConsentInformation;->canRequestAds()Z

    move-result v0

    return v0
.end method

.method public final isPrivacyOptionsRequired()Z
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;->consentInformation:Lcom/google/android/ump/ConsentInformation;

    invoke-interface {v0}, Lcom/google/android/ump/ConsentInformation;->getPrivacyOptionsRequirementStatus()Lcom/google/android/ump/ConsentInformation$PrivacyOptionsRequirementStatus;

    move-result-object v0

    sget-object v1, Lcom/google/android/ump/ConsentInformation$PrivacyOptionsRequirementStatus;->REQUIRED:Lcom/google/android/ump/ConsentInformation$PrivacyOptionsRequirementStatus;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final reset()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;->consentInformation:Lcom/google/android/ump/ConsentInformation;

    invoke-interface {v0}, Lcom/google/android/ump/ConsentInformation;->reset()V

    return-void
.end method

.method public final showPrivacyOptionsForm(Landroid/app/Activity;Lcom/google/android/ump/ConsentForm$OnConsentFormDismissedListener;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/ump/ConsentForm$OnConsentFormDismissedListener;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onConsentFormDismissedListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lcom/google/android/ump/UserMessagingPlatform;->showPrivacyOptionsForm(Landroid/app/Activity;Lcom/google/android/ump/ConsentForm$OnConsentFormDismissedListener;)V

    return-void
.end method
