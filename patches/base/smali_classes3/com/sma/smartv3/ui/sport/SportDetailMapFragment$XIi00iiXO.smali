.class public final Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/maps/OnMapReadyCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->showGoogleMap(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

.field public final synthetic XIi00iiXO:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    iput-object p2, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$XIi00iiXO;->XIi00iiXO:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMapReady(Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 2

    const-string v0, "googleMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->access$getMActivity(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/maps/MapsInitializer;->initialize(Landroid/content/Context;)I

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->setMGoogleMap(Lcom/google/android/gms/maps/GoogleMap;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$XIi00iiXO;->XIi00iiXO:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/X0IO1OOi;->XIi00iiXO(Ljava/util/List;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/e40;->XIi00iiXO(Ljava/util/List;)F

    move-result v0

    invoke-static {v1, v0}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngZoom(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->addLine()V

    return-void
.end method
