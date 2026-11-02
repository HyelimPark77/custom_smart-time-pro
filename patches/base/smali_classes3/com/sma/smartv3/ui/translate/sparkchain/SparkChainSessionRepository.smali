.class public final Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSparkChainSessionRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainSessionRepository.kt\ncom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n116#2,7:188\n124#2,2:198\n116#2,10:200\n116#2,10:230\n1761#3,3:195\n1878#3,2:210\n774#3:212\n865#3,2:213\n1563#3:215\n1634#3,3:216\n1869#3,2:219\n1880#3:221\n1563#3:222\n1634#3,3:223\n1869#3,2:226\n1869#3,2:228\n*S KotlinDebug\n*F\n+ 1 SparkChainSessionRepository.kt\ncom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository\n*L\n68#1:188,7\n68#1:198,2\n82#1:200,10\n181#1:230,10\n69#1:195,3\n97#1:210,2\n102#1:212\n102#1:213,2\n102#1:215\n102#1:216,3\n106#1:219,2\n97#1:221\n114#1:222\n114#1:223,3\n122#1:226,2\n142#1:228,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSparkChainSessionRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainSessionRepository.kt\ncom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n116#2,7:188\n124#2,2:198\n116#2,10:200\n116#2,10:230\n1761#3,3:195\n1878#3,2:210\n774#3:212\n865#3,2:213\n1563#3:215\n1634#3,3:216\n1869#3,2:219\n1880#3:221\n1563#3:222\n1634#3,3:223\n1869#3,2:226\n1869#3,2:228\n*S KotlinDebug\n*F\n+ 1 SparkChainSessionRepository.kt\ncom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository\n*L\n68#1:188,7\n68#1:198,2\n82#1:200,10\n181#1:230,10\n69#1:195,3\n97#1:210,2\n102#1:212\n102#1:213,2\n102#1:215\n102#1:216,3\n106#1:219,2\n97#1:221\n114#1:222\n114#1:223,3\n122#1:226,2\n142#1:228,2\n*E\n"
    }
.end annotation


# instance fields
.field public final I0IIOi:Lcom/android/mltcode/paycertificationapi/uy0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public volatile IiI10X:Lcom/sma/smartv3/db/entity/TranslateSessionEntity;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public volatile O00:Lcom/android/mltcode/paycertificationapi/iOIXXXII0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public final OXO1:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XIi00iiXO:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/TranslateEntity;",
            ">;"
        }
    .end annotation
.end field

.field public final XO0O10:Lcom/sma/smartv3/db/dao/TranslateDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XOO0ii0:Lcom/sma/smartv3/db/dao/TranslateSessionDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final iO:Lcom/android/mltcode/paycertificationapi/uy0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "SparkChainSessionRepository"

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->OXO1:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->XIi00iiXO:Ljava/util/List;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lkotlinx/coroutines/sync/MutexKt;->XIi00iiXO(ZILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/uy0;

    move-result-object v3

    iput-object v3, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->iO:Lcom/android/mltcode/paycertificationapi/uy0;

    sget-object v3, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/db/AppDatabase;->translateDao()Lcom/sma/smartv3/db/dao/TranslateDao;

    move-result-object v4

    iput-object v4, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->XO0O10:Lcom/sma/smartv3/db/dao/TranslateDao;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/db/AppDatabase;->translateSessionDao()Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    move-result-object v3

    iput-object v3, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->XOO0ii0:Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    invoke-static {v0, v1, v2}, Lkotlinx/coroutines/sync/MutexKt;->XIi00iiXO(ZILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/uy0;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->I0IIOi:Lcom/android/mltcode/paycertificationapi/uy0;

    return-void
.end method

.method public static final synthetic OXO1(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;Lcom/android/mltcode/paycertificationapi/iOIXXXII0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->iO(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;ILkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/16 p1, 0x64

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->I0iXXO(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final I0IIOi()Lcom/sma/smartv3/db/entity/TranslateSessionEntity;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->XOO0ii0:Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    invoke-interface {v0}, Lcom/sma/smartv3/db/dao/TranslateSessionDao;->getTranslateFirst()Lcom/sma/smartv3/db/entity/TranslateSessionEntity;

    move-result-object v0

    return-object v0
.end method

.method public final I0iXXO(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 13
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$saveToRoom$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$saveToRoom$1;

    iget v1, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$saveToRoom$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$saveToRoom$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$saveToRoom$1;

    invoke-direct {v0, p0, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$saveToRoom$1;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$saveToRoom$1;->result:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$saveToRoom$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget p1, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$saveToRoom$1;->I$0:I

    iget-object v1, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$saveToRoom$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lcom/android/mltcode/paycertificationapi/uy0;

    iget-object v2, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$saveToRoom$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$saveToRoom$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-static {p2}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    new-instance p2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iget-object v6, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->iO:Lcom/android/mltcode/paycertificationapi/uy0;

    iput-object p2, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$saveToRoom$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$saveToRoom$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$saveToRoom$1;->L$2:Ljava/lang/Object;

    iput p1, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$saveToRoom$1;->I$0:I

    iput v3, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$saveToRoom$1;->I$1:I

    iput v4, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$saveToRoom$1;->label:I

    invoke-interface {v6, v5, v0}, Lcom/android/mltcode/paycertificationapi/uy0;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p2

    move-object v1, v6

    :goto_1
    :try_start_0
    iget-object p2, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->XIi00iiXO:Ljava/util/List;

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->i0I0O111I(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    iput-object p2, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    invoke-static {p2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->iXi1iI0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sma/smartv3/db/entity/TranslateEntity;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/TranslateEntity;->getSessionId()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_5

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_7

    :cond_4
    :goto_2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v4, "toString(...)"

    invoke-static {p2, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    iput-object p2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1, v5}, Lcom/android/mltcode/paycertificationapi/uy0;->unlock(Ljava/lang/Object;)V

    iget-object p2, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_6

    const-string p1, ""

    return-object p1

    :cond_6
    new-instance v4, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;

    iget-object p2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    const/16 v11, 0x10

    const/4 v12, 0x0

    const-string v6, ""

    const/4 v7, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;-><init>(Ljava/lang/String;Ljava/lang/String;FJIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->XOO0ii0:Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    invoke-interface {p2, v4}, Lcom/sma/smartv3/db/dao/TranslateSessionDao;->insert(Lcom/sma/smartv3/db/entity/TranslateSessionEntity;)J

    iget-object p2, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    iget-object v0, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, p2, v0}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->XO0O10(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2, p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->X10i(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    add-int/lit8 v0, v3, 0x1

    if-gez v3, :cond_7

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_7
    check-cast p2, Ljava/util/List;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->XO0O10:Lcom/sma/smartv3/db/dao/TranslateDao;

    invoke-interface {v1, p2}, Lcom/sma/smartv3/db/dao/TranslateDao;->insertAll(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    sget-object v4, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v5, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->OXO1:Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " insertSessionWithEntities \u6210\u529f\u52a0\u5165:"

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "\u6761\u6570\u636e }"

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {p2, v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->O110i(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_8
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lkotlin/Pair;

    invoke-virtual {v5}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    const-wide/16 v7, -0x1

    cmp-long v5, v5, v7

    if-nez v5, :cond_8

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    new-instance p2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {p2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/Pair;

    invoke-virtual {v4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/TranslateEntity;

    invoke-interface {p2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_a
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_b

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/TranslateEntity;

    sget-object v4, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v5, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->OXO1:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " insertSessionWithEntities \u7b2c"

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " \u6279 \u5931\u8d25\u5185\u5bb9\uff1a"

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    goto :goto_6

    :cond_b
    move v3, v0

    goto/16 :goto_3

    :cond_c
    iget-object p1, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    return-object p1

    :goto_7
    invoke-interface {v1, v5}, Lcom/android/mltcode/paycertificationapi/uy0;->unlock(Ljava/lang/Object;)V

    throw p1
.end method

.method public final IO()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/TranslateSessionWithFirstEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->XOO0ii0:Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    invoke-interface {v0}, Lcom/sma/smartv3/db/dao/TranslateSessionDao;->getAllSessionsWithFirstEntity()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final IiI10X(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Transaction;
    .end annotation

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->XOO0ii0(Ljava/lang/String;)Lcom/sma/smartv3/db/entity/TranslateSessionWithTranslation;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/TranslateSessionWithTranslation;->getTranslations()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/TranslateEntity;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/TranslateEntity;->getAudioPath()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    new-instance v2, Ljava/io/File;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/TranslateEntity;->getAudioPath()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    :cond_0
    iget-object v2, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->XO0O10:Lcom/sma/smartv3/db/dao/TranslateDao;

    invoke-interface {v2, v1}, Lcom/sma/smartv3/db/dao/TranslateDao;->delete(Lcom/sma/smartv3/db/entity/TranslateEntity;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->XOO0ii0:Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/TranslateSessionWithTranslation;->getSession()Lcom/sma/smartv3/db/entity/TranslateSessionEntity;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/sma/smartv3/db/dao/TranslateSessionDao;->delete(Lcom/sma/smartv3/db/entity/TranslateSessionEntity;)V

    :cond_2
    return-void
.end method

.method public final O00(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$clear$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$clear$1;

    iget v1, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$clear$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$clear$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$clear$1;

    invoke-direct {v0, p0, p1}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$clear$1;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$clear$1;->result:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$clear$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$clear$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/android/mltcode/paycertificationapi/uy0;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->iO:Lcom/android/mltcode/paycertificationapi/uy0;

    iput-object p1, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$clear$1;->L$0:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$clear$1;->I$0:I

    iput v3, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$clear$1;->label:I

    invoke-interface {p1, v4, v0}, Lcom/android/mltcode/paycertificationapi/uy0;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    :goto_1
    :try_start_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->XIi00iiXO:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0, v4}, Lcom/android/mltcode/paycertificationapi/uy0;->unlock(Ljava/lang/Object;)V

    iput-object v4, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->O00:Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    iput-object v4, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->IiI10X:Lcom/sma/smartv3/db/entity/TranslateSessionEntity;

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {v0, v4}, Lcom/android/mltcode/paycertificationapi/uy0;->unlock(Ljava/lang/Object;)V

    throw p1
.end method

.method public final OIX0iXi(Ljava/lang/String;)Lcom/sma/smartv3/db/entity/TranslateSessionEntity;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->XOO0ii0:Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    invoke-interface {v0, p1}, Lcom/sma/smartv3/db/dao/TranslateSessionDao;->querySessionById(Ljava/lang/String;)Lcom/sma/smartv3/db/entity/TranslateSessionEntity;

    move-result-object p1

    return-object p1
.end method

.method public final OIi0()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/TranslateSessionEntity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->XOO0ii0:Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    invoke-interface {v0}, Lcom/sma/smartv3/db/dao/TranslateSessionDao;->getAllTranslationList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final X1ii(Ljava/lang/String;)V
    .locals 10
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Transaction;
    .end annotation

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->XOO0ii0(Ljava/lang/String;)Lcom/sma/smartv3/db/entity/TranslateSessionWithTranslation;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/TranslateSessionWithTranslation;->getTranslations()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/TranslateEntity;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/TranslateEntity;->getAudioPath()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    new-instance v2, Ljava/io/File;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/TranslateEntity;->getAudioPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->XOO0ii0:Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/TranslateSessionWithTranslation;->getSession()Lcom/sma/smartv3/db/entity/TranslateSessionEntity;

    move-result-object v1

    sget-object p1, Lcom/sma/smartv3/ui/translate/ActionDoneType;->COMPLETE:Lcom/sma/smartv3/ui/translate/ActionDoneType;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/translate/ActionDoneType;->getFlag()I

    move-result v7

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    invoke-static/range {v1 .. v9}, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;->copy$default(Lcom/sma/smartv3/db/entity/TranslateSessionEntity;Ljava/lang/String;Ljava/lang/String;FJIILjava/lang/Object;)Lcom/sma/smartv3/db/entity/TranslateSessionEntity;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/sma/smartv3/db/dao/TranslateSessionDao;->update(Lcom/sma/smartv3/db/entity/TranslateSessionEntity;)I

    :cond_2
    return-void
.end method

.method public final XIi00iiXO(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lcom/android/mltcode/paycertificationapi/iOIXXXII0;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/iOIXXXII0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->O00:Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->iO(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public final XO0O10(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/TranslateEntity;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/TranslateEntity;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/sma/smartv3/db/entity/TranslateEntity;

    const/16 v16, 0x7f7

    const/16 v17, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v7, p2

    invoke-static/range {v3 .. v17}, Lcom/sma/smartv3/db/entity/TranslateEntity;->copy$default(Lcom/sma/smartv3/db/entity/TranslateEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JIILjava/lang/Object;)Lcom/sma/smartv3/db/entity/TranslateEntity;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final XOO0ii0(Ljava/lang/String;)Lcom/sma/smartv3/db/entity/TranslateSessionWithTranslation;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->XOO0ii0:Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    invoke-interface {v0, p1}, Lcom/sma/smartv3/db/dao/TranslateSessionDao;->queryBySessionId(Ljava/lang/String;)Lcom/sma/smartv3/db/entity/TranslateSessionWithTranslation;

    move-result-object p1

    return-object p1
.end method

.method public final iO(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/iOIXXXII0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;

    iget v3, v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;

    invoke-direct {v2, v1, v0}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->result:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->label:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->L$6:Ljava/lang/Object;

    check-cast v3, Lcom/android/mltcode/paycertificationapi/uy0;

    iget-object v4, v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->L$5:Ljava/lang/Object;

    check-cast v4, Lcom/sma/smartv3/db/entity/TranslateEntity;

    iget-object v5, v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->L$4:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->L$1:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v2, v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    invoke-static {v0}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v17

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v11

    const-string v0, "toString(...)"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->I1XOi1()Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    :goto_1
    move v12, v0

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    goto :goto_1

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->XiOIii1()Ljava/lang/String;

    move-result-object v0

    const-string v4, ""

    if-nez v0, :cond_4

    move-object v10, v4

    goto :goto_3

    :cond_4
    move-object v10, v0

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->XX0()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    move-object v9, v4

    goto :goto_4

    :cond_5
    move-object v9, v0

    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->O10IXXX0X()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_6

    move-object v14, v4

    goto :goto_5

    :cond_6
    move-object v14, v0

    :goto_5
    invoke-virtual/range {p1 .. p1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->IIX1OXO()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_7

    move-object v15, v4

    goto :goto_6

    :cond_7
    move-object v15, v0

    :goto_6
    invoke-virtual/range {p1 .. p1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->OiIIX101O()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_8

    move-object/from16 v16, v4

    goto :goto_7

    :cond_8
    move-object/from16 v16, v0

    :goto_7
    invoke-virtual/range {p1 .. p1}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->X0O()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_8
    move/from16 v19, v0

    goto :goto_9

    :cond_9
    sget-object v0, Lcom/sma/smartv3/ui/translate/ChatShowType;->FROM:Lcom/sma/smartv3/ui/translate/ChatShowType;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/translate/ChatShowType;->getFlag()I

    move-result v0

    goto :goto_8

    :goto_9
    new-instance v7, Lcom/sma/smartv3/db/entity/TranslateEntity;

    const/16 v20, 0x20

    const/16 v21, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v7 .. v21}, Lcom/sma/smartv3/db/entity/TranslateEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v8

    move-object v4, v9

    move-wide/from16 v8, v17

    iget-object v13, v1, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->iO:Lcom/android/mltcode/paycertificationapi/uy0;

    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->L$0:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->L$1:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->L$2:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->L$3:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->L$4:Ljava/lang/Object;

    iput-object v7, v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->L$5:Ljava/lang/Object;

    iput-object v13, v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->L$6:Ljava/lang/Object;

    iput-wide v8, v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->J$0:J

    iput v12, v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->F$0:F

    const/4 v0, 0x0

    iput v0, v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->I$0:I

    iput v5, v2, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository$addSttToList$1;->label:I

    invoke-interface {v13, v6, v2}, Lcom/android/mltcode/paycertificationapi/uy0;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_a

    return-object v3

    :cond_a
    move-object v4, v7

    move-object v3, v13

    :goto_a
    :try_start_0
    iget-object v0, v1, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->XIi00iiXO:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    instance-of v2, v0, Ljava/util/Collection;

    if-eqz v2, :cond_b

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_b

    :catchall_0
    move-exception v0

    goto :goto_d

    :cond_b
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/TranslateEntity;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/TranslateEntity;->getRequestId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/TranslateEntity;->getRequestId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_c

    :cond_d
    :goto_b
    iget-object v0, v1, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->XIi00iiXO:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_c
    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v3, v6}, Lcom/android/mltcode/paycertificationapi/uy0;->unlock(Ljava/lang/Object;)V

    return-object v0

    :goto_d
    invoke-interface {v3, v6}, Lcom/android/mltcode/paycertificationapi/uy0;->unlock(Ljava/lang/Object;)V

    throw v0
.end method
