.class public final Lcom/sma/smartv3/util/DeviceItemDecoration;
.super Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;
.source "SourceFile"


# instance fields
.field private final firstItemNoLeftRight:Z

.field private final firstItemNoTop:Z

.field private final itemShowLeftRight:Z

.field private final marLeftRight:I

.field private final spacing:I


# direct methods
.method public constructor <init>(IZZIZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;-><init>()V

    iput p1, p0, Lcom/sma/smartv3/util/DeviceItemDecoration;->spacing:I

    .line 2
    iput-boolean p2, p0, Lcom/sma/smartv3/util/DeviceItemDecoration;->firstItemNoTop:Z

    .line 3
    iput-boolean p3, p0, Lcom/sma/smartv3/util/DeviceItemDecoration;->itemShowLeftRight:Z

    .line 4
    iput p4, p0, Lcom/sma/smartv3/util/DeviceItemDecoration;->marLeftRight:I

    .line 5
    iput-boolean p5, p0, Lcom/sma/smartv3/util/DeviceItemDecoration;->firstItemNoLeftRight:Z

    return-void
.end method

.method public synthetic constructor <init>(IZZIZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    move p3, v0

    :cond_1
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_2

    move p4, v0

    :cond_2
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_3

    move p6, v0

    :goto_0
    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_3
    move p6, p5

    goto :goto_0

    .line 6
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/sma/smartv3/util/DeviceItemDecoration;-><init>(IZZIZ)V

    return-void
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .locals 1
    .param p1    # Landroid/graphics/Rect;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Landroidx/recyclerview/widget/RecyclerView$State;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "outRect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result p2

    if-nez p2, :cond_1

    iget-boolean p3, p0, Lcom/sma/smartv3/util/DeviceItemDecoration;->firstItemNoTop:Z

    if-nez p3, :cond_0

    iget p3, p0, Lcom/sma/smartv3/util/DeviceItemDecoration;->spacing:I

    iput p3, p1, Landroid/graphics/Rect;->top:I

    :cond_0
    iget p3, p0, Lcom/sma/smartv3/util/DeviceItemDecoration;->spacing:I

    iput p3, p1, Landroid/graphics/Rect;->bottom:I

    goto :goto_0

    :cond_1
    iget p3, p0, Lcom/sma/smartv3/util/DeviceItemDecoration;->spacing:I

    iput p3, p1, Landroid/graphics/Rect;->bottom:I

    :goto_0
    iget-boolean p3, p0, Lcom/sma/smartv3/util/DeviceItemDecoration;->itemShowLeftRight:Z

    if-eqz p3, :cond_3

    if-nez p2, :cond_2

    iget-boolean p2, p0, Lcom/sma/smartv3/util/DeviceItemDecoration;->firstItemNoLeftRight:Z

    if-eqz p2, :cond_2

    const/4 p2, 0x0

    iput p2, p1, Landroid/graphics/Rect;->left:I

    iput p2, p1, Landroid/graphics/Rect;->right:I

    return-void

    :cond_2
    iget p2, p0, Lcom/sma/smartv3/util/DeviceItemDecoration;->marLeftRight:I

    iput p2, p1, Landroid/graphics/Rect;->left:I

    iput p2, p1, Landroid/graphics/Rect;->right:I

    :cond_3
    return-void
.end method
