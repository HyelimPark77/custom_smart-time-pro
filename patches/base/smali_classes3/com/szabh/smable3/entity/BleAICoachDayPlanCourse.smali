.class public final Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# instance fields
.field private mCourseGoal:F

.field private mCourseIndex:I

.field private mCourseNumber:I

.field private mCoursesItem:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAICoachCourse;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;-><init>(ILjava/util/List;IFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ILjava/util/List;IF)V
    .locals 1
    .param p2    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAICoachCourse;",
            ">;IF)V"
        }
    .end annotation

    const-string v0, "mCoursesItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseNumber:I

    .line 4
    iput-object p2, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCoursesItem:Ljava/util/List;

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseIndex:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseGoal:F

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;IFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    .line 7
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    const/4 p4, 0x0

    .line 8
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;-><init>(ILjava/util/List;IF)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;ILjava/util/List;IFILjava/lang/Object;)Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseNumber:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCoursesItem:Ljava/util/List;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseIndex:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseGoal:F

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->copy(ILjava/util/List;IF)Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseNumber:I

    return v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAICoachCourse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCoursesItem:Ljava/util/List;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseIndex:I

    return v0
.end method

.method public final component4()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseGoal:F

    return v0
.end method

.method public final copy(ILjava/util/List;IF)Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;
    .locals 1
    .param p2    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAICoachCourse;",
            ">;IF)",
            "Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;"
        }
    .end annotation

    const-string v0, "mCoursesItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;-><init>(ILjava/util/List;IF)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseNumber:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseNumber:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCoursesItem:Ljava/util/List;

    iget-object v3, p1, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCoursesItem:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseIndex:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseIndex:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseGoal:F

    iget p1, p1, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseGoal:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getMCourseGoal()F
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseGoal:F

    return v0
.end method

.method public final getMCourseIndex()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseIndex:I

    return v0
.end method

.method public final getMCourseNumber()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseNumber:I

    return v0
.end method

.method public final getMCoursesItem()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAICoachCourse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCoursesItem:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseNumber:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCoursesItem:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseIndex:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseGoal:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMCourseGoal(F)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseGoal:F

    return-void
.end method

.method public final setMCourseIndex(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseIndex:I

    return-void
.end method

.method public final setMCourseNumber(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseNumber:I

    return-void
.end method

.method public final setMCoursesItem(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAICoachCourse;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCoursesItem:Ljava/util/List;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleAICoachDayPlanCourse(mCourseNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseNumber:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCoursesItem="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCoursesItem:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mCourseIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseIndex:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCourseGoal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourse;->mCourseGoal:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
