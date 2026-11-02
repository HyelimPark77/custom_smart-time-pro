.class public final Lcom/sma/smartv3/model/MySportRecordModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMySportRecordModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MySportRecordModel.kt\ncom/sma/smartv3/model/MySportRecordModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,416:1\n774#2:417\n865#2,2:418\n2423#2,14:420\n1999#2,14:434\n1999#2,14:448\n1999#2,14:462\n1999#2,14:476\n1999#2,14:490\n1999#2,14:504\n*S KotlinDebug\n*F\n+ 1 MySportRecordModel.kt\ncom/sma/smartv3/model/MySportRecordModel\n*L\n120#1:417\n120#1:418,2\n121#1:420,14\n150#1:434,14\n160#1:448,14\n228#1:462,14\n240#1:476,14\n309#1:490,14\n320#1:504,14\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMySportRecordModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MySportRecordModel.kt\ncom/sma/smartv3/model/MySportRecordModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,416:1\n774#2:417\n865#2,2:418\n2423#2,14:420\n1999#2,14:434\n1999#2,14:448\n1999#2,14:462\n1999#2,14:476\n1999#2,14:490\n1999#2,14:504\n*S KotlinDebug\n*F\n+ 1 MySportRecordModel.kt\ncom/sma/smartv3/model/MySportRecordModel\n*L\n120#1:417\n120#1:418,2\n121#1:420,14\n150#1:434,14\n160#1:448,14\n228#1:462,14\n240#1:476,14\n309#1:490,14\n320#1:504,14\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/model/MySportRecordModel;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/model/MySportRecordModel;

    invoke-direct {v0}, Lcom/sma/smartv3/model/MySportRecordModel;-><init>()V

    sput-object v0, Lcom/sma/smartv3/model/MySportRecordModel;->INSTANCE:Lcom/sma/smartv3/model/MySportRecordModel;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getSportRecordCycling(Lcom/sma/smartv3/model/MySportRecordModel;Ljava/util/List;Ljava/util/ArrayList;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/model/MySportRecordModel;->getSportRecordCycling(Ljava/util/List;Ljava/util/ArrayList;I)V

    return-void
.end method

.method public static final synthetic access$getSportRecordRunning(Lcom/sma/smartv3/model/MySportRecordModel;Ljava/util/List;Ljava/util/ArrayList;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/model/MySportRecordModel;->getSportRecordRunning(Ljava/util/List;Ljava/util/ArrayList;I)V

    return-void
.end method

.method public static final synthetic access$getSportRecordSwimming(Lcom/sma/smartv3/model/MySportRecordModel;Ljava/util/List;Ljava/util/ArrayList;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/model/MySportRecordModel;->getSportRecordSwimming(Ljava/util/List;Ljava/util/ArrayList;I)V

    return-void
.end method

.method private final getItemTime(IIILjava/util/List;)Lkotlin/Triple;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Workout;",
            ">;)",
            "Lkotlin/Triple<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    if-le p1, p2, :cond_6

    check-cast p4, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_0
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v2

    if-lt v2, p2, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v1

    if-gt v1, p3, :cond_0

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-nez p2, :cond_2

    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-nez p3, :cond_3

    :goto_1
    move-object p1, p2

    goto :goto_2

    :cond_3
    move-object p3, p2

    check-cast p3, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {p3}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result p4

    invoke-virtual {p3}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result p3

    div-int/2addr p4, p3

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object v0, p3

    check-cast v0, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v1

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result v0

    div-int/2addr v1, v0

    if-le p4, v1, :cond_5

    move-object p2, p3

    move p4, v1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-nez p3, :cond_4

    goto :goto_1

    :goto_2
    check-cast p1, Lcom/sma/smartv3/db/entity/Workout;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result p2

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide p3

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMId()I

    move-result p1

    goto :goto_3

    :cond_6
    const/4 p2, 0x0

    const-wide/16 p3, 0x0

    const/4 p1, -0x1

    :goto_3
    new-instance v0, Lkotlin/Triple;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v0, p2, p3, p1}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private final getSportRecordCycling(Ljava/util/List;Ljava/util/ArrayList;I)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Workout;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/MySportRecordList;",
            ">;I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object v4, v1

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-nez v6, :cond_0

    move-object v6, v7

    goto :goto_0

    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_1

    goto :goto_0

    :cond_1
    move-object v8, v6

    check-cast v8, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v8

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v10}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v10

    if-ge v8, v10, :cond_3

    move-object v6, v9

    move v8, v10

    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_2

    :goto_0
    check-cast v6, Lcom/sma/smartv3/db/entity/Workout;

    const/4 v9, 0x0

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v5

    move v10, v5

    goto :goto_1

    :cond_4
    move v10, v9

    :goto_1
    const v5, 0x7f141293

    invoke-static {v5}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v13

    if-eqz v10, :cond_5

    const/4 v5, 0x4

    invoke-static {v10, v3, v9, v5, v7}, Lcom/android/mltcode/paycertificationapi/cp5;->X1ii(IIZILjava/lang/Object;)F

    move-result v5

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v8

    invoke-static {v8}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v8

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :goto_2
    move-object/from16 v16, v5

    goto :goto_3

    :cond_5
    const v5, 0x7f1403bc

    invoke-static {v5}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :goto_3
    const-wide/16 v22, 0x0

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v11

    move-wide/from16 v17, v11

    goto :goto_4

    :cond_6
    move-wide/from16 v17, v22

    :goto_4
    const/16 v24, -0x1

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Workout;->getMId()I

    move-result v5

    move v14, v5

    goto :goto_5

    :cond_7
    move/from16 v14, v24

    :goto_5
    new-instance v11, Lcom/sma/smartv3/model/MySportRecordList;

    const/16 v20, 0x48

    const/16 v21, 0x0

    const v12, 0x7f08176d

    const/4 v15, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_6

    :cond_8
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_6

    :cond_9
    move-object v4, v7

    check-cast v4, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result v4

    :cond_a
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result v6

    if-ge v4, v6, :cond_b

    move-object v7, v5

    move v4, v6

    :cond_b
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_a

    :goto_6
    check-cast v7, Lcom/sma/smartv3/db/entity/Workout;

    const v4, 0x7f141296

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v13

    if-eqz v7, :cond_c

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result v9

    :cond_c
    invoke-direct {v0, v9}, Lcom/sma/smartv3/model/MySportRecordModel;->getTime(I)Ljava/lang/String;

    move-result-object v16

    if-eqz v7, :cond_d

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v22

    :cond_d
    move-wide/from16 v17, v22

    if-eqz v7, :cond_e

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Workout;->getMId()I

    move-result v24

    :cond_e
    move/from16 v14, v24

    new-instance v11, Lcom/sma/smartv3/model/MySportRecordList;

    const/16 v20, 0x48

    const/16 v21, 0x0

    const v12, 0x7f081772

    const/4 v15, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v4, 0xbb8

    const/16 v5, 0x1388

    invoke-direct {v0, v10, v4, v5, v1}, Lcom/sma/smartv3/model/MySportRecordModel;->getItemTime(IIILjava/util/List;)Lkotlin/Triple;

    move-result-object v6

    invoke-virtual {v0, v3, v4}, Lcom/sma/smartv3/model/MySportRecordModel;->getSportDistanceUnit(II)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-direct {v0, v7}, Lcom/sma/smartv3/model/MySportRecordModel;->getTime(I)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v6}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v17

    invoke-virtual {v6}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v14

    invoke-static {v4, v3}, Lcom/android/mltcode/paycertificationapi/cp5;->O10IXXX0X(II)F

    move-result v4

    float-to-int v4, v4

    new-instance v11, Lcom/sma/smartv3/model/MySportRecordList;

    const/16 v20, 0x8

    const v12, 0x7f081769

    move/from16 v19, v4

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v4, 0x2710

    invoke-direct {v0, v10, v5, v4, v1}, Lcom/sma/smartv3/model/MySportRecordModel;->getItemTime(IIILjava/util/List;)Lkotlin/Triple;

    move-result-object v6

    invoke-virtual {v0, v3, v5}, Lcom/sma/smartv3/model/MySportRecordModel;->getSportDistanceUnit(II)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-direct {v0, v7}, Lcom/sma/smartv3/model/MySportRecordModel;->getTime(I)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v6}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v17

    invoke-virtual {v6}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v14

    invoke-static {v5, v3}, Lcom/android/mltcode/paycertificationapi/cp5;->O10IXXX0X(II)F

    move-result v5

    float-to-int v5, v5

    new-instance v11, Lcom/sma/smartv3/model/MySportRecordList;

    move/from16 v19, v5

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v5, 0x9c40

    invoke-direct {v0, v10, v4, v5, v1}, Lcom/sma/smartv3/model/MySportRecordModel;->getItemTime(IIILjava/util/List;)Lkotlin/Triple;

    move-result-object v6

    invoke-virtual {v0, v3, v4}, Lcom/sma/smartv3/model/MySportRecordModel;->getSportDistanceUnit(II)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-direct {v0, v7}, Lcom/sma/smartv3/model/MySportRecordModel;->getTime(I)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v6}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v17

    invoke-virtual {v6}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v14

    invoke-static {v4, v3}, Lcom/android/mltcode/paycertificationapi/cp5;->O10IXXX0X(II)F

    move-result v4

    float-to-int v4, v4

    new-instance v11, Lcom/sma/smartv3/model/MySportRecordList;

    move/from16 v19, v4

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v4, 0x15f90

    invoke-direct {v0, v10, v5, v4, v1}, Lcom/sma/smartv3/model/MySportRecordModel;->getItemTime(IIILjava/util/List;)Lkotlin/Triple;

    move-result-object v6

    invoke-virtual {v0, v3, v5}, Lcom/sma/smartv3/model/MySportRecordModel;->getSportDistanceUnit(II)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-direct {v0, v7}, Lcom/sma/smartv3/model/MySportRecordModel;->getTime(I)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v6}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v17

    invoke-virtual {v6}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v14

    invoke-static {v5, v3}, Lcom/android/mltcode/paycertificationapi/cp5;->O10IXXX0X(II)F

    move-result v5

    float-to-int v5, v5

    new-instance v11, Lcom/sma/smartv3/model/MySportRecordList;

    move/from16 v19, v5

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v5, 0x1fbd0

    invoke-direct {v0, v10, v4, v5, v1}, Lcom/sma/smartv3/model/MySportRecordModel;->getItemTime(IIILjava/util/List;)Lkotlin/Triple;

    move-result-object v6

    invoke-virtual {v0, v3, v4}, Lcom/sma/smartv3/model/MySportRecordModel;->getSportDistanceUnit(II)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-direct {v0, v7}, Lcom/sma/smartv3/model/MySportRecordModel;->getTime(I)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v6}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v17

    invoke-virtual {v6}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v14

    invoke-static {v4, v3}, Lcom/android/mltcode/paycertificationapi/cp5;->O10IXXX0X(II)F

    move-result v4

    float-to-int v4, v4

    new-instance v11, Lcom/sma/smartv3/model/MySportRecordList;

    move/from16 v19, v4

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v4, 0x2bf20

    invoke-direct {v0, v10, v5, v4, v1}, Lcom/sma/smartv3/model/MySportRecordModel;->getItemTime(IIILjava/util/List;)Lkotlin/Triple;

    move-result-object v6

    invoke-virtual {v0, v3, v5}, Lcom/sma/smartv3/model/MySportRecordModel;->getSportDistanceUnit(II)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-direct {v0, v7}, Lcom/sma/smartv3/model/MySportRecordModel;->getTime(I)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v6}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v17

    invoke-virtual {v6}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v14

    invoke-static {v5, v3}, Lcom/android/mltcode/paycertificationapi/cp5;->O10IXXX0X(II)F

    move-result v5

    float-to-int v5, v5

    new-instance v11, Lcom/sma/smartv3/model/MySportRecordList;

    move/from16 v19, v5

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v5, 0xf4240

    invoke-direct {v0, v10, v4, v5, v1}, Lcom/sma/smartv3/model/MySportRecordModel;->getItemTime(IIILjava/util/List;)Lkotlin/Triple;

    move-result-object v1

    invoke-virtual {v0, v3, v4}, Lcom/sma/smartv3/model/MySportRecordModel;->getSportDistanceUnit(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-direct {v0, v5}, Lcom/sma/smartv3/model/MySportRecordModel;->getTime(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v11

    invoke-virtual {v1}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-static {v4, v3}, Lcom/android/mltcode/paycertificationapi/cp5;->O10IXXX0X(II)F

    move-result v1

    float-to-int v13, v1

    new-instance v5, Lcom/sma/smartv3/model/MySportRecordList;

    const/16 v14, 0x8

    const/4 v15, 0x0

    const v6, 0x7f081769

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v15}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private final getSportRecordRunning(Ljava/util/List;Ljava/util/ArrayList;I)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Workout;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/MySportRecordList;",
            ">;I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object v4, v1

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-nez v6, :cond_0

    move-object v6, v7

    goto :goto_0

    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_1

    goto :goto_0

    :cond_1
    move-object v8, v6

    check-cast v8, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v8

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v10}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v10

    if-ge v8, v10, :cond_3

    move-object v6, v9

    move v8, v10

    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_2

    :goto_0
    check-cast v6, Lcom/sma/smartv3/db/entity/Workout;

    const/4 v9, 0x0

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v5

    move v10, v5

    goto :goto_1

    :cond_4
    move v10, v9

    :goto_1
    const v5, 0x7f141293

    invoke-static {v5}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v13

    if-eqz v10, :cond_5

    const/4 v5, 0x4

    invoke-static {v10, v3, v9, v5, v7}, Lcom/android/mltcode/paycertificationapi/cp5;->X1ii(IIZILjava/lang/Object;)F

    move-result v5

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v8

    invoke-static {v8}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v8

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :goto_2
    move-object/from16 v16, v5

    goto :goto_3

    :cond_5
    const v5, 0x7f1403bc

    invoke-static {v5}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :goto_3
    const-wide/16 v22, 0x0

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v11

    move-wide/from16 v17, v11

    goto :goto_4

    :cond_6
    move-wide/from16 v17, v22

    :goto_4
    const/16 v24, -0x1

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Workout;->getMId()I

    move-result v5

    move v14, v5

    goto :goto_5

    :cond_7
    move/from16 v14, v24

    :goto_5
    new-instance v11, Lcom/sma/smartv3/model/MySportRecordList;

    const/16 v20, 0x48

    const/16 v21, 0x0

    const v12, 0x7f08176d

    const/4 v15, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_6

    :cond_8
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_6

    :cond_9
    move-object v4, v7

    check-cast v4, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result v4

    :cond_a
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result v6

    if-ge v4, v6, :cond_b

    move-object v7, v5

    move v4, v6

    :cond_b
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_a

    :goto_6
    check-cast v7, Lcom/sma/smartv3/db/entity/Workout;

    const v4, 0x7f141296

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v13

    if-eqz v7, :cond_c

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result v9

    :cond_c
    invoke-direct {v0, v9}, Lcom/sma/smartv3/model/MySportRecordModel;->getTime(I)Ljava/lang/String;

    move-result-object v16

    if-eqz v7, :cond_d

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v22

    :cond_d
    move-wide/from16 v17, v22

    if-eqz v7, :cond_e

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Workout;->getMId()I

    move-result v24

    :cond_e
    move/from16 v14, v24

    new-instance v11, Lcom/sma/smartv3/model/MySportRecordList;

    const/16 v20, 0x48

    const/16 v21, 0x0

    const v12, 0x7f081772

    const/4 v15, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v4, 0xbb8

    const/16 v5, 0x1388

    invoke-direct {v0, v10, v4, v5, v1}, Lcom/sma/smartv3/model/MySportRecordModel;->getItemTime(IIILjava/util/List;)Lkotlin/Triple;

    move-result-object v6

    invoke-virtual {v0, v3, v4}, Lcom/sma/smartv3/model/MySportRecordModel;->getSportDistanceUnit(II)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-direct {v0, v7}, Lcom/sma/smartv3/model/MySportRecordModel;->getTime(I)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v6}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v17

    invoke-virtual {v6}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v14

    invoke-static {v4, v3}, Lcom/android/mltcode/paycertificationapi/cp5;->O10IXXX0X(II)F

    move-result v4

    float-to-int v4, v4

    new-instance v11, Lcom/sma/smartv3/model/MySportRecordList;

    const/16 v20, 0x8

    const v12, 0x7f081769

    move/from16 v19, v4

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v4, 0x2710

    invoke-direct {v0, v10, v5, v4, v1}, Lcom/sma/smartv3/model/MySportRecordModel;->getItemTime(IIILjava/util/List;)Lkotlin/Triple;

    move-result-object v6

    invoke-virtual {v0, v3, v5}, Lcom/sma/smartv3/model/MySportRecordModel;->getSportDistanceUnit(II)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-direct {v0, v7}, Lcom/sma/smartv3/model/MySportRecordModel;->getTime(I)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v6}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v17

    invoke-virtual {v6}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v14

    invoke-static {v5, v3}, Lcom/android/mltcode/paycertificationapi/cp5;->O10IXXX0X(II)F

    move-result v5

    float-to-int v5, v5

    new-instance v11, Lcom/sma/smartv3/model/MySportRecordList;

    move/from16 v19, v5

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v5, 0x7530

    invoke-direct {v0, v10, v4, v5, v1}, Lcom/sma/smartv3/model/MySportRecordModel;->getItemTime(IIILjava/util/List;)Lkotlin/Triple;

    move-result-object v6

    invoke-virtual {v0, v3, v4}, Lcom/sma/smartv3/model/MySportRecordModel;->getSportDistanceUnit(II)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-direct {v0, v7}, Lcom/sma/smartv3/model/MySportRecordModel;->getTime(I)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v6}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v17

    invoke-virtual {v6}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v14

    invoke-static {v4, v3}, Lcom/android/mltcode/paycertificationapi/cp5;->O10IXXX0X(II)F

    move-result v4

    float-to-int v4, v4

    new-instance v11, Lcom/sma/smartv3/model/MySportRecordList;

    move/from16 v19, v4

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v4, 0xea60

    invoke-direct {v0, v10, v5, v4, v1}, Lcom/sma/smartv3/model/MySportRecordModel;->getItemTime(IIILjava/util/List;)Lkotlin/Triple;

    move-result-object v1

    invoke-virtual {v0, v3, v5}, Lcom/sma/smartv3/model/MySportRecordModel;->getSportDistanceUnit(II)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-direct {v0, v4}, Lcom/sma/smartv3/model/MySportRecordModel;->getTime(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v12

    invoke-virtual {v1}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v9

    invoke-static {v5, v3}, Lcom/android/mltcode/paycertificationapi/cp5;->O10IXXX0X(II)F

    move-result v1

    float-to-int v14, v1

    new-instance v6, Lcom/sma/smartv3/model/MySportRecordList;

    const/16 v15, 0x8

    const/16 v16, 0x0

    const v7, 0x7f081769

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v16}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v7, Lcom/sma/smartv3/model/MySportRecordList;

    const v1, 0x7f140bc1

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v9

    const/16 v16, 0x6c

    const/16 v17, 0x0

    const v8, 0x7f08176e

    const/4 v11, 0x0

    const-string v12, "--"

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v7 .. v17}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v8, Lcom/sma/smartv3/model/MySportRecordList;

    const v1, 0x7f140bc0

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v10

    const/16 v17, 0x6c

    const/16 v18, 0x0

    const v9, 0x7f08176a

    const/4 v12, 0x0

    const-string v13, "--"

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v8 .. v18}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private final getSportRecordSwimming(Ljava/util/List;Ljava/util/ArrayList;I)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Workout;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/MySportRecordList;",
            ">;I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object v4, v1

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-nez v6, :cond_0

    move-object v6, v7

    goto :goto_0

    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_1

    goto :goto_0

    :cond_1
    move-object v8, v6

    check-cast v8, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v8

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v10}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v10

    if-ge v8, v10, :cond_3

    move-object v6, v9

    move v8, v10

    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_2

    :goto_0
    check-cast v6, Lcom/sma/smartv3/db/entity/Workout;

    const/4 v9, 0x0

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v5

    move v10, v5

    goto :goto_1

    :cond_4
    move v10, v9

    :goto_1
    const v5, 0x7f141293

    invoke-static {v5}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v13

    if-eqz v10, :cond_5

    invoke-static {v10, v3}, Lcom/android/mltcode/paycertificationapi/cp5;->iIXi1iiXI(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v3}, Lcom/sma/smartv3/model/MySportRecordModel;->getMiDistanceUnit(I)I

    move-result v8

    invoke-static {v8}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v8

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :goto_2
    move-object/from16 v16, v5

    goto :goto_3

    :cond_5
    const v5, 0x7f1403bc

    invoke-static {v5}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :goto_3
    const-wide/16 v22, 0x0

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v11

    move-wide/from16 v17, v11

    goto :goto_4

    :cond_6
    move-wide/from16 v17, v22

    :goto_4
    const/16 v24, -0x1

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Workout;->getMId()I

    move-result v5

    move v14, v5

    goto :goto_5

    :cond_7
    move/from16 v14, v24

    :goto_5
    new-instance v11, Lcom/sma/smartv3/model/MySportRecordList;

    const/16 v20, 0x48

    const/16 v21, 0x0

    const v12, 0x7f08176b

    const/4 v15, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_6

    :cond_8
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_6

    :cond_9
    move-object v4, v7

    check-cast v4, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result v4

    :cond_a
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/sma/smartv3/db/entity/Workout;

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result v6

    if-ge v4, v6, :cond_b

    move-object v7, v5

    move v4, v6

    :cond_b
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_a

    :goto_6
    check-cast v7, Lcom/sma/smartv3/db/entity/Workout;

    const v4, 0x7f141296

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v13

    if-eqz v7, :cond_c

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result v9

    :cond_c
    invoke-direct {v0, v9}, Lcom/sma/smartv3/model/MySportRecordModel;->getTime(I)Ljava/lang/String;

    move-result-object v16

    if-eqz v7, :cond_d

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v22

    :cond_d
    move-wide/from16 v17, v22

    if-eqz v7, :cond_e

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Workout;->getMId()I

    move-result v24

    :cond_e
    move/from16 v14, v24

    new-instance v11, Lcom/sma/smartv3/model/MySportRecordList;

    const/16 v20, 0x48

    const/16 v21, 0x0

    const v12, 0x7f081772

    const/4 v15, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v4, 0x64

    const/16 v5, 0x190

    invoke-direct {v0, v10, v4, v5, v1}, Lcom/sma/smartv3/model/MySportRecordModel;->getItemTime(IIILjava/util/List;)Lkotlin/Triple;

    move-result-object v6

    invoke-virtual {v0, v3, v4}, Lcom/sma/smartv3/model/MySportRecordModel;->getSwimmingDistanceUnit(II)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-direct {v0, v7}, Lcom/sma/smartv3/model/MySportRecordModel;->getTime(I)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v6}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v17

    invoke-virtual {v6}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v14

    invoke-virtual {v0, v4, v3}, Lcom/sma/smartv3/model/MySportRecordModel;->metreToRulerNumber(II)F

    move-result v4

    float-to-int v4, v4

    new-instance v11, Lcom/sma/smartv3/model/MySportRecordList;

    const/16 v20, 0x8

    const v12, 0x7f081769

    move/from16 v19, v4

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v4, 0x2ee

    invoke-direct {v0, v10, v5, v4, v1}, Lcom/sma/smartv3/model/MySportRecordModel;->getItemTime(IIILjava/util/List;)Lkotlin/Triple;

    move-result-object v6

    invoke-virtual {v0, v3, v5}, Lcom/sma/smartv3/model/MySportRecordModel;->getSwimmingDistanceUnit(II)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-direct {v0, v7}, Lcom/sma/smartv3/model/MySportRecordModel;->getTime(I)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v6}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v17

    invoke-virtual {v6}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v14

    invoke-virtual {v0, v5, v3}, Lcom/sma/smartv3/model/MySportRecordModel;->metreToRulerNumber(II)F

    move-result v5

    float-to-int v5, v5

    new-instance v11, Lcom/sma/smartv3/model/MySportRecordList;

    move/from16 v19, v5

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v5, 0x3e8

    invoke-direct {v0, v10, v4, v5, v1}, Lcom/sma/smartv3/model/MySportRecordModel;->getItemTime(IIILjava/util/List;)Lkotlin/Triple;

    move-result-object v6

    invoke-virtual {v0, v3, v4}, Lcom/sma/smartv3/model/MySportRecordModel;->getSwimmingDistanceUnit(II)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-direct {v0, v7}, Lcom/sma/smartv3/model/MySportRecordModel;->getTime(I)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v6}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v17

    invoke-virtual {v6}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v14

    invoke-virtual {v0, v4, v3}, Lcom/sma/smartv3/model/MySportRecordModel;->metreToRulerNumber(II)F

    move-result v4

    float-to-int v4, v4

    new-instance v11, Lcom/sma/smartv3/model/MySportRecordList;

    move/from16 v19, v4

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v4, 0x5dc

    invoke-direct {v0, v10, v5, v4, v1}, Lcom/sma/smartv3/model/MySportRecordModel;->getItemTime(IIILjava/util/List;)Lkotlin/Triple;

    move-result-object v6

    invoke-virtual {v0, v3, v5}, Lcom/sma/smartv3/model/MySportRecordModel;->getSwimmingDistanceUnit(II)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-direct {v0, v7}, Lcom/sma/smartv3/model/MySportRecordModel;->getTime(I)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v6}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v17

    invoke-virtual {v6}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v14

    invoke-virtual {v0, v5, v3}, Lcom/sma/smartv3/model/MySportRecordModel;->metreToRulerNumber(II)F

    move-result v5

    float-to-int v5, v5

    new-instance v11, Lcom/sma/smartv3/model/MySportRecordList;

    move/from16 v19, v5

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v5, 0xed8

    invoke-direct {v0, v10, v4, v5, v1}, Lcom/sma/smartv3/model/MySportRecordModel;->getItemTime(IIILjava/util/List;)Lkotlin/Triple;

    move-result-object v6

    invoke-virtual {v0, v3, v4}, Lcom/sma/smartv3/model/MySportRecordModel;->getSwimmingDistanceUnit(II)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-direct {v0, v7}, Lcom/sma/smartv3/model/MySportRecordModel;->getTime(I)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v6}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v17

    invoke-virtual {v6}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v14

    invoke-virtual {v0, v4, v3}, Lcom/sma/smartv3/model/MySportRecordModel;->metreToRulerNumber(II)F

    move-result v4

    float-to-int v4, v4

    new-instance v11, Lcom/sma/smartv3/model/MySportRecordList;

    move/from16 v19, v4

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v4, 0xfa0

    invoke-direct {v0, v10, v5, v4, v1}, Lcom/sma/smartv3/model/MySportRecordModel;->getItemTime(IIILjava/util/List;)Lkotlin/Triple;

    move-result-object v6

    invoke-virtual {v0, v3, v5}, Lcom/sma/smartv3/model/MySportRecordModel;->getSwimmingDistanceUnit(II)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-direct {v0, v7}, Lcom/sma/smartv3/model/MySportRecordModel;->getTime(I)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v6}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v17

    invoke-virtual {v6}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v14

    invoke-virtual {v0, v5, v3}, Lcom/sma/smartv3/model/MySportRecordModel;->metreToRulerNumber(II)F

    move-result v5

    float-to-int v5, v5

    new-instance v11, Lcom/sma/smartv3/model/MySportRecordList;

    move/from16 v19, v5

    invoke-direct/range {v11 .. v21}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v5, 0x2710

    invoke-direct {v0, v10, v4, v5, v1}, Lcom/sma/smartv3/model/MySportRecordModel;->getItemTime(IIILjava/util/List;)Lkotlin/Triple;

    move-result-object v1

    invoke-virtual {v0, v3, v4}, Lcom/sma/smartv3/model/MySportRecordModel;->getSwimmingDistanceUnit(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-direct {v0, v5}, Lcom/sma/smartv3/model/MySportRecordModel;->getTime(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v11

    invoke-virtual {v1}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v0, v4, v3}, Lcom/sma/smartv3/model/MySportRecordModel;->metreToRulerNumber(II)F

    move-result v1

    float-to-int v13, v1

    new-instance v5, Lcom/sma/smartv3/model/MySportRecordList;

    const/16 v14, 0x8

    const/4 v15, 0x0

    const v6, 0x7f081769

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v15}, Lcom/sma/smartv3/model/MySportRecordList;-><init>(ILjava/lang/String;IILjava/lang/String;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private final getTime(I)Ljava/lang/String;
    .locals 3

    if-eqz p1, :cond_0

    div-int/lit16 v0, p1, 0xe10

    rem-int/lit16 p1, p1, 0xe10

    div-int/lit8 p1, p1, 0x3c

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const v2, 0x7f14039f

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const v2, 0x7f1403a1

    invoke-virtual {v1, v2, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const p1, 0x7f1403bc

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final metreToRulerQCY(II)Ljava/lang/String;
    .locals 2

    if-nez p2, :cond_0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    int-to-double p1, p1

    const-wide v0, 0x400a3d70a3d70a3dL    # 3.28

    mul-double/2addr p1, v0

    double-to-int p1, p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final getMiDistanceUnit(I)I
    .locals 0

    if-nez p1, :cond_0

    const p1, 0x7f140f47

    return p1

    :cond_0
    const p1, 0x7f141620

    return p1
.end method

.method public final getMySportRecordList(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p2    # Ljava/util/List;
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
            "(I",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Workout;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/MySportRecordList;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lcom/sma/smartv3/model/MySportRecordModel$getMySportRecordList$2;-><init>(ILjava/util/List;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1, p3}, Lcom/android/mltcode/paycertificationapi/I100X1;->I0IIOi(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getSportDistanceUnit(II)Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const/4 v0, 0x4

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p2, p1, v2, v0, v1}, Lcom/android/mltcode/paycertificationapi/cp5;->X1ii(IIZILjava/lang/Object;)F

    move-result p2

    if-nez p1, :cond_0

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const p2, 0x7f140bc2

    invoke-static {p2, p1}, Lcom/blankj/utilcode/util/StringUtils;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const p2, 0x7f140bc4

    invoke-static {p2, p1}, Lcom/blankj/utilcode/util/StringUtils;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final getSwimmingDistanceUnit(II)Ljava/lang/String;
    .locals 0
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-direct {p0, p2, p1}, Lcom/sma/smartv3/model/MySportRecordModel;->metreToRulerQCY(II)Ljava/lang/String;

    move-result-object p2

    if-nez p1, :cond_0

    const p1, 0x7f140bc3

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/StringUtils;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    const p1, 0x7f140bbf

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/StringUtils;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final metreToRulerNumber(II)F
    .locals 0

    if-nez p2, :cond_0

    int-to-float p1, p1

    return p1

    :cond_0
    int-to-float p1, p1

    const p2, 0x4051eb85    # 3.28f

    mul-float/2addr p1, p2

    return p1
.end method
