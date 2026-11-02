.class public Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter$iO;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field protected mContext:Landroid/content/Context;

.field protected mDatas:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field protected mItemViewDelegateManager:Lcom/android/mltcode/paycertificationapi/lc;

.field protected mOnItemClickListener:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter$iO;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->mDatas:Ljava/util/List;

    new-instance p1, Lcom/android/mltcode/paycertificationapi/lc;

    invoke-direct {p1}, Lcom/android/mltcode/paycertificationapi/lc;-><init>()V

    iput-object p1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->mItemViewDelegateManager:Lcom/android/mltcode/paycertificationapi/lc;

    return-void
.end method


# virtual methods
.method public addItemViewDelegate(ILcom/android/mltcode/paycertificationapi/jc;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/android/mltcode/paycertificationapi/jc<",
            "TT;>;)",
            "Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->mItemViewDelegateManager:Lcom/android/mltcode/paycertificationapi/lc;

    invoke-virtual {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/lc;->OXO1(ILcom/android/mltcode/paycertificationapi/jc;)Lcom/android/mltcode/paycertificationapi/lc;

    return-object p0
.end method

.method public addItemViewDelegate(Lcom/android/mltcode/paycertificationapi/jc;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/jc<",
            "TT;>;)",
            "Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->mItemViewDelegateManager:Lcom/android/mltcode/paycertificationapi/lc;

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/lc;->XIi00iiXO(Lcom/android/mltcode/paycertificationapi/jc;)Lcom/android/mltcode/paycertificationapi/lc;

    return-object p0
.end method

.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;",
            "TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->mItemViewDelegateManager:Lcom/android/mltcode/paycertificationapi/lc;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    move-result v1

    invoke-virtual {v0, p1, p2, v1}, Lcom/android/mltcode/paycertificationapi/lc;->iO(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V

    return-void
.end method

.method public getDatas()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->mDatas:Ljava/util/List;

    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->mDatas:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->useItemViewDelegateManager()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemViewType(I)I

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->mItemViewDelegateManager:Lcom/android/mltcode/paycertificationapi/lc;

    iget-object v1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->mDatas:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/android/mltcode/paycertificationapi/lc;->I0IIOi(Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public isEnabled(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->onBindViewHolder(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;I)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->mDatas:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->mItemViewDelegateManager:Lcom/android/mltcode/paycertificationapi/lc;

    invoke-virtual {v0, p2}, Lcom/android/mltcode/paycertificationapi/lc;->XO0O10(I)Lcom/android/mltcode/paycertificationapi/jc;

    move-result-object v0

    .line 3
    invoke-interface {v0}, Lcom/android/mltcode/paycertificationapi/jc;->XIi00iiXO()I

    move-result v0

    .line 4
    iget-object v1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->mContext:Landroid/content/Context;

    invoke-static {v1, p1, v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->createViewHolder(Landroid/content/Context;Landroid/view/ViewGroup;I)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getConvertView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->onViewHolderCreated(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Landroid/view/View;)V

    .line 6
    invoke-virtual {p0, p1, v0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->setListener(Landroid/view/ViewGroup;Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;I)V

    return-object v0
.end method

.method public onViewHolderCreated(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public setListener(Landroid/view/ViewGroup;Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;I)V
    .locals 0

    invoke-virtual {p0, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->isEnabled(I)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getConvertView()Landroid/view/View;

    move-result-object p1

    new-instance p3, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter$OXO1;

    invoke-direct {p3, p0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter$OXO1;-><init>(Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;)V

    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getConvertView()Landroid/view/View;

    move-result-object p1

    new-instance p3, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter$XIi00iiXO;

    invoke-direct {p3, p0, p2}, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter$XIi00iiXO;-><init>(Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;)V

    invoke-virtual {p1, p3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public setOnItemClickListener(Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter$iO;)V
    .locals 0

    iput-object p1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->mOnItemClickListener:Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter$iO;

    return-void
.end method

.method public useItemViewDelegateManager()Z
    .locals 1

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;->mItemViewDelegateManager:Lcom/android/mltcode/paycertificationapi/lc;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/lc;->O00()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
