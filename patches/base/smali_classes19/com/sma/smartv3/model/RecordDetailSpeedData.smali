.class public final Lcom/sma/smartv3/model/RecordDetailSpeedData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mFastestSpeed:F

.field private mPaceList:Ljava/util/ArrayList;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/model/RecordDetailSpeedData;->mPaceList:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final getMFastestSpeed()F
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/model/RecordDetailSpeedData;->mFastestSpeed:F

    return v0
.end method

.method public final getMPaceList()Ljava/util/ArrayList;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/model/RecordDetailSpeedData;->mPaceList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final setMFastestSpeed(F)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/model/RecordDetailSpeedData;->mFastestSpeed:F

    return-void
.end method

.method public final setMPaceList(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/model/RecordDetailSpeedData;->mPaceList:Ljava/util/ArrayList;

    return-void
.end method
