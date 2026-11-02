.class public final Lcom/sma/smartv3/view/ad/ADPAdContainerView$loadAdView$1;
.super Lcom/sma/smartv3/biz/ad/ADPAdListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/view/ad/ADPAdContainerView;->loadAdView(Ljava/lang/String;IZLkotlin/jvm/functions/Function0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/view/ad/ADPAdContainerView;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/ad/ADPAdContainerView;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView$loadAdView$1;->this$0:Lcom/sma/smartv3/view/ad/ADPAdContainerView;

    invoke-direct {p0}, Lcom/sma/smartv3/biz/ad/ADPAdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked(Ljava/lang/String;)V
    .locals 1

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView$loadAdView$1;->this$0:Lcom/sma/smartv3/view/ad/ADPAdContainerView;

    invoke-virtual {v0}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->getListener()Lcom/sma/smartv3/biz/ad/ADPAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/ad/ADPAdListener;->onAdClicked(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdClose(Ljava/lang/String;)V
    .locals 1

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView$loadAdView$1;->this$0:Lcom/sma/smartv3/view/ad/ADPAdContainerView;

    invoke-virtual {v0}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->getListener()Lcom/sma/smartv3/biz/ad/ADPAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/ad/ADPAdListener;->onAdClose(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdFailed(Lcom/sma/smartv3/biz/ad/ADPAdError;Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adUnitId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView$loadAdView$1;->this$0:Lcom/sma/smartv3/view/ad/ADPAdContainerView;

    invoke-virtual {v0}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->getListener()Lcom/sma/smartv3/biz/ad/ADPAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/sma/smartv3/biz/ad/ADPAdListener;->onAdFailed(Lcom/sma/smartv3/biz/ad/ADPAdError;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdLoaded(Ljava/lang/String;)V
    .locals 1

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView$loadAdView$1;->this$0:Lcom/sma/smartv3/view/ad/ADPAdContainerView;

    invoke-virtual {v0}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->getListener()Lcom/sma/smartv3/biz/ad/ADPAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/ad/ADPAdListener;->onAdLoaded(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onAdOpen(Ljava/lang/String;)V
    .locals 1

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView$loadAdView$1;->this$0:Lcom/sma/smartv3/view/ad/ADPAdContainerView;

    invoke-virtual {v0}, Lcom/sma/smartv3/view/ad/ADPAdContainerView;->getListener()Lcom/sma/smartv3/biz/ad/ADPAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/ad/ADPAdListener;->onAdOpen(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
