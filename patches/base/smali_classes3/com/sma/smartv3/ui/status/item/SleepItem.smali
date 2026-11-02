.class public Lcom/sma/smartv3/ui/status/item/SleepItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field public barChart:Lcom/github/mikephil/charting/charts/BarChart;

.field private final block:I

.field private final blockHeight:F

.field private format:Ljava/text/SimpleDateFormat;

.field private final initEvent:Z

.field public mContext:Landroid/content/Context;

.field private final mSleepDao:Lcom/sma/smartv3/db/dao/SleepDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private noData:Lcom/sma/smartv3/view/text/DINCondBold;

.field private sleepBarChartRl:Landroid/widget/RelativeLayout;

.field private sleepEndTime:Landroid/widget/TextView;

.field private sleepHour:Lcom/sma/smartv3/view/text/DINCondBold;

.field private sleepMinute:Lcom/sma/smartv3/view/text/DINCondBold;

.field private sleepStartTime:Landroid/widget/TextView;

.field private sleepTime:Lcom/sma/smartv3/view/text/DINCondBold;

.field private values:Ljava/util/List;
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

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->values:Ljava/util/List;

    const/4 v0, 0x3

    iput v0, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->block:I

    const/high16 v1, 0x43960000    # 300.0f

    int-to-float v0, v0

    div-float/2addr v1, v0

    iput v1, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->blockHeight:F

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->sleepDao()Lcom/sma/smartv3/db/dao/SleepDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->mSleepDao:Lcom/sma/smartv3/db/dao/SleepDao;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->initEvent:Z

    return-void
.end method

.method private final noData()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepTime:Lcom/sma/smartv3/view/text/DINCondBold;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "sleepTime"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    const v2, 0x7f1403bc

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepHour:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v0, :cond_1

    const-string v0, "sleepHour"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepMinute:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v0, :cond_2

    const-string v0, "sleepMinute"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_2
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepBarChartRl:Landroid/widget/RelativeLayout;

    if-nez v0, :cond_3

    const-string v0, "sleepBarChartRl"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_3
    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->noData:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v0, :cond_4

    const-string v0, "noData"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    move-object v1, v0

    :goto_0
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final setXAxis(II)V
    .locals 11

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.github.mikephil.charting.components.XAxis"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v2, ""

    if-ltz p2, :cond_0

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq v3, p2, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const-string v3, "sleepEndTime"

    const-string v4, "sleepStartTime"

    const/4 v5, 0x0

    if-nez p2, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepStartTime:Landroid/widget/TextView;

    if-nez p1, :cond_1

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v5

    :cond_1
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepEndTime:Landroid/widget/TextView;

    if-nez p1, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object v5, p1

    :goto_1
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    :cond_3
    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepStartTime:Landroid/widget/TextView;

    if-nez v2, :cond_4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v5

    :cond_4
    int-to-long v6, p1

    const-wide/16 v8, 0x3e8

    mul-long/2addr v6, v8

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->format:Ljava/text/SimpleDateFormat;

    const-string v10, "format"

    if-nez v4, :cond_5

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v5

    :cond_5
    invoke-static {v6, v7, v4}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepEndTime:Landroid/widget/TextView;

    if-nez v2, :cond_6

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v5

    :cond_6
    mul-int/lit8 p2, p2, 0x3c

    add-int/2addr p1, p2

    int-to-long p1, p1

    mul-long/2addr p1, v8

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->format:Ljava/text/SimpleDateFormat;

    if-nez v3, :cond_7

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    move-object v5, v3

    :goto_2
    invoke-static {p1, p2, v5}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_3
    new-instance p1, Lcom/android/mltcode/paycertificationapi/q4;

    invoke-direct {p1, v1}, Lcom/android/mltcode/paycertificationapi/q4;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Oi(Lcom/android/mltcode/paycertificationapi/he6;)V

    return-void
.end method

.method private final showSleep()V
    .locals 18

    move-object/from16 v0, p0

    sget-object v1, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    const/4 v2, 0x5

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v3, v1, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iOOX010X(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;IILjava/lang/Object;)[J

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->mSleepDao:Lcom/sma/smartv3/db/dao/SleepDao;

    aget-wide v5, v1, v4

    const v7, 0x2932e00

    int-to-long v7, v7

    sub-long/2addr v5, v7

    const/4 v9, 0x1

    aget-wide v10, v1, v9

    sub-long/2addr v10, v7

    invoke-interface {v2, v5, v6, v10, v11}, Lcom/sma/smartv3/db/dao/SleepDao;->getSleeps(JJ)Ljava/util/List;

    move-result-object v2

    new-instance v10, Lcom/szabh/smable3/entity/BleSleepQuality;

    const/4 v14, 0x7

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lcom/szabh/smable3/entity/BleSleepQuality;-><init>(IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v5

    const/16 v6, 0x8

    const-string v11, "noData"

    const-string v12, "sleepBarChartRl"

    if-eqz v5, :cond_4

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->noData()V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/i72;->XIIO11I()Z

    move-result v2

    if-eqz v2, :cond_d

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepBarChartRl:Landroid/widget/RelativeLayout;

    if-nez v2, :cond_0

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v3

    :cond_0
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->noData:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v2, :cond_1

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v3

    :cond_1
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->mSleepDao:Lcom/sma/smartv3/db/dao/SleepDao;

    aget-wide v4, v1, v4

    sub-long/2addr v4, v7

    aget-wide v11, v1, v9

    sub-long/2addr v11, v7

    invoke-interface {v2, v4, v5, v11, v12}, Lcom/sma/smartv3/db/dao/SleepDao;->getTestSleeps(JJ)Ljava/util/List;

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->values:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    sget-object v2, Lcom/sma/smartv3/model/SleepDataParse;->INSTANCE:Lcom/sma/smartv3/model/SleepDataParse;

    iget v4, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->blockHeight:F

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->values:Ljava/util/List;

    invoke-virtual {v2, v1, v4, v5}, Lcom/sma/smartv3/model/SleepDataParse;->filterData(Ljava/util/List;FLjava/util/List;)Lcom/sma/smartv3/model/SleepDayData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->getStartTime()I

    move-result v2

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->getTotal()I

    move-result v1

    invoke-direct {v0, v2, v1}, Lcom/sma/smartv3/ui/status/item/SleepItem;->setXAxis(II)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->values:Ljava/util/List;

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/status/item/SleepItem;->updateData(Ljava/util/List;)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepStartTime:Landroid/widget/TextView;

    if-nez v1, :cond_2

    const-string v1, "sleepStartTime"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_2
    const-string v2, ""

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepEndTime:Landroid/widget/TextView;

    if-nez v1, :cond_3

    const-string v1, "sleepEndTime"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v3, v1

    :goto_0
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :cond_4
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepBarChartRl:Landroid/widget/RelativeLayout;

    if-nez v1, :cond_5

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_5
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->noData:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v1, :cond_6

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_6
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->values:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    sget-object v1, Lcom/sma/smartv3/model/SleepDataParse;->INSTANCE:Lcom/sma/smartv3/model/SleepDataParse;

    iget v4, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->blockHeight:F

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->values:Ljava/util/List;

    invoke-virtual {v1, v2, v4, v5}, Lcom/sma/smartv3/model/SleepDataParse;->filterData(Ljava/util/List;FLjava/util/List;)Lcom/sma/smartv3/model/SleepDayData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->getTotal()I

    move-result v2

    const/16 v4, 0x3c

    if-eqz v2, :cond_7

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->getTotal()I

    move-result v2

    if-lt v2, v4, :cond_8

    :cond_7
    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->values:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_9

    :cond_8
    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->noData()V

    goto/16 :goto_1

    :cond_9
    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->getStartTime()I

    move-result v2

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->getTotal()I

    move-result v5

    invoke-direct {v0, v2, v5}, Lcom/sma/smartv3/ui/status/item/SleepItem;->setXAxis(II)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->values:Ljava/util/List;

    invoke-direct {v0, v2}, Lcom/sma/smartv3/ui/status/item/SleepItem;->updateData(Ljava/util/List;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->getTotal()I

    move-result v2

    div-int/2addr v2, v4

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepHour:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v5, :cond_a

    const-string v5, "sleepHour"

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v3

    :cond_a
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepMinute:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v5, :cond_b

    const-string v5, "sleepMinute"

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v3

    :cond_b
    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->getTotal()I

    move-result v6

    mul-int/2addr v2, v4

    sub-int/2addr v6, v2

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepTime:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v2, :cond_c

    const-string v2, "sleepTime"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v3

    :cond_c
    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->getStartTime()I

    move-result v4

    int-to-long v4, v4

    const-wide/16 v6, 0x3e8

    mul-long/2addr v4, v6

    invoke-static {v3, v9, v3}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->X0i1O(Lcom/sma/smartv3/util/DateTimeFormat;ILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v3

    invoke-static {v4, v5, v3}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->IiXIIX1O1()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->getStatus()Landroid/util/SparseIntArray;

    move-result-object v2

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Landroid/util/SparseIntArray;->get(I)I

    move-result v3

    invoke-virtual {v10, v3}, Lcom/szabh/smable3/entity/BleSleepQuality;->setMLight(I)V

    invoke-virtual {v2, v9}, Landroid/util/SparseIntArray;->get(I)I

    move-result v2

    invoke-virtual {v10, v2}, Lcom/szabh/smable3/entity/BleSleepQuality;->setMDeep(I)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->getTotal()I

    move-result v1

    invoke-virtual {v10, v1}, Lcom/szabh/smable3/entity/BleSleepQuality;->setMTotal(I)V

    :cond_d
    :goto_1
    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->IiXIIX1O1()Z

    move-result v1

    if-eqz v1, :cond_e

    move-object v13, v10

    sget-object v10, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v11, Lcom/szabh/smable3/BleKey;->SLEEP_QUALITY:Lcom/szabh/smable3/BleKey;

    sget-object v12, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v16, 0x18

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v10 .. v17}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    :cond_e
    return-void
.end method

.method private final showSleepAllDay()V
    .locals 21

    move-object/from16 v0, p0

    sget-object v1, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    const/4 v2, 0x5

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v3, v1, v4, v2, v3}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iOOX010X(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;IILjava/lang/Object;)[J

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->mSleepDao:Lcom/sma/smartv3/db/dao/SleepDao;

    aget-wide v5, v1, v4

    const v7, 0x2932e00

    int-to-long v7, v7

    sub-long/2addr v5, v7

    const/4 v9, 0x1

    aget-wide v10, v1, v9

    invoke-interface {v2, v5, v6, v10, v11}, Lcom/sma/smartv3/db/dao/SleepDao;->getSleeps(JJ)Ljava/util/List;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const-string v5, "sleepEndTime"

    const-string v6, "sleepStartTime"

    const/16 v10, 0x8

    const-string v11, "noData"

    const-string v12, "sleepBarChartRl"

    const-string v14, ""

    if-eqz v2, :cond_5

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->noData()V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/i72;->XIIO11I()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepBarChartRl:Landroid/widget/RelativeLayout;

    if-nez v2, :cond_0

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v3

    :cond_0
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->noData:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v2, :cond_1

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v3

    :cond_1
    invoke-virtual {v2, v10}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->mSleepDao:Lcom/sma/smartv3/db/dao/SleepDao;

    aget-wide v10, v1, v4

    sub-long/2addr v10, v7

    aget-wide v7, v1, v9

    invoke-interface {v2, v10, v11, v7, v8}, Lcom/sma/smartv3/db/dao/SleepDao;->getTestSleeps(JJ)Ljava/util/List;

    move-result-object v16

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->values:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    sget-object v15, Lcom/sma/smartv3/model/SleepAllDayDataParse;->INSTANCE:Lcom/sma/smartv3/model/SleepAllDayDataParse;

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->values:Ljava/util/List;

    aget-wide v19, v1, v4

    const/high16 v17, 0x43960000    # 300.0f

    move-object/from16 v18, v2

    invoke-virtual/range {v15 .. v20}, Lcom/sma/smartv3/model/SleepAllDayDataParse;->filterData(Ljava/util/List;FLjava/util/List;J)Lcom/sma/smartv3/model/SleepAllDayData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepAllDayData;->getStartTime()I

    move-result v2

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepAllDayData;->getTotal()I

    move-result v1

    invoke-direct {v0, v2, v1}, Lcom/sma/smartv3/ui/status/item/SleepItem;->setXAxis(II)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->values:Ljava/util/List;

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/status/item/SleepItem;->updateData(Ljava/util/List;)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepStartTime:Landroid/widget/TextView;

    if-nez v1, :cond_2

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_2
    invoke-virtual {v1, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepEndTime:Landroid/widget/TextView;

    if-nez v1, :cond_3

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v3, v1

    :goto_0
    invoke-virtual {v3, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    return-void

    :cond_5
    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepBarChartRl:Landroid/widget/RelativeLayout;

    if-nez v2, :cond_6

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v3

    :cond_6
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->noData:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v2, :cond_7

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v3

    :cond_7
    invoke-virtual {v2, v10}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->values:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    sget-object v12, Lcom/sma/smartv3/model/SleepAllDayDataParse;->INSTANCE:Lcom/sma/smartv3/model/SleepAllDayDataParse;

    iget-object v15, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->values:Ljava/util/List;

    aget-wide v16, v1, v4

    move-object v1, v14

    const/high16 v14, 0x43960000    # 300.0f

    invoke-virtual/range {v12 .. v17}, Lcom/sma/smartv3/model/SleepAllDayDataParse;->filterData(Ljava/util/List;FLjava/util/List;J)Lcom/sma/smartv3/model/SleepAllDayData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SleepAllDayData;->getTotal()I

    move-result v7

    if-nez v7, :cond_8

    iget-object v7, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->values:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->noData()V

    return-void

    :cond_8
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v7

    invoke-virtual {v7}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v7

    const-string v8, "null cannot be cast to non-null type com.github.mikephil.charting.components.XAxis"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SleepAllDayData;->getTotal()I

    move-result v10

    if-ltz v10, :cond_9

    :goto_1
    invoke-interface {v8, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq v4, v10, :cond_9

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_9
    new-instance v1, Lcom/android/mltcode/paycertificationapi/q4;

    invoke-direct {v1, v8}, Lcom/android/mltcode/paycertificationapi/q4;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v7, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Oi(Lcom/android/mltcode/paycertificationapi/he6;)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->values:Ljava/util/List;

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/status/item/SleepItem;->updateData(Ljava/util/List;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SleepAllDayData;->getTotal()I

    move-result v1

    div-int/lit8 v1, v1, 0x3c

    iget-object v4, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepHour:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v4, :cond_a

    const-string v4, "sleepHour"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v3

    :cond_a
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepMinute:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v4, :cond_b

    const-string v4, "sleepMinute"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v3

    :cond_b
    invoke-virtual {v2}, Lcom/sma/smartv3/model/SleepAllDayData;->getTotal()I

    move-result v7

    mul-int/lit8 v1, v1, 0x3c

    sub-int/2addr v7, v1

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepTime:Lcom/sma/smartv3/view/text/DINCondBold;

    if-nez v1, :cond_c

    const-string v1, "sleepTime"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_c
    invoke-virtual {v2}, Lcom/sma/smartv3/model/SleepAllDayData;->getStartTime()I

    move-result v4

    int-to-long v7, v4

    const-wide/16 v10, 0x3e8

    mul-long/2addr v7, v10

    invoke-static {v3, v9, v3}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->X0i1O(Lcom/sma/smartv3/util/DateTimeFormat;ILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v4

    invoke-static {v7, v8, v4}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepStartTime:Landroid/widget/TextView;

    if-nez v1, :cond_d

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_d
    invoke-virtual {v2}, Lcom/sma/smartv3/model/SleepAllDayData;->getStartTime()I

    move-result v4

    int-to-long v6, v4

    mul-long/2addr v6, v10

    iget-object v4, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->format:Ljava/text/SimpleDateFormat;

    const-string v8, "format"

    if-nez v4, :cond_e

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v3

    :cond_e
    invoke-static {v6, v7, v4}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepEndTime:Landroid/widget/TextView;

    if-nez v1, :cond_f

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v3

    :cond_f
    invoke-virtual {v2}, Lcom/sma/smartv3/model/SleepAllDayData;->getEndTime()I

    move-result v2

    int-to-long v4, v2

    mul-long/2addr v4, v10

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/SleepItem;->format:Ljava/text/SimpleDateFormat;

    if-nez v2, :cond_10

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_10
    move-object v3, v2

    :goto_2
    invoke-static {v4, v5, v3}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final updateData(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v0

    check-cast v0, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/XOi0;->XXI()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

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

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v2

    const v3, 0x7f0600b4

    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->I011X(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/github/mikephil/charting/charts/Chart;->setData(Lcom/android/mltcode/paycertificationapi/XOi0;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 8
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0a4d

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/github/mikephil/charting/charts/BarChart;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->setBarChart(Lcom/github/mikephil/charting/charts/BarChart;)V

    const v0, 0x7f0a0a57

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepTime:Lcom/sma/smartv3/view/text/DINCondBold;

    const v0, 0x7f0a0a50

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepHour:Lcom/sma/smartv3/view/text/DINCondBold;

    const v0, 0x7f0a0a52

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepMinute:Lcom/sma/smartv3/view/text/DINCondBold;

    const v0, 0x7f0a0897

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->noData:Lcom/sma/smartv3/view/text/DINCondBold;

    const v0, 0x7f0a0a4e

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepBarChartRl:Landroid/widget/RelativeLayout;

    const v0, 0x7f0a0a53

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepStartTime:Landroid/widget/TextView;

    const v0, 0x7f0a0a4f

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->sleepEndTime:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "getContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/item/SleepItem;->setMContext(Landroid/content/Context;)V

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, p1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->IXI(ZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->format:Ljava/text/SimpleDateFormat;

    sget-object p1, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1(Lcom/github/mikephil/charting/charts/BarChart;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v2

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v2

    const-string v3, "getAxisLeft(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v3

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v3

    const-string v4, "getAxisRight(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v4, 0x43960000    # 300.0f

    const/4 v5, 0x0

    invoke-virtual {p1, v2, v3, v4, v5}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->IO(Lcom/github/mikephil/charting/components/YAxis;Lcom/github/mikephil/charting/components/YAxis;FF)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v2

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->getDescription()Lcom/android/mltcode/paycertificationapi/IOOI00X0I;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v2, v0}, Lcom/github/mikephil/charting/charts/Chart;->setTouchEnabled(Z)V

    invoke-virtual {v2, v0}, Lcom/github/mikephil/charting/charts/BarChart;->setDrawValueAboveBar(Z)V

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getMContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->iO(Landroid/content/Context;)Lcom/github/mikephil/charting/components/LimitLine;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->XXI(Lcom/github/mikephil/charting/components/LimitLine;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type com.github.mikephil.charting.components.XAxis"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getMContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIi0(Lcom/github/mikephil/charting/components/XAxis;ZLandroid/content/Context;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v1

    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getAnimator()Lcom/android/mltcode/paycertificationapi/X1i1iOX;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v2

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->getViewPortHandler()Lcom/android/mltcode/paycertificationapi/jh6;

    move-result-object v2

    invoke-direct {p1, v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;-><init>(Lcom/android/mltcode/paycertificationapi/IXi0IO;Lcom/android/mltcode/paycertificationapi/X1i1iOX;Lcom/android/mltcode/paycertificationapi/jh6;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getMContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f06024d

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iOOX010X(I)V

    iget v0, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->blockHeight:F

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->X01IiOiIi(F)V

    iget v0, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->block:I

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->OX(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getMContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f060703

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getMContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f060704

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getMContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f060701

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getMContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f060702

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getMContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0606fd

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v6

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getMContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f060700

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v7

    filled-new-array/range {v2 .. v7}, [I

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->I1([I)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iIiiO(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/github/mikephil/charting/charts/Chart;->setRenderer(Lcom/android/mltcode/paycertificationapi/i0OX00;)V

    return-void
.end method

.method public final getBarChart()Lcom/github/mikephil/charting/charts/BarChart;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "barChart"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getBlock()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->block:I

    return v0
.end method

.method public final getBlockHeight()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->blockHeight:F

    return v0
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->initEvent:Z

    return v0
.end method

.method public final getMContext()Landroid/content/Context;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public initView()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->IXi01O()Z

    move-result v0

    const-string v1, "null cannot be cast to non-null type com.sma.smartv3.view.chart.CustomInfoBarChartRender"

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getRenderer()Lcom/android/mltcode/paycertificationapi/i0OX00;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    const/high16 v1, 0x43960000    # 300.0f

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->X01IiOiIi(F)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->OX(I)V

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iIiiO(I)V

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->i010I(F)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->showSleepAllDay()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->getBarChart()Lcom/github/mikephil/charting/charts/BarChart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/Chart;->getRenderer()Lcom/android/mltcode/paycertificationapi/i0OX00;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    iget v1, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->blockHeight:F

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->X01IiOiIi(F)V

    iget v1, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->block:I

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->OX(I)V

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iIiiO(I)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->i010I(F)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->showSleep()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d1076

    return v0
.end method

.method public final onSleepChanged(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "sleep_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onSleepChanged"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/SleepItem;->initView()V

    return-void
.end method

.method public final setBarChart(Lcom/github/mikephil/charting/charts/BarChart;)V
    .locals 1
    .param p1    # Lcom/github/mikephil/charting/charts/BarChart;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    return-void
.end method

.method public final setMContext(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/SleepItem;->mContext:Landroid/content/Context;

    return-void
.end method
