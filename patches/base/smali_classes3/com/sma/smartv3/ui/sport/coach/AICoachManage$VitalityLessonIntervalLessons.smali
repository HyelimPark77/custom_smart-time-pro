.class public final Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/sport/coach/AICoachManage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "VitalityLessonIntervalLessons"
.end annotation


# instance fields
.field private final intenseMinutes:I

.field private final lowerBoundHR:I

.field private final repeatTimes:I

.field private final restHR:I

.field private final restMinutes:I

.field private final target:F

.field private final upperBoundHR:I


# direct methods
.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;-><init>(IIIIIIFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIIIF)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->intenseMinutes:I

    .line 4
    iput p2, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->restMinutes:I

    .line 5
    iput p3, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->upperBoundHR:I

    .line 6
    iput p4, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->lowerBoundHR:I

    .line 7
    iput p5, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->restHR:I

    .line 8
    iput p6, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->repeatTimes:I

    .line 9
    iput p7, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->target:F

    return-void
.end method

.method public synthetic constructor <init>(IIIIIIFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    const/16 p3, 0x88

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    const/16 p4, 0x71

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    const/16 p5, 0x68

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    move p6, v0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    const/high16 p7, 0x42960000    # 75.0f

    :cond_6
    move p8, p7

    move p7, p6

    move p6, p5

    move p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    .line 10
    invoke-direct/range {p1 .. p8}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;-><init>(IIIIIIF)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;IIIIIIFILjava/lang/Object;)Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->intenseMinutes:I

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget p2, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->restMinutes:I

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget p3, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->upperBoundHR:I

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget p4, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->lowerBoundHR:I

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget p5, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->restHR:I

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget p6, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->repeatTimes:I

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget p7, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->target:F

    :cond_6
    move p8, p6

    move p9, p7

    move p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->copy(IIIIIIF)Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->intenseMinutes:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->restMinutes:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->upperBoundHR:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->lowerBoundHR:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->restHR:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->repeatTimes:I

    return v0
.end method

.method public final component7()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->target:F

    return v0
.end method

.method public final copy(IIIIIIF)Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;-><init>(IIIIIIF)V

    return-object v0
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
    instance-of v1, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->intenseMinutes:I

    iget v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->intenseMinutes:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->restMinutes:I

    iget v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->restMinutes:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->upperBoundHR:I

    iget v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->upperBoundHR:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->lowerBoundHR:I

    iget v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->lowerBoundHR:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->restHR:I

    iget v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->restHR:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->repeatTimes:I

    iget v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->repeatTimes:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->target:F

    iget p1, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->target:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getIntenseMinutes()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->intenseMinutes:I

    return v0
.end method

.method public final getLowerBoundHR()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->lowerBoundHR:I

    return v0
.end method

.method public final getRepeatTimes()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->repeatTimes:I

    return v0
.end method

.method public final getRestHR()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->restHR:I

    return v0
.end method

.method public final getRestMinutes()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->restMinutes:I

    return v0
.end method

.method public final getTarget()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->target:F

    return v0
.end method

.method public final getUpperBoundHR()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->upperBoundHR:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->intenseMinutes:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->restMinutes:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->upperBoundHR:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->lowerBoundHR:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->restHR:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->repeatTimes:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->target:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->intenseMinutes:I

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->restMinutes:I

    iget v2, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->upperBoundHR:I

    iget v3, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->lowerBoundHR:I

    iget v4, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->restHR:I

    iget v5, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->repeatTimes:I

    iget v6, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;->target:F

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "VitalityLessonIntervalLessons(intenseMinutes="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", restMinutes="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", upperBoundHR="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", lowerBoundHR="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", restHR="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", repeatTimes="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", target="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
