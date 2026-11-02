.class public final Lcom/sma/smartv3/model/SportRecordDataKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSportRecordData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordData.kt\ncom/sma/smartv3/model/SportRecordDataKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1074:1\n1021#2,2:1075\n1021#2,2:1077\n1021#2,2:1079\n1563#2:1081\n1634#2,3:1082\n*S KotlinDebug\n*F\n+ 1 SportRecordData.kt\ncom/sma/smartv3/model/SportRecordDataKt\n*L\n171#1:1075,2\n222#1:1077,2\n264#1:1079,2\n1025#1:1081\n1025#1:1082,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSportRecordData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecordData.kt\ncom/sma/smartv3/model/SportRecordDataKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1074:1\n1021#2,2:1075\n1021#2,2:1077\n1021#2,2:1079\n1563#2:1081\n1634#2,3:1082\n*S KotlinDebug\n*F\n+ 1 SportRecordData.kt\ncom/sma/smartv3/model/SportRecordDataKt\n*L\n171#1:1075,2\n222#1:1077,2\n264#1:1079,2\n1025#1:1081\n1025#1:1082,3\n*E\n"
    }
.end annotation


# static fields
.field public static final ACTIVITY:I = 0x0

.field public static final PHONE_SPORT:I = 0x2

.field public static final WORKOUT:I = 0x1


# direct methods
.method public static final deleteSportRecord(Lcom/sma/smartv3/model/SportRecordData;)V
    .locals 9
    .param p0    # Lcom/sma/smartv3/model/SportRecordData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "sportRecordData"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "delete "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/SportRecordData;->getMSource()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->activityDao()Lcom/sma/smartv3/db/dao/ActivityDao;

    move-result-object v3

    invoke-virtual {p0}, Lcom/sma/smartv3/model/SportRecordData;->getMStartTime()J

    move-result-wide v4

    invoke-virtual {p0}, Lcom/sma/smartv3/model/SportRecordData;->getMEndTime()J

    move-result-wide v6

    invoke-virtual {p0}, Lcom/sma/smartv3/model/SportRecordData;->getMMode()I

    move-result v8

    invoke-interface/range {v3 .. v8}, Lcom/sma/smartv3/db/dao/ActivityDao;->getWorkoutListDESC(JJI)Ljava/util/List;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v0, v5}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v5, v2}, Lcom/sma/smartv3/db/entity/Activity;->setMIsSync(I)V

    invoke-virtual {v5, v1}, Lcom/sma/smartv3/db/entity/Activity;->setMIsDelete(I)V

    sget-object v5, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v3, p0}, Lcom/sma/smartv3/db/dao/ActivityDao;->update(Ljava/util/List;)I

    return-void

    :cond_1
    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->workoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/model/SportRecordData;->getMStartTime()J

    move-result-wide v3

    invoke-virtual {p0}, Lcom/sma/smartv3/model/SportRecordData;->getMEndTime()J

    move-result-wide v5

    invoke-interface {v0, v3, v4, v5, v6}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getWorkout(JJ)Lcom/sma/smartv3/db/entity/Workout;

    move-result-object p0

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/db/entity/Workout;->setMIsSync(I)V

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/db/entity/Workout;->setMIsDelete(I)V

    invoke-interface {v0, p0}, Lcom/sma/smartv3/db/dao/WorkoutDao;->update(Lcom/sma/smartv3/db/entity/Workout;)I

    return-void
.end method

.method public static final getActivityWorkoutList(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 12
    .param p0    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/SportRecordData;",
            ">;"
        }
    .end annotation

    const-string v0, "workoutActivity"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, -0x1

    const-wide/16 v2, 0x0

    :goto_0
    move v4, v1

    move-wide v5, v2

    move-wide v7, v5

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/sma/smartv3/db/entity/Activity;

    const/4 v10, 0x4

    if-gez v4, :cond_1

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Activity;->getMState()I

    move-result v11

    if-ne v11, v10, :cond_0

    :cond_1
    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Activity;->getMState()I

    move-result v11

    if-eqz v11, :cond_3

    if-eq v11, v10, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Activity;->getMMode()I

    move-result v4

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v5

    goto :goto_1

    :cond_3
    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Activity;->getMMode()I

    move-result v10

    if-ne v10, v4, :cond_4

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v10

    cmp-long v10, v5, v10

    if-lez v10, :cond_4

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v7

    goto :goto_1

    :cond_4
    move v4, v1

    :goto_1
    if-lez v4, :cond_0

    cmp-long v9, v7, v2

    if-lez v9, :cond_0

    new-instance v9, Lcom/sma/smartv3/model/SportRecordData;

    invoke-direct {v9}, Lcom/sma/smartv3/model/SportRecordData;-><init>()V

    invoke-virtual {v9, v7, v8}, Lcom/sma/smartv3/model/SportRecordData;->setMStartTime(J)V

    invoke-virtual {v9, v5, v6}, Lcom/sma/smartv3/model/SportRecordData;->setMEndTime(J)V

    invoke-virtual {v9, v4}, Lcom/sma/smartv3/model/SportRecordData;->setMMode(I)V

    const/4 v4, 0x0

    invoke-virtual {v9, v4}, Lcom/sma/smartv3/model/SportRecordData;->setMSource(I)V

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    return-object v0
.end method

.method public static final getGpsState(Lcom/sma/smartv3/model/SportRecordData;)I
    .locals 1
    .param p0    # Lcom/sma/smartv3/model/SportRecordData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "sportRecordData"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/SportRecordData;->getMIsLocationEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    const p0, 0x7f0812fa

    return p0

    :cond_0
    const p0, 0x7f0812a9

    return p0
.end method

.method public static final getSportRecordList(II)Ljava/util/ArrayList;
    .locals 9
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/SportRecordData;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    sget-object v1, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/AppDatabase;->activityDao()Lcom/sma/smartv3/db/dao/ActivityDao;

    move-result-object v2

    .line 3
    invoke-virtual {v1}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/AppDatabase;->workoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v1

    const/4 v3, 0x0

    .line 4
    invoke-interface {v2, v3, p0, p1}, Lcom/sma/smartv3/db/dao/ActivityDao;->getStateActivityList(III)Ljava/util/List;

    move-result-object v4

    .line 5
    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    if-nez p0, :cond_0

    .line 6
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {v4}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v5

    .line 8
    :goto_0
    invoke-static {v4}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v7

    invoke-interface {v2, v7, v8, v5, v6}, Lcom/sma/smartv3/db/dao/ActivityDao;->getListDESC(JJ)Ljava/util/List;

    move-result-object v2

    .line 9
    invoke-static {v2}, Lcom/sma/smartv3/model/SportRecordDataKt;->getActivityWorkoutList(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_1
    const/4 v2, 0x1

    if-nez p0, :cond_2

    move p0, v3

    goto :goto_1

    :cond_2
    add-int/2addr p0, v2

    .line 10
    :goto_1
    invoke-interface {v1, p0, p1, v3}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getListDESC(III)Ljava/util/List;

    move-result-object p0

    .line 11
    move-object p1, p0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    .line 12
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/db/entity/Workout;

    .line 13
    new-instance v1, Lcom/sma/smartv3/model/SportRecordData;

    invoke-direct {v1}, Lcom/sma/smartv3/model/SportRecordData;-><init>()V

    .line 14
    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lcom/sma/smartv3/model/SportRecordData;->setMStartTime(J)V

    .line 15
    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lcom/sma/smartv3/model/SportRecordData;->setMEndTime(J)V

    .line 16
    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/model/SportRecordData;->setMMode(I)V

    .line 17
    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMSource()I

    move-result v3

    if-ne v3, v2, :cond_3

    const/4 v3, 0x2

    goto :goto_3

    :cond_3
    move v3, v2

    :goto_3
    invoke-virtual {v1, v3}, Lcom/sma/smartv3/model/SportRecordData;->setMSource(I)V

    .line 18
    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMId()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/model/SportRecordData;->setMWorkoutId(I)V

    .line 19
    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/model/SportRecordData;->setMDistance(I)V

    .line 20
    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMPace()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/model/SportRecordData;->setMPace(I)V

    .line 21
    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMCalorie()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/model/SportRecordData;->setMCalorie(I)V

    .line 22
    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/model/SportRecordData;->setMDuration(I)V

    .line 23
    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMPlatform()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/model/SportRecordData;->setMPlatform(Ljava/lang/String;)V

    .line 24
    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMSpeed()I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/sma/smartv3/model/SportRecordData;->setMSpeed(I)V

    .line 25
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 26
    :cond_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p0

    if-le p0, v2, :cond_5

    new-instance p0, Lcom/sma/smartv3/model/SportRecordDataKt$getSportRecordList$$inlined$sortByDescending$1;

    invoke-direct {p0}, Lcom/sma/smartv3/model/SportRecordDataKt$getSportRecordList$$inlined$sortByDescending$1;-><init>()V

    invoke-static {v0, p0}, Lcom/android/mltcode/paycertificationapi/XiX0OOXI0;->XOXiX0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_5
    return-object v0
.end method

.method public static final getSportRecordList(JJI)Ljava/util/ArrayList;
    .locals 9
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJI)",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/SportRecordData;",
            ">;"
        }
    .end annotation

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    sget-object v1, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/AppDatabase;->activityDao()Lcom/sma/smartv3/db/dao/ActivityDao;

    move-result-object v2

    .line 29
    invoke-virtual {v1}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/AppDatabase;->workoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v3

    .line 30
    invoke-interface {v2, p0, p1, p2, p3}, Lcom/sma/smartv3/db/dao/ActivityDao;->getListDESC(JJ)Ljava/util/List;

    move-result-object v1

    .line 31
    invoke-static {v1}, Lcom/sma/smartv3/model/SportRecordDataKt;->getActivityWorkoutList(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    if-eqz p4, :cond_0

    const/16 v8, 0x74

    move-wide v4, p0

    move-wide v6, p2

    .line 32
    invoke-interface/range {v3 .. v8}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getListModeDESC(JJI)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-wide v4, p0

    move-wide v6, p2

    const/4 v8, 0x0

    .line 33
    invoke-interface/range {v3 .. v8}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getListDESC(JJI)Ljava/util/List;

    move-result-object p0

    .line 34
    :goto_0
    move-object p1, p0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    const/4 p2, 0x1

    if-nez p1, :cond_2

    .line 35
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/db/entity/Workout;

    .line 36
    new-instance p3, Lcom/sma/smartv3/model/SportRecordData;

    invoke-direct {p3}, Lcom/sma/smartv3/model/SportRecordData;-><init>()V

    .line 37
    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v1

    invoke-virtual {p3, v1, v2}, Lcom/sma/smartv3/model/SportRecordData;->setMStartTime(J)V

    .line 38
    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v1

    invoke-virtual {p3, v1, v2}, Lcom/sma/smartv3/model/SportRecordData;->setMEndTime(J)V

    .line 39
    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result p4

    invoke-virtual {p3, p4}, Lcom/sma/smartv3/model/SportRecordData;->setMMode(I)V

    .line 40
    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMSource()I

    move-result p4

    if-ne p4, p2, :cond_1

    const/4 p4, 0x2

    goto :goto_2

    :cond_1
    move p4, p2

    :goto_2
    invoke-virtual {p3, p4}, Lcom/sma/smartv3/model/SportRecordData;->setMSource(I)V

    .line 41
    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMId()I

    move-result p4

    invoke-virtual {p3, p4}, Lcom/sma/smartv3/model/SportRecordData;->setMWorkoutId(I)V

    .line 42
    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result p4

    invoke-virtual {p3, p4}, Lcom/sma/smartv3/model/SportRecordData;->setMDistance(I)V

    .line 43
    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMPace()I

    move-result p4

    invoke-virtual {p3, p4}, Lcom/sma/smartv3/model/SportRecordData;->setMPace(I)V

    .line 44
    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMCalorie()I

    move-result p4

    invoke-virtual {p3, p4}, Lcom/sma/smartv3/model/SportRecordData;->setMCalorie(I)V

    .line 45
    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/sma/smartv3/model/SportRecordData;->setMDuration(I)V

    .line 46
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 47
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p0

    if-le p0, p2, :cond_3

    new-instance p0, Lcom/sma/smartv3/model/SportRecordDataKt$getSportRecordList$$inlined$sortByDescending$2;

    invoke-direct {p0}, Lcom/sma/smartv3/model/SportRecordDataKt$getSportRecordList$$inlined$sortByDescending$2;-><init>()V

    invoke-static {v0, p0}, Lcom/android/mltcode/paycertificationapi/XiX0OOXI0;->XOXiX0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_3
    return-object v0
.end method

.method public static synthetic getSportRecordList$default(JJIILjava/lang/Object;)Ljava/util/ArrayList;
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/model/SportRecordDataKt;->getSportRecordList(JJI)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static final getSportRecordListByMode(III)Ljava/util/ArrayList;
    .locals 5
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III)",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/SportRecordData;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/AppDatabase;->workoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v1

    const/4 v2, 0x1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    add-int/2addr p0, v2

    :goto_0
    invoke-interface {v1, p0, p1, p2}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getListDESCByMode(III)Ljava/util/List;

    move-result-object p0

    move-object p1, p0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/db/entity/Workout;

    new-instance p2, Lcom/sma/smartv3/model/SportRecordData;

    invoke-direct {p2}, Lcom/sma/smartv3/model/SportRecordData;-><init>()V

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v3

    invoke-virtual {p2, v3, v4}, Lcom/sma/smartv3/model/SportRecordData;->setMStartTime(J)V

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v3

    invoke-virtual {p2, v3, v4}, Lcom/sma/smartv3/model/SportRecordData;->setMEndTime(J)V

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v1

    invoke-virtual {p2, v1}, Lcom/sma/smartv3/model/SportRecordData;->setMMode(I)V

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMSource()I

    move-result v1

    if-ne v1, v2, :cond_1

    const/4 v1, 0x2

    goto :goto_2

    :cond_1
    move v1, v2

    :goto_2
    invoke-virtual {p2, v1}, Lcom/sma/smartv3/model/SportRecordData;->setMSource(I)V

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMId()I

    move-result v1

    invoke-virtual {p2, v1}, Lcom/sma/smartv3/model/SportRecordData;->setMWorkoutId(I)V

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v1

    invoke-virtual {p2, v1}, Lcom/sma/smartv3/model/SportRecordData;->setMDistance(I)V

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMPace()I

    move-result v1

    invoke-virtual {p2, v1}, Lcom/sma/smartv3/model/SportRecordData;->setMPace(I)V

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMCalorie()I

    move-result v1

    invoke-virtual {p2, v1}, Lcom/sma/smartv3/model/SportRecordData;->setMCalorie(I)V

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result v1

    invoke-virtual {p2, v1}, Lcom/sma/smartv3/model/SportRecordData;->setMDuration(I)V

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMPlatform()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/sma/smartv3/model/SportRecordData;->setMPlatform(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p0

    if-le p0, v2, :cond_3

    new-instance p0, Lcom/sma/smartv3/model/SportRecordDataKt$getSportRecordListByMode$$inlined$sortByDescending$1;

    invoke-direct {p0}, Lcom/sma/smartv3/model/SportRecordDataKt$getSportRecordListByMode$$inlined$sortByDescending$1;-><init>()V

    invoke-static {v0, p0}, Lcom/android/mltcode/paycertificationapi/XiX0OOXI0;->XOXiX0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_3
    return-object v0
.end method

.method public static final getSportStartTime(Lcom/sma/smartv3/model/SportRecordData;)Ljava/lang/String;
    .locals 3
    .param p0    # Lcom/sma/smartv3/model/SportRecordData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "sportRecordData"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->i0X000X0O(ZZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/model/SportRecordData;->getMStartTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "format(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final getWorkoutImage(Landroid/content/Context;Lcom/sma/smartv3/model/SportRecordData;)I
    .locals 4
    .param p0    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/sma/smartv3/model/SportRecordData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mContext"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sportRecordData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0811ee

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/SportRecordData;->getMMode()I

    move-result p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ic_workout"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "drawable"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p1, v2, p0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p0, :cond_0

    return v0

    :cond_0
    return p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return v0
.end method

.method public static final getWorkoutName(Landroid/content/Context;Lcom/sma/smartv3/model/SportRecordData;)I
    .locals 6
    .param p0    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/sma/smartv3/model/SportRecordData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "string"

    const-string v1, "workout"

    const-string v2, "mContext"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "sportRecordData"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f14160b

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {p1}, Lcom/sma/smartv3/model/SportRecordData;->getMMode()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v0, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_0

    return v2

    :cond_0
    sget-object v4, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/q62;->Oii1I1I10()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {p1}, Lcom/sma/smartv3/model/SportRecordData;->getMMode()I

    move-result p1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "_2"

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v4, p1, v0, p0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    return p0

    :catch_0
    move-exception p0

    goto :goto_1

    :cond_2
    :goto_0
    return v3

    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return v2
.end method

.method public static final parseSportRecordItemCommonData(Landroid/content/Context;Lcom/sma/smartv3/model/AppUser;Lcom/sma/smartv3/model/SportRecordData;)Lcom/sma/smartv3/model/SportRecordItemCommonData;
    .locals 25
    .param p0    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/sma/smartv3/model/AppUser;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/model/SportRecordData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "context"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "userProfile"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "sportRecordData"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v4

    invoke-virtual {v4}, Lcom/sma/smartv3/db/AppDatabase;->heartRateDao()Lcom/sma/smartv3/db/dao/HeartRateDao;

    move-result-object v4

    invoke-virtual {v2}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/AppDatabase;->locationDao()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object v2

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SportRecordData;->getMSource()I

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SportRecordData;->getMStartTime()J

    move-result-wide v5

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SportRecordData;->getMEndTime()J

    move-result-wide v7

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v3

    invoke-static {v5, v6, v7, v8, v3}, Lcom/sma/smartv3/model/SportRecordDataKt;->sportRecordActivity(JJI)Lcom/sma/smartv3/model/RecordActivityData;

    move-result-object v3

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/sma/smartv3/model/SportRecordData;->getMStartTime()J

    move-result-wide v5

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SportRecordData;->getMEndTime()J

    move-result-wide v7

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v3

    invoke-static {v5, v6, v7, v8, v3}, Lcom/sma/smartv3/model/SportRecordDataKt;->sportRecordWorkout(JJI)Lcom/sma/smartv3/model/RecordActivityData;

    move-result-object v3

    :goto_0
    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMAvgBpm()I

    move-result v5

    const/4 v6, 0x2

    if-gtz v5, :cond_2

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SportRecordData;->getMSource()I

    move-result v5

    if-ne v5, v6, :cond_1

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMAvgBpm()I

    move-result v5

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMTimeList()Ljava/util/ArrayList;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/sma/smartv3/model/SportRecordDataKt;->sportRecordHeartRate(Lcom/sma/smartv3/db/dao/HeartRateDao;Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_2
    :goto_1
    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMAvgBpm()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    :goto_2
    invoke-virtual {v1}, Lcom/sma/smartv3/model/SportRecordData;->getMStartTime()J

    move-result-wide v7

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SportRecordData;->getMEndTime()J

    move-result-wide v9

    invoke-static {v2, v7, v8, v9, v10}, Lcom/sma/smartv3/model/SportRecordDataKt;->sportRecordLocation(Lcom/sma/smartv3/db/dao/LocationDao;JJ)Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/model/SportRecordData;->setMIsLocationEmpty(Z)V

    invoke-static {v1}, Lcom/sma/smartv3/model/SportRecordDataKt;->getGpsState(Lcom/sma/smartv3/model/SportRecordData;)I

    move-result v11

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SportRecordData;->getMMode()I

    move-result v2

    const/16 v5, 0xc

    const v7, 0x7f081372

    const v8, 0x7f0813a3

    if-eq v2, v5, :cond_5

    const/16 v5, 0x74

    if-eq v2, v5, :cond_4

    const v5, 0x7f081286

    const v9, 0x7f081253

    packed-switch v2, :pswitch_data_0

    new-instance v2, Lcom/sma/smartv3/model/SportRecordItemData;

    invoke-direct {v2, v4, v7}, Lcom/sma/smartv3/model/SportRecordItemData;-><init>(Ljava/lang/String;I)V

    new-instance v4, Lcom/sma/smartv3/model/SportRecordItemData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMSportTimeStr()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5, v8}, Lcom/sma/smartv3/model/SportRecordItemData;-><init>(Ljava/lang/String;I)V

    new-instance v5, Lcom/sma/smartv3/model/SportRecordItemData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMCalorieTotal()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v5, v3, v9}, Lcom/sma/smartv3/model/SportRecordItemData;-><init>(Ljava/lang/String;I)V

    filled-new-array {v2, v4, v5}, [Lcom/sma/smartv3/model/SportRecordItemData;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    goto/16 :goto_3

    :pswitch_0
    sget-object v2, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v2}, Lcom/szabh/smable3/component/BaseBleCache;->getMAGpsType()I

    move-result v2

    if-nez v2, :cond_3

    sget-object v2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->XOXOIX0Oi()Z

    move-result v2

    if-nez v2, :cond_3

    new-instance v2, Lcom/sma/smartv3/model/SportRecordItemData;

    invoke-direct {v2, v4, v7}, Lcom/sma/smartv3/model/SportRecordItemData;-><init>(Ljava/lang/String;I)V

    new-instance v4, Lcom/sma/smartv3/model/SportRecordItemData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMSportTimeStr()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5, v8}, Lcom/sma/smartv3/model/SportRecordItemData;-><init>(Ljava/lang/String;I)V

    new-instance v5, Lcom/sma/smartv3/model/SportRecordItemData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMCalorieTotal()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v5, v3, v9}, Lcom/sma/smartv3/model/SportRecordItemData;-><init>(Ljava/lang/String;I)V

    filled-new-array {v2, v4, v5}, [Lcom/sma/smartv3/model/SportRecordItemData;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    goto/16 :goto_3

    :cond_3
    new-instance v2, Lcom/sma/smartv3/model/SportRecordItemData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMSpeed()F

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v4

    const v7, 0x7f081366

    invoke-direct {v2, v4, v7}, Lcom/sma/smartv3/model/SportRecordItemData;-><init>(Ljava/lang/String;I)V

    new-instance v4, Lcom/sma/smartv3/model/SportRecordItemData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMSportTimeStr()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v4, v7, v8}, Lcom/sma/smartv3/model/SportRecordItemData;-><init>(Ljava/lang/String;I)V

    new-instance v7, Lcom/sma/smartv3/model/SportRecordItemData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMDistanceTotal()F

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v7, v3, v5}, Lcom/sma/smartv3/model/SportRecordItemData;-><init>(Ljava/lang/String;I)V

    filled-new-array {v2, v4, v7}, [Lcom/sma/smartv3/model/SportRecordItemData;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    goto :goto_3

    :pswitch_1
    new-instance v2, Lcom/sma/smartv3/model/SportRecordItemData;

    invoke-direct {v2, v4, v7}, Lcom/sma/smartv3/model/SportRecordItemData;-><init>(Ljava/lang/String;I)V

    new-instance v4, Lcom/sma/smartv3/model/SportRecordItemData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMSportTimeStr()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v4, v7, v8}, Lcom/sma/smartv3/model/SportRecordItemData;-><init>(Ljava/lang/String;I)V

    new-instance v7, Lcom/sma/smartv3/model/SportRecordItemData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMDistanceTotal()F

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v7, v3, v5}, Lcom/sma/smartv3/model/SportRecordItemData;-><init>(Ljava/lang/String;I)V

    filled-new-array {v2, v4, v7}, [Lcom/sma/smartv3/model/SportRecordItemData;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    goto :goto_3

    :cond_4
    new-instance v2, Lcom/sma/smartv3/model/SportRecordItemData;

    invoke-direct {v2, v4, v7}, Lcom/sma/smartv3/model/SportRecordItemData;-><init>(Ljava/lang/String;I)V

    new-instance v4, Lcom/sma/smartv3/model/SportRecordItemData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMSportTimeStr()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5, v8}, Lcom/sma/smartv3/model/SportRecordItemData;-><init>(Ljava/lang/String;I)V

    new-instance v5, Lcom/sma/smartv3/model/SportRecordItemData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMAvgStress()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const v7, 0x7f08130a

    invoke-direct {v5, v3, v7}, Lcom/sma/smartv3/model/SportRecordItemData;-><init>(Ljava/lang/String;I)V

    filled-new-array {v2, v4, v5}, [Lcom/sma/smartv3/model/SportRecordItemData;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    goto :goto_3

    :cond_5
    :pswitch_2
    new-instance v2, Lcom/sma/smartv3/model/SportRecordItemData;

    invoke-direct {v2, v4, v7}, Lcom/sma/smartv3/model/SportRecordItemData;-><init>(Ljava/lang/String;I)V

    new-instance v4, Lcom/sma/smartv3/model/SportRecordItemData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMSportTimeStr()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5, v8}, Lcom/sma/smartv3/model/SportRecordItemData;-><init>(Ljava/lang/String;I)V

    new-instance v5, Lcom/sma/smartv3/model/SportRecordItemData;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordActivityData;->getMStepTotal()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const v7, 0x7f08138b

    invoke-direct {v5, v3, v7}, Lcom/sma/smartv3/model/SportRecordItemData;-><init>(Ljava/lang/String;I)V

    filled-new-array {v2, v4, v5}, [Lcom/sma/smartv3/model/SportRecordItemData;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    :goto_3
    sget-object v3, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/q62;->OiXI1OiX0()Z

    move-result v3

    if-eqz v3, :cond_6

    check-cast v2, Ljava/lang/Iterable;

    const/4 v3, 0x1

    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IOI(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v2

    :goto_4
    move-object v12, v2

    move v13, v6

    goto :goto_5

    :cond_6
    const/4 v6, 0x3

    goto :goto_4

    :goto_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sportRecordData "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-static {v1}, Lcom/sma/smartv3/model/SportRecordDataKt;->getSportStartTime(Lcom/sma/smartv3/model/SportRecordData;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v0, v1}, Lcom/sma/smartv3/model/SportRecordDataKt;->getWorkoutImage(Landroid/content/Context;Lcom/sma/smartv3/model/SportRecordData;)I

    move-result v9

    invoke-static {v0, v1}, Lcom/sma/smartv3/model/SportRecordDataKt;->getWorkoutName(Landroid/content/Context;Lcom/sma/smartv3/model/SportRecordData;)I

    move-result v10

    new-instance v7, Lcom/sma/smartv3/model/SportRecordItemCommonData;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SportRecordData;->getMDistance()I

    move-result v15

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SportRecordData;->getMPace()I

    move-result v16

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SportRecordData;->getMCalorie()I

    move-result v17

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SportRecordData;->getMDuration()I

    move-result v18

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SportRecordData;->getMMode()I

    move-result v19

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SportRecordData;->getMPlatform()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SportRecordData;->getMSpeed()I

    move-result v22

    const/16 v23, 0x2000

    const/16 v24, 0x0

    const-string v14, ""

    const/16 v21, 0x0

    invoke-direct/range {v7 .. v24}, Lcom/sma/smartv3/model/SportRecordItemCommonData;-><init>(Ljava/lang/String;IIILjava/util/List;ILjava/lang/String;IIIIILjava/lang/String;FIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final sportRecordActivity(JJI)Lcom/sma/smartv3/model/RecordActivityData;
    .locals 24
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-wide/from16 v0, p0

    move-wide/from16 v2, p2

    move/from16 v4, p4

    sget-object v5, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/db/AppDatabase;->activityDao()Lcom/sma/smartv3/db/dao/ActivityDao;

    move-result-object v5

    invoke-interface {v5, v0, v1, v2, v3}, Lcom/sma/smartv3/db/dao/ActivityDao;->getListDESC(JJ)Ljava/util/List;

    move-result-object v5

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    move-object v7, v5

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    const/4 v8, -0x1

    const-wide/16 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    :goto_0
    if-ge v12, v7, :cond_b

    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Lcom/sma/smartv3/db/entity/Activity;

    const/4 v11, 0x4

    if-gez v8, :cond_1

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMState()I

    move-result v0

    if-ne v0, v11, :cond_0

    goto :goto_2

    :cond_0
    move-object/from16 v21, v5

    :goto_1
    move/from16 v22, v7

    goto/16 :goto_4

    :cond_1
    :goto_2
    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMLocalTime()Ljava/lang/String;

    move-result-object v0

    const-string v1, "00:00:00"

    const/4 v11, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v11, v2}, Lcom/android/mltcode/paycertificationapi/oe5;->O0Ii(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    add-int v14, v14, v17

    add-int v15, v15, v18

    add-int v16, v16, v19

    :cond_2
    move/from16 v0, v16

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMLocalTime()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v21, v5

    const-string v5, "23:59:00"

    invoke-static {v1, v5, v3, v11, v2}, Lcom/android/mltcode/paycertificationapi/oe5;->O0Ii(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v17

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMCalorie()I

    move-result v18

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v19

    :cond_3
    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMState()I

    move-result v1

    const-string v2, " "

    if-eqz v1, :cond_a

    if-eq v1, v11, :cond_7

    const/4 v3, 0x3

    if-eq v1, v3, :cond_6

    const/4 v3, 0x4

    if-eq v1, v3, :cond_5

    :cond_4
    move/from16 v22, v7

    goto/16 :goto_3

    :cond_5
    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v1

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMCalorie()I

    move-result v3

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v5

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "END "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMMode()I

    move-result v1

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v2

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v17

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMCalorie()I

    move-result v18

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v19

    new-instance v5, Lcom/sma/smartv3/model/RecordTimeList;

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v8

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMState()I

    move-result v10

    invoke-direct {v5, v8, v9, v10}, Lcom/sma/smartv3/model/RecordTimeList;-><init>(JI)V

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v16, v0

    move v8, v1

    move-wide v9, v2

    goto/16 :goto_1

    :cond_6
    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMMode()I

    move-result v1

    if-ne v1, v8, :cond_4

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v1

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMCalorie()I

    move-result v3

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v5

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "RESUME "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "  "

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v1

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v3

    sub-int v17, v17, v3

    add-int v14, v14, v17

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMCalorie()I

    move-result v3

    sub-int v18, v18, v3

    add-int v15, v15, v18

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v3

    sub-int v19, v19, v3

    add-int v16, v0, v19

    new-instance v0, Lcom/sma/smartv3/model/RecordTimeList;

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v9

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMState()I

    move-result v3

    invoke-direct {v0, v9, v10, v3}, Lcom/sma/smartv3/model/RecordTimeList;-><init>(JI)V

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-wide v9, v1

    move/from16 v22, v7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    goto/16 :goto_4

    :cond_7
    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMMode()I

    move-result v1

    if-ne v1, v8, :cond_4

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v22

    cmp-long v1, v9, v22

    if-lez v1, :cond_4

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v1

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMCalorie()I

    move-result v3

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v5

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v22, v7

    const-string v7, "PAUSE "

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v1

    sub-long v1, v9, v1

    long-to-int v1, v1

    add-int/2addr v13, v1

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v17

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMCalorie()I

    move-result v18

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v19

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_8

    invoke-static {v6}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/model/RecordTimeList;

    invoke-virtual {v1}, Lcom/sma/smartv3/model/RecordTimeList;->getMState()I

    move-result v1

    const/4 v3, 0x4

    if-ne v1, v3, :cond_8

    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    :cond_8
    new-instance v1, Lcom/sma/smartv3/model/RecordTimeList;

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v2

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMState()I

    move-result v5

    invoke-direct {v1, v2, v3, v5}, Lcom/sma/smartv3/model/RecordTimeList;-><init>(JI)V

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9
    :goto_3
    move/from16 v16, v0

    goto :goto_4

    :cond_a
    move/from16 v22, v7

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMMode()I

    move-result v1

    if-ne v1, v8, :cond_9

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v1

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMCalorie()I

    move-result v3

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "BEGIN "

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v1

    sub-int v1, v17, v1

    add-int/2addr v14, v1

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMCalorie()I

    move-result v1

    sub-int v1, v18, v1

    add-int/2addr v15, v1

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v1

    sub-int v1, v19, v1

    add-int v16, v0, v1

    new-instance v0, Lcom/sma/smartv3/model/RecordTimeList;

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v1

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/db/entity/Activity;->getMState()I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/sma/smartv3/model/RecordTimeList;-><init>(JI)V

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_4
    add-int/lit8 v12, v12, 0x1

    move-wide/from16 v0, p0

    move-wide/from16 v2, p2

    move-object/from16 v5, v21

    move/from16 v7, v22

    goto/16 :goto_0

    :cond_b
    const/4 v2, 0x1

    invoke-static {v6}, Lcom/android/mltcode/paycertificationapi/O1OOiOO1i;->I11X11OX(Ljava/util/List;)V

    sub-long v0, p2, p0

    int-to-long v7, v13

    sub-long/2addr v0, v7

    long-to-int v0, v0

    div-int/lit16 v1, v0, 0x3e8

    if-gez v14, :cond_c

    const/4 v14, 0x0

    :cond_c
    if-gez v15, :cond_d

    const/4 v15, 0x0

    :cond_d
    if-gez v16, :cond_e

    const/4 v3, 0x0

    goto :goto_5

    :cond_e
    move/from16 v3, v16

    :goto_5
    const/16 v5, 0x2710

    if-ge v13, v5, :cond_f

    const/4 v13, 0x0

    :cond_f
    new-instance v7, Lcom/sma/smartv3/model/RecordActivityData;

    invoke-direct {v7}, Lcom/sma/smartv3/model/RecordActivityData;-><init>()V

    invoke-virtual {v7, v14}, Lcom/sma/smartv3/model/RecordActivityData;->setMStepTotal(I)V

    div-int/2addr v15, v5

    invoke-virtual {v7, v15}, Lcom/sma/smartv3/model/RecordActivityData;->setMCalorieTotal(I)V

    div-int/2addr v3, v5

    const/4 v5, 0x0

    invoke-static {v3, v4, v5}, Lcom/android/mltcode/paycertificationapi/cp5;->XXI(IIZ)F

    move-result v5

    invoke-virtual {v7, v5}, Lcom/sma/smartv3/model/RecordActivityData;->setMDistanceTotal(F)V

    invoke-static {v13}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iXiX011(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Lcom/sma/smartv3/model/RecordActivityData;->setMPauseTimeTotal(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iXiX011(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/sma/smartv3/model/RecordActivityData;->setMSportTimeStr(Ljava/lang/String;)V

    invoke-virtual {v7}, Lcom/sma/smartv3/model/RecordActivityData;->getMTimeList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-static {v3, v1, v4}, Lcom/android/mltcode/paycertificationapi/cp5;->XO0X10iO(III)F

    move-result v0

    invoke-virtual {v7, v0}, Lcom/sma/smartv3/model/RecordActivityData;->setMSpeed(F)V

    mul-int/lit8 v14, v14, 0x3c

    if-gtz v1, :cond_10

    move v11, v2

    goto :goto_6

    :cond_10
    move v11, v1

    :goto_6
    div-int/2addr v14, v11

    invoke-virtual {v7, v14}, Lcom/sma/smartv3/model/RecordActivityData;->setMSpm(I)V

    invoke-static {v3, v4}, Lcom/android/mltcode/paycertificationapi/cp5;->O10IXXX0X(II)F

    move-result v0

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/cp5;->XXO(FI)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/sma/smartv3/model/RecordActivityData;->setMPace(I)V

    return-object v7
.end method

.method public static final sportRecordActivityDetailSpeed(Ljava/util/ArrayList;II)Lcom/sma/smartv3/model/RecordDetailSpeedData;
    .locals 22
    .param p0    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/RecordTimeList;",
            ">;II)",
            "Lcom/sma/smartv3/model/RecordDetailSpeedData;"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "mTimeList"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/db/AppDatabase;->activityDao()Lcom/sma/smartv3/db/dao/ActivityDao;

    move-result-object v3

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "sportRecordActivityDetailSpeed "

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/lit8 v10, v4, -0x2

    const/16 v11, 0x3e8

    const/4 v4, 0x0

    if-ltz v10, :cond_5

    move v13, v4

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    :goto_0
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/model/RecordTimeList;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/RecordTimeList;->getMTime()J

    move-result-wide v4

    add-int/lit8 v6, v14, 0x1

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sma/smartv3/model/RecordTimeList;

    invoke-virtual {v7}, Lcom/sma/smartv3/model/RecordTimeList;->getMTime()J

    move-result-wide v7

    move/from16 v17, v6

    move-wide v6, v7

    move/from16 v8, p1

    invoke-interface/range {v3 .. v8}, Lcom/sma/smartv3/db/dao/ActivityDao;->getWorkoutListDESC(JJI)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_3

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sma/smartv3/db/entity/Activity;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    if-ge v6, v8, :cond_2

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v8

    add-int/lit8 v12, v6, 0x1

    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual/range {v18 .. v18}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v18

    sub-int v8, v8, v18

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v18

    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v20

    sub-long v18, v18, v20

    move-object v12, v3

    move-object v7, v4

    int-to-long v3, v11

    div-long v3, v18, v3

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    div-int/lit16 v4, v8, 0x2710

    invoke-static {v4, v3, v1}, Lcom/android/mltcode/paycertificationapi/cp5;->XO0X10iO(III)F

    move-result v4

    cmpg-float v18, v13, v4

    if-gez v18, :cond_0

    move v13, v4

    :cond_0
    add-int v4, v16, v8

    add-int/2addr v15, v3

    div-int/lit16 v3, v4, 0x2710

    invoke-static {v3, v1}, Lcom/android/mltcode/paycertificationapi/cp5;->O10IXXX0X(II)F

    move-result v3

    move-object/from16 v18, v12

    float-to-double v11, v3

    const-wide/high16 v19, 0x3ff0000000000000L    # 1.0

    cmpl-double v11, v11, v19

    if-ltz v11, :cond_1

    invoke-static {v3, v15}, Lcom/android/mltcode/paycertificationapi/cp5;->XXO(FI)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v15, 0x0

    const/16 v16, 0x0

    goto :goto_2

    :cond_1
    move/from16 v16, v4

    goto :goto_2

    :cond_2
    move-object/from16 v18, v3

    move-object v7, v4

    :goto_2
    add-int/lit8 v6, v6, 0x1

    move-object v4, v7

    move-object/from16 v3, v18

    const/16 v11, 0x3e8

    goto :goto_1

    :cond_3
    move-object/from16 v18, v3

    if-eq v14, v10, :cond_4

    move/from16 v14, v17

    move-object/from16 v3, v18

    const/16 v11, 0x3e8

    goto/16 :goto_0

    :cond_4
    move v4, v13

    move/from16 v12, v16

    goto :goto_3

    :cond_5
    const/4 v12, 0x0

    const/4 v15, 0x0

    :goto_3
    if-lez v12, :cond_6

    const/16 v8, 0x3e8

    div-int/2addr v12, v8

    invoke-static {v12, v1}, Lcom/android/mltcode/paycertificationapi/cp5;->O10IXXX0X(II)F

    move-result v0

    invoke-static {v0, v15}, Lcom/android/mltcode/paycertificationapi/cp5;->XXO(FI)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    new-instance v0, Lcom/sma/smartv3/model/RecordDetailSpeedData;

    invoke-direct {v0}, Lcom/sma/smartv3/model/RecordDetailSpeedData;-><init>()V

    invoke-virtual {v0, v4}, Lcom/sma/smartv3/model/RecordDetailSpeedData;->setMFastestSpeed(F)V

    invoke-virtual {v0}, Lcom/sma/smartv3/model/RecordDetailSpeedData;->getMPaceList()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public static final sportRecordHeartRate(Lcom/sma/smartv3/db/dao/HeartRateDao;Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 9
    .param p0    # Lcom/sma/smartv3/db/dao/HeartRateDao;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/db/dao/HeartRateDao;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/RecordTimeList;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "mHeartRateDao"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mTimeList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    const/4 v1, 0x0

    move v2, v1

    if-ltz v0, :cond_3

    move v3, v2

    :goto_0
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/model/RecordTimeList;

    invoke-virtual {v4}, Lcom/sma/smartv3/model/RecordTimeList;->getMTime()J

    move-result-wide v4

    add-int/lit8 v6, v1, 0x1

    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sma/smartv3/model/RecordTimeList;

    invoke-virtual {v7}, Lcom/sma/smartv3/model/RecordTimeList;->getMTime()J

    move-result-wide v7

    invoke-interface {p0, v4, v5, v7, v8}, Lcom/sma/smartv3/db/dao/HeartRateDao;->getHeartRates(JJ)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sma/smartv3/db/entity/HeartRate;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v7

    if-lez v7, :cond_0

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v5

    add-int/2addr v2, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    if-eq v1, v0, :cond_2

    move v1, v6

    goto :goto_0

    :cond_2
    move v1, v3

    :cond_3
    if-nez v1, :cond_4

    const-string p0, "0"

    return-object p0

    :cond_4
    div-int/2addr v2, v1

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final sportRecordHeartRateDetail(Lcom/sma/smartv3/db/dao/HeartRateDao;Ljava/util/ArrayList;)Lcom/sma/smartv3/model/RecordDetailHeartRateData;
    .locals 27
    .param p0    # Lcom/sma/smartv3/db/dao/HeartRateDao;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/db/dao/HeartRateDao;",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/RecordTimeList;",
            ">;)",
            "Lcom/sma/smartv3/model/RecordDetailHeartRateData;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "mHeartRateDao"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "mTimeList"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x2

    const-wide/16 v5, 0x0

    if-ltz v3, :cond_b

    move-wide v7, v5

    move-wide v9, v7

    move-wide v11, v9

    move-wide v13, v11

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    :goto_0
    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Lcom/sma/smartv3/model/RecordTimeList;

    move-wide/from16 v21, v5

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/model/RecordTimeList;->getMTime()J

    move-result-wide v4

    add-int/lit8 v6, v15, 0x1

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Lcom/sma/smartv3/model/RecordTimeList;

    move-wide/from16 v23, v7

    move v8, v6

    invoke-virtual/range {v20 .. v20}, Lcom/sma/smartv3/model/RecordTimeList;->getMTime()J

    move-result-wide v6

    invoke-interface {v0, v4, v5, v6, v7}, Lcom/sma/smartv3/db/dao/HeartRateDao;->getHeartRates(JJ)Ljava/util/List;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    move/from16 v6, v18

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v5, :cond_9

    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v0, v18

    check-cast v0, Lcom/sma/smartv3/db/entity/HeartRate;

    if-nez v19, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v19

    :cond_0
    move/from16 v1, v19

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v18

    if-lez v18, :cond_8

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v18

    add-int v16, v16, v18

    move-object/from16 v18, v0

    invoke-virtual/range {v18 .. v18}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v0

    if-ge v6, v0, :cond_1

    invoke-virtual/range {v18 .. v18}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v6

    :cond_1
    invoke-virtual/range {v18 .. v18}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v0

    if-le v1, v0, :cond_2

    invoke-virtual/range {v18 .. v18}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v1

    :cond_2
    add-int/lit8 v17, v17, 0x1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v7, v0, :cond_7

    add-int/lit8 v0, v7, 0x1

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/entity/HeartRate;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/HeartRate;->getMTime()J

    move-result-wide v19

    invoke-virtual/range {v18 .. v18}, Lcom/sma/smartv3/db/entity/HeartRate;->getMTime()J

    move-result-wide v25

    sub-long v19, v19, v25

    invoke-virtual/range {v18 .. v18}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v0

    move/from16 v25, v1

    const/16 v1, 0x8c

    if-lt v0, v1, :cond_3

    add-long v21, v21, v19

    :goto_2
    move/from16 v19, v25

    goto :goto_3

    :cond_3
    invoke-virtual/range {v18 .. v18}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v0

    const/16 v1, 0x72

    if-lt v0, v1, :cond_4

    add-long v23, v23, v19

    goto :goto_2

    :cond_4
    invoke-virtual/range {v18 .. v18}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v0

    const/16 v1, 0x5a

    if-lt v0, v1, :cond_5

    add-long v9, v9, v19

    goto :goto_2

    :cond_5
    invoke-virtual/range {v18 .. v18}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v0

    const/16 v1, 0x50

    if-lt v0, v1, :cond_6

    add-long v11, v11, v19

    goto :goto_2

    :cond_6
    add-long v13, v13, v19

    goto :goto_2

    :cond_7
    move/from16 v25, v1

    goto :goto_2

    :cond_8
    move/from16 v19, v1

    :goto_3
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    goto/16 :goto_1

    :cond_9
    if-eq v15, v3, :cond_a

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v18, v6

    move v15, v8

    move-wide/from16 v5, v21

    move-wide/from16 v7, v23

    goto/16 :goto_0

    :cond_a
    move v0, v6

    move/from16 v1, v19

    move-wide/from16 v5, v21

    goto :goto_4

    :cond_b
    move-wide v9, v5

    move-wide v11, v9

    move-wide v13, v11

    move-wide/from16 v23, v13

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    :goto_4
    if-nez v17, :cond_c

    const/4 v4, 0x0

    goto :goto_5

    :cond_c
    div-int v4, v16, v17

    :goto_5
    new-instance v3, Lcom/sma/smartv3/model/RecordDetailHeartRateData;

    invoke-direct {v3}, Lcom/sma/smartv3/model/RecordDetailHeartRateData;-><init>()V

    invoke-virtual {v3, v4}, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->setMAvgHR(I)V

    invoke-virtual {v3, v0}, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->setMMaxHR(I)V

    invoke-virtual {v3, v1}, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->setMMinHR(I)V

    invoke-virtual {v3}, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->getMHeartRateList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    const/16 v0, 0x3e8

    int-to-long v0, v0

    div-long/2addr v5, v0

    const/16 v2, 0x3c

    int-to-long v7, v2

    div-long/2addr v5, v7

    invoke-virtual {v3, v5, v6}, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->setMStrenuous(J)V

    div-long v23, v23, v0

    div-long v4, v23, v7

    invoke-virtual {v3, v4, v5}, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->setMAnaerobic(J)V

    div-long/2addr v9, v0

    div-long/2addr v9, v7

    invoke-virtual {v3, v9, v10}, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->setMAerobic(J)V

    div-long/2addr v11, v0

    div-long/2addr v11, v7

    invoke-virtual {v3, v11, v12}, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->setMFatBurning(J)V

    div-long/2addr v13, v0

    div-long/2addr v13, v7

    invoke-virtual {v3, v13, v14}, Lcom/sma/smartv3/model/RecordDetailHeartRateData;->setMWarmUp(J)V

    return-object v3
.end method

.method public static final sportRecordLocation(Lcom/sma/smartv3/db/dao/LocationDao;JJ)Z
    .locals 1
    .param p0    # Lcom/sma/smartv3/db/dao/LocationDao;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mLocationDao"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/db/dao/LocationDao;->getLocation(JJ)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    const/4 p1, 0x2

    if-ge p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final sportRecordWorkout(JJI)Lcom/sma/smartv3/model/RecordActivityData;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->workoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v0

    invoke-interface {v0, p0, p1, p2, p3}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getWorkout(JJ)Lcom/sma/smartv3/db/entity/Workout;

    move-result-object p0

    new-instance p1, Lcom/sma/smartv3/model/RecordTimeList;

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide p2

    const/4 v0, 0x0

    invoke-direct {p1, p2, p3, v0}, Lcom/sma/smartv3/model/RecordTimeList;-><init>(JI)V

    new-instance p2, Lcom/sma/smartv3/model/RecordTimeList;

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v1

    invoke-direct {p2, v1, v2, v0}, Lcom/sma/smartv3/model/RecordTimeList;-><init>(JI)V

    filled-new-array {p1, p2}, [Lcom/sma/smartv3/model/RecordTimeList;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iIiiO([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide p2

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v1

    sub-long/2addr p2, v1

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result v1

    mul-int/lit16 v1, v1, 0x3e8

    int-to-long v1, v1

    sub-long/2addr p2, v1

    long-to-int p2, p2

    const/16 p3, 0x2710

    if-ge p2, p3, :cond_0

    move p2, v0

    :cond_0
    new-instance p3, Lcom/sma/smartv3/model/RecordActivityData;

    invoke-direct {p3}, Lcom/sma/smartv3/model/RecordActivityData;-><init>()V

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result v1

    mul-int/lit16 v1, v1, 0x3e8

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iXiX011(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Lcom/sma/smartv3/model/RecordActivityData;->setMSportTimeStr(Ljava/lang/String;)V

    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iXiX011(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Lcom/sma/smartv3/model/RecordActivityData;->setMPauseTimeTotal(Ljava/lang/String;)V

    invoke-virtual {p3}, Lcom/sma/smartv3/model/RecordActivityData;->getMTimeList()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMAltitude()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/sma/smartv3/model/RecordActivityData;->setMAltitude(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMSpm()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/sma/smartv3/model/RecordActivityData;->setMSpm(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMStep()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/sma/smartv3/model/RecordActivityData;->setMStepTotal(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result p1

    const/4 p2, 0x4

    const/4 v1, 0x0

    invoke-static {p1, p4, v0, p2, v1}, Lcom/android/mltcode/paycertificationapi/cp5;->X1ii(IIZILjava/lang/Object;)F

    move-result p1

    invoke-virtual {p3, p1}, Lcom/sma/smartv3/model/RecordActivityData;->setMDistanceTotal(F)V

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMCalorie()I

    move-result p1

    div-int/lit16 p1, p1, 0x3e8

    invoke-virtual {p3, p1}, Lcom/sma/smartv3/model/RecordActivityData;->setMCalorieTotal(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMSpeed()I

    move-result p1

    int-to-double p1, p1

    const-wide v0, 0x408f400000000000L    # 1000.0

    div-double/2addr p1, v0

    invoke-static {p1, p2, p4}, Lcom/android/mltcode/paycertificationapi/cp5;->i11I(DI)F

    move-result p1

    invoke-virtual {p3, p1}, Lcom/sma/smartv3/model/RecordActivityData;->setMSpeed(F)V

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMPace()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/sma/smartv3/model/RecordActivityData;->setMPace(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMAvgBpm()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/sma/smartv3/model/RecordActivityData;->setMAvgBpm(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxBpm()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/sma/smartv3/model/RecordActivityData;->setMMaxBpm(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMMinBpm()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/sma/smartv3/model/RecordActivityData;->setMMinBpm(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxSpm()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/sma/smartv3/model/RecordActivityData;->setMMaxSpm(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMMinSpm()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/sma/smartv3/model/RecordActivityData;->setMMinSpm(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxPace()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/sma/smartv3/model/RecordActivityData;->setMMaxPace(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMMinPace()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/sma/smartv3/model/RecordActivityData;->setMMinPace(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMMinStress()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/sma/smartv3/model/RecordActivityData;->setMMinStress(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxStress()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/sma/smartv3/model/RecordActivityData;->setMMaxStress(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMAvgStress()I

    move-result p1

    invoke-virtual {p3, p1}, Lcom/sma/smartv3/model/RecordActivityData;->setMAvgStress(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMPlatform()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/sma/smartv3/model/RecordActivityData;->setMPlatform(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/Workout;->getMAvgSpeed()F

    move-result p0

    invoke-virtual {p3, p0}, Lcom/sma/smartv3/model/RecordActivityData;->setMAvgSpeed(F)V

    return-object p3
.end method

.method public static final sportRecordWorkoutDetailSpeed(Ljava/util/ArrayList;IILjava/util/ArrayList;)Lcom/sma/smartv3/model/RecordDetailSpeedData;
    .locals 20
    .param p0    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/util/ArrayList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/RecordTimeList;",
            ">;II",
            "Ljava/util/ArrayList<",
            "Lcom/sma/smartv3/model/CustomLatLng;",
            ">;)",
            "Lcom/sma/smartv3/model/RecordDetailSpeedData;"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "mTimeList"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "locationList"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "test mTimeList.size =  "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_0
    const-string v12, " "

    const/4 v13, 0x1

    if-ge v7, v4, :cond_3

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    const-string v15, "get(...)"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v14, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v15

    sub-int/2addr v15, v13

    if-ge v7, v15, :cond_2

    new-instance v13, Lcom/baidu/mapapi/model/LatLng;

    invoke-virtual {v14}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v5

    move-object/from16 v17, v12

    invoke-virtual {v14}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v11

    invoke-direct {v13, v5, v6, v11, v12}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    new-instance v5, Lcom/baidu/mapapi/model/LatLng;

    add-int/lit8 v6, v7, 0x1

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v11}, Lcom/sma/smartv3/model/CustomLatLng;->getLatitude()D

    move-result-wide v11

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lcom/sma/smartv3/model/CustomLatLng;

    move-object/from16 v19, v14

    invoke-virtual/range {v18 .. v18}, Lcom/sma/smartv3/model/CustomLatLng;->getLongitude()D

    move-result-wide v14

    invoke-direct {v5, v11, v12, v14, v15}, Lcom/baidu/mapapi/model/LatLng;-><init>(DD)V

    invoke-static {v13, v5}, Lcom/baidu/mapapi/utils/DistanceUtil;->getDistance(Lcom/baidu/mapapi/model/LatLng;Lcom/baidu/mapapi/model/LatLng;)D

    move-result-wide v11

    double-to-int v5, v11

    invoke-virtual/range {v19 .. v19}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v11

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sma/smartv3/model/CustomLatLng;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/CustomLatLng;->getTime()J

    move-result-wide v13

    sub-long/2addr v11, v13

    const/16 v6, 0x3e8

    int-to-long v13, v6

    div-long/2addr v11, v13

    long-to-int v6, v11

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    invoke-static {v5, v6, v1}, Lcom/android/mltcode/paycertificationapi/cp5;->XO0X10iO(III)F

    move-result v11

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "test "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-object/from16 v14, v17

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v15, "  "

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    cmpg-float v12, v10, v11

    if-gez v12, :cond_0

    const/high16 v12, 0x43160000    # 150.0f

    cmpg-float v12, v11, v12

    if-gez v12, :cond_0

    move v10, v11

    :cond_0
    add-int/2addr v8, v5

    add-int/2addr v9, v6

    invoke-static {v8, v1}, Lcom/android/mltcode/paycertificationapi/cp5;->O10IXXX0X(II)F

    move-result v5

    float-to-double v11, v5

    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    cmpl-double v11, v11, v15

    if-ltz v11, :cond_2

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, " distanceToKmNumber "

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-static {v5, v9}, Lcom/android/mltcode/paycertificationapi/cp5;->XXO(FI)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v8, 0x3f800000    # 1.0f

    cmpl-float v5, v5, v8

    if-lez v5, :cond_1

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x2

    if-ne v7, v5, :cond_1

    const/4 v5, 0x0

    invoke-static {v5, v6}, Lcom/android/mltcode/paycertificationapi/cp5;->XXO(FI)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    const/4 v8, 0x0

    const/4 v9, 0x0

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    :cond_3
    move-object v14, v12

    if-lez v8, :cond_5

    invoke-static {v8, v1}, Lcom/android/mltcode/paycertificationapi/cp5;->O10IXXX0X(II)F

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "last km "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-nez v2, :cond_4

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-le v2, v13, :cond_4

    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/RecordTimeList;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/RecordTimeList;->getMTime()J

    move-result-wide v4

    const/4 v15, 0x0

    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/RecordTimeList;

    invoke-virtual {v0}, Lcom/sma/smartv3/model/RecordTimeList;->getMTime()J

    move-result-wide v6

    sub-long/2addr v4, v6

    const/16 v6, 0x3e8

    int-to-long v6, v6

    div-long/2addr v4, v6

    long-to-int v0, v4

    invoke-static {v1, v0}, Lcom/android/mltcode/paycertificationapi/cp5;->XXO(FI)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-static {v1, v9}, Lcom/android/mltcode/paycertificationapi/cp5;->XXO(FI)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    :goto_3
    new-instance v0, Lcom/sma/smartv3/model/RecordDetailSpeedData;

    invoke-direct {v0}, Lcom/sma/smartv3/model/RecordDetailSpeedData;-><init>()V

    invoke-virtual {v0, v10}, Lcom/sma/smartv3/model/RecordDetailSpeedData;->setMFastestSpeed(F)V

    invoke-virtual {v0}, Lcom/sma/smartv3/model/RecordDetailSpeedData;->getMPaceList()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method
