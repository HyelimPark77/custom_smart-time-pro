.class public Lcom/sma/smartv3/view/ChooseStartCalendarView;
.super Lskin/support/widget/SkinCompatView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/ChooseStartCalendarView$OXO1;
    }
.end annotation


# instance fields
.field public I1:[Ljava/lang/String;

.field public Ii1iii0:Ljava/util/Date;

.field public O001I:I

.field public OO:I

.field public OX110i:Ljava/util/Calendar;

.field public X00XIX1:I

.field public X0i1O:I

.field public X100O:Ljava/util/Calendar;

.field public X11I:Ljava/util/Calendar;

.field public X11iII1O1:Landroid/graphics/Paint;

.field public X1IX:Landroid/graphics/Rect;

.field public XOX0O0:I

.field public XX1Oi:Ljava/util/Calendar;

.field public XXO:I

.field public XXX11i:I

.field public i0X000X0O:Landroid/widget/LinearLayout$LayoutParams;

.field public i11I:Lcom/sma/smartv3/view/ChooseStartCalendarView$OXO1;

.field public iIXi1iiXI:I

.field public iOiXi11II:I

.field public iX1O1:Landroid/content/Context;

.field public iXiX011:I

.field public iXiiiO:I

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
    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/view/ChooseStartCalendarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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
    invoke-direct {p0, p1, p2, v0}, Lcom/sma/smartv3/view/ChooseStartCalendarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    invoke-direct {p0, p1, p2, p3}, Lskin/support/widget/SkinCompatView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11iII1O1:Landroid/graphics/Paint;

    .line 5
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X1IX:Landroid/graphics/Rect;

    .line 6
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iiiO:Ljava/util/Calendar;

    .line 7
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11I:Ljava/util/Calendar;

    .line 8
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X100O:Ljava/util/Calendar;

    .line 9
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->XX1Oi:Ljava/util/Calendar;

    .line 10
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->OX110i:Ljava/util/Calendar;

    const/4 p2, -0x1

    .line 11
    iput p2, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->XOX0O0:I

    iput p2, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iOiXi11II:I

    .line 12
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 p3, 0x0

    invoke-direct {p2, p3, p3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object p2, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->i0X000X0O:Landroid/widget/LinearLayout$LayoutParams;

    .line 13
    iput-object p1, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iX1O1:Landroid/content/Context;

    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f030055

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->I1:[Ljava/lang/String;

    .line 15
    iget-object p2, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11iII1O1:Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 16
    iget-object p2, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setDither(Z)V

    .line 17
    iget-object p2, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11iII1O1:Landroid/graphics/Paint;

    const/high16 v1, 0x41600000    # 14.0f

    invoke-static {p1, v1}, Lcom/android/mltcode/paycertificationapi/OXI1i1;->I0IIOi(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 18
    iget-object p2, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11iII1O1:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 19
    iget-object p2, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11iII1O1:Landroid/graphics/Paint;

    const-string v1, "\u65e5\u65e5\u65e5"

    iget-object v2, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X1IX:Landroid/graphics/Rect;

    invoke-virtual {p2, v1, p3, v0, v2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 20
    iget-object p2, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11iII1O1:Landroid/graphics/Paint;

    iget-object p3, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iX1O1:Landroid/content/Context;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p3, v0}, Lcom/android/mltcode/paycertificationapi/OXI1i1;->XIi00iiXO(Landroid/content/Context;F)I

    move-result p3

    int-to-float p3, p3

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 21
    iget-object p2, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X1IX:Landroid/graphics/Rect;

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result p2

    int-to-double p2, p2

    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    mul-double/2addr p2, v0

    double-to-int p2, p2

    iput p2, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->O001I:I

    .line 22
    div-int/lit8 p2, p2, 0x2

    iget-object p3, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X1IX:Landroid/graphics/Rect;

    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    add-int/2addr p2, p3

    iput p2, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iXiiiO:I

    const p2, 0x7f0600b4

    .line 23
    invoke-direct {p0, p2}, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iO(I)I

    move-result p2

    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->XXX11i:I

    .line 24
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/ChooseStartCalendarView;->setMax(Ljava/util/Calendar;)V

    .line 25
    invoke-virtual {p0}, Lcom/sma/smartv3/view/ChooseStartCalendarView;->applySkin()V

    return-void
.end method

.method private OXO1(I)V
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

    iget-object v1, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->Ii1iii0:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1}, Ljava/util/Calendar;->add(II)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/view/ChooseStartCalendarView;->setDate(Ljava/util/Calendar;)V

    return-void
.end method

.method private XIi00iiXO(FF)I
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

    iget v0, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->O001I:I

    int-to-float v0, v0

    div-float/2addr p2, v0

    float-to-int p2, p2

    add-int/lit8 p2, p2, -0x1

    iget v0, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iXiX011:I

    int-to-float v0, v0

    div-float/2addr p1, v0

    float-to-int p1, p1

    mul-int/lit8 p2, p2, 0x7

    add-int/2addr p2, p1

    return p2
.end method

.method private iO(I)I
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "resId"
        }
    .end annotation

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/ck4;->XIi00iiXO(I)I

    move-result p1

    return p1
.end method


# virtual methods
.method public IiI10X()V
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0, v0}, Lcom/sma/smartv3/view/ChooseStartCalendarView;->OXO1(I)V

    return-void
.end method

.method public O00(III)V
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

    iput p1, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->XOX0O0:I

    iput p2, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iOiXi11II:I

    iput p3, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X00XIX1:I

    iget-object v0, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->XX1Oi:Ljava/util/Calendar;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/Calendar;->set(III)V

    return-void
.end method

.method public XO0O10(III)V
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

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/ChooseStartCalendarView;->setDate(Ljava/util/Date;)V

    return-void
.end method

.method public XOO0ii0()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/sma/smartv3/view/ChooseStartCalendarView;->OXO1(I)V

    return-void
.end method

.method public applySkin()V
    .locals 0

    invoke-super {p0}, Lskin/support/widget/SkinCompatView;->applySkin()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 17
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "event"
        }
    .end annotation

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    const/4 v4, 0x1

    if-eq v1, v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {v0, v2, v3}, Lcom/sma/smartv3/view/ChooseStartCalendarView;->XIi00iiXO(FF)I

    move-result v1

    if-ltz v1, :cond_1

    iget v2, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->XXO:I

    mul-int/lit8 v2, v2, 0x7

    if-ge v1, v2, :cond_1

    iget-object v2, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->i11I:Lcom/sma/smartv3/view/ChooseStartCalendarView$OXO1;

    if-eqz v2, :cond_1

    iget-object v2, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-virtual {v2, v4}, Ljava/util/Calendar;->get(I)I

    move-result v2

    iget-object v3, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iiiO:Ljava/util/Calendar;

    const/4 v5, 0x2

    invoke-virtual {v3, v5}, Ljava/util/Calendar;->get(I)I

    move-result v3

    iget v5, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->OO:I

    rsub-int/lit8 v5, v5, 0x1

    add-int/2addr v5, v1

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v6

    invoke-virtual {v6, v2, v3, v5}, Ljava/util/Calendar;->set(III)V

    invoke-virtual {v6}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v7

    const-wide/16 v9, 0x3e8

    div-long/2addr v7, v9

    const-wide/16 v11, 0x3c

    div-long/2addr v7, v11

    div-long/2addr v7, v11

    const-wide/16 v13, 0x18

    div-long/2addr v7, v13

    iget-object v15, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->XX1Oi:Ljava/util/Calendar;

    invoke-virtual {v15}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v15

    div-long/2addr v15, v9

    div-long/2addr v15, v11

    div-long/2addr v15, v11

    div-long/2addr v15, v13

    cmp-long v7, v7, v15

    if-gez v7, :cond_1

    invoke-virtual {v6}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v7

    div-long/2addr v7, v9

    div-long/2addr v7, v11

    div-long/2addr v7, v11

    div-long/2addr v7, v13

    iget-object v15, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->OX110i:Ljava/util/Calendar;

    invoke-virtual {v15}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v15

    div-long/2addr v15, v9

    div-long/2addr v15, v11

    div-long/2addr v15, v11

    div-long/2addr v15, v13

    cmp-long v7, v7, v15

    if-ltz v7, :cond_1

    iget-object v7, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->i11I:Lcom/sma/smartv3/view/ChooseStartCalendarView$OXO1;

    invoke-interface {v7, v6, v2, v3, v5}, Lcom/sma/smartv3/view/ChooseStartCalendarView$OXO1;->onDateSelected(Ljava/util/Calendar;III)V

    iget-object v2, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iiiO:Ljava/util/Calendar;

    iget v3, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->OO:I

    rsub-int/lit8 v3, v3, 0x1

    add-int/2addr v3, v1

    const/4 v1, 0x5

    invoke-virtual {v2, v1, v3}, Ljava/util/Calendar;->set(II)V

    iget-object v1, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/ChooseStartCalendarView;->setDate(Ljava/util/Calendar;)V

    nop

    :cond_1
    :goto_0
    return v4
.end method

.method public getDate()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->Ii1iii0:Ljava/util/Date;

    return-object v0
.end method

.method public onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-object v0, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->Ii1iii0:Ljava/util/Date;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/view/ChooseStartCalendarView;->setDate(Ljava/util/Calendar;)V

    :cond_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 22
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

    iget-object v2, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->i0X000X0O:Landroid/widget/LinearLayout$LayoutParams;

    iget v3, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X0i1O:I

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->width:I

    iget v3, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iIXi1iiXI:I

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->height:I

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v2, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11iII1O1:Landroid/graphics/Paint;

    iget-object v3, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iX1O1:Landroid/content/Context;

    const v4, 0x7f0600b4

    invoke-static {v3, v4}, Lcom/android/mltcode/paycertificationapi/hl4;->XIi00iiXO(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, 0x7

    if-ge v3, v4, :cond_0

    iget-object v4, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->I1:[Ljava/lang/String;

    aget-object v4, v4, v3

    iget v5, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iXiX011:I

    div-int/lit8 v6, v5, 0x2

    mul-int/2addr v5, v3

    add-int/2addr v6, v5

    int-to-float v5, v6

    iget v6, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iXiiiO:I

    int-to-float v6, v6

    iget-object v7, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {v1, v4, v5, v6, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v3, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X100O:Ljava/util/Calendar;

    iget-object v5, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {v5}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    iget-object v3, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X100O:Ljava/util/Calendar;

    iget v5, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->XXO:I

    neg-int v5, v5

    const/4 v6, 0x1

    add-int/2addr v5, v6

    mul-int/2addr v5, v4

    const/4 v7, 0x5

    invoke-virtual {v3, v7, v5}, Ljava/util/Calendar;->add(II)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    :goto_1
    iget v3, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->XXO:I

    mul-int/2addr v3, v4

    if-ge v2, v3, :cond_4

    iget-object v3, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X100O:Ljava/util/Calendar;

    invoke-virtual {v3, v7, v6}, Ljava/util/Calendar;->add(II)V

    iget-object v3, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X100O:Ljava/util/Calendar;

    invoke-virtual {v3, v7}, Ljava/util/Calendar;->get(I)I

    move-result v3

    rem-int/lit8 v5, v2, 0x7

    div-int/lit8 v8, v2, 0x7

    add-int/2addr v8, v6

    iget-object v9, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11iII1O1:Landroid/graphics/Paint;

    sget-object v10, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v9, v10}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v9, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X100O:Ljava/util/Calendar;

    invoke-virtual {v9, v6}, Ljava/util/Calendar;->get(I)I

    move-result v9

    iget-object v10, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-virtual {v10, v6}, Ljava/util/Calendar;->get(I)I

    move-result v10

    const-wide/high16 v11, 0x3fe0000000000000L    # 0.5

    const/4 v13, 0x2

    if-ne v9, v10, :cond_1

    iget-object v9, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X100O:Ljava/util/Calendar;

    invoke-virtual {v9, v13}, Ljava/util/Calendar;->get(I)I

    move-result v9

    iget-object v10, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-virtual {v10, v13}, Ljava/util/Calendar;->get(I)I

    move-result v10

    if-ne v9, v10, :cond_1

    iget-object v9, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X100O:Ljava/util/Calendar;

    invoke-virtual {v9, v7}, Ljava/util/Calendar;->get(I)I

    move-result v9

    iget-object v10, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-virtual {v10, v7}, Ljava/util/Calendar;->get(I)I

    move-result v10

    if-ne v9, v10, :cond_1

    iget-object v9, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11iII1O1:Landroid/graphics/Paint;

    iget v10, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->XXX11i:I

    invoke-virtual {v9, v10}, Landroid/graphics/Paint;->setColor(I)V

    int-to-double v9, v5

    add-double/2addr v9, v11

    iget v14, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iXiX011:I

    int-to-double v14, v14

    mul-double/2addr v9, v14

    double-to-float v9, v9

    iget v10, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iXiiiO:I

    iget v14, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->O001I:I

    mul-int/2addr v14, v8

    add-int/2addr v10, v14

    iget-object v14, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X1IX:Landroid/graphics/Rect;

    invoke-virtual {v14}, Landroid/graphics/Rect;->height()I

    move-result v14

    div-int/2addr v14, v13

    sub-int/2addr v10, v14

    int-to-float v10, v10

    iget-object v14, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {v14}, Landroid/graphics/Paint;->getTextSize()F

    move-result v14

    iget-object v15, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {v1, v9, v10, v14, v15}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_1
    iget-object v9, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X100O:Ljava/util/Calendar;

    invoke-virtual {v9}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v9

    const-wide/16 v14, 0x3e8

    div-long/2addr v9, v14

    const-wide/16 v16, 0x3c

    div-long v9, v9, v16

    div-long v9, v9, v16

    const-wide/16 v18, 0x18

    div-long v9, v9, v18

    iget-object v4, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->XX1Oi:Ljava/util/Calendar;

    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v20

    div-long v20, v20, v14

    div-long v20, v20, v16

    div-long v20, v20, v16

    div-long v20, v20, v18

    cmp-long v4, v9, v20

    if-gez v4, :cond_3

    iget-object v4, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X100O:Ljava/util/Calendar;

    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v9

    div-long/2addr v9, v14

    div-long v9, v9, v16

    div-long v9, v9, v16

    div-long v9, v9, v18

    iget-object v4, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->OX110i:Ljava/util/Calendar;

    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v20

    div-long v20, v20, v14

    div-long v20, v20, v16

    div-long v20, v20, v16

    div-long v20, v20, v18

    cmp-long v4, v9, v20

    if-ltz v4, :cond_3

    iget-object v4, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X100O:Ljava/util/Calendar;

    invoke-virtual {v4, v6}, Ljava/util/Calendar;->get(I)I

    move-result v4

    iget-object v9, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-virtual {v9, v6}, Ljava/util/Calendar;->get(I)I

    move-result v9

    if-ne v4, v9, :cond_2

    iget-object v4, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X100O:Ljava/util/Calendar;

    invoke-virtual {v4, v13}, Ljava/util/Calendar;->get(I)I

    move-result v4

    iget-object v9, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-virtual {v9, v13}, Ljava/util/Calendar;->get(I)I

    move-result v9

    if-ne v4, v9, :cond_2

    iget-object v4, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X100O:Ljava/util/Calendar;

    invoke-virtual {v4, v7}, Ljava/util/Calendar;->get(I)I

    move-result v4

    iget-object v9, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-virtual {v9, v7}, Ljava/util/Calendar;->get(I)I

    move-result v9

    if-ne v4, v9, :cond_2

    iget-object v4, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11iII1O1:Landroid/graphics/Paint;

    iget-object v9, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iX1O1:Landroid/content/Context;

    const v10, 0x7f06024a

    invoke-static {v9, v10}, Lcom/android/mltcode/paycertificationapi/hl4;->XIi00iiXO(Landroid/content/Context;I)I

    move-result v9

    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_2

    :cond_2
    iget-object v4, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11iII1O1:Landroid/graphics/Paint;

    iget-object v9, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iX1O1:Landroid/content/Context;

    const v10, 0x7f06074b

    invoke-static {v9, v10}, Lcom/android/mltcode/paycertificationapi/hl4;->XIi00iiXO(Landroid/content/Context;I)I

    move-result v9

    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_2

    :cond_3
    iget-object v4, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11iII1O1:Landroid/graphics/Paint;

    const v9, -0x777778

    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setColor(I)V

    :goto_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ""

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    int-to-double v4, v5

    add-double/2addr v4, v11

    iget v9, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iXiX011:I

    int-to-double v9, v9

    mul-double/2addr v4, v9

    double-to-float v4, v4

    iget v5, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iXiiiO:I

    iget v9, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->O001I:I

    mul-int/2addr v8, v9

    add-int/2addr v5, v8

    int-to-float v5, v5

    iget-object v8, v0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11iII1O1:Landroid/graphics/Paint;

    invoke-virtual {v1, v3, v4, v5, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    add-int/lit8 v2, v2, 0x1

    const/4 v4, 0x7

    goto/16 :goto_1

    :cond_4
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

    iput p1, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X0i1O:I

    div-int/lit8 p1, p1, 0x7

    iput p1, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iXiX011:I

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

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/ChooseStartCalendarView;->setDate(Ljava/util/Date;)V

    return-void
.end method

.method public setDate(Ljava/util/Date;)V
    .locals 6
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
    iput-object p1, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->Ii1iii0:Ljava/util/Date;

    .line 5
    iget-object v0, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 6
    iget-object v0, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 7
    iget-object p1, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11I:Ljava/util/Calendar;

    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v1

    neg-int v1, v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    invoke-virtual {p1, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 8
    iget-object p1, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11I:Ljava/util/Calendar;

    const/4 v1, 0x7

    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I

    move-result p1

    const/4 v3, 0x2

    if-ge p1, v3, :cond_0

    const/4 p1, 0x6

    goto :goto_0

    :cond_0
    sub-int/2addr p1, v3

    .line 9
    :goto_0
    iput p1, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->OO:I

    .line 10
    iget-object v4, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {v4, v3, v2}, Ljava/util/Calendar;->add(II)V

    .line 11
    iget-object v4, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11I:Ljava/util/Calendar;

    const/4 v5, -0x1

    invoke-virtual {v4, v0, v5}, Ljava/util/Calendar;->add(II)V

    .line 12
    iget-object v4, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v4

    add-int/2addr p1, v4

    int-to-float p1, p1

    const/high16 v4, 0x3f800000    # 1.0f

    mul-float/2addr p1, v4

    const/high16 v4, 0x40e00000    # 7.0f

    div-float/2addr p1, v4

    float-to-double v4, p1

    .line 13
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int p1, v4

    add-int/2addr p1, v2

    iput p1, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->XXO:I

    .line 14
    iget v4, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->O001I:I

    mul-int/2addr v4, p1

    iput v4, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iIXi1iiXI:I

    .line 15
    iget-object p1, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I

    move-result p1

    if-ge p1, v3, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    rsub-int/lit8 p1, p1, 0x8

    .line 16
    :goto_1
    iget-object v1, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {v1, v0, p1}, Ljava/util/Calendar;->add(II)V

    .line 17
    iget-object p1, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->i11I:Lcom/sma/smartv3/view/ChooseStartCalendarView$OXO1;

    if-eqz p1, :cond_2

    .line 18
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    .line 19
    iget-object v1, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 20
    iget-object v1, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->i11I:Lcom/sma/smartv3/view/ChooseStartCalendarView$OXO1;

    invoke-virtual {p1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    invoke-virtual {p1, v3}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 21
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    .line 22
    invoke-interface {v1, p1, v2, v3, v0}, Lcom/sma/smartv3/view/ChooseStartCalendarView$OXO1;->onMonthChange(Ljava/util/Calendar;III)V

    .line 23
    :cond_2
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

    invoke-virtual {p0, v0, v1, p1}, Lcom/sma/smartv3/view/ChooseStartCalendarView;->O00(III)V

    return-void
.end method

.method public setMin(Ljava/util/Calendar;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "cal"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->OX110i:Ljava/util/Calendar;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/4 v2, 0x2

    invoke-virtual {p1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    const/4 v3, 0x5

    invoke-virtual {p1, v3}, Ljava/util/Calendar;->get(I)I

    move-result p1

    invoke-virtual {v0, v1, v2, p1}, Ljava/util/Calendar;->set(III)V

    return-void
.end method

.method public setOnDateSelectedListener(Lcom/sma/smartv3/view/ChooseStartCalendarView$OXO1;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "listener"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/ChooseStartCalendarView;->i11I:Lcom/sma/smartv3/view/ChooseStartCalendarView$OXO1;

    return-void
.end method
