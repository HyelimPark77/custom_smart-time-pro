.class public final Lcom/sma/smartv3/view/MyPieChart$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/view/MyPieChart;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OXO1"
.end annotation


# instance fields
.field public OXO1:J

.field public XIi00iiXO:I

.field public XO0O10:F

.field public iO:F


# direct methods
.method public constructor <init>(JIFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->OXO1:J

    iput p3, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->XIi00iiXO:I

    iput p4, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->iO:F

    iput p5, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->XO0O10:F

    return-void
.end method

.method public synthetic constructor <init>(JIFFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const p3, -0xff0100

    :cond_0
    move v3, p3

    and-int/lit8 p3, p6, 0x4

    const/4 p7, 0x0

    if-eqz p3, :cond_1

    move v4, p7

    goto :goto_0

    :cond_1
    move v4, p4

    :goto_0
    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_2

    move v5, p7

    :goto_1
    move-object v0, p0

    move-wide v1, p1

    goto :goto_2

    :cond_2
    move v5, p5

    goto :goto_1

    .line 2
    :goto_2
    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/view/MyPieChart$OXO1;-><init>(JIFF)V

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/view/MyPieChart$OXO1;JIFFILjava/lang/Object;)Lcom/sma/smartv3/view/MyPieChart$OXO1;
    .locals 6

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-wide p1, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->OXO1:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    iget p3, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->XIi00iiXO:I

    :cond_1
    move v3, p3

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    iget p4, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->iO:F

    :cond_2
    move v4, p4

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    iget p5, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->XO0O10:F

    :cond_3
    move-object v0, p0

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/view/MyPieChart$OXO1;->O00(JIFF)Lcom/sma/smartv3/view/MyPieChart$OXO1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final I0IIOi()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->XIi00iiXO:I

    return v0
.end method

.method public final I0iXXO(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->XIi00iiXO:I

    return-void
.end method

.method public final IO()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->OXO1:J

    return-wide v0
.end method

.method public final O00(JIFF)Lcom/sma/smartv3/view/MyPieChart$OXO1;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/view/MyPieChart$OXO1;

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/view/MyPieChart$OXO1;-><init>(JIFF)V

    return-object v0
.end method

.method public final OIX0iXi(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->XO0O10:F

    return-void
.end method

.method public final OIi0()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->iO:F

    return v0
.end method

.method public final OXO1()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->OXO1:J

    return-wide v0
.end method

.method public final X1ii(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->OXO1:J

    return-void
.end method

.method public final XIi00iiXO()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->XIi00iiXO:I

    return v0
.end method

.method public final XO0O10()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->XO0O10:F

    return v0
.end method

.method public final XOO0ii0()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->XO0O10:F

    return v0
.end method

.method public final XXI(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->iO:F

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/sma/smartv3/view/MyPieChart$OXO1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/view/MyPieChart$OXO1;

    iget-wide v3, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->OXO1:J

    iget-wide v5, p1, Lcom/sma/smartv3/view/MyPieChart$OXO1;->OXO1:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->XIi00iiXO:I

    iget v3, p1, Lcom/sma/smartv3/view/MyPieChart$OXO1;->XIi00iiXO:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->iO:F

    iget v3, p1, Lcom/sma/smartv3/view/MyPieChart$OXO1;->iO:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->XO0O10:F

    iget p1, p1, Lcom/sma/smartv3/view/MyPieChart$OXO1;->XO0O10:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->OXO1:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->XIi00iiXO:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->iO:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->XO0O10:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final iO()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->iO:F

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-wide v0, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->OXO1:J

    iget v2, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->XIi00iiXO:I

    iget v3, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->iO:F

    iget v4, p0, Lcom/sma/smartv3/view/MyPieChart$OXO1;->XO0O10:F

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "PieChartViewData(value="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", color="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", percentage="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", angle="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
