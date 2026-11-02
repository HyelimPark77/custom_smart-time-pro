.class public final Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSportRecordsDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordsDetailActivity.kt\ncom/sma/smartv3/ui/status/SportRecordsDetailActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1093:1\n19#2:1094\n15#2:1095\n255#3:1096\n255#3:1097\n255#3:1098\n255#3:1099\n104#4,9:1100\n113#4,3:1110\n99#4,3:1113\n104#4,9:1116\n113#4,3:1126\n99#4,3:1129\n1#5:1109\n1#5:1125\n*S KotlinDebug\n*F\n+ 1 SportRecordsDetailActivity.kt\ncom/sma/smartv3/ui/status/SportRecordsDetailActivity\n*L\n171#1:1094\n171#1:1095\n368#1:1096\n372#1:1097\n376#1:1098\n385#1:1099\n556#1:1100,9\n556#1:1110,3\n556#1:1113,3\n563#1:1116,9\n563#1:1126,3\n563#1:1129,3\n556#1:1109\n563#1:1125\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSportRecordsDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordsDetailActivity.kt\ncom/sma/smartv3/ui/status/SportRecordsDetailActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1093:1\n19#2:1094\n15#2:1095\n255#3:1096\n255#3:1097\n255#3:1098\n255#3:1099\n104#4,9:1100\n113#4,3:1110\n99#4,3:1113\n104#4,9:1116\n113#4,3:1126\n99#4,3:1129\n1#5:1109\n1#5:1125\n*S KotlinDebug\n*F\n+ 1 SportRecordsDetailActivity.kt\ncom/sma/smartv3/ui/status/SportRecordsDetailActivity\n*L\n171#1:1094\n171#1:1095\n368#1:1096\n372#1:1097\n376#1:1098\n385#1:1099\n556#1:1100,9\n556#1:1110,3\n556#1:1113,3\n563#1:1116,9\n563#1:1126,3\n563#1:1129,3\n556#1:1109\n563#1:1125\n*E\n"
    }
.end annotation


# instance fields
.field private activityData:Lcom/sma/smartv3/model/RecordActivityData;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final activityDataLl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final bottomView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final downloadGpxIb$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private isInChinaMainland:Z

.field private final ivAvatar$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private lineChart:Lcom/github/mikephil/charting/charts/LineChart;

.field private locationSmoothAlgorithm:Ljava/util/ArrayList;
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

.field private mBaiDuMapFragment:Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mGoogleMapFragment:Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mHeartRateDao:Lcom/sma/smartv3/db/dao/HeartRateDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mLocationDao:Lcom/sma/smartv3/db/dao/LocationDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mapPbRl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mapViewFrameLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final nestedScrollView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final nickName$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final otherDataLl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final pacePF$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rootViewAltitude$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rootViewHeartRate$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rootViewSpeed$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private setValue:Lcom/github/mikephil/charting/data/LineDataSet;

.field private final speedPf$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportName$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordAerobic$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordAltitude$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordAltitudeUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordAnaerobic$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordAvgHR$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordAvgPace$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordAvgPaceRl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordAvgPaceUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordAvgSpeed$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordAvgSpeedRl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordAvgSpeedUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordCD$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordCDUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordCR$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordCRUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordCadence$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordCadenceLl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordCalories$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordCaloriesLl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

.field private final sportRecordDistance$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordDistanceLl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordDistanceUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordFastestPace$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordFastestPaceRl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordFastestPaceUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordFastestSpeed$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordFastestSpeedRl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordFastestSpeedUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordFatBurning$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordMaxHR$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordPaceChartRl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordPauseTime$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordPauseTimeLl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordStep$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordStepLl$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordStrenuous$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportRecordWarmUp$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportStartTime$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sportTime$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private threshold:I

.field private thresholdMax:I

.field private final userProfile:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/n15;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/n15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/f15;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/f15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->mapViewFrameLayout$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/r15;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/r15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->mapPbRl$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/d25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/d25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->nestedScrollView$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/p25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/p25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->otherDataLl$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/x25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/x25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->bottomView$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/y25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/y25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->downloadGpxIb$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/z25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/z25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportTime$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/a35;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/a35;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportName$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/b35;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/b35;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportStartTime$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/y15;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/y15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityDataLl$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/j25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/j25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordPauseTime$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/u25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/u25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordPauseTimeLl$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/f35;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/f35;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordStep$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/g35;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/g35;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordStepLl$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/h35;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/h35;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCadence$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i35;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/i35;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCadenceLl$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/j35;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/j35;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordDistance$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/d15;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/d15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordDistanceLl$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/e15;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/e15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCalories$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/g15;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/g15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCaloriesLl$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/h15;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/h15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordDistanceUnit$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i15;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/i15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->ivAvatar$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/j15;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/j15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->nickName$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/k15;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/k15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->rootViewHeartRate$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/l15;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/l15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordMaxHR$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/m15;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/m15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAvgHR$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/o15;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/o15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordStrenuous$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/p15;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/p15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAnaerobic$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/q15;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/q15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAerobic$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/s15;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/s15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordFatBurning$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/t15;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/t15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordWarmUp$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/u15;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/u15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->rootViewSpeed$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/v15;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/v15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->speedPf$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/w15;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/w15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAvgSpeed$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/x15;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/x15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAvgSpeedRl$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/z15;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/z15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordFastestSpeedRl$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/a25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/a25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordFastestSpeed$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/b25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/b25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->pacePF$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/c25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/c25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAvgPaceRl$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/e25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/e25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordFastestPaceRl$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/f25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/f25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAvgPace$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/g25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/g25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordFastestPace$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/h25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/h25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAvgSpeedUnit$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/i25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordFastestSpeedUnit$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/k25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/k25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAvgPaceUnit$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/l25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/l25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordFastestPaceUnit$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/m25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/m25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->rv$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/n25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/n25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordPaceChartRl$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/o25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/o25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->rootViewAltitude$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/q25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/q25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAltitude$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/r25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/r25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCR$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/s25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/s25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCD$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/t25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/t25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAltitudeUnit$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/v25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/v25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCRUnit$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/w25;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/w25;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCDUnit$delegate:Lkotlin/Lazy;

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

    iput-object v2, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    new-instance v1, Lcom/sma/smartv3/model/RecordActivityData;

    invoke-direct {v1}, Lcom/sma/smartv3/model/RecordActivityData;-><init>()V

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    sget-object v1, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/AppDatabase;->locationDao()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object v2

    iput-object v2, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->mLocationDao:Lcom/sma/smartv3/db/dao/LocationDao;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/AppDatabase;->heartRateDao()Lcom/sma/smartv3/db/dao/HeartRateDao;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->mHeartRateDao:Lcom/sma/smartv3/db/dao/HeartRateDao;

    const/4 v1, 0x5

    iput v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->threshold:I

    const/16 v1, 0xb

    iput v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->thresholdMax:I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->locationSmoothAlgorithm:Ljava/util/ArrayList;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->bottomView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordDistance_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCD_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityDataLl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;ILandroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-static/range {p0 .. p8}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->share$lambda$1(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;ILandroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static synthetic IO0II0i(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->delete$lambda$0$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic IXI(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAvgHR_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IXOIIIO(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordFastestPace_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IXXOO(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/FrameLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->mapViewFrameLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/FrameLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Ii0X0X(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAltitudeUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Ii0i(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->rv_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Ii1iii0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportName_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IiiXiI0I(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAvgSpeedRl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O001I(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAvgPaceRl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordDistanceUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O1O(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAerobic_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordPaceChartRl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFRegular;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->pacePF_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFRegular;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OO(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFRegular;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->speedPf_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFRegular;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->downloadGpxIb_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX110i(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordPauseTimeLl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordFastestPaceUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X00XIX1(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordWarmUp_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X00Xi1X(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->nickName_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportTime_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCaloriesLl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0i1O(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCadence_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordFastestSpeedUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X100O(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAvgPace_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X11I(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAltitude_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X11iII1O1(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordStrenuous_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1IX(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCR_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->showMapContent$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    return-void
.end method

.method public static synthetic XO0X10iO(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAvgSpeedUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOIX(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordFatBurning_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOX0O0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordDistanceLl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOXiX0(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;ILandroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-static/range {p0 .. p8}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->share$lambda$0(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;ILandroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordStepLl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX1Oi(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->rootViewAltitude_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXIIO1i11(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->otherDataLl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXO(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordMaxHR_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXX11i(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->rootViewSpeed_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXiIiX10(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordFastestSpeedRl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCadenceLl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordFastestSpeed_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method private static final activityDataLl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a006e

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final bottomView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0163

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final delete$lambda$0$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Z
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-nez v0, :cond_0

    const-string v0, "sportRecordData"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {v0}, Lcom/sma/smartv3/model/SportRecordDataKt;->deleteSportRecord(Lcom/sma/smartv3/model/SportRecordData;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final downloadGpxIb_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a0323

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final getActivityDataLl()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityDataLl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getBottomView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->bottomView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getDownloadGpxIb()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->downloadGpxIb$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getIvAvatar()Lcom/sma/smartv3/view/ImageViewRound;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->ivAvatar$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/ImageViewRound;

    return-object v0
.end method

.method private final getMapPbRl()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->mapPbRl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private final getMapViewFrameLayout()Landroid/widget/FrameLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->mapViewFrameLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    return-object v0
.end method

.method private final getNestedScrollView()Landroidx/core/widget/NestedScrollView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->nestedScrollView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/widget/NestedScrollView;

    return-object v0
.end method

.method private final getNickName()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->nickName$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getOtherDataLl()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->otherDataLl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getPacePF()Lcom/sma/smartv3/view/text/PFRegular;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->pacePF$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFRegular;

    return-object v0
.end method

.method private final getPaceUnit()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x7f14108c

    return v0

    :cond_0
    const v0, 0x7f14108e

    return v0
.end method

.method private final getRootView()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private final getRootViewAltitude()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->rootViewAltitude$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getRootViewHeartRate()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->rootViewHeartRate$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getRootViewSpeed()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->rootViewSpeed$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getRv()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->rv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private final getSpeedPf()Lcom/sma/smartv3/view/text/PFRegular;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->speedPf$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFRegular;

    return-object v0
.end method

.method private final getSpeedUnit()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x7f140d71

    return v0

    :cond_0
    const v0, 0x7f140f48

    return v0
.end method

.method private final getSportName()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportName$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getSportRecordAerobic()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAerobic$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getSportRecordAltitude()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAltitude$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getSportRecordAltitudeUnit()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAltitudeUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getSportRecordAnaerobic()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAnaerobic$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getSportRecordAvgHR()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAvgHR$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getSportRecordAvgPace()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAvgPace$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getSportRecordAvgPaceRl()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAvgPaceRl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private final getSportRecordAvgPaceUnit()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAvgPaceUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getSportRecordAvgSpeed()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAvgSpeed$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getSportRecordAvgSpeedRl()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAvgSpeedRl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private final getSportRecordAvgSpeedUnit()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAvgSpeedUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getSportRecordCD()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCD$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getSportRecordCDUnit()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCDUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getSportRecordCR()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCR$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getSportRecordCRUnit()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCRUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getSportRecordCadence()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCadence$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getSportRecordCadenceLl()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCadenceLl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private final getSportRecordCalories()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCalories$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getSportRecordCaloriesLl()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCaloriesLl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private final getSportRecordDistance()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordDistance$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getSportRecordDistanceLl()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordDistanceLl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private final getSportRecordDistanceUnit()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordDistanceUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getSportRecordFastestPace()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordFastestPace$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getSportRecordFastestPaceRl()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordFastestPaceRl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private final getSportRecordFastestPaceUnit()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordFastestPaceUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getSportRecordFastestSpeed()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordFastestSpeed$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getSportRecordFastestSpeedRl()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordFastestSpeedRl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private final getSportRecordFastestSpeedUnit()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordFastestSpeedUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getSportRecordFatBurning()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordFatBurning$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getSportRecordMaxHR()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordMaxHR$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getSportRecordPaceChartRl()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordPaceChartRl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getSportRecordPauseTime()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordPauseTime$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getSportRecordPauseTimeLl()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordPauseTimeLl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private final getSportRecordStep()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordStep$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getSportRecordStepLl()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordStepLl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private final getSportRecordStrenuous()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordStrenuous$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getSportRecordWarmUp()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordWarmUp$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getSportStartTime()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportStartTime$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getSportTime()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportTime$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->rootViewHeartRate_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i0X000X0O(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportStartTime_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i11I(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordStep_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iI(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCRUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iIXi1iiXI(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->mapPbRl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/ImageViewRound;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->ivAvatar_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOO1ii1(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAvgSpeed_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordPauseTime_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOiXi11II(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCalories_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordCDUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX1O1(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAvgPaceUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iXiX011(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordFastestPaceRl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iXiiiO(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordAnaerobic_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iiiO(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroidx/core/widget/NestedScrollView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->nestedScrollView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroidx/core/widget/NestedScrollView;

    move-result-object p0

    return-object p0
.end method

.method private static final ivAvatar_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/ImageViewRound;
    .locals 1

    const v0, 0x7f0a05fe

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/ImageViewRound;

    return-object p0
.end method

.method private final localFindLocation(Ljava/util/ArrayList;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->mLocationDao:Lcom/sma/smartv3/db/dao/LocationDao;

    iget-object v3, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    const/4 v4, 0x0

    const-string v5, "sportRecordData"

    if-nez v3, :cond_0

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v4

    :cond_0
    invoke-virtual {v3}, Lcom/sma/smartv3/model/SportRecordData;->getMStartTime()J

    move-result-wide v6

    iget-object v3, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-nez v3, :cond_1

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v4, v3

    :goto_0
    invoke-virtual {v4}, Lcom/sma/smartv3/model/SportRecordData;->getMEndTime()J

    move-result-wide v3

    invoke-interface {v2, v6, v7, v3, v4}, Lcom/sma/smartv3/db/dao/LocationDao;->getLocation(JJ)Ljava/util/List;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x2

    if-lt v3, v4, :cond_5

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/Location;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Location;->getMSource()I

    move-result v4

    if-ne v4, v5, :cond_2

    const/4 v5, 0x0

    :cond_3
    iget-boolean v3, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->isInChinaMainland:Z

    if-eqz v3, :cond_4

    if-eqz v5, :cond_4

    new-instance v3, Lcom/baidu/mapapi/utils/CoordinateConverter;

    invoke-direct {v3}, Lcom/baidu/mapapi/utils/CoordinateConverter;-><init>()V

    sget-object v4, Lcom/baidu/mapapi/utils/CoordinateConverter$CoordType;->GPS:Lcom/baidu/mapapi/utils/CoordinateConverter$CoordType;

    invoke-virtual {v3, v4}, Lcom/baidu/mapapi/utils/CoordinateConverter;->from(Lcom/baidu/mapapi/utils/CoordinateConverter$CoordType;)Lcom/baidu/mapapi/utils/CoordinateConverter;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/Location;

    new-instance v5, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Location;->getMLatitude()F

    move-result v6

    float-to-double v6, v6

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Location;->getMLongitude()F

    move-result v8

    float-to-double v8, v8

    invoke-direct {v5, v6, v7, v8, v9}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-virtual {v3, v5}, Lcom/baidu/mapapi/utils/CoordinateConverter;->coord(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/utils/CoordinateConverter;

    move-result-object v5

    invoke-virtual {v5}, Lcom/baidu/mapapi/utils/CoordinateConverter;->convert()Lcom/baidu/mapapi/model/LatLng;

    move-result-object v5

    new-instance v6, Lcom/sma/smartv3/model/CustomLatLng;

    iget-wide v7, v5, Lcom/baidu/mapapi/model/LatLng;->latitude:D

    iget-wide v9, v5, Lcom/baidu/mapapi/model/LatLng;->longitude:D

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Location;->getMTime()J

    move-result-wide v11

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Location;->getMAltitude()I

    move-result v13

    const/16 v15, 0x10

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v6 .. v16}, Lcom/sma/smartv3/model/CustomLatLng;-><init>(DDJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/db/entity/Location;

    new-instance v4, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Location;->getMLatitude()F

    move-result v5

    float-to-double v5, v5

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Location;->getMLongitude()F

    move-result v7

    float-to-double v7, v7

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Location;->getMTime()J

    move-result-wide v9

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Location;->getMAltitude()I

    move-result v11

    const/16 v13, 0x10

    const/4 v14, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v4 .. v14}, Lcom/sma/smartv3/model/CustomLatLng;-><init>(DDJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    iget-object v2, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->locationSmoothAlgorithm:Ljava/util/ArrayList;

    invoke-direct/range {p0 .. p1}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->locationSmoothAlgorithm(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->locationSmoothAlgorithm:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->showMapContent(Ljava/util/ArrayList;)V

    return-void
.end method

.method private final locationSmoothAlgorithm(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Lcom/sma/smartv3/model/CustomLatLng;

    const/4 v14, 0x0

    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v4

    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v6

    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v8}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v8

    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v10}, Lcom/sma/smartv3/model/CustomLatLng;->getAltitude()I

    move-result v10

    const/16 v12, 0x10

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v3 .. v13}, Lcom/sma/smartv3/model/CustomLatLng;-><init>(DDJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Lcom/sma/smartv3/model/CustomLatLng;

    const/16 v24, 0x10

    const/16 v25, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v15 .. v25}, Lcom/sma/smartv3/model/CustomLatLng;-><init>(DDJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v4

    move v5, v14

    :goto_0
    if-ge v5, v4, :cond_3

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "get(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v7

    invoke-virtual {v15}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v9

    cmpg-double v7, v7, v9

    if-nez v7, :cond_0

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v7

    invoke-virtual {v15}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v9

    cmpg-double v7, v7, v9

    if-nez v7, :cond_0

    invoke-virtual {v3}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Lcom/sma/smartv3/model/CustomLatLng;->setLongitude(D)V

    invoke-virtual {v3}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Lcom/sma/smartv3/model/CustomLatLng;->setLatitude(D)V

    move/from16 v21, v4

    move/from16 v20, v5

    move v13, v14

    goto/16 :goto_2

    :cond_0
    new-instance v7, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v8

    invoke-virtual {v3}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v10

    invoke-direct {v7, v8, v9, v10, v11}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    new-instance v8, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v9

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v11

    invoke-direct {v8, v9, v10, v11, v12}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-static {v7, v8}, Lcom/baidu/mapapi/utils/DistanceUtil;->getDistance(Lcom/baidu/mapapi/model/LatLng;Lcom/baidu/mapapi/model/LatLng;)D

    move-result-wide v7

    const/16 v9, 0x64

    int-to-double v9, v9

    mul-double/2addr v7, v9

    invoke-static {v7, v8}, Lcom/android/mltcode/paycertificationapi/mc0;->iIi1(D)I

    move-result v7

    int-to-float v7, v7

    const/high16 v8, 0x42c80000    # 100.0f

    div-float/2addr v7, v8

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v8

    invoke-virtual {v3}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v10

    sub-long/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Math;->abs(J)J

    move-result-wide v8

    const/16 v10, 0x3e8

    int-to-long v10, v10

    div-long/2addr v8, v10

    long-to-float v8, v8

    div-float v8, v7, v8

    iget v9, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->threshold:I

    iget v10, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->thresholdMax:I

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v11

    move-object/from16 v16, v15

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v14

    move-wide/from16 v18, v14

    invoke-virtual {v3}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v13

    move v15, v4

    move/from16 v20, v5

    invoke-virtual {v3}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v21, v15

    const-string v15, "secondSpeed = "

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v15, " "

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, "\uff0c"

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v7, " ---> "

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v7, ","

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v9, v18

    invoke-virtual {v1, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v9, " --- "

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->threshold:I

    int-to-float v1, v1

    cmpl-float v1, v8, v1

    if-ltz v1, :cond_2

    const-string v1, "secondSpeed process"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->thresholdMax:I

    int-to-float v4, v1

    cmpl-float v4, v8, v4

    if-ltz v4, :cond_1

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v4

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v9

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v11

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "give up "

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " longitude="

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ",latitude="

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ",time="

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v4

    invoke-virtual {v6, v4, v5}, Lcom/sma/smartv3/model/CustomLatLng;->setLongitude(D)V

    invoke-virtual {v3}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v4

    invoke-virtual {v6, v4, v5}, Lcom/sma/smartv3/model/CustomLatLng;->setLatitude(D)V

    move-object/from16 v15, v16

    :goto_1
    const/4 v13, 0x0

    goto :goto_2

    :cond_1
    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v4

    move-object/from16 v15, v16

    invoke-virtual {v15, v4, v5}, Lcom/sma/smartv3/model/CustomLatLng;->setLatitude(D)V

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v4

    invoke-virtual {v15, v4, v5}, Lcom/sma/smartv3/model/CustomLatLng;->setLongitude(D)V

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v4

    invoke-virtual {v15, v4, v5}, Lcom/sma/smartv3/model/CustomLatLng;->setTime(J)V

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getAltitude()I

    move-result v1

    invoke-virtual {v15, v1}, Lcom/sma/smartv3/model/CustomLatLng;->setAltitude(I)V

    invoke-virtual {v3}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v4

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v7

    add-double/2addr v4, v7

    const/4 v1, 0x2

    int-to-double v7, v1

    div-double/2addr v4, v7

    invoke-virtual {v6, v4, v5}, Lcom/sma/smartv3/model/CustomLatLng;->setLongitude(D)V

    invoke-virtual {v3}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v4

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v9

    add-double/2addr v4, v9

    div-double/2addr v4, v7

    invoke-virtual {v6, v4, v5}, Lcom/sma/smartv3/model/CustomLatLng;->setLatitude(D)V

    goto :goto_1

    :cond_2
    move-object/from16 v15, v16

    const-string v1, "secondSpeed No process"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const-wide/16 v4, 0x0

    invoke-virtual {v15, v4, v5}, Lcom/sma/smartv3/model/CustomLatLng;->setLatitude(D)V

    invoke-virtual {v15, v4, v5}, Lcom/sma/smartv3/model/CustomLatLng;->setLongitude(D)V

    const-wide/16 v4, 0x0

    invoke-virtual {v15, v4, v5}, Lcom/sma/smartv3/model/CustomLatLng;->setTime(J)V

    const/4 v13, 0x0

    invoke-virtual {v15, v13}, Lcom/sma/smartv3/model/CustomLatLng;->setAltitude(I)V

    :goto_2
    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/sma/smartv3/model/CustomLatLng;->setLatitude(D)V

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/sma/smartv3/model/CustomLatLng;->setLongitude(D)V

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/sma/smartv3/model/CustomLatLng;->setTime(J)V

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getAltitude()I

    move-result v1

    invoke-virtual {v3, v1}, Lcom/sma/smartv3/model/CustomLatLng;->setAltitude(I)V

    new-instance v22, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v23

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v25

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v27

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getAltitude()I

    move-result v29

    const/16 v31, 0x10

    const/16 v32, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v22 .. v32}, Lcom/sma/smartv3/model/CustomLatLng;-><init>(DDJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v22

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v20, 0x1

    move-object/from16 v1, p1

    move v14, v13

    move/from16 v4, v21

    goto/16 :goto_0

    :cond_3
    return-object v2
.end method

.method private static final mapPbRl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    const v0, 0x7f0a0745

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final mapViewFrameLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/FrameLayout;
    .locals 1

    const v0, 0x7f0a0747

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/FrameLayout;

    return-object p0
.end method

.method private static final nestedScrollView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroidx/core/widget/NestedScrollView;
    .locals 1

    const v0, 0x7f0a088a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/core/widget/NestedScrollView;

    return-object p0
.end method

.method private static final nickName_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0895

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final otherDataLl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a08e1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final pacePF_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFRegular;
    .locals 1

    const v0, 0x7f0a08e8

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFRegular;

    return-object p0
.end method

.method private static final rootViewAltitude_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a09b1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final rootViewHeartRate_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a09b2

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final rootViewSpeed_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a09b3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    const v0, 0x7f0a09b0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final rv_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    const v0, 0x7f0a09c1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private static final share$lambda$0(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;ILandroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/graphics/Bitmap;)V
    .locals 2

    iget v0, p0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-virtual {p8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget-object p0, p4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object p4, p0

    check-cast p4, Landroid/graphics/Bitmap;

    iget-object p0, p5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object p5, p0

    check-cast p5, Landroid/graphics/Bitmap;

    iget-object p0, p7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object p7, p0

    check-cast p7, Landroid/graphics/Bitmap;

    move-object p0, p1

    move p1, p2

    move p2, v0

    invoke-direct/range {p0 .. p8}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->spliceBitmapAndShare(IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method private static final share$lambda$1(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;ILandroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/graphics/Bitmap;)V
    .locals 2

    iget v0, p0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    if-eqz p8, :cond_0

    invoke-virtual {p8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    iput v0, p0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget-object p0, p4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object p4, p0

    check-cast p4, Landroid/graphics/Bitmap;

    iget-object p0, p5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object p5, p0

    check-cast p5, Landroid/graphics/Bitmap;

    iget-object p0, p7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object p7, p0

    check-cast p7, Landroid/graphics/Bitmap;

    move-object p0, p1

    move p1, p2

    move p2, v0

    invoke-direct/range {p0 .. p8}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->spliceBitmapAndShare(IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method private final showActivityData()V
    .locals 7

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    const/4 v1, 0x0

    const-string v2, "sportRecordData"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/model/SportRecordData;->getMSource()I

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    invoke-virtual {v0}, Lcom/sma/smartv3/model/SportRecordData;->getMStartTime()J

    move-result-wide v3

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-nez v0, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_2
    invoke-virtual {v0}, Lcom/sma/smartv3/model/SportRecordData;->getMEndTime()J

    move-result-wide v5

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    invoke-static {v3, v4, v5, v6, v0}, Lcom/sma/smartv3/model/SportRecordDataKt;->sportRecordActivity(JJI)Lcom/sma/smartv3/model/RecordActivityData;

    move-result-object v0

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-nez v0, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_4
    invoke-virtual {v0}, Lcom/sma/smartv3/model/SportRecordData;->getMStartTime()J

    move-result-wide v3

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-nez v0, :cond_5

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_5
    invoke-virtual {v0}, Lcom/sma/smartv3/model/SportRecordData;->getMEndTime()J

    move-result-wide v5

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    invoke-static {v3, v4, v5, v6, v0}, Lcom/sma/smartv3/model/SportRecordDataKt;->sportRecordWorkout(JJI)Lcom/sma/smartv3/model/RecordActivityData;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportTime()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMSportTimeStr()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportName()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-nez v4, :cond_6

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v1

    :cond_6
    invoke-static {v3, v4}, Lcom/sma/smartv3/model/SportRecordDataKt;->getWorkoutName(Landroid/content/Context;Lcom/sma/smartv3/model/SportRecordData;)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportStartTime()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-nez v3, :cond_7

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_7
    move-object v1, v3

    :goto_1
    invoke-static {v1}, Lcom/sma/smartv3/model/SportRecordDataKt;->getSportStartTime(Lcom/sma/smartv3/model/SportRecordData;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/RecordActivityData;->getMPauseTimeTotal()Ljava/lang/String;

    move-result-object v0

    const-string v1, "00:00:00"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordPauseTimeLl()Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :cond_8
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordPauseTime()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/RecordActivityData;->getMPauseTimeTotal()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/RecordActivityData;->getMStepTotal()I

    move-result v0

    const-string v1, "0"

    if-gtz v0, :cond_9

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordStep()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    :cond_9
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordStep()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/RecordActivityData;->getMStepTotal()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_3
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/RecordActivityData;->getMDistanceTotal()F

    move-result v0

    float-to-double v2, v0

    const-wide/16 v4, 0x0

    cmpg-double v0, v2, v4

    if-gtz v0, :cond_a

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordDistance()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    const-string v2, "0.0"

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    :cond_a
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordDistance()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/RecordActivityData;->getMDistanceTotal()F

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_4
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordDistanceUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v2

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/RecordActivityData;->getMCalorieTotal()I

    move-result v0

    if-gtz v0, :cond_b

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordCalories()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    :cond_b
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordCalories()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/RecordActivityData;->getMCalorieTotal()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_5
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/RecordActivityData;->getMSpm()I

    move-result v0

    if-gtz v0, :cond_c

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordCadence()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_6

    :cond_c
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordCadence()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/RecordActivityData;->getMSpm()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_6
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getNickName()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getNickname()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->OIi0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getIvAvatar()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object v1

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageURI(Landroid/net/Uri;)V

    return-void

    :cond_d
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getIvAvatar()Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final showAltitudeData()V
    .locals 9

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->mLocationDao:Lcom/sma/smartv3/db/dao/LocationDao;

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    const/4 v2, 0x0

    const-string v3, "sportRecordData"

    if-nez v1, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    invoke-virtual {v1}, Lcom/sma/smartv3/model/SportRecordData;->getMStartTime()J

    move-result-wide v4

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-nez v1, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_1
    invoke-virtual {v1}, Lcom/sma/smartv3/model/SportRecordData;->getMEndTime()J

    move-result-wide v6

    invoke-interface {v0, v4, v5, v6, v7}, Lcom/sma/smartv3/db/dao/LocationDao;->getLocation(JJ)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/16 v4, 0x8

    const/4 v5, 0x0

    if-nez v1, :cond_5

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v6, 0x2

    if-ge v1, v6, :cond_2

    goto :goto_2

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getRootViewAltitude()Landroid/widget/LinearLayout;

    move-result-object v1

    iget-object v6, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-nez v6, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v2, v6

    :goto_0
    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordData;->getMMode()I

    move-result v2

    const/16 v3, 0xa

    if-eq v2, v3, :cond_4

    const/16 v3, 0xd

    if-eq v2, v3, :cond_4

    const/16 v3, 0x13

    if-eq v2, v3, :cond_4

    goto :goto_1

    :cond_4
    move v4, v5

    :goto_1
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    :cond_5
    :goto_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getRootViewAltitude()Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    :goto_3
    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    move v2, v5

    move v3, v2

    move v4, v3

    move v6, v4

    :goto_4
    if-ge v5, v1, :cond_a

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sma/smartv3/db/entity/Location;

    if-nez v5, :cond_6

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Location;->getMAltitude()I

    move-result v2

    goto :goto_5

    :cond_6
    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Location;->getMAltitude()I

    move-result v8

    if-ge v2, v8, :cond_7

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Location;->getMAltitude()I

    move-result v2

    :cond_7
    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Location;->getMAltitude()I

    move-result v8

    if-ge v6, v8, :cond_8

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Location;->getMAltitude()I

    move-result v8

    sub-int/2addr v8, v6

    add-int/2addr v3, v8

    goto :goto_5

    :cond_8
    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Location;->getMAltitude()I

    move-result v8

    if-le v6, v8, :cond_9

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Location;->getMAltitude()I

    move-result v8

    sub-int/2addr v6, v8

    add-int/2addr v4, v6

    :cond_9
    :goto_5
    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Location;->getMAltitude()I

    move-result v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_a
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordAltitude()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/RecordActivityData;->getMAltitude()I

    move-result v1

    if-lez v1, :cond_b

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/RecordActivityData;->getMAltitude()I

    move-result v2

    :cond_b
    iget-object v1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-static {v2, v1}, Lcom/android/mltcode/paycertificationapi/cp5;->iIXi1iiXI(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordCR()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-static {v3, v1}, Lcom/android/mltcode/paycertificationapi/cp5;->iIXi1iiXI(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordCD()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-static {v4, v1}, Lcom/android/mltcode/paycertificationapi/cp5;->iIXi1iiXI(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    if-nez v0, :cond_c

    const v0, 0x7f140e4e

    goto :goto_6

    :cond_c
    const v0, 0x7f141620

    :goto_6
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordAltitudeUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordCRUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordCDUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method private final showBaiDuMap(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/bestmafen/androidbase/base/BaseFragment;->Companion:Lcom/bestmafen/androidbase/base/BaseFragment$OXO1;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "mArg0"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mArg2"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v1, "mArg3"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-class p1, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;

    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    if-eqz p1, :cond_0

    check-cast p1, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->mBaiDuMapFragment:Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getNestedScrollView()Landroidx/core/widget/NestedScrollView;

    move-result-object v0

    const-string v1, "<get-nestedScrollView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->setOnMapTouchListener(Landroidx/core/widget/NestedScrollView;)V

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->mBaiDuMapFragment:Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const v1, 0x7f0a0747

    invoke-virtual {p1, v1, v0}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.ui.status.BaiDuMapSportRecordFragment"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final showGoogleMap(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/bestmafen/androidbase/base/BaseFragment;->Companion:Lcom/bestmafen/androidbase/base/BaseFragment$OXO1;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "mArg0"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mArg2"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v1, "mArg3"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-class p1, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;

    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    if-eqz p1, :cond_0

    check-cast p1, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->mGoogleMapFragment:Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getNestedScrollView()Landroidx/core/widget/NestedScrollView;

    move-result-object v0

    const-string v1, "<get-nestedScrollView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->setOnMapTouchListener(Landroidx/core/widget/NestedScrollView;)V

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->mGoogleMapFragment:Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const v1, 0x7f0a0747

    invoke-virtual {p1, v1, v0}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.ui.status.GoogleMapSportRecordFragment"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final showHeartRateData()V
    .locals 24

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->mHeartRateDao:Lcom/sma/smartv3/db/dao/HeartRateDao;

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/RecordActivityData;->getMTimeList()Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/sma/smartv3/model/SportRecordDataKt;->sportRecordHeartRateDetail(Lcom/sma/smartv3/db/dao/HeartRateDao;Ljava/util/ArrayList;)Lcom/sma/smartv3/model/RecordDetailHeartRateData;

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    const-string v3, "sportRecordData"

    const/4 v4, 0x0

    if-nez v2, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v4

    :cond_0
    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordData;->getMEndTime()J

    move-result-wide v5

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-nez v2, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v4

    :cond_1
    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordData;->getMStartTime()J

    move-result-wide v7

    sub-long/2addr v5, v7

    const/16 v2, 0x3e8

    int-to-long v7, v2

    div-long/2addr v5, v7

    const/16 v2, 0x3c

    int-to-long v9, v2

    div-long/2addr v5, v9

    const-wide/16 v11, 0x1

    add-long/2addr v5, v11

    sget-object v2, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    iget-object v13, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    const-string v14, "lineChart"

    if-nez v13, :cond_2

    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v13, v4

    :cond_2
    invoke-virtual {v2, v13}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->XIi00iiXO(Lcom/github/mikephil/charting/charts/LineChart;)V

    iget-object v13, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez v13, :cond_3

    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v13, v4

    :cond_3
    invoke-virtual {v13}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v13

    const-string v15, "getAxisLeft(...)"

    invoke-static {v13, v15}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v15, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez v15, :cond_4

    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v15, v4

    :cond_4
    invoke-virtual {v15}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v15

    move-wide/from16 v16, v11

    const-string v11, "getAxisRight(...)"

    invoke-static {v15, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->getMMaxHR()I

    move-result v11

    int-to-float v11, v11

    const/high16 v12, 0x40a00000    # 5.0f

    add-float/2addr v11, v12

    move/from16 v18, v12

    invoke-virtual {v1}, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->getMMinHR()I

    move-result v12

    int-to-float v12, v12

    sub-float v12, v12, v18

    invoke-virtual {v2, v13, v15, v11, v12}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->IO(Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/components/YAxis;FF)V

    iget-object v11, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez v11, :cond_5

    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v11, v4

    :cond_5
    const/4 v12, 0x0

    invoke-virtual {v11, v12}, Lcom/github/mikephil/charting/charts/Chart;->setTouchEnabled(Z)V

    invoke-virtual {v11}, Lcom/github/mikephil/charting/charts/Chart;->getDescription()Lcom/android/mltcode/paycertificationapi/IOOI00X0I;

    move-result-object v13

    invoke-virtual {v13, v12}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v11}, Lcom/github/mikephil/charting/charts/Chart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v11

    invoke-virtual {v11, v12}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    iget-object v11, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez v11, :cond_6

    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v11, v4

    :cond_6
    invoke-virtual {v11}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v11

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v13, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez v13, :cond_7

    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v13, v4

    :cond_7
    invoke-virtual {v13}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v13

    const-string v14, "getContext(...)"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v11, v12, v13}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIi0(Lcom/github/mikephil/charting/components/XAxis;ZLandroid/content/Context;)V

    const/4 v2, 0x0

    invoke-virtual {v11, v2}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->i0X000X0O(F)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v11, v2}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->IXOIIIO(F)V

    long-to-float v2, v5

    invoke-virtual {v11, v2}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOiXi11II(F)V

    const/4 v2, 0x1

    invoke-static {v12, v2, v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->IXI(ZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v2

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    const-wide/16 v13, 0x0

    cmp-long v15, v13, v5

    if-gtz v15, :cond_9

    :goto_0
    iget-object v15, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-nez v15, :cond_8

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v15, v4

    :cond_8
    invoke-virtual {v15}, Lcom/sma/smartv3/model/SportRecordData;->getMStartTime()J

    move-result-wide v18

    mul-long v20, v13, v9

    mul-long v20, v20, v7

    move-wide/from16 v22, v5

    add-long v4, v18, v20

    invoke-static {v4, v5, v2}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "millis2String(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v12, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    cmp-long v4, v13, v22

    if-eqz v4, :cond_9

    add-long v13, v13, v16

    move-wide/from16 v5, v22

    const/4 v4, 0x0

    goto :goto_0

    :cond_9
    new-instance v2, Lcom/android/mltcode/paycertificationapi/q4;

    invoke-direct {v2, v12}, Lcom/android/mltcode/paycertificationapi/q4;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v11, v2}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Oi(Lcom/android/mltcode/paycertificationapi/he6;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordAvgHR()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    iget-object v3, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMAvgBpm()I

    move-result v3

    if-lez v3, :cond_a

    iget-object v3, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMAvgBpm()I

    move-result v3

    goto :goto_1

    :cond_a
    invoke-virtual {v1}, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->getMAvgHR()I

    move-result v3

    :goto_1
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordMaxHR()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    iget-object v3, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMMaxBpm()I

    move-result v3

    if-lez v3, :cond_b

    iget-object v3, v0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMMaxBpm()I

    move-result v3

    goto :goto_2

    :cond_b
    invoke-virtual {v1}, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->getMMaxHR()I

    move-result v3

    :goto_2
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->getMHeartRateList()Ljava/util/ArrayList;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->showHeartRateFilterData(Ljava/util/List;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordStrenuous()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    invoke-virtual {v1}, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->getMStrenuous()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordAnaerobic()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    invoke-virtual {v1}, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->getMAnaerobic()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordAerobic()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    invoke-virtual {v1}, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->getMAerobic()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordFatBurning()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    invoke-virtual {v1}, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->getMFatBurning()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordWarmUp()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    invoke-virtual {v1}, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->getMWarmUp()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final showHeartRateFilterData(Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/HeartRate;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    const/4 v3, 0x0

    const-string v4, "sportRecordData"

    if-nez v2, :cond_1

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v3

    :cond_1
    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordData;->getMStartTime()J

    move-result-wide v5

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-nez v2, :cond_2

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v3, v2

    :goto_0
    invoke-virtual {v3}, Lcom/sma/smartv3/model/SportRecordData;->getMEndTime()J

    move-result-wide v7

    const-wide/32 v9, 0xea60

    invoke-static/range {v5 .. v10}, Lkotlin/internal/ProgressionUtilKt;->XO0O10(JJJ)J

    move-result-wide v2

    cmp-long v4, v5, v2

    const/4 v7, 0x0

    if-gtz v4, :cond_3

    :goto_1
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    new-instance v8, Lcom/sma/smartv3/model/HRMinuteData;

    invoke-direct {v8, v7, v7}, Lcom/sma/smartv3/model/HRMinuteData;-><init>(II)V

    invoke-interface {v1, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    cmp-long v4, v5, v2

    if-eqz v4, :cond_3

    const-wide/32 v8, 0xea60

    add-long/2addr v5, v8

    goto :goto_1

    :cond_3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/HeartRate;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sma/smartv3/model/HRMinuteData;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/HeartRate;->getMTime()J

    move-result-wide v10

    cmp-long v6, v10, v8

    if-gtz v6, :cond_5

    invoke-virtual {v5}, Lcom/sma/smartv3/model/HRMinuteData;->getTotal()I

    move-result v4

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v2

    add-int/2addr v4, v2

    invoke-virtual {v5, v4}, Lcom/sma/smartv3/model/HRMinuteData;->setTotal(I)V

    invoke-virtual {v5}, Lcom/sma/smartv3/model/HRMinuteData;->getNum()I

    move-result v2

    add-int/2addr v2, v3

    invoke-virtual {v5, v2}, Lcom/sma/smartv3/model/HRMinuteData;->setNum(I)V

    goto :goto_2

    :cond_6
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    move v2, v7

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/model/HRMinuteData;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/HRMinuteData;->getNum()I

    move-result v5

    const/high16 v6, 0x3f800000    # 1.0f

    if-eqz v5, :cond_9

    invoke-virtual {v4}, Lcom/sma/smartv3/model/HRMinuteData;->getTotal()I

    move-result v5

    if-eqz v5, :cond_9

    invoke-virtual {v4}, Lcom/sma/smartv3/model/HRMinuteData;->getTotal()I

    move-result v5

    invoke-virtual {v4}, Lcom/sma/smartv3/model/HRMinuteData;->getNum()I

    move-result v4

    div-int/2addr v5, v4

    new-instance v4, Lcom/github/mikephil/charting/data/Entry;

    int-to-float v8, v5

    invoke-direct {v4, v1, v8}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-ge v7, v5, :cond_7

    move v7, v5

    :cond_7
    if-nez v2, :cond_8

    move v2, v5

    :cond_8
    if-gt v3, v5, :cond_9

    if-ge v5, v2, :cond_9

    move v2, v5

    :cond_9
    add-float/2addr v1, v6

    goto :goto_3

    :cond_a
    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->showHeartRateUpdateChartData(Ljava/util/List;)V

    return-void
.end method

.method private final showHeartRateUpdateChartData(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/Entry;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    const-string v3, "lineChart"

    const/4 v4, 0x0

    if-nez v2, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v4

    :cond_0
    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v2

    const-string v5, "setValue"

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez v2, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v4

    :cond_1
    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v2

    check-cast v2, Lcom/android/mltcode/paycertificationapi/co;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/XOi0;->XXI()I

    move-result v2

    if-lez v2, :cond_7

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez v0, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v4

    :cond_2
    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/co;

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/XOi0;->OIX0iXi(I)Lcom/android/mltcode/paycertificationapi/IXIiiOXi;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/github/mikephil/charting/data/LineDataSet;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->setValue:Lcom/github/mikephil/charting/data/LineDataSet;

    if-nez v0, :cond_3

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v4

    :cond_3
    invoke-virtual {v0, p1}, Lcom/github/mikephil/charting/data/DataSet;->IOX1(Ljava/util/List;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->setValue:Lcom/github/mikephil/charting/data/LineDataSet;

    if-nez p1, :cond_4

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v4

    :cond_4
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->i0X1iIO()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez p1, :cond_5

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v4

    :cond_5
    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object p1

    check-cast p1, Lcom/android/mltcode/paycertificationapi/co;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/XOi0;->iX()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez p1, :cond_6

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v4

    :cond_6
    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->X0i1O()V

    goto/16 :goto_0

    :cond_7
    new-instance v2, Lcom/github/mikephil/charting/data/LineDataSet;

    const-string v6, ""

    invoke-direct {v2, p1, v6}, Lcom/github/mikephil/charting/data/LineDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    iput-object v2, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->setValue:Lcom/github/mikephil/charting/data/LineDataSet;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p1

    const v6, 0x7f060236

    invoke-static {p1, v6}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v2, p1}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->II1(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->setValue:Lcom/github/mikephil/charting/data/LineDataSet;

    if-nez p1, :cond_8

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v4

    :cond_8
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2, v6}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p1, v2}, Lcom/github/mikephil/charting/data/LineDataSet;->I00(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->setValue:Lcom/github/mikephil/charting/data/LineDataSet;

    if-nez p1, :cond_9

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v4

    :cond_9
    const/high16 v2, 0x40000000    # 2.0f

    invoke-virtual {p1, v2}, Lcom/android/mltcode/paycertificationapi/ho;->I1XII0X(F)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->setValue:Lcom/github/mikephil/charting/data/LineDataSet;

    if-nez p1, :cond_a

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v4

    :cond_a
    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {p1, v2}, Lcom/github/mikephil/charting/data/LineDataSet;->iXOII(F)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->setValue:Lcom/github/mikephil/charting/data/LineDataSet;

    if-nez p1, :cond_b

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v4

    :cond_b
    invoke-virtual {p1, v1}, Lcom/github/mikephil/charting/data/LineDataSet;->IOI0i0I(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->setValue:Lcom/github/mikephil/charting/data/LineDataSet;

    if-nez p1, :cond_c

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v4

    :cond_c
    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->XXI(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->setValue:Lcom/github/mikephil/charting/data/LineDataSet;

    if-nez p1, :cond_d

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v4

    :cond_d
    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/ho;->O1iXiI(Z)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p1

    const v2, 0x7f0816d1

    invoke-static {p1, v2}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const-string v2, "null cannot be cast to non-null type android.graphics.drawable.Drawable"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->setValue:Lcom/github/mikephil/charting/data/LineDataSet;

    if-nez v2, :cond_e

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v4

    :cond_e
    invoke-virtual {v2, p1}, Lcom/android/mltcode/paycertificationapi/ho;->I0i1OXiI(Landroid/graphics/drawable/Drawable;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/co;

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->setValue:Lcom/github/mikephil/charting/data/LineDataSet;

    if-nez v2, :cond_f

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v4

    :cond_f
    new-array v0, v0, [Lcom/android/mltcode/paycertificationapi/IiXO1XOi;

    aput-object v2, v0, v1

    invoke-direct {p1, v0}, Lcom/android/mltcode/paycertificationapi/co;-><init>([Lcom/android/mltcode/paycertificationapi/IiXO1XOi;)V

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/XOi0;->iI(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez v0, :cond_10

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v4

    :cond_10
    invoke-virtual {v0, p1}, Lcom/github/mikephil/charting/charts/Chart;->setData(Lcom/android/mltcode/paycertificationapi/XOi0;)V

    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez p1, :cond_11

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v4

    :cond_11
    const/16 v0, 0x3e8

    invoke-virtual {p1, v0}, Lcom/github/mikephil/charting/charts/Chart;->I0IIOi(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez p1, :cond_12

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_12
    move-object v4, p1

    :goto_1
    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method private final showLocation()V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->localFindLocation(Ljava/util/ArrayList;)V

    return-void
.end method

.method private final showMapContent(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->isInChinaMainland:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->showBaiDuMap(Ljava/util/ArrayList;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->showGoogleMap(Ljava/util/ArrayList;)V

    :goto_0
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/c35;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/c35;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    const-wide/16 v1, 0x3e8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getMapPbRl()Landroid/widget/RelativeLayout;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private static final showMapContent$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getMapViewFrameLayout()Landroid/widget/FrameLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getMapPbRl()Landroid/widget/RelativeLayout;

    move-result-object p0

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final showSpeedData()V
    .locals 12

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    const/4 v1, 0x0

    const-string v2, "sportRecordData"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/model/SportRecordData;->getMSource()I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/RecordActivityData;->getMTimeList()Ljava/util/ArrayList;

    move-result-object v0

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-nez v3, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    :cond_1
    invoke-virtual {v3}, Lcom/sma/smartv3/model/SportRecordData;->getMMode()I

    move-result v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v4

    invoke-static {v0, v3, v4}, Lcom/sma/smartv3/model/SportRecordDataKt;->sportRecordActivityDetailSpeed(Ljava/util/ArrayList;II)Lcom/sma/smartv3/model/RecordDetailSpeedData;

    move-result-object v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/RecordActivityData;->getMTimeList()Ljava/util/ArrayList;

    move-result-object v0

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-nez v3, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    :cond_3
    invoke-virtual {v3}, Lcom/sma/smartv3/model/SportRecordData;->getMMode()I

    move-result v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->locationSmoothAlgorithm:Ljava/util/ArrayList;

    invoke-static {v0, v3, v4, v5}, Lcom/sma/smartv3/model/SportRecordDataKt;->sportRecordWorkoutDetailSpeed(Ljava/util/ArrayList;IILjava/util/ArrayList;)Lcom/sma/smartv3/model/RecordDetailSpeedData;

    move-result-object v0

    :goto_0
    iget-object v3, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMSpeed()F

    move-result v3

    float-to-double v3, v3

    const-wide/16 v5, 0x0

    cmpg-double v3, v3, v5

    const-string v4, "0.0"

    if-gtz v3, :cond_4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordAvgSpeed()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_4
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordAvgSpeed()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v3

    iget-object v7, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v7}, Lcom/sma/smartv3/model/RecordActivityData;->getMSpeed()F

    move-result v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    invoke-virtual {v0}, Lcom/sma/smartv3/model/RecordDetailSpeedData;->getMFastestSpeed()F

    move-result v3

    iget-object v7, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v7}, Lcom/sma/smartv3/model/RecordActivityData;->getMSpeed()F

    move-result v7

    cmpg-float v3, v3, v7

    if-gez v3, :cond_5

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMSpeed()F

    move-result v3

    invoke-virtual {v0, v3}, Lcom/sma/smartv3/model/RecordDetailSpeedData;->setMFastestSpeed(F)V

    :cond_5
    invoke-virtual {v0}, Lcom/sma/smartv3/model/RecordDetailSpeedData;->getMFastestSpeed()F

    move-result v3

    float-to-double v7, v3

    cmpg-double v3, v7, v5

    if-gtz v3, :cond_6

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordFastestSpeed()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_6
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordFastestSpeed()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v3

    invoke-virtual {v0}, Lcom/sma/smartv3/model/RecordDetailSpeedData;->getMFastestSpeed()F

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSpeedUnit()I

    move-result v3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordAvgSpeedUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordFastestSpeedUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {v0}, Lcom/sma/smartv3/model/RecordDetailSpeedData;->getMPaceList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getPaceUnit()I

    move-result v3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordAvgPaceUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordFastestPaceUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(I)V

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    move v6, v5

    move v7, v6

    move v8, v7

    :goto_3
    const-string v9, "get(...)"

    if-ge v5, v3, :cond_b

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v9

    const/16 v10, 0x7530

    if-le v9, v10, :cond_7

    iget-object v9, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v9}, Lcom/sma/smartv3/model/RecordActivityData;->getMPace()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v0, v5, v9}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v9, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v9}, Lcom/sma/smartv3/model/RecordActivityData;->getMPace()I

    move-result v9

    :cond_7
    if-nez v5, :cond_8

    move v6, v9

    move v7, v6

    :cond_8
    if-le v6, v9, :cond_9

    move v6, v9

    :cond_9
    if-ge v7, v9, :cond_a

    move v7, v9

    :cond_a
    add-int/2addr v8, v9

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_b
    iget-object v3, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-nez v3, :cond_c

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_4

    :cond_c
    move-object v1, v3

    :goto_4
    invoke-virtual {v1}, Lcom/sma/smartv3/model/SportRecordData;->getMSource()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_10

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/RecordActivityData;->getMPace()I

    move-result v1

    if-lez v1, :cond_10

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordAvgPace()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMPace()I

    move-result v3

    iget-object v5, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v3, v5}, Lcom/android/mltcode/paycertificationapi/cp5;->Ii1iii0(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-nez v6, :cond_e

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_e

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordFastestPace()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMMinPace()I

    move-result v3

    if-lez v3, :cond_d

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMMinPace()I

    move-result v3

    :goto_5
    iget-object v5, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v5

    invoke-static {v3, v5}, Lcom/android/mltcode/paycertificationapi/cp5;->Ii1iii0(II)Ljava/lang/String;

    move-result-object v3

    goto :goto_6

    :cond_d
    iget-object v3, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMPace()I

    move-result v3

    goto :goto_5

    :goto_6
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_b

    :cond_e
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordFastestPace()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/RecordActivityData;->getMMinPace()I

    move-result v2

    if-lez v2, :cond_f

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/RecordActivityData;->getMMinPace()I

    move-result v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v3

    invoke-static {v2, v3}, Lcom/android/mltcode/paycertificationapi/cp5;->Ii1iii0(II)Ljava/lang/String;

    move-result-object v2

    goto :goto_7

    :cond_f
    invoke-static {v6}, Lcom/android/mltcode/paycertificationapi/cp5;->iXiiiO(I)Ljava/lang/String;

    move-result-object v2

    :goto_7
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_a

    :cond_10
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordFastestPace()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    invoke-static {v6}, Lcom/android/mltcode/paycertificationapi/cp5;->iXiiiO(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordAvgPace()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/RecordActivityData;->getMPace()I

    move-result v2

    if-lez v2, :cond_11

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/RecordActivityData;->getMPace()I

    move-result v2

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/cp5;->iXiiiO(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_9

    :cond_11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-nez v2, :cond_12

    move v8, v4

    goto :goto_8

    :cond_12
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    div-int/2addr v8, v2

    :goto_8
    invoke-static {v8}, Lcom/android/mltcode/paycertificationapi/cp5;->iXiiiO(I)Ljava/lang/String;

    move-result-object v2

    :goto_9
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_a
    move v2, v4

    :goto_b
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_14

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/RecordActivityData;->getMDistanceTotal()F

    move-result v1

    const/4 v3, 0x0

    cmpl-float v1, v1, v3

    if-lez v1, :cond_13

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/RecordActivityData;->getMPace()I

    move-result v1

    mul-int/lit8 v7, v1, 0x2

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/RecordActivityData;->getMDistanceTotal()F

    move-result v1

    float-to-int v1, v1

    if-ltz v1, :cond_14

    move v3, v4

    :goto_c
    iget-object v5, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/RecordActivityData;->getMPace()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eq v3, v1, :cond_14

    add-int/lit8 v3, v3, 0x1

    goto :goto_c

    :cond_13
    iget-object v1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/RecordActivityData;->getMPace()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_14
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v3

    :goto_d
    if-ge v4, v3, :cond_16

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    new-instance v6, Lcom/android/mltcode/paycertificationapi/b15;

    add-int/lit8 v4, v4, 0x1

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    int-to-float v10, v5

    int-to-float v11, v7

    div-float/2addr v10, v11

    if-eqz v2, :cond_15

    iget-object v11, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v11}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v11

    invoke-static {v5, v11}, Lcom/android/mltcode/paycertificationapi/cp5;->Ii1iii0(II)Ljava/lang/String;

    move-result-object v5

    goto :goto_e

    :cond_15
    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/cp5;->iXiiiO(I)Ljava/lang/String;

    move-result-object v5

    :goto_e
    invoke-direct {v6, v8, v10, v5}, Lcom/android/mltcode/paycertificationapi/b15;-><init>(Ljava/lang/String;FLjava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_16
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getRv()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance v2, Lcom/sma/smartv3/ui/status/SportRecordDetailSpeedAdapter;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "getContext(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v1, v3}, Lcom/sma/smartv3/ui/status/SportRecordDetailSpeedAdapter;-><init>(Ljava/util/ArrayList;Landroid/content/Context;)V

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private static final speedPf_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFRegular;
    .locals 1

    const v0, 0x7f0a0a73

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFRegular;

    return-object p0
.end method

.method private final spliceBitmapAndShare(IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
    .locals 4

    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, p2, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p2

    const-string v0, "createBitmap(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, p2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz p8, :cond_0

    invoke-virtual {v0, p8, v2, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-virtual {p8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p8

    const/high16 v3, 0x41f00000    # 30.0f

    invoke-static {v3}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v3

    sub-int/2addr p8, v3

    int-to-float p8, p8

    add-float/2addr p8, v2

    invoke-virtual {v0, p3, v2, p8, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p3, v2, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    move p8, v2

    :goto_0
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p3

    add-int/2addr p3, p1

    int-to-float p3, p3

    add-float/2addr p8, p3

    if-eqz p4, :cond_1

    invoke-virtual {v0, p4, v2, p8, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-virtual {p4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p3

    add-int/2addr p3, p1

    int-to-float p3, p3

    add-float/2addr p8, p3

    :cond_1
    if-eqz p5, :cond_2

    invoke-virtual {v0, p5, v2, p8, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-virtual {p5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p3

    add-int/2addr p3, p1

    int-to-float p3, p3

    add-float/2addr p8, p3

    :cond_2
    if-eqz p7, :cond_3

    invoke-virtual {v0, p7, v2, p8, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-virtual {p7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p3

    add-int/2addr p3, p1

    int-to-float p1, p3

    add-float/2addr p8, p1

    :cond_3
    invoke-virtual {v0, p6, v2, p8, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->OXO1:Lcom/android/mltcode/paycertificationapi/XIi1i01O;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p3

    invoke-virtual {p1, p3, p2}, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->XO0O10(Landroid/content/Context;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static synthetic spliceBitmapAndShare$default(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;ILjava/lang/Object;)V
    .locals 10

    move/from16 v0, p9

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v9, v0

    :goto_0
    move-object v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    goto :goto_1

    :cond_0
    move-object/from16 v9, p8

    goto :goto_0

    :goto_1
    invoke-direct/range {v1 .. v9}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->spliceBitmapAndShare(IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method private static final sportName_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0a9a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final sportRecordAerobic_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0aa7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sportRecordAltitudeUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0aab

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final sportRecordAltitude_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0aa9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sportRecordAnaerobic_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0aac

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sportRecordAvgHR_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0aae

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sportRecordAvgPaceRl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    const v0, 0x7f0a0ab1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final sportRecordAvgPaceUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0ab2

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final sportRecordAvgPace_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0ab0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sportRecordAvgSpeedRl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    const v0, 0x7f0a0ab4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final sportRecordAvgSpeedUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0ab5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final sportRecordAvgSpeed_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0ab3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sportRecordCDUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0ab8

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final sportRecordCD_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0ab6

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sportRecordCRUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0abb

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final sportRecordCR_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0ab9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sportRecordCadenceLl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    const v0, 0x7f0a0abd

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final sportRecordCadence_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0abc

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sportRecordCaloriesLl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    const v0, 0x7f0a0abf

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final sportRecordCalories_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0abe

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sportRecordDistanceLl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    const v0, 0x7f0a0ac1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final sportRecordDistanceUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0ac2

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final sportRecordDistance_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0ac0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sportRecordFastestPaceRl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    const v0, 0x7f0a0ac4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final sportRecordFastestPaceUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0ac5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final sportRecordFastestPace_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0ac3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sportRecordFastestSpeedRl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    const v0, 0x7f0a0ac7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final sportRecordFastestSpeedUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a0ac8

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final sportRecordFastestSpeed_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0ac6

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sportRecordFatBurning_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0ac9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sportRecordMaxHR_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0ace

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sportRecordPaceChartRl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a0ad0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final sportRecordPauseTimeLl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    const v0, 0x7f0a0ad2

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final sportRecordPauseTime_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0ad1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sportRecordStepLl_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    const v0, 0x7f0a0ad4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private static final sportRecordStep_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0ad3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sportRecordStrenuous_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0ad5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sportRecordWarmUp_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0ad7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sportStartTime_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0ade

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sportTime_delegate$lambda$0(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    const v0, 0x7f0a0ae2

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method


# virtual methods
.method public final delete(Landroid/view/View;)V
    .locals 4
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, p0, v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v0, 0x7f1403e4

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v3, "getString(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->iI(Ljava/lang/String;)V

    const v0, 0x7f14027f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/c15;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/c15;-><init>(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;)V

    const v1, 0x7f14034b

    invoke-virtual {p1, v1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getRootView()Landroid/widget/RelativeLayout;

    move-result-object v0

    const-string v1, "<get-rootView>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OIO1i;->I1XOi1(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public final downloadGpx(Landroid/view/View;)V
    .locals 11
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->locationSmoothAlgorithm:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_2

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OIX0iXi()Ljava/text/SimpleDateFormat;

    move-result-object p1

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "<?xml version=\"1.0\" encoding=\"UTF-8\"?><gpx creator=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getNickname()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' version=\"1.1\" xmlns=\'http://www.topografix.com/GPX/1/1\'><metadata><time>"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-nez v2, :cond_0

    const-string v2, "sportRecordData"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v2, 0x0

    :cond_0
    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordData;->getMStartTime()J

    move-result-wide v2

    int-to-long v4, v0

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "</time></metadata>"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "<trk><name>"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportName()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const-string v2, "</name><desc>"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v2, 0x7f140142

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "</desc><trkseg>"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->locationSmoothAlgorithm:Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    iget-object v6, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->locationSmoothAlgorithm:Ljava/util/ArrayList;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "get(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lcom/sma/smartv3/model/CustomLatLng;

    const-string v7, "<wpt lat=\'"

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v7

    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v7, "\' lon=\'"

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v8

    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v8, "\'><name>\""

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, "\"</name><ele>"

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getAltitude()I

    move-result v8

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, "</ele><time>"

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v9

    sub-long/2addr v9, v4

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {p1, v9}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "</time></wpt>"

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "<trkpt lat=\'"

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v9

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v9

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v7, "\'><ele>"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getAltitude()I

    move-result v7

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v6

    sub-long/2addr v6, v4

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {p1, v6}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "</time></trkpt>"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :cond_1
    const-string p1, "</trkseg></trk>"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "</gpx>"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/uz0;->O1O(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromString(Ljava/io/File;Ljava/lang/String;)Z

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "android.intent.extra.TEXT"

    const v2, 0x7f141230

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/uz0;->O1O(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/sz0;->XO0O10(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    const-string v1, "android.intent.extra.STREAM"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p1, "application/gpx"

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_2
    return-void
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

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg2()Landroid/os/Parcelable;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.sma.smartv3.model.SportRecordData"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/model/SportRecordData;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    const v0, 0x7f0a0acb

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/github/mikephil/charting/charts/LineChart;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    const/4 v1, 0x0

    const-string v2, "sportRecordData"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Lcom/sma/smartv3/model/SportRecordData;->getMMode()I

    move-result v0

    const/16 v3, 0x64

    const/16 v4, 0x8

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_0

    :pswitch_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordDistanceLl()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordCadenceLl()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getRootViewSpeed()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getRootViewAltitude()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :pswitch_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordStepLl()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordDistanceLl()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordCadenceLl()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getRootViewSpeed()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getRootViewAltitude()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :pswitch_3
    const/16 v0, 0xa

    iput v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->threshold:I

    iput v3, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->thresholdMax:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordStepLl()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordCadenceLl()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BaseBleCache;->getMAGpsType()I

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XOXOIX0Oi()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getSportRecordDistanceLl()Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getRootViewSpeed()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getRootViewAltitude()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :pswitch_4
    const/4 v0, 0x5

    iput v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->threshold:I

    iput v3, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->thresholdMax:I

    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getActivityDataLl()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const-string v3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-nez v3, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object v1, v3

    :goto_1
    invoke-virtual {v1}, Lcom/sma/smartv3/model/SportRecordData;->getMIsLocationEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getMapPbRl()Landroid/widget/RelativeLayout;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getDownloadGpxIb()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    const/high16 v1, 0x428c0000    # 70.0f

    invoke-static {v1}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v1

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getNestedScrollView()Landroidx/core/widget/NestedScrollView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f060789

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_2

    :cond_3
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getMapPbRl()Landroid/widget/RelativeLayout;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getDownloadGpxIb()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v3, "LOCATION_WHERE"

    invoke-virtual {v1, v3, v2}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->isInChinaMainland:Z

    const/high16 v1, 0x43b90000    # 370.0f

    invoke-static {v1}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v1

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getNestedScrollView()Landroidx/core/widget/NestedScrollView;

    move-result-object v0

    const v1, 0x7f06074b

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->showLocation()V

    :goto_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->showActivityData()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->showHeartRateData()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->showSpeedData()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->showAltitudeData()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_4
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0118

    return v0
.end method

.method public final onBack(Landroid/view/View;)V
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

.method public final share(Landroid/view/View;)V
    .locals 11
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    new-instance v8, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v8}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v5, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v6, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v6}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->OXO1:Lcom/android/mltcode/paycertificationapi/XIi1i01O;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getActivityDataLl()Landroid/widget/LinearLayout;

    move-result-object v3

    const-string v4, "<get-activityDataLl>(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->XIi00iiXO(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v4

    iget v3, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    add-int/2addr v3, v7

    iput v3, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getRootViewHeartRate()Landroid/widget/LinearLayout;

    move-result-object v3

    const-string v7, "<get-rootViewHeartRate>(...)"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getRootViewHeartRate()Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->XIi00iiXO(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v3

    iput-object v3, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    iget v7, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    add-int/2addr v7, v3

    iput v7, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getRootViewSpeed()Landroid/widget/LinearLayout;

    move-result-object v3

    const-string v7, "<get-rootViewSpeed>(...)"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getRootViewSpeed()Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->XIi00iiXO(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v3

    iput-object v3, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    iget v7, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    add-int/2addr v7, v3

    iput v7, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getRootViewAltitude()Landroid/widget/LinearLayout;

    move-result-object v3

    const-string v7, "<get-rootViewAltitude>(...)"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getRootViewAltitude()Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->XIi00iiXO(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v3

    iput-object v3, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    iget v7, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    add-int/2addr v7, v3

    iput v7, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getBottomView()Landroid/view/View;

    move-result-object v3

    const-string v7, "<get-bottomView>(...)"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->XIi00iiXO(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v7

    iget v0, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    add-int/2addr v0, v3

    iput v0, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const/high16 v0, 0x41000000    # 8.0f

    invoke-static {v0}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->getMapViewFrameLayout()Landroid/widget/FrameLayout;

    move-result-object v0

    const-string v9, "<get-mapViewFrameLayout>(...)"

    invoke-static {v0, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->mBaiDuMapFragment:Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;

    if-eqz v0, :cond_3

    new-instance v0, Lcom/android/mltcode/paycertificationapi/d35;

    move-object v2, p0

    invoke-direct/range {v0 .. v8}, Lcom/android/mltcode/paycertificationapi/d35;-><init>(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;ILandroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->mBaiDuMapFragment:Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/status/BaiDuMapSportRecordFragment;->getBaiDuMap()Lcom/baidu/mapapi/map/BaiduMap;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/baidu/mapapi/map/BaiduMap;->snapshot(Lcom/baidu/mapapi/map/BaiduMap$SnapshotReadyCallback;)V

    return-void

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->mGoogleMapFragment:Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;

    if-eqz v0, :cond_4

    new-instance v0, Lcom/android/mltcode/paycertificationapi/e35;

    move-object v2, p0

    invoke-direct/range {v0 .. v8}, Lcom/android/mltcode/paycertificationapi/e35;-><init>(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;ILandroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->mGoogleMapFragment:Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/status/GoogleMapSportRecordFragment;->getGoogleMap()Lcom/google/android/gms/maps/GoogleMap;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/GoogleMap;->snapshot(Lcom/google/android/gms/maps/GoogleMap$SnapshotReadyCallback;)V

    :cond_4
    return-void

    :cond_5
    iget v0, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget-object v1, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Bitmap;

    iget-object v5, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v5, Landroid/graphics/Bitmap;

    iget-object v6, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v6, Landroid/graphics/Bitmap;

    const/16 v9, 0x80

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v2, v4

    move-object v4, v1

    move v1, v3

    move-object v3, v2

    move-object v2, v7

    move-object v7, v6

    move-object v6, v2

    move v2, v0

    move-object v0, p0

    invoke-static/range {v0 .. v10}, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;->spliceBitmapAndShare$default(Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;ILjava/lang/Object;)V

    return-void
.end method
