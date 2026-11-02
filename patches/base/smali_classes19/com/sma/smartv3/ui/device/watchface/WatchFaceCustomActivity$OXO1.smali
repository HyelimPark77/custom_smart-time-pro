.class public final Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/az1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->initElementView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/az1<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

.field public final synthetic XIi00iiXO:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ResourcesIdInfo;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic iO:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ResourcesIdInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ResourcesIdInfo;",
            ">;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ResourcesIdInfo;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$OXO1;->XIi00iiXO:Ljava/util/List;

    iput-object p3, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$OXO1;->iO:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic OXO1(Ljava/lang/Object;Z)V
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$OXO1;->iO(IZ)V

    return-void
.end method

.method public bridge synthetic XIi00iiXO(Ljava/lang/Object;Z)V
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$OXO1;->XO0O10(IZ)V

    return-void
.end method

.method public XO0O10(IZ)V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$getTimeDigitalView(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$getTimeScaleView(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$OXO1;->iO:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/ResourcesIdInfo;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/ResourcesIdInfo;->getResId()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$getMCustomWatchFace$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)Lcom/android/mltcode/paycertificationapi/X1XX1O;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const-string v0, "mCustomWatchFace"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->iIXX0i(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$getTimeScaleView(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)Landroid/widget/ImageView;

    move-result-object p1

    if-eqz p2, :cond_1

    const/4 v1, 0x0

    :cond_1
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$getTimeElementFragment$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, "timeElementFragment"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v2, p1

    :goto_0
    invoke-virtual {v2}, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->reset()V

    return-void
.end method

.method public iO(IZ)V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$getTimeDigitalView(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$getTimePointView(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$OXO1;->XIi00iiXO:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/ResourcesIdInfo;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/ResourcesIdInfo;->getResId()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$getMCustomWatchFace$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)Lcom/android/mltcode/paycertificationapi/X1XX1O;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const-string v0, "mCustomWatchFace"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->OIIOI(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$getTimePointView(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)Landroid/widget/ImageView;

    move-result-object p1

    if-eqz p2, :cond_1

    const/4 v1, 0x0

    :cond_1
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$getTimeElementFragment$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, "timeElementFragment"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v2, p1

    :goto_0
    invoke-virtual {v2}, Lcom/sma/smartv3/ui/device/watchface/fragment/TimeElementFragment;->reset()V

    return-void
.end method
