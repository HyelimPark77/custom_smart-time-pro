.class public Lcom/jieli/bluetooth_connect/util/JL_Log;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/bluetooth_connect/util/JL_Log$SaveLogFileThread;,
        Lcom/jieli/bluetooth_connect/util/JL_Log$ILogOutput;,
        Lcom/jieli/bluetooth_connect/util/JL_Log$LogLevel;
    }
.end annotation


# static fields
.field private static final DIR_LOGCAT:Ljava/lang/String; = "logcat"

.field public static final LEVEL_DEBUG:I = 0x2

.field public static final LEVEL_ERROR:I = 0x5

.field public static final LEVEL_INFO:I = 0x3

.field public static final LEVEL_VERBOSE:I = 0x1

.field public static final LEVEL_WARN:I = 0x4

.field public static LOG_FILE_SIZE_LIMIT:I = 0x3c00000

.field public static SAVE_LOG_LEVEL:I = 0x1

.field private static final TAG_PREFIX:Ljava/lang/String; = "bt:"

.field private static isLog:Z = true

.field private static isSaveLogFile:Z = false

.field private static logOutput:Lcom/jieli/bluetooth_connect/util/JL_Log$ILogOutput;

.field private static mContext:Landroid/content/Context;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field

.field private static mSaveLogFileThread:Lcom/jieli/bluetooth_connect/util/JL_Log$SaveLogFileThread;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field

.field private static saveLogFilePath:Ljava/lang/String;

.field private static final yyyyMMdd_HHmmssSSS:Ljava/text/SimpleDateFormat;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ConstantLocale"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMddHHmmss.SSS"

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lcom/jieli/bluetooth_connect/util/JL_Log;->yyyyMMdd_HHmmssSSS:Ljava/text/SimpleDateFormat;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic access$102(Lcom/jieli/bluetooth_connect/util/JL_Log$SaveLogFileThread;)Lcom/jieli/bluetooth_connect/util/JL_Log$SaveLogFileThread;
    .locals 0

    sput-object p0, Lcom/jieli/bluetooth_connect/util/JL_Log;->mSaveLogFileThread:Lcom/jieli/bluetooth_connect/util/JL_Log$SaveLogFileThread;

    return-object p0
.end method

.method public static synthetic access$200()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/jieli/bluetooth_connect/util/JL_Log;->saveLogFilePath:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic access$202(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    sput-object p0, Lcom/jieli/bluetooth_connect/util/JL_Log;->saveLogFilePath:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$300()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/jieli/bluetooth_connect/util/JL_Log;->currentTimeString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static addLogOutput(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "logcat"
        }
    .end annotation

    sget-boolean v0, Lcom/jieli/bluetooth_connect/util/JL_Log;->isSaveLogFile:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/jieli/bluetooth_connect/util/JL_Log;->mSaveLogFileThread:Lcom/jieli/bluetooth_connect/util/JL_Log$SaveLogFileThread;

    if-nez v0, :cond_1

    sget-object v0, Lcom/jieli/bluetooth_connect/util/JL_Log;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->openLogFileStream(Landroid/content/Context;)V

    const-wide/16 v0, 0x14

    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    :cond_1
    sget-object v0, Lcom/jieli/bluetooth_connect/util/JL_Log;->mSaveLogFileThread:Lcom/jieli/bluetooth_connect/util/JL_Log$SaveLogFileThread;

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/jieli/bluetooth_connect/util/JL_Log$SaveLogFileThread;->addLog([B)V

    return-void
.end method

.method private static closeLogFile()V
    .locals 1

    sget-object v0, Lcom/jieli/bluetooth_connect/util/JL_Log;->mSaveLogFileThread:Lcom/jieli/bluetooth_connect/util/JL_Log$SaveLogFileThread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/util/JL_Log$SaveLogFileThread;->closeSaveFile()V

    const/4 v0, 0x0

    sput-object v0, Lcom/jieli/bluetooth_connect/util/JL_Log;->mSaveLogFileThread:Lcom/jieli/bluetooth_connect/util/JL_Log$SaveLogFileThread;

    :cond_0
    return-void
.end method

.method public static varargs createFilePath(Landroid/content/Context;[Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "context",
            "dirNames"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_6

    if-eqz p1, :cond_6

    array-length v1, p1

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    if-eqz p0, :cond_6

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "/"

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    const/4 v2, 0x0

    if-eqz p0, :cond_2

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v0, p0

    :cond_2
    array-length p0, p1

    :goto_0
    if-ge v2, p0, :cond_5

    aget-object v3, p1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v3, Ljava/io/File;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    move-result v4

    if-eqz v4, :cond_4

    :cond_3
    invoke-virtual {v3}, Ljava/io/File;->mkdir()Z

    move-result v3

    if-nez v3, :cond_4

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "create dir failed. filePath = "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "jieli"

    const-string v1, "createFilePath"

    invoke-static {p1, v1, p0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_6
    :goto_2
    return-object v0
.end method

.method private static currentTimeString()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/jieli/bluetooth_connect/util/JL_Log;->yyyyMMdd_HHmmssSSS:Ljava/text/SimpleDateFormat;

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
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "tag",
            "content"
        }
    .end annotation

    const/4 v0, 0x2

    .line 1
    invoke-static {v0, p0, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->logFormat(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "tag",
            "method",
            "content"
        }
    .end annotation

    .line 2
    invoke-static {p1, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->formatMethod(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "tag",
            "content"
        }
    .end annotation

    const/4 v0, 0x5

    .line 1
    invoke-static {v0, p0, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->logFormat(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "tag",
            "method",
            "content"
        }
    .end annotation

    .line 2
    invoke-static {p1, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->formatMethod(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static formatLog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "level",
            "tag",
            "message"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/jieli/bluetooth_connect/util/JL_Log;->currentTimeString()Ljava/lang/String;

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

.method private static formatMethod(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "method",
            "content"
        }
    .end annotation

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v1, "[%s] >>> %s"

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, v1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static formatTag(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "tag"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bt:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static getLevelString(I)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "level"
        }
    .end annotation

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

    const-string p0, ""

    return-object p0

    :cond_0
    const-string p0, "e"

    return-object p0

    :cond_1
    const-string p0, "w"

    return-object p0

    :cond_2
    const-string p0, "i"

    return-object p0

    :cond_3
    const-string p0, "d"

    return-object p0

    :cond_4
    const-string p0, "v"

    return-object p0
.end method

.method public static getSaveLogFile()Z
    .locals 1

    sget-boolean v0, Lcom/jieli/bluetooth_connect/util/JL_Log;->isSaveLogFile:Z

    return v0
.end method

.method public static getSaveLogPath(Landroid/content/Context;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "context"
        }
    .end annotation

    const-string v0, "logcat"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->createFilePath(Landroid/content/Context;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "tag",
            "content"
        }
    .end annotation

    const/4 v0, 0x3

    .line 1
    invoke-static {v0, p0, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->logFormat(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "tag",
            "method",
            "content"
        }
    .end annotation

    .line 2
    invoke-static {p1, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->formatMethod(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static isLog()Z
    .locals 1

    sget-boolean v0, Lcom/jieli/bluetooth_connect/util/JL_Log;->isLog:Z

    return v0
.end method

.method private static logFormat(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "level",
            "tag",
            "content"
        }
    .end annotation

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->formatTag(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-boolean v0, Lcom/jieli/bluetooth_connect/util/JL_Log;->isLog:Z

    if-eqz v0, :cond_5

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

    return-void

    :cond_0
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_2
    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_3
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_4
    invoke-static {p1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    :goto_0
    invoke-static {p0, p1, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->saveLogInFile(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static openLogFileStream(Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "context"
        }
    .end annotation

    sget-object v0, Lcom/jieli/bluetooth_connect/util/JL_Log;->mSaveLogFileThread:Lcom/jieli/bluetooth_connect/util/JL_Log$SaveLogFileThread;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/jieli/bluetooth_connect/util/JL_Log$SaveLogFileThread;->access$000(Lcom/jieli/bluetooth_connect/util/JL_Log$SaveLogFileThread;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    new-instance v0, Lcom/jieli/bluetooth_connect/util/JL_Log$SaveLogFileThread;

    invoke-direct {v0, p0}, Lcom/jieli/bluetooth_connect/util/JL_Log$SaveLogFileThread;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/jieli/bluetooth_connect/util/JL_Log;->mSaveLogFileThread:Lcom/jieli/bluetooth_connect/util/JL_Log$SaveLogFileThread;

    invoke-virtual {v0}, Lcom/jieli/bluetooth_connect/util/JL_Log$SaveLogFileThread;->start()V

    return-void
.end method

.method private static saveLogInFile(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "level",
            "tag",
            "content"
        }
    .end annotation

    invoke-static {p0}, Lcom/jieli/bluetooth_connect/util/JL_Log;->getLevelString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->formatLog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/jieli/bluetooth_connect/util/JL_Log;->logOutput:Lcom/jieli/bluetooth_connect/util/JL_Log$ILogOutput;

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log$ILogOutput;->output(Ljava/lang/String;)V

    return-void

    :cond_0
    sget p2, Lcom/jieli/bluetooth_connect/util/JL_Log;->SAVE_LOG_LEVEL:I

    if-ge p0, p2, :cond_1

    return-void

    :cond_1
    invoke-static {p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->addLogOutput(Ljava/lang/String;)V

    return-void
.end method

.method public static setIsSaveLogFile(ZLandroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "isSaveFile",
            "context"
        }
    .end annotation

    sput-boolean p0, Lcom/jieli/bluetooth_connect/util/JL_Log;->isSaveLogFile:Z

    if-eqz p0, :cond_0

    sput-object p1, Lcom/jieli/bluetooth_connect/util/JL_Log;->mContext:Landroid/content/Context;

    invoke-static {p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->openLogFileStream(Landroid/content/Context;)V

    return-void

    :cond_0
    const/4 p0, 0x0

    sput-object p0, Lcom/jieli/bluetooth_connect/util/JL_Log;->mContext:Landroid/content/Context;

    invoke-static {}, Lcom/jieli/bluetooth_connect/util/JL_Log;->closeLogFile()V

    return-void
.end method

.method public static setLog(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "log"
        }
    .end annotation

    sput-boolean p0, Lcom/jieli/bluetooth_connect/util/JL_Log;->isLog:Z

    return-void
.end method

.method public static setLogOutput(Lcom/jieli/bluetooth_connect/util/JL_Log$ILogOutput;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "logOutput"
        }
    .end annotation

    sput-object p0, Lcom/jieli/bluetooth_connect/util/JL_Log;->logOutput:Lcom/jieli/bluetooth_connect/util/JL_Log$ILogOutput;

    return-void
.end method

.method public static v(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "tag",
            "content"
        }
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-static {v0, p0, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->logFormat(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "tag",
            "method",
            "content"
        }
    .end annotation

    .line 2
    invoke-static {p1, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->formatMethod(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "tag",
            "content"
        }
    .end annotation

    const/4 v0, 0x4

    .line 1
    invoke-static {v0, p0, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->logFormat(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "tag",
            "method",
            "content"
        }
    .end annotation

    .line 2
    invoke-static {p1, p2}, Lcom/jieli/bluetooth_connect/util/JL_Log;->formatMethod(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/jieli/bluetooth_connect/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
