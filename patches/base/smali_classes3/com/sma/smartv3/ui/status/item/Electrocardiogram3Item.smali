.class public final Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field private dataPanel:Landroid/view/View;

.field private emptyPanel:Landroid/view/View;

.field private final initEvent:Z

.field private final intervalTime:I

.field private lineChart:Lcom/github/mikephil/charting/charts/LineChart;

.field private mContext:Landroid/content/Context;

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

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->range:[J

    const/4 v0, 0x4

    iput v0, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->maxHour:I

    mul-int/lit8 v0, v0, 0x3c

    const v1, 0xea60

    mul-int/2addr v0, v1

    iput v0, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->totalTime:I

    const v1, 0x493e0

    iput v1, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->intervalTime:I

    div-int/2addr v0, v1

    iput v0, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->maxNum:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->initEvent:Z

    return-void

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

    iget v2, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->maxHour:I

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OiIIX101O(I)[J

    move-result-object v2

    iput-object v2, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->range:[J

    const v2, 0x7f0a0442

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v2, Lcom/github/mikephil/charting/charts/LineChart;

    iput-object v2, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    const v2, 0x7f0a0440

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->tvTime:Landroid/widget/TextView;

    const v2, 0x7f0a0441

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->tvValue:Landroid/widget/TextView;

    const v2, 0x7f0a0c50

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->tvChartBottomText:Landroid/widget/TextView;

    const v2, 0x7f0a035c

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v2, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->emptyPanel:Landroid/view/View;

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->dataPanel:Landroid/view/View;

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    const-string v2, "lineChart"

    if-nez p1, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v3

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v4, "getContext(...)"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->mContext:Landroid/content/Context;

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->tvChartBottomText:Landroid/widget/TextView;

    if-nez p1, :cond_2

    const-string p1, "tvChartBottomText"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v3

    :cond_2
    iget-object v5, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->mContext:Landroid/content/Context;

    const-string v6, "mContext"

    if-nez v5, :cond_3

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v3

    :cond_3
    iget v7, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->maxHour:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    const v8, 0x7f140dfa

    invoke-virtual {v5, v8, v7}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez p1, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v3

    :cond_4
    const/4 v5, 0x0

    invoke-virtual {p1, v5, v5, v5, v5}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->i100IXOX(FFFF)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

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

    const/high16 v8, 0x43480000    # 200.0f

    invoke-virtual {v7, v8}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOiXi11II(F)V

    invoke-virtual {v7, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    invoke-virtual {v7, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->XO0X10iO(Z)V

    invoke-virtual {v7, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Ii0X0X(Z)V

    const/high16 v8, 0x41f00000    # 30.0f

    invoke-virtual {v7, v8}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->i0X000X0O(F)V

    invoke-virtual {v7, v5}, Lcom/github/mikephil/charting/components/YAxis;->iIi0(F)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v7

    invoke-virtual {v7, v1}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v7, v8}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->i0X000X0O(F)V

    invoke-virtual {v7, v5}, Lcom/github/mikephil/charting/components/YAxis;->iIi0(F)V

    invoke-virtual {v7, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    invoke-virtual {v7, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Ii0X0X(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object p1

    sget-object v7, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v8, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

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

    iget v5, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->maxNum:I

    int-to-float v5, v5

    invoke-virtual {p1, v5}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOiXi11II(F)V

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Ii0X0X(Z)V

    new-instance p1, Lcom/github/mikephil/charting/data/LineDataSet;

    const-string v5, ""

    invoke-direct {p1, v3, v5}, Lcom/github/mikephil/charting/data/LineDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    iget-object v5, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->mContext:Landroid/content/Context;

    if-nez v5, :cond_7

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v3

    :cond_7
    const v7, 0x7f060236

    invoke-static {v5, v7}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {p1, v5}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->II1(I)V

    iget-object v5, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->mContext:Landroid/content/Context;

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

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->mContext:Landroid/content/Context;

    if-nez v4, :cond_9

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v3

    :cond_9
    const v5, 0x7f0816d1

    invoke-static {v4, v5}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/android/mltcode/paycertificationapi/ho;->I0i1OXiI(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1, v1}, Lcom/github/mikephil/charting/data/LineDataSet;->IOI0i0I(Z)V

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->XXI(Z)V

    sget-object v4, Lcom/github/mikephil/charting/data/LineDataSet$Mode;->CUBIC_BEZIER:Lcom/github/mikephil/charting/data/LineDataSet$Mode;

    invoke-virtual {p1, v4}, Lcom/github/mikephil/charting/data/LineDataSet;->OXXO0O1X(Lcom/github/mikephil/charting/data/LineDataSet$Mode;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/ho;->O1iXiI(Z)V

    new-instance v4, Lcom/android/mltcode/paycertificationapi/co;

    new-array v0, v0, [Lcom/android/mltcode/paycertificationapi/IiXO1XOi;

    aput-object p1, v0, v1

    invoke-direct {v4, v0}, Lcom/android/mltcode/paycertificationapi/co;-><init>([Lcom/android/mltcode/paycertificationapi/IiXO1XOi;)V

    invoke-virtual {v4, v1}, Lcom/android/mltcode/paycertificationapi/XOi0;->iI(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

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

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->initEvent:Z

    return v0
.end method

.method public initView()V
    .locals 3

    iget v0, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->maxHour:I

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OiIIX101O(I)[J

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->range:[J

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->emptyPanel:Landroid/view/View;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "emptyPanel"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->dataPanel:Landroid/view/View;

    if-nez v0, :cond_1

    const-string v0, "dataPanel"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d109a

    return v0
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

    const-string p1, "onHeartRateChanged"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/Electrocardiogram3Item;->initView()V

    return-void
.end method

.method public final showChartData(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Electrocardiogram;",
            ">;)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
