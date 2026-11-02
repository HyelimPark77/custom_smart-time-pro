.class public final Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;
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
    name = "PlanGroupTitle"
.end annotation


# instance fields
.field private isCompleted:Z

.field private isHaveLesson:Z

.field private mLessonIndex:I

.field private ofWeek:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private remarks:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private timeDay:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;-><init>(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "ofWeek"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeDay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remarks"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->ofWeek:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->timeDay:Ljava/lang/String;

    .line 5
    iput-boolean p3, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->isHaveLesson:Z

    .line 6
    iput-boolean p4, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->isCompleted:Z

    .line 7
    iput p5, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->mLessonIndex:I

    .line 8
    iput-object p6, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->remarks:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    .line 9
    const-string p1, "\u5468\u65e5"

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    .line 10
    const-string p2, "01"

    :cond_1
    and-int/lit8 p8, p7, 0x4

    const/4 v0, 0x0

    if-eqz p8, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    const/4 p5, -0x1

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    .line 11
    const-string p6, ""

    :cond_5
    move p7, p5

    move-object p8, p6

    move p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    .line 12
    invoke-direct/range {p2 .. p8}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;-><init>(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;ILjava/lang/Object;)Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->ofWeek:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->timeDay:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-boolean p3, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->isHaveLesson:Z

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-boolean p4, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->isCompleted:Z

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget p5, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->mLessonIndex:I

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->remarks:Ljava/lang/String;

    :cond_5
    move p7, p5

    move-object p8, p6

    move p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->copy(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;)Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->ofWeek:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->timeDay:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->isHaveLesson:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->isCompleted:Z

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->mLessonIndex:I

    return v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->remarks:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;)Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;
    .locals 8
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "ofWeek"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeDay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remarks"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;-><init>(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/String;)V

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
    instance-of v1, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->ofWeek:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->ofWeek:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->timeDay:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->timeDay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->isHaveLesson:Z

    iget-boolean v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->isHaveLesson:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->isCompleted:Z

    iget-boolean v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->isCompleted:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->mLessonIndex:I

    iget v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->mLessonIndex:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->remarks:Ljava/lang/String;

    iget-object p1, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->remarks:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getMLessonIndex()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->mLessonIndex:I

    return v0
.end method

.method public final getOfWeek()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->ofWeek:Ljava/lang/String;

    return-object v0
.end method

.method public final getRemarks()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->remarks:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimeDay()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->timeDay:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->ofWeek:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->timeDay:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->isHaveLesson:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->isCompleted:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->mLessonIndex:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->remarks:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isCompleted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->isCompleted:Z

    return v0
.end method

.method public final isHaveLesson()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->isHaveLesson:Z

    return v0
.end method

.method public final setCompleted(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->isCompleted:Z

    return-void
.end method

.method public final setHaveLesson(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->isHaveLesson:Z

    return-void
.end method

.method public final setMLessonIndex(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->mLessonIndex:I

    return-void
.end method

.method public final setOfWeek(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->ofWeek:Ljava/lang/String;

    return-void
.end method

.method public final setRemarks(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->remarks:Ljava/lang/String;

    return-void
.end method

.method public final setTimeDay(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->timeDay:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->ofWeek:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->timeDay:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->isHaveLesson:Z

    iget-boolean v3, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->isCompleted:Z

    iget v4, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->mLessonIndex:I

    iget-object v5, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$PlanGroupTitle;->remarks:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "PlanGroupTitle(ofWeek="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", timeDay="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isHaveLesson="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isCompleted="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", mLessonIndex="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", remarks="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
