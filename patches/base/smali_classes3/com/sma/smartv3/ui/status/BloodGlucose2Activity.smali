.class public final Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBloodGlucose2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucose2Activity.kt\ncom/sma/smartv3/ui/status/BloodGlucose2Activity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,287:1\n15#2:288\n69#3,3:289\n72#3,5:293\n69#3,3:298\n72#3,5:302\n69#3,3:307\n72#3,5:311\n1#4:292\n1#4:301\n1#4:310\n*S KotlinDebug\n*F\n+ 1 BloodGlucose2Activity.kt\ncom/sma/smartv3/ui/status/BloodGlucose2Activity\n*L\n75#1:288\n279#1:289,3\n279#1:293,5\n135#1:298,3\n135#1:302,5\n129#1:307,3\n129#1:311,5\n279#1:292\n135#1:301\n129#1:310\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBloodGlucose2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodGlucose2Activity.kt\ncom/sma/smartv3/ui/status/BloodGlucose2Activity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,287:1\n15#2:288\n69#3,3:289\n72#3,5:293\n69#3,3:298\n72#3,5:302\n69#3,3:307\n72#3,5:311\n1#4:292\n1#4:301\n1#4:310\n*S KotlinDebug\n*F\n+ 1 BloodGlucose2Activity.kt\ncom/sma/smartv3/ui/status/BloodGlucose2Activity\n*L\n75#1:288\n279#1:289,3\n279#1:293,5\n135#1:298,3\n135#1:302,5\n129#1:307,3\n129#1:311,5\n279#1:292\n135#1:301\n129#1:310\n*E\n"
    }
.end annotation


# instance fields
.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final barView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnMeasure$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnRiskLevel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final ivRiskLevel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final llDiabeticRiskInsight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final llNoMeasurement$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBloodGlucoseList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/BloodGlucose2;",
            ">;"
        }
    .end annotation
.end field

.field private final rvRiskLevel$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvDiabeticRiskInsight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvDiabeticRiskTips$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvMeasureDate$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvNoRecord$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvRiskDate$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvRiskRangeDate$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X01X01i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X01X01i;-><init>(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->abhTitleRight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OX10O1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OX10O1;-><init>(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->llNoMeasurement$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ii0OX0i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ii0OX0i;-><init>(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->barView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1IIOX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i1IIOX;-><init>(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->btnMeasure$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X1X101OXX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X1X101OXX;-><init>(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->tvMeasureDate$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OiiI1I0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OiiI1I0;-><init>(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->tvNoRecord$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I011iiIXO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I011iiIXO;-><init>(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->ivRiskLevel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XOXX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XOXX;-><init>(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->btnRiskLevel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IiO0X101I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IiO0X101I;-><init>(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->tvRiskRangeDate$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OOXO01;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OOXO01;-><init>(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->rvRiskLevel$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OO0OX1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OO0OX1;-><init>(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->llDiabeticRiskInsight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/II1XXIX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/II1XXIX;-><init>(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->tvDiabeticRiskInsight$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X0XO;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/X0XO;-><init>(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->tvRiskDate$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0XXiIX0X;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/I0XXiIX0X;-><init>(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->tvDiabeticRiskTips$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->mBloodGlucoseList:Ljava/util/List;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->llDiabeticRiskInsight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->btnRiskLevel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->initRange$lambda$0$0$0$1(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->btnMeasure_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->tvMeasureDate_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OII(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->tvDiabeticRiskInsight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi()Z
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->initRange$lambda$0$0$0$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic OX(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->tvRiskDate_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->initRange$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X01IiOiIi(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->tvNoRecord_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->ivRiskLevel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->barView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->tvRiskRangeDate_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->rvRiskLevel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->llNoMeasurement_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$getMBloodGlucoseList$p(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->mBloodGlucoseList:Ljava/util/List;

    return-object p0
.end method

.method private static final barView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;
    .locals 1

    const v0, 0x7f0a0109

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;

    return-object p0
.end method

.method private static final btnMeasure_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a01d7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final btnRiskLevel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a01e3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getBarView()Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->barView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;

    return-object v0
.end method

.method private final getBtnMeasure()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->btnMeasure$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getBtnRiskLevel()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->btnRiskLevel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getIvRiskLevel()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->ivRiskLevel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final getLlDiabeticRiskInsight()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->llDiabeticRiskInsight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getLlNoMeasurement()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->llNoMeasurement$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getRvRiskLevel()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->rvRiskLevel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method private final getTvDiabeticRiskInsight()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->tvDiabeticRiskInsight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvDiabeticRiskTips()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->tvDiabeticRiskTips$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvMeasureDate()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->tvMeasureDate$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvNoRecord()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->tvNoRecord$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvRiskDate()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->tvRiskDate$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getTvRiskRangeDate()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->tvRiskRangeDate$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getValueText(F)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p1, "<br><small>mmol/L</small>"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->initRange$lambda$0$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic iOOX010X(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->tvDiabeticRiskTips_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private final initBarView()V
    .locals 11

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iz3;

    const v2, 0x4059999a    # 3.4f

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v2

    const v6, 0x40c33333    # 6.1f

    invoke-static {v6, v3, v4, v5}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v7

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f060063

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v8

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v10, 0x7f060062

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    invoke-direct {v1, v2, v7, v8, v9}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFII)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-static {v6, v3, v4, v5}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v2

    const v6, 0x40dccccd    # 6.9f

    invoke-static {v6, v3, v4, v5}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v7

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f060065

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v8

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v10, 0x7f060064

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    invoke-direct {v1, v2, v7, v8, v9}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFII)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-static {v6, v3, v4, v5}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v2

    const v6, 0x4101999a    # 8.1f

    invoke-static {v6, v3, v4, v5}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v3

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f06005f

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f06005e

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFII)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getBarView()Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->setSegments(Ljava/util/List;)V

    return-void
.end method

.method private final initRange()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getBtnMeasure()Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O0iIX;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/O0iIX;-><init>(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final initRange$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;Landroid/view/View;)V
    .locals 2

    new-instance p1, Lcom/android/mltcode/paycertificationapi/i1I1O;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/i1I1O;-><init>(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)V

    const/4 p0, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v1, p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    return-void
.end method

.method private static final initRange$lambda$0$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/db/AppDatabase;->bloodGlucose2Dao()Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;

    move-result-object p1

    invoke-interface {p1}, Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;->getTodayList()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p1, p0, v2, v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v0, 0x7f1401cc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    const v0, 0x7f14027f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I1XXiOiX;

    invoke-direct {v1}, Lcom/android/mltcode/paycertificationapi/I1XXiOiX;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->iX1O1(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OO0iX1IX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OO0iX1IX;-><init>(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)V

    const p0, 0x7f14034b

    invoke-virtual {p1, p0, v0}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final initRange$lambda$0$0$0$0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private static final initRange$lambda$0$0$0$1(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Z
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final ivRiskLevel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0668

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method private static final llDiabeticRiskInsight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a06e4

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final llNoMeasurement_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a070d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final rvRiskLevel_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 1

    const v0, 0x7f0a09d2

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private final setBarValue(FF)V
    .locals 5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getBarView()Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v1, v2, v3}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v4

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getValueText(F)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v4, p1}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X1ii(FLjava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getBarView()Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;

    move-result-object p1

    invoke-static {p2, v1, v2, v3}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v0

    invoke-direct {p0, p2}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getValueText(F)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->O10IXXX0X(FLjava/lang/String;)V

    return-void
.end method

.method private final syncData()V
    .locals 7

    const/16 v0, 0x32

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XX0(I)[J

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/biz/BGEMManager;->OXO1:Lcom/sma/smartv3/biz/BGEMManager;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->IO0iXO0O()Ljava/text/SimpleDateFormat;

    move-result-object v2

    const/4 v3, 0x0

    aget-wide v3, v0, v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "format(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->IO0iXO0O()Ljava/text/SimpleDateFormat;

    move-result-object v4

    const/4 v5, 0x1

    aget-wide v5, v0, v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity$syncData$1;

    invoke-direct {v3, p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity$syncData$1;-><init>(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)V

    invoke-virtual {v1, v2, v0, v3}, Lcom/sma/smartv3/biz/BGEMManager;->iO(Ljava/lang/String;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void
.end method

.method private static final tvDiabeticRiskInsight_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c6c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvDiabeticRiskTips_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0c6d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvMeasureDate_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cba

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvNoRecord_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cd1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvRiskDate_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0d00

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final tvRiskRangeDate_delegate$lambda$0(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0d01

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/sma/smartv3/model/BGEMUser;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/model/BGEMUser;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    sget-object p1, Lcom/sma/smartv3/biz/BGEMManager;->OXO1:Lcom/sma/smartv3/biz/BGEMManager;

    invoke-static {p1, v1, v0, v1}, Lcom/sma/smartv3/biz/BGEMManager;->I0IIOi(Lcom/sma/smartv3/biz/BGEMManager;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void

    :cond_0
    sget-object p1, Lcom/sma/smartv3/biz/BGEMManager;->OXO1:Lcom/sma/smartv3/biz/BGEMManager;

    invoke-static {p1, v1, v0, v1}, Lcom/sma/smartv3/biz/BGEMManager;->IO(Lcom/sma/smartv3/biz/BGEMManager;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 2

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140218

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f080fdd

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f06074b

    invoke-static {p0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->initRange()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->initBarView()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->showData(Ljava/lang/Object;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0038

    return v0
.end method

.method public final onHelp(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/i72;->XO1(Landroid/app/Activity;)V

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

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseTrendActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final showData(Ljava/lang/Object;)V
    .locals 10
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "bloodglucose_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->mBloodGlucoseList:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->mBloodGlucoseList:Ljava/util/List;

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->bloodGlucose2Dao()Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;

    move-result-object v0

    invoke-interface {v0}, Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;->getListForDay()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    const/4 p1, 0x6

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XX0(I)[J

    move-result-object p1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getTvRiskRangeDate()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->X0i1O(Lcom/sma/smartv3/util/DateTimeFormat;ILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v3

    const/4 v4, 0x0

    aget-wide v5, p1, v4

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->X0i1O(Lcom/sma/smartv3/util/DateTimeFormat;ILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v5

    aget-wide v6, p1, v2

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " - "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getTvRiskRangeDate()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    iget-object v5, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->mBloodGlucoseList:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "showData -> "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->mBloodGlucoseList:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->mBloodGlucoseList:Ljava/util/List;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMLowerBound()D

    move-result-wide v5

    double-to-float v3, v5

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMUpperBound()D

    move-result-wide v5

    double-to-float v5, v5

    invoke-direct {p0, v3, v5}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->setBarValue(FF)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getLlNoMeasurement()Landroid/widget/LinearLayout;

    move-result-object v3

    const/16 v5, 0x8

    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getTvMeasureDate()Landroid/widget/TextView;

    move-result-object v3

    const/4 v6, 0x3

    invoke-static {v4, v4, v6, v1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->i0X000X0O(ZZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v7

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMTime()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMCurrentLevel()I

    move-result v3

    if-lez v3, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getIvRiskLevel()Landroid/widget/ImageView;

    move-result-object v7

    invoke-virtual {v7, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getTvNoRecord()Landroid/widget/TextView;

    move-result-object v7

    invoke-virtual {v7, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getIvRiskLevel()Landroid/widget/ImageView;

    move-result-object v7

    invoke-virtual {v7, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getTvNoRecord()Landroid/widget/TextView;

    move-result-object v7

    invoke-virtual {v7, v4}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    if-eqz v3, :cond_5

    if-eq v3, v2, :cond_4

    const/4 v7, 0x2

    if-eq v3, v7, :cond_3

    if-eq v3, v6, :cond_2

    const/4 v7, 0x4

    if-eq v3, v7, :cond_1

    goto/16 :goto_1

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getIvRiskLevel()Landroid/widget/ImageView;

    move-result-object v3

    const v7, 0x7f080fcf

    invoke-virtual {v3, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getBtnRiskLevel()Landroid/widget/TextView;

    move-result-object v3

    const v7, 0x7f14042c

    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getBtnRiskLevel()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f06006b

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v7

    invoke-virtual {v3, v7}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    goto/16 :goto_1

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getIvRiskLevel()Landroid/widget/ImageView;

    move-result-object v3

    const v7, 0x7f080fd2

    invoke-virtual {v3, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getBtnRiskLevel()Landroid/widget/TextView;

    move-result-object v3

    const v7, 0x7f14042b

    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getBtnRiskLevel()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f06006a

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v7

    invoke-virtual {v3, v7}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    goto :goto_1

    :cond_3
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getIvRiskLevel()Landroid/widget/ImageView;

    move-result-object v3

    const v7, 0x7f080fd1

    invoke-virtual {v3, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getBtnRiskLevel()Landroid/widget/TextView;

    move-result-object v3

    const v7, 0x7f14042a

    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getBtnRiskLevel()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f060069

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v7

    invoke-virtual {v3, v7}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    goto :goto_1

    :cond_4
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getIvRiskLevel()Landroid/widget/ImageView;

    move-result-object v3

    const v7, 0x7f080fd0

    invoke-virtual {v3, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getBtnRiskLevel()Landroid/widget/TextView;

    move-result-object v3

    const v7, 0x7f140429

    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getBtnRiskLevel()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f060068

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v7

    invoke-virtual {v3, v7}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    goto :goto_1

    :cond_5
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getBtnRiskLevel()Landroid/widget/TextView;

    move-result-object v3

    const v7, 0x7f140428

    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getBtnRiskLevel()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f060067

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v7

    invoke-virtual {v3, v7}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    :goto_1
    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMInsights()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_6

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getLlDiabeticRiskInsight()Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getTvRiskDate()Landroid/widget/TextView;

    move-result-object v3

    invoke-static {v4, v4, v6, v1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->i0X000X0O(ZZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v1

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMTime()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getTvDiabeticRiskInsight()Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v0}, Lcom/sma/smartv3/model/BGEMKt;->getInsights(Lcom/sma/smartv3/db/entity/BloodGlucose2;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getTvDiabeticRiskTips()Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v0}, Lcom/sma/smartv3/model/BGEMKt;->getInsightsTip(Lcom/sma/smartv3/db/entity/BloodGlucose2;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_6
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getLlDiabeticRiskInsight()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_7
    :goto_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getRvRiskLevel()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    const/4 v3, 0x7

    invoke-direct {v1, p0, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance v0, Lkotlin/ranges/LongRange;

    aget-wide v3, p1, v4

    aget-wide v1, p1, v2

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/ranges/LongRange;-><init>(JJ)V

    sget-object p1, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {p1, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lkotlin/ranges/iO;->IiiiOIIi0(Lkotlin/ranges/LongProgression;J)Lkotlin/ranges/LongProgression;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Ii00iIX01(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;->getRvRiskLevel()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity$showData$1;

    invoke-direct {v1, p0, p1}, Lcom/sma/smartv3/ui/status/BloodGlucose2Activity$showData$1;-><init>(Lcom/sma/smartv3/ui/status/BloodGlucose2Activity;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method
