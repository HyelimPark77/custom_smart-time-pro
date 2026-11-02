.class public final Lcom/sma/smartv3/ui/status/item/Sleep2Item;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field private barChart:Lcom/github/mikephil/charting/charts/BarChart;

.field private final block:I

.field private final blockHeight:F

.field private dataPanel:Landroid/view/View;

.field private emptyPanel:Landroid/view/View;

.field private format:Ljava/text/SimpleDateFormat;

.field private final initEvent:Z

.field private mContext:Landroid/content/Context;

.field private final mSleepDao:Lcom/sma/smartv3/db/dao/SleepDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private sleepEndTime:Landroid/widget/TextView;

.field private sleepHour:Landroid/widget/TextView;

.field private sleepMinute:Landroid/widget/TextView;

.field private sleepStartTime:Landroid/widget/TextView;

.field private sleepTime:Landroid/widget/TextView;

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

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->values:Ljava/util/List;

    const/4 v0, 0x3

    iput v0, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->block:I

    const/high16 v1, 0x43960000    # 300.0f

    int-to-float v0, v0

    div-float/2addr v1, v0

    iput v1, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->blockHeight:F

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->sleepDao()Lcom/sma/smartv3/db/dao/SleepDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->mSleepDao:Lcom/sma/smartv3/db/dao/SleepDao;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->initEvent:Z

    return-void
.end method

.method private final noData()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->sleepTime:Landroid/widget/TextView;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "sleepTime"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    const-string v2, ""

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->sleepHour:Landroid/widget/TextView;

    if-nez v0, :cond_1

    const-string v0, "sleepHour"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    const-string v2, "-"

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->sleepMinute:Landroid/widget/TextView;

    if-nez v0, :cond_2

    const-string v0, "sleepMinute"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_2
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->emptyPanel:Landroid/view/View;

    if-nez v0, :cond_3

    const-string v0, "emptyPanel"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_3
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->dataPanel:Landroid/view/View;

    if-nez v0, :cond_4

    const-string v0, "dataPanel"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    move-object v1, v0

    :goto_0
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final setXAxis(II)V
    .locals 9

    const-string v0, "sleepEndTime"

    const-string v1, "sleepStartTime"

    const/4 v2, 0x0

    if-nez p2, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->sleepStartTime:Landroid/widget/TextView;

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v2

    :cond_0
    const-string p2, "00:00"

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->sleepEndTime:Landroid/widget/TextView;

    if-nez p1, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v2, p1

    :goto_0
    const-string p1, "24:00"

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_2
    iget-object v3, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->sleepStartTime:Landroid/widget/TextView;

    if-nez v3, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v2

    :cond_3
    int-to-long v4, p1

    const-wide/16 v6, 0x3e8

    mul-long/2addr v4, v6

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->format:Ljava/text/SimpleDateFormat;

    const-string v8, "format"

    if-nez v1, :cond_4

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_4
    invoke-static {v4, v5, v1}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->sleepEndTime:Landroid/widget/TextView;

    if-nez v1, :cond_5

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_5
    mul-int/lit8 p2, p2, 0x3c

    add-int/2addr p1, p2

    int-to-long p1, p1

    mul-long/2addr p1, v6

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->format:Ljava/text/SimpleDateFormat;

    if-nez v0, :cond_6

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    move-object v2, v0

    :goto_1
    invoke-static {p1, p2, v2}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

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

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->mSleepDao:Lcom/sma/smartv3/db/dao/SleepDao;

    aget-wide v5, v1, v4

    const v7, 0x2932e00

    int-to-long v7, v7

    sub-long/2addr v5, v7

    const/4 v9, 0x1

    aget-wide v10, v1, v9

    sub-long/2addr v10, v7

    invoke-interface {v2, v5, v6, v10, v11}, Lcom/sma/smartv3/db/dao/SleepDao;->getSleeps(JJ)Ljava/util/List;

    move-result-object v1

    new-instance v10, Lcom/szabh/smable3/entity/BleSleepQuality;

    const/4 v14, 0x7

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lcom/szabh/smable3/entity/BleSleepQuality;-><init>(IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->noData()V

    invoke-direct {v0, v4, v4}, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->setXAxis(II)V

    goto/16 :goto_2

    :cond_0
    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->values:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    sget-object v2, Lcom/sma/smartv3/model/SleepDataParse;->INSTANCE:Lcom/sma/smartv3/model/SleepDataParse;

    iget v5, v0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->blockHeight:F

    iget-object v6, v0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->values:Ljava/util/List;

    invoke-virtual {v2, v1, v5, v6}, Lcom/sma/smartv3/model/SleepDataParse;->filterData(Ljava/util/List;FLjava/util/List;)Lcom/sma/smartv3/model/SleepDayData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->getTotal()I

    move-result v2

    const/16 v5, 0x3c

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->getTotal()I

    move-result v2

    if-lt v2, v5, :cond_2

    :cond_1
    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->values:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_2
    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->noData()V

    goto/16 :goto_1

    :cond_3
    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->emptyPanel:Landroid/view/View;

    if-nez v2, :cond_4

    const-string v2, "emptyPanel"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v3

    :cond_4
    const/16 v6, 0x8

    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->dataPanel:Landroid/view/View;

    if-nez v2, :cond_5

    const-string v2, "dataPanel"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v3

    :cond_5
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->getTotal()I

    move-result v2

    div-int/2addr v2, v5

    iget-object v4, v0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->sleepHour:Landroid/widget/TextView;

    if-nez v4, :cond_6

    const-string v4, "sleepHour"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v3

    :cond_6
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, v0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->sleepMinute:Landroid/widget/TextView;

    if-nez v4, :cond_7

    const-string v4, "sleepMinute"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v3

    :cond_7
    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->getTotal()I

    move-result v6

    mul-int/2addr v2, v5

    sub-int/2addr v6, v2

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->sleepTime:Landroid/widget/TextView;

    if-nez v2, :cond_8

    const-string v2, "sleepTime"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_8
    move-object v3, v2

    :goto_0
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XXX11i()Ljava/text/SimpleDateFormat;

    move-result-object v2

    new-instance v4, Ljava/util/Date;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->getStartTime()I

    move-result v5

    int-to-long v5, v5

    const-wide/16 v7, 0x3e8

    mul-long/2addr v5, v7

    invoke-direct {v4, v5, v6}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->IiXIIX1O1()Z

    move-result v2

    if-eqz v2, :cond_9

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

    move-result v2

    invoke-virtual {v10, v2}, Lcom/szabh/smable3/entity/BleSleepQuality;->setMTotal(I)V

    :cond_9
    :goto_1
    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->getStartTime()I

    move-result v2

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SleepDayData;->getTotal()I

    move-result v1

    invoke-direct {v0, v2, v1}, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->setXAxis(II)V

    :goto_2
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->values:Ljava/util/List;

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->updateData(Ljava/util/List;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->IiXIIX1O1()Z

    move-result v1

    if-eqz v1, :cond_a

    move-object v13, v10

    sget-object v10, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v11, Lcom/szabh/smable3/BleKey;->SLEEP_QUALITY:Lcom/szabh/smable3/BleKey;

    sget-object v12, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v16, 0x18

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v10 .. v17}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    :cond_a
    return-void
.end method

.method private final showSleepAllDay()V
    .locals 14

    sget-object v0, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    const/4 v1, 0x5

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v2, v0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iOOX010X(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;IILjava/lang/Object;)[J

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->mSleepDao:Lcom/sma/smartv3/db/dao/SleepDao;

    aget-wide v4, v0, v3

    const v6, 0x2932e00

    int-to-long v6, v6

    sub-long/2addr v4, v6

    const/4 v6, 0x1

    aget-wide v6, v0, v6

    invoke-interface {v1, v4, v5, v6, v7}, Lcom/sma/smartv3/db/dao/SleepDao;->getSleeps(JJ)Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->noData()V

    invoke-direct {p0, v3, v3}, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->setXAxis(II)V

    goto/16 :goto_2

    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->values:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    sget-object v8, Lcom/sma/smartv3/model/SleepAllDayDataParse;->INSTANCE:Lcom/sma/smartv3/model/SleepAllDayDataParse;

    iget-object v11, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->values:Ljava/util/List;

    aget-wide v12, v0, v3

    const/high16 v10, 0x43960000    # 300.0f

    invoke-virtual/range {v8 .. v13}, Lcom/sma/smartv3/model/SleepAllDayDataParse;->filterData(Ljava/util/List;FLjava/util/List;J)Lcom/sma/smartv3/model/SleepAllDayData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/SleepAllDayData;->getTotal()I

    move-result v1

    const-wide/16 v4, 0x3e8

    if-lez v1, :cond_6

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->emptyPanel:Landroid/view/View;

    if-nez v1, :cond_1

    const-string v1, "emptyPanel"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_1
    const/16 v6, 0x8

    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->dataPanel:Landroid/view/View;

    if-nez v1, :cond_2

    const-string v1, "dataPanel"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_2
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0}, Lcom/sma/smartv3/model/SleepAllDayData;->getTotal()I

    move-result v1

    div-int/lit8 v1, v1, 0x3c

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->sleepHour:Landroid/widget/TextView;

    if-nez v3, :cond_3

    const-string v3, "sleepHour"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v2

    :cond_3
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->sleepMinute:Landroid/widget/TextView;

    if-nez v3, :cond_4

    const-string v3, "sleepMinute"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v2

    :cond_4
    invoke-virtual {v0}, Lcom/sma/smartv3/model/SleepAllDayData;->getTotal()I

    move-result v6

    mul-int/lit8 v1, v1, 0x3c

    sub-int/2addr v6, v1

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->sleepTime:Landroid/widget/TextView;

    if-nez v1, :cond_5

    const-string v1, "sleepTime"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_5
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XXX11i()Ljava/text/SimpleDateFormat;

    move-result-object v3

    new-instance v6, Ljava/util/Date;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/SleepAllDayData;->getStartTime()I

    move-result v7

    int-to-long v7, v7

    mul-long/2addr v7, v4

    invoke-direct {v6, v7, v8}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v6}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_6
    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->noData()V

    :goto_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->sleepStartTime:Landroid/widget/TextView;

    if-nez v1, :cond_7

    const-string v1, "sleepStartTime"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_7
    invoke-virtual {v0}, Lcom/sma/smartv3/model/SleepAllDayData;->getStartTime()I

    move-result v3

    int-to-long v6, v3

    mul-long/2addr v6, v4

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->format:Ljava/text/SimpleDateFormat;

    const-string v8, "format"

    if-nez v3, :cond_8

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v2

    :cond_8
    invoke-static {v6, v7, v3}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->sleepEndTime:Landroid/widget/TextView;

    if-nez v1, :cond_9

    const-string v1, "sleepEndTime"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_9
    invoke-virtual {v0}, Lcom/sma/smartv3/model/SleepAllDayData;->getEndTime()I

    move-result v0

    int-to-long v6, v0

    mul-long/2addr v6, v4

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->format:Ljava/text/SimpleDateFormat;

    if-nez v0, :cond_a

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_a
    move-object v2, v0

    :goto_1
    invoke-static {v6, v7, v2}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->values:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->updateData(Ljava/util/List;)V

    return-void
.end method

.method private final updateData(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/github/mikephil/charting/data/BarEntry;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    const/4 v2, 0x0

    const-string v3, "barChart"

    if-nez v1, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v1, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_1
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/XOi0;->XXI()I

    move-result v1

    if-lez v1, :cond_3

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v1, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_2
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/XOi0;->IXXOO(I)Z

    :cond_3
    new-instance v1, Lcom/android/mltcode/paycertificationapi/XXX1X11;

    const-string v4, "SleepData"

    invoke-direct {v1, p1, v4}, Lcom/android/mltcode/paycertificationapi/XXX1X11;-><init>(Ljava/util/List;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/XXX1X11;->iIXX0i(F)V

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->iO11i(F)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/IXIX1X1;

    const/4 v4, 0x1

    new-array v4, v4, [Lcom/android/mltcode/paycertificationapi/XIXi1iX00;

    aput-object v1, v4, v0

    invoke-direct {p1, v4}, Lcom/android/mltcode/paycertificationapi/IXIX1X1;-><init>([Lcom/android/mltcode/paycertificationapi/XIXi1iX00;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/XOi0;->iI(Z)V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v4

    const v5, 0x7f0600b4

    invoke-static {v4, v5}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v0, v4}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->I011X(Ljava/util/List;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v0, :cond_4

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_4
    invoke-virtual {v0, p1}, Lcom/github/mikephil/charting/charts/Chart;->setData(Lcom/android/mltcode/paycertificationapi/XOi0;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez p1, :cond_5

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    move-object v2, p1

    :goto_0
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 13
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

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    const v0, 0x7f0a0a57

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->sleepTime:Landroid/widget/TextView;

    const v0, 0x7f0a0a50

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->sleepHour:Landroid/widget/TextView;

    const v0, 0x7f0a0a52

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->sleepMinute:Landroid/widget/TextView;

    const v0, 0x7f0a0a53

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->sleepStartTime:Landroid/widget/TextView;

    const v0, 0x7f0a0a4f

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->sleepEndTime:Landroid/widget/TextView;

    const v0, 0x7f0a035c

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->emptyPanel:Landroid/view/View;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "emptyPanel"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070096

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    invoke-static {v0, v2}, Lcom/sma/smartv3/util/UtilsKt;->IX1XiI(Landroid/view/View;F)V

    const v0, 0x7f0a02d3

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->dataPanel:Landroid/view/View;

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    const-string v0, "barChart"

    if-nez p1, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v1

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v2, "getContext(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->mContext:Landroid/content/Context;

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->IXI(ZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v3

    iput-object v3, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->format:Ljava/text/SimpleDateFormat;

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v3, :cond_2

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    :cond_2
    const/4 v4, 0x0

    invoke-virtual {v3, v4, v4, v4, v4}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->i100IXOX(FFFF)V

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v3, :cond_3

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    :cond_3
    invoke-virtual {v3, p1}, Lcom/github/mikephil/charting/charts/Chart;->setTouchEnabled(Z)V

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/Chart;->getDescription()Lcom/android/mltcode/paycertificationapi/IOOI00X0I;

    move-result-object v5

    invoke-virtual {v5, p1}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/Chart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v5

    invoke-virtual {v5, p1}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v5

    invoke-virtual {v5, p1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Ii0X0X(Z)V

    const/high16 v6, 0x43960000    # 300.0f

    invoke-virtual {v5, v6}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOiXi11II(F)V

    invoke-virtual {v5, p1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    invoke-virtual {v5, p1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->XO0X10iO(Z)V

    invoke-virtual {v5, p1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Ii0X0X(Z)V

    invoke-virtual {v5, v4}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->i0X000X0O(F)V

    invoke-virtual {v5, v4}, Lcom/github/mikephil/charting/components/YAxis;->iIi0(F)V

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v5

    invoke-virtual {v5, p1}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v5, v4}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->i0X000X0O(F)V

    invoke-virtual {v5, v4}, Lcom/github/mikephil/charting/components/YAxis;->iIi0(F)V

    invoke-virtual {v5, p1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    invoke-virtual {v5, p1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Ii0X0X(Z)V

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v3

    sget-object v4, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v5, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->mContext:Landroid/content/Context;

    const-string v6, "mContext"

    if-nez v5, :cond_4

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v1

    :cond_4
    invoke-virtual {v4, v3, v2, v5}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIi0(Lcom/github/mikephil/charting/components/XAxis;ZLandroid/content/Context;)V

    invoke-virtual {v3, p1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    invoke-virtual {v3, p1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Ii0X0X(Z)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v2, :cond_5

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v1

    :cond_5
    iget-object v3, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v3, :cond_6

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    :cond_6
    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/Chart;->getAnimator()Lcom/android/mltcode/paycertificationapi/X1i1iOX;

    move-result-object v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v4, :cond_7

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v1

    :cond_7
    invoke-virtual {v4}, Lcom/github/mikephil/charting/charts/Chart;->getViewPortHandler()Lcom/android/mltcode/paycertificationapi/jh6;

    move-result-object v4

    invoke-direct {p1, v2, v3, v4}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;-><init>(Lcom/android/mltcode/paycertificationapi/IXi0IO;Lcom/android/mltcode/paycertificationapi/X1i1iOX;Lcom/android/mltcode/paycertificationapi/jh6;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->mContext:Landroid/content/Context;

    if-nez v2, :cond_8

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v1

    :cond_8
    const v3, 0x7f06024d

    invoke-static {v2, v3}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p1, v2}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iOOX010X(I)V

    iget v2, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->blockHeight:F

    invoke-virtual {p1, v2}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->X01IiOiIi(F)V

    iget v2, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->block:I

    invoke-virtual {p1, v2}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->OX(I)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->mContext:Landroid/content/Context;

    if-nez v2, :cond_9

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v1

    :cond_9
    const v3, 0x7f060703

    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v7

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->mContext:Landroid/content/Context;

    if-nez v2, :cond_a

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v1

    :cond_a
    const v3, 0x7f060704

    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v8

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->mContext:Landroid/content/Context;

    if-nez v2, :cond_b

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v1

    :cond_b
    const v3, 0x7f060701

    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v9

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->mContext:Landroid/content/Context;

    if-nez v2, :cond_c

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v1

    :cond_c
    const v3, 0x7f060702

    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v10

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->mContext:Landroid/content/Context;

    if-nez v2, :cond_d

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v1

    :cond_d
    const v3, 0x7f0606fd

    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v11

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->mContext:Landroid/content/Context;

    if-nez v2, :cond_e

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v1

    :cond_e
    const v3, 0x7f060700

    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v12

    filled-new-array/range {v7 .. v12}, [I

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->I1([I)V

    const/4 v2, 0x4

    invoke-virtual {p1, v2}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iIiiO(I)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v2, :cond_f

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_f
    move-object v1, v2

    :goto_0
    invoke-virtual {v1, p1}, Lcom/github/mikephil/charting/charts/Chart;->setRenderer(Lcom/android/mltcode/paycertificationapi/i0OX00;)V

    return-void
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->initEvent:Z

    return v0
.end method

.method public initView()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->IXi01O()Z

    move-result v0

    const-string v1, "null cannot be cast to non-null type com.sma.smartv3.view.chart.CustomInfoBarChartRender"

    const/4 v2, 0x0

    const-string v3, "barChart"

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v0, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->getRenderer()Lcom/android/mltcode/paycertificationapi/i0OX00;

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->showSleepAllDay()V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->barChart:Lcom/github/mikephil/charting/charts/BarChart;

    if-nez v0, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object v2, v0

    :goto_1
    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->getRenderer()Lcom/android/mltcode/paycertificationapi/i0OX00;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    iget v1, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->blockHeight:F

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->X01IiOiIi(F)V

    iget v1, p0, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->block:I

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->OX(I)V

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iIiiO(I)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->i010I(F)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->showSleep()V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d10a1

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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/Sleep2Item;->initView()V

    return-void
.end method
