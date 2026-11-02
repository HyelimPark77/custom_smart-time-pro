.class public final Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field private dataPanel:Landroid/view/View;

.field private emptyPanel:Landroid/view/View;

.field private final initEvent:Z

.field private final mBloodGlucose2Dao:Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;
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

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->bloodGlucose2Dao()Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->mBloodGlucose2Dao:Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->initEvent:Z

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 10
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

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->mContext:Landroid/content/Context;

    const v0, 0x7f0a0b7e

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->tempLastTime:Landroid/widget/TextView;

    const v0, 0x7f0a0b7f

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->tempLastValue:Landroid/widget/TextView;

    const v0, 0x7f0a0bbc

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->tmpUnit:Landroid/widget/TextView;

    const v0, 0x7f0a09df

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->sbvLevel:Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    const v0, 0x7f0a035c

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->emptyPanel:Landroid/view/View;

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->dataPanel:Landroid/view/View;

    new-instance p1, Lcom/android/mltcode/paycertificationapi/iz3;

    sget-object v0, Lcom/sma/smartv3/model/BloodGlucoseLevel;->START:Lcom/sma/smartv3/model/BloodGlucoseLevel;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/BloodGlucoseLevel;->getMValue()F

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v2, v3, v1}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v0

    sget-object v4, Lcom/sma/smartv3/model/BloodGlucoseLevel;->NORMAL:Lcom/sma/smartv3/model/BloodGlucoseLevel;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/BloodGlucoseLevel;->getMValue()F

    move-result v5

    invoke-static {v5, v2, v3, v1}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v5

    iget-object v6, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->mContext:Landroid/content/Context;

    const-string v7, "mContext"

    if-nez v6, :cond_1

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v6, v1

    :cond_1
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v8, 0x7f060062

    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-direct {p1, v0, v5, v6}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFI)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/BloodGlucoseLevel;->getMValue()F

    move-result v4

    invoke-static {v4, v2, v3, v1}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v4

    sget-object v5, Lcom/sma/smartv3/model/BloodGlucoseLevel;->PREDIABETES:Lcom/sma/smartv3/model/BloodGlucoseLevel;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/BloodGlucoseLevel;->getMValue()F

    move-result v6

    invoke-static {v6, v2, v3, v1}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v6

    iget-object v8, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->mContext:Landroid/content/Context;

    if-nez v8, :cond_2

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v8, v1

    :cond_2
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f060064

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v8

    invoke-direct {v0, v4, v6, v8}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFI)V

    new-instance v4, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/BloodGlucoseLevel;->getMValue()F

    move-result v5

    invoke-static {v5, v2, v3, v1}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v5

    sget-object v6, Lcom/sma/smartv3/model/BloodGlucoseLevel;->DIABETES:Lcom/sma/smartv3/model/BloodGlucoseLevel;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/BloodGlucoseLevel;->getMValue()F

    move-result v6

    invoke-static {v6, v2, v3, v1}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v6

    iget-object v8, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->mContext:Landroid/content/Context;

    if-nez v8, :cond_3

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v8, v1

    :cond_3
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f06005e

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v7

    invoke-direct {v4, v5, v6, v7}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFI)V

    filled-new-array {p1, v0, v4}, [Lcom/android/mltcode/paycertificationapi/iz3;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->sbvLevel:Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    const-string v4, "sbvLevel"

    if-nez v0, :cond_4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_4
    const/high16 v5, 0x40a00000    # 5.0f

    invoke-static {v5, v2, v3, v1}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setValue(Ljava/lang/Float;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->sbvLevel:Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    if-nez v0, :cond_5

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    move-object v1, v0

    :goto_0
    invoke-virtual {v1, p1}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setSegments(Ljava/util/List;)V

    return-void
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->initEvent:Z

    return v0
.end method

.method public initView()V
    .locals 8

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->mBloodGlucose2Dao:Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;

    invoke-interface {v0}, Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;->getListForDay()Ljava/util/List;

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->tempLastTime:Landroid/widget/TextView;

    if-nez v0, :cond_0

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v7

    :cond_0
    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->emptyPanel:Landroid/view/View;

    if-nez v0, :cond_1

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v7

    :cond_1
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->dataPanel:Landroid/view/View;

    if-nez v0, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v7, v0

    :goto_0
    invoke-virtual {v7, v2}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->emptyPanel:Landroid/view/View;

    if-nez v1, :cond_4

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v7

    :cond_4
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->dataPanel:Landroid/view/View;

    if-nez v1, :cond_5

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v7

    :cond_5
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/entity/BloodGlucose2;

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->tempLastTime:Landroid/widget/TextView;

    if-nez v1, :cond_6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v7

    :cond_6
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XXX11i()Ljava/text/SimpleDateFormat;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMTime()J

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->tempLastValue:Landroid/widget/TextView;

    if-nez v1, :cond_7

    const-string v1, "tempLastValue"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v7

    :cond_7
    sget-object v2, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMLowerBound()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMUpperBound()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    const-string v4, "%.1f-%.1f"

    invoke-static {v4, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "format(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->sbvLevel:Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    if-nez v1, :cond_8

    const-string v1, "sbvLevel"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v7

    :cond_8
    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMUpperBound()D

    move-result-wide v4

    double-to-float v0, v4

    const/4 v2, 0x0

    invoke-static {v0, v2, v3, v7}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setValue(Ljava/lang/Float;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d1097

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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/BloodGlucose2Item2;->initView()V

    return-void
.end method
