.class public final Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;
.super Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment<",
        "Lcom/sma/smartv3/db/entity/Sleep;",
        ">;"
    }
.end annotation


# instance fields
.field private final awakeValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final barChart$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final block:I

.field private final blockHeight:F

.field private final deepValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private infoBarChartRender:Lcom/android/mltcode/paycertificationapi/Oi01X10i;

.field private final lightValue$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mSleepDao:Lcom/sma/smartv3/db/dao/SleepDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public setValue:Lcom/android/mltcode/paycertificationapi/XXX1X11;

.field private final sleepEndTime$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sleepStartTime$delegate:Lkotlin/Lazy;
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
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/om4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/om4;-><init>(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->barChart$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/pm4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/pm4;-><init>(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->deepValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/qm4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/qm4;-><init>(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->lightValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/rm4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/rm4;-><init>(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->awakeValue$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/sm4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/sm4;-><init>(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->sleepStartTime$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/tm4;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/tm4;-><init>(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->sleepEndTime$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->values:Ljava/util/List;

    const/4 v0, 0x3

    iput v0, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->block:I

    const/high16 v1, 0x43960000    # 300.0f

    int-to-float v0, v0

    div-float/2addr v1, v0

    iput v1, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->blockHeight:F

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->sleepDao()Lcom/sma/smartv3/db/dao/SleepDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->mSleepDao:Lcom/sma/smartv3/db/dao/SleepDao;

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->sleepStartTime_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->awakeValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->sleepEndTime_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)Lcom/github/mikephil/charting/charts/BarChart;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->barChart_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->deepValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->lightValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p0

    return-object p0
.end method

.method private static final awakeValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a00fa

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private static final barChart_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)Lcom/github/mikephil/charting/charts/BarChart;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0108

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/github/mikephil/charting/charts/BarChart;

    return-object p0
.end method

.method private static final deepValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a02df

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private final filterData(Ljava/util/List;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Sleep;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->values:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    const/16 v3, 0x3c

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v2, :cond_0

    sget-object v2, Lcom/sma/smartv3/model/SleepDataParse;->INSTANCE:Lcom/sma/smartv3/model/SleepDataParse;

    iget v6, v0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->blockHeight:F

    iget-object v7, v0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->values:Ljava/util/List;

    invoke-virtual {v2, v1, v6, v7}, Lcom/sma/smartv3/model/SleepDataParse;->filterData(Ljava/util/List;FLjava/util/List;)Lcom/sma/smartv3/model/SleepDayData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->getStatus()Landroid/util/SparseIntArray;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/util/SparseIntArray;->get(I)I

    move-result v2

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->getStatus()Landroid/util/SparseIntArray;

    move-result-object v6

    const/4 v7, 0x2

    invoke-virtual {v6, v7}, Landroid/util/SparseIntArray;->get(I)I

    move-result v6

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->getStatus()Landroid/util/SparseIntArray;

    move-result-object v7

    const/4 v8, 0x3

    invoke-virtual {v7, v8}, Landroid/util/SparseIntArray;->get(I)I

    move-result v7

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->getTotal()I

    move-result v8

    if-lt v8, v3, :cond_1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->getStartTime()I

    move-result v1

    invoke-direct {v0, v1, v8}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->setXAxis(II)V

    goto :goto_0

    :cond_0
    move v2, v5

    move v6, v2

    move v7, v6

    move v8, v7

    :cond_1
    :goto_0
    const-string v1, ""

    if-eqz v8, :cond_2

    if-lt v8, v3, :cond_3

    :cond_2
    iget-object v3, v0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->values:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    :cond_3
    iget-object v2, v0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->values:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getSleepStartTime()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getSleepEndTime()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    move v7, v5

    move v8, v7

    move v9, v8

    goto :goto_1

    :cond_4
    if-nez v8, :cond_5

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getSleepStartTime()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getSleepEndTime()Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v1

    new-instance v3, Lcom/android/mltcode/paycertificationapi/q4;

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-direct {v3, v5}, Lcom/android/mltcode/paycertificationapi/q4;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Oi(Lcom/android/mltcode/paycertificationapi/he6;)V

    :cond_5
    move v9, v2

    move v5, v6

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getDeepValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v10

    const-string v1, "<get-deepValue>(...)"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v11

    const/16 v14, 0x18

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v9 .. v15}, Lcom/android/mltcode/paycertificationapi/cp5;->O1O(ILcom/sma/smartv3/view/text/DINCondBold;Landroid/content/Context;IIILjava/lang/Object;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getLightValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v11

    const-string v1, "<get-lightValue>(...)"

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v12

    const/16 v15, 0x18

    const/16 v16, 0x0

    const/4 v14, 0x0

    move v10, v5

    invoke-static/range {v10 .. v16}, Lcom/android/mltcode/paycertificationapi/cp5;->O1O(ILcom/sma/smartv3/view/text/DINCondBold;Landroid/content/Context;IIILjava/lang/Object;)V

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getAwakeValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v11

    const-string v1, "<get-awakeValue>(...)"

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v12

    move v10, v7

    invoke-static/range {v10 .. v16}, Lcom/android/mltcode/paycertificationapi/cp5;->O1O(ILcom/sma/smartv3/view/text/DINCondBold;Landroid/content/Context;IIILjava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getNowValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v11

    const-string v1, "<get-nowValue>(...)"

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v12

    move v10, v8

    invoke-static/range {v10 .. v16}, Lcom/android/mltcode/paycertificationapi/cp5;->O1O(ILcom/sma/smartv3/view/text/DINCondBold;Landroid/content/Context;IIILjava/lang/Object;)V

    const/4 v1, 0x0

    const-string v2, "infoBarChartRender"

    if-gt v4, v10, :cond_7

    const/16 v3, 0x79

    if-ge v10, v3, :cond_7

    iget-object v3, v0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->infoBarChartRender:Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    if-nez v3, :cond_6

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    move-object v1, v3

    :goto_2
    const/high16 v2, 0x40c00000    # 6.0f

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->i010I(F)V

    goto :goto_4

    :cond_7
    iget-object v3, v0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->infoBarChartRender:Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    if-nez v3, :cond_8

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_3

    :cond_8
    move-object v1, v3

    :goto_3
    const/high16 v2, 0x40000000    # 2.0f

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->i010I(F)V

    :goto_4
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->values:Ljava/util/List;

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->updateChartData(Ljava/util/List;)V

    return-void
.end method

.method private final getAwakeValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->awakeValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getBarChart()Lcom/github/mikephil/charting/charts/BarChart;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->barChart$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/github/mikephil/charting/charts/BarChart;

    return-object v0
.end method

.method private final getDeepValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->deepValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getLightValue()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->lightValue$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method private final getSleepEndTime()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->sleepEndTime$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getSleepStartTime()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->sleepStartTime$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private static final lightValue_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a06a4

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/text/DINCondBold;

    return-object p0
.end method

.method private final setXAxis(II)V
    .locals 8

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.github.mikephil.charting.components.XAxis"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XO0X10iO(ZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    if-ltz p2, :cond_0

    :goto_0
    const-string v4, ""

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq v3, p2, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getSleepStartTime()Landroid/widget/TextView;

    move-result-object v3

    int-to-long v4, p1

    const-wide/16 v6, 0x3e8

    mul-long/2addr v4, v6

    invoke-static {v4, v5, v1}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getSleepEndTime()Landroid/widget/TextView;

    move-result-object v3

    mul-int/lit8 p2, p2, 0x3c

    add-int/2addr p1, p2

    int-to-long p1, p1

    mul-long/2addr p1, v6

    invoke-static {p1, p2, v1}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/q4;

    invoke-direct {p1, v2}, Lcom/android/mltcode/paycertificationapi/q4;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Oi(Lcom/android/mltcode/paycertificationapi/he6;)V

    const/4 p1, 0x0

    iput p1, v0, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->O1O:F

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    int-to-float p1, p1

    const/4 p2, 0x4

    int-to-float p2, p2

    div-float/2addr p1, p2

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->IXOIIIO(F)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    int-to-float p1, p1

    iput p1, v0, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOO1ii1:F

    return-void
.end method

.method private static final sleepEndTime_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a4f

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final sleepStartTime_delegate$lambda$0(Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;)Landroid/widget/TextView;
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object p0

    const v0, 0x7f0a0a53

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private final updateChartData(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XOi0;->XXI()I

    move-result v0

    if-lez v0, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/XOi0;->IXXOO(I)Z

    :cond_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/XXX1X11;

    const-string v2, "SleepData"

    invoke-direct {v0, p1, v2}, Lcom/android/mltcode/paycertificationapi/XXX1X11;-><init>(Ljava/util/List;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/XXX1X11;->iIXX0i(F)V

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->iO11i(F)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/android/mltcode/paycertificationapi/XIXi1iX00;

    aput-object v0, v2, v1

    invoke-direct {p1, v2}, Lcom/android/mltcode/paycertificationapi/IXIX1X1;-><init>([Lcom/android/mltcode/paycertificationapi/XIXi1iX00;)V

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/XOi0;->iI(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/github/mikephil/charting/charts/Chart;->setData(Lcom/android/mltcode/paycertificationapi/XOi0;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object p1

    const/16 v0, 0x3e8

    invoke-virtual {p1, v0}, Lcom/github/mikephil/charting/charts/Chart;->I0IIOi(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method


# virtual methods
.method public final getSetValue()Lcom/android/mltcode/paycertificationapi/XXX1X11;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->setValue:Lcom/android/mltcode/paycertificationapi/XXX1X11;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->values:Ljava/util/List;

    return-object v0
.end method

.method public initView()V
    .locals 13

    sget-object v0, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    const-string v2, "<get-barChart>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1(Lcom/github/mikephil/charting/charts/BarChart;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v1

    const-string v2, "getAxisLeft(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v2

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v2

    const-string v3, "getAxisRight(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v3

    const v4, 0x7f06024d

    invoke-static {v3, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    const/high16 v5, 0x43960000    # 300.0f

    invoke-virtual {v0, v1, v2, v5, v3}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->I0iXXO(Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/components/YAxis;FI)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/github/mikephil/charting/charts/BarChart;->setDrawValueAboveBar(Z)V

    invoke-virtual {v1, v2}, Lcom/github/mikephil/charting/charts/Chart;->setTouchEnabled(Z)V

    invoke-virtual {v1, v2}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->setScaleEnabled(Z)V

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v3

    const/4 v5, 0x1

    const/4 v6, 0x4

    invoke-virtual {v3, v6, v5}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->XOXiX0(IZ)V

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getDescription()Lcom/android/mltcode/paycertificationapi/IOOI00X0I;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v1

    const-string v3, "null cannot be cast to non-null type com.github.mikephil.charting.components.XAxis"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v5, "getContext(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIi0(Lcom/github/mikephil/charting/components/XAxis;ZLandroid/content/Context;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v2

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->getAnimator()Lcom/android/mltcode/paycertificationapi/X1i1iOX;

    move-result-object v2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v3

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/Chart;->getViewPortHandler()Lcom/android/mltcode/paycertificationapi/jh6;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;-><init>(Lcom/android/mltcode/paycertificationapi/IXi0IO;Lcom/android/mltcode/paycertificationapi/X1i1iOX;Lcom/android/mltcode/paycertificationapi/jh6;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->infoBarChartRender:Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1, v4}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iOOX010X(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->infoBarChartRender:Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    const/4 v1, 0x0

    const-string v2, "infoBarChartRender"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    iget v3, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->blockHeight:F

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->X01IiOiIi(F)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->infoBarChartRender:Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    iget v3, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->block:I

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->OX(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->infoBarChartRender:Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    if-nez v0, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_2
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v3

    const v4, 0x7f060703

    invoke-static {v3, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v7

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v3

    const v4, 0x7f060704

    invoke-static {v3, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v8

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v3

    const v4, 0x7f060701

    invoke-static {v3, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v9

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v3

    const v4, 0x7f060702

    invoke-static {v3, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v10

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v3

    const v4, 0x7f0606fd

    invoke-static {v3, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v11

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v3

    const v4, 0x7f060700

    invoke-static {v3, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v12

    filled-new-array/range {v7 .. v12}, [I

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->I1([I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->infoBarChartRender:Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    if-nez v0, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_3
    invoke-virtual {v0, v6}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iIiiO(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->infoBarChartRender:Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    if-nez v3, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    move-object v1, v3

    :goto_0
    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/charts/Chart;->setRenderer(Lcom/android/mltcode/paycertificationapi/i0OX00;)V

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment;->initView()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0ea2

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
            "Lcom/sma/smartv3/db/entity/Sleep;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->filterData(Ljava/util/List;)V

    return-void
.end method

.method public onTimePeriodChange(Ljava/util/Calendar;ILcom/sma/smartv3/util/TimePeriod;)Ljava/util/List;
    .locals 5
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
            "Lcom/sma/smartv3/db/entity/Sleep;",
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

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->mSleepDao:Lcom/sma/smartv3/db/dao/SleepDao;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getRange()[J

    move-result-object p2

    const/4 p3, 0x0

    aget-wide v0, p2, p3

    const p2, 0x2932e00

    int-to-long p2, p2

    sub-long/2addr v0, p2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->getRange()[J

    move-result-object v2

    const/4 v3, 0x1

    aget-wide v3, v2, v3

    sub-long/2addr v3, p2

    invoke-interface {p1, v0, v1, v3, v4}, Lcom/sma/smartv3/db/dao/SleepDao;->getSleeps(JJ)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final setDataLabel()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "sleep day Data"

    return-object v0
.end method

.method public final setSetValue(Lcom/android/mltcode/paycertificationapi/XXX1X11;)V
    .locals 1
    .param p1    # Lcom/android/mltcode/paycertificationapi/XXX1X11;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/fragment/SleepDayFragment;->setValue:Lcom/android/mltcode/paycertificationapi/XXX1X11;

    return-void
.end method
