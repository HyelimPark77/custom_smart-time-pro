.class public final Lcom/sma/smartv3/view/ad/ADPCAdContainerView$loadAdView$1;
.super Lcom/sma/smartv3/biz/ad/ADPCAdListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->loadAdView(Ljava/lang/String;IZLkotlin/jvm/functions/Function0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/ad/ADPCAdContainerView;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/view/ad/ADPCAdContainerView$loadAdView$1;->this$0:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    invoke-direct {p0}, Lcom/sma/smartv3/biz/ad/ADPCAdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onADClicked(Ljava/lang/String;)V
    .locals 1

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPCAdContainerView$loadAdView$1;->this$0:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    invoke-virtual {v0}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->getListener()Lcom/sma/smartv3/biz/ad/ADPCAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/ad/ADPCAdListener;->onADClicked(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onADClosed(Ljava/lang/String;)V
    .locals 1

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPCAdContainerView$loadAdView$1;->this$0:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    invoke-virtual {v0}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->getListener()Lcom/sma/smartv3/biz/ad/ADPCAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/ad/ADPCAdListener;->onADClosed(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onADError(Lcom/sma/smartv3/biz/ad/ADPCAdError;Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adUnitId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPCAdContainerView$loadAdView$1;->this$0:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    invoke-virtual {v0}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->getListener()Lcom/sma/smartv3/biz/ad/ADPCAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/sma/smartv3/biz/ad/ADPCAdListener;->onADError(Lcom/sma/smartv3/biz/ad/ADPCAdError;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onADPresent(Ljava/lang/String;)V
    .locals 1

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPCAdContainerView$loadAdView$1;->this$0:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    invoke-virtual {v0}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->getListener()Lcom/sma/smartv3/biz/ad/ADPCAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/ad/ADPCAdListener;->onADPresent(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onADReceive(Ljava/lang/String;)V
    .locals 2

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPCAdContainerView$loadAdView$1;->this$0:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPCAdContainerView$loadAdView$1;->this$0:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    invoke-virtual {v0}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->getListener()Lcom/sma/smartv3/biz/ad/ADPCAdListener;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/ad/ADPCAdListener;->onADReceive(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
