.class public final Lcom/szabh/smable3/entity/BleSleep$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/entity/BleSleep;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleSleep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleSleep.kt\ncom/szabh/smable3/entity/BleSleep$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,457:1\n1573#2:458\n1604#2,4:459\n1878#2,3:463\n1878#2,3:466\n1878#2,3:469\n1869#2,2:472\n1878#2,3:474\n1878#2,3:477\n1878#2,3:481\n1563#2:484\n1634#2,3:485\n774#2:488\n865#2,2:489\n1#3:480\n*S KotlinDebug\n*F\n+ 1 BleSleep.kt\ncom/szabh/smable3/entity/BleSleep$Companion\n*L\n75#1:458\n75#1:459,4\n92#1:463,3\n199#1:466,3\n236#1:469,3\n259#1:472,2\n342#1:474,3\n368#1:477,3\n401#1:481,3\n430#1:484\n430#1:485,3\n441#1:488\n441#1:489,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleSleep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleSleep.kt\ncom/szabh/smable3/entity/BleSleep$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,457:1\n1573#2:458\n1604#2,4:459\n1878#2,3:463\n1878#2,3:466\n1878#2,3:469\n1869#2,2:472\n1878#2,3:474\n1878#2,3:477\n1878#2,3:481\n1563#2:484\n1634#2,3:485\n774#2:488\n865#2,2:489\n1#3:480\n*S KotlinDebug\n*F\n+ 1 BleSleep.kt\ncom/szabh/smable3/entity/BleSleep$Companion\n*L\n75#1:458\n75#1:459,4\n92#1:463,3\n199#1:466,3\n236#1:469,3\n259#1:472,2\n342#1:474,3\n368#1:477,3\n401#1:481,3\n430#1:484\n430#1:485,3\n441#1:488\n441#1:489,2\n*E\n"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/szabh/smable3/entity/BleSleep$Companion;-><init>()V

    return-void
.end method

.method public static synthetic analyseSleep$default(Lcom/szabh/smable3/entity/BleSleep$Companion;Ljava/util/List;IILjava/lang/Object;)Ljava/util/List;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/szabh/smable3/entity/BleSleep$Companion;->analyseSleep(Ljava/util/List;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getSleepAllDayViewDatas$default(Lcom/szabh/smable3/entity/BleSleep$Companion;Ljava/util/List;ZILjava/lang/Object;)Ljava/util/List;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/szabh/smable3/entity/BleSleep$Companion;->getSleepAllDayViewDatas(Ljava/util/List;Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final analyseSleep(Ljava/util/List;I)Ljava/util/List;
    .locals 21
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSleep;",
            ">;I)",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSleep;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "origin"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v4, 0x0

    move v5, v4

    move v6, v5

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/16 v8, 0x11

    if-eqz v7, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v9, v6, 0x1

    if-gez v6, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_1
    check-cast v7, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v7}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v7

    if-ne v7, v8, :cond_2

    move v5, v6

    :cond_2
    sget-object v6, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v6, v9

    goto :goto_0

    :cond_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v5

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IiII0(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v2

    if-ltz v1, :cond_5

    move v3, v4

    :goto_1
    add-int/lit8 v5, v3, 0x1

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v6}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v6

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v7}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v7

    sub-int/2addr v6, v7

    const/16 v7, 0x3840

    if-lt v6, v7, :cond_4

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_4
    if-eq v3, v1, :cond_5

    move v3, v5

    goto :goto_1

    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x3

    const/4 v5, 0x1

    if-nez p2, :cond_1f

    move-object v6, v0

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v7, v4

    move v9, v7

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    const/16 v11, 0x384

    if-eqz v10, :cond_1e

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 v12, v9, 0x1

    if-gez v9, :cond_6

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_6
    move-object v13, v10

    check-cast v13, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v9

    if-eq v9, v5, :cond_11

    if-eq v9, v2, :cond_b

    if-eq v9, v3, :cond_9

    if-eq v9, v8, :cond_7

    goto/16 :goto_7

    :cond_7
    invoke-interface {v1}, Ljava/util/List;->clear()V

    invoke-virtual {v13, v2}, Lcom/szabh/smable3/entity/BleSleep;->setMMode(I)V

    invoke-interface {v1, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v7

    if-le v7, v12, :cond_8

    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v7}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v7

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v9

    sub-int/2addr v7, v9

    if-le v7, v11, :cond_8

    new-instance v14, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v7

    add-int/lit16 v15, v7, 0x384

    const/16 v19, 0xc

    const/16 v20, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v14 .. v20}, Lcom/szabh/smable3/entity/BleSleep;-><init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    move v7, v5

    goto/16 :goto_7

    :cond_9
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_a

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v9}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v9

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v10

    if-eq v9, v10, :cond_1d

    :cond_a
    invoke-interface {v1, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_7

    :cond_b
    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMStrong()I

    move-result v9

    if-gt v9, v2, :cond_e

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMSoft()I

    move-result v9

    const/16 v10, 0x19

    if-le v9, v10, :cond_c

    goto :goto_3

    :cond_c
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_d

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v9}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v9

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v10

    if-eq v9, v10, :cond_1d

    :cond_d
    invoke-interface {v1, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_7

    :cond_e
    :goto_3
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_10

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v9

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v10}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v10

    sub-int/2addr v9, v10

    if-le v9, v11, :cond_f

    goto :goto_4

    :cond_f
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_1d

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v9

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v10}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v10

    sub-int/2addr v9, v10

    if-gt v9, v11, :cond_1d

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v9, v3}, Lcom/szabh/smable3/entity/BleSleep;->setMMode(I)V

    goto/16 :goto_7

    :cond_10
    :goto_4
    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v9

    add-int/lit16 v14, v9, -0x384

    const/16 v18, 0xc

    const/16 v19, 0x0

    const/4 v15, 0x3

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v13 .. v19}, Lcom/szabh/smable3/entity/BleSleep;->copy$default(Lcom/szabh/smable3/entity/BleSleep;IIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleSleep;

    move-result-object v9

    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_7

    :cond_11
    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMStrong()I

    move-result v9

    const/16 v10, 0x348

    if-le v9, v2, :cond_15

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_14

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v9

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v14}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v14

    sub-int/2addr v9, v14

    const/16 v14, 0x3c0

    if-le v9, v14, :cond_12

    goto :goto_5

    :cond_12
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_13

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v9

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v11}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v11

    sub-int/2addr v9, v11

    if-gt v9, v10, :cond_13

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v9, v3}, Lcom/szabh/smable3/entity/BleSleep;->setMMode(I)V

    goto/16 :goto_7

    :cond_13
    const/16 v18, 0xd

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x3

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v13 .. v19}, Lcom/szabh/smable3/entity/BleSleep;->copy$default(Lcom/szabh/smable3/entity/BleSleep;IIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleSleep;

    move-result-object v9

    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_7

    :cond_14
    :goto_5
    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v9

    add-int/lit16 v14, v9, -0x384

    const/16 v18, 0xc

    const/16 v19, 0x0

    const/4 v15, 0x3

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v13 .. v19}, Lcom/szabh/smable3/entity/BleSleep;->copy$default(Lcom/szabh/smable3/entity/BleSleep;IIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleSleep;

    move-result-object v9

    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_7

    :cond_15
    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMSoft()I

    move-result v9

    if-le v9, v2, :cond_19

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_18

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v9

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v10}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v10

    sub-int/2addr v9, v10

    if-le v9, v11, :cond_16

    goto :goto_6

    :cond_16
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_17

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v9

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v10}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v10

    sub-int/2addr v9, v10

    if-gt v9, v11, :cond_17

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v9, v2}, Lcom/szabh/smable3/entity/BleSleep;->setMMode(I)V

    goto/16 :goto_7

    :cond_17
    const/16 v18, 0xd

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x2

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v13 .. v19}, Lcom/szabh/smable3/entity/BleSleep;->copy$default(Lcom/szabh/smable3/entity/BleSleep;IIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleSleep;

    move-result-object v9

    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_7

    :cond_18
    :goto_6
    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v9

    add-int/lit16 v14, v9, -0x384

    const/16 v18, 0xc

    const/16 v19, 0x0

    const/4 v15, 0x2

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v13 .. v19}, Lcom/szabh/smable3/entity/BleSleep;->copy$default(Lcom/szabh/smable3/entity/BleSleep;IIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleSleep;

    move-result-object v9

    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_7

    :cond_19
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_1a

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v9}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v9

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v11

    if-ne v9, v11, :cond_1a

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v9

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v11}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v11

    sub-int/2addr v9, v11

    if-le v9, v10, :cond_1a

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v14

    const/16 v18, 0xc

    const/16 v19, 0x0

    const/4 v15, 0x2

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v13 .. v19}, Lcom/szabh/smable3/entity/BleSleep;->copy$default(Lcom/szabh/smable3/entity/BleSleep;IIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleSleep;

    move-result-object v9

    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_1a
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v9

    if-le v9, v2, :cond_1b

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v9}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v9

    if-ne v9, v2, :cond_1b

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v9

    sub-int/2addr v9, v2

    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v9}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v9

    if-ne v9, v5, :cond_1b

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v9

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v11}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v11

    sub-int/2addr v9, v11

    if-le v9, v10, :cond_1b

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v14

    const/16 v18, 0xc

    const/16 v19, 0x0

    const/4 v15, 0x2

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v13 .. v19}, Lcom/szabh/smable3/entity/BleSleep;->copy$default(Lcom/szabh/smable3/entity/BleSleep;IIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleSleep;

    move-result-object v9

    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_1b
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_1c

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v9}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v9

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v10

    if-eq v9, v10, :cond_1d

    :cond_1c
    invoke-interface {v1, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1d
    :goto_7
    move v9, v12

    goto/16 :goto_2

    :cond_1e
    if-nez v7, :cond_27

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_27

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v0, v2}, Lcom/szabh/smable3/entity/BleSleep;->setMMode(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v5, :cond_27

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v0

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v2

    sub-int/2addr v0, v2

    if-le v0, v11, :cond_27

    new-instance v12, Lcom/szabh/smable3/entity/BleSleep;

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v0

    add-int/lit16 v13, v0, 0x384

    const/16 v17, 0xc

    const/16 v18, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v12 .. v18}, Lcom/szabh/smable3/entity/BleSleep;-><init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v5, v12}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-object v1

    :cond_1f
    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_27

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v4, 0x1

    if-gez v4, :cond_20

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_20
    move-object v9, v6

    check-cast v9, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v9}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v4

    if-eq v4, v5, :cond_25

    if-eq v4, v2, :cond_24

    if-eq v4, v3, :cond_23

    if-eq v4, v8, :cond_22

    const/16 v6, 0x22

    if-eq v4, v6, :cond_21

    goto :goto_9

    :cond_21
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_26

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v4}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v11

    const/16 v14, 0xd

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v9 .. v15}, Lcom/szabh/smable3/entity/BleSleep;->copy$default(Lcom/szabh/smable3/entity/BleSleep;IIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleSleep;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_22
    invoke-interface {v1}, Ljava/util/List;->clear()V

    goto :goto_9

    :cond_23
    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_24
    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_25
    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_26
    :goto_9
    move v4, v7

    goto :goto_8

    :cond_27
    return-object v1
.end method

.method public final analyseSleepAllDay(Ljava/util/List;J)Ljava/util/List;
    .locals 9
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSleep;",
            ">;J)",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSleep;",
            ">;"
        }
    .end annotation

    const-string v0, "sleeps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    add-long/2addr v0, p2

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "analyseSleepAllDay -> "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v5, 0x20

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    move-object v2, p1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    const/4 v5, -0x1

    if-ge v3, v2, :cond_1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v6}, Lcom/szabh/smable3/entity/BleSleep;->getMLocalTime()J

    move-result-wide v6

    cmp-long v6, v6, p2

    if-ltz v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move v3, v5

    :goto_1
    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "analyseSleepAllDay -> start = "

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-ne v3, v5, :cond_2

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_2
    const/16 p2, 0x22

    const/16 p3, 0x11

    if-lez v3, :cond_6

    add-int/lit8 v5, v3, -0x1

    :cond_3
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v6}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v7

    if-ne v7, p3, :cond_4

    move v3, v5

    goto :goto_2

    :cond_4
    invoke-virtual {v6}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v6

    if-ne v6, p2, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v5, v5, -0x1

    if-gez v5, :cond_3

    :cond_6
    :goto_2
    sget-object v5, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v5, v2, -0x1

    :cond_7
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v6}, Lcom/szabh/smable3/entity/BleSleep;->getMLocalTime()J

    move-result-wide v7

    cmp-long v7, v7, v0

    if-gez v7, :cond_9

    invoke-virtual {v6}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v7

    if-ne v7, p3, :cond_8

    move v2, v5

    goto :goto_3

    :cond_8
    invoke-virtual {v6}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v6

    if-ne v6, p2, :cond_9

    add-int/lit8 v2, v5, 0x1

    goto :goto_3

    :cond_9
    add-int/lit8 v5, v5, -0x1

    if-ge v5, v3, :cond_7

    :goto_3
    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " - "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-interface {p1, v3, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final getSleepAllDaySegmentStatus(Ljava/util/List;)Ljava/util/HashMap;
    .locals 11
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSleep;",
            ">;)",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "sleeps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    if-ne v1, v6, :cond_0

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v1

    const/16 v8, 0x11

    if-ne v1, v8, :cond_0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v1

    const/16 v8, 0x22

    if-ne v1, v8, :cond_0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v1

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v2

    sub-int v4, v1, v2

    goto :goto_2

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, v6, :cond_4

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v2, v4

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v8, v2, 0x1

    if-gez v2, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_1
    check-cast v6, Lcom/szabh/smable3/entity/BleSleep;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result v9

    if-ge v2, v9, :cond_3

    invoke-virtual {v6}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v0, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    if-eqz v9, :cond_2

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    goto :goto_1

    :cond_2
    move v9, v4

    :goto_1
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v10}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v10

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v2

    sub-int/2addr v10, v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    add-int/2addr v9, v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v0, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    move v2, v8

    goto :goto_0

    :cond_4
    :goto_2
    if-lez v4, :cond_5

    const/16 p1, 0x8

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    div-int/lit8 v4, v4, 0x3c

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_5
    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result p1

    sub-int/2addr v1, p1

    div-int/lit8 v1, v1, 0x3c

    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_6

    move-object p1, v5

    :cond_6
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    div-int/lit8 p1, p1, 0x3c

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_7

    move-object v2, v5

    :cond_7
    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    div-int/lit8 v2, v2, 0x3c

    const/16 v4, 0x9

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_8

    goto :goto_3

    :cond_8
    move-object v5, v6

    :goto_3
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    div-int/lit8 v5, v5, 0x3c

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v0, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v0, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sub-int/2addr v1, p1

    sub-int/2addr v1, v2

    sub-int/2addr v1, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final getSleepAllDaySegments(Ljava/util/List;)Ljava/util/List;
    .locals 13
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSleep;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSleep;",
            ">;>;"
        }
    .end annotation

    const-string v0, "sleeps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v3, 0x1

    if-gez v3, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_0
    move-object v6, v4

    check-cast v6, Lcom/szabh/smable3/entity/BleSleep;

    const/16 v11, 0xf

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v6 .. v12}, Lcom/szabh/smable3/entity/BleSleep;->copy$default(Lcom/szabh/smable3/entity/BleSleep;IIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleSleep;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v4

    const/16 v6, 0x22

    if-eq v4, v6, :cond_1

    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {p1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result v4

    if-ne v3, v4, :cond_2

    :cond_1
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_2
    move v3, v5

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public final getSleepAllDayStatus(Ljava/util/List;)Ljava/util/HashMap;
    .locals 16
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSleep;",
            ">;)",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "sleeps"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p1}, Lcom/szabh/smable3/entity/BleSleep$Companion;->getSleepAllDaySegments(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move v4, v2

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v4, 0x1

    if-gez v4, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_0
    check-cast v5, Ljava/util/List;

    sget-object v4, Lcom/szabh/smable3/entity/BleSleep;->Companion:Lcom/szabh/smable3/entity/BleSleep$Companion;

    invoke-virtual {v4, v5}, Lcom/szabh/smable3/entity/BleSleep$Companion;->getSleepAllDaySegmentStatus(Ljava/util/List;)Ljava/util/HashMap;

    move-result-object v4

    const/4 v5, 0x2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    if-eqz v7, :cond_1

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    goto :goto_1

    :cond_1
    move v7, v2

    :goto_1
    const/4 v8, 0x1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v4, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    if-eqz v9, :cond_2

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    goto :goto_2

    :cond_2
    move v9, v2

    :goto_2
    const/4 v10, 0x3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v4, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    if-eqz v11, :cond_3

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    goto :goto_3

    :cond_3
    move v11, v2

    :goto_3
    const/16 v12, 0x9

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v4, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Integer;

    if-eqz v13, :cond_4

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    goto :goto_4

    :cond_4
    move v13, v2

    :goto_4
    const/16 v14, 0x8

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v4, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_5

    :cond_5
    move v4, v2

    :goto_5
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_6

    move-object v5, v3

    :cond_6
    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    add-int/2addr v5, v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v1, v15, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_7

    move-object v7, v3

    :cond_7
    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    add-int/2addr v7, v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v1, v5, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_8

    move-object v7, v3

    :cond_8
    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    add-int/2addr v7, v11

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v1, v5, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_9

    move-object v7, v3

    :cond_9
    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    add-int/2addr v7, v13

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v1, v5, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_a

    move-object v7, v3

    :cond_a
    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    add-int/2addr v7, v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v4, v6

    goto/16 :goto_0

    :cond_b
    return-object v1
.end method

.method public final getSleepAllDayViewDatas(Ljava/util/List;Z)Ljava/util/List;
    .locals 13
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSleep;",
            ">;Z)",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSleep;",
            ">;"
        }
    .end annotation

    const-string v0, "sleeps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p1}, Lcom/szabh/smable3/entity/BleSleep$Companion;->getSleepAllDaySegments(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {p0, v1}, Lcom/szabh/smable3/entity/BleSleep$Companion;->getSleepAllDaySegmentStatus(Ljava/util/List;)Ljava/util/HashMap;

    move-result-object v2

    const/16 v3, 0x8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    const/4 v5, 0x1

    if-lez v2, :cond_3

    if-eqz p2, :cond_0

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/szabh/smable3/entity/BleSleep;

    const/16 v11, 0xd

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x11

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v6 .. v12}, Lcom/szabh/smable3/entity/BleSleep;->copy$default(Lcom/szabh/smable3/entity/BleSleep;IIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleSleep;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v2, v6}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v6, v3}, Lcom/szabh/smable3/entity/BleSleep;->setMMode(I)V

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/szabh/smable3/entity/BleSleep;

    const/16 v7, 0xd

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/16 v4, 0x22

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Lcom/szabh/smable3/entity/BleSleep;->copy$default(Lcom/szabh/smable3/entity/BleSleep;IIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleSleep;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    sget-object v2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v2}, Lcom/szabh/smable3/component/BaseBleCache;->getMSupportSHSYAlgorithm()I

    move-result v2

    if-ne v2, v5, :cond_7

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v6}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v6

    const/16 v7, 0x11

    if-eq v6, v7, :cond_5

    move v6, v5

    goto :goto_4

    :cond_5
    move v6, v4

    :goto_4
    if-eqz v6, :cond_4

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    move-object v1, v2

    :cond_7
    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_0

    :cond_8
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_9

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result p1

    const/16 p2, 0x22

    if-eq p1, p2, :cond_9

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/szabh/smable3/entity/BleSleep;

    const/16 v6, 0xd

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/16 v3, 0x22

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/szabh/smable3/entity/BleSleep;->copy$default(Lcom/szabh/smable3/entity/BleSleep;IIIIILjava/lang/Object;)Lcom/szabh/smable3/entity/BleSleep;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    return-object v0
.end method

.method public final getSleepStatusDuration(Ljava/util/List;)Landroid/util/SparseIntArray;
    .locals 6
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSleep;",
            ">;)",
            "Landroid/util/SparseIntArray;"
        }
    .end annotation

    const-string v0, "sleeps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 2
    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    .line 3
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_0
    check-cast v3, Lcom/szabh/smable3/entity/BleSleep;

    .line 4
    invoke-static {p1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result v5

    if-ge v2, v5, :cond_1

    .line 5
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v2

    .line 6
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v5}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v5

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v3

    sub-int/2addr v5, v3

    .line 7
    invoke-virtual {v0, v2}, Landroid/util/SparseIntArray;->get(I)I

    move-result v3

    add-int/2addr v3, v5

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    :cond_1
    move v2, v4

    goto :goto_0

    :cond_2
    const/4 p1, 0x2

    .line 8
    invoke-virtual {v0, p1}, Landroid/util/SparseIntArray;->get(I)I

    move-result v1

    div-int/lit8 v1, v1, 0x3c

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseIntArray;->put(II)V

    const/4 p1, 0x1

    .line 9
    invoke-virtual {v0, p1}, Landroid/util/SparseIntArray;->get(I)I

    move-result v1

    div-int/lit8 v1, v1, 0x3c

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseIntArray;->put(II)V

    const/4 p1, 0x3

    .line 10
    invoke-virtual {v0, p1}, Landroid/util/SparseIntArray;->get(I)I

    move-result v1

    div-int/lit8 v1, v1, 0x3c

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseIntArray;->put(II)V

    return-object v0
.end method

.method public final getSleepStatusDuration(Ljava/util/List;Ljava/util/List;)Landroid/util/SparseIntArray;
    .locals 7
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSleep;",
            ">;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSleep;",
            ">;)",
            "Landroid/util/SparseIntArray;"
        }
    .end annotation

    const-string v0, "sleeps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "origin"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 12
    check-cast p2, Ljava/lang/Iterable;

    .line 13
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x2

    const/4 v4, 0x3

    const/4 v5, 0x4

    if-eqz v1, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/szabh/smable3/entity/BleSleep;

    .line 14
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v6

    if-eq v6, v5, :cond_3

    const/4 v5, 0x5

    if-eq v6, v5, :cond_2

    const/4 v2, 0x6

    if-eq v6, v2, :cond_1

    const/4 v2, 0x7

    if-eq v6, v2, :cond_0

    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSleep;->getMSoft()I

    move-result v2

    shl-int/lit8 v2, v2, 0x8

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSleep;->getMStrong()I

    move-result v1

    add-int/2addr v2, v1

    invoke-virtual {v0, v4, v2}, Landroid/util/SparseIntArray;->put(II)V

    goto :goto_0

    .line 16
    :cond_1
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSleep;->getMSoft()I

    move-result v2

    shl-int/lit8 v2, v2, 0x8

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSleep;->getMStrong()I

    move-result v1

    add-int/2addr v2, v1

    invoke-virtual {v0, v3, v2}, Landroid/util/SparseIntArray;->put(II)V

    goto :goto_0

    .line 17
    :cond_2
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSleep;->getMSoft()I

    move-result v3

    shl-int/lit8 v3, v3, 0x8

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSleep;->getMStrong()I

    move-result v1

    add-int/2addr v3, v1

    invoke-virtual {v0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    goto :goto_0

    .line 18
    :cond_3
    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSleep;->getMSoft()I

    move-result v2

    shl-int/lit8 v2, v2, 0x8

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleSleep;->getMStrong()I

    move-result v1

    add-int/2addr v2, v1

    invoke-virtual {v0, v5, v2}, Landroid/util/SparseIntArray;->put(II)V

    goto :goto_0

    .line 19
    :cond_4
    invoke-virtual {v0, v5}, Landroid/util/SparseIntArray;->get(I)I

    move-result p2

    if-nez p2, :cond_5

    .line 20
    invoke-virtual {p0, p1}, Lcom/szabh/smable3/entity/BleSleep$Companion;->getSleepStatusDuration(Ljava/util/List;)Landroid/util/SparseIntArray;

    move-result-object p1

    .line 21
    invoke-virtual {p1, v3}, Landroid/util/SparseIntArray;->get(I)I

    move-result p2

    invoke-virtual {p1, v2}, Landroid/util/SparseIntArray;->get(I)I

    move-result v0

    add-int/2addr p2, v0

    invoke-virtual {p1, v4}, Landroid/util/SparseIntArray;->get(I)I

    move-result v0

    add-int/2addr p2, v0

    invoke-virtual {p1, v5, p2}, Landroid/util/SparseIntArray;->put(II)V

    return-object p1

    :cond_5
    return-object v0
.end method
