.class public final Lcom/szabh/smable3/entity/MenstrualPeriod;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/szabh/smable3/entity/MenstrualPeriod;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/szabh/smable3/entity/MenstrualPeriod;

    invoke-direct {v0}, Lcom/szabh/smable3/entity/MenstrualPeriod;-><init>()V

    sput-object v0, Lcom/szabh/smable3/entity/MenstrualPeriod;->INSTANCE:Lcom/szabh/smable3/entity/MenstrualPeriod;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final menstrualPeriodCalculation(Ljava/lang/String;II)Ljava/util/List;
    .locals 16
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II)",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/MenstrualPeriodResults;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    move/from16 v1, p2

    const-string v2, "lastMenstrualPeriod"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x1

    if-lt v1, v3, :cond_3

    const/16 v4, 0x8

    if-le v1, v4, :cond_0

    goto/16 :goto_2

    :cond_0
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v5, "yyyy-MM-dd"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {v4, v0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    const/4 v4, 0x0

    move/from16 v5, p3

    move v6, v4

    :goto_0
    if-ge v6, v5, :cond_3

    const/4 v7, 0x2

    if-ge v6, v1, :cond_1

    move v8, v4

    goto :goto_1

    :cond_1
    const/16 v8, 0x9

    if-lt v6, v8, :cond_2

    const/16 v8, 0x12

    if-ge v6, v8, :cond_2

    move v8, v3

    goto :goto_1

    :cond_2
    move v8, v7

    :goto_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v9

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v10

    sget-object v12, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v13, 0x1

    invoke-virtual {v12, v13, v14}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v12

    int-to-long v14, v6

    mul-long/2addr v12, v14

    add-long/2addr v10, v12

    invoke-virtual {v9, v10, v11}, Ljava/util/Calendar;->setTimeInMillis(J)V

    sget-object v10, Lkotlin/jvm/internal/StringCompanionObject;->OXO1:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-virtual {v9, v3}, Ljava/util/Calendar;->get(I)I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v9, v7}, Ljava/util/Calendar;->get(I)I

    move-result v7

    add-int/2addr v7, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v11, 0x5

    invoke-virtual {v9, v11}, Ljava/util/Calendar;->get(I)I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    filled-new-array {v10, v7, v9}, [Ljava/lang/Object;

    move-result-object v7

    const/4 v9, 0x3

    invoke-static {v7, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v7

    const-string v9, "%d%02d%02d"

    invoke-static {v9, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "format(...)"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Lcom/szabh/smable3/entity/MenstrualPeriodResults;

    invoke-direct {v9, v7, v8}, Lcom/szabh/smable3/entity/MenstrualPeriodResults;-><init>(Ljava/lang/String;I)V

    invoke-interface {v2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-object v2
.end method
