.class public Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        ">;"
    }
.end annotation


# static fields
.field private static final BASE_ITEM_TYPE_FOOTER:I = 0x30d40

.field private static final BASE_ITEM_TYPE_HEADER:I = 0x186a0


# instance fields
.field private mFootViews:Landroidx/collection/SparseArrayCompat;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/SparseArrayCompat<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private mHeaderViews:Landroidx/collection/SparseArrayCompat;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/SparseArrayCompat<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    new-instance v0, Landroidx/collection/SparseArrayCompat;

    invoke-direct {v0}, Landroidx/collection/SparseArrayCompat;-><init>()V

    iput-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->mHeaderViews:Landroidx/collection/SparseArrayCompat;

    new-instance v0, Landroidx/collection/SparseArrayCompat;

    invoke-direct {v0}, Landroidx/collection/SparseArrayCompat;-><init>()V

    iput-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->mFootViews:Landroidx/collection/SparseArrayCompat;

    iput-object p1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    return-void
.end method

.method public static synthetic access$000(Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;)Landroidx/collection/SparseArrayCompat;
    .locals 0

    iget-object p0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->mHeaderViews:Landroidx/collection/SparseArrayCompat;

    return-object p0
.end method

.method public static synthetic access$100(Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;)Landroidx/collection/SparseArrayCompat;
    .locals 0

    iget-object p0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->mFootViews:Landroidx/collection/SparseArrayCompat;

    return-object p0
.end method

.method private getRealItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    move-result v0

    return v0
.end method

.method private isFooterViewPos(I)Z
    .locals 2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->getHeadersCount()I

    move-result v0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->getRealItemCount()I

    move-result v1

    add-int/2addr v0, v1

    if-lt p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private isHeaderViewPos(I)Z
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->getHeadersCount()I

    move-result v0

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public addFootView(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->mFootViews:Landroidx/collection/SparseArrayCompat;

    invoke-virtual {v0}, Landroidx/collection/SparseArrayCompat;->size()I

    move-result v1

    const v2, 0x30d40

    add-int/2addr v1, v2

    invoke-virtual {v0, v1, p1}, Landroidx/collection/SparseArrayCompat;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public addHeaderView(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->mHeaderViews:Landroidx/collection/SparseArrayCompat;

    invoke-virtual {v0}, Landroidx/collection/SparseArrayCompat;->size()I

    move-result v1

    const v2, 0x186a0

    add-int/2addr v1, v2

    invoke-virtual {v0, v1, p1}, Landroidx/collection/SparseArrayCompat;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public getFootersCount()I
    .locals 1

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->mFootViews:Landroidx/collection/SparseArrayCompat;

    invoke-virtual {v0}, Landroidx/collection/SparseArrayCompat;->size()I

    move-result v0

    return v0
.end method

.method public getHeadersCount()I
    .locals 1

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->mHeaderViews:Landroidx/collection/SparseArrayCompat;

    invoke-virtual {v0}, Landroidx/collection/SparseArrayCompat;->size()I

    move-result v0

    return v0
.end method

.method public getItemCount()I
    .locals 2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->getHeadersCount()I

    move-result v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->getFootersCount()I

    move-result v1

    add-int/2addr v0, v1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->getRealItemCount()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public getItemViewType(I)I
    .locals 2

    invoke-direct {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->isHeaderViewPos(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->mHeaderViews:Landroidx/collection/SparseArrayCompat;

    invoke-virtual {v0, p1}, Landroidx/collection/SparseArrayCompat;->keyAt(I)I

    move-result p1

    return p1

    :cond_0
    invoke-direct {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->isFooterViewPos(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->mFootViews:Landroidx/collection/SparseArrayCompat;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->getHeadersCount()I

    move-result v1

    sub-int/2addr p1, v1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->getRealItemCount()I

    move-result v1

    sub-int/2addr p1, v1

    invoke-virtual {v0, p1}, Landroidx/collection/SparseArrayCompat;->keyAt(I)I

    move-result p1

    return p1

    :cond_1
    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->getHeadersCount()I

    move-result v1

    sub-int/2addr p1, v1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemViewType(I)I

    move-result p1

    return p1
.end method

.method public onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    new-instance v1, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper$OXO1;

    invoke-direct {v1, p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper$OXO1;-><init>(Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;)V

    invoke-static {v0, p1, v1}, Lcom/android/mltcode/paycertificationapi/o67;->OXO1(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroidx/recyclerview/widget/RecyclerView;Lcom/android/mltcode/paycertificationapi/o67$XIi00iiXO;)V

    return-void
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 2

    invoke-direct {p0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->isHeaderViewPos(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->isFooterViewPos(I)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->getHeadersCount()I

    move-result v1

    sub-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 1

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->mHeaderViews:Landroidx/collection/SparseArrayCompat;

    invoke-virtual {v0, p2}, Landroidx/collection/SparseArrayCompat;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->mHeaderViews:Landroidx/collection/SparseArrayCompat;

    invoke-virtual {v0, p2}, Landroidx/collection/SparseArrayCompat;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    invoke-static {p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->createViewHolder(Landroid/content/Context;Landroid/view/View;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->mFootViews:Landroidx/collection/SparseArrayCompat;

    invoke-virtual {v0, p2}, Landroidx/collection/SparseArrayCompat;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->mFootViews:Landroidx/collection/SparseArrayCompat;

    invoke-virtual {v0, p2}, Landroidx/collection/SparseArrayCompat;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    invoke-static {p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->createViewHolder(Landroid/content/Context;Landroid/view/View;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->isHeaderViewPos(I)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-direct {p0, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/HeaderAndFooterWrapper;->isFooterViewPos(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/o67;->XIi00iiXO(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method
