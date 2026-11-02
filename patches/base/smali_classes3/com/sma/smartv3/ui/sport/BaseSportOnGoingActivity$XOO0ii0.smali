.class public final Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$XOO0ii0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/maps/OnMapReadyCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->showGoogleMap()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/view/CustomGoogleMapView;

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/CustomGoogleMapView;Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/view/CustomGoogleMapView;

    iput-object p2, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$XOO0ii0;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMapReady(Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 1

    const-string v0, "googleMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/view/CustomGoogleMapView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/maps/MapsInitializer;->initialize(Landroid/content/Context;)I

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$XOO0ii0;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->access$setMGoogleMap$p(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;Lcom/google/android/gms/maps/GoogleMap;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$XOO0ii0;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->access$setGoogleMapReady$p(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$XOO0ii0;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->access$getMGooglePoints$p(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity$XOO0ii0;->XIi00iiXO:Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;->access$updateGoogleMap(Lcom/sma/smartv3/ui/sport/BaseSportOnGoingActivity;)V

    :cond_0
    return-void
.end method
