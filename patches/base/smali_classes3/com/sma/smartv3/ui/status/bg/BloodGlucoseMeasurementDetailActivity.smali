.class public final Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private final barView$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mBloodGlucoseList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/BloodGlucose2;",
            ">;"
        }
    .end annotation
.end field

.field private final tvMeasureDate$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XiiIX0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XiiIX0;-><init>(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;->barView$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iOIXXO0I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iOIXXO0I;-><init>(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;->tvMeasureDate$delegate:Lkotlin/Lazy;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;->mBloodGlucoseList:Ljava/util/List;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;->tvMeasureDate_delegate$lambda$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;)Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;->barView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;)Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;

    move-result-object p0

    return-object p0
.end method

.method private static final barView_delegate$lambda$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;)Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;
    .locals 1

    const v0, 0x7f0a0109

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;

    return-object p0
.end method

.method private final getBarView()Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;->barView$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;

    return-object v0
.end method

.method private final getTvMeasureDate()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;->tvMeasureDate$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getValueText(F)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p1, "<br><small>mmol/L</small>"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final initBarView()V
    .locals 11

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iz3;

    const v2, 0x4059999a    # 3.4f

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v2

    const v6, 0x40c33333    # 6.1f

    invoke-static {v6, v3, v4, v5}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v7

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f060063

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v8

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v10, 0x7f060062

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    invoke-direct {v1, v2, v7, v8, v9}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFII)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-static {v6, v3, v4, v5}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v2

    const v6, 0x40dccccd    # 6.9f

    invoke-static {v6, v3, v4, v5}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v7

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f060065

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v8

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v10, 0x7f060064

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    invoke-direct {v1, v2, v7, v8, v9}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFII)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-static {v6, v3, v4, v5}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v2

    const v6, 0x4101999a    # 8.1f

    invoke-static {v6, v3, v4, v5}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v3

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f06005f

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f06005e

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFII)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;->getBarView()Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->setSegments(Ljava/util/List;)V

    return-void
.end method

.method private final setBarValue(FF)V
    .locals 5

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;->getBarView()Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v1, v2, v3}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v4

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;->getValueText(F)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v4, p1}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->X1ii(FLjava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;->getBarView()Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;

    move-result-object p1

    invoke-static {p2, v1, v2, v3}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v0

    invoke-direct {p0, p2}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;->getValueText(F)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->O10IXXX0X(FLjava/lang/String;)V

    return-void
.end method

.method private static final tvMeasureDate_delegate$lambda$0(Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cba

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 2

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f14021a

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;->initBarView()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;->showData(Ljava/lang/Object;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0039

    return v0
.end method

.method public final onHelp(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/i72;->XO1(Landroid/app/Activity;)V

    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final showData(Ljava/lang/Object;)V
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "bloodglucose_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;->mBloodGlucoseList:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;->mBloodGlucoseList:Ljava/util/List;

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->bloodGlucose2Dao()Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;

    move-result-object v0

    invoke-interface {v0}, Lcom/sma/smartv3/db/dao/BloodGlucose2Dao;->getList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;->mBloodGlucoseList:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;->mBloodGlucoseList:Ljava/util/List;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/db/entity/BloodGlucose2;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMLowerBound()D

    move-result-wide v0

    double-to-float v0, v0

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMUpperBound()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-direct {p0, v0, v1}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;->setBarValue(FF)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/bg/BloodGlucoseMeasurementDetailActivity;->getTvMeasureDate()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v3, v3, v1, v2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->i0X000X0O(ZZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v1

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/BloodGlucose2;->getMTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method
