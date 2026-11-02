.class public final Lcom/sma/smartv3/view/SlideLockView;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;,
        Lcom/sma/smartv3/view/SlideLockView$XIi00iiXO;,
        Lcom/sma/smartv3/view/SlideLockView$iO;,
        Lcom/sma/smartv3/view/SlideLockView$SlideIcon;
    }
.end annotation


# instance fields
.field public final I1:I

.field public final IO:I

.field public IO0II0i:Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public IXOIIIO:Lcom/sma/smartv3/view/SlideLockView$iO;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public Ii0X0X:I

.field public Ii1iii0:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public O001I:I

.field public OO:F

.field public OX110i:I

.field public X00XIX1:Z

.field public final X00Xi1X:Landroid/graphics/RectF;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X0i1O:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X1:I

.field public X100O:I

.field public X11I:F

.field public X11iII1O1:I

.field public X1IX:Lcom/sma/smartv3/view/SlideLockView$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public XO0X10iO:I

.field public XOX0O0:F

.field public XX1Oi:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public XXO:I

.field public XXX11i:I

.field public final XXiIiX10:Landroid/graphics/RectF;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public i0X000X0O:I

.field public i11I:I

.field public iIXi1iiXI:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iOiXi11II:Z

.field public iX1O1:Lcom/sma/smartv3/view/SlideLockView$SlideIcon;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iXiX011:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iXiiiO:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public iiiO:I


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
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/SlideLockView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/SlideLockView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
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

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct/range {p0 .. p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance v0, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;-><init>(Lcom/sma/smartv3/view/SlideLockView;Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->iX1O1:Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    .line 5
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->X0i1O:Landroid/graphics/Paint;

    .line 6
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->iIXi1iiXI:Landroid/graphics/Paint;

    .line 7
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->iXiX011:Landroid/graphics/Paint;

    .line 8
    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->iXiiiO:Ljava/lang/String;

    .line 9
    iput-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->Ii1iii0:Ljava/lang/String;

    .line 10
    iput-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->XX1Oi:Ljava/lang/String;

    .line 11
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->XXiIiX10:Landroid/graphics/RectF;

    .line 12
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->X00Xi1X:Landroid/graphics/RectF;

    .line 13
    new-instance v0, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;

    invoke-direct/range {v0 .. v6}, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;-><init>(Lcom/sma/smartv3/view/SlideLockView;Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->IO0II0i:Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;

    .line 14
    invoke-virtual/range {p0 .. p2}, Lcom/sma/smartv3/view/SlideLockView;->iIiiO(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 15
    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->iXiX011:Landroid/graphics/Paint;

    iget v2, p0, Lcom/sma/smartv3/view/SlideLockView;->i0X000X0O:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 16
    iget v0, p0, Lcom/sma/smartv3/view/SlideLockView;->XXO:I

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundResource(I)V

    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 18
    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->IO0II0i:Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;

    iget-object v2, p0, Lcom/sma/smartv3/view/SlideLockView;->iXiiiO:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->IO0II0i:Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x2

    invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 20
    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->IO0II0i:Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;

    const/16 v2, 0x11

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 21
    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->IO0II0i:Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;

    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 22
    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->IO0II0i:Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;

    iget v2, p0, Lcom/sma/smartv3/view/SlideLockView;->X11I:F

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 23
    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->IO0II0i:Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 24
    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->iX1O1:Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->iX1O1:Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    iget v2, p0, Lcom/sma/smartv3/view/SlideLockView;->X100O:I

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 26
    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->iX1O1:Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    new-instance v2, Lcom/sma/smartv3/view/SlideLockView$OXO1;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/view/SlideLockView$OXO1;-><init>(Lcom/sma/smartv3/view/SlideLockView;)V

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->setListener(Lcom/sma/smartv3/view/SlideLockView$XIi00iiXO;)V

    .line 27
    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->iX1O1:Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

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

    .line 28
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/SlideLockView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic I0IIOi(Lcom/sma/smartv3/view/SlideLockView;)F
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/SlideLockView;->OO:F

    return p0
.end method

.method public static final synthetic I0iXXO(Lcom/sma/smartv3/view/SlideLockView;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/view/SlideLockView;->iOiXi11II:Z

    return p0
.end method

.method public static final synthetic IO(Lcom/sma/smartv3/view/SlideLockView;)Lcom/sma/smartv3/view/SlideLockView$iO;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/view/SlideLockView;->IXOIIIO:Lcom/sma/smartv3/view/SlideLockView$iO;

    return-object p0
.end method

.method public static final synthetic IiI10X(Lcom/sma/smartv3/view/SlideLockView;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/view/SlideLockView;->XX1Oi:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic O00(Lcom/sma/smartv3/view/SlideLockView;)F
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/SlideLockView;->XOX0O0:F

    return p0
.end method

.method public static final synthetic O10IXXX0X(Lcom/sma/smartv3/view/SlideLockView;F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/SlideLockView;->XOX0O0:F

    return-void
.end method

.method public static final synthetic OIX0iXi(Lcom/sma/smartv3/view/SlideLockView;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/SlideLockView;->O001I:I

    return p0
.end method

.method public static final synthetic OIi0(Lcom/sma/smartv3/view/SlideLockView;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/SlideLockView;->X11iII1O1:I

    return p0
.end method

.method public static final synthetic OXO1(Lcom/sma/smartv3/view/SlideLockView;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/sma/smartv3/view/SlideLockView;->X00XIX1:Z

    return p0
.end method

.method public static final synthetic X0O(Lcom/sma/smartv3/view/SlideLockView;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/SlideLockView;->X11iII1O1:I

    return-void
.end method

.method public static final synthetic X1ii(Lcom/sma/smartv3/view/SlideLockView;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/SlideLockView;->XXX11i:I

    return-void
.end method

.method public static final synthetic XIi00iiXO(Lcom/sma/smartv3/view/SlideLockView;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/SlideLockView;->i11I:I

    return p0
.end method

.method public static final synthetic XO0O10(Lcom/sma/smartv3/view/SlideLockView;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/SlideLockView;->Ii0X0X:I

    return p0
.end method

.method public static final synthetic XOO0ii0(Lcom/sma/smartv3/view/SlideLockView;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/SlideLockView;->OX110i:I

    return p0
.end method

.method public static final synthetic XXI(Lcom/sma/smartv3/view/SlideLockView;)Lcom/sma/smartv3/view/SlideLockView$SlideIcon;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/view/SlideLockView;->iX1O1:Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    return-object p0
.end method

.method public static final synthetic iO(Lcom/sma/smartv3/view/SlideLockView;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/SlideLockView;->XO0X10iO:I

    return p0
.end method


# virtual methods
.method public final I1XOi1(Lcom/sma/smartv3/view/SlideLockView$iO;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/view/SlideLockView$iO;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/view/SlideLockView;->IXOIIIO:Lcom/sma/smartv3/view/SlideLockView$iO;

    return-void
.end method

.method public final IIX1OXO(I)F
    .locals 0

    int-to-float p1, p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result p1

    int-to-float p1, p1

    return p1
.end method

.method public final OII(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/view/SlideLockView;->iOiXi11II:Z

    return-void
.end method

.method public final OiIIX101O()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/view/SlideLockView;->iOiXi11II:Z

    return v0
.end method

.method public final XX0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/view/SlideLockView;->X00XIX1:Z

    return v0
.end method

.method public final XiOIO(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/view/SlideLockView;->X00XIX1:Z

    return-void
.end method

.method public final XiOIii1()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/sma/smartv3/view/SlideLockView;->X11iII1O1:I

    iput v0, p0, Lcom/sma/smartv3/view/SlideLockView;->XXX11i:I

    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->iX1O1:Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    invoke-virtual {v0}, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;->OXO1()V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final iIiiO(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v0, Lcom/sma/smartv3/R$styleable;->SlideLockView:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p2, 0x10

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/sma/smartv3/view/SlideLockView;->iOiXi11II:Z

    const/4 p2, 0x6

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/sma/smartv3/view/SlideLockView;->X00XIX1:Z

    const p2, 0x7f0816f0

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/SlideLockView;->XXO:I

    const/16 p2, 0xa

    const v0, 0x7f08134b

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/SlideLockView;->X100O:I

    const/16 p2, 0xf

    const/16 v0, 0xf0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/SlideLockView;->O001I:I

    const/16 p2, 0xc

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/view/SlideLockView;->XX1Oi:Ljava/lang/String;

    const/16 p2, 0xd

    const/4 v0, -0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/SlideLockView;->OX110i:I

    const/16 p2, 0xe

    const/16 v2, 0x2c

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lcom/sma/smartv3/view/SlideLockView;->OO:F

    const/16 p2, 0xb

    const/4 v3, 0x0

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/SlideLockView;->XOX0O0:F

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/view/SlideLockView;->iXiiiO:Ljava/lang/String;

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/view/SlideLockView;->Ii1iii0:Ljava/lang/String;

    const/4 p2, 0x3

    const/high16 v3, -0x1000000

    invoke-virtual {p1, p2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/SlideLockView;->iiiO:I

    const/4 p2, 0x5

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Lcom/sma/smartv3/view/SlideLockView;->X11I:F

    const/16 p2, 0x11

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/SlideLockView;->i0X000X0O:I

    const/4 p2, 0x7

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/SlideLockView;->i11I:I

    const/16 p2, 0x8

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/SlideLockView;->XO0X10iO:I

    const/16 p2, 0x9

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/SlideLockView;->Ii0X0X:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 6
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget v0, p0, Lcom/sma/smartv3/view/SlideLockView;->X11iII1O1:I

    iget v1, p0, Lcom/sma/smartv3/view/SlideLockView;->XXX11i:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/sma/smartv3/view/SlideLockView;->X1:I

    if-lez v0, :cond_2

    iget-object v1, p0, Lcom/sma/smartv3/view/SlideLockView;->iX1O1:Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->X00Xi1X:Landroid/graphics/RectF;

    iget v1, p0, Lcom/sma/smartv3/view/SlideLockView;->IO:I

    int-to-float v1, v1

    iget v2, p0, Lcom/sma/smartv3/view/SlideLockView;->I1:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/sma/smartv3/view/SlideLockView;->iX1O1:Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    iget v5, p0, Lcom/sma/smartv3/view/SlideLockView;->I1:I

    sub-int/2addr v4, v5

    int-to-float v4, v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/sma/smartv3/view/SlideLockView;->X1:I

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    iget-object v2, p0, Lcom/sma/smartv3/view/SlideLockView;->iX1O1:Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    sub-int/2addr v1, v2

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->X00Xi1X:Landroid/graphics/RectF;

    iget v1, p0, Lcom/sma/smartv3/view/SlideLockView;->IO:I

    int-to-float v2, v1

    iget v3, p0, Lcom/sma/smartv3/view/SlideLockView;->I1:I

    int-to-float v3, v3

    iget v4, p0, Lcom/sma/smartv3/view/SlideLockView;->X1:I

    add-int/2addr v4, v1

    iget-object v1, p0, Lcom/sma/smartv3/view/SlideLockView;->iX1O1:Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    add-int/2addr v4, v1

    int-to-float v1, v4

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    iget v5, p0, Lcom/sma/smartv3/view/SlideLockView;->I1:I

    sub-int/2addr v4, v5

    int-to-float v4, v4

    invoke-virtual {v0, v2, v3, v1, v4}, Landroid/graphics/RectF;->set(FFFF)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->X00Xi1X:Landroid/graphics/RectF;

    iget v1, p0, Lcom/sma/smartv3/view/SlideLockView;->IO:I

    int-to-float v1, v1

    iget v2, p0, Lcom/sma/smartv3/view/SlideLockView;->I1:I

    int-to-float v2, v2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    iget v5, p0, Lcom/sma/smartv3/view/SlideLockView;->I1:I

    sub-int/2addr v4, v5

    int-to-float v4, v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->X00Xi1X:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v2

    iget-object v2, p0, Lcom/sma/smartv3/view/SlideLockView;->iXiX011:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v3, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :cond_2
    iget p1, p0, Lcom/sma/smartv3/view/SlideLockView;->X11iII1O1:I

    iget v0, p0, Lcom/sma/smartv3/view/SlideLockView;->XXX11i:I

    add-int/2addr p1, v0

    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->iX1O1:Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    add-int/2addr p1, v0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    if-lt p1, v0, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView;->IO0II0i:Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;

    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->Ii1iii0:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_3
    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView;->IO0II0i:Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;

    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->iXiiiO:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 1

    iget p1, p0, Lcom/sma/smartv3/view/SlideLockView;->X11iII1O1:I

    iget p2, p0, Lcom/sma/smartv3/view/SlideLockView;->XXX11i:I

    add-int p3, p1, p2

    if-gtz p3, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView;->iX1O1:Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    iget p2, p0, Lcom/sma/smartv3/view/SlideLockView;->IO:I

    iget p3, p0, Lcom/sma/smartv3/view/SlideLockView;->I1:I

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p4

    add-int/2addr p4, p2

    iget-object p5, p0, Lcom/sma/smartv3/view/SlideLockView;->iX1O1:Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    invoke-virtual {p5}, Landroid/view/View;->getMeasuredHeight()I

    move-result p5

    iget v0, p0, Lcom/sma/smartv3/view/SlideLockView;->I1:I

    sub-int/2addr p5, v0

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    goto :goto_0

    :cond_0
    add-int/2addr p1, p2

    iget-object p2, p0, Lcom/sma/smartv3/view/SlideLockView;->iX1O1:Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    add-int/2addr p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    if-lt p1, p2, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView;->iX1O1:Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    iget-object p3, p0, Lcom/sma/smartv3/view/SlideLockView;->iX1O1:Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    sub-int/2addr p2, p3

    iget p3, p0, Lcom/sma/smartv3/view/SlideLockView;->IO:I

    sub-int/2addr p2, p3

    iget p3, p0, Lcom/sma/smartv3/view/SlideLockView;->I1:I

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p4

    iget p5, p0, Lcom/sma/smartv3/view/SlideLockView;->IO:I

    sub-int/2addr p4, p5

    iget-object p5, p0, Lcom/sma/smartv3/view/SlideLockView;->iX1O1:Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    invoke-virtual {p5}, Landroid/view/View;->getMeasuredHeight()I

    move-result p5

    iget v0, p0, Lcom/sma/smartv3/view/SlideLockView;->I1:I

    sub-int/2addr p5, v0

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView;->iX1O1:Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    iget p2, p0, Lcom/sma/smartv3/view/SlideLockView;->X11iII1O1:I

    iget p3, p0, Lcom/sma/smartv3/view/SlideLockView;->XXX11i:I

    add-int p4, p2, p3

    iget p5, p0, Lcom/sma/smartv3/view/SlideLockView;->IO:I

    add-int/2addr p4, p5

    iget p5, p0, Lcom/sma/smartv3/view/SlideLockView;->I1:I

    add-int/2addr p2, p3

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    add-int/2addr p2, p3

    iget p3, p0, Lcom/sma/smartv3/view/SlideLockView;->IO:I

    add-int/2addr p2, p3

    iget-object p3, p0, Lcom/sma/smartv3/view/SlideLockView;->iX1O1:Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    move-result p3

    iget v0, p0, Lcom/sma/smartv3/view/SlideLockView;->I1:I

    sub-int/2addr p3, v0

    invoke-virtual {p1, p4, p5, p2, p3}, Landroid/view/View;->layout(IIII)V

    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView;->IO0II0i:Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    div-int/lit8 p2, p2, 0x2

    iget-object p3, p0, Lcom/sma/smartv3/view/SlideLockView;->IO0II0i:Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    sub-int/2addr p2, p3

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    iget-object p4, p0, Lcom/sma/smartv3/view/SlideLockView;->IO0II0i:Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;

    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    move-result p4

    div-int/lit8 p4, p4, 0x2

    sub-int/2addr p3, p4

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p4

    div-int/lit8 p4, p4, 0x2

    iget-object p5, p0, Lcom/sma/smartv3/view/SlideLockView;->IO0II0i:Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;

    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    move-result p5

    div-int/lit8 p5, p5, 0x2

    add-int/2addr p4, p5

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p5

    div-int/lit8 p5, p5, 0x2

    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView;->IO0II0i:Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    add-int/2addr p5, v0

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->measureChildren(II)V

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.view.SlideLockView.CustomizeTextView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;

    iput-object p2, p0, Lcom/sma/smartv3/view/SlideLockView;->IO0II0i:Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;

    const/4 p2, 0x1

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.view.SlideLockView.SlideIcon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    iput-object p2, p0, Lcom/sma/smartv3/view/SlideLockView;->iX1O1:Lcom/sma/smartv3/view/SlideLockView$SlideIcon;

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 1

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView;->XXiIiX10:Landroid/graphics/RectF;

    iget p2, p0, Lcom/sma/smartv3/view/SlideLockView;->IO:I

    int-to-float p2, p2

    iget p3, p0, Lcom/sma/smartv3/view/SlideLockView;->I1:I

    int-to-float p3, p3

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p4

    int-to-float p4, p4

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, p2, p3, p4, v0}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method
