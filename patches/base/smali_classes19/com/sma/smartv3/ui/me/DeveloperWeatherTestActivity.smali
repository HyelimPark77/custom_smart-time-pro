.class public final Lcom/sma/smartv3/ui/me/DeveloperWeatherTestActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private final mMap$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mMapView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O11iOI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O11iOI;-><init>(Lcom/sma/smartv3/ui/me/DeveloperWeatherTestActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWeatherTestActivity;->mMapView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X00iIX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X00iIX;-><init>(Lcom/sma/smartv3/ui/me/DeveloperWeatherTestActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWeatherTestActivity;->mMap$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/baidu/mapapi/model/LatLng;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperWeatherTestActivity;->initView$lambda$0(Lcom/baidu/mapapi/model/LatLng;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/DeveloperWeatherTestActivity;)Lcom/baidu/mapapi/map/BaiduMap;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperWeatherTestActivity;->mMap_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperWeatherTestActivity;)Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/me/DeveloperWeatherTestActivity;)Lcom/baidu/mapapi/map/TextureMapView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperWeatherTestActivity;->mMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperWeatherTestActivity;)Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object p0

    return-object p0
.end method

.method private final getMMap()Lcom/baidu/mapapi/map/BaiduMap;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWeatherTestActivity;->mMap$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/BaiduMap;

    return-object v0
.end method

.method private final getMMapView()Lcom/baidu/mapapi/map/TextureMapView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperWeatherTestActivity;->mMapView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/TextureMapView;

    return-object v0
.end method

.method private static final initView$lambda$0(Lcom/baidu/mapapi/model/LatLng;)V
    .locals 13

    invoke-virtual {p0}, Lcom/baidu/mapapi/model/LatLng;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v1, Lcom/szabh/smable3/BleKey;->WEATHER_REALTIME:Lcom/szabh/smable3/BleKey;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lcom/szabh/smable3/component/BaseBleCache;->remove$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    sget-object v1, Lcom/szabh/smable3/BleKey;->WEATHER_FORECAST:Lcom/szabh/smable3/BleKey;

    invoke-static {v0, v1, v2, v3, v2}, Lcom/szabh/smable3/component/BaseBleCache;->remove$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    sget-object v1, Lcom/szabh/smable3/BleKey;->WEATHER_REALTIME2:Lcom/szabh/smable3/BleKey;

    invoke-static {v0, v1, v2, v3, v2}, Lcom/szabh/smable3/component/BaseBleCache;->remove$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    sget-object v1, Lcom/szabh/smable3/BleKey;->WEATHER_FORECAST2:Lcom/szabh/smable3/BleKey;

    invoke-static {v0, v1, v2, v3, v2}, Lcom/szabh/smable3/component/BaseBleCache;->remove$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    sget-object v1, Lcom/szabh/smable3/BleKey;->WEATHER_REALTIME3:Lcom/szabh/smable3/BleKey;

    invoke-static {v0, v1, v2, v3, v2}, Lcom/szabh/smable3/component/BaseBleCache;->remove$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    sget-object v1, Lcom/szabh/smable3/BleKey;->WEATHER_FORECAST3:Lcom/szabh/smable3/BleKey;

    invoke-static {v0, v1, v2, v3, v2}, Lcom/szabh/smable3/component/BaseBleCache;->remove$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    sget-object v4, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    iget-wide v5, p0, Lcom/baidu/mapapi/model/LatLng;->longitude:D

    iget-wide v7, p0, Lcom/baidu/mapapi/model/LatLng;->latitude:D

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-wide/16 v9, 0x0

    invoke-static/range {v4 .. v12}, Lcom/sma/smartv3/initializer/WeatherInitializer;->I1XOi1(Lcom/sma/smartv3/initializer/WeatherInitializer;DDDILjava/lang/Object;)V

    iget-wide v0, p0, Lcom/baidu/mapapi/model/LatLng;->longitude:D

    iget-wide v2, p0, Lcom/baidu/mapapi/model/LatLng;->latitude:D

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/sma/smartv3/initializer/WeatherInitializer;->O10IXXX0X(DD)V

    return-void
.end method

.method private static final mMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperWeatherTestActivity;)Lcom/baidu/mapapi/map/TextureMapView;
    .locals 1

    const v0, 0x7f0a0746

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/baidu/mapapi/map/TextureMapView;

    return-object p0
.end method

.method private static final mMap_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperWeatherTestActivity;)Lcom/baidu/mapapi/map/BaiduMap;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperWeatherTestActivity;->getMMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object p0

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/TextureMapView;->getMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperWeatherTestActivity;->getMMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/II00iOX0;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/II00iOX0;-><init>()V

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/BaiduMap;->setOnMapLongClickListener(Lcom/baidu/mapapi/map/BaiduMap$OnMapLongClickListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d007f

    return v0
.end method
