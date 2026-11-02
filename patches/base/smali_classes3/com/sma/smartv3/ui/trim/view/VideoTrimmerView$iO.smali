.class public Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "recyclerView",
            "newState"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    invoke-static {}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->II1Xi0()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "newState = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "recyclerView",
            "dx",
            "dy"
        }
    .end annotation

    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iIiiO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->I1(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)I

    move-result p1

    iget-object p3, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p3}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OIi0(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)I

    move-result p3

    sub-int/2addr p3, p1

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p3

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {v0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->O10IXXX0X(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)I

    move-result v0

    if-ge p3, v0, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XiOIO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;Z)V

    return-void

    :cond_0
    iget-object p3, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    const/4 v0, 0x1

    invoke-static {p3, v0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XiOIO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;Z)V

    sget p3, Lcom/android/mltcode/paycertificationapi/ag6;->XOO0ii0:I

    neg-int v1, p3

    const-string v2, "onScrolled >>>> mLeftProgressPos = "

    if-ne p1, v1, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    const-wide/16 v0, 0x0

    invoke-static {p2, v0, v1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OX(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;J)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p2}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->I0iXXO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;

    move-result-object p3

    invoke-virtual {p3}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->getSelectedMinValue()J

    move-result-wide v0

    iget-object p3, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p3}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->IIX1OXO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J

    move-result-wide v3

    add-long/2addr v0, v3

    invoke-static {p2, v0, v1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OiIIX101O(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;J)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p2}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->I0iXXO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;

    move-result-object p3

    invoke-virtual {p3}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->getSelectedMaxValue()J

    move-result-wide v0

    iget-object p3, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p3}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->IIX1OXO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J

    move-result-wide v3

    add-long/2addr v0, v3

    invoke-static {p2, v0, v1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OII(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;J)V

    invoke-static {}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->II1Xi0()Ljava/lang/String;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {v0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OIX0iXi(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p2}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OIX0iXi(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J

    move-result-wide v0

    invoke-static {p2, v0, v1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XiOIii1(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;J)V

    goto/16 :goto_0

    :cond_1
    iget-object v1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {v1, v0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iIiiO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {v0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->IO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)F

    move-result v1

    add-int/2addr p3, p1

    int-to-float p3, p3

    mul-float/2addr v1, p3

    sget p3, Lcom/android/mltcode/paycertificationapi/ag6;->OIi0:I

    int-to-float p3, p3

    div-float/2addr v1, p3

    float-to-long v3, v1

    invoke-static {v0, v3, v4}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OX(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;J)V

    iget-object p3, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p3}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->I0iXXO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->getSelectedMinValue()J

    move-result-wide v0

    iget-object v3, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {v3}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->IIX1OXO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J

    move-result-wide v3

    add-long/2addr v0, v3

    invoke-static {p3, v0, v1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OiIIX101O(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;J)V

    iget-object p3, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p3}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->I0iXXO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->getSelectedMaxValue()J

    move-result-wide v0

    iget-object v3, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {v3}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->IIX1OXO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J

    move-result-wide v3

    add-long/2addr v0, v3

    invoke-static {p3, v0, v1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OII(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;J)V

    invoke-static {}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->II1Xi0()Ljava/lang/String;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {v1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OIX0iXi(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p3, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p3}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OIX0iXi(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J

    move-result-wide v0

    invoke-static {p3, v0, v1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XiOIii1(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;J)V

    iget-object p3, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p3}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->I1XOi1(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    move-result-object p3

    invoke-virtual {p3}, Landroid/widget/VideoView;->isPlaying()Z

    move-result p3

    if-eqz p3, :cond_2

    iget-object p3, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p3}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->I1XOi1(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)Lcom/sma/smartv3/ui/trim/view/ZVideoView;

    move-result-object p3

    invoke-virtual {p3}, Landroid/widget/VideoView;->pause()V

    iget-object p3, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p3, p2}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X01IiOiIi(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;Z)V

    :cond_2
    iget-object p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p2}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XXI(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)Landroid/widget/ImageView;

    move-result-object p2

    const/16 p3, 0x8

    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p2}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OIX0iXi(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J

    move-result-wide v0

    invoke-static {p2, v0, v1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iOOX010X(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;J)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p2}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->I0iXXO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;

    move-result-object p2

    iget-object p3, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p3}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OIX0iXi(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J

    move-result-wide v0

    iget-object p3, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p3}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X1ii(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J

    move-result-wide v2

    invoke-virtual {p2, v0, v1, v2, v3}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->O10IXXX0X(JJ)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p2}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->I0iXXO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    :goto_0
    iget-object p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$iO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p2, p1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XX0(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;I)V

    return-void
.end method
