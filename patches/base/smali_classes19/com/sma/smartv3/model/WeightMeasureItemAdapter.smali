.class public final Lcom/sma/smartv3/model/WeightMeasureItemAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/sma/smartv3/model/WeightMeasureItemHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private final context:Landroid/content/Context;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final items:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/WeightMeasureItemData;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/content/Context;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/WeightMeasureItemData;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/model/WeightMeasureItemAdapter;->items:Ljava/util/List;

    iput-object p2, p0, Lcom/sma/smartv3/model/WeightMeasureItemAdapter;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final getContext()Landroid/content/Context;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemAdapter;->context:Landroid/content/Context;

    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemAdapter;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/sma/smartv3/model/WeightMeasureItemHolder;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/model/WeightMeasureItemAdapter;->onBindViewHolder(Lcom/sma/smartv3/model/WeightMeasureItemHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/sma/smartv3/model/WeightMeasureItemHolder;I)V
    .locals 17
    .param p1    # Lcom/sma/smartv3/model/WeightMeasureItemHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-object/from16 v0, p0

    const-string v1, "holder"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v1, v0, Lcom/sma/smartv3/model/WeightMeasureItemAdapter;->items:Ljava/util/List;

    move/from16 v3, p2

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/WeightMeasureItemData;

    .line 3
    invoke-virtual {v2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->getIvIcom()Landroid/widget/ImageView;

    move-result-object v4

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeightMeasureItemData;->getIcon()I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 4
    invoke-virtual {v2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->getTvName()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v4

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeightMeasureItemData;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    invoke-virtual {v2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->getTvValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v4

    const/16 v5, 0x8

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 6
    invoke-virtual {v2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->getTvLevel()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v4

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 7
    invoke-virtual {v2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->getSbv()Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    move-result-object v4

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 8
    invoke-virtual {v2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->getTvTips()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v4

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 9
    invoke-virtual {v2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->getIvSwitcher()Landroid/widget/ImageView;

    move-result-object v4

    const/4 v6, 0x0

    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 10
    invoke-virtual {v2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->getExpandableLayout()Lcom/sma/smartv3/view/ExpandableLayout;

    move-result-object v4

    const/4 v7, 0x1

    invoke-virtual {v4, v7}, Lcom/sma/smartv3/view/ExpandableLayout;->setExpandEnable(Z)V

    .line 11
    invoke-virtual {v2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v4

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 12
    invoke-virtual {v2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->getTvLevel()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v4

    .line 13
    iget-object v5, v0, Lcom/sma/smartv3/model/WeightMeasureItemAdapter;->context:Landroid/content/Context;

    const v8, 0x7f06074b

    .line 14
    invoke-static {v5, v8}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v5

    .line 15
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 16
    invoke-virtual {v2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->getTvLevel()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 17
    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeightMeasureItemData;->isShowValue()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 18
    invoke-virtual {v2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->getTvValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v4

    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 19
    invoke-virtual {v2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->getTvValue()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v4

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeightMeasureItemData;->getValue()D

    move-result-wide v8

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeightMeasureItemData;->getUnit()Ljava/lang/String;

    move-result-object v5

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    :cond_0
    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeightMeasureItemData;->isShowLevel()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 21
    invoke-virtual {v2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->getTvLevel()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v4

    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 22
    invoke-virtual {v2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->getTvLevel()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v4

    .line 23
    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeightMeasureItemData;->getLevel()I

    move-result v5

    sub-int/2addr v5, v7

    .line 24
    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeightMeasureItemData;->getLevelRangeText()[Ljava/lang/String;

    move-result-object v8

    .line 25
    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeightMeasureItemData;->getLevelColor()[I

    move-result-object v9

    .line 26
    invoke-static {v4, v5, v8, v9}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->setLevelView(Landroid/widget/TextView;I[Ljava/lang/String;[I)V

    .line 27
    :cond_1
    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeightMeasureItemData;->isShowBarView()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 28
    invoke-virtual {v2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->getSbv()Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    move-result-object v4

    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 29
    invoke-virtual {v2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->getSbv()Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    move-result-object v8

    .line 30
    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeightMeasureItemData;->getValue()D

    move-result-wide v9

    .line 31
    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeightMeasureItemData;->getLevelRange()Ljava/util/List;

    move-result-object v11

    .line 32
    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeightMeasureItemData;->getLevelRangeText()[Ljava/lang/String;

    move-result-object v12

    .line 33
    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeightMeasureItemData;->getLevelColor()[I

    move-result-object v13

    const/16 v15, 0x20

    const/16 v16, 0x0

    const/4 v14, 0x0

    .line 34
    invoke-static/range {v8 .. v16}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->setBarView$default(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;DLjava/util/List;[Ljava/lang/String;[IZILjava/lang/Object;)V

    .line 35
    :cond_2
    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeightMeasureItemData;->isShowTips()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 36
    invoke-virtual {v2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->getTvTips()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v4

    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 37
    invoke-virtual {v2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->getTvTips()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v4

    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeightMeasureItemData;->getTipText()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    :cond_3
    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeightMeasureItemData;->isShowGridView()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 39
    invoke-virtual {v2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v4

    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 40
    invoke-virtual {v2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v4

    .line 41
    new-instance v5, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    const/4 v9, 0x3

    invoke-direct {v5, v8, v9}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 42
    new-instance v5, Lcom/sma/smartv3/model/LevelItemAdapter;

    .line 43
    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeightMeasureItemData;->getLevel()I

    move-result v8

    sub-int/2addr v8, v7

    .line 44
    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeightMeasureItemData;->getLevelRangeText()[Ljava/lang/String;

    move-result-object v7

    .line 45
    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeightMeasureItemData;->getGridViewImgs()[I

    move-result-object v9

    .line 46
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    const-string v11, "getContext(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-direct {v5, v8, v7, v9, v10}, Lcom/sma/smartv3/model/LevelItemAdapter;-><init>(I[Ljava/lang/String;[ILandroid/content/Context;)V

    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 48
    :cond_4
    invoke-virtual {v1}, Lcom/sma/smartv3/model/WeightMeasureItemData;->isMore()Z

    move-result v1

    if-nez v1, :cond_5

    .line 49
    invoke-virtual {v2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->getExpandableLayout()Lcom/sma/smartv3/view/ExpandableLayout;

    move-result-object v1

    invoke-virtual {v1, v6}, Lcom/sma/smartv3/view/ExpandableLayout;->setExpandEnable(Z)V

    .line 50
    invoke-virtual {v2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->getIvSwitcher()Landroid/widget/ImageView;

    move-result-object v1

    const/4 v4, 0x4

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 51
    :cond_5
    invoke-virtual/range {p1 .. p2}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;->updateItem(I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/model/WeightMeasureItemAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/sma/smartv3/model/WeightMeasureItemHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/sma/smartv3/model/WeightMeasureItemHolder;
    .locals 3
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p2, Lcom/sma/smartv3/model/WeightMeasureItemHolder;

    .line 3
    iget-object v0, p0, Lcom/sma/smartv3/model/WeightMeasureItemAdapter;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d10b7

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string v0, "inflate(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p2, p1}, Lcom/sma/smartv3/model/WeightMeasureItemHolder;-><init>(Landroid/view/View;)V

    return-object p2
.end method
