.class public final Lcom/sma/smartv3/ui/status/item/Weight2Item;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWeight2Item.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Weight2Item.kt\ncom/sma/smartv3/ui/status/item/Weight2Item\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,172:1\n19#2:173\n15#2:174\n1491#3:175\n1516#3,3:176\n1519#3,3:186\n382#4,7:179\n216#5,2:189\n*S KotlinDebug\n*F\n+ 1 Weight2Item.kt\ncom/sma/smartv3/ui/status/item/Weight2Item\n*L\n109#1:173\n109#1:174\n123#1:175\n123#1:176,3\n123#1:186,3\n123#1:179,7\n123#1:189,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWeight2Item.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Weight2Item.kt\ncom/sma/smartv3/ui/status/item/Weight2Item\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,172:1\n19#2:173\n15#2:174\n1491#3:175\n1516#3,3:176\n1519#3,3:186\n382#4,7:179\n216#5,2:189\n*S KotlinDebug\n*F\n+ 1 Weight2Item.kt\ncom/sma/smartv3/ui/status/item/Weight2Item\n*L\n109#1:173\n109#1:174\n123#1:175\n123#1:176,3\n123#1:186,3\n123#1:179,7\n123#1:189,2\n*E\n"
    }
.end annotation


# instance fields
.field private bmiValue:Landroid/widget/TextView;

.field private dataPanel:Landroid/view/View;

.field private emptyPanel:Landroid/view/View;

.field private final entries:Ljava/util/List;
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

.field private final initEvent:Z

.field private isImperial:Z

.field private lineChart:Lcom/github/mikephil/charting/charts/LineChart;

.field private mContext:Landroid/content/Context;

.field private final mWeightDao:Lcom/sma/smartv3/db/dao/WeightDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private weightLastTime:Landroid/widget/TextView;

.field private weightLastValue:Landroid/widget/TextView;

.field private weightUnit:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->entries:Ljava/util/List;

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->weightDao()Lcom/sma/smartv3/db/dao/WeightDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->mWeightDao:Lcom/sma/smartv3/db/dao/WeightDao;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->initEvent:Z

    return-void
.end method

.method private final showChartData(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Weight;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->entries:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v2, v1, 0x1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/db/entity/Weight;

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->entries:Ljava/util/List;

    new-instance v5, Lcom/github/mikephil/charting/data/Entry;

    int-to-float v1, v1

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Weight;->getMWeight()F

    move-result v3

    invoke-direct {v5, v1, v3}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v1, v2

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    const/4 v1, 0x0

    const-string v2, "lineChart"

    if-nez p1, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v1

    :cond_1
    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object p1

    check-cast p1, Lcom/android/mltcode/paycertificationapi/co;

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/XOi0;->OIX0iXi(I)Lcom/android/mltcode/paycertificationapi/IXIiiOXi;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/github/mikephil/charting/data/LineDataSet;

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->entries:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/github/mikephil/charting/data/DataSet;->IOX1(Ljava/util/List;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez p1, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v1

    :cond_2
    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->getData()Lcom/android/mltcode/paycertificationapi/XOi0;

    move-result-object p1

    check-cast p1, Lcom/android/mltcode/paycertificationapi/co;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/XOi0;->iX()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez p1, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    move-object v1, p1

    :goto_1
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 8
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-string v2, "itemHolder"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f0a1939

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v2, Lcom/github/mikephil/charting/charts/LineChart;

    iput-object v2, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    const v2, 0x7f0a193b

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->weightLastTime:Landroid/widget/TextView;

    const v2, 0x7f0a193c

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->weightLastValue:Landroid/widget/TextView;

    const v2, 0x7f0a193e

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->weightUnit:Landroid/widget/TextView;

    const v2, 0x7f0a015b

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->bmiValue:Landroid/widget/TextView;

    const v2, 0x7f0a035c

    invoke-virtual {p1, v2}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v2, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->emptyPanel:Landroid/view/View;

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->dataPanel:Landroid/view/View;

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    const-string v2, "lineChart"

    if-nez p1, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v3

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v4, "getContext(...)"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->mContext:Landroid/content/Context;

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez p1, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v3

    :cond_2
    const/4 v5, 0x0

    invoke-virtual {p1, v5, v5, v5, v5}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->i100IXOX(FFFF)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez p1, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v3

    :cond_3
    invoke-virtual {p1, v1}, Lcom/github/mikephil/charting/charts/Chart;->setTouchEnabled(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->getDescription()Lcom/android/mltcode/paycertificationapi/IOOI00X0I;

    move-result-object v6

    invoke-virtual {v6, v1}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v6

    invoke-virtual {v6, v1}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v6

    invoke-virtual {v6, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Ii0X0X(Z)V

    const/high16 v7, 0x43480000    # 200.0f

    invoke-virtual {v6, v7}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOiXi11II(F)V

    invoke-virtual {v6, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    invoke-virtual {v6, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->XO0X10iO(Z)V

    invoke-virtual {v6, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Ii0X0X(Z)V

    const/high16 v7, 0x41f00000    # 30.0f

    invoke-virtual {v6, v7}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->i0X000X0O(F)V

    invoke-virtual {v6, v5}, Lcom/github/mikephil/charting/components/YAxis;->iIi0(F)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisRight()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v6

    invoke-virtual {v6, v1}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {v6, v7}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->i0X000X0O(F)V

    invoke-virtual {v6, v5}, Lcom/github/mikephil/charting/components/YAxis;->iIi0(F)V

    invoke-virtual {v6, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    invoke-virtual {v6, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Ii0X0X(Z)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object p1

    sget-object v5, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v6, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez v6, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v6, v3

    :cond_4
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, p1, v0, v6}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OIi0(Lcom/github/mikephil/charting/components/XAxis;ZLandroid/content/Context;)V

    const/high16 v4, -0x41000000    # -0.5f

    invoke-virtual {p1, v4}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->i0X000X0O(F)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {p1, v4}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->IXOIIIO(F)V

    const/high16 v4, 0x40f00000    # 7.5f

    invoke-virtual {p1, v4}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->iOiXi11II(F)V

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Ii0X0X(Z)V

    new-instance p1, Lcom/github/mikephil/charting/data/LineDataSet;

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->entries:Ljava/util/List;

    const-string v5, "Weight item Data"

    invoke-direct {p1, v4, v5}, Lcom/github/mikephil/charting/data/LineDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->mContext:Landroid/content/Context;

    const-string v5, "mContext"

    if-nez v4, :cond_5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v3

    :cond_5
    const v6, 0x7f0607aa

    invoke-static {v4, v6}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {p1, v4}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->II1(I)V

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->mContext:Landroid/content/Context;

    if-nez v4, :cond_6

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v3

    :cond_6
    invoke-static {v4, v6}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {p1, v4}, Lcom/github/mikephil/charting/data/LineDataSet;->I00(I)V

    const/high16 v4, 0x3fc00000    # 1.5f

    invoke-virtual {p1, v4}, Lcom/android/mltcode/paycertificationapi/ho;->I1XII0X(F)V

    const/high16 v4, 0x40600000    # 3.5f

    invoke-virtual {p1, v4}, Lcom/github/mikephil/charting/data/LineDataSet;->iXOII(F)V

    const/high16 v4, 0x40000000    # 2.0f

    invoke-virtual {p1, v4}, Lcom/github/mikephil/charting/data/LineDataSet;->XX00XX(F)V

    sget-object v4, Lcom/github/mikephil/charting/data/LineDataSet$Mode;->CUBIC_BEZIER:Lcom/github/mikephil/charting/data/LineDataSet$Mode;

    invoke-virtual {p1, v4}, Lcom/github/mikephil/charting/data/LineDataSet;->OXXO0O1X(Lcom/github/mikephil/charting/data/LineDataSet$Mode;)V

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->mContext:Landroid/content/Context;

    if-nez v4, :cond_7

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v3

    :cond_7
    const v5, 0x7f0607a9

    invoke-static {v4, v5}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {p1, v4}, Lcom/github/mikephil/charting/data/LineDataSet;->IIX(I)V

    invoke-virtual {p1, v0}, Lcom/github/mikephil/charting/data/LineDataSet;->IOI0i0I(Z)V

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->XXI(Z)V

    new-instance v4, Lcom/android/mltcode/paycertificationapi/co;

    new-array v0, v0, [Lcom/android/mltcode/paycertificationapi/IiXO1XOi;

    aput-object p1, v0, v1

    invoke-direct {v4, v0}, Lcom/android/mltcode/paycertificationapi/co;-><init>([Lcom/android/mltcode/paycertificationapi/IiXO1XOi;)V

    invoke-virtual {v4, v1}, Lcom/android/mltcode/paycertificationapi/XOi0;->iI(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez p1, :cond_8

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_8
    move-object v3, p1

    :goto_0
    invoke-virtual {v3, v4}, Lcom/github/mikephil/charting/charts/Chart;->setData(Lcom/android/mltcode/paycertificationapi/XOi0;)V

    return-void
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->initEvent:Z

    return v0
.end method

.method public initView()V
    .locals 32

    move-object/from16 v0, p0

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

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v3, :cond_1

    move v1, v3

    goto :goto_1

    :cond_1
    move v1, v4

    :goto_1
    iput-boolean v1, v0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->isImperial:Z

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v1, v4}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XX0(Ljava/util/Calendar;I)V

    invoke-static {v1, v4}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->I1(Ljava/util/Calendar;I)V

    invoke-static {v1, v4}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->OiIIX101O(Ljava/util/Calendar;I)V

    invoke-static {v1, v4}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->iIiiO(Ljava/util/Calendar;I)V

    const/4 v5, 0x7

    invoke-virtual {v1, v5}, Ljava/util/Calendar;->setMinimalDaysInFirstWeek(I)V

    invoke-virtual {v1}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    move-result v5

    invoke-static {v1, v5}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XiOIO(Ljava/util/Calendar;I)V

    const-string v5, "apply(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lcom/sma/smartv3/util/TimePeriod;->WEEK:Lcom/sma/smartv3/util/TimePeriod;

    invoke-static {v1, v5, v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->I1(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;I)[J

    move-result-object v1

    iget-object v5, v0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->mWeightDao:Lcom/sma/smartv3/db/dao/WeightDao;

    aget-wide v6, v1, v4

    aget-wide v8, v1, v3

    invoke-interface {v5, v6, v7, v8, v9}, Lcom/sma/smartv3/db/dao/WeightDao;->getWeightsASC(JJ)Ljava/util/List;

    move-result-object v1

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/sma/smartv3/db/entity/Weight;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iiIOiX()Ljava/text/SimpleDateFormat;

    move-result-object v9

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Weight;->getMTime()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v9, v8}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v6, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_2

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    check-cast v9, Ljava/util/List;

    invoke-interface {v9, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-static {v6, v3}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IiII0(Ljava/util/List;I)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v5, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_3

    :cond_4
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/16 v6, 0x8

    const-string v7, "dataPanel"

    const-string v8, "emptyPanel"

    const-string v9, "weightLastTime"

    const/4 v10, 0x0

    if-eqz v1, :cond_8

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->weightLastTime:Landroid/widget/TextView;

    if-nez v1, :cond_5

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v10

    :cond_5
    const-string v3, ""

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->emptyPanel:Landroid/view/View;

    if-nez v1, :cond_6

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v10

    :cond_6
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->dataPanel:Landroid/view/View;

    if-nez v1, :cond_7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v10

    :cond_7
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_5

    :cond_8
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->emptyPanel:Landroid/view/View;

    if-nez v1, :cond_9

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v10

    :cond_9
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->dataPanel:Landroid/view/View;

    if-nez v1, :cond_a

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v10

    :cond_a
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    const-string v6, "lineChart"

    if-nez v1, :cond_b

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v10

    :cond_b
    invoke-virtual {v1}, Lcom/github/mikephil/charting/charts/Chart;->getXAxis()Lcom/github/mikephil/charting/components/XAxis;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->X00Xi1X(Z)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->lineChart:Lcom/github/mikephil/charting/charts/LineChart;

    if-nez v1, :cond_c

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v10

    :cond_c
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-static {v5}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/Weight;

    iget-object v3, v0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->weightLastTime:Landroid/widget/TextView;

    if-nez v3, :cond_d

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v10

    :cond_d
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XXX11i()Ljava/text/SimpleDateFormat;

    move-result-object v4

    new-instance v6, Ljava/util/Date;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Weight;->getMTime()J

    move-result-wide v7

    invoke-direct {v6, v7, v8}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v4, v6}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, v0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->weightLastValue:Landroid/widget/TextView;

    if-nez v3, :cond_e

    const-string v3, "weightLastValue"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v10

    :cond_e
    iget-boolean v4, v0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->isImperial:Z

    if-eqz v4, :cond_f

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Weight;->getMWeight()F

    move-result v4

    invoke-static {v4}, Lcom/android/mltcode/paycertificationapi/l76;->iO(F)F

    move-result v4

    goto :goto_4

    :cond_f
    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Weight;->getMWeight()F

    move-result v4

    :goto_4
    invoke-static {v4}, Lcom/android/mltcode/paycertificationapi/cp5;->OIX0iXi(F)F

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, v0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->bmiValue:Landroid/widget/TextView;

    if-nez v3, :cond_10

    const-string v3, "bmiValue"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v10

    :cond_10
    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Weight;->getMWeight()F

    move-result v1

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getHeight()F

    move-result v4

    invoke-static {v1, v4}, Lcom/android/mltcode/paycertificationapi/cp5;->I0IIOi(FF)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_5
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/Weight2Item;->weightUnit:Landroid/widget/TextView;

    if-nez v1, :cond_11

    const-string v1, "weightUnit"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_6

    :cond_11
    move-object v10, v1

    :goto_6
    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/cp5;->iX(I)I

    move-result v1

    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {v0, v5}, Lcom/sma/smartv3/ui/status/item/Weight2Item;->showChartData(Ljava/util/List;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d10a7

    return v0
.end method

.method public final onWeightChanged(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "weight_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onWeightChanged"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/Weight2Item;->initView()V

    return-void
.end method
