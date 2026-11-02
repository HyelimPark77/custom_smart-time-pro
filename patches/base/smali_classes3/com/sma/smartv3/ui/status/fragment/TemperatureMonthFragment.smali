.class public final Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment;
.super Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment<",
        "Lcom/sma/smartv3/db/entity/Temperature;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTemperatureMonthFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemperatureMonthFragment.kt\ncom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,138:1\n19#2:139\n15#2:140\n*S KotlinDebug\n*F\n+ 1 TemperatureMonthFragment.kt\ncom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment\n*L\n31#1:139\n31#1:140\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTemperatureMonthFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemperatureMonthFragment.kt\ncom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,138:1\n19#2:139\n15#2:140\n*S KotlinDebug\n*F\n+ 1 TemperatureMonthFragment.kt\ncom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment\n*L\n31#1:139\n31#1:140\n*E\n"
    }
.end annotation


# instance fields
.field private isImperial:Z

.field private final mAppUser:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mTemperatureDao:Lcom/sma/smartv3/db/dao/TemperatureDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final temperatureDayDataList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/TemperatureDayData;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;-><init>()V

    sget-object v1, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/AppDatabase;->temperatureDao()Lcom/sma/smartv3/db/dao/TemperatureDao;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment;->mTemperatureDao:Lcom/sma/smartv3/db/dao/TemperatureDao;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment;->temperatureDayDataList:Ljava/util/List;

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

    iput-object v2, v0, Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    return-void
.end method


# virtual methods
.method public filterData(Ljava/util/List;)V
    .locals 7
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Temperature;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->filterData(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->i11I()V

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v1, Lcom/sma/smartv3/model/TemperatureDataParse;->INSTANCE:Lcom/sma/smartv3/model/TemperatureDataParse;

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment;->isImperial:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getMonthData()Ljava/util/LinkedHashMap;

    move-result-object v4

    iget-object v5, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment;->temperatureDayDataList:Ljava/util/List;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getValues()Ljava/util/List;

    move-result-object v6

    move-object v3, p1

    invoke-virtual/range {v1 .. v6}, Lcom/sma/smartv3/model/TemperatureDataParse;->filterDayData(ZLjava/util/List;Ljava/util/LinkedHashMap;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getValues()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->updateChartData(Ljava/util/List;)V

    return-void
.end method

.method public initView()V
    .locals 4

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment;->mAppUser:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/cp5;->II1Xi0(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment;->isImperial:Z

    const/high16 v0, 0x41a00000    # 20.0f

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->setAxisMinimum(F)V

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->initView()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getOneLl()Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getImage()Landroid/widget/ImageView;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->XI1OX0IO()Z

    move-result v1

    if-eqz v1, :cond_1

    const v1, 0x7f08135d

    goto :goto_1

    :cond_1
    const v1, 0x7f0813a0

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getValueUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment;->isImperial:Z

    const v2, 0x7f1403da

    const v3, 0x7f140bad

    if-eqz v1, :cond_2

    move v1, v3

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getNowValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getTwoTV()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f140191

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getTwoUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment;->isImperial:Z

    if-eqz v1, :cond_3

    move v2, v3

    :cond_3
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

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
            "Lcom/sma/smartv3/db/entity/Temperature;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment;->filterData(Ljava/util/List;)V

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
            "Lcom/sma/smartv3/db/entity/Temperature;",
            ">;"
        }
    .end annotation

    const-string v0, "calendar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timePeriod"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3, p2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->I1(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;I)[J

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const/4 p2, 0x0

    aget-wide v0, p1, p2

    const/4 p3, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, p3, v2, p3}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XiOIO(JLcom/sma/smartv3/util/DateTimeFormat;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-virtual {p0, p3}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->setMonthDays(Ljava/util/List;)V

    aget-wide v0, p1, p2

    invoke-virtual {p0, v0, v1}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->clearCache(J)V

    iget-object p3, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment;->mTemperatureDao:Lcom/sma/smartv3/db/dao/TemperatureDao;

    aget-wide v0, p1, p2

    const/4 p2, 0x1

    aget-wide v2, p1, p2

    invoke-interface {p3, v0, v1, v2, v3}, Lcom/sma/smartv3/db/dao/TemperatureDao;->getListDesc(JJ)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public setChartRenderer()V
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->IXOIIIO(F)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment$OXO1;-><init>(Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/CustomBarChartView;->setOnChartTouchListener(Lcom/sma/smartv3/view/CustomBarChartView$OXO1;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Oi01X10i;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/github/mikephil/charting/charts/Chart;->getAnimator()Lcom/android/mltcode/paycertificationapi/X1i1iOX;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v3

    invoke-virtual {v3}, Lcom/github/mikephil/charting/charts/Chart;->getViewPortHandler()Lcom/android/mltcode/paycertificationapi/jh6;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;-><init>(Lcom/android/mltcode/paycertificationapi/IXi0IO;Lcom/android/mltcode/paycertificationapi/X1i1iOX;Lcom/android/mltcode/paycertificationapi/jh6;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f06024d

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iOOX010X(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f060749

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f06074a

    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    filled-new-array {v1, v2}, [I

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->I1([I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/Oi01X10i;->iIiiO(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getBarChart()Lcom/sma/smartv3/view/CustomBarChartView;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/github/mikephil/charting/charts/Chart;->setRenderer(Lcom/android/mltcode/paycertificationapi/i0OX00;)V

    return-void
.end method

.method public setColor(Lcom/android/mltcode/paycertificationapi/XXX1X11;)V
    .locals 3
    .param p1    # Lcom/android/mltcode/paycertificationapi/XXX1X11;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f0600b4

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->I011X(Ljava/util/List;)V

    return-void
.end method

.method public setDataLabel()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "temp month Data"

    return-object v0
.end method

.method public updateItemData(Lcom/github/mikephil/charting/data/Entry;)V
    .locals 4
    .param p1    # Lcom/github/mikephil/charting/data/Entry;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/fragment/TemperatureMonthFragment;->temperatureDayDataList:Ljava/util/List;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/Entry;->OIX0iXi()F

    move-result p1

    float-to-int p1, p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/model/TemperatureDayData;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getNowValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/TemperatureDayData;->getMin()F

    move-result v1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/TemperatureDayData;->getMax()F

    move-result v2

    invoke-static {v1, v2}, Lcom/sma/smartv3/util/UtilsKt;->II1Xi0(FF)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseMonthFragment;->getTwoValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/TemperatureDayData;->getAvg()F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-nez v1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/TemperatureDayData;->getAvg()F

    move-result p1

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->X01IiOiIi(F)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/sma/smartv3/model/TemperatureDayData;->getAvg()F

    move-result p1

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/cp5;->X11iII1O1(FZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
