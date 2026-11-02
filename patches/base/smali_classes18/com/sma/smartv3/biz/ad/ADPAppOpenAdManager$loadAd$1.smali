.class public final Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager$loadAd$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/adp/sdk/ADPSplash$AdViewListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->loadAd(Landroid/app/Activity;Landroid/view/ViewGroup;Ljava/lang/String;Lcom/sma/smartv3/biz/ad/ADPAdListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

.field final synthetic $unitId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/biz/ad/ADPAdListener;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager$loadAd$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    iput-object p2, p0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager$loadAd$1;->$unitId:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "ADPAppOpenAdManager -> Ad State : Clicked"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->INSTANCE:Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->setClicked(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager$loadAd$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager$loadAd$1;->$unitId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/ad/ADPAdListener;->onAdOpen(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdClose()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "ADPAppOpenAdManager -> Ad State : Closed"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v1, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->INSTANCE:Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->setAdDismiss(Z)V

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->isLeftActivity()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v1, "ADPAppOpenAdManager -> Ad State : onAdClose. \u5e7f\u544a\u88ab\u70b9\u51fb\u8df3\u8f6c\u5230\u5176\u5b83\u754c\u9762\u6216\u6309HOME\u952e\u538b\u5165\u540e\u53f0\u65f6\uff0c\u5ffd\u7565\u6b64\u56de\u8c03"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->setShowingAd(Z)V

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->getShowAdCompleteListener()Lcom/sma/smartv3/biz/ad/OnShowADPAdCompleteListener;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/sma/smartv3/biz/ad/OnShowADPAdCompleteListener;->onShowAdComplete()V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager$loadAd$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager$loadAd$1;->$unitId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/ad/ADPAdListener;->onAdClose(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public onAdFailed(Lcom/adp/sdk/dto/AdError;)V
    .locals 4

    sget-object v0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->INSTANCE:Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->setAdDismiss(Z)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ADPAppOpenAdManager -> Ad State : Error, Info: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/adp/sdk/dto/AdError;->getMessage()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->isLeftActivity()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string p1, "ADPAppOpenAdManager -> Ad State : onAdFailed. \u5e7f\u544a\u5931\u8d25\u4e86\uff0c\u5ffd\u7565\u6b64\u56de\u8c03"

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :cond_1
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->setShowingAd(Z)V

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->getShowAdCompleteListener()Lcom/sma/smartv3/biz/ad/OnShowADPAdCompleteListener;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/sma/smartv3/biz/ad/OnShowADPAdCompleteListener;->onShowAdComplete()V

    :cond_2
    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager$loadAd$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    if-eqz v0, :cond_4

    new-instance v1, Lcom/sma/smartv3/biz/ad/ADPAdError;

    invoke-direct {v1, p1}, Lcom/sma/smartv3/biz/ad/ADPAdError;-><init>(Lcom/adp/sdk/dto/AdError;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager$loadAd$1;->$unitId:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/sma/smartv3/biz/ad/ADPAdListener;->onAdFailed(Lcom/sma/smartv3/biz/ad/ADPAdError;Ljava/lang/String;)V

    return-void

    :cond_3
    iget-object p1, p0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager$loadAd$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    if-eqz p1, :cond_4

    new-instance v0, Lcom/sma/smartv3/biz/ad/ADPAdError;

    const-string v1, "-1"

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/biz/ad/ADPAdError;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager$loadAd$1;->$unitId:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/sma/smartv3/biz/ad/ADPAdListener;->onAdFailed(Lcom/sma/smartv3/biz/ad/ADPAdError;Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public onAdLoaded()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "ADPAppOpenAdManager -> Ad State : Loaded"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager$loadAd$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager$loadAd$1;->$unitId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/ad/ADPAdListener;->onAdLoaded(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdOpen()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "ADPAppOpenAdManager -> Ad State : open"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->INSTANCE:Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager;->setShowingAd(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager$loadAd$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/biz/ad/ADPAppOpenAdManager$loadAd$1;->$unitId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/ad/ADPAdListener;->onAdOpen(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
