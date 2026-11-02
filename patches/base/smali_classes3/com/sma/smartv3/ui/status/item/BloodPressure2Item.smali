.class public final Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field private dataPanel:Landroid/view/View;

.field private emptyPanel:Landroid/view/View;

.field private final initEvent:Z

.field private final mBloodPressureDao:Lcom/sma/smartv3/db/dao/BloodPressureDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mContext:Landroid/content/Context;

.field private range:[J

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

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->bloodPressureDao()Lcom/sma/smartv3/db/dao/BloodPressureDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->mBloodPressureDao:Lcom/sma/smartv3/db/dao/BloodPressureDao;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->initEvent:Z

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 6
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

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->mContext:Landroid/content/Context;

    const v0, 0x7f0a0b7e

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->tempLastTime:Landroid/widget/TextView;

    const v0, 0x7f0a0b7f

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->tempLastValue:Landroid/widget/TextView;

    const v0, 0x7f0a0bbc

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->tmpUnit:Landroid/widget/TextView;

    const v0, 0x7f0a09df

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->sbvLevel:Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    const v0, 0x7f0a035c

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->emptyPanel:Landroid/view/View;

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->dataPanel:Landroid/view/View;

    new-instance p1, Lcom/android/mltcode/paycertificationapi/iz3;

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->mContext:Landroid/content/Context;

    const-string v2, "mContext"

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x7f060089

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    const-string v3, ""

    invoke-direct {p1, v3, v3, v0}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iz3;

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->mContext:Landroid/content/Context;

    if-nez v4, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v1

    :cond_2
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f06008b

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-direct {v0, v3, v3, v4}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    new-instance v4, Lcom/android/mltcode/paycertificationapi/iz3;

    iget-object v5, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->mContext:Landroid/content/Context;

    if-nez v5, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v5, v1

    :cond_3
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v5, 0x7f060088

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-direct {v4, v3, v3, v2}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    filled-new-array {p1, v0, v4}, [Lcom/android/mltcode/paycertificationapi/iz3;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->sbvLevel:Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    const-string v2, "sbvLevel"

    if-nez v0, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v1

    :cond_4
    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setValueSegment(Ljava/lang/Integer;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->sbvLevel:Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

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

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->initEvent:Z

    return v0
.end method

.method public initView()V
    .locals 11

    sget-object v0, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    const/4 v1, 0x5

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v2, v0, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iOOX010X(Ljava/util/Calendar;Lcom/sma/smartv3/util/TimePeriod;IILjava/lang/Object;)[J

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->range:[J

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->mBloodPressureDao:Lcom/sma/smartv3/db/dao/BloodPressureDao;

    const-string v4, "range"

    if-nez v0, :cond_0

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    aget-wide v5, v0, v3

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->range:[J

    if-nez v0, :cond_1

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_1
    const/4 v4, 0x1

    aget-wide v7, v0, v4

    invoke-interface {v1, v5, v6, v7, v8}, Lcom/sma/smartv3/db/dao/BloodPressureDao;->getBloodPressures(JJ)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const-string v5, "dataPanel"

    const-string v6, "emptyPanel"

    const-string v7, "tmpUnit"

    const-string v8, "tempLastTime"

    const/16 v9, 0x8

    const-string v10, "tempLastValue"

    if-eqz v1, :cond_7

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->tempLastTime:Landroid/widget/TextView;

    if-nez v0, :cond_2

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_2
    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->tmpUnit:Landroid/widget/TextView;

    if-nez v0, :cond_3

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->tempLastValue:Landroid/widget/TextView;

    if-nez v0, :cond_4

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_4
    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->emptyPanel:Landroid/view/View;

    if-nez v0, :cond_5

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_5
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->dataPanel:Landroid/view/View;

    if-nez v0, :cond_6

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_6
    move-object v2, v0

    :goto_0
    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_7
    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->emptyPanel:Landroid/view/View;

    if-nez v1, :cond_8

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_8
    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->dataPanel:Landroid/view/View;

    if-nez v1, :cond_9

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_9
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->tempLastValue:Landroid/widget/TextView;

    if-nez v1, :cond_a

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_a
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->tmpUnit:Landroid/widget/TextView;

    if-nez v1, :cond_b

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v2

    :cond_b
    const v5, 0x7f140f62

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(I)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/BloodPressure;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sma/smartv3/db/entity/BloodPressure;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v5

    const/16 v6, 0x8c

    const/16 v7, 0x5a

    if-lt v5, v6, :cond_c

    if-lt v1, v7, :cond_c

    const/4 v3, 0x2

    goto :goto_1

    :cond_c
    if-gt v7, v5, :cond_d

    if-ge v5, v6, :cond_d

    const/16 v6, 0x3c

    if-gt v6, v1, :cond_d

    if-ge v1, v7, :cond_d

    move v3, v4

    :cond_d
    :goto_1
    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->tempLastTime:Landroid/widget/TextView;

    if-nez v4, :cond_e

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v2

    :cond_e
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XXX11i()Ljava/text/SimpleDateFormat;

    move-result-object v6

    new-instance v7, Ljava/util/Date;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/entity/BloodPressure;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMTime()J

    move-result-wide v8

    invoke-direct {v7, v8, v9}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v6, v7}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->tempLastValue:Landroid/widget/TextView;

    if-nez v0, :cond_f

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v2

    :cond_f
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->sbvLevel:Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;

    if-nez v0, :cond_10

    const-string v0, "sbvLevel"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_10
    move-object v2, v0

    :goto_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setValueSegment(Ljava/lang/Integer;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d1099

    return v0
.end method

.method public final onBloodPressureChanged(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "blood_pressure_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onBloodPressureChanged"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/BloodPressure2Item;->initView()V

    return-void
.end method
