.class public final Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem$OXO1;
.super Lcom/sma/smartv3/biz/ad/ADPCAdListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;Lcom/sma/smartv3/view/ad/ADPCAdContainerView;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;

    iput-object p2, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem$OXO1;->XIi00iiXO:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    invoke-direct {p0}, Lcom/sma/smartv3/biz/ad/ADPCAdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onADClosed(Ljava/lang/String;)V
    .locals 2

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;

    invoke-static {v0}, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->access$getTAG$p(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> Ad State : Closed"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->access$setLoaded$p(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->initView()V

    return-void
.end method

.method public onADError(Lcom/sma/smartv3/biz/ad/ADPCAdError;Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adUnitId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;

    invoke-static {v0}, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->access$getTAG$p(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/ad/ADPCAdError;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/ad/ADPCAdError;->getMsg()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> Ad State : Error, Info: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->access$setLoaded$p(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->access$setLoading$p(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->initView()V

    return-void
.end method

.method public onADPresent(Ljava/lang/String;)V
    .locals 3

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;

    invoke-static {v0}, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->access$getTAG$p(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> Ad State : Present"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;

    invoke-static {v0}, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->access$getTAG$p(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem$OXO1;->XIi00iiXO:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    invoke-virtual {v1}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->getAdUnitId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> Ad State : ai\u9875\u9762  \u5c55\u793a.... \u5e7f\u544a\u5c55\u793a\u4e86 -->  id:"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    return-void
.end method

.method public onADReceive(Ljava/lang/String;)V
    .locals 3

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;

    invoke-static {v0}, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->access$getTAG$p(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> Ad State : Loaded"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;

    invoke-static {v0}, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->access$getTAG$p(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem$OXO1;->XIi00iiXO:Lcom/sma/smartv3/view/ad/ADPCAdContainerView;

    invoke-virtual {v1}, Lcom/sma/smartv3/view/ad/ADPCAdContainerView;->getAdUnitId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> Ad State : ai\u9875\u9762  \u52a0\u8f7d.... \u5e7f\u544a\u52a0\u8f7d.\u4e86 -->  id:"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->access$setLoaded$p(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->access$setLoading$p(Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/ai/item/AIADPCBannerItem;->initView()V

    return-void
.end method
