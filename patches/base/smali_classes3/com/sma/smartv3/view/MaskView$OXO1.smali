.class public final Lcom/sma/smartv3/view/MaskView$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/view/MaskView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OXO1"
.end annotation


# instance fields
.field public final OXO1:F

.field public final XIi00iiXO:F

.field public final XO0O10:F

.field public final iO:F


# direct methods
.method public constructor <init>(FFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->OXO1:F

    iput p2, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->XIi00iiXO:F

    iput p3, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->iO:F

    iput p4, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->XO0O10:F

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/view/MaskView$OXO1;FFFFILjava/lang/Object;)Lcom/sma/smartv3/view/MaskView$OXO1;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->OXO1:F

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->XIi00iiXO:F

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->iO:F

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->XO0O10:F

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/view/MaskView$OXO1;->O00(FFFF)Lcom/sma/smartv3/view/MaskView$OXO1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final I0IIOi()F
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->OXO1:F

    iget v1, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->iO:F

    add-float/2addr v0, v1

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method public final I0iXXO()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->iO:F

    return v0
.end method

.method public final IO()F
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->XO0O10:F

    iget v1, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->XIi00iiXO:F

    sub-float/2addr v0, v1

    return v0
.end method

.method public final O00(FFFF)Lcom/sma/smartv3/view/MaskView$OXO1;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/view/MaskView$OXO1;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/sma/smartv3/view/MaskView$OXO1;-><init>(FFFF)V

    return-object v0
.end method

.method public final OIX0iXi()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->OXO1:F

    return v0
.end method

.method public final OIi0()F
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->XIi00iiXO:F

    iget v1, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->XO0O10:F

    add-float/2addr v0, v1

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method public final OXO1()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->OXO1:F

    return v0
.end method

.method public final X1ii()F
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->iO:F

    iget v1, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->OXO1:F

    sub-float/2addr v0, v1

    return v0
.end method

.method public final XIi00iiXO()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->XIi00iiXO:F

    return v0
.end method

.method public final XO0O10()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->XO0O10:F

    return v0
.end method

.method public final XOO0ii0()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->XO0O10:F

    return v0
.end method

.method public final XXI()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->XIi00iiXO:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/sma/smartv3/view/MaskView$OXO1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/view/MaskView$OXO1;

    iget v1, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->OXO1:F

    iget v3, p1, Lcom/sma/smartv3/view/MaskView$OXO1;->OXO1:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->XIi00iiXO:F

    iget v3, p1, Lcom/sma/smartv3/view/MaskView$OXO1;->XIi00iiXO:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->iO:F

    iget v3, p1, Lcom/sma/smartv3/view/MaskView$OXO1;->iO:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->XO0O10:F

    iget p1, p1, Lcom/sma/smartv3/view/MaskView$OXO1;->XO0O10:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->OXO1:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->XIi00iiXO:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->iO:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->XO0O10:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final iO()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->iO:F

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->OXO1:F

    iget v1, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->XIi00iiXO:F

    iget v2, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->iO:F

    iget v3, p0, Lcom/sma/smartv3/view/MaskView$OXO1;->XO0O10:F

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Coordinates(left="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", top="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", right="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", bottom="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
