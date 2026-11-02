.class public final Lcom/sma/smartv3/model/RecordActivityData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mAirPressure:I

.field private mAltitude:I

.field private mAvgBpm:I

.field private mAvgSpeed:F

.field private mAvgStress:I

.field private mCalorieTotal:I

.field private mDistanceTotal:F

.field private mMaxBpm:I

.field private mMaxPace:I

.field private mMaxSpm:I

.field private mMaxStress:I

.field private mMinBpm:I

.field private mMinPace:I

.field private mMinSpm:I

.field private mMinStress:I

.field private mPace:I

.field private mPauseTimeTotal:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mPlatform:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mSpeed:F

.field private mSpm:I

.field private mSportTimeStr:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mStepTotal:I

.field private mTimeList:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/RecordTimeList;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "00:00:00"

    iput-object v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mSportTimeStr:Ljava/lang/String;

    iput-object v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mPauseTimeTotal:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mTimeList:Ljava/util/ArrayList;

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mPlatform:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getMAirPressure()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mAirPressure:I

    return v0
.end method

.method public final getMAltitude()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mAltitude:I

    return v0
.end method

.method public final getMAvgBpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mAvgBpm:I

    return v0
.end method

.method public final getMAvgSpeed()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mAvgSpeed:F

    return v0
.end method

.method public final getMAvgStress()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mAvgStress:I

    return v0
.end method

.method public final getMCalorieTotal()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mCalorieTotal:I

    return v0
.end method

.method public final getMDistanceTotal()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mDistanceTotal:F

    return v0
.end method

.method public final getMMaxBpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mMaxBpm:I

    return v0
.end method

.method public final getMMaxPace()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mMaxPace:I

    return v0
.end method

.method public final getMMaxSpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mMaxSpm:I

    return v0
.end method

.method public final getMMaxStress()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mMaxStress:I

    return v0
.end method

.method public final getMMinBpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mMinBpm:I

    return v0
.end method

.method public final getMMinPace()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mMinPace:I

    return v0
.end method

.method public final getMMinSpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mMinSpm:I

    return v0
.end method

.method public final getMMinStress()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mMinStress:I

    return v0
.end method

.method public final getMPace()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mPace:I

    return v0
.end method

.method public final getMPauseTimeTotal()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mPauseTimeTotal:Ljava/lang/String;

    return-object v0
.end method

.method public final getMPlatform()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mPlatform:Ljava/lang/String;

    return-object v0
.end method

.method public final getMSpeed()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mSpeed:F

    return v0
.end method

.method public final getMSpm()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mSpm:I

    return v0
.end method

.method public final getMSportTimeStr()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mSportTimeStr:Ljava/lang/String;

    return-object v0
.end method

.method public final getMStepTotal()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mStepTotal:I

    return v0
.end method

.method public final getMTimeList()Ljava/util/ArrayList;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/RecordTimeList;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/RecordActivityData;->mTimeList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final setMAirPressure(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/RecordActivityData;->mAirPressure:I

    return-void
.end method

.method public final setMAltitude(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/RecordActivityData;->mAltitude:I

    return-void
.end method

.method public final setMAvgBpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/RecordActivityData;->mAvgBpm:I

    return-void
.end method

.method public final setMAvgSpeed(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/RecordActivityData;->mAvgSpeed:F

    return-void
.end method

.method public final setMAvgStress(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/RecordActivityData;->mAvgStress:I

    return-void
.end method

.method public final setMCalorieTotal(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/RecordActivityData;->mCalorieTotal:I

    return-void
.end method

.method public final setMDistanceTotal(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/RecordActivityData;->mDistanceTotal:F

    return-void
.end method

.method public final setMMaxBpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/RecordActivityData;->mMaxBpm:I

    return-void
.end method

.method public final setMMaxPace(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/RecordActivityData;->mMaxPace:I

    return-void
.end method

.method public final setMMaxSpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/RecordActivityData;->mMaxSpm:I

    return-void
.end method

.method public final setMMaxStress(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/RecordActivityData;->mMaxStress:I

    return-void
.end method

.method public final setMMinBpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/RecordActivityData;->mMinBpm:I

    return-void
.end method

.method public final setMMinPace(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/RecordActivityData;->mMinPace:I

    return-void
.end method

.method public final setMMinSpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/RecordActivityData;->mMinSpm:I

    return-void
.end method

.method public final setMMinStress(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/RecordActivityData;->mMinStress:I

    return-void
.end method

.method public final setMPace(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/RecordActivityData;->mPace:I

    return-void
.end method

.method public final setMPauseTimeTotal(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/RecordActivityData;->mPauseTimeTotal:Ljava/lang/String;

    return-void
.end method

.method public final setMPlatform(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/RecordActivityData;->mPlatform:Ljava/lang/String;

    return-void
.end method

.method public final setMSpeed(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/RecordActivityData;->mSpeed:F

    return-void
.end method

.method public final setMSpm(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/RecordActivityData;->mSpm:I

    return-void
.end method

.method public final setMSportTimeStr(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/RecordActivityData;->mSportTimeStr:Ljava/lang/String;

    return-void
.end method

.method public final setMStepTotal(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/RecordActivityData;->mStepTotal:I

    return-void
.end method

.method public final setMTimeList(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/RecordTimeList;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/RecordActivityData;->mTimeList:Ljava/util/ArrayList;

    return-void
.end method
