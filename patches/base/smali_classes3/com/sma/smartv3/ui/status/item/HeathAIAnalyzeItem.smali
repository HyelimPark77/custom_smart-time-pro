.class public final Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# instance fields
.field private barView:Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private barViewTipLayout:Landroid/widget/LinearLayout;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final item:Lcom/sma/smartv3/model/TodayData;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mAiAnalysisResult:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mAiAnalysisTitle:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mBadIv:Landroidx/appcompat/widget/AppCompatImageView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mBadTv:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mCommonBtn:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mContext:Landroid/content/Context;

.field private mGoodIv:Landroidx/appcompat/widget/AppCompatImageView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mGoodTv:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mHighestIv:Landroidx/appcompat/widget/AppCompatImageView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mHighestTv:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mMediumIv:Landroidx/appcompat/widget/AppCompatImageView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mMediumTv:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mSbvBmi:Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mValueFront:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mValueState:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mValueTime:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mValueTitle:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mValueTv:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;-><init>(Lcom/sma/smartv3/model/TodayData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/sma/smartv3/model/TodayData;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/TodayData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->item:Lcom/sma/smartv3/model/TodayData;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/sma/smartv3/model/TodayData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    .line 3
    new-instance v1, Lcom/sma/smartv3/model/TodayData;

    const/16 v13, 0x3ff

    const/4 v14, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v1 .. v14}, Lcom/sma/smartv3/model/TodayData;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    invoke-direct {p0, v1}, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;-><init>(Lcom/sma/smartv3/model/TodayData;)V

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->initView$lambda$0(Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;Landroid/view/View;)V

    return-void
.end method

.method private final initBarView()V
    .locals 12

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

    iget-object v8, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mContext:Landroid/content/Context;

    const-string v9, "mContext"

    if-nez v8, :cond_0

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v8, v5

    :cond_0
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v10, 0x7f060063

    invoke-virtual {v8, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v8

    iget-object v10, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mContext:Landroid/content/Context;

    if-nez v10, :cond_1

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v10, v5

    :cond_1
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const v11, 0x7f060062

    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v10

    invoke-direct {v1, v2, v7, v8, v10}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFII)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-static {v6, v3, v4, v5}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v2

    const v6, 0x40dccccd    # 6.9f

    invoke-static {v6, v3, v4, v5}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v7

    iget-object v8, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mContext:Landroid/content/Context;

    if-nez v8, :cond_2

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v8, v5

    :cond_2
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v10, 0x7f060065

    invoke-virtual {v8, v10}, Landroid/content/res/Resources;->getColor(I)I

    move-result v8

    iget-object v10, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mContext:Landroid/content/Context;

    if-nez v10, :cond_3

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v10, v5

    :cond_3
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const v11, 0x7f060064

    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v10

    invoke-direct {v1, v2, v7, v8, v10}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFII)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iz3;

    invoke-static {v6, v3, v4, v5}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v2

    const v6, 0x4101999a    # 8.1f

    invoke-static {v6, v3, v4, v5}, Lcom/sma/smartv3/model/BloodGlucose2DataKt;->getBloodGlucoseBarValue$default(FFILjava/lang/Object;)F

    move-result v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mContext:Landroid/content/Context;

    if-nez v4, :cond_4

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v5

    :cond_4
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f06005f

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    iget-object v6, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mContext:Landroid/content/Context;

    if-nez v6, :cond_5

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    move-object v5, v6

    :goto_0
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f06005e

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/android/mltcode/paycertificationapi/iz3;-><init>(FFII)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->barView:Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;

    if-eqz v1, :cond_6

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;->setSegments(Ljava/util/List;)V

    :cond_6
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->barView:Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;

    const/4 v1, 0x1

    if-eqz v0, :cond_7

    invoke-static {v0, v1}, Lcom/angcyo/dsladapter/LibExKt;->I0XXi0X(Landroid/view/View;Z)V

    :cond_7
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->barViewTipLayout:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_8

    invoke-static {v0, v1}, Lcom/angcyo/dsladapter/LibExKt;->I0XXi0X(Landroid/view/View;Z)V

    :cond_8
    return-void
.end method

.method private static final initView$lambda$0(Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mContext:Landroid/content/Context;

    const/4 v0, 0x0

    const-string v1, "mContext"

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    new-instance v2, Landroid/content/Intent;

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mContext:Landroid/content/Context;

    if-nez p0, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v0, p0

    :goto_0
    const-class p0, Lcom/sma/smartv3/ui/main/MainActivity;

    invoke-direct {v2, v0, p0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private final setBmi(DLjava/util/List;[Ljava/lang/String;[I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;[",
            "Ljava/lang/String;",
            "[I)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mSbvBmi:Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v8}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->setBarView$default(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;DLjava/util/List;[Ljava/lang/String;[IZILjava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mSbvBmi:Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    if-eqz p1, :cond_0

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/angcyo/dsladapter/LibExKt;->I0XXi0X(Landroid/view/View;Z)V

    :cond_0
    return-void
.end method

.method public static synthetic setViewHidden$default(Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;IZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, -0x1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->setViewHidden(IZ)V

    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 4
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

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mContext:Landroid/content/Context;

    const v0, 0x7f0a0c8c

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.widget.TextView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mValueTitle:Landroid/widget/TextView;

    const v0, 0x7f0a0c98

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mValueState:Landroid/widget/TextView;

    const v0, 0x7f0a0c8e

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mValueTime:Landroid/widget/TextView;

    const v0, 0x7f0a0c37

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mValueFront:Landroid/widget/TextView;

    const v0, 0x7f0a09e0

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mSbvBmi:Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    const/16 v2, 0x8

    if-eqz v0, :cond_0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    const v0, 0x7f0a0109

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    const-string v3, "null cannot be cast to non-null type com.sma.smartv3.view.segmentedbar.SegmentedBarView2"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->barView:Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView2;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    const v0, 0x7f0a06d3

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    const-string v3, "null cannot be cast to non-null type android.widget.LinearLayout"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->barViewTipLayout:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    const v0, 0x7f0a0615

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/appcompat/widget/AppCompatImageView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mBadIv:Landroidx/appcompat/widget/AppCompatImageView;

    const v0, 0x7f0a0c3e

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mBadTv:Landroid/widget/TextView;

    const v0, 0x7f0a0630

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/appcompat/widget/AppCompatImageView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mMediumIv:Landroidx/appcompat/widget/AppCompatImageView;

    const v0, 0x7f0a0c87

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mMediumTv:Landroid/widget/TextView;

    const v0, 0x7f0a0633

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/appcompat/widget/AppCompatImageView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mGoodIv:Landroidx/appcompat/widget/AppCompatImageView;

    const v0, 0x7f0a0c89

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mGoodTv:Landroid/widget/TextView;

    const v0, 0x7f0a0636

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/appcompat/widget/AppCompatImageView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mHighestIv:Landroidx/appcompat/widget/AppCompatImageView;

    const v0, 0x7f0a0c94

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mHighestTv:Landroid/widget/TextView;

    const/4 v0, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p0, v3, v3, v0, v2}, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->setViewHidden$default(Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;IZILjava/lang/Object;)V

    const v0, 0x7f0a0c25

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mAiAnalysisTitle:Landroid/widget/TextView;

    const v0, 0x7f0a0c26

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mAiAnalysisResult:Landroid/widget/TextView;

    const v0, 0x7f0a0c38

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mValueTv:Landroid/widget/TextView;

    const v0, 0x7f0a0c88

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mCommonBtn:Landroid/widget/TextView;

    return-void
.end method

.method public final getItem()Lcom/sma/smartv3/model/TodayData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->item:Lcom/sma/smartv3/model/TodayData;

    return-object v0
.end method

.method public initView()V
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mCommonBtn:Landroid/widget/TextView;

    if-eqz v1, :cond_0

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->item:Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/TodayData;->getDataType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v6, 0x2

    const v3, 0x7f140e19

    const v7, 0x7f0600b4

    const v4, -0xffff01

    const-wide/high16 v9, 0x4059000000000000L    # 100.0

    const v11, -0xff0100

    const-wide/16 v12, 0x0

    const-string v5, "mContext"

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/high16 v16, -0x10000

    const/4 v8, 0x0

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v2, "heart_rate"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_0

    :cond_1
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mContext:Landroid/content/Context;

    if-nez v1, :cond_2

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v1, v8

    :cond_2
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getColor(I)I

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->item:Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/TodayData;->getValue1()F

    move-result v1

    float-to-double v1, v1

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    const-wide/high16 v12, 0x404e000000000000L    # 60.0

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    const-wide v17, 0x4066800000000000L    # 180.0

    invoke-static/range {v17 .. v18}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    filled-new-array {v5, v12, v9, v10}, [Ljava/lang/Double;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    const v9, 0x7f140e1a

    invoke-static {v9}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v9

    const v10, 0x7f140e18

    invoke-static {v10}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v10

    filled-new-array {v3, v9, v10}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v4, v9, v10}, [Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/ArraysKt___ArraysKt;->iiIX1([Ljava/lang/Integer;)[I

    move-result-object v4

    move-object/from16 v19, v4

    move-object v4, v3

    move-object v3, v5

    move-object/from16 v5, v19

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->setBmi(DLjava/util/List;[Ljava/lang/String;[I)V

    goto/16 :goto_1

    :sswitch_1
    const-string v2, "blood_glucose2"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto/16 :goto_0

    :cond_3
    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->initBarView()V

    goto/16 :goto_1

    :sswitch_2
    const-string v2, "blood_pressure"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto/16 :goto_0

    :cond_4
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->item:Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/TodayData;->getStateColor()I

    move-result v1

    invoke-static {v0, v1, v14, v6, v8}, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->setViewHidden$default(Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;IZILjava/lang/Object;)V

    goto/16 :goto_1

    :sswitch_3
    const-string v2, "sleep"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto/16 :goto_0

    :cond_5
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->item:Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/TodayData;->getStateColor()I

    move-result v1

    invoke-virtual {v0, v1, v15}, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->setViewHidden(IZ)V

    goto/16 :goto_1

    :sswitch_4
    const-string v2, "blood_oxygen"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto/16 :goto_0

    :cond_6
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->item:Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/TodayData;->getValue1()F

    move-result v1

    float-to-double v1, v1

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    const-wide/high16 v12, 0x4057000000000000L    # 92.0

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    filled-new-array {v5, v12, v9}, [Ljava/lang/Double;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    const v9, 0x7f1401ce

    invoke-static {v9}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v9

    filled-new-array {v3, v9}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    filled-new-array {v4, v9}, [Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/ArraysKt___ArraysKt;->iiIX1([Ljava/lang/Integer;)[I

    move-result-object v4

    move-object/from16 v19, v4

    move-object v4, v3

    move-object v3, v5

    move-object/from16 v5, v19

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->setBmi(DLjava/util/List;[Ljava/lang/String;[I)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mSbvBmi:Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    if-eqz v1, :cond_e

    invoke-virtual {v1, v14}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setSegmentSideRule(I)V

    goto/16 :goto_1

    :sswitch_5
    const-string v2, "weight"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto/16 :goto_0

    :cond_7
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->item:Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/TodayData;->getValue1()F

    move-result v1

    float-to-double v1, v1

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const-wide v9, 0x4032666666666666L    # 18.4

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    const-wide v12, 0x4038e66666666666L    # 24.9

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    const-wide v12, 0x403de66666666666L    # 29.9

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    filled-new-array {v3, v9, v10, v12}, [Ljava/lang/Double;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const v9, 0x7f141335

    invoke-static {v9}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v9

    const v10, 0x7f141021

    invoke-static {v10}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v10

    const v12, 0x7f141356

    invoke-static {v12}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v12

    const v13, 0x7f1402c9

    invoke-static {v13}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v13

    filled-new-array {v9, v10, v12, v13}, [Ljava/lang/String;

    move-result-object v9

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    iget-object v12, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mContext:Landroid/content/Context;

    if-nez v12, :cond_8

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v12, v8

    :cond_8
    invoke-virtual {v12}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v12, 0x7f060064

    invoke-virtual {v5, v12}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    filled-new-array {v4, v10, v5, v12}, [Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/ArraysKt___ArraysKt;->iiIX1([Ljava/lang/Integer;)[I

    move-result-object v5

    move-object v4, v9

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->setBmi(DLjava/util/List;[Ljava/lang/String;[I)V

    goto/16 :goto_1

    :sswitch_6
    const-string v2, "pressure"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    :goto_0
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mCommonBtn:Landroid/widget/TextView;

    if-eqz v1, :cond_9

    invoke-virtual {v1, v14}, Landroid/view/View;->setVisibility(I)V

    :cond_9
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mCommonBtn:Landroid/widget/TextView;

    if-eqz v1, :cond_a

    const v2, 0x7f140c5c

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_a
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mCommonBtn:Landroid/widget/TextView;

    if-eqz v1, :cond_e

    new-instance v2, Lcom/android/mltcode/paycertificationapi/XO00iX1i;

    invoke-direct {v2, v0}, Lcom/android/mltcode/paycertificationapi/XO00iX1i;-><init>(Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_b
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->item:Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/TodayData;->getValue1()F

    move-result v1

    float-to-double v1, v1

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const-wide/high16 v12, 0x4039000000000000L    # 25.0

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    const-wide/high16 v12, 0x4049000000000000L    # 50.0

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    const-wide v17, 0x4052c00000000000L    # 75.0

    invoke-static/range {v17 .. v18}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v13

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    filled-new-array {v3, v4, v12, v13, v9}, [Ljava/lang/Double;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    iget-object v4, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mContext:Landroid/content/Context;

    if-nez v4, :cond_c

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v4, v8

    :cond_c
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v9, 0x7f03002f

    invoke-virtual {v4, v9}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v4

    const-string v9, "getStringArray(...)"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mContext:Landroid/content/Context;

    if-nez v9, :cond_d

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v9, v8

    :cond_d
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v9, 0x7f030027

    invoke-virtual {v5, v9}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v5

    const-string v9, "getIntArray(...)"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->setBmi(DLjava/util/List;[Ljava/lang/String;[I)V

    :cond_e
    :goto_1
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->item:Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/TodayData;->getMExtraInfo()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_f

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mAiAnalysisTitle:Landroid/widget/TextView;

    invoke-static {v1, v15}, Lcom/angcyo/dsladapter/LibExKt;->I0XXi0X(Landroid/view/View;Z)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mAiAnalysisResult:Landroid/widget/TextView;

    invoke-static {v1, v15}, Lcom/angcyo/dsladapter/LibExKt;->I0XXi0X(Landroid/view/View;Z)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mAiAnalysisResult:Landroid/widget/TextView;

    if-eqz v1, :cond_10

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->item:Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/TodayData;->getMExtraInfo()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_f
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mAiAnalysisTitle:Landroid/widget/TextView;

    invoke-static {v1, v15}, Lcom/angcyo/dsladapter/LibExKt;->XX1Oi(Landroid/view/View;Z)V

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mAiAnalysisResult:Landroid/widget/TextView;

    invoke-static {v1, v15}, Lcom/angcyo/dsladapter/LibExKt;->XX1Oi(Landroid/view/View;Z)V

    :cond_10
    :goto_2
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mValueTv:Landroid/widget/TextView;

    if-eqz v1, :cond_11

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->item:Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/TodayData;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_11
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mValueFront:Landroid/widget/TextView;

    const-string v2, ": "

    if-eqz v1, :cond_12

    const v3, 0x7f140192

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_12
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mValueState:Landroid/widget/TextView;

    if-eqz v1, :cond_13

    iget-object v3, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->item:Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/TodayData;->getState()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_13
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->item:Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/TodayData;->getTime()J

    move-result-wide v3

    const-wide/16 v9, 0x0

    cmp-long v1, v3, v9

    if-eqz v1, :cond_14

    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mValueTime:Landroid/widget/TextView;

    if-eqz v1, :cond_14

    const/4 v3, 0x3

    invoke-static {v14, v14, v3, v8}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->i0X000X0O(ZZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v3

    iget-object v4, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->item:Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/TodayData;->getTime()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_14
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mValueTitle:Landroid/widget/TextView;

    if-eqz v1, :cond_15

    iget-object v3, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->item:Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/TodayData;->getTitle()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_15
    iget-object v1, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mValueState:Landroid/widget/TextView;

    if-eqz v1, :cond_19

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->item:Lcom/sma/smartv3/model/TodayData;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/TodayData;->getStateColor()I

    move-result v2

    if-eqz v2, :cond_18

    if-eq v2, v15, :cond_17

    if-eq v2, v6, :cond_16

    move/from16 v8, v16

    goto :goto_3

    :cond_16
    move v8, v11

    goto :goto_3

    :cond_17
    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mValueState:Landroid/widget/TextView;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v8

    goto :goto_3

    :cond_18
    const-string v2, "#FE6D00"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    :goto_3
    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_19
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x4c11e9bb -> :sswitch_6
        -0x2f2ebd88 -> :sswitch_5
        -0xe5c147b -> :sswitch_4
        0x6872ed7 -> :sswitch_3
        0x21619aea -> :sswitch_2
        0x577bdaa9 -> :sswitch_1
        0x73105139 -> :sswitch_0
    .end sparse-switch
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d109d

    return v0
.end method

.method public final setViewHidden(IZ)V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mBadIv:Landroidx/appcompat/widget/AppCompatImageView;

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mMediumIv:Landroidx/appcompat/widget/AppCompatImageView;

    if-eqz v0, :cond_3

    const/4 v3, 0x1

    if-ne p1, v3, :cond_2

    move v3, v2

    goto :goto_1

    :cond_2
    move v3, v1

    :goto_1
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mGoodIv:Landroidx/appcompat/widget/AppCompatImageView;

    if-eqz v0, :cond_5

    const/4 v3, 0x2

    if-ne p1, v3, :cond_4

    move v3, v2

    goto :goto_2

    :cond_4
    move v3, v1

    :goto_2
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_5
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mHighestIv:Landroidx/appcompat/widget/AppCompatImageView;

    if-eqz v0, :cond_7

    const/4 v3, 0x3

    if-ne p1, v3, :cond_6

    move v3, v2

    goto :goto_3

    :cond_6
    move v3, v1

    :goto_3
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_7
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mBadTv:Landroid/widget/TextView;

    const/4 v3, -0x1

    if-eqz v0, :cond_9

    if-le p1, v3, :cond_8

    move v4, v2

    goto :goto_4

    :cond_8
    move v4, v1

    :goto_4
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    :cond_9
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mMediumTv:Landroid/widget/TextView;

    if-eqz v0, :cond_b

    if-le p1, v3, :cond_a

    move v4, v2

    goto :goto_5

    :cond_a
    move v4, v1

    :goto_5
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    :cond_b
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mGoodTv:Landroid/widget/TextView;

    if-eqz v0, :cond_d

    if-le p1, v3, :cond_c

    move v4, v2

    goto :goto_6

    :cond_c
    move v4, v1

    :goto_6
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    :cond_d
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/HeathAIAnalyzeItem;->mHighestTv:Landroid/widget/TextView;

    if-eqz v0, :cond_f

    if-eqz p2, :cond_e

    if-le p1, v3, :cond_e

    move v1, v2

    :cond_e
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_f
    return-void
.end method
