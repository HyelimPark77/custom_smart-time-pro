.class public final Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;
.super Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;
.source "SourceFile"


# instance fields
.field private isShowMapPoi:Z

.field private final showMapPoi$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OXIiI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OXIiI;-><init>(Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;->showMapPoi$delegate:Lkotlin/Lazy;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;->isShowMapPoi:Z

    const v1, 0x7f081377

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->setMStartIcon(I)V

    const v1, 0x7f081374

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->setMCurrentIcon(I)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->setEndMarkerAnchorCenter(Z)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->setShowLineMarker(Z)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->setMBaiduLineStart(Lcom/baidu/mapapi/map/Marker;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->setMBaiduLineEnd(Lcom/baidu/mapapi/map/Marker;)V

    return-void
.end method

.method public static synthetic X11iII1O1(Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;->showMapPoi_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXIIO1i11(Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;->initView$lambda$1(Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;)V

    return-void
.end method

.method private final getShowMapPoi()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;->showMapPoi$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public static synthetic iI(Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;->initView$lambda$2(Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;)V

    return-void
.end method

.method public static synthetic iX1O1(Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;->initView$lambda$0(Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;Landroid/view/View;)V

    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;Landroid/view/View;)V
    .locals 2

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;->isShowMapPoi:Z

    const/4 v0, 0x1

    xor-int/2addr p1, v0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;->isShowMapPoi:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object p1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;->isShowMapPoi:Z

    invoke-virtual {p1, v0}, Lcom/baidu/mapapi/map/BaiduMap;->showMapPoi(Z)V

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGoogleMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object p1

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;->isShowMapPoi:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    :goto_0
    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/GoogleMap;->setMapType(I)V

    :goto_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;->getShowMapPoi()Landroid/widget/ImageView;

    move-result-object p1

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;->isShowMapPoi:Z

    if-eqz p0, :cond_2

    const p0, 0x7f08172f

    goto :goto_2

    :cond_2
    const p0, 0x7f08172e

    :goto_2
    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->onPause()V

    return-void
.end method

.method private static final initView$lambda$2(Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->onResume()V

    return-void
.end method

.method private static final showMapPoi_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;)Landroid/widget/ImageView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a24

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method


# virtual methods
.method public initView()V
    .locals 4

    invoke-super {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->initView()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;->getShowMapPoi()Landroid/widget/ImageView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iXIXX1O0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/iXIXX1O0;-><init>(Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XiiXOI;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/XiiXOI;-><init>(Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;)V

    const-wide/16 v2, 0xfa

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I0OX10I;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/I0OX10I;-><init>(Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;)V

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public initializedMapFinish()V
    .locals 2

    invoke-super {p0}, Lcom/sma/smartv3/ui/sport/BaseDetailCardFragment;->initializedMapFinish()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGoogleMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/maps/CameraUpdateFactory;->zoomOut()Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    :cond_0
    return-void
.end method

.method public final isShowMapPoi()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;->isShowMapPoi:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e8b

    return v0
.end method

.method public mapStatusBaiDuCenterPoint(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;)V"
        }
    .end annotation

    const-string v0, "locationList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/iOXO11i1;->O00(Ljava/util/List;)Lcom/baidu/mapapi/map/MapStatusUpdate;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/baidu/mapapi/map/BaiduMap;->setMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;)V

    return-void
.end method

.method public final setShowMapPoi(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/DetailMapCardFragment;->isShowMapPoi:Z

    return-void
.end method
