.class public final Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHykyUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyUtils.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,606:1\n1878#2,3:607\n1573#2:610\n1604#2,4:611\n1869#2,2:615\n1573#2:617\n1604#2,4:618\n1869#2,2:622\n1573#2:624\n1604#2,4:625\n1869#2:629\n1869#2,2:630\n1870#2:632\n*S KotlinDebug\n*F\n+ 1 HykyUtils.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyUtils\n*L\n155#1:607,3\n192#1:610\n192#1:611,4\n350#1:615,2\n360#1:617\n360#1:618,4\n432#1:622,2\n443#1:624\n443#1:625,4\n497#1:629\n518#1:630,2\n497#1:632\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHykyUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyUtils.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,606:1\n1878#2,3:607\n1573#2:610\n1604#2,4:611\n1869#2,2:615\n1573#2:617\n1604#2,4:618\n1869#2,2:622\n1573#2:624\n1604#2,4:625\n1869#2:629\n1869#2,2:630\n1870#2:632\n*S KotlinDebug\n*F\n+ 1 HykyUtils.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyUtils\n*L\n155#1:607,3\n192#1:610\n192#1:611,4\n350#1:615,2\n360#1:617\n360#1:618,4\n432#1:622,2\n443#1:624\n443#1:625,4\n497#1:629\n518#1:630,2\n497#1:632\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final mActivityDao$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final mHeartRateDao$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final mLocationDao$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final mSportDataDao$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->INSTANCE:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O1X11I;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/O1X11I;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->mLocationDao$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0XIIXII;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/O0XIIXII;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->mHeartRateDao$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ii0iIX10;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/ii0iIX10;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->mSportDataDao$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1X0OiOX;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/i1X0OiOX;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->mActivityDao$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1()Lcom/sma/smartv3/db/dao/LocationDao;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->mLocationDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic XIi00iiXO()Lcom/sma/smartv3/db/dao/ActivityDao;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->mActivityDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/ActivityDao;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic XO0O10()Lcom/sma/smartv3/db/dao/SportDataDao;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->mSportDataDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/SportDataDao;

    move-result-object v0

    return-object v0
.end method

.method private final getAvg(FFF)F
    .locals 4

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    if-lez v1, :cond_0

    move v1, p1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, p1}, Lcom/android/mltcode/paycertificationapi/rc2;->I0IIOi(FF)Lkotlin/ranges/OpenEndRange;

    move-result-object v2

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-interface {v2, v3}, Lkotlin/ranges/OpenEndRange;->contains(Ljava/lang/Comparable;)Z

    move-result v2

    if-eqz v2, :cond_1

    return p3

    :cond_1
    cmpl-float p3, p2, v0

    if-lez p3, :cond_2

    cmpg-float p1, p1, p2

    if-gez p1, :cond_2

    return p2

    :cond_2
    return v1
.end method

.method public static synthetic getDeviceID$default(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getDeviceMac(Z)Ljava/lang/String;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getDeviceID(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDeviceMac$default(Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;ZILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getDeviceMac(Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final getMActivityDao()Lcom/sma/smartv3/db/dao/ActivityDao;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->mActivityDao$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/dao/ActivityDao;

    return-object v0
.end method

.method private final getMHeartRateDao()Lcom/sma/smartv3/db/dao/HeartRateDao;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->mHeartRateDao$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/dao/HeartRateDao;

    return-object v0
.end method

.method private final getMLocationDao()Lcom/sma/smartv3/db/dao/LocationDao;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->mLocationDao$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/dao/LocationDao;

    return-object v0
.end method

.method private final getMSportDataDao()Lcom/sma/smartv3/db/dao/SportDataDao;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->mSportDataDao$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/dao/SportDataDao;

    return-object v0
.end method

.method private final getRandom(FF)F
    .locals 4

    const/4 v0, 0x0

    cmpg-float v1, p2, v0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    cmpg-float v1, p1, v0

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const v1, 0x461c4000    # 10000.0f

    cmpg-float v1, p2, v1

    if-gez v1, :cond_2

    add-float v1, p2, p1

    const/4 v2, 0x2

    int-to-float v2, v2

    div-float/2addr v1, v2

    sub-float/2addr p2, p1

    const/4 p1, 0x3

    int-to-float p1, p1

    div-float/2addr p2, p1

    :try_start_0
    sget-object p1, Lkotlin/random/Random;->Default:Lkotlin/random/Random$Default;

    sub-float v2, v1, p2

    const/4 v3, 0x1

    int-to-float v3, v3

    sub-float/2addr v2, v3

    float-to-int v2, v2

    add-float/2addr v1, p2

    add-float/2addr v1, v3

    float-to-int p2, v1

    invoke-virtual {p1, v2, p2}, Lkotlin/random/Random$Default;->nextInt(II)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    int-to-float p1, p1

    return p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_0
    return v0
.end method

.method private final getSportDataList(Lcom/sma/smartv3/db/entity/Workout;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/db/entity/Workout;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Location;",
            ">;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/SportData;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v1, p3

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static/range {p3 .. p3}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v2

    invoke-virtual/range {p1 .. p1}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v4

    const v6, 0xea60

    int-to-long v8, v6

    add-long/2addr v4, v8

    const-wide/32 v6, 0xea60

    invoke-static/range {v2 .. v7}, Lkotlin/internal/ProgressionUtilKt;->XO0O10(JJJ)J

    move-result-wide v4

    cmp-long v6, v2, v4

    if-gtz v6, :cond_6

    const/4 v6, 0x0

    :goto_1
    move-object/from16 v7, p3

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/sma/smartv3/db/entity/Activity;

    const-wide/16 v11, 0x1

    add-long/2addr v11, v2

    add-long v13, v2, v8

    invoke-virtual {v10}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v15

    cmp-long v17, v11, v15

    if-gtz v17, :cond_4

    cmp-long v15, v15, v13

    if-gtz v15, :cond_4

    if-eqz v6, :cond_2

    invoke-virtual {v10}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v15

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v1, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v16

    sub-int v15, v15, v16

    invoke-virtual {v10}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v16

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v18

    move-wide/from16 v20, v4

    sub-long v4, v16, v18

    long-to-int v4, v4

    div-int/lit16 v4, v4, 0x3e8

    invoke-virtual {v10}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v5

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v1

    sub-int/2addr v5, v1

    div-int/lit16 v5, v5, 0x2710

    new-instance v22, Lcom/sma/smartv3/db/entity/SportData;

    const/16 v39, 0x7fff

    const/16 v40, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-direct/range {v22 .. v40}, Lcom/sma/smartv3/db/entity/SportData;-><init>(IJLjava/lang/String;IIIIIIIIIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v22

    invoke-virtual {v1, v15}, Lcom/sma/smartv3/db/entity/SportData;->setMStep(I)V

    invoke-virtual {v1, v2, v3}, Lcom/sma/smartv3/db/entity/SportData;->setMTime(J)V

    invoke-virtual {v1, v5}, Lcom/sma/smartv3/db/entity/SportData;->setMDistance(I)V

    move-wide v15, v2

    invoke-virtual {v10}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v2

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XO0O10()Ljava/text/SimpleDateFormat;

    move-result-object v5

    invoke-static {v2, v3, v5}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "millis2String(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/db/entity/SportData;->setMLocalTime(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Lcom/sma/smartv3/db/entity/SportData;->setMDuration(I)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/o65;->OXO1:Lcom/android/mltcode/paycertificationapi/o65;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/SportData;->getMStep()I

    move-result v3

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/SportData;->getMDuration()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Lcom/android/mltcode/paycertificationapi/o65;->IO(II)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/db/entity/SportData;->setMSpm(I)V

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/SportData;->getMDuration()I

    move-result v3

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/SportData;->getMDistance()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Lcom/android/mltcode/paycertificationapi/o65;->XIi00iiXO(II)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/db/entity/SportData;->setMPace(I)V

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/SportData;->getMDistance()I

    move-result v3

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/SportData;->getMDuration()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Lcom/android/mltcode/paycertificationapi/o65;->iO(II)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/db/entity/SportData;->setMSpeed(I)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/db/entity/Location;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Location;->getMTime()J

    move-result-wide v4

    cmp-long v17, v11, v4

    if-gtz v17, :cond_1

    cmp-long v4, v4, v13

    if-gtz v4, :cond_1

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Location;->getMAltitude()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/db/entity/SportData;->setMAltitude(I)V

    goto :goto_3

    :cond_2
    move-wide v15, v2

    move-wide/from16 v20, v4

    :cond_3
    add-int/lit8 v6, v6, 0x1

    move-object v1, v10

    goto :goto_4

    :cond_4
    move-wide v15, v2

    move-wide/from16 v20, v4

    :goto_4
    move-wide v2, v15

    move-wide/from16 v4, v20

    goto/16 :goto_2

    :cond_5
    move-wide v15, v2

    move-wide/from16 v20, v4

    cmp-long v2, v15, v20

    if-eqz v2, :cond_6

    const-wide/32 v2, 0xea60

    add-long/2addr v2, v15

    move-wide/from16 v4, v20

    goto/16 :goto_1

    :cond_6
    return-object v0
.end method

.method public static synthetic iO()Lcom/sma/smartv3/db/dao/HeartRateDao;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->mHeartRateDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/HeartRateDao;

    move-result-object v0

    return-object v0
.end method

.method private static final mActivityDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/ActivityDao;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->activityDao()Lcom/sma/smartv3/db/dao/ActivityDao;

    move-result-object v0

    return-object v0
.end method

.method private static final mHeartRateDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/HeartRateDao;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->heartRateDao()Lcom/sma/smartv3/db/dao/HeartRateDao;

    move-result-object v0

    return-object v0
.end method

.method private static final mLocationDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/LocationDao;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->locationDao()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object v0

    return-object v0
.end method

.method private static final mSportDataDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/SportDataDao;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->sportDataDao()Lcom/sma/smartv3/db/dao/SportDataDao;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final analyseSleepToStatus(Ljava/util/List;)Ljava/util/List;
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
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "analyseSleep"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    if-ge v2, v3, :cond_6

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/szabh/smable3/entity/BleSleep;

    if-nez v2, :cond_1

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v5

    div-int/lit8 v5, v5, 0x3c

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v5

    div-int/lit8 v5, v5, 0x3c

    add-int/2addr v5, v4

    :goto_0
    add-int/lit8 v2, v2, 0x1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v6}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v6

    div-int/lit8 v6, v6, 0x3c

    if-gt v5, v6, :cond_0

    :goto_1
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v7

    if-eq v7, v4, :cond_4

    const/4 v8, 0x2

    if-eq v7, v8, :cond_5

    const/4 v8, 0x3

    if-eq v7, v8, :cond_2

    const/16 v8, 0x9

    if-eq v7, v8, :cond_3

    :cond_2
    move v8, v1

    goto :goto_2

    :cond_3
    move v8, v4

    goto :goto_2

    :cond_4
    const/4 v8, 0x4

    :cond_5
    :goto_2
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq v5, v6, :cond_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_6
    return-object v0
.end method

.method public final dateFormatToHyky(Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "/"

    const-string v3, "-"

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getDeviceCode()Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    sget-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->Companion:Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager$Companion;->getInstance()Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyManager;->getMDeviceCode()Lcom/sma/smartv3/network/GetSNCodeHYKY$Response;

    move-result-object v0

    return-object v0
.end method

.method public final getDeviceID(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    const-string v0, "deviceMac"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HEALTH-592044-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getDeviceMac(Z)Ljava/lang/String;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    if-eqz p1, :cond_0

    sget-object p1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleAddress()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {p1}, Lcom/szabh/smable3/component/BaseBleCache;->getMBleAddress()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, ":"

    const-string v2, ""

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getHrData(Lcom/sma/smartv3/db/entity/Workout;Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;)Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;
    .locals 16
    .param p1    # Lcom/sma/smartv3/db/entity/Workout;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    move-object/from16 v0, p2

    const-string v1, "workout"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "sportData"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    invoke-direct/range {p0 .. p0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getMHeartRateDao()Lcom/sma/smartv3/db/dao/HeartRateDao;

    move-result-object v3

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v4

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v6

    invoke-interface {v3, v4, v5, v6, v7}, Lcom/sma/smartv3/db/dao/HeartRateDao;->getHeartRates(JJ)Ljava/util/List;

    move-result-object v3

    sget-object v4, Lcom/android/mltcode/paycertificationapi/o65;->OXO1:Lcom/android/mltcode/paycertificationapi/o65;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Lcom/android/mltcode/paycertificationapi/o65;->OIX0iXi(J)J

    move-result-wide v7

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Lcom/android/mltcode/paycertificationapi/o65;->OIX0iXi(J)J

    move-result-wide v4

    const v6, 0xea60

    int-to-long v9, v6

    add-long/2addr v9, v4

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    const-wide/32 v11, 0xea60

    invoke-static/range {v7 .. v12}, Lkotlin/internal/ProgressionUtilKt;->XO0O10(JJJ)J

    move-result-wide v5

    cmp-long v9, v7, v5

    if-gtz v9, :cond_0

    :goto_0
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    new-instance v10, Lcom/android/mltcode/paycertificationapi/nr0;

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lcom/android/mltcode/paycertificationapi/nr0;-><init>(IILjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v4, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    cmp-long v9, v7, v5

    if-eqz v9, :cond_0

    const-wide/32 v9, 0xea60

    add-long/2addr v7, v9

    goto :goto_0

    :catch_0
    move-object/from16 v14, p0

    goto/16 :goto_5

    :cond_0
    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v5, 0x0

    move v6, v5

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v9, v6, 0x1

    if-gez v6, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_1
    check-cast v7, Lcom/sma/smartv3/db/entity/HeartRate;

    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->longValue()J

    move-result-wide v11

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/android/mltcode/paycertificationapi/nr0;

    sget-object v13, Lcom/android/mltcode/paycertificationapi/o65;->OXO1:Lcom/android/mltcode/paycertificationapi/o65;

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/HeartRate;->getMTime()J

    move-result-wide v14

    invoke-virtual {v13, v14, v15}, Lcom/android/mltcode/paycertificationapi/o65;->OIX0iXi(J)J

    move-result-wide v13

    cmp-long v11, v13, v11

    if-gtz v11, :cond_2

    invoke-virtual {v10}, Lcom/android/mltcode/paycertificationapi/nr0;->I0IIOi()I

    move-result v6

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v7

    add-int/2addr v6, v7

    invoke-virtual {v10, v6}, Lcom/android/mltcode/paycertificationapi/nr0;->OIX0iXi(I)V

    invoke-virtual {v10}, Lcom/android/mltcode/paycertificationapi/nr0;->IiI10X()I

    move-result v6

    add-int/2addr v6, v8

    invoke-virtual {v10, v6}, Lcom/android/mltcode/paycertificationapi/nr0;->OIi0(I)V

    :cond_3
    move v6, v9

    goto :goto_1

    :cond_4
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/16 v6, 0x64

    const/4 v7, 0x0

    move v9, v5

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/android/mltcode/paycertificationapi/nr0;

    invoke-virtual {v10}, Lcom/android/mltcode/paycertificationapi/nr0;->IiI10X()I

    move-result v11

    const/high16 v12, 0x3f800000    # 1.0f

    if-eqz v11, :cond_7

    invoke-virtual {v10}, Lcom/android/mltcode/paycertificationapi/nr0;->I0IIOi()I

    move-result v11

    if-eqz v11, :cond_7

    invoke-virtual {v10}, Lcom/android/mltcode/paycertificationapi/nr0;->I0IIOi()I

    move-result v11

    invoke-virtual {v10}, Lcom/android/mltcode/paycertificationapi/nr0;->IiI10X()I

    move-result v10

    div-int/2addr v11, v10

    int-to-float v10, v11

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMMinBpm()I

    move-result v11

    int-to-float v11, v11

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxBpm()I

    move-result v13
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    int-to-float v13, v13

    move-object/from16 v14, p0

    :try_start_1
    invoke-direct {v14, v10, v11, v13}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getAvg(FFF)F

    move-result v10

    float-to-int v10, v10

    new-instance v11, Lcom/github/mikephil/charting/data/Entry;

    int-to-float v13, v10

    invoke-direct {v11, v7, v13}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-interface {v3, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-ge v9, v10, :cond_5

    move v9, v10

    :cond_5
    if-gt v8, v10, :cond_6

    if-ge v10, v6, :cond_6

    move v6, v10

    :cond_6
    :goto_3
    add-float/2addr v7, v12

    goto :goto_2

    :cond_7
    move-object/from16 v14, p0

    goto :goto_3

    :cond_8
    move-object/from16 v14, p0

    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v6, v5, 0x1

    if-gez v5, :cond_9

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_9
    check-cast v4, Lcom/github/mikephil/charting/data/Entry;

    new-instance v7, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Hr;

    mul-int/lit8 v5, v5, 0x3c

    invoke-virtual {v4}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result v4

    float-to-int v4, v4

    invoke-direct {v7, v5, v4}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Hr;-><init>(II)V

    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v5, v6

    goto :goto_4

    :cond_a
    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :goto_5
    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->setSportDataType(I)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->setSportOverView(Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->setHrList(Ljava/util/List;)V

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_b

    return-object v2

    :cond_b
    return-object v0
.end method

.method public final getLocationData(Lcom/sma/smartv3/db/entity/Workout;Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;)Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;
    .locals 16
    .param p1    # Lcom/sma/smartv3/db/entity/Workout;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    move-object/from16 v0, p2

    const-string v1, ","

    const-string v2, "workout"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "sportData"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    invoke-direct/range {p0 .. p0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getMLocationDao()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object v4

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v5

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v7

    invoke-interface {v4, v5, v6, v7, v8}, Lcom/sma/smartv3/db/dao/LocationDao;->getLocation(JJ)Ljava/util/List;

    move-result-object v4

    sget-object v5, Lcom/android/mltcode/paycertificationapi/o65;->OXO1:Lcom/android/mltcode/paycertificationapi/o65;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lcom/android/mltcode/paycertificationapi/o65;->OIX0iXi(J)J

    move-result-wide v8

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lcom/android/mltcode/paycertificationapi/o65;->OIX0iXi(J)J

    move-result-wide v5

    const v3, 0xea60

    int-to-long v10, v3

    add-long/2addr v10, v5

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    const-wide/32 v12, 0xea60

    invoke-static/range {v8 .. v13}, Lkotlin/internal/ProgressionUtilKt;->XO0O10(JJJ)J

    move-result-wide v5

    cmp-long v7, v8, v5

    if-gtz v7, :cond_0

    :goto_0
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    new-instance v10, Lcom/android/mltcode/paycertificationapi/nr0;

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lcom/android/mltcode/paycertificationapi/nr0;-><init>(IILjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v7, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    cmp-long v7, v8, v5

    if-eqz v7, :cond_0

    const-wide/32 v10, 0xea60

    add-long/2addr v8, v10

    goto :goto_0

    :cond_0
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sma/smartv3/db/entity/Location;

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/android/mltcode/paycertificationapi/nr0;

    sget-object v10, Lcom/android/mltcode/paycertificationapi/o65;->OXO1:Lcom/android/mltcode/paycertificationapi/o65;

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Location;->getMTime()J

    move-result-wide v11

    invoke-virtual {v10, v11, v12}, Lcom/android/mltcode/paycertificationapi/o65;->OIX0iXi(J)J

    move-result-wide v10

    cmp-long v8, v10, v8

    if-gtz v8, :cond_2

    invoke-virtual {v7}, Lcom/android/mltcode/paycertificationapi/nr0;->I0IIOi()I

    move-result v6

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Location;->getMAltitude()I

    move-result v8

    add-int/2addr v6, v8

    invoke-virtual {v7, v6}, Lcom/android/mltcode/paycertificationapi/nr0;->OIX0iXi(I)V

    invoke-virtual {v7}, Lcom/android/mltcode/paycertificationapi/nr0;->IiI10X()I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v7, v6}, Lcom/android/mltcode/paycertificationapi/nr0;->OIi0(I)V

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Location;->getMLongitude()F

    move-result v6

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Location;->getMLatitude()F

    move-result v5

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Lcom/android/mltcode/paycertificationapi/nr0;->IO(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v5, v4

    move v4, v3

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/android/mltcode/paycertificationapi/nr0;

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/nr0;->IiI10X()I

    move-result v7

    const/high16 v8, 0x3f800000    # 1.0f

    if-eqz v7, :cond_6

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/nr0;->I0IIOi()I

    move-result v7

    if-eqz v7, :cond_6

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/nr0;->I0IIOi()I

    move-result v7

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/nr0;->IiI10X()I

    move-result v9

    div-int/2addr v7, v9

    new-instance v9, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Pos;

    const/16 v10, 0x3c

    int-to-float v10, v10

    mul-float/2addr v10, v5

    float-to-int v10, v10

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/nr0;->XOO0ii0()Ljava/lang/Object;

    move-result-object v6

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v9, v10, v6}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Pos;-><init>(ILjava/lang/String;)V

    invoke-interface {v2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-ge v3, v7, :cond_4

    move v3, v7

    :cond_4
    if-eqz v4, :cond_5

    if-le v4, v7, :cond_6

    :cond_5
    move v4, v7

    :cond_6
    add-float/2addr v5, v8

    goto :goto_2

    :catch_0
    :cond_7
    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->setSportDataType(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->setSportOverView(Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;)V

    const-string v3, "BD09"

    invoke-virtual {v0, v3}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->setPosType(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->setPosList(Ljava/util/List;)V

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_8

    return-object v1

    :cond_8
    return-object v0
.end method

.method public final getPaceData(Lcom/sma/smartv3/db/entity/Workout;Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;)Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;
    .locals 20
    .param p1    # Lcom/sma/smartv3/db/entity/Workout;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "workout"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "sportData"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x0

    :try_start_0
    invoke-direct {v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getMSportDataDao()Lcom/sma/smartv3/db/dao/SportDataDao;

    move-result-object v5

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v6

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v8

    invoke-interface {v5, v6, v7, v8, v9}, Lcom/sma/smartv3/db/dao/SportDataDao;->getSportDataASC(JJ)Ljava/util/List;

    move-result-object v5

    invoke-direct {v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getMLocationDao()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object v6

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v7

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v9

    invoke-interface {v6, v7, v8, v9, v10}, Lcom/sma/smartv3/db/dao/LocationDao;->getLocation(JJ)Ljava/util/List;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    const/16 v8, 0xa

    const/4 v9, 0x0

    if-nez v7, :cond_0

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v7

    if-ne v7, v8, :cond_0

    const/4 v5, 0x2

    invoke-static {v6, v9, v5, v4}, Lcom/android/mltcode/paycertificationapi/cp5;->OII(Ljava/util/List;IILjava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v5

    :cond_0
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    sget-object v7, Lcom/android/mltcode/paycertificationapi/o65;->OXO1:Lcom/android/mltcode/paycertificationapi/o65;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v10

    invoke-virtual {v7, v10, v11}, Lcom/android/mltcode/paycertificationapi/o65;->OIX0iXi(J)J

    move-result-wide v12

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v10

    invoke-virtual {v7, v10, v11}, Lcom/android/mltcode/paycertificationapi/o65;->OIX0iXi(J)J

    move-result-wide v10

    const v7, 0xea60

    int-to-long v14, v7

    add-long/2addr v14, v10

    const-wide/32 v16, 0xea60

    invoke-static/range {v12 .. v17}, Lkotlin/internal/ProgressionUtilKt;->XO0O10(JJJ)J

    move-result-wide v10

    cmp-long v7, v12, v10

    if-gtz v7, :cond_1

    :goto_0
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    new-instance v14, Lcom/android/mltcode/paycertificationapi/nr0;

    const/16 v18, 0x4

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v19}, Lcom/android/mltcode/paycertificationapi/nr0;-><init>(IILjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v6, v7, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    cmp-long v7, v12, v10

    if-eqz v7, :cond_1

    const-wide/32 v14, 0xea60

    add-long/2addr v12, v14

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxPace()I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMMinPace()I

    move-result v3

    int-to-float v3, v3

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    const/high16 v11, 0x3f800000    # 1.0f

    cmpg-float v12, v11, v7

    const v13, 0x453b8000    # 3000.0f

    const/4 v14, 0x0

    if-gtz v12, :cond_2

    cmpg-float v12, v7, v13

    if-gtz v12, :cond_2

    goto :goto_1

    :cond_2
    move v7, v14

    :goto_1
    cmpg-float v12, v11, v3

    if-gtz v12, :cond_3

    cmpg-float v12, v3, v13

    if-gtz v12, :cond_3

    goto :goto_2

    :cond_3
    move v3, v14

    :goto_2
    cmpg-float v12, v7, v14

    if-nez v12, :cond_4

    const/4 v12, 0x1

    goto :goto_3

    :cond_4
    move v12, v9

    :goto_3
    cmpg-float v15, v3, v14

    if-nez v15, :cond_5

    const/4 v15, 0x1

    goto :goto_4

    :cond_5
    move v15, v9

    :goto_4
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move/from16 p1, v11

    move v11, v14

    move/from16 v17, v11

    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v18

    const/16 v19, 0x1

    add-int/lit8 v13, v18, -0x1

    if-ge v9, v13, :cond_6

    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/sma/smartv3/db/entity/SportData;

    invoke-virtual {v13}, Lcom/sma/smartv3/db/entity/SportData;->getMPace()I

    move-result v13

    int-to-float v13, v13

    goto :goto_6

    :cond_6
    move v13, v14

    :goto_6
    invoke-direct {v0, v13, v3, v7}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getAvg(FFF)F

    move-result v13

    cmpg-float v17, v13, v17

    if-nez v17, :cond_7

    goto :goto_7

    :cond_7
    cmpg-float v17, v13, v3

    if-nez v17, :cond_8

    goto :goto_7

    :cond_8
    cmpg-float v17, v13, v7

    if-nez v17, :cond_a

    :goto_7
    invoke-direct {v0, v3, v7}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getRandom(FF)F

    move-result v17

    cmpg-float v18, v17, v14

    if-nez v18, :cond_9

    goto :goto_8

    :cond_9
    move/from16 v13, v17

    :cond_a
    :goto_8
    move/from16 v17, v14

    new-instance v14, Lcom/github/mikephil/charting/data/Entry;

    invoke-direct {v14, v11, v13}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-interface {v10, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-float v11, v11, p1

    add-int/lit8 v9, v9, 0x1

    move/from16 v14, v17

    move/from16 v17, v13

    goto :goto_5

    :cond_b
    move/from16 v17, v14

    if-eqz v15, :cond_c

    const/high16 v3, 0x42c80000    # 100.0f

    :cond_c
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_d
    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/github/mikephil/charting/data/Entry;

    if-eqz v12, :cond_e

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result v9

    cmpl-float v9, v9, v7

    if-lez v9, :cond_e

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result v7

    :cond_e
    if-eqz v15, :cond_d

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result v9

    cmpg-float v9, v9, v3

    if-gez v9, :cond_d

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result v9

    cmpl-float v9, v9, v17

    if-lez v9, :cond_d

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result v3

    goto :goto_9

    :cond_f
    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v10, v8}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v9, 0x0

    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v9, 0x1

    if-gez v9, :cond_10

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_10
    check-cast v6, Lcom/github/mikephil/charting/data/Entry;

    new-instance v8, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Pace;

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result v6

    float-to-int v6, v6

    invoke-direct {v8, v9, v6}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$Pace;-><init>(II)V

    invoke-interface {v3, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v9, v7

    goto :goto_a

    :cond_11
    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v3, 0x5

    invoke-virtual {v1, v3}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->setSportDataType(I)V

    invoke-virtual {v1, v4}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->setSportOverView(Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;)V

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->setPaceList(Ljava/util/List;)V

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_12

    return-object v4

    :cond_12
    return-object v1
.end method

.method public final getSportOverView(Lcom/sma/smartv3/db/entity/Workout;Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;)Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;
    .locals 3
    .param p1    # Lcom/sma/smartv3/db/entity/Workout;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "workout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sportData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_1

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->OTHER:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->getValue()I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->setSportType(I)V

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->getSportOverView()Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getApplicationContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/sma/smartv3/model/SportRecordData;

    invoke-direct {v2}, Lcom/sma/smartv3/model/SportRecordData;-><init>()V

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result p1

    invoke-virtual {v2, p1}, Lcom/sma/smartv3/model/SportRecordData;->setMMode(I)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-static {v1, v2}, Lcom/sma/smartv3/model/SportRecordDataKt;->getWorkoutName(Landroid/content/Context;Lcom/sma/smartv3/model/SportRecordData;)I

    move-result p1

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;->setSportName(Ljava/lang/String;)V

    return-object p2

    :pswitch_0
    sget-object p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->MOUNTAINEERING:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->getValue()I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->setSportType(I)V

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->getSportOverView()Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;

    return-object p2

    :pswitch_1
    sget-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->WALK:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->getValue()I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->setSportType(I)V

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->getSportOverView()Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMStep()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;->setStepCount(Ljava/lang/Integer;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMSpm()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;->setStepFreq(Ljava/lang/Integer;)V

    return-object p2

    :pswitch_2
    sget-object p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->SWIM:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->getValue()I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->setSportType(I)V

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->getSportOverView()Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;

    return-object p2

    :pswitch_3
    sget-object p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->CYCLING:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->getValue()I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->setSportType(I)V

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->getSportOverView()Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;

    return-object p2

    :cond_0
    sget-object p1, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->SKIPPING_ROPE:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->getValue()I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->setSportType(I)V

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->getSportOverView()Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;

    return-object p2

    :cond_1
    sget-object v0, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->RUNNING:Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportType;->getValue()I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->setSportType(I)V

    invoke-virtual {p2}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->getSportOverView()Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMStep()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;->setStepCount(Ljava/lang/Integer;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/Workout;->getMSpm()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;->setStepFreq(Ljava/lang/Integer;)V

    :cond_2
    return-object p2

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getStepFreqData(Lcom/sma/smartv3/db/entity/Workout;Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;)Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;
    .locals 18
    .param p1    # Lcom/sma/smartv3/db/entity/Workout;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "workout"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "sportData"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    invoke-direct {v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getMSportDataDao()Lcom/sma/smartv3/db/dao/SportDataDao;

    move-result-object v4

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v5

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v7

    invoke-interface {v4, v5, v6, v7, v8}, Lcom/sma/smartv3/db/dao/SportDataDao;->getSportDataASC(JJ)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-direct {v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getMLocationDao()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object v4

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v5

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v7

    invoke-interface {v4, v5, v6, v7, v8}, Lcom/sma/smartv3/db/dao/LocationDao;->getLocation(JJ)Ljava/util/List;

    move-result-object v4

    invoke-direct {v0}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getMActivityDao()Lcom/sma/smartv3/db/dao/ActivityDao;

    move-result-object v5

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v6

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v8

    invoke-interface {v5, v6, v7, v8, v9}, Lcom/sma/smartv3/db/dao/ActivityDao;->getListASC(JJ)Ljava/util/List;

    move-result-object v5

    invoke-direct {v0, v1, v4, v5}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getSportDataList(Lcom/sma/smartv3/db/entity/Workout;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    :cond_0
    sget-object v5, Lcom/android/mltcode/paycertificationapi/o65;->OXO1:Lcom/android/mltcode/paycertificationapi/o65;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lcom/android/mltcode/paycertificationapi/o65;->OIX0iXi(J)J

    move-result-wide v8

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMEnd()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lcom/android/mltcode/paycertificationapi/o65;->OIX0iXi(J)J

    move-result-wide v5

    const v7, 0xea60

    int-to-long v10, v7

    add-long/2addr v10, v5

    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    const-wide/32 v12, 0xea60

    invoke-static/range {v8 .. v13}, Lkotlin/internal/ProgressionUtilKt;->XO0O10(JJJ)J

    move-result-wide v6

    cmp-long v10, v8, v6

    if-gtz v10, :cond_1

    :goto_0
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    new-instance v11, Lcom/android/mltcode/paycertificationapi/nr0;

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v16}, Lcom/android/mltcode/paycertificationapi/nr0;-><init>(IILjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v5, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    cmp-long v10, v8, v6

    if-eqz v10, :cond_1

    const-wide/32 v10, 0xea60

    add-long/2addr v8, v10

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMMaxSpm()I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMMinSpm()I

    move-result v1

    int-to-float v1, v1

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    const/high16 v8, 0x3f800000    # 1.0f

    cmpg-float v9, v8, v6

    const/4 v10, 0x0

    const/high16 v11, 0x447a0000    # 1000.0f

    if-gtz v9, :cond_2

    cmpg-float v9, v6, v11

    if-gtz v9, :cond_2

    goto :goto_1

    :cond_2
    move v6, v10

    :goto_1
    cmpg-float v9, v8, v1

    if-gtz v9, :cond_3

    cmpg-float v9, v1, v11

    if-gtz v9, :cond_3

    goto :goto_2

    :cond_3
    move v1, v10

    :goto_2
    cmpg-float v9, v6, v10

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-nez v9, :cond_4

    move v9, v12

    goto :goto_3

    :cond_4
    move v9, v11

    :goto_3
    cmpg-float v13, v1, v10

    if-nez v13, :cond_5

    move v13, v12

    goto :goto_4

    :cond_5
    move v13, v11

    :goto_4
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move/from16 p1, v8

    move v8, v10

    move v15, v8

    move v14, v11

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v16

    move/from16 v17, v10

    add-int/lit8 v10, v16, -0x1

    if-ge v14, v10, :cond_6

    invoke-interface {v4, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/sma/smartv3/db/entity/SportData;

    invoke-virtual {v10}, Lcom/sma/smartv3/db/entity/SportData;->getMStep()I

    move-result v10

    int-to-float v10, v10

    goto :goto_6

    :cond_6
    move/from16 v10, v17

    :goto_6
    invoke-direct {v0, v10, v1, v6}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getAvg(FFF)F

    move-result v10

    cmpg-float v15, v10, v15

    if-nez v15, :cond_7

    goto :goto_7

    :cond_7
    cmpg-float v15, v10, v1

    if-nez v15, :cond_8

    goto :goto_7

    :cond_8
    cmpg-float v15, v10, v6

    if-nez v15, :cond_9

    :goto_7
    invoke-direct {v0, v1, v6}, Lcom/sma/smartv3/biz/fitness_site/hyky/HykyUtils;->getRandom(FF)F

    move-result v15

    cmpg-float v16, v15, v17

    if-nez v16, :cond_a

    :cond_9
    move v15, v10

    :cond_a
    new-instance v10, Lcom/github/mikephil/charting/data/Entry;

    invoke-direct {v10, v8, v15}, Lcom/github/mikephil/charting/data/Entry;-><init>(FF)V

    invoke-interface {v7, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-float v8, v8, p1

    add-int/lit8 v14, v14, 0x1

    move/from16 v10, v17

    goto :goto_5

    :cond_b
    move/from16 v17, v10

    if-eqz v13, :cond_c

    const/high16 v1, 0x42c80000    # 100.0f

    :cond_c
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_d
    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/github/mikephil/charting/data/Entry;

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    if-eqz v9, :cond_e

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result v8

    cmpl-float v8, v8, v6

    if-lez v8, :cond_e

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result v6

    :cond_e
    if-eqz v13, :cond_d

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result v8

    cmpg-float v8, v8, v1

    if-gez v8, :cond_d

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result v8

    cmpl-float v8, v8, v17

    if-lez v8, :cond_d

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result v1

    goto :goto_8

    :cond_f
    new-instance v1, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v7, v4}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v11, 0x1

    if-gez v11, :cond_10

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_10
    check-cast v5, Lcom/github/mikephil/charting/data/Entry;

    new-instance v7, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$StepFreq;

    mul-int/lit8 v11, v11, 0x3c

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result v5

    float-to-int v5, v5

    invoke-direct {v7, v11, v5}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$StepFreq;-><init>(II)V

    invoke-interface {v1, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v11, v6

    goto :goto_9

    :cond_11
    invoke-interface {v3, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v1, 0x4

    invoke-virtual {v2, v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->setSportDataType(I)V

    const/4 v1, 0x0

    invoke-virtual {v2, v1}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->setSportOverView(Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportOverView;)V

    invoke-virtual {v2, v3}, Lcom/sma/smartv3/biz/fitness_site/hyky/UploadSportDataHYKY$SportData;->setStepFreqList(Ljava/util/List;)V

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_12

    return-object v1

    :cond_12
    return-object v2
.end method
