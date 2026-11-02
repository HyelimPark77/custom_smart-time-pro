.class public final Lcom/sma/smartv3/view/ContactSideBar;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/ContactSideBar$OXO1;,
        Lcom/sma/smartv3/view/ContactSideBar$XIi00iiXO;
    }
.end annotation


# static fields
.field public static X1IX:[Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final XXX11i:Lcom/sma/smartv3/view/ContactSideBar$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field public I1:I

.field public IO:Lcom/sma/smartv3/view/ContactSideBar$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public X11iII1O1:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public final iX1O1:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 29

    new-instance v0, Lcom/sma/smartv3/view/ContactSideBar$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/view/ContactSideBar$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/view/ContactSideBar;->XXX11i:Lcom/sma/smartv3/view/ContactSideBar$OXO1;

    const-string v27, "Z"

    const-string v28, "#"

    const-string v2, "A"

    const-string v3, "B"

    const-string v4, "C"

    const-string v5, "D"

    const-string v6, "E"

    const-string v7, "F"

    const-string v8, "G"

    const-string v9, "H"

    const-string v10, "I"

    const-string v11, "J"

    const-string v12, "K"

    const-string v13, "L"

    const-string v14, "M"

    const-string v15, "N"

    const-string v16, "O"

    const-string v17, "P"

    const-string v18, "Q"

    const-string v19, "R"

    const-string v20, "S"

    const-string v21, "T"

    const-string v22, "U"

    const-string v23, "V"

    const-string v24, "W"

    const-string v25, "X"

    const-string v26, "Y"

    filled-new-array/range {v2 .. v28}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/view/ContactSideBar;->X1IX:[Ljava/lang/String;

    return-void
.end method

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/ContactSideBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/ContactSideBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
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
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, -0x1

    .line 4
    iput p1, p0, Lcom/sma/smartv3/view/ContactSideBar;->I1:I

    .line 5
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/ContactSideBar;->iX1O1:Landroid/graphics/Paint;

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

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/ContactSideBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic OXO1()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/view/ContactSideBar;->X1IX:[Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic XIi00iiXO([Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcom/sma/smartv3/view/ContactSideBar;->X1IX:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iget v1, p0, Lcom/sma/smartv3/view/ContactSideBar;->I1:I

    iget-object v2, p0, Lcom/sma/smartv3/view/ContactSideBar;->IO:Lcom/sma/smartv3/view/ContactSideBar$XIi00iiXO;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr p1, v3

    sget-object v3, Lcom/sma/smartv3/view/ContactSideBar;->X1IX:[Ljava/lang/String;

    array-length v3, v3

    int-to-float v3, v3

    mul-float/2addr p1, v3

    float-to-int p1, p1

    const/4 v3, 0x1

    if-ne v0, v3, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    iget-object p1, p0, Lcom/sma/smartv3/view/ContactSideBar;->X11iII1O1:Landroid/widget/TextView;

    if-eqz p1, :cond_3

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    const v0, 0x3f333333    # 0.7f

    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    if-eq v1, p1, :cond_3

    if-ltz p1, :cond_3

    sget-object v0, Lcom/sma/smartv3/view/ContactSideBar;->X1IX:[Ljava/lang/String;

    array-length v1, v0

    if-ge p1, v1, :cond_3

    if-eqz v2, :cond_1

    aget-object v0, v0, p1

    invoke-interface {v2, v0}, Lcom/sma/smartv3/view/ContactSideBar$XIi00iiXO;->OXO1(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/view/ContactSideBar;->X11iII1O1:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    sget-object v1, Lcom/sma/smartv3/view/ContactSideBar;->X1IX:[Ljava/lang/String;

    aget-object v1, v1, p1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/ContactSideBar;->X11iII1O1:Landroid/widget/TextView;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    iput p1, p0, Lcom/sma/smartv3/view/ContactSideBar;->I1:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_3
    :goto_0
    return v3
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 11
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    sget-object v2, Lcom/sma/smartv3/view/ContactSideBar;->X1IX:[Ljava/lang/String;

    array-length v3, v2

    div-int/2addr v0, v3

    array-length v2, v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    iget-object v4, p0, Lcom/sma/smartv3/view/ContactSideBar;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f0600b4

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v4, p0, Lcom/sma/smartv3/view/ContactSideBar;->iX1O1:Landroid/graphics/Paint;

    sget-object v5, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object v4, p0, Lcom/sma/smartv3/view/ContactSideBar;->iX1O1:Landroid/graphics/Paint;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-object v4, p0, Lcom/sma/smartv3/view/ContactSideBar;->iX1O1:Landroid/graphics/Paint;

    const/high16 v6, 0x41e00000    # 28.0f

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v4, p0, Lcom/sma/smartv3/view/ContactSideBar;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    const/4 v4, 0x2

    div-int/lit8 v5, v1, 0x2

    int-to-float v5, v5

    iget-object v6, p0, Lcom/sma/smartv3/view/ContactSideBar;->iX1O1:Landroid/graphics/Paint;

    sget-object v7, Lcom/sma/smartv3/view/ContactSideBar;->X1IX:[Ljava/lang/String;

    aget-object v7, v7, v3

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v6

    int-to-float v4, v4

    div-float/2addr v6, v4

    sub-float/2addr v5, v6

    mul-int v6, v0, v3

    add-int/2addr v6, v0

    int-to-float v6, v6

    iget-object v7, p0, Lcom/sma/smartv3/view/ContactSideBar;->iX1O1:Landroid/graphics/Paint;

    sget-object v8, Lcom/sma/smartv3/view/ContactSideBar;->X1IX:[Ljava/lang/String;

    aget-object v8, v8, v3

    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v7

    const/high16 v8, 0x41a00000    # 20.0f

    invoke-static {v7, v8}, Ljava/lang/Math;->max(FF)F

    move-result v7

    iget v8, p0, Lcom/sma/smartv3/view/ContactSideBar;->I1:I

    if-ne v3, v8, :cond_0

    iget-object v8, p0, Lcom/sma/smartv3/view/ContactSideBar;->iX1O1:Landroid/graphics/Paint;

    const/16 v9, 0x46

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v8, p0, Lcom/sma/smartv3/view/ContactSideBar;->iX1O1:Landroid/graphics/Paint;

    sget-object v9, Lcom/sma/smartv3/view/ContactSideBar;->X1IX:[Ljava/lang/String;

    aget-object v9, v9, v3

    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v8

    div-float/2addr v8, v4

    add-float/2addr v8, v5

    iget-object v9, p0, Lcom/sma/smartv3/view/ContactSideBar;->iX1O1:Landroid/graphics/Paint;

    sget-object v10, Lcom/sma/smartv3/view/ContactSideBar;->X1IX:[Ljava/lang/String;

    aget-object v10, v10, v3

    invoke-virtual {v9, v10}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v9

    div-float/2addr v9, v4

    sub-float v4, v6, v9

    iget-object v9, p0, Lcom/sma/smartv3/view/ContactSideBar;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v8, v4, v7, v9}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto :goto_1

    :cond_0
    iget-object v4, p0, Lcom/sma/smartv3/view/ContactSideBar;->iX1O1:Landroid/graphics/Paint;

    const/16 v7, 0xff

    invoke-virtual {v4, v7}, Landroid/graphics/Paint;->setAlpha(I)V

    :goto_1
    sget-object v4, Lcom/sma/smartv3/view/ContactSideBar;->X1IX:[Ljava/lang/String;

    aget-object v4, v4, v3

    iget-object v7, p0, Lcom/sma/smartv3/view/ContactSideBar;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v5, v6, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    iget-object v4, p0, Lcom/sma/smartv3/view/ContactSideBar;->iX1O1:Landroid/graphics/Paint;

    invoke-virtual {v4}, Landroid/graphics/Paint;->reset()V

    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_1
    return-void
.end method

.method public final setBar([Ljava/lang/String;)V
    .locals 1
    .param p1    # [Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final setOnTouchingLetterChangedListener(Lcom/sma/smartv3/view/ContactSideBar$XIi00iiXO;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/view/ContactSideBar$XIi00iiXO;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/view/ContactSideBar;->IO:Lcom/sma/smartv3/view/ContactSideBar$XIi00iiXO;

    return-void
.end method

.method public final setTextView(Landroid/widget/TextView;)V
    .locals 0
    .param p1    # Landroid/widget/TextView;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/view/ContactSideBar;->X11iII1O1:Landroid/widget/TextView;

    return-void
.end method
