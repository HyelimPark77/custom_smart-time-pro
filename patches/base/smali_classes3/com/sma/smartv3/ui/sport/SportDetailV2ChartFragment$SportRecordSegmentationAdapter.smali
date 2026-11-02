.class public final Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SportRecordSegmentationAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private final context:Landroid/content/Context;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final items:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$iO;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Landroid/content/Context;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
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
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$iO;",
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

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationAdapter;->items:Ljava/util/ArrayList;

    iput-object p2, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationAdapter;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final getContext()Landroid/content/Context;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationAdapter;->context:Landroid/content/Context;

    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationAdapter;->items:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationAdapter;->onBindViewHolder(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationViewHolder;I)V
    .locals 2
    .param p1    # Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationAdapter;->items:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "get(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$iO;

    .line 3
    invoke-virtual {p2}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$iO;->iO()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$iO;->XIi00iiXO()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationViewHolder;->getNumber()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$iO;->XO0O10()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationViewHolder;->getDuration()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$iO;->iO()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationViewHolder;->getDistance()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$iO;->XIi00iiXO()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationViewHolder;->getAvgPace()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p1

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$iO;->OXO1()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationViewHolder;
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
    new-instance p2, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationViewHolder;

    .line 3
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationAdapter;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0f26

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string v0, "inflate(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p2, p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordSegmentationViewHolder;-><init>(Landroid/view/View;)V

    return-object p2
.end method
