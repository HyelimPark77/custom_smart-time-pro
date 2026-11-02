.class public Lcom/sma/smartv3/view/ProgressCalendarView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/ProgressCalendarView$XIi00iiXO;,
        Lcom/sma/smartv3/view/ProgressCalendarView$OXO1;
    }
.end annotation


# instance fields
.field public I1:Landroid/content/Context;

.field public IO:[Ljava/lang/String;

.field public IO0II0i:I

.field public IXOIIIO:I

.field public Ii0X0X:Landroid/graphics/Paint;

.field public Ii1iii0:Ljava/util/Calendar;

.field public O001I:I

.field public OO:I

.field public OX110i:I

.field public X00XIX1:Lcom/sma/smartv3/view/ProgressCalendarView$OXO1;

.field public X00Xi1X:F

.field public X0i1O:I

.field public X1:F

.field public X100O:Ljava/util/Calendar;

.field public X11I:Ljava/util/Calendar;

.field public X11iII1O1:I

.field public X1IX:I

.field public XO0X10iO:Landroid/graphics/Paint;

.field public XOX0O0:I

.field public XX1Oi:I

.field public XXO:I

.field public XXX11i:Landroid/graphics/Rect;

.field public XXiIiX10:Landroid/graphics/RectF;

.field public i0X000X0O:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/sma/smartv3/view/ProgressCalendarView$XIi00iiXO;",
            ">;"
        }
    .end annotation
.end field

.field public i11I:I

.field public iIXi1iiXI:I

.field public iOiXi11II:Landroid/widget/LinearLayout$LayoutParams;

.field public iX1O1:Landroid/graphics/Paint;

.field public iXiX011:I

.field public iXiiiO:Ljava/util/Date;

.field public iiiO:Ljava/util/Calendar;


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
    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/view/ProgressCalendarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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
    invoke-direct {p0, p1, p2, v0}, Lcom/sma/smartv3/view/ProgressCalendarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3
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
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iX1O1:Landroid/graphics/Paint;

    .line 5
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->XXX11i:Landroid/graphics/Rect;

    .line 6
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->Ii1iii0:Ljava/util/Calendar;

    .line 7
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iiiO:Ljava/util/Calendar;

    .line 8
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->X11I:Ljava/util/Calendar;

    .line 9
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->X100O:Ljava/util/Calendar;

    const/4 p2, -0x1

    .line 10
    iput p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->OX110i:I

    iput p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->OO:I

    .line 11
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 p3, 0x0

    invoke-direct {p2, p3, p3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iOiXi11II:Landroid/widget/LinearLayout$LayoutParams;

    .line 12
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->i0X000X0O:Ljava/util/Map;

    const/16 p2, 0x64

    .line 13
    iput p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->i11I:I

    .line 14
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->XO0X10iO:Landroid/graphics/Paint;

    .line 15
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->Ii0X0X:Landroid/graphics/Paint;

    .line 16
    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->XXiIiX10:Landroid/graphics/RectF;

    const/high16 p2, 0x40800000    # 4.0f

    .line 17
    iput p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->X1:F

    .line 18
    iput-object p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->I1:Landroid/content/Context;

    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f030055

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->IO:[Ljava/lang/String;

    .line 20
    iget-object p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iX1O1:Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 21
    iget-object p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setDither(Z)V

    .line 22
    iget-object p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iX1O1:Landroid/graphics/Paint;

    const/high16 v1, 0x41600000    # 14.0f

    invoke-static {p1, v1}, Lcom/android/mltcode/paycertificationapi/OXI1i1;->I0IIOi(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 23
    iget-object p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iX1O1:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 24
    iget-object p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iX1O1:Landroid/graphics/Paint;

    const-string v1, "\u65e5\u65e5\u65e5"

    iget-object v2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->XXX11i:Landroid/graphics/Rect;

    invoke-virtual {p2, v1, p3, v0, v2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 25
    iget-object p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iX1O1:Landroid/graphics/Paint;

    iget-object p3, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->I1:Landroid/content/Context;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p3, v1}, Lcom/android/mltcode/paycertificationapi/OXI1i1;->XIi00iiXO(Landroid/content/Context;F)I

    move-result p3

    int-to-float p3, p3

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 26
    iget-object p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->XXX11i:Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result p2

    int-to-double p2, p2

    const-wide/high16 v1, 0x4008000000000000L    # 3.0

    mul-double/2addr p2, v1

    double-to-int p2, p2

    iput p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iXiX011:I

    .line 27
    div-int/lit8 p2, p2, 0x2

    iget-object p3, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->XXX11i:Landroid/graphics/Rect;

    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    add-int/2addr p2, p3

    iput p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->XXO:I

    const p2, 0x7f0600b4

    .line 28
    invoke-static {p1, p2}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->X11iII1O1:I

    .line 29
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/ProgressCalendarView;->setMax(Ljava/util/Calendar;)V

    .line 30
    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->XO0X10iO:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 31
    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->XO0X10iO:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 32
    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->XO0X10iO:Landroid/graphics/Paint;

    iget p3, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->X1:F

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 33
    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->XO0X10iO:Landroid/graphics/Paint;

    iget-object p3, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->I1:Landroid/content/Context;

    const v1, 0x7f06010e

    invoke-static {p3, v1}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result p3

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 34
    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->Ii0X0X:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 35
    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->Ii0X0X:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 36
    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->Ii0X0X:Landroid/graphics/Paint;

    iget p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->X1:F

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 37
    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->Ii0X0X:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 38
    invoke-virtual {p0}, Lcom/sma/smartv3/view/ProgressCalendarView;->XO0O10()V

    return-void
.end method


# virtual methods
.method public I0IIOi(J)Lcom/sma/smartv3/view/ProgressCalendarView$XIi00iiXO;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "timestamp"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->i0X000X0O:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/view/ProgressCalendarView$XIi00iiXO;

    return-object p1
.end method

.method public I0iXXO()V
    .locals 1

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/view/ProgressCalendarView;->OXO1(I)V

    return-void
.end method

.method public IO(III)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "year",
            "month",
            "day"
        }
    .end annotation

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/Calendar;->set(III)V

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/ProgressCalendarView;->setDate(Ljava/util/Date;)V

    return-void
.end method

.method public final IiI10X(J)J
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "timestamp"
        }
    .end annotation

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    const/16 p1, 0xb

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->set(II)V

    const/16 p1, 0xc

    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->set(II)V

    const/16 p1, 0xd

    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->set(II)V

    const/16 p1, 0xe

    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->set(II)V

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide p1

    return-wide p1
.end method

.method public O00()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->i0X000X0O:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public OIX0iXi(III)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "year",
            "month",
            "day"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->OX110i:I

    iput p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->OO:I

    iput p3, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->XOX0O0:I

    iget-object v0, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->X100O:Ljava/util/Calendar;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/Calendar;->set(III)V

    return-void
.end method

.method public OIi0(J)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "timestamp"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->i0X000X0O:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final OXO1(I)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "count"
        }
    .end annotation

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iXiiiO:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1}, Ljava/util/Calendar;->add(II)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/view/ProgressCalendarView;->setDate(Ljava/util/Calendar;)V

    return-void
.end method

.method public XIi00iiXO(JII)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "timestamp",
            "progress",
            "color"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->i0X000X0O:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    new-instance p2, Lcom/sma/smartv3/view/ProgressCalendarView$XIi00iiXO;

    invoke-direct {p2, p3, p4}, Lcom/sma/smartv3/view/ProgressCalendarView$XIi00iiXO;-><init>(II)V

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public XO0O10()V
    .locals 0

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final XOO0ii0(FF)I
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "x",
            "y"
        }
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iXiX011:I

    int-to-float v0, v0

    div-float/2addr p2, v0

    float-to-int p2, p2

    add-int/lit8 p2, p2, -0x1

    iget v0, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iIXi1iiXI:I

    int-to-float v0, v0

    div-float/2addr p1, v0

    float-to-int p1, p1

    mul-int/lit8 p2, p2, 0x7

    add-int/2addr p2, p1

    return p2
.end method

.method public XXI()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/view/ProgressCalendarView;->OXO1(I)V

    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 13
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "event"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1, p1}, Lcom/sma/smartv3/view/ProgressCalendarView;->XOO0ii0(FF)I

    move-result p1

    if-ltz p1, :cond_3

    iget v0, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->O001I:I

    mul-int/lit8 v0, v0, 0x7

    if-ge p1, v0, :cond_3

    iget v0, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->XX1Oi:I

    rsub-int/lit8 v0, v0, 0x1

    add-int/2addr v0, p1

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    iget v1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->IXOIIIO:I

    iget v3, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->IO0II0i:I

    invoke-virtual {p1, v1, v3, v0}, Ljava/util/Calendar;->set(III)V

    invoke-virtual {p1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v1

    iget v3, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->IXOIIIO:I

    if-ne v1, v3, :cond_3

    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    iget v3, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->IO0II0i:I

    if-eq v1, v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v3

    const-wide/16 v5, 0x3e8

    div-long/2addr v3, v5

    const-wide/16 v7, 0x3c

    div-long/2addr v3, v7

    div-long/2addr v3, v7

    const-wide/16 v9, 0x18

    div-long/2addr v3, v9

    iget-object v1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->X100O:Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v11

    div-long/2addr v11, v5

    div-long/2addr v11, v7

    div-long/2addr v11, v7

    div-long/2addr v11, v9

    cmp-long v1, v3, v11

    if-lez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->X00XIX1:Lcom/sma/smartv3/view/ProgressCalendarView$OXO1;

    if-eqz v1, :cond_3

    iget v3, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->IXOIIIO:I

    iget v4, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->IO0II0i:I

    invoke-interface {v1, p1, v3, v4, v0}, Lcom/sma/smartv3/view/ProgressCalendarView$OXO1;->onDateSelected(Ljava/util/Calendar;III)V

    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->Ii1iii0:Ljava/util/Calendar;

    const/4 v1, 0x5

    invoke-virtual {p1, v1, v0}, Ljava/util/Calendar;->set(II)V

    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->Ii1iii0:Ljava/util/Calendar;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/ProgressCalendarView;->setDate(Ljava/util/Calendar;)V

    nop

    :cond_3
    :goto_0
    return v2
.end method

.method public getDate()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iXiiiO:Ljava/util/Date;

    return-object v0
.end method

.method public getMaxProgress()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->i11I:I

    return v0
.end method

.method public iO(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "dataMap"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/sma/smartv3/view/ProgressCalendarView$XIi00iiXO;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->i0X000X0O:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->i0X000X0O:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-object v0, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iXiiiO:Ljava/util/Date;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/view/ProgressCalendarView;->setDate(Ljava/util/Calendar;)V

    :cond_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 16
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v7, 0x7

    if-ge v3, v7, :cond_0

    iget-object v4, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->IO:[Ljava/lang/String;

    aget-object v4, v4, v3

    iget v5, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->iIXi1iiXI:I

    div-int/lit8 v6, v5, 0x2

    mul-int/2addr v5, v3

    add-int/2addr v6, v5

    int-to-float v5, v6

    iget v6, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->XXO:I

    int-to-float v6, v6

    iget-object v7, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {v1, v4, v5, v6, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X11I:Ljava/util/Calendar;

    iget-object v4, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-virtual {v4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X11I:Ljava/util/Calendar;

    iget v4, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->O001I:I

    neg-int v4, v4

    const/4 v8, 0x1

    add-int/2addr v4, v8

    mul-int/2addr v4, v7

    const/4 v9, 0x5

    invoke-virtual {v3, v9, v4}, Ljava/util/Calendar;->add(II)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v10

    move v11, v2

    :goto_1
    iget v2, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->O001I:I

    mul-int/2addr v2, v7

    if-ge v11, v2, :cond_8

    iget-object v2, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {v2, v9, v8}, Ljava/util/Calendar;->add(II)V

    iget-object v2, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {v2, v9}, Ljava/util/Calendar;->get(I)I

    move-result v12

    rem-int/lit8 v2, v11, 0x7

    div-int/lit8 v3, v11, 0x7

    add-int/lit8 v13, v3, 0x1

    int-to-double v2, v2

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    add-double/2addr v2, v4

    iget v4, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->iIXi1iiXI:I

    int-to-double v4, v4

    mul-double/2addr v2, v4

    double-to-float v14, v2

    iget v2, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->XXO:I

    iget v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->iXiX011:I

    mul-int/2addr v3, v13

    add-int/2addr v2, v3

    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->XXX11i:Landroid/graphics/Rect;

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v3

    const/4 v4, 0x2

    div-int/2addr v3, v4

    sub-int/2addr v2, v3

    int-to-float v2, v2

    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {v3, v8}, Ljava/util/Calendar;->get(I)I

    move-result v3

    iget v5, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->IXOIIIO:I

    if-ne v3, v5, :cond_7

    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {v3, v4}, Ljava/util/Calendar;->get(I)I

    move-result v3

    iget v5, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->IO0II0i:I

    if-ne v3, v5, :cond_7

    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {v3, v8}, Ljava/util/Calendar;->get(I)I

    move-result v3

    iget-object v5, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->Ii1iii0:Ljava/util/Calendar;

    invoke-virtual {v5, v8}, Ljava/util/Calendar;->get(I)I

    move-result v5

    if-ne v3, v5, :cond_4

    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {v3, v4}, Ljava/util/Calendar;->get(I)I

    move-result v3

    iget-object v5, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->Ii1iii0:Ljava/util/Calendar;

    invoke-virtual {v5, v4}, Ljava/util/Calendar;->get(I)I

    move-result v5

    if-ne v3, v5, :cond_4

    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {v3, v9}, Ljava/util/Calendar;->get(I)I

    move-result v3

    iget-object v5, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->Ii1iii0:Ljava/util/Calendar;

    invoke-virtual {v5, v9}, Ljava/util/Calendar;->get(I)I

    move-result v5

    if-ne v3, v5, :cond_4

    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {v3, v8}, Ljava/util/Calendar;->get(I)I

    move-result v3

    iget-object v5, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X100O:Ljava/util/Calendar;

    invoke-virtual {v5, v8}, Ljava/util/Calendar;->get(I)I

    move-result v5

    if-le v3, v5, :cond_1

    goto :goto_2

    :cond_1
    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {v3, v8}, Ljava/util/Calendar;->get(I)I

    move-result v3

    iget-object v5, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X100O:Ljava/util/Calendar;

    invoke-virtual {v5, v8}, Ljava/util/Calendar;->get(I)I

    move-result v5

    if-ne v3, v5, :cond_2

    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {v3, v4}, Ljava/util/Calendar;->get(I)I

    move-result v3

    iget-object v5, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X100O:Ljava/util/Calendar;

    invoke-virtual {v5, v4}, Ljava/util/Calendar;->get(I)I

    move-result v5

    if-le v3, v5, :cond_2

    goto :goto_2

    :cond_2
    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {v3, v8}, Ljava/util/Calendar;->get(I)I

    move-result v3

    iget-object v5, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X100O:Ljava/util/Calendar;

    invoke-virtual {v5, v8}, Ljava/util/Calendar;->get(I)I

    move-result v5

    if-ne v3, v5, :cond_3

    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {v3, v4}, Ljava/util/Calendar;->get(I)I

    move-result v3

    iget-object v5, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X100O:Ljava/util/Calendar;

    invoke-virtual {v5, v4}, Ljava/util/Calendar;->get(I)I

    move-result v4

    if-ne v3, v4, :cond_3

    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {v3, v9}, Ljava/util/Calendar;->get(I)I

    move-result v3

    iget-object v4, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X100O:Ljava/util/Calendar;

    invoke-virtual {v4, v9}, Ljava/util/Calendar;->get(I)I

    move-result v4

    if-le v3, v4, :cond_3

    goto :goto_2

    :cond_3
    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->iX1O1:Landroid/graphics/Paint;

    iget v4, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X11iII1O1:I

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->iX1O1:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getTextSize()F

    move-result v3

    iget-object v4, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {v1, v14, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :goto_2
    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->iX1O1:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    :cond_4
    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->XO0X10iO:Landroid/graphics/Paint;

    iget-object v4, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->I1:Landroid/content/Context;

    const v5, 0x7f06010e

    invoke-static {v4, v5}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->XXiIiX10:Landroid/graphics/RectF;

    iget v4, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X00Xi1X:F

    sub-float v5, v14, v4

    sub-float v6, v2, v4

    add-float v15, v14, v4

    add-float/2addr v2, v4

    invoke-virtual {v3, v5, v6, v15, v2}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v2, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->XXiIiX10:Landroid/graphics/RectF;

    const/4 v5, 0x0

    iget-object v6, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->XO0X10iO:Landroid/graphics/Paint;

    const/high16 v3, -0x3d4c0000    # -90.0f

    const/high16 v4, 0x43b40000    # 360.0f

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-object v1, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/sma/smartv3/view/ProgressCalendarView;->IiI10X(J)J

    move-result-wide v1

    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->i0X000X0O:Ljava/util/Map;

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->i0X000X0O:Ljava/util/Map;

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/view/ProgressCalendarView$XIi00iiXO;

    iget v2, v1, Lcom/sma/smartv3/view/ProgressCalendarView$XIi00iiXO;->OXO1:I

    iget v1, v1, Lcom/sma/smartv3/view/ProgressCalendarView$XIi00iiXO;->XIi00iiXO:I

    int-to-float v2, v2

    iget v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->i11I:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    const/4 v3, 0x0

    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    cmpl-float v3, v2, v3

    if-lez v3, :cond_5

    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->Ii0X0X:Landroid/graphics/Paint;

    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float v4, v2, v1

    iget-object v2, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->XXiIiX10:Landroid/graphics/RectF;

    const/4 v5, 0x0

    iget-object v6, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->Ii0X0X:Landroid/graphics/Paint;

    const/high16 v3, -0x3d4c0000    # -90.0f

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    goto :goto_3

    :cond_5
    move-object/from16 v1, p1

    :goto_3
    invoke-virtual {v10}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    iget-object v4, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {v4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-lez v2, :cond_6

    iget-object v2, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->iX1O1:Landroid/graphics/Paint;

    iget-object v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->I1:Landroid/content/Context;

    const v4, 0x7f06074b

    invoke-static {v3, v4}, Lcom/android/mltcode/paycertificationapi/gk4;->iO(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_4

    :cond_6
    iget-object v2, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->iX1O1:Landroid/graphics/Paint;

    const v3, -0x777778

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    :goto_4
    iget v2, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->XXO:I

    iget v3, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->iXiX011:I

    mul-int/2addr v13, v3

    add-int/2addr v2, v13

    int-to-float v2, v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Lcom/sma/smartv3/view/ProgressCalendarView;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {v1, v3, v14, v2, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_7
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_1

    :cond_8
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

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->X1IX:I

    div-int/lit8 p1, p1, 0x7

    iput p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iIXi1iiXI:I

    int-to-float p1, p1

    const p2, 0x3e99999a    # 0.3f

    mul-float/2addr p1, p2

    iput p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->X00Xi1X:F

    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->I1:Landroid/content/Context;

    const/high16 p2, 0x40400000    # 3.0f

    invoke-static {p1, p2}, Lcom/android/mltcode/paycertificationapi/OXI1i1;->XIi00iiXO(Landroid/content/Context;F)I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->X1:F

    iget-object p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->XO0X10iO:Landroid/graphics/Paint;

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->Ii0X0X:Landroid/graphics/Paint;

    iget p2, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->X1:F

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method public setDate(Ljava/util/Calendar;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "cal"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/ProgressCalendarView;->setDate(Ljava/util/Date;)V

    return-void
.end method

.method public setDate(Ljava/util/Date;)V
    .locals 8
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "data"
        }
    .end annotation

    .line 2
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 4
    iget v1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->OX110i:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    const/4 v4, -0x1

    if-eq v1, v4, :cond_2

    iget v1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->OO:I

    if-eq v1, v4, :cond_2

    .line 5
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v1

    .line 6
    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v0

    .line 7
    iget v5, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->OX110i:I

    const v6, 0x7f14100e

    if-le v1, v5, :cond_0

    .line 8
    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->X00XIX1:Lcom/sma/smartv3/view/ProgressCalendarView$OXO1;

    if-eqz p1, :cond_1

    .line 9
    iget-object v0, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->I1:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/sma/smartv3/view/ProgressCalendarView$OXO1;->onInteractivePrompts(Ljava/lang/String;)V

    return-void

    :cond_0
    if-ne v1, v5, :cond_2

    .line 10
    iget v1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->OO:I

    if-le v0, v1, :cond_2

    .line 11
    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->X00XIX1:Lcom/sma/smartv3/view/ProgressCalendarView$OXO1;

    if-eqz p1, :cond_1

    .line 12
    iget-object v0, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->I1:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/sma/smartv3/view/ProgressCalendarView$OXO1;->onInteractivePrompts(Ljava/lang/String;)V

    :cond_1
    return-void

    .line 13
    :cond_2
    iput-object p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iXiiiO:Ljava/util/Date;

    .line 14
    iget-object v0, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->Ii1iii0:Ljava/util/Calendar;

    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 15
    iget-object v0, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->Ii1iii0:Ljava/util/Calendar;

    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->IXOIIIO:I

    .line 16
    iget-object v0, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->Ii1iii0:Ljava/util/Calendar;

    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->IO0II0i:I

    .line 17
    iget-object v0, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 18
    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iiiO:Ljava/util/Calendar;

    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v1

    neg-int v1, v1

    add-int/2addr v1, v2

    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 19
    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iiiO:Ljava/util/Calendar;

    const/4 v1, 0x7

    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I

    move-result p1

    if-ge p1, v3, :cond_3

    const/4 p1, 0x6

    goto :goto_0

    :cond_3
    sub-int/2addr p1, v3

    .line 20
    :goto_0
    iput p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->XX1Oi:I

    .line 21
    iget-object v5, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-virtual {v5, v3, v2}, Ljava/util/Calendar;->add(II)V

    .line 22
    iget-object v5, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-virtual {v5, v0, v4}, Ljava/util/Calendar;->add(II)V

    .line 23
    iget-object v4, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v4

    add-int/2addr p1, v4

    int-to-float p1, p1

    const/high16 v4, 0x3f800000    # 1.0f

    mul-float/2addr p1, v4

    const/high16 v4, 0x40e00000    # 7.0f

    div-float/2addr p1, v4

    float-to-double v4, p1

    .line 24
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int p1, v4

    add-int/2addr p1, v2

    iput p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->O001I:I

    .line 25
    iget v4, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iXiX011:I

    mul-int/2addr v4, p1

    iput v4, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->X0i1O:I

    .line 26
    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I

    move-result p1

    if-ge p1, v3, :cond_4

    const/4 p1, 0x0

    goto :goto_1

    :cond_4
    rsub-int/lit8 p1, p1, 0x8

    .line 27
    :goto_1
    iget-object v1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-virtual {v1, v0, p1}, Ljava/util/Calendar;->add(II)V

    .line 28
    iget-object p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->X00XIX1:Lcom/sma/smartv3/view/ProgressCalendarView$OXO1;

    if-eqz p1, :cond_5

    .line 29
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    .line 30
    iget-object v1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->Ii1iii0:Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 31
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    iget-object v1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->X100O:Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    cmp-long v1, v4, v6

    if-gez v1, :cond_5

    .line 32
    iget-object v1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->X00XIX1:Lcom/sma/smartv3/view/ProgressCalendarView$OXO1;

    invoke-virtual {p1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-virtual {p1, v3}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 33
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    .line 34
    invoke-interface {v1, p1, v2, v3, v0}, Lcom/sma/smartv3/view/ProgressCalendarView$OXO1;->onMonthChange(Ljava/util/Calendar;III)V

    .line 35
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setMax(Ljava/util/Calendar;)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "cal"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/4 v2, 0x5

    invoke-virtual {p1, v2}, Ljava/util/Calendar;->get(I)I

    move-result p1

    invoke-virtual {p0, v0, v1, p1}, Lcom/sma/smartv3/view/ProgressCalendarView;->OIX0iXi(III)V

    return-void
.end method

.method public setMaxProgress(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "maxProgress"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->i11I:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setOnDateSelectedListener(Lcom/sma/smartv3/view/ProgressCalendarView$OXO1;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "listener"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/ProgressCalendarView;->X00XIX1:Lcom/sma/smartv3/view/ProgressCalendarView$OXO1;

    return-void
.end method
