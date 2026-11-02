.class public final Lcom/sma/smartv3/ui/status/item/ADPBannerItem$OXO1;
.super Lcom/sma/smartv3/biz/ad/ADPAdListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/status/item/ADPBannerItem;->bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/status/item/ADPBannerItem;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/status/item/ADPBannerItem;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/ADPBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/item/ADPBannerItem;

    invoke-direct {p0}, Lcom/sma/smartv3/biz/ad/ADPAdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClose(Ljava/lang/String;)V
    .locals 2

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/ADPBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/item/ADPBannerItem;

    invoke-static {v0}, Lcom/sma/smartv3/ui/status/item/ADPBannerItem;->access$getTAG$p(Lcom/sma/smartv3/ui/status/item/ADPBannerItem;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> Ad State : Closed"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/ADPBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/item/ADPBannerItem;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/status/item/ADPBannerItem;->access$setLoaded$p(Lcom/sma/smartv3/ui/status/item/ADPBannerItem;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/ADPBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/item/ADPBannerItem;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/status/item/ADPBannerItem;->initView()V

    return-void
.end method

.method public onAdFailed(Lcom/sma/smartv3/biz/ad/ADPAdError;Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adUnitId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/ADPBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/item/ADPBannerItem;

    invoke-static {v0}, Lcom/sma/smartv3/ui/status/item/ADPBannerItem;->access$getTAG$p(Lcom/sma/smartv3/ui/status/item/ADPBannerItem;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/ad/ADPAdError;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/ad/ADPAdError;->getMsg()Ljava/lang/String;

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

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/ADPBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/item/ADPBannerItem;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/status/item/ADPBannerItem;->access$setLoaded$p(Lcom/sma/smartv3/ui/status/item/ADPBannerItem;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/ADPBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/item/ADPBannerItem;

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/status/item/ADPBannerItem;->access$setLoading$p(Lcom/sma/smartv3/ui/status/item/ADPBannerItem;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/ADPBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/item/ADPBannerItem;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/status/item/ADPBannerItem;->initView()V

    return-void
.end method

.method public onAdLoaded(Ljava/lang/String;)V
    .locals 2

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/ADPBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/item/ADPBannerItem;

    invoke-static {v0}, Lcom/sma/smartv3/ui/status/item/ADPBannerItem;->access$getTAG$p(Lcom/sma/smartv3/ui/status/item/ADPBannerItem;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> Ad State : Loaded"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/ADPBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/item/ADPBannerItem;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/status/item/ADPBannerItem;->access$setLoaded$p(Lcom/sma/smartv3/ui/status/item/ADPBannerItem;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/ADPBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/item/ADPBannerItem;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/status/item/ADPBannerItem;->access$setLoading$p(Lcom/sma/smartv3/ui/status/item/ADPBannerItem;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/ADPBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/item/ADPBannerItem;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/status/item/ADPBannerItem;->initView()V

    return-void
.end method

.method public onAdOpen(Ljava/lang/String;)V
    .locals 2

    const-string v0, "adUnitId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/ADPBannerItem$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/item/ADPBannerItem;

    invoke-static {v0}, Lcom/sma/smartv3/ui/status/item/ADPBannerItem;->access$getTAG$p(Lcom/sma/smartv3/ui/status/item/ADPBannerItem;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> Ad State : Open"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method
