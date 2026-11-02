.class public final Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;
.super Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$OXO1;,
        Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2Adapter;,
        Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$XIi00iiXO;,
        Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2ViewHolder;,
        Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationAdapter;,
        Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$iO;,
        Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSportDetailV2ChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailV2ChartFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailV2ChartFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1530:1\n1878#2,3:1531\n1878#2,3:1534\n99#3,7:1537\n106#3,3:1545\n79#3,7:1548\n109#3:1555\n99#3,7:1556\n106#3,3:1564\n79#3,7:1567\n109#3:1574\n1#4:1544\n1#4:1563\n*S KotlinDebug\n*F\n+ 1 SportDetailV2ChartFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailV2ChartFragment\n*L\n631#1:1531,3\n1458#1:1534,3\n300#1:1537,7\n300#1:1545,3\n300#1:1548,7\n300#1:1555\n1022#1:1556,7\n1022#1:1564,3\n1022#1:1567,7\n1022#1:1574\n300#1:1544\n1022#1:1563\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSportDetailV2ChartFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailV2ChartFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailV2ChartFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1530:1\n1878#2,3:1531\n1878#2,3:1534\n99#3,7:1537\n106#3,3:1545\n79#3,7:1548\n109#3:1555\n99#3,7:1556\n106#3,3:1564\n79#3,7:1567\n109#3:1574\n1#4:1544\n1#4:1563\n*S KotlinDebug\n*F\n+ 1 SportDetailV2ChartFragment.kt\ncom/sma/smartv3/ui/sport/SportDetailV2ChartFragment\n*L\n631#1:1531,3\n1458#1:1534,3\n300#1:1537,7\n300#1:1545,3\n300#1:1548,7\n300#1:1555\n1022#1:1556,7\n1022#1:1564,3\n1022#1:1567,7\n1022#1:1574\n300#1:1544\n1022#1:1563\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final ONE_KM:I = 0x3e8


# instance fields
.field private activityData:Lcom/sma/smartv3/model/RecordActivityData;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final colorsList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private isInChinaMainland:Z

.field private isWorkImage:Z

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

.field private final mAteLevel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCadenceAvgTitle$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCadenceMaxTitle$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCadenceTitle$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCadenceTitleUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mCadenceUnderstandSituation$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mDateSourcesTip$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mDeviceImg$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mDeviceName$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mDeviceQRCode$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mDeviceQRCodeLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mDeviceSources$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mPacePanelUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mPieChart$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSegmentationDetailsLL$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSegmentationRecyclerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSpeedPanelUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSpeedPerKilometer$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSpeedRecyclerTitle$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSpeedRecyclerUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSpeedRecyclerView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSportGoalProgressBar$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSportMaxV02$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSportMaxV02Level$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSportRecoveryTime$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSportRecoveryTimeEstimate$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSportTrainingLoad$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTrainingExperience$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTrainingExperienceResult$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTrainingExperienceResultImg$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTrainingExperienceResultTv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTrainingExperienceSelect$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTrainingExperienceSelect1$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTrainingExperienceSelect2$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTrainingExperienceSelect3$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTrainingExperienceSelect4$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTrainingExperienceSelect5$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTrainingPerformance$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private sportDetailV2Activity:Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private threshold:I

.field private thresholdMax:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->Companion:Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/rw4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/rw4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingPerformance$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/tw4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/tw4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mAteLevel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/fx4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/fx4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSportMaxV02$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/px4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/px4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSportMaxV02Level$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/qx4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/qx4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSportTrainingLoad$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/rx4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/rx4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSportGoalProgressBar$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/sx4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/sx4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSportRecoveryTime$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/tx4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/tx4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSportRecoveryTimeEstimate$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ux4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ux4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mPieChart$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/vx4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/vx4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSpeedPerKilometer$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/cx4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/cx4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSpeedRecyclerTitle$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/nx4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/nx4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSpeedRecyclerView$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->locationSmoothAlgorithm:Ljava/util/ArrayList;

    new-instance v0, Lcom/sma/smartv3/model/RecordActivityData;

    invoke-direct {v0}, Lcom/sma/smartv3/model/RecordActivityData;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/yx4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/yx4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSpeedRecyclerUnit$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/hy4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/hy4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mPacePanelUnit$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iy4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iy4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSpeedPanelUnit$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/jy4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/jy4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mCadenceTitle$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ky4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ky4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mCadenceTitleUnit$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ly4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ly4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mCadenceAvgTitle$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/my4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/my4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mCadenceMaxTitle$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/sw4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/sw4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperience$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uw4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/uw4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceSelect$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/vw4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/vw4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceSelect1$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ww4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ww4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceSelect2$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xw4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/xw4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceSelect3$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/yw4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/yw4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceSelect4$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zw4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/zw4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceSelect5$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ax4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ax4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceResult$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/bx4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/bx4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceResultImg$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/dx4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/dx4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceResultTv$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ex4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ex4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mDateSourcesTip$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/gx4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/gx4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mDeviceSources$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/hx4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/hx4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mDeviceImg$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ix4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ix4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mDeviceName$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/jx4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/jx4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mDeviceQRCode$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/kx4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/kx4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mDeviceQRCodeLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/lx4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/lx4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSegmentationDetailsLL$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/mx4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/mx4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSegmentationRecyclerView$delegate:Lkotlin/Lazy;

    const/4 v0, 0x5

    iput v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->threshold:I

    const/16 v0, 0xb

    iput v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->thresholdMax:I

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ox4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ox4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mCadenceUnderstandSituation$delegate:Lkotlin/Lazy;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->setLeftAxisGridDashedLine(Z)V

    const-string v0, "SportDetailV2ChartFragment"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    const v0, 0x7f06070f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v0, 0x7f060088

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const v0, 0x7f06053e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const v0, 0x7f06070e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const v0, 0x7f06008b

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const v0, 0x7f060089

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array/range {v1 .. v6}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->colorsList:Ljava/util/List;

    return-void
.end method

.method public static synthetic IO0II0i(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mCadenceMaxTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IO0iXO0O(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperience_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IX0IXOi(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mPacePanelUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IX1XiI(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceResultImg_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IXI(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSportTrainingLoad_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IXOIIIO(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mCadenceUnderstandSituation_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Ii0X0X(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mDeviceName_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Ii0i(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSpeedRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Ii1iii0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceSelect2_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IiiXiI0I(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSpeedPerKilometer_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O001I(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->trainingExperienceSelect$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O0O(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSportRecoveryTimeEstimate_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O0O0X0iOi(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->showQCCode$lambda$1(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic OO(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->showQCCode$lambda$0(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic OX110i(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->initView$lambda$1(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic Oi(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mDeviceQRCodeLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X00O0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mDeviceImg_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X00XIX1(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mCadenceTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X00Xi1X(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->initView$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    return-void
.end method

.method public static synthetic X0iO(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSpeedPanelUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceResult_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X100O(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->setTrainingPerformance$lambda$3(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X111IO(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceSelect4_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X11I(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mAteLevel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0X10iO(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSportMaxV02_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOIX(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSportRecoveryTime_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOO0XOOii(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->trainingExperienceSelect$lambda$3(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XOX0O0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceSelect5_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOXiX0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mDeviceSources_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX00i10X(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSpeedRecyclerTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX1Oi(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSpeedRecyclerUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXO(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->trainingExperienceSelect$lambda$4(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XXiIiX10(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->trainingExperienceSelect$lambda$1(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XXiO0i(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceSelect1_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Xi1i0XOX0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mCadenceTitleUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Xii11I(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/SportGoalProgressBar;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSportGoalProgressBar_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/SportGoalProgressBar;

    move-result-object p0

    return-object p0
.end method

.method private final addMyPieChart(Ljava/lang/Long;ILjava/util/ArrayList;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "I",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/view/MyPieChart$OXO1;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "addMyPieChart "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    new-instance v1, Lcom/sma/smartv3/view/MyPieChart$OXO1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x1

    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lcom/sma/smartv3/view/MyPieChart$OXO1;-><init>(JIFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private final ateList(I)V
    .locals 13

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->colorsList:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x0

    const/high16 v3, 0x41200000    # 10.0f

    const-string v4, ""

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFLjava/lang/String;I)V

    const/4 v1, 0x5

    if-ne p1, v1, :cond_0

    const v2, 0x7f14149a

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v4

    :goto_0
    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/iz3;->X1ii(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/iz3;

    move-result-object v5

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget-object v6, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->colorsList:Ljava/util/List;

    const/4 v11, 0x1

    invoke-interface {v6, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    const/high16 v6, 0x41c80000    # 25.0f

    invoke-direct {v0, v3, v6, v4, v2}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFLjava/lang/String;I)V

    const/4 v2, 0x4

    if-ne p1, v2, :cond_1

    const v3, 0x7f141100

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v4

    :goto_1
    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/iz3;->X1ii(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/iz3;

    move-result-object v0

    new-instance v3, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    iget-object v8, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->colorsList:Ljava/util/List;

    const/4 v9, 0x2

    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v7

    const/high16 v8, 0x42480000    # 50.0f

    invoke-direct {v3, v6, v8, v4, v7}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFLjava/lang/String;I)V

    const/4 v6, 0x3

    if-ne p1, v6, :cond_2

    const v7, 0x7f140195

    invoke-virtual {p0, v7}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    :cond_2
    move-object v7, v4

    :goto_2
    invoke-virtual {v3, v7}, Lcom/android/mltcode/paycertificationapi/iz3;->X1ii(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/iz3;

    move-result-object v7

    new-instance v3, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    iget-object v12, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->colorsList:Ljava/util/List;

    invoke-interface {v12, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-virtual {v10, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    const/high16 v10, 0x42960000    # 75.0f

    invoke-direct {v3, v8, v10, v4, v6}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFLjava/lang/String;I)V

    if-ne p1, v9, :cond_3

    const v6, 0x7f140c69

    invoke-virtual {p0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_3

    :cond_3
    move-object v6, v4

    :goto_3
    invoke-virtual {v3, v6}, Lcom/android/mltcode/paycertificationapi/iz3;->X1ii(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/iz3;

    move-result-object v8

    new-instance v3, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    iget-object v9, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->colorsList:Ljava/util/List;

    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v6, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    const/high16 v6, 0x42be0000    # 95.0f

    invoke-direct {v3, v10, v6, v4, v2}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFLjava/lang/String;I)V

    if-ne p1, v11, :cond_4

    const v2, 0x7f140b5d

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_4
    move-object v2, v4

    :goto_4
    invoke-virtual {v3, v2}, Lcom/android/mltcode/paycertificationapi/iz3;->X1ii(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/iz3;

    move-result-object v9

    new-instance v2, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    iget-object v10, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->colorsList:Ljava/util/List;

    invoke-interface {v10, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    invoke-virtual {v3, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    const/high16 v10, 0x42c80000    # 100.0f

    invoke-direct {v2, v6, v10, v4, v3}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFLjava/lang/String;I)V

    if-nez p1, :cond_5

    const v3, 0x7f14135b

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    :cond_5
    invoke-virtual {v2, v4}, Lcom/android/mltcode/paycertificationapi/iz3;->X1ii(Ljava/lang/String;)Lcom/android/mltcode/paycertificationapi/iz3;

    move-result-object v10

    move-object v6, v0

    filled-new-array/range {v5 .. v10}, [Lcom/android/mltcode/paycertificationapi/iz3;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMAteLevel()Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    move-result-object v2

    invoke-virtual {v2, v11}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setSegmentSideRule(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMAteLevel()Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    move-result-object v2

    invoke-virtual {v2, v11}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setShowDescriptionText(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMAteLevel()Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setSegments(Ljava/util/List;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMAteLevel()Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMAteLevel()Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f06074b

    invoke-static {v2, v3}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setDescriptionTextColor(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMAteLevel()Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMAteLevel()Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->colorsList:Ljava/util/List;

    sub-int/2addr v1, p1

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-static {v2, p1}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setDescriptionTopTextColor(I)V

    return-void
.end method

.method private final configChartV2(Lcom/github/mikephil/charting/charts/LineChart;IIJ)V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->XIi00iiXO(Lcom/github/mikephil/charting/charts/LineChart;)V

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/github/mikephil/charting/charts/Chart;->setTouchEnabled(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->getDescription()Lcom/android/mltcode/paycertificationapi/IOOI00X0I;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->XO0X10iO(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v2

    int-to-float p3, p3

    invoke-virtual {v2, p3}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOiXi11II(F)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object p3

    int-to-float p2, p2

    invoke-virtual {p3, p2}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->i0X000X0O(F)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object p2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object p3

    const v2, 0x7f06024d

    invoke-static {p3, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result p3

    invoke-virtual {p2, p3}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->XX1Oi(I)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object p2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object p3

    invoke-static {p3, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result p3

    invoke-virtual {p2, p3}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->I0IIOi(I)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Lcom/github/mikephil/charting/components/YAxis;->iI0I(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object p2

    invoke-virtual {p2, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object p2

    invoke-virtual {p2, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->XO0X10iO(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object p2

    invoke-virtual {p2, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Ii0X0X(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p3, "getContext(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p2, v1, p1}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIi0(Lcom/github/mikephil/charting/components/XAxis;ZLandroid/content/Context;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result p1

    mul-int/lit16 p1, p1, 0x3e8

    int-to-long v2, p1

    div-long/2addr v2, p4

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->i0X000X0O(F)V

    long-to-float p1, p4

    const/high16 p3, 0x40000000    # 2.0f

    div-float p3, p1, p3

    invoke-virtual {p2, p3}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->IXOIIIO(F)V

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOiXi11II(F)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object p3

    invoke-virtual {p3}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result p3

    mul-int/lit16 p3, p3, 0x3e8

    long-to-int p4, v2

    if-lez p4, :cond_2

    invoke-static {v1, p3, p4}, Lkotlin/internal/ProgressionUtilKt;->iO(III)I

    move-result p3

    if-ltz p3, :cond_1

    :goto_0
    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XXO(I)I

    move-result p5

    if-nez p5, :cond_0

    const-string p5, "0"

    goto :goto_1

    :cond_0
    add-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p5

    :goto_1
    invoke-interface {p1, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq v1, p3, :cond_1

    add-int/2addr v1, p4

    goto :goto_0

    :cond_1
    new-instance p3, Lcom/android/mltcode/paycertificationapi/q4;

    invoke-direct {p3, p1}, Lcom/android/mltcode/paycertificationapi/q4;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p2, p3}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Oi(Lcom/android/mltcode/paycertificationapi/he6;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Step must be positive, was: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final getMAteLevel()Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mAteLevel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    return-object v0
.end method

.method private final getMCadenceAvgTitle()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mCadenceAvgTitle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getMCadenceMaxTitle()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mCadenceMaxTitle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getMCadenceTitle()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mCadenceTitle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getMCadenceTitleUnit()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mCadenceTitleUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getMCadenceUnderstandSituation()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mCadenceUnderstandSituation$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMDateSourcesTip()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mDateSourcesTip$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMDeviceImg()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mDeviceImg$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMDeviceName()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mDeviceName$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMDeviceQRCode()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mDeviceQRCode$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMDeviceQRCodeLayout()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mDeviceQRCodeLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getMDeviceSources()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mDeviceSources$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getMPacePanelUnit()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mPacePanelUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMPieChart()Lcom/sma/smartv3/view/MyPieChart;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mPieChart$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/MyPieChart;

    return-object v0
.end method

.method private final getMSegmentationDetailsLL()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSegmentationDetailsLL$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getMSegmentationRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSegmentationRecyclerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private final getMSpeedPanelUnit()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSpeedPanelUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMSpeedPerKilometer()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSpeedPerKilometer$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getMSpeedRecyclerTitle()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSpeedRecyclerTitle$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMSpeedRecyclerUnit()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSpeedRecyclerUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMSpeedRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSpeedRecyclerView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private final getMSportGoalProgressBar()Lcom/sma/smartv3/view/SportGoalProgressBar;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSportGoalProgressBar$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/SportGoalProgressBar;

    return-object v0
.end method

.method private final getMSportMaxV02()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSportMaxV02$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getMSportMaxV02Level()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSportMaxV02Level$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getMSportRecoveryTime()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSportRecoveryTime$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getMSportRecoveryTimeEstimate()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSportRecoveryTimeEstimate$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getMSportTrainingLoad()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSportTrainingLoad$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getMTrainingExperience()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperience$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getMTrainingExperienceResult()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceResult$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getMTrainingExperienceResultImg()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceResultImg$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getMTrainingExperienceResultTv()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceResultTv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMTrainingExperienceSelect()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceSelect$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getMTrainingExperienceSelect1()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceSelect1$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getMTrainingExperienceSelect2()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceSelect2$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getMTrainingExperienceSelect3()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceSelect3$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getMTrainingExperienceSelect4()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceSelect4$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getMTrainingExperienceSelect5()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceSelect5$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getMTrainingPerformance()Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingPerformance$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    return-object v0
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

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->sportDetailV2Activity:Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;

    :cond_0
    return-void
.end method

.method private final getTodayTime(I)Ljava/lang/String;
    .locals 3

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMEndTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    const/16 v1, 0xd

    invoke-virtual {v0, v1, p1}, Ljava/util/Calendar;->add(II)V

    new-instance p1, Ljava/text/SimpleDateFormat;

    const-string v1, "M/dEEEEHH:mm"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {p1, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "format(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final getV02Level(I)Lkotlin/Pair;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x5f

    if-gt v0, p1, :cond_0

    const/16 v1, 0x65

    if-ge p1, v1, :cond_0

    new-instance p1, Lkotlin/Pair;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const v1, 0x7f14135b

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_0
    const/16 v1, 0x4b

    if-gt v1, p1, :cond_1

    if-ge p1, v0, :cond_1

    new-instance p1, Lkotlin/Pair;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const v1, 0x7f140b5d

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_1
    const/16 v0, 0x32

    if-gt v0, p1, :cond_2

    if-ge p1, v1, :cond_2

    new-instance p1, Lkotlin/Pair;

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const v1, 0x7f140c69

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_2
    const/16 v1, 0x19

    if-gt v1, p1, :cond_3

    if-ge p1, v0, :cond_3

    new-instance p1, Lkotlin/Pair;

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const v1, 0x7f140195

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_3
    const/16 v0, 0xa

    if-gt v0, p1, :cond_4

    if-ge p1, v1, :cond_4

    new-instance p1, Lkotlin/Pair;

    const/4 v0, 0x4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const v1, 0x7f141100

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/Pair;

    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const v1, 0x7f14149a

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static synthetic i0X000X0O(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mCadenceAvgTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i100IXOX(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/RelativeLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingPerformance_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/RelativeLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i11I(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->trainingExperienceSelect$lambda$2(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic iIi1(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceResultTv_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOI(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSportMaxV02Level_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOiXi11II(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSegmentationDetailsLL_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iXi(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mDateSourcesTip_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iXiX011(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceSelect_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iXiiiO(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mDeviceQRCode_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iiIOiX(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/MyPieChart;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mPieChart_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/MyPieChart;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iii0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mSegmentationRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iiiO(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->mTrainingExperienceSelect3_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxVO2()I

    move-result v0

    div-int/lit8 v0, v0, 0xa

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getV02Level(I)Lkotlin/Pair;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMAteLevel()Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    move-result-object p0

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    rsub-int/lit8 v0, v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setValueSegment(Ljava/lang/Integer;)V

    return-void
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;Landroid/view/View;)V
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result p1

    const/16 v0, 0x34

    const/4 v1, 0x2

    if-ne p1, v0, :cond_0

    const/4 p1, 0x5

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "https://api.iot-solution.net/web/help/gomer_help.html?type="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v2, "mArg0"

    invoke-virtual {v0, v2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "mArg1"

    invoke-virtual {v0, p1, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "mArg2"

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/sma/smartv3/ui/me/WebViewActivity;

    invoke-direct {p1, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private final locationList()V
    .locals 18

    move-object/from16 v0, p0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    const-string v3, "LOCATION_WHERE"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->isInChinaMainland:Z

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMLocationDao()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object v2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v5

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v7

    invoke-interface {v2, v5, v6, v7, v8}, Lcom/sma/smartv3/db/dao/LocationDao;->getLocation(JJ)Ljava/util/List;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "locationList "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    const/4 v5, 0x2

    if-nez v3, :cond_3

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-lt v3, v5, :cond_3

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sma/smartv3/db/entity/Location;

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Location;->getMSource()I

    move-result v6

    if-ne v6, v7, :cond_0

    goto :goto_0

    :cond_1
    move v4, v7

    :goto_0
    iget-boolean v3, v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->isInChinaMainland:Z

    if-eqz v3, :cond_2

    if-eqz v4, :cond_2

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

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/Location;

    new-instance v6, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Location;->getMLatitude()F

    move-result v7

    float-to-double v7, v7

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Location;->getMLongitude()F

    move-result v9

    float-to-double v9, v9

    invoke-direct {v6, v7, v8, v9, v10}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-virtual {v3, v6}, Lcom/baidu/mapapi/utils/CoordinateConverter;->coord(Lcom/baidu/mapapi/model/LatLng;)Lcom/baidu/mapapi/utils/CoordinateConverter;

    move-result-object v6

    invoke-virtual {v6}, Lcom/baidu/mapapi/utils/CoordinateConverter;->convert()Lcom/baidu/mapapi/model/LatLng;

    move-result-object v6

    new-instance v7, Lcom/sma/smartv3/model/CustomLatLng;

    iget-wide v8, v6, Lcom/baidu/mapapi/model/LatLng;->latitude:D

    iget-wide v10, v6, Lcom/baidu/mapapi/model/LatLng;->longitude:D

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Location;->getMTime()J

    move-result-wide v12

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Location;->getMAltitude()I

    move-result v14

    const/16 v16, 0x10

    const/16 v17, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v7 .. v17}, Lcom/sma/smartv3/model/CustomLatLng;-><init>(DDJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/db/entity/Location;

    new-instance v6, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Location;->getMLatitude()F

    move-result v4

    float-to-double v7, v4

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Location;->getMLongitude()F

    move-result v4

    float-to-double v9, v4

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Location;->getMTime()J

    move-result-wide v11

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Location;->getMAltitude()I

    move-result v13

    const/16 v15, 0x10

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v6 .. v16}, Lcom/sma/smartv3/model/CustomLatLng;-><init>(DDJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-le v2, v5, :cond_4

    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->locationSmoothAlgorithm:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->locationSmoothAlgorithm(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_4
    return-void
.end method

.method private final locationSmoothAlgorithm(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 27
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

    goto/16 :goto_1

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

    div-float/2addr v7, v8

    iget v8, v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->threshold:I

    int-to-float v8, v8

    cmpl-float v8, v7, v8

    if-ltz v8, :cond_2

    iget v8, v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->thresholdMax:I

    int-to-float v8, v8

    cmpl-float v7, v7, v8

    if-ltz v7, :cond_1

    invoke-virtual {v3}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Lcom/sma/smartv3/model/CustomLatLng;->setLongitude(D)V

    invoke-virtual {v3}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Lcom/sma/smartv3/model/CustomLatLng;->setLatitude(D)V

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v7

    invoke-virtual {v15, v7, v8}, Lcom/sma/smartv3/model/CustomLatLng;->setLatitude(D)V

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v7

    invoke-virtual {v15, v7, v8}, Lcom/sma/smartv3/model/CustomLatLng;->setLongitude(D)V

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v7

    invoke-virtual {v15, v7, v8}, Lcom/sma/smartv3/model/CustomLatLng;->setTime(J)V

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getAltitude()I

    move-result v7

    invoke-virtual {v15, v7}, Lcom/sma/smartv3/model/CustomLatLng;->setAltitude(I)V

    invoke-virtual {v3}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v7

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v9

    add-double/2addr v7, v9

    const/4 v9, 0x2

    int-to-double v9, v9

    div-double/2addr v7, v9

    invoke-virtual {v6, v7, v8}, Lcom/sma/smartv3/model/CustomLatLng;->setLongitude(D)V

    invoke-virtual {v3}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v7

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v11

    add-double/2addr v7, v11

    div-double/2addr v7, v9

    invoke-virtual {v6, v7, v8}, Lcom/sma/smartv3/model/CustomLatLng;->setLatitude(D)V

    goto :goto_1

    :cond_2
    const-wide/16 v7, 0x0

    invoke-virtual {v15, v7, v8}, Lcom/sma/smartv3/model/CustomLatLng;->setLatitude(D)V

    invoke-virtual {v15, v7, v8}, Lcom/sma/smartv3/model/CustomLatLng;->setLongitude(D)V

    const-wide/16 v7, 0x0

    invoke-virtual {v15, v7, v8}, Lcom/sma/smartv3/model/CustomLatLng;->setTime(J)V

    invoke-virtual {v15, v14}, Lcom/sma/smartv3/model/CustomLatLng;->setAltitude(I)V

    :goto_1
    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v7

    invoke-virtual {v3, v7, v8}, Lcom/sma/smartv3/model/CustomLatLng;->setLatitude(D)V

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v7

    invoke-virtual {v3, v7, v8}, Lcom/sma/smartv3/model/CustomLatLng;->setLongitude(D)V

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v7

    invoke-virtual {v3, v7, v8}, Lcom/sma/smartv3/model/CustomLatLng;->setTime(J)V

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getAltitude()I

    move-result v7

    invoke-virtual {v3, v7}, Lcom/sma/smartv3/model/CustomLatLng;->setAltitude(I)V

    new-instance v16, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v17

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v19

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v21

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getAltitude()I

    move-result v23

    const/16 v25, 0x10

    const/16 v26, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v16 .. v26}, Lcom/sma/smartv3/model/CustomLatLng;-><init>(DDJIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v16

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    :cond_3
    return-object v2
.end method

.method private static final mAteLevel_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a00e4

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    return-object p0
.end method

.method private static final mCadenceAvgTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01f6

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mCadenceMaxTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01f7

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mCadenceTitleUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01f8

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mCadenceTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01f9

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mCadenceUnderstandSituation_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/ImageView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a18d5

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mDateSourcesTip_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a02f5

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final mDeviceImg_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/ImageView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a02ef

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mDeviceName_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a02f1

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mDeviceQRCodeLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a02f3

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final mDeviceQRCode_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/ImageView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a02f2

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mDeviceSources_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a02f4

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final mPacePanelUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a08ea

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mPieChart_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/MyPieChart;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0864

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/MyPieChart;

    return-object p0
.end method

.method private static final mSegmentationDetailsLL_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a0a

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final mSegmentationRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a0b

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private static final mSpeedPanelUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a75

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mSpeedPerKilometer_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a76

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final mSpeedRecyclerTitle_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a79

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mSpeedRecyclerUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a77

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mSpeedRecyclerView_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a78

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private static final mSportGoalProgressBar_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/SportGoalProgressBar;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0af5

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/SportGoalProgressBar;

    return-object p0
.end method

.method private static final mSportMaxV02Level_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0af9

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mSportMaxV02_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0af8

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mSportRecoveryTimeEstimate_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b0b

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mSportRecoveryTime_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b0a

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mSportTrainingLoad_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0b0d

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final mTrainingExperienceResultImg_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/ImageView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0bd2

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final mTrainingExperienceResultTv_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0bdb

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mTrainingExperienceResult_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0bd9

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final mTrainingExperienceSelect1_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0bd4

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final mTrainingExperienceSelect2_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0bd5

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final mTrainingExperienceSelect3_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0bd6

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final mTrainingExperienceSelect4_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0bd7

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final mTrainingExperienceSelect5_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0bd8

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final mTrainingExperienceSelect_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0bda

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final mTrainingExperience_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0bd3

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final mTrainingPerformance_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)Landroid/widget/RelativeLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0bdc

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method private final reviseData(Ljava/util/List;I)Lkotlin/Pair;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;I)",
            "Lkotlin/Pair<",
            "Ljava/lang/Long;",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Lcom/android/mltcode/paycertificationapi/nr0;",
            ">;>;"
        }
    .end annotation

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    move-object/from16 v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v0

    if-ne v1, v0, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMEndTime()J

    move-result-wide v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMStartTime()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v3

    int-to-long v3, v3

    div-long/2addr v1, v3

    :goto_0
    move-wide v7, v1

    goto :goto_1

    :cond_0
    const-wide/32 v1, 0xea60

    goto :goto_0

    :goto_1
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMStartTime()J

    move-result-wide v3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMEndTime()J

    move-result-wide v5

    const-wide/16 v9, 0x0

    cmp-long v2, v7, v9

    if-lez v2, :cond_6

    invoke-static/range {v3 .. v8}, Lkotlin/internal/ProgressionUtilKt;->XO0O10(JJJ)J

    move-result-wide v5

    cmp-long v2, v3, v5

    if-gtz v2, :cond_1

    :goto_2
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    new-instance v9, Lcom/android/mltcode/paycertificationapi/nr0;

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lcom/android/mltcode/paycertificationapi/nr0;-><init>(IILjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v2, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    cmp-long v2, v3, v5

    if-eqz v2, :cond_1

    add-long/2addr v3, v7

    goto :goto_2

    :cond_1
    if-eqz p1, :cond_5

    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v3, 0x1

    if-gez v3, :cond_2

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_2
    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/android/mltcode/paycertificationapi/nr0;

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/nr0;->IiI10X()I

    move-result v9

    if-nez v9, :cond_3

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/nr0;->I0IIOi()I

    move-result v4

    add-int/2addr v4, v3

    invoke-virtual {v6, v4}, Lcom/android/mltcode/paycertificationapi/nr0;->OIX0iXi(I)V

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/nr0;->IiI10X()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {v6, v3}, Lcom/android/mltcode/paycertificationapi/nr0;->OIi0(I)V

    :cond_4
    move v3, v5

    goto :goto_3

    :cond_5
    new-instance v0, Lkotlin/Pair;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Step must be positive, was: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final setDeviceSource()V
    .locals 170

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxPace()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMMinPace()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMPrototype()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMFirmwareFlag()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMBleName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "setDeviceSource ---> "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "  "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-direct/range {p0 .. p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMDeviceSources()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMBleName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMBleName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    const/16 v1, 0x8

    move-object/from16 v2, p0

    goto/16 :goto_3

    :cond_1
    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMBleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMFirmwareFlag()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/uz0;->X1(Lcom/android/mltcode/paycertificationapi/sz0;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMBleName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMFirmwareFlag()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMPrototype()Ljava/lang/String;

    move-result-object v11

    new-instance v4, Lcom/szabh/smable3/entity/BleDeviceInfo;

    const v168, 0x3fffffff    # 1.9999999f

    const/16 v169, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

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

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    const/16 v77, 0x0

    const/16 v78, 0x0

    const/16 v79, 0x0

    const/16 v80, 0x0

    const/16 v81, 0x0

    const/16 v82, 0x0

    const/16 v83, 0x0

    const/16 v84, 0x0

    const/16 v85, 0x0

    const/16 v86, 0x0

    const/16 v87, 0x0

    const/16 v88, 0x0

    const/16 v89, 0x0

    const/16 v90, 0x0

    const/16 v91, 0x0

    const/16 v92, 0x0

    const/16 v93, 0x0

    const/16 v94, 0x0

    const/16 v95, 0x0

    const/16 v96, 0x0

    const/16 v97, 0x0

    const/16 v98, 0x0

    const/16 v99, 0x0

    const/16 v100, 0x0

    const/16 v101, 0x0

    const/16 v102, 0x0

    const/16 v103, 0x0

    const/16 v104, 0x0

    const/16 v105, 0x0

    const/16 v106, 0x0

    const/16 v107, 0x0

    const/16 v108, 0x0

    const/16 v109, 0x0

    const/16 v110, 0x0

    const/16 v111, 0x0

    const/16 v112, 0x0

    const/16 v113, 0x0

    const/16 v114, 0x0

    const/16 v115, 0x0

    const/16 v116, 0x0

    const/16 v117, 0x0

    const/16 v118, 0x0

    const/16 v119, 0x0

    const/16 v120, 0x0

    const/16 v121, 0x0

    const/16 v122, 0x0

    const/16 v123, 0x0

    const/16 v124, 0x0

    const/16 v125, 0x0

    const/16 v126, 0x0

    const/16 v127, 0x0

    const/16 v128, 0x0

    const/16 v129, 0x0

    const/16 v130, 0x0

    const/16 v131, 0x0

    const/16 v132, 0x0

    const/16 v133, 0x0

    const/16 v134, 0x0

    const/16 v135, 0x0

    const/16 v136, 0x0

    const/16 v137, 0x0

    const/16 v138, 0x0

    const/16 v139, 0x0

    const/16 v140, 0x0

    const/16 v141, 0x0

    const/16 v142, 0x0

    const/16 v143, 0x0

    const/16 v144, 0x0

    const/16 v145, 0x0

    const/16 v146, 0x0

    const/16 v147, 0x0

    const/16 v148, 0x0

    const/16 v149, 0x0

    const/16 v150, 0x0

    const/16 v151, 0x0

    const/16 v152, 0x0

    const/16 v153, 0x0

    const/16 v154, 0x0

    const/16 v155, 0x0

    const/16 v156, 0x0

    const/16 v157, 0x0

    const/16 v158, 0x0

    const/16 v159, 0x0

    const/16 v160, 0x0

    const/16 v161, 0x0

    const/16 v162, 0x0

    const/16 v163, 0x0

    const/16 v164, -0xc5

    const/16 v165, -0x1

    const/16 v166, -0x1

    const/16 v167, -0x1

    invoke-direct/range {v4 .. v169}, Lcom/szabh/smable3/entity/BleDeviceInfo;-><init>(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJILjava/lang/String;IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIILjava/lang/String;IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIILjava/lang/String;IIIIIIIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v4}, Lcom/android/mltcode/paycertificationapi/q62;->iX(Lcom/szabh/smable3/entity/BleDeviceInfo;)I

    move-result v2

    invoke-direct/range {p0 .. p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMDeviceImg()Landroid/widget/ImageView;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-direct/range {p0 .. p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMDeviceImg()Landroid/widget/ImageView;

    move-result-object v2

    invoke-static {v1}, Lcom/blankj/utilcode/util/ImageUtils;->getBitmap(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    move-object/from16 v2, p0

    goto :goto_2

    :cond_3
    const/4 v1, 0x1

    move-object/from16 v2, p0

    iput-boolean v1, v2, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->isWorkImage:Z

    sget-object v1, Lcom/sma/smartv3/biz/DeviceInfoChecker;->OXO1:Lcom/sma/smartv3/biz/DeviceInfoChecker;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMBleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMFirmwareFlag()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/sma/smartv3/biz/DeviceInfoChecker;->X1ii(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    invoke-direct {v2}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMDeviceName()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMBleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    :goto_3
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {v2}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->showSourcesTip()V

    return-void
.end method

.method private final setTrainingExperience(I)V
    .locals 2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0bd1

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMTrainingExperienceSelect()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMTrainingExperienceResult()Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMTrainingExperienceResultImg()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {p0, v1, p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getTrainingExperienceImage(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMTrainingExperienceResultTv()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {p0, v1, p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getTrainingExperienceName(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMTrainingExperience()Landroid/widget/LinearLayout;

    move-result-object p1

    const v0, 0x7f081650

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    return-void
.end method

.method private static final setTrainingPerformance$lambda$3(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;Landroid/view/View;)V
    .locals 3

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    const-string v1, "https://api.iot-solution.net/web/help/gomer_help.html?type=1"

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg1"

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mArg2"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/sma/smartv3/ui/me/WebViewActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private final showAltitudeV2(Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMAltitudePathCount()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->reviseData(Ljava/util/List;I)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/LinkedHashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMChartXStartIndex()F

    move-result v1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/android/mltcode/paycertificationapi/nr0;

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/nr0;->IiI10X()I

    move-result v6

    const/high16 v7, 0x3f800000    # 1.0f

    if-eqz v6, :cond_2

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/nr0;->I0IIOi()I

    move-result v6

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/nr0;->IiI10X()I

    move-result v5

    div-int/2addr v6, v5

    new-instance v5, Lcom/github/mikephil/charting/data/Entry;

    int-to-float v8, v6

    invoke-direct {v5, v1, v8}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-ge v4, v6, :cond_0

    move v4, v6

    :cond_0
    if-eqz v3, :cond_1

    if-le v3, v6, :cond_2

    :cond_1
    move v3, v6

    :cond_2
    add-float/2addr v1, v7

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getAltitudeLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v6

    const-string v1, "<get-altitudeLineChart>(...)"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v7, v3, -0x5

    add-int/lit8 v8, v4, 0x5

    invoke-virtual {p1}, Ljava/util/AbstractMap;->size()I

    move-result p1

    int-to-long v9, p1

    move-object v5, p0

    invoke-direct/range {v5 .. v10}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->configChartV2(Lcom/github/mikephil/charting/charts/LineChart;IIJ)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getAltitudeLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f060029

    const v2, 0x7f08169b

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->updateChartData(Lcom/github/mikephil/charting/charts/LineChart;Ljava/util/List;II)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvAltitudeUnit()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    if-nez v0, :cond_4

    const v0, 0x7f140121

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    const v0, 0x7f141620

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvMaxAltitudeValue()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxAltitude()I

    move-result v0

    const/16 v1, -0x2710

    const/16 v2, 0x2710

    if-gt v0, v2, :cond_6

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxAltitude()I

    move-result v0

    if-ge v0, v1, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxAltitude()I

    move-result v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v4

    invoke-static {v0, v4}, Lcom/android/mltcode/paycertificationapi/cp5;->iXiX011(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_6
    :goto_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    invoke-static {v4, v0}, Lcom/android/mltcode/paycertificationapi/cp5;->iXiX011(II)Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvMinAltitudeValue()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxAltitude()I

    move-result v0

    if-gt v0, v2, :cond_8

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxAltitude()I

    move-result v0

    if-ge v0, v1, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMMinAltitude()I

    move-result v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/cp5;->iXiX011(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_8
    :goto_4
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    invoke-static {v3, v0}, Lcom/android/mltcode/paycertificationapi/cp5;->iXiX011(II)Ljava/lang/String;

    move-result-object v0

    :goto_5
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final showHrV2(Ljava/util/List;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMHrPathSampleInterval()I

    move-result v1

    invoke-direct {p0, p1, v1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->reviseData(Ljava/util/List;I)Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/LinkedHashMap;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMChartXStartIndex()F

    move-result v2

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/android/mltcode/paycertificationapi/nr0;

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/nr0;->IiI10X()I

    move-result v5

    const/high16 v7, 0x3f800000    # 1.0f

    if-eqz v5, :cond_0

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/nr0;->I0IIOi()I

    move-result v5

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/nr0;->IiI10X()I

    move-result v4

    div-int/2addr v5, v4

    new-instance v4, Lcom/github/mikephil/charting/data/Entry;

    int-to-float v5, v5

    invoke-direct {v4, v2, v5}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-float/2addr v2, v7

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getHrLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v2

    const-string v7, "<get-hrLineChart>(...)"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxBpm()I

    move-result v3

    add-int/lit8 v3, v3, 0xa

    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    move-result v1

    int-to-long v4, v1

    move-object v1, v2

    const/16 v2, 0x28

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->configChartV2(Lcom/github/mikephil/charting/charts/LineChart;IIJ)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getHrLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v1

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f060236

    const v3, 0x7f0816d1

    invoke-virtual {p0, v1, v6, v2, v3}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->updateChartData(Lcom/github/mikephil/charting/charts/LineChart;Ljava/util/List;II)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvAvgBmpValue()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMMinBpm()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvMaxBmpValue()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxBpm()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->X11()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v1

    const/4 v2, 0x7

    if-ne v1, v2, :cond_2

    const/16 v11, 0x1f

    const/4 v12, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v12}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->setSportText$default(Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;JJJJJILjava/lang/Object;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvHeartRateRange()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvHeartRateRange()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getLlHeartRateRange()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    return-void

    :cond_4
    const/16 v11, 0x1f

    const/4 v12, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v12}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->setSportText$default(Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;JJJJJILjava/lang/Object;)V

    return-void
.end method

.method private final showPaceV2(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMPacePathCount()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->reviseData(Ljava/util/List;I)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/LinkedHashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMChartXStartIndex()F

    move-result v1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    move v5, v3

    move v9, v5

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/android/mltcode/paycertificationapi/nr0;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/nr0;->IiI10X()I

    move-result v4

    const/high16 v6, 0x3f800000    # 1.0f

    if-eqz v4, :cond_4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v4

    const/4 v7, 0x1

    if-ne v4, v7, :cond_0

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/nr0;->I0IIOi()I

    move-result v4

    int-to-float v4, v4

    const v7, 0x3f1f122f

    div-float/2addr v4, v7

    float-to-int v4, v4

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/nr0;->I0IIOi()I

    move-result v4

    :goto_1
    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/nr0;->IiI10X()I

    move-result v3

    div-int/2addr v4, v3

    if-ge v9, v4, :cond_1

    move v9, v4

    :cond_1
    if-eqz v5, :cond_2

    if-le v5, v4, :cond_3

    :cond_2
    move v5, v4

    :cond_3
    new-instance v3, Lcom/github/mikephil/charting/data/Entry;

    int-to-float v4, v4

    invoke-direct {v3, v1, v4}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    add-float/2addr v1, v6

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getPaceLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v4

    const-string v1, "<get-paceLineChart>(...)"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v6, v9, 0xa

    invoke-virtual {p1}, Ljava/util/AbstractMap;->size()I

    move-result p1

    int-to-long v7, p1

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->configChartV2(Lcom/github/mikephil/charting/charts/LineChart;IIJ)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getPaceLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f060546

    const v2, 0x7f0816df

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->updateChartData(Lcom/github/mikephil/charting/charts/LineChart;Ljava/util/List;II)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getPaceLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object p1

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object p1

    new-instance v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$XO0O10;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$XO0O10;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Oi(Lcom/android/mltcode/paycertificationapi/he6;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvAvgPaceValue()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxPace()I

    move-result v0

    if-lez v0, :cond_6

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxPace()I

    move-result v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/cp5;->Ii1iii0(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    invoke-static {v9, v0}, Lcom/android/mltcode/paycertificationapi/cp5;->Ii1iii0(II)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvMinPaceValue()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMMinPace()I

    move-result v0

    if-lez v0, :cond_7

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMMinPace()I

    move-result v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/cp5;->Ii1iii0(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_7
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    invoke-static {v5, v0}, Lcom/android/mltcode/paycertificationapi/cp5;->Ii1iii0(II)Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private static final showQCCode$lambda$0(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final showQCCode$lambda$1(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final showSegmentation()V
    .locals 9

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSegmentationRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$iO;

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$iO;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$iO;

    const-string v3, "1"

    const-string v4, "0:10"

    const-string v5, "0.5"

    const-string v6, "9"

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$iO;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$iO;

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$iO;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSegmentationDetailsLL()Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x1

    if-le v3, v4, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    const/16 v3, 0x8

    :goto_0
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    new-instance v2, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationAdapter;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "getContext(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v1, v3}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationAdapter;-><init>(Ljava/util/ArrayList;Landroid/content/Context;)V

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method private final showSourcesTip()V
    .locals 3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMAGpsType()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mWorkout.mAGpsType ---> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMDateSourcesTip()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMSource()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMAGpsType()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final showSpeedData()Z
    .locals 20

    move-object/from16 v0, p0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMSource()I

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/RecordActivityData;->getMTimeList()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v3

    invoke-static {v1, v2, v3}, Lcom/sma/smartv3/model/SportRecordDataKt;->sportRecordActivityDetailSpeed(Ljava/util/ArrayList;II)Lcom/sma/smartv3/model/RecordDetailSpeedData;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-direct {v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->locationList()V

    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/RecordActivityData;->getMTimeList()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v3

    iget-object v4, v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->locationSmoothAlgorithm:Ljava/util/ArrayList;

    invoke-static {v1, v2, v3, v4}, Lcom/sma/smartv3/model/SportRecordDataKt;->sportRecordWorkoutDetailSpeed(Ljava/util/ArrayList;IILjava/util/ArrayList;)Lcom/sma/smartv3/model/RecordDetailSpeedData;

    move-result-object v1

    :goto_0
    invoke-virtual {v1}, Lcom/sma/smartv3/model/RecordDetailSpeedData;->getMPaceList()Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    move v6, v5

    :goto_1
    if-ge v4, v2, :cond_5

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    const-string v8, "get(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    const/16 v8, 0x7530

    if-le v7, v8, :cond_1

    iget-object v7, v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v7}, Lcom/sma/smartv3/model/RecordActivityData;->getMPace()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v1, v4, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v7, v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v7}, Lcom/sma/smartv3/model/RecordActivityData;->getMPace()I

    move-result v7

    :cond_1
    if-nez v4, :cond_2

    move v5, v7

    move v6, v5

    :cond_2
    if-le v5, v7, :cond_3

    move v5, v7

    :cond_3
    if-ge v6, v7, :cond_4

    move v6, v7

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMSource()I

    move-result v2

    const/4 v4, 0x1

    if-ne v2, v4, :cond_6

    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/RecordActivityData;->getMPace()I

    move-result v2

    if-lez v2, :cond_6

    if-nez v5, :cond_6

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-nez v2, :cond_6

    move v2, v4

    goto :goto_2

    :cond_6
    move v2, v3

    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v7, 0x0

    if-nez v5, :cond_9

    iget-object v5, v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/RecordActivityData;->getMDistanceTotal()F

    move-result v5

    cmpl-float v5, v5, v7

    if-lez v5, :cond_8

    iget-object v5, v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/RecordActivityData;->getMPace()I

    move-result v5

    mul-int/lit8 v6, v5, 0x2

    iget-object v5, v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/RecordActivityData;->getMDistanceTotal()F

    move-result v5

    float-to-int v5, v5

    if-ltz v5, :cond_9

    move v8, v3

    move v9, v8

    :goto_3
    iget-object v10, v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v10}, Lcom/sma/smartv3/model/RecordActivityData;->getMPace()I

    move-result v10

    if-ge v8, v10, :cond_7

    iget-object v8, v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v8}, Lcom/sma/smartv3/model/RecordActivityData;->getMPace()I

    move-result v8

    :cond_7
    iget-object v10, v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v10}, Lcom/sma/smartv3/model/RecordActivityData;->getMPace()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eq v9, v5, :cond_9

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_8
    iget-object v5, v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->activityData:Lcom/sma/smartv3/model/RecordActivityData;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/RecordActivityData;->getMPace()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sget-object v5, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/i72;->I11iXOO()Z

    move-result v5

    const/16 v8, 0x3e8

    const/4 v9, 0x0

    if-eqz v5, :cond_f

    iget-object v5, v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->sportDetailV2Activity:Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;

    if-eqz v5, :cond_a

    invoke-virtual {v5}, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;->getMSportViewModel()Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;

    move-result-object v5

    if-eqz v5, :cond_a

    invoke-virtual {v5}, Lcom/sma/smartv3/ui/sport/course/model/SportDetailViewModel;->getCustomLatLng()Ljava/util/ArrayList;

    move-result-object v5

    goto :goto_4

    :cond_a
    move-object v5, v9

    :goto_4
    if-eqz v5, :cond_b

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    goto :goto_5

    :cond_b
    move-object v10, v9

    :goto_5
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "locationList "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, " "

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v11

    invoke-static {v11}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    if-eqz v5, :cond_f

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v11, v3

    move-object v13, v9

    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_f

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    add-int/lit8 v15, v11, 0x1

    if-gez v11, :cond_c

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_c
    check-cast v14, Lcom/sma/smartv3/model/CustomLatLng;

    if-eqz v13, :cond_e

    invoke-virtual {v14}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v16

    invoke-virtual {v13}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v18

    sub-long v16, v16, v18

    move-object/from16 v18, v5

    int-to-long v4, v8

    div-long v4, v16, v4

    long-to-int v4, v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    new-instance v5, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$XIi00iiXO;

    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v13

    invoke-static {v4, v13}, Lcom/android/mltcode/paycertificationapi/cp5;->Ii1iii0(II)Ljava/lang/String;

    move-result-object v13

    move/from16 v16, v7

    int-to-float v7, v4

    int-to-float v8, v6

    div-float/2addr v7, v8

    if-eqz v2, :cond_d

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v8

    invoke-virtual {v8}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v8

    invoke-static {v4, v8}, Lcom/android/mltcode/paycertificationapi/cp5;->Ii1iii0(II)Ljava/lang/String;

    move-result-object v4

    goto :goto_7

    :cond_d
    invoke-static {v4}, Lcom/android/mltcode/paycertificationapi/cp5;->iXiiiO(I)Ljava/lang/String;

    move-result-object v4

    :goto_7
    invoke-direct {v5, v11, v13, v7, v4}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$XIi00iiXO;-><init>(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_e
    move-object/from16 v18, v5

    move/from16 v16, v7

    :goto_8
    move-object v13, v14

    move v11, v15

    move/from16 v7, v16

    move-object/from16 v5, v18

    const/4 v4, 0x1

    const/16 v8, 0x3e8

    goto :goto_6

    :cond_f
    move/from16 v16, v7

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v4

    const/4 v5, 0x4

    invoke-static {v2, v4, v3, v5, v9}, Lcom/android/mltcode/paycertificationapi/cp5;->X1ii(IIZILjava/lang/Object;)F

    move-result v2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v4

    const/16 v6, 0x3e8

    invoke-static {v6, v4, v3, v5, v9}, Lcom/android/mltcode/paycertificationapi/cp5;->X1ii(IIZILjava/lang/Object;)F

    move-result v3

    sub-float/2addr v3, v2

    cmpl-float v3, v3, v16

    if-gtz v3, :cond_11

    const/high16 v3, 0x447a0000    # 1000.0f

    rem-float/2addr v2, v3

    cmpg-float v2, v2, v16

    if-nez v2, :cond_10

    goto :goto_9

    :cond_10
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_12

    :cond_11
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMPace()I

    move-result v2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v3

    invoke-static {v2, v3}, Lcom/android/mltcode/paycertificationapi/cp5;->Ii1iii0(II)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$XIi00iiXO;

    const-string v4, ""

    move/from16 v5, v16

    invoke-direct {v3, v4, v2, v5, v4}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$XIi00iiXO;-><init>(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_12
    :goto_9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "tmpPaceList "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "  "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSpeedRecyclerTitle()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v3

    const/4 v13, 0x1

    if-ne v3, v13, :cond_13

    const v3, 0x7f141289

    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_a

    :cond_13
    const v3, 0x7f141288

    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    :goto_a
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSpeedPanelUnit()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v3

    if-ne v3, v13, :cond_14

    const v3, 0x7f140f5a

    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_b

    :cond_14
    const v3, 0x7f14128c

    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    :goto_b
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSpeedRecyclerUnit()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v3

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMPacePanelUnit()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v3

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSpeedRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v2

    new-instance v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance v3, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2Adapter;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "getContext(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v1, v4}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2Adapter;-><init>(Ljava/util/ArrayList;Landroid/content/Context;)V

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v13, 0x1

    xor-int/2addr v1, v13

    return v1
.end method

.method private final showSpeedV2(Ljava/util/List;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMSpeedPathCount()I

    move-result v1

    invoke-direct {p0, p1, v1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->reviseData(Ljava/util/List;I)Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/LinkedHashMap;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMChartXStartIndex()F

    move-result v2

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    move v7, v4

    move v8, v7

    move v9, v8

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/16 v10, 0x3e8

    if-eqz v5, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/android/mltcode/paycertificationapi/nr0;

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/nr0;->IiI10X()I

    move-result v11

    const/high16 v12, 0x3f800000    # 1.0f

    if-eqz v11, :cond_4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v11

    invoke-virtual {v11}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v11

    const/4 v13, 0x1

    if-ne v11, v13, :cond_0

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/nr0;->I0IIOi()I

    move-result v11

    int-to-float v11, v11

    const v13, 0x3f1f122f

    div-float/2addr v11, v13

    float-to-int v11, v11

    goto :goto_1

    :cond_0
    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/nr0;->I0IIOi()I

    move-result v11

    :goto_1
    div-int/2addr v11, v10

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/nr0;->IiI10X()I

    move-result v5

    div-int/2addr v11, v5

    new-instance v5, Lcom/github/mikephil/charting/data/Entry;

    int-to-float v10, v11

    invoke-direct {v5, v2, v10}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-ge v8, v11, :cond_1

    move v8, v11

    :cond_1
    if-eqz v7, :cond_2

    if-le v7, v11, :cond_3

    :cond_2
    move v7, v11

    :cond_3
    add-int/2addr v9, v11

    :cond_4
    add-float/2addr v2, v12

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getSpeedLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v2

    const-string v11, "<get-speedLineChart>(...)"

    invoke-static {v2, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v7, :cond_6

    goto :goto_2

    :cond_6
    add-int/lit8 v4, v7, -0x1

    :goto_2
    add-int/lit8 v3, v8, 0x5

    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    move-result v1

    int-to-long v12, v1

    move-object v0, p0

    move-object v1, v2

    move v2, v4

    move-wide v4, v12

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->configChartV2(Lcom/github/mikephil/charting/charts/LineChart;IIJ)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getSpeedLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v1

    invoke-static {v1, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f060708

    const v3, 0x7f0816f2

    invoke-virtual {p0, v1, v6, v2, v3}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->updateChartData(Lcom/github/mikephil/charting/charts/LineChart;Ljava/util/List;II)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvAvgSpeedValue()Landroid/widget/TextView;

    move-result-object v1

    int-to-double v2, v7

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v4

    invoke-static {v2, v3, v4}, Lcom/android/mltcode/paycertificationapi/cp5;->i11I(DI)F

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvFastSpeedValue()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxSpeed()I

    move-result v2

    int-to-double v2, v2

    int-to-double v4, v10

    div-double/2addr v2, v4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v4

    invoke-static {v2, v3, v4}, Lcom/android/mltcode/paycertificationapi/cp5;->i11I(DI)F

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTAG()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxSpeed()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " mMaxSpeed"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " minSpeed"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "  maxSpeed"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " avgSpeed"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    return-void
.end method

.method private final showSpmV2(Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMCadencePathCount()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->reviseData(Ljava/util/List;I)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/LinkedHashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMChartXStartIndex()F

    move-result v1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/android/mltcode/paycertificationapi/nr0;

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/nr0;->IiI10X()I

    move-result v7

    const/high16 v8, 0x3f800000    # 1.0f

    if-eqz v7, :cond_2

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/nr0;->I0IIOi()I

    move-result v7

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/nr0;->IiI10X()I

    move-result v6

    div-int/2addr v7, v6

    new-instance v6, Lcom/github/mikephil/charting/data/Entry;

    int-to-float v9, v7

    invoke-direct {v6, v1, v9}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-ge v5, v7, :cond_0

    move v5, v7

    :cond_0
    if-eqz v4, :cond_1

    if-le v4, v7, :cond_2

    :cond_1
    move v4, v7

    :cond_2
    add-float/2addr v1, v8

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getSpmLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v7

    const-string v1, "<get-spmLineChart>(...)"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0xa

    if-le v4, v2, :cond_4

    add-int/lit8 v3, v4, -0xa

    :cond_4
    move v8, v3

    add-int/lit8 v9, v5, 0xa

    invoke-virtual {p1}, Ljava/util/AbstractMap;->size()I

    move-result p1

    int-to-long v10, p1

    move-object v6, p0

    invoke-direct/range {v6 .. v11}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->configChartV2(Lcom/github/mikephil/charting/charts/LineChart;IIJ)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getSpmLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f06070b

    const v2, 0x7f0816f3

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->updateChartData(Lcom/github/mikephil/charting/charts/LineChart;Ljava/util/List;II)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result p1

    const/16 v0, 0x34

    if-ne p1, v0, :cond_5

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvAvgSpmValue()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMCadence()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvMaxSpmValue()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxCadence()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_5
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvAvgSpmValue()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMSpm()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvMaxSpmValue()Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxCadence()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final trainingExperienceSelect()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMFeel()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMFeel()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->setTrainingExperience(I)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMTrainingExperienceSelect()Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMTrainingExperienceResult()Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMTrainingExperienceSelect1()Landroid/widget/LinearLayout;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/wx4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/wx4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMTrainingExperienceSelect2()Landroid/widget/LinearLayout;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/xx4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/xx4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMTrainingExperienceSelect3()Landroid/widget/LinearLayout;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/zx4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/zx4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMTrainingExperienceSelect4()Landroid/widget/LinearLayout;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ay4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ay4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMTrainingExperienceSelect5()Landroid/widget/LinearLayout;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/by4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/by4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final trainingExperienceSelect$lambda$0(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->trainingSelectListener(I)V

    return-void
.end method

.method private static final trainingExperienceSelect$lambda$1(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->trainingSelectListener(I)V

    return-void
.end method

.method private static final trainingExperienceSelect$lambda$2(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->trainingSelectListener(I)V

    return-void
.end method

.method private static final trainingExperienceSelect$lambda$3(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->trainingSelectListener(I)V

    return-void
.end method

.method private static final trainingExperienceSelect$lambda$4(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x5

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->trainingSelectListener(I)V

    return-void
.end method

.method private final trainingSelectListener(I)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->setTrainingExperience(I)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "SYNC_SPORT_DETAIL_Experience"

    invoke-static {v0, p1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getBitmap()Landroid/graphics/Bitmap;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->OXO1:Lcom/android/mltcode/paycertificationapi/XIi1i01O;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getRootView()Landroidx/core/widget/NestedScrollView;

    move-result-object v1

    const-string v2, "<get-rootView>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/XIi1i01O;->iO(Landroidx/core/widget/NestedScrollView;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMDeviceQRCodeLayout()Landroid/widget/LinearLayout;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMTrainingExperience()Landroid/widget/LinearLayout;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->showSourcesTip()V

    return-object v0
.end method

.method public final getColorsList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->colorsList:Ljava/util/List;

    return-object v0
.end method

.method public final getTrainingExperienceImage(Landroid/content/Context;I)I
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "icon_training_experience_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "drawable"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p2, v1, p1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const p1, 0x7f0813ad

    return p1
.end method

.method public final getTrainingExperienceName(Landroid/content/Context;I)I
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "training_experience_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "string"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p2, v1, p1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const p1, 0x7f14139c

    return p1
.end method

.method public initView()V
    .locals 10

    invoke-super {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->initView()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getSportDetailActivity()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v0

    const/16 v1, 0xc

    const/16 v2, 0x64

    if-eq v0, v1, :cond_0

    const/16 v1, 0xd

    if-eq v0, v1, :cond_0

    const/16 v1, 0x13

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/16 v0, 0xa

    iput v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->threshold:I

    iput v2, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->thresholdMax:I

    goto :goto_0

    :cond_0
    :pswitch_1
    const/4 v0, 0x5

    iput v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->threshold:I

    iput v2, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->thresholdMax:I

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->showSpeedData()Z

    move-result v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->trainingExperienceSelect()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->setDeviceSource()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMType()I

    move-result v1

    const/16 v2, 0x8

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v1, v4, :cond_2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMTrainingPerformance()Landroid/widget/RelativeLayout;

    move-result-object v1

    sget-object v5, Lcom/android/mltcode/paycertificationapi/hu4;->OXO1:Lcom/android/mltcode/paycertificationapi/hu4;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v6

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v6

    invoke-virtual {v5, v6}, Lcom/android/mltcode/paycertificationapi/hu4;->XX0(I)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->setTrainingPerformance()V

    move v5, v3

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMAteLevel()Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    move-result-object v1

    new-instance v5, Lcom/android/mltcode/paycertificationapi/fy4;

    invoke-direct {v5, p0}, Lcom/android/mltcode/paycertificationapi/fy4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-virtual {v1, v5}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMCadenceUnderstandSituation()Landroid/widget/ImageView;

    move-result-object v1

    new-instance v5, Lcom/android/mltcode/paycertificationapi/gy4;

    invoke-direct {v5, p0}, Lcom/android/mltcode/paycertificationapi/gy4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-virtual {v1, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v1

    const/16 v5, 0x34

    if-ne v1, v5, :cond_3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMCadenceTitle()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    const v5, 0x7f1412dc

    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMCadenceTitleUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    const v5, 0x7f141345

    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f140f5d

    invoke-virtual {p0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "/"

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMCadenceAvgTitle()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    const v5, 0x7f14019e

    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMCadenceMaxTitle()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    const v5, 0x7f140ed3

    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->X0O()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-lez v5, :cond_4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMDeviceQRCode()Landroid/widget/ImageView;

    move-result-object v5

    new-instance v6, Lcom/android/mltcode/paycertificationapi/OiOiI0IX1;

    invoke-direct {v6}, Lcom/android/mltcode/paycertificationapi/OiOiI0IX1;-><init>()V

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->X0O()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f10003b

    invoke-static {v7, v8}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v7

    const/16 v8, 0x15e

    const/high16 v9, -0x1000000

    invoke-virtual {v6, v1, v8, v9, v7}, Lcom/android/mltcode/paycertificationapi/OiOiI0IX1;->O00(Ljava/lang/String;IILandroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v5, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_4
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMDeviceQRCodeLayout()Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/hu4;->OXO1:Lcom/android/mltcode/paycertificationapi/hu4;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMPlatform()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/android/mltcode/paycertificationapi/hu4;->OiIIX101O(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v5

    invoke-virtual {v1, v5}, Lcom/android/mltcode/paycertificationapi/hu4;->XIi00iiXO(I)Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMType()I

    move-result v5

    if-ne v5, v4, :cond_6

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v4

    invoke-virtual {v1, v4}, Lcom/android/mltcode/paycertificationapi/hu4;->X0O(I)Z

    move-result v4

    goto :goto_2

    :cond_6
    move v4, v3

    :goto_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSpeedPerKilometer()Landroid/widget/LinearLayout;

    move-result-object v1

    if-eqz v4, :cond_7

    if-eqz v0, :cond_7

    move v2, v3

    :cond_7
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_8
    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v5

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->isLocationEmpty()Z

    move-result v6

    xor-int/2addr v6, v4

    invoke-virtual {v1, v5, v6}, Lcom/android/mltcode/paycertificationapi/q62;->Oi000O010(IZ)Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v5

    invoke-virtual {v1, v5}, Lcom/android/mltcode/paycertificationapi/q62;->XIXO0iiO(I)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMType()I

    move-result v1

    if-eq v1, v4, :cond_9

    if-eqz v0, :cond_9

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSpeedPerKilometer()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_9
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSpeedPerKilometer()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e84

    return v0
.end method

.method public newDrawChart()V
    .locals 5

    invoke-super {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->newDrawChart()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/o65;->OXO1:Lcom/android/mltcode/paycertificationapi/o65;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/o65;->O00(Lcom/sma/smartv3/db/entity/Workout;)Z

    move-result v0

    const/16 v1, 0x8

    if-nez v0, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OiXI1OiX0()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMHrPathPoints()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->showHrV2(Ljava/util/List;)V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->showHrV2(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getHrPanel()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getPressurePanel()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/hu4;->OXO1:Lcom/android/mltcode/paycertificationapi/hu4;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/hu4;->iIiiO(I)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMCadencePathPoints()Ljava/util/List;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->showSpmV2(Ljava/util/List;)V

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getSpmPanel()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/hu4;->X0O(I)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMPacePathPoints()Ljava/util/List;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->showPaceV2(Ljava/util/List;)V

    goto :goto_3

    :cond_4
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getPacePanel()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_3
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/hu4;->I1XOi1(I)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMSpeedPathPoints()Ljava/util/List;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->showSpeedV2(Ljava/util/List;)V

    goto :goto_4

    :cond_5
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getSpeedPanel()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_4
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/hu4;->XXI(I)Z

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "GoMore"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->XI1OX0IO()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/hu4;->XXI(I)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMAltitudePathPoints()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->showAltitudeV2(Ljava/util/List;)V

    return-void

    :cond_6
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getAltitudePanel()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_7
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getAltitudePanel()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final onPairImageChange(Ljava/lang/Object;)V
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "pair_image_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMBleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMFirmwareFlag()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/uz0;->X1(Lcom/android/mltcode/paycertificationapi/sz0;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result v0

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->isWorkImage:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onPairImageChange "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, "  "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->isWorkImage:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMDeviceImg()Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {p1}, Lcom/blankj/utilcode/util/ImageUtils;->getBitmap(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->isWorkImage:Z

    :cond_0
    return-void
.end method

.method public setSportText(JJJJJ)V
    .locals 16

    move-object/from16 v0, p0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMType()I

    move-result v2

    const v3, 0x7f060237

    const v4, 0x7f060238

    const v5, 0x7f060239

    const v6, 0x7f06023a

    const v7, 0x7f06023b

    const/16 v8, 0x8

    const/4 v9, 0x1

    if-ne v2, v9, :cond_a

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMBpmZoneCount()[I

    move-result-object v2

    if-eqz v2, :cond_b

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMBpmZoneCount()[I

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    array-length v2, v2

    const/4 v10, 0x5

    if-lt v2, v10, :cond_b

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getHrPieChart()Lcom/github/mikephil/charting/charts/PieChart;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvSportStrenuous()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v8

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMBpmZoneCount()[I

    move-result-object v8

    const/4 v10, 0x4

    const/4 v11, 0x0

    if-eqz v8, :cond_0

    aget v8, v8, v10

    invoke-static {v8}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OX110i(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    :cond_0
    move-object v8, v11

    :goto_0
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvSportAnaerobic()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v8

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMBpmZoneCount()[I

    move-result-object v8

    const/4 v12, 0x3

    if-eqz v8, :cond_1

    aget v8, v8, v12

    invoke-static {v8}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OX110i(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    :cond_1
    move-object v8, v11

    :goto_1
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvSportAerobic()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v8

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMBpmZoneCount()[I

    move-result-object v8

    const/4 v13, 0x2

    if-eqz v8, :cond_2

    aget v8, v8, v13

    invoke-static {v8}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OX110i(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_2

    :cond_2
    move-object v8, v11

    :goto_2
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvSportFatBurning()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v8

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMBpmZoneCount()[I

    move-result-object v8

    if-eqz v8, :cond_3

    aget v8, v8, v9

    invoke-static {v8}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OX110i(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_3

    :cond_3
    move-object v8, v11

    :goto_3
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvSportWarmUp()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v8

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMBpmZoneCount()[I

    move-result-object v8

    const/4 v14, 0x0

    if-eqz v8, :cond_4

    aget v8, v8, v14

    invoke-static {v8}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OX110i(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_4

    :cond_4
    move-object v8, v11

    :goto_4
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMBpmZoneCount()[I

    move-result-object v2

    if-eqz v2, :cond_5

    aget v2, v2, v10

    move v15, v9

    int-to-long v9, v2

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    goto :goto_5

    :cond_5
    move v15, v9

    move-object v2, v11

    :goto_5
    invoke-direct {v0, v2, v7, v1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->addMyPieChart(Ljava/lang/Long;ILjava/util/ArrayList;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMBpmZoneCount()[I

    move-result-object v2

    if-eqz v2, :cond_6

    aget v2, v2, v12

    int-to-long v7, v2

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    goto :goto_6

    :cond_6
    move-object v2, v11

    :goto_6
    invoke-direct {v0, v2, v6, v1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->addMyPieChart(Ljava/lang/Long;ILjava/util/ArrayList;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMBpmZoneCount()[I

    move-result-object v2

    if-eqz v2, :cond_7

    aget v2, v2, v13

    int-to-long v6, v2

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    goto :goto_7

    :cond_7
    move-object v2, v11

    :goto_7
    invoke-direct {v0, v2, v5, v1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->addMyPieChart(Ljava/lang/Long;ILjava/util/ArrayList;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMBpmZoneCount()[I

    move-result-object v2

    if-eqz v2, :cond_8

    aget v2, v2, v15

    int-to-long v5, v2

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    goto :goto_8

    :cond_8
    move-object v2, v11

    :goto_8
    invoke-direct {v0, v2, v4, v1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->addMyPieChart(Ljava/lang/Long;ILjava/util/ArrayList;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMBpmZoneCount()[I

    move-result-object v2

    if-eqz v2, :cond_9

    aget v2, v2, v14

    int-to-long v4, v2

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    :cond_9
    invoke-direct {v0, v11, v3, v1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->addMyPieChart(Ljava/lang/Long;ILjava/util/ArrayList;)V

    goto :goto_9

    :cond_a
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getHrPieChart()Lcom/github/mikephil/charting/charts/PieChart;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvSportStrenuous()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    const/16 v8, 0x3e8

    int-to-long v8, v8

    div-long v10, p1, v8

    long-to-int v10, v10

    invoke-static {v10}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OX110i(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvSportAnaerobic()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    div-long v10, p3, v8

    long-to-int v10, v10

    invoke-static {v10}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OX110i(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvSportAerobic()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    div-long v10, p5, v8

    long-to-int v10, v10

    invoke-static {v10}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OX110i(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvSportFatBurning()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    div-long v10, p7, v8

    long-to-int v10, v10

    invoke-static {v10}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OX110i(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getTvSportWarmUp()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v2

    div-long v8, p9, v8

    long-to-int v8, v8

    invoke-static {v8}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OX110i(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static/range {p9 .. p10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v0, v2, v7, v1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->addMyPieChart(Ljava/lang/Long;ILjava/util/ArrayList;)V

    invoke-static/range {p7 .. p8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v0, v2, v6, v1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->addMyPieChart(Ljava/lang/Long;ILjava/util/ArrayList;)V

    invoke-static/range {p5 .. p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v0, v2, v5, v1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->addMyPieChart(Ljava/lang/Long;ILjava/util/ArrayList;)V

    invoke-static/range {p3 .. p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v0, v2, v4, v1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->addMyPieChart(Ljava/lang/Long;ILjava/util/ArrayList;)V

    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v0, v2, v3, v1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->addMyPieChart(Ljava/lang/Long;ILjava/util/ArrayList;)V

    :cond_b
    :goto_9
    invoke-direct {v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMPieChart()Lcom/sma/smartv3/view/MyPieChart;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/sma/smartv3/view/MyPieChart;->OXO1(Ljava/util/ArrayList;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMType()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "addMyPieChart "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " //"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMBpmZoneCount()[I

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "mBpmZoneCount "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    return-void
.end method

.method public final setTrainingPerformance()V
    .locals 13

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->trainingPerformanceVisibility(I)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/hu4;->OXO1:Lcom/android/mltcode/paycertificationapi/hu4;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/hu4;->XOO0ii0(I)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSportMaxV02()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/hu4;->I0IIOi(I)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSportRecoveryTime()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSportRecoveryTimeEstimate()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v3}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->trainingPerformanceVisibility(I)V

    :goto_0
    const v1, 0x7f1414ab

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxVO2()I

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "--"

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxVO2()I

    move-result v3

    div-int/lit8 v3, v3, 0xa

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    :goto_1
    const v4, 0x7f1414aa

    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSportMaxV02()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v4

    new-instance v5, Landroid/text/SpannableStringBuilder;

    invoke-direct {v5, v3}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    new-instance v6, Landroid/text/style/ForegroundColorSpan;

    const/high16 v7, -0x1000000

    invoke-direct {v6, v7}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v8, 0x21

    invoke-virtual {v5, v6, v1, v3, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxVO2()I

    move-result v1

    div-int/lit8 v1, v1, 0xa

    invoke-direct {p0, v1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getV02Level(I)Lkotlin/Pair;

    move-result-object v1

    const v3, 0x7f1414ac

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSportMaxV02Level()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v5

    new-instance v6, Landroid/text/SpannableStringBuilder;

    invoke-direct {v6, v4}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    new-instance v9, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    iget-object v11, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->colorsList:Ljava/util/List;

    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    move-result v12

    rsub-int/lit8 v12, v12, 0x5

    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v11

    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v10

    invoke-direct {v9, v10}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v6, v9, v3, v4, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSportTrainingLoad()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMTrainingLoad()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const v5, 0x7f1413a4

    invoke-virtual {p0, v5, v4}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSportGoalProgressBar()Lcom/sma/smartv3/view/SportGoalProgressBar;

    move-result-object v3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMAerobic()F

    move-result v4

    const/high16 v5, 0x40c00000    # 6.0f

    invoke-virtual {v3, v4, v5}, Lcom/sma/smartv3/view/SportGoalProgressBar;->iO(FF)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSportGoalProgressBar()Lcom/sma/smartv3/view/SportGoalProgressBar;

    move-result-object v3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMAnaerobic()F

    move-result v4

    invoke-virtual {v3, v4, v5}, Lcom/sma/smartv3/view/SportGoalProgressBar;->XO0O10(FF)V

    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->ateList(I)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/o65;->OXO1:Lcom/android/mltcode/paycertificationapi/o65;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lcom/android/mltcode/paycertificationapi/o65;->OIX0iXi(J)J

    move-result-wide v3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMRecoveryTime()I

    move-result v1

    mul-int/lit16 v1, v1, 0x3e8

    int-to-long v5, v1

    add-long/2addr v3, v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-lez v1, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMRecoveryTime()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iIXi1iiXI(I)Lkotlin/Pair;

    move-result-object v0

    const v1, 0x7f141175

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "H"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "M"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSportRecoveryTime()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v2

    new-instance v3, Landroid/text/SpannableStringBuilder;

    invoke-direct {v3, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    new-instance v4, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v4, v7}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v3, v4, v1, v0, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSportRecoveryTimeEstimate()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMRecoveryTime()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getTodayTime(I)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v2, 0x7f1413a3

    invoke-virtual {p0, v2, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_3
    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSportRecoveryTime()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSportRecoveryTimeEstimate()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f140c12

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_2
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a18a7

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ey4;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/ey4;-><init>(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final showQCCode(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "post"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMFeel()I

    move-result v0

    const/16 v1, 0x8

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMTrainingExperience()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMSource()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMDateSourcesTip()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->X0O()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMDeviceQRCodeLayout()Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMDeviceQRCodeLayout()Landroid/widget/LinearLayout;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/cy4;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/cy4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/SportDetailChartFragment;->getMWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMFeel()I

    move-result v0

    if-nez v0, :cond_3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMTrainingExperience()Landroid/widget/LinearLayout;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/dy4;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/dy4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final trainingPerformanceVisibility(I)V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMAteLevel()Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSportMaxV02()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSportMaxV02Level()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSportTrainingLoad()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSportGoalProgressBar()Lcom/sma/smartv3/view/SportGoalProgressBar;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSportRecoveryTime()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->getMSportRecoveryTimeEstimate()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
