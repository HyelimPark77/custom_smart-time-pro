.class public abstract Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;
.super Lcom/sma/smartv3/ui/sport/course/BaseSportV2Fragment;
.source "SourceFile"


# instance fields
.field private curIcon:I

.field private isInChinaMainland:Z

.field private final mBMapView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

.field private mBaiduCreateIcon:Lcom/baidu/mapapi/map/Overlay;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mGMapView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mGoogleCreateIcon:Lcom/google/android/gms/maps/model/Marker;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

.field private mLocationClient:Lcom/android/mltcode/paycertificationapi/ms;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mapZoomDefault:F


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/BaseSportV2Fragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XO0i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XO0i;-><init>(Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->mGMapView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iiXOIO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iiXOIO;-><init>(Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->mBMapView$delegate:Lkotlin/Lazy;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "LOCATION_WHERE"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->isInChinaMainland:Z

    const/high16 v0, 0x41900000    # 18.0f

    iput v0, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->mapZoomDefault:F

    const v0, 0x7f081376

    iput v0, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->curIcon:I

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/view/CustomGoogleMapView;Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->onLocationWhere$lambda$1$0(Lcom/sma/smartv3/view/CustomGoogleMapView;Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;Lcom/google/android/gms/maps/GoogleMap;)V

    return-void
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;)Lcom/sma/smartv3/view/CustomGoogleMapView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->mGMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;)Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$moveCameraMap(Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;Lcom/sma/smartv3/location/CustomLocation;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->moveCameraMap(Lcom/sma/smartv3/location/CustomLocation;)V

    return-void
.end method

.method public static final synthetic access$stopLocationClient(Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->stopLocationClient()V

    return-void
.end method

.method private final createBaiduIcon(ILcom/baidu/mapapi/model/LatLng;Z)Lcom/baidu/mapapi/map/Overlay;
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    if-nez v0, :cond_0

    const-string v0, "mBaiDuMap"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    new-instance v1, Lcom/baidu/mapapi/map/MarkerOptions;

    invoke-direct {v1}, Lcom/baidu/mapapi/map/MarkerOptions;-><init>()V

    invoke-virtual {v1, p2}, Lcom/baidu/mapapi/map/MarkerOptions;->position(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object p2

    invoke-static {p1}, Lcom/baidu/mapapi/map/BitmapDescriptorFactory;->fromResource(I)Lcom/baidu/mapapi/map/BitmapDescriptor;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/baidu/mapapi/map/MarkerOptions;->icon(Lcom/baidu/mapapi/map/BitmapDescriptor;)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/baidu/mapapi/map/MarkerOptions;->draggable(Z)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/baidu/mapapi/map/MarkerOptions;->flat(Z)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object p1

    const/16 p2, 0x9

    invoke-virtual {p1, p2}, Lcom/baidu/mapapi/map/MarkerOptions;->zIndex(I)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object p1

    if-eqz p3, :cond_1

    const/high16 p2, 0x3f000000    # 0.5f

    invoke-virtual {p1, p2, p2}, Lcom/baidu/mapapi/map/MarkerOptions;->anchor(FF)Lcom/baidu/mapapi/map/MarkerOptions;

    :cond_1
    invoke-virtual {v0, p1}, Lcom/baidu/mapapi/map/BaiduMap;->addOverlay(Lcom/baidu/mapapi/map/OverlayOptions;)Lcom/baidu/mapapi/map/Overlay;

    move-result-object p1

    const-string p2, "addOverlay(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public static synthetic createBaiduIcon$default(Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;ILcom/baidu/mapapi/model/LatLng;ZILjava/lang/Object;)Lcom/baidu/mapapi/map/Overlay;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->createBaiduIcon(ILcom/baidu/mapapi/model/LatLng;Z)Lcom/baidu/mapapi/map/Overlay;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: createBaiduIcon"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->mBMapView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/TextureMapView;

    return-object v0
.end method

.method private final getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->mGMapView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/CustomGoogleMapView;

    return-object v0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;)Lcom/baidu/mapapi/map/TextureMapView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->mBMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;)Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object p0

    return-object p0
.end method

.method private static final mBMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;)Lcom/baidu/mapapi/map/TextureMapView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a00fc

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/baidu/mapapi/map/TextureMapView;

    return-object p0
.end method

.method private static final mGMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;)Lcom/sma/smartv3/view/CustomGoogleMapView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a03fb

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/CustomGoogleMapView;

    return-object p0
.end method

.method private final moveCameraMap(Lcom/sma/smartv3/location/CustomLocation;)V
    .locals 7

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->isInChinaMainland:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->mBaiduCreateIcon:Lcom/baidu/mapapi/map/Overlay;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Overlay;->remove()V

    :cond_0
    iget v0, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->curIcon:I

    new-instance v2, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v3

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    const/4 v3, 0x1

    invoke-direct {p0, v0, v2, v3}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->createBaiduIcon(ILcom/baidu/mapapi/model/LatLng;Z)Lcom/baidu/mapapi/map/Overlay;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->mBaiduCreateIcon:Lcom/baidu/mapapi/map/Overlay;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    if-nez v0, :cond_1

    const-string v0, "mBaiDuMap"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    new-instance v0, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v2

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    iget p1, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->mapZoomDefault:F

    invoke-static {v0, p1}, Lcom/baidu/mapapi/map/MapStatusUpdateFactory;->newLatLngZoom(Lcom/baidu/mapapi/model/LatLng;F)Lcom/baidu/mapapi/map/MapStatusUpdate;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/baidu/mapapi/map/BaiduMap;->setMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;)V

    return-void

    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v0, :cond_3

    const-string v0, "mGoogleMap"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_3
    move-object v1, v0

    :goto_1
    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v2

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    iget p1, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->mapZoomDefault:F

    invoke-static {v0, p1}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngZoom(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/GoogleMap;->animateCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->mGoogleCreateIcon:Lcom/google/android/gms/maps/model/Marker;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/Marker;->remove()V

    :cond_4
    new-instance p1, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {p1}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p1

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-virtual {p1, v0, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->anchor(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->curIcon:I

    invoke-static {v0}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->mGoogleCreateIcon:Lcom/google/android/gms/maps/model/Marker;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private static final onLocationWhere$lambda$1$0(Lcom/sma/smartv3/view/CustomGoogleMapView;Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 1

    const-string v0, "googleMap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/maps/MapsInitializer;->initialize(Landroid/content/Context;)I

    iput-object p2, p1, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    if-nez p2, :cond_0

    const-string p0, "mGoogleMap"

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p2}, Lcom/google/android/gms/maps/GoogleMap;->getUiSettings()Lcom/google/android/gms/maps/UiSettings;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/maps/UiSettings;->setAllGesturesEnabled(Z)V

    return-void
.end method

.method private final stopLocationClient()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->mLocationClient:Lcom/android/mltcode/paycertificationapi/ms;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/ms;->I0IIOi()V

    :cond_0
    return-void
.end method


# virtual methods
.method public initView()V
    .locals 1

    invoke-super {p0}, Lcom/sma/smartv3/ui/sport/course/BaseSportV2Fragment;->initView()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->onLocationWhere(Ljava/lang/Object;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->onDestroy()V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->isInChinaMainland:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextureMapView;->onDestroy()V

    return-void

    :cond_0
    :try_start_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->onDestroy()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final onLocationWhere(Ljava/lang/Object;)V
    .locals 8
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "LOCATION_WHERE"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "LOCATION_WHERE"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->isInChinaMainland:Z

    invoke-static {}, Lcom/sma/smartv3/util/UtilsKt;->XXIIO1i11()Lcom/sma/smartv3/location/CustomLocation;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/common/GoogleApiAvailability;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-boolean v2, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->isInChinaMainland:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/TextureMapView;->showZoomControls(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/TextureMapView;->showScaleControl(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    sget-object v2, Lcom/baidu/mapapi/map/LogoPosition;->logoPostionRightTop:Lcom/baidu/mapapi/map/LogoPosition;

    invoke-virtual {v0, v2}, Lcom/baidu/mapapi/map/TextureMapView;->setLogoPosition(Lcom/baidu/mapapi/map/LogoPosition;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextureMapView;->getMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/BaiduMap;->setCompassEnable(Z)V

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/BaiduMap;->getUiSettings()Lcom/baidu/mapapi/map/UiSettings;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/baidu/mapapi/map/UiSettings;->setAllGesturesEnabled(Z)V

    const-string v2, "apply(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_2

    :try_start_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0, v3}, Lcom/google/android/gms/maps/MapView;->onCreate(Landroid/os/Bundle;)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/iiiIO100i;

    invoke-direct {v2, v0, p0}, Lcom/android/mltcode/paycertificationapi/iiiIO100i;-><init>(Lcom/sma/smartv3/view/CustomGoogleMapView;Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/MapView;->getMapAsync(Lcom/google/android/gms/maps/OnMapReadyCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    :goto_1
    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isBound()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "onLocationWhere"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmpg-double v0, v4, v6

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v4

    cmpg-double v0, v4, v6

    if-nez v0, :cond_3

    new-instance p1, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment$OXO1;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment$OXO1;-><init>(Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;)V

    const/4 v0, 0x2

    invoke-static {p1, v1, v0, v3}, Lcom/android/mltcode/paycertificationapi/ns;->XIi00iiXO(Lcom/android/mltcode/paycertificationapi/IO0OI;ZILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ms;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->mLocationClient:Lcom/android/mltcode/paycertificationapi/ms;

    if-eqz p1, :cond_4

    const v0, 0x7f141248

    invoke-virtual {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/ms;->IiI10X(IZ)V

    goto :goto_2

    :cond_3
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->moveCameraMap(Lcom/sma/smartv3/location/CustomLocation;)V

    :cond_4
    :goto_2
    return-void
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->isInChinaMainland:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextureMapView;->onPause()V

    return-void

    :cond_0
    :try_start_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->onPause()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->isInChinaMainland:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextureMapView;->onResume()V

    return-void

    :cond_0
    :try_start_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/course/BaseGpsSportV2Fragment;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->onResume()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
