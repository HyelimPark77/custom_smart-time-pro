.class public final Lcom/sma/smartv3/view/FutureCalendarView;
.super Lskin/support/widget/SkinCompatView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/FutureCalendarView$OXO1;
    }
.end annotation


# instance fields
.field public final I1:Landroid/content/Context;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public Ii1iii0:Z

.field public O001I:I

.field public OX110i:Lcom/sma/smartv3/view/FutureCalendarView$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public X0i1O:I

.field public final X100O:Ljava/util/Calendar;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final X11I:Ljava/util/Calendar;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final X11iII1O1:I

.field public X1IX:I

.field public final XX1Oi:Landroid/widget/LinearLayout$LayoutParams;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XXO:I

.field public final XXX11i:Landroid/graphics/Rect;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iIXi1iiXI:I

.field public final iX1O1:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final iXiX011:I

.field public iXiiiO:Ljava/util/Date;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public final iiiO:Ljava/util/Calendar;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "mContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/FutureCalendarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    const-string v0, "mContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/FutureCalendarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "mContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lskin/support/widget/SkinCompatView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    iput-object p1, p0, Lcom/sma/smartv3/view/FutureCalendarView;->I1:Landroid/content/Context;

    .line 5
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/sma/smartv3/view/FutureCalendarView;->iX1O1:Landroid/graphics/Paint;

    .line 6
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Lcom/sma/smartv3/view/FutureCalendarView;->XXX11i:Landroid/graphics/Rect;

    const/4 v0, 0x2

    .line 7
    iput v0, p0, Lcom/sma/smartv3/view/FutureCalendarView;->O001I:I

    .line 8
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    const-string v2, "getInstance(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/sma/smartv3/view/FutureCalendarView;->iiiO:Ljava/util/Calendar;

    .line 9
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/sma/smartv3/view/FutureCalendarView;->X11I:Ljava/util/Calendar;

    .line 10
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/sma/smartv3/view/FutureCalendarView;->X100O:Ljava/util/Calendar;

    .line 11
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v1, p0, Lcom/sma/smartv3/view/FutureCalendarView;->XX1Oi:Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, 0x1

    .line 12
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 13
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setDither(Z)V

    const/high16 v3, 0x41600000    # 14.0f

    .line 14
    invoke-static {v3}, Lcom/blankj/utilcode/util/SizeUtils;->sp2px(F)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 15
    sget-object v3, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p2, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 16
    const-string v3, "\u65e5\u65e5\u65e5"

    invoke-virtual {p2, v3, v2, v1, p3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    const/high16 v1, 0x3f800000    # 1.0f

    .line 17
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 18
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    move-result p2

    int-to-double v1, p2

    const-wide v3, 0x400e666666666666L    # 3.8

    mul-double/2addr v1, v3

    double-to-int p2, v1

    iput p2, p0, Lcom/sma/smartv3/view/FutureCalendarView;->iXiX011:I

    .line 19
    div-int/2addr p2, v0

    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    move-result p3

    div-int/2addr p3, v0

    add-int/2addr p2, p3

    iput p2, p0, Lcom/sma/smartv3/view/FutureCalendarView;->XXO:I

    const p2, 0x7f0600b4

    .line 20
    invoke-direct {p0, p2}, Lcom/sma/smartv3/view/FutureCalendarView;->XIi00iiXO(I)I

    move-result p2

    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/FutureCalendarView;->X11iII1O1:I

    .line 21
    invoke-virtual {p0}, Lcom/sma/smartv3/view/FutureCalendarView;->applySkin()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 22
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/FutureCalendarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final OXO1(FF)I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/FutureCalendarView;->iXiX011:I

    int-to-float v0, v0

    div-float/2addr p2, v0

    float-to-int p2, p2

    add-int/lit8 p2, p2, -0x1

    iget v0, p0, Lcom/sma/smartv3/view/FutureCalendarView;->iIXi1iiXI:I

    int-to-float v0, v0

    div-float/2addr p1, v0

    float-to-int p1, p1

    mul-int/lit8 p2, p2, 0x7

    add-int/2addr p2, p1

    return p2
.end method

.method private final XIi00iiXO(I)I
    .locals 0

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/ck4;->XIi00iiXO(I)I

    move-result p1

    return p1
.end method


# virtual methods
.method public final XO0O10(III)V
    .locals 1

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/Calendar;->set(III)V

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    const-string p2, "getTime(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/FutureCalendarView;->setDate(Ljava/util/Date;)V

    return-void
.end method

.method public applySkin()V
    .locals 0

    invoke-super {p0}, Lskin/support/widget/SkinCompatView;->applySkin()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-direct {p0, v1, p1}, Lcom/sma/smartv3/view/FutureCalendarView;->OXO1(FF)I

    move-result p1

    if-ltz p1, :cond_0

    iget v0, p0, Lcom/sma/smartv3/view/FutureCalendarView;->O001I:I

    mul-int/lit8 v0, v0, 0x7

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/view/FutureCalendarView;->OX110i:Lcom/sma/smartv3/view/FutureCalendarView$OXO1;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/view/FutureCalendarView;->iiiO:Ljava/util/Calendar;

    iget-object v1, p0, Lcom/sma/smartv3/view/FutureCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v3

    const v1, 0x15180

    mul-int/2addr p1, v1

    int-to-long v5, p1

    const-wide/16 v7, 0x3e8

    mul-long/2addr v5, v7

    add-long/2addr v3, v5

    invoke-virtual {v0, v3, v4}, Ljava/util/Calendar;->setTimeInMillis(J)V

    iget-object p1, p0, Lcom/sma/smartv3/view/FutureCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->O10IXXX0X(Ljava/util/Calendar;)I

    move-result p1

    iget-object v0, p0, Lcom/sma/smartv3/view/FutureCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->IO(Ljava/util/Calendar;)I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/view/FutureCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XIi00iiXO(Ljava/util/Calendar;)I

    move-result v1

    add-int/2addr v1, v2

    iget-object v3, p0, Lcom/sma/smartv3/view/FutureCalendarView;->iiiO:Ljava/util/Calendar;

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->iIiiO(Ljava/util/Calendar;I)V

    iget-object v3, p0, Lcom/sma/smartv3/view/FutureCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-static {v3, v4}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->OiIIX101O(Ljava/util/Calendar;I)V

    iget-object v3, p0, Lcom/sma/smartv3/view/FutureCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-static {v3, v4}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->I1(Ljava/util/Calendar;I)V

    iget-object v3, p0, Lcom/sma/smartv3/view/FutureCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-static {v3, v4}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XX0(Ljava/util/Calendar;I)V

    iget-object v3, p0, Lcom/sma/smartv3/view/FutureCalendarView;->OX110i:Lcom/sma/smartv3/view/FutureCalendarView$OXO1;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v4, p0, Lcom/sma/smartv3/view/FutureCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-interface {v3, v4, p1, v0, v1}, Lcom/sma/smartv3/view/FutureCalendarView$OXO1;->onDateSelected(Ljava/util/Calendar;III)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return v2
.end method

.method public final iO(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/view/FutureCalendarView;->Ii1iii0:Z

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-object v0, p0, Lcom/sma/smartv3/view/FutureCalendarView;->iXiiiO:Ljava/util/Date;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const-string v1, "getInstance(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/view/FutureCalendarView;->setDate(Ljava/util/Calendar;)V

    :cond_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 17
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "canvas"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v2, v0, Lcom/sma/smartv3/view/FutureCalendarView;->XX1Oi:Landroid/widget/LinearLayout$LayoutParams;

    iget v3, v0, Lcom/sma/smartv3/view/FutureCalendarView;->X1IX:I

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->width:I

    iget v3, v0, Lcom/sma/smartv3/view/FutureCalendarView;->X0i1O:I

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->height:I

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget v2, v0, Lcom/sma/smartv3/view/FutureCalendarView;->O001I:I

    const/4 v3, 0x7

    mul-int/2addr v2, v3

    const/4 v4, 0x0

    move v5, v4

    move v7, v5

    :goto_0
    const v6, -0x777778

    const/4 v8, 0x1

    if-ge v5, v2, :cond_2

    iget-object v9, v0, Lcom/sma/smartv3/view/FutureCalendarView;->X100O:Ljava/util/Calendar;

    iget-object v10, v0, Lcom/sma/smartv3/view/FutureCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {v10}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v10

    const v12, 0x15180

    mul-int/2addr v12, v5

    int-to-long v12, v12

    const-wide/16 v14, 0x3e8

    mul-long/2addr v12, v14

    add-long/2addr v10, v12

    invoke-virtual {v9, v10, v11}, Ljava/util/Calendar;->setTimeInMillis(J)V

    iget-boolean v9, v0, Lcom/sma/smartv3/view/FutureCalendarView;->Ii1iii0:Z

    const/4 v10, 0x2

    if-eqz v9, :cond_0

    iget-object v9, v0, Lcom/sma/smartv3/view/FutureCalendarView;->X100O:Ljava/util/Calendar;

    invoke-virtual {v9}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v11

    const/4 v9, 0x0

    invoke-static {v11, v12, v4, v10, v9}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->O10IXXX0X(JIILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/XOXO0X00I;

    move-result-object v9

    invoke-virtual {v9}, Lcom/android/mltcode/paycertificationapi/XOXO0X00I;->IiI10X()I

    move-result v9

    goto :goto_1

    :cond_0
    iget-object v9, v0, Lcom/sma/smartv3/view/FutureCalendarView;->X100O:Ljava/util/Calendar;

    invoke-static {v9}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XIi00iiXO(Ljava/util/Calendar;)I

    move-result v9

    :goto_1
    rem-int/lit8 v11, v5, 0x7

    div-int/lit8 v12, v5, 0x7

    add-int/2addr v12, v8

    iget-object v8, v0, Lcom/sma/smartv3/view/FutureCalendarView;->X100O:Ljava/util/Calendar;

    invoke-static {v8}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->O10IXXX0X(Ljava/util/Calendar;)I

    move-result v8

    iget-object v13, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-static {v13}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->O10IXXX0X(Ljava/util/Calendar;)I

    move-result v13

    const-wide/high16 v14, 0x3fe0000000000000L    # 0.5

    if-ne v8, v13, :cond_1

    iget-object v8, v0, Lcom/sma/smartv3/view/FutureCalendarView;->X100O:Ljava/util/Calendar;

    invoke-static {v8}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->IO(Ljava/util/Calendar;)I

    move-result v8

    iget-object v13, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-static {v13}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->IO(Ljava/util/Calendar;)I

    move-result v13

    if-ne v8, v13, :cond_1

    iget-object v8, v0, Lcom/sma/smartv3/view/FutureCalendarView;->X100O:Ljava/util/Calendar;

    invoke-static {v8}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XIi00iiXO(Ljava/util/Calendar;)I

    move-result v8

    iget-object v13, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-static {v13}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XIi00iiXO(Ljava/util/Calendar;)I

    move-result v13

    if-ne v8, v13, :cond_1

    iget-object v6, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iX1O1:Landroid/graphics/Paint;

    iget v7, v0, Lcom/sma/smartv3/view/FutureCalendarView;->X11iII1O1:I

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    int-to-double v6, v11

    add-double/2addr v6, v14

    iget v8, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iIXi1iiXI:I

    move/from16 v16, v5

    int-to-double v4, v8

    mul-double/2addr v6, v4

    double-to-float v4, v6

    iget v5, v0, Lcom/sma/smartv3/view/FutureCalendarView;->XXO:I

    iget v6, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iXiX011:I

    mul-int/2addr v6, v12

    add-int/2addr v5, v6

    iget-object v6, v0, Lcom/sma/smartv3/view/FutureCalendarView;->XXX11i:Landroid/graphics/Rect;

    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    move-result v6

    div-int/2addr v6, v10

    sub-int/2addr v5, v6

    int-to-float v5, v5

    iget-object v6, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {v6}, Landroid/graphics/Paint;->getTextSize()F

    move-result v6

    iget-object v7, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {v1, v4, v5, v6, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v4, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iX1O1:Landroid/graphics/Paint;

    iget-object v5, v0, Lcom/sma/smartv3/view/FutureCalendarView;->I1:Landroid/content/Context;

    const v6, 0x7f06024a

    invoke-static {v5, v6}, Lcom/android/mltcode/paycertificationapi/hl4;->XIi00iiXO(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    move v7, v11

    goto :goto_2

    :cond_1
    move/from16 v16, v5

    iget-object v4, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setColor(I)V

    :goto_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    int-to-double v5, v11

    add-double/2addr v5, v14

    iget v8, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iIXi1iiXI:I

    int-to-double v8, v8

    mul-double/2addr v5, v8

    double-to-float v5, v5

    iget v6, v0, Lcom/sma/smartv3/view/FutureCalendarView;->XXO:I

    iget v8, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iXiX011:I

    mul-int/2addr v12, v8

    add-int/2addr v6, v12

    int-to-float v6, v6

    iget-object v8, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {v1, v4, v5, v6, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    add-int/lit8 v5, v16, 0x1

    const/4 v4, 0x0

    goto/16 :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_3
    if-ge v4, v3, :cond_4

    if-ne v7, v4, :cond_3

    iget-object v2, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iX1O1:Landroid/graphics/Paint;

    iget v5, v0, Lcom/sma/smartv3/view/FutureCalendarView;->X11iII1O1:I

    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_4

    :cond_3
    iget-object v2, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iX1O1:Landroid/graphics/Paint;

    iget-object v5, v0, Lcom/sma/smartv3/view/FutureCalendarView;->I1:Landroid/content/Context;

    const v9, 0x7f06074b

    invoke-static {v5, v9}, Lcom/android/mltcode/paycertificationapi/hl4;->XIi00iiXO(Landroid/content/Context;I)I

    move-result v5

    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setColor(I)V

    :goto_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    invoke-static {v9, v10, v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iOO1ii1(JI)Lcom/android/mltcode/paycertificationapi/by6;

    move-result-object v2

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/by6;->IiI10X()Ljava/lang/String;

    move-result-object v2

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "toUpperCase(...)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget v5, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iIXi1iiXI:I

    div-int/lit8 v9, v5, 0x2

    mul-int/2addr v5, v4

    add-int/2addr v9, v5

    int-to-float v5, v9

    iget v9, v0, Lcom/sma/smartv3/view/FutureCalendarView;->XXO:I

    int-to-float v9, v9

    iget-object v10, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v5, v9, v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_4
    iget-object v2, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setColor(I)V

    iget v2, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iXiX011:I

    int-to-float v3, v2

    iget v4, v0, Lcom/sma/smartv3/view/FutureCalendarView;->X1IX:I

    int-to-float v4, v4

    int-to-float v5, v2

    iget-object v6, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iX1O1:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget-object v1, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iX1O1:Landroid/graphics/Paint;

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v2}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v1, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iX1O1:Landroid/graphics/Paint;

    iget v3, v0, Lcom/sma/smartv3/view/FutureCalendarView;->X11iII1O1:I

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget v1, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iIXi1iiXI:I

    int-to-float v3, v1

    const/high16 v4, 0x3f000000    # 0.5f

    mul-float/2addr v3, v4

    mul-int/2addr v7, v1

    int-to-float v4, v7

    int-to-float v1, v1

    sub-float/2addr v1, v3

    div-float/2addr v1, v2

    add-float v2, v4, v1

    iget v1, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iXiX011:I

    int-to-float v4, v1

    int-to-float v5, v8

    sub-float/2addr v4, v5

    add-float/2addr v3, v2

    int-to-float v1, v1

    sub-float v5, v1, v5

    iget-object v6, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iX1O1:Landroid/graphics/Paint;

    move v1, v4

    move v4, v3

    move v3, v1

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget-object v1, v0, Lcom/sma/smartv3/view/FutureCalendarView;->iX1O1:Landroid/graphics/Paint;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/FutureCalendarView;->X1IX:I

    div-int/lit8 p1, p1, 0x7

    iput p1, p0, Lcom/sma/smartv3/view/FutureCalendarView;->iIXi1iiXI:I

    return-void
.end method

.method public final setDate(Ljava/util/Calendar;)V
    .locals 1
    .param p1    # Ljava/util/Calendar;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "cal"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1

    const-string v0, "getTime(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/FutureCalendarView;->setDate(Ljava/util/Date;)V

    return-void
.end method

.method public final setDate(Ljava/util/Date;)V
    .locals 1
    .param p1    # Ljava/util/Date;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lcom/sma/smartv3/view/FutureCalendarView;->iXiiiO:Ljava/util/Date;

    .line 3
    iget-object v0, p0, Lcom/sma/smartv3/view/FutureCalendarView;->iiiO:Ljava/util/Calendar;

    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 4
    iget-object v0, p0, Lcom/sma/smartv3/view/FutureCalendarView;->X11I:Ljava/util/Calendar;

    invoke-virtual {v0, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 5
    iget p1, p0, Lcom/sma/smartv3/view/FutureCalendarView;->iXiX011:I

    iget v0, p0, Lcom/sma/smartv3/view/FutureCalendarView;->O001I:I

    mul-int/2addr p1, v0

    iput p1, p0, Lcom/sma/smartv3/view/FutureCalendarView;->X0i1O:I

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setOnDateSelectedListener(Lcom/sma/smartv3/view/FutureCalendarView$OXO1;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/view/FutureCalendarView$OXO1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/view/FutureCalendarView;->OX110i:Lcom/sma/smartv3/view/FutureCalendarView$OXO1;

    return-void
.end method

.method public final setRow(I)V
    .locals 1

    iput p1, p0, Lcom/sma/smartv3/view/FutureCalendarView;->O001I:I

    iget v0, p0, Lcom/sma/smartv3/view/FutureCalendarView;->iXiX011:I

    mul-int/2addr v0, p1

    iput v0, p0, Lcom/sma/smartv3/view/FutureCalendarView;->X0i1O:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
