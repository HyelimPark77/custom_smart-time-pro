.class public final Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/maps/OnMapReadyCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMapReady(Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 2

    const-string v0, "googleMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->access$getMActivity(Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/maps/MapsInitializer;->initialize(Landroid/content/Context;)I

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->access$setMap$p(Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;Lcom/google/android/gms/maps/GoogleMap;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg3()Ljava/io/Serializable;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type java.util.ArrayList<com.sma.smartv3.model.CustomLatLng>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/ArrayList;

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->access$showMapContent(Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;Ljava/util/ArrayList;)V

    return-void
.end method
