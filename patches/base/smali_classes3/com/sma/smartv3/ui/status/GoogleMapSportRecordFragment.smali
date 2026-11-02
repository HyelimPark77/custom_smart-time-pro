.class public final Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;
.super Lcom/bestmafen/androidbase/base/BaseFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGoogleMapSportRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMapSportRecordFragment.kt\ncom/sma/smartv3/ui/status/GoogleMapSportRecordFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,156:1\n19#2:157\n15#2:158\n*S KotlinDebug\n*F\n+ 1 GoogleMapSportRecordFragment.kt\ncom/sma/smartv3/ui/status/GoogleMapSportRecordFragment\n*L\n33#1:157\n33#1:158\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGoogleMapSportRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleMapSportRecordFragment.kt\ncom/sma/smartv3/ui/status/GoogleMapSportRecordFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,156:1\n19#2:157\n15#2:158\n*S KotlinDebug\n*F\n+ 1 GoogleMapSportRecordFragment.kt\ncom/sma/smartv3/ui/status/GoogleMapSportRecordFragment\n*L\n33#1:157\n33#1:158\n*E\n"
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

.field private map:Lcom/google/android/gms/maps/GoogleMap;

.field private view:Landroidx/core/widget/NestedScrollView;


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/base/BaseFragment;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OiXOOiII1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/OiXOOiII1;-><init>(Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->mMapView$delegate:Lkotlin/Lazy;

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

    iput-object v2, v0, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;)Lcom/sma/smartv3/view/CustomGoogleMapView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->mMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;)Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMActivity(Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;)Landroid/app/Activity;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getView$p(Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;)Landroidx/core/widget/NestedScrollView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->view:Landroidx/core/widget/NestedScrollView;

    return-object p0
.end method

.method public static final synthetic access$setMap$p(Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    return-void
.end method

.method public static final synthetic access$showMapContent(Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->showMapContent(Ljava/util/ArrayList;)V

    return-void
.end method

.method private final getMMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->mMapView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/CustomGoogleMapView;

    return-object v0
.end method

.method private static final mMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;)Lcom/sma/smartv3/view/CustomGoogleMapView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0746

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/CustomGoogleMapView;

    return-object p0
.end method

.method private final setCustomerMakerIcon(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/model/LatLng;Landroid/graphics/Bitmap;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-static {p3}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromBitmap(Landroid/graphics/Bitmap;)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object p3

    invoke-virtual {v0, p3}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p3

    const/high16 v0, 0x41100000    # 9.0f

    invoke-virtual {p3, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->zIndex(F)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p2

    const-string p3, "position(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    return-void
.end method

.method private final setTextMakers(Lcom/google/android/gms/maps/GoogleMap;Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/maps/GoogleMap;",
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

    new-instance v3, Lcom/google/android/gms/maps/model/LatLng;

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

    invoke-direct {v3, v4, v5, v6, v7}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    add-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/android/mltcode/paycertificationapi/zo5;->XIi00iiXO(Ljava/lang/CharSequence;)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-direct {p0, p1, v3, v4}, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->setCustomerMakerIcon(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/model/LatLng;Landroid/graphics/Bitmap;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final showMapContent(Ljava/util/ArrayList;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v0, :cond_0

    const-string v0, "map"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/X0IO1OOi;->XIi00iiXO(Ljava/util/List;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/e40;->XIi00iiXO(Ljava/util/List;)F

    move-result v2

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float/2addr v2, v3

    invoke-static {v1, v2}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngZoom(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->moveCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    new-instance v1, Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/PolylineOptions;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const-string v3, "iterator(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "next(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lcom/sma/smartv3/model/CustomLatLng;

    new-instance v4, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v5

    invoke-virtual {v3}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v7

    invoke-direct {v4, v5, v6, v7, v8}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v1, v4}, Lcom/google/android/gms/maps/model/PolylineOptions;->add(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/PolylineOptions;

    goto :goto_0

    :cond_1
    const/high16 v2, 0x41400000    # 12.0f

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/PolylineOptions;->width(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f060414

    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/PolylineOptions;->color(I)Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->addPolyline(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/Polyline;

    new-instance v1, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v3

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    const v2, 0x7f081774

    invoke-static {v2}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    new-instance v1, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v3

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p1

    const v1, 0x7f081765

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->getMMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object p1

    new-instance v0, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/view/CustomGoogleMapView;->setOnMapTouchListener(Lcom/sma/smartv3/view/CustomGoogleMapView$OXO1;)V

    return-void
.end method


# virtual methods
.method public final getGoogleMap()Lcom/google/android/gms/maps/GoogleMap;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->map:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v0, :cond_0

    const-string v0, "map"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
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
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->getMMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/MapView;->onCreate(Landroid/os/Bundle;)V

    new-instance v1, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment$OXO1;-><init>(Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/MapView;->getMapAsync(Lcom/google/android/gms/maps/OnMapReadyCallback;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e72

    return v0
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->onDestroy()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->getMMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->onDestroy()V

    return-void
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->getMMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->getMMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->onResume()V

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->view:Landroidx/core/widget/NestedScrollView;

    return-void
.end method
