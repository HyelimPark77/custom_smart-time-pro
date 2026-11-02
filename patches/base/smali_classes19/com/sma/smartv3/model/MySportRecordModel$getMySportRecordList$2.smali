.class final Lcom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/model/MySportRecordModel;->getMySportRecordList(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Ljava/util/ArrayList<",
        "Lcom/sma/smartv3/model/MySportRecordList;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMySportRecordModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MySportRecordModel.kt\ncom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,416:1\n19#2:417\n15#2:418\n1999#3,14:419\n1999#3,14:433\n1999#3,14:447\n1999#3,14:461\n*S KotlinDebug\n*F\n+ 1 MySportRecordModel.kt\ncom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2\n*L\n26#1:417\n26#1:418\n42#1:419,14\n55#1:433,14\n68#1:447,14\n81#1:461,14\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.model.MySportRecordModel$getMySportRecordList$2"
    f = "MySportRecordModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMySportRecordModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MySportRecordModel.kt\ncom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,416:1\n19#2:417\n15#2:418\n1999#3,14:419\n1999#3,14:433\n1999#3,14:447\n1999#3,14:461\n*S KotlinDebug\n*F\n+ 1 MySportRecordModel.kt\ncom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2\n*L\n26#1:417\n26#1:418\n42#1:419,14\n55#1:433,14\n68#1:447,14\n81#1:461,14\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Workout;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $mSportMode:I

.field label:I


# direct methods
.method public constructor <init>(ILjava/util/List;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Workout;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Lcom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2;->$mSportMode:I

    iput-object p2, p0, Lcom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2;->$list:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance p1, Lcom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2;

    iget v0, p0, Lcom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2;->$mSportMode:I

    iget-object v1, p0, Lcom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2;->$list:Ljava/util/List;

    invoke-direct {p1, v0, v1, p2}, Lcom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2;-><init>(ILjava/util/List;Lkotlin/coroutines/Continuation;)V

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
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/MySportRecordList;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    move-object/from16 v0, p0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v1, v0, Lcom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2;->label:I

    if-nez v1, :cond_20

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    new-instance v3, Lcom/sma/smartv3/model/AppUser;

    const v31, 0x7ffffff

    const/16 v32, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v3 .. v32}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    const-class v5, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2, v5}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    check-cast v3, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v2

    iget v4, v0, Lcom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2;->$mSportMode:I

    const/16 v5, 0xa

    if-eq v4, v5, :cond_1f

    const/16 v5, 0xb

    if-eq v4, v5, :cond_1e

    const/16 v5, 0xd

    if-eq v4, v5, :cond_1

    sget-object v2, Lcom/sma/smartv3/model/MySportRecordModel;->INSTANCE:Lcom/sma/smartv3/model/MySportRecordModel;

    iget-object v4, v0, Lcom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2;->$list:Ljava/util/List;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v3

    invoke-static {v2, v4, v1, v3}, Lcom/sma/smartv3/model/MySportRecordModel;->access$getSportRecordRunning(Lcom/sma/smartv3/model/MySportRecordModel;Ljava/util/List;Ljava/util/ArrayList;I)V

    return-object v1

    :cond_1
    iget-object v3, v0, Lcom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2;->$list:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v5, 0x0

    if-nez v3, :cond_2

    move-object v3, v5

    goto :goto_1

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    move-object v6, v3

    check-cast v6, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxAltitude()I

    move-result v6

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxAltitude()I

    move-result v8

    if-ge v6, v8, :cond_5

    move-object v3, v7

    move v6, v8

    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_4

    :goto_1
    check-cast v3, Lcom/sma/smartv3/db/entity/Workout;

    const v4, 0x7f140ece

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v8

    const v17, 0x7f1403bc

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxAltitude()I

    move-result v4

    invoke-static {v4, v2}, Lcom/android/mltcode/paycertificationapi/cp5;->iIXi1iiXI(II)Ljava/lang/String;

    move-result-object v4

    sget-object v6, Lcom/sma/smartv3/model/MySportRecordModel;->INSTANCE:Lcom/sma/smartv3/model/MySportRecordModel;

    invoke-virtual {v6, v2}, Lcom/sma/smartv3/model/MySportRecordModel;->getMiDistanceUnit(I)I

    move-result v6

    invoke-static {v6}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_2
    move-object v11, v4

    goto :goto_3

    :cond_6
    invoke-static/range {v17 .. v17}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :goto_3
    const-wide/16 v18, 0x0

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v6

    move-wide v12, v6

    goto :goto_4

    :cond_7
    move-wide/from16 v12, v18

    :goto_4
    const/16 v20, -0x1

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMId()I

    move-result v3

    move v9, v3

    goto :goto_5

    :cond_8
    move/from16 v9, v20

    :goto_5
    new-instance v6, Lcom/sma/smartv3/model/MySportRecordList;

    const/16 v15, 0x48

    const/16 v16, 0x0

    const v7, 0x7f08176f

    const/4 v10, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v6 .. v16}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, v0, Lcom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2;->$list:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_9

    move-object v3, v5

    goto :goto_6

    :cond_9
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_a

    goto :goto_6

    :cond_a
    move-object v4, v3

    check-cast v4, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMMinAltitude()I

    move-result v4

    :cond_b
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMMinAltitude()I

    move-result v8

    if-ge v4, v8, :cond_c

    move-object v3, v6

    move v4, v8

    :cond_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_b

    :goto_6
    check-cast v3, Lcom/sma/smartv3/db/entity/Workout;

    const v4, 0x7f140f55

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v8

    if-eqz v3, :cond_d

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMMinAltitude()I

    move-result v4

    invoke-static {v4, v2}, Lcom/android/mltcode/paycertificationapi/cp5;->iIXi1iiXI(II)Ljava/lang/String;

    move-result-object v4

    sget-object v6, Lcom/sma/smartv3/model/MySportRecordModel;->INSTANCE:Lcom/sma/smartv3/model/MySportRecordModel;

    invoke-virtual {v6, v2}, Lcom/sma/smartv3/model/MySportRecordModel;->getMiDistanceUnit(I)I

    move-result v6

    invoke-static {v6}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_7
    move-object v11, v4

    goto :goto_8

    :cond_d
    invoke-static/range {v17 .. v17}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_7

    :goto_8
    if-eqz v3, :cond_e

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v6

    move-wide v12, v6

    goto :goto_9

    :cond_e
    move-wide/from16 v12, v18

    :goto_9
    if-eqz v3, :cond_f

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMId()I

    move-result v3

    move v9, v3

    goto :goto_a

    :cond_f
    move/from16 v9, v20

    :goto_a
    new-instance v6, Lcom/sma/smartv3/model/MySportRecordList;

    const/16 v15, 0x48

    const/16 v16, 0x0

    const v7, 0x7f081770

    const/4 v10, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v6 .. v16}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, v0, Lcom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2;->$list:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_10

    move-object v3, v5

    goto :goto_b

    :cond_10
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_11

    goto :goto_b

    :cond_11
    move-object v4, v3

    check-cast v4, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMAscendAltitude()I

    move-result v4

    :cond_12
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMAscendAltitude()I

    move-result v8

    if-ge v4, v8, :cond_13

    move-object v3, v7

    move v4, v8

    :cond_13
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_12

    :goto_b
    check-cast v3, Lcom/sma/smartv3/db/entity/Workout;

    const v4, 0x7f141295

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v8

    if-eqz v3, :cond_14

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMAscendAltitude()I

    move-result v4

    invoke-static {v4, v2}, Lcom/android/mltcode/paycertificationapi/cp5;->iIXi1iiXI(II)Ljava/lang/String;

    move-result-object v4

    sget-object v6, Lcom/sma/smartv3/model/MySportRecordModel;->INSTANCE:Lcom/sma/smartv3/model/MySportRecordModel;

    invoke-virtual {v6, v2}, Lcom/sma/smartv3/model/MySportRecordModel;->getMiDistanceUnit(I)I

    move-result v6

    invoke-static {v6}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_c
    move-object v11, v4

    goto :goto_d

    :cond_14
    invoke-static/range {v17 .. v17}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_c

    :goto_d
    if-eqz v3, :cond_15

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v6

    move-wide v12, v6

    goto :goto_e

    :cond_15
    move-wide/from16 v12, v18

    :goto_e
    if-eqz v3, :cond_16

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMId()I

    move-result v3

    move v9, v3

    goto :goto_f

    :cond_16
    move/from16 v9, v20

    :goto_f
    new-instance v6, Lcom/sma/smartv3/model/MySportRecordList;

    const/16 v15, 0x48

    const/16 v16, 0x0

    const v7, 0x7f081771

    const/4 v10, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v6 .. v16}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, v0, Lcom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2;->$list:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_17

    goto :goto_10

    :cond_17
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_18

    goto :goto_10

    :cond_18
    move-object v3, v5

    check-cast v3, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMDescendAltitude()I

    move-result v3

    :cond_19
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Workout;->getMDescendAltitude()I

    move-result v6

    if-ge v3, v6, :cond_1a

    move-object v5, v4

    move v3, v6

    :cond_1a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_19

    :goto_10
    check-cast v5, Lcom/sma/smartv3/db/entity/Workout;

    const v3, 0x7f141297

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v8

    if-eqz v5, :cond_1b

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMDescendAltitude()I

    move-result v3

    invoke-static {v3, v2}, Lcom/android/mltcode/paycertificationapi/cp5;->iIXi1iiXI(II)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lcom/sma/smartv3/model/MySportRecordModel;->INSTANCE:Lcom/sma/smartv3/model/MySportRecordModel;

    invoke-virtual {v4, v2}, Lcom/sma/smartv3/model/MySportRecordModel;->getMiDistanceUnit(I)I

    move-result v2

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_11
    move-object v11, v2

    goto :goto_12

    :cond_1b
    invoke-static/range {v17 .. v17}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_11

    :goto_12
    if-eqz v5, :cond_1c

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v18

    :cond_1c
    move-wide/from16 v12, v18

    if-eqz v5, :cond_1d

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMId()I

    move-result v20

    :cond_1d
    move/from16 v9, v20

    new-instance v6, Lcom/sma/smartv3/model/MySportRecordList;

    const/16 v15, 0x48

    const/16 v16, 0x0

    const v7, 0x7f08176c

    const/4 v10, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v6 .. v16}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->OXO1(Z)Ljava/lang/Boolean;

    return-object v1

    :cond_1e
    sget-object v2, Lcom/sma/smartv3/model/MySportRecordModel;->INSTANCE:Lcom/sma/smartv3/model/MySportRecordModel;

    iget-object v4, v0, Lcom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2;->$list:Ljava/util/List;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v3

    invoke-static {v2, v4, v1, v3}, Lcom/sma/smartv3/model/MySportRecordModel;->access$getSportRecordSwimming(Lcom/sma/smartv3/model/MySportRecordModel;Ljava/util/List;Ljava/util/ArrayList;I)V

    return-object v1

    :cond_1f
    sget-object v2, Lcom/sma/smartv3/model/MySportRecordModel;->INSTANCE:Lcom/sma/smartv3/model/MySportRecordModel;

    iget-object v4, v0, Lcom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2;->$list:Ljava/util/List;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v3

    invoke-static {v2, v4, v1, v3}, Lcom/sma/smartv3/model/MySportRecordModel;->access$getSportRecordCycling(Lcom/sma/smartv3/model/MySportRecordModel;Ljava/util/List;Ljava/util/ArrayList;I)V

    return-object v1

    :cond_20
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
