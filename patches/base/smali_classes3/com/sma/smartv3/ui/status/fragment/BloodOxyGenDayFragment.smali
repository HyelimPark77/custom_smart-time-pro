.class public final Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;
.super Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment<",
        "Lcom/sma/smartv3/db/entity/BloodOxygen;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBloodOxyGenDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodOxyGenDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,259:1\n1869#2,2:260\n99#3,7:262\n106#3,3:270\n79#3,7:273\n109#3:280\n1#4:269\n*S KotlinDebug\n*F\n+ 1 BloodOxyGenDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment\n*L\n235#1:260,2\n94#1:262,7\n94#1:270,3\n94#1:273,7\n94#1:280\n94#1:269\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBloodOxyGenDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodOxyGenDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,259:1\n1869#2,2:260\n99#3,7:262\n106#3,3:270\n79#3,7:273\n109#3:280\n1#4:269\n*S KotlinDebug\n*F\n+ 1 BloodOxyGenDayFragment.kt\ncom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment\n*L\n235#1:260,2\n94#1:262,7\n94#1:270,3\n94#1:273,7\n94#1:280\n94#1:269\n*E\n"
    }
.end annotation


# instance fields
.field private final avValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnMeasure$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final dayMinute:I

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

.field private final lineChart$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBloodOxyGenDao:Lcom/sma/smartv3/db/dao/BloodOxygenDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final maxValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final measurePanel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final minValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public setValue:Lcom/github/mikephil/charting/data/LineDataSet;

.field private final values:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/Entry;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i10X1000;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i10X1000;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->lineChart$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OIIIO0I0X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OIIIO0I0X;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->minValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Oi11I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Oi11I;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->maxValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXO0XiIii;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XXO0XiIii;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->avValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iO1Oi0O1i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iO1Oi0O1i;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->measurePanel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0OXiOIi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0OXiOIi;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->btnMeasure$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iiIi0XOX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iiIi0XOX;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->healthLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XOXiiX0O;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XOXiiX0O;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->healthBtn$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ii011IO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ii011IO;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->healthTv$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XI1iX0Oi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XI1iX0Oi;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->healthTipLayout$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0OOOIOiO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I0OOOIOiO;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->healthQuestions$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->values:Ljava/util/List;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XIi00iiXO()I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->dayMinute:I

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->bloodOxygenDao()Lcom/sma/smartv3/db/dao/BloodOxygenDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->mBloodOxyGenDao:Lcom/sma/smartv3/db/dao/BloodOxygenDao;

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->healthTipLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->measurePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->healthLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->healthQuestions_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->maxValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->btnMeasure_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->healthBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->initView$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Lcom/github/mikephil/charting/charts/LineChart;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->lineChart_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->avValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->initView$lambda$0$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->minValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method private static final avValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a00f4

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final btnMeasure_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Landroid/view/View;
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
            "Lcom/sma/smartv3/db/entity/BloodOxygen;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->values:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    sget-object v0, Lcom/sma/smartv3/model/BloodOxyGenDataParse;->INSTANCE:Lcom/sma/smartv3/model/BloodOxyGenDataParse;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getRange()[J

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->values:Ljava/util/List;

    invoke-virtual {v0, v1, p1, v2}, Lcom/sma/smartv3/model/BloodOxyGenDataParse;->filterMinuteData([JLjava/util/List;Ljava/util/List;)Lcom/sma/smartv3/model/BloodOxyGenDayData;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getMinValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/BloodOxyGenDayData;->getMin()I

    move-result v2

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->iXiiiO(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getMaxValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/BloodOxyGenDayData;->getMax()I

    move-result v2

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->iXiiiO(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getAvValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/BloodOxyGenDayData;->getAvg()I

    move-result v2

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->iXiiiO(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getNowValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    invoke-virtual {v0}, Lcom/sma/smartv3/model/BloodOxyGenDayData;->getAvg()I

    move-result v0

    invoke-static {v0}, Lcom/sma/smartv3/util/UtilsKt;->iXiiiO(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->values:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->updateChartData(Ljava/util/List;)V

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/db/entity/BloodOxygen;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/BloodOxygen;->getMValue()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getHealthBtn()Landroid/widget/Button;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1, v1}, Landroid/view/View;->setEnabled(Z)V

    return-void

    :cond_0
    sget-object v2, Lcom/sma/smartv3/util/HeathReportsUtils;->OXO1:Lcom/sma/smartv3/util/HeathReportsUtils;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/BloodOxygen;->getMTime()J

    move-result-wide v4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getHealthBtn()Landroid/widget/Button;

    move-result-object v6

    const-string v0, "<get-healthBtn>(...)"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getHealthTv()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v7

    const-string v11, "<get-healthTv>(...)"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getHealthTipLayout()Landroid/widget/LinearLayout;

    move-result-object v8

    const-string v3, "<get-healthTipLayout>(...)"

    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getHealthQuestions()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v9

    const-string v3, "<get-healthQuestions>(...)"

    invoke-static {v9, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v10

    const-string v3, "blood_oxygen"

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
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getHealthLayout()Landroid/widget/LinearLayout;

    move-result-object v3

    const-string v1, "<get-healthLayout>(...)"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getHealthBtn()Landroid/widget/Button;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getHealthTv()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v5

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v6

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/BloodOxygen;->getMValue()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "%"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/BloodOxygen;->getMTime()J

    move-result-wide v9

    const-string v7, "blood_oxygen"

    const-string v11, ""

    invoke-virtual/range {v2 .. v12}, Lcom/sma/smartv3/util/HeathReportsUtils;->iOiXi11II(Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Z)V

    :cond_2
    return-void
.end method

.method private final getAvValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->avValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getBtnMeasure()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->btnMeasure$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getHealthBtn()Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->healthBtn$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getHealthLayout()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->healthLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getHealthQuestions()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->healthQuestions$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getHealthTipLayout()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->healthTipLayout$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getHealthTv()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->healthTv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method private final getLineChart()Lcom/github/mikephil/charting/charts/LineChart;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->lineChart$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/charts/LineChart;

    return-object v0
.end method

.method private final getMaxValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->maxValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getMeasurePanel()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->measurePanel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getMinValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->minValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private static final healthBtn_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Landroid/widget/Button;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a01c6

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private static final healthLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a05a6

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final healthQuestions_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c54

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method private static final healthTipLayout_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Landroid/widget/LinearLayout;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a097f

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final healthTv_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0c55

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/PFMedium;

    return-object p0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->healthTv_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;Landroid/view/View;)V
    .locals 2

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "start measure"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->IiI10X(Ljava/lang/String;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/Xi1OXI;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/Xi1OXI;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)V

    const/4 p0, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v1, p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    return-void
.end method

.method private static final initView$lambda$0$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "mArg0"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg1"

    const/4 v2, 0x2

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

.method private static final lineChart_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Lcom/github/mikephil/charting/charts/LineChart;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a06a8

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/github/mikephil/charting/charts/LineChart;

    return-object p0
.end method

.method private static final maxValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0768

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final measurePanel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0829

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final minValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a083a

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private final showError()V
    .locals 1

    const v0, 0x7f140f25

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
.end method

.method private final updateChartData(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/Entry;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/co;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/XOi0;->XXI()I

    move-result v1

    if-lez v1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/co;

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/XOi0;->OIX0iXi(I)Lcom/android/mltcode/paycertificationapi/IXIiiOXi;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/github/mikephil/charting/data/LineDataSet;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->setSetValue(Lcom/github/mikephil/charting/data/LineDataSet;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/github/mikephil/charting/data/DataSet;->IOX1(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->i0X1iIO()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/co;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XOi0;->iX()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->X0i1O()V

    goto/16 :goto_0

    :cond_0
    new-instance v1, Lcom/github/mikephil/charting/data/LineDataSet;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->setDataLabel()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, p1, v3}, Lcom/github/mikephil/charting/data/LineDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->setSetValue(Lcom/github/mikephil/charting/data/LineDataSet;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;

    move-result-object v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v3

    const v4, 0x7f060236

    invoke-static {v3, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->II1(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;

    move-result-object v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-static {v3, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/github/mikephil/charting/data/LineDataSet;->I00(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;

    move-result-object v1

    const/high16 v3, 0x40000000    # 2.0f

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/ho;->I1XII0X(F)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;

    move-result-object v1

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v1, v3}, Lcom/github/mikephil/charting/data/LineDataSet;->iXOII(F)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/github/mikephil/charting/data/LineDataSet;->IOI0i0I(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->XXI(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/ho;->O1iXiI(Z)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    const v3, 0x7f0816d1

    invoke-static {v1, v3}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const-string v3, "null cannot be cast to non-null type android.graphics.drawable.Drawable"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/android/mltcode/paycertificationapi/ho;->I0i1OXiI(Landroid/graphics/drawable/Drawable;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/co;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;

    move-result-object v3

    new-array v0, v0, [Lcom/android/mltcode/paycertificationapi/IiXO1XOi;

    aput-object v3, v0, v2

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/co;-><init>([Lcom/android/mltcode/paycertificationapi/IiXO1XOi;)V

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/XOi0;->iI(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/Chart;->setData(Lcom/android/mltcode/paycertificationapi/XOi0;)V

    :goto_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/Chart;->I0IIOi(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

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

    check-cast v0, Lcom/github/mikephil/charting/data/Entry;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result v1

    const/4 v3, 0x0

    cmpl-float v1, v1, v3

    if-lez v1, :cond_1

    invoke-virtual {v0}, Lcom/github/mikephil/charting/data/Entry;->OIX0iXi()F

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->highlight:F

    goto :goto_1

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object p1

    iget v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->highlight:F

    invoke-virtual {p1, v0, v2}, Lcom/github/mikephil/charting/charts/Chart;->II1Xi0(FI)V

    return-void
.end method


# virtual methods
.method public final getHighlight()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->highlight:F

    return v0
.end method

.method public final getSetValue()Lcom/github/mikephil/charting/data/LineDataSet;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->setValue:Lcom/github/mikephil/charting/data/LineDataSet;

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
            "Lcom/github/mikephil/charting/data/Entry;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->values:Ljava/util/List;

    return-object v0
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 14

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iOi1010()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getMeasurePanel()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getBtnMeasure()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v2, Lcom/android/mltcode/paycertificationapi/XOIXO1I;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/XOIXO1I;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getMeasurePanel()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    :goto_0
    sget-object v3, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    const-string v2, "<get-lineChart>(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->XIi00iiXO(Lcom/github/mikephil/charting/charts/LineChart;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v4

    const-string v0, "getAxisLeft(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v5

    const-string v0, "getAxisRight(...)"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v0

    const v2, 0x7f06024d

    invoke-static {v0, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v8

    const/high16 v6, 0x42c80000    # 100.0f

    const/4 v7, 0x0

    invoke-virtual/range {v3 .. v8}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIX0iXi(Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/components/YAxis;FFI)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "getContext(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x1

    invoke-virtual {v3, v0, v5, v4}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIi0(Lcom/github/mikephil/charting/components/XAxis;ZLandroid/content/Context;)V

    sget-object v3, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    const/4 v4, 0x5

    const/4 v6, 0x0

    invoke-static {v6, v3, v1, v4, v6}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iOOX010X(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;IILjava/lang/Object;)[J

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->setRange([J)V

    iget v3, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->dayMinute:I

    int-to-float v3, v3

    const/4 v4, 0x6

    int-to-float v4, v4

    div-float/2addr v3, v4

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->IXOIIIO(F)V

    const/high16 v3, -0x3ee00000    # -10.0f

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->i0X000X0O(F)V

    iget v3, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->dayMinute:I

    int-to-float v3, v3

    const/high16 v4, 0x41200000    # 10.0f

    add-float/2addr v3, v4

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOiXi11II(F)V

    invoke-static {v1, v5, v6}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XXiIiX10(ZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iget v7, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->dayMinute:I

    if-ltz v7, :cond_4

    move v8, v1

    :goto_1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getRange()[J

    move-result-object v9

    aget-wide v10, v9, v1

    const v9, 0xea60

    mul-int/2addr v9, v8

    int-to-long v12, v9

    add-long/2addr v10, v12

    invoke-static {v10, v11, v3}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v10

    const/16 v11, 0xc

    if-le v10, v11, :cond_3

    const-string v10, "0"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    const-string v9, "24"

    :cond_3
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq v8, v7, :cond_4

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_4
    new-instance v3, Lcom/android/mltcode/paycertificationapi/q4;

    invoke-direct {v3, v4}, Lcom/android/mltcode/paycertificationapi/q4;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Oi(Lcom/android/mltcode/paycertificationapi/he6;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getDescription()Lcom/android/mltcode/paycertificationapi/IOOI00X0I;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->setScaleEnabled(Z)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O11X1i1;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v4

    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/Chart;->getAnimator()Lcom/android/mltcode/paycertificationapi/X1i1iOX;

    move-result-object v4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v7

    invoke-virtual {v7}, Lcom/github/mikephil/charting/charts/Chart;->getViewPortHandler()Lcom/android/mltcode/paycertificationapi/jh6;

    move-result-object v7

    invoke-direct {v0, v3, v4, v7}, Lcom/android/mltcode/paycertificationapi/O11X1i1;-><init>(Lcom/android/mltcode/paycertificationapi/eo;Lcom/android/mltcode/paycertificationapi/X1i1iOX;Lcom/android/mltcode/paycertificationapi/jh6;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-static {v3, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/O11X1i1;->i010I(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/github/mikephil/charting/charts/Chart;->setRenderer(Lcom/android/mltcode/paycertificationapi/i0OX00;)V

    invoke-static {v1, v5, v6}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XO0X10iO(ZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->getLineChart()Lcom/github/mikephil/charting/charts/LineChart;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment$OXO1;

    invoke-direct {v2, p0, v0}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment$OXO1;-><init>(Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;Ljava/text/SimpleDateFormat;)V

    invoke-virtual {v1, v2}, Lcom/github/mikephil/charting/charts/Chart;->setOnChartValueSelectedListener(Lcom/android/mltcode/paycertificationapi/uf1;)V

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment;->initView()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e94

    return v0
.end method

.method public final onBloodoxygenChanged(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "blood_oxygen_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "onBloodOxygenChanged! refresh"

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
            "Lcom/sma/smartv3/db/entity/BloodOxygen;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->filterData(Ljava/util/List;)V

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
            "Lcom/sma/smartv3/db/entity/BloodOxygen;",
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

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->mBloodOxyGenDao:Lcom/sma/smartv3/db/dao/BloodOxygenDao;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getRange()[J

    move-result-object p2

    const/4 p3, 0x0

    aget-wide v0, p2, p3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getRange()[J

    move-result-object p2

    const/4 p3, 0x1

    aget-wide v2, p2, p3

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/sma/smartv3/db/dao/BloodOxygenDao;->getBloodOxygen(JJ)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final setDataLabel()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "BloodOxyGen day Data"

    return-object v0
.end method

.method public final setHighlight(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->highlight:F

    return-void
.end method

.method public final setSetValue(Lcom/github/mikephil/charting/data/LineDataSet;)V
    .locals 1
    .param p1    # Lcom/github/mikephil/charting/data/LineDataSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/BloodOxyGenDayFragment;->setValue:Lcom/github/mikephil/charting/data/LineDataSet;

    return-void
.end method

.method public final updateItemData(Lcom/github/mikephil/charting/data/Entry;)V
    .locals 1
    .param p1    # Lcom/github/mikephil/charting/data/Entry;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getNowValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result p1

    float-to-int p1, p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
