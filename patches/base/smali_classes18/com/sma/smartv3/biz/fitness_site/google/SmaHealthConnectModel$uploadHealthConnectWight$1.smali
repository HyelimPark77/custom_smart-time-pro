.class public final Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;->uploadHealthConnectWight(Ljava/util/List;Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;Lcom/example/health/data/HealthConnectManager;)V
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
    value = "SMAP\nSmaHealthConnectModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1\n+ 2 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n*L\n1#1,629:1\n380#2,14:630\n*S KotlinDebug\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1\n*L\n255#1:630,14\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.biz.fitness_site.google.SmaHealthConnectModel$uploadHealthConnectWight$1"
    f = "SmaHealthConnectModel.kt"
    i = {}
    l = {
        0xfe
    }
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSmaHealthConnectModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1\n+ 2 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n*L\n1#1,629:1\n380#2,14:630\n*S KotlinDebug\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1\n*L\n255#1:630,14\n*E\n"
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

.field final synthetic $viewModel:Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;Lcom/example/health/data/HealthConnectManager;Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;",
            "Lcom/example/health/data/HealthConnectManager;",
            "Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;",
            "Ljava/util/List<",
            "+TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;

    iput-object p2, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;->$healthConnectManager:Lcom/example/health/data/HealthConnectManager;

    iput-object p3, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;->$viewModel:Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;

    iput-object p4, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;->$dataList:Ljava/util/List;

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

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;

    iget-object v2, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;->$healthConnectManager:Lcom/example/health/data/HealthConnectManager;

    iget-object v3, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;->$viewModel:Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;

    iget-object v4, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;->$dataList:Ljava/util/List;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;Lcom/example/health/data/HealthConnectManager;Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;->label:I

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

    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;->getMContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const-string v1, "com.google.android.apps.healthdata"

    invoke-static {p1, v1}, Lcom/android/mltcode/paycertificationapi/ad6;->XIi00iiXO(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/ad6;->iO()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;->$healthConnectManager:Lcom/example/health/data/HealthConnectManager;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;->$viewModel:Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;

    invoke-virtual {v1}, Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;->getPermissions()Ljava/util/Set;

    move-result-object v1

    iput v2, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;->label:I

    invoke-virtual {p1, v1, p0}, Lcom/example/health/data/HealthConnectManager;->iIiiO(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;->$dataList:Ljava/util/List;

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;->$viewModel:Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    const-class v1, Lcom/sma/smartv3/db/entity/Weight;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/sma/smartv3/db/entity/Weight;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Weight;->getMWeight()F

    move-result v2

    float-to-double v2, v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "weight"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v2, "}"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "postHealthConnectData"

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Weight;->getMWeight()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;->inputReadings(D)V

    goto :goto_1

    :cond_3
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
