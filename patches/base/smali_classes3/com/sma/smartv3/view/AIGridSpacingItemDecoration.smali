.class public final Lcom/sma/smartv3/view/AIGridSpacingItemDecoration;
.super Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;
.source "SourceFile"


# instance fields
.field private final spacing:I

.field private final spanCount:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;-><init>()V

    iput p1, p0, Lcom/sma/smartv3/view/AIGridSpacingItemDecoration;->spanCount:I

    iput p2, p0, Lcom/sma/smartv3/view/AIGridSpacingItemDecoration;->spacing:I

    return-void
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;ILandroidx/recyclerview/widget/RecyclerView;)V
    .locals 2
    .param p1    # Landroid/graphics/Rect;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "outRect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recyclerView"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p3

    const-string v0, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Landroidx/recyclerview/widget/GridLayoutManager;

    iget v0, p0, Lcom/sma/smartv3/view/AIGridSpacingItemDecoration;->spanCount:I

    rem-int v1, p2, v0

    if-lt p2, v0, :cond_0

    invoke-virtual {p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->canScrollVertically()Z

    move-result p2

    if-eqz p2, :cond_0

    iget p2, p0, Lcom/sma/smartv3/view/AIGridSpacingItemDecoration;->spacing:I

    iput p2, p1, Landroid/graphics/Rect;->top:I

    :cond_0
    if-lez v1, :cond_1

    iget p2, p0, Lcom/sma/smartv3/view/AIGridSpacingItemDecoration;->spacing:I

    iput p2, p1, Landroid/graphics/Rect;->left:I

    :cond_1
    return-void
.end method
