.class public Lcom/jieli/jl_rcsp/util/JL_Log;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/util/JL_Log$SaveLogFileThread;,
        Lcom/jieli/jl_rcsp/util/JL_Log$ILogOutput;
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

.field public static a:Ljava/lang/String; = "JL"

.field public static final b:Ljava/lang/String; = "logcat"

.field public static c:Z = true

.field public static d:Z = false

.field public static e:Z = false

.field public static f:Landroid/content/Context; = null
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field

.field public static g:Ljava/lang/String; = null

.field public static final h:Ljava/text/SimpleDateFormat;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ConstantLocale"
        }
    .end annotation
.end field

.field public static i:Lcom/jieli/jl_rcsp/util/JL_Log$SaveLogFileThread; = null
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field

.field public static isLogCrash:Z = true

.field public static j:Lcom/jieli/jl_rcsp/util/JL_Log$ILogOutput;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/text/SimpleDateFormat;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v2, "yyyyMMddHHmmss.SSS"

    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lcom/jieli/jl_rcsp/util/JL_Log;->h:Ljava/text/SimpleDateFormat;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/util/JL_Log$SaveLogFileThread;)Lcom/jieli/jl_rcsp/util/JL_Log$SaveLogFileThread;
    .locals 0

    .line 1
    sput-object p0, Lcom/jieli/jl_rcsp/util/JL_Log;->i:Lcom/jieli/jl_rcsp/util/JL_Log$SaveLogFileThread;

    return-object p0
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 2
    sget-object v0, Lcom/jieli/jl_rcsp/util/JL_Log;->g:Ljava/lang/String;

    return-object v0
.end method

.method public static a(I)Ljava/lang/String;
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

    .line 9
    const-string p0, ""

    return-object p0

    .line 10
    :cond_0
    const-string p0, "e"

    return-object p0

    .line 11
    :cond_1
    const-string p0, "w"

    return-object p0

    .line 12
    :cond_2
    const-string p0, "i"

    return-object p0

    .line 13
    :cond_3
    const-string p0, "d"

    return-object p0

    .line 14
    :cond_4
    const-string p0, "v"

    return-object p0
.end method

.method public static varargs a(Landroid/content/Context;[Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    if-eqz p0, :cond_6

    if-eqz p1, :cond_6

    .line 33
    array-length v1, p1

    if-nez v1, :cond_0

    goto/16 :goto_2

    .line 34
    :cond_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    if-eqz p0, :cond_6

    .line 35
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_2

    .line 36
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "/"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    const/4 v2, 0x0

    if-eqz p0, :cond_2

    .line 38
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v0, p0

    .line 39
    :cond_2
    array-length p0, p1

    :goto_0
    if-ge v2, p0, :cond_5

    aget-object v3, p1, v2

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    new-instance v3, Ljava/io/File;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 42
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 43
    :cond_3
    invoke-virtual {v3}, Ljava/io/File;->mkdir()Z

    move-result v3

    if-nez v3, :cond_4

    .line 44
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "create dir failed. filePath = "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "jieli"

    const-string v1, "createFilePath"

    invoke-static {p1, v1, p0}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 45
    :cond_5
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_6
    :goto_2
    return-object v0
.end method

.method public static synthetic a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 3
    sput-object p0, Lcom/jieli/jl_rcsp/util/JL_Log;->g:Ljava/lang/String;

    return-object p0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 8
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "[%s] >>> %s"

    invoke-static {v0, p1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/jieli/jl_rcsp/util/JL_Log;->e()Ljava/lang/String;

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

.method public static a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 15
    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 16
    sget-boolean v0, Lcom/jieli/jl_rcsp/util/JL_Log;->c:Z

    if-eqz v0, :cond_a

    const/4 v0, 0x1

    if-eq p0, v0, :cond_8

    const/4 v0, 0x2

    if-eq p0, v0, :cond_6

    const/4 v0, 0x3

    if-eq p0, v0, :cond_4

    const/4 v0, 0x4

    if-eq p0, v0, :cond_2

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    return-void

    .line 17
    :cond_0
    sget-boolean v0, Lcom/jieli/jl_rcsp/util/JL_Log;->d:Z

    if-eqz v0, :cond_1

    .line 18
    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/util/TestLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 19
    :cond_1
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 20
    :cond_2
    sget-boolean v0, Lcom/jieli/jl_rcsp/util/JL_Log;->d:Z

    if-eqz v0, :cond_3

    .line 21
    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/util/TestLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 22
    :cond_3
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 23
    :cond_4
    sget-boolean v0, Lcom/jieli/jl_rcsp/util/JL_Log;->d:Z

    if-eqz v0, :cond_5

    .line 24
    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/util/TestLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 25
    :cond_5
    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 26
    :cond_6
    sget-boolean v0, Lcom/jieli/jl_rcsp/util/JL_Log;->d:Z

    if-eqz v0, :cond_7

    .line 27
    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/util/TestLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 28
    :cond_7
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 29
    :cond_8
    sget-boolean v0, Lcom/jieli/jl_rcsp/util/JL_Log;->d:Z

    if-eqz v0, :cond_9

    .line 30
    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/util/TestLog;->v(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 31
    :cond_9
    invoke-static {p1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    :cond_a
    :goto_0
    invoke-static {p0, p1, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->b(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 1

    .line 4
    sget-object v0, Lcom/jieli/jl_rcsp/util/JL_Log;->i:Lcom/jieli/jl_rcsp/util/JL_Log$SaveLogFileThread;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/JL_Log$SaveLogFileThread;->a(Lcom/jieli/jl_rcsp/util/JL_Log$SaveLogFileThread;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 5
    :cond_1
    :goto_0
    new-instance v0, Lcom/jieli/jl_rcsp/util/JL_Log$SaveLogFileThread;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/util/JL_Log$SaveLogFileThread;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/jieli/jl_rcsp/util/JL_Log;->i:Lcom/jieli/jl_rcsp/util/JL_Log$SaveLogFileThread;

    .line 6
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/util/JL_Log$SaveLogFileThread;->start()V

    return-void
.end method

.method public static addLogOutput(Ljava/lang/String;)V
    .locals 2

    sget-boolean v0, Lcom/jieli/jl_rcsp/util/JL_Log;->e:Z

    if-eqz v0, :cond_2

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/jieli/jl_rcsp/util/JL_Log;->i:Lcom/jieli/jl_rcsp/util/JL_Log$SaveLogFileThread;

    if-nez v0, :cond_1

    sget-object v0, Lcom/jieli/jl_rcsp/util/JL_Log;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->a(Landroid/content/Context;)V

    const-wide/16 v0, 0x14

    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    :cond_1
    sget-object v0, Lcom/jieli/jl_rcsp/util/JL_Log;->i:Lcom/jieli/jl_rcsp/util/JL_Log$SaveLogFileThread;

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/jieli/jl_rcsp/util/JL_Log$SaveLogFileThread;->addLog([B)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static synthetic b()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/jieli/jl_rcsp/util/JL_Log;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/jieli/jl_rcsp/util/JL_Log;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 3
    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/JL_Log;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    sget-object p2, Lcom/jieli/jl_rcsp/util/JL_Log;->j:Lcom/jieli/jl_rcsp/util/JL_Log$ILogOutput;

    if-eqz p2, :cond_0

    .line 5
    invoke-interface {p2, p1}, Lcom/jieli/jl_rcsp/util/JL_Log$ILogOutput;->output(Ljava/lang/String;)V

    return-void

    .line 6
    :cond_0
    sget p2, Lcom/jieli/jl_rcsp/util/JL_Log;->SAVE_LOG_LEVEL:I

    if-ge p0, p2, :cond_1

    return-void

    .line 7
    :cond_1
    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->addLogOutput(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic c()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/jieli/jl_rcsp/util/JL_Log;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static configureLog(Landroid/content/Context;ZZ)V
    .locals 0

    sput-boolean p1, Lcom/jieli/jl_rcsp/util/JL_Log;->c:Z

    sput-boolean p2, Lcom/jieli/jl_rcsp/util/JL_Log;->e:Z

    if-eqz p2, :cond_1

    sput-object p0, Lcom/jieli/jl_rcsp/util/JL_Log;->f:Landroid/content/Context;

    sget-boolean p1, Lcom/jieli/jl_rcsp/util/JL_Log;->isLogCrash:Z

    if-eqz p1, :cond_0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-static {}, Lcom/jieli/jl_rcsp/util/CrashHandler;->getInstance()Lcom/jieli/jl_rcsp/util/CrashHandler;

    move-result-object p1

    sget-object p2, Lcom/jieli/jl_rcsp/util/JL_Log;->f:Landroid/content/Context;

    invoke-virtual {p1, p2}, Lcom/jieli/jl_rcsp/util/CrashHandler;->init(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/JL_Log;->a(Landroid/content/Context;)V

    return-void

    :cond_1
    const/4 p0, 0x0

    sput-object p0, Lcom/jieli/jl_rcsp/util/JL_Log;->f:Landroid/content/Context;

    invoke-static {}, Lcom/jieli/jl_rcsp/util/JL_Log;->d()V

    return-void
.end method

.method public static d()V
    .locals 1

    .line 3
    sget-object v0, Lcom/jieli/jl_rcsp/util/JL_Log;->i:Lcom/jieli/jl_rcsp/util/JL_Log$SaveLogFileThread;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/util/JL_Log$SaveLogFileThread;->closeSaveFile()V

    const/4 v0, 0x0

    .line 5
    sput-object v0, Lcom/jieli/jl_rcsp/util/JL_Log;->i:Lcom/jieli/jl_rcsp/util/JL_Log$SaveLogFileThread;

    :cond_0
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    .line 1
    invoke-static {v0, p0, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static e()Ljava/lang/String;
    .locals 2

    .line 3
    sget-object v0, Lcom/jieli/jl_rcsp/util/JL_Log;->h:Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x5

    .line 1
    invoke-static {v0, p0, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static f()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/jieli/jl_rcsp/util/JL_Log;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "app_log_"

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/jieli/jl_rcsp/util/JL_Log;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_log_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getSaveLogFile()Z
    .locals 1

    sget-boolean v0, Lcom/jieli/jl_rcsp/util/JL_Log;->e:Z

    return v0
.end method

.method public static getSaveLogPath(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    const-string v0, "logcat"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->a(Landroid/content/Context;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x3

    .line 1
    invoke-static {v0, p0, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static isLog()Z
    .locals 1

    sget-boolean v0, Lcom/jieli/jl_rcsp/util/JL_Log;->c:Z

    return v0
.end method

.method public static setLogOutput(Lcom/jieli/jl_rcsp/util/JL_Log$ILogOutput;)V
    .locals 0

    sput-object p0, Lcom/jieli/jl_rcsp/util/JL_Log;->j:Lcom/jieli/jl_rcsp/util/JL_Log$ILogOutput;

    return-void
.end method

.method public static setTagPrefix(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcom/jieli/jl_rcsp/util/JL_Log;->a:Ljava/lang/String;

    return-void
.end method

.method public static setUseTest(Z)V
    .locals 0

    sput-boolean p0, Lcom/jieli/jl_rcsp/util/JL_Log;->d:Z

    return-void
.end method

.method public static v(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-static {v0, p0, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x4

    .line 1
    invoke-static {v0, p0, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-static {p1, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
