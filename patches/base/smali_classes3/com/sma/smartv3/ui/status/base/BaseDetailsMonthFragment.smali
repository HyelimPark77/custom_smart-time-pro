.class public abstract Lcom/sma/smartv3/ui/status/base/BaseDetailsMonthFragment;
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


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment;-><init>()V

    sget-object v0, Lcom/sma/smartv3/util/TimePeriod;->MONTH:Lcom/sma/smartv3/util/TimePeriod;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseDetailsMonthFragment;->mTimePeriod:Lcom/sma/smartv3/util/TimePeriod;

    return-void
.end method


# virtual methods
.method public getMTimePeriod()Lcom/sma/smartv3/util/TimePeriod;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseDetailsMonthFragment;->mTimePeriod:Lcom/sma/smartv3/util/TimePeriod;

    return-object v0
.end method
