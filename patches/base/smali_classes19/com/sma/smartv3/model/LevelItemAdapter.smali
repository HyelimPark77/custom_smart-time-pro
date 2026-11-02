.class public final Lcom/sma/smartv3/model/LevelItemAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/sma/smartv3/model/LevelItemViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private final context:Landroid/content/Context;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final gridViewImgs:[I
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final level:I

.field private final levelRangeText:[Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(I[Ljava/lang/String;[ILandroid/content/Context;)V
    .locals 1
    .param p2    # [Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "levelRangeText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gridViewImgs"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput p1, p0, Lcom/sma/smartv3/model/LevelItemAdapter;->level:I

    iput-object p2, p0, Lcom/sma/smartv3/model/LevelItemAdapter;->levelRangeText:[Ljava/lang/String;

    iput-object p3, p0, Lcom/sma/smartv3/model/LevelItemAdapter;->gridViewImgs:[I

    iput-object p4, p0, Lcom/sma/smartv3/model/LevelItemAdapter;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final getContext()Landroid/content/Context;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/LevelItemAdapter;->context:Landroid/content/Context;

    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/model/LevelItemAdapter;->levelRangeText:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/sma/smartv3/model/LevelItemViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/model/LevelItemAdapter;->onBindViewHolder(Lcom/sma/smartv3/model/LevelItemViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/sma/smartv3/model/LevelItemViewHolder;I)V
    .locals 2
    .param p1    # Lcom/sma/smartv3/model/LevelItemViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/sma/smartv3/model/LevelItemViewHolder;->getTv()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/model/LevelItemAdapter;->levelRangeText:[Ljava/lang/String;

    aget-object v1, v1, p2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3
    invoke-virtual {p1}, Lcom/sma/smartv3/model/LevelItemViewHolder;->getIv()Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/model/LevelItemAdapter;->gridViewImgs:[I

    aget v1, v1, p2

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 4
    invoke-virtual {p1}, Lcom/sma/smartv3/model/LevelItemViewHolder;->getLlLevelPanel()Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 5
    iget v0, p0, Lcom/sma/smartv3/model/LevelItemAdapter;->level:I

    if-ne p2, v0, :cond_0

    .line 6
    invoke-virtual {p1}, Lcom/sma/smartv3/model/LevelItemViewHolder;->getLlLevelPanel()Landroid/widget/LinearLayout;

    move-result-object p1

    const-string p2, "#3C8AF188"

    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/model/LevelItemAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/sma/smartv3/model/LevelItemViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/sma/smartv3/model/LevelItemViewHolder;
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
    new-instance p2, Lcom/sma/smartv3/model/LevelItemViewHolder;

    .line 3
    iget-object v0, p0, Lcom/sma/smartv3/model/LevelItemAdapter;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0f36

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string v0, "inflate(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p2, p1}, Lcom/sma/smartv3/model/LevelItemViewHolder;-><init>(Landroid/view/View;)V

    return-object p2
.end method
