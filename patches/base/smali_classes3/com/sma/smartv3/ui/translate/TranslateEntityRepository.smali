.class public final Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTranslateEntityRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslateEntityRepository.kt\ncom/sma/smartv3/ui/translate/TranslateEntityRepository\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n116#2,7:188\n124#2,2:198\n116#2,10:200\n116#2,10:230\n1761#3,3:195\n1869#3,2:210\n1878#3,2:212\n774#3:214\n865#3,2:215\n1563#3:217\n1634#3,3:218\n1869#3,2:221\n1880#3:223\n1563#3:224\n1634#3,3:225\n1869#3,2:228\n*S KotlinDebug\n*F\n+ 1 TranslateEntityRepository.kt\ncom/sma/smartv3/ui/translate/TranslateEntityRepository\n*L\n71#1:188,7\n71#1:198,2\n97#1:200,10\n181#1:230,10\n72#1:195,3\n108#1:210,2\n117#1:212,2\n122#1:214\n122#1:215,2\n122#1:217\n122#1:218,3\n126#1:221,2\n117#1:223\n134#1:224\n134#1:225,3\n146#1:228,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTranslateEntityRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslateEntityRepository.kt\ncom/sma/smartv3/ui/translate/TranslateEntityRepository\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n116#2,7:188\n124#2,2:198\n116#2,10:200\n116#2,10:230\n1761#3,3:195\n1869#3,2:210\n1878#3,2:212\n774#3:214\n865#3,2:215\n1563#3:217\n1634#3,3:218\n1869#3,2:221\n1880#3:223\n1563#3:224\n1634#3,3:225\n1869#3,2:228\n*S KotlinDebug\n*F\n+ 1 TranslateEntityRepository.kt\ncom/sma/smartv3/ui/translate/TranslateEntityRepository\n*L\n71#1:188,7\n71#1:198,2\n97#1:200,10\n181#1:230,10\n72#1:195,3\n108#1:210,2\n117#1:212,2\n122#1:214\n122#1:215,2\n122#1:217\n122#1:218,3\n126#1:221,2\n117#1:223\n134#1:224\n134#1:225,3\n146#1:228,2\n*E\n"
    }
.end annotation


# instance fields
.field public final IiI10X:Ljava/util/List;
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

.field public O00:Lcom/sma/smartv3/db/entity/TranslateEntity;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public final OXO1:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XIi00iiXO:Lcom/sma/smartv3/db/dao/TranslateDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XO0O10:Lcom/android/mltcode/paycertificationapi/uy0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final iO:Lcom/sma/smartv3/db/dao/TranslateSessionDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "TranslateRepository"

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->OXO1:Ljava/lang/String;

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/AppDatabase;->translateDao()Lcom/sma/smartv3/db/dao/TranslateDao;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->XIi00iiXO:Lcom/sma/smartv3/db/dao/TranslateDao;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->translateSessionDao()Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->iO:Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lkotlinx/coroutines/sync/MutexKt;->XIi00iiXO(ZILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/uy0;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->XO0O10:Lcom/android/mltcode/paycertificationapi/uy0;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->IiI10X:Ljava/util/List;

    return-void
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;Ljava/lang/String;ILkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/16 p2, 0x64

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->I0IIOi(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final I0IIOi(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 18
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Transaction;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    instance-of v2, v0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$insertSessionWithEntities$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$insertSessionWithEntities$1;

    iget v3, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$insertSessionWithEntities$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$insertSessionWithEntities$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$insertSessionWithEntities$1;

    invoke-direct {v2, v1, v0}, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$insertSessionWithEntities$1;-><init>(Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$insertSessionWithEntities$1;->result:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$insertSessionWithEntities$1;->label:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_2

    if-ne v4, v6, :cond_1

    iget v3, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$insertSessionWithEntities$1;->I$0:I

    iget-object v4, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$insertSessionWithEntities$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lcom/android/mltcode/paycertificationapi/uy0;

    iget-object v6, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$insertSessionWithEntities$1;->L$2:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v8, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$insertSessionWithEntities$1;->L$1:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$insertSessionWithEntities$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    new-instance v8, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v8}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iget-object v4, v1, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->XO0O10:Lcom/android/mltcode/paycertificationapi/uy0;

    move-object/from16 v9, p1

    iput-object v9, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$insertSessionWithEntities$1;->L$0:Ljava/lang/Object;

    iput-object v8, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$insertSessionWithEntities$1;->L$1:Ljava/lang/Object;

    iput-object v0, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$insertSessionWithEntities$1;->L$2:Ljava/lang/Object;

    iput-object v4, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$insertSessionWithEntities$1;->L$3:Ljava/lang/Object;

    move/from16 v10, p2

    iput v10, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$insertSessionWithEntities$1;->I$0:I

    iput v5, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$insertSessionWithEntities$1;->I$1:I

    iput v6, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$insertSessionWithEntities$1;->label:I

    invoke-interface {v4, v7, v2}, Lcom/android/mltcode/paycertificationapi/uy0;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_3

    return-object v3

    :cond_3
    move-object v6, v0

    move-object v2, v9

    move v3, v10

    :goto_1
    :try_start_0
    iget-object v0, v1, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->IiI10X:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->i0I0O111I(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->iXi1iI0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/entity/TranslateEntity;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/TranslateEntity;->getSessionId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_9

    :cond_4
    :goto_2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v9, "toString(...)"

    invoke-static {v0, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    iput-object v0, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v4, v7}, Lcom/android/mltcode/paycertificationapi/uy0;->unlock(Ljava/lang/Object;)V

    new-instance v9, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;

    iget-object v0, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    if-nez v2, :cond_6

    const-string v0, ""

    move-object v11, v0

    goto :goto_3

    :cond_6
    move-object v11, v2

    :goto_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    const/16 v16, 0x10

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v9 .. v17}, Lcom/sma/smartv3/db/entity/TranslateSessionEntity;-><init>(Ljava/lang/String;Ljava/lang/String;FJIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v4, v1, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->OXO1:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " insertSessionWithEntities \u8fdb\u5165\uff1a"

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/TranslateEntity;

    sget-object v7, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v10, v1, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->OXO1:Ljava/lang/String;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " translateEntity Item :"

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    goto :goto_4

    :cond_7
    if-eqz v2, :cond_8

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_9

    :cond_8
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, v1, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->OXO1:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " LocalAudio is Empty"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    :cond_9
    iget-object v0, v1, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->iO:Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    invoke-interface {v0, v9}, Lcom/sma/smartv3/db/dao/TranslateSessionDao;->insert(Lcom/sma/smartv3/db/entity/TranslateSessionEntity;)J

    iget-object v0, v8, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v2, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->OXO1(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt___CollectionsKt;->X10i(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v5, 0x1

    if-gez v5, :cond_a

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_a
    check-cast v2, Ljava/util/List;

    iget-object v4, v1, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->XIi00iiXO:Lcom/sma/smartv3/db/dao/TranslateDao;

    invoke-interface {v4, v2}, Lcom/sma/smartv3/db/dao/TranslateDao;->insertAll(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    sget-object v7, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v8, v1, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->OXO1:Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " insertSessionWithEntities \u6210\u529f\u52a0\u5165:"

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, "\u6761\u6570\u636e"

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt___CollectionsKt;->O110i(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_b
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lkotlin/Pair;

    invoke-virtual {v8}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    const-wide/16 v10, -0x1

    cmp-long v8, v8, v10

    if-nez v8, :cond_b

    invoke-interface {v4, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_c
    new-instance v2, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v4, v7}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lkotlin/Pair;

    invoke-virtual {v7}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sma/smartv3/db/entity/TranslateEntity;

    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_d
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_e

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/TranslateEntity;

    sget-object v7, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v8, v1, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->OXO1:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " insertSessionWithEntities \u7b2c"

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, " \u6279 \u5931\u8d25\u5185\u5bb9\uff1a"

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    goto :goto_8

    :cond_e
    move v5, v3

    goto/16 :goto_5

    :cond_f
    iget-object v0, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    return-object v0

    :goto_9
    invoke-interface {v4, v7}, Lcom/android/mltcode/paycertificationapi/uy0;->unlock(Ljava/lang/Object;)V

    throw v0
.end method

.method public final I0iXXO(Ljava/lang/String;)Lcom/sma/smartv3/db/entity/TranslateSessionEntity;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->iO:Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    invoke-interface {v0, p1}, Lcom/sma/smartv3/db/dao/TranslateSessionDao;->querySessionById(Ljava/lang/String;)Lcom/sma/smartv3/db/entity/TranslateSessionEntity;

    move-result-object p1

    return-object p1
.end method

.method public final IO(Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/iOX1XO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 23
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/android/mltcode/paycertificationapi/iOX1XO;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/android/mltcode/paycertificationapi/iOX1XO;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    instance-of v2, v0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$notifySttAudioEndChange$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$notifySttAudioEndChange$1;

    iget v3, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$notifySttAudioEndChange$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$notifySttAudioEndChange$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$notifySttAudioEndChange$1;

    invoke-direct {v2, v1, v0}, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$notifySttAudioEndChange$1;-><init>(Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$notifySttAudioEndChange$1;->result:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$notifySttAudioEndChange$1;->label:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v3, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$notifySttAudioEndChange$1;->L$3:Ljava/lang/Object;

    check-cast v3, Lcom/android/mltcode/paycertificationapi/uy0;

    iget-object v4, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$notifySttAudioEndChange$1;->L$2:Ljava/lang/Object;

    check-cast v4, Lcom/sma/smartv3/db/entity/TranslateEntity;

    iget-object v8, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$notifySttAudioEndChange$1;->L$1:Ljava/lang/Object;

    check-cast v8, Lcom/android/mltcode/paycertificationapi/iOX1XO;

    iget-object v2, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$notifySttAudioEndChange$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object v8, v1, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->O00:Lcom/sma/smartv3/db/entity/TranslateEntity;

    if-eqz v8, :cond_3

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iOX1XO;->I1XOi1()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {p2 .. p2}, Lcom/android/mltcode/paycertificationapi/iOX1XO;->OiIIX101O()Ljava/lang/String;

    move-result-object v17

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v18

    const/16 v21, 0x43f

    const/16 v22, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v20, 0x0

    move-object/from16 v15, p1

    invoke-static/range {v8 .. v22}, Lcom/sma/smartv3/db/entity/TranslateEntity;->copy$default(Lcom/sma/smartv3/db/entity/TranslateEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JIILjava/lang/Object;)Lcom/sma/smartv3/db/entity/TranslateEntity;

    move-result-object v0

    move-object v4, v0

    goto :goto_1

    :cond_3
    move-object v4, v7

    :goto_1
    if-nez v4, :cond_4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, v1, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->OXO1:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " can\'t copy With audio"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v0

    :cond_4
    iget-object v0, v1, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->XO0O10:Lcom/android/mltcode/paycertificationapi/uy0;

    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$notifySttAudioEndChange$1;->L$0:Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$notifySttAudioEndChange$1;->L$1:Ljava/lang/Object;

    iput-object v4, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$notifySttAudioEndChange$1;->L$2:Ljava/lang/Object;

    iput-object v0, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$notifySttAudioEndChange$1;->L$3:Ljava/lang/Object;

    iput v5, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$notifySttAudioEndChange$1;->I$0:I

    iput v6, v2, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$notifySttAudioEndChange$1;->label:I

    invoke-interface {v0, v7, v2}, Lcom/android/mltcode/paycertificationapi/uy0;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_5

    return-object v3

    :cond_5
    move-object v3, v0

    :goto_2
    :try_start_0
    iget-object v0, v1, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->IiI10X:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    instance-of v2, v0, Ljava/util/Collection;

    if-eqz v2, :cond_6

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/TranslateEntity;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/TranslateEntity;->getRequestId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/TranslateEntity;->getRequestId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    move v5, v6

    :cond_8
    :goto_3
    if-nez v5, :cond_9

    iget-object v0, v1, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->IiI10X:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, v1, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->OXO1:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " HasItem:"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v3, v7}, Lcom/android/mltcode/paycertificationapi/uy0;->unlock(Ljava/lang/Object;)V

    return-object v0

    :goto_4
    invoke-interface {v3, v7}, Lcom/android/mltcode/paycertificationapi/uy0;->unlock(Ljava/lang/Object;)V

    throw v0
.end method

.method public final IiI10X()Lcom/sma/smartv3/db/entity/TranslateSessionEntity;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->iO:Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    invoke-interface {v0}, Lcom/sma/smartv3/db/dao/TranslateSessionDao;->getTranslateFirst()Lcom/sma/smartv3/db/entity/TranslateSessionEntity;

    move-result-object v0

    return-object v0
.end method

.method public final O00(Ljava/lang/String;)Lcom/sma/smartv3/db/entity/TranslateSessionWithTranslation;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->iO:Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    invoke-interface {v0, p1}, Lcom/sma/smartv3/db/dao/TranslateSessionDao;->queryBySessionId(Ljava/lang/String;)Lcom/sma/smartv3/db/entity/TranslateSessionWithTranslation;

    move-result-object p1

    return-object p1
.end method

.method public final OIX0iXi(Lcom/sma/smartv3/util/websocket/data/STTMessage;)V
    .locals 16
    .param p1    # Lcom/sma/smartv3/util/websocket/data/STTMessage;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "sttMessage"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/util/websocket/data/STTMessage;->getSessionId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/sma/smartv3/util/websocket/data/STTMessage;->getRequest_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/sma/smartv3/util/websocket/data/STTMessage;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/sma/smartv3/util/websocket/data/STTMessage;->getTranslation()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    move-object v4, v0

    invoke-virtual {v1}, Lcom/sma/smartv3/util/websocket/data/STTMessage;->getDuration()F

    move-result v6

    new-instance v1, Lcom/sma/smartv3/db/entity/TranslateEntity;

    const/16 v14, 0x420

    const/4 v15, 0x0

    const/4 v7, 0x0

    const-string v8, ""

    const-string v9, ""

    const-string v10, ""

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v15}, Lcom/sma/smartv3/db/entity/TranslateEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->O00:Lcom/sma/smartv3/db/entity/TranslateEntity;

    return-void
.end method

.method public final OXO1(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
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

.method public final XIi00iiXO(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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

    instance-of v0, p1, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$clear$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$clear$1;

    iget v1, v0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$clear$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$clear$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$clear$1;

    invoke-direct {v0, p0, p1}, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$clear$1;-><init>(Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$clear$1;->result:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$clear$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$clear$1;->L$0:Ljava/lang/Object;

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

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->XO0O10:Lcom/android/mltcode/paycertificationapi/uy0;

    iput-object p1, v0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$clear$1;->L$0:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$clear$1;->I$0:I

    iput v3, v0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository$clear$1;->label:I

    invoke-interface {p1, v4, v0}, Lcom/android/mltcode/paycertificationapi/uy0;->lock(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    :goto_1
    :try_start_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->IiI10X:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0, v4}, Lcom/android/mltcode/paycertificationapi/uy0;->unlock(Ljava/lang/Object;)V

    iput-object v4, p0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->O00:Lcom/sma/smartv3/db/entity/TranslateEntity;

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {v0, v4}, Lcom/android/mltcode/paycertificationapi/uy0;->unlock(Ljava/lang/Object;)V

    throw p1
.end method

.method public final XO0O10()Lcom/sma/smartv3/db/entity/TranslateEntity;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->O00:Lcom/sma/smartv3/db/entity/TranslateEntity;

    return-object v0
.end method

.method public final XOO0ii0()Ljava/util/List;
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

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->iO:Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    invoke-interface {v0}, Lcom/sma/smartv3/db/dao/TranslateSessionDao;->getAllSessionsWithFirstEntity()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final XXI(Lcom/sma/smartv3/db/entity/TranslateEntity;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/db/entity/TranslateEntity;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->O00:Lcom/sma/smartv3/db/entity/TranslateEntity;

    return-void
.end method

.method public final iO(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Landroidx/room/Transaction;
    .end annotation

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->O00(Ljava/lang/String;)Lcom/sma/smartv3/db/entity/TranslateSessionWithTranslation;

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
    iget-object v2, p0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->XIi00iiXO:Lcom/sma/smartv3/db/dao/TranslateDao;

    invoke-interface {v2, v1}, Lcom/sma/smartv3/db/dao/TranslateDao;->delete(Lcom/sma/smartv3/db/entity/TranslateEntity;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/TranslateEntityRepository;->iO:Lcom/sma/smartv3/db/dao/TranslateSessionDao;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/TranslateSessionWithTranslation;->getSession()Lcom/sma/smartv3/db/entity/TranslateSessionEntity;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/sma/smartv3/db/dao/TranslateSessionDao;->delete(Lcom/sma/smartv3/db/entity/TranslateSessionEntity;)V

    :cond_2
    return-void
.end method
