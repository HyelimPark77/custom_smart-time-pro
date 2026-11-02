.class public final Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;
.super Lcom/bestmafen/baseble/data/BleWritable;
.source "SourceFile"


# instance fields
.field private mCourseCalorie:I

.field private mCourseCode:I

.field private mCourseContentNumber:I

.field private mCourseTime:I

.field private mCoursesContent:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAICoachCourseV2;",
            ">;"
        }
    .end annotation
.end field

.field private mRepeatNumber:I


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

    invoke-direct/range {v0 .. v8}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;-><init>(IIIIILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIIIILjava/util/List;)V
    .locals 1
    .param p6    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIII",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAICoachCourseV2;",
            ">;)V"
        }
    .end annotation

    const-string v0, "mCoursesContent"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/bestmafen/baseble/data/BleWritable;-><init>()V

    .line 3
    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseCode:I

    .line 4
    iput p2, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseContentNumber:I

    .line 5
    iput p3, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseTime:I

    .line 6
    iput p4, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseCalorie:I

    .line 7
    iput p5, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mRepeatNumber:I

    .line 8
    iput-object p6, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCoursesContent:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(IIIIILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const/4 p1, -0x1

    :cond_0
    and-int/lit8 p8, p7, 0x2

    const/4 v0, 0x0

    if-eqz p8, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    .line 9
    new-instance p6, Ljava/util/ArrayList;

    invoke-direct {p6}, Ljava/util/ArrayList;-><init>()V

    :cond_5
    move p7, p5

    move-object p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    .line 10
    invoke-direct/range {p2 .. p8}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;-><init>(IIIIILjava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;IIIIILjava/util/List;ILjava/lang/Object;)Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseCode:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget p2, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseContentNumber:I

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget p3, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseTime:I

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget p4, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseCalorie:I

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget p5, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mRepeatNumber:I

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCoursesContent:Ljava/util/List;

    :cond_5
    move p7, p5

    move-object p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->copy(IIIIILjava/util/List;)Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseCode:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseContentNumber:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseTime:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseCalorie:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mRepeatNumber:I

    return v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAICoachCourseV2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCoursesContent:Ljava/util/List;

    return-object v0
.end method

.method public final copy(IIIIILjava/util/List;)Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;
    .locals 8
    .param p6    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIIII",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAICoachCourseV2;",
            ">;)",
            "Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;"
        }
    .end annotation

    const-string v0, "mCoursesContent"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;-><init>(IIIIILjava/util/List;)V

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
    instance-of v1, p1, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseCode:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseCode:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseContentNumber:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseContentNumber:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseTime:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseTime:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseCalorie:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseCalorie:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mRepeatNumber:I

    iget v3, p1, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mRepeatNumber:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCoursesContent:Ljava/util/List;

    iget-object p1, p1, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCoursesContent:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getMCourseCalorie()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseCalorie:I

    return v0
.end method

.method public final getMCourseCode()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseCode:I

    return v0
.end method

.method public final getMCourseContentNumber()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseContentNumber:I

    return v0
.end method

.method public final getMCourseTime()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseTime:I

    return v0
.end method

.method public final getMCoursesContent()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAICoachCourseV2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCoursesContent:Ljava/util/List;

    return-object v0
.end method

.method public final getMRepeatNumber()I
    .locals 1

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mRepeatNumber:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseCode:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseContentNumber:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseTime:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseCalorie:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mRepeatNumber:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCoursesContent:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setMCourseCalorie(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseCalorie:I

    return-void
.end method

.method public final setMCourseCode(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseCode:I

    return-void
.end method

.method public final setMCourseContentNumber(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseContentNumber:I

    return-void
.end method

.method public final setMCourseTime(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseTime:I

    return-void
.end method

.method public final setMCoursesContent(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAICoachCourseV2;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCoursesContent:Ljava/util/List;

    return-void
.end method

.method public final setMRepeatNumber(I)V
    .locals 0

    iput p1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mRepeatNumber:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BleAICoachDayPlanCourseV2(mCourseCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCourseContentNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseContentNumber:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCourseTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCourseCalorie="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCourseCalorie:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mRepeatNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mRepeatNumber:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCoursesContent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/szabh/smable3/entity/BleAICoachDayPlanCourseV2;->mCoursesContent:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
