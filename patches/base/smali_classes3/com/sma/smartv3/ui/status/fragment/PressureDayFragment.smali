.class public final Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;
.super Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment<",
        "Lcom/sma/smartv3/db/entity/Pressure;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPressureDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PressureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/PressureDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n1869#2,2:277\n99#3,7:279\n106#3,3:287\n79#3,7:290\n109#3:297\n1#4:286\n*S KotlinDebug\n*F\n+ 1 PressureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/PressureDayFragment\n*L\n229#1:277,2\n158#1:279,7\n158#1:287,3\n158#1:290,7\n158#1:297\n158#1:286\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPressureDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PressureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/PressureDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n1869#2,2:277\n99#3,7:279\n106#3,3:287\n79#3,7:290\n109#3:297\n1#4:286\n*S KotlinDebug\n*F\n+ 1 PressureDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/PressureDayFragment\n*L\n229#1:277,2\n158#1:279,7\n158#1:287,3\n158#1:290,7\n158#1:297\n158#1:286\n*E\n"
    }
.end annotation


# instance fields
.field private final aveValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final barChart$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnMeasure$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
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

.field private final hourData:Ljava/util/LinkedHashMap;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/db/entity/Pressure;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mPressureDao:Lcom/sma/smartv3/db/dao/PressureDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSbv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final measurePanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final pressureHourDataList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/PressureDayData;",
            ">;"
        }
    .end annotation
.end field

.field public setValue:Lcom/android/mltcode/paycertificationapi/XXX1X11;

.field private final twoTV$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final twoValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

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

    new-instance v0, Lcom/android/mltcode/paycertificationapi/f42;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/f42;-><init>(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->barChart$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i42;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i42;-><init>(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->aveValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/j42;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/j42;-><init>(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->mSbv$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/k42;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/k42;-><init>(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->twoValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/l42;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/l42;-><init>(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->twoTV$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->values:Ljava/util/List;

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->pressureDao()Lcom/sma/smartv3/db/dao/PressureDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->mPressureDao:Lcom/sma/smartv3/db/dao/PressureDao;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->hourData:Ljava/util/LinkedHashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->pressureHourDataList:Ljava/util/List;

    const/high16 v0, 0x40400000    # 3.0f

    iput v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->highlight:F

    new-instance v0, Lcom/android/mltcode/paycertificationapi/m42;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/m42;-><init>(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->healthLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/n42;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/n42;-><init>(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->healthBtn$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/b42;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/b42;-><init>(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->healthTv$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/c42;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/c42;-><init>(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->healthTipLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/d42;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/d42;-><init>(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->healthQuestions$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/g42;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/g42;-><init>(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->measurePanel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/h42;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/h42;-><init>(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->btnMeasure$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->healthLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->healthBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->twoTV_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Lcom/sma/smartv3/view/CustomBarChartView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->barChart_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->healthQuestions_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->mSbv_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->btnMeasure_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->measurePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->aveValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->healthTipLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->healthTv_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->initView$lambda$2(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->twoValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method private static final aveValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a00f8

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final barChart_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Lcom/sma/smartv3/view/CustomBarChartView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0108

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/CustomBarChartView;

    return-object p0
.end method

.method private static final btnMeasure_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01d7

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final filterData(Ljava/util/List;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Pressure;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->values:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    sget-object v1, Lcom/sma/smartv3/model/PressureDataParse;->INSTANCE:Lcom/sma/smartv3/model/PressureDataParse;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->hourData:Ljava/util/LinkedHashMap;

    iget-object v5, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->pressureHourDataList:Ljava/util/List;

    iget-object v6, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->values:Ljava/util/List;

    move-object v3, p1

    invoke-virtual/range {v1 .. v6}, Lcom/sma/smartv3/model/PressureDataParse;->filterHourData(Landroid/content/Context;Ljava/util/List;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;)Lcom/sma/smartv3/model/PressureDayData;

    sget-object v4, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v5

    const-string p1, "getAxisLeft(...)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object p1

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v6

    const-string p1, "getAxisRight(...)"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object p1

    const v0, 0x7f06024d

    invoke-static {p1, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v9

    const/high16 v7, 0x42c80000    # 100.0f

    const/4 v8, 0x0

    invoke-virtual/range {v4 .. v9}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIX0iXi(Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/components/YAxis;FFI)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->values:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->updateChartData(Ljava/util/List;)V

    move-object p1, v3

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-static {v3}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/db/entity/Pressure;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Pressure;->getMValue()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getHealthBtn()Landroid/widget/Button;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1, v1}, Landroid/view/View;->setEnabled(Z)V

    return-void

    :cond_0
    sget-object v2, Lcom/sma/smartv3/util/HeathReportsUtils;->OXO1:Lcom/sma/smartv3/util/HeathReportsUtils;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Pressure;->getMTime()J

    move-result-wide v4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getHealthBtn()Landroid/widget/Button;

    move-result-object v6

    const-string v0, "<get-healthBtn>(...)"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getHealthTv()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v7

    const-string v11, "<get-healthTv>(...)"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getHealthTipLayout()Landroid/widget/LinearLayout;

    move-result-object v8

    const-string v3, "<get-healthTipLayout>(...)"

    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getHealthQuestions()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v9

    const-string v3, "<get-healthQuestions>(...)"

    invoke-static {v9, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v10

    const-string v3, "pressure"

    invoke-virtual/range {v2 .. v10}, Lcom/sma/smartv3/util/HeathReportsUtils;->X1(Ljava/lang/String;JLandroid/view/View;Landroid/widget/TextView;Landroid/view/View;Landroid/view/View;Landroid/app/Activity;)V

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/i72;->I0i0()Z

    move-result v4

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/i72;->OIIOI()Z

    move-result v3

    if-eqz v3, :cond_1

    move v12, v1

    goto :goto_0

    :cond_1
    move v12, v4

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getHealthLayout()Landroid/widget/LinearLayout;

    move-result-object v3

    const-string v1, "<get-healthLayout>(...)"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getHealthBtn()Landroid/widget/Button;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getHealthTv()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v5

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v6

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Pressure;->getMValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Pressure;->getMTime()J

    move-result-wide v9

    const-string v7, "pressure"

    const-string v11, ""

    invoke-virtual/range {v2 .. v12}, Lcom/sma/smartv3/util/HeathReportsUtils;->iOiXi11II(Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Z)V

    :cond_2
    return-void
.end method

.method private final getAveValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->aveValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->barChart$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/CustomBarChartView;

    return-object v0
.end method

.method private final getBtnMeasure()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->btnMeasure$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getHealthBtn()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->healthBtn$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getHealthLayout()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->healthLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getHealthQuestions()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->healthQuestions$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getHealthTipLayout()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->healthTipLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getHealthTv()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->healthTv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getMSbv()Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->mSbv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    return-object v0
.end method

.method private final getMeasurePanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->measurePanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getTwoTV()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->twoTV$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getTwoValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->twoValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private static final healthBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Landroid/widget/Button;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01c6

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private static final healthLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a05a6

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final healthQuestions_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c54

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final healthTipLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a097f

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final healthTv_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c55

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->initView$lambda$2$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$2(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;Landroid/view/View;)V
    .locals 2

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "start measure pressure"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/a42;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/a42;-><init>(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)V

    const/4 p0, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v1, p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    return-void
.end method

.method private static final initView$lambda$2$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg1"

    const/4 v2, 0x3

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

.method private static final mSbv_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a09de

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    return-object p0
.end method

.method private static final measurePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0829

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final twoTV_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a18d1

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final twoValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a18d3

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private final updateChartData(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XOi0;->XXI()I

    move-result v0

    if-lez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/XOi0;->OIX0iXi(I)Lcom/android/mltcode/paycertificationapi/IXIiiOXi;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type com.github.mikephil.charting.data.BarDataSet"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/android/mltcode/paycertificationapi/XXX1X11;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->setSetValue(Lcom/android/mltcode/paycertificationapi/XXX1X11;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getSetValue()Lcom/android/mltcode/paycertificationapi/XXX1X11;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/github/mikephil/charting/data/DataSet;->IOX1(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getSetValue()Lcom/android/mltcode/paycertificationapi/XXX1X11;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->i0X1iIO()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XOi0;->iX()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->X0i1O()V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXX1X11;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->setDataLabel()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, p1, v2}, Lcom/android/mltcode/paycertificationapi/XXX1X11;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->setSetValue(Lcom/android/mltcode/paycertificationapi/XXX1X11;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getSetValue()Lcom/android/mltcode/paycertificationapi/XXX1X11;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v3

    const v4, 0x7f0600b4

    invoke-static {v3, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->I011X(Ljava/util/List;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getSetValue()Lcom/android/mltcode/paycertificationapi/XXX1X11;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Lcom/android/mltcode/paycertificationapi/XIXi1iX00;

    aput-object v2, v3, v1

    invoke-direct {v0, v3}, Lcom/android/mltcode/paycertificationapi/IXIX1X1;-><init>([Lcom/android/mltcode/paycertificationapi/XIXi1iX00;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/XOi0;->iI(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/github/mikephil/charting/charts/Chart;->setData(Lcom/android/mltcode/paycertificationapi/XOi0;)V

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    const/16 v2, 0x3e8

    invoke-virtual {v0, v2}, Lcom/github/mikephil/charting/charts/Chart;->I0IIOi(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

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

    iput v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->highlight:F

    goto :goto_1

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object p1

    iget v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->highlight:F

    invoke-virtual {p1, v0, v1}, Lcom/github/mikephil/charting/charts/Chart;->II1Xi0(FI)V

    return-void
.end method


# virtual methods
.method public final clearCache(J)V
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->hourData:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    const/4 v0, 0x1

    :goto_0
    const/16 v1, 0x19

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->hourData:Ljava/util/LinkedHashMap;

    mul-int/lit16 v2, v0, 0xe10

    int-to-long v2, v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    add-long/2addr v2, p1

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final getHighlight()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->highlight:F

    return v0
.end method

.method public final getSetValue()Lcom/android/mltcode/paycertificationapi/XXX1X11;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->setValue:Lcom/android/mltcode/paycertificationapi/XXX1X11;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "setValue"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 17

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getAveValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getTwoTV()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    const v3, 0x7f140f72

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getTwoValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v3, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v1

    const-string v2, "<get-barChart>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1(Lcom/github/mikephil/charting/charts/BarChart;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v4

    const-string v1, "getAxisLeft(...)"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v5

    const-string v1, "getAxisRight(...)"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f06024d

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v8

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v3 .. v8}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIX0iXi(Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/components/YAxis;FFI)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "getContext(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    invoke-virtual {v3, v1, v5, v4}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIi0(Lcom/github/mikephil/charting/components/XAxis;ZLandroid/content/Context;)V

    sget-object v3, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    const/4 v4, 0x0

    const/4 v6, 0x5

    invoke-static {v4, v3, v5, v6, v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iOOX010X(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;IILjava/lang/Object;)[J

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->setRange([J)V

    const/high16 v3, 0x40800000    # 4.0f

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->IXOIIIO(F)V

    const/high16 v3, -0x40800000    # -1.0f

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->i0X000X0O(F)V

    const/high16 v3, 0x41c80000    # 25.0f

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOiXi11II(F)V

    const/4 v3, 0x1

    invoke-static {v5, v3, v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XXiIiX10(ZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v7

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    move v9, v5

    :goto_0
    const/16 v10, 0x19

    if-ge v9, v10, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getRange()[J

    move-result-object v10

    aget-wide v11, v10, v5

    mul-int/lit16 v10, v9, 0xe10

    int-to-long v13, v10

    const-wide/16 v15, 0x3e8

    mul-long/2addr v13, v15

    add-long/2addr v11, v13

    invoke-static {v11, v12, v7}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v11

    const/16 v12, 0xc

    if-le v11, v12, :cond_0

    const-string v11, "0"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    const-string v10, "24"

    :cond_0
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v8, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_1
    new-instance v7, Lcom/android/mltcode/paycertificationapi/q4;

    invoke-direct {v7, v8}, Lcom/android/mltcode/paycertificationapi/q4;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, v7}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Oi(Lcom/android/mltcode/paycertificationapi/he6;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getDescription()Lcom/android/mltcode/paycertificationapi/IOOI00X0I;

    move-result-object v7

    invoke-virtual {v7, v5}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v7

    invoke-virtual {v7, v5}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v1, v5}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->setScaleEnabled(Z)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v7

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v8

    invoke-virtual {v8}, Lcom/github/mikephil/charting/charts/Chart;->getAnimator()Lcom/android/mltcode/paycertificationapi/X1i1iOX;

    move-result-object v8

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v9

    invoke-virtual {v9}, Lcom/github/mikephil/charting/charts/Chart;->getViewPortHandler()Lcom/android/mltcode/paycertificationapi/jh6;

    move-result-object v9

    invoke-direct {v1, v7, v8, v9}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;-><init>(Lcom/android/mltcode/paycertificationapi/IXi0IO;Lcom/android/mltcode/paycertificationapi/X1i1iOX;Lcom/android/mltcode/paycertificationapi/jh6;)V

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v7

    invoke-static {v7, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iOOX010X(I)V

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    const v7, 0x7f060544

    invoke-static {v2, v7}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v7

    const v8, 0x7f060545

    invoke-static {v7, v8}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v7

    filled-new-array {v2, v7}, [I

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->I1([I)V

    invoke-virtual {v1, v6}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iIiiO(I)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/github/mikephil/charting/charts/Chart;->setRenderer(Lcom/android/mltcode/paycertificationapi/i0OX00;)V

    invoke-static {v5, v3, v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XO0X10iO(ZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v1

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment$OXO1;

    invoke-direct {v3, v0, v1}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment$OXO1;-><init>(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;Ljava/text/SimpleDateFormat;)V

    invoke-virtual {v2, v3}, Lcom/github/mikephil/charting/charts/Chart;->setOnChartValueSelectedListener(Lcom/android/mltcode/paycertificationapi/uf1;)V

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "requireContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getMSbv()Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    move-result-object v2

    const-string v3, "<get-mSbv>(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, Lcom/sma/smartv3/model/PressureDataKt;->setPressureSbv(Landroid/content/Context;Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getMSbv()Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/sma/smartv3/model/PressureDataKt;->setPressureSbvValue(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;F)V

    invoke-super {v0}, Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment;->initView()V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->iOi1010()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->XI1OX0IO()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getMeasurePanel()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getBtnMeasure()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_4

    new-instance v2, Lcom/android/mltcode/paycertificationapi/e42;

    invoke-direct {v2, v0}, Lcom/android/mltcode/paycertificationapi/e42;-><init>(Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_3
    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getMeasurePanel()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_4

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_4
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e9e

    return v0
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
            "Lcom/sma/smartv3/db/entity/Pressure;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->filterData(Ljava/util/List;)V

    return-void
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

    const-string p1, "onPressureChanged"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment;->changeTime()V

    return-void
.end method

.method public onTimePeriodChange(Ljava/util/Calendar;ILcom/sma/smartv3/util/TimePeriod;)Ljava/util/List;
    .locals 3
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
            "Lcom/sma/smartv3/db/entity/Pressure;",
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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getRange()[J

    move-result-object p1

    const/4 p2, 0x0

    aget-wide v0, p1, p2

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->clearCache(J)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->mPressureDao:Lcom/sma/smartv3/db/dao/PressureDao;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getRange()[J

    move-result-object p3

    aget-wide p2, p3, p2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getRange()[J

    move-result-object v0

    const/4 v1, 0x1

    aget-wide v1, v0, v1

    invoke-interface {p1, p2, p3, v1, v2}, Lcom/sma/smartv3/db/dao/PressureDao;->getPressures(JJ)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final setDataLabel()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "Pressure day Data"

    return-object v0
.end method

.method public final setHighlight(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->highlight:F

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->setValue:Lcom/android/mltcode/paycertificationapi/XXX1X11;

    return-void
.end method

.method public final updateItemData(Lcom/github/mikephil/charting/data/Entry;)V
    .locals 4
    .param p1    # Lcom/github/mikephil/charting/data/Entry;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getMSbv()Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    move-result-object v0

    const-string v1, "<get-mSbv>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result v2

    invoke-static {v0, v2}, Lcom/sma/smartv3/model/PressureDataKt;->setPressureSbvValue(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;F)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->pressureHourDataList:Ljava/util/List;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/Entry;->OIX0iXi()F

    move-result p1

    float-to-int p1, p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/model/PressureDayData;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getNowValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/PressureDayData;->getMin()I

    move-result v2

    invoke-virtual {p1}, Lcom/sma/smartv3/model/PressureDayData;->getMax()I

    move-result v3

    invoke-static {v2, v3}, Lcom/sma/smartv3/util/UtilsKt;->iX(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getTwoValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/PressureDayData;->getStatus()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->Ii1iii0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getAveValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result v2

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->iXiiiO(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/PressureDayFragment;->getMSbv()Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/PressureDayData;->getAvg()I

    move-result p1

    int-to-float p1, p1

    invoke-static {v0, p1}, Lcom/sma/smartv3/model/PressureDataKt;->setPressureSbvValue(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;F)V

    return-void
.end method
