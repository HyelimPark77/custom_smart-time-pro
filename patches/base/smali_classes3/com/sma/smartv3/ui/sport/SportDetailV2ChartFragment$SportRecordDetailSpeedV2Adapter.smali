.class public final Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2Adapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SportRecordDetailSpeedV2Adapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2ViewHolder;",
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
            "Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$XIi00iiXO;",
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
            "Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$XIi00iiXO;",
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

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2Adapter;->items:Ljava/util/ArrayList;

    iput-object p2, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2Adapter;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final getContext()Landroid/content/Context;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2Adapter;->context:Landroid/content/Context;

    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2Adapter;->items:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2Adapter;->onBindViewHolder(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2ViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2ViewHolder;I)V
    .locals 6
    .param p1    # Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2ViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2Adapter;->items:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$XIi00iiXO;

    .line 3
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2ViewHolder;->getNumber()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$XIi00iiXO;->OXO1()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2ViewHolder;->getTvPace()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$XIi00iiXO;->iO()F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    const/16 v3, 0x8

    const/4 v4, 0x0

    if-lez v2, :cond_0

    .line 5
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2ViewHolder;->getPb()Lcom/sma/smartv3/view/PaceProgressBarV2;

    move-result-object v2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$XIi00iiXO;->iO()F

    move-result v5

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$XIi00iiXO;->XO0O10()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v5, v0, p2}, Lcom/sma/smartv3/view/PaceProgressBarV2;->iO(FLjava/lang/String;I)V

    .line 6
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2ViewHolder;->getNumber()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p1

    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2ViewHolder;->getTvPace()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p2

    sget-object v2, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment;->Companion:Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$OXO1;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$OXO1;->OXO1()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$XIi00iiXO;->XO0O10()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "  "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2ViewHolder;->getNumber()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    move v3, v4

    .line 9
    :goto_0
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2Adapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2ViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2ViewHolder;
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
    new-instance p2, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2ViewHolder;

    .line 3
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2Adapter;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0f25

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string v0, "inflate(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p2, p1}, Lcom/sma/smartv3/ui/sport/SportDetailV2ChartFragment$SportRecordDetailSpeedV2ViewHolder;-><init>(Landroid/view/View;)V

    return-object p2
.end method
