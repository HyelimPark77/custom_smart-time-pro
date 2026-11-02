.class public Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$OXO1;


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

    iput-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;JJIZLcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;)V
    .locals 2
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
            "bar",
            "minValue",
            "maxValue",
            "action",
            "isMin",
            "pressedThumb"
        }
    .end annotation

    invoke-static {}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->II1Xi0()Ljava/lang/String;

    move-result-object p1

    new-instance p7, Ljava/lang/StringBuilder;

    invoke-direct {p7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "-----minValue----->>>>>>"

    invoke-virtual {p7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p7, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p7

    invoke-static {p1, p7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->II1Xi0()Ljava/lang/String;

    move-result-object p1

    new-instance p7, Ljava/lang/StringBuilder;

    invoke-direct {p7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "-----maxValue----->>>>>>"

    invoke-virtual {p7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p7, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p7

    invoke-static {p1, p7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->IIX1OXO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J

    move-result-wide v0

    add-long/2addr p2, v0

    invoke-static {p1, p2, p3}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OiIIX101O(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;J)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OIX0iXi(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J

    move-result-wide p2

    invoke-static {p1, p2, p3}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->XiOIii1(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;J)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->IIX1OXO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J

    move-result-wide p2

    add-long/2addr p4, p2

    invoke-static {p1, p4, p5}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OII(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;J)V

    invoke-static {}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->II1Xi0()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "-----mLeftProgressPos----->>>>>>"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p3}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OIX0iXi(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J

    move-result-wide p3

    invoke-virtual {p2, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->II1Xi0()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "-----mRightProgressPos----->>>>>>"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p3}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X1ii(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J

    move-result-wide p3

    invoke-virtual {p2, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    if-eqz p6, :cond_3

    const/4 p2, 0x1

    if-eq p6, p2, :cond_2

    const/4 p1, 0x2

    if-eq p6, p1, :cond_0

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iIiiO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    sget-object p2, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;->MIN:Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView$Thumb;

    if-ne p8, p2, :cond_1

    invoke-static {p1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OIX0iXi(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J

    move-result-wide p2

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X1ii(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J

    move-result-wide p2

    :goto_0
    long-to-int p2, p2

    int-to-long p2, p2

    invoke-static {p1, p2, p3}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iOOX010X(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;J)V

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p2, p1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iIiiO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OIX0iXi(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J

    move-result-wide p2

    long-to-int p2, p2

    int-to-long p2, p2

    invoke-static {p1, p2, p3}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iOOX010X(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;J)V

    goto :goto_1

    :cond_3
    iget-object p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p2, p1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iIiiO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;Z)V

    :goto_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->I0iXXO(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;

    move-result-object p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p2}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->OIX0iXi(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J

    move-result-wide p2

    iget-object p4, p0, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {p4}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->X1ii(Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;)J

    move-result-wide p4

    invoke-virtual {p1, p2, p3, p4, p5}, Lcom/sma/smartv3/ui/trim/view/RangeSeekBarView;->O10IXXX0X(JJ)V

    return-void
.end method
