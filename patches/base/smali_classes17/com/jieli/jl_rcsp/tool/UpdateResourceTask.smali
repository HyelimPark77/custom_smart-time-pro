.class public Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;,
        Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;
    }
.end annotation


# static fields
.field public static final n:Ljava/lang/String; = "UpdateResourceTask"


# instance fields
.field public final a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

.field public final d:Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;

.field public final e:Ljava/lang/Object;

.field public f:Z

.field public final g:Landroid/os/Handler;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:I

.field public k:Lcom/jieli/jl_rcsp/model/WatchFileContent;

.field public l:J

.field public m:Lcom/jieli/jl_rcsp/model/base/BaseError;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->e:Ljava/lang/Object;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->g:Landroid/os/Handler;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->l:J

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    iput-object p2, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->c:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

    iput-object p4, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->d:Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "RcspWatch can not be null."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;I)I
    .locals 0

    .line 4
    iput p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->j:I

    return p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;J)J
    .locals 0

    .line 7
    iput-wide p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->l:J

    return-wide p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;Lcom/jieli/jl_rcsp/model/WatchFileContent;)Lcom/jieli/jl_rcsp/model/WatchFileContent;
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->k:Lcom/jieli/jl_rcsp/model/WatchFileContent;

    return-object p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;Lcom/jieli/jl_rcsp/model/base/BaseError;)Lcom/jieli/jl_rcsp/model/base/BaseError;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->m:Lcom/jieli/jl_rcsp/model/base/BaseError;

    return-object p1
.end method

.method public static synthetic a()Ljava/lang/String;
    .locals 1

    .line 6
    sget-object v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->n:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->f()V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;ILjava/lang/String;F)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->b(ILjava/lang/String;F)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;Ljava/lang/String;)V
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->b(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->j:I

    return p0
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;I)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a(I)V

    return-void
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->l:J

    return-wide v0
.end method

.method public static synthetic d(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->e()V

    return-void
.end method

.method public static findFolder(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    if-eqz p0, :cond_4

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p0

    if-nez p0, :cond_2

    return-object v0

    :cond_2
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_4

    aget-object v3, p0, v2

    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/RuntimeException;)I
    .locals 2

    const/16 v0, 0x3000

    if-nez p1, :cond_0

    return v0

    .line 42
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isDigitsOnly(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 43
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 44
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    return v0
.end method

.method public final a(Ljava/io/File;)Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    .line 9
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->readFileData(Ljava/lang/String;)[B

    move-result-object v0

    const-string v1, "convertTask"

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    .line 10
    array-length v3, v0

    const/16 v4, 0x200

    if-ge v3, v4, :cond_0

    goto/16 :goto_0

    .line 11
    :cond_0
    iget-object v3, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->getWatchFileByPath(Ljava/lang/String;)Lcom/jieli/jl_fatfs/model/FatFile;

    move-result-object v3

    if-nez v3, :cond_1

    .line 12
    new-instance v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;

    invoke-direct {v0, v2}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$1;)V

    .line 13
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;->filePath:Ljava/lang/String;

    .line 14
    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;->needSize:J

    const/4 p1, 0x1

    .line 15
    iput p1, v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;->op:I

    return-object v0

    .line 16
    :cond_1
    iput-object v2, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->k:Lcom/jieli/jl_rcsp/model/WatchFileContent;

    .line 17
    sget-object v4, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->n:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "file path : "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/jieli/jl_fatfs/model/FatFile;->getPath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v1, v5}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    iget-object v5, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-virtual {v3}, Lcom/jieli/jl_fatfs/model/FatFile;->getPath()Ljava/lang/String;

    move-result-object v3

    new-instance v6, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$2;

    invoke-direct {v6, p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$2;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;)V

    invoke-virtual {v5, v3, v6}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->getWatchFileSize(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    .line 19
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->d()V

    .line 20
    iget-object v3, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->k:Lcom/jieli/jl_rcsp/model/WatchFileContent;

    if-eqz v3, :cond_3

    .line 21
    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/model/WatchFileContent;->getCrc()S

    move-result v3

    .line 22
    iget-object v5, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->k:Lcom/jieli/jl_rcsp/model/WatchFileContent;

    invoke-virtual {v5}, Lcom/jieli/jl_rcsp/model/WatchFileContent;->getFileSize()J

    move-result-wide v5

    const/4 v7, 0x0

    .line 23
    invoke-static {v0, v7}, Lcom/jieli/jl_rcsp/util/CryptoUtil;->CRC16([BS)S

    move-result v0

    .line 24
    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v7

    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v8

    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v9

    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v10

    filled-new-array {v7, v8, v9, v10}, [Ljava/lang/Object;

    move-result-object v7

    .line 25
    const-string v8, "SDK calc file crc : %d(0x%X), Device returned file crc : %d(0x%X)."

    invoke-static {v8, v7}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v1, v7}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eq v0, v3, :cond_2

    .line 26
    new-instance v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;

    invoke-direct {v0, v2}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$1;)V

    .line 27
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;->filePath:Ljava/lang/String;

    .line 28
    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v1

    sub-long/2addr v1, v5

    iput-wide v1, v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;->needSize:J

    const/4 p1, 0x2

    .line 29
    iput p1, v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;->op:I

    return-object v0

    :cond_2
    return-object v2

    .line 30
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 31
    :cond_4
    :goto_0
    sget-object p1, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->n:Ljava/lang/String;

    const-string v0, "Invalid File."

    invoke-static {p1, v1, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method public final a(I)V
    .locals 1

    .line 49
    invoke-static {p1}, Lcom/jieli/jl_fatfs/utils/FatUtil;->getFatFsErrorCodeMsg(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->c(ILjava/lang/String;)V

    return-void
.end method

.method public final synthetic a(ILjava/lang/String;)V
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->c:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;->onError(ILjava/lang/String;)V

    return-void
.end method

.method public final synthetic a(ILjava/lang/String;F)V
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->c:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

    invoke-interface {v0, p1, p2, p3}, Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;->onProgress(ILjava/lang/String;F)V

    return-void
.end method

.method public final synthetic a(Ljava/lang/String;)V
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->c:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

    invoke-interface {v0, p1}, Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;->onStop(Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic a(Ljava/lang/String;I)V
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->c:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

    invoke-interface {v0, p1, p2}, Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;->onStart(Ljava/lang/String;I)V

    return-void
.end method

.method public final a(Ljava/util/ArrayList;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;",
            ">;)Z"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    const/4 v0, 0x1

    if-eqz p1, :cond_4

    .line 32
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_2

    :cond_0
    const-wide/16 v1, -0x1

    .line 33
    iput-wide v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->l:J

    .line 34
    sget-object v3, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->n:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "task size : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "hasEnoughSpace"

    invoke-static {v3, v5, v4}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    iget-object v3, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    new-instance v4, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$3;

    invoke-direct {v4, p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$3;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;)V

    invoke-virtual {v3, v4}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->getWatchSysLeftSize(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    .line 36
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->d()V

    .line 37
    iget-wide v3, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->l:J

    cmp-long v1, v3, v1

    if-eqz v1, :cond_3

    .line 38
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;

    .line 39
    iget-wide v1, v1, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;->needSize:J

    sub-long/2addr v3, v1

    goto :goto_0

    :cond_1
    const-wide/16 v1, 0x0

    cmp-long p1, v3, v1

    if-ltz p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 40
    :goto_1
    sget-object p1, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->n:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "enough space : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", leftSize = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v5, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v0

    .line 41
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_2
    return v0
.end method

.method public final b()I
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->m:Lcom/jieli/jl_rcsp/model/base/BaseError;

    if-nez v0, :cond_0

    const/16 v0, 0x3000

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getSubCode()I

    move-result v0

    return v0
.end method

.method public final b(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_4

    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    goto :goto_1

    .line 4
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;

    .line 7
    iget v3, v2, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;->op:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    .line 8
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 10
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3

    .line 11
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_3
    return-object v0

    :cond_4
    :goto_1
    return-object p1
.end method

.method public final b(ILjava/lang/String;)V
    .locals 3

    .line 18
    sget-object v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->n:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v1, v2, p2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "code : %d(0x%X), %s."

    invoke-static {v2, v1}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "notifyError"

    invoke-static {v0, v2, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->h:Ljava/lang/String;

    const-string v1, ".ufw"

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->obtainUpdateFilePath(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 20
    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->deleteFile(Ljava/lang/String;)Z

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "res.ori"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 22
    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->deleteFile(Ljava/lang/String;)Z

    .line 23
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->c:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

    if-eqz v0, :cond_0

    .line 24
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->g:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/h96;

    invoke-direct {v1, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/h96;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->d:Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;->onFinish(J)V

    :cond_1
    return-void
.end method

.method public final b(ILjava/lang/String;F)V
    .locals 2

    .line 26
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->c:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

    if-eqz v0, :cond_0

    .line 27
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->g:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/k96;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/k96;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;ILjava/lang/String;F)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    .line 15
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->c:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

    if-eqz v0, :cond_0

    .line 16
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->g:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/i96;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/i96;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 17
    :cond_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->d:Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;->onFinish(J)V

    :cond_1
    return-void
.end method

.method public final b(Ljava/lang/String;I)V
    .locals 2

    .line 13
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->c:Lcom/jieli/jl_rcsp/interfaces/watch/OnUpdateResourceCallback;

    if-eqz v0, :cond_0

    .line 14
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->g:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/j96;

    invoke-direct {v1, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/j96;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->m:Lcom/jieli/jl_rcsp/model/base/BaseError;

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c(ILjava/lang/String;)V
    .locals 1

    .line 3
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {p1}, Lcom/jieli/jl_fatfs/utils/FatUtil;->getFatFsErrorCodeMsg(I)Ljava/lang/String;

    move-result-object p2

    .line 5
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->b(ILjava/lang/String;)V

    return-void
.end method

.method public final d()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->e:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->f:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->f:Z

    .line 5
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->e:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    .line 6
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 7
    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->f:Z

    .line 8
    monitor-exit v0

    return-void

    .line 9
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final e()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->h:Ljava/lang/String;

    const-string v1, ".ufw"

    invoke-static {v0, v1}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->obtainUpdateFilePath(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/watch/WatchBase;->isOTAResource()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    new-instance v1, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$4;

    invoke-direct {v1, p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$4;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lcom/jieli/jl_rcsp/watch/WatchBase;->writeResourceOTAFlag(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->deleteFile(Ljava/lang/String;)Z

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "res.ori"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->deleteFile(Ljava/lang/String;)Z

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    new-instance v2, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$5;

    invoke-direct {v2, p0, v0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$5;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->reLoadFolder(Lcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    return-void
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->f:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->e:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final g()V
    .locals 7

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->i:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    array-length v3, v0

    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v0, v4

    :try_start_0
    invoke-virtual {p0, v5}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a(Ljava/io/File;)Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :goto_2
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a(Ljava/lang/RuntimeException;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a(I)V

    return-void

    :cond_1
    sget-object v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->n:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "taskList = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "updateResource"

    invoke-static {v0, v4, v3}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->b(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v1

    :try_start_1
    invoke-virtual {p0, v1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a(Ljava/util/ArrayList;)Z

    move-result v3

    if-nez v3, :cond_2

    const/16 v0, 0x4201

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a(I)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception v0

    goto/16 :goto_6

    :cond_2
    iget-object v3, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/watch/WatchBase;->isOTAResource()Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v3, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    new-instance v5, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$1;

    invoke-direct {v5, p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$1;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;)V

    invoke-virtual {v3, v2, v5}, Lcom/jieli/jl_rcsp/watch/WatchBase;->writeResourceOTAFlag(ZLcom/jieli/jl_rcsp/interfaces/watch/OnWatchOpCallback;)V

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->d()V

    iget-object v3, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-virtual {v3}, Lcom/jieli/jl_rcsp/watch/WatchBase;->isOTAResource()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->b()I

    move-result v0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->c(ILjava/lang/String;)V

    return-void

    :cond_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "size : "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v4, v3}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->e()V

    return-void

    :cond_4
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->i:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {p0, v0, v3}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->b(Ljava/lang/String;I)V

    :goto_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_9

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;

    iget v3, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->j:I

    if-eqz v3, :cond_5

    goto :goto_5

    :cond_5
    sget-object v3, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->n:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "task >> op = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;->op:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", filePath = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;->filePath:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v4, v5}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget v3, v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;->op:I

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-ne v3, v5, :cond_7

    new-instance v3, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;

    invoke-direct {v3, p0, v6}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$1;)V

    iput v2, v3, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->index:I

    iget-object v0, v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;->filePath:Ljava/lang/String;

    iput-object v0, v3, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->taskPath:Ljava/lang/String;

    const-string v5, "replaceWatchFile"

    iput-object v5, v3, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->funcName:Ljava/lang/String;

    iget-object v5, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    invoke-virtual {v5, v0, v3}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->replaceWatchFile(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    iget v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->j:I

    if-eqz v0, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->d()V

    goto :goto_4

    :cond_7
    new-instance v3, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;

    invoke-direct {v3, p0, v6}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;-><init>(Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$1;)V

    iput v2, v3, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->index:I

    iget-object v0, v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$Task;->filePath:Ljava/lang/String;

    iput-object v0, v3, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->taskPath:Ljava/lang/String;

    const-string v5, "createWatchFile"

    iput-object v5, v3, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask$MyProgressListener;->funcName:Ljava/lang/String;

    iget-object v5, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a:Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;

    const/4 v6, 0x1

    invoke-virtual {v5, v0, v6, v3}, Lcom/jieli/jl_rcsp/watch/rcsp/RcspWatch;->createWatchFile(Ljava/lang/String;ZLcom/jieli/jl_fatfs/interfaces/OnFatFileProgressListener;)V

    iget v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->j:I

    if-eqz v0, :cond_8

    goto :goto_5

    :cond_8
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->d()V

    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_9
    :goto_5
    sget-object v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->n:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "end ---> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->j:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v4, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->j:I

    if-nez v0, :cond_a

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->e()V

    return-void

    :cond_a
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a(I)V

    return-void

    :goto_6
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a(Ljava/lang/RuntimeException;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a(I)V

    return-void
.end method

.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->d:Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lcom/jieli/jl_rcsp/interfaces/listener/ThreadStateListener;->onStart(J)V

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->b:Ljava/lang/String;

    const/4 v1, 0x5

    if-nez v0, :cond_1

    invoke-virtual {p0, v1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a(I)V

    return-void

    :cond_1
    new-instance v0, Ljava/io/File;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->b:Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p0, v1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a(I)V

    return-void

    :cond_2
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->getDirPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->h:Ljava/lang/String;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->getFileName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->n:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "dirPath = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->h:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", fileName = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v2, v3}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, ".zip"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    const-string v3, "res.ori"

    if-eqz v2, :cond_3

    :try_start_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->h:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/jieli/jl_fatfs/utils/ZipUtil;->unZipFolder(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->h:Ljava/lang/String;

    invoke-static {v0, v3}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->findFolder(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->i:Ljava/lang/String;

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->i:Ljava/lang/String;

    :cond_4
    :goto_1
    sget-object v0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->n:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "targetPath = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v0, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->i:Ljava/lang/String;

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->g()V

    goto :goto_2

    :cond_5
    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->h:Ljava/lang/String;

    const-string v2, ".ufw"

    invoke-static {v1, v2}, Lcom/jieli/jl_rcsp/util/WatchFileUtil;->obtainUpdateFilePath(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "otaFilePath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v0, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-nez v1, :cond_6

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->a(I)V

    goto :goto_2

    :cond_6
    invoke-virtual {p0, v1}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->b(Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method public stopThread()V
    .locals 1

    const/16 v0, 0x1002

    iput v0, p0, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->j:I

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/tool/UpdateResourceTask;->f()V

    return-void
.end method
