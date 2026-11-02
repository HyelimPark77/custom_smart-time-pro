.class public final Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRealTimeMeasurementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealTimeMeasurementActivity.kt\ncom/sma/smartv3/ui/status/RealTimeMeasurementActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,621:1\n19#2:622\n15#2:623\n19#2:624\n15#2:625\n*S KotlinDebug\n*F\n+ 1 RealTimeMeasurementActivity.kt\ncom/sma/smartv3/ui/status/RealTimeMeasurementActivity\n*L\n250#1:622\n250#1:623\n349#1:624\n349#1:625\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRealTimeMeasurementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealTimeMeasurementActivity.kt\ncom/sma/smartv3/ui/status/RealTimeMeasurementActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,621:1\n19#2:622\n15#2:623\n19#2:624\n15#2:625\n*S KotlinDebug\n*F\n+ 1 RealTimeMeasurementActivity.kt\ncom/sma/smartv3/ui/status/RealTimeMeasurementActivity\n*L\n250#1:622\n250#1:623\n349#1:624\n349#1:625\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TYPE_BLOOD_OXYGEN:I = 0x2

.field public static final TYPE_BLOOD_PRESSURE:I = 0x1

.field public static final TYPE_HEARTRATE:I = 0x0

.field public static final TYPE_HRV:I = 0x5

.field public static final TYPE_PRESSURE:I = 0x3

.field public static final TYPE_TEMPERATURE:I = 0x4


# instance fields
.field private final MAX_TIME_OUT:J

.field private final MEASUREMENT_COMPLETE_TIME:J

.field private final btnBottom$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private flag:Z

.field private isShowPopup:Z

.field private final ivIcMeasurement$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final llMeasurement$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBloodOxygenDao:Lcom/sma/smartv3/db/dao/BloodOxygenDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBloodPressureDao:Lcom/sma/smartv3/db/dao/BloodPressureDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCurMeasureType:I

.field private final mHandler:Landroid/os/Handler;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mHeartRateDao:Lcom/sma/smartv3/db/dao/HeartRateDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mHrvDao:Lcom/sma/smartv3/db/dao/HrvDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mLastBpm:I

.field private mLeavePromptPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mMeasurementCompletePopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mMeasurementCompleteRunnable:Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$iO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mPressureDao:Lcom/sma/smartv3/db/dao/PressureDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mStartTime:J

.field private final mTemperatureDao:Lcom/sma/smartv3/db/dao/TemperatureDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTimeoutDetectRunnable:Ljava/lang/Runnable;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rootView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvInfo$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvUnit$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->Companion:Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/wg2;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/wg2;-><init>(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->rootView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xg2;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/xg2;-><init>(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->llMeasurement$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/yg2;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/yg2;-><init>(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->ivIcMeasurement$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zg2;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/zg2;-><init>(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->tvValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ah2;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ah2;-><init>(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->tvUnit$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/bh2;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/bh2;-><init>(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->tvInfo$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/pg2;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/pg2;-><init>(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->btnBottom$delegate:Lkotlin/Lazy;

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/AppDatabase;->heartRateDao()Lcom/sma/smartv3/db/dao/HeartRateDao;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mHeartRateDao:Lcom/sma/smartv3/db/dao/HeartRateDao;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/AppDatabase;->bloodPressureDao()Lcom/sma/smartv3/db/dao/BloodPressureDao;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mBloodPressureDao:Lcom/sma/smartv3/db/dao/BloodPressureDao;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/AppDatabase;->bloodOxygenDao()Lcom/sma/smartv3/db/dao/BloodOxygenDao;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mBloodOxygenDao:Lcom/sma/smartv3/db/dao/BloodOxygenDao;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/AppDatabase;->temperatureDao()Lcom/sma/smartv3/db/dao/TemperatureDao;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mTemperatureDao:Lcom/sma/smartv3/db/dao/TemperatureDao;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/AppDatabase;->pressureDao()Lcom/sma/smartv3/db/dao/PressureDao;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mPressureDao:Lcom/sma/smartv3/db/dao/PressureDao;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->hrvDao()Lcom/sma/smartv3/db/dao/HrvDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mHrvDao:Lcom/sma/smartv3/db/dao/HrvDao;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->flag:Z

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->isShowPopup:Z

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X0100I()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/32 v0, 0xc350

    goto :goto_0

    :cond_0
    const-wide/32 v0, 0x1d4c0

    :goto_0
    iput-wide v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->MAX_TIME_OUT:J

    const-wide/32 v0, 0x9c40

    iput-wide v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->MEASUREMENT_COMPLETE_TIME:J

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mHandler:Landroid/os/Handler;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/qg2;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/qg2;-><init>(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mTimeoutDetectRunnable:Ljava/lang/Runnable;

    new-instance v0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$iO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$iO;-><init>(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mMeasurementCompleteRunnable:Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$iO;

    new-instance v0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$XIi00iiXO;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->ivIcMeasurement_delegate$lambda$0(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->showMeasurementCompletePopup$lambda$0$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->tvValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Landroid/view/ViewGroup;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->llMeasurement_delegate$lambda$0(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Landroid/view/ViewGroup;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->tvInfo_delegate$lambda$0(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->tvUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->showMeasureHintPopup$lambda$1$1(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->btnBottom_delegate$lambda$0(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->showMessureFailedPopup$lambda$0$0(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->initView$lambda$0(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V

    return-void
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->showMessureFailedPopup$lambda$0$1(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mTimeoutDetectRunnable$lambda$0(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V

    return-void
.end method

.method public static final synthetic access$getBtnBottom(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Landroid/view/View;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getBtnBottom()Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getFlag$p(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->flag:Z

    return p0
.end method

.method public static final synthetic access$getMAX_TIME_OUT$p(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->MAX_TIME_OUT:J

    return-wide v0
.end method

.method public static final synthetic access$getMCurMeasureType$p(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mCurMeasureType:I

    return p0
.end method

.method public static final synthetic access$getMEASUREMENT_COMPLETE_TIME$p(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->MEASUREMENT_COMPLETE_TIME:J

    return-wide v0
.end method

.method public static final synthetic access$getMHandler$p(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mHandler:Landroid/os/Handler;

    return-object p0
.end method

.method public static final synthetic access$getMLastBpm$p(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mLastBpm:I

    return p0
.end method

.method public static final synthetic access$getMMeasurementCompletePopup$p(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Lcom/android/mltcode/paycertificationapi/go0;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mMeasurementCompletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    return-object p0
.end method

.method public static final synthetic access$getMMeasurementCompleteRunnable$p(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$iO;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mMeasurementCompleteRunnable:Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$iO;

    return-object p0
.end method

.method public static final synthetic access$getMStartTime$p(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mStartTime:J

    return-wide v0
.end method

.method public static final synthetic access$getMTimeoutDetectRunnable$p(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mTimeoutDetectRunnable:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static final synthetic access$getTvValue(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$isShowPopup$p(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->isShowPopup:Z

    return p0
.end method

.method public static final synthetic access$onMeasurementComplete(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->onMeasurementComplete()V

    return-void
.end method

.method public static final synthetic access$setFlag$p(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->flag:Z

    return-void
.end method

.method public static final synthetic access$setMLastBpm$p(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mLastBpm:I

    return-void
.end method

.method public static final synthetic access$showMessureFailedPopup(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->showMessureFailedPopup()V

    return-void
.end method

.method private static final btnBottom_delegate$lambda$0(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a01b9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final getBtnBottom()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->btnBottom$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getIvIcMeasurement()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->ivIcMeasurement$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getLlMeasurement()Landroid/view/ViewGroup;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->llMeasurement$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    return-object v0
.end method

.method private final getRootView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->rootView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getTvInfo()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->tvInfo$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvUnit()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->tvUnit$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvValue()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->tvValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->showMeasureHintPopup$lambda$1$0(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Z

    move-result p0

    return p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->measurementStart()V

    return-void
.end method

.method private final isMeasuring()Z
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvInfo()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f140f29

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private static final ivIcMeasurement_delegate$lambda$0(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0637

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final llMeasurement_delegate$lambda$0(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Landroid/view/ViewGroup;
    .locals 1

    const v0, 0x7f0a0705

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/view/ViewGroup;

    return-object p0
.end method

.method private static final mTimeoutDetectRunnable$lambda$0(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->isMeasuring()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v1, "measure timeout detect"

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->showMessureFailedPopup()V

    :cond_0
    return-void
.end method

.method private final measurementEnd()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getIvIcMeasurement()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->stop()V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getBtnBottom()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mTimeoutDetectRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method private final measurementStart()V
    .locals 20

    move-object/from16 v0, p0

    const/4 v1, 0x0

    iput v1, v0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mLastBpm:I

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getIvIcMeasurement()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    instance-of v2, v1, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    invoke-virtual {v1}, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->start()V

    :cond_0
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mHandler:Landroid/os/Handler;

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mMeasurementCompleteRunnable:Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$iO;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->flag:Z

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvInfo()Landroid/widget/TextView;

    move-result-object v2

    const v3, 0x7f140f29

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v2

    const v3, 0x7f1403bc

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    iget v2, v0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mCurMeasureType:I

    const/4 v3, 0x4

    if-eqz v2, :cond_6

    if-eq v2, v1, :cond_5

    const/4 v1, 0x2

    if-eq v2, v1, :cond_4

    const/4 v1, 0x3

    if-eq v2, v1, :cond_3

    if-eq v2, v3, :cond_2

    const/4 v1, 0x5

    if-eq v2, v1, :cond_1

    new-instance v4, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;

    const/16 v12, 0x7f

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v4 .. v13}, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;-><init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v14, v4

    goto/16 :goto_0

    :cond_1
    new-instance v5, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;

    const/16 v13, 0x1f

    const/4 v14, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x2

    invoke-direct/range {v5 .. v14}, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;-><init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v14, v5

    goto :goto_0

    :cond_2
    new-instance v6, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;

    const/16 v14, 0x2f

    const/4 v15, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x2

    invoke-direct/range {v6 .. v15}, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;-><init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v14, v6

    goto :goto_0

    :cond_3
    new-instance v7, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;

    const/16 v15, 0x37

    const/16 v16, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x2

    invoke-direct/range {v7 .. v16}, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;-><init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v14, v7

    goto :goto_0

    :cond_4
    new-instance v8, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;

    const/16 v16, 0x3d

    const/16 v17, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x2

    invoke-direct/range {v8 .. v17}, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;-><init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v14, v8

    goto :goto_0

    :cond_5
    new-instance v9, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;

    const/16 v17, 0x3b

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x2

    invoke-direct/range {v9 .. v18}, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;-><init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v14, v9

    goto :goto_0

    :cond_6
    new-instance v10, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;

    const/16 v18, 0x3e

    const/16 v19, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x2

    invoke-direct/range {v10 .. v19}, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;-><init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v14, v10

    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mStartTime:J

    sget-object v11, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v12, Lcom/szabh/smable3/BleKey;->REALTIME_MEASUREMENT:Lcom/szabh/smable3/BleKey;

    sget-object v13, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v17, 0x18

    const/16 v18, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v11 .. v18}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getBtnBottom()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mHandler:Landroid/os/Handler;

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mTimeoutDetectRunnable:Ljava/lang/Runnable;

    iget-wide v3, v0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->MAX_TIME_OUT:J

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private final onFinish()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->isMeasuring()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mLastBpm:I

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->showMeasureHintPopup()V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->sendHeartRate()V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private final onMeasurementComplete()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvInfo()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140f23

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getBtnBottom()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iput-boolean v1, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->isShowPopup:Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getIvIcMeasurement()Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->stop()V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->sendHeartRate()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->showMeasurementCompletePopup()V

    return-void
.end method

.method private static final rootView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a09b5

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final sendHeartRate()V
    .locals 15

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->X0100I()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->I0i1OXiI()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    new-instance v1, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;

    const/16 v9, 0x3e

    const/4 v10, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-direct/range {v1 .. v10}, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;-><init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->REALTIME_MEASUREMENT:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v7, 0x18

    const/4 v8, 0x0

    move-object v4, v1

    move-object v1, v0

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v9

    new-instance v12, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$sendHeartRate$1;

    const/4 v0, 0x0

    invoke-direct {v12, v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$sendHeartRate$1;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method private final showMeasureHintPopup()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mLeavePromptPopup:Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mLeavePromptPopup:Lcom/android/mltcode/paycertificationapi/go0;

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->isShowPopup:Z

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mLeavePromptPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_2

    const v2, 0x7f140f15

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v2, 0x7f140d0d

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    const v1, 0x7f140e03

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/og2;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/og2;-><init>(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/tg2;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/tg2;-><init>(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V

    const v2, 0x7f140360

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    return-void
.end method

.method private static final showMeasureHintPopup$lambda$1$0(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final showMeasureHintPopup$lambda$1$1(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Z
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->isMeasuring()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->measurementStart()V

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method private final showMeasurementCompletePopup()V
    .locals 10

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mMeasurementCompletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0d1034

    invoke-direct {v0, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;I)V

    const v2, 0x7f140f23

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "getString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iI(Ljava/lang/String;)V

    const/4 v2, 0x2

    invoke-static {v0, v1, v1, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/go0;->i010I()Landroid/widget/TextView;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/vg2;

    invoke-direct {v2}, Lcom/android/mltcode/paycertificationapi/vg2;-><init>()V

    const v3, 0x7f14034b

    invoke-virtual {v0, v3, v2}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mMeasurementCompletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getRootView()Landroid/view/View;

    move-result-object v2

    const-string v3, "<get-rootView>(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->XiOIO(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v4

    new-instance v7, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$showMeasurementCompletePopup$2;

    invoke-direct {v7, p0, v1}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$showMeasurementCompletePopup$2;-><init>(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mLeavePromptPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_1
    return-void
.end method

.method private static final showMeasurementCompletePopup$lambda$0$0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private final showMessureFailedPopup()V
    .locals 5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvInfo()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140f14

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, p0, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const v1, 0x7f140f28

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    invoke-virtual {v0, v4}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    const v1, 0x7f14027f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/android/mltcode/paycertificationapi/rg2;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/rg2;-><init>(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/sg2;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/sg2;-><init>(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V

    const v2, 0x7f140f1d

    invoke-virtual {v0, v2, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f1403bc

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->measurementEnd()V

    return-void
.end method

.method private static final showMessureFailedPopup$lambda$0$0(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final showMessureFailedPopup$lambda$0$1(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Z
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->measurementStart()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final tvInfo_delegate$lambda$0(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c9c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvUnit_delegate$lambda$0(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a18ab

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    const v0, 0x7f0a18b0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method


# virtual methods
.method public final getMLeavePromptPopup()Lcom/android/mltcode/paycertificationapi/go0;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mLeavePromptPopup:Lcom/android/mltcode/paycertificationapi/go0;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$XIi00iiXO;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mCurMeasureType:I

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 34

    move-object/from16 v0, p0

    iget v1, v0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mCurMeasureType:I

    const/4 v2, 0x1

    const v3, 0x7f0a0023

    if-eqz v1, :cond_9

    const v4, 0x7f080740

    const v5, 0x7f0604f7

    if-eq v1, v2, :cond_8

    const/4 v6, 0x2

    if-eq v1, v6, :cond_7

    const/4 v6, 0x3

    if-eq v1, v6, :cond_6

    const/4 v6, 0x4

    if-eq v1, v6, :cond_1

    const/4 v2, 0x5

    if-eq v1, v2, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual {v0, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f140f17

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getLlMeasurement()Landroid/view/ViewGroup;

    move-result-object v1

    const v2, 0x7f080742

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getIvIcMeasurement()Landroid/widget/ImageView;

    move-result-object v1

    const v2, 0x7f0812ed

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2, v5}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvUnit()Landroid/widget/TextView;

    move-result-object v1

    const v2, 0x7f140d01

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_4

    :cond_1
    invoke-virtual {v0, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    sget-object v3, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/q62;->XI1OX0IO()Z

    move-result v6

    if-eqz v6, :cond_2

    const v6, 0x7f140237

    goto :goto_0

    :cond_2
    const v6, 0x7f141314

    :goto_0
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getLlMeasurement()Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getIvIcMeasurement()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/q62;->XI1OX0IO()Z

    move-result v3

    if-eqz v3, :cond_3

    const v3, 0x7f08135e

    goto :goto_1

    :cond_3
    const v3, 0x7f0813a0

    :goto_1
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v3

    invoke-static {v3, v5}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvUnit()Landroid/widget/TextView;

    move-result-object v1

    sget-object v3, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

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

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    move-object v4, v3

    :goto_2
    check-cast v4, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v3

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/cp5;->II1Xi0(I)I

    move-result v3

    if-ne v3, v2, :cond_5

    const v2, 0x7f140bad

    goto :goto_3

    :cond_5
    const v2, 0x7f1403da

    :goto_3
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_4

    :cond_6
    invoke-virtual {v0, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f140f1b

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getLlMeasurement()Landroid/view/ViewGroup;

    move-result-object v1

    const v2, 0x7f080743

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getIvIcMeasurement()Landroid/widget/ImageView;

    move-result-object v1

    const v2, 0x7f0812ee

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2, v5}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvUnit()Landroid/widget/TextView;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_4

    :cond_7
    invoke-virtual {v0, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v3, 0x7f140f0f

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getLlMeasurement()Landroid/view/ViewGroup;

    move-result-object v1

    const v3, 0x7f08073f

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v3

    const v4, 0x7f0604f6

    invoke-static {v3, v4}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvUnit()Landroid/widget/TextView;

    move-result-object v1

    const v3, 0x7f1410b6

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(I)V

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroidx/fragment/app/FragmentActivity;)Lcom/bumptech/glide/RequestManager;

    move-result-object v1

    const v3, 0x7f130005

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/request/BaseRequestOptions;->skipMemoryCache(Z)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/RequestBuilder;

    sget-object v2, Lcom/bumptech/glide/load/engine/DiskCacheStrategy;->NONE:Lcom/bumptech/glide/load/engine/DiskCacheStrategy;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/request/BaseRequestOptions;->diskCacheStrategy(Lcom/bumptech/glide/load/engine/DiskCacheStrategy;)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/RequestBuilder;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getIvIcMeasurement()Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    goto/16 :goto_4

    :cond_8
    invoke-virtual {v0, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f140f10

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getLlMeasurement()Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getIvIcMeasurement()Landroid/widget/ImageView;

    move-result-object v1

    const v2, 0x7f0812eb

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2, v5}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvUnit()Landroid/widget/TextView;

    move-result-object v1

    const v2, 0x7f140f62

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    goto :goto_4

    :cond_9
    invoke-virtual {v0, v3}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v3, 0x7f140f16

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getLlMeasurement()Landroid/view/ViewGroup;

    move-result-object v1

    const v3, 0x7f080741

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v3

    const v4, 0x7f0604f8

    invoke-static {v3, v4}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvUnit()Landroid/widget/TextView;

    move-result-object v1

    const v3, 0x7f140248

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(I)V

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroidx/fragment/app/FragmentActivity;)Lcom/bumptech/glide/RequestManager;

    move-result-object v1

    const v3, 0x7f130006

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/request/BaseRequestOptions;->skipMemoryCache(Z)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/RequestBuilder;

    sget-object v2, Lcom/bumptech/glide/load/engine/DiskCacheStrategy;->NONE:Lcom/bumptech/glide/load/engine/DiskCacheStrategy;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/request/BaseRequestOptions;->diskCacheStrategy(Lcom/bumptech/glide/load/engine/DiskCacheStrategy;)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/RequestBuilder;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getIvIcMeasurement()Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :goto_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mStartTime:J

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    new-instance v2, Lcom/android/mltcode/paycertificationapi/ug2;

    invoke-direct {v2, v0}, Lcom/android/mltcode/paycertificationapi/ug2;-><init>(Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;)V

    const-wide/16 v3, 0x1f4

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00ec

    return v0
.end method

.method public final onBloodOxygenChanged(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "blood_oxygen_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->measurementEnd()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvInfo()Landroid/widget/TextView;

    move-result-object p1

    const v0, 0x7f140f23

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->showMeasurementCompletePopup()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mBloodOxygenDao:Lcom/sma/smartv3/db/dao/BloodOxygenDao;

    invoke-interface {p1}, Lcom/sma/smartv3/db/dao/BloodOxygenDao;->getLastBloodOxygen()Lcom/sma/smartv3/db/entity/BloodOxygen;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/BloodOxygen;->getMValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final onBloodPressureChanged(Ljava/lang/Object;)V
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "blood_pressure_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->measurementEnd()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvInfo()Landroid/widget/TextView;

    move-result-object p1

    const v0, 0x7f140f23

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->showMeasurementCompletePopup()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mBloodPressureDao:Lcom/sma/smartv3/db/dao/BloodPressureDao;

    invoke-interface {p1}, Lcom/sma/smartv3/db/dao/BloodPressureDao;->getLastBloodPressure()Lcom/sma/smartv3/db/entity/BloodPressure;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v1

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->sendHeartRate()V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onDestroy()V
    .locals 20

    move-object/from16 v0, p0

    invoke-super {v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mHandler:Landroid/os/Handler;

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mTimeoutDetectRunnable:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    sget-object v3, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$XIi00iiXO;

    invoke-virtual {v3, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mHandler:Landroid/os/Handler;

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mMeasurementCompleteRunnable:Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity$iO;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget v1, v0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mCurMeasureType:I

    if-eqz v1, :cond_5

    const/4 v2, 0x1

    if-eq v1, v2, :cond_4

    const/4 v2, 0x2

    if-eq v1, v2, :cond_3

    const/4 v2, 0x3

    if-eq v1, v2, :cond_2

    const/4 v2, 0x4

    if-eq v1, v2, :cond_1

    const/4 v2, 0x5

    if-eq v1, v2, :cond_0

    new-instance v4, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;

    const/16 v12, 0x7f

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v4 .. v13}, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;-><init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v4

    goto/16 :goto_0

    :cond_0
    new-instance v5, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;

    const/16 v13, 0x1f

    const/4 v14, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x1

    invoke-direct/range {v5 .. v14}, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;-><init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v5

    goto :goto_0

    :cond_1
    new-instance v6, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;

    const/16 v14, 0x2f

    const/4 v15, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x1

    invoke-direct/range {v6 .. v15}, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;-><init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_2
    new-instance v7, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;

    const/16 v15, 0x37

    const/16 v16, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    invoke-direct/range {v7 .. v16}, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;-><init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v7

    goto :goto_0

    :cond_3
    new-instance v8, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;

    const/16 v16, 0x3d

    const/16 v17, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    invoke-direct/range {v8 .. v17}, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;-><init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v8

    goto :goto_0

    :cond_4
    new-instance v9, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;

    const/16 v17, 0x3b

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    invoke-direct/range {v9 .. v18}, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;-><init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v9

    goto :goto_0

    :cond_5
    new-instance v10, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;

    const/16 v18, 0x3e

    const/16 v19, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1

    invoke-direct/range {v10 .. v19}, Lcom/szabh/smable3/entity/BleRealTimeMeasurement;-><init>(IIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v10

    :goto_0
    sget-object v4, Lcom/szabh/smable3/BleKey;->REALTIME_MEASUREMENT:Lcom/szabh/smable3/BleKey;

    sget-object v5, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v9, 0x18

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v10}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    return-void
.end method

.method public final onHeartRateChanged(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "heart_rate_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->X0100I()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/q62;->I0i1OXiI()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->measurementEnd()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvInfo()Landroid/widget/TextView;

    move-result-object p1

    const v0, 0x7f140f23

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->showMeasurementCompletePopup()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mHeartRateDao:Lcom/sma/smartv3/db/dao/HeartRateDao;

    invoke-interface {p1}, Lcom/sma/smartv3/db/dao/HeartRateDao;->getLastHeartRate()Lcom/sma/smartv3/db/entity/HeartRate;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mLastBpm:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p1

    iget v0, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mLastBpm:I

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->iXiiiO(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final onHrvChanged(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "hrv_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->measurementEnd()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvInfo()Landroid/widget/TextView;

    move-result-object p1

    const v0, 0x7f140f23

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->showMeasurementCompletePopup()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mHrvDao:Lcom/sma/smartv3/db/dao/HrvDao;

    invoke-interface {p1}, Lcom/sma/smartv3/db/dao/HrvDao;->getLastData()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/db/entity/Hrv;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Hrv;->getMValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1
    .param p2    # Landroid/view/KeyEvent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->onFinish()V

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/AppCompatActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onPressureChanged(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "pressure_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->measurementEnd()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvInfo()Landroid/widget/TextView;

    move-result-object p1

    const v0, 0x7f140f23

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->showMeasurementCompletePopup()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mPressureDao:Lcom/sma/smartv3/db/dao/PressureDao;

    invoke-interface {p1}, Lcom/sma/smartv3/db/dao/PressureDao;->getLastData()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/db/entity/Pressure;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Pressure;->getMValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final onTemperatureChanged(Ljava/lang/Object;)V
    .locals 34
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "temperature_change"
    .end annotation

    const-string v0, "data"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->measurementEnd()V

    invoke-direct/range {p0 .. p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvInfo()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140f23

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct/range {p0 .. p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->showMeasurementCompletePopup()V

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mTemperatureDao:Lcom/sma/smartv3/db/dao/TemperatureDao;

    invoke-interface {v1}, Lcom/sma/smartv3/db/dao/TemperatureDao;->getLastData()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->getTvValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/Temperature;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Temperature;->getMTemperature()I

    move-result v1

    int-to-float v1, v1

    const/high16 v3, 0x41200000    # 10.0f

    div-float/2addr v1, v3

    sget-object v3, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

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

    invoke-virtual {v4}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v3

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/cp5;->II1Xi0(I)I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    invoke-static {v1, v4}, Lcom/android/mltcode/paycertificationapi/cp5;->i010I(FZ)F

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->onFinish()V

    return-void
.end method

.method public final setMLeavePromptPopup(Lcom/android/mltcode/paycertificationapi/go0;)V
    .locals 0
    .param p1    # Lcom/android/mltcode/paycertificationapi/go0;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;->mLeavePromptPopup:Lcom/android/mltcode/paycertificationapi/go0;

    return-void
.end method
