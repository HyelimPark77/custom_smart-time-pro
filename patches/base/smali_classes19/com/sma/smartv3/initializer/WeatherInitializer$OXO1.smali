.class public final Lcom/sma/smartv3/initializer/WeatherInitializer$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IO0OI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/initializer/WeatherInitializer;->XXI(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final O00(Lcom/sma/smartv3/location/CustomLocation;Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v0

    invoke-virtual {p0}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v2

    invoke-virtual {p0}, Lcom/sma/smartv3/location/CustomLocation;->OXO1()D

    move-result-wide v4

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "lon:"

    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", lat:"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", altitude:"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/tv6;->I0iXXO(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/location/CustomLocation;Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/initializer/WeatherInitializer$OXO1;->O00(Lcom/sma/smartv3/location/CustomLocation;Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final XO0O10(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lcom/android/mltcode/paycertificationapi/tv6;->I0iXXO(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic iO(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/initializer/WeatherInitializer$OXO1;->XO0O10(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public OXO1(Lcom/sma/smartv3/location/CustomLocation;)V
    .locals 9

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/bv6;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/bv6;-><init>(Lcom/sma/smartv3/location/CustomLocation;)V

    invoke-static {v1, v0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->I0IIOi(Lcom/sma/smartv3/initializer/WeatherInitializer;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v2

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v4

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->OXO1()D

    move-result-wide v6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Weather onLocationChange -> lon:"

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v2, ", lat:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v2, ", altitude:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v2

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v4

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->OXO1()D

    move-result-wide v6

    invoke-virtual/range {v1 .. v7}, Lcom/sma/smartv3/initializer/WeatherInitializer;->X0O(DDD)V

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->IiI10X()D

    move-result-wide v2

    invoke-virtual {p1}, Lcom/sma/smartv3/location/CustomLocation;->XO0O10()D

    move-result-wide v4

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/sma/smartv3/initializer/WeatherInitializer;->O10IXXX0X(DD)V

    invoke-static {v1}, Lcom/sma/smartv3/initializer/WeatherInitializer;->IiI10X(Lcom/sma/smartv3/initializer/WeatherInitializer;)V

    return-void
.end method

.method public onError(Ljava/lang/String;)V
    .locals 2

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/cv6;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/cv6;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/sma/smartv3/initializer/WeatherInitializer;->I0IIOi(Lcom/sma/smartv3/initializer/WeatherInitializer;Lkotlin/jvm/functions/Function1;)V

    invoke-static {v0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->IiI10X(Lcom/sma/smartv3/initializer/WeatherInitializer;)V

    return-void
.end method
