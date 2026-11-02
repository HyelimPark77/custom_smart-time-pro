.class public final Lcom/sma/smartv3/ui/status/item/Hrv2Item;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field private dataPanel:Landroid/view/View;

.field private emptyPanel:Landroid/view/View;

.field private final filterData:Ljava/util/LinkedHashMap;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Long;",
            "Lcom/sma/smartv3/model/HRVMinuteData;",
            ">;"
        }
    .end annotation
.end field

.field private final initEvent:Z

.field private final intervalTime:I

.field private lineChart:Lcom/github/mikephil/charting/charts/LineChart;

.field private mContext:Landroid/content/Context;

.field private final mHrvDao:Lcom/sma/smartv3/db/dao/HrvDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final maxHour:I

.field private final maxNum:I

.field private range:[J
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final totalTime:I

.field private tvChartBottomText:Landroid/widget/TextView;

.field private tvTime:Landroid/widget/TextView;

.field private tvValue:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [J

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->range:[J

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->hrvDao()Lcom/sma/smartv3/db/dao/HrvDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->mHrvDao:Lcom/sma/smartv3/db/dao/HrvDao;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->filterData:Ljava/util/LinkedHashMap;

    const/4 v0, 0x4

    iput v0, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->maxHour:I

    mul-int/lit8 v0, v0, 0x3c

    const v1, 0xea60

    mul-int/2addr v0, v1

    iput v0, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->totalTime:I

    const v1, 0x493e0

    iput v1, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->intervalTime:I

    div-int/2addr v0, v1

    iput v0, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->maxNum:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->initEvent:Z

    return-void

    nop

    :array_0
    .array-data 8
        0x0
        0x0
    .end array-data
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 9
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-string v2, "itemHolder"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->maxHour:I

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OiIIX101O(I)[J

    move-result-object v2

    iput-object v2, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->range:[J

    const v2, 0x7f0a044d

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v2, Lcom/github/mikephil/charting/charts/LineChart;

    iput-object v2, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    const v2, 0x7f0a044b

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->tvTime:Landroid/widget/TextView;

    const v2, 0x7f0a044c

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->tvValue:Landroid/widget/TextView;

    const v2, 0x7f0a0c50

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->tvChartBottomText:Landroid/widget/TextView;

    const v2, 0x7f0a035c

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v2, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->emptyPanel:Landroid/view/View;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const-string v2, "emptyPanel"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v3

    :cond_0
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f070096

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    invoke-static {v2, v4}, Lcom/sma/smartv3/util/UtilsKt;->IX1XiI(Landroid/view/View;F)V

    const v2, 0x7f0a02d3

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->dataPanel:Landroid/view/View;

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    const-string v2, "lineChart"

    if-nez p1, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v3

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v4, "getContext(...)"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->mContext:Landroid/content/Context;

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->tvChartBottomText:Landroid/widget/TextView;

    if-nez p1, :cond_2

    const-string p1, "tvChartBottomText"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v3

    :cond_2
    iget-object v5, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->mContext:Landroid/content/Context;

    const-string v6, "mContext"

    if-nez v5, :cond_3

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v3

    :cond_3
    iget v7, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->maxHour:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    const v8, 0x7f140dfa

    invoke-virtual {v5, v8, v7}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez p1, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v3

    :cond_4
    const/4 v5, 0x0

    invoke-virtual {p1, v5, v5, v5, v5}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->i100IXOX(FFFF)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez p1, :cond_5

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v3

    :cond_5
    invoke-virtual {p1, v1}, Lcom/github/mikephil/charting/charts/Chart;->setTouchEnabled(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->getDescription()Lcom/android/mltcode/paycertificationapi/IOOI00X0I;

    move-result-object v7

    invoke-virtual {v7, v1}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v7

    invoke-virtual {v7, v1}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v7

    invoke-virtual {v7, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Ii0X0X(Z)V

    const/high16 v8, 0x42dc0000    # 110.0f

    invoke-virtual {v7, v8}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOiXi11II(F)V

    invoke-virtual {v7, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    invoke-virtual {v7, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->XO0X10iO(Z)V

    invoke-virtual {v7, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Ii0X0X(Z)V

    invoke-virtual {v7, v5}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->i0X000X0O(F)V

    invoke-virtual {v7, v5}, Lcom/github/mikephil/charting/components/YAxis;->iIi0(F)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v7

    invoke-virtual {v7, v1}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v7, v5}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->i0X000X0O(F)V

    invoke-virtual {v7, v5}, Lcom/github/mikephil/charting/components/YAxis;->iIi0(F)V

    invoke-virtual {v7, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    invoke-virtual {v7, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Ii0X0X(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object p1

    sget-object v7, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v8, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez v8, :cond_6

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v8, v3

    :cond_6
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, p1, v0, v8}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIi0(Lcom/github/mikephil/charting/components/XAxis;ZLandroid/content/Context;)V

    invoke-virtual {p1, v5}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->i0X000X0O(F)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {p1, v4}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->IXOIIIO(F)V

    iget v5, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->maxNum:I

    int-to-float v5, v5

    invoke-virtual {p1, v5}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOiXi11II(F)V

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Ii0X0X(Z)V

    new-instance p1, Lcom/github/mikephil/charting/data/LineDataSet;

    const-string v5, ""

    invoke-direct {p1, v3, v5}, Lcom/github/mikephil/charting/data/LineDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    iget-object v5, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->mContext:Landroid/content/Context;

    if-nez v5, :cond_7

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v3

    :cond_7
    const v7, 0x7f060240

    invoke-static {v5, v7}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {p1, v5}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->II1(I)V

    iget-object v5, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->mContext:Landroid/content/Context;

    if-nez v5, :cond_8

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v3

    :cond_8
    invoke-static {v5, v7}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {p1, v5}, Lcom/github/mikephil/charting/data/LineDataSet;->I00(I)V

    const/high16 v5, 0x40000000    # 2.0f

    invoke-virtual {p1, v5}, Lcom/android/mltcode/paycertificationapi/ho;->I1XII0X(F)V

    invoke-virtual {p1, v4}, Lcom/github/mikephil/charting/data/LineDataSet;->iXOII(F)V

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->mContext:Landroid/content/Context;

    if-nez v4, :cond_9

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v3

    :cond_9
    const v5, 0x7f0816d1

    invoke-static {v4, v5}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/android/mltcode/paycertificationapi/ho;->I0i1OXiI(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1, v1}, Lcom/github/mikephil/charting/data/LineDataSet;->IOI0i0I(Z)V

    sget-object v4, Lcom/github/mikephil/charting/data/LineDataSet$Mode;->CUBIC_BEZIER:Lcom/github/mikephil/charting/data/LineDataSet$Mode;

    invoke-virtual {p1, v4}, Lcom/github/mikephil/charting/data/LineDataSet;->OXXO0O1X(Lcom/github/mikephil/charting/data/LineDataSet$Mode;)V

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->XXI(Z)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/ho;->O1iXiI(Z)V

    new-instance v4, Lcom/android/mltcode/paycertificationapi/co;

    new-array v0, v0, [Lcom/android/mltcode/paycertificationapi/IiXO1XOi;

    aput-object p1, v0, v1

    invoke-direct {v4, v0}, Lcom/android/mltcode/paycertificationapi/co;-><init>([Lcom/android/mltcode/paycertificationapi/IiXO1XOi;)V

    invoke-virtual {v4, v1}, Lcom/android/mltcode/paycertificationapi/XOi0;->iI(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez p1, :cond_a

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_a
    move-object v3, p1

    :goto_0
    invoke-virtual {v3, v4}, Lcom/github/mikephil/charting/charts/Chart;->setData(Lcom/android/mltcode/paycertificationapi/XOi0;)V

    return-void
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->initEvent:Z

    return v0
.end method

.method public initView()V
    .locals 8

    iget v0, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->maxHour:I

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OiIIX101O(I)[J

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->range:[J

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->mHrvDao:Lcom/sma/smartv3/db/dao/HrvDao;

    const/4 v2, 0x0

    aget-wide v3, v0, v2

    const/4 v5, 0x1

    aget-wide v5, v0, v5

    invoke-interface {v1, v3, v4, v5, v6}, Lcom/sma/smartv3/db/dao/HrvDao;->getHrv(JJ)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/16 v3, 0x8

    const-string v4, "dataPanel"

    const-string v5, "emptyPanel"

    const-string v6, "tvTime"

    const/4 v7, 0x0

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->tvTime:Landroid/widget/TextView;

    if-nez v1, :cond_0

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v7

    :cond_0
    const-string v6, ""

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->emptyPanel:Landroid/view/View;

    if-nez v1, :cond_1

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v7

    :cond_1
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->dataPanel:Landroid/view/View;

    if-nez v1, :cond_2

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v7, v1

    :goto_0
    invoke-virtual {v7, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->emptyPanel:Landroid/view/View;

    if-nez v1, :cond_4

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v7

    :cond_4
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->dataPanel:Landroid/view/View;

    if-nez v1, :cond_5

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v7

    :cond_5
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->tvTime:Landroid/widget/TextView;

    if-nez v1, :cond_6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v7

    :cond_6
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XXX11i()Ljava/text/SimpleDateFormat;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/Hrv;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Hrv;->getMTime()J

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->tvValue:Landroid/widget/TextView;

    if-nez v1, :cond_7

    const-string v1, "tvValue"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_7
    move-object v7, v1

    :goto_1
    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/Hrv;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Hrv;->getMValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_2
    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->showChartData(Ljava/util/List;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d109f

    return v0
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

    const-string p1, "onHrvChanged"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->initView()V

    return-void
.end method

.method public final showChartData(Ljava/util/List;)V
    .locals 11
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Hrv;",
            ">;)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->filterData:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->range:[J

    const/4 v1, 0x0

    aget-wide v2, v0, v1

    const/4 v8, 0x1

    aget-wide v4, v0, v8

    iget v0, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->intervalTime:I

    int-to-long v6, v0

    const-wide/16 v9, 0x0

    cmp-long v0, v6, v9

    if-lez v0, :cond_8

    invoke-static/range {v2 .. v7}, Lkotlin/internal/ProgressionUtilKt;->XO0O10(JJJ)J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-gtz v0, :cond_0

    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->filterData:Ljava/util/LinkedHashMap;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    new-instance v10, Lcom/sma/smartv3/model/HRVMinuteData;

    invoke-direct {v10, v1, v1}, Lcom/sma/smartv3/model/HRVMinuteData;-><init>(II)V

    invoke-interface {v0, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    add-long/2addr v2, v6

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/Hrv;

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->filterData:Ljava/util/LinkedHashMap;

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/model/HRVMinuteData;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Hrv;->getMTime()J

    move-result-wide v9

    cmp-long v5, v9, v5

    if-gez v5, :cond_2

    invoke-virtual {v4}, Lcom/sma/smartv3/model/HRVMinuteData;->getTotal()I

    move-result v3

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Hrv;->getMValue()I

    move-result v2

    add-int/2addr v3, v2

    invoke-virtual {v4, v3}, Lcom/sma/smartv3/model/HRVMinuteData;->setTotal(I)V

    invoke-virtual {v4}, Lcom/sma/smartv3/model/HRVMinuteData;->getNum()I

    move-result v2

    add-int/2addr v2, v8

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/model/HRVMinuteData;->setNum(I)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->filterData:Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/model/HRVMinuteData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/HRVMinuteData;->getNum()I

    move-result v4

    const/high16 v5, 0x3f800000    # 1.0f

    if-eqz v4, :cond_4

    invoke-virtual {v3}, Lcom/sma/smartv3/model/HRVMinuteData;->getTotal()I

    move-result v4

    if-eqz v4, :cond_4

    new-instance v4, Lcom/github/mikephil/charting/data/Entry;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/HRVMinuteData;->getTotal()I

    move-result v6

    invoke-virtual {v3}, Lcom/sma/smartv3/model/HRVMinuteData;->getNum()I

    move-result v3

    div-int/2addr v6, v3

    int-to-float v3, v6

    invoke-direct {v4, v2, v3}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    add-float/2addr v2, v5

    goto :goto_2

    :cond_5
    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    const/4 v2, 0x0

    const-string v3, "lineChart"

    if-nez p1, :cond_6

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v2

    :cond_6
    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object p1

    check-cast p1, Lcom/android/mltcode/paycertificationapi/co;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/XOi0;->I1XOi1()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/github/mikephil/charting/data/LineDataSet;

    invoke-virtual {p1}, Lcom/github/mikephil/charting/data/DataSet;->i0O()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Hrv2Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez p1, :cond_7

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_3

    :cond_7
    move-object v2, p1

    :goto_3
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    return-void

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Step must be positive, was: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
