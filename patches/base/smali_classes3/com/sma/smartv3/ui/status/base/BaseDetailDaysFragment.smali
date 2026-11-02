.class public abstract Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;
.super Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final mTimePeriod:Lcom/sma/smartv3/util/TimePeriod;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public range:[J


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment;-><init>()V

    sget-object v0, Lcom/sma/smartv3/util/TimePeriod;->DAY:Lcom/sma/smartv3/util/TimePeriod;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->mTimePeriod:Lcom/sma/smartv3/util/TimePeriod;

    return-void
.end method


# virtual methods
.method public getMTimePeriod()Lcom/sma/smartv3/util/TimePeriod;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->mTimePeriod:Lcom/sma/smartv3/util/TimePeriod;

    return-object v0
.end method

.method public final getRange()[J
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->range:[J

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "range"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final setRange([J)V
    .locals 1
    .param p1    # [J
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/base/BaseDetailDaysFragment;->range:[J

    return-void
.end method
