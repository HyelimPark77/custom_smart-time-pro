.class public Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;
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
.field public static final ITEM_TYPE_EMPTY:I = 0x7ffffffe


# instance fields
.field private mEmptyLayoutId:I

.field private mEmptyView:Landroid/view/View;

.field private mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V
    .locals 0

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;->mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    return-void
.end method

.method public static synthetic access$000(Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;)Z
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;->isEmpty()Z

    move-result p0

    return p0
.end method

.method private isEmpty()Z
    .locals 1

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;->mEmptyView:Landroid/view/View;

    if-nez v0, :cond_0

    iget v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;->mEmptyLayoutId:I

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;->mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;->mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const p1, 0x7ffffffe

    return p1

    :cond_0
    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;->mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemViewType(I)I

    move-result p1

    return p1
.end method

.method public onAttachedToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;->mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    new-instance v1, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper$OXO1;

    invoke-direct {v1, p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper$OXO1;-><init>(Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;)V

    invoke-static {v0, p1, v1}, Lcom/android/mltcode/paycertificationapi/o67;->OXO1(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroidx/recyclerview/widget/RecyclerView;Lcom/android/mltcode/paycertificationapi/o67$XIi00iiXO;)V

    return-void
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;->mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p2, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;->mEmptyView:Landroid/view/View;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-object p2, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;->mEmptyView:Landroid/view/View;

    invoke-static {p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->createViewHolder(Landroid/content/Context;Landroid/view/View;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    iget v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;->mEmptyLayoutId:I

    invoke-static {p2, p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->createViewHolder(Landroid/content/Context;Landroid/view/ViewGroup;I)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;->mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 1

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;->mInnerAdapter:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    invoke-direct {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/o67;->XIi00iiXO(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    :cond_0
    return-void
.end method

.method public setEmptyView(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;->mEmptyLayoutId:I

    return-void
.end method

.method public setEmptyView(Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/wrapper/EmptyWrapper;->mEmptyView:Landroid/view/View;

    return-void
.end method
