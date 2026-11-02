.class public final Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IO0OI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->onLocationWhere(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/location/CustomLocation;)V
    .locals 6

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->access$isInChinaMainland$p(Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->access$getMBaiDuMap$p(Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;)Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "mBaiDuMap"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    new-instance v0, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v2

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-static {v0}, Lcom/baidu/mapapi/map/MapStatusUpdateFactory;->newLatLng(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/map/MapStatusUpdate;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/baidu/mapapi/map/BaiduMap;->setMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;)V

    goto :goto_3

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->access$getMGoogleMap$p(Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "mGoogleMap"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_2
    move-object v1, v0

    :goto_1
    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v2

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-static {v0}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLng(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_3
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment$OXO1;->OXO1:Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;

    invoke-static {p1}, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->access$stopLocationClient(Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;)V

    return-void
.end method

.method public onError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
