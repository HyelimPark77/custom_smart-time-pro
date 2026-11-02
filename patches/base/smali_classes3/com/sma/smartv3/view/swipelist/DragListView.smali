.class public Lcom/sma/smartv3/view/swipelist/DragListView;
.super Lcom/sma/smartv3/view/swipelist/SwipeListView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/swipelist/DragListView$XIi00iiXO;,
        Lcom/sma/smartv3/view/swipelist/DragListView$iO;
    }
.end annotation


# instance fields
.field public I1:I

.field public Ii1iii0:Landroid/graphics/Bitmap;

.field public O001I:I

.field public OO:F

.field public OX110i:Ljava/lang/Runnable;

.field public X0i1O:I

.field public X100O:J

.field public X11I:I

.field public X11iII1O1:I

.field public X1IX:I

.field public XX1Oi:Z

.field public XXO:Lcom/sma/smartv3/view/swipelist/DragListView$XIi00iiXO;

.field public XXX11i:I

.field public iIXi1iiXI:I

.field public iX1O1:I

.field public iXiX011:I

.field public iXiiiO:Z

.field public iiiO:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "context"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/view/swipelist/DragListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "context",
            "attrs"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/sma/smartv3/view/swipelist/DragListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "context",
            "attrs",
            "defStyleAttr"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/swipelist/SwipeListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iXiiiO:Z

    .line 5
    iput-boolean p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->XX1Oi:Z

    .line 6
    new-instance p1, Lcom/sma/smartv3/view/swipelist/DragListView$OXO1;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/view/swipelist/DragListView$OXO1;-><init>(Lcom/sma/smartv3/view/swipelist/DragListView;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->OX110i:Ljava/lang/Runnable;

    const/4 p1, 0x1

    const/4 p2, 0x0

    .line 7
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->X11I:I

    return-void
.end method

.method public static bridge synthetic O00(Lcom/sma/smartv3/view/swipelist/DragListView;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->XX1Oi:Z

    return-void
.end method

.method public static bridge synthetic XIi00iiXO(Lcom/sma/smartv3/view/swipelist/DragListView;)Landroid/graphics/Bitmap;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->Ii1iii0:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public static bridge synthetic XO0O10(Lcom/sma/smartv3/view/swipelist/DragListView;J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->X100O:J

    return-void
.end method

.method public static bridge synthetic iO(Lcom/sma/smartv3/view/swipelist/DragListView;)F
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->OO:F

    return p0
.end method


# virtual methods
.method public I0IIOi(Landroid/content/Context;F)I
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "context",
            "dp"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p1, p2

    const/high16 p2, 0x3f000000    # 0.5f

    add-float/2addr p1, p2

    float-to-int p1, p1

    return p1
.end method

.method public IO()V
    .locals 8

    iget-object v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->Ii1iii0:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    iput-object v1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->Ii1iii0:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->XXO:Lcom/sma/smartv3/view/swipelist/DragListView$XIi00iiXO;

    if-eqz v2, :cond_0

    iget v3, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iX1O1:I

    iget-object v4, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iiiO:Landroid/view/View;

    iget v7, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->X0i1O:I

    iget v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->O001I:I

    sub-int v5, v7, v0

    iget v6, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->X1IX:I

    invoke-interface/range {v2 .. v7}, Lcom/sma/smartv3/view/swipelist/DragListView$XIi00iiXO;->OXO1(ILandroid/view/View;III)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iiiO:Landroid/view/View;

    if-eqz v0, :cond_1

    iput-object v1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iiiO:Landroid/view/View;

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->XX1Oi:Z

    iget-object v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->OX110i:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final IiI10X(I)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "y"
        }
    .end annotation

    iget p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iX1O1:I

    iget v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->I1:I

    if-eq p1, v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->XXO:Lcom/sma/smartv3/view/swipelist/DragListView$XIi00iiXO;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0, p1}, Lcom/sma/smartv3/view/swipelist/DragListView$XIi00iiXO;->IiI10X(II)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iiiO:Landroid/view/View;

    iget v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iX1O1:I

    invoke-virtual {p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iiiO:Landroid/view/View;

    iget-object v1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->XXO:Lcom/sma/smartv3/view/swipelist/DragListView$XIi00iiXO;

    iget v2, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->I1:I

    iget v3, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iX1O1:I

    invoke-interface {v1, v2, v3, p1, v0}, Lcom/sma/smartv3/view/swipelist/DragListView$XIi00iiXO;->XIi00iiXO(IILandroid/view/View;Landroid/view/View;)V

    iget p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iX1O1:I

    iput p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->I1:I

    :cond_0
    return-void
.end method

.method public OIi0(I)V
    .locals 8
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "moveY"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v0, p1}, Landroid/widget/AbsListView;->pointToPosition(II)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/swipelist/DragListView;->XOO0ii0(I)V

    return-void

    :cond_0
    iget v2, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->I1:I

    const/4 v3, 0x1

    if-le v2, v0, :cond_1

    move v4, v1

    goto :goto_0

    :cond_1
    move v4, v3

    :goto_0
    if-lez v4, :cond_2

    if-gt v2, v0, :cond_8

    goto :goto_1

    :cond_2
    if-lt v2, v0, :cond_8

    :goto_1
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v5

    sub-int v5, v2, v5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    if-ge v5, v6, :cond_7

    if-gez v5, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v5

    const/4 v6, 0x0

    invoke-virtual {p0, v6, v5}, Landroid/widget/AbsListView;->pointToPosition(II)I

    move-result v7

    if-eq v7, v1, :cond_4

    iput v7, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iX1O1:I

    :cond_4
    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    move-result v7

    if-ge v5, v7, :cond_5

    iput v6, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iX1O1:I

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    sub-int/2addr v6, v3

    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getBottom()I

    move-result v6

    if-le v5, v6, :cond_6

    invoke-virtual {p0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v6

    invoke-interface {v6}, Landroid/widget/Adapter;->getCount()I

    move-result v6

    sub-int/2addr v6, v3

    iput v6, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iX1O1:I

    :cond_6
    :goto_2
    invoke-virtual {p0, v5}, Lcom/sma/smartv3/view/swipelist/DragListView;->IiI10X(I)V

    :cond_7
    :goto_3
    add-int/2addr v2, v4

    goto :goto_0

    :cond_8
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/swipelist/DragListView;->XOO0ii0(I)V

    return-void
.end method

.method public XOO0ii0(I)V
    .locals 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x10
        }
        names = {
            "y"
        }
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->X11iII1O1:I

    const/high16 v1, 0x40c00000    # 6.0f

    if-ge p1, v0, :cond_0

    iget v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iXiX011:I

    iget v2, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->X11I:I

    sub-int/2addr v0, v2

    if-gt p1, v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1, v1}, Lcom/sma/smartv3/view/swipelist/DragListView;->I0IIOi(Landroid/content/Context;F)I

    move-result p1

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->XXX11i:I

    if-le p1, v0, :cond_1

    iget v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iXiX011:I

    iget v2, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->X11I:I

    add-int/2addr v0, v2

    if-lt p1, v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1, v1}, Lcom/sma/smartv3/view/swipelist/DragListView;->I0IIOi(Landroid/content/Context;F)I

    move-result p1

    neg-int p1, p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_3

    iget v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iX1O1:I

    invoke-virtual {p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_3

    iget v1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iX1O1:I

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    add-int/2addr v0, p1

    invoke-virtual {p0, v1, v0}, Landroid/widget/AbsListView;->setSelectionFromTop(II)V

    iget-boolean p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->XX1Oi:Z

    if-nez p1, :cond_3

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->XX1Oi:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->X100O:J

    sub-long/2addr v0, v2

    iget-object p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->OX110i:Ljava/lang/Runnable;

    const-wide/16 v2, 0xf

    cmp-long v4, v0, v2

    if-lez v4, :cond_2

    goto :goto_1

    :cond_2
    sub-long/2addr v2, v0

    :goto_1
    invoke-virtual {p0, p1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_3
    return-void
.end method

.method public dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->Ii1iii0:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->Ii1iii0:Landroid/graphics/Bitmap;

    iget v1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->X0i1O:I

    iget v2, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->O001I:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v3, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "ev"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_5

    if-eq v0, v2, :cond_4

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_4

    goto/16 :goto_2

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->Ii1iii0:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_8

    iget-boolean v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iXiiiO:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->XXO:Lcom/sma/smartv3/view/swipelist/DragListView$XIi00iiXO;

    iget v3, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iX1O1:I

    iget-object v4, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iiiO:Landroid/view/View;

    invoke-interface {v0, v3, v4}, Lcom/sma/smartv3/view/swipelist/DragListView$XIi00iiXO;->XOO0ii0(ILandroid/view/View;)V

    iput-boolean v2, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iXiiiO:Z

    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    if-gez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    if-le v0, v1, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    goto :goto_0

    :cond_3
    move v1, v0

    :goto_0
    int-to-float v0, v1

    iput v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->OO:F

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/view/swipelist/DragListView;->OIi0(I)V

    iput v1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->X0i1O:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->X1IX:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return v2

    :cond_4
    iget-object v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->Ii1iii0:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_8

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->X1IX:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    iput p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->X0i1O:I

    invoke-virtual {p0}, Lcom/sma/smartv3/view/swipelist/DragListView;->IO()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return v2

    :cond_5
    invoke-virtual {p0}, Lcom/sma/smartv3/view/swipelist/DragListView;->IO()V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iIXi1iiXI:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iXiX011:I

    iget v3, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iIXi1iiXI:I

    invoke-virtual {p0, v3, v0}, Landroid/widget/AbsListView;->pointToPosition(II)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_6

    invoke-super {p0, p1}, Lcom/sma/smartv3/view/swipelist/SwipeListView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_6
    iput v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iX1O1:I

    iput v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->I1:I

    invoke-virtual {p0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v3

    sub-int/2addr v0, v3

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_8

    iget-object v3, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->XXO:Lcom/sma/smartv3/view/swipelist/DragListView$XIi00iiXO;

    if-eqz v3, :cond_8

    iget v4, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iIXi1iiXI:I

    iget v5, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iXiX011:I

    invoke-interface {v3, v0, v4, v5}, Lcom/sma/smartv3/view/swipelist/DragListView$XIi00iiXO;->iO(Landroid/view/View;II)Z

    move-result v3

    if-eqz v3, :cond_8

    iget p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iXiX011:I

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v3

    sub-int/2addr p1, v3

    iput p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->O001I:I

    iget-object p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->XXO:Lcom/sma/smartv3/view/swipelist/DragListView$XIi00iiXO;

    invoke-interface {p1, v0}, Lcom/sma/smartv3/view/swipelist/DragListView$XIi00iiXO;->O00(Landroid/view/View;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    invoke-virtual {v0}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-static {p1}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->Ii1iii0:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->XXO:Lcom/sma/smartv3/view/swipelist/DragListView$XIi00iiXO;

    iget-object v3, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->Ii1iii0:Landroid/graphics/Bitmap;

    invoke-interface {p1, v0, v3}, Lcom/sma/smartv3/view/swipelist/DragListView$XIi00iiXO;->XO0O10(Landroid/view/View;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_7

    goto :goto_1

    :cond_7
    iget-object p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->Ii1iii0:Landroid/graphics/Bitmap;

    :goto_1
    iput-object p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->Ii1iii0:Landroid/graphics/Bitmap;

    iput-boolean v1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iXiiiO:Z

    iget p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iXiX011:I

    iput p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->X0i1O:I

    iget p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iIXi1iiXI:I

    iput p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->X1IX:I

    iput-object v0, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->iiiO:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return v2

    :cond_8
    :goto_2
    invoke-super {p0, p1}, Lcom/sma/smartv3/view/swipelist/SwipeListView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onSizeChanged(IIII)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "w",
            "h",
            "oldw",
            "oldh"
        }
    .end annotation

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/high16 p3, 0x42a00000    # 80.0f

    invoke-virtual {p0, p1, p3}, Lcom/sma/smartv3/view/swipelist/DragListView;->I0IIOi(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->X11iII1O1:I

    sub-int/2addr p2, p1

    iput p2, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->XXX11i:I

    return-void
.end method

.method public setDragItemListener(Lcom/sma/smartv3/view/swipelist/DragListView$XIi00iiXO;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "listener"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/swipelist/DragListView;->XXO:Lcom/sma/smartv3/view/swipelist/DragListView$XIi00iiXO;

    return-void
.end method
