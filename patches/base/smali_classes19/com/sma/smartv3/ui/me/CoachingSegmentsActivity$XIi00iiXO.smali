.class public final Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity$XIi00iiXO;
.super Lcom/sma/smartv3/view/swipelist/DragListView$iO;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;

    invoke-direct {p0}, Lcom/sma/smartv3/view/swipelist/DragListView$iO;-><init>()V

    return-void
.end method


# virtual methods
.method public IiI10X(II)Z
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->access$getMList(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1, p2}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->access$getMListAdapter(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    const/4 p1, 0x1

    return p1
.end method

.method public O00(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public XO0O10(Landroid/view/View;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public iO(Landroid/view/View;II)Z
    .locals 4

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const v0, 0x7f0a0665

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getTranslationX()F

    move-result v2

    const/4 v3, 0x0

    cmpg-float v2, v2, v3

    if-gez v2, :cond_1

    return v1

    :cond_1
    int-to-float p2, p2

    invoke-virtual {p1}, Landroid/view/View;->getX()F

    move-result v1

    sub-float/2addr p2, v1

    int-to-float p3, p3

    invoke-virtual {p1}, Landroid/view/View;->getY()F

    move-result p1

    sub-float/2addr p3, p1

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->access$getMDragRect$p(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Landroid/graphics/Rect;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;->access$getMDragRect$p(Lcom/sma/smartv3/ui/me/CoachingSegmentsActivity;)Landroid/graphics/Rect;

    move-result-object p1

    float-to-int p2, p2

    float-to-int p3, p3

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Rect;->contains(II)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    return v1
.end method
