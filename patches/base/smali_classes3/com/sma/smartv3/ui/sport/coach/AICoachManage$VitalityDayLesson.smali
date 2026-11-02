.class public final Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;
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
    name = "VitalityDayLesson"
.end annotation


# instance fields
.field private final lessonCode:I

.field private final lessonIcon:I

.field private final lessonName:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private lessonTarget:F

.field private final lessonTime:I

.field private final lessonTitle:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mIntervalLessons:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;",
            ">;"
        }
    .end annotation
.end field


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

    invoke-direct/range {v0 .. v9}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;-><init>(ILjava/lang/String;Ljava/lang/String;IIFLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;IIFLjava/util/List;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "IIF",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;",
            ">;)V"
        }
    .end annotation

    const-string v0, "lessonTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lessonName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 3
    iput p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonCode:I

    .line 4
    iput-object p2, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTitle:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonName:Ljava/lang/String;

    .line 6
    iput p4, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonIcon:I

    .line 7
    iput p5, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTime:I

    .line 8
    iput p6, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTarget:F

    .line 9
    iput-object p7, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->mIntervalLessons:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;IIFLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p9, p8, 0x2

    .line 10
    const-string v0, ""

    if-eqz p9, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    const/4 v0, 0x0

    if-eqz p9, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    const/high16 p6, 0x42be0000    # 95.0f

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    const/4 p7, 0x0

    :cond_6
    move p8, p6

    move-object p9, p7

    move p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-direct/range {p2 .. p9}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;-><init>(ILjava/lang/String;Ljava/lang/String;IIFLjava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;ILjava/lang/String;Ljava/lang/String;IIFLjava/util/List;ILjava/lang/Object;)Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonCode:I

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonName:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget p4, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonIcon:I

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget p5, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTime:I

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget p6, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTarget:F

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->mIntervalLessons:Ljava/util/List;

    :cond_6
    move p8, p6

    move-object p9, p7

    move p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->copy(ILjava/lang/String;Ljava/lang/String;IIFLjava/util/List;)Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonCode:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonIcon:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTime:I

    return v0
.end method

.method public final component6()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTarget:F

    return v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->mIntervalLessons:Ljava/util/List;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;IIFLjava/util/List;)Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;
    .locals 9
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "IIF",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;",
            ">;)",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;"
        }
    .end annotation

    const-string v0, "lessonTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lessonName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;-><init>(ILjava/lang/String;Ljava/lang/String;IIFLjava/util/List;)V

    return-object v1
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
    instance-of v1, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonCode:I

    iget v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonCode:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonName:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonIcon:I

    iget v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonIcon:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTime:I

    iget v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTime:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTarget:F

    iget v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTarget:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->mIntervalLessons:Ljava/util/List;

    iget-object p1, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->mIntervalLessons:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getLessonCode()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonCode:I

    return v0
.end method

.method public final getLessonIcon()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonIcon:I

    return v0
.end method

.method public final getLessonName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonName:Ljava/lang/String;

    return-object v0
.end method

.method public final getLessonTarget()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTarget:F

    return v0
.end method

.method public final getLessonTime()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTime:I

    return v0
.end method

.method public final getLessonTitle()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getMIntervalLessons()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLessonIntervalLessons;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->mIntervalLessons:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonCode:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTitle:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonIcon:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTarget:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->mIntervalLessons:Ljava/util/List;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final setLessonTarget(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTarget:F

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 9
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonCode:I

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonName:Ljava/lang/String;

    iget v3, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonIcon:I

    iget v4, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTime:I

    iget v5, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->lessonTarget:F

    iget-object v6, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;->mIntervalLessons:Ljava/util/List;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "VitalityDayLesson(lessonCode="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", lessonTitle="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", lessonName="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", lessonIcon="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", lessonTime="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", lessonTarget="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", mIntervalLessons="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
