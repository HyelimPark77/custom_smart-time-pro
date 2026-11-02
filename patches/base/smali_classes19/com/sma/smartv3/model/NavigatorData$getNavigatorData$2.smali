.class final Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/model/NavigatorData;->getNavigatorData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.model.NavigatorData$getNavigatorData$2"
    f = "NavigatorData.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field final synthetic $mList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/NavigatorItem;",
            ">;"
        }
    .end annotation
.end field

.field label:I


# direct methods
.method public constructor <init>(Ljava/util/List;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/NavigatorItem;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$2;->$mList:Ljava/util/List;

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

    new-instance p1, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$2;

    iget-object v0, p0, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$2;->$mList:Ljava/util/List;

    invoke-direct {p1, v0, p2}, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$2;-><init>(Ljava/util/List;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$2;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$2;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v0, p0, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$2;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    sget-object p1, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/db/AppDatabase;->workoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v0

    sget-object v1, Lcom/sma/smartv3/model/NavigatorData;->INSTANCE:Lcom/sma/smartv3/model/NavigatorData;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/16 v2, -0x1e

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    invoke-static/range {v1 .. v7}, Lcom/sma/smartv3/model/NavigatorData;->getTimestamps$default(Lcom/sma/smartv3/model/NavigatorData;IIJILjava/lang/Object;)J

    move-result-wide v2

    move-object p1, v1

    move-wide v1, v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const/16 v5, 0x9

    invoke-interface/range {v0 .. v5}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getNavigatorListModeDESC(JJI)Ljava/util/List;

    move-result-object v4

    const/16 v3, 0x9

    invoke-interface {v0, v3}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getNavigatorListByMode(I)Ljava/util/List;

    move-result-object v5

    iget-object v6, p0, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$2;->$mList:Ljava/util/List;

    move-wide v2, v1

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lcom/sma/smartv3/model/NavigatorData;->access$packageData(Lcom/sma/smartv3/model/NavigatorData;JLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    move-wide v1, v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const/16 v5, 0xa

    invoke-interface/range {v0 .. v5}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getNavigatorListModeDESC(JJI)Ljava/util/List;

    move-result-object v4

    const/16 v3, 0xa

    invoke-interface {v0, v3}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getNavigatorListByMode(I)Ljava/util/List;

    move-result-object v5

    iget-object v6, p0, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$2;->$mList:Ljava/util/List;

    move-wide v2, v1

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lcom/sma/smartv3/model/NavigatorData;->access$packageData(Lcom/sma/smartv3/model/NavigatorData;JLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    move-wide v1, v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const/16 v5, 0xa3

    invoke-interface/range {v0 .. v5}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getNavigatorListModeDESC(JJI)Ljava/util/List;

    move-result-object v4

    const/16 v3, 0xa3

    invoke-interface {v0, v3}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getNavigatorListByMode(I)Ljava/util/List;

    move-result-object v5

    iget-object v6, p0, Lcom/sma/smartv3/model/NavigatorData$getNavigatorData$2;->$mList:Ljava/util/List;

    move-wide v2, v1

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lcom/sma/smartv3/model/NavigatorData;->access$packageData(Lcom/sma/smartv3/model/NavigatorData;JLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
