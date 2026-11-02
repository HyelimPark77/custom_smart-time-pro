.class public final Lcom/sma/smartv3/biz/ad/ADPAdBanner;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final adUnitId:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private adView:Lcom/adp/sdk/ADPBannerView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final adWidth:I

.field private final context:Landroid/app/Activity;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;ILcom/sma/smartv3/biz/ad/ADPAdListener;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Lcom/sma/smartv3/biz/ad/ADPAdListener;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adUnitId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/sma/smartv3/biz/ad/ADPAdBanner;->context:Landroid/app/Activity;

    .line 3
    iput-object p2, p0, Lcom/sma/smartv3/biz/ad/ADPAdBanner;->adUnitId:Ljava/lang/String;

    .line 4
    iput p3, p0, Lcom/sma/smartv3/biz/ad/ADPAdBanner;->adWidth:I

    .line 5
    new-instance v0, Lcom/adp/sdk/ADPBannerView;

    invoke-direct {v0, p1}, Lcom/adp/sdk/ADPBannerView;-><init>(Landroid/content/Context;)V

    .line 6
    invoke-virtual {v0, p2}, Lcom/adp/sdk/ADPBannerView;->setAdUnitId(Ljava/lang/String;)V

    .line 7
    new-instance p1, Lcom/sma/smartv3/biz/ad/ADPAdBanner$adView$1$1;

    invoke-direct {p1, p4, p0}, Lcom/sma/smartv3/biz/ad/ADPAdBanner$adView$1$1;-><init>(Lcom/sma/smartv3/biz/ad/ADPAdListener;Lcom/sma/smartv3/biz/ad/ADPAdBanner;)V

    invoke-virtual {v0, p1}, Lcom/adp/sdk/ADPBannerView;->setAdViewListener(Lcom/adp/sdk/ADPBannerView$AdViewListener;)V

    if-nez p3, :cond_0

    .line 8
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenWidth()I

    move-result p3

    .line 9
    :cond_0
    invoke-virtual {v0, p3}, Lcom/adp/sdk/ADPBannerView;->setWidth(I)V

    .line 10
    iput-object v0, p0, Lcom/sma/smartv3/biz/ad/ADPAdBanner;->adView:Lcom/adp/sdk/ADPBannerView;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/String;ILcom/sma/smartv3/biz/ad/ADPAdListener;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/4 p3, 0x0

    .line 11
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/biz/ad/ADPAdBanner;-><init>(Landroid/app/Activity;Ljava/lang/String;ILcom/sma/smartv3/biz/ad/ADPAdListener;)V

    return-void
.end method


# virtual methods
.method public final destroy()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/biz/ad/ADPAdBanner;->adView:Lcom/adp/sdk/ADPBannerView;

    invoke-virtual {v0}, Lcom/adp/sdk/ADPBannerView;->destroy()V

    return-void
.end method

.method public final getAdUnitId()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/ad/ADPAdBanner;->adUnitId:Ljava/lang/String;

    return-object v0
.end method

.method public final getAdWidth()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/biz/ad/ADPAdBanner;->adWidth:I

    return v0
.end method

.method public final getContext()Landroid/app/Activity;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/ad/ADPAdBanner;->context:Landroid/app/Activity;

    return-object v0
.end method

.method public final loadAd(Landroid/view/ViewGroup;)V
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "containerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v0, p0, Lcom/sma/smartv3/biz/ad/ADPAdBanner;->adView:Lcom/adp/sdk/ADPBannerView;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/ad/ADPAdBanner;->adView:Lcom/adp/sdk/ADPBannerView;

    invoke-virtual {p1}, Lcom/adp/sdk/ADPBannerView;->loadAd()V

    return-void
.end method
