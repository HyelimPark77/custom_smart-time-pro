.class public final Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGoogleMobileAdsConsentManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMobileAdsConsentManager.kt\ncom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGoogleMobileAdsConsentManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMobileAdsConsentManager.kt\ncom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getInstance()Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .line 1
    invoke-static {}, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;->access$getInstance$cp()Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;

    move-result-object v0

    return-object v0
.end method

.method public final getInstance(Landroid/content/Context;)Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$Companion;->getInstance()Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;

    move-result-object v0

    if-nez v0, :cond_1

    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    sget-object v0, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;->Companion:Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$Companion;->getInstance()Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;-><init>(Landroid/content/Context;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager$Companion;->setInstance(Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    monitor-exit p0

    return-object v1

    :goto_1
    monitor-exit p0

    throw p1

    :cond_1
    return-object v0
.end method

.method public final setInstance(Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;->access$setInstance$cp(Lcom/sma/smartv3/biz/ad/GoogleMobileAdsConsentManager;)V

    return-void
.end method
