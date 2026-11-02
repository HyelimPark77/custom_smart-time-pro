.class public Lcom/sma/smartv3/ui/trim/view/SpacesItemDecoration2;
.super Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;
.source "SourceFile"


# instance fields
.field private space:I

.field private thumbnailsCount:I


# direct methods
.method public constructor <init>(II)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "space",
            "thumbnailsCount"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;-><init>()V

    iput p1, p0, Lcom/sma/smartv3/ui/trim/view/SpacesItemDecoration2;->space:I

    iput p2, p0, Lcom/sma/smartv3/ui/trim/view/SpacesItemDecoration2;->thumbnailsCount:I

    return-void
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "outRect",
            "view",
            "parent",
            "state"
        }
    .end annotation

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result p2

    const/4 p3, 0x0

    if-nez p2, :cond_0

    iget p2, p0, Lcom/sma/smartv3/ui/trim/view/SpacesItemDecoration2;->space:I

    iput p2, p1, Landroid/graphics/Rect;->left:I

    iput p3, p1, Landroid/graphics/Rect;->right:I

    return-void

    :cond_0
    iget p4, p0, Lcom/sma/smartv3/ui/trim/view/SpacesItemDecoration2;->thumbnailsCount:I

    const/16 v0, 0xa

    if-le p4, v0, :cond_1

    add-int/lit8 p4, p4, -0x1

    if-ne p2, p4, :cond_1

    iput p3, p1, Landroid/graphics/Rect;->left:I

    iget p2, p0, Lcom/sma/smartv3/ui/trim/view/SpacesItemDecoration2;->space:I

    iput p2, p1, Landroid/graphics/Rect;->right:I

    return-void

    :cond_1
    iput p3, p1, Landroid/graphics/Rect;->left:I

    iput p3, p1, Landroid/graphics/Rect;->right:I

    return-void
.end method
