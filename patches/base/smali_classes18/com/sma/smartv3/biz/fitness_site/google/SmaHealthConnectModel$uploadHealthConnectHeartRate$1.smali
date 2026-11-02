.class public final Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;->uploadHealthConnectHeartRate(Ljava/util/List;Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;Lcom/example/health/data/HealthConnectManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSmaHealthConnectModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1\n+ 2 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n*L\n1#1,629:1\n488#2,19:630\n*S KotlinDebug\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1\n*L\n313#1:630,19\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectHeartRate$1"
    f = "SmaHealthConnectModel.kt"
    i = {}
    l = {
        0x138
    }
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSmaHealthConnectModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1\n+ 2 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n*L\n1#1,629:1\n488#2,19:630\n*S KotlinDebug\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1\n*L\n313#1:630,19\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $dataList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic $healthConnectManager:Lcom/example/health/data/HealthConnectManager;

.field final synthetic $viewModel:Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;Lcom/example/health/data/HealthConnectManager;Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;",
            "Lcom/example/health/data/HealthConnectManager;",
            "Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;",
            "Ljava/util/List<",
            "+TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;

    iput-object p2, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;->$healthConnectManager:Lcom/example/health/data/HealthConnectManager;

    iput-object p3, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;->$viewModel:Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;

    iput-object p4, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;->$dataList:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;

    iget-object v2, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;->$healthConnectManager:Lcom/example/health/data/HealthConnectManager;

    iget-object v3, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;->$viewModel:Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;

    iget-object v4, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;->$dataList:Ljava/util/List;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;Lcom/example/health/data/HealthConnectManager;Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public final invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;->getMContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const-string v1, "com.google.android.apps.healthdata"

    invoke-static {p1, v1}, Lcom/android/mltcode/paycertificationapi/ad6;->XIi00iiXO(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/ad6;->iO()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;->$healthConnectManager:Lcom/example/health/data/HealthConnectManager;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;->$viewModel:Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;

    invoke-virtual {v1}, Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;->getPermissionsHeartRate()Ljava/util/Set;

    move-result-object v1

    iput v2, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;->label:I

    invoke-virtual {p1, v1, p0}, Lcom/example/health/data/HealthConnectManager;->iIiiO(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;->$dataList:Ljava/util/List;

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;->$viewModel:Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    const-class v1, Lcom/sma/smartv3/db/entity/HeartRate;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/sma/smartv3/db/entity/HeartRate;

    new-instance v3, Lcom/android/mltcode/paycertificationapi/I111IiiI1;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v4

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/HeartRate;->getMTime()J

    move-result-wide v5

    invoke-direct {v3, v4, v5, v6}, Lcom/android/mltcode/paycertificationapi/I111IiiI1;-><init>(IJ)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {v0, v1}, Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;->inputHeartRateReadings(Ljava/util/List;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DataWorker inputHeartRateReadings  list.size="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "DataWorker uploadHealthConnectHeartRate  no permission"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "DataWorker uploadHealthConnectHeartRate  no install"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_6
    :goto_2
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
