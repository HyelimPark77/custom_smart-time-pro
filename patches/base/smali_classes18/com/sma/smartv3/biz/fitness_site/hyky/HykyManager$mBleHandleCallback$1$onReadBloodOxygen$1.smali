.class final Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodOxygen$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1;->onReadBloodOxygen(Ljava/util/List;)V
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
    value = "SMAP\nHykyManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodOxygen$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,391:1\n1869#2,2:392\n*S KotlinDebug\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodOxygen$1\n*L\n276#1:392,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.biz.fitness_site.hyky.HykyManager$mBleHandleCallback$1$onReadBloodOxygen$1"
    f = "HykyManager.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHykyManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodOxygen$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,391:1\n1869#2,2:392\n*S KotlinDebug\n*F\n+ 1 HykyManager.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodOxygen$1\n*L\n276#1:392,2\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $bloodOxygen:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleBloodOxygen;",
            ">;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

.field final synthetic this$1:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleBloodOxygen;",
            ">;",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodOxygen$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodOxygen$1;->$bloodOxygen:Ljava/util/List;

    iput-object p2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodOxygen$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    iput-object p3, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodOxygen$1;->this$1:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance p1, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodOxygen$1;

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodOxygen$1;->$bloodOxygen:Ljava/util/List;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodOxygen$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    iget-object v2, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodOxygen$1;->this$1:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodOxygen$1;-><init>(Ljava/util/List;Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodOxygen$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodOxygen$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodOxygen$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodOxygen$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodOxygen$1;->label:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodOxygen$1;->$bloodOxygen:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodOxygen$1;->this$1:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/szabh/smable3/entity/BleBloodOxygen;

    new-instance v3, Lcom/sma/smartv3/db/entity/BloodOxygen;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1;->getOffset()J

    move-result-wide v4

    invoke-direct {v3, v2, v4, v5}, Lcom/sma/smartv3/db/entity/BloodOxygen;-><init>(Lcom/szabh/smable3/entity/BleBloodOxygen;J)V

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1;->getDate()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/BloodOxygen;->getMTime()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/util/Date;->setTime(J)V

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1;->getFormat()Ljava/text/SimpleDateFormat;

    move-result-object v2

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1;->getDate()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "format(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Lcom/sma/smartv3/db/entity/BloodOxygen;->setMLocalTime(Ljava/lang/String;)V

    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$mBleHandleCallback$1$onReadBloodOxygen$1;->this$0:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->uploadData(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
