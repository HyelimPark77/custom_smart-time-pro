.class public Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper$XIi00iiXO;
    }
.end annotation

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
.field public static final ITEM_TYPE_LOAD_MORE:I = 0x7ffffffd


# instance fields
.field private mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

.field private mLoadMoreLayoutId:I

.field private mLoadMoreView:Landroid/view/View;

.field private mOnLoadMoreListener:Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper$XIi00iiXO;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V
    .locals 0

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    return-void
.end method

.method public static synthetic access$000(Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;I)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->isShowLoadMore(I)Z

    move-result p0

    return p0
.end method

.method private hasLoadMore()Z
    .locals 1

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->mLoadMoreView:Landroid/view/View;

    if-nez v0, :cond_1

    iget v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->mLoadMoreLayoutId:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private isShowLoadMore(I)Z
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->hasLoadMore()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    move-result v0

    if-lt p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private setFullSpan(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 1

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    if-eqz p1, :cond_0

    instance-of v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->setFullSpan(Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 2

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    move-result v0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->hasLoadMore()Z

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    invoke-direct {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->isShowLoadMore(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const p1, 0x7ffffffd

    return p1

    :cond_0
    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemViewType(I)I

    move-result p1

    return p1
.end method

.method public onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    new-instance v1, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper$OXO1;

    invoke-direct {v1, p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper$OXO1;-><init>(Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;)V

    invoke-static {v0, p1, v1}, Lcom/android/mltcode/paycertificationapi/o67;->OXO1(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroidx/recyclerview/widget/RecyclerView;Lcom/android/mltcode/paycertificationapi/o67$XIi00iiXO;)V

    return-void
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    invoke-direct {p0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->isShowLoadMore(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->mOnLoadMoreListener:Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper$XIi00iiXO;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper$XIi00iiXO;->OXO1()V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 1

    const v0, 0x7ffffffd

    if-ne p2, v0, :cond_1

    iget-object p2, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->mLoadMoreView:Landroid/view/View;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-object p2, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->mLoadMoreView:Landroid/view/View;

    invoke-static {p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->createViewHolder(Landroid/content/Context;Landroid/view/View;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    iget v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->mLoadMoreLayoutId:I

    invoke-static {p2, p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->createViewHolder(Landroid/content/Context;Landroid/view/ViewGroup;I)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 1

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->isShowLoadMore(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->setFullSpan(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    :cond_0
    return-void
.end method

.method public setLoadMoreView(I)Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;
    .locals 0

    .line 2
    iput p1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->mLoadMoreLayoutId:I

    return-object p0
.end method

.method public setLoadMoreView(Landroid/view/View;)Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->mLoadMoreView:Landroid/view/View;

    return-object p0
.end method

.method public setOnLoadMoreListener(Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper$XIi00iiXO;)Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper;->mOnLoadMoreListener:Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/LoadMoreWrapper$XIi00iiXO;

    :cond_0
    return-object p0
.end method
