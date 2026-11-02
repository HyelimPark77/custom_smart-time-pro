.class public final Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitWorkout$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitWorkout;
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
    invoke-direct {p0}, Lcom/sma/smartv3/biz/fitness_site/fitbit/FitbitWorkout$Companion;-><init>()V

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
