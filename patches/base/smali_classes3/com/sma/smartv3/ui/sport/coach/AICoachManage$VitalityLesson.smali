.class public final Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;
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
    name = "VitalityLesson"
.end annotation


# instance fields
.field private final day:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private dayLesson:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;",
            ">;"
        }
    .end annotation
.end field

.field private final isCompletion:I


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/util/List;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;",
            ">;)V"
        }
    .end annotation

    const-string v0, "day"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dayLesson"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/sma/smartv3/model/JsonFieldContainer;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->day:Ljava/lang/String;

    .line 3
    iput p2, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->isCompletion:I

    .line 4
    iput-object p3, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->dayLesson:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 5
    const-string p1, "0"

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p2, 0x0

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;-><init>(Ljava/lang/String;ILjava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;Ljava/lang/String;ILjava/util/List;ILjava/lang/Object;)Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->day:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->isCompletion:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->dayLesson:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->copy(Ljava/lang/String;ILjava/util/List;)Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->day:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->isCompletion:I

    return v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->dayLesson:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILjava/util/List;)Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;",
            ">;)",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;"
        }
    .end annotation

    const-string v0, "day"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dayLesson"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;

    invoke-direct {v0, p1, p2, p3}, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;-><init>(Ljava/lang/String;ILjava/util/List;)V

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
    instance-of v1, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->day:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->day:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->isCompletion:I

    iget v3, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->isCompletion:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->dayLesson:Ljava/util/List;

    iget-object p1, p1, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->dayLesson:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getDay()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->day:Ljava/lang/String;

    return-object v0
.end method

.method public final getDayLesson()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->dayLesson:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->day:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->isCompletion:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->dayLesson:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isCompletion()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->isCompletion:I

    return v0
.end method

.method public final setDayLesson(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityDayLesson;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->dayLesson:Ljava/util/List;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->day:Ljava/lang/String;

    iget v1, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->isCompletion:I

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/coach/AICoachManage$VitalityLesson;->dayLesson:Ljava/util/List;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "VitalityLesson(day="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isCompletion="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", dayLesson="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
