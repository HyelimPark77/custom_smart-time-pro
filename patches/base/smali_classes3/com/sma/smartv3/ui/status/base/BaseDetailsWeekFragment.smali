.class public abstract Lcom/sma/smartv3/ui/status/base/BaseDetailsWeekFragment;
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

.field private weekDay:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/by6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/BaseDetailsFragment;-><init>()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->getMCalendar()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->IXXOO(J)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseDetailsWeekFragment;->weekDay:Ljava/util/List;

    sget-object v0, Lcom/sma/smartv3/util/TimePeriod;->WEEK:Lcom/sma/smartv3/util/TimePeriod;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseDetailsWeekFragment;->mTimePeriod:Lcom/sma/smartv3/util/TimePeriod;

    return-void
.end method


# virtual methods
.method public getMTimePeriod()Lcom/sma/smartv3/util/TimePeriod;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseDetailsWeekFragment;->mTimePeriod:Lcom/sma/smartv3/util/TimePeriod;

    return-object v0
.end method

.method public final getWeekDay()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/by6;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/base/BaseDetailsWeekFragment;->weekDay:Ljava/util/List;

    return-object v0
.end method

.method public final setWeekDay(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/by6;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/base/BaseDetailsWeekFragment;->weekDay:Ljava/util/List;

    return-void
.end method
