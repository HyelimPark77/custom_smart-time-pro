.class public final Lcom/sma/smartv3/initializer/WeatherInitializer$XIi00iiXO;
.super Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/initializer/WeatherInitializer;->X1ii()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWeatherInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer$requestWeather$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n1#2:552\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWeatherInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer$requestWeather$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n1#2:552\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;-><init>()V

    return-void
.end method

.method public static final I0IIOi(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    invoke-static {v0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->O00(Lcom/sma/smartv3/initializer/WeatherInitializer;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "Location permission is not granted"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/android/mltcode/paycertificationapi/tv6;->X1ii(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static final IiI10X(Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 2

    const-string v0, "status"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/bestmafen/androidbase/extension/PermissionStatus;->GRANTED:Lcom/bestmafen/androidbase/extension/PermissionStatus;

    if-ne p0, v0, :cond_1

    const-string p0, "Weather syncWeather -> start Location"

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-static {}, Lcom/sma/smartv3/initializer/WeatherInitializer;->XO0O10()Lcom/android/mltcode/paycertificationapi/ms;

    move-result-object p0

    if-eqz p0, :cond_0

    const v0, 0x7f140c4f

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/android/mltcode/paycertificationapi/ms;->IiI10X(IZ)V

    :cond_0
    sget-object p0, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/fv6;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/fv6;-><init>()V

    invoke-static {p0, v0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->I0IIOi(Lcom/sma/smartv3/initializer/WeatherInitializer;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_1
    const-string p0, "Weather syncWeather -> Location permission is not granted"

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    sget-object p0, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/gv6;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/gv6;-><init>()V

    invoke-static {p0, v0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->I0IIOi(Lcom/sma/smartv3/initializer/WeatherInitializer;Lkotlin/jvm/functions/Function1;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static final OIi0(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    invoke-static {v0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->O00(Lcom/sma/smartv3/initializer/WeatherInitializer;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "Network is not available"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/android/mltcode/paycertificationapi/tv6;->X1ii(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic OXO1(Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/initializer/WeatherInitializer$XIi00iiXO;->IiI10X(Lcom/bestmafen/androidbase/extension/PermissionStatus;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/initializer/WeatherInitializer$XIi00iiXO;->I0IIOi(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/initializer/WeatherInitializer$XIi00iiXO;->OIi0(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final XOO0ii0(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, ""

    invoke-virtual {p0, v0}, Lcom/android/mltcode/paycertificationapi/tv6;->X1ii(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    invoke-static {v0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->O00(Lcom/sma/smartv3/initializer/WeatherInitializer;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "startLocation"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/android/mltcode/paycertificationapi/tv6;->I0iXXO(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic iO(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/initializer/WeatherInitializer$XIi00iiXO;->XOO0ii0(Lcom/android/mltcode/paycertificationapi/tv6;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public O00(Z)V
    .locals 8

    if-eqz p1, :cond_2

    const-string p1, "Weather syncWeather"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "APP_LAST_LOCATION_INFO"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->isAppForeground()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_1

    const-string p1, "App foreground false -- get Weather"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    const-string p1, ","

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt__StringsKt;->i1I(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ge v1, v0, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, "0"

    :goto_0
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v6

    sget-object v1, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    invoke-virtual/range {v1 .. v7}, Lcom/sma/smartv3/initializer/WeatherInitializer;->X0O(DDD)V

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/sma/smartv3/initializer/WeatherInitializer;->O10IXXX0X(DD)V

    return-void

    :cond_1
    const-string p1, "App foreground true -- get Weather"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    const-string p1, "LOCATION"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/PermissionUtils;->permission([Ljava/lang/String;)Lcom/blankj/utilcode/util/PermissionUtils;

    move-result-object v0

    const-string p1, "permission(...)"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/android/mltcode/paycertificationapi/dv6;

    invoke-direct {v3}, Lcom/android/mltcode/paycertificationapi/dv6;-><init>()V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/ds1;->iO(Lcom/blankj/utilcode/util/PermissionUtils;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void

    :cond_2
    const-string p1, "Weather syncWeather -> Network is not available"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    sget-object p1, Lcom/sma/smartv3/initializer/WeatherInitializer;->IO:Lcom/sma/smartv3/initializer/WeatherInitializer;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ev6;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/ev6;-><init>()V

    invoke-static {p1, v0}, Lcom/sma/smartv3/initializer/WeatherInitializer;->I0IIOi(Lcom/sma/smartv3/initializer/WeatherInitializer;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public doInBackground()Ljava/lang/Boolean;
    .locals 1

    .line 2
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->isAvailable()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic doInBackground()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/WeatherInitializer$XIi00iiXO;->doInBackground()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/initializer/WeatherInitializer$XIi00iiXO;->O00(Z)V

    return-void
.end method
