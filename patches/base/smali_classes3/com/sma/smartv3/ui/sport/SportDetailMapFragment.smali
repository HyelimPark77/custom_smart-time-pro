.class public Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;
.super Lcom/bestmafen/androidbase/base/BaseFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSportDetailMapFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailMapFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailMapFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1039:1\n19#2:1040\n15#2:1041\n1878#3,3:1042\n1878#3,3:1045\n1869#3,2:1048\n1869#3,2:1050\n1869#3,2:1052\n1563#3:1054\n1634#3,3:1055\n1869#3,2:1058\n1869#3,2:1060\n1869#3,2:1062\n*S KotlinDebug\n*F\n+ 1 SportDetailMapFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailMapFragment\n*L\n107#1:1040\n107#1:1041\n196#1:1042,3\n219#1:1045,3\n369#1:1048,2\n372#1:1050,2\n477#1:1052,2\n676#1:1054\n676#1:1055,3\n775#1:1058,2\n821#1:1060,2\n834#1:1062,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSportDetailMapFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailMapFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailMapFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1039:1\n19#2:1040\n15#2:1041\n1878#3,3:1042\n1878#3,3:1045\n1869#3,2:1048\n1869#3,2:1050\n1869#3,2:1052\n1563#3:1054\n1634#3,3:1055\n1869#3,2:1058\n1869#3,2:1060\n1869#3,2:1062\n*S KotlinDebug\n*F\n+ 1 SportDetailMapFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailMapFragment\n*L\n107#1:1040\n107#1:1041\n196#1:1042,3\n219#1:1045,3\n369#1:1048,2\n372#1:1050,2\n477#1:1052,2\n676#1:1054\n676#1:1055,3\n775#1:1058,2\n821#1:1060,2\n834#1:1062,2\n*E\n"
    }
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnDownloadGpx$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnMap3D$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnMapHot$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnMapMark$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnTrackPlay$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private endMarkerAnchorCenter:Z

.field private isGradient:Z

.field private final isInChinaMainland:Z

.field private isLocationEmpty:Z

.field private isShowLineMarker:Z

.field private isShowMap:Z

.field private final mBMapView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field protected mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

.field private mBaiDuMapLineWidth:I

.field private mBaiduDottedLine:Lcom/baidu/mapapi/map/Polyline;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mBaiduDottedPoints:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/baidu/mapapi/model/LatLng;",
            ">;"
        }
    .end annotation
.end field

.field private mBaiduHeatMap:Lcom/baidu/mapapi/map/HeatMap;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mBaiduLine:Lcom/baidu/mapapi/map/Polyline;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mBaiduLineEnd:Lcom/baidu/mapapi/map/Marker;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mBaiduLineStart:Lcom/baidu/mapapi/map/Marker;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mBaiduMarkers:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/baidu/mapapi/map/Marker;",
            ">;"
        }
    .end annotation
.end field

.field private final mBaiduPoints:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/baidu/mapapi/model/LatLng;",
            ">;"
        }
    .end annotation
.end field

.field private mColorList:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mCurrentIcon:I

.field private mFinalOriginalLocationList:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;"
        }
    .end annotation
.end field

.field private final mGMapView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mGoogleHeatMapOverlay:Lcom/google/android/gms/maps/model/TileOverlay;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mGoogleHeatMapProvider:Lcom/google/maps/android/heatmaps/HeatmapTileProvider;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mGoogleLine:Lcom/google/android/gms/maps/model/Polyline;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mGoogleLineColors:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/StyleSpan;",
            ">;"
        }
    .end annotation
.end field

.field private mGoogleLineEnd:Lcom/google/android/gms/maps/model/Marker;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mGoogleLineStart:Lcom/google/android/gms/maps/model/Marker;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field protected mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

.field private mGoogleMarkers:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/android/gms/maps/model/Marker;",
            ">;"
        }
    .end annotation
.end field

.field private final mGooglePoints:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation
.end field

.field private mInitialPoints:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/baidu/mapapi/model/LatLng;",
            ">;"
        }
    .end annotation
.end field

.field private final mLineColors:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final mLocationDao$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mMapLineColor:I

.field private mSmoothLocationList:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;"
        }
    .end annotation
.end field

.field private mStartIcon:I

.field private mTrackPlay:Lcom/sma/smartv3/ui/sport/TrackPlay;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public mWorkout:Lcom/sma/smartv3/db/entity/Workout;

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private speedRangeFast:I

.field private speedRangeSlow:I

.field private sportDetailV2Activity:Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final tvAvgBpmValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvCaloriesValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvDateTime$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvDistanceUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvDistanceValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvDuration$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final userProfile:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 34

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/base/BaseFragment;-><init>()V

    const-string v1, "SportDetailMapFragment"

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->TAG:Ljava/lang/String;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/uv4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/uv4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->rootView$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/dw4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/dw4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->tvDateTime$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ew4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/ew4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->tvDuration$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/fw4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/fw4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->tvAvgBpmValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/kv4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/kv4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->tvDistanceValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/lv4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/lv4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->tvDistanceUnit$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/mv4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/mv4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->tvCaloriesValue$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/nv4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/nv4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->btnMapHot$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ov4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/ov4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->btnMap3D$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/pv4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/pv4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->btnMapMark$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/yv4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/yv4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->btnDownloadGpx$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/zv4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/zv4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->btnTrackPlay$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/aw4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/aw4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGMapView$delegate:Lkotlin/Lazy;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleMarkers:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGooglePoints:Ljava/util/ArrayList;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/bw4;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/bw4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBMapView$delegate:Lkotlin/Lazy;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduMarkers:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduPoints:Ljava/util/ArrayList;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->endMarkerAnchorCenter:Z

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mLineColors:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleLineColors:Ljava/util/List;

    const/high16 v2, 0x40600000    # 3.5f

    invoke-static {v2}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v2

    iput v2, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiDuMapLineWidth:I

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduDottedPoints:Ljava/util/ArrayList;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    new-instance v4, Lcom/sma/smartv3/model/AppUser;

    const v32, 0x7ffffff

    const/16 v33, 0x0

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

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v4 .. v33}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    const-class v6, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3, v6}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    check-cast v4, Lcom/sma/smartv3/model/AppUser;

    iput-object v4, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    new-instance v3, Lcom/android/mltcode/paycertificationapi/cw4;

    invoke-direct {v3}, Lcom/android/mltcode/paycertificationapi/cw4;-><init>()V

    invoke-static {v3}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v3

    iput-object v3, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mLocationDao$delegate:Lkotlin/Lazy;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    const-string v3, "LOCATION_WHERE"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland:Z

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mSmoothLocationList:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mFinalOriginalLocationList:Ljava/util/ArrayList;

    const v2, 0x7f081376

    iput v2, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mStartIcon:I

    const v2, 0x7f081373

    iput v2, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mCurrentIcon:I

    iput-boolean v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isShowLineMarker:Z

    const v2, 0x7f060414

    iput v2, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mMapLineColor:I

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mColorList:Ljava/util/ArrayList;

    new-instance v2, Lcom/sma/smartv3/ui/sport/TrackPlay;

    new-instance v3, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$OXO1;

    invoke-direct {v3, v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$OXO1;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V

    invoke-direct {v2, v3}, Lcom/sma/smartv3/ui/sport/TrackPlay;-><init>(Lcom/sma/smartv3/ui/sport/TrackPlay$OXO1;)V

    iput-object v2, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mTrackPlay:Lcom/sma/smartv3/ui/sport/TrackPlay;

    iput-boolean v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isLocationEmpty:Z

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->tvAvgBpmValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/CheckBox;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->btnMapHot_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/CheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->share$lambda$1(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IO(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->tvDateTime_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Lcom/baidu/mapapi/map/TextureMapView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00()Lcom/sma/smartv3/db/dao/LocationDao;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mLocationDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->share$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->initView$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->initView$lambda$4(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->tvCaloriesValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->initView$lambda$2(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->tvDistanceValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/CheckBox;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->btnDownloadGpx_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/CheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->btnTrackPlay_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->initView$lambda$3(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->tvDuration_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Lcom/sma/smartv3/view/CustomGoogleMapView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/CheckBox;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->btnMapMark_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/CheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/view/MotionEvent;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->showBaiDuMap$lambda$2(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/view/MotionEvent;)V

    return-void
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->initView$lambda$1(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static final synthetic access$getBtnMapHot(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/CheckBox;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getBtnMapHot()Landroid/widget/CheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBtnMapMark(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/CheckBox;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getBtnMapMark()Landroid/widget/CheckBox;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMActivity(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/app/Activity;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method private final addBaiduDottedLine(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/baidu/mapapi/model/LatLng;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/baidu/mapapi/map/PolylineOptions;

    invoke-direct {v0}, Lcom/baidu/mapapi/map/PolylineOptions;-><init>()V

    iget v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiDuMapLineWidth:I

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/PolylineOptions;->width(I)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mMapLineColor:I

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/PolylineOptions;->color(I)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/PolylineOptions;->dottedLine(Z)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object v0

    sget-object v1, Lcom/baidu/mapapi/map/PolylineDottedLineType;->DOTTED_LINE_CIRCLE:Lcom/baidu/mapapi/map/PolylineDottedLineType;

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/PolylineOptions;->dottedLineType(Lcom/baidu/mapapi/map/PolylineDottedLineType;)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/PolylineOptions;->zIndex(I)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/baidu/mapapi/map/PolylineOptions;->points(Ljava/util/List;)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object p1

    const-string v0, "points(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/baidu/mapapi/map/BaiduMap;->addOverlay(Lcom/baidu/mapapi/map/OverlayOptions;)Lcom/baidu/mapapi/map/Overlay;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.baidu.mapapi.map.Polyline"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/baidu/mapapi/map/Polyline;

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduDottedLine:Lcom/baidu/mapapi/map/Polyline;

    return-void
.end method

.method private final addBaiduMarkView(Ljava/util/ArrayList;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduMarkers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zo5;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "requireContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f0d0f75

    invoke-direct {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/zo5;-><init>(Landroid/content/Context;I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-gez v1, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_0
    check-cast v2, Lcom/sma/smartv3/model/CustomLatLng;

    new-instance v1, Lcom/baidu/mapapi/map/MarkerOptions;

    invoke-direct {v1}, Lcom/baidu/mapapi/map/MarkerOptions;-><init>()V

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/android/mltcode/paycertificationapi/zo5;->XIi00iiXO(Ljava/lang/CharSequence;)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-static {v4}, Lcom/baidu/mapapi/map/BitmapDescriptorFactory;->fromBitmap(Landroid/graphics/Bitmap;)Lcom/baidu/mapapi/map/BitmapDescriptor;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/baidu/mapapi/map/MarkerOptions;->icon(Lcom/baidu/mapapi/map/BitmapDescriptor;)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object v1

    const/16 v4, 0x9

    invoke-virtual {v1, v4}, Lcom/baidu/mapapi/map/MarkerOptions;->zIndex(I)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object v1

    new-instance v4, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v5

    invoke-virtual {v2}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v7

    invoke-direct {v4, v5, v6, v7, v8}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-virtual {v1, v4}, Lcom/baidu/mapapi/map/MarkerOptions;->position(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/baidu/mapapi/map/BaiduMap;->addOverlay(Lcom/baidu/mapapi/map/OverlayOptions;)Lcom/baidu/mapapi/map/Overlay;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.baidu.mapapi.map.Marker"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/baidu/mapapi/map/Marker;

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduMarkers:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v1, v3

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final addGoogleMarkView(Ljava/util/ArrayList;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleMarkers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zo5;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "requireContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f0d0f75

    invoke-direct {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/zo5;-><init>(Landroid/content/Context;I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-gez v1, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_0
    check-cast v2, Lcom/sma/smartv3/model/CustomLatLng;

    new-instance v1, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/android/mltcode/paycertificationapi/zo5;->XIi00iiXO(Ljava/lang/CharSequence;)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromBitmap(Landroid/graphics/Bitmap;)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    const/high16 v4, 0x41100000    # 9.0f

    invoke-virtual {v1, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->zIndex(F)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    new-instance v4, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v5

    invoke-virtual {v2}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v7

    invoke-direct {v4, v5, v6, v7, v8}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v1, v4}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    const-string v2, "position(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGoogleMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleMarkers:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v1, v3

    goto :goto_0

    :cond_1
    return-void
.end method

.method private static final btnDownloadGpx_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/CheckBox;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0323

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/CheckBox;

    return-object p0
.end method

.method private static final btnMap3D_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/CheckBox;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01d4

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/CheckBox;

    return-object p0
.end method

.method private static final btnMapHot_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/CheckBox;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01d5

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/CheckBox;

    return-object p0
.end method

.method private static final btnMapMark_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/CheckBox;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01d6

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/CheckBox;

    return-object p0
.end method

.method private static final btnTrackPlay_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/Button;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01ec

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private final calculateModeSpeed()V
    .locals 6

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "calculateModeSpeed  mode = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v0

    const/16 v1, 0xc

    const/16 v2, 0xe10

    if-eq v0, v1, :cond_3

    const/16 v1, 0xd

    const/16 v3, 0xbb8

    if-eq v0, v1, :cond_2

    const/16 v1, 0x13

    const/16 v4, 0x2710

    if-eq v0, v1, :cond_1

    const/16 v1, 0x32

    const/16 v5, 0x1770

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/o65;->OXO1:Lcom/android/mltcode/paycertificationapi/o65;

    const/16 v1, 0x3a98

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/o65;->XIi00iiXO(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeSlow:I

    const/16 v1, 0x6978

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/o65;->XIi00iiXO(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeFast:I

    return-void

    :pswitch_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/o65;->OXO1:Lcom/android/mltcode/paycertificationapi/o65;

    invoke-virtual {v0, v2, v3}, Lcom/android/mltcode/paycertificationapi/o65;->XIi00iiXO(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeSlow:I

    invoke-virtual {v0, v2, v5}, Lcom/android/mltcode/paycertificationapi/o65;->XIi00iiXO(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeFast:I

    return-void

    :pswitch_2
    sget-object v0, Lcom/android/mltcode/paycertificationapi/o65;->OXO1:Lcom/android/mltcode/paycertificationapi/o65;

    const/16 v1, 0x1f40

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/o65;->XIi00iiXO(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeSlow:I

    invoke-virtual {v0, v2, v4}, Lcom/android/mltcode/paycertificationapi/o65;->XIi00iiXO(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeFast:I

    return-void

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/o65;->OXO1:Lcom/android/mltcode/paycertificationapi/o65;

    invoke-virtual {v0, v2, v3}, Lcom/android/mltcode/paycertificationapi/o65;->XIi00iiXO(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeSlow:I

    invoke-virtual {v0, v2, v5}, Lcom/android/mltcode/paycertificationapi/o65;->XIi00iiXO(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeFast:I

    return-void

    :cond_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/o65;->OXO1:Lcom/android/mltcode/paycertificationapi/o65;

    invoke-virtual {v0, v2, v4}, Lcom/android/mltcode/paycertificationapi/o65;->XIi00iiXO(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeSlow:I

    const/16 v1, 0x32c8

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/o65;->XIi00iiXO(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeFast:I

    return-void

    :cond_2
    sget-object v0, Lcom/android/mltcode/paycertificationapi/o65;->OXO1:Lcom/android/mltcode/paycertificationapi/o65;

    invoke-virtual {v0, v2, v3}, Lcom/android/mltcode/paycertificationapi/o65;->XIi00iiXO(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeSlow:I

    const/16 v1, 0x1388

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/o65;->XIi00iiXO(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeFast:I

    return-void

    :cond_3
    sget-object v0, Lcom/android/mltcode/paycertificationapi/o65;->OXO1:Lcom/android/mltcode/paycertificationapi/o65;

    const/16 v1, 0xfa0

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/o65;->XIi00iiXO(II)I

    move-result v1

    iput v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeSlow:I

    const/16 v1, 0x1b58

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/o65;->XIi00iiXO(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeFast:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final calculateSpeedColor(IIILcom/sma/smartv3/model/CustomLatLng;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeSlow:I

    if-nez v0, :cond_0

    iget v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeFast:I

    if-nez v0, :cond_0

    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedColorV1(III)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p3}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedColorV2(I)I

    move-result p1

    :goto_0
    invoke-virtual {p5, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const-string p3, "iterator(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    const-string p4, "next(...)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lcom/sma/smartv3/model/CustomLatLng;

    iget-object p4, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mLineColors:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p3, p1}, Lcom/sma/smartv3/model/CustomLatLng;->setColor(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p5}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method private final createBaiduIcon(ILcom/baidu/mapapi/model/LatLng;Z)Lcom/baidu/mapapi/map/Overlay;
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

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

    if-eqz p3, :cond_0

    iget-boolean p2, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->endMarkerAnchorCenter:Z

    if-eqz p2, :cond_0

    const/high16 p2, 0x3f000000    # 0.5f

    invoke-virtual {p1, p2, p2}, Lcom/baidu/mapapi/map/MarkerOptions;->anchor(FF)Lcom/baidu/mapapi/map/MarkerOptions;

    :cond_0
    invoke-virtual {v0, p1}, Lcom/baidu/mapapi/map/BaiduMap;->addOverlay(Lcom/baidu/mapapi/map/OverlayOptions;)Lcom/baidu/mapapi/map/Overlay;

    move-result-object p1

    const-string p2, "addOverlay(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public static synthetic createBaiduIcon$default(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;ILcom/baidu/mapapi/model/LatLng;ZILjava/lang/Object;)Lcom/baidu/mapapi/map/Overlay;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->createBaiduIcon(ILcom/baidu/mapapi/model/LatLng;Z)Lcom/baidu/mapapi/map/Overlay;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: createBaiduIcon"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final getBtnDownloadGpx()Landroid/widget/CheckBox;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->btnDownloadGpx$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    return-object v0
.end method

.method private final getBtnMap3D()Landroid/widget/CheckBox;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->btnMap3D$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    return-object v0
.end method

.method private final getBtnMapHot()Landroid/widget/CheckBox;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->btnMapHot$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    return-object v0
.end method

.method private final getBtnMapMark()Landroid/widget/CheckBox;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->btnMapMark$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    return-object v0
.end method

.method private final getGradientLineColors(Ljava/util/ArrayList;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    new-instance v7, Lcom/sma/smartv3/model/CustomLatLng;

    const/4 v1, 0x0

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v8

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v10

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v12

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/CustomLatLng;->getAltitude()I

    move-result v14

    const/16 v16, 0x10

    const/16 v17, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v7 .. v17}, Lcom/sma/smartv3/model/CustomLatLng;-><init>(DDJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v7}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v4

    const/16 v8, 0x3e8

    if-le v4, v8, :cond_0

    const/16 v4, 0x12c

    :goto_0
    move v9, v4

    goto :goto_1

    :cond_0
    const/16 v4, 0x14

    goto :goto_0

    :goto_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v10

    move v12, v1

    move-wide v3, v2

    const/4 v13, 0x0

    move v2, v12

    :goto_2
    if-ge v12, v10, :cond_7

    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    const-string v15, "get(...)"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v14, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v14}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v15

    invoke-virtual {v7}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v17

    cmpg-double v15, v15, v17

    if-nez v15, :cond_1

    invoke-virtual {v14}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v15

    invoke-virtual {v7}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v17

    cmpg-double v15, v15, v17

    if-nez v15, :cond_1

    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v17, v5

    move v8, v9

    move v9, v12

    goto/16 :goto_7

    :cond_1
    new-instance v15, Lcom/baidu/mapapi/model/LatLng;

    move/from16 v17, v12

    invoke-virtual {v7}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v11

    move/from16 v19, v9

    invoke-virtual {v7}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v8

    invoke-direct {v15, v11, v12, v8, v9}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    new-instance v8, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v14}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v11

    move-wide/from16 v20, v3

    invoke-virtual {v14}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v3

    invoke-direct {v8, v11, v12, v3, v4}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-static {v15, v8}, Lcom/baidu/mapapi/utils/DistanceUtil;->getDistance(Lcom/baidu/mapapi/model/LatLng;Lcom/baidu/mapapi/model/LatLng;)D

    move-result-wide v3

    const/16 v8, 0x64

    int-to-double v8, v8

    mul-double/2addr v3, v8

    invoke-static {v3, v4}, Lcom/android/mltcode/paycertificationapi/mc0;->iIi1(D)I

    move-result v3

    int-to-float v3, v3

    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v3, v4

    add-float/2addr v13, v3

    move/from16 v8, v19

    int-to-float v3, v8

    cmpl-float v3, v13, v3

    if-gez v3, :cond_3

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    move/from16 v9, v17

    if-ne v9, v3, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v17, v5

    move-object v4, v14

    goto/16 :goto_6

    :cond_3
    move/from16 v9, v17

    :goto_3
    invoke-virtual {v14}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v3

    sub-long v3, v3, v20

    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    move-result-wide v3

    move-wide/from16 v17, v3

    const/16 v11, 0x3e8

    int-to-long v3, v11

    div-long v3, v17, v3

    sget-object v12, Lcom/android/mltcode/paycertificationapi/o65;->OXO1:Lcom/android/mltcode/paycertificationapi/o65;

    long-to-int v15, v3

    float-to-int v11, v13

    invoke-virtual {v12, v15, v11}, Lcom/android/mltcode/paycertificationapi/o65;->XIi00iiXO(II)I

    move-result v11

    iget v12, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeFast:I

    iget v15, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeSlow:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v17, v5

    const-string v5, "getGradientLineColors distance = "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v5, "  intervalTime = "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, "  secondSpeed = "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "  speedRangeFast = "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "  , speedRangeSlow = "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    if-lt v11, v2, :cond_4

    if-nez v2, :cond_5

    :cond_4
    move v2, v11

    :cond_5
    if-le v11, v1, :cond_6

    move v1, v11

    move v3, v1

    :goto_4
    move-object/from16 v0, p0

    move-object v4, v14

    move-object/from16 v5, v17

    goto :goto_5

    :cond_6
    move v3, v11

    goto :goto_4

    :goto_5
    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->calculateSpeedColor(IIILcom/sma/smartv3/model/CustomLatLng;Ljava/util/ArrayList;)V

    move-object/from16 v17, v5

    invoke-virtual {v4}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v11

    move-wide/from16 v20, v11

    const/4 v13, 0x0

    :goto_6
    invoke-virtual {v4}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v11

    invoke-virtual {v7, v11, v12}, Lcom/sma/smartv3/model/CustomLatLng;->setLatitude(D)V

    invoke-virtual {v4}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v11

    invoke-virtual {v7, v11, v12}, Lcom/sma/smartv3/model/CustomLatLng;->setLongitude(D)V

    invoke-virtual {v4}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v11

    invoke-virtual {v7, v11, v12}, Lcom/sma/smartv3/model/CustomLatLng;->setTime(J)V

    invoke-virtual {v4}, Lcom/sma/smartv3/model/CustomLatLng;->getAltitude()I

    move-result v3

    invoke-virtual {v7, v3}, Lcom/sma/smartv3/model/CustomLatLng;->setAltitude(I)V

    move-wide/from16 v3, v20

    :goto_7
    add-int/lit8 v12, v9, 0x1

    move v9, v8

    move-object/from16 v5, v17

    const/16 v8, 0x3e8

    goto/16 :goto_2

    :cond_7
    move-object/from16 v17, v5

    iget-boolean v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isGradient:Z

    if-eqz v1, :cond_8

    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mLineColors:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_8

    invoke-interface/range {v17 .. v17}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/CustomLatLng;

    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mLineColors:Ljava/util/ArrayList;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f060710

    invoke-static {v3, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_8
    return-void
.end method

.method private final getIntiLocationList()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->sportDetailV2Activity:Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getMSportViewModel()Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mSmoothLocationList:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;->getIntiLocationList(Ljava/util/ArrayList;I)V

    :cond_0
    return-void
.end method

.method private final getMLocationDao()Lcom/sma/smartv3/db/dao/LocationDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mLocationDao$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/dao/LocationDao;

    return-object v0
.end method

.method private final getMarkersData()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->sportDetailV2Activity:Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getMSportViewModel()Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mSmoothLocationList:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;->getMarkList(Ljava/util/ArrayList;I)V

    :cond_0
    return-void
.end method

.method private final getSportDetailActivity()V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    instance-of v0, v0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.sma.smartv3.ui.sport.SportDetailV2Activity"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->sportDetailV2Activity:Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;

    :cond_0
    return-void
.end method

.method private final getTvAvgBpmValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->tvAvgBpmValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvCaloriesValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->tvCaloriesValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvDistanceUnit()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->tvDistanceUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvDistanceValue()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->tvDistanceValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvDuration()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->tvDuration$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->tvDistanceUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/CheckBox;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->btnMap3D_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/CheckBox;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->downloadGpx()V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/widget/CompoundButton;Z)V
    .locals 1

    const-string v0, "buttonView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->showHot(Z)V

    if-eqz p2, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->removeLine()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->addLine()V

    return-void
.end method

.method private static final initView$lambda$2(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/widget/CompoundButton;Z)V
    .locals 1

    const-string v0, "buttonView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->show3d(Z)V

    return-void
.end method

.method private static final initView$lambda$3(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/widget/CompoundButton;Z)V
    .locals 1

    const-string v0, "buttonView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->showMark(Z)V

    return-void
.end method

.method private static final initView$lambda$4(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isMapInitialized()Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->TAG:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " isMapInitialized false"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->playTrack()V

    return-void
.end method

.method private static final mBMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Lcom/baidu/mapapi/map/TextureMapView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a00fc

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/baidu/mapapi/map/TextureMapView;

    return-object p0
.end method

.method private static final mGMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Lcom/sma/smartv3/view/CustomGoogleMapView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a03fb

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/CustomGoogleMapView;

    return-object p0
.end method

.method private static final mLocationDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/LocationDao;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->locationDao()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object v0

    return-object v0
.end method

.method private final onConvertLocation(Ljava/util/List;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Location;",
            ">;Z)V"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/model/LocationData;->INSTANCE:Lcom/sma/smartv3/model/LocationData;

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland:Z

    invoke-virtual {v0, p1, v1, p2}, Lcom/sma/smartv3/model/LocationData;->getFinalLocationList(Ljava/util/List;ZZ)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mFinalOriginalLocationList:Ljava/util/ArrayList;

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->OX0()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mFinalOriginalLocationList:Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sma/smartv3/model/CustomLatLng;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduDottedPoints:Ljava/util/ArrayList;

    new-instance v1, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v2

    invoke-virtual {p2}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mSmoothLocationList:Ljava/util/ArrayList;

    sget-object p2, Lcom/sma/smartv3/model/LocationData;->INSTANCE:Lcom/sma/smartv3/model/LocationData;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mFinalOriginalLocationList:Ljava/util/ArrayList;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v1

    invoke-virtual {p2, v0, v1}, Lcom/sma/smartv3/model/LocationData;->getSmoothLocationListAlgorithm(Ljava/util/ArrayList;I)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getIntiLocationList()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mSmoothLocationList:Ljava/util/ArrayList;

    iget-boolean p2, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland:Z

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->showMapContent(Ljava/util/ArrayList;Z)V

    return-void
.end method

.method public static synthetic onConvertLocation$default(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Ljava/util/List;ZILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->onConvertLocation(Ljava/util/List;Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: onConvertLocation"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final removeLine()V
    .locals 2

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduLineStart:Lcom/baidu/mapapi/map/Marker;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Overlay;->remove()V

    :cond_0
    iput-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduLineStart:Lcom/baidu/mapapi/map/Marker;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduLine:Lcom/baidu/mapapi/map/Polyline;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Overlay;->remove()V

    :cond_1
    iput-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduLine:Lcom/baidu/mapapi/map/Polyline;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduLineEnd:Lcom/baidu/mapapi/map/Marker;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Overlay;->remove()V

    :cond_2
    iput-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduLineEnd:Lcom/baidu/mapapi/map/Marker;

    return-void

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleLineStart:Lcom/google/android/gms/maps/model/Marker;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/Marker;->remove()V

    :cond_4
    iput-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleLineStart:Lcom/google/android/gms/maps/model/Marker;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleLine:Lcom/google/android/gms/maps/model/Polyline;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/Polyline;->remove()V

    :cond_5
    iput-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleLine:Lcom/google/android/gms/maps/model/Polyline;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleLineEnd:Lcom/google/android/gms/maps/model/Marker;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/Marker;->remove()V

    :cond_6
    iput-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleLineEnd:Lcom/google/android/gms/maps/model/Marker;

    return-void
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/RelativeLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final share$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->shareMapBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method private static final share$lambda$1(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->shareMapBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method private final show3d(Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "show3d "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland:Z

    if-nez v0, :cond_0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "This feature cannot be used if Google services are not supported."

    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland:Z

    const/4 v0, 0x2

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/baidu/mapapi/map/BaiduMap;->setMapType(I)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGoogleMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/GoogleMap;->setMapType(I)V

    return-void

    :cond_2
    iget-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland:Z

    const/4 v0, 0x1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/baidu/mapapi/map/BaiduMap;->setMapType(I)V

    return-void

    :cond_3
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGoogleMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/GoogleMap;->setMapType(I)V

    return-void
.end method

.method private final showBaiDuMap(Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/TextureMapView;->showZoomControls(Z)V

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/TextureMapView;->showScaleControl(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextureMapView;->getMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/BaiduMap;->setCompassEnable(Z)V

    const-string v1, "apply(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->setMBaiDuMap(Lcom/baidu/mapapi/map/BaiduMap;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/jv4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/jv4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/BaiduMap;->setOnMapTouchListener(Lcom/baidu/mapapi/map/BaiduMap$OnMapTouchListener;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mapStatusBaiDuCenterPoint(Ljava/util/ArrayList;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/iOXO11i1;->OXO1(Ljava/util/List;)Lcom/baidu/mapapi/model/LatLngBounds;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-static {v1, v2, v3}, Lcom/baidu/mapapi/map/MapStatusUpdateFactory;->newLatLngBounds(Lcom/baidu/mapapi/model/LatLngBounds;II)Lcom/baidu/mapapi/map/MapStatusUpdate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/BaiduMap;->setMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/e40;->XIi00iiXO(Ljava/util/List;)F

    move-result p1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr p1, v1

    invoke-static {p1}, Lcom/baidu/mapapi/map/MapStatusUpdateFactory;->zoomTo(F)Lcom/baidu/mapapi/map/MapStatusUpdate;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/baidu/mapapi/map/BaiduMap;->setMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->addLine()V

    return-void
.end method

.method private static final showBaiDuMap$lambda$2(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/view/MotionEvent;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getRootView()Landroid/widget/RelativeLayout;

    move-result-object p0

    if-eqz p0, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getRootView()Landroid/widget/RelativeLayout;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    :cond_1
    return-void
.end method

.method private final showGoogleMap(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/MapView;->onCreate(Landroid/os/Bundle;)V

    new-instance v1, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$XIi00iiXO;

    invoke-direct {v1, p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/MapView;->getMapAsync(Lcom/google/android/gms/maps/OnMapReadyCallback;)V

    return-void
.end method

.method private final showHot(Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showHot "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland:Z

    const/16 v0, 0x32

    if-eqz p1, :cond_0

    :try_start_0
    new-instance p1, Lcom/baidu/mapapi/map/HeatMap$Builder;

    invoke-direct {p1}, Lcom/baidu/mapapi/map/HeatMap$Builder;-><init>()V

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduPoints:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Lcom/baidu/mapapi/map/HeatMap$Builder;->data(Ljava/util/Collection;)Lcom/baidu/mapapi/map/HeatMap$Builder;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/baidu/mapapi/map/HeatMap$Builder;->radius(I)Lcom/baidu/mapapi/map/HeatMap$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/HeatMap$Builder;->build()Lcom/baidu/mapapi/map/HeatMap;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduHeatMap:Lcom/baidu/mapapi/map/HeatMap;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduHeatMap:Lcom/baidu/mapapi/map/HeatMap;

    invoke-virtual {p1, v0}, Lcom/baidu/mapapi/map/BaiduMap;->addHeatMap(Lcom/baidu/mapapi/map/HeatMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void

    :cond_0
    new-instance p1, Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;

    invoke-direct {p1}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;-><init>()V

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGooglePoints:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;->data(Ljava/util/Collection;)Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;->radius(I)Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/maps/android/heatmaps/HeatmapTileProvider$Builder;->build()Lcom/google/maps/android/heatmaps/HeatmapTileProvider;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleHeatMapProvider:Lcom/google/maps/android/heatmaps/HeatmapTileProvider;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGoogleMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/maps/model/TileOverlayOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/TileOverlayOptions;-><init>()V

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleHeatMapProvider:Lcom/google/maps/android/heatmaps/HeatmapTileProvider;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/TileOverlayOptions;->tileProvider(Lcom/google/android/gms/maps/model/TileProvider;)Lcom/google/android/gms/maps/model/TileOverlayOptions;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/GoogleMap;->addTileOverlay(Lcom/google/android/gms/maps/model/TileOverlayOptions;)Lcom/google/android/gms/maps/model/TileOverlay;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleHeatMapOverlay:Lcom/google/android/gms/maps/model/TileOverlay;

    return-void

    :cond_1
    iget-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduHeatMap:Lcom/baidu/mapapi/map/HeatMap;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/HeatMap;->removeHeatMap()V

    :cond_2
    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduHeatMap:Lcom/baidu/mapapi/map/HeatMap;

    return-void

    :cond_3
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleHeatMapOverlay:Lcom/google/android/gms/maps/model/TileOverlay;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/TileOverlay;->remove()V

    :cond_4
    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleHeatMapProvider:Lcom/google/maps/android/heatmaps/HeatmapTileProvider;

    return-void
.end method

.method private final showLocation()V
    .locals 5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMLocationDao()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v3

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/sma/smartv3/db/dao/LocationDao;->getLocation(JJ)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    iput-boolean v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isLocationEmpty:Z

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->showMapLocation(Ljava/util/List;)V

    return-void
.end method

.method private final showMapContent(Ljava/util/ArrayList;Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;Z)V"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isShowMap:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showMapContent isInChinaMainland="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showMapContent locationList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isGradient:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->calculateModeSpeed()V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getGradientLineColors(Ljava/util/ArrayList;)V

    :cond_0
    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/CustomLatLng;

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduPoints:Ljava/util/ArrayList;

    new-instance v2, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v3

    invoke-virtual {v0}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->showBaiDuMap(Ljava/util/ArrayList;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->OX0()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduDottedPoints:Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->addBaiduDottedLine(Ljava/util/ArrayList;)V

    :cond_2
    return-void

    :cond_3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/CustomLatLng;

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGooglePoints:Ljava/util/ArrayList;

    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v3

    invoke-virtual {v0}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->showGoogleMap(Ljava/util/ArrayList;)V

    return-void
.end method

.method private final showMark(Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showMark "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland:Z

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMarkersData()V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMarkersData()V

    return-void

    :cond_1
    iget-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduMarkers:Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/Marker;

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/Overlay;->remove()V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleMarkers:Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/Marker;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/Marker;->remove()V

    goto :goto_1

    :cond_3
    return-void
.end method

.method private final speedColorV1(III)I
    .locals 1

    sub-int/2addr p1, p2

    div-int/lit8 p1, p1, 0xa

    mul-int/lit8 v0, p1, 0x5

    add-int/2addr v0, p2

    if-le p3, v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p1

    const p2, 0x7f060710

    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    return p1

    :cond_0
    mul-int/lit8 p1, p1, 0x2

    add-int/2addr p2, p1

    if-le p3, p2, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p1

    const p2, 0x7f06070e

    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    return p1

    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p1

    const p2, 0x7f06070f

    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    return p1
.end method

.method private final speedColorV2(I)I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeSlow:I

    if-le p1, v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f060710

    invoke-static {p1, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    return p1

    :cond_0
    iget v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeFast:I

    if-ge p1, v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f06070f

    invoke-static {p1, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    return p1

    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p1

    const v0, 0x7f06070e

    invoke-static {p1, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    return p1
.end method

.method private static final tvAvgBpmValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c38

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvCaloriesValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c4c

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvDateTime_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c64

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvDistanceUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c6f

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvDistanceValue_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c70

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvDuration_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c72

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final addBaiduLine(Ljava/util/ArrayList;)V
    .locals 8
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/baidu/mapapi/model/LatLng;",
            ">;)V"
        }
    .end annotation

    const-string v0, "points"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isShowLineMarker:Z

    const-string v1, "null cannot be cast to non-null type com.baidu.mapapi.map.Marker"

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduLineStart:Lcom/baidu/mapapi/map/Marker;

    if-nez v0, :cond_0

    iget v3, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mStartIcon:I

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/baidu/mapapi/model/LatLng;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->createBaiduIcon$default(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;ILcom/baidu/mapapi/model/LatLng;ZILjava/lang/Object;)Lcom/baidu/mapapi/map/Overlay;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/baidu/mapapi/map/Marker;

    iput-object v0, v2, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduLineStart:Lcom/baidu/mapapi/map/Marker;

    goto :goto_0

    :cond_0
    move-object v2, p0

    if-eqz v0, :cond_2

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v0, v3}, Lcom/baidu/mapapi/map/Marker;->setPosition(Lcom/baidu/mapapi/model/LatLng;)V

    goto :goto_0

    :cond_1
    move-object v2, p0

    :cond_2
    :goto_0
    iget-object v0, v2, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduLine:Lcom/baidu/mapapi/map/Polyline;

    if-nez v0, :cond_4

    iput-object p1, v2, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mInitialPoints:Ljava/util/ArrayList;

    new-instance v0, Lcom/baidu/mapapi/map/PolylineOptions;

    invoke-direct {v0}, Lcom/baidu/mapapi/map/PolylineOptions;-><init>()V

    iget v3, v2, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiDuMapLineWidth:I

    invoke-virtual {v0, v3}, Lcom/baidu/mapapi/map/PolylineOptions;->width(I)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v3

    iget v4, v2, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mMapLineColor:I

    invoke-static {v3, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/baidu/mapapi/map/PolylineOptions;->color(I)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object v0

    iget-boolean v3, v2, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isGradient:Z

    invoke-virtual {v0, v3}, Lcom/baidu/mapapi/map/PolylineOptions;->isGradient(Z)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object v0

    iget-boolean v3, v2, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isGradient:Z

    if-eqz v3, :cond_3

    iget-object v3, v2, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mLineColors:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Lcom/baidu/mapapi/map/PolylineOptions;->colorsValues(Ljava/util/List;)Lcom/baidu/mapapi/map/PolylineOptions;

    :cond_3
    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Lcom/baidu/mapapi/map/PolylineOptions;->zIndex(I)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/baidu/mapapi/map/PolylineOptions;->points(Ljava/util/List;)Lcom/baidu/mapapi/map/PolylineOptions;

    move-result-object v0

    const-string v3, "points(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/baidu/mapapi/map/BaiduMap;->addOverlay(Lcom/baidu/mapapi/map/OverlayOptions;)Lcom/baidu/mapapi/map/Overlay;

    move-result-object v0

    const-string v3, "null cannot be cast to non-null type com.baidu.mapapi.map.Polyline"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/baidu/mapapi/map/Polyline;

    iput-object v0, v2, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduLine:Lcom/baidu/mapapi/map/Polyline;

    goto :goto_1

    :cond_4
    iget-boolean v0, v2, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isGradient:Z

    if-eqz v0, :cond_5

    iget-object v0, v2, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mColorList:Ljava/util/ArrayList;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->O011OOIO0(Ljava/util/Collection;)[I

    move-result-object v0

    iget-object v3, v2, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduLine:Lcom/baidu/mapapi/map/Polyline;

    if-eqz v3, :cond_5

    invoke-virtual {v3, v0}, Lcom/baidu/mapapi/map/Polyline;->setColorList([I)V

    :cond_5
    iget-object v0, v2, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduLine:Lcom/baidu/mapapi/map/Polyline;

    if-eqz v0, :cond_6

    invoke-virtual {v0, p1}, Lcom/baidu/mapapi/map/Polyline;->setPoints(Ljava/util/List;)V

    :cond_6
    :goto_1
    iget-boolean v0, v2, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isShowLineMarker:Z

    if-eqz v0, :cond_8

    iget-object v0, v2, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduLineEnd:Lcom/baidu/mapapi/map/Marker;

    if-nez v0, :cond_7

    iget v0, v2, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mCurrentIcon:I

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/baidu/mapapi/model/LatLng;

    const/4 v3, 0x1

    invoke-direct {p0, v0, p1, v3}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->createBaiduIcon(ILcom/baidu/mapapi/model/LatLng;Z)Lcom/baidu/mapapi/map/Overlay;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/baidu/mapapi/map/Marker;

    iput-object p1, v2, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduLineEnd:Lcom/baidu/mapapi/map/Marker;

    return-void

    :cond_7
    if-eqz v0, :cond_8

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v0, p1}, Lcom/baidu/mapapi/map/Marker;->setPosition(Lcom/baidu/mapapi/model/LatLng;)V

    :cond_8
    return-void
.end method

.method public final addGoogleLine(Ljava/util/ArrayList;)V
    .locals 6
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)V"
        }
    .end annotation

    const-string v0, "points"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGoogleMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleLineStart:Lcom/google/android/gms/maps/model/Marker;

    if-nez v1, :cond_0

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isShowLineMarker:Z

    if-eqz v2, :cond_0

    new-instance v1, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    iget v2, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mStartIcon:I

    invoke-static {v2}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleLineStart:Lcom/google/android/gms/maps/model/Marker;

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/Marker;->setPosition(Lcom/google/android/gms/maps/model/LatLng;)V

    :cond_1
    :goto_0
    iget-boolean v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isGradient:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleLineColors:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mLineColors:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mLineColors:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleLineColors:Ljava/util/List;

    new-instance v5, Lcom/google/android/gms/maps/model/StyleSpan;

    invoke-direct {v5, v3}, Lcom/google/android/gms/maps/model/StyleSpan;-><init>(I)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleLine:Lcom/google/android/gms/maps/model/Polyline;

    if-nez v1, :cond_4

    new-instance v1, Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/PolylineOptions;-><init>()V

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/model/PolylineOptions;->addAll(Ljava/lang/Iterable;)Lcom/google/android/gms/maps/model/PolylineOptions;

    iget v2, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiDuMapLineWidth:I

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/PolylineOptions;->width(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isGradient:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleLineColors:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/PolylineOptions;->addAllSpans(Ljava/lang/Iterable;)Lcom/google/android/gms/maps/model/PolylineOptions;

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v2

    iget v3, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mMapLineColor:I

    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/PolylineOptions;->color(I)Lcom/google/android/gms/maps/model/PolylineOptions;

    :goto_2
    sget-object v2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->addPolyline(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/Polyline;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleLine:Lcom/google/android/gms/maps/model/Polyline;

    goto :goto_3

    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/model/Polyline;->setPoints(Ljava/util/List;)V

    :cond_5
    :goto_3
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleLineEnd:Lcom/google/android/gms/maps/model/Marker;

    if-nez v1, :cond_7

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isShowLineMarker:Z

    if-eqz v2, :cond_7

    new-instance v1, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p1

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->endMarkerAnchorCenter:Z

    if-eqz v1, :cond_6

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {p1, v1, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->anchor(FF)Lcom/google/android/gms/maps/model/MarkerOptions;

    :cond_6
    sget-object v1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    iget v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mCurrentIcon:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleLineEnd:Lcom/google/android/gms/maps/model/Marker;

    return-void

    :cond_7
    if-eqz v1, :cond_8

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/model/Marker;->setPosition(Lcom/google/android/gms/maps/model/LatLng;)V

    :cond_8
    return-void
.end method

.method public final addLine()V
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduPoints:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->addBaiduLine(Ljava/util/ArrayList;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGooglePoints:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->addGoogleLine(Ljava/util/ArrayList;)V

    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->initializedMapFinish()V

    return-void
.end method

.method public final downloadGpx()V
    .locals 11

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMLocationDao()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v3

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/sma/smartv3/db/dao/LocationDao;->getLocation(JJ)Ljava/util/List;

    move-result-object v6

    sget-object v0, Lcom/sma/smartv3/model/LocationData;->INSTANCE:Lcom/sma/smartv3/model/LocationData;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, v0

    invoke-static/range {v5 .. v10}, Lcom/sma/smartv3/model/LocationData;->getFinalLocationList$default(Lcom/sma/smartv3/model/LocationData;Ljava/util/List;ZZILjava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_0

    sget-object v6, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v6}, Lcom/android/mltcode/paycertificationapi/uz0;->O1O(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v7

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v2

    iget-object v4, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getNickname()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v8

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v8

    invoke-virtual {v5, v8}, Lcom/android/mltcode/paycertificationapi/q62;->i01OOiI(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/model/LocationData;->getGpxFileString(Ljava/util/ArrayList;JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromString(Ljava/io/File;Ljava/lang/String;)Z

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "android.intent.extra.TEXT"

    const v2, 0x7f141230

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {v6}, Lcom/android/mltcode/paycertificationapi/uz0;->O1O(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v6, v1}, Lcom/android/mltcode/paycertificationapi/sz0;->XO0O10(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    const-string v3, "android.intent.extra.STREAM"

    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string v1, "application/gpx"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_0
    const v0, 0x7f140ffb

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
.end method

.method public final getBtnTrackPlay()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->btnTrackPlay$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method public final getEndMarkerAnchorCenter()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->endMarkerAnchorCenter:Z

    return v0
.end method

.method public final getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBMapView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/TextureMapView;

    return-object v0
.end method

.method public final getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mBaiDuMap"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMBaiDuMapLineWidth()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiDuMapLineWidth:I

    return v0
.end method

.method public final getMBaiduLineEnd()Lcom/baidu/mapapi/map/Marker;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduLineEnd:Lcom/baidu/mapapi/map/Marker;

    return-object v0
.end method

.method public final getMBaiduLineStart()Lcom/baidu/mapapi/map/Marker;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduLineStart:Lcom/baidu/mapapi/map/Marker;

    return-object v0
.end method

.method public final getMColorList()Ljava/util/ArrayList;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mColorList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getMCurrentIcon()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mCurrentIcon:I

    return v0
.end method

.method public final getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGMapView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/CustomGoogleMapView;

    return-object v0
.end method

.method public final getMGoogleLineColors()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/maps/model/StyleSpan;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleLineColors:Ljava/util/List;

    return-object v0
.end method

.method public final getMGoogleMap()Lcom/google/android/gms/maps/GoogleMap;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mGoogleMap"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMInitialPoints()Ljava/util/ArrayList;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/baidu/mapapi/model/LatLng;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mInitialPoints:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getMLineColors()Ljava/util/ArrayList;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mLineColors:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getMMapLineColor()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mMapLineColor:I

    return v0
.end method

.method public final getMSmoothLocationList()Ljava/util/ArrayList;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mSmoothLocationList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getMStartIcon()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mStartIcon:I

    return v0
.end method

.method public getMTrackPlay()Lcom/sma/smartv3/ui/sport/TrackPlay;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mTrackPlay:Lcom/sma/smartv3/ui/sport/TrackPlay;

    return-object v0
.end method

.method public final getMWorkout()Lcom/sma/smartv3/db/entity/Workout;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mWorkout"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getRootView()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method public final getSpeedRangeFast()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeFast:I

    return v0
.end method

.method public final getSpeedRangeSlow()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeSlow:I

    return v0
.end method

.method public final getTvDateTime()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->tvDateTime$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method public final getUserProfile()Lcom/sma/smartv3/model/AppUser;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

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

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg3()Ljava/io/Serializable;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Workout"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->setMWorkout(Lcom/sma/smartv3/db/entity/Workout;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getSportDetailActivity()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getTvDateTime()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {v1, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->i0X000X0O(ZZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v2

    new-instance v4, Ljava/util/Date;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v5

    invoke-direct {v4, v5, v6}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getTvDuration()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result v2

    mul-int/lit16 v2, v2, 0x3e8

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iXiX011(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getTvAvgBpmValue()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMAvgBpm()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getTvDistanceValue()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v2

    iget-object v4, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v4

    const/4 v5, 0x4

    invoke-static {v2, v4, v1, v5, v3}, Lcom/android/mltcode/paycertificationapi/cp5;->X1ii(IIZILjava/lang/Object;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getTvDistanceUnit()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v1

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getTvCaloriesValue()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMCalorie()I

    move-result v1

    div-int/lit16 v1, v1, 0x3e8

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->showLocation()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getBtnDownloadGpx()Landroid/widget/CheckBox;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/sv4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/sv4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getBtnMapHot()Landroid/widget/CheckBox;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/tv4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/tv4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getBtnMap3D()Landroid/widget/CheckBox;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/vv4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/vv4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getBtnMapMark()Landroid/widget/CheckBox;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/wv4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/wv4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMTrackPlay()Lcom/sma/smartv3/ui/sport/TrackPlay;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mSmoothLocationList:Ljava/util/ArrayList;

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland:Z

    if-eqz v2, :cond_0

    sget-object v2, Lcom/sma/smartv3/ui/sport/TrackPlay$SourceType;->BAIDU:Lcom/sma/smartv3/ui/sport/TrackPlay$SourceType;

    goto :goto_0

    :cond_0
    sget-object v2, Lcom/sma/smartv3/ui/sport/TrackPlay$SourceType;->GOOGLE:Lcom/sma/smartv3/ui/sport/TrackPlay$SourceType;

    :goto_0
    invoke-virtual {v0, v1, v2}, Lcom/sma/smartv3/ui/sport/TrackPlay;->OII(Ljava/util/ArrayList;Lcom/sma/smartv3/ui/sport/TrackPlay$SourceType;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getBtnTrackPlay()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/xv4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/xv4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public initializedMapFinish()V
    .locals 0

    return-void
.end method

.method public final isGradient()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isGradient:Z

    return v0
.end method

.method public final isInChina(DD)Z
    .locals 1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i01I1i1X;->OXO1:Lcom/android/mltcode/paycertificationapi/i01I1i1X;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/android/mltcode/paycertificationapi/i01I1i1X;->XO0O10(DD)Z

    move-result p1

    return p1
.end method

.method public final isInChinaMainland()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland:Z

    return v0
.end method

.method public final isLocationEmpty()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isLocationEmpty:Z

    return v0
.end method

.method public final isMapInitialized()Z
    .locals 3

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    if-eqz v0, :cond_0

    return v2

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    if-eqz v0, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method public final isShowLineMarker()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isShowLineMarker:Z

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e85

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

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/iOXO11i1;->XIi00iiXO(Ljava/util/List;)Lcom/baidu/mapapi/map/MapStatusUpdate;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/baidu/mapapi/map/BaiduMap;->setMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->onDestroy()V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isShowMap:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextureMapView;->onDestroy()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->onDestroy()V

    :cond_1
    return-void
.end method

.method public onLoadMarkView(Ljava/util/ArrayList;)V
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

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->addBaiduMarkView(Ljava/util/ArrayList;)V

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->addGoogleMarkView(Ljava/util/ArrayList;)V

    return-void
.end method

.method public onPause()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isShowMap:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextureMapView;->onResume()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->onResume()V

    :cond_1
    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onStop()V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isShowMap:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextureMapView;->onPause()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->onPause()V

    :cond_1
    return-void
.end method

.method public playTrack()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMTrackPlay()Lcom/sma/smartv3/ui/sport/TrackPlay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/TrackPlay;->O10IXXX0X()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getBtnMapHot()Landroid/widget/CheckBox;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getBtnMapMark()Landroid/widget/CheckBox;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMTrackPlay()Lcom/sma/smartv3/ui/sport/TrackPlay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/TrackPlay;->X0O()V

    :cond_0
    return-void
.end method

.method public final setEndMarkerAnchorCenter(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->endMarkerAnchorCenter:Z

    return-void
.end method

.method public final setGradient(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isGradient:Z

    return-void
.end method

.method public final setLocationEmpty(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isLocationEmpty:Z

    return-void
.end method

.method public final setMBaiDuMap(Lcom/baidu/mapapi/map/BaiduMap;)V
    .locals 1
    .param p1    # Lcom/baidu/mapapi/map/BaiduMap;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    return-void
.end method

.method public final setMBaiDuMapLineWidth(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiDuMapLineWidth:I

    return-void
.end method

.method public final setMBaiduLineEnd(Lcom/baidu/mapapi/map/Marker;)V
    .locals 0
    .param p1    # Lcom/baidu/mapapi/map/Marker;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduLineEnd:Lcom/baidu/mapapi/map/Marker;

    return-void
.end method

.method public final setMBaiduLineStart(Lcom/baidu/mapapi/map/Marker;)V
    .locals 0
    .param p1    # Lcom/baidu/mapapi/map/Marker;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mBaiduLineStart:Lcom/baidu/mapapi/map/Marker;

    return-void
.end method

.method public final setMColorList(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mColorList:Ljava/util/ArrayList;

    return-void
.end method

.method public final setMCurrentIcon(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mCurrentIcon:I

    return-void
.end method

.method public final setMGoogleMap(Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/maps/GoogleMap;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    return-void
.end method

.method public final setMInitialPoints(Ljava/util/ArrayList;)V
    .locals 0
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/baidu/mapapi/model/LatLng;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mInitialPoints:Ljava/util/ArrayList;

    return-void
.end method

.method public final setMMapLineColor(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mMapLineColor:I

    return-void
.end method

.method public final setMSmoothLocationList(Ljava/util/ArrayList;)V
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

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mSmoothLocationList:Ljava/util/ArrayList;

    return-void
.end method

.method public final setMStartIcon(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mStartIcon:I

    return-void
.end method

.method public setMTrackPlay(Lcom/sma/smartv3/ui/sport/TrackPlay;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/sport/TrackPlay;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mTrackPlay:Lcom/sma/smartv3/ui/sport/TrackPlay;

    return-void
.end method

.method public final setMWorkout(Lcom/sma/smartv3/db/entity/Workout;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/db/entity/Workout;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    return-void
.end method

.method public final setShowLineMarker(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isShowLineMarker:Z

    return-void
.end method

.method public final setSpeedRangeFast(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeFast:I

    return-void
.end method

.method public final setSpeedRangeSlow(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->speedRangeSlow:I

    return-void
.end method

.method public share(Landroid/graphics/Bitmap;)V
    .locals 2
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "topBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChinaMainland:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/qv4;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/qv4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/map/BaiduMap;->snapshot(Lcom/baidu/mapapi/map/BaiduMap$SnapshotReadyCallback;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getMGoogleMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/rv4;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/rv4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/GoogleMap;->snapshot(Lcom/google/android/gms/maps/GoogleMap$SnapshotReadyCallback;)V

    return-void

    :cond_1
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "Unable to share without Google services"

    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public shareMapBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 6
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Bitmap;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "topBitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapBitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getRootView()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getRootView()Landroid/widget/RelativeLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    add-int/2addr v1, v2

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    const-string v1, "createBitmap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, p1, v2, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v1, p2, v2, v4, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->OXO1:Lcom/android/mltcode/paycertificationapi/XIi1i01O;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->getRootView()Landroid/widget/RelativeLayout;

    move-result-object v4

    const-string v5, "<get-rootView>(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v4}, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->XIi00iiXO(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v4

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v1, v4, v2, p1, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p2, p1, v0}, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->XO0O10(Landroid/content/Context;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public showMapLocation(Ljava/util/List;)V
    .locals 5
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Location;",
            ">;)V"
        }
    .end annotation

    const-string v0, "locationList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isLocationEmpty:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/entity/Location;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Location;->getMLatitude()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Location;->getMLongitude()F

    move-result v0

    float-to-double v3, v0

    invoke-virtual {p0, v1, v2, v3, v4}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->isInChina(DD)Z

    move-result v1

    :cond_1
    invoke-direct {p0, p1, v1}, Lcom/sma/smartv3/ui/sport/SportDetailMapFragment;->onConvertLocation(Ljava/util/List;Z)V

    return-void
.end method
