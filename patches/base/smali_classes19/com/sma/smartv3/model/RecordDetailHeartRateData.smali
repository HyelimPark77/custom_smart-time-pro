.class public final Lcom/sma/smartv3/model/RecordDetailHeartRateData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mAerobic:J

.field private mAnaerobic:J

.field private mAvgHR:I

.field private mFatBurning:J

.field private mHeartRateList:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/db/entity/HeartRate;",
            ">;"
        }
    .end annotation
.end field

.field private mMaxHR:I

.field private mMinHR:I

.field private mStrenuous:J

.field private mWarmUp:J


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->mHeartRateList:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final getMAerobic()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->mAerobic:J

    return-wide v0
.end method

.method public final getMAnaerobic()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->mAnaerobic:J

    return-wide v0
.end method

.method public final getMAvgHR()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->mAvgHR:I

    return v0
.end method

.method public final getMFatBurning()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->mFatBurning:J

    return-wide v0
.end method

.method public final getMHeartRateList()Ljava/util/ArrayList;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/db/entity/HeartRate;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->mHeartRateList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getMMaxHR()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->mMaxHR:I

    return v0
.end method

.method public final getMMinHR()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->mMinHR:I

    return v0
.end method

.method public final getMStrenuous()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->mStrenuous:J

    return-wide v0
.end method

.method public final getMWarmUp()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->mWarmUp:J

    return-wide v0
.end method

.method public final setMAerobic(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->mAerobic:J

    return-void
.end method

.method public final setMAnaerobic(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->mAnaerobic:J

    return-void
.end method

.method public final setMAvgHR(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->mAvgHR:I

    return-void
.end method

.method public final setMFatBurning(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->mFatBurning:J

    return-void
.end method

.method public final setMHeartRateList(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/db/entity/HeartRate;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->mHeartRateList:Ljava/util/ArrayList;

    return-void
.end method

.method public final setMMaxHR(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->mMaxHR:I

    return-void
.end method

.method public final setMMinHR(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->mMinHR:I

    return-void
.end method

.method public final setMStrenuous(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->mStrenuous:J

    return-void
.end method

.method public final setMWarmUp(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->mWarmUp:J

    return-void
.end method
