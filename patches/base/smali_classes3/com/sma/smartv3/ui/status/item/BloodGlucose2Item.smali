.class public final Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field private dataPanel:Landroid/view/View;

.field private emptyPanel:Landroid/view/View;

.field private final initEvent:Z

.field private final mBloodGlucoseDao:Lcom/sma/smartv3/db/dao/BloodGlucoseDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mContext:Landroid/content/Context;

.field private sbvLevel:Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

.field private tempLastTime:Landroid/widget/TextView;

.field private tempLastValue:Landroid/widget/TextView;

.field private tmpUnit:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->bloodGlucoseDao()Lcom/sma/smartv3/db/dao/BloodGlucoseDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->mBloodGlucoseDao:Lcom/sma/smartv3/db/dao/BloodGlucoseDao;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->initEvent:Z

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 7
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslViewHolder;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "<get-context>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->mContext:Landroid/content/Context;

    const v0, 0x7f0a0b7e

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->tempLastTime:Landroid/widget/TextView;

    const v0, 0x7f0a0b7f

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->tempLastValue:Landroid/widget/TextView;

    const v0, 0x7f0a0bbc

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->tmpUnit:Landroid/widget/TextView;

    const v0, 0x7f0a09df

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->sbvLevel:Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    const v0, 0x7f0a035c

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->emptyPanel:Landroid/view/View;

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->dataPanel:Landroid/view/View;

    new-instance p1, Lcom/android/mltcode/paycertificationapi/iz3;

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->mContext:Landroid/content/Context;

    const-string v2, "mContext"

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x7f060061

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    const/4 v3, 0x0

    const/high16 v4, 0x41f00000    # 30.0f

    const-string v5, ""

    invoke-direct {p1, v3, v4, v5, v0}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFLjava/lang/String;I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iz3;

    iget-object v3, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->mContext:Landroid/content/Context;

    if-nez v3, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v3, v1

    :cond_2
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v6, 0x7f060066

    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    const/high16 v6, 0x428c0000    # 70.0f

    invoke-direct {v0, v4, v6, v5, v3}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFLjava/lang/String;I)V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/iz3;

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->mContext:Landroid/content/Context;

    if-nez v4, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v1

    :cond_3
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f060060

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    const/high16 v4, 0x42c80000    # 100.0f

    invoke-direct {v3, v6, v4, v5, v2}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFLjava/lang/String;I)V

    filled-new-array {p1, v0, v3}, [Lcom/android/mltcode/paycertificationapi/iz3;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->sbvLevel:Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    const-string v2, "sbvLevel"

    if-nez v0, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_4
    const/high16 v3, 0x42200000    # 40.0f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setValue(Ljava/lang/Float;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->sbvLevel:Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    if-nez v0, :cond_5

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    move-object v1, v0

    :goto_0
    invoke-virtual {v1, p1}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setSegments(Ljava/util/List;)V

    return-void
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->initEvent:Z

    return v0
.end method

.method public initView()V
    .locals 8

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->mBloodGlucoseDao:Lcom/sma/smartv3/db/dao/BloodGlucoseDao;

    invoke-interface {v0}, Lcom/sma/smartv3/db/dao/BloodGlucoseDao;->getLastData()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/16 v2, 0x8

    const-string v3, "dataPanel"

    const/4 v4, 0x0

    const-string v5, "emptyPanel"

    const-string v6, "tempLastTime"

    const/4 v7, 0x0

    if-eqz v1, :cond_3

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->tempLastTime:Landroid/widget/TextView;

    if-nez v0, :cond_0

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v7

    :cond_0
    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->emptyPanel:Landroid/view/View;

    if-nez v0, :cond_1

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v7

    :cond_1
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->dataPanel:Landroid/view/View;

    if-nez v0, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v7, v0

    :goto_0
    invoke-virtual {v7, v2}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->emptyPanel:Landroid/view/View;

    if-nez v1, :cond_4

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v7

    :cond_4
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->dataPanel:Landroid/view/View;

    if-nez v1, :cond_5

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v7

    :cond_5
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/BloodGlucose;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/BloodGlucose;->getMValue()I

    move-result v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->tempLastTime:Landroid/widget/TextView;

    if-nez v2, :cond_6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v2, v7

    :cond_6
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XXX11i()Ljava/text/SimpleDateFormat;

    move-result-object v3

    new-instance v4, Ljava/util/Date;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/entity/BloodGlucose;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodGlucose;->getMTime()J

    move-result-wide v5

    invoke-direct {v4, v5, v6}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->tempLastValue:Landroid/widget/TextView;

    if-nez v0, :cond_7

    const-string v0, "tempLastValue"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v7

    :cond_7
    sget-object v2, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    int-to-float v1, v1

    const/high16 v2, 0x41200000    # 10.0f

    div-float v2, v1, v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    const-string v3, "%.1f"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "format(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->sbvLevel:Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    if-nez v0, :cond_8

    const-string v0, "sbvLevel"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_1

    :cond_8
    move-object v7, v0

    :goto_1
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setValue(Ljava/lang/Float;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d1096

    return v0
.end method

.method public final onBloodGlucoseChanged(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "bloodglucose_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onBloodGlucoseChanged"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item;->initView()V

    return-void
.end method
