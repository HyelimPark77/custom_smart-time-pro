.class public final Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IO0OI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1$OXO1;->iO(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V

    return-void
.end method

.method public static final iO(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$checkZoomRestrictions(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/location/CustomLocation;)V
    .locals 11

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v1

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v3, v0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v5, v0, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-static {v1, v2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$setCurLatLng$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Lcom/google/android/gms/maps/model/LatLng;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$isInChinaMainland$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Z

    move-result v0

    const-wide v1, 0x40c8f38000000000L    # 12775.0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v0, v1, v2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$setComputeOffset(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;D)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$getMBaiDuMap$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v1, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1$OXO1$OXO1;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-direct {v1, v2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1$OXO1$OXO1;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/BaiduMap;->setOnMapStatusChangeListener(Lcom/baidu/mapapi/map/BaiduMap$OnMapStatusChangeListener;)V

    goto :goto_3

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$getMGoogleMap$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v3, "mGoogleMap"

    const/4 v4, 0x0

    if-nez v0, :cond_1

    :try_start_1
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v4

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_0
    iget-object v5, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    new-instance v6, Lcom/google/android/gms/maps/model/LatLng;

    invoke-static {v5}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$getCurLatLng$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v7
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-string v8, "curLatLng"

    if-nez v7, :cond_2

    :try_start_2
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v7, v4

    :cond_2
    iget-wide v9, v7, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    invoke-static {v5}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$getCurLatLng$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v7

    if-nez v7, :cond_3

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v7, v4

    :cond_3
    iget-wide v7, v7, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-direct {v6, v9, v10, v7, v8}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-static {v5}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$getGoogleCurZoom$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)F

    move-result v5

    invoke-static {v6, v5}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngZoom(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v0, v1, v2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$setComputeOffset(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;D)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$getMGoogleMap$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    if-nez v0, :cond_4

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v4, v0

    :goto_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XOXIi1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/XOXIi1;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V

    invoke-virtual {v4, v1}, Lcom/google/android/gms/maps/GoogleMap;->setOnCameraIdleListener(Lcom/google/android/gms/maps/GoogleMap$OnCameraIdleListener;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_5
    :goto_3
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$showMarkerOptions(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Lcom/sma/smartv3/location/CustomLocation;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->access$stopLocationClient(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V

    return-void
.end method

.method public onError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
