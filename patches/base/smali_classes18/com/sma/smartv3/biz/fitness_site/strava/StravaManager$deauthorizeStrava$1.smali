.class public final Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager$deauthorizeStrava$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/androidnetworking/interfaces/JSONObjectRequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->deauthorizeStrava(Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStravaManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StravaManager.kt\ncom/sma/smartv3/biz/fitness_site/strava/StravaManager$deauthorizeStrava$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,667:1\n27#2,2:668\n27#2,2:670\n*S KotlinDebug\n*F\n+ 1 StravaManager.kt\ncom/sma/smartv3/biz/fitness_site/strava/StravaManager$deauthorizeStrava$1\n*L\n116#1:668,2\n123#1:670,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nStravaManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StravaManager.kt\ncom/sma/smartv3/biz/fitness_site/strava/StravaManager$deauthorizeStrava$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,667:1\n27#2,2:668\n27#2,2:670\n*S KotlinDebug\n*F\n+ 1 StravaManager.kt\ncom/sma/smartv3/biz/fitness_site/strava/StravaManager$deauthorizeStrava$1\n*L\n116#1:668,2\n123#1:670,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $callback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager$deauthorizeStrava$1;->$callback:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/androidnetworking/error/ANError;)V
    .locals 1

    const-string v0, "anError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/androidnetworking/error/ANError;->getErrorCode()I

    move-result p1

    const/16 v0, 0x191

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager$deauthorizeStrava$1;->$callback:Lkotlin/jvm/functions/Function1;

    if-eqz p1, :cond_0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-class v0, Lcom/sma/smartv3/biz/fitness_site/strava/StravaToken;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager$deauthorizeStrava$1;->$callback:Lkotlin/jvm/functions/Function1;

    if-eqz p1, :cond_2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public onResponse(Lorg/json/JSONObject;)V
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager$deauthorizeStrava$1;->$callback:Lkotlin/jvm/functions/Function1;

    if-eqz p1, :cond_0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-class v0, Lcom/sma/smartv3/biz/fitness_site/strava/StravaToken;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    return-void
.end method
