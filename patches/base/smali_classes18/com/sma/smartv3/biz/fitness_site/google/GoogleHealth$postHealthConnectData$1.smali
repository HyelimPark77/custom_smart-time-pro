.class final Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->OIX0iXi()V
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
    value = "SMAP\nGoogleHealth.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleHealth.kt\ncom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1\n+ 2 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n*L\n1#1,167:1\n309#2,2:168\n321#2,5:170\n67#2,12:175\n251#2,15:187\n279#2,2:202\n293#2,4:204\n333#2,2:208\n345#2,5:210\n357#2,2:215\n369#2,5:217\n*S KotlinDebug\n*F\n+ 1 GoogleHealth.kt\ncom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1\n*L\n106#1:168,2\n106#1:170,5\n114#1:175,12\n122#1:187,15\n130#1:202,2\n130#1:204,4\n138#1:208,2\n138#1:210,5\n146#1:215,2\n146#1:217,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.biz.fitness_site.google.GoogleHealth$postHealthConnectData$1"
    f = "GoogleHealth.kt"
    i = {
        0x0
    }
    l = {
        0x9d
    }
    m = "invokeSuspend"
    n = {
        "list"
    }
    s = {
        "L$0"
    }
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGoogleHealth.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleHealth.kt\ncom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1\n+ 2 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n*L\n1#1,167:1\n309#2,2:168\n321#2,5:170\n67#2,12:175\n251#2,15:187\n279#2,2:202\n293#2,4:204\n333#2,2:208\n345#2,5:210\n357#2,2:215\n369#2,5:217\n*S KotlinDebug\n*F\n+ 1 GoogleHealth.kt\ncom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1\n*L\n106#1:168,2\n106#1:170,5\n114#1:175,12\n122#1:187,15\n130#1:202,2\n130#1:204,4\n138#1:208,2\n138#1:210,5\n146#1:215,2\n146#1:217,5\n*E\n"
    }
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
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

    new-instance p1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;

    invoke-direct {p1, v0, p2}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;Lkotlin/coroutines/Continuation;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v2

    iget v0, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->label:I

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v3, :cond_0

    iget-object v0, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    :cond_2
    :goto_1
    sget-object v0, Lcom/bestmafen/androidbase/base/BaseApplication;->I1:Lcom/bestmafen/androidbase/base/BaseApplication$OXO1;

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseApplication$OXO1;->OXO1()Ljava/util/concurrent/LinkedBlockingQueue;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_d

    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseApplication$OXO1;->OXO1()Ljava/util/concurrent/LinkedBlockingQueue;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/List;

    if-eqz v8, :cond_3

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-ne v0, v3, :cond_3

    goto :goto_1

    :cond_3
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v8}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "DataWorker postHealthConnectData list = "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " , size="

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v5, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;

    invoke-static {v5}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->iO(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;

    move-result-object v5

    if-eqz v5, :cond_4

    iget-object v5, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;

    invoke-static {v5}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->iO(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v5}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;->isCleared()Z

    move-result v5

    if-eqz v5, :cond_5

    :cond_4
    iget-object v5, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;

    invoke-virtual {v5}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->OIi0()V

    :cond_5
    invoke-static {v8}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    const-class v6, Lcom/sma/smartv3/db/entity/HeartRate;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const-string v10, "DataWorker uploadHealthConnectHeartRate e = "

    if-eqz v6, :cond_6

    iget-object v0, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;

    invoke-static {v0}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->iO(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;

    move-result-object v5

    if-eqz v5, :cond_c

    iget-object v0, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;

    invoke-static {v0}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->IiI10X(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;

    invoke-static {v0}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->OXO1(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/example/health/data/HealthConnectManager;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    :try_start_0
    invoke-static {v5}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v11

    new-instance v14, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;

    const/4 v9, 0x0

    move-object v4, v14

    invoke-direct/range {v4 .. v9}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;Lcom/example/health/data/HealthConnectManager;Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    const/4 v15, 0x3

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v11 .. v16}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v4, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_6
    const-class v6, Lcom/sma/smartv3/db/entity/Activity;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    iget-object v0, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;

    invoke-static {v0}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->iO(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;

    move-result-object v5

    if-eqz v5, :cond_c

    iget-object v0, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;

    invoke-static {v0}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->XIi00iiXO(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;

    invoke-static {v0}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->OXO1(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/example/health/data/HealthConnectManager;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    :try_start_1
    invoke-static {v5}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    new-instance v4, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWorkout$1;

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWorkout$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;Lcom/example/health/data/HealthConnectManager;Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v9, v0

    move-object v12, v4

    invoke-static/range {v9 .. v14}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_2

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto/16 :goto_2

    :cond_7
    const-class v6, Lcom/sma/smartv3/db/entity/Weight;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    iget-object v0, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;

    invoke-static {v0}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->iO(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;

    move-result-object v5

    if-eqz v5, :cond_c

    iget-object v0, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;

    invoke-static {v0}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->XO0O10(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;

    invoke-static {v0}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->OXO1(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/example/health/data/HealthConnectManager;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    :try_start_2
    invoke-static {v5}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    new-instance v4, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;Lcom/example/health/data/HealthConnectManager;Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v9, v0

    move-object v12, v4

    invoke-static/range {v9 .. v14}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_2

    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto/16 :goto_2

    :cond_8
    const-class v6, Lcom/sma/smartv3/db/entity/Sleep;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    iget-object v0, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;

    invoke-static {v0}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->iO(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;

    move-result-object v5

    if-eqz v5, :cond_c

    iget-object v0, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;

    invoke-static {v0}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->O00(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/example/health/presentation/screen/sleepsession/SleepSessionViewModel;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;

    invoke-static {v0}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->OXO1(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/example/health/data/HealthConnectManager;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    :try_start_3
    invoke-static {v5}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    new-instance v4, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectSleep$1;

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectSleep$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;Lcom/example/health/data/HealthConnectManager;Lcom/example/health/presentation/screen/sleepsession/SleepSessionViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v9, v0

    move-object v12, v4

    invoke-static/range {v9 .. v14}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto/16 :goto_2

    :catch_3
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto/16 :goto_2

    :cond_9
    const-class v6, Lcom/sma/smartv3/db/entity/BloodOxygen;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    iget-object v0, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;

    invoke-static {v0}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->iO(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;

    move-result-object v5

    if-eqz v5, :cond_c

    iget-object v0, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;

    invoke-static {v0}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->IiI10X(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;

    invoke-static {v0}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->OXO1(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/example/health/data/HealthConnectManager;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    :try_start_4
    invoke-static {v5}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v11

    new-instance v14, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectOxygen$1;

    const/4 v9, 0x0

    move-object v4, v14

    invoke-direct/range {v4 .. v9}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectOxygen$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;Lcom/example/health/data/HealthConnectManager;Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    const/4 v15, 0x3

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v11 .. v16}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    goto/16 :goto_2

    :catch_4
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v4, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_a
    const-class v6, Lcom/sma/smartv3/db/entity/BloodPressure;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    iget-object v0, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;

    invoke-static {v0}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->iO(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;

    move-result-object v5

    if-eqz v5, :cond_c

    iget-object v0, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;

    invoke-static {v0}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->IiI10X(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;

    invoke-static {v0}, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;->OXO1(Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth;)Lcom/example/health/data/HealthConnectManager;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    :try_start_5
    invoke-static {v5}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    new-instance v4, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectPressure$1;

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectPressure$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;Lcom/example/health/data/HealthConnectManager;Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v9, v0

    move-object v12, v4

    invoke-static/range {v9 .. v14}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_2

    :catch_5
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v4, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "DataWorker uploadHealthConnectPressure e = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    goto :goto_2

    :cond_b
    invoke-static {v8}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v6

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " , not support"

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_c
    :goto_2
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->L$0:Ljava/lang/Object;

    iput v3, v1, Lcom/sma/smartv3/biz/fitness_site/google/GoogleHealth$postHealthConnectData$1;->label:I

    const-wide/16 v4, 0x1388

    invoke-static {v4, v5, v1}, Lkotlinx/coroutines/DelayKt;->XIi00iiXO(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_2

    return-object v2

    :cond_d
    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v0
.end method
