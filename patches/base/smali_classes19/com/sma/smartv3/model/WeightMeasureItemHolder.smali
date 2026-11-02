.class public final Lcom/sma/smartv3/model/WeightMeasureItemHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# instance fields
.field private final expandableLayout:Lcom/sma/smartv3/view/ExpandableLayout;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final ivIcom:Landroid/widget/ImageView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final ivSwitcher:Landroid/widget/ImageView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mExpandedPositionSet:Ljava/util/HashSet;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final recyclerView:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final sbv:Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvLevel:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvName:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvTips:Lcom/sma/smartv3/view/text/DINCondBold;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvValue:Lcom/sma/smartv3/view/text/PFMedium;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->mExpandedPositionSet:Ljava/util/HashSet;

    const v0, 0x7f0a03bc

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "findViewById(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/view/ExpandableLayout;

    iput-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->expandableLayout:Lcom/sma/smartv3/view/ExpandableLayout;

    const v0, 0x7f0a0638

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->ivIcom:Landroid/widget/ImageView;

    const v0, 0x7f0a0cc7

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    iput-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->tvName:Lcom/sma/smartv3/view/text/PFMedium;

    const v0, 0x7f0a18b0

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    iput-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->tvValue:Lcom/sma/smartv3/view/text/PFMedium;

    const v0, 0x7f0a0ca8

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    iput-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->tvLevel:Lcom/sma/smartv3/view/text/PFMedium;

    const v0, 0x7f0a09de

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    iput-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->sbv:Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    const v0, 0x7f0a1896

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    iput-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->tvTips:Lcom/sma/smartv3/view/text/DINCondBold;

    const v0, 0x7f0a0b51

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->ivSwitcher:Landroid/widget/ImageView;

    const v0, 0x7f0a0995

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/model/WeightMeasureItemHolder;IZ)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->updateItem$lambda$0(Lcom/sma/smartv3/model/WeightMeasureItemHolder;IZ)V

    return-void
.end method

.method private final addExpand(I)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->mExpandedPositionSet:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private final registerExpand(I)V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->mExpandedPositionSet:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->removeExpand(I)V

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->addExpand(I)V

    return-void
.end method

.method private final removeExpand(I)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->mExpandedPositionSet:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method private static final updateItem$lambda$0(Lcom/sma/smartv3/model/WeightMeasureItemHolder;IZ)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->registerExpand(I)V

    return-void
.end method


# virtual methods
.method public final getExpandableLayout()Lcom/sma/smartv3/view/ExpandableLayout;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->expandableLayout:Lcom/sma/smartv3/view/ExpandableLayout;

    return-object v0
.end method

.method public final getIvIcom()Landroid/widget/ImageView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->ivIcom:Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getIvSwitcher()Landroid/widget/ImageView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->ivSwitcher:Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getMExpandedPositionSet()Ljava/util/HashSet;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->mExpandedPositionSet:Ljava/util/HashSet;

    return-object v0
.end method

.method public final getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    return-object v0
.end method

.method public final getSbv()Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->sbv:Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    return-object v0
.end method

.method public final getTvLevel()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->tvLevel:Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getTvName()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->tvName:Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final getTvTips()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->tvTips:Lcom/sma/smartv3/view/text/DINCondBold;

    return-object v0
.end method

.method public final getTvValue()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->tvValue:Lcom/sma/smartv3/view/text/PFMedium;

    return-object v0
.end method

.method public final updateItem(I)V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->expandableLayout:Lcom/sma/smartv3/view/ExpandableLayout;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/c07;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/c07;-><init>(Lcom/sma/smartv3/model/WeightMeasureItemHolder;I)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/ExpandableLayout;->setOnExpandListener(Lcom/sma/smartv3/view/ExpandableLayout$iO;)V

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->expandableLayout:Lcom/sma/smartv3/view/ExpandableLayout;

    iget-object v1, p0, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->mExpandedPositionSet:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/ExpandableLayout;->setExpand(Z)V

    return-void
.end method
