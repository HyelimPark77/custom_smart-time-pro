.class public final Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;
.super Lcom/bestmafen/androidbase/list/BaseListActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/list/BaseListActivity<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# static fields
.field private static final COORDINATE_CONVERTER:Lcom/baidu/mapapi/utils/CoordinateConverter;

.field public static final Companion:Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private final format:Ljava/text/SimpleDateFormat;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mGpsInfo:Ljava/io/File;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mLatLngList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/baidu/mapapi/model/LatLng;",
            ">;"
        }
    .end annotation
.end field

.field private final mLocationInfoList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mMap$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mMapView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mPower:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->Companion:Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity$OXO1;

    new-instance v0, Lcom/baidu/mapapi/utils/CoordinateConverter;

    invoke-direct {v0}, Lcom/baidu/mapapi/utils/CoordinateConverter;-><init>()V

    sget-object v1, Lcom/baidu/mapapi/utils/CoordinateConverter$CoordType;->GPS:Lcom/baidu/mapapi/utils/CoordinateConverter$CoordType;

    invoke-virtual {v0, v1}, Lcom/baidu/mapapi/utils/CoordinateConverter;->from(Lcom/baidu/mapapi/utils/CoordinateConverter$CoordType;)Lcom/baidu/mapapi/utils/CoordinateConverter;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->COORDINATE_CONVERTER:Lcom/baidu/mapapi/utils/CoordinateConverter;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Ii0XXX1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Ii0XXX1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->mMapView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XiIOOX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XiIOOX;-><init>(Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->mMap$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->mLocationInfoList:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->mLatLngList:Ljava/util/List;

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMdd_HHmmss"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->format:Ljava/text/SimpleDateFormat;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "DEVICE_POWER"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->mPower:Ljava/lang/String;

    new-instance v0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity$XIi00iiXO;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;)Lcom/baidu/mapapi/map/BaiduMap;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->mMap_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;)Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;)Lcom/baidu/mapapi/map/TextureMapView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->mMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;)Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCOORDINATE_CONVERTER$cp()Lcom/baidu/mapapi/utils/CoordinateConverter;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->COORDINATE_CONVERTER:Lcom/baidu/mapapi/utils/CoordinateConverter;

    return-object v0
.end method

.method public static final synthetic access$getMContext(Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;)Landroid/app/Activity;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMGpsInfo$p(Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;)Ljava/io/File;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->mGpsInfo:Ljava/io/File;

    return-object p0
.end method

.method public static final synthetic access$getMLatLngList$p(Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->mLatLngList:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getMListAdapter(Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMLocationInfoList$p(Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->mLocationInfoList:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getMMap(Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;)Lcom/baidu/mapapi/map/BaiduMap;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->getMMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMPower$p(Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->mPower:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$setMPower$p(Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->mPower:Ljava/lang/String;

    return-void
.end method

.method private final getMMap()Lcom/baidu/mapapi/map/BaiduMap;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->mMap$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/BaiduMap;

    return-object v0
.end method

.method private final getMMapView()Lcom/baidu/mapapi/map/TextureMapView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->mMapView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/mapapi/map/TextureMapView;

    return-object v0
.end method

.method private static final mMapView_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;)Lcom/baidu/mapapi/map/TextureMapView;
    .locals 1

    const v0, 0x7f0a0746

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/baidu/mapapi/map/TextureMapView;

    return-object p0
.end method

.method private static final mMap_delegate$lambda$0(Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;)Lcom/baidu/mapapi/map/BaiduMap;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->getMMapView()Lcom/baidu/mapapi/map/TextureMapView;

    move-result-object p0

    invoke-virtual {p0}, Lcom/baidu/mapapi/map/TextureMapView;->getMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getFormat()Ljava/text/SimpleDateFormat;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->format:Ljava/text/SimpleDateFormat;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity$XIi00iiXO;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->format:Ljava/text/SimpleDateFormat;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "GPS_INFO_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".csv"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/uz0;->XIi00iiXO(Lcom/android/mltcode/paycertificationapi/sz0;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->mGpsInfo:Ljava/io/File;

    if-eqz p1, :cond_0

    const/4 v0, 0x2

    const-string v1, "Time,Power(%),snr1,snr2,snr3,snr4,snr5,snr6,snr7,snr8,mLatitude,mLongitude\n"

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, v0, v2}, Lcom/android/mltcode/paycertificationapi/iI0OiO;->IO(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic initItem(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/String;I)V

    return-void
.end method

.method public initItem(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/String;I)V
    .locals 1
    .param p1    # Lcom/android/mltcode/paycertificationapi/ug6;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p3, p3, 0x1

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ". "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const p3, 0x1020014

    .line 3
    invoke-virtual {p1, p3, p2}, Lcom/android/mltcode/paycertificationapi/ug6;->OII(ILjava/lang/String;)Lcom/android/mltcode/paycertificationapi/ug6;

    return-void
.end method

.method public initList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->mLocationInfoList:Ljava/util/List;

    return-object v0
.end method

.method public itemLayoutId()I
    .locals 1

    const v0, 0x7f0d0f6c

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0064

    return v0
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/DeveloperShowRealtimeMapAndLocationActivity$XIi00iiXO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method
