.class public final Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDownLoadMapsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownLoadMapsActivity.kt\ncom/sma/smartv3/ui/device/DownLoadMapsActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,990:1\n19#2:991\n15#2:992\n173#3,7:993\n180#3,3:1001\n143#3,7:1004\n183#3:1011\n1#4:1000\n1#4:1012\n*S KotlinDebug\n*F\n+ 1 DownLoadMapsActivity.kt\ncom/sma/smartv3/ui/device/DownLoadMapsActivity\n*L\n98#1:991\n98#1:992\n359#1:993,7\n359#1:1001,3\n359#1:1004,7\n359#1:1011\n359#1:1000\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDownLoadMapsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownLoadMapsActivity.kt\ncom/sma/smartv3/ui/device/DownLoadMapsActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,990:1\n19#2:991\n15#2:992\n173#3,7:993\n180#3,3:1001\n143#3,7:1004\n183#3:1011\n1#4:1000\n1#4:1012\n*S KotlinDebug\n*F\n+ 1 DownLoadMapsActivity.kt\ncom/sma/smartv3/ui/device/DownLoadMapsActivity\n*L\n98#1:991\n98#1:992\n359#1:993,7\n359#1:1001,3\n359#1:1004,7\n359#1:1011\n359#1:1000\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final MAP_DEF_DIS:I = 0x2

.field public static final MAP_MAX_DIS:I = 0x3

.field public static final MAP_MIN_DIS:I = 0x1

.field public static final MAP_NOT_PROCESSED:I


# instance fields
.field private final TAG:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private curLatLng:Lcom/google/android/gms/maps/model/LatLng;

.field private curLatitude:D

.field private curLongitude:D

.field private curZoom:F

.field private googleCurZoom:F

.field private isInChinaMainland:Z

.field private isInProgress:Z

.field private isMapPauseResume:Z

.field private isNeedCalculateNumber:I

.field private final mBMapView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mGMapView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

.field private mLocationClient:Lcom/android/mltcode/paycertificationapi/ms;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mLocationServerPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mMapDir:Ljava/io/File;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public mMaskCoordinates:Lcom/sma/smartv3/view/MaskView$OXO1;

.field private final mMaskView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mProgressButton$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mRootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mStartIcon:I

.field private final mTipTitle$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mTitlePopup:Lcom/android/mltcode/paycertificationapi/iii1ii;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final maxDistance:D

.field private maxLatitude:D

.field private maxLongitude:D

.field private final minDistance:D

.field private minLatitude:D

.field private minLongitude:D

.field private final searchView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private targetDistanceType:I

.field private final userProfile:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->Companion:Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    const-string v1, "DownLoadMapsActivity"

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->TAG:Ljava/lang/String;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OiO0X;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/OiO0X;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mRootView$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->iXiX011(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mMapDir:Ljava/io/File;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IX111;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/IX111;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mProgressButton$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I10i1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/I10i1;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mGMapView$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I001X;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/I001X;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mBMapView$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    const-string v3, "LOCATION_WHERE"

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v4}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isInChinaMainland:Z

    new-instance v2, Lcom/android/mltcode/paycertificationapi/XiXiI10;

    invoke-direct {v2, v0}, Lcom/android/mltcode/paycertificationapi/XiXiI10;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V

    invoke-static {v2}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v2

    iput-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mMaskView$delegate:Lkotlin/Lazy;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/X11ii1OOI;

    invoke-direct {v2, v0}, Lcom/android/mltcode/paycertificationapi/X11ii1OOI;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V

    invoke-static {v2}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v2

    iput-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mTipTitle$delegate:Lkotlin/Lazy;

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

    iput-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    const v1, 0x7f081375

    iput v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mStartIcon:I

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iXX0I0;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/iXX0I0;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->searchView$delegate:Lkotlin/Lazy;

    const-wide v1, 0x40b3880000000000L    # 5000.0

    iput-wide v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->minDistance:D

    const-wide v1, 0x40e86a0000000000L    # 50000.0

    iput-wide v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->maxDistance:D

    const/4 v1, 0x2

    iput v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->targetDistanceType:I

    const v1, 0x4130b366

    iput v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curZoom:F

    const v1, 0x4129a16f

    iput v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->googleCurZoom:F

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->requestLocationPermission$lambda$0(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->locationServerRemind$lambda$0$0(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/sma/smartv3/view/CustomGoogleMapView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mGMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mRootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/baidu/mapapi/map/TextureMapView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mBMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->showTitlePopup$lambda$0$0$1(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Ljava/lang/String;Lcom/sma/smartv3/model/OffLineGenerateFileVo;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->showTitlePopup$lambda$0$0$3(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Ljava/lang/String;Lcom/sma/smartv3/model/OffLineGenerateFileVo;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->showTitlePopup$lambda$0$0(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->showTitlePopup$lambda$0$0$2(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->searchView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->onCreate$lambda$2(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Lcom/google/android/gms/maps/GoogleMap;)V

    return-void
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/sma/smartv3/view/MaskView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mMaskView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/sma/smartv3/view/MaskView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/sma/smartv3/view/ProgressButton;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mProgressButton_delegate$lambda$0(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$calculateDistance(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Lcom/baidu/mapapi/model/LatLng;Lcom/baidu/mapapi/model/LatLng;)F
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->calculateDistance(Lcom/baidu/mapapi/model/LatLng;Lcom/baidu/mapapi/model/LatLng;)F

    move-result p0

    return p0
.end method

.method public static final synthetic access$checkZoomRestrictions(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->checkZoomRestrictions()V

    return-void
.end method

.method public static final synthetic access$getCurLatLng$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curLatLng:Lcom/google/android/gms/maps/model/LatLng;

    return-object p0
.end method

.method public static final synthetic access$getGoogleCurZoom$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)F
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->googleCurZoom:F

    return p0
.end method

.method public static final synthetic access$getMBaiDuMap$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/baidu/mapapi/map/BaiduMap;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    return-object p0
.end method

.method public static final synthetic access$getMGoogleMap$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/google/android/gms/maps/GoogleMap;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    return-object p0
.end method

.method public static final synthetic access$getMLocationClient$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/android/mltcode/paycertificationapi/ms;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mLocationClient:Lcom/android/mltcode/paycertificationapi/ms;

    return-object p0
.end method

.method public static final synthetic access$getMProgressButton(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/sma/smartv3/view/ProgressButton;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$isInChinaMainland$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isInChinaMainland:Z

    return p0
.end method

.method public static final synthetic access$onCalculateZoom(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->onCalculateZoom()V

    return-void
.end method

.method public static final synthetic access$setComputeOffset(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;D)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setComputeOffset(D)V

    return-void
.end method

.method public static final synthetic access$setCurLatLng$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curLatLng:Lcom/google/android/gms/maps/model/LatLng;

    return-void
.end method

.method public static final synthetic access$setMLocationClient$p(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Lcom/android/mltcode/paycertificationapi/ms;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mLocationClient:Lcom/android/mltcode/paycertificationapi/ms;

    return-void
.end method

.method public static final synthetic access$showMarkerOptions(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Lcom/sma/smartv3/location/CustomLocation;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->showMarkerOptions(Lcom/sma/smartv3/location/CustomLocation;)V

    return-void
.end method

.method public static final synthetic access$stopLocationClient(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->stopLocationClient()V

    return-void
.end method

.method private final calculateDistance(Lcom/baidu/mapapi/model/LatLng;Lcom/baidu/mapapi/model/LatLng;)F
    .locals 0

    invoke-static {p1, p2}, Lcom/baidu/mapapi/utils/DistanceUtil;->getDistance(Lcom/baidu/mapapi/model/LatLng;Lcom/baidu/mapapi/model/LatLng;)D

    move-result-wide p1

    double-to-float p1, p1

    return p1
.end method

.method private final checkZoomRestrictions()V
    .locals 13

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->onCalculateZoom()V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isInChinaMainland:Z

    const/4 v1, 0x1

    const/4 v2, 0x3

    const-string v3, "mi"

    const-string v4, "KM"

    const v5, 0x473f6800    # 49000.0f

    const/16 v6, 0x3e8

    const v7, 0x47435000    # 50000.0f

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/BaiduMap;->getProjection()Lcom/baidu/mapapi/map/Projection;

    move-result-object v0

    new-instance v8, Landroid/graphics/Point;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v9

    invoke-virtual {v9}, Lcom/sma/smartv3/view/MaskView$OXO1;->OIX0iXi()F

    move-result v9

    float-to-int v9, v9

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v10

    invoke-virtual {v10}, Lcom/sma/smartv3/view/MaskView$OXO1;->XXI()F

    move-result v10

    float-to-int v10, v10

    invoke-direct {v8, v9, v10}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v0, v8}, Lcom/baidu/mapapi/map/Projection;->fromScreenLocation(Landroid/graphics/Point;)Lcom/baidu/mapapi/model/LatLng;

    move-result-object v0

    iget-object v8, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v8}, Lcom/baidu/mapapi/map/BaiduMap;->getProjection()Lcom/baidu/mapapi/map/Projection;

    move-result-object v8

    new-instance v9, Landroid/graphics/Point;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v10

    invoke-virtual {v10}, Lcom/sma/smartv3/view/MaskView$OXO1;->I0iXXO()F

    move-result v10

    float-to-int v10, v10

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v11

    invoke-virtual {v11}, Lcom/sma/smartv3/view/MaskView$OXO1;->XXI()F

    move-result v11

    float-to-int v11, v11

    invoke-direct {v9, v10, v11}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v8, v9}, Lcom/baidu/mapapi/map/Projection;->fromScreenLocation(Landroid/graphics/Point;)Lcom/baidu/mapapi/model/LatLng;

    move-result-object v8

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p0, v0, v8}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->calculateDistance(Lcom/baidu/mapapi/model/LatLng;Lcom/baidu/mapapi/model/LatLng;)F

    move-result v0

    cmpl-float v5, v0, v5

    if-lez v5, :cond_1

    cmpg-float v5, v0, v7

    if-gtz v5, :cond_1

    goto :goto_0

    :cond_1
    move v7, v0

    :goto_0
    iget-object v5, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    if-nez v5, :cond_2

    int-to-float v3, v6

    div-float/2addr v7, v3

    float-to-int v3, v7

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_2
    int-to-float v4, v6

    div-float/2addr v7, v4

    invoke-static {v7}, Lcom/android/mltcode/paycertificationapi/l76;->XO0O10(F)F

    move-result v4

    float-to-int v4, v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_1
    iget v4, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isNeedCalculateNumber:I

    if-nez v4, :cond_3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskView()Lcom/sma/smartv3/view/MaskView;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/sma/smartv3/view/MaskView;->setDirectionsText(Ljava/lang/String;)V

    :cond_3
    float-to-double v3, v0

    iget-wide v5, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->maxDistance:D

    cmpl-double v0, v3, v5

    if-lez v0, :cond_4

    iput v2, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->targetDistanceType:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->onCalculateZoom()V

    return-void

    :cond_4
    iget-wide v5, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->minDistance:D

    cmpg-double v0, v3, v5

    if-gez v0, :cond_c

    iput v1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->targetDistanceType:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->onCalculateZoom()V

    return-void

    :cond_5
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    const/4 v8, 0x0

    const-string v9, "mGoogleMap"

    if-nez v0, :cond_6

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v8

    :cond_6
    invoke-virtual {v0}, Lcom/google/android/gms/maps/GoogleMap;->getProjection()Lcom/google/android/gms/maps/Projection;

    move-result-object v0

    new-instance v10, Landroid/graphics/Point;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v11

    invoke-virtual {v11}, Lcom/sma/smartv3/view/MaskView$OXO1;->OIX0iXi()F

    move-result v11

    float-to-int v11, v11

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v12

    invoke-virtual {v12}, Lcom/sma/smartv3/view/MaskView$OXO1;->XXI()F

    move-result v12

    float-to-int v12, v12

    invoke-direct {v10, v11, v12}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v0, v10}, Lcom/google/android/gms/maps/Projection;->fromScreenLocation(Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    const-string v10, "fromScreenLocation(...)"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v11, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v11, :cond_7

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    move-object v8, v11

    :goto_2
    invoke-virtual {v8}, Lcom/google/android/gms/maps/GoogleMap;->getProjection()Lcom/google/android/gms/maps/Projection;

    move-result-object v8

    new-instance v9, Landroid/graphics/Point;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v11

    invoke-virtual {v11}, Lcom/sma/smartv3/view/MaskView$OXO1;->I0iXXO()F

    move-result v11

    float-to-int v11, v11

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v12

    invoke-virtual {v12}, Lcom/sma/smartv3/view/MaskView$OXO1;->XXI()F

    move-result v12

    float-to-int v12, v12

    invoke-direct {v9, v11, v12}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v8, v9}, Lcom/google/android/gms/maps/Projection;->fromScreenLocation(Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v8

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v8}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->calculateDistanceGoogle(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)F

    move-result v0

    cmpl-float v5, v0, v5

    if-lez v5, :cond_8

    cmpg-float v5, v0, v7

    if-gtz v5, :cond_8

    goto :goto_3

    :cond_8
    move v7, v0

    :goto_3
    iget-object v5, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    if-nez v5, :cond_9

    int-to-float v3, v6

    div-float/2addr v7, v3

    float-to-int v3, v7

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_4

    :cond_9
    int-to-float v4, v6

    div-float/2addr v7, v4

    invoke-static {v7}, Lcom/android/mltcode/paycertificationapi/l76;->XO0O10(F)F

    move-result v4

    float-to-int v4, v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_4
    iget v4, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isNeedCalculateNumber:I

    if-nez v4, :cond_a

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskView()Lcom/sma/smartv3/view/MaskView;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/sma/smartv3/view/MaskView;->setDirectionsText(Ljava/lang/String;)V

    :cond_a
    float-to-double v3, v0

    iget-wide v5, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->maxDistance:D

    cmpl-double v0, v3, v5

    if-lez v0, :cond_b

    iput v2, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->targetDistanceType:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->onCalculateZoom()V

    return-void

    :cond_b
    iget-wide v5, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->minDistance:D

    cmpg-double v0, v3, v5

    if-gez v0, :cond_c

    iput v1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->targetDistanceType:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->onCalculateZoom()V

    :cond_c
    :goto_5
    return-void
.end method

.method private final downloadMap(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    sget-object v0, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mMapDir:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getAbsolutePath(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".zip"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1;

    invoke-direct {v3, p0, p2}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$downloadMap$1;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/sma/smartv3/network/NetWorkUtils;->download(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/androidnetworklib/method/HttpProgressCallback;)V

    return-void
.end method

.method private final getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mBMapView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/TextureMapView;

    return-object v0
.end method

.method private final getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mGMapView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/CustomGoogleMapView;

    return-object v0
.end method

.method private final getMMaskView()Lcom/sma/smartv3/view/MaskView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mMaskView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/MaskView;

    return-object v0
.end method

.method private final getMProgressButton()Lcom/sma/smartv3/view/ProgressButton;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mProgressButton$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/ProgressButton;

    return-object v0
.end method

.method private final getMRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mRootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMTipTitle()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mTipTitle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getSearchView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->searchView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mTipTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Landroid/view/View;)V
    .locals 3

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg1"

    const/4 v2, -0x1

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mArg2"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/device/SearchMapsActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/4 p1, 0x0

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method private final locationServerRemind()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mLocationServerPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f140e2e

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1, v3, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XIO1X0XX;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/XIO1X0XX;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V

    const v2, 0x7f14122c

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mLocationServerPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mLocationServerPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method private static final locationServerRemind$lambda$0$0(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Z
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.LOCATION_SOURCE_SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final mBMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/baidu/mapapi/map/TextureMapView;
    .locals 1

    const v0, 0x7f0a00fc

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/baidu/mapapi/map/TextureMapView;

    return-object p0
.end method

.method private static final mGMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/sma/smartv3/view/CustomGoogleMapView;
    .locals 1

    const v0, 0x7f0a03fb

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/CustomGoogleMapView;

    return-object p0
.end method

.method private static final mMaskView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/sma/smartv3/view/MaskView;
    .locals 1

    const v0, 0x7f0a001a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/MaskView;

    return-object p0
.end method

.method private static final mProgressButton_delegate$lambda$0(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Lcom/sma/smartv3/view/ProgressButton;
    .locals 1

    const v0, 0x7f0a01b9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/ProgressButton;

    return-object p0
.end method

.method private static final mRootView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a001d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mTipTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0324

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private final onCalculateZoom()V
    .locals 6

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onCalculateZoom$1;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method private static final onCreate$lambda$2(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Lcom/google/android/gms/maps/GoogleMap;)V
    .locals 2

    const-string v0, "googleMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    if-nez p1, :cond_0

    const-string p1, "mGoogleMap"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/maps/GoogleMap;->getUiSettings()Lcom/google/android/gms/maps/UiSettings;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/UiSettings;->setZoomControlsEnabled(Z)V

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/maps/UiSettings;->setScrollGesturesEnabled(Z)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/maps/UiSettings;->setZoomGesturesEnabled(Z)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/UiSettings;->setTiltGesturesEnabled(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setMapColorScheme()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->startLocation()V

    return-void
.end method

.method private final onLocationClient()V
    .locals 6

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onLocationClient$1;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method private final requestLocationPermission()V
    .locals 6

    sget-object v0, Lcom/android/mltcode/paycertificationapi/hr1;->OXO1:Lcom/android/mltcode/paycertificationapi/hr1;

    new-instance v3, Lcom/android/mltcode/paycertificationapi/OIXX0O0iI;

    invoke-direct {v3, p0}, Lcom/android/mltcode/paycertificationapi/OIXX0O0iI;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/hr1;->XXIIO1i11(Lcom/android/mltcode/paycertificationapi/hr1;Landroid/content/Context;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method private static final requestLocationPermission$lambda$0(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Z)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->onLocationClient()V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final searchView_delegate$lambda$0(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a001e

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final setComputeOffset(D)V
    .locals 17

    move-object/from16 v0, p0

    const-wide v1, 0x40a7700000000000L    # 3000.0

    cmpg-double v1, p1, v1

    if-gtz v1, :cond_0

    const-wide v1, 0x3f9eb851eb851eb8L    # 0.03

    goto :goto_0

    :cond_0
    const-wide v1, 0x40c9640000000000L    # 13000.0

    cmpg-double v1, p1, v1

    if-gtz v1, :cond_1

    const-wide v1, 0x3fc3333333333333L    # 0.15

    goto :goto_0

    :cond_1
    const-wide/high16 v1, 0x3fd0000000000000L    # 0.25

    :goto_0
    sget-object v3, Lcom/android/mltcode/paycertificationapi/uk;->OXO1:Lcom/android/mltcode/paycertificationapi/uk;

    iget-object v4, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curLatLng:Lcom/google/android/gms/maps/model/LatLng;

    const-string v12, "curLatLng"

    const/4 v13, 0x0

    if-nez v4, :cond_2

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v13

    :cond_2
    iget-wide v4, v4, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    sub-double/2addr v4, v1

    iget-object v6, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curLatLng:Lcom/google/android/gms/maps/model/LatLng;

    if-nez v6, :cond_3

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v6, v13

    :cond_3
    iget-wide v6, v6, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    const-wide v10, 0x4070e00000000000L    # 270.0

    move-wide/from16 v8, p1

    invoke-virtual/range {v3 .. v11}, Lcom/android/mltcode/paycertificationapi/uk;->OXO1(DDDD)Lkotlin/Pair;

    move-result-object v14

    iget-object v4, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curLatLng:Lcom/google/android/gms/maps/model/LatLng;

    if-nez v4, :cond_4

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v13

    :cond_4
    iget-wide v4, v4, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    sub-double/2addr v4, v1

    iget-object v6, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curLatLng:Lcom/google/android/gms/maps/model/LatLng;

    if-nez v6, :cond_5

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v6, v13

    :cond_5
    iget-wide v6, v6, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    const-wide/16 v10, 0x0

    move-wide/from16 v8, p1

    invoke-virtual/range {v3 .. v11}, Lcom/android/mltcode/paycertificationapi/uk;->OXO1(DDDD)Lkotlin/Pair;

    move-result-object v15

    iget-object v4, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curLatLng:Lcom/google/android/gms/maps/model/LatLng;

    if-nez v4, :cond_6

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v13

    :cond_6
    iget-wide v4, v4, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    sub-double/2addr v4, v1

    iget-object v6, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curLatLng:Lcom/google/android/gms/maps/model/LatLng;

    if-nez v6, :cond_7

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v6, v13

    :cond_7
    iget-wide v6, v6, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    const-wide v10, 0x4066800000000000L    # 180.0

    move-wide/from16 v8, p1

    invoke-virtual/range {v3 .. v11}, Lcom/android/mltcode/paycertificationapi/uk;->OXO1(DDDD)Lkotlin/Pair;

    move-result-object v16

    iget-object v4, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curLatLng:Lcom/google/android/gms/maps/model/LatLng;

    if-nez v4, :cond_8

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v13

    :cond_8
    iget-wide v4, v4, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    sub-double/2addr v4, v1

    iget-object v1, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curLatLng:Lcom/google/android/gms/maps/model/LatLng;

    if-nez v1, :cond_9

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v13

    :cond_9
    iget-wide v6, v1, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    const-wide v10, 0x4056800000000000L    # 90.0

    move-wide/from16 v8, p1

    invoke-virtual/range {v3 .. v11}, Lcom/android/mltcode/paycertificationapi/uk;->OXO1(DDDD)Lkotlin/Pair;

    move-result-object v1

    iget-boolean v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isInChinaMainland:Z

    const/16 v3, 0x96

    if-eqz v2, :cond_b

    new-instance v2, Lcom/baidu/mapapi/model/LatLngBounds$Builder;

    invoke-direct {v2}, Lcom/baidu/mapapi/model/LatLngBounds$Builder;-><init>()V

    new-instance v4, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v15}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    invoke-virtual {v15}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    invoke-direct {v4, v5, v6, v7, v8}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-virtual {v2, v4}, Lcom/baidu/mapapi/model/LatLngBounds$Builder;->include(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/model/LatLngBounds$Builder;

    move-result-object v2

    new-instance v4, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual/range {v16 .. v16}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    invoke-virtual/range {v16 .. v16}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    invoke-direct {v4, v5, v6, v7, v8}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-virtual {v2, v4}, Lcom/baidu/mapapi/model/LatLngBounds$Builder;->include(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/model/LatLngBounds$Builder;

    move-result-object v2

    new-instance v4, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    invoke-direct {v4, v5, v6, v7, v8}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-virtual {v2, v4}, Lcom/baidu/mapapi/model/LatLngBounds$Builder;->include(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/model/LatLngBounds$Builder;

    move-result-object v1

    new-instance v2, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v14}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-virtual {v14}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v6

    invoke-direct {v2, v4, v5, v6, v7}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-virtual {v1, v2}, Lcom/baidu/mapapi/model/LatLngBounds$Builder;->include(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/model/LatLngBounds$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/mapapi/model/LatLngBounds$Builder;->build()Lcom/baidu/mapapi/model/LatLngBounds;

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    if-eqz v2, :cond_a

    const/4 v4, 0x0

    invoke-static {v1, v3, v4, v3, v4}, Lcom/baidu/mapapi/map/MapStatusUpdateFactory;->newLatLngBounds(Lcom/baidu/mapapi/model/LatLngBounds;IIII)Lcom/baidu/mapapi/map/MapStatusUpdate;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/baidu/mapapi/map/BaiduMap;->animateMapStatus(Lcom/baidu/mapapi/map/MapStatusUpdate;)V

    :cond_a
    return-void

    :cond_b
    new-instance v2, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    invoke-direct {v2}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;-><init>()V

    new-instance v4, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v15}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    invoke-virtual {v15}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    invoke-direct {v4, v5, v6, v7, v8}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v2, v4}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    move-result-object v2

    new-instance v4, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual/range {v16 .. v16}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    invoke-virtual/range {v16 .. v16}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    invoke-direct {v4, v5, v6, v7, v8}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v2, v4}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    move-result-object v2

    new-instance v4, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v7

    invoke-direct {v4, v5, v6, v7, v8}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v2, v4}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v14}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-virtual {v14}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v6

    invoke-direct {v2, v4, v5, v6, v7}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->include(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLngBounds$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/LatLngBounds$Builder;->build()Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object v1

    const-string v2, "build(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v2, :cond_c

    const-string v2, "mGoogleMap"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_c
    move-object v13, v2

    :goto_1
    invoke-static {v1, v3}, Lcom/google/android/gms/maps/CameraUpdateFactory;->newLatLngBounds(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lcom/google/android/gms/maps/CameraUpdate;

    move-result-object v1

    invoke-virtual {v13, v1}, Lcom/google/android/gms/maps/GoogleMap;->animateCamera(Lcom/google/android/gms/maps/CameraUpdate;)V

    return-void
.end method

.method private final setMapColorScheme()V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "SELECT_THEME"

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v0

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isInChinaMainland:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const-string v3, "mGoogleMap"

    if-eqz v0, :cond_5

    const/4 v4, 0x1

    if-eq v0, v4, :cond_3

    if-eq v0, v2, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v0, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object v1, v0

    :goto_1
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/GoogleMap;->setMapColorScheme(I)V

    return-void

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v0, :cond_4

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    move-object v1, v0

    :goto_2
    invoke-virtual {v1, v4}, Lcom/google/android/gms/maps/GoogleMap;->setMapColorScheme(I)V

    return-void

    :cond_5
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v0, :cond_6

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_3

    :cond_6
    move-object v1, v0

    :goto_3
    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/GoogleMap;->setMapColorScheme(I)V

    return-void
.end method

.method private final setMaskView()V
    .locals 3

    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenWidth()I

    move-result v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskView()Lcom/sma/smartv3/view/MaskView;

    move-result-object v1

    add-int/lit16 v0, v0, -0x12c

    const/16 v2, 0x96

    invoke-virtual {v1, v0, v2}, Lcom/sma/smartv3/view/MaskView;->iO(II)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskView()Lcom/sma/smartv3/view/MaskView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/view/MaskView;->getCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setMMaskCoordinates(Lcom/sma/smartv3/view/MaskView$OXO1;)V

    return-void
.end method

.method private final showMarkerOptions(Lcom/sma/smartv3/location/CustomLocation;)V
    .locals 7

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isInChinaMainland:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/baidu/mapapi/map/MarkerOptions;

    invoke-direct {v1}, Lcom/baidu/mapapi/map/MarkerOptions;-><init>()V

    new-instance v2, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v3

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-virtual {v1, v2}, Lcom/baidu/mapapi/map/MarkerOptions;->position(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object p1

    iget v1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mStartIcon:I

    invoke-static {v1}, Lcom/baidu/mapapi/map/BitmapDescriptorFactory;->fromResource(I)Lcom/baidu/mapapi/map/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/baidu/mapapi/map/MarkerOptions;->icon(Lcom/baidu/mapapi/map/BitmapDescriptor;)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/baidu/mapapi/map/MarkerOptions;->draggable(Z)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object p1

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lcom/baidu/mapapi/map/MarkerOptions;->flat(Z)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object p1

    const/16 v1, 0x9

    invoke-virtual {p1, v1}, Lcom/baidu/mapapi/map/MarkerOptions;->zIndex(I)Lcom/baidu/mapapi/map/MarkerOptions;

    move-result-object p1

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {p1, v1, v1}, Lcom/baidu/mapapi/map/MarkerOptions;->anchor(FF)Lcom/baidu/mapapi/map/MarkerOptions;

    invoke-virtual {v0, p1}, Lcom/baidu/mapapi/map/BaiduMap;->addOverlay(Lcom/baidu/mapapi/map/OverlayOptions;)Lcom/baidu/mapapi/map/Overlay;

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v0, :cond_2

    const-string v0, "mGoogleMap"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_2
    new-instance v1, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v3

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->position(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p1

    iget v1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mStartIcon:I

    invoke-static {v1}, Lcom/google/android/gms/maps/model/BitmapDescriptorFactory;->fromResource(I)Lcom/google/android/gms/maps/model/BitmapDescriptor;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->icon(Lcom/google/android/gms/maps/model/BitmapDescriptor;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/GoogleMap;->addMarker(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/Marker;

    return-void
.end method

.method private final showTitlePopup()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mTitlePopup:Lcom/android/mltcode/paycertificationapi/iii1ii;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iii1ii;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/iii1ii;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v1, 0x7f140e7a

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/iii1ii;->XXX11i(I)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/iii1ii;->X01IiOiIi()Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->XO0O10()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f06024d

    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/iii1ii;->X01IiOiIi()Landroid/widget/EditText;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/O00IXIOI1;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/O00IXIOI1;-><init>()V

    filled-new-array {v2}, [Lcom/android/mltcode/paycertificationapi/O00IXIOI1;

    move-result-object v2

    check-cast v2, [Landroid/text/InputFilter;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OXX10;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OXX10;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/iii1ii;->X11iII1O1(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mTitlePopup:Lcom/android/mltcode/paycertificationapi/iii1ii;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mTitlePopup:Lcom/android/mltcode/paycertificationapi/iii1ii;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method private static final showTitlePopup$lambda$0$0(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Ljava/lang/String;)Z
    .locals 23

    move-object/from16 v12, p0

    move-object/from16 v0, p1

    const/4 v2, 0x3

    const/4 v15, 0x1

    const-string v3, "text"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_e

    iget-object v3, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mMapDir:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    if-eqz v3, :cond_1

    array-length v6, v3

    move v7, v4

    :goto_0
    if-ge v7, v6, :cond_1

    aget-object v8, v3, v7

    invoke-virtual {v8}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_1

    :cond_0
    add-int/2addr v7, v15

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    :goto_1
    if-eqz v8, :cond_2

    const v0, 0x7f140bd7

    invoke-virtual {v12, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-array v1, v4, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    move/from16 v16, v15

    goto/16 :goto_4

    :cond_2
    iget-boolean v3, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isInChinaMainland:Z

    if-eqz v3, :cond_5

    iget-object v3, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/baidu/mapapi/map/BaiduMap;->getProjection()Lcom/baidu/mapapi/map/Projection;

    move-result-object v3

    new-instance v5, Landroid/graphics/Point;

    invoke-virtual {v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v6

    invoke-virtual {v6}, Lcom/sma/smartv3/view/MaskView$OXO1;->OIX0iXi()F

    move-result v6

    float-to-int v6, v6

    invoke-virtual {v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v7

    invoke-virtual {v7}, Lcom/sma/smartv3/view/MaskView$OXO1;->XXI()F

    move-result v7

    float-to-int v7, v7

    invoke-direct {v5, v6, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v3, v5}, Lcom/baidu/mapapi/map/Projection;->fromScreenLocation(Landroid/graphics/Point;)Lcom/baidu/mapapi/model/LatLng;

    move-result-object v3

    iget-object v5, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v5}, Lcom/baidu/mapapi/map/BaiduMap;->getProjection()Lcom/baidu/mapapi/map/Projection;

    move-result-object v5

    new-instance v6, Landroid/graphics/Point;

    invoke-virtual {v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v7

    invoke-virtual {v7}, Lcom/sma/smartv3/view/MaskView$OXO1;->OIX0iXi()F

    move-result v7

    float-to-int v7, v7

    invoke-virtual {v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v8

    invoke-virtual {v8}, Lcom/sma/smartv3/view/MaskView$OXO1;->XOO0ii0()F

    move-result v8

    float-to-int v8, v8

    invoke-direct {v6, v7, v8}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v5, v6}, Lcom/baidu/mapapi/map/Projection;->fromScreenLocation(Landroid/graphics/Point;)Lcom/baidu/mapapi/model/LatLng;

    move-result-object v5

    iget-object v6, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lcom/baidu/mapapi/map/BaiduMap;->getProjection()Lcom/baidu/mapapi/map/Projection;

    move-result-object v6

    new-instance v7, Landroid/graphics/Point;

    invoke-virtual {v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v8

    invoke-virtual {v8}, Lcom/sma/smartv3/view/MaskView$OXO1;->I0iXXO()F

    move-result v8

    float-to-int v8, v8

    invoke-virtual {v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v9

    invoke-virtual {v9}, Lcom/sma/smartv3/view/MaskView$OXO1;->XXI()F

    move-result v9

    float-to-int v9, v9

    invoke-direct {v7, v8, v9}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v7}, Lcom/baidu/mapapi/map/Projection;->fromScreenLocation(Landroid/graphics/Point;)Lcom/baidu/mapapi/model/LatLng;

    move-result-object v6

    iget-object v7, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v7}, Lcom/baidu/mapapi/map/BaiduMap;->getProjection()Lcom/baidu/mapapi/map/Projection;

    move-result-object v7

    new-instance v8, Landroid/graphics/Point;

    invoke-virtual {v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v9

    invoke-virtual {v9}, Lcom/sma/smartv3/view/MaskView$OXO1;->I0iXXO()F

    move-result v9

    float-to-int v9, v9

    invoke-virtual {v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v10

    invoke-virtual {v10}, Lcom/sma/smartv3/view/MaskView$OXO1;->XOO0ii0()F

    move-result v10

    float-to-int v10, v10

    invoke-direct {v8, v9, v10}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v7, v8}, Lcom/baidu/mapapi/map/Projection;->fromScreenLocation(Landroid/graphics/Point;)Lcom/baidu/mapapi/model/LatLng;

    move-result-object v7

    iget-object v8, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v8}, Lcom/baidu/mapapi/map/BaiduMap;->getProjection()Lcom/baidu/mapapi/map/Projection;

    move-result-object v8

    new-instance v9, Landroid/graphics/Point;

    invoke-virtual {v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v10

    invoke-virtual {v10}, Lcom/sma/smartv3/view/MaskView$OXO1;->I0IIOi()F

    move-result v10

    float-to-int v10, v10

    invoke-virtual {v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v11

    invoke-virtual {v11}, Lcom/sma/smartv3/view/MaskView$OXO1;->OIi0()F

    move-result v11

    float-to-int v11, v11

    invoke-direct {v9, v10, v11}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v8, v9}, Lcom/baidu/mapapi/map/Projection;->fromScreenLocation(Landroid/graphics/Point;)Lcom/baidu/mapapi/model/LatLng;

    move-result-object v8

    sget-object v9, Lcom/android/mltcode/paycertificationapi/i01I1i1X;->OXO1:Lcom/android/mltcode/paycertificationapi/i01I1i1X;

    iget-wide v10, v8, Lcom/baidu/mapapi/model/LatLng;->latitude:D

    iget-wide v13, v8, Lcom/baidu/mapapi/model/LatLng;->longitude:D

    invoke-virtual {v9, v10, v11, v13, v14}, Lcom/android/mltcode/paycertificationapi/i01I1i1X;->XO0O10(DD)Z

    move-result v10

    if-eqz v10, :cond_3

    iget-wide v10, v3, Lcom/baidu/mapapi/model/LatLng;->latitude:D

    iget-wide v13, v3, Lcom/baidu/mapapi/model/LatLng;->longitude:D

    invoke-virtual {v9, v10, v11, v13, v14}, Lcom/android/mltcode/paycertificationapi/i01I1i1X;->XIi00iiXO(DD)Lkotlin/Pair;

    move-result-object v3

    iget-wide v10, v5, Lcom/baidu/mapapi/model/LatLng;->latitude:D

    iget-wide v13, v5, Lcom/baidu/mapapi/model/LatLng;->longitude:D

    invoke-virtual {v9, v10, v11, v13, v14}, Lcom/android/mltcode/paycertificationapi/i01I1i1X;->XIi00iiXO(DD)Lkotlin/Pair;

    move-result-object v5

    iget-wide v10, v6, Lcom/baidu/mapapi/model/LatLng;->latitude:D

    iget-wide v13, v6, Lcom/baidu/mapapi/model/LatLng;->longitude:D

    invoke-virtual {v9, v10, v11, v13, v14}, Lcom/android/mltcode/paycertificationapi/i01I1i1X;->XIi00iiXO(DD)Lkotlin/Pair;

    move-result-object v6

    iget-wide v10, v7, Lcom/baidu/mapapi/model/LatLng;->latitude:D

    iget-wide v13, v7, Lcom/baidu/mapapi/model/LatLng;->longitude:D

    invoke-virtual {v9, v10, v11, v13, v14}, Lcom/android/mltcode/paycertificationapi/i01I1i1X;->XIi00iiXO(DD)Lkotlin/Pair;

    move-result-object v7

    iget-wide v10, v8, Lcom/baidu/mapapi/model/LatLng;->latitude:D

    iget-wide v13, v8, Lcom/baidu/mapapi/model/LatLng;->longitude:D

    invoke-virtual {v9, v10, v11, v13, v14}, Lcom/android/mltcode/paycertificationapi/i01I1i1X;->XIi00iiXO(DD)Lkotlin/Pair;

    move-result-object v8

    new-instance v9, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v10

    invoke-virtual {v3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v13

    invoke-direct {v9, v10, v11, v13, v14}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    new-instance v3, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v5}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v10

    invoke-virtual {v5}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v13

    invoke-direct {v3, v10, v11, v13, v14}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    new-instance v5, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v6}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v10

    invoke-virtual {v6}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v13

    invoke-direct {v5, v10, v11, v13, v14}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    new-instance v6, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v7}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v10

    invoke-virtual {v7}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v13

    invoke-direct {v6, v10, v11, v13, v14}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    new-instance v7, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v8}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v10

    invoke-virtual {v8}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v13

    invoke-direct {v7, v10, v11, v13, v14}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    move-object v5, v3

    move-object v3, v9

    :cond_3
    iget-wide v9, v3, Lcom/baidu/mapapi/model/LatLng;->longitude:D

    iget-wide v13, v5, Lcom/baidu/mapapi/model/LatLng;->longitude:D

    move v11, v4

    move-object/from16 v16, v5

    iget-wide v4, v6, Lcom/baidu/mapapi/model/LatLng;->longitude:D

    move/from16 v17, v11

    iget-wide v11, v7, Lcom/baidu/mapapi/model/LatLng;->longitude:D

    const/16 v18, 0x2

    new-array v1, v2, [D

    aput-wide v13, v1, v17

    aput-wide v4, v1, v15

    aput-wide v11, v1, v18

    invoke-static {v9, v10, v1}, Lcom/android/mltcode/paycertificationapi/OOiIO0;->X1IX(D[D)D

    move-result-wide v4

    move-object/from16 v12, p0

    iput-wide v4, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->maxLongitude:D

    iget-wide v4, v3, Lcom/baidu/mapapi/model/LatLng;->longitude:D

    move-object/from16 v1, v16

    iget-wide v9, v1, Lcom/baidu/mapapi/model/LatLng;->longitude:D

    iget-wide v13, v6, Lcom/baidu/mapapi/model/LatLng;->longitude:D

    move-wide/from16 v19, v9

    iget-wide v9, v7, Lcom/baidu/mapapi/model/LatLng;->longitude:D

    new-array v11, v2, [D

    aput-wide v19, v11, v17

    aput-wide v13, v11, v15

    aput-wide v9, v11, v18

    invoke-static {v4, v5, v11}, Lcom/android/mltcode/paycertificationapi/OOiIO0;->XXiIiX10(D[D)D

    move-result-wide v4

    iput-wide v4, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->minLongitude:D

    iget-wide v4, v3, Lcom/baidu/mapapi/model/LatLng;->latitude:D

    iget-wide v9, v1, Lcom/baidu/mapapi/model/LatLng;->latitude:D

    iget-wide v13, v6, Lcom/baidu/mapapi/model/LatLng;->latitude:D

    move-wide/from16 v19, v9

    iget-wide v9, v7, Lcom/baidu/mapapi/model/LatLng;->latitude:D

    new-array v11, v2, [D

    aput-wide v19, v11, v17

    aput-wide v13, v11, v15

    aput-wide v9, v11, v18

    invoke-static {v4, v5, v11}, Lcom/android/mltcode/paycertificationapi/OOiIO0;->X1IX(D[D)D

    move-result-wide v4

    iput-wide v4, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->maxLatitude:D

    iget-wide v3, v3, Lcom/baidu/mapapi/model/LatLng;->latitude:D

    iget-wide v9, v1, Lcom/baidu/mapapi/model/LatLng;->latitude:D

    iget-wide v5, v6, Lcom/baidu/mapapi/model/LatLng;->latitude:D

    iget-wide v13, v7, Lcom/baidu/mapapi/model/LatLng;->latitude:D

    new-array v1, v2, [D

    aput-wide v9, v1, v17

    aput-wide v5, v1, v15

    aput-wide v13, v1, v18

    invoke-static {v3, v4, v1}, Lcom/android/mltcode/paycertificationapi/OOiIO0;->XXiIiX10(D[D)D

    move-result-wide v1

    iput-wide v1, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->minLatitude:D

    iget-wide v1, v8, Lcom/baidu/mapapi/model/LatLng;->longitude:D

    iput-wide v1, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curLongitude:D

    iget-wide v1, v8, Lcom/baidu/mapapi/model/LatLng;->latitude:D

    iput-wide v1, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curLatitude:D

    iget-object v1, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    if-eqz v1, :cond_4

    new-instance v2, Lcom/android/mltcode/paycertificationapi/IOIO11;

    invoke-direct {v2, v12, v0}, Lcom/android/mltcode/paycertificationapi/IOIO11;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/baidu/mapapi/map/BaiduMap;->snapshot(Lcom/baidu/mapapi/map/BaiduMap$SnapshotReadyCallback;)V

    :cond_4
    move v1, v15

    goto/16 :goto_3

    :cond_5
    move/from16 v17, v4

    const/16 v18, 0x2

    iget-object v1, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    const-string v3, "mGoogleMap"

    if-nez v1, :cond_6

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_6
    invoke-virtual {v1}, Lcom/google/android/gms/maps/GoogleMap;->getProjection()Lcom/google/android/gms/maps/Projection;

    move-result-object v1

    new-instance v4, Landroid/graphics/Point;

    invoke-virtual {v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v6

    invoke-virtual {v6}, Lcom/sma/smartv3/view/MaskView$OXO1;->OIX0iXi()F

    move-result v6

    float-to-int v6, v6

    invoke-virtual {v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v7

    invoke-virtual {v7}, Lcom/sma/smartv3/view/MaskView$OXO1;->XXI()F

    move-result v7

    float-to-int v7, v7

    invoke-direct {v4, v6, v7}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v1, v4}, Lcom/google/android/gms/maps/Projection;->fromScreenLocation(Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    const-string v4, "fromScreenLocation(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v6, :cond_7

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v6, 0x0

    :cond_7
    invoke-virtual {v6}, Lcom/google/android/gms/maps/GoogleMap;->getProjection()Lcom/google/android/gms/maps/Projection;

    move-result-object v6

    new-instance v7, Landroid/graphics/Point;

    invoke-virtual {v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v8

    invoke-virtual {v8}, Lcom/sma/smartv3/view/MaskView$OXO1;->OIX0iXi()F

    move-result v8

    float-to-int v8, v8

    invoke-virtual {v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v9

    invoke-virtual {v9}, Lcom/sma/smartv3/view/MaskView$OXO1;->XOO0ii0()F

    move-result v9

    float-to-int v9, v9

    invoke-direct {v7, v8, v9}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v6, v7}, Lcom/google/android/gms/maps/Projection;->fromScreenLocation(Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v7, :cond_8

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v7, 0x0

    :cond_8
    invoke-virtual {v7}, Lcom/google/android/gms/maps/GoogleMap;->getProjection()Lcom/google/android/gms/maps/Projection;

    move-result-object v7

    new-instance v8, Landroid/graphics/Point;

    invoke-virtual {v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v9

    invoke-virtual {v9}, Lcom/sma/smartv3/view/MaskView$OXO1;->I0iXXO()F

    move-result v9

    float-to-int v9, v9

    invoke-virtual {v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v10

    invoke-virtual {v10}, Lcom/sma/smartv3/view/MaskView$OXO1;->XXI()F

    move-result v10

    float-to-int v10, v10

    invoke-direct {v8, v9, v10}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v7, v8}, Lcom/google/android/gms/maps/Projection;->fromScreenLocation(Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v8, :cond_9

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v8, 0x0

    :cond_9
    invoke-virtual {v8}, Lcom/google/android/gms/maps/GoogleMap;->getProjection()Lcom/google/android/gms/maps/Projection;

    move-result-object v8

    new-instance v9, Landroid/graphics/Point;

    invoke-virtual {v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v10

    invoke-virtual {v10}, Lcom/sma/smartv3/view/MaskView$OXO1;->I0iXXO()F

    move-result v10

    float-to-int v10, v10

    invoke-virtual {v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v11

    invoke-virtual {v11}, Lcom/sma/smartv3/view/MaskView$OXO1;->XOO0ii0()F

    move-result v11

    float-to-int v11, v11

    invoke-direct {v9, v10, v11}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v8, v9}, Lcom/google/android/gms/maps/Projection;->fromScreenLocation(Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v8

    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v9, :cond_a

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v9, 0x0

    :cond_a
    invoke-virtual {v9}, Lcom/google/android/gms/maps/GoogleMap;->getProjection()Lcom/google/android/gms/maps/Projection;

    move-result-object v9

    new-instance v10, Landroid/graphics/Point;

    invoke-virtual {v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v11

    invoke-virtual {v11}, Lcom/sma/smartv3/view/MaskView$OXO1;->I0IIOi()F

    move-result v11

    float-to-int v11, v11

    invoke-virtual {v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object v13

    invoke-virtual {v13}, Lcom/sma/smartv3/view/MaskView$OXO1;->OIi0()F

    move-result v13

    float-to-int v13, v13

    invoke-direct {v10, v11, v13}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v9, v10}, Lcom/google/android/gms/maps/Projection;->fromScreenLocation(Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v9

    invoke-static {v9, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lcom/android/mltcode/paycertificationapi/i01I1i1X;->OXO1:Lcom/android/mltcode/paycertificationapi/i01I1i1X;

    iget-wide v10, v9, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v13, v9, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-virtual {v4, v10, v11, v13, v14}, Lcom/android/mltcode/paycertificationapi/i01I1i1X;->XO0O10(DD)Z

    move-result v10

    if-eqz v10, :cond_b

    iget-wide v10, v1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v13, v1, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-virtual {v4, v10, v11, v13, v14}, Lcom/android/mltcode/paycertificationapi/i01I1i1X;->iO(DD)Lkotlin/Pair;

    move-result-object v1

    iget-wide v10, v6, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v13, v6, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-virtual {v4, v10, v11, v13, v14}, Lcom/android/mltcode/paycertificationapi/i01I1i1X;->iO(DD)Lkotlin/Pair;

    move-result-object v6

    iget-wide v10, v7, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v13, v7, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-virtual {v4, v10, v11, v13, v14}, Lcom/android/mltcode/paycertificationapi/i01I1i1X;->iO(DD)Lkotlin/Pair;

    move-result-object v7

    iget-wide v10, v8, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v13, v8, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-virtual {v4, v10, v11, v13, v14}, Lcom/android/mltcode/paycertificationapi/i01I1i1X;->iO(DD)Lkotlin/Pair;

    move-result-object v8

    iget-wide v10, v9, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v13, v9, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-virtual {v4, v10, v11, v13, v14}, Lcom/android/mltcode/paycertificationapi/i01I1i1X;->iO(DD)Lkotlin/Pair;

    move-result-object v4

    new-instance v9, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v10

    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v13

    invoke-direct {v9, v10, v11, v13, v14}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v6}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v10

    invoke-virtual {v6}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v13

    invoke-direct {v1, v10, v11, v13, v14}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    new-instance v6, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v7}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v10

    invoke-virtual {v7}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v13

    invoke-direct {v6, v10, v11, v13, v14}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    new-instance v7, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v8}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v10

    invoke-virtual {v8}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v13

    invoke-direct {v7, v10, v11, v13, v14}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    new-instance v8, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v10

    invoke-virtual {v4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v13

    invoke-direct {v8, v10, v11, v13, v14}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    move-object/from16 v22, v6

    move-object v6, v1

    move-object v1, v9

    move-object v9, v8

    move-object v8, v7

    move-object/from16 v7, v22

    :cond_b
    iget-wide v10, v1, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    iget-wide v13, v6, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    move-object/from16 v16, v6

    iget-wide v5, v7, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    move-wide/from16 v20, v5

    iget-wide v4, v8, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    new-array v6, v2, [D

    aput-wide v13, v6, v17

    aput-wide v20, v6, v15

    aput-wide v4, v6, v18

    invoke-static {v10, v11, v6}, Lcom/android/mltcode/paycertificationapi/OOiIO0;->X1IX(D[D)D

    move-result-wide v4

    iput-wide v4, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->maxLongitude:D

    iget-wide v4, v1, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    move-object/from16 v6, v16

    iget-wide v10, v6, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    iget-wide v13, v7, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    move-wide/from16 v20, v10

    iget-wide v10, v8, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    move/from16 v16, v15

    new-array v15, v2, [D

    aput-wide v20, v15, v17

    aput-wide v13, v15, v16

    aput-wide v10, v15, v18

    invoke-static {v4, v5, v15}, Lcom/android/mltcode/paycertificationapi/OOiIO0;->XXiIiX10(D[D)D

    move-result-wide v4

    iput-wide v4, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->minLongitude:D

    iget-wide v4, v1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v10, v6, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v13, v7, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    move-wide/from16 v20, v10

    iget-wide v10, v8, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    new-array v15, v2, [D

    aput-wide v20, v15, v17

    aput-wide v13, v15, v16

    aput-wide v10, v15, v18

    invoke-static {v4, v5, v15}, Lcom/android/mltcode/paycertificationapi/OOiIO0;->X1IX(D[D)D

    move-result-wide v4

    iput-wide v4, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->maxLatitude:D

    iget-wide v4, v1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v10, v6, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v6, v7, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v13, v8, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    new-array v1, v2, [D

    aput-wide v10, v1, v17

    aput-wide v6, v1, v16

    aput-wide v13, v1, v18

    invoke-static {v4, v5, v1}, Lcom/android/mltcode/paycertificationapi/OOiIO0;->XXiIiX10(D[D)D

    move-result-wide v1

    iput-wide v1, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->minLatitude:D

    iget-wide v1, v9, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    iput-wide v1, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curLongitude:D

    iget-wide v1, v9, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iput-wide v1, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curLatitude:D

    iget-object v1, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    if-nez v1, :cond_c

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v5, 0x0

    goto :goto_2

    :cond_c
    move-object v5, v1

    :goto_2
    new-instance v1, Lcom/android/mltcode/paycertificationapi/I0100iOI;

    invoke-direct {v1, v12, v0}, Lcom/android/mltcode/paycertificationapi/I0100iOI;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Lcom/google/android/gms/maps/GoogleMap;->snapshot(Lcom/google/android/gms/maps/GoogleMap$SnapshotReadyCallback;)V

    move/from16 v1, v16

    :goto_3
    iput-boolean v1, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isInProgress:Z

    iget-wide v6, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->maxLatitude:D

    iget-wide v2, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->minLatitude:D

    iget-wide v4, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->maxLongitude:D

    iget-wide v8, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->minLongitude:D

    move-wide v10, v8

    iget-wide v8, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curLongitude:D

    move-wide v13, v10

    iget-wide v10, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curLatitude:D

    move-wide v14, v13

    invoke-direct {v12}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMRootView()Landroid/view/View;

    move-result-object v13

    move-wide/from16 v17, v14

    new-instance v14, Lcom/android/mltcode/paycertificationapi/Oii1IXiXi;

    invoke-direct {v14, v12, v0}, Lcom/android/mltcode/paycertificationapi/Oii1IXiXi;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Ljava/lang/String;)V

    move-wide/from16 v0, v17

    invoke-static/range {v0 .. v14}, Lcom/sma/smartv3/util/OffLineMapManagerKt;->XOO0ii0(DDDDDDLandroid/app/Activity;Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, v12, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mTitlePopup:Lcom/android/mltcode/paycertificationapi/iii1ii;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_d
    const/16 v16, 0x1

    :goto_4
    return v16

    :cond_e
    move/from16 v17, v4

    const v0, 0x7f140374

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return v17
.end method

.method private static final showTitlePopup$lambda$0$0$1(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    if-eqz p2, :cond_0

    new-instance v0, Ljava/io/File;

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mMapDir:Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".jpg"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sget-object p0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {p2, v0, p0}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;)Z

    :cond_0
    return-void
.end method

.method private static final showTitlePopup$lambda$0$0$2(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    if-eqz p2, :cond_0

    new-instance v0, Ljava/io/File;

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mMapDir:Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".jpg"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sget-object p0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {p2, v0, p0}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;)Z

    :cond_0
    return-void
.end method

.method private static final showTitlePopup$lambda$0$0$3(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Ljava/lang/String;Lcom/sma/smartv3/model/OffLineGenerateFileVo;)Lkotlin/Unit;
    .locals 1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/sma/smartv3/model/OffLineGenerateFileVo;->getDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p2}, Lcom/sma/smartv3/model/OffLineGenerateFileVo;->getDownloadUrl()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2, p1}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->downloadMap(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isInProgress:Z

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final startLocation()V
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/util/UtilsKt;->X1()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->locationServerRemind()V

    return-void

    :cond_0
    const-string v0, "LOCATION"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->requestLocationPermission()V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->onLocationClient()V

    return-void
.end method

.method private final stopLocationClient()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mLocationClient:Lcom/android/mltcode/paycertificationapi/ms;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/ms;->I0IIOi()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final addOffLineMap()V
    .locals 0

    return-void
.end method

.method public final calculateDistanceGoogle(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)F
    .locals 1
    .param p1    # Lcom/google/android/gms/maps/model/LatLng;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/maps/model/LatLng;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "point1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "point2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lcom/google/maps/android/SphericalUtil;->computeDistanceBetween(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D

    move-result-wide p1

    double-to-float p1, p1

    return p1
.end method

.method public final getCurLatitude()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curLatitude:D

    return-wide v0
.end method

.method public final getCurLongitude()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curLongitude:D

    return-wide v0
.end method

.method public final getMMapDir()Ljava/io/File;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mMapDir:Ljava/io/File;

    return-object v0
.end method

.method public final getMMaskCoordinates()Lcom/sma/smartv3/view/MaskView$OXO1;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mMaskCoordinates:Lcom/sma/smartv3/view/MaskView$OXO1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mMaskCoordinates"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMStartIcon()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mStartIcon:I

    return v0
.end method

.method public final getMaxLatitude()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->maxLatitude:D

    return-wide v0
.end method

.method public final getMaxLongitude()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->maxLongitude:D

    return-wide v0
.end method

.method public final getMinLatitude()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->minLatitude:D

    return-wide v0
.end method

.method public final getMinLongitude()D
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->minLongitude:D

    return-wide v0
.end method

.method public final getTargetDistanceType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->targetDistanceType:I

    return v0
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
    .locals 5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setMaskView()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    const-string v1, "<get-mProgressButton>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f141051

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lcom/sma/smartv3/view/ProgressButton;->IiI10X(Lcom/sma/smartv3/view/ProgressButton;Ljava/lang/String;ZILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getSearchView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X1X1iOI;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/X1X1iOI;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final isInProgress()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isInProgress:Z

    return v0
.end method

.method public final isMapPauseResume()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isMapPauseResume:Z

    return v0
.end method

.method public final isNeedCalculateNumber()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isNeedCalculateNumber:I

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d008e

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 6
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 p1, -0x1

    if-ne p2, p1, :cond_3

    if-eqz p3, :cond_3

    const/4 p1, 0x2

    iput p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->targetDistanceType:I

    const/4 p1, 0x0

    iput p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isNeedCalculateNumber:I

    new-instance p1, Lcom/google/android/gms/maps/model/LatLng;

    const-string p2, "MAP_POINT_LAT"

    iget-wide v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curLatitude:D

    invoke-virtual {p3, p2, v0, v1}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    move-result-wide v0

    const-string p2, "MAP_POINT_LON"

    iget-wide v2, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curLongitude:D

    invoke-virtual {p3, p2, v2, v3}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    move-result-wide p2

    invoke-direct {p1, v0, v1, p2, p3}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    new-instance p2, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v0, p1, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    iget-wide v2, p1, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    invoke-direct {p2, v0, v1, v2, v3}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curLatLng:Lcom/google/android/gms/maps/model/LatLng;

    iget-boolean p2, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isInChinaMainland:Z

    const/4 p3, 0x0

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/baidu/mapapi/map/BaiduMap;->clear()V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mGoogleMap:Lcom/google/android/gms/maps/GoogleMap;

    if-nez p2, :cond_1

    const-string p2, "mGoogleMap"

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p2, p3

    :cond_1
    invoke-virtual {p2}, Lcom/google/android/gms/maps/GoogleMap;->clear()V

    :cond_2
    :goto_0
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onActivityResult$1;

    invoke-direct {v3, p0, p1, p3}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity$onActivityResult$1;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;Lcom/google/android/gms/maps/model/LatLng;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    :cond_3
    return-void
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isInProgress:Z

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->showTitlePopup()V

    return-void

    :cond_0
    const p1, 0x7f140d33

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/bestmafen/androidbase/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isInChinaMainland:Z

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/baidu/mapapi/map/TextureMapView;->showZoomControls(Z)V

    invoke-virtual {p1, v2}, Lcom/baidu/mapapi/map/TextureMapView;->showScaleControl(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/baidu/mapapi/map/TextureMapView;->getMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/baidu/mapapi/map/BaiduMap;->setCompassEnable(Z)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mBaiDuMap:Lcom/baidu/mapapi/map/BaiduMap;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->setMapColorScheme()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->startLocation()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/MapView;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iOIXI1II0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iOIXI1II0;-><init>(Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/maps/MapView;->getMapAsync(Lcom/google/android/gms/maps/OnMapReadyCallback;)V

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMTipTitle()Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    if-nez v0, :cond_3

    const v0, 0x7f140e7e

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    const v0, 0x7f140e80

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isInChinaMainland:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextureMapView;->onDestroy()V

    :cond_0
    return-void

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->onDestroy()V

    return-void
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isInChinaMainland:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextureMapView;->onPause()V

    :cond_0
    return-void

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isInChinaMainland:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMBMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/TextureMapView;->onResume()V

    :cond_0
    return-void

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->getMGMapView()Lcom/sma/smartv3/view/CustomGoogleMapView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/maps/MapView;->onResume()V

    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onTitleRightClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->addOffLineMap()V

    return-void
.end method

.method public final setCurLatitude(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curLatitude:D

    return-void
.end method

.method public final setCurLongitude(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->curLongitude:D

    return-void
.end method

.method public final setInProgress(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isInProgress:Z

    return-void
.end method

.method public final setMMaskCoordinates(Lcom/sma/smartv3/view/MaskView$OXO1;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/view/MaskView$OXO1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mMaskCoordinates:Lcom/sma/smartv3/view/MaskView$OXO1;

    return-void
.end method

.method public final setMStartIcon(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->mStartIcon:I

    return-void
.end method

.method public final setMapPauseResume(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isMapPauseResume:Z

    return-void
.end method

.method public final setMaxLatitude(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->maxLatitude:D

    return-void
.end method

.method public final setMaxLongitude(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->maxLongitude:D

    return-void
.end method

.method public final setMinLatitude(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->minLatitude:D

    return-void
.end method

.method public final setMinLongitude(D)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->minLongitude:D

    return-void
.end method

.method public final setNeedCalculateNumber(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->isNeedCalculateNumber:I

    return-void
.end method

.method public final setTargetDistanceType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/device/DownLoadMapsActivity;->targetDistanceType:I

    return-void
.end method
