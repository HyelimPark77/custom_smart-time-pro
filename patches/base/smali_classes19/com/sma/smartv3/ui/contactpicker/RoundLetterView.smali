.class public Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field private static DEFAULT_BACKGROUND_COLOR:I = -0xff0001

.field private static DEFAULT_TITLE:Ljava/lang/String; = "A"

.field private static DEFAULT_TITLE_COLOR:I = -0x1

.field private static DEFAULT_TITLE_SIZE:F = 25.0f

.field private static final DEFAULT_VIEW_SIZE:I = 0x60


# instance fields
.field private mBackgroundColor:I

.field private mBackgroundPaint:Landroid/graphics/Paint;

.field private mFont:Landroid/graphics/Typeface;

.field private mInnerRectF:Landroid/graphics/RectF;

.field private mTitleColor:I

.field private mTitleSize:F

.field private mTitleText:Ljava/lang/String;

.field private mTitleTextPaint:Landroid/text/TextPaint;

.field private mViewSize:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

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

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 2
    sget p1, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->DEFAULT_TITLE_COLOR:I

    iput p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleColor:I

    .line 3
    sget p1, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->DEFAULT_BACKGROUND_COLOR:I

    iput p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mBackgroundColor:I

    .line 4
    sget-object p1, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->DEFAULT_TITLE:Ljava/lang/String;

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleText:Ljava/lang/String;

    .line 5
    sget p1, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->DEFAULT_TITLE_SIZE:F

    iput p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleSize:F

    const/4 p1, 0x1

    .line 6
    invoke-static {p1}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mFont:Landroid/graphics/Typeface;

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, p1, v0}, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->init(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
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

    .line 8
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 9
    sget p1, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->DEFAULT_TITLE_COLOR:I

    iput p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleColor:I

    .line 10
    sget p1, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->DEFAULT_BACKGROUND_COLOR:I

    iput p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mBackgroundColor:I

    .line 11
    sget-object p1, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->DEFAULT_TITLE:Ljava/lang/String;

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleText:Ljava/lang/String;

    .line 12
    sget p1, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->DEFAULT_TITLE_SIZE:F

    iput p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleSize:F

    const/4 p1, 0x1

    .line 13
    invoke-static {p1}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mFont:Landroid/graphics/Typeface;

    const/4 p1, 0x0

    .line 14
    invoke-direct {p0, p2, p1}, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->init(Landroid/util/AttributeSet;I)V

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
            "attrs",
            "defStyle"
        }
    .end annotation

    .line 15
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 16
    sget p1, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->DEFAULT_TITLE_COLOR:I

    iput p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleColor:I

    .line 17
    sget p1, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->DEFAULT_BACKGROUND_COLOR:I

    iput p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mBackgroundColor:I

    .line 18
    sget-object p1, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->DEFAULT_TITLE:Ljava/lang/String;

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleText:Ljava/lang/String;

    .line 19
    sget p1, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->DEFAULT_TITLE_SIZE:F

    iput p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleSize:F

    const/4 p1, 0x1

    .line 20
    invoke-static {p1}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mFont:Landroid/graphics/Typeface;

    .line 21
    invoke-direct {p0, p2, p3}, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->init(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private init(Landroid/util/AttributeSet;I)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "attrs",
            "defStyle"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/R$styleable;->RoundedLetterView:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleText:Ljava/lang/String;

    :cond_0
    sget p2, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->DEFAULT_TITLE_COLOR:I

    const/4 v0, 0x1

    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleColor:I

    sget p2, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->DEFAULT_BACKGROUND_COLOR:I

    invoke-virtual {p1, v2, p2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mBackgroundColor:I

    const/4 p2, 0x2

    sget v1, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->DEFAULT_TITLE_SIZE:F

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleSize:F

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    new-instance p1, Landroid/text/TextPaint;

    invoke-direct {p1}, Landroid/text/TextPaint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleTextPaint:Landroid/text/TextPaint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setFlags(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleTextPaint:Landroid/text/TextPaint;

    iget-object p2, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mFont:Landroid/graphics/Typeface;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleTextPaint:Landroid/text/TextPaint;

    sget-object p2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleTextPaint:Landroid/text/TextPaint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setLinearText(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleTextPaint:Landroid/text/TextPaint;

    iget p2, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleColor:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleTextPaint:Landroid/text/TextPaint;

    iget p2, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleSize:F

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mBackgroundPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setFlags(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mBackgroundPaint:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mBackgroundPaint:Landroid/graphics/Paint;

    iget p2, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mBackgroundColor:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mInnerRectF:Landroid/graphics/RectF;

    return-void
.end method

.method private invalidatePaints()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mBackgroundPaint:Landroid/graphics/Paint;

    iget v1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mBackgroundColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method private invalidateTextPaints()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleTextPaint:Landroid/text/TextPaint;

    iget-object v1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mFont:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleTextPaint:Landroid/text/TextPaint;

    iget v1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleSize:F

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleTextPaint:Landroid/text/TextPaint;

    iget v1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleColor:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method


# virtual methods
.method public getBackgroundColor()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mBackgroundColor:I

    return v0
.end method

.method public getTitleSize()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleSize:F

    return v0
.end method

.method public getTitleText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleText:Ljava/lang/String;

    return-object v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "canvas"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mInnerRectF:Landroid/graphics/RectF;

    iget v1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mViewSize:I

    int-to-float v2, v1

    int-to-float v1, v1

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v3, v2, v1}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mInnerRectF:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    iget v2, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mViewSize:I

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    iget v3, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mViewSize:I

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/RectF;->offset(FF)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mInnerRectF:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mInnerRectF:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    float-to-int v0, v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleTextPaint:Landroid/text/TextPaint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->descent()F

    move-result v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleTextPaint:Landroid/text/TextPaint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->ascent()F

    move-result v3

    add-float/2addr v2, v3

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    float-to-int v1, v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mInnerRectF:Landroid/graphics/RectF;

    iget-object v3, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mBackgroundPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleText:Ljava/lang/String;

    int-to-float v0, v0

    int-to-float v1, v1

    iget-object v3, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleTextPaint:Landroid/text/TextPaint;

    invoke-virtual {p1, v2, v0, v1, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 1
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

    const/16 v0, 0x60

    invoke-static {v0, p1}, Landroid/view/View;->resolveSize(II)I

    move-result p1

    invoke-static {v0, p2}, Landroid/view/View;->resolveSize(II)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mViewSize:I

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "backgroundColor"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mBackgroundColor:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->invalidatePaints()V

    return-void
.end method

.method public setTextTypeface(Landroid/graphics/Typeface;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "font"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mFont:Landroid/graphics/Typeface;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->invalidateTextPaints()V

    return-void
.end method

.method public setTitleColor(I)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "titleColor"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleColor:I

    invoke-direct {p0}, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->invalidateTextPaints()V

    return-void
.end method

.method public setTitleSize(F)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "titleSize"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleSize:F

    invoke-direct {p0}, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->invalidateTextPaints()V

    return-void
.end method

.method public setTitleText(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "title"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->mTitleText:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
