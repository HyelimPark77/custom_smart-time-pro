.class public final Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/view/SlideLockView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "CustomizeTextView"
.end annotation


# instance fields
.field private mLinearGradient:Landroid/graphics/LinearGradient;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mMatrix:Landroid/graphics/Matrix;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mPaint:Landroid/graphics/Paint;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mTranslate:I

.field private mViewWith:I

.field final synthetic this$0:Lcom/sma/smartv3/view/SlideLockView;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/SlideLockView;Landroid/content/Context;)V
    .locals 8
    .param p1    # Lcom/sma/smartv3/view/SlideLockView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;-><init>(Lcom/sma/smartv3/view/SlideLockView;Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/sma/smartv3/view/SlideLockView;Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 8
    .param p1    # Lcom/sma/smartv3/view/SlideLockView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/util/AttributeSet;",
            ")V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v1 .. v7}, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;-><init>(Lcom/sma/smartv3/view/SlideLockView;Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/sma/smartv3/view/SlideLockView;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/view/SlideLockView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/util/AttributeSet;",
            "I)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iput-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;->this$0:Lcom/sma/smartv3/view/SlideLockView;

    invoke-direct {p0, p2, p3, p4}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/sma/smartv3/view/SlideLockView;Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    const/4 p4, 0x0

    .line 4
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;-><init>(Lcom/sma/smartv3/view/SlideLockView;Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 3
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;->mMatrix:Landroid/graphics/Matrix;

    if-eqz p1, :cond_1

    iget v0, p0, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;->mTranslate:I

    iget v1, p0, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;->mViewWith:I

    div-int/lit8 v2, v1, 0xe

    add-int/2addr v0, v2

    iput v0, p0, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;->mTranslate:I

    mul-int/lit8 v2, v1, 0x2

    if-le v0, v2, :cond_0

    neg-int v0, v1

    iput v0, p0, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;->mTranslate:I

    :cond_0
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget v0, p0, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;->mTranslate:I

    int-to-float v0, v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Matrix;->setTranslate(FF)V

    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;->mLinearGradient:Landroid/graphics/LinearGradient;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;->mMatrix:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    const-wide/16 v0, 0xfa

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->postInvalidateDelayed(J)V

    :cond_1
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 8

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iget p1, p0, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;->mViewWith:I

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;->mViewWith:I

    if-lez p1, :cond_0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;->mPaint:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/LinearGradient;

    iget p1, p0, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;->mViewWith:I

    int-to-float v3, p1

    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;->this$0:Lcom/sma/smartv3/view/SlideLockView;

    invoke-static {p1}, Lcom/sma/smartv3/view/SlideLockView;->XIi00iiXO(Lcom/sma/smartv3/view/SlideLockView;)I

    move-result p1

    iget-object p2, p0, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;->this$0:Lcom/sma/smartv3/view/SlideLockView;

    invoke-static {p2}, Lcom/sma/smartv3/view/SlideLockView;->iO(Lcom/sma/smartv3/view/SlideLockView;)I

    move-result p2

    iget-object p3, p0, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;->this$0:Lcom/sma/smartv3/view/SlideLockView;

    invoke-static {p3}, Lcom/sma/smartv3/view/SlideLockView;->XO0O10(Lcom/sma/smartv3/view/SlideLockView;)I

    move-result p3

    filled-new-array {p1, p2, p3}, [I

    move-result-object v5

    const/4 v6, 0x0

    sget-object v7, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    iput-object v0, p0, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;->mLinearGradient:Landroid/graphics/LinearGradient;

    iget-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;->mPaint:Landroid/graphics/Paint;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;->mLinearGradient:Landroid/graphics/LinearGradient;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/view/SlideLockView$CustomizeTextView;->mMatrix:Landroid/graphics/Matrix;

    :cond_0
    return-void
.end method
