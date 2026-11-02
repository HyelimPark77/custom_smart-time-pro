.class public final Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;
.super Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment<",
        "Lcom/sma/smartv3/db/entity/BloodPressure;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBloodPressureDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodPressureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,350:1\n1869#2,2:351\n99#3,7:353\n106#3,3:361\n79#3,7:364\n109#3:371\n1#4:360\n*S KotlinDebug\n*F\n+ 1 BloodPressureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment\n*L\n305#1:351,2\n115#1:353,7\n115#1:361,3\n115#1:364,7\n115#1:371\n115#1:360\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBloodPressureDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodPressureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,350:1\n1869#2,2:351\n99#3,7:353\n106#3,3:361\n79#3,7:364\n109#3:371\n1#4:360\n*S KotlinDebug\n*F\n+ 1 BloodPressureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment\n*L\n305#1:351,2\n115#1:353,7\n115#1:361,3\n115#1:364,7\n115#1:371\n115#1:360\n*E\n"
    }
.end annotation


# instance fields
.field private final barChart$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnCalibration$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnMeasure$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final calibrationPanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final dbpAvgValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final dbpValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private filterDataMap:Ljava/util/LinkedHashMap;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Lcom/sma/smartv3/model/BPHourData;",
            ">;"
        }
    .end annotation
.end field

.field private final healthBtn$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final healthLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final healthQuestions$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final healthTipLayout$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final healthTv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private highlight:F

.field private final hourData:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/BPHourData;",
            ">;"
        }
    .end annotation
.end field

.field private final mBloodPressureDao:Lcom/sma/smartv3/db/dao/BloodPressureDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCalibrationPopup:Lcom/android/mltcode/paycertificationapi/i1XOiXX;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mDiastolic:I

.field private mSystolic:I

.field private final measurePanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sbpAvgValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sbpValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public setValue:Lcom/android/mltcode/paycertificationapi/XXX1X11;

.field private final values:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IiiXO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IiiXO;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->barChart$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0iX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O0iX;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->sbpValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0IiIO0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O0IiIO0;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->dbpValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iOIX0O1OX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iOIX0O1OX;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->sbpAvgValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXiO10;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IXiO10;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->dbpAvgValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXiI0OX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IXiI0OX;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->measurePanel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X110X011X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X110X011X;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->btnMeasure$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0i1O0XO1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I0i1O0XO1;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->calibrationPanel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0OO111XI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I0OO111XI;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->btnCalibration$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->values:Ljava/util/List;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->filterDataMap:Ljava/util/LinkedHashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->hourData:Ljava/util/List;

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->bloodPressureDao()Lcom/sma/smartv3/db/dao/BloodPressureDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->mBloodPressureDao:Lcom/sma/smartv3/db/dao/BloodPressureDao;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0iX1XOX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0iX1XOX;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->healthLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iI10i1OXi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iI10i1OXi;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->healthBtn$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IOO0O;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IOO0O;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->healthTv$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XiOOO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XiOOO;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->healthTipLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXXIOI1i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iXXIOI1i;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->healthQuestions$delegate:Lkotlin/Lazy;

    const/16 v0, 0x73

    iput v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->mSystolic:I

    const/16 v0, 0x4b

    iput v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->mDiastolic:I

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->dbpAvgValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->healthTv_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic II1Xi0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->realTimeMeasurement$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->healthLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->btnMeasure_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->calibrationPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->healthBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->sbpValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->btnCalibration_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Lcom/github/mikephil/charting/charts/BarChart;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->barChart_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->sbpAvgValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->manualCalibration$lambda$1(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->manualCalibration$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;Landroid/view/View;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->healthTipLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->realTimeMeasurement$lambda$0$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final barChart_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Lcom/github/mikephil/charting/charts/BarChart;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0108

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/github/mikephil/charting/charts/BarChart;

    return-object p0
.end method

.method private static final btnCalibration_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01bd

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final btnMeasure_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01d7

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final calibrationPanel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01fe

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final calibrationPopup$lambda$0$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;II)Z
    .locals 9

    iput p1, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->mSystolic:I

    iput p2, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->mDiastolic:I

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p2

    const-string v0, "BLOOD_PRESSURE_SYSTOLIC"

    iget v1, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->mSystolic:I

    invoke-virtual {p2, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string p2, "BLOOD_PRESSURE_DIASTOLIC"

    iget v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->mDiastolic:I

    invoke-virtual {p1, p2, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    sget-object v1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v2, Lcom/szabh/smable3/BleKey;->BLOOD_PRESSURE_CALIBRATION:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    new-instance v4, Lcom/szabh/smable3/entity/BleBloodPressureCalibration;

    iget p1, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->mSystolic:I

    iget p0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->mDiastolic:I

    invoke-direct {v4, p1, p0}, Lcom/szabh/smable3/entity/BleBloodPressureCalibration;-><init>(II)V

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    const/4 p0, 0x1

    return p0
.end method

.method private static final dbpAvgValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a02da

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final dbpValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a02db

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private final filterData(Ljava/util/List;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/BloodPressure;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->values:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    sget-object v2, Lcom/sma/smartv3/model/BPDataParse;->INSTANCE:Lcom/sma/smartv3/model/BPDataParse;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getRange()[J

    move-result-object v3

    iget-object v4, v0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->hourData:Ljava/util/List;

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->values:Ljava/util/List;

    invoke-virtual {v2, v3, v1, v4, v5}, Lcom/sma/smartv3/model/BPDataParse;->filterHourData([JLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->values:Ljava/util/List;

    invoke-direct {v0, v2}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->updateChartData(Ljava/util/List;)V

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/BloodPressure;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getHealthBtn()Landroid/widget/Button;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1, v3}, Landroid/view/View;->setEnabled(Z)V

    return-void

    :cond_0
    const v2, 0x7f141301

    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v4

    const v5, 0x7f140447

    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ","

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    sget-object v4, Lcom/sma/smartv3/util/HeathReportsUtils;->OXO1:Lcom/sma/smartv3/util/HeathReportsUtils;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMTime()J

    move-result-wide v6

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getHealthBtn()Landroid/widget/Button;

    move-result-object v8

    const-string v2, "<get-healthBtn>(...)"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getHealthTv()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v9

    const-string v13, "<get-healthTv>(...)"

    invoke-static {v9, v13}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getHealthTipLayout()Landroid/widget/LinearLayout;

    move-result-object v10

    const-string v5, "<get-healthTipLayout>(...)"

    invoke-static {v10, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getHealthQuestions()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v11

    const-string v5, "<get-healthQuestions>(...)"

    invoke-static {v11, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v12

    const-string v5, "blood_pressure"

    invoke-virtual/range {v4 .. v12}, Lcom/sma/smartv3/util/HeathReportsUtils;->X1(Ljava/lang/String;JLandroid/view/View;Landroid/widget/TextView;Landroid/view/View;Landroid/view/View;Landroid/app/Activity;)V

    sget-object v5, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/i72;->I0i0()Z

    move-result v6

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/i72;->OIIOI()Z

    move-result v5

    if-eqz v5, :cond_1

    move/from16 v18, v3

    goto :goto_0

    :cond_1
    move/from16 v18, v6

    :goto_0
    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getHealthLayout()Landroid/widget/LinearLayout;

    move-result-object v9

    const-string v3, "<get-healthLayout>(...)"

    invoke-static {v9, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getHealthBtn()Landroid/widget/Button;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getHealthTv()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v11

    invoke-static {v11, v13}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v12

    const-string v13, "blood_pressure"

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMTime()J

    move-result-wide v15

    const-string v17, ""

    move-object v8, v4

    invoke-virtual/range {v8 .. v18}, Lcom/sma/smartv3/util/HeathReportsUtils;->iOiXi11II(Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Z)V

    :cond_2
    return-void
.end method

.method private final getBarChart()Lcom/github/mikephil/charting/charts/BarChart;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->barChart$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/charts/BarChart;

    return-object v0
.end method

.method private final getBtnCalibration()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->btnCalibration$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getBtnMeasure()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->btnMeasure$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getCalibrationPanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->calibrationPanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getDbpAvgValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->dbpAvgValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getDbpValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->dbpValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getHealthBtn()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->healthBtn$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getHealthLayout()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->healthLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getHealthQuestions()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->healthQuestions$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getHealthTipLayout()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->healthTipLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getHealthTv()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->healthTv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getMeasurePanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->measurePanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getSbpAvgValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->sbpAvgValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getSbpValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->sbpValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private static final healthBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Landroid/widget/Button;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01c6

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private static final healthLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a05a6

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final healthQuestions_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c54

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final healthTipLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a097f

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final healthTv_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c55

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method public static synthetic i010I(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->dbpValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;II)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->calibrationPopup$lambda$0$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;II)Z

    move-result p0

    return p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->healthQuestions_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iX(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->measurePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final manualCalibration()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->OiXX0()Z

    move-result v1

    const/16 v2, 0x8

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iOi1010()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a082a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getCalibrationPanel()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i0OX00O1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/i0OX00O1;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getBtnCalibration()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iXiIiIO0;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/iXiIiIO0;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getCalibrationPanel()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    return-void
.end method

.method private static final manualCalibration$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p3, 0x0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x4

    if-ne p2, p1, :cond_0

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->mCalibrationPopup:Lcom/android/mltcode/paycertificationapi/i1XOiXX;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p0

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    return p3
.end method

.method private static final manualCalibration$lambda$1(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->calibrationPopup()V

    return-void
.end method

.method private static final measurePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0829

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final realTimeMeasurement()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iOi1010()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getMeasurePanel()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getBtnMeasure()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I1iX0I;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/I1iX0I;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getMeasurePanel()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method private static final realTimeMeasurement$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;Landroid/view/View;)V
    .locals 2

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "start measure"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/Oi11iOXii;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/Oi11iOXii;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)V

    const/4 p0, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v1, p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    return-void
.end method

.method private static final realTimeMeasurement$lambda$0$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg1"

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mArg2"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/sma/smartv3/ui/status/RealTimeMeasurementActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final sbpAvgValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a09dc

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final sbpValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a09dd

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private final updateChartData(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XOi0;->XXI()I

    move-result v0

    if-lez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/XOi0;->OIX0iXi(I)Lcom/android/mltcode/paycertificationapi/IXIiiOXi;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type com.github.mikephil.charting.data.BarDataSet"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/android/mltcode/paycertificationapi/XXX1X11;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->setSetValue(Lcom/android/mltcode/paycertificationapi/XXX1X11;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getSetValue()Lcom/android/mltcode/paycertificationapi/XXX1X11;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/github/mikephil/charting/data/DataSet;->IOX1(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getSetValue()Lcom/android/mltcode/paycertificationapi/XXX1X11;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->i0X1iIO()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XOi0;->iX()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->X0i1O()V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXX1X11;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->setDataLabel()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, p1, v2}, Lcom/android/mltcode/paycertificationapi/XXX1X11;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->setSetValue(Lcom/android/mltcode/paycertificationapi/XXX1X11;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getSetValue()Lcom/android/mltcode/paycertificationapi/XXX1X11;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Lcom/android/mltcode/paycertificationapi/XIXi1iX00;

    aput-object v2, v3, v1

    invoke-direct {v0, v3}, Lcom/android/mltcode/paycertificationapi/IXIX1X1;-><init>([Lcom/android/mltcode/paycertificationapi/XIXi1iX00;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/XOi0;->iI(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/github/mikephil/charting/charts/Chart;->setData(Lcom/android/mltcode/paycertificationapi/XOi0;)V

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    const/16 v2, 0x3e8

    invoke-virtual {v0, v2}, Lcom/github/mikephil/charting/charts/Chart;->I0IIOi(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/data/BarEntry;

    invoke-virtual {v0}, Lcom/github/mikephil/charting/data/BarEntry;->O00()F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-lez v2, :cond_1

    invoke-virtual {v0}, Lcom/github/mikephil/charting/data/Entry;->OIX0iXi()F

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->highlight:F

    goto :goto_1

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object p1

    iget v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->highlight:F

    invoke-virtual {p1, v0, v1}, Lcom/github/mikephil/charting/charts/Chart;->II1Xi0(FI)V

    return-void
.end method


# virtual methods
.method public final calibrationPopup()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->mCalibrationPopup:Lcom/android/mltcode/paycertificationapi/i1XOiXX;

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1XOiXX;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1XOiXX;-><init>(Landroid/app/Activity;)V

    const v1, 0x7f140e78

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1XOiXX;->iX(I)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O10X00II;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/O10X00II;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1XOiXX;->i010I(Lkotlin/jvm/functions/Function2;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->mCalibrationPopup:Lcom/android/mltcode/paycertificationapi/i1XOiXX;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->mCalibrationPopup:Lcom/android/mltcode/paycertificationapi/i1XOiXX;

    if-eqz v0, :cond_1

    iget v1, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->mSystolic:I

    iget v2, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->mDiastolic:I

    invoke-virtual {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/i1XOiXX;->II1Xi0(II)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method public final getHighlight()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->highlight:F

    return v0
.end method

.method public final getMDiastolic()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->mDiastolic:I

    return v0
.end method

.method public final getMSystolic()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->mSystolic:I

    return v0
.end method

.method public final getSetValue()Lcom/android/mltcode/paycertificationapi/XXX1X11;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->setValue:Lcom/android/mltcode/paycertificationapi/XXX1X11;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "setValue"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getValues()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->values:Ljava/util/List;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->init(Landroid/os/Bundle;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "BLOOD_PRESSURE_SYSTOLIC"

    const/16 v2, 0x73

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->mSystolic:I

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "BLOOD_PRESSURE_DIASTOLIC"

    const/16 v1, 0x4b

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->mDiastolic:I

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 15

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->realTimeMeasurement()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->manualCalibration()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    const-string v2, "<get-barChart>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1(Lcom/github/mikephil/charting/charts/BarChart;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v1

    const-string v2, "getAxisLeft(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v2

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v2

    const-string v3, "getAxisRight(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v3

    const v6, 0x7f06024d

    invoke-static {v3, v6}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v5

    const/4 v3, 0x0

    const/high16 v4, 0x42480000    # 50.0f

    invoke-virtual/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIX0iXi(Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/components/YAxis;FFI)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getDescription()Lcom/android/mltcode/paycertificationapi/IOOI00X0I;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v1, v3}, Lcom/github/mikephil/charting/charts/BarChart;->setDrawValueAboveBar(Z)V

    invoke-virtual {v1, v3}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->setScaleEnabled(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v4, "getContext(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v3, v2}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIi0(Lcom/github/mikephil/charting/components/XAxis;ZLandroid/content/Context;)V

    sget-object v0, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    const/4 v2, 0x5

    const/4 v4, 0x0

    invoke-static {v4, v0, v3, v2, v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iOOX010X(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;IILjava/lang/Object;)[J

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->setRange([J)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->IXOIIIO(F)V

    const/4 v0, 0x7

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->XOIX(I)V

    const/high16 v0, 0x41c80000    # 25.0f

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOiXi11II(F)V

    const/4 v0, 0x1

    invoke-static {v3, v0, v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XXiIiX10(ZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v2

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    move v7, v3

    :goto_0
    const/16 v8, 0x19

    if-ge v7, v8, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getRange()[J

    move-result-object v8

    aget-wide v9, v8, v3

    mul-int/lit16 v8, v7, 0xe10

    int-to-long v11, v8

    const-wide/16 v13, 0x3e8

    mul-long/2addr v11, v13

    add-long/2addr v9, v11

    invoke-static {v9, v10, v2}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v9

    const/16 v10, 0xc

    if-le v9, v10, :cond_0

    const-string v9, "0"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    const-string v8, "24"

    :cond_0
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    new-instance v2, Lcom/android/mltcode/paycertificationapi/q4;

    invoke-direct {v2, v5}, Lcom/android/mltcode/paycertificationapi/q4;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Oi(Lcom/android/mltcode/paycertificationapi/he6;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v5

    invoke-virtual {v5}, Lcom/github/mikephil/charting/charts/Chart;->getAnimator()Lcom/android/mltcode/paycertificationapi/X1i1iOX;

    move-result-object v5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v7

    invoke-virtual {v7}, Lcom/github/mikephil/charting/charts/Chart;->getViewPortHandler()Lcom/android/mltcode/paycertificationapi/jh6;

    move-result-object v7

    invoke-direct {v1, v2, v5, v7}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;-><init>(Lcom/android/mltcode/paycertificationapi/IXi0IO;Lcom/android/mltcode/paycertificationapi/X1i1iOX;Lcom/android/mltcode/paycertificationapi/jh6;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2, v6}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iOOX010X(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    const v5, 0x7f06008c

    invoke-static {v2, v5}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->OII(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    const v5, 0x7f060087

    invoke-static {v2, v5}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v5

    const v6, 0x7f06008f

    invoke-static {v5, v6}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v5

    filled-new-array {v2, v5}, [I

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->I1([I)V

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iIiiO(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/github/mikephil/charting/charts/Chart;->setRenderer(Lcom/android/mltcode/paycertificationapi/i0OX00;)V

    invoke-static {v3, v0, v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XO0X10iO(ZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment$OXO1;

    invoke-direct {v2, p0, v0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment$OXO1;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;Ljava/text/SimpleDateFormat;)V

    invoke-virtual {v1, v2}, Lcom/github/mikephil/charting/charts/Chart;->setOnChartValueSelectedListener(Lcom/android/mltcode/paycertificationapi/uf1;)V

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment;->initView()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e95

    return v0
.end method

.method public final onBloodPressureChanged(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "blood_pressure_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "onBloodPressureChanged! refresh"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->setMOffset(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getMCalendar()Ljava/util/Calendar;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getMOffset()I

    move-result v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getMTimePeriod()Lcom/sma/smartv3/util/TimePeriod;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment;->update(Ljava/util/Calendar;ILcom/sma/smartv3/util/TimePeriod;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getMCalendar()Ljava/util/Calendar;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getMOffset()I

    move-result v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getMTimePeriod()Lcom/sma/smartv3/util/TimePeriod;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OII(Ljava/util/Calendar;ILcom/sma/smartv3/util/TimePeriod;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getMTimePeriod()Lcom/sma/smartv3/util/TimePeriod;

    move-result-object v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v1, v0, v1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->X0i1O(Lcom/sma/smartv3/util/DateTimeFormat;ILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v0

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getTvCurrent()Landroid/widget/TextView;

    move-result-object p1

    const v0, 0x7f14134e

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getTvCurrent()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

.method public onDataChange(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/BloodPressure;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->filterData(Ljava/util/List;)V

    return-void
.end method

.method public onTimePeriodChange(Ljava/util/Calendar;ILcom/sma/smartv3/util/TimePeriod;)Ljava/util/List;
    .locals 4
    .param p1    # Ljava/util/Calendar;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/util/TimePeriod;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Calendar;",
            "I",
            "Lcom/sma/smartv3/util/TimePeriod;",
            ")",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/BloodPressure;",
            ">;"
        }
    .end annotation

    const-string v0, "calendar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timePeriod"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3, p2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->I1(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;I)[J

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->setRange([J)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->mBloodPressureDao:Lcom/sma/smartv3/db/dao/BloodPressureDao;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getRange()[J

    move-result-object p2

    const/4 p3, 0x0

    aget-wide v0, p2, p3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getRange()[J

    move-result-object p2

    const/4 p3, 0x1

    aget-wide v2, p2, p3

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/sma/smartv3/db/dao/BloodPressureDao;->getBloodPressures(JJ)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final setDataLabel()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "BP day Data"

    return-object v0
.end method

.method public final setHighlight(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->highlight:F

    return-void
.end method

.method public final setMDiastolic(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->mDiastolic:I

    return-void
.end method

.method public final setMSystolic(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->mSystolic:I

    return-void
.end method

.method public final setSetValue(Lcom/android/mltcode/paycertificationapi/XXX1X11;)V
    .locals 1
    .param p1    # Lcom/android/mltcode/paycertificationapi/XXX1X11;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->setValue:Lcom/android/mltcode/paycertificationapi/XXX1X11;

    return-void
.end method

.method public final updateItemData(Lcom/github/mikephil/charting/data/Entry;)V
    .locals 7
    .param p1    # Lcom/github/mikephil/charting/data/Entry;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->hourData:Ljava/util/List;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/Entry;->OIX0iXi()F

    move-result p1

    float-to-int p1, p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/model/BPHourData;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getSbpValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BPHourData;->getSbpMin()I

    move-result v1

    const-string v2, "format(...)"

    const/4 v3, 0x2

    const-string v4, "%d-%d"

    const-string v5, "--"

    if-nez v1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BPHourData;->getSbpMax()I

    move-result v1

    if-nez v1, :cond_0

    move-object v1, v5

    goto :goto_0

    :cond_0
    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BPHourData;->getSbpMin()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BPHourData;->getSbpMax()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v1, v6}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getDbpValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BPHourData;->getDbpMin()I

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BPHourData;->getDbpMax()I

    move-result v1

    if-nez v1, :cond_1

    move-object v1, v5

    goto :goto_1

    :cond_1
    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BPHourData;->getDbpMin()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BPHourData;->getDbpMax()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v1, v6}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getSbpAvgValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BPHourData;->getSbpTotal()I

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BPHourData;->getSbpNum()I

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lcom/sma/smartv3/model/BPHourData;->getSbpTotal()I

    move-result v1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BPHourData;->getSbpNum()I

    move-result v2

    div-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_3
    :goto_2
    move-object v1, v5

    :goto_3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodPressureDayFragment;->getDbpAvgValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BPHourData;->getDbpTotal()I

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BPHourData;->getDbpNum()I

    move-result v1

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {p1}, Lcom/sma/smartv3/model/BPHourData;->getDbpTotal()I

    move-result v1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/BPHourData;->getDbpNum()I

    move-result p1

    div-int/2addr v1, p1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    :cond_5
    :goto_4
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
