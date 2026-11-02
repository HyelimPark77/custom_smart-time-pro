.class public final Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStravaManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StravaManager.kt\ncom/sma/smartv3/biz/fitness_site/strava/StravaManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,667:1\n15#2:668\n18#2,2:669\n15#2:671\n15#2:672\n18#2,2:673\n15#2:675\n11#2,2:676\n18#2,2:678\n15#2:680\n18#2,2:692\n15#2:694\n1563#3:681\n1634#3,3:682\n1869#3:685\n1870#3:687\n1869#3,2:688\n1869#3,2:690\n1#4:686\n29#5:695\n*S KotlinDebug\n*F\n+ 1 StravaManager.kt\ncom/sma/smartv3/biz/fitness_site/strava/StravaManager\n*L\n65#1:668\n70#1:669,2\n70#1:671\n103#1:672\n135#1:673,2\n135#1:675\n152#1:676,2\n291#1:678,2\n291#1:680\n606#1:692,2\n606#1:694\n412#1:681\n412#1:682,3\n465#1:685\n465#1:687\n532#1:688,2\n542#1:690,2\n644#1:695\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nStravaManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StravaManager.kt\ncom/sma/smartv3/biz/fitness_site/strava/StravaManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,667:1\n15#2:668\n18#2,2:669\n15#2:671\n15#2:672\n18#2,2:673\n15#2:675\n11#2,2:676\n18#2,2:678\n15#2:680\n18#2,2:692\n15#2:694\n1563#3:681\n1634#3,3:682\n1869#3:685\n1870#3:687\n1869#3,2:688\n1869#3,2:690\n1#4:686\n29#5:695\n*S KotlinDebug\n*F\n+ 1 StravaManager.kt\ncom/sma/smartv3/biz/fitness_site/strava/StravaManager\n*L\n65#1:668\n70#1:669,2\n70#1:671\n103#1:672\n135#1:673,2\n135#1:675\n152#1:676,2\n291#1:678,2\n291#1:680\n606#1:692,2\n606#1:694\n412#1:681\n412#1:682,3\n465#1:685\n465#1:687\n532#1:688,2\n542#1:690,2\n644#1:695\n*E\n"
    }
.end annotation


# static fields
.field private static final CREATE_ACTIVITY:Ljava/lang/String; = "https://www.strava.com/api/v3/activities"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final CREATE_UPLOAD:Ljava/lang/String; = "https://www.strava.com/api/v3/uploads"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final EARTH_RADIUS:D = 6371000.0

.field public static final INSTANCE:Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final STATUS_CODE_UNAUTHORIZED:I = 0x191

.field private static final TAG:Ljava/lang/String; = "StravaManager"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL_AUTHORIZE:Ljava/lang/String; = "https://www.strava.com/oauth/mobile/authorize"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final URL_CALLBACK:Ljava/lang/String; = "http://localhost/auth/callback"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final URL_DEAUTHORIZE:Ljava/lang/String; = "https://www.strava.com/oauth/deauthorize"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final URL_GET_TOKEN:Ljava/lang/String; = "https://www.strava.com/oauth/token"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;

    invoke-direct {v0}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;-><init>()V

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->INSTANCE:Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lkotlin/jvm/functions/Function1;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->handleStravaAppIntent$lambda$0$0(Lkotlin/jvm/functions/Function1;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private final calculateDistance(DDDD)D
    .locals 4

    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p1

    invoke-static {p3, p4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p3

    invoke-static {p5, p6}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p5

    invoke-static {p7, p8}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p7

    sub-double v0, p5, p1

    sub-double/2addr p7, p3

    const/4 p3, 0x2

    int-to-double p3, p3

    div-double/2addr v0, p3

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    mul-double/2addr v2, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    move-result-wide p1

    invoke-static {p5, p6}, Ljava/lang/Math;->cos(D)D

    move-result-wide p5

    mul-double/2addr p1, p5

    div-double/2addr p7, p3

    invoke-static {p7, p8}, Ljava/lang/Math;->sin(D)D

    move-result-wide p5

    mul-double/2addr p1, p5

    invoke-static {p7, p8}, Ljava/lang/Math;->sin(D)D

    move-result-wide p5

    mul-double/2addr p1, p5

    add-double/2addr v2, p1

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p1

    const/4 p5, 0x1

    int-to-double p5, p5

    sub-double/2addr p5, v2

    invoke-static {p5, p6}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p5

    invoke-static {p1, p2, p5, p6}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p1

    mul-double/2addr p3, p1

    const-wide p1, 0x41584dae00000000L    # 6371000.0

    mul-double/2addr p3, p1

    return-wide p3
.end method

.method public static synthetic createActivity$default(Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;Lcom/sma/smartv3/db/entity/WorkoutIndex;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->createActivity(Lcom/sma/smartv3/db/entity/WorkoutIndex;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic createActivityFitHeartRate$default(Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;Lcom/sma/smartv3/db/entity/WorkoutIndex;Lkotlin/jvm/functions/Function1;Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->createActivityFitHeartRate(Lcom/sma/smartv3/db/entity/WorkoutIndex;Lkotlin/jvm/functions/Function1;Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;)V

    return-void
.end method

.method public static synthetic deauthorizeStrava$default(Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->deauthorizeStrava(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final handleStravaAppIntent$lambda$0$0(Lkotlin/jvm/functions/Function1;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final updateWorkoutIndexStravaSynced(Lcom/sma/smartv3/db/entity/WorkoutIndex;)V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->workoutIndexDao()Lcom/sma/smartv3/db/dao/WorkoutIndexDao;

    move-result-object v0

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/WorkoutIndex;->getMSyncStatus()I

    move-result v1

    or-int/lit8 v1, v1, 0x1

    invoke-virtual {p1, v1}, Lcom/sma/smartv3/db/entity/WorkoutIndex;->setMSyncStatus(I)V

    invoke-interface {v0, p1}, Lcom/sma/smartv3/db/dao/WorkoutIndexDao;->update(Lcom/sma/smartv3/db/entity/WorkoutIndex;)V

    return-void
.end method


# virtual methods
.method public final bd09ToWgs84(DD)Lkotlin/Pair;
    .locals 8
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DD)",
            "Lkotlin/Pair<",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    const-wide v0, 0x3f7a9fbe76c8b439L    # 0.0065

    sub-double/2addr p3, v0

    const-wide v0, 0x3f789374bc6a7efaL    # 0.006

    sub-double/2addr p1, v0

    mul-double v0, p3, p3

    mul-double v2, p1, p1

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    const-wide v2, 0x404a2e1077c7044eL    # 52.35987755982988

    mul-double v4, p1, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    const-wide v6, 0x3ef4f8b588e368f1L    # 2.0E-5

    mul-double/2addr v4, v6

    sub-double/2addr v0, v4

    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p1

    mul-double/2addr p3, v2

    invoke-static {p3, p4}, Ljava/lang/Math;->cos(D)D

    move-result-wide p3

    const-wide v2, 0x3ec92a737110e454L    # 3.0E-6

    mul-double/2addr p3, v2

    sub-double/2addr p1, p3

    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    move-result-wide p3

    mul-double/2addr p3, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    move-result-wide p1

    mul-double/2addr v0, p1

    new-instance p1, Lkotlin/Pair;

    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public final convertToInteger(DD)Lkotlin/Pair;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(DD)",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-wide v0, 0x4166c16c1693e93fL    # 1.1930464705555556E7

    mul-double/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    move-result-wide p1

    long-to-int p1, p1

    mul-double/2addr p3, v0

    invoke-static {p3, p4}, Ljava/lang/Math;->round(D)J

    move-result-wide p2

    long-to-int p2, p2

    new-instance p3, Lkotlin/Pair;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p3, p1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p3
.end method

.method public final createActivity(Lcom/sma/smartv3/db/entity/WorkoutIndex;Lkotlin/jvm/functions/Function1;)V
    .locals 19
    .param p1    # Lcom/sma/smartv3/db/entity/WorkoutIndex;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/db/entity/WorkoutIndex;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-class v2, Lcom/sma/smartv3/biz/fitness_site/strava/StravaToken;

    const-string v3, "workoutIndex"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "StravaManager createActivity workoutIndex -> "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/WorkoutIndex;->getMSyncStatus()I

    move-result v4

    and-int/lit8 v4, v4, 0x1

    if-lez v4, :cond_1

    if-eqz v1, :cond_0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    move-object/from16 v5, p0

    goto/16 :goto_2

    :cond_1
    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/XXI0Xi;->XO0O10(Lcom/sma/smartv3/db/entity/WorkoutIndex;)Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;

    move-result-object v4

    if-nez v4, :cond_2

    invoke-direct/range {p0 .. p1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->updateWorkoutIndexStravaSynced(Lcom/sma/smartv3/db/entity/WorkoutIndex;)V

    if-eqz v1, :cond_0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "StravaManager createActivity stravaWorkout -> "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :try_start_0
    sget-object v5, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v5}, Lcom/android/mltcode/paycertificationapi/i72;->iiX0i1IX()Z

    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v5, :cond_3

    move-object/from16 v5, p0

    :try_start_1
    invoke-virtual {v5, v0, v1, v4}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->createActivityFitHeartRate(Lcom/sma/smartv3/db/entity/WorkoutIndex;Lkotlin/jvm/functions/Function1;Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;)V

    return-void

    :catch_0
    move-exception v0

    goto/16 :goto_1

    :cond_3
    move-object/from16 v5, p0

    sget-object v6, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v6}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v6

    invoke-virtual {v6}, Lcom/sma/smartv3/db/AppDatabase;->locationDao()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object v6

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMStart()J

    move-result-wide v7

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMEnd()J

    move-result-wide v9

    invoke-interface {v6, v7, v8, v9, v10}, Lcom/sma/smartv3/db/dao/LocationDao;->getLocation(JJ)Ljava/util/List;

    move-result-object v12

    move-object v6, v12

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_4

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x2

    if-lt v6, v7, :cond_4

    sget-object v11, Lcom/sma/smartv3/model/LocationData;->INSTANCE:Lcom/sma/smartv3/model/LocationData;

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lcom/sma/smartv3/model/LocationData;->getFinalLocationList$default(Lcom/sma/smartv3/model/LocationData;Ljava/util/List;ZZILjava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMMode()I

    move-result v7

    invoke-virtual {v11, v6, v7}, Lcom/sma/smartv3/model/LocationData;->getSmoothLocationListAlgorithm(Ljava/util/ArrayList;I)Ljava/util/ArrayList;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/WorkoutIndex;->getMEndTime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/io/File;

    sget-object v8, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v8}, Lcom/android/mltcode/paycertificationapi/uz0;->iOO1ii1(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v8

    invoke-direct {v7, v8, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lcom/sma/smartv3/model/LocationData;->getFinalLocationList$default(Lcom/sma/smartv3/model/LocationData;Ljava/util/List;ZZILjava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v14

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMStart()J

    move-result-wide v15

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v8

    const v9, 0x7f140142

    invoke-virtual {v8, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    const-string v9, "getString(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMName()Ljava/lang/String;

    move-result-object v18

    move-object/from16 v17, v8

    move-object v13, v11

    invoke-virtual/range {v13 .. v18}, Lcom/sma/smartv3/model/LocationData;->getGpxFileString(Ljava/util/ArrayList;JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromString(Ljava/io/File;Ljava/lang/String;)Z

    sget-object v8, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->INSTANCE:Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMName()Ljava/lang/String;

    move-result-object v9

    const-string v10, "gpx"

    invoke-virtual {v8, v6, v9, v7, v10}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->createUpload(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)Z

    move-result v6

    goto :goto_0

    :cond_4
    const/4 v6, 0x0

    :goto_0
    if-nez v6, :cond_6

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMDistance()I

    move-result v6

    div-int/lit8 v6, v6, 0xa

    mul-int/lit8 v6, v6, 0xa

    const-string v7, "https://www.strava.com/api/v3/activities"

    invoke-static {v7}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v7

    const-string v8, "access_token"

    sget-object v9, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v9}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v9

    new-instance v10, Lcom/google/gson/Gson;

    invoke-direct {v10}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v10, v9, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_5

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v9

    :cond_5
    check-cast v9, Lcom/sma/smartv3/biz/fitness_site/strava/StravaToken;

    invoke-virtual {v9}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaToken;->getAccess_token()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v8, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    const-string v7, "name"

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v7, v8}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    const-string v7, "type"

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMType()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v7, v8}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    const-string v7, "start_date_local"

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMStartTime()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v7, v8}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    const-string v7, "elapsed_time"

    invoke-virtual {v4}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMElapsedTime()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v7, v4}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    const-string v4, "distance"

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v4, v6}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    const-string v4, "StravaManager createActivity"

    invoke-virtual {v2, v4}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    sget-object v4, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v2, v4}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v2

    invoke-virtual {v2}, Lcom/androidnetworking/common/ANRequest;->executeForJSONObject()Lcom/androidnetworking/common/ANResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/androidnetworking/common/ANResponse;->getError()Lcom/androidnetworking/error/ANError;

    move-result-object v4

    invoke-virtual {v2}, Lcom/androidnetworking/common/ANResponse;->getResult()Ljava/lang/Object;

    move-result-object v2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "StravaManager createActivity -> response.error:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " response.result:"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_6
    invoke-direct/range {p0 .. p1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->updateWorkoutIndexStravaSynced(Lcom/sma/smartv3/db/entity/WorkoutIndex;)V

    if-eqz v1, :cond_7

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_1
    move-exception v0

    move-object/from16 v5, p0

    :goto_1
    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "StravaManager createActivity -> exception : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz v1, :cond_7

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    :goto_2
    return-void
.end method

.method public final createActivityFitHeartRate(Lcom/sma/smartv3/db/entity/WorkoutIndex;Lkotlin/jvm/functions/Function1;Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;)V
    .locals 35
    .param p1    # Lcom/sma/smartv3/db/entity/WorkoutIndex;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p3    # Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/db/entity/WorkoutIndex;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "workoutIndex"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "stravaWorkout"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v4, "StravaManager createActivityFitHeartRate"

    invoke-virtual {v2, v4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/WorkoutIndex;->getMEndTime()J

    move-result-wide v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, ".fit"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/io/File;

    sget-object v6, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v6}, Lcom/android/mltcode/paycertificationapi/uz0;->IXXOO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v6

    invoke-direct {v5, v6, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v6, Lcom/garmin/fit/iXiX011;

    sget-object v7, Lcom/garmin/fit/Fit$ProtocolVersion;->V2_0:Lcom/garmin/fit/Fit$ProtocolVersion;

    invoke-direct {v6, v5, v7}, Lcom/garmin/fit/iXiX011;-><init>(Ljava/io/File;Lcom/garmin/fit/Fit$ProtocolVersion;)V

    new-instance v7, Lcom/garmin/fit/O001I;

    invoke-direct {v7}, Lcom/garmin/fit/O001I;-><init>()V

    sget-object v8, Lcom/garmin/fit/File;->ACTIVITY:Lcom/garmin/fit/File;

    invoke-virtual {v7, v8}, Lcom/garmin/fit/O001I;->II(Lcom/garmin/fit/File;)V

    const/4 v8, 0x1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/garmin/fit/O001I;->iO11i(Ljava/lang/Integer;)V

    invoke-virtual {v7, v8}, Lcom/garmin/fit/O001I;->OI1IiOO1i(Ljava/lang/Integer;)V

    const-wide/32 v9, 0x75bcd15

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v7, v9}, Lcom/garmin/fit/O001I;->iX0iii0(Ljava/lang/Long;)V

    const-string v9, "FIT Cookbook"

    invoke-virtual {v7, v9}, Lcom/garmin/fit/O001I;->X11(Ljava/lang/String;)V

    new-instance v9, Lcom/android/mltcode/paycertificationapi/OIO11II1;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMStart()J

    move-result-wide v10

    const/16 v12, 0x3e8

    int-to-long v13, v12

    div-long/2addr v10, v13

    invoke-direct {v9, v10, v11}, Lcom/android/mltcode/paycertificationapi/OIO11II1;-><init>(J)V

    invoke-virtual {v7, v9}, Lcom/garmin/fit/O001I;->XOOI0O(Lcom/android/mltcode/paycertificationapi/OIO11II1;)V

    invoke-virtual {v6, v7}, Lcom/garmin/fit/iXiX011;->IiI10X(Lcom/android/mltcode/paycertificationapi/in0;)V

    new-instance v7, Lcom/garmin/fit/XiOIii1;

    invoke-direct {v7}, Lcom/garmin/fit/XiOIii1;-><init>()V

    const/4 v9, 0x0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v11

    invoke-virtual {v7, v11}, Lcom/garmin/fit/XiOIii1;->iO11i(Ljava/lang/Short;)V

    const-wide/16 v15, 0x6f

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v7, v11}, Lcom/garmin/fit/XiOIii1;->XI(Ljava/lang/Long;)V

    invoke-virtual {v6, v7}, Lcom/garmin/fit/iXiX011;->IiI10X(Lcom/android/mltcode/paycertificationapi/in0;)V

    new-instance v7, Lcom/garmin/fit/iiII;

    invoke-direct {v7}, Lcom/garmin/fit/iiII;-><init>()V

    invoke-virtual {v7, v10}, Lcom/garmin/fit/iiII;->IiiO11(Ljava/lang/Integer;)V

    invoke-virtual {v7, v10}, Lcom/garmin/fit/iiII;->ii1(Ljava/lang/Integer;)V

    invoke-virtual {v7, v8}, Lcom/garmin/fit/iiII;->XOiO0OX0(Ljava/lang/Integer;)V

    new-instance v8, Lcom/android/mltcode/paycertificationapi/OIO11II1;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMStart()J

    move-result-wide v10

    const-wide v15, 0x92ee70e000L

    sub-long/2addr v10, v15

    div-long/2addr v10, v13

    invoke-direct {v8, v10, v11}, Lcom/android/mltcode/paycertificationapi/OIO11II1;-><init>(J)V

    invoke-virtual {v7, v8}, Lcom/garmin/fit/iiII;->iO1iI(Lcom/android/mltcode/paycertificationapi/OIO11II1;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMElapsedTime()J

    move-result-wide v10

    long-to-float v8, v10

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/garmin/fit/iiII;->IIII01Ii(Ljava/lang/Float;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMDistance()I

    move-result v8

    int-to-float v8, v8

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/garmin/fit/iiII;->iXIiO(Ljava/lang/Float;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMCalorie()I

    move-result v8

    div-int/2addr v8, v12

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/garmin/fit/iiII;->iXO(Ljava/lang/Integer;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMAvgBpm()I

    move-result v8

    int-to-short v8, v8

    invoke-static {v8}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/garmin/fit/iiII;->OIii(Ljava/lang/Short;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMMaxBpm()I

    move-result v8

    int-to-short v8, v8

    invoke-static {v8}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/garmin/fit/iiII;->OOO(Ljava/lang/Short;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMMinBpm()I

    move-result v8

    int-to-short v8, v8

    invoke-static {v8}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/garmin/fit/iiII;->X1iOII0(Ljava/lang/Short;)V

    sget-object v8, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->Companion:Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout$Companion;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMMode()I

    move-result v10

    invoke-virtual {v8, v10}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout$Companion;->getTypeByActivityModeType(I)Lcom/garmin/fit/Sport;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/garmin/fit/iiII;->I1OX001(Lcom/garmin/fit/Sport;)V

    sget-object v8, Lcom/garmin/fit/SubSport;->GENERIC:Lcom/garmin/fit/SubSport;

    invoke-virtual {v7, v8}, Lcom/garmin/fit/iiII;->ii0Iii1i(Lcom/garmin/fit/SubSport;)V

    invoke-virtual {v6, v7}, Lcom/garmin/fit/iXiX011;->IiI10X(Lcom/android/mltcode/paycertificationapi/in0;)V

    sget-object v7, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v7}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v8

    invoke-virtual {v8}, Lcom/sma/smartv3/db/AppDatabase;->locationDao()Lcom/sma/smartv3/db/dao/LocationDao;

    move-result-object v8

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMStart()J

    move-result-wide v10

    move-wide/from16 v16, v13

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMEnd()J

    move-result-wide v12

    invoke-interface {v8, v10, v11, v12, v13}, Lcom/sma/smartv3/db/dao/LocationDao;->getLocation(JJ)Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/util/Collection;

    invoke-static {v8}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v8

    invoke-virtual {v7}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v10

    invoke-virtual {v10}, Lcom/sma/smartv3/db/AppDatabase;->heartRateDao()Lcom/sma/smartv3/db/dao/HeartRateDao;

    move-result-object v10

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMStart()J

    move-result-wide v11

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMEnd()J

    move-result-wide v13

    invoke-interface {v10, v11, v12, v13, v14}, Lcom/sma/smartv3/db/dao/HeartRateDao;->getHeartRates(JJ)Ljava/util/List;

    move-result-object v10

    invoke-virtual {v7}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v7

    invoke-virtual {v7}, Lcom/sma/smartv3/db/AppDatabase;->activityDao()Lcom/sma/smartv3/db/dao/ActivityDao;

    move-result-object v7

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMStart()J

    move-result-wide v11

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMEnd()J

    move-result-wide v13

    invoke-interface {v7, v11, v12, v13, v14}, Lcom/sma/smartv3/db/dao/ActivityDao;->getListDESC(JJ)Ljava/util/List;

    move-result-object v7

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMElapsedTime()J

    move-result-wide v11

    long-to-float v11, v11

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v12

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v13

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "StravaManager createActivityFitHeartRate  stravaWorkout = "

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " ,  mElapsedTime = "

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v9, " , locationList = "

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ", heartRateList = "

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, "  , activityList = "

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    move-object v2, v8

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_10

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v2

    const/4 v9, 0x2

    if-lt v2, v9, :cond_10

    invoke-static {v8}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/Location;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Location;->getMTime()J

    move-result-wide v11

    invoke-static {v8}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/Location;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Location;->getMTime()J

    move-result-wide v13

    sub-long/2addr v11, v13

    move-object v2, v8

    check-cast v2, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    const/16 v13, 0xa

    invoke-static {v2, v13}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v9, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    const/16 v20, 0x0

    move-object/from16 v22, v20

    move-object/from16 v23, v22

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v21, 0x0

    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v24

    if-eqz v24, :cond_2

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v24

    check-cast v24, Lcom/sma/smartv3/db/entity/Location;

    if-nez v22, :cond_0

    move-object/from16 v34, v2

    move-object/from16 v23, v24

    goto :goto_2

    :cond_0
    sget-object v25, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->INSTANCE:Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;

    invoke-virtual/range {v22 .. v22}, Lcom/sma/smartv3/db/entity/Location;->getMLatitude()F

    move-result v1

    move-object/from16 v34, v2

    float-to-double v1, v1

    move-wide/from16 v26, v1

    invoke-virtual/range {v22 .. v22}, Lcom/sma/smartv3/db/entity/Location;->getMLongitude()F

    move-result v1

    float-to-double v1, v1

    move-wide/from16 v28, v1

    invoke-virtual/range {v24 .. v24}, Lcom/sma/smartv3/db/entity/Location;->getMLatitude()F

    move-result v1

    float-to-double v1, v1

    move-wide/from16 v30, v1

    invoke-virtual/range {v24 .. v24}, Lcom/sma/smartv3/db/entity/Location;->getMLongitude()F

    move-result v1

    float-to-double v1, v1

    move-wide/from16 v32, v1

    invoke-direct/range {v25 .. v33}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->calculateDistance(DDDD)D

    move-result-wide v1

    const-wide/16 v25, 0x0

    cmpl-double v25, v1, v25

    if-lez v25, :cond_1

    double-to-float v15, v1

    add-float/2addr v14, v15

    goto :goto_1

    :cond_1
    move-object/from16 v22, v23

    :goto_1
    move-object/from16 v23, v22

    :goto_2
    sget-object v1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-interface {v9, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p3

    move-object/from16 v22, v24

    move-object/from16 v2, v34

    goto :goto_0

    :cond_2
    move-object/from16 v34, v2

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "StravaManager  addLocationStart saveDistance = "

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v9, " ,  sum = "

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual/range {p3 .. p3}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMDistance()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v1, v14

    invoke-virtual/range {p3 .. p3}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMElapsedTime()J

    move-result-wide v13

    long-to-float v2, v13

    div-long v11, v11, v16

    long-to-float v9, v11

    sub-float/2addr v2, v9

    div-float v9, v1, v15

    div-float/2addr v2, v9

    invoke-static {v8}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/sma/smartv3/db/entity/Location;

    cmpl-float v1, v1, v21

    if-lez v1, :cond_4

    float-to-int v1, v9

    const/4 v9, 0x0

    const/4 v12, 0x0

    :goto_3
    if-ge v9, v1, :cond_4

    invoke-virtual {v11}, Lcom/sma/smartv3/db/entity/Location;->getMTime()J

    move-result-wide v13

    move/from16 v18, v1

    const/16 v15, 0x3e8

    int-to-float v1, v15

    mul-float/2addr v1, v2

    float-to-int v1, v1

    move/from16 v22, v2

    int-to-long v1, v1

    add-long/2addr v13, v1

    invoke-virtual {v11, v13, v14}, Lcom/sma/smartv3/db/entity/Location;->setMTime(J)V

    xor-int/lit8 v1, v12, 0x1

    if-nez v12, :cond_3

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    move-object/from16 v2, v23

    invoke-virtual {v2, v13, v14}, Lcom/sma/smartv3/db/entity/Location;->setMTime(J)V

    invoke-interface {v8, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_3
    move-object/from16 v2, v23

    invoke-interface {v8, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_4
    add-int/lit8 v9, v9, 0x1

    move v12, v1

    move-object/from16 v23, v2

    move/from16 v1, v18

    move/from16 v2, v22

    goto :goto_3

    :cond_4
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual/range {p3 .. p3}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMDistance()I

    move-result v8

    int-to-float v8, v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "StravaManager  addLocationEnd locationList = "

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " , mDistanceSum = "

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-interface/range {v34 .. v34}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object/from16 v8, v20

    move/from16 v14, v21

    const/4 v2, 0x0

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_13

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/sma/smartv3/db/entity/Location;

    new-instance v11, Lcom/garmin/fit/Xii11I;

    invoke-direct {v11}, Lcom/garmin/fit/Xii11I;-><init>()V

    new-instance v12, Lcom/android/mltcode/paycertificationapi/OIO11II1;

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Location;->getMTime()J

    move-result-wide v21

    move-object v13, v1

    move/from16 v18, v2

    div-long v1, v21, v16

    invoke-direct {v12, v1, v2}, Lcom/android/mltcode/paycertificationapi/OIO11II1;-><init>(J)V

    invoke-virtual {v11, v12}, Lcom/garmin/fit/Xii11I;->OXO1(Lcom/android/mltcode/paycertificationapi/OIO11II1;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "LOCATION_WHERE"

    const/4 v12, 0x0

    invoke-virtual {v1, v2, v12}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->INSTANCE:Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Location;->getMLatitude()F

    move-result v2

    move-object/from16 v19, v13

    float-to-double v12, v2

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Location;->getMLongitude()F

    move-result v2

    float-to-double v2, v2

    invoke-virtual {v1, v12, v13, v2, v3}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->bd09ToWgs84(DD)Lkotlin/Pair;

    move-result-object v2

    invoke-virtual {v2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v12

    invoke-virtual {v2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    invoke-virtual {v1, v12, v13, v2, v3}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->convertToInteger(DD)Lkotlin/Pair;

    move-result-object v1

    goto :goto_6

    :cond_5
    move-object/from16 v19, v13

    sget-object v1, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->INSTANCE:Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Location;->getMLatitude()F

    move-result v2

    float-to-double v2, v2

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Location;->getMLongitude()F

    move-result v12

    float-to-double v12, v12

    invoke-virtual {v1, v2, v3, v12, v13}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->convertToInteger(DD)Lkotlin/Pair;

    move-result-object v1

    :goto_6
    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v11, v2}, Lcom/garmin/fit/Xii11I;->X0XI11I(Ljava/lang/Integer;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v1}, Lcom/garmin/fit/Xii11I;->O1I(Ljava/lang/Integer;)V

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Location;->getMAltitude()I

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Location;->getMAltitude()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v11, v1}, Lcom/garmin/fit/Xii11I;->OXOI0XII(Ljava/lang/Float;)V

    :cond_6
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->OXXO0O1X()Z

    move-result v1

    if-eqz v1, :cond_a

    move-object v1, v10

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/sma/smartv3/db/entity/HeartRate;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/HeartRate;->getMTime()J

    move-result-wide v12

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Location;->getMTime()J

    move-result-wide v22

    cmp-long v3, v12, v22

    if-ltz v3, :cond_7

    goto :goto_7

    :cond_8
    move-object/from16 v2, v20

    :goto_7
    check-cast v2, Lcom/sma/smartv3/db/entity/HeartRate;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v1

    int-to-byte v1, v1

    int-to-short v2, v1

    goto :goto_8

    :cond_9
    move/from16 v2, v18

    :goto_8
    move-object v1, v10

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_b

    if-lez v2, :cond_b

    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    invoke-virtual {v11, v1}, Lcom/garmin/fit/Xii11I;->I0i(Ljava/lang/Short;)V

    goto :goto_9

    :cond_a
    move/from16 v2, v18

    :cond_b
    :goto_9
    if-nez v8, :cond_c

    move v3, v2

    goto :goto_a

    :cond_c
    sget-object v22, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->INSTANCE:Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Location;->getMLatitude()F

    move-result v1

    float-to-double v12, v1

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Location;->getMLongitude()F

    move-result v1

    move v3, v2

    float-to-double v1, v1

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Location;->getMLatitude()F

    move-result v8

    move-wide/from16 v25, v1

    float-to-double v1, v8

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Location;->getMLongitude()F

    move-result v8

    move-wide/from16 v27, v1

    float-to-double v1, v8

    move-wide/from16 v29, v1

    move-wide/from16 v23, v12

    invoke-direct/range {v22 .. v30}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->calculateDistance(DDDD)D

    move-result-wide v1

    double-to-float v1, v1

    add-float/2addr v14, v1

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v11, v1}, Lcom/garmin/fit/Xii11I;->i0I1i0Xi(Ljava/lang/Float;)V

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Location;->getMAltitude()I

    move-result v1

    int-to-float v1, v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v11, v1}, Lcom/garmin/fit/Xii11I;->OXOI0XII(Ljava/lang/Float;)V

    :goto_a
    move-object v1, v7

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v8}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v12

    invoke-virtual {v9}, Lcom/sma/smartv3/db/entity/Location;->getMTime()J

    move-result-wide v22

    cmp-long v8, v12, v22

    if-ltz v8, :cond_d

    goto :goto_b

    :cond_e
    move-object/from16 v2, v20

    :goto_b
    check-cast v2, Lcom/sma/smartv3/db/entity/Activity;

    if-eqz v2, :cond_f

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Activity;->getMCalorie()I

    move-result v1

    const/16 v15, 0x3e8

    div-int/2addr v1, v15

    int-to-byte v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v11, v1}, Lcom/garmin/fit/Xii11I;->Xi1XO00(Ljava/lang/Integer;)V

    :cond_f
    invoke-virtual {v6, v11}, Lcom/garmin/fit/iXiX011;->IiI10X(Lcom/android/mltcode/paycertificationapi/in0;)V

    move v2, v3

    move-object v8, v9

    move-object/from16 v1, v19

    move-object/from16 v3, p1

    goto/16 :goto_5

    :cond_10
    move-object v1, v10

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_12

    check-cast v10, Ljava/lang/Iterable;

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/HeartRate;

    new-instance v3, Lcom/garmin/fit/Xii11I;

    invoke-direct {v3}, Lcom/garmin/fit/Xii11I;-><init>()V

    new-instance v7, Lcom/android/mltcode/paycertificationapi/OIO11II1;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/HeartRate;->getMTime()J

    move-result-wide v8

    div-long v8, v8, v16

    invoke-direct {v7, v8, v9}, Lcom/android/mltcode/paycertificationapi/OIO11II1;-><init>(J)V

    invoke-virtual {v3, v7}, Lcom/garmin/fit/Xii11I;->OXO1(Lcom/android/mltcode/paycertificationapi/OIO11II1;)V

    sget-object v7, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v7}, Lcom/android/mltcode/paycertificationapi/i72;->OXXO0O1X()Z

    move-result v7

    if-eqz v7, :cond_11

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v2

    int-to-byte v2, v2

    int-to-short v2, v2

    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/garmin/fit/Xii11I;->I0i(Ljava/lang/Short;)V

    :cond_11
    invoke-virtual {v6, v3}, Lcom/garmin/fit/iXiX011;->IiI10X(Lcom/android/mltcode/paycertificationapi/in0;)V

    goto :goto_c

    :cond_12
    move-object v1, v7

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_13

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/Activity;

    new-instance v3, Lcom/garmin/fit/Xii11I;

    invoke-direct {v3}, Lcom/garmin/fit/Xii11I;-><init>()V

    new-instance v7, Lcom/android/mltcode/paycertificationapi/OIO11II1;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v8

    div-long v8, v8, v16

    invoke-direct {v7, v8, v9}, Lcom/android/mltcode/paycertificationapi/OIO11II1;-><init>(J)V

    invoke-virtual {v3, v7}, Lcom/garmin/fit/Xii11I;->OXO1(Lcom/android/mltcode/paycertificationapi/OIO11II1;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v7

    int-to-byte v7, v7

    int-to-float v7, v7

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-virtual {v3, v7}, Lcom/garmin/fit/Xii11I;->i0I1i0Xi(Ljava/lang/Float;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Activity;->getMCalorie()I

    move-result v2

    const/16 v15, 0x3e8

    div-int/2addr v2, v15

    int-to-byte v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/garmin/fit/Xii11I;->Xi1XO00(Ljava/lang/Integer;)V

    invoke-virtual {v6, v3}, Lcom/garmin/fit/iXiX011;->IiI10X(Lcom/android/mltcode/paycertificationapi/in0;)V

    goto :goto_d

    :cond_13
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v2, "StravaManager createActivityFitHeartRate  createFile"

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/garmin/fit/iXiX011;->XIi00iiXO()V

    invoke-virtual/range {p3 .. p3}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaWorkout;->getMName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "fit"

    move-object/from16 v6, p0

    invoke-virtual {v6, v4, v2, v5, v3}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->createUpload(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)Z

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "StravaManager createActivityFitHeartRate  createFile  isUploadFit = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-direct/range {p0 .. p1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->updateWorkoutIndexStravaSynced(Lcom/sma/smartv3/db/entity/WorkoutIndex;)V

    if-eqz v0, :cond_14

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_14
    return-void
.end method

.method public final createUpload(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)Z
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Ljava/io/File;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-class v0, Lcom/sma/smartv3/biz/fitness_site/strava/StravaToken;

    const-string v1, "externalId"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "name"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "file"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "data_type"

    invoke-static {p4, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string v4, "https://www.strava.com/api/v3/uploads"

    invoke-static {v4}, Lcom/androidnetworking/AndroidNetworking;->upload(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object v4

    const-string v5, "access_token"

    sget-object v6, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v6

    new-instance v7, Lcom/google/gson/Gson;

    invoke-direct {v7}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v6

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_1

    :cond_0
    :goto_0
    check-cast v6, Lcom/sma/smartv3/biz/fitness_site/strava/StravaToken;

    invoke-virtual {v6}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaToken;->getAccess_token()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->addMultipartParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object v0

    invoke-virtual {v0, v1, p2}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->addMultipartParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object p2

    invoke-virtual {p2, v3, p4}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->addMultipartParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object p2

    const-string p4, "external_id"

    invoke-virtual {p2, p4, p1}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->addMultipartParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object p2

    invoke-virtual {p2, v2, p3}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->addMultipartFile(Ljava/lang/String;Ljava/io/File;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object p2

    const-string p4, "StravaManager createUpload"

    invoke-virtual {p2, p4}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object p2

    sget-object p4, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p2, p4}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;

    move-result-object p2

    invoke-virtual {p2}, Lcom/androidnetworking/common/ANRequest$MultiPartBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p2

    invoke-virtual {p2}, Lcom/androidnetworking/common/ANRequest;->executeForJSONObject()Lcom/androidnetworking/common/ANResponse;

    move-result-object p2

    sget-object p4, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {p2}, Lcom/androidnetworking/common/ANResponse;->getError()Lcom/androidnetworking/error/ANError;

    move-result-object v0

    invoke-virtual {p2}, Lcom/androidnetworking/common/ANResponse;->getResult()Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "StravaManager createUpload -> "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " response.error:"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " , response.result:"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/androidnetworking/common/ANResponse;->getResult()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "StravaManager createUpload -> file = "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :goto_1
    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "StravaManager createUpload -> exception : "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final deauthorizeStrava(Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/sma/smartv3/biz/fitness_site/strava/StravaToken;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/biz/fitness_site/strava/StravaToken;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaToken;->getAccess_token()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const-string v1, "https://www.strava.com/oauth/deauthorize"

    invoke-static {v1}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    const-string v2, "access_token"

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaToken;->getAccess_token()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    const-string v1, "StravaManager deauthorizeStrava"

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager$deauthorizeStrava$1;

    invoke-direct {v1, p1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager$deauthorizeStrava$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest;->getAsJSONObject(Lcom/androidnetworking/interfaces/JSONObjectRequestListener;)V

    :cond_1
    return-void
.end method

.method public final getToken(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "code"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "callback"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "https://www.strava.com/oauth/token"

    invoke-static {v1}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    const v2, 0x7f1412d9

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "client_id"

    invoke-virtual {v1, v3, v2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    const v2, 0x7f1412da

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v2, "client_secret"

    invoke-virtual {v1, v2, p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1, v0, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    const-string p2, "StravaManager getToken"

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object p2, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, p2}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    new-instance p2, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager$getToken$1;

    invoke-direct {p2, p3}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager$getToken$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    const-class p3, Lcom/sma/smartv3/biz/fitness_site/strava/StravaToken;

    invoke-virtual {p1, p3, p2}, Lcom/androidnetworking/common/ANRequest;->getAsObject(Ljava/lang/Class;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void
.end method

.method public final handleStravaAppIntent(Landroid/content/Context;Landroid/content/Intent;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/content/Intent;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "StravaManager handleStravaAppIntent -> data: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p2

    if-eqz p2, :cond_0

    const-string v0, "code"

    invoke-virtual {p2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    sget-object v0, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->INSTANCE:Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ob5;

    invoke-direct {v1, p3}, Lcom/android/mltcode/paycertificationapi/ob5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaManager;->getToken(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method

.method public final isEnabled()Z
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/sma/smartv3/biz/fitness_site/strava/StravaToken;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isExpired()Z
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    const-class v2, Lcom/sma/smartv3/biz/fitness_site/strava/StravaToken;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    :cond_0
    check-cast v0, Lcom/sma/smartv3/biz/fitness_site/strava/StravaToken;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaToken;->getExpires_at()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x5

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-lez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final refreshToken(Landroid/content/Context;)Z
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "refresh_token"

    const-string v1, "context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v3, Lcom/sma/smartv3/biz/fitness_site/strava/StravaToken;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    :cond_0
    check-cast v1, Lcom/sma/smartv3/biz/fitness_site/strava/StravaToken;

    :try_start_0
    const-string v2, "https://www.strava.com/oauth/token"

    invoke-static {v2}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    const-string v4, "client_id"

    const v5, 0x7f1412d9

    invoke-virtual {p1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v2

    const-string v4, "client_secret"

    const v5, 0x7f1412da

    invoke-virtual {p1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, v4, p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    const-string v2, "grant_type"

    invoke-virtual {p1, v2, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/fitness_site/strava/StravaToken;->getRefresh_token()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    const-string v0, "StravaManager refreshToken"

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object v0, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/androidnetworking/common/ANRequest;->executeForObject(Ljava/lang/Class;)Lcom/androidnetworking/common/ANResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANResponse;->getResult()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.biz.fitness_site.strava.StravaToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/biz/fitness_site/strava/StravaToken;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public final toStravaAppAuthorize(Landroid/content/Context;)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppPackageName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "strava://localhost/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/callback"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "https://www.strava.com/oauth/mobile/authorize"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v1

    const v2, 0x7f1412d9

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "client_id"

    invoke-virtual {v1, v3, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "redirect_uri"

    invoke-virtual {v1, v2, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "response_type"

    const-string v2, "code"

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "approval_prompt"

    const-string v2, "auto"

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "scope"

    const-string v2, "activity:write"

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "StravaManager toStravaAppAuthorize -> data: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
