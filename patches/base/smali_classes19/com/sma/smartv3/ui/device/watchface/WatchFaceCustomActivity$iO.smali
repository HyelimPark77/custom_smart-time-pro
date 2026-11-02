.class public final Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IXI011X11;


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
        "Lcom/android/mltcode/paycertificationapi/IXI011X11<",
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


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/ResourcesIdInfo;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$iO;->XIi00iiXO:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic OXO1(Ljava/lang/Object;Z)V
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$iO;->XIi00iiXO(IZ)V

    return-void
.end method

.method public XIi00iiXO(IZ)V
    .locals 1

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-static {p2}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$getControlViewStep(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$iO;->XIi00iiXO:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/ResourcesIdInfo;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ResourcesIdInfo;->getSecondaryId()I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/view/dial/DialElementView;->setTextColor(I)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-static {p2}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$getControlViewHr(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$iO;->XIi00iiXO:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/ResourcesIdInfo;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ResourcesIdInfo;->getSecondaryId()I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/view/dial/DialElementView;->setTextColor(I)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-static {p2}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$getControlViewCa(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$iO;->XIi00iiXO:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/ResourcesIdInfo;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ResourcesIdInfo;->getSecondaryId()I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/view/dial/DialElementView;->setTextColor(I)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-static {p2}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$getControlViewDis(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)Lcom/sma/smartv3/view/dial/DialElementView;

    move-result-object p2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$iO;->XIi00iiXO:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/ResourcesIdInfo;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/ResourcesIdInfo;->getSecondaryId()I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/view/dial/DialElementView;->setTextColor(I)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;

    invoke-static {p2}, Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;->access$getMCustomWatchFace$p(Lcom/sma/smartv3/ui/device/watchface/WatchFaceCustomActivity;)Lcom/android/mltcode/paycertificationapi/X1XX1O;

    move-result-object p2

    if-nez p2, :cond_0

    const-string p2, "mCustomWatchFace"

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/X1XX1O;->I0OX(I)V

    return-void
.end method
