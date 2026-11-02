.class public final Lcom/sma/smartv3/view/ad/ADPAdContainerView$addUploadADPAdListener$1;
.super Lcom/sma/smartv3/biz/ad/ADPAdListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/view/ad/ADPAdContainerView;->addUploadADPAdListener(Lcom/sma/smartv3/biz/ad/ADPAdListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/biz/ad/ADPAdListener;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView$addUploadADPAdListener$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    invoke-direct {p0}, Lcom/sma/smartv3/biz/ad/ADPAdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked(Ljava/lang/String;)V
    .locals 3

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView$addUploadADPAdListener$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/ad/ADPAdListener;->onAdClicked(Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/biz/StatManager;->OXO1:Lcom/sma/smartv3/biz/StatManager;

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/16 v2, 0x13

    invoke-static {p1, v2, v0, v1, v0}, Lcom/sma/smartv3/biz/StatManager;->iO(Lcom/sma/smartv3/biz/StatManager;ILjava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public onAdClose(Ljava/lang/String;)V
    .locals 1

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView$addUploadADPAdListener$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/ad/ADPAdListener;->onAdClose(Ljava/lang/String;)V

    return-void
.end method

.method public onAdFailed(Lcom/sma/smartv3/biz/ad/ADPAdError;Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adUnitId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView$addUploadADPAdListener$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    invoke-virtual {v0, p1, p2}, Lcom/sma/smartv3/biz/ad/ADPAdListener;->onAdFailed(Lcom/sma/smartv3/biz/ad/ADPAdError;Ljava/lang/String;)V

    return-void
.end method

.method public onAdLoaded(Ljava/lang/String;)V
    .locals 1

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView$addUploadADPAdListener$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/ad/ADPAdListener;->onAdLoaded(Ljava/lang/String;)V

    return-void
.end method

.method public onAdOpen(Ljava/lang/String;)V
    .locals 3

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPAdContainerView$addUploadADPAdListener$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPAdListener;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/ad/ADPAdListener;->onAdOpen(Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/biz/StatManager;->OXO1:Lcom/sma/smartv3/biz/StatManager;

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/16 v2, 0x12

    invoke-static {p1, v2, v0, v1, v0}, Lcom/sma/smartv3/biz/StatManager;->iO(Lcom/sma/smartv3/biz/StatManager;ILjava/lang/String;ILjava/lang/Object;)V

    return-void
.end method
