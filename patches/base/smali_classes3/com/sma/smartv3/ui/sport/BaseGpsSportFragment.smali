.class public abstract Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;
.super Lcom/sma/smartv3/ui/sport/BaseSportFragment;
.source "SourceFile"


# instance fields
.field private isInChinaMainland:Z

.field private final mBMapView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

.field private final mGMapView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

.field private mLocationClient:Lcom/android/mltcode/paycertificationapi/ms;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Iii0iXIO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Iii0iXIO;-><init>(Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->mGMapView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OXOI0i0X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OXOI0i0X;-><init>(Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->mBMapView$delegate:Lkotlin/Lazy;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "LOCATION_WHERE"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->isInChinaMainland:Z

    return-void
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;)Lcom/baidu/mapapi/map/TextureMapView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->mBMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;)Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/view/CustomGoogleMapView;Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->onLocationWhere$lambda$1$0(Lcom/sma/smartv3/view/CustomGoogleMapView;Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;Lcom/google/android/gms/maps/GoogleMap;)V

    return-void
.end method

.method public static final synthetic access$getMBaiDuMap$p(Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;)Lcom/baidu/mapapi/map/BaiduMap;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    return-object p0
.end method

.method public static final synthetic access$getMGoogleMap$p(Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;)Lcom/google/android/gms/maps/GoogleMap;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    return-object p0
.end method

.method public static final synthetic access$isInChinaMainland$p(Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->isInChinaMainland:Z

    return p0
.end method

.method public static final synthetic access$stopLocationClient(Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->stopLocationClient()V

    return-void
.end method

.method private final getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->mBMapView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/TextureMapView;

    return-object v0
.end method

.method private final getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->mGMapView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/CustomGoogleMapView;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;)Lcom/sma/smartv3/view/CustomGoogleMapView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->mGMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;)Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object p0

    return-object p0
.end method

.method private static final mBMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;)Lcom/baidu/mapapi/map/TextureMapView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a00fc

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/baidu/mapapi/map/TextureMapView;

    return-object p0
.end method

.method private static final mGMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;)Lcom/sma/smartv3/view/CustomGoogleMapView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a03fb

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/CustomGoogleMapView;

    return-object p0
.end method

.method private static final onLocationWhere$lambda$1$0(Lcom/sma/smartv3/view/CustomGoogleMapView;Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 1

    const-string v0, "googleMap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/maps/MapsInitializer;->initialize(Landroid/content/Context;)I

    iput-object p2, p1, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->mLocationClient:Lcom/android/mltcode/paycertificationapi/ms;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/ms;->I0IIOi()V

    :cond_0
    return-void
.end method


# virtual methods
.method public initView()V
    .locals 1

    invoke-super {p0}, Lcom/sma/smartv3/ui/sport/BaseSportFragment;->initView()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->onLocationWhere(Ljava/lang/Object;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->onDestroy()V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->isInChinaMainland:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextureMapView;->onDestroy()V

    return-void

    :cond_0
    :try_start_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->onDestroy()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final onLocationWhere(Ljava/lang/Object;)V
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "LOCATION_WHERE"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BleConnector;->isBound()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "onLocationWhere"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "LOCATION_WHERE"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->isInChinaMainland:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/baidu/mapapi/map/TextureMapView;->showZoomControls(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/baidu/mapapi/map/TextureMapView;->showScaleControl(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object p1

    sget-object v2, Lcom/baidu/mapapi/map/LogoPosition;->logoPostionRightTop:Lcom/baidu/mapapi/map/LogoPosition;

    invoke-virtual {p1, v2}, Lcom/baidu/mapapi/map/TextureMapView;->setLogoPosition(Lcom/baidu/mapapi/map/LogoPosition;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/TextureMapView;->getMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/baidu/mapapi/map/BaiduMap;->setCompassEnable(Z)V

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/BaiduMap;->getUiSettings()Lcom/baidu/mapapi/map/UiSettings;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/baidu/mapapi/map/UiSettings;->setAllGesturesEnabled(Z)V

    const-string v2, "apply(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :try_start_0
    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/MapView;->onCreate(Landroid/os/Bundle;)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/O1iII10OO;

    invoke-direct {v2, p1, p0}, Lcom/android/mltcode/paycertificationapi/O1iII10OO;-><init>(Lcom/sma/smartv3/view/CustomGoogleMapView;Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;)V

    invoke-virtual {p1, v2}, Lcom/google/android/gms/maps/MapView;->getMapAsync(Lcom/google/android/gms/maps/OnMapReadyCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    new-instance p1, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment$OXO1;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment$OXO1;-><init>(Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;)V

    const/4 v2, 0x2

    invoke-static {p1, v1, v2, v0}, Lcom/android/mltcode/paycertificationapi/ns;->XIi00iiXO(Lcom/android/mltcode/paycertificationapi/IO0OI;ZILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/ms;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->mLocationClient:Lcom/android/mltcode/paycertificationapi/ms;

    if-eqz p1, :cond_1

    const v0, 0x7f141248

    invoke-virtual {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/ms;->IiI10X(IZ)V

    :cond_1
    return-void
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->isInChinaMainland:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextureMapView;->onPause()V

    return-void

    :cond_0
    :try_start_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

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

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->isInChinaMainland:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextureMapView;->onResume()V

    return-void

    :cond_0
    :try_start_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseGpsSportFragment;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->onResume()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
