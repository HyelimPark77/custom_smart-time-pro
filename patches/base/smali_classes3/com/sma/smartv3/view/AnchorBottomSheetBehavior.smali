.class public Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;
.super Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;,
        Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$SavedState;,
        Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XO0O10;,
        Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XIi00iiXO;,
        Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$O00;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Landroid/view/View;",
        ">",
        "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior<",
        "TV;>;"
    }
.end annotation


# static fields
.field private static final DEFAULT_ANCHOR_POINT:I = 0x2bc

.field private static final HIDE_FRICTION:F = 0.1f

.field private static final HIDE_THRESHOLD:F = 0.5f

.field public static final STATE_ANCHOR_POINT:I = 0x3

.field public static final STATE_COLLAPSED:I = 0x5

.field public static final STATE_DRAGGING:I = 0x1

.field public static final STATE_EXPANDED:I = 0x4

.field public static final STATE_HIDDEN:I = 0x6

.field public static final STATE_SETTLING:I = 0x2


# instance fields
.field private mActivePointerId:I

.field private mAnchorPoint:I

.field private mCallback:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector<",
            "Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XIi00iiXO;",
            ">;"
        }
    .end annotation
.end field

.field private mCollapsible:Z

.field private final mDragCallback:Landroidx/customview/widget/ViewDragHelper$Callback;

.field private mHideable:Z

.field private mIgnoreEvents:Z

.field private mInitialY:I

.field private mLastStableState:I

.field private mMaxOffset:I

.field private mMinOffset:I

.field private mMinimumVelocity:F

.field private mNestedScrolled:Z

.field private mNestedScrollingChildRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private mParentHeight:I

.field private mPeekHeight:I

.field private mScrollVelocityTracker:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/sma/smartv3/view/AnchorBottomSheetBehavior<",
            "TV;>.iO;"
        }
    .end annotation
.end field

.field private mState:I

.field private mTouchingScrollingChild:Z

.field private mViewDragHelper:Landroidx/customview/widget/ViewDragHelper;

.field private mViewRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;-><init>()V

    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mState:I

    .line 3
    iput v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mLastStableState:I

    .line 4
    new-instance v0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;-><init>(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;Lcom/android/mltcode/paycertificationapi/XIXIXi;)V

    iput-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mScrollVelocityTracker:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;

    .line 5
    new-instance v0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;-><init>(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)V

    iput-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mDragCallback:Landroidx/customview/widget/ViewDragHelper$Callback;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4
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

    .line 6
    invoke-direct {p0, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x3

    .line 7
    iput v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mState:I

    .line 8
    iput v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mLastStableState:I

    .line 9
    new-instance v1, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;-><init>(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;Lcom/android/mltcode/paycertificationapi/XIXIXi;)V

    iput-object v1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mScrollVelocityTracker:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;

    .line 10
    new-instance v1, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$OXO1;-><init>(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)V

    iput-object v1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mDragCallback:Landroidx/customview/widget/ViewDragHelper$Callback;

    .line 11
    sget-object v1, Lcom/google/android/material/R$styleable;->BottomSheetBehavior_Layout:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    const/16 v2, 0x9

    const/4 v3, 0x0

    .line 12
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->setPeekHeight(I)V

    const/16 v2, 0x8

    .line 13
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->setHideable(Z)V

    .line 14
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    const/16 v1, 0x2bc

    .line 15
    iput v1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mAnchorPoint:I

    const/4 v1, 0x1

    .line 16
    iput-boolean v1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mCollapsible:Z

    .line 17
    sget-object v2, Lcom/sma/smartv3/R$styleable;->AnchorBottomSheetBehavior:[I

    invoke-virtual {p1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    .line 18
    invoke-virtual {v2, v3, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    float-to-int p2, p2

    iput p2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mAnchorPoint:I

    .line 19
    invoke-virtual {v2, v1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mState:I

    .line 20
    :cond_0
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 21
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    .line 22
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mMinimumVelocity:F

    return-void
.end method

.method public static bridge synthetic I0IIOi(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mParentHeight:I

    return p0
.end method

.method public static bridge synthetic I0iXXO(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)Ljava/lang/ref/WeakReference;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mViewRef:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method public static bridge synthetic IO(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mTouchingScrollingChild:Z

    return p0
.end method

.method public static bridge synthetic IiI10X(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mMinOffset:I

    return p0
.end method

.method public static bridge synthetic O00(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mMaxOffset:I

    return p0
.end method

.method public static bridge synthetic O10IXXX0X(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;Landroid/view/View;F)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->shouldHide(Landroid/view/View;F)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic OIX0iXi(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)Landroidx/customview/widget/ViewDragHelper;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mViewDragHelper:Landroidx/customview/widget/ViewDragHelper;

    return-object p0
.end method

.method public static bridge synthetic OIi0(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mState:I

    return p0
.end method

.method public static bridge synthetic OXO1(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mActivePointerId:I

    return p0
.end method

.method public static bridge synthetic X1ii(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->setStateInternal(I)V

    return-void
.end method

.method public static bridge synthetic XIi00iiXO(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mAnchorPoint:I

    return p0
.end method

.method public static bridge synthetic XO0O10(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mHideable:Z

    return p0
.end method

.method public static bridge synthetic XOO0ii0(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)Ljava/lang/ref/WeakReference;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mNestedScrollingChildRef:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method public static bridge synthetic XXI(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->dispatchOnSlide(I)V

    return-void
.end method

.method private dispatchOnSlide(I)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "top"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mViewRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mCallback:Ljava/util/Vector;

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mMaxOffset:I

    if-le p1, v1, :cond_0

    sub-int/2addr v1, p1

    int-to-float p1, v1

    iget v1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mPeekHeight:I

    int-to-float v1, v1

    div-float/2addr p1, v1

    invoke-direct {p0, v0, p1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->notifyOnSlideToListeners(Landroid/view/View;F)V

    return-void

    :cond_0
    sub-int p1, v1, p1

    int-to-float p1, p1

    iget v2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mMinOffset:I

    sub-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr p1, v1

    invoke-direct {p0, v0, p1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->notifyOnSlideToListeners(Landroid/view/View;F)V

    :cond_1
    return-void
.end method

.method private findScrollingChild(Landroid/view/View;)Landroid/view/View;
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "view"
        }
    .end annotation

    instance-of v0, p1, Landroidx/core/view/NestedScrollingChild;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->findScrollingChild(Landroid/view/View;)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public static from(Landroid/view/View;)Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "view"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroid/view/View;",
            ">(TV;)",
            "Lcom/sma/smartv3/view/AnchorBottomSheetBehavior<",
            "TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    instance-of v0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$LayoutParams;

    if-eqz v0, :cond_1

    check-cast p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$LayoutParams;

    invoke-virtual {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$LayoutParams;->getBehavior()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object p0

    instance-of v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "The view is not associated with AnchorBottomSheetBehavior"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "The view is not a child of CoordinatorLayout"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic iO(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mCollapsible:Z

    return p0
.end method

.method private notifyOnSlideToListeners(Landroid/view/View;F)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "bottomSheet",
            "slideOffset"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mCallback:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XIi00iiXO;

    invoke-virtual {v1, p1, p2}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XIi00iiXO;->OXO1(Landroid/view/View;F)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private notifyStateChangedToListeners(Landroid/view/View;I)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "bottomSheet",
            "newState"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mCallback:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XIi00iiXO;

    invoke-virtual {v1, p1, p2}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XIi00iiXO;->XIi00iiXO(Landroid/view/View;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private reset()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mActivePointerId:I

    return-void
.end method

.method private setStateInternal(I)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "state"
        }
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mState:I

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    iput p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mState:I

    iget-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mViewRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mCallback:Ljava/util/Vector;

    if-eqz v1, :cond_1

    invoke-direct {p0, v0, p1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->notifyStateChangedToListeners(Landroid/view/View;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method private shouldHide(Landroid/view/View;F)Z
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "child",
            "yvel"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    iget v1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mMaxOffset:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    int-to-float p1, p1

    const v0, 0x3dcccccd    # 0.1f

    mul-float/2addr p2, v0

    add-float/2addr p1, p2

    iget p2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mMaxOffset:I

    int-to-float p2, p2

    sub-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget p2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mPeekHeight:I

    int-to-float p2, p2

    div-float/2addr p1, p2

    const/high16 p2, 0x3f000000    # 0.5f

    cmpl-float p1, p1, p2

    if-lez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v2
.end method


# virtual methods
.method public addBottomSheetCallback(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XIi00iiXO;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "callback"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mCallback:Ljava/util/Vector;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mCallback:Ljava/util/Vector;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mCallback:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public getAnchorPoint()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mAnchorPoint:I

    return v0
.end method

.method public final getPeekHeight()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mPeekHeight:I

    return v0
.end method

.method public final getState()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mState:I

    return v0
.end method

.method public isCollapsible()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mCollapsible:Z

    return v0
.end method

.method public isHideable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mHideable:Z

    return v0
.end method

.method public onInterceptTouchEvent(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 7
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "parent",
            "child",
            "event"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/MotionEvent;",
            ")Z"
        }
    .end annotation

    invoke-virtual {p2}, Landroid/view/View;->isShown()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    iput-boolean v2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mIgnoreEvents:Z

    return v1

    :cond_0
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->reset()V

    :cond_1
    const/4 v3, -0x1

    const/4 v4, 0x3

    if-eqz v0, :cond_3

    if-eq v0, v2, :cond_2

    if-eq v0, v4, :cond_2

    goto :goto_2

    :cond_2
    iput-boolean v1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mTouchingScrollingChild:Z

    iput v3, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mActivePointerId:I

    iget-boolean p2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mIgnoreEvents:Z

    if-eqz p2, :cond_7

    iput-boolean v1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mIgnoreEvents:Z

    return v1

    :cond_3
    iget-object v5, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mScrollVelocityTracker:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;

    invoke-virtual {v5}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;->OXO1()V

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    float-to-int v5, v5

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    float-to-int v6, v6

    iput v6, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mInitialY:I

    iget v6, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mState:I

    if-ne v6, v4, :cond_4

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v4

    invoke-virtual {p3, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mActivePointerId:I

    iput-boolean v2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mTouchingScrollingChild:Z

    goto :goto_0

    :cond_4
    iget-object v4, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mNestedScrollingChildRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    if-eqz v4, :cond_5

    iget v6, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mInitialY:I

    invoke-virtual {p1, v4, v5, v6}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->isPointInChildBounds(Landroid/view/View;II)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v4

    invoke-virtual {p3, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mActivePointerId:I

    iput-boolean v2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mTouchingScrollingChild:Z

    :cond_5
    :goto_0
    iget v4, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mActivePointerId:I

    if-ne v4, v3, :cond_6

    iget v3, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mInitialY:I

    invoke-virtual {p1, p2, v5, v3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->isPointInChildBounds(Landroid/view/View;II)Z

    move-result p2

    if-nez p2, :cond_6

    move p2, v2

    goto :goto_1

    :cond_6
    move p2, v1

    :goto_1
    iput-boolean p2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mIgnoreEvents:Z

    :cond_7
    :goto_2
    iget-boolean p2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mIgnoreEvents:Z

    if-nez p2, :cond_8

    iget-object p2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mViewDragHelper:Landroidx/customview/widget/ViewDragHelper;

    invoke-virtual {p2, p3}, Landroidx/customview/widget/ViewDragHelper;->shouldInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p2

    if-eqz p2, :cond_8

    return v2

    :cond_8
    iget-object p2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mNestedScrollingChildRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    const/4 v3, 0x2

    if-ne v0, v3, :cond_9

    if-eqz p2, :cond_9

    iget-boolean v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mIgnoreEvents:Z

    if-nez v0, :cond_9

    iget v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mState:I

    if-eq v0, v2, :cond_9

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {p1, p2, v0, v3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->isPointInChildBounds(Landroid/view/View;II)Z

    move-result p1

    if-nez p1, :cond_9

    iget p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mInitialY:I

    int-to-float p1, p1

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    sub-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget-object p2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mViewDragHelper:Landroidx/customview/widget/ViewDragHelper;

    invoke-virtual {p2}, Landroidx/customview/widget/ViewDragHelper;->getTouchSlop()I

    move-result p2

    int-to-float p2, p2

    cmpl-float p1, p1, p2

    if-lez p1, :cond_9

    return v2

    :cond_9
    return v1
.end method

.method public onLayoutChild(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "parent",
            "child",
            "layoutDirection"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;I)Z"
        }
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mState:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2, v1}, Landroid/view/View;->setFitsSystemWindows(Z)V

    :cond_0
    invoke-virtual {p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onLayoutChild(Landroid/view/View;I)V

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p3

    iput p3, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mParentHeight:I

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result v0

    sub-int/2addr p3, v0

    const/4 v0, 0x0

    invoke-static {v0, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    iput p3, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mMinOffset:I

    iget v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mParentHeight:I

    iget v2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mPeekHeight:I

    sub-int/2addr v0, v2

    invoke-static {v0, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    iput p3, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mMaxOffset:I

    iget v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mState:I

    const/4 v2, 0x3

    if-ne v0, v2, :cond_2

    iget p3, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mAnchorPoint:I

    invoke-static {p2, p3}, Landroidx/core/view/ViewCompat;->offsetTopAndBottom(Landroid/view/View;I)V

    goto :goto_0

    :cond_2
    const/4 v2, 0x4

    if-ne v0, v2, :cond_3

    iget p3, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mMinOffset:I

    invoke-static {p2, p3}, Landroidx/core/view/ViewCompat;->offsetTopAndBottom(Landroid/view/View;I)V

    goto :goto_0

    :cond_3
    iget-boolean v2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mHideable:Z

    if-eqz v2, :cond_4

    const/4 v2, 0x6

    if-ne v0, v2, :cond_4

    iget p3, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mParentHeight:I

    invoke-static {p2, p3}, Landroidx/core/view/ViewCompat;->offsetTopAndBottom(Landroid/view/View;I)V

    goto :goto_0

    :cond_4
    const/4 v2, 0x5

    if-ne v0, v2, :cond_5

    invoke-static {p2, p3}, Landroidx/core/view/ViewCompat;->offsetTopAndBottom(Landroid/view/View;I)V

    :cond_5
    :goto_0
    iget-object p3, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mViewDragHelper:Landroidx/customview/widget/ViewDragHelper;

    if-nez p3, :cond_6

    iget-object p3, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mDragCallback:Landroidx/customview/widget/ViewDragHelper$Callback;

    invoke-static {p1, p3}, Landroidx/customview/widget/ViewDragHelper;->create(Landroid/view/ViewGroup;Landroidx/customview/widget/ViewDragHelper$Callback;)Landroidx/customview/widget/ViewDragHelper;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mViewDragHelper:Landroidx/customview/widget/ViewDragHelper;

    :cond_6
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mViewRef:Ljava/lang/ref/WeakReference;

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p0, p2}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->findScrollingChild(Landroid/view/View;)Landroid/view/View;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mNestedScrollingChildRef:Ljava/lang/ref/WeakReference;

    return v1
.end method

.method public onNestedPreFling(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FF)Z
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "coordinatorLayout",
            "child",
            "target",
            "velocityX",
            "velocityY"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "FF)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mNestedScrollingChildRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-ne p3, v0, :cond_1

    iget v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mState:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    invoke-super/range {p0 .. p5}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->onNestedPreFling(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FF)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public onNestedPreScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "coordinatorLayout",
            "child",
            "target",
            "dx",
            "dy",
            "consumed",
            "type"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "II[II)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mNestedScrollingChildRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    if-eq p3, p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mScrollVelocityTracker:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;

    invoke-virtual {p1, p5}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;->iO(I)V

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p1

    sub-int p4, p1, p5

    iget p7, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mLastStableState:I

    const/4 v0, 0x5

    const/4 v1, 0x1

    if-ne p7, v0, :cond_1

    iget v2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mAnchorPoint:I

    if-lt p4, v2, :cond_2

    :cond_1
    const/4 v2, 0x4

    if-ne p7, v2, :cond_3

    iget p7, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mAnchorPoint:I

    if-le p4, p7, :cond_3

    :cond_2
    aput p5, p6, v1

    iget p3, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mAnchorPoint:I

    sub-int/2addr p3, p1

    invoke-static {p2, p3}, Landroidx/core/view/ViewCompat;->offsetTopAndBottom(Landroid/view/View;I)V

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->dispatchOnSlide(I)V

    iput-boolean v1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mNestedScrolled:Z

    return-void

    :cond_3
    if-lez p5, :cond_5

    iget p3, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mMinOffset:I

    if-ge p4, p3, :cond_4

    sub-int/2addr p1, p3

    aput p1, p6, v1

    neg-int p1, p1

    invoke-static {p2, p1}, Landroidx/core/view/ViewCompat;->offsetTopAndBottom(Landroid/view/View;I)V

    invoke-direct {p0, v2}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->setStateInternal(I)V

    goto :goto_1

    :cond_4
    aput p5, p6, v1

    neg-int p1, p5

    invoke-static {p2, p1}, Landroidx/core/view/ViewCompat;->offsetTopAndBottom(Landroid/view/View;I)V

    invoke-direct {p0, v1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->setStateInternal(I)V

    goto :goto_1

    :cond_5
    if-gez p5, :cond_9

    const/4 p7, -0x1

    invoke-static {p3, p7}, Landroidx/core/view/ViewCompat;->canScrollVertically(Landroid/view/View;I)Z

    move-result p3

    if-nez p3, :cond_9

    iget p3, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mMaxOffset:I

    if-le p4, p3, :cond_7

    iget-boolean p7, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mHideable:Z

    if-eqz p7, :cond_6

    goto :goto_0

    :cond_6
    sub-int/2addr p1, p3

    aput p1, p6, v1

    neg-int p1, p1

    invoke-static {p2, p1}, Landroidx/core/view/ViewCompat;->offsetTopAndBottom(Landroid/view/View;I)V

    invoke-direct {p0, v0}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->setStateInternal(I)V

    goto :goto_1

    :cond_7
    :goto_0
    iget-boolean p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mCollapsible:Z

    if-eq p1, v1, :cond_8

    if-nez p1, :cond_9

    iget p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mAnchorPoint:I

    sub-int/2addr p1, p4

    if-ltz p1, :cond_9

    :cond_8
    aput p5, p6, v1

    neg-int p1, p5

    invoke-static {p2, p1}, Landroidx/core/view/ViewCompat;->offsetTopAndBottom(Landroid/view/View;I)V

    invoke-direct {p0, v1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->setStateInternal(I)V

    :cond_9
    :goto_1
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->dispatchOnSlide(I)V

    iput-boolean v1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mNestedScrolled:Z

    return-void
.end method

.method public onRestoreInstanceState(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/os/Parcelable;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "parent",
            "child",
            "state"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/os/Parcelable;",
            ")V"
        }
    .end annotation

    check-cast p3, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$SavedState;

    invoke-virtual {p3}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, p1, p2, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->onRestoreInstanceState(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/os/Parcelable;)V

    iget p1, p3, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$SavedState;->IO:I

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    iput p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mState:I

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x5

    iput p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mState:I

    :goto_1
    iget p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mState:I

    iput p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mLastStableState:I

    return-void
.end method

.method public onSaveInstanceState(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)Landroid/os/Parcelable;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "parent",
            "child"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;)",
            "Landroid/os/Parcelable;"
        }
    .end annotation

    new-instance v0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$SavedState;

    invoke-super {p0, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->onSaveInstanceState(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)Landroid/os/Parcelable;

    move-result-object p1

    iget p2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mState:I

    invoke-direct {v0, p1, p2}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$SavedState;-><init>(Landroid/os/Parcelable;I)V

    return-object v0
.end method

.method public onStartNestedScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "coordinatorLayout",
            "child",
            "directTargetChild",
            "target",
            "nestedScrollAxes",
            "type"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "Landroid/view/View;",
            "II)Z"
        }
    .end annotation

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mNestedScrolled:Z

    and-int/lit8 p2, p5, 0x2

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    :cond_0
    return p1
.end method

.method public onStopNestedScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;I)V
    .locals 9
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "coordinatorLayout",
            "child",
            "target",
            "type"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/View;",
            "I)V"
        }
    .end annotation

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p1

    iget p4, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mMinOffset:I

    const/4 v0, 0x4

    if-ne p1, p4, :cond_0

    invoke-direct {p0, v0}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->setStateInternal(I)V

    iput v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mLastStableState:I

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mNestedScrollingChildRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    if-ne p3, p1, :cond_c

    iget-boolean p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mNestedScrolled:Z

    if-nez p1, :cond_1

    goto/16 :goto_4

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mScrollVelocityTracker:Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;

    invoke-virtual {p1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$iO;->XIi00iiXO()F

    move-result p1

    iget p3, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mMinimumVelocity:F

    cmpl-float p4, p1, p3

    const/4 v1, 0x5

    const/4 v2, 0x3

    if-lez p4, :cond_5

    iget p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mLastStableState:I

    if-ne p1, v1, :cond_3

    iget p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mAnchorPoint:I

    :cond_2
    :goto_0
    move v0, v2

    goto :goto_2

    :cond_3
    if-ne p1, v2, :cond_4

    iget p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mMinOffset:I

    goto :goto_2

    :cond_4
    iget p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mMinOffset:I

    goto :goto_2

    :cond_5
    neg-float p3, p3

    cmpg-float p1, p1, p3

    const/4 p3, 0x1

    if-gez p1, :cond_9

    iget p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mLastStableState:I

    if-ne p1, v0, :cond_6

    iget p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mAnchorPoint:I

    goto :goto_0

    :cond_6
    iget-boolean p4, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mCollapsible:Z

    if-ne p4, p3, :cond_8

    if-ne p1, v2, :cond_7

    iget p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mMaxOffset:I

    :goto_1
    move v0, v1

    goto :goto_2

    :cond_7
    iget p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mMaxOffset:I

    goto :goto_1

    :cond_8
    iget p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mAnchorPoint:I

    goto :goto_0

    :cond_9
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p1

    int-to-double v3, p1

    iget p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mAnchorPoint:I

    int-to-double v5, p1

    const-wide/high16 v7, 0x3ff4000000000000L    # 1.25

    mul-double/2addr v5, v7

    cmpl-double p4, v3, v5

    if-lez p4, :cond_a

    iget-boolean p4, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mCollapsible:Z

    if-ne p4, p3, :cond_a

    iget p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mMaxOffset:I

    goto :goto_1

    :cond_a
    int-to-double p3, p1

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    mul-double/2addr p3, v5

    cmpg-double p3, v3, p3

    if-gez p3, :cond_2

    iget p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mMinOffset:I

    :goto_2
    iput v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mLastStableState:I

    iget-object p3, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mViewDragHelper:Landroidx/customview/widget/ViewDragHelper;

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result p4

    invoke-virtual {p3, p2, p4, p1}, Landroidx/customview/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z

    move-result p1

    if-eqz p1, :cond_b

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->setStateInternal(I)V

    new-instance p1, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XO0O10;

    invoke-direct {p1, p0, p2, v0}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XO0O10;-><init>(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;Landroid/view/View;I)V

    invoke-static {p2, p1}, Landroidx/core/view/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V

    goto :goto_3

    :cond_b
    invoke-direct {p0, v0}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->setStateInternal(I)V

    :goto_3
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mNestedScrolled:Z

    :cond_c
    :goto_4
    return-void
.end method

.method public onTouchEvent(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "parent",
            "child",
            "event"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;",
            "Landroid/view/MotionEvent;",
            ")Z"
        }
    .end annotation

    invoke-virtual {p2}, Landroid/view/View;->isShown()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    iget v2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mState:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    if-nez v0, :cond_1

    return v3

    :cond_1
    iget v2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mLastStableState:I

    const/4 v4, 0x3

    const/4 v5, 0x2

    if-ne v2, v4, :cond_2

    if-ne v0, v5, :cond_2

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    iget v4, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mInitialY:I

    int-to-float v4, v4

    cmpl-float v2, v2, v4

    if-lez v2, :cond_2

    iget-boolean v2, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mCollapsible:Z

    if-nez v2, :cond_2

    invoke-direct {p0}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->reset()V

    return v1

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mViewDragHelper:Landroidx/customview/widget/ViewDragHelper;

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mDragCallback:Landroidx/customview/widget/ViewDragHelper$Callback;

    invoke-static {p1, v1}, Landroidx/customview/widget/ViewDragHelper;->create(Landroid/view/ViewGroup;Landroidx/customview/widget/ViewDragHelper$Callback;)Landroidx/customview/widget/ViewDragHelper;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mViewDragHelper:Landroidx/customview/widget/ViewDragHelper;

    :cond_3
    iget-object p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mViewDragHelper:Landroidx/customview/widget/ViewDragHelper;

    invoke-virtual {p1, p3}, Landroidx/customview/widget/ViewDragHelper;->processTouchEvent(Landroid/view/MotionEvent;)V

    if-nez v0, :cond_4

    invoke-direct {p0}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->reset()V

    :cond_4
    if-ne v0, v5, :cond_5

    iget-boolean p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mIgnoreEvents:Z

    if-nez p1, :cond_5

    iget p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mInitialY:I

    int-to-float p1, p1

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    sub-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget-object v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mViewDragHelper:Landroidx/customview/widget/ViewDragHelper;

    invoke-virtual {v0}, Landroidx/customview/widget/ViewDragHelper;->getTouchSlop()I

    move-result v0

    int-to-float v0, v0

    cmpl-float p1, p1, v0

    if-lez p1, :cond_5

    iget-object p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mViewDragHelper:Landroidx/customview/widget/ViewDragHelper;

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p3, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroidx/customview/widget/ViewDragHelper;->captureChildView(Landroid/view/View;I)V

    :cond_5
    iget-boolean p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mIgnoreEvents:Z

    xor-int/2addr p1, v3

    return p1
.end method

.method public setAnchorPoint(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "anchorPoint"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mAnchorPoint:I

    return-void
.end method

.method public setCollapsible(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "collapsible"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mCollapsible:Z

    return-void
.end method

.method public setHideable(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "hideable"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mHideable:Z

    return-void
.end method

.method public final setPeekHeight(I)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "peekHeight"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mPeekHeight:I

    iget v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mParentHeight:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mMaxOffset:I

    return-void
.end method

.method public final setState(I)V
    .locals 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "state"
        }
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mState:I

    if-ne p1, v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x6

    const/4 v1, 0x3

    const/4 v2, 0x4

    const/4 v3, 0x5

    if-eq p1, v3, :cond_1

    if-eq p1, v2, :cond_1

    if-eq p1, v1, :cond_1

    iget-boolean v4, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mHideable:Z

    if-eqz v4, :cond_2

    if-ne p1, v0, :cond_2

    :cond_1
    iput p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mState:I

    iput p1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mLastStableState:I

    :cond_2
    iget-object v4, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mViewRef:Ljava/lang/ref/WeakReference;

    if-nez v4, :cond_3

    const/4 v4, 0x0

    goto :goto_0

    :cond_3
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    :goto_0
    if-nez v4, :cond_4

    goto :goto_2

    :cond_4
    if-ne p1, v3, :cond_5

    iget v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mMaxOffset:I

    goto :goto_1

    :cond_5
    if-ne p1, v1, :cond_6

    iget v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mAnchorPoint:I

    goto :goto_1

    :cond_6
    if-ne p1, v2, :cond_7

    iget v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mMinOffset:I

    goto :goto_1

    :cond_7
    iget-boolean v1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mHideable:Z

    if-eqz v1, :cond_9

    if-ne p1, v0, :cond_9

    iget v0, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mParentHeight:I

    :goto_1
    const/4 v1, 0x2

    invoke-direct {p0, v1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->setStateInternal(I)V

    iget-object v1, p0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;->mViewDragHelper:Landroidx/customview/widget/ViewDragHelper;

    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {v1, v4, v2, v0}, Landroidx/customview/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z

    move-result v0

    if-eqz v0, :cond_8

    new-instance v0, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XO0O10;

    invoke-direct {v0, p0, v4, p1}, Lcom/sma/smartv3/view/AnchorBottomSheetBehavior$XO0O10;-><init>(Lcom/sma/smartv3/view/AnchorBottomSheetBehavior;Landroid/view/View;I)V

    invoke-static {v4, v0}, Landroidx/core/view/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V

    :cond_8
    :goto_2
    return-void

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Illegal state argument: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
