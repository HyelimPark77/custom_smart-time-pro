.class public final Lcom/sma/smartv3/initializer/BleInitializer$OII;
.super Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/initializer/BleInitializer;->onReadSleep(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadSleep$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1869#2,2:2522\n1869#2:2524\n1563#2:2525\n1634#2,3:2526\n1870#2:2529\n1563#2:2530\n1634#2,3:2531\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadSleep$1\n*L\n699#1:2522,2\n712#1:2524\n721#1:2525\n721#1:2526,3\n712#1:2529\n730#1:2530\n730#1:2531,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBleInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadSleep$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2521:1\n1869#2,2:2522\n1869#2:2524\n1563#2:2525\n1634#2,3:2526\n1870#2:2529\n1563#2:2530\n1634#2,3:2531\n*S KotlinDebug\n*F\n+ 1 BleInitializer.kt\ncom/sma/smartv3/initializer/BleInitializer$onReadSleep$1\n*L\n699#1:2522,2\n712#1:2524\n721#1:2525\n721#1:2526,3\n712#1:2529\n730#1:2530\n730#1:2531,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic I1:J

.field public final synthetic IO:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSleep;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic X11iII1O1:Ljava/text/SimpleDateFormat;

.field public final synthetic XXX11i:I

.field public final synthetic iX1O1:Ljava/util/Date;


# direct methods
.method public constructor <init>(Ljava/util/List;JLjava/util/Date;Ljava/text/SimpleDateFormat;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSleep;",
            ">;J",
            "Ljava/util/Date;",
            "Ljava/text/SimpleDateFormat;",
            "I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/initializer/BleInitializer$OII;->IO:Ljava/util/List;

    iput-wide p2, p0, Lcom/sma/smartv3/initializer/BleInitializer$OII;->I1:J

    iput-object p4, p0, Lcom/sma/smartv3/initializer/BleInitializer$OII;->iX1O1:Ljava/util/Date;

    iput-object p5, p0, Lcom/sma/smartv3/initializer/BleInitializer$OII;->X11iII1O1:Ljava/text/SimpleDateFormat;

    iput p6, p0, Lcom/sma/smartv3/initializer/BleInitializer$OII;->XXX11i:I

    invoke-direct {p0}, Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic doInBackground()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/initializer/BleInitializer$OII;->doInBackground()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public doInBackground()Ljava/lang/Void;
    .locals 17

    move-object/from16 v1, p0

    .line 2
    iget-object v0, v1, Lcom/sma/smartv3/initializer/BleInitializer$OII;->IO:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/szabh/smable3/entity/BleSleep;

    .line 4
    sget-object v3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "onReadSleep -> "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    goto :goto_0

    .line 5
    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->ii110()Z

    move-result v2

    const/4 v3, 0x2

    const-string v4, "format(...)"

    const/16 v5, 0xa

    const/4 v6, 0x0

    if-nez v2, :cond_3

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iXiii()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_2

    .line 6
    :cond_1
    sget-object v0, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-static {v0}, Lcom/sma/smartv3/initializer/BleInitializer;->XOX0O0(Lcom/sma/smartv3/initializer/BleInitializer;)Lcom/sma/smartv3/db/dao/SleepDao;

    move-result-object v0

    iget-object v2, v1, Lcom/sma/smartv3/initializer/BleInitializer$OII;->IO:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    iget-wide v7, v1, Lcom/sma/smartv3/initializer/BleInitializer$OII;->I1:J

    iget-object v9, v1, Lcom/sma/smartv3/initializer/BleInitializer$OII;->iX1O1:Ljava/util/Date;

    iget-object v10, v1, Lcom/sma/smartv3/initializer/BleInitializer$OII;->X11iII1O1:Ljava/text/SimpleDateFormat;

    iget v11, v1, Lcom/sma/smartv3/initializer/BleInitializer$OII;->XXX11i:I

    .line 7
    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v12, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 9
    check-cast v5, Lcom/szabh/smable3/entity/BleSleep;

    .line 10
    new-instance v13, Lcom/sma/smartv3/db/entity/Sleep;

    invoke-direct {v13, v5, v7, v8}, Lcom/sma/smartv3/db/entity/Sleep;-><init>(Lcom/szabh/smable3/entity/BleSleep;J)V

    .line 11
    invoke-virtual {v13}, Lcom/sma/smartv3/db/entity/Sleep;->getMTime()J

    move-result-wide v14

    invoke-virtual {v9, v14, v15}, Ljava/util/Date;->setTime(J)V

    .line 12
    invoke-virtual {v10, v9}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v13, v5}, Lcom/sma/smartv3/db/entity/Sleep;->setMLocalTime(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v13, v11}, Lcom/sma/smartv3/db/entity/Sleep;->setMAlgorithmType(I)V

    .line 14
    invoke-interface {v12, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 15
    :cond_2
    invoke-interface {v0, v12}, Lcom/sma/smartv3/db/dao/SleepDao;->insert(Ljava/util/List;)[J

    goto/16 :goto_7

    .line 16
    :cond_3
    :goto_2
    :try_start_0
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OIX0iXi()Ljava/text/SimpleDateFormat;

    move-result-object v0

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".json"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 17
    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {v2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    .line 18
    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v2, v0}, Lcom/android/mltcode/paycertificationapi/uz0;->XO0O10(Lcom/android/mltcode/paycertificationapi/sz0;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 19
    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    iget-object v7, v1, Lcom/sma/smartv3/initializer/BleInitializer$OII;->IO:Ljava/util/List;

    invoke-virtual {v2, v7}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v7, "toJson(...)"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2, v6, v3, v6}, Lcom/android/mltcode/paycertificationapi/iI0OiO;->IO(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 21
    :goto_3
    sget-object v0, Lcom/szabh/smable3/entity/BleSleep;->Companion:Lcom/szabh/smable3/entity/BleSleep$Companion;

    iget-object v2, v1, Lcom/sma/smartv3/initializer/BleInitializer$OII;->IO:Ljava/util/List;

    invoke-virtual {v0, v2}, Lcom/szabh/smable3/entity/BleSleep$Companion;->getSleepAllDaySegments(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-wide v7, v1, Lcom/sma/smartv3/initializer/BleInitializer$OII;->I1:J

    iget-object v2, v1, Lcom/sma/smartv3/initializer/BleInitializer$OII;->iX1O1:Ljava/util/Date;

    iget-object v9, v1, Lcom/sma/smartv3/initializer/BleInitializer$OII;->X11iII1O1:Ljava/text/SimpleDateFormat;

    iget v10, v1, Lcom/sma/smartv3/initializer/BleInitializer$OII;->XXX11i:I

    .line 22
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/List;

    .line 23
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v12

    const/4 v13, 0x1

    if-le v12, v13, :cond_4

    .line 24
    sget-object v12, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-static {v12}, Lcom/sma/smartv3/initializer/BleInitializer;->XOX0O0(Lcom/sma/smartv3/initializer/BleInitializer;)Lcom/sma/smartv3/db/dao/SleepDao;

    move-result-object v12

    .line 25
    invoke-static {v11}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/BleSleep;->getMLocalTime()J

    move-result-wide v13

    .line 26
    invoke-static {v11}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/szabh/smable3/entity/BleSleep;

    move-object/from16 v16, v4

    invoke-virtual {v15}, Lcom/szabh/smable3/entity/BleSleep;->getMLocalTime()J

    move-result-wide v3

    .line 27
    invoke-interface {v12, v13, v14, v3, v4}, Lcom/sma/smartv3/db/dao/SleepDao;->deleteSleeps(JJ)V

    goto :goto_5

    :cond_4
    move-object/from16 v16, v4

    .line 28
    :goto_5
    sget-object v3, Lcom/sma/smartv3/initializer/BleInitializer;->IO:Lcom/sma/smartv3/initializer/BleInitializer;

    invoke-static {v3}, Lcom/sma/smartv3/initializer/BleInitializer;->XOX0O0(Lcom/sma/smartv3/initializer/BleInitializer;)Lcom/sma/smartv3/db/dao/SleepDao;

    move-result-object v3

    check-cast v11, Ljava/lang/Iterable;

    .line 29
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v11, v5}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v4, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_6
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_5

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 31
    check-cast v12, Lcom/szabh/smable3/entity/BleSleep;

    .line 32
    new-instance v13, Lcom/sma/smartv3/db/entity/Sleep;

    invoke-direct {v13, v12, v7, v8}, Lcom/sma/smartv3/db/entity/Sleep;-><init>(Lcom/szabh/smable3/entity/BleSleep;J)V

    .line 33
    invoke-virtual {v13}, Lcom/sma/smartv3/db/entity/Sleep;->getMTime()J

    move-result-wide v14

    invoke-virtual {v2, v14, v15}, Ljava/util/Date;->setTime(J)V

    .line 34
    invoke-virtual {v9, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v14, v16

    invoke-static {v12, v14}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v13, v12}, Lcom/sma/smartv3/db/entity/Sleep;->setMLocalTime(Ljava/lang/String;)V

    .line 35
    invoke-virtual {v13, v10}, Lcom/sma/smartv3/db/entity/Sleep;->setMAlgorithmType(I)V

    .line 36
    invoke-interface {v4, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_5
    move-object/from16 v14, v16

    .line 37
    invoke-interface {v3, v4}, Lcom/sma/smartv3/db/dao/SleepDao;->insert(Ljava/util/List;)[J

    move-object v4, v14

    const/4 v3, 0x2

    goto :goto_4

    .line 38
    :cond_6
    :goto_7
    const-string v0, "sleep_change"

    const/4 v2, 0x2

    invoke-static {v0, v6, v2, v6}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-object v6
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/initializer/BleInitializer$OII;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Void;)V
    .locals 0

    .line 1
    return-void
.end method
