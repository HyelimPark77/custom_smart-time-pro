.class public Lcom/sma/smartv3/view/WheelView/WheelView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/WheelView/WheelView$ACTION;
    }
.end annotation


# instance fields
.field public I1:Landroid/content/Context;

.field public IO:F

.field public IO0II0i:I

.field public IXI:I

.field public IXOIIIO:I

.field public Ii0X0X:I

.field public Ii0i:I

.field public Ii1iii0:I

.field public IiiXiI0I:I

.field public O001I:Landroid/graphics/Paint;

.field public OO:Z

.field public OX110i:F

.field public X00XIX1:I

.field public X00Xi1X:I

.field public X0i1O:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field public X1:I

.field public X100O:I

.field public X11I:I

.field public X11iII1O1:Landroid/view/GestureDetector;

.field public X1IX:Ljava/util/concurrent/ScheduledExecutorService;

.field public XO0X10iO:I

.field public XOIX:F

.field public XOO0XOOii:Landroid/graphics/Rect;

.field public XOX0O0:I

.field public XOXiX0:J

.field public XX1Oi:I

.field public XXO:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public XXX11i:Lcom/android/mltcode/paycertificationapi/dg1;

.field public XXiIiX10:I

.field public i0X000X0O:I

.field public i11I:I

.field public iIXi1iiXI:Landroid/graphics/Paint;

.field public iOiXi11II:I

.field public iX1O1:Landroid/os/Handler;

.field public iXiX011:Landroid/graphics/Paint;

.field public iXiiiO:I

.field public iiiO:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "context"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const v0, 0x3f933333    # 1.15f

    .line 2
    iput v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IO:F

    .line 3
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X1IX:Ljava/util/concurrent/ScheduledExecutorService;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IXOIIIO:I

    .line 5
    iput v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IO0II0i:I

    .line 6
    iput v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IiiXiI0I:I

    const-wide/16 v0, 0x0

    .line 7
    iput-wide v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOXiX0:J

    .line 8
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOO0XOOii:Landroid/graphics/Rect;

    .line 9
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/WheelView/WheelView;->iO(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "context",
            "attributeset"
        }
    .end annotation

    .line 10
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const p2, 0x3f933333    # 1.15f

    .line 11
    iput p2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IO:F

    .line 12
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X1IX:Ljava/util/concurrent/ScheduledExecutorService;

    const/4 p2, 0x0

    .line 13
    iput p2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IXOIIIO:I

    .line 14
    iput p2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IO0II0i:I

    .line 15
    iput p2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IiiXiI0I:I

    const-wide/16 v0, 0x0

    .line 16
    iput-wide v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOXiX0:J

    .line 17
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOO0XOOii:Landroid/graphics/Rect;

    .line 18
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/WheelView/WheelView;->iO(Landroid/content/Context;)V

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
            "attributeset",
            "defStyleAttr"
        }
    .end annotation

    .line 19
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const p2, 0x3f933333    # 1.15f

    .line 20
    iput p2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IO:F

    .line 21
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X1IX:Ljava/util/concurrent/ScheduledExecutorService;

    const/4 p2, 0x0

    .line 22
    iput p2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IXOIIIO:I

    .line 23
    iput p2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IO0II0i:I

    .line 24
    iput p2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IiiXiI0I:I

    const-wide/16 p2, 0x0

    .line 25
    iput-wide p2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOXiX0:J

    .line 26
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOO0XOOii:Landroid/graphics/Rect;

    .line 27
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/WheelView/WheelView;->iO(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final I0IIOi(F)V
    .locals 7
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "velocityY"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/view/WheelView/WheelView;->OXO1()V

    iget-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X1IX:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/w4;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/w4;-><init>(Lcom/sma/smartv3/view/WheelView/WheelView;F)V

    const/16 p1, 0xa

    int-to-long v4, p1

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x0

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X0i1O:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method public IO(IIII)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "left",
            "top",
            "right",
            "bottom"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IXOIIIO:I

    iput p3, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IO0II0i:I

    return-void
.end method

.method public final IiI10X()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXX11i:Lcom/android/mltcode/paycertificationapi/dg1;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/eg1;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/eg1;-><init>(Lcom/sma/smartv3/view/WheelView/WheelView;)V

    const-wide/16 v1, 0x32

    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public final O00()V
    .locals 6

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXO:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXO:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iXiX011:Landroid/graphics/Paint;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    iget-object v5, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOO0XOOii:Landroid/graphics/Rect;

    invoke-virtual {v3, v2, v0, v4, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    iget-object v2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iXiX011:Landroid/graphics/Paint;

    const/4 v3, 0x2

    iget-object v4, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOO0XOOii:Landroid/graphics/Rect;

    const-string v5, "\u661f\u671f"

    invoke-virtual {v2, v5, v0, v3, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    iget-object v2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOO0XOOii:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    iget v3, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iiiO:I

    if-le v2, v3, :cond_0

    iput v2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iiiO:I

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public OIX0iXi(Lcom/sma/smartv3/view/WheelView/WheelView$ACTION;)V
    .locals 7
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "action"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/view/WheelView/WheelView;->OXO1()V

    sget-object v0, Lcom/sma/smartv3/view/WheelView/WheelView$ACTION;->FLING:Lcom/sma/smartv3/view/WheelView/WheelView$ACTION;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/sma/smartv3/view/WheelView/WheelView$ACTION;->DAGGLE:Lcom/sma/smartv3/view/WheelView/WheelView$ACTION;

    if-ne p1, v0, :cond_2

    :cond_0
    iget p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->OX110i:F

    iget v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iiiO:I

    int-to-float v0, v0

    mul-float/2addr p1, v0

    iget v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X00XIX1:I

    int-to-float v0, v0

    rem-float/2addr v0, p1

    add-float/2addr v0, p1

    rem-float/2addr v0, p1

    float-to-int v0, v0

    iput v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IiiXiI0I:I

    int-to-float v1, v0

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, p1, v2

    cmpl-float v1, v1, v2

    if-lez v1, :cond_1

    int-to-float v0, v0

    sub-float/2addr p1, v0

    float-to-int p1, p1

    iput p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IiiXiI0I:I

    goto :goto_0

    :cond_1
    neg-int p1, v0

    iput p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IiiXiI0I:I

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X1IX:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/mn4;

    iget p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IiiXiI0I:I

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/mn4;-><init>(Lcom/sma/smartv3/view/WheelView/WheelView;I)V

    const-wide/16 v4, 0xa

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x0

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X0i1O:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method public final OIi0()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->OO:Z

    return-void
.end method

.method public OXO1()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X0i1O:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X0i1O:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X0i1O:Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    return-void
.end method

.method public final XIi00iiXO(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Rect;)I
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "a",
            "paint",
            "rect"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p2, p1, v1, v0, p3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    invoke-virtual {p3}, Landroid/graphics/Rect;->width()I

    move-result p1

    iget p2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X1:I

    sub-int/2addr p2, p1

    div-int/lit8 p2, p2, 0x2

    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method

.method public final XO0O10()V
    .locals 5

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iIXi1iiXI:Landroid/graphics/Paint;

    iget v1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X11I:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iIXi1iiXI:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iIXi1iiXI:Landroid/graphics/Paint;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/iiOI111I;->OXO1:Lcom/android/mltcode/paycertificationapi/iiOI111I;

    sget-object v3, Lcom/sma/smartv3/view/text/MyTypeface;->DIN_COND_BOLD:Lcom/sma/smartv3/view/text/MyTypeface;

    iget-object v4, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->I1:Landroid/content/Context;

    invoke-virtual {v2, v3, v4}, Lcom/android/mltcode/paycertificationapi/iiOI111I;->OXO1(Lcom/sma/smartv3/view/text/MyTypeface;Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iIXi1iiXI:Landroid/graphics/Paint;

    iget v4, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iXiiiO:I

    int-to-float v4, v4

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iXiX011:Landroid/graphics/Paint;

    iget v4, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X100O:I

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iXiX011:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iXiX011:Landroid/graphics/Paint;

    iget v4, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IO:F

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setTextScaleX(F)V

    iget-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iXiX011:Landroid/graphics/Paint;

    iget-object v4, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->I1:Landroid/content/Context;

    invoke-virtual {v2, v3, v4}, Lcom/android/mltcode/paycertificationapi/iiOI111I;->OXO1(Lcom/sma/smartv3/view/text/MyTypeface;Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iXiX011:Landroid/graphics/Paint;

    iget v2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iXiiiO:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->O001I:Landroid/graphics/Paint;

    iget v2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XX1Oi:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->O001I:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/4 v0, 0x0

    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    return-void
.end method

.method public final XOO0ii0()V
    .locals 9

    iget-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXO:Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/view/WheelView/WheelView;->O00()V

    iget v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iiiO:I

    int-to-float v1, v0

    iget v2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->OX110i:F

    mul-float/2addr v1, v2

    iget v3, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXiIiX10:I

    add-int/lit8 v3, v3, -0x1

    int-to-float v3, v3

    mul-float/2addr v1, v3

    float-to-int v1, v1

    iput v1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->Ii0i:I

    mul-int/lit8 v3, v1, 0x2

    int-to-double v3, v3

    const-wide v5, 0x400921fb54442d18L    # Math.PI

    div-double/2addr v3, v5

    double-to-int v3, v3

    iput v3, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X00Xi1X:I

    int-to-double v7, v1

    div-double/2addr v7, v5

    double-to-int v1, v7

    iput v1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IXI:I

    int-to-float v1, v3

    int-to-float v4, v0

    mul-float/2addr v4, v2

    sub-float/2addr v1, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v1, v4

    float-to-int v1, v1

    iput v1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOX0O0:I

    int-to-float v1, v3

    int-to-float v0, v0

    mul-float/2addr v2, v0

    add-float/2addr v1, v2

    div-float/2addr v1, v4

    float-to-int v0, v1

    iput v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iOiXi11II:I

    iget v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->i0X000X0O:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->OO:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXO:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->i0X000X0O:I

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->i0X000X0O:I

    :cond_2
    :goto_0
    iget v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->i0X000X0O:I

    iput v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XO0X10iO:I

    return-void
.end method

.method public getPaddingLeft()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IXOIIIO:I

    return v0
.end method

.method public getPaddingRight()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IO0II0i:I

    return v0
.end method

.method public final getSelectedItem()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->i11I:I

    return v0
.end method

.method public final iO(Landroid/content/Context;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "context"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    sput-boolean v0, Lcom/android/mltcode/paycertificationapi/gk4;->I0IIOi:Z

    iput-object p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->I1:Landroid/content/Context;

    new-instance v0, Lcom/sma/smartv3/view/WheelView/OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/view/WheelView/OXO1;-><init>(Lcom/sma/smartv3/view/WheelView/WheelView;)V

    iput-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iX1O1:Landroid/os/Handler;

    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/zw;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/zw;-><init>(Lcom/sma/smartv3/view/WheelView/WheelView;)V

    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X11iII1O1:Landroid/view/GestureDetector;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V

    const/high16 v0, 0x40000000    # 2.0f

    iput v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->OX110i:F

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->OO:Z

    const/4 v0, 0x7

    iput v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXiIiX10:I

    const v0, -0x505051

    iput v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X11I:I

    const v0, 0x7f0600b4

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X100O:I

    const p1, -0x3a3a3b

    iput p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XX1Oi:I

    iput v1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X00XIX1:I

    const/4 p1, -0x1

    iput p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->i0X000X0O:I

    invoke-virtual {p0}, Lcom/sma/smartv3/view/WheelView/WheelView;->XO0O10()V

    const/high16 p1, 0x41c00000    # 24.0f

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setTextSize(F)V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 13
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXO:Ljava/util/List;

    if-nez v0, :cond_0

    goto/16 :goto_9

    :cond_0
    iget v1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXiIiX10:I

    new-array v1, v1, [Ljava/lang/String;

    iget v2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X00XIX1:I

    int-to-float v2, v2

    iget v3, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->OX110i:F

    iget v4, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iiiO:I

    int-to-float v4, v4

    mul-float/2addr v3, v4

    div-float/2addr v2, v3

    float-to-int v2, v2

    iput v2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->Ii0X0X:I

    iget v3, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->i0X000X0O:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    rem-int/2addr v2, v0

    add-int/2addr v3, v2

    iput v3, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XO0X10iO:I

    iget-boolean v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->OO:Z

    const/4 v2, 0x0

    if-nez v0, :cond_2

    if-gez v3, :cond_1

    iput v2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XO0X10iO:I

    :cond_1
    iget v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XO0X10iO:I

    iget-object v3, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXO:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-le v0, v3, :cond_4

    iget-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXO:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XO0X10iO:I

    goto :goto_0

    :cond_2
    if-gez v3, :cond_3

    iget-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXO:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v3, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XO0X10iO:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XO0X10iO:I

    :cond_3
    iget v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XO0X10iO:I

    iget-object v3, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXO:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-le v0, v3, :cond_4

    iget v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XO0X10iO:I

    iget-object v3, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXO:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v0, v3

    iput v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XO0X10iO:I

    :cond_4
    :goto_0
    iget v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X00XIX1:I

    int-to-float v0, v0

    iget v3, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->OX110i:F

    iget v4, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iiiO:I

    int-to-float v4, v4

    mul-float/2addr v3, v4

    rem-float/2addr v0, v3

    float-to-int v0, v0

    move v3, v2

    :goto_1
    iget v4, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXiIiX10:I

    if-ge v3, v4, :cond_a

    iget v5, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XO0X10iO:I

    div-int/lit8 v4, v4, 0x2

    sub-int/2addr v4, v3

    sub-int/2addr v5, v4

    iget-boolean v4, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->OO:Z

    if-eqz v4, :cond_7

    :goto_2
    if-gez v5, :cond_5

    iget-object v4, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXO:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    add-int/2addr v5, v4

    goto :goto_2

    :cond_5
    :goto_3
    iget-object v4, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXO:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-le v5, v4, :cond_6

    iget-object v4, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXO:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v5, v4

    goto :goto_3

    :cond_6
    iget-object v4, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXO:Ljava/util/List;

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    aput-object v4, v1, v3

    goto :goto_4

    :cond_7
    const-string v4, ""

    if-gez v5, :cond_8

    aput-object v4, v1, v3

    goto :goto_4

    :cond_8
    iget-object v6, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXO:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    if-le v5, v6, :cond_9

    aput-object v4, v1, v3

    goto :goto_4

    :cond_9
    iget-object v4, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXO:Ljava/util/List;

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    aput-object v4, v1, v3

    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_a
    move v3, v2

    :goto_5
    iget v4, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXiIiX10:I

    if-ge v3, v4, :cond_10

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget v4, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iiiO:I

    int-to-float v4, v4

    iget v5, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->OX110i:F

    mul-float/2addr v4, v5

    int-to-float v5, v3

    mul-float/2addr v5, v4

    int-to-float v6, v0

    sub-float/2addr v5, v6

    float-to-double v5, v5

    const-wide v7, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v5, v7

    iget v9, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->Ii0i:I

    int-to-double v9, v9

    div-double/2addr v5, v9

    div-double v7, v5, v7

    const-wide v9, 0x4066800000000000L    # 180.0

    mul-double/2addr v7, v9

    const-wide v9, 0x4056800000000000L    # 90.0

    sub-double/2addr v9, v7

    double-to-float v7, v9

    const/high16 v8, 0x42b40000    # 90.0f

    cmpl-float v8, v7, v8

    if-gez v8, :cond_f

    const/high16 v8, -0x3d4c0000    # -90.0f

    cmpg-float v7, v7, v8

    if-gtz v7, :cond_b

    goto/16 :goto_7

    :cond_b
    iget v7, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IXI:I

    int-to-double v7, v7

    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v9

    iget v11, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IXI:I

    int-to-double v11, v11

    mul-double/2addr v9, v11

    sub-double/2addr v7, v9

    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    move-result-wide v9

    iget v11, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iiiO:I

    int-to-double v11, v11

    mul-double/2addr v9, v11

    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    div-double/2addr v9, v11

    sub-double/2addr v7, v9

    double-to-int v7, v7

    const/4 v8, 0x0

    int-to-float v9, v7

    invoke-virtual {p1, v8, v9}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    move-result-wide v5

    double-to-float v5, v5

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-virtual {p1, v6, v5}, Landroid/graphics/Canvas;->scale(FF)V

    iget v5, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOX0O0:I

    if-gt v7, v5, :cond_c

    iget v6, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iiiO:I

    add-int/2addr v6, v7

    if-lt v6, v5, :cond_c

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget v5, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X1:I

    iget v6, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOX0O0:I

    sub-int/2addr v6, v7

    invoke-virtual {p1, v2, v2, v5, v6}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    aget-object v5, v1, v3

    iget-object v6, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iIXi1iiXI:Landroid/graphics/Paint;

    iget-object v8, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOO0XOOii:Landroid/graphics/Rect;

    invoke-virtual {p0, v5, v6, v8}, Lcom/sma/smartv3/view/WheelView/WheelView;->XIi00iiXO(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Rect;)I

    move-result v6

    int-to-float v6, v6

    iget v8, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iiiO:I

    int-to-float v8, v8

    iget-object v9, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iIXi1iiXI:Landroid/graphics/Paint;

    invoke-virtual {p1, v5, v6, v8, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget v5, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOX0O0:I

    sub-int/2addr v5, v7

    iget v6, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X1:I

    float-to-int v4, v4

    invoke-virtual {p1, v2, v5, v6, v4}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    aget-object v4, v1, v3

    iget-object v5, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iXiX011:Landroid/graphics/Paint;

    iget-object v6, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOO0XOOii:Landroid/graphics/Rect;

    invoke-virtual {p0, v4, v5, v6}, Lcom/sma/smartv3/view/WheelView/WheelView;->XIi00iiXO(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Rect;)I

    move-result v5

    int-to-float v5, v5

    iget v6, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iiiO:I

    int-to-float v6, v6

    iget-object v7, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iXiX011:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v5, v6, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    goto/16 :goto_6

    :cond_c
    iget v6, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iOiXi11II:I

    if-gt v7, v6, :cond_d

    iget v8, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iiiO:I

    add-int/2addr v8, v7

    if-lt v8, v6, :cond_d

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget v5, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X1:I

    iget v6, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iOiXi11II:I

    sub-int/2addr v6, v7

    invoke-virtual {p1, v2, v2, v5, v6}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    aget-object v5, v1, v3

    iget-object v6, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iXiX011:Landroid/graphics/Paint;

    iget-object v8, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOO0XOOii:Landroid/graphics/Rect;

    invoke-virtual {p0, v5, v6, v8}, Lcom/sma/smartv3/view/WheelView/WheelView;->XIi00iiXO(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Rect;)I

    move-result v6

    int-to-float v6, v6

    iget v8, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iiiO:I

    int-to-float v8, v8

    iget-object v9, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iXiX011:Landroid/graphics/Paint;

    invoke-virtual {p1, v5, v6, v8, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget v5, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iOiXi11II:I

    sub-int/2addr v5, v7

    iget v6, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X1:I

    float-to-int v4, v4

    invoke-virtual {p1, v2, v5, v6, v4}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    aget-object v4, v1, v3

    iget-object v5, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iIXi1iiXI:Landroid/graphics/Paint;

    iget-object v6, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOO0XOOii:Landroid/graphics/Rect;

    invoke-virtual {p0, v4, v5, v6}, Lcom/sma/smartv3/view/WheelView/WheelView;->XIi00iiXO(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Rect;)I

    move-result v5

    int-to-float v5, v5

    iget v6, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iiiO:I

    int-to-float v6, v6

    iget-object v7, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iIXi1iiXI:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v5, v6, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_6

    :cond_d
    if-lt v7, v5, :cond_e

    iget v5, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iiiO:I

    add-int/2addr v5, v7

    if-gt v5, v6, :cond_e

    iget v5, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X1:I

    float-to-int v4, v4

    invoke-virtual {p1, v2, v2, v5, v4}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    aget-object v4, v1, v3

    iget-object v5, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iXiX011:Landroid/graphics/Paint;

    iget-object v6, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOO0XOOii:Landroid/graphics/Rect;

    invoke-virtual {p0, v4, v5, v6}, Lcom/sma/smartv3/view/WheelView/WheelView;->XIi00iiXO(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Rect;)I

    move-result v5

    int-to-float v5, v5

    iget v6, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iiiO:I

    int-to-float v6, v6

    iget-object v7, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iXiX011:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v5, v6, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget-object v4, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXO:Ljava/util/List;

    aget-object v5, v1, v3

    invoke-interface {v4, v5}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v4

    iput v4, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->i11I:I

    goto :goto_6

    :cond_e
    iget v5, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X1:I

    float-to-int v4, v4

    invoke-virtual {p1, v2, v2, v5, v4}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    aget-object v4, v1, v3

    iget-object v5, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iIXi1iiXI:Landroid/graphics/Paint;

    iget-object v6, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOO0XOOii:Landroid/graphics/Rect;

    invoke-virtual {p0, v4, v5, v6}, Lcom/sma/smartv3/view/WheelView/WheelView;->XIi00iiXO(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Rect;)I

    move-result v5

    int-to-float v5, v5

    iget v6, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iiiO:I

    int-to-float v6, v6

    iget-object v7, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iIXi1iiXI:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v5, v6, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :goto_6
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_8

    :cond_f
    :goto_7
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :goto_8
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_5

    :cond_10
    :goto_9
    return-void
.end method

.method public onMeasure(II)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "widthMeasureSpec",
            "heightMeasureSpec"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-virtual {p0}, Lcom/sma/smartv3/view/WheelView/WheelView;->XOO0ii0()V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X1:I

    iget p2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X00Xi1X:I

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "event"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X11iII1O1:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    iget v1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->OX110i:F

    iget v2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iiiO:I

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    const/4 v4, 0x2

    if-eq v2, v4, :cond_1

    if-nez v0, :cond_4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iget v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IXI:I

    int-to-float v2, v0

    sub-float/2addr v2, p1

    int-to-float p1, v0

    div-float/2addr v2, p1

    float-to-double v5, v2

    invoke-static {v5, v6}, Ljava/lang/Math;->acos(D)D

    move-result-wide v5

    iget p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IXI:I

    int-to-double v7, p1

    mul-double/2addr v5, v7

    const/high16 p1, 0x40000000    # 2.0f

    div-float p1, v1, p1

    float-to-double v7, p1

    add-double/2addr v5, v7

    float-to-double v7, v1

    div-double/2addr v5, v7

    double-to-int p1, v5

    iget v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X00XIX1:I

    int-to-float v0, v0

    rem-float/2addr v0, v1

    add-float/2addr v0, v1

    rem-float/2addr v0, v1

    iget v2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXiIiX10:I

    div-int/2addr v2, v4

    sub-int/2addr p1, v2

    int-to-float p1, p1

    mul-float/2addr p1, v1

    sub-float/2addr p1, v0

    float-to-int p1, p1

    iput p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IiiXiI0I:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v4, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOXiX0:J

    sub-long/2addr v0, v4

    const-wide/16 v4, 0x78

    cmp-long p1, v0, v4

    if-lez p1, :cond_0

    sget-object p1, Lcom/sma/smartv3/view/WheelView/WheelView$ACTION;->DAGGLE:Lcom/sma/smartv3/view/WheelView/WheelView$ACTION;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/WheelView/WheelView;->OIX0iXi(Lcom/sma/smartv3/view/WheelView/WheelView$ACTION;)V

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/sma/smartv3/view/WheelView/WheelView$ACTION;->CLICK:Lcom/sma/smartv3/view/WheelView/WheelView$ACTION;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/WheelView/WheelView;->OIX0iXi(Lcom/sma/smartv3/view/WheelView/WheelView$ACTION;)V

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOIX:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    sub-float/2addr v0, v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOIX:F

    iget p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X00XIX1:I

    int-to-float p1, p1

    add-float/2addr p1, v0

    float-to-int p1, p1

    iput p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X00XIX1:I

    iget-boolean p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->OO:Z

    if-nez p1, :cond_4

    iget p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->i0X000X0O:I

    neg-int p1, p1

    int-to-float p1, p1

    mul-float/2addr p1, v1

    iget-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXO:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v3

    iget v2, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->i0X000X0O:I

    sub-int/2addr v0, v2

    int-to-float v0, v0

    mul-float/2addr v0, v1

    iget v1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X00XIX1:I

    int-to-float v2, v1

    cmpg-float v2, v2, p1

    if-gez v2, :cond_2

    float-to-int p1, p1

    iput p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X00XIX1:I

    goto :goto_0

    :cond_2
    int-to-float p1, v1

    cmpl-float p1, p1, v0

    if-lez p1, :cond_4

    float-to-int p1, v0

    iput p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X00XIX1:I

    goto :goto_0

    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOXiX0:J

    invoke-virtual {p0}, Lcom/sma/smartv3/view/WheelView/WheelView;->OXO1()V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XOIX:F

    :cond_4
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return v3
.end method

.method public final setInitPosition(I)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "initPosition"
        }
    .end annotation

    const/4 v0, 0x0

    iput v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->X00XIX1:I

    if-gez p1, :cond_0

    iput v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->i0X000X0O:I

    return-void

    :cond_0
    iput p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->i0X000X0O:I

    return-void
.end method

.method public final setItems(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "items"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXO:Ljava/util/List;

    iget v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->i0X000X0O:I

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-le v0, v1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->i0X000X0O:I

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/view/WheelView/WheelView;->XOO0ii0()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setListener(Lcom/android/mltcode/paycertificationapi/dg1;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "OnItemSelectedListener"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXX11i:Lcom/android/mltcode/paycertificationapi/dg1;

    return-void
.end method

.method public final setScaleX(F)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "scaleX"
        }
    .end annotation

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    iput p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->IO:F

    iget-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iXiX011:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextScaleX(F)V

    :cond_0
    return-void
.end method

.method public final setTextSize(F)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "size"
        }
    .end annotation

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->I1:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, p1

    float-to-int p1, v0

    iput p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iXiiiO:I

    iget-object v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iIXi1iiXI:Landroid/graphics/Paint;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iXiX011:Landroid/graphics/Paint;

    iget v0, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->iXiiiO:I

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    :cond_0
    return-void
.end method

.method public setVisibleCount(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "count"
        }
    .end annotation

    add-int/lit8 p1, p1, 0x2

    iput p1, p0, Lcom/sma/smartv3/view/WheelView/WheelView;->XXiIiX10:I

    return-void
.end method
