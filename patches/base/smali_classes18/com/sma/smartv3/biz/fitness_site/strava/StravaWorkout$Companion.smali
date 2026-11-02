.class public final Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getTypeByActivityMode(I)Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const/4 v0, 0x7

    if-eq p1, v0, :cond_1

    const/16 v0, 0xe

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    const-string p1, "Workout"

    return-object p1

    :pswitch_0
    const-string p1, "Walk"

    return-object p1

    :pswitch_1
    const-string p1, "Swim"

    return-object p1

    :pswitch_2
    const-string p1, "Ride"

    return-object p1

    :cond_0
    const-string p1, "Yoga"

    return-object p1

    :cond_1
    const-string p1, "Run"

    return-object p1

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getTypeByActivityModeType(I)Lcom/garmin/fit/Sport;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const/4 v0, 0x7

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    sget-object p1, Lcom/garmin/fit/Sport;->GENERIC:Lcom/garmin/fit/Sport;

    return-object p1

    :pswitch_0
    sget-object p1, Lcom/garmin/fit/Sport;->WALKING:Lcom/garmin/fit/Sport;

    return-object p1

    :pswitch_1
    sget-object p1, Lcom/garmin/fit/Sport;->SWIMMING:Lcom/garmin/fit/Sport;

    return-object p1

    :pswitch_2
    sget-object p1, Lcom/garmin/fit/Sport;->CYCLING:Lcom/garmin/fit/Sport;

    return-object p1

    :cond_0
    sget-object p1, Lcom/garmin/fit/Sport;->RUNNING:Lcom/garmin/fit/Sport;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
