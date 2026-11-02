.class public Lcom/sma/smartv3/view/swipelist/SwipeLayout$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/view/swipelist/SwipeLayout;->O00(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/view/swipelist/SwipeLayout;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/swipelist/SwipeLayout;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout$OXO1;->IO:Lcom/sma/smartv3/view/swipelist/SwipeLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "animation"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout$OXO1;->IO:Lcom/sma/smartv3/view/swipelist/SwipeLayout;

    float-to-int p1, p1

    invoke-static {v0, p1}, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->XO0O10(Lcom/sma/smartv3/view/swipelist/SwipeLayout;I)V

    iget-object p1, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout$OXO1;->IO:Lcom/sma/smartv3/view/swipelist/SwipeLayout;

    invoke-static {p1}, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->XIi00iiXO(Lcom/sma/smartv3/view/swipelist/SwipeLayout;)Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/view/swipelist/SwipeLayout$OXO1;->IO:Lcom/sma/smartv3/view/swipelist/SwipeLayout;

    invoke-static {v0}, Lcom/sma/smartv3/view/swipelist/SwipeLayout;->iO(Lcom/sma/smartv3/view/swipelist/SwipeLayout;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    div-float/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    return-void
.end method
