.class public final Lcom/sma/smartv3/model/NavigatorItem;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final mBackWard:I

.field private final mFlatNum:I

.field private final mLastWorkout:Lcom/sma/smartv3/db/entity/Workout;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mLeadingNum:I

.field private final mMode:I

.field private final mNavigatorMoonItem:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/NavigatorMoonItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(IIIILcom/sma/smartv3/db/entity/Workout;Ljava/util/List;)V
    .locals 1
    .param p5    # Lcom/sma/smartv3/db/entity/Workout;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIII",
            "Lcom/sma/smartv3/db/entity/Workout;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/NavigatorMoonItem;",
            ">;)V"
        }
    .end annotation

    const-string v0, "mLastWorkout"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mNavigatorMoonItem"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/sma/smartv3/model/NavigatorItem;->mMode:I

    .line 3
    iput p2, p0, Lcom/sma/smartv3/model/NavigatorItem;->mLeadingNum:I

    .line 4
    iput p3, p0, Lcom/sma/smartv3/model/NavigatorItem;->mFlatNum:I

    .line 5
    iput p4, p0, Lcom/sma/smartv3/model/NavigatorItem;->mBackWard:I

    .line 6
    iput-object p5, p0, Lcom/sma/smartv3/model/NavigatorItem;->mLastWorkout:Lcom/sma/smartv3/db/entity/Workout;

    .line 7
    iput-object p6, p0, Lcom/sma/smartv3/model/NavigatorItem;->mNavigatorMoonItem:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(IIIILcom/sma/smartv3/db/entity/Workout;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x2

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_1

    move p3, v0

    :cond_1
    and-int/lit8 p7, p7, 0x8

    if-eqz p7, :cond_2

    move-object p7, p6

    move-object p6, p5

    move p5, v0

    :goto_0
    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move-object p7, p6

    move-object p6, p5

    move p5, p4

    goto :goto_0

    .line 8
    :goto_1
    invoke-direct/range {p1 .. p7}, Lcom/sma/smartv3/model/NavigatorItem;-><init>(IIIILcom/sma/smartv3/db/entity/Workout;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/model/NavigatorItem;IIIILcom/sma/smartv3/db/entity/Workout;Ljava/util/List;ILjava/lang/Object;)Lcom/sma/smartv3/model/NavigatorItem;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lcom/sma/smartv3/model/NavigatorItem;->mMode:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget p2, p0, Lcom/sma/smartv3/model/NavigatorItem;->mLeadingNum:I

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget p3, p0, Lcom/sma/smartv3/model/NavigatorItem;->mFlatNum:I

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget p4, p0, Lcom/sma/smartv3/model/NavigatorItem;->mBackWard:I

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/sma/smartv3/model/NavigatorItem;->mLastWorkout:Lcom/sma/smartv3/db/entity/Workout;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/sma/smartv3/model/NavigatorItem;->mNavigatorMoonItem:Ljava/util/List;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/sma/smartv3/model/NavigatorItem;->copy(IIIILcom/sma/smartv3/db/entity/Workout;Ljava/util/List;)Lcom/sma/smartv3/model/NavigatorItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/NavigatorItem;->mMode:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/NavigatorItem;->mLeadingNum:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/NavigatorItem;->mFlatNum:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/NavigatorItem;->mBackWard:I

    return v0
.end method

.method public final component5()Lcom/sma/smartv3/db/entity/Workout;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/NavigatorItem;->mLastWorkout:Lcom/sma/smartv3/db/entity/Workout;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/NavigatorMoonItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/NavigatorItem;->mNavigatorMoonItem:Ljava/util/List;

    return-object v0
.end method

.method public final copy(IIIILcom/sma/smartv3/db/entity/Workout;Ljava/util/List;)Lcom/sma/smartv3/model/NavigatorItem;
    .locals 8
    .param p5    # Lcom/sma/smartv3/db/entity/Workout;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIII",
            "Lcom/sma/smartv3/db/entity/Workout;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/NavigatorMoonItem;",
            ">;)",
            "Lcom/sma/smartv3/model/NavigatorItem;"
        }
    .end annotation

    const-string v0, "mLastWorkout"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mNavigatorMoonItem"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/model/NavigatorItem;

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/sma/smartv3/model/NavigatorItem;-><init>(IIIILcom/sma/smartv3/db/entity/Workout;Ljava/util/List;)V

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
    instance-of v1, p1, Lcom/sma/smartv3/model/NavigatorItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/model/NavigatorItem;

    iget v1, p0, Lcom/sma/smartv3/model/NavigatorItem;->mMode:I

    iget v3, p1, Lcom/sma/smartv3/model/NavigatorItem;->mMode:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/sma/smartv3/model/NavigatorItem;->mLeadingNum:I

    iget v3, p1, Lcom/sma/smartv3/model/NavigatorItem;->mLeadingNum:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/sma/smartv3/model/NavigatorItem;->mFlatNum:I

    iget v3, p1, Lcom/sma/smartv3/model/NavigatorItem;->mFlatNum:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/sma/smartv3/model/NavigatorItem;->mBackWard:I

    iget v3, p1, Lcom/sma/smartv3/model/NavigatorItem;->mBackWard:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/model/NavigatorItem;->mLastWorkout:Lcom/sma/smartv3/db/entity/Workout;

    iget-object v3, p1, Lcom/sma/smartv3/model/NavigatorItem;->mLastWorkout:Lcom/sma/smartv3/db/entity/Workout;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/sma/smartv3/model/NavigatorItem;->mNavigatorMoonItem:Ljava/util/List;

    iget-object p1, p1, Lcom/sma/smartv3/model/NavigatorItem;->mNavigatorMoonItem:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getMBackWard()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/NavigatorItem;->mBackWard:I

    return v0
.end method

.method public final getMFlatNum()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/NavigatorItem;->mFlatNum:I

    return v0
.end method

.method public final getMLastWorkout()Lcom/sma/smartv3/db/entity/Workout;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/NavigatorItem;->mLastWorkout:Lcom/sma/smartv3/db/entity/Workout;

    return-object v0
.end method

.method public final getMLeadingNum()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/NavigatorItem;->mLeadingNum:I

    return v0
.end method

.method public final getMMode()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/NavigatorItem;->mMode:I

    return v0
.end method

.method public final getMNavigatorMoonItem()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/NavigatorMoonItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/NavigatorItem;->mNavigatorMoonItem:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/model/NavigatorItem;->mMode:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/NavigatorItem;->mLeadingNum:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/NavigatorItem;->mFlatNum:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/model/NavigatorItem;->mBackWard:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/NavigatorItem;->mLastWorkout:Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/model/NavigatorItem;->mNavigatorMoonItem:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget v0, p0, Lcom/sma/smartv3/model/NavigatorItem;->mMode:I

    iget v1, p0, Lcom/sma/smartv3/model/NavigatorItem;->mLeadingNum:I

    iget v2, p0, Lcom/sma/smartv3/model/NavigatorItem;->mFlatNum:I

    iget v3, p0, Lcom/sma/smartv3/model/NavigatorItem;->mBackWard:I

    iget-object v4, p0, Lcom/sma/smartv3/model/NavigatorItem;->mLastWorkout:Lcom/sma/smartv3/db/entity/Workout;

    iget-object v5, p0, Lcom/sma/smartv3/model/NavigatorItem;->mNavigatorMoonItem:Ljava/util/List;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "NavigatorItem(mMode="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mLeadingNum="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mFlatNum="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mBackWard="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", mLastWorkout="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", mNavigatorMoonItem="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
