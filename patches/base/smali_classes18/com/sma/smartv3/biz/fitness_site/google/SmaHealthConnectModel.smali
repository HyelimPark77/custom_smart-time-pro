.class public final Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$OXO1;,
        Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$HealthConnectModelFactory;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSmaHealthConnectModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,629:1\n1563#2:630\n1634#2,3:631\n1878#2,3:634\n1056#2:637\n1869#2,2:638\n774#2:640\n865#2,2:641\n1563#2:643\n1634#2,3:644\n1869#2,2:647\n1869#2,2:649\n*S KotlinDebug\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n*L\n88#1:630\n88#1:631,3\n90#1:634,3\n203#1:637\n213#1:638,2\n418#1:640\n418#1:641,2\n431#1:643\n431#1:644,3\n443#1:647,2\n604#1:649,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSmaHealthConnectModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,629:1\n1563#2:630\n1634#2,3:631\n1878#2,3:634\n1056#2:637\n1869#2,2:638\n774#2:640\n865#2,2:641\n1563#2:643\n1634#2,3:644\n1869#2,2:647\n1869#2,2:649\n*S KotlinDebug\n*F\n+ 1 SmaHealthConnectModel.kt\ncom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel\n*L\n88#1:630\n88#1:631,3\n90#1:634,3\n203#1:637\n213#1:638,2\n418#1:640\n418#1:641,2\n431#1:643\n431#1:644,3\n443#1:647,2\n604#1:649,2\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TIME_MIN_SIXTY:I = 0xea60


# instance fields
.field private final healthConnectLiveData:Landroidx/lifecycle/MutableLiveData;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private isCleared:Z

.field private mContext:Landroid/content/Context;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;->Companion:Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$OXO1;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;->mContext:Landroid/content/Context;

    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;->healthConnectLiveData:Landroidx/lifecycle/MutableLiveData;

    return-void
.end method

.method private static final groupByTimeIntervalLoop$truncateToMinute(J)J
    .locals 2

    const-wide/32 v0, 0xea60

    div-long/2addr p0, v0

    return-wide p0
.end method

.method private final isSameDay(JJ)Z
    .locals 1

    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object p1

    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->toLocalDate()Ljava/time/LocalDate;

    move-result-object p1

    invoke-static {p3, p4}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object p2

    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->toLocalDate()Ljava/time/LocalDate;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public final getCalender(J)Lkotlin/Pair;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/16 p2, 0xb

    invoke-virtual {p1, p2}, Ljava/util/Calendar;->get(I)I

    move-result p2

    const/16 v0, 0xc

    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    move-result p1

    new-instance v0, Lkotlin/Pair;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final getHealthConnectLiveData()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;->healthConnectLiveData:Landroidx/lifecycle/MutableLiveData;

    return-object v0
.end method

.method public final getHrvListTime(JJ)Ljava/util/ArrayList;
    .locals 2
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/AppDatabase;->heartRateDao()Lcom/sma/smartv3/db/dao/HeartRateDao;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3, p4}, Lcom/sma/smartv3/db/dao/HeartRateDao;->getHeartRates(JJ)Ljava/util/List;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "getHrvListTime list"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sma/smartv3/db/entity/HeartRate;

    invoke-virtual {p2}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final getMContext()Landroid/content/Context;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public final getStageList(Ljava/util/List;I)I
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSleep;",
            ">;I)I"
        }
    .end annotation

    const-string v0, "analyseSleep"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result p1

    const/4 p2, 0x1

    if-eq p1, p2, :cond_3

    const/4 p2, 0x2

    if-eq p1, p2, :cond_2

    const/4 p2, 0x3

    if-eq p1, p2, :cond_1

    const/16 p2, 0x9

    if-eq p1, p2, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/xm4;->OXO1:Lcom/android/mltcode/paycertificationapi/xm4;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/xm4;->OXO1()I

    move-result p1

    return p1

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/xm4;->OXO1:Lcom/android/mltcode/paycertificationapi/xm4;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/xm4;->O00()I

    move-result p1

    return p1

    :cond_1
    sget-object p1, Lcom/android/mltcode/paycertificationapi/xm4;->OXO1:Lcom/android/mltcode/paycertificationapi/xm4;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/xm4;->XIi00iiXO()I

    move-result p1

    return p1

    :cond_2
    sget-object p1, Lcom/android/mltcode/paycertificationapi/xm4;->OXO1:Lcom/android/mltcode/paycertificationapi/xm4;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/xm4;->XO0O10()I

    move-result p1

    return p1

    :cond_3
    sget-object p1, Lcom/android/mltcode/paycertificationapi/xm4;->OXO1:Lcom/android/mltcode/paycertificationapi/xm4;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/xm4;->iO()I

    move-result p1

    return p1
.end method

.method public final getTimePeriod(Ljava/util/List;)Lkotlin/Pair;
    .locals 7
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
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;)",
            "Lkotlin/Pair<",
            "Lcom/sma/smartv3/db/entity/Activity;",
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/db/entity/Activity;

    sget-object v1, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/db/AppDatabase;->activityDao()Lcom/sma/smartv3/db/dao/ActivityDao;

    move-result-object v1

    move-object v2, v0

    check-cast v2, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Activity;->getMId()I

    move-result v3

    invoke-interface {v1, v3}, Lcom/sma/smartv3/db/dao/ActivityDao;->getPreviousItemByID(I)Lcom/sma/smartv3/db/entity/Activity;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v3

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v4

    if-eq v3, v4, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v3

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v5

    invoke-direct {p0, v3, v4, v5, v6}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;->isSameDay(JJ)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    :cond_0
    new-instance v1, Lkotlin/Pair;

    invoke-direct {v1, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method public final groupByTimeIntervalLoop(Ljava/util/List;)Ljava/util/List;
    .locals 8
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
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/Activity;",
            ">;>;"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Activity;->getMId()I

    move-result v1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Activity;->getMId()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "HealthConnectModel : groupByTimeIntervalLoop__"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$XIi00iiXO;

    invoke-direct {v2}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$XIi00iiXO;-><init>()V

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->II0O1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Activity;->getMId()I

    move-result v3

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Activity;->getMId()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "HealthConnectModel : groupByTimeIntervalLoop sorted__"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/entity/Activity;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Oi0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_1

    filled-new-array {v0}, [Lcom/sma/smartv3/db/entity/Activity;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sma/smartv3/db/entity/Activity;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;->groupByTimeIntervalLoop$truncateToMinute(J)J

    move-result-wide v4

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;->groupByTimeIntervalLoop$truncateToMinute(J)J

    move-result-wide v6

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x1

    cmp-long v4, v4, v6

    if-gtz v4, :cond_2

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v4

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v6

    invoke-direct {p0, v4, v5, v6, v7}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;->isSameDay(JJ)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    filled-new-array {v0}, [Lcom/sma/smartv3/db/entity/Activity;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v2
.end method

.method public final isCleared()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;->isCleared:Z

    return v0
.end method

.method public onCleared()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;->isCleared:Z

    invoke-super {p0}, Landroidx/lifecycle/ViewModel;->onCleared()V

    return-void
.end method

.method public final setCleared(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;->isCleared:Z

    return-void
.end method

.method public final setMContext(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;->mContext:Landroid/content/Context;

    return-void
.end method

.method public final splitByMode17(Ljava/util/List;)Ljava/util/List;
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
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSleep;",
            ">;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    move v2, v1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v4

    const/16 v5, 0x11

    if-ne v4, v5, :cond_2

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x1

    :cond_2
    if-eqz v2, :cond_3

    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Oi0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    if-eqz v4, :cond_3

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleSleep;->getMMode()I

    move-result v3

    const/16 v4, 0x22

    if-ne v3, v4, :cond_1

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    return-object p1
.end method

.method public final synthetic uploadHealthConnectBloodPressure(Ljava/util/List;Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;)V
    .locals 7
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x22
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;",
            ")V"
        }
    .end annotation

    const-string v0, "dataList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const-class v0, Lcom/sma/smartv3/db/entity/BloodPressure;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodPressure"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/sma/smartv3/db/entity/BloodPressure;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/X10i1OOOX;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMSystolic()I

    move-result v3

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMDiastolic()I

    move-result v4

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/BloodPressure;->getMTime()J

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/android/mltcode/paycertificationapi/X10i1OOOX;-><init>(IIJ)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p2, v0}, Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;->inputBloodPressureReadings(Ljava/util/List;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DataWorker inputBloodPressureReadings  list.size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final synthetic uploadHealthConnectHeartRate(Ljava/util/List;Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;)V
    .locals 6
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x22
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;",
            ")V"
        }
    .end annotation

    const-string v0, "dataList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    const-class v0, Lcom/sma/smartv3/db/entity/HeartRate;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 8
    const-string v2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.HeartRate"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/sma/smartv3/db/entity/HeartRate;

    .line 9
    new-instance v2, Lcom/android/mltcode/paycertificationapi/I111IiiI1;

    .line 10
    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/HeartRate;->getMBpm()I

    move-result v3

    .line 11
    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/HeartRate;->getMTime()J

    move-result-wide v4

    .line 12
    invoke-direct {v2, v3, v4, v5}, Lcom/android/mltcode/paycertificationapi/I111IiiI1;-><init>(IJ)V

    .line 13
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p2, v0}, Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;->inputHeartRateReadings(Ljava/util/List;)V

    .line 15
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DataWorker inputHeartRateReadings  list.size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final synthetic uploadHealthConnectHeartRate(Ljava/util/List;Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;Lcom/example/health/data/HealthConnectManager;)V
    .locals 8
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x22
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;",
            "Lcom/example/health/data/HealthConnectManager;",
            ")V"
        }
    .end annotation

    const-string v0, "dataList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "healthConnectManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    :try_start_0
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;

    const/4 v7, 0x0

    move-object v3, p0

    move-object v6, p1

    move-object v5, p2

    move-object v4, p3

    invoke-direct/range {v2 .. v7}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectHeartRate$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;Lcom/example/health/data/HealthConnectManager;Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v4, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 3
    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "DataWorker uploadHealthConnectHeartRate e = "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic uploadHealthConnectOxygen(Ljava/util/List;Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;)V
    .locals 6
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x22
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;",
            ")V"
        }
    .end annotation

    const-string v0, "dataList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    const-class v0, Lcom/sma/smartv3/db/entity/BloodOxygen;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 8
    const-string v2, "null cannot be cast to non-null type com.sma.smartv3.db.entity.BloodOxygen"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/sma/smartv3/db/entity/BloodOxygen;

    .line 9
    new-instance v2, Lcom/android/mltcode/paycertificationapi/I1O1000iI;

    .line 10
    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/BloodOxygen;->getMValue()I

    move-result v3

    .line 11
    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/BloodOxygen;->getMTime()J

    move-result-wide v4

    .line 12
    invoke-direct {v2, v3, v4, v5}, Lcom/android/mltcode/paycertificationapi/I1O1000iI;-><init>(IJ)V

    .line 13
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p2, v0}, Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;->inputBloodOxyReadings(Ljava/util/List;)V

    .line 15
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DataWorker inputBloodOxyReadings  list.size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final synthetic uploadHealthConnectOxygen(Ljava/util/List;Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;Lcom/example/health/data/HealthConnectManager;)V
    .locals 8
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x22
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;",
            "Lcom/example/health/data/HealthConnectManager;",
            ")V"
        }
    .end annotation

    const-string v0, "dataList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "healthConnectManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    :try_start_0
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectOxygen$1;

    const/4 v7, 0x0

    move-object v3, p0

    move-object v6, p1

    move-object v5, p2

    move-object v4, p3

    invoke-direct/range {v2 .. v7}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectOxygen$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;Lcom/example/health/data/HealthConnectManager;Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v4, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 3
    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "DataWorker uploadHealthConnectHeartRate e = "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic uploadHealthConnectPressure(Ljava/util/List;Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;Lcom/example/health/data/HealthConnectManager;)V
    .locals 8
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x22
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;",
            "Lcom/example/health/data/HealthConnectManager;",
            ")V"
        }
    .end annotation

    const-string v0, "dataList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "healthConnectManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectPressure$1;

    const/4 v7, 0x0

    move-object v3, p0

    move-object v6, p1

    move-object v5, p2

    move-object v4, p3

    invoke-direct/range {v2 .. v7}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectPressure$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;Lcom/example/health/data/HealthConnectManager;Lcom/example/health/presentation/screen/vitalsigns/VitalSignsViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v4, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "DataWorker uploadHealthConnectPressure e = "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic uploadHealthConnectSleep(Ljava/util/List;Lcom/example/health/presentation/screen/sleepsession/SleepSessionViewModel;)V
    .locals 13
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Lcom/example/health/presentation/screen/sleepsession/SleepSessionViewModel;",
            ")V"
        }
    .end annotation

    const-string v0, "dataListAsc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 4
    const-class v0, Lcom/sma/smartv3/db/entity/Sleep;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 5
    check-cast p1, Ljava/lang/Iterable;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 7
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 8
    const-string v3, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Sleep"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/sma/smartv3/db/entity/Sleep;

    .line 9
    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Sleep;->getMAlgorithmType()I

    move-result v3

    .line 10
    new-instance v4, Lcom/szabh/smable3/entity/BleSleep;

    .line 11
    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Sleep;->getMTime()J

    move-result-wide v5

    const/16 v7, 0x3e8

    int-to-long v7, v7

    div-long/2addr v5, v7

    long-to-int v5, v5

    .line 12
    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Sleep;->getMMode()I

    move-result v6

    .line 13
    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Sleep;->getMSoft()I

    move-result v7

    .line 14
    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Sleep;->getMStrong()I

    move-result v2

    .line 15
    invoke-direct {v4, v5, v6, v7, v2}, Lcom/szabh/smable3/entity/BleSleep;-><init>(IIII)V

    .line 16
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v2, v3

    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0, v0}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;->splitByMode17(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 18
    check-cast p1, Ljava/lang/Iterable;

    .line 19
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 20
    sget-object v3, Lcom/szabh/smable3/entity/BleSleep;->Companion:Lcom/szabh/smable3/entity/BleSleep$Companion;

    invoke-virtual {v3, v0, v2}, Lcom/szabh/smable3/entity/BleSleep$Companion;->analyseSleep(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_4

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x2

    if-ge v3, v4, :cond_1

    goto/16 :goto_4

    .line 22
    :cond_1
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 23
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v3, v4

    const-wide/16 v4, 0x3e8

    if-ltz v3, :cond_2

    move v6, v1

    .line 24
    :goto_2
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v7}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v7

    int-to-long v7, v7

    mul-long/2addr v7, v4

    invoke-static {v7, v8}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v7

    add-int/lit8 v8, v6, 0x1

    .line 25
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v9}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v9

    int-to-long v11, v9

    mul-long/2addr v11, v4

    invoke-static {v11, v12}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v9

    .line 26
    invoke-virtual {p0, v0, v6}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;->getStageList(Ljava/util/List;I)I

    move-result v11

    .line 27
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    .line 28
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    .line 29
    new-instance v12, Lcom/android/mltcode/paycertificationapi/xm4$OXO1;

    invoke-direct {v12, v7, v9, v11}, Lcom/android/mltcode/paycertificationapi/xm4$OXO1;-><init>(Ljava/time/Instant;Ljava/time/Instant;I)V

    .line 30
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eq v6, v3, :cond_2

    move v6, v8

    goto :goto_2

    .line 31
    :cond_2
    sget-object v3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "DataWorker uploadHealthConnectSleep input sleepHealth.size="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz p2, :cond_3

    .line 32
    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v3

    int-to-long v6, v3

    mul-long/2addr v6, v4

    .line 33
    invoke-static {v0}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleSleep;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleSleep;->getMTime()I

    move-result v0

    int-to-long v8, v0

    mul-long/2addr v8, v4

    move-object v5, p2

    .line 34
    invoke-virtual/range {v5 .. v10}, Lcom/example/health/presentation/screen/sleepsession/SleepSessionViewModel;->generateSleepData(JJLjava/util/List;)V

    goto :goto_3

    :cond_3
    move-object v5, p2

    :goto_3
    move-object p2, v5

    goto/16 :goto_1

    :cond_4
    :goto_4
    return-void
.end method

.method public final synthetic uploadHealthConnectSleep(Ljava/util/List;Lcom/example/health/presentation/screen/sleepsession/SleepSessionViewModel;Lcom/example/health/data/HealthConnectManager;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Lcom/example/health/presentation/screen/sleepsession/SleepSessionViewModel;",
            "Lcom/example/health/data/HealthConnectManager;",
            ")V"
        }
    .end annotation

    const-string v0, "dataList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "healthConnectManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    :try_start_0
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectSleep$1;

    const/4 v7, 0x0

    move-object v3, p0

    move-object v6, p1

    move-object v5, p2

    move-object v4, p3

    invoke-direct/range {v2 .. v7}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectSleep$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;Lcom/example/health/data/HealthConnectManager;Lcom/example/health/presentation/screen/sleepsession/SleepSessionViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v4, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public final synthetic uploadHealthConnectWight(Ljava/util/List;Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;)V
    .locals 5
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;",
            ")V"
        }
    .end annotation

    const-string v0, "dataList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    const-class v0, Lcom/sma/smartv3/db/entity/Weight;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 6
    const-string v1, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Weight"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/sma/smartv3/db/entity/Weight;

    .line 7
    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Weight;->getMWeight()F

    move-result v1

    float-to-double v1, v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "weight"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "postHealthConnectData"

    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 8
    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Weight;->getMWeight()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {p2, v0, v1}, Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;->inputReadings(D)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final synthetic uploadHealthConnectWight(Ljava/util/List;Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;Lcom/example/health/data/HealthConnectManager;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;",
            "Lcom/example/health/data/HealthConnectManager;",
            ")V"
        }
    .end annotation

    const-string v0, "dataList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "healthConnectManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    :try_start_0
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;

    const/4 v7, 0x0

    move-object v3, p0

    move-object v6, p1

    move-object v5, p2

    move-object v4, p3

    invoke-direct/range {v2 .. v7}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWight$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;Lcom/example/health/data/HealthConnectManager;Lcom/example/health/presentation/screen/inputreadings/InputReadingsViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v4, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public final synthetic uploadHealthConnectWorkout(Ljava/util/List;Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;)V
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "dataListAsc"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    .line 4
    const-class v2, Lcom/sma/smartv3/db/entity/Activity;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 5
    check-cast v1, Ljava/lang/Iterable;

    .line 6
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 7
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 8
    const-string v5, "null cannot be cast to non-null type com.sma.smartv3.db.entity.Activity"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lcom/sma/smartv3/db/entity/Activity;

    .line 9
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0, v2}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;->groupByTimeIntervalLoop(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 11
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v2, 0x1

    if-gez v2, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_1
    check-cast v4, Ljava/util/List;

    .line 12
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    move-object/from16 p1, v1

    move/from16 v26, v5

    goto/16 :goto_2

    .line 13
    :cond_2
    invoke-virtual {v0, v4}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;->getTimePeriod(Ljava/util/List;)Lkotlin/Pair;

    move-result-object v2

    .line 14
    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sma/smartv3/db/entity/Activity;

    .line 15
    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/db/entity/Activity;

    .line 16
    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v7

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v9

    sub-long/2addr v7, v9

    long-to-float v7, v7

    const v8, 0x476a6000    # 60000.0f

    div-float/2addr v7, v8

    float-to-double v7, v7

    invoke-static {v7, v8}, Ljava/lang/Math;->floor(D)D

    move-result-wide v7

    double-to-float v7, v7

    float-to-long v7, v7

    const-wide/16 v9, 0x1

    .line 17
    invoke-static {v7, v8, v9, v10}, Lkotlin/ranges/iO;->OiIIX101O(JJ)J

    move-result-wide v12

    .line 18
    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v7

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Activity;->getMStep()I

    move-result v8

    sub-int/2addr v7, v8

    int-to-long v7, v7

    .line 19
    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v9

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Activity;->getMDistance()I

    move-result v10

    sub-int/2addr v9, v10

    int-to-double v9, v9

    const/16 v11, 0x2710

    int-to-double v14, v11

    div-double/2addr v9, v14

    .line 20
    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Activity;->getMCalorie()I

    move-result v11

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Activity;->getMCalorie()I

    move-result v14

    sub-int/2addr v11, v14

    int-to-double v14, v11

    move-object/from16 p1, v1

    move-object v11, v2

    int-to-double v1, v3

    div-double/2addr v14, v1

    .line 21
    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v1

    move-object/from16 v16, v4

    invoke-virtual {v11}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;->getHrvListTime(JJ)Ljava/util/ArrayList;

    move-result-object v21

    .line 22
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Activity;->getMId()I

    move-result v2

    invoke-virtual {v11}, Lcom/sma/smartv3/db/entity/Activity;->getMId()I

    move-result v3

    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    move-result v4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v26, v5

    const-string v5, "HealthConnectModel : Activity__ValueID = "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "-"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " , time="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " step="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " distance="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v2, "  calories="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14, v15}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v2, " size="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "}"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v0, v7, v0

    if-lez v0, :cond_4

    const-wide/16 v0, 0x0

    cmpg-double v2, v9, v0

    if-lez v2, :cond_4

    cmpg-double v0, v14, v0

    if-gtz v0, :cond_3

    goto :goto_2

    :cond_3
    if-eqz p2, :cond_4

    .line 23
    invoke-virtual {v6}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v22

    .line 24
    invoke-virtual {v11}, Lcom/sma/smartv3/db/entity/Activity;->getMTime()J

    move-result-wide v24

    move-wide/from16 v19, v14

    const/16 v14, 0xc

    move-object/from16 v11, p2

    move-wide v15, v7

    move-wide/from16 v17, v9

    .line 25
    invoke-virtual/range {v11 .. v25}, Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;->insertExerciseSession(JIJDDLjava/util/ArrayList;JJ)V

    :cond_4
    :goto_2
    const/16 v3, 0xa

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, v26

    goto/16 :goto_1

    :cond_5
    return-void
.end method

.method public final synthetic uploadHealthConnectWorkout(Ljava/util/List;Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;Lcom/example/health/data/HealthConnectManager;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;",
            "Lcom/example/health/data/HealthConnectManager;",
            ")V"
        }
    .end annotation

    const-string v0, "dataList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "healthConnectManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    :try_start_0
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWorkout$1;

    const/4 v7, 0x0

    move-object v3, p0

    move-object v6, p1

    move-object v5, p2

    move-object v4, p3

    invoke-direct/range {v2 .. v7}, Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel$uploadHealthConnectWorkout$1;-><init>(Lcom/sma/smartv3/biz/fitness_site/google/SmaHealthConnectModel;Lcom/example/health/data/HealthConnectManager;Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v4, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method
