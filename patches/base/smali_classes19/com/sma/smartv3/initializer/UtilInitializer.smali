.class public final Lcom/sma/smartv3/initializer/UtilInitializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/s5;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nUtilInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtilInitializer.kt\ncom/sma/smartv3/initializer/UtilInitializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n1011#2,2:93\n1878#2,3:95\n*S KotlinDebug\n*F\n+ 1 UtilInitializer.kt\ncom/sma/smartv3/initializer/UtilInitializer\n*L\n70#1:93,2\n71#1:95,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nUtilInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtilInitializer.kt\ncom/sma/smartv3/initializer/UtilInitializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n1011#2,2:93\n1878#2,3:95\n*S KotlinDebug\n*F\n+ 1 UtilInitializer.kt\ncom/sma/smartv3/initializer/UtilInitializer\n*L\n70#1:93,2\n71#1:95,3\n*E\n"
    }
.end annotation


# static fields
.field public static final I1:I

.field public static final IO:Lcom/sma/smartv3/initializer/UtilInitializer;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/sma/smartv3/initializer/UtilInitializer;

    invoke-direct {v0}, Lcom/sma/smartv3/initializer/UtilInitializer;-><init>()V

    sput-object v0, Lcom/sma/smartv3/initializer/UtilInitializer;->IO:Lcom/sma/smartv3/initializer/UtilInitializer;

    const/16 v0, 0xf0

    sput v0, Lcom/sma/smartv3/initializer/UtilInitializer;->I1:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/initializer/UtilInitializer;Ljava/io/File;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget p2, Lcom/sma/smartv3/initializer/UtilInitializer;->I1:I

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/initializer/UtilInitializer;->O00(Ljava/io/File;I)V

    return-void
.end method

.method public static final synthetic XIi00iiXO(Lcom/sma/smartv3/initializer/UtilInitializer;Ljava/io/File;)J
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/initializer/UtilInitializer;->iO(Ljava/io/File;)J

    move-result-wide p0

    return-wide p0
.end method


# virtual methods
.method public final O00(Ljava/io/File;I)V
    .locals 9

    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->OiIIX101O(I)[J

    move-result-object p2

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/io/File;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    new-instance v0, Lcom/sma/smartv3/initializer/UtilInitializer$OXO1;

    invoke-direct {v0}, Lcom/sma/smartv3/initializer/UtilInitializer$OXO1;-><init>()V

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/XiX0OOXI0;->XOXiX0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_0
    const-string v0, "apply(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move v2, v0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->XOX0O0()V

    :cond_1
    check-cast v3, Ljava/io/File;

    sget-object v2, Lcom/sma/smartv3/initializer/UtilInitializer;->IO:Lcom/sma/smartv3/initializer/UtilInitializer;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Lcom/sma/smartv3/initializer/UtilInitializer;->iO(Ljava/io/File;)J

    move-result-wide v5

    aget-wide v7, p2, v0

    cmp-long v2, v5, v7

    if-ltz v2, :cond_2

    aget-wide v7, p2, v1

    cmp-long v2, v5, v7

    if-lez v2, :cond_3

    :cond_2
    invoke-static {v3}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    :cond_3
    move v2, v4

    goto :goto_0

    :cond_4
    return-void
.end method

.method public OXO1(Landroid/app/Application;)V
    .locals 4
    .param p1    # Landroid/app/Application;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "app"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/blankj/utilcode/util/Utils;->init(Landroid/app/Application;)V

    invoke-static {}, Lcom/blankj/utilcode/util/LogUtils;->getConfig()Lcom/blankj/utilcode/util/LogUtils$Config;

    move-result-object p1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "IS_OPEN_DEBUG_MODE"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p1, v1}, Lcom/blankj/utilcode/util/LogUtils$Config;->setLogSwitch(Z)Lcom/blankj/utilcode/util/LogUtils$Config;

    const-string v1, "TAAG"

    invoke-virtual {p1, v1}, Lcom/blankj/utilcode/util/LogUtils$Config;->setGlobalTag(Ljava/lang/String;)Lcom/blankj/utilcode/util/LogUtils$Config;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lcom/blankj/utilcode/util/LogUtils$Config;->setLog2FileSwitch(Z)Lcom/blankj/utilcode/util/LogUtils$Config;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->OX110i(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/blankj/utilcode/util/LogUtils$Config;->setDir(Ljava/io/File;)Lcom/blankj/utilcode/util/LogUtils$Config;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "privacy_agree"

    invoke-virtual {p1, v0, v3}, Lcom/blankj/utilcode/util/SPUtils;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "UtilInitializer initialize"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/initializer/UtilInitializer;->XOO0ii0(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final XO0O10()I
    .locals 1

    sget v0, Lcom/sma/smartv3/initializer/UtilInitializer;->I1:I

    return v0
.end method

.method public final XOO0ii0(Ljava/lang/Object;)V
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "privacy_agree"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onPrivacyAgree"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/uz0;->X0O(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/CrashUtils;->init(Ljava/io/File;)V

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/I0IIOi;->OXO1(Lkotlin/coroutines/CoroutineContext;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/initializer/UtilInitializer$onPrivacyAgree$1;

    const/4 p1, 0x0

    invoke-direct {v3, p1}, Lcom/sma/smartv3/initializer/UtilInitializer$onPrivacyAgree$1;-><init>(Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public final iO(Ljava/io/File;)J
    .locals 3

    :try_start_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMdd"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    return-wide v0
.end method
