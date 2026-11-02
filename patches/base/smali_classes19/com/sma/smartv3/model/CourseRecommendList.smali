.class public final Lcom/sma/smartv3/model/CourseRecommendList;
.super Lcom/sma/smartv3/model/JsonFieldContainer;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final course:Lcom/sma/smartv3/model/CourseDetails;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private courseTitle:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final id:I


# direct methods
.method public constructor <init>(ILjava/lang/String;Lcom/sma/smartv3/model/CourseDetails;)V
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/model/CourseDetails;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "courseTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "course"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 2
    iput p1, p0, Lcom/sma/smartv3/model/CourseRecommendList;->id:I

    .line 3
    iput-object p2, p0, Lcom/sma/smartv3/model/CourseRecommendList;->courseTitle:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/sma/smartv3/model/CourseRecommendList;->course:Lcom/sma/smartv3/model/CourseDetails;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/sma/smartv3/model/CourseDetails;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    .line 5
    const-string p2, ""

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/model/CourseRecommendList;-><init>(ILjava/lang/String;Lcom/sma/smartv3/model/CourseDetails;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/CourseRecommendList;ILjava/lang/String;Lcom/sma/smartv3/model/CourseDetails;ILjava/lang/Object;)Lcom/sma/smartv3/model/CourseRecommendList;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/sma/smartv3/model/CourseRecommendList;->id:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/sma/smartv3/model/CourseRecommendList;->courseTitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/sma/smartv3/model/CourseRecommendList;->course:Lcom/sma/smartv3/model/CourseDetails;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/model/CourseRecommendList;->copy(ILjava/lang/String;Lcom/sma/smartv3/model/CourseDetails;)Lcom/sma/smartv3/model/CourseRecommendList;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/CourseRecommendList;->id:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/CourseRecommendList;->courseTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/sma/smartv3/model/CourseDetails;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/CourseRecommendList;->course:Lcom/sma/smartv3/model/CourseDetails;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Lcom/sma/smartv3/model/CourseDetails;)Lcom/sma/smartv3/model/CourseRecommendList;
    .locals 1
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/model/CourseDetails;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "courseTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "course"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/model/CourseRecommendList;

    invoke-direct {v0, p1, p2, p3}, Lcom/sma/smartv3/model/CourseRecommendList;-><init>(ILjava/lang/String;Lcom/sma/smartv3/model/CourseDetails;)V

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
    instance-of v1, p1, Lcom/sma/smartv3/model/CourseRecommendList;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/CourseRecommendList;

    iget v1, p0, Lcom/sma/smartv3/model/CourseRecommendList;->id:I

    iget v3, p1, Lcom/sma/smartv3/model/CourseRecommendList;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/sma/smartv3/model/CourseRecommendList;->courseTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/model/CourseRecommendList;->courseTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/model/CourseRecommendList;->course:Lcom/sma/smartv3/model/CourseDetails;

    iget-object p1, p1, Lcom/sma/smartv3/model/CourseRecommendList;->course:Lcom/sma/smartv3/model/CourseDetails;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCourse()Lcom/sma/smartv3/model/CourseDetails;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/CourseRecommendList;->course:Lcom/sma/smartv3/model/CourseDetails;

    return-object v0
.end method

.method public final getCourseTitle()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/CourseRecommendList;->courseTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/CourseRecommendList;->id:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/model/CourseRecommendList;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/CourseRecommendList;->courseTitle:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/CourseRecommendList;->course:Lcom/sma/smartv3/model/CourseDetails;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/CourseDetails;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setCourseTitle(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/CourseRecommendList;->courseTitle:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/model/CourseRecommendList;->id:I

    iget-object v1, p0, Lcom/sma/smartv3/model/CourseRecommendList;->courseTitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/sma/smartv3/model/CourseRecommendList;->course:Lcom/sma/smartv3/model/CourseDetails;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CourseRecommendList(id="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", courseTitle="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", course="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
