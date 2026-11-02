.class public Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# instance fields
.field private mContext:Landroid/content/Context;

.field private mConvertView:Landroid/view/View;

.field private mViews:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->mConvertView:Landroid/view/View;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->mViews:Landroid/util/SparseArray;

    return-void
.end method

.method public static createViewHolder(Landroid/content/Context;Landroid/view/View;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 1

    .line 1
    new-instance v0, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    invoke-direct {v0, p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;-><init>(Landroid/content/Context;Landroid/view/View;)V

    return-object v0
.end method

.method public static createViewHolder(Landroid/content/Context;Landroid/view/ViewGroup;I)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 2

    .line 2
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p2, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 3
    new-instance p2, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    invoke-direct {p2, p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;-><init>(Landroid/content/Context;Landroid/view/View;)V

    return-object p2
.end method


# virtual methods
.method public getConvertView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->mConvertView:Landroid/view/View;

    return-object v0
.end method

.method public getView(I)Landroid/view/View;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->mViews:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->mConvertView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->mViews:Landroid/util/SparseArray;

    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method public linkify(I)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const/16 v0, 0xf

    invoke-static {p1, v0}, Landroid/text/util/Linkify;->addLinks(Landroid/widget/TextView;I)Z

    return-object p0
.end method

.method public setAlpha(IF)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    return-object p0
.end method

.method public setBackgroundColor(II)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    return-object p0
.end method

.method public setBackgroundRes(II)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundResource(I)V

    return-object p0
.end method

.method public setChecked(IZ)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Checkable;

    invoke-interface {p1, p2}, Landroid/widget/Checkable;->setChecked(Z)V

    return-object p0
.end method

.method public setImageBitmap(ILandroid/graphics/Bitmap;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-object p0
.end method

.method public setImageDrawable(ILandroid/graphics/drawable/Drawable;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-object p0
.end method

.method public setImageResource(II)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    return-object p0
.end method

.method public setMax(II)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setMax(I)V

    return-object p0
.end method

.method public setOnClickListener(ILandroid/view/View$OnClickListener;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object p0
.end method

.method public setOnLongClickListener(ILandroid/view/View$OnLongClickListener;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-object p0
.end method

.method public setOnTouchListener(ILandroid/view/View$OnTouchListener;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-object p0
.end method

.method public setProgress(II)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    .line 2
    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setProgress(I)V

    return-object p0
.end method

.method public setProgress(III)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    .line 4
    invoke-virtual {p1, p3}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 5
    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setProgress(I)V

    return-object p0
.end method

.method public setRating(IF)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RatingBar;

    .line 2
    invoke-virtual {p1, p2}, Landroid/widget/RatingBar;->setRating(F)V

    return-object p0
.end method

.method public setRating(IFI)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RatingBar;

    .line 4
    invoke-virtual {p1, p3}, Landroid/widget/RatingBar;->setMax(I)V

    .line 5
    invoke-virtual {p1, p2}, Landroid/widget/RatingBar;->setRating(F)V

    return-object p0
.end method

.method public setTag(IILjava/lang/Object;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    .line 4
    invoke-virtual {p1, p2, p3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-object p0
.end method

.method public setTag(ILjava/lang/Object;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    return-object p0
.end method

.method public setText(ILjava/lang/String;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p0
.end method

.method public setTextColor(II)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    return-object p0
.end method

.method public setTextColorRes(II)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    return-object p0
.end method

.method public varargs setTypeface(Landroid/graphics/Typeface;[I)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 4

    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget v2, p2, v1

    invoke-virtual {p0, v2}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-virtual {v2}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v3

    or-int/lit16 v3, v3, 0x80

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setPaintFlags(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public setVisible(IZ)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const/16 p2, 0x8

    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-object p0
.end method
