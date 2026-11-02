.class public final Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;
.super Lcom/bestmafen/androidbase/base/BaseFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBaiDuMapSportRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaiDuMapSportRecordFragment.kt\ncom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,221:1\n19#2:222\n15#2:223\n*S KotlinDebug\n*F\n+ 1 BaiDuMapSportRecordFragment.kt\ncom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment\n*L\n26#1:222\n26#1:223\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaiDuMapSportRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaiDuMapSportRecordFragment.kt\ncom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,221:1\n19#2:222\n15#2:223\n*S KotlinDebug\n*F\n+ 1 BaiDuMapSportRecordFragment.kt\ncom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment\n*L\n26#1:222\n26#1:223\n*E\n"
    }
.end annotation


# instance fields
.field private final mAppUser:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mMapView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private view:Landroidx/core/widget/NestedScrollView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/base/BaseFragment;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I0X1ii;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/I0X1ii;-><init>(Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->mMapView$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/model/AppUser;

    const v30, 0x7ffffff

    const/16 v31, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v2 .. v31}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/sma/smartv3/model/AppUser;

    iput-object v2, v0, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;Landroid/view/MotionEvent;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->showMapContent$lambda$2(Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;Landroid/view/MotionEvent;)V

    return-void
.end method

.method private final getMMapView()Lcom/baidu/mapapi/map/TextureMapView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->mMapView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/TextureMapView;

    return-object v0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;)Lcom/baidu/mapapi/map/TextureMapView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->mMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;)Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object p0

    return-object p0
.end method

.method private static final mMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;)Lcom/baidu/mapapi/map/TextureMapView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0746

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/baidu/mapapi/map/TextureMapView;

    return-object p0
.end method

.method private final setCustomerMakerIcon(Lcom/baidu/mapapi/map/BaiduMap;Lcom/baidu/mapapi/model/LatLng;I)V
    .locals 1

    .line 6
    invoke-static {p3}, Lcom/baidu/mapapi/map/BitmapDescriptorFactory;->fromResource(I)Lcom/baidu/mapapi/map/BitmapDescriptor;

    move-result-object p3

    .line 7
    new-instance v0, Lcom/baidu/mapapi/map/MarkerOptions;

    invoke-direct {v0}, Lcom/baidu/mapapi/map/MarkerOptions;-><init>()V

    .line 8
    invoke-virtual {v0, p2}, Lcom/baidu/mapapi/map/MarkerOptions;->position(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object p2

    .line 9
    invoke-virtual {p2, p3}, Lcom/baidu/mapapi/map/MarkerOptions;->icon(Lcom/baidu/mapapi/map/BitmapDescriptor;)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object p2

    const/4 p3, 0x0

    .line 10
    invoke-virtual {p2, p3}, Lcom/baidu/mapapi/map/MarkerOptions;->draggable(Z)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object p2

    const/4 p3, 0x1

    .line 11
    invoke-virtual {p2, p3}, Lcom/baidu/mapapi/map/MarkerOptions;->flat(Z)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object p2

    const/high16 p3, 0x3f000000    # 0.5f

    .line 12
    invoke-virtual {p2, p3}, Lcom/baidu/mapapi/map/MarkerOptions;->alpha(F)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object p2

    const-string p3, "alpha(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p1, p2}, Lcom/baidu/mapapi/map/BaiduMap;->addOverlay(Lcom/baidu/mapapi/map/OverlayOptions;)Lcom/baidu/mapapi/map/Overlay;

    return-void
.end method

.method private final setCustomerMakerIcon(Lcom/baidu/mapapi/map/BaiduMap;Lcom/baidu/mapapi/model/LatLng;Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/baidu/mapapi/map/MarkerOptions;

    invoke-direct {v0}, Lcom/baidu/mapapi/map/MarkerOptions;-><init>()V

    .line 2
    invoke-static {p3}, Lcom/baidu/mapapi/map/BitmapDescriptorFactory;->fromBitmap(Landroid/graphics/Bitmap;)Lcom/baidu/mapapi/map/BitmapDescriptor;

    move-result-object p3

    invoke-virtual {v0, p3}, Lcom/baidu/mapapi/map/MarkerOptions;->icon(Lcom/baidu/mapapi/map/BitmapDescriptor;)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object p3

    const/16 v0, 0x9

    .line 3
    invoke-virtual {p3, v0}, Lcom/baidu/mapapi/map/MarkerOptions;->zIndex(I)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object p3

    .line 4
    invoke-virtual {p3, p2}, Lcom/baidu/mapapi/map/MarkerOptions;->position(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object p2

    .line 5
    invoke-virtual {p1, p2}, Lcom/baidu/mapapi/map/BaiduMap;->addOverlay(Lcom/baidu/mapapi/map/OverlayOptions;)Lcom/baidu/mapapi/map/Overlay;

    return-void
.end method

.method private final setTextMakers(Lcom/baidu/mapapi/map/BaiduMap;Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/baidu/mapapi/map/BaiduMap;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zo5;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const v2, 0x7f0d0f75

    invoke-direct {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/zo5;-><init>(Landroid/content/Context;I)V

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    new-instance v3, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v4

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v6

    invoke-direct {v3, v4, v5, v6, v7}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    add-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/android/mltcode/paycertificationapi/zo5;->XIi00iiXO(Ljava/lang/CharSequence;)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-direct {p0, p1, v3, v4}, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->setCustomerMakerIcon(Lcom/baidu/mapapi/map/BaiduMap;Lcom/baidu/mapapi/model/LatLng;Landroid/graphics/Bitmap;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic showMapContent$default(Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;Ljava/util/ArrayList;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->showMapContent(Ljava/util/ArrayList;Z)V

    return-void
.end method

.method private static final showMapContent$lambda$2(Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;Landroid/view/MotionEvent;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->view:Landroidx/core/widget/NestedScrollView;

    if-eqz p0, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->requestDisallowInterceptTouchEvent(Z)V

    return-void

    :cond_0
    iget-object p0, p0, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->view:Landroidx/core/widget/NestedScrollView;

    if-eqz p0, :cond_1

    invoke-virtual {p0, v0}, Landroidx/core/widget/NestedScrollView;->requestDisallowInterceptTouchEvent(Z)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final getBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->getMMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextureMapView;->getMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    const-string v1, "getMap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 4

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg3()Ljava/io/Serializable;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type java.util.ArrayList<com.sma.smartv3.model.CustomLatLng>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p0, v0, v3, v1, v2}, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->showMapContent$default(Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;Ljava/util/ArrayList;ZILjava/lang/Object;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e6a

    return v0
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->onDestroy()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->getMMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextureMapView;->onDestroy()V

    return-void
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->getMMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextureMapView;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->getMMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextureMapView;->onResume()V

    return-void
.end method

.method public final setOnMapTouchListener(Landroidx/core/widget/NestedScrollView;)V
    .locals 1
    .param p1    # Landroidx/core/widget/NestedScrollView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "nestedScrollView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->view:Landroidx/core/widget/NestedScrollView;

    return-void
.end method

.method public final showMapContent(Ljava/util/ArrayList;Z)V
    .locals 11
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "tmpLocationList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "points(...)"

    const v1, 0x7f060414

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz p2, :cond_2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->getMMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object p2

    invoke-virtual {p2}, Lcom/baidu/mapapi/map/TextureMapView;->getMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object p2

    invoke-virtual {p2}, Lcom/baidu/mapapi/map/BaiduMap;->clear()V

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v4, v2, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/iOXO11i1;->XIi00iiXO(Ljava/util/List;)Lcom/baidu/mapapi/map/MapStatusUpdate;

    move-result-object v2

    invoke-virtual {p2, v2}, Lcom/baidu/mapapi/map/BaiduMap;->setMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;)V

    invoke-virtual {p2}, Lcom/baidu/mapapi/map/BaiduMap;->clear()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v4

    move v5, v3

    :goto_0
    if-ge v5, v4, :cond_1

    new-instance v6, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v7}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v7

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v9}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v9

    invoke-direct {v6, v7, v8, v9, v10}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    new-instance v4, Lcom/baidu/mapapi/map/PolylineOptions;

    invoke-direct {v4}, Lcom/baidu/mapapi/map/PolylineOptions;-><init>()V

    const/16 v5, 0x10

    invoke-virtual {v4, v5}, Lcom/baidu/mapapi/map/PolylineOptions;->width(I)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object v4

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v5

    invoke-static {v5, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v4, v1}, Lcom/baidu/mapapi/map/PolylineOptions;->color(I)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/baidu/mapapi/map/PolylineOptions;->points(Ljava/util/List;)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Lcom/baidu/mapapi/map/BaiduMap;->addOverlay(Lcom/baidu/mapapi/map/OverlayOptions;)Lcom/baidu/mapapi/map/Overlay;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    :goto_1
    if-ge v3, v0, :cond_5

    new-instance v1, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v4

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v6

    invoke-direct {v1, v4, v5, v6, v7}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    new-instance v2, Lcom/baidu/mapapi/map/TextOptions;

    invoke-direct {v2}, Lcom/baidu/mapapi/map/TextOptions;-><init>()V

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/baidu/mapapi/map/TextOptions;->text(Ljava/lang/String;)Lcom/baidu/mapapi/map/TextOptions;

    move-result-object v2

    const/high16 v4, -0x10000

    invoke-virtual {v2, v4}, Lcom/baidu/mapapi/map/TextOptions;->bgColor(I)Lcom/baidu/mapapi/map/TextOptions;

    move-result-object v2

    const/16 v4, 0x2c

    invoke-virtual {v2, v4}, Lcom/baidu/mapapi/map/TextOptions;->fontSize(I)Lcom/baidu/mapapi/map/TextOptions;

    move-result-object v2

    const/high16 v4, -0x1000000

    invoke-virtual {v2, v4}, Lcom/baidu/mapapi/map/TextOptions;->fontColor(I)Lcom/baidu/mapapi/map/TextOptions;

    move-result-object v2

    const/high16 v4, -0x3e100000    # -30.0f

    invoke-virtual {v2, v4}, Lcom/baidu/mapapi/map/TextOptions;->rotate(F)Lcom/baidu/mapapi/map/TextOptions;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/baidu/mapapi/map/TextOptions;->position(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/map/TextOptions;

    move-result-object v1

    const-string v2, "position(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Lcom/baidu/mapapi/map/BaiduMap;->addOverlay(Lcom/baidu/mapapi/map/OverlayOptions;)Lcom/baidu/mapapi/map/Overlay;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->getMMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object p2

    invoke-virtual {p2, v3}, Lcom/baidu/mapapi/map/TextureMapView;->showZoomControls(Z)V

    invoke-virtual {p2, v3}, Lcom/baidu/mapapi/map/TextureMapView;->showScaleControl(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->getMMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object p2

    invoke-virtual {p2}, Lcom/baidu/mapapi/map/TextureMapView;->getMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object p2

    invoke-virtual {p2, v3}, Lcom/baidu/mapapi/map/BaiduMap;->setCompassEnable(Z)V

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v4, v2, :cond_3

    goto/16 :goto_3

    :cond_3
    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/iOXO11i1;->XIi00iiXO(Ljava/util/List;)Lcom/baidu/mapapi/map/MapStatusUpdate;

    move-result-object v2

    invoke-virtual {p2, v2}, Lcom/baidu/mapapi/map/BaiduMap;->setMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;)V

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/iOXO11i1;->OXO1(Ljava/util/List;)Lcom/baidu/mapapi/model/LatLngBounds;

    move-result-object v2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->getMMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->getMMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v5

    invoke-static {v2, v4, v5}, Lcom/baidu/mapapi/map/MapStatusUpdateFactory;->newLatLngBounds(Lcom/baidu/mapapi/model/LatLngBounds;II)Lcom/baidu/mapapi/map/MapStatusUpdate;

    move-result-object v2

    invoke-virtual {p2, v2}, Lcom/baidu/mapapi/map/BaiduMap;->setMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;)V

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/e40;->XIi00iiXO(Ljava/util/List;)F

    move-result v2

    invoke-static {v2}, Lcom/baidu/mapapi/map/MapStatusUpdateFactory;->zoomTo(F)Lcom/baidu/mapapi/map/MapStatusUpdate;

    move-result-object v2

    invoke-virtual {p2, v2}, Lcom/baidu/mapapi/map/BaiduMap;->setMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/iI1iXIi;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/iI1iXIi;-><init>(Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;)V

    invoke-virtual {p2, v2}, Lcom/baidu/mapapi/map/BaiduMap;->setOnMapTouchListener(Lcom/baidu/mapapi/map/BaiduMap$OnMapTouchListener;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v4

    :goto_2
    if-ge v3, v4, :cond_4

    new-instance v5, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v6

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v8}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v8

    invoke-direct {v5, v6, v7, v8, v9}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_4
    new-instance v3, Lcom/baidu/mapapi/map/PolylineOptions;

    invoke-direct {v3}, Lcom/baidu/mapapi/map/PolylineOptions;-><init>()V

    const/16 v4, 0xc

    invoke-virtual {v3, v4}, Lcom/baidu/mapapi/map/PolylineOptions;->width(I)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object v3

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v4

    invoke-static {v4, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v3, v1}, Lcom/baidu/mapapi/map/PolylineOptions;->color(I)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/baidu/mapapi/map/PolylineOptions;->points(Ljava/util/List;)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Lcom/baidu/mapapi/map/BaiduMap;->addOverlay(Lcom/baidu/mapapi/map/OverlayOptions;)Lcom/baidu/mapapi/map/Overlay;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v0, Lcom/baidu/mapapi/model/LatLng;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    const v1, 0x7f081774

    invoke-direct {p0, p2, v0, v1}, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->setCustomerMakerIcon(Lcom/baidu/mapapi/map/BaiduMap;Lcom/baidu/mapapi/model/LatLng;I)V

    new-instance v0, Lcom/baidu/mapapi/model/LatLng;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    const p1, 0x7f081765

    invoke-direct {p0, p2, v0, p1}, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->setCustomerMakerIcon(Lcom/baidu/mapapi/map/BaiduMap;Lcom/baidu/mapapi/model/LatLng;I)V

    :cond_5
    :goto_3
    return-void
.end method
