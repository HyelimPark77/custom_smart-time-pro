.class public final Lcom/sma/smartv3/view/ad/ADPCAdContainerView$addUploadADPAdListener$1;
.super Lcom/sma/smartv3/biz/ad/ADPCAdListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->addUploadADPAdListener(Lcom/sma/smartv3/biz/ad/ADPCAdListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $listener:Lcom/sma/smartv3/biz/ad/ADPCAdListener;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/biz/ad/ADPCAdListener;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/view/ad/ADPCAdContainerView$addUploadADPAdListener$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPCAdListener;

    invoke-direct {p0}, Lcom/sma/smartv3/biz/ad/ADPCAdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onADClicked(Ljava/lang/String;)V
    .locals 2

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPCAdContainerView$addUploadADPAdListener$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPCAdListener;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/ad/ADPCAdListener;->onADClicked(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/StatManager;->OXO1:Lcom/sma/smartv3/biz/StatManager;

    const/16 v1, 0x13

    invoke-virtual {v0, v1, p1}, Lcom/sma/smartv3/biz/StatManager;->XIi00iiXO(ILjava/lang/String;)V

    return-void
.end method

.method public onADClosed(Ljava/lang/String;)V
    .locals 1

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPCAdContainerView$addUploadADPAdListener$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPCAdListener;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/ad/ADPCAdListener;->onADClosed(Ljava/lang/String;)V

    return-void
.end method

.method public onADError(Lcom/sma/smartv3/biz/ad/ADPCAdError;Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adUnitId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPCAdContainerView$addUploadADPAdListener$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPCAdListener;

    invoke-virtual {v0, p1, p2}, Lcom/sma/smartv3/biz/ad/ADPCAdListener;->onADError(Lcom/sma/smartv3/biz/ad/ADPCAdError;Ljava/lang/String;)V

    return-void
.end method

.method public onADPresent(Ljava/lang/String;)V
    .locals 2

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPCAdContainerView$addUploadADPAdListener$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPCAdListener;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/ad/ADPCAdListener;->onADPresent(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/StatManager;->OXO1:Lcom/sma/smartv3/biz/StatManager;

    const/16 v1, 0x12

    invoke-virtual {v0, v1, p1}, Lcom/sma/smartv3/biz/StatManager;->XIi00iiXO(ILjava/lang/String;)V

    return-void
.end method

.method public onADReceive(Ljava/lang/String;)V
    .locals 1

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ad/ADPCAdContainerView$addUploadADPAdListener$1;->$listener:Lcom/sma/smartv3/biz/ad/ADPCAdListener;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/ad/ADPCAdListener;->onADReceive(Ljava/lang/String;)V

    return-void
.end method
