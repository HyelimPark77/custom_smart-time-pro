.class public Lcom/jieli/jl_bt_ota/util/JL_Log;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_bt_ota/util/JL_Log$SaveLogFileThread;,
        Lcom/jieli/jl_bt_ota/util/JL_Log$ILogOutput;
    }
.end annotation


# static fields
.field public static FILE_SIZE_LIMIT:J = 0x12c00000L

.field public static final LEVEL_DEBUG:I = 0x2

.field public static final LEVEL_ERROR:I = 0x5

.field public static final LEVEL_INFO:I = 0x3

.field public static final LEVEL_VERBOSE:I = 0x1

.field public static final LEVEL_WARN:I = 0x4

.field public static SAVE_LOG_LEVEL:I = 0x1

.field private static final a:Ljava/lang/String; = "ota:"

.field private static final b:Ljava/lang/String; = "logcat"

.field private static c:Z = true

.field private static d:Z = false

.field private static e:Ljava/lang/String; = null

.field private static final f:Ljava/text/SimpleDateFormat;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ConstantLocale"
        }
    .end annotation
.end field

.field private static g:Lcom/jieli/jl_bt_ota/util/JL_Log$SaveLogFileThread; = null
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field

.field private static h:Landroid/content/Context; = null
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field

.field private static i:Lcom/jieli/jl_bt_ota/util/JL_Log$ILogOutput; = null

.field public static isTest:Z = false


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    const-string v2, "yyyyMMddHHmmss.SSS"

    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lcom/jieli/jl_bt_ota/util/JL_Log;->f:Ljava/text/SimpleDateFormat;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_bt_ota/util/JL_Log$SaveLogFileThread;)Lcom/jieli/jl_bt_ota/util/JL_Log$SaveLogFileThread;
    .locals 0

    .line 1
    sput-object p0, Lcom/jieli/jl_bt_ota/util/JL_Log;->g:Lcom/jieli/jl_bt_ota/util/JL_Log$SaveLogFileThread;

    return-object p0
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 2
    sget-object v0, Lcom/jieli/jl_bt_ota/util/JL_Log;->e:Ljava/lang/String;

    return-object v0
.end method

.method private static a(I)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    .line 7
    const-string p0, ""

    return-object p0

    .line 8
    :cond_0
    const-string p0, "e"

    return-object p0

    .line 9
    :cond_1
    const-string p0, "w"

    return-object p0

    .line 10
    :cond_2
    const-string p0, "i"

    return-object p0

    .line 11
    :cond_3
    const-string p0, "d"

    return-object p0

    .line 12
    :cond_4
    const-string p0, "v"

    return-object p0
.end method

.method public static synthetic a(Landroid/content/Context;[Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 4
    invoke-static {p0, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->b(Landroid/content/Context;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 3
    sput-object p0, Lcom/jieli/jl_bt_ota/util/JL_Log;->e:Ljava/lang/String;

    return-object p0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 6
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "[%s]\t%s"

    invoke-static {v0, p1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "null"

    if-nez p1, :cond_0

    move-object p1, p0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " :  "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p2, :cond_1

    move-object p2, p0

    :cond_1
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\n"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 13
    invoke-static {p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 14
    sget-boolean v0, Lcom/jieli/jl_bt_ota/util/JL_Log;->c:Z

    if-eqz v0, :cond_6

    .line 15
    sget-boolean v0, Lcom/jieli/jl_bt_ota/util/JL_Log;->isTest:Z

    if-eqz v0, :cond_0

    .line 16
    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->b(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-eq p0, v0, :cond_5

    const/4 v0, 0x2

    if-eq p0, v0, :cond_4

    const/4 v0, 0x3

    if-eq p0, v0, :cond_3

    const/4 v0, 0x4

    if-eq p0, v0, :cond_2

    const/4 v0, 0x5

    if-eq p0, v0, :cond_1

    return-void

    .line 17
    :cond_1
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 18
    :cond_2
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 19
    :cond_3
    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 20
    :cond_4
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 21
    :cond_5
    invoke-static {p1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    :cond_6
    :goto_0
    invoke-static {p0, p1, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->c(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static a(Landroid/content/Context;)V
    .locals 1

    .line 23
    sget-object v0, Lcom/jieli/jl_bt_ota/util/JL_Log;->g:Lcom/jieli/jl_bt_ota/util/JL_Log$SaveLogFileThread;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/util/JL_Log$SaveLogFileThread;->a(Lcom/jieli/jl_bt_ota/util/JL_Log$SaveLogFileThread;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 24
    :cond_1
    :goto_0
    sget-object v0, Lcom/jieli/jl_bt_ota/util/JL_Log;->h:Landroid/content/Context;

    if-nez v0, :cond_3

    if-nez p0, :cond_2

    .line 25
    invoke-static {}, Lcom/jieli/jl_bt_ota/util/CommonUtil;->getMainContext()Landroid/content/Context;

    move-result-object p0

    :cond_2
    sput-object p0, Lcom/jieli/jl_bt_ota/util/JL_Log;->h:Landroid/content/Context;

    .line 26
    :cond_3
    new-instance p0, Lcom/jieli/jl_bt_ota/util/JL_Log$SaveLogFileThread;

    sget-object v0, Lcom/jieli/jl_bt_ota/util/JL_Log;->h:Landroid/content/Context;

    invoke-direct {p0, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log$SaveLogFileThread;-><init>(Landroid/content/Context;)V

    sput-object p0, Lcom/jieli/jl_bt_ota/util/JL_Log;->g:Lcom/jieli/jl_bt_ota/util/JL_Log$SaveLogFileThread;

    .line 27
    invoke-virtual {p0}, Lcom/jieli/jl_bt_ota/util/JL_Log$SaveLogFileThread;->start()V

    return-void
.end method

.method public static addLogOutput(Ljava/lang/String;)V
    .locals 2

    sget-boolean v0, Lcom/jieli/jl_bt_ota/util/JL_Log;->d:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/jieli/jl_bt_ota/util/JL_Log;->g:Lcom/jieli/jl_bt_ota/util/JL_Log$SaveLogFileThread;

    if-nez v0, :cond_1

    sget-object v0, Lcom/jieli/jl_bt_ota/util/JL_Log;->h:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->a(Landroid/content/Context;)V

    const-wide/16 v0, 0x14

    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    :cond_1
    sget-object v0, Lcom/jieli/jl_bt_ota/util/JL_Log;->g:Lcom/jieli/jl_bt_ota/util/JL_Log$SaveLogFileThread;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/jieli/jl_bt_ota/util/JL_Log$SaveLogFileThread;->addLog([B)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static synthetic b()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static varargs b(Landroid/content/Context;[Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    if-eqz p0, :cond_6

    if-eqz p1, :cond_6

    .line 6
    array-length v1, p1

    if-nez v1, :cond_0

    goto/16 :goto_2

    .line 7
    :cond_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    if-eqz p0, :cond_6

    .line 8
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_2

    .line 9
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "/"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    const/4 v2, 0x0

    if-eqz p0, :cond_2

    .line 11
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v0, p0

    .line 12
    :cond_2
    array-length p0, p1

    :goto_0
    if-ge v2, p0, :cond_5

    aget-object v3, p1, v2

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    new-instance v3, Ljava/io/File;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 15
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 16
    :cond_3
    invoke-virtual {v3}, Ljava/io/File;->mkdir()Z

    move-result v3

    if-nez v3, :cond_4

    .line 17
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "create dir failed. filePath = "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "jieli"

    const-string v1, "createFilePath"

    invoke-static {p1, v1, p0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 18
    :cond_5
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_6
    :goto_2
    return-object v0
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ota:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static b(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 4
    invoke-static {p0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->a(I)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0, p1, p2}, [Ljava/lang/Object;

    move-result-object p0

    .line 5
    const-string p1, "%s\t%s\t%s%n"

    invoke-virtual {v0, v1, p1, p0}, Ljava/io/PrintStream;->printf(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    return-void
.end method

.method private static c()V
    .locals 2

    .line 6
    sget-object v0, Lcom/jieli/jl_bt_ota/util/JL_Log;->g:Lcom/jieli/jl_bt_ota/util/JL_Log$SaveLogFileThread;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {v0}, Lcom/jieli/jl_bt_ota/util/JL_Log$SaveLogFileThread;->closeSaveFile()V

    .line 8
    sput-object v1, Lcom/jieli/jl_bt_ota/util/JL_Log;->g:Lcom/jieli/jl_bt_ota/util/JL_Log$SaveLogFileThread;

    .line 9
    :cond_0
    sput-object v1, Lcom/jieli/jl_bt_ota/util/JL_Log;->h:Landroid/content/Context;

    return-void
.end method

.method private static c(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    sget-object p2, Lcom/jieli/jl_bt_ota/util/JL_Log;->i:Lcom/jieli/jl_bt_ota/util/JL_Log$ILogOutput;

    if-eqz p2, :cond_0

    .line 3
    invoke-interface {p2, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log$ILogOutput;->output(Ljava/lang/String;)V

    return-void

    .line 4
    :cond_0
    sget p2, Lcom/jieli/jl_bt_ota/util/JL_Log;->SAVE_LOG_LEVEL:I

    if-ge p0, p2, :cond_1

    return-void

    .line 5
    :cond_1
    invoke-static {p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->addLogOutput(Ljava/lang/String;)V

    return-void
.end method

.method private static d()Ljava/lang/String;
    .locals 2

    .line 3
    sget-object v0, Lcom/jieli/jl_bt_ota/util/JL_Log;->f:Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    .line 1
    invoke-static {v0, p0, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-static {p1, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x5

    .line 1
    invoke-static {v0, p0, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-static {p1, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static getSaveLogFile()Z
    .locals 1

    sget-boolean v0, Lcom/jieli/jl_bt_ota/util/JL_Log;->d:Z

    return v0
.end method

.method public static getSaveLogPath(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    const-string v0, "logcat"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->b(Landroid/content/Context;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x3

    .line 1
    invoke-static {v0, p0, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-static {p1, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static isIsLog()Z
    .locals 1

    sget-boolean v0, Lcom/jieli/jl_bt_ota/util/JL_Log;->c:Z

    return v0
.end method

.method public static setIsSaveLogFile(Landroid/content/Context;Z)V
    .locals 0

    sput-boolean p1, Lcom/jieli/jl_bt_ota/util/JL_Log;->d:Z

    if-eqz p1, :cond_0

    invoke-static {p0}, Lcom/jieli/jl_bt_ota/util/JL_Log;->a(Landroid/content/Context;)V

    return-void

    :cond_0
    invoke-static {}, Lcom/jieli/jl_bt_ota/util/JL_Log;->c()V

    return-void
.end method

.method public static setIsTest(Z)V
    .locals 0

    sput-boolean p0, Lcom/jieli/jl_bt_ota/util/JL_Log;->isTest:Z

    return-void
.end method

.method public static setLog(Z)V
    .locals 0

    sput-boolean p0, Lcom/jieli/jl_bt_ota/util/JL_Log;->c:Z

    return-void
.end method

.method public static setLogOutput(Lcom/jieli/jl_bt_ota/util/JL_Log$ILogOutput;)V
    .locals 0

    sput-object p0, Lcom/jieli/jl_bt_ota/util/JL_Log;->i:Lcom/jieli/jl_bt_ota/util/JL_Log$ILogOutput;

    return-void
.end method

.method public static v(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-static {v0, p0, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-static {p1, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x4

    .line 1
    invoke-static {v0, p0, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-static {p1, p2}, Lcom/jieli/jl_bt_ota/util/JL_Log;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/jieli/jl_bt_ota/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
