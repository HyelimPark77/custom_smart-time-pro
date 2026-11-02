.class public final Lcom/sma/smartv3/biz/ad/ADPAdBanner$adView$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/adp/sdk/ADPBannerView$AdViewListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/ad/ADPAdBanner;-><init>(Landroid/app/Activity;Ljava/lang/String;ILcom/sma/smartv3/biz/ad/ADPAdListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

.field final synthetic this$0:Lcom/sma/smartv3/biz/ad/ADPAdBanner;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/biz/ad/ADPAdListener;Lcom/sma/smartv3/biz/ad/ADPAdBanner;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/ad/ADPAdBanner$adView$1$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    iput-object p2, p0, Lcom/sma/smartv3/biz/ad/ADPAdBanner$adView$1$1;->this$0:Lcom/sma/smartv3/biz/ad/ADPAdBanner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked(Lcom/adp/sdk/ADPBannerView;)V
    .locals 1

    iget-object p1, p0, Lcom/sma/smartv3/biz/ad/ADPAdBanner$adView$1$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    iget-object v0, p0, Lcom/sma/smartv3/biz/ad/ADPAdBanner$adView$1$1;->this$0:Lcom/sma/smartv3/biz/ad/ADPAdBanner;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/ad/ADPAdBanner;->getAdUnitId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/biz/ad/ADPAdListener;->onAdClicked(Ljava/lang/String;)V

    return-void
.end method

.method public onAdClose(Lcom/adp/sdk/ADPBannerView;)V
    .locals 1

    iget-object p1, p0, Lcom/sma/smartv3/biz/ad/ADPAdBanner$adView$1$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    iget-object v0, p0, Lcom/sma/smartv3/biz/ad/ADPAdBanner$adView$1$1;->this$0:Lcom/sma/smartv3/biz/ad/ADPAdBanner;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/ad/ADPAdBanner;->getAdUnitId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/biz/ad/ADPAdListener;->onAdClose(Ljava/lang/String;)V

    return-void
.end method

.method public onAdFailed(Lcom/adp/sdk/ADPBannerView;Lcom/adp/sdk/dto/AdError;)V
    .locals 1

    const-string p1, "p1"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/ad/ADPAdBanner$adView$1$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    new-instance v0, Lcom/sma/smartv3/biz/ad/ADPAdError;

    invoke-direct {v0, p2}, Lcom/sma/smartv3/biz/ad/ADPAdError;-><init>(Lcom/adp/sdk/dto/AdError;)V

    iget-object p2, p0, Lcom/sma/smartv3/biz/ad/ADPAdBanner$adView$1$1;->this$0:Lcom/sma/smartv3/biz/ad/ADPAdBanner;

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/ad/ADPAdBanner;->getAdUnitId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lcom/sma/smartv3/biz/ad/ADPAdListener;->onAdFailed(Lcom/sma/smartv3/biz/ad/ADPAdError;Ljava/lang/String;)V

    return-void
.end method

.method public onAdLoaded(Lcom/adp/sdk/ADPBannerView;)V
    .locals 1

    iget-object p1, p0, Lcom/sma/smartv3/biz/ad/ADPAdBanner$adView$1$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    iget-object v0, p0, Lcom/sma/smartv3/biz/ad/ADPAdBanner$adView$1$1;->this$0:Lcom/sma/smartv3/biz/ad/ADPAdBanner;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/ad/ADPAdBanner;->getAdUnitId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/biz/ad/ADPAdListener;->onAdLoaded(Ljava/lang/String;)V

    return-void
.end method

.method public onAdOpen(Lcom/adp/sdk/ADPBannerView;)V
    .locals 1

    iget-object p1, p0, Lcom/sma/smartv3/biz/ad/ADPAdBanner$adView$1$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    iget-object v0, p0, Lcom/sma/smartv3/biz/ad/ADPAdBanner$adView$1$1;->this$0:Lcom/sma/smartv3/biz/ad/ADPAdBanner;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/ad/ADPAdBanner;->getAdUnitId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/biz/ad/ADPAdListener;->onAdOpen(Ljava/lang/String;)V

    return-void
.end method
